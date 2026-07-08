package com.ss.android.ugc.aweme.vibefeed.feed.component;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0HTI;
import X.C1220000hqw;
import X.C1235870iGX;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1575440r6E;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C339190DRl;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C814420VxA;
import X.C878203bw;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM;
import com.ss.android.ugc.aweme.vibefeed.feed.ability.IVibeStatusViewAbility;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class VibeStatusComponent extends BasePanelComponent implements IVibeStatusViewAbility, InterfaceC1554640qYg {
    public final C736950SvV LL;
    public final C01GW LLILLJJLI;
    public C1749280vcc LLILLL;
    public long LLILZ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1265398830) {
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m334do() {
        if (!((BaseDetailShareVM) this.LL.getValue()).LL || this.LLILZ <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
        this.LLILZ = 0L;
        C1575440r6E.LIZIZ("vibe_feed_exit_when_loading", C2097908Jt.LIZJ(new Pair("loading_time", String.valueOf(jCurrentTimeMillis))));
    }

    public final void fo() {
        Context context;
        C1749280vcc c1749280vcc = this.LLILLL;
        if (c1749280vcc == null || (context = c1749280vcc.getContext()) == null) {
            return;
        }
        C1749280vcc c1749280vcc2 = this.LLILLL;
        if (c1749280vcc2 != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            Drawable drawableLIZ = c0hti.LIZ(context);
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJFF = 2131830001;
            c1722300uv6.LJII = 2131829999;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            c1722300uv6.LJIIL = C878203bw.LIZ;
            c1722300uv6.LJIIIZ = new AwS588S0100000_9(this, 682);
            c1749280vcc2.setStatus(c1722300uv6);
        }
        C339190DRl.LIZLLL(this.LLILLL);
    }

    public VibeStatusComponent() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(299);
        this.LL = new C736950SvV(C13LE.LIZ(VibeDetailSharedVM.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(243), new AwS575S0100000_31((AbstractC738140SxQ) this, 1207), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1205));
    }

    public final void bo() {
        DetailPageComponent detailPageComponentDn1;
        ViewGroup viewGroup;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IFeedFragmentAbility.class, null);
            IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) (interfaceC494301wDLIZ instanceof IDetailPageAbility ? interfaceC494301wDLIZ : null);
            if (iDetailPageAbility == null || (detailPageComponentDn1 = iDetailPageAbility.Dn1()) == null || (viewGroup = detailPageComponentDn1.LLLII) == null) {
                return;
            }
            C339190DRl.LIZIZ(viewGroup);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        m334do();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            m334do();
        }
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.feed.ability.IVibeStatusViewAbility
    public final void wf1(C1749280vcc c1749280vcc, LifecycleOwner lifecycleOwner) {
        DetailPageComponent detailPageComponentDn1;
        C1235870iGX c1235870iGXAp;
        this.LLILLL = c1749280vcc;
        if (c1749280vcc != null) {
            c1749280vcc.setLayoutVariant(0);
        }
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedFragmentAbility.class, null);
        if (interfaceC494301wDLIZ instanceof IDetailPageAbility) {
            interfaceC494301wD = interfaceC494301wDLIZ;
        }
        IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) interfaceC494301wD;
        if (iDetailPageAbility != null && (detailPageComponentDn1 = iDetailPageAbility.Dn1()) != null && (c1235870iGXAp = detailPageComponentDn1.ap()) != null) {
            C339190DRl.LIZIZ(c1235870iGXAp);
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LL.getValue();
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        assemViewModel.asyncSubscribe(new C2217381BqS() { // from class: X.15fW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C0P3U c0p3u = (C0P3U) obj;
                c0p3u.getClass();
                return C627260Oiy.LIZLLL(c0p3u);
            }
        }, lifecycleOwner, c1770850wBP, new AwS610S0100000_31(this, 257), new AwS575S0100000_31(this, 1206), new AwS610S0100000_31(this, 258));
    }
}
