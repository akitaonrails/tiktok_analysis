package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SimplePinCardInfo;

/* JADX INFO: loaded from: classes.dex */
public final class UpsertAnchorPinCardResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("pincard")
        public SimplePinCardInfo pincard;
    }
}
