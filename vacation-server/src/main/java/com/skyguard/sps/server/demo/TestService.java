package com.skyguard.sps.server.demo;

import com.skyguard.sps.common.admin.AdminDto;
import com.skyguard.sps.common.test.TestDto;

import java.util.List;

/**
 * Created by liupei on 2018/5/18.
 */
public interface TestService {

    String test(TestDto testDto);

    List<AdminDto> searchAll();

    int addAdmin(AdminDto adminDto);

    boolean deleteAdminById(int id);

}
