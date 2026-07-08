package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RealtimeLiveCenterLopInfo {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("title")
    public String title = "";

    @C09CT("subtitle")
    public String subtitle = "";

    @C09CT("task_list")
    public List<Task> taskList = new ArrayList();

    @C09CT("feature_guidance_list")
    public List<FeatureGuidance> featureGuidanceList = new ArrayList();

    public static final class FeatureGuidance {

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("key")
        public String key = "";

        @C09CT("title")
        public String title = "";

        @C09CT("subtitle")
        public String subtitle = "";

        @C09CT("jump_text")
        public String jumpText = "";

        @C09CT("jump_schema_url")
        public String jumpSchemaUrl = "";
    }

    public static final class Task {

        @C09CT("current_num")
        public long currentNum;

        @C09CT("target_num")
        public long targetNum;

        @C09CT("key")
        public String key = "";

        @C09CT("title")
        public String title = "";
    }
}
