package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusscantingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusscantingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusscantingxinxiView;


/**
 * 餐厅信息评论表
 *
 * @author 
 * @email 
 * @date 2021-01-25 10:23:23
 */
public interface DiscusscantingxinxiService extends IService<DiscusscantingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusscantingxinxiVO> selectListVO(Wrapper<DiscusscantingxinxiEntity> wrapper);
   	
   	DiscusscantingxinxiVO selectVO(@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);
   	
   	List<DiscusscantingxinxiView> selectListView(Wrapper<DiscusscantingxinxiEntity> wrapper);
   	
   	DiscusscantingxinxiView selectView(@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusscantingxinxiEntity> wrapper);
   	
}

