package net.wanho.chefassist.serviceImpl;

import net.wanho.chefassist.bean.Desk;
import net.wanho.chefassist.dao.DeskDao;
import net.wanho.chefassist.dto.DeskDto;
import net.wanho.chefassist.service.DeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeskServiceImpl implements DeskService {
    @Autowired
    private DeskDao deskDao;

    @Override
    public void addDesk(Desk desk) {
        deskDao.save(desk);
    }

    @Override
    public void deleteDesk(int tableId) {
        deskDao.deleteById(tableId);
    }

    @Override
    public void updateDesk(Desk desk) {
        deskDao.saveAndFlush(desk);
    }

    @Override
    public List<Desk> queryDeskList() {
        return deskDao.findAll();
    }
}
