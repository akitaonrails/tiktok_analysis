package com.bytedance.android.livesdk.game.broadcast.widget;

import X.AbstractC743230TDl;
import X.C09JN;
import X.C0J1N;
import X.C0TES;
import X.C0TET;
import X.C11PQ;
import X.C11RD;
import X.C1701940uOG;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C497740JfY;
import X.C743540TEq;
import X.C782110Um9;
import X.C786410Ut5;
import X.EnumC743340TDw;
import Y.AcS495S0100000_12;
import Y.AfS181S0100000_12;
import android.content.res.ColorStateList;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class PhoneAsCameraErrorWidget extends LiveRecyclableWidget {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final C11PQ<EnumC743340TDw> LL;
    public final C11PQ<AbstractC743230TDl> LLILLJJLI;
    public final String LLILLL;
    public final C0TET LLILZ;
    public boolean LLILZIL;
    public final AfS181S0100000_12 LLILZLL = new AfS181S0100000_12(this, 97);
    public final AfS181S0100000_12 LLIZ = new AfS181S0100000_12(this, 98);

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C0J1N c0j1n;
        C0J1N c0j1n2;
        C11PQ<AbstractC743230TDl> c11pq = this.LLILLJJLI;
        if (c11pq != null && (c0j1n2 = (C0J1N) c11pq.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))) != null) {
            c0j1n2.LIZ(this.LLIZ, new C09JN() { // from class: X.0Ij8
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PhoneAsCameraErrorWidget@1521.onLoad$1");
                    C20441214yg.LJI("PhoneAsCameraErrorDialogWidget", (Throwable) obj);
                    C1C7U.LIZIZ("PhoneAsCameraErrorWidget@1521.onLoad$1");
                }
            });
        }
        C11PQ<EnumC743340TDw> c11pq2 = this.LL;
        if (c11pq2 != null && (c0j1n = (C0J1N) c11pq2.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))) != null) {
            c0j1n.LIZ(this.LLILZLL, new C09JN() { // from class: X.0Ij9
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PhoneAsCameraErrorWidget@1521.onLoad$2");
                    C20441214yg.LJI("PhoneAsCameraErrorDialogWidget", (Throwable) obj);
                    C1C7U.LIZIZ("PhoneAsCameraErrorWidget@1521.onLoad$2");
                }
            });
        }
    }

    public final void x1(String str, String str2) {
        String strLJIJI;
        if (this.LLILZIL) {
            return;
        }
        C0TET c0tet = this.LLILZ;
        String strLIZ = C0TES.LIZ(this.dataChannel);
        String str3 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        C743540TEq.LJJIJ(c0tet, "abnormal_disconnect", strLIZ, str3, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZ == C0TET.WIRELESS) {
            strLJIJI = C497740JfY.LJIJI(2131853615);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131853616);
        }
        C782110Um9 c782110Um9 = new C782110Um9(this.context);
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131843019);
        c782110Um9.LJIIIZ(strLJIJI);
        c782110Um9.LJFF(C20736316Cj.LJ(R.attr.dn2, c782110Um9.LIZ));
        c782110Um9.LJI = ColorStateList.valueOf(C20736316Cj.LIZIZ(R.attr.ezq, this.context));
        c782110Um9.LJIIIIZZ = (int) C497740JfY.LIZIZ(40.0f);
        c782110Um9.LJIIIZ = (int) C497740JfY.LIZIZ(40.0f);
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131843009), new AcS495S0100000_12(this, 23));
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131842858), new AcS495S0100000_12(this, 24));
        C786410Ut5.E4(c782110Um9.LIZ());
        C743540TEq.LJJIJIIJIL(this.LLILZ, "show", "abnormal", "", C0TES.LIZ(this.dataChannel));
        this.LLILZIL = true;
    }

    public PhoneAsCameraErrorWidget(C11PQ<EnumC743340TDw> c11pq, C11PQ<AbstractC743230TDl> c11pq2, String str, C0TET c0tet) {
        this.LL = c11pq;
        this.LLILLJJLI = c11pq2;
        this.LLILLL = str;
        this.LLILZ = c0tet;
    }
}
