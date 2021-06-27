package cn.yy.toyflow.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yy
 * @since 2021-06-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class State implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String stateTypeId;

    private String proId;


}
