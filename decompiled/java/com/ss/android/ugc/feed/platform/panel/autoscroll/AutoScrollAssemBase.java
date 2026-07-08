package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0DMM;
import X.C0P0T;
import X.C0PEM;
import X.C0RD6;
import X.C0RRV;
import X.C0RRW;
import X.C0S4U;
import X.C0SUC;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1386360mBG;
import X.C1388190mED;
import X.C13LE;
import X.C1558520qew;
import X.C1578630rBN;
import X.C19252910Tv;
import X.C19EG;
import X.C1DFH;
import X.C1ER1;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2187701Ajg;
import X.C2214201BlK;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C445680Hdm;
import X.C452501pT;
import X.C487280J9a;
import X.C694180RKu;
import X.C699500RcC;
import X.C700100RdA;
import X.C700450Rdj;
import X.C724240Sb0;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1058480deQ;
import X.InterfaceC1603190roz;
import X.InterfaceC487330J9f;
import X.InterfaceC665370Q7z;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.ViewTreeObserverOnGlobalLayoutListenerC462880IDe;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AutoScrollAssemBase extends BaseCellSlotComponent<AutoScrollAssemBase> implements ComponentPriorityProtocol, InterfaceC487330J9f {
    public static boolean LLLIIIIL;
    public C0P0T LLLFF;
    public View LLLFFI;
    public Aweme LLLFZ;
    public AnonymousClass0956 LLLI;
    public boolean LLLII;
    public final String LLJLLIL = "tablets_first_show_autoscroll_v3_count";
    public final String LLJLLL = "tablets_feed_auto_scroll";
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1077));
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS259S0000000_21.get$arr$(287));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1076));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1078));
    public final AwS600S0100000_21 LLLIIII = new AwS600S0100000_21(this, 190);

    public abstract void Bp(boolean z);

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_autoscroll";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    public abstract void Jp();

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    public abstract View Vt();

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public final void Ip() {
        Aweme awemeLLLLLJLJLL;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLLF.getValue();
        if (iViewPagerComponentAbility == null || (awemeLLLLLJLJLL = iViewPagerComponentAbility.LLLLLJLJLL()) == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LJIIIIZZ("enter_method", getEnterMethod());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(awemeLLLLLJLJLL));
        String aid = awemeLLLLLJLJLL.getAid();
        if (aid == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        C20684815ws.LJIILLIIL("turn_on_auto_scroll", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        AnonymousClass0956 anonymousClass0956 = this.LLLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C0P0T c0p0t = this.LLLFF;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public final String getEnterMethod() {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        return c19252910Tv.LIZLLL().LJIILL().LJJIJIIJI() == C0RRV.SWITCH ? c19252910Tv.LIZLLL().LJIILL().LJZ() == C0RRW.TOP ? "toggle_switch_up" : "toggle_switch_bottom" : c19252910Tv.LIZLLL().LJIILL().LJZ() == C0RRW.TOP ? "feed_button_up" : "feed_button_bottom";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C487280J9a.LIZJ(this);
        IAutoAScrollAbility iAutoAScrollAbilityFp = Fp(null);
        if (iAutoAScrollAbilityFp != null) {
            iAutoAScrollAbilityFp.mb1(this.LLLIIII);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        IAutoAScrollAbility iAutoAScrollAbilityFp = Fp(null);
        if (iAutoAScrollAbilityFp != null || (iAutoAScrollAbilityFp = Fp(C724240Sb0.LIZ(this))) != null) {
            iAutoAScrollAbilityFp.Wa1(this.LLLIIII);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    public static void Qp(AutoScrollAssemBase autoScrollAssemBase) {
        autoScrollAssemBase.getClass();
        if (!C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJJLIIIJLLLLLLLZ(null)) {
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) autoScrollAssemBase.LLL.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.zB1(autoScrollAssemBase);
                return;
            }
            return;
        }
        View viewVt = autoScrollAssemBase.Vt();
        viewVt.animate().cancel();
        C786410Ut5.LJLLLLLL(8, viewVt);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
        this.LLLII = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.19EG] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.19EG, android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.app.Activity] */
    public final IAutoAScrollAbility Fp(C19EG c19eg) {
        Fragment fragmentBc;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        HomeTabAbility homeTabAbilityLIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1578630rBN.LJIIL(fragmentLJI, C13LE.LIZ(AutoScrollComponent.class));
        }
        if (c19eg == 0) {
            c19eg = C2214201BlK.LJFF();
        }
        if (!(c19eg instanceof C19EG)) {
            return null;
        }
        ?? r4 = (C19EG) c19eg;
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            C1578630rBN.LJIIL(fragmentLJI2, C13LE.LIZ(AutoScrollComponent.class));
        }
        String eventType = C0SUC.LIZ(r4).getEventType();
        if (r4 instanceof InterfaceC1603190roz) {
            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(r4);
            if (mainActivityScopeLIZJ == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                return null;
            }
            fragmentBc = homeTabAbilityLIZ.Ki("For You");
        } else {
            if (!(r4 instanceof InterfaceC1058480deQ)) {
                return null;
            }
            if ((!C1386360mBG.LJIIJ(eventType) || !C1ER1.LIZIZ.F()) && !C1386360mBG.LJIIIZ(eventType)) {
                return null;
            }
            fragmentBc = ((InterfaceC1058480deQ) r4).Bc();
        }
        if (fragmentBc == null || (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragmentBc)) == null) {
            return null;
        }
        return (IAutoAScrollAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IAutoAScrollAbility.class, null);
    }

    public final int Gp(Context context) {
        Integer numLIZ = C1308910kAL.LIZ(R.attr.g0b, context);
        if (numLIZ != null) {
            return numLIZ.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_enter_clear_mode", new AwS600S0100000_21(this, 189));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLLFFI = view;
        Vt().setTag(C700100RdA.LJI, "");
        if (C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJJLIIIJLLLLLLLZ(null)) {
            View viewVt = Vt();
            viewVt.animate().cancel();
            C786410Ut5.LJLLLLLL(8, viewVt);
        }
    }

    public final void Ep(Integer num, Integer num2) {
        Aweme aweme;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIILL().LLJJJJJIL() && !c19252910Tv.LIZLLL().LJIILL().LJJLIIIJLLLLLLLZ(num) && c19252910Tv.LIZLLL().LJIILL().LJJJZ(num, num2) && (aweme = this.LLLFZ) != null && !AwemeSaaSExtKt.isLive(aweme) && !aweme.isAd()) {
            C786410Ut5.LJLLLLLL(0, Vt());
        } else {
            C786410Ut5.LJLLLLLL(8, Vt());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        this.LLLFZ = aweme;
        Jp();
        Ep(null, null);
        View view = this.LLLFFI;
        if (view != null && ((Keva) this.LLJZ.getValue()).getInt(this.LLJLLIL, 0) < 3) {
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            if (c19252910Tv.LIZLLL().LJIILL().LLJJJJJIL() && !c19252910Tv.LIZLLL().LJIILL().LJJLIIIJLLLLLLLZ(null) && c19252910Tv.LIZLLL().LJIILL().LJJJZ(null, null) && aweme != null && !AwemeSaaSExtKt.isLive(aweme) && !aweme.isAd() && !LLLIIIIL && !this.LLLII) {
                C1361400lX0 c1361400lX0LJ = C1388190mED.LJ(Gp(view.getContext()), view.getContext());
                C1DFH c1dfh = C0PEM.LIZ;
                this.LLLI = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C445680Hdm(this, c1361400lX0LJ, view, null), 3);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe = new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(this, view, 5);
                    viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
                    C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
            }
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        Ep(Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.screenHeightDp));
    }
}
