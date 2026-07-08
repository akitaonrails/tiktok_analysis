package com.bytedance.android.livesdk.gift.base.platform.business.effect.collaborativegifting;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.gift.CollabGiftGameplayResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface CollabGiftApi {
    @InterfaceC1501160pAQ("/webcast/gift/collab/state/")
    C11NZ<CollabGiftGameplayResponse> getCollabGiftState(@InterfaceC1501070pAH("collab_session_id") String str);
}
