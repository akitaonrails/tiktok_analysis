package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.glip.BannerShow;
import webcast.data.glip.GlipCondition;
import webcast.data.glip.GlipTask;

/* JADX INFO: loaded from: classes29.dex */
public final class GetGlipMainPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("registered")
        public boolean registered;

        @C09CT("style_ab")
        public long styleAb;

        @C09CT("subscribe_inbox_switch_status")
        public int subscribeInboxSwitchStatus;

        @C09CT("glip_conditions")
        public List<GlipCondition> glipConditions = new ArrayList();

        @C09CT("agreement_link")
        public String agreementLink = "";

        @C09CT("glip_tasks")
        public List<GlipTask> glipTasks = new ArrayList();

        @C09CT("banner_show_list")
        public List<BannerShow> bannerShowList = new ArrayList();
    }
}
