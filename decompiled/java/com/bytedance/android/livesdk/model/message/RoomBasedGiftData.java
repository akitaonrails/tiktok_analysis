package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RoomBasedGiftData {

    @C09CT("room_based_gifts")
    public Map<Long, RoomBasedGifts> roomBasedGifts = new LinkedHashMap();

    public static final class GiftInfo {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("price")
        public long price;
    }

    public static final class RoomBasedGifts {

        @C09CT("gift_info")
        public List<GiftInfo> giftInfo = new ArrayList();
    }
}
