package com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders;

import X.AbstractC562050M2p;
import X.C01GW;
import X.C054G;
import X.C0C64;
import X.C0HZQ;
import X.C0LAB;
import X.C0M0P;
import X.C0PEM;
import X.C0VSJ;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C20684815ws;
import X.C23250099c;
import X.C291090Bb1;
import X.C376370EpH;
import X.C452501pT;
import X.C553690Lnb;
import X.C561130Lzb;
import X.C561950M2f;
import X.C562270M3l;
import X.C563290M7j;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import X.InterfaceC550750Lir;
import X.InterfaceC562000M2k;
import X.ViewOnClickListenerC561930M2d;
import Y.ACListenerS112S0200000_8;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoMetricsInfo;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DraftItemBaseBgViewHolder extends AbstractC562050M2p<C0M0P> implements GenericLifecycleObserver {
    public final View LL;
    public final C561130Lzb LLILLJJLI;
    public final InterfaceC497601wk LLILLL;
    public final InterfaceC562000M2k LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;

    public abstract Integer S5();

    public abstract void X5(C0M0P c0m0p, int i);

    public void a6(C0M0P c0m0p) {
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public abstract void onViewDetachedFromWindow();

    public final C0HZQ N5() {
        return (C0HZQ) this.LLILZLL.getValue();
    }

    public final C376370EpH P5() {
        return (C376370EpH) this.LLILZIL.getValue();
    }

    public static boolean W5() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "draft_box_badge_style", true) > 0 && C291090Bb1.LIZ();
    }

    public C561130Lzb R5() {
        return this.LLILLJJLI;
    }

    public InterfaceC562000M2k T5() {
        return this.LLILZ;
    }

    public InterfaceC497601wk U5() {
        return this.LLILLL;
    }

    public View getItemView() {
        return this.LL;
    }

    public static void b6(C0M0P c0m0p) {
        String strLJI;
        InterfaceC550750Lir interfaceC550750LirG9;
        if (!c0m0p.LJJIII) {
            return;
        }
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null && (interfaceC550750LirG9 = aITheaterProfileServiceLIZ.g9()) != null) {
            AITheaterCameoMetricsInfo aITheaterCameoMetricsInfoLJIILJJIL = interfaceC550750LirG9.LJIILJJIL();
            if (aITheaterCameoMetricsInfoLJIILJJIL == null || (strLJI = aITheaterCameoMetricsInfoLJIILJJIL.getFaceidCreatedWay()) == null) {
                strLJI = interfaceC550750LirG9.LJI();
            }
        } else {
            strLJI = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(C562270M3l.LIZJ(c0m0p.LJIIIZ, jCurrentTimeMillis), "draft_create_days");
        c0lab.LIZIZ(C562270M3l.LIZJ(c0m0p.LJIIJ, jCurrentTimeMillis), "draft_last_edit_days");
        c0lab.LJ("faceid_created_way", strLJI);
        c0lab.LIZ(c0m0p.LJIIZILJ ? 1 : 0, "is_first_ai_self_auto_cast");
        C20684815ws.LJIILLIIL("draft_item_show", c0lab.LIZ);
        c0m0p.LJJIII = false;
    }

    public final void V5(C0M0P c0m0p) {
        if (c0m0p.LIZIZ) {
            C786410Ut5.LJLLLLLL(0, (View) this.LLIZ.getValue());
            C786410Ut5.I7(new ViewOnClickListenerC561930M2d(200L, new AwS409S0200000_8(this, c0m0p, 72)), getItemView());
        } else {
            C786410Ut5.LJLLLLLL(8, (View) this.LLIZ.getValue());
            c0m0p.LJIIJJI = false;
        }
        N5().setChecked(c0m0p.LJIIJJI);
        C786410Ut5.b9(N5(), new ACListenerS112S0200000_8(this, c0m0p, 10));
    }

    @Override // X.AbstractC562050M2p
    public final void I5(C561950M2f c561950M2f, int i) {
        C0M0P c0m0p = (C0M0P) c561950M2f;
        c0m0p.LIZIZ = this.LLJILJIL;
        c0m0p.LIZJ = this.LLJILJILJ;
        V5(c0m0p);
        L5(i, c0m0p);
    }

    public final void L5(int i, C0M0P c0m0p) {
        if (Intrinsics.LJFF(P5().getTag(), c0m0p.LJ)) {
            return;
        }
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJ.getValue(), 8);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJI.getValue(), 8);
        P5().setTag(c0m0p.LJ);
        C0VSJ c0vsj = new C0VSJ(c0m0p.LJFF);
        if (c0vsj.exists()) {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(Uri.fromFile(c0vsj));
            c1331670kl3LJI.LJJIIZI(null);
            c1331670kl3LJI.LJJI(P5());
            C786410Ut5.h3(c1331670kl3LJI);
            return;
        }
        P5().setImageResource(R.drawable.c2c);
        InterfaceC497601wk interfaceC497601wkU5 = U5();
        if (interfaceC497601wkU5 != null) {
            C23250099c.LIZLLL(interfaceC497601wkU5, C0PEM.LIZJ, null, new C553690Lnb(this, c0m0p, i, null), 2);
        }
    }

    public DraftItemBaseBgViewHolder(View view, C561130Lzb c561130Lzb, C054G c054g, DraftBoxFragment draftBoxFragment) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = c561130Lzb;
        this.LLILLL = c054g;
        this.LLILZ = draftBoxFragment;
        this.LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 860));
        this.LLILZLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 850));
        this.LLIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 853));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 856));
        this.LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 862));
        this.LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 861));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(StrategyCenter.ENABLE_SMART_SERVICE));
    }
}
