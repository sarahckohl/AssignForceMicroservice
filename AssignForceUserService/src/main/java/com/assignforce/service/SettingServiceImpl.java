package com.assignforce.service;

import com.assignforce.models.Setting;
import com.assignforce.models.User;
import com.assignforce.repos.SettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SettingServiceImpl implements SettingService {

    @Autowired
    SettingRepository settingRepo;

    @Override
    public List<Setting> getAll() {
        return settingRepo.findAll();
    }

    @Override
    public Setting add(Setting setting) {
        return settingRepo.save(setting);
    }

    @Override
    public Setting getById(int id) {
        return settingRepo.findOne(id);
    }

    @Override
    public Setting update(Setting setting) {
        return settingRepo.saveAndFlush(setting);
    }
}
