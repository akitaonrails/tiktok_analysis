package com.ss.android.ugc.aweme.footnote.detail.repo;

import X.C01GW;
import X.C0X9S;
import X.C452501pT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501320pAg;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class FootNoteFeedApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(115));

    public interface IFootNoteApi {
        @InterfaceC1501160pAQ("tiktok/ue_feed/footnote/v2")
        @InterfaceC1501320pAg(2)
        C0X9S<FootNoteFeedItemList> fetchFootNoteFeedList(@InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("is_non_personalized") boolean z, @InterfaceC1501070pAH("session_id") String str);
    }
}
