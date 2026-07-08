package com.ss.android.ugc.aweme.offlinemode.api;

import X.C01GW;
import X.C0X9S;
import X.C1620570sH1;
import X.C452501pT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(287));

    public interface OfflineModeApiDefinition {
        @InterfaceC1501160pAQ("/tiktok/feed/offline/v2")
        C0X9S<ComposePbAndJson<C1620570sH1, FeedItemList>> offlineFeedList(@InterfaceC1501070pAH("pull_type") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("offline_mode_inbox_message") Boolean bool, @InterfaceC1501070pAH("ug_approved_count") int i3);

        @InterfaceC1501160pAQ("/tiktok/inspect/item/v1")
        C0X9S<InspectItemResponse> verifyAids(@InterfaceC1501070pAH("item_ids") String str);
    }
}
