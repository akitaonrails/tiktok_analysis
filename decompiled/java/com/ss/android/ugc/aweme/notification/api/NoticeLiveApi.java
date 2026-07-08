package com.ss.android.ugc.aweme.notification.api;

import X.C0ONY;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface NoticeLiveApi {
    public static final C0ONY LIZ = C0ONY.LIZ;

    @InterfaceC1501240pAY("/webcast/anchor/switch/update/")
    @InterfaceC1485505rh
    Object updateAutoShareLiveRoomToBulletin(@InterfaceC1501050pAF("switch_type") int i, @InterfaceC1501050pAF("switch_value") boolean z, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
