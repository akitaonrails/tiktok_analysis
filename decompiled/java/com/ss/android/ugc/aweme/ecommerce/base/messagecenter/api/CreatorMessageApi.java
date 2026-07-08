package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C1751350vfx;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes27.dex */
public interface CreatorMessageApi {
    public static final C1751350vfx LIZ = C1751350vfx.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/v1/oec/affiliate/creator/im/last_new_message/")
    Object fetchCreatorData(@InterfaceC1501050pAF("version") int i, InterfaceC1364105Vn<? super CreatorLastNewMessageResponse> interfaceC1364105Vn);
}
