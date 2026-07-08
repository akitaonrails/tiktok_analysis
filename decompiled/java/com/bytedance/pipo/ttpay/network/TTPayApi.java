package com.bytedance.pipo.ttpay.network;

import X.C0X52;
import X.C1505700pHk;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.bytedance.pipo.stellar.base.page.StellarPageRequestWrapper;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface TTPayApi {
    public static final C1505700pHk LIZ = C1505700pHk.LIZ;

    @InterfaceC1501170pAR("/wallet_home/v1/native/ttpay/homepage")
    Object getPortalPage(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg StellarPageRequestWrapper stellarPageRequestWrapper, InterfaceC1364105Vn<? super C0X52<BaseResponse<StellarChunk>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet_home/v1/native/ttpay/welcome_page")
    Object getWelcomePage(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg StellarPageRequestWrapper stellarPageRequestWrapper, InterfaceC1364105Vn<? super C0X52<BaseResponse<StellarChunk>>> interfaceC1364105Vn);
}
