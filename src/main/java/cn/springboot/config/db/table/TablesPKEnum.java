package cn.springboot.config.db.table;

import java.util.Map;
import java.util.TreeMap;

/** 
 * @Description 数据表配置类
 * @author 王鑫 
 * @date Apr 12, 2017 2:12:02 PM  
 */
public enum TablesPKEnum {

    t_news("t_news", "1001"),
    t_sys_permission("t_sys_permission", "1002"),
    t_sys_role("t_sys_role", "1003"),
    t_sys_role_permission("t_sys_role_permission", "1004"),
    t_sys_user("t_sys_user", "1005"),
    t_sys_user_role("t_sys_user_role", "1006");

    TablesPKEnum(String tableName, String tableCode) {
        this.tableName = tableName;
        this.tableCode = tableCode;
    }
    
    public static Map<String,Key> getTables() {
        TablesPKEnum[] tables = TablesPKEnum.values();
        Map<String,Key> map = new TreeMap<>();
        Key key = null;
        for (TablesPKEnum tablePk : tables) {
            key = new Key();
            key.setTableName(tablePk.tableName);
            key.setTableCode(tablePk.tableCode);
            map.put(tablePk.tableName , key);
        }
        return map;
    }

    private String tableName;
    private String tableCode;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

}
