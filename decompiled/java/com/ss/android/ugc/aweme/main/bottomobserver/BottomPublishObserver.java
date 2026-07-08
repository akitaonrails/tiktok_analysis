package com.ss.android.ugc.aweme.main.bottomobserver;

import X.C01GW;
import X.C090F;
import X.C099F;
import X.C0DMM;
import X.C0S4U;
import X.C1388190mED;
import X.C1409905fV;
import X.C1442410ndf;
import X.C14EU;
import X.C1620910sHZ;
import X.C19EG;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2344009Gk;
import X.C343710Ddh;
import X.C452501pT;
import X.C486860J7k;
import X.C581630MrZ;
import X.C622680Oba;
import X.C680080Qly;
import X.C740740T3w;
import X.C786410Ut5;
import X.C791460V2y;
import X.C799570VYd;
import Y.ARunnableS104S0000000_31;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS92S0000000_13;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.setting.performance.BottomPublishClickDebounceOpt;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes32.dex */
public final class BottomPublishObserver implements View.OnClickListener, GenericLifecycleObserver {
    public final Context LL;
    public final C19EG LLILLJJLI;
    public final TabChangeManager LLILLL;
    public final HomePageDataViewModel LLILZ;
    public long LLILZIL;
    public CreativityToolsPluginUpdater LLILZLL;
    public final IHomePageService LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public final C099F LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r11 = this;
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r5 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r5 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r5 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r5
            r3 = 0
            if (r5 == 0) goto La1
            X.19EG r4 = r11.LLILLJJLI
            X.01GW r0 = X.C0B6O.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != 0) goto L9b
            java.lang.String r1 = "HOME"
            java.lang.String r0 = "FRIENDS_TAB"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r1 = X.C1697810uHb.LJIIJJI(r0)
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r11.LLILLL
            java.lang.String r0 = r0.CQ2()
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L9b
            java.lang.String r1 = "homepage_explore"
            java.lang.String r0 = "Shop"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r1 = X.C1697810uHb.LJIIJJI(r0)
            X.19EG r0 = r11.LLILLJJLI
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZJ(r0)
            if (r0 == 0) goto L99
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = X.C0DMM.LIZ(r0)
            if (r0 == 0) goto L99
            java.lang.String r0 = r0.Ct0()
        L58:
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 != 0) goto L9b
            r1 = 0
        L5f:
            java.lang.String r0 = "direct_shoot"
            boolean r0 = r5.LIZJ(r4, r0, r1)
            if (r0 != r2) goto La1
            X.01GW r0 = X.C280960Azm.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9d
            X.0N0Y r0 = X.C1483410ohn.LJLJJI()
            X.0oiD r0 = r0.LJIILL()
            X.0ois r0 = r0.getPlayState()
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L9d
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.0XnF r1 = new X.0XnF
            r1.<init>(r11, r3)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            return
        L99:
            r0 = r3
            goto L58
        L9b:
            r1 = 1
            goto L5f
        L9d:
            r11.LIZJ(r6)
            return
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver.LIZ():void");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory() {
        CreativityToolsPluginUpdater creativityToolsPluginUpdater = this.LLILZLL;
        if (creativityToolsPluginUpdater != null && creativityToolsPluginUpdater.LIZ) {
            creativityToolsPluginUpdater.LIZ = false;
        }
        C622680Oba.LIZLLL(this);
    }

    public BottomPublishObserver(Context context) {
        HomeTabAbility homeTabAbilityLIZ;
        this.LL = context;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        this.LLILLJJLI = c19egLIZIZ;
        this.LLILLL = C343710Ddh.LIZ(c19egLIZIZ);
        C486860J7k.LIZIZ(c19egLIZIZ);
        this.LLILZ = C680080Qly.LIZIZ(c19egLIZIZ);
        this.LLIZ = (IHomePageService) ServiceManager.get().getService(IHomePageService.class);
        this.LLJ = -1L;
        this.LLJI = C090F.LIZIZ();
        this.LLJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(227));
        ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJFF(this);
        C622680Oba.LIZJ(this);
        MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(this.LLILLJJLI);
        if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
            homeTabAbilityLIZ.UC1(new C1620910sHZ(this, 17));
        }
        this.LLJILJIL = true;
    }

    public final void LIZIZ(String str) {
        String groupId;
        ISpecialPlusService iSpecialPlusServiceSpecialPlusService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("prop_id", iSpecialPlusServiceSpecialPlusService.getEffectId());
        c2344009Gk.LJIIIIZZ("template_id", iSpecialPlusServiceSpecialPlusService.getEffectId());
        if (C740740T3w.LJFF(this.LLILLJJLI) != null) {
            Aweme awemeLJFF = C740740T3w.LJFF(this.LLILLJJLI);
            if (awemeLJFF != null) {
                groupId = awemeLJFF.getGroupId();
            } else {
                groupId = null;
            }
            c2344009Gk.LJFF("group_id", groupId);
        }
        C20684815ws.LJIILLIIL("special_icon_click", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0367  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v110, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(boolean r52) {
        /*
            Method dump skipped, instruction units count: 1826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver.LIZJ(boolean):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C791460V2y.LIZ = true;
        if (C1442410ndf.LIZ() > 0) {
            boolean z = C1409905fV.LIZ;
            C786410Ut5.h4().execute(new ARunnableS104S0000000_31(0));
            C786410Ut5.h4().execute(new ARunnableS92S0000000_13(4));
        }
        C1409905fV.LIZ = true;
        C1409905fV.LIZIZ = true;
        BottomPublishClickDebounceOpt.LIZ.getClass();
        C01GW c01gw = BottomPublishClickDebounceOpt.LIZJ;
        if (((BottomPublishClickDebounceOpt.ClickDebounceConfig) c01gw.getValue()).isOpen) {
            if (this.LLJILJIL) {
                this.LLJILJIL = false;
                ARunnableS128S0100000_28 aRunnableS128S0100000_28 = new ARunnableS128S0100000_28(this, 47);
                long j = ((BottomPublishClickDebounceOpt.ClickDebounceConfig) c01gw.getValue()).debounceInterval;
                int i = C2187451AjH.LIZ;
                C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), aRunnableS128S0100000_28);
                LIZ();
                return;
            }
            return;
        }
        LIZ();
    }

    @C14EU
    public final void onVideoPlayerEvent(C581630MrZ c581630MrZ) {
        if (c581630MrZ.LIZ == 4 && this.LLIZLLLIL) {
            this.LLJI.LJJLIIIJILLIZJL(Unit.LIZ);
            IAVMobService aVMobService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", "tool_performance_pause_feed_video_player");
            c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJ, "totaltime");
            aVMobService.onEventV3("tool_performance_operation_cost_time", c2344009Gk.LIZ);
            this.LLIZLLLIL = false;
            LIZJ(true);
        }
    }
}
