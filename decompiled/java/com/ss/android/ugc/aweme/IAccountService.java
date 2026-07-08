package com.ss.android.ugc.aweme;

import X.C0XKE;
import X.C0XQT;
import X.InterfaceC586170Myt;
import X.InterfaceC848770XRj;
import com.ss.android.ugc.aweme.services.InterceptorService;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.aweme.services.ProAccountService;
import com.ss.android.ugc.aweme.services.RnAndH5Service;

/* JADX INFO: loaded from: classes14.dex */
public interface IAccountService {
    boolean LIZ();

    void LIZIZ(C0XQT c0xqt);

    ILoginService LIZJ();

    ProAccountService LIZLLL();

    String LJ();

    InterfaceC848770XRj LJFF();

    void LJI(InterfaceC586170Myt interfaceC586170Myt);

    IBindService LJII();

    String LJIIIIZZ();

    InterceptorService LJIIIZ();

    AccountUserService LJIIJ();

    PasswordService LJIIJJI();

    LoginMethodService LJIIL();

    RnAndH5Service LJIILIIL();

    C0XKE LJIILJJIL();

    void LJIILL(InterfaceC586170Myt interfaceC586170Myt);

    String getStoreRegionUpperCase();

    void tryInit();
}
