package webcast.api.game_revenue;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RoleSettingInfo {

    @C09CT("role_id_str")
    public String roleIdStr = "";

    @C09CT("role_name")
    public String roleName = "";

    @C09CT("role_permission")
    public String rolePermission = "";

    @C09CT("source_items")
    public List<RoleSourceItem> sourceItems = new ArrayList();
}
