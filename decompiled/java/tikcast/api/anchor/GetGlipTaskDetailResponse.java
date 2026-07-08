package tikcast.api.anchor;

import X.C09CT;
import webcast.data.glip.GlipTaskDetail;

/* JADX INFO: loaded from: classes29.dex */
public final class GetGlipTaskDetailResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("glip_task_detail")
        public GlipTaskDetail glipTaskDetail;

        @C09CT("registered")
        public boolean registered;

        @C09CT("style_ab")
        public long styleAb;
    }
}
