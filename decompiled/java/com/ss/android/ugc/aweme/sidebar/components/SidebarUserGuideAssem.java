package com.ss.android.ugc.aweme.sidebar.components;

import X.C1295960jpS;
import X.C1580440rEI;
import X.C197039127h;
import X.C19EG;
import X.C418440Gaw;
import X.C426750GoL;
import X.C486860J7k;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ACListenerS158S0100000_24;
import Y.AObserverS185S0200000_24;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.sidebar.ability.ISidebarUserGuideAbility;
import com.ss.android.ugc.aweme.sidebar.components.protocol.SideBarScope;
import com.ss.android.ugc.feed.platform.metric.IDeviceInfoService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class SidebarUserGuideAssem extends UIContentAssem implements ISidebarUserGuideAbility, InterfaceC737790Swr {
    public final SidebarUserGuideAssem LLIZLLLIL = this;
    public ViewGroup LLJ;
    public C1295960jpS LLJI;
    public boolean LLJIJIL;

    @Override // com.ss.android.ugc.aweme.sidebar.ability.ISidebarUserGuideAbility
    public final void Eh0() {
        this.LLJIJIL = false;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.ability.ISidebarUserGuideAbility
    public final void w51() {
        this.LLJIJIL = true;
        C1295960jpS c1295960jpS = this.LLJI;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C786410Ut5.LJLLLLLL(8, viewGroup);
        }
    }

    @Override // com.ss.android.ugc.aweme.sidebar.ability.ISidebarUserGuideAbility
    public final void dismiss() {
        C1295960jpS c1295960jpS = this.LLJI;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C786410Ut5.LJLLLLLL(8, viewGroup);
        }
        C1580440rEI.LIZ.getClass();
        ((Keva) C1580440rEI.LIZIZ.getValue()).storeBoolean(C1580440rEI.LIZIZ("sidebar_not_shown"), false);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SideBarScope.class}).unbindAbility(this.LLIZLLLIL, ISidebarUserGuideAbility.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View viewLJLLLL;
        ViewGroup viewGroup;
        int iLIZ;
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AppCompatTextView appCompatTextView;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C197039127h c197039127h;
        C1295960jpS c1295960jpS;
        ViewStub viewStub;
        super.onViewCreated(view);
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewStub) && (viewStub = (ViewStub) viewLJJIJL) != null) {
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        } else {
            viewLJLLLL = null;
        }
        if (viewLJLLLL instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewLJLLLL;
        } else {
            viewGroup = null;
        }
        this.LLJ = viewGroup;
        if (viewGroup != null && (c1295960jpS = (C1295960jpS) viewGroup.findViewById(R.id.vb7)) != null) {
            if (C960203pA.LIZIZ(c1295960jpS.getContext())) {
                if (C426750GoL.LIZLLL(c1295960jpS.getContext())) {
                    c1295960jpS.setAnimation(R.raw.tux_lottie_tux_gestures_with_device_tt_swipe_left_device);
                } else {
                    c1295960jpS.setAnimation(R.raw.tux_lottie_tux_gestures_with_device_tt_swipe_right_device);
                }
            } else if (C426750GoL.LIZLLL(c1295960jpS.getContext())) {
                c1295960jpS.setAnimation(R.raw.tux_lottie_tux_gestures_with_device_tt_swipe_left_device_dark);
            } else {
                c1295960jpS.setAnimation(R.raw.tux_lottie_tux_gestures_with_device_tt_swipe_right_device_dark);
            }
            c1295960jpS.setRepeatCount(-1);
            this.LLJI = c1295960jpS;
        }
        ViewGroup viewGroup2 = this.LLJ;
        if (viewGroup2 != null && (c197039127h = (C197039127h) viewGroup2.findViewById(R.id.vb4)) != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS158S0100000_24(this, 53));
        }
        IDeviceInfoService iDeviceInfoService = (IDeviceInfoService) PluggableExtentionKt.pluggableSpi$default(IDeviceInfoService.class, false, false, false, 14, null);
        if (iDeviceInfoService != null) {
            iLIZ = iDeviceInfoService.LIZ();
        } else {
            iLIZ = 0;
        }
        if ((iLIZ >> 1) == 1) {
            C1295960jpS c1295960jpS2 = this.LLJI;
            if (c1295960jpS2 != null) {
                c1295960jpS2.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                c1295960jpS2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                ViewGroup.LayoutParams layoutParams = c1295960jpS2.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                }
            }
            ViewGroup viewGroup3 = this.LLJ;
            if (viewGroup3 != null && (appCompatTextView = (AppCompatTextView) viewGroup3.findViewById(R.id.vb5)) != null) {
                appCompatTextView.setTextSize(1, 14.0f);
            }
            ViewGroup viewGroup4 = this.LLJ;
            if (viewGroup4 != null && (viewFindViewById = viewGroup4.findViewById(R.id.vb6)) != null) {
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                }
            }
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19egLIZ);
            LifecycleOwner lifecycleOwner = c19egLIZ;
            if (fragmentLJI != null) {
                lifecycleOwner = fragmentLJI;
            }
            scrollSwitchStateManagerLIZIZ.HQ2(lifecycleOwner, new AObserverS185S0200000_24(scrollSwitchStateManagerLIZIZ, this, 5));
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SideBarScope.class}).bindAbility(this.LLIZLLLIL, ISidebarUserGuideAbility.class);
    }
}
