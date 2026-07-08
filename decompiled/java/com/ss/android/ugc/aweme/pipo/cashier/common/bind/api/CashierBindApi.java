package com.ss.android.ugc.aweme.pipo.cashier.common.bind.api;

import X.C0X52;
import X.C1708800uZK;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;

/* JADX INFO: loaded from: classes27.dex */
public interface CashierBindApi {
    public static final C1708800uZK LIZ = C1708800uZK.LIZ;

    @InterfaceC1501170pAR("/cashier/client/v1/bind_pi")
    Object bindPI(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg BindRequest bindRequest, InterfaceC1364105Vn<? super C0X52<BindResponse>> interfaceC1364105Vn);
}
