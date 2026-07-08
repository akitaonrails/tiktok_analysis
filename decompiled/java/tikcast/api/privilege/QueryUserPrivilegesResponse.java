package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class QueryUserPrivilegesResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("entrance_config")
        public EntranceConfig entranceConfig;

        @C09CT("privilege_tab_count")
        public int privilegeTabCount;

        @C09CT("show_entrance")
        public boolean showEntrance;

        @C09CT("tab_list")
        public List<PrivilegeTab> tabList;
    }

    public static final class EntranceConfig {

        @C09CT("background")
        public ImageModel background;

        @C09CT("img")
        public ImageModel img;

        @C09CT("open_schema")
        public String openSchema = "";

        @C09CT("show_red_dot")
        public boolean showRedDot;
    }

    public static final class PrivilegeTab {

        @C09CT("display_scene")
        public int displayScene;

        @C09CT("privilege_list")
        public List<UserPrivilege> privilegeList;

        @C09CT("tab_name")
        public String tabName = "";

        @C09CT("tab_type")
        public int tabType;
    }
}
