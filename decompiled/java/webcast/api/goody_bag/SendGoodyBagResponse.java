package webcast.api.goody_bag;

import X.C09CT;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagSkin;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes.dex */
public final class SendGoodyBagResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("base_info")
        public GoodyBagBaseInfo baseInfo;

        @C09CT("fpc_custom_err")
        public RechargeCustomError fpcCustomErr;

        @C09CT("goody_bag_skin")
        public GoodyBagSkin goodyBagSkin;
    }
}
