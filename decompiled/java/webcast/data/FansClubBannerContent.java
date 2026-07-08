package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class FansClubBannerContent {

    @C09CT("back_ground")
    public FansClubBannerBackGround backGround;

    @C09CT("count_down")
    public FansClubBannerCountDown countDown;

    @C09CT("desc")
    public FansClubBannerText desc;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("priority")
    public long priority;

    @C09CT("title")
    public FansClubBannerText title;

    @C09CT("type")
    public int type;

    @C09CT("schema")
    public String schema = "";

    @C09CT("da_info_map")
    public Map<String, DAInfoValue> daInfoMap = new LinkedHashMap();

    @C09CT("notice_id")
    public String noticeId = "";
}
