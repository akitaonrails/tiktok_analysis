package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CentreEntranceResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("entrance_icon")
        public ImageModel entranceIcon;

        @C09CT("entrance_icon_background")
        public ImageModel entranceIconBackground;

        @C09CT("show_entrance")
        public boolean showEntrance;

        @C09CT("show_red_dot")
        public boolean showRedDot;

        @C09CT("open_schema")
        public String openSchema = "";

        @C09CT("icon_animation")
        public List<EntranceIconAnimation> iconAnimation = new ArrayList();
    }
}
