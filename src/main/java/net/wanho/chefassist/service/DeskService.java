package net.wanho.chefassist.service;

import net.wanho.chefassist.bean.Desk;
import net.wanho.chefassist.dto.DeskDto;

import java.util.List;

public interface DeskService {
    /**
     * 新增活动
     */
    void addDesk(Desk desk);

    /**
     * 删除活动
     */
    void deleteDesk(int tableId);

    /**
     * 更新活动
     */
    void updateDesk(Desk desk);

    /**
     *
     * @return
     */
    List<Desk> queryDeskList();
}
