package test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.juzifenqi.core.ServiceResult;
import com.juzifenqi.order.service.IOrderService;
import com.juzifenqi.order.vo.OrderDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.workorder.IWorkOrderService;
import test1.UserDO;
import test1.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author jyl
 * @version 1.0
 * @Date: 2019/4/24 17:08
 * @see: 背景
 * @since 描述
 */
@RestController
@RequestMapping("test")
public class UserController {
    @Autowired
    IOrderService iOrderService;

    @PostMapping("test1")
    public String findById(@RequestBody Map<String,String> param){
        OrderDetailVO orderDetailVO = new OrderDetailVO();
        orderDetailVO.setOrderSn(param.get("orderSn"));
        orderDetailVO.setTraceId(11111L);
        return JSON.toJSONString(iOrderService.getOrderDetailById(orderDetailVO));
    }

}