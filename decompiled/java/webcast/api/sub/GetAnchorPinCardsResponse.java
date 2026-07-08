package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SimplePinCardInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetAnchorPinCardsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("pincards")
        public List<SimplePinCardInfo> pincards = new ArrayList();
    }
}
