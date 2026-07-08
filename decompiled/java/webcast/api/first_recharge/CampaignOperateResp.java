package webcast.api.first_recharge;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes29.dex */
public final class CampaignOperateResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("res")
        public OperateResult res;
    }

    public static final class OperateResult {

        @C09CT("expire_time")
        public long expireTime;

        @C09CT("extra")
        public String extra = "";

        @C09CT(Scene.SCENE_SERVICE)
        public int scene;

        @C09CT("success")
        public boolean success;
    }
}
