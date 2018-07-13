package com.skyguard.sps.server.demo;

import com.google.common.collect.Lists;
import com.skyguard.sps.common.admin.AdminDto;
import com.skyguard.sps.common.test.TestDto;
import com.skyguard.sps.server.table.tables.Admin;
import com.skyguard.sps.server.table.tables.records.AdminRecord;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by liupei on 2018/5/18.
 */
@Service
public class TestServiceImpl  implements TestService{

    @Autowired
    private DSLContext dslContext;

    public String test(TestDto testDto) {
        return testDto.toString();
    }

    public List<AdminDto> searchAll (){
        List<AdminDto> admins = Lists.newArrayList();
        List<AdminRecord> list= dslContext.select().from(Admin.ADMIN).fetchInto(AdminRecord.class);
        if (!CollectionUtils.isEmpty(list)) {
            admins.addAll(list.stream().map(transfer2Admin).collect(Collectors.toList()));
        }
        return admins;
    }

    @Override
    public int addAdmin(AdminDto adminDto) {
        int id =dslContext.insertInto(Admin.ADMIN).columns(Admin.ADMIN.ID, Admin.ADMIN.NAME).values(adminDto.getId(), adminDto.getName()).returning(Admin.ADMIN.ID).fetchOne().getId();
        return id;
    }

    @Override
    public boolean deleteAdminById(int id) {
       this.dslContext.delete(Admin.ADMIN).where(Admin.ADMIN.ID.equal(id)).execute();
        return true;
    }

    private Function<AdminRecord,AdminDto> transfer2Admin=(input)->{
        AdminDto adminDto=new AdminDto();
        adminDto.setId(input.getId());
        adminDto.setName(input.getName());
        return adminDto;
    };

}
