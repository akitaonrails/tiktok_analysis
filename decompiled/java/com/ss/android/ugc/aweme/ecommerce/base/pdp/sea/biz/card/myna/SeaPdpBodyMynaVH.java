package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.myna;

import X.AbstractC1764350w0v;
import X.C00XV;
import X.C04DH;
import X.C04FN;
import X.C04FY;
import X.C1338760kwU;
import X.C1558360qeg;
import X.C1764370w0x;
import X.C1764490w19;
import X.C1764540w1E;
import X.C1764610w1L;
import X.C1764670w1R;
import X.C1765200w2I;
import X.C1765230w2L;
import X.C2097608Jq;
import X.EnumC1760270vuL;
import X.InterfaceC1764530w1D;
import X.InterfaceC1765250w2N;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.action.EcommerceActionDto;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpBodyMynaVH extends AbsCardVH<C04DH, C1764370w0x, C1764490w19> implements InterfaceC1765250w2N {
    public final C1338760kwU LLJJI;
    public C1765200w2I LLJJIII;
    public C1764370w0x LLJJIJI;

    @Override // X.InterfaceC1765250w2N
    public final void LJIJJLI() {
        f6(this, false, false, true, null, 24);
    }

    @Override // X.InterfaceC1765250w2N
    public final void LLLLZIL() {
        i6();
        f6(this, true, false, false, null, 28);
    }

    @Override // X.InterfaceC1765250w2N
    public final void Z3() {
    }

    @Override // X.InterfaceC1765250w2N
    public final void b4() {
        f6(this, false, false, false, null, 28);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void LIZIZ() {
        h6("moduleClick");
    }

    public final void i6() {
        C1764490w19 c1764490w19;
        VM vm = this.LLJIJIL;
        if (vm == 0 || (c1764490w19 = (C1764490w19) vm.LLJILJILJ) == null) {
            return;
        }
        C1765200w2I c1765200w2I = this.LLJJIII;
        if ((c1765200w2I != null ? c1765200w2I.LJ : null) == C00XV.SUCCESS && c1764490w19.LLILLL) {
            c1764490w19.LJIIIIZZ("show", null, null, null);
            if (c1764490w19.LLJIJIL) {
                return;
            }
            c1764490w19.LLJIJIL = true;
            h6("moduleFirstShow");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void onShow() {
        C1764610w1L c1764610w1L;
        Map<String, Object> map;
        C1765200w2I c1765200w2I = this.LLJJIII;
        if (c1765200w2I != null) {
            c1765200w2I.LJI = true;
            C1764670w1R c1764670w1R = c1765200w2I.LIZJ;
            if (c1764670w1R != null && (c1764610w1L = c1764670w1R.LIZIZ) != null && (map = c1764610w1L.LIZLLL) != null) {
                map.put("__visible", 1);
            }
        }
        i6();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void d6() {
        C1764610w1L c1764610w1L;
        Map<String, Object> map;
        super.d6();
        C1765200w2I c1765200w2I = this.LLJJIII;
        if (c1765200w2I != null) {
            c1765200w2I.LJI = false;
            C1764670w1R c1764670w1R = c1765200w2I.LIZJ;
            if (c1764670w1R == null || (c1764610w1L = c1764670w1R.LIZIZ) == null || (map = c1764610w1L.LIZLLL) == null) {
                return;
            }
            map.put("__visible", 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void e6() {
        super.e6();
    }

    public SeaPdpBodyMynaVH(ViewGroup viewGroup) {
        C1338760kwU c1338760kwU = new C1338760kwU(viewGroup.getContext(), null, 6);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1338760kwU);
        c1338760kwU.setLayoutParams(layoutParams);
        super(c1338760kwU);
        this.LLJJI = c1338760kwU;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void b6(AbstractC1764350w0v abstractC1764350w0v) {
        boolean z;
        View viewLIZIZ;
        String str;
        C1764370w0x c1764370w0x = (C1764370w0x) abstractC1764350w0v;
        if (!Intrinsics.LJFF(this.LLJJIJI, c1764370w0x)) {
            if (this.LLJJIII == null) {
                z = true;
            } else {
                z = false;
            }
            f6(this, z, true, false, null, 28);
            C00XV c00xv = null;
            if (this.LLJJIII == null) {
                C04FY c04fy = c1764370w0x.LLILZIL.LJIILL;
                if (c04fy != null && (str = c04fy.LIZJ) != null) {
                    C1764540w1E c1764540w1E = InterfaceC1764530w1D.LIZ;
                    EnumC1760270vuL enumC1760270vuL = EnumC1760270vuL.MYNA;
                    C1765230w2L c1765230w2L = new C1765230w2L(C1558360qeg.LJ(this.itemView, null), str, C2097608Jq.LJ());
                    c1764540w1E.getClass();
                    this.LLJJIII = C1764540w1E.LIZ(enumC1760270vuL, c1765230w2L);
                } else {
                    return;
                }
            }
            C1765200w2I c1765200w2I = this.LLJJIII;
            if (c1765200w2I != null) {
                c00xv = c1765200w2I.LJ;
            }
            if (c00xv == C00XV.ERROR && c1765200w2I != null) {
                c1765200w2I.LIZLLL();
            }
            C1765200w2I c1765200w2I2 = this.LLJJIII;
            if (c1765200w2I2 != null) {
                c1764370w0x.LLJJIII = new WeakReference<>(c1765200w2I2);
            }
            C1765200w2I c1765200w2I3 = this.LLJJIII;
            if (c1765200w2I3 != null && (viewLIZIZ = c1765200w2I3.LIZIZ(c1764370w0x.LJIILIIL(), this)) != null) {
                AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(this, viewLIZIZ, 80);
                if (viewLIZIZ.getParent() == null) {
                    awS427S0200000_26.invoke();
                }
            } else {
                f6(this, false, false, false, null, 24);
            }
            this.LLJJIJI = c1764370w0x;
        }
    }

    public final void h6(String str) {
        VM vm;
        C04FN c04fn;
        Map<String, ? extends Object> map;
        C1765200w2I c1765200w2I;
        Map<String, List<EcommerceActionDto>> mapLJII;
        C1765200w2I c1765200w2I2 = this.LLJJIII;
        if (((c1765200w2I2 != null && (mapLJII = c1765200w2I2.LJII()) != null && mapLJII.containsKey(str)) || ((vm = this.LLJIJIL) != 0 && (c04fn = vm.LLILZIL) != null && (map = c04fn.LJIJI) != null && map.containsKey(str))) && (c1765200w2I = this.LLJJIII) != null) {
            c1765200w2I.LIZ(str, null);
        }
    }

    @Override // X.InterfaceC1765250w2N
    public final void LJLIIIL(int i, String str) {
        VM vm = this.LLJIJIL;
        if (vm != 0) {
            vm.LLJILJIL = true;
            vm.LJIIL();
        }
        f6(this, false, false, false, Integer.valueOf(i), 4);
    }

    @Override // X.InterfaceC1765250w2N
    public final void O3(Integer num, String str) {
        VM vm = this.LLJIJIL;
        if (vm != 0) {
            vm.LLJILJIL = true;
            vm.LJIIL();
        }
        f6(this, true, false, false, num, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3 A[PHI: r1
      0x00e3: PHI (r1v5 X.04CV) = (r1v4 X.04CV), (r1v17 X.04CV) binds: [B:78:0x00df, B:20:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f6(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.myna.SeaPdpBodyMynaVH r8, boolean r9, boolean r10, boolean r11, java.lang.Integer r12, int r13) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.myna.SeaPdpBodyMynaVH.f6(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.myna.SeaPdpBodyMynaVH, boolean, boolean, boolean, java.lang.Integer, int):void");
    }
}
