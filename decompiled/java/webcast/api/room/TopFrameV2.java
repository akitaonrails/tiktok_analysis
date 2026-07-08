package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.ResourceConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TopFrameV2 {

    @C09CT("config_version")
    public long configVersion;

    @C09CT("end_time")
    public long endTime;

    @C09CT("operate_version")
    public long operateVersion;

    @C09CT("start_time")
    public long startTime;

    @C09CT("type")
    public int type;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("title")
    public String title = "";

    @C09CT("sub_title")
    public String subTitle = "";

    @C09CT("describe")
    public String describe = "";

    @C09CT("show_info_list")
    public List<ShowInfoV2> showInfoList = new ArrayList();

    @C09CT("event_struct_list")
    public List<ProgramEventStruct> eventStructList = new ArrayList();

    @C09CT("sponsor_list")
    public List<String> sponsorList = new ArrayList();

    @C09CT("sponsor_title")
    public String sponsorTitle = "";

    @C09CT("resource_configs")
    public Map<String, ResourceConfig> resourceConfigs = new LinkedHashMap();
}
