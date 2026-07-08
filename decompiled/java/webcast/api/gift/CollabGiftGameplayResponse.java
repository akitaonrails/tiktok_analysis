package webcast.api.gift;

import X.C09CT;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes18.dex */
public final class CollabGiftGameplayResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("active_info")
        public CollabGiftActiveInfo activeInfo;

        @C09CT("base_info")
        public CollabGiftBaseInfo baseInfo;

        @C09CT("effect")
        public AssetsModel effect;

        @C09CT("finish_info")
        public CollabGiftFinishInfo finishInfo;

        @C09CT("fuel_gift_info")
        public CollabGiftGiftInfo fuelGiftInfo;

        @C09CT("full_info")
        public CollabGiftFullInfo fullInfo;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("trigger_gift_info")
        public CollabGiftGiftInfo triggerGiftInfo;
    }
}
