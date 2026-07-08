package com.ss.android.ugc.aweme.poi.detail.videolist.ui;

import X.C098200Yq;
import X.C1183070gtN;
import X.C1189060h32;
import X.C1278904zT;
import X.C1411105fh;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1749280vcc;
import X.C189200o6;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1184730gw3;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC786060UsW;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailTypeAbility;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailPostStatusCell extends PowerCell<C1278904zT> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1749280vcc c1749280vcc;
        C1278904zT c1278904zT = (C1278904zT) interfaceC1891350zJl;
        View view = this.itemView;
        if (view != null) {
            AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(1015);
            if (view.isAttachedToWindow()) {
                aFwS256S0000000_18.invoke(view);
            } else {
                view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC786060UsW(view, aFwS256S0000000_18, 0));
            }
        }
        if (C1411105fh.LIZ[c1278904zT.LL.ordinal()] == 1) {
            View view2 = this.itemView;
            if ((view2 instanceof C1749280vcc) && (c1749280vcc = (C1749280vcc) view2) != null) {
                c1749280vcc.LJ();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        Object c098200Yq;
        IPoiDetailTypeAbility iPoiDetailTypeAbility;
        Object obj = null;
        C1749280vcc c1749280vcc = new C1749280vcc(viewGroup.getContext(), null, 6);
        C786410Ut5.U6(c1749280vcc, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(400))));
        try {
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            if (fragmentLJIIJ != null && (iPoiDetailTypeAbility = (IPoiDetailTypeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiDetailTypeAbility.class, null)) != null) {
                c098200Yq = iPoiDetailTypeAbility.Ds0(null);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        EnumC1184730gw3 enumC1184730gw3 = (EnumC1184730gw3) obj;
        if (C1183070gtN.LIZIZ() && C1183070gtN.LIZ(enumC1184730gw3)) {
            c1749280vcc.setLayoutVariant(1);
            return c1749280vcc;
        }
        c1749280vcc.setLayoutVariant(0);
        return c1749280vcc;
    }
}
