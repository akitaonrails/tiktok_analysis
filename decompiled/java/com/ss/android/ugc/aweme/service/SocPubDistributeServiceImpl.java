package com.ss.android.ugc.aweme.service;

import X.C10EU;
import X.C1492170ovv;
import X.C1605690rt1;
import X.C1605700rt2;
import X.C1605720rt4;
import X.C1605760rt8;
import X.C1605770rt9;
import X.C1608950ryH;
import X.C1608970ryJ;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.InterfaceC1398730mVD;
import X.InterfaceC1605730rt5;
import X.ViewOnClickListenerC1605710rt3;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public final class SocPubDistributeServiceImpl implements ISocPubDistributeService {
    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final C1608950ryH LIZIZ() {
        return (C1608950ryH) C1608970ryJ.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final void LJ() {
        Iterator it2 = C1605690rt1.LIZIZ().entrySet().iterator();
        while (it2.hasNext()) {
            ((C1605720rt4) ((Map.Entry) it2.next()).getValue()).LIZ("inner_clean");
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final InterfaceC1398730mVD LIZ(final C1605770rt9 c1605770rt9) {
        Map<EnumC1615506Uf, InterfaceC1605730rt5> map = C1605760rt8.LIZ;
        if (!C1605760rt8.LIZ(c1605770rt9.LIZ).LJIIIIZZ(c1605770rt9.LIZLLL)) {
            return new InterfaceC1398730mVD(c1605770rt9) { // from class: X.0rtC
                @Override // X.InterfaceC1398730mVD
                public final void LIZIZ(String str) {
                }

                @Override // X.InterfaceC1398730mVD
                public final boolean LIZLLL(User user) {
                    return false;
                }

                @Override // X.InterfaceC1398730mVD
                public final void LJI(boolean z) {
                }

                @Override // X.InterfaceC1398730mVD
                public final void LJIIIIZZ(EnumC1605470rsf enumC1605470rsf) {
                }

                @Override // X.InterfaceC1398730mVD
                public final boolean LJIIJ() {
                    return false;
                }

                @Override // X.InterfaceC1398730mVD
                public final void LJIIJJI(String str) {
                }

                @Override // X.InterfaceC1398730mVD
                public final void LJIIL() {
                }

                @Override // X.InterfaceC1398730mVD
                public final void LJIILL(View view, boolean z, Long l) {
                }

                @Override // X.InterfaceC1398730mVD
                public final void LJIIZILJ() {
                }

                @Override // X.InterfaceC1398730mVD
                public final EnumC1605470rsf LJIJ(User user) {
                    return null;
                }

                @Override // X.InterfaceC1398730mVD
                public final void release() {
                }

                @Override // X.InterfaceC1398730mVD
                public final void reset() {
                }

                @Override // X.InterfaceC1398730mVD
                public final EnumC1606080rte LJII() {
                    return EnumC1606080rte.INBOX_TOP_LIST;
                }

                {
                    View view;
                    Object obj = c1605770rt9.LIZIZ;
                    if ((obj instanceof C1609500rzA) && (view = (View) obj) != null) {
                        view.setClickable(false);
                    }
                }
            };
        }
        ViewOnClickListenerC1605710rt3 viewOnClickListenerC1605710rt3 = new ViewOnClickListenerC1605710rt3(c1605770rt9.LIZ, c1605770rt9.LIZIZ, c1605770rt9.LIZJ, c1605770rt9.LIZLLL);
        viewOnClickListenerC1605710rt3.LLIZ = c1605770rt9.LJ;
        viewOnClickListenerC1605710rt3.LLILZLL = c1605770rt9.LJI;
        viewOnClickListenerC1605710rt3.LLILZIL = c1605770rt9.LJFF;
        viewOnClickListenerC1605710rt3.LLIZLLLIL = c1605770rt9.LJII;
        viewOnClickListenerC1605710rt3.LLJ = c1605770rt9.LJIIIIZZ;
        viewOnClickListenerC1605710rt3.LLJI = c1605770rt9.LJIIIZ;
        viewOnClickListenerC1605710rt3.LLJILJIL = c1605770rt9.LJIIJ;
        viewOnClickListenerC1605710rt3.LLJILJILJ = c1605770rt9.LJIIJJI;
        viewOnClickListenerC1605710rt3.LLJJIII = c1605770rt9.LJIIL;
        viewOnClickListenerC1605710rt3.LLJJIJIL = c1605770rt9.LJIILJJIL;
        viewOnClickListenerC1605710rt3.LLJJJ = c1605770rt9.LJIILIIL;
        viewOnClickListenerC1605710rt3.LLJJIJI = c1605770rt9.LJIILL;
        return viewOnClickListenerC1605710rt3;
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final boolean LJFF(User user) {
        new Object() { // from class: X.0rtL
        }.getClass();
        if (user != null && user.isLive() && C1492170ovv.LIZ() && !C10EU.LJIILL(user, false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final void LIZJ(EnumC1615506Uf enumC1615506Uf, EnumC1606080rte enumC1606080rte, List list, Function1 function1) {
        C1605720rt4 c1605720rt4 = (C1605720rt4) C1605690rt1.LIZIZ().get(enumC1615506Uf);
        if (c1605720rt4 != null && list != null) {
            C1605690rt1.LIZ(new C1605700rt2(list, function1, c1605720rt4, null, enumC1606080rte));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final void LIZLLL(EnumC1615506Uf enumC1615506Uf, EnumC1606080rte enumC1606080rte, List list, List list2, Function1 function1) {
        C1605720rt4 c1605720rt4 = (C1605720rt4) C1605690rt1.LIZIZ().get(enumC1615506Uf);
        if (c1605720rt4 != null && list != null) {
            C1605690rt1.LIZ(new C1605700rt2(list, function1, c1605720rt4, list2, enumC1606080rte));
        }
    }
}
