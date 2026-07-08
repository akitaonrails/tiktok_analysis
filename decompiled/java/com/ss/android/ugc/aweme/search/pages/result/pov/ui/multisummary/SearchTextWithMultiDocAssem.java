package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary;

import X.C01GW;
import X.C06X8;
import X.C0DXR;
import X.C15438062q;
import X.C1697810uHb;
import X.C218300sn;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C684750QtV;
import X.C684840Qte;
import X.C723830SaL;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC684740QtU;
import X.InterfaceC684820Qtc;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS43S0300000_10;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video.SearchVideoDocItemCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTextWithMultiDocAssem extends SearchMultiSummaryBaseAssem<C684750QtV> implements InterfaceC684820Qtc {
    public static final int LLJZIJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132));
    public C684750QtV LLJLLL;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 666));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f0a;
    }

    @Override // X.InterfaceC684820Qtc
    public final Class<? extends PowerCell<?>>[] rd() {
        return new Class[]{SearchVideoDocItemCell.class};
    }

    @Override // X.InterfaceC684820Qtc
    public final C0DXR W5() {
        return new C06X8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
    }

    @Override // X.InterfaceC684820Qtc
    public final int el() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    @Override // X.InterfaceC684820Qtc
    public final int wm() {
        return LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] */
    public final void up(C684750QtV c684750QtV) {
        boolean z;
        C684750QtV c684750QtV2;
        if (!C218300sn.LIZ() || !c684750QtV.LLJIJIL || ((c684750QtV2 = this.LLJLLL) != null && c684750QtV2.areItemTheSame(c684750QtV))) {
            z = false;
        } else {
            z = true;
        }
        super.up(c684750QtV);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvR8 = r8(getContentView());
        if (viewOnAttachStateChangeListenerC20604515jvR8 != null) {
            if (z) {
                viewOnAttachStateChangeListenerC20604515jvR8.animate().cancel();
                C786410Ut5.s5(viewOnAttachStateChangeListenerC20604515jvR8, 0.0f);
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jvR8, new ARunnableS43S0300000_10(c684750QtV, this, viewOnAttachStateChangeListenerC20604515jvR8, 6));
            } else if (!c684750QtV.LLJIJIL) {
                viewOnAttachStateChangeListenerC20604515jvR8.animate().cancel();
                C786410Ut5.s5(viewOnAttachStateChangeListenerC20604515jvR8, 1.0f);
            }
        }
        this.LLJLLL = c684750QtV;
        if (c684750QtV.LJ()) {
            C339190DRl.LIZLLL((View) this.LLJZ.getValue());
            yp(true);
        } else {
            C339190DRl.LIZIZ((View) this.LLJZ.getValue());
            yp(false);
        }
    }

    @Override // X.InterfaceC684820Qtc
    public final List<InterfaceC1891350zJl> Jf(InterfaceC684740QtU interfaceC684740QtU) {
        List<Aweme> videoList = interfaceC684740QtU.getVideoList();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(videoList, 10));
        int i = 0;
        for (Aweme aweme : videoList) {
            int i2 = i + 1;
            Object obj = null;
            if (i >= 0) {
                Aweme aweme2 = aweme;
                int iLJJLIIJ = interfaceC684740QtU.LJJLIIJ() + i;
                int userDigg = aweme2.getUserDigg();
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                arrayList.add(new C684840Qte(iLJJLIIJ, userDigg, aweme2, ((C684750QtV) obj).LLJIJIL));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC684820Qtc
    public final ViewOnAttachStateChangeListenerC20604515jv r8(View view) {
        return (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.tw2);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem
    public final void tp(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 264));
    }
}
