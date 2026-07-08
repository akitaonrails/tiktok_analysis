package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0DMM;
import X.C0S4U;
import X.C0SXF;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1402130mah;
import X.C1558520qew;
import X.C1566140qrE;
import X.C1578630rBN;
import X.C19252910Tv;
import X.C19EG;
import X.C299750Boz;
import X.C452501pT;
import X.C520680KbS;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.EnumC584570MwJ;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC427710Gpt;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS119S0100000_19;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS138S0110000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TabletDefaultAutoScrollComponent extends BaseAutoScrollUIComponent implements IDefaultAutoScrollAbility, InterfaceC427710Gpt, InterfaceC1554640qYg {
    public boolean LLJJIJI = true;
    public final C01GW LLJJIJIIJIL;
    public final C630740Ooa LLJJIJIL;

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent
    public final String Jo() {
        return "first_show_default_auto_scroll";
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1883218582) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IDefaultAutoScrollAbility
    public final void U40() {
        if (C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJIILL()) {
            Vo();
        }
    }

    public TabletDefaultAutoScrollComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS565S0100000_21((InterfaceC1565950qqv) this, 1080), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS138S0110000_21(false, (InterfaceC1565950qqv) this, 4));
        }
        this.LLJJIJIIJIL = c01gwLIZIZ;
        this.LLJJIJIL = C628500Oky.LIZ(new AwS565S0100000_21(this, 1081));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent
    public final boolean Go() {
        return Zo() != EnumC584570MwJ.AUTO_SCROLL_STATE_START;
    }

    public final EnumC584570MwJ Zo() {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        Fragment fragmentKi;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        IAutoAScrollAbility iAutoAScrollAbility;
        EnumC584570MwJ enumC584570MwJXo1;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        return (c19egLIZ == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZ)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null || (fragmentKi = homeTabAbilityLIZ.Ki("For You")) == null || (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragmentKi)) == null || (iAutoAScrollAbility = (IAutoAScrollAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IAutoAScrollAbility.class, null)) == null || (enumC584570MwJXo1 = iAutoAScrollAbility.xo1()) == null) ? EnumC584570MwJ.AUTO_SCROLL_STATE_STOP : enumC584570MwJXo1;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0XQ7.LJFF().LJIILLIIL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IDefaultAutoScrollAbility
    public final void ZP1() {
        Lo();
    }

    public final void ap(boolean z) {
        C19EG c19egLIZ;
        Aweme awemeLLLLLJLJLL;
        long j;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && ((c19egLIZ = C724240Sb0.LIZ(this)) == null || !C0SXF.LJIL(c19egLIZ))) {
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            if (c19252910Tv.LIZLLL().LJIILL().LJIILL() && !c19252910Tv.LIZLLL().LJIILL().LLJJJJJIL()) {
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJIJIL.getValue();
                if (iViewPagerComponentAbility != null && (awemeLLLLLJLJLL = iViewPagerComponentAbility.LLLLLJLJLL()) != null) {
                    if (!AwemeSaaSExtKt.isLive(awemeLLLLLJLJLL) && !C1017070cZd.LLIZLLLIL(awemeLLLLLJLJLL)) {
                        if (awemeLLLLLJLJLL.getAwemeType() == 4004) {
                            C786410Ut5.LJLLLLLL(8, LJJIJL());
                            return;
                        }
                        if (this.LLJJIJI) {
                            if (No() && LJJIJL().getVisibility() != 0) {
                                c19252910Tv.LIZLLL().LJIJI().LJLLI().LJJLIIIJLJLI(true);
                            }
                            View viewLJJIJL = LJJIJL();
                            ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19(this, 97);
                            if (z) {
                                j = 300;
                            } else {
                                j = 0;
                            }
                            HandlerHook.viewPostDelay(viewLJJIJL, aRunnableS119S0100000_19, j);
                            return;
                        }
                        if (LJJIJL().getVisibility() == 0) {
                            return;
                        }
                        C786410Ut5.LJLLLLLL(0, LJJIJL());
                        return;
                    }
                    C786410Ut5.LJLLLLLL(8, LJJIJL());
                    return;
                }
                return;
            }
        }
        Lo();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewLIZ = C520680KbS.LIZ(R.id.bej, view);
        if (viewLIZ != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 105), viewLIZ);
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJIJIL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C1402130mah(this, 3));
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJIILL().LLIIJI(C724240Sb0.LIZ(this), this.LLJILJILJ, this.LLJILLL);
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(this);
        if (!c19252910Tv.LIZLLL().LJIILL().LJIILL()) {
            Lo();
        }
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        if (i == 4 && user2 != null && user != null && !Intrinsics.LJFF(user2.getUid(), user.getUid())) {
            ap(false);
        }
    }
}
