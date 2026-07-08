package com.ss.android.ugc.feed.platform.panel.pagestate;

import X.C01GW;
import X.C0OVK;
import X.C0RJN;
import X.C1233040iBy;
import X.C1235870iGX;
import X.C1257170iot;
import X.C1264160j0A;
import X.C1389300mG0;
import X.C1749280vcc;
import X.C19EG;
import X.C1A5L;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2276411E8h;
import X.C305550ByL;
import X.C452501pT;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1609900rzo;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC743730TFj;
import Y.ARunnableS109S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class PageStateCommonComponent extends BasePanelUIComponent implements InterfaceC743730TFj, IPageStateAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJJ = 0;
    public C1235870iGX LLJIJIL;
    public boolean LLJILJIL;
    public C1749280vcc LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C0OVK(this));

    @Override // X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
    }

    public C1235870iGX Go() {
        return null;
    }

    public void Jo() {
    }

    @Override // X.InterfaceC743730TFj
    public void L() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
    }

    public void Lo() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M1(Configuration configuration) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Mf(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Re(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Tg() {
    }

    public void Ys2(Exception exc) {
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
    }

    @Override // X.InterfaceC743730TFj
    public void dd() {
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
    }

    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void ie1() {
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public void A72() {
        C1235870iGX c1235870iGXD31 = D31();
        if (c1235870iGXD31 == null) {
            Ys2(null);
        } else {
            C786410Ut5.LLLLIILL(c1235870iGXD31, 0);
            c1235870iGXD31.LJII();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final C1235870iGX D31() {
        C0RJN panelContext = getPanelContext();
        if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Following")) {
            if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Nearby")) {
                if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Popular")) {
                    if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "For You")) {
                        if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Friends")) {
                            if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Topic")) {
                                if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Stem")) {
                                    if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Live")) {
                                        if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Repost")) {
                                            if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "DETAIL_SIMILAR_VIDEO")) {
                                                if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "DETAIL_VIBE_FEED")) {
                                                    if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Inspiration")) {
                                                        if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Playmode Moodboost")) {
                                                            if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Playmode New")) {
                                                                if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Playmode Top")) {
                                                                    if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "NEARBY_FEED_DOUBLE_COLUMN")) {
                                                                        if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "DETAIL_TTMALL_HOMEPAGE")) {
                                                                            if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "Series")) {
                                                                                if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "NEARBY_FEED_INNER")) {
                                                                                    if (!Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "DETAIL_FOOTNOTE")) {
                                                                                        if (Intrinsics.LJFF(panelContext != null ? panelContext.LIZ : null, "DETAIL_COLD_CACHE_DEBUG_TOOL") || !C1389300mG0.LJII(getPanelContext())) {
                                                                                            return null;
                                                                                        }
                                                                                        return Go();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public void DC2() {
        C1749280vcc c1749280vcc;
        C1235870iGX c1235870iGXD31 = D31();
        if (c1235870iGXD31 != null) {
            C786410Ut5.LLLLIILL(c1235870iGXD31, 8);
        }
        if ((C1389300mG0.LJIL(getPanelContext()) || C1389300mG0.LJIJJLI(getPanelContext())) && (c1749280vcc = this.LLJILJILJ) != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public void cn0() {
        if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS109S0100000_9(this, 121));
            return;
        }
        C1235870iGX c1235870iGX = this.LLJIJIL;
        if (c1235870iGX != null) {
            C786410Ut5.LLLLIILL(c1235870iGX, 8);
        }
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public void eS() {
        C1235870iGX c1235870iGXD31 = D31();
        if (c1235870iGXD31 != null) {
            C786410Ut5.LLLLIILL(c1235870iGXD31, 0);
            c1235870iGXD31.LJII();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final boolean reset() {
        C1235870iGX c1235870iGXD31 = D31();
        if (c1235870iGXD31 == null) {
            return false;
        }
        c1235870iGXD31.LJI();
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public void tn1() {
        C1235870iGX c1235870iGXD31 = D31();
        if (c1235870iGXD31 != null) {
            try {
                C786410Ut5.LLLLIILL(c1235870iGXD31, 0);
                C786410Ut5.LLLLIILL(c1235870iGXD31, 0);
                c1235870iGXD31.setStatus(2);
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C2276411E8h.LIZIZ.LIZIZ("common_feed", e);
                Fragment fragment = getPanelContext().LJ;
                C1233040iBy c1233040iBy = new C1233040iBy(fragment != null ? fragment.getContext() : null);
                c1233040iBy.LIZIZ(2131837962);
                c1233040iBy.LIZLLL();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public void R() {
        DC2();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final C1749280vcc ef0() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void FH(Exception exc) {
        Context context;
        C1235870iGX c1235870iGXD31 = D31();
        if (c1235870iGXD31 != null) {
            try {
                C786410Ut5.LLLLIILL(c1235870iGXD31, 0);
                C786410Ut5.LLLLIILL(c1235870iGXD31, 0);
                c1235870iGXD31.setStatus(2);
                return;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C2276411E8h.LIZIZ.LIZIZ("common_feed", e);
                Fragment fragment = getPanelContext().LJ;
                if (fragment != null) {
                    context = fragment.getContext();
                } else {
                    context = null;
                }
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZIZ(2131837962);
                c1233040iBy.LIZLLL();
                return;
            }
        }
        Ys2(exc);
    }

    public void cD2(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public void t4(boolean z) {
        C1235870iGX c1235870iGXD31 = D31();
        if (c1235870iGXD31 != null) {
            C786410Ut5.LLLLIILL(c1235870iGXD31, 0);
            c1235870iGXD31.LJIIIIZZ();
        } else {
            Lo();
        }
    }

    public final void Ho(EnumC1609900rzo enumC1609900rzo, Exception exc) {
        C19EG activity;
        ILoadMoreAbility iLoadMoreAbilityEw0;
        IRefreshAbility iRefreshAbilityE80;
        C19EG activity2;
        Window window;
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (activity2 = fragment.getActivity()) != null && (window = activity2.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.b6);
        }
        if (this.LLJILJILJ == null) {
            return;
        }
        Fragment fragment2 = getPanelContext().LJ;
        IFeedFragmentAbility iFeedFragmentAbility = (IFeedFragmentAbility) this.LLJILLL.getValue();
        if (iFeedFragmentAbility != null && (iRefreshAbilityE80 = iFeedFragmentAbility.E80()) != null) {
            iRefreshAbilityE80.setRefreshing(false);
        }
        IFeedFragmentAbility iFeedFragmentAbility2 = (IFeedFragmentAbility) this.LLJILLL.getValue();
        if (iFeedFragmentAbility2 != null && (iLoadMoreAbilityEw0 = iFeedFragmentAbility2.Ew0()) != null) {
            iLoadMoreAbilityEw0.resetLoadMoreState();
        }
        if (this.LLJILJIL) {
            return;
        }
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            C1264160j0A.LIZ(c1749280vcc, enumC1609900rzo, exc, new AwS425S0200000_24(fragment2, this, 49));
        }
        C1749280vcc c1749280vcc2 = this.LLJILJILJ;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
        if ((!C305550ByL.LIZJ() || !C1389300mG0.LJIL(getPanelContext())) && fragment2 != null && (activity = fragment2.getActivity()) != null) {
            C1257170iot.LIZ(activity, enumC1609900rzo, exc, this.LLJILJILJ);
        }
    }

    @Override // X.InterfaceC743730TFj
    public void LLZLLLL(View view, Bundle bundle) {
        C1749280vcc c1749280vcc;
        C1749280vcc c1749280vcc2 = null;
        if (view != null) {
            c1749280vcc = (C1749280vcc) view.findViewById(this.LLIZ);
        } else {
            c1749280vcc = null;
        }
        if (c1749280vcc instanceof C1749280vcc) {
            c1749280vcc2 = c1749280vcc;
        }
        this.LLJILJILJ = c1749280vcc2;
        C2271391DvN.LIZ(c1749280vcc2, (C1A5L) C2271381DvM.LJIILL.getValue());
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Tq(boolean z, boolean z2) {
        Jo();
    }
}
