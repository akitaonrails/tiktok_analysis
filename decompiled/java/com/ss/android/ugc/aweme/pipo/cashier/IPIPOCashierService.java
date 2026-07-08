package com.ss.android.ugc.aweme.pipo.cashier;

import X.C1709430uaL;
import X.EnumC1709270ua5;
import X.InterfaceC1063710dmr;
import android.content.Context;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.pipo.cashier.lynx.LynxTtlsPdpCashierView;
import com.ss.android.ugc.aweme.pipo.cashier.lynx.LynxTtlsPdpCashierViewShadowNode;
import j27.s;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public interface IPIPOCashierService {
    List<IInterceptor> LIZ();

    LynxTtlsPdpCashierView LIZLLL(s sVar);

    LynxTtlsPdpCashierViewShadowNode LJIIL();

    void LJIILLIIL();

    C1709430uaL LJIIZILJ(String str, String str2);

    String LJIJ();

    List<Class<? extends InterfaceC1063710dmr>> LJIJI();

    void LJIJJ();

    void LJIJJLI();

    C1709430uaL LJIL(Context context, String str, String str2, EnumC1709270ua5 enumC1709270ua5);

    void initialize();
}
