package com.ss.android.ugc.aweme.commercialize.tcm.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.feed.model.BABCRemoveMe;

/* JADX INFO: loaded from: classes.dex */
public interface BABCRemoveMeApi {
    @InterfaceC1501170pAR("/aweme/v1/ad/ba/branded/content/remove/me/")
    C11NZ<BABCRemoveMe> getBABCRemoveMe(@InterfaceC1501070pAH("item_id") String str);
}
