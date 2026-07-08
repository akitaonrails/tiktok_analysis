package com.ss.android.ugc.aweme.live;

import X.AbstractActivityC484150Iyj;
import X.AbstractC1387200mCc;
import X.C06W2;
import X.C0IEG;
import X.C0IKH;
import X.C0IL2;
import X.C1091720eW2;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1324720kZq;
import X.C14EU;
import X.C14K9;
import X.C1697630uHJ;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C19GS;
import X.C1C7U;
import X.C1CC2;
import X.C20736316Cj;
import X.C299020Bno;
import X.C335910DEv;
import X.C472280Ifa;
import X.C475360IkY;
import X.C475460Iki;
import X.C479740Irc;
import X.C479990Is1;
import X.C480290IsV;
import X.C484240Iys;
import X.C485720J3a;
import X.C521860KdM;
import X.C522010Kdb;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC21500319Cf;
import X.InterfaceC342470Dbh;
import X.InterfaceC362610EJn;
import X.InterfaceC471660Iea;
import X.InterfaceC479770Irf;
import X.InterfaceC479780Irg;
import X.InterfaceC479830Irl;
import X.InterfaceC484050IyZ;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS76S0200000_7;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveInflaterHookSetting;
import com.bytedance.android.livesdk.livesetting.other.AppLogFlushOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TopLiveLoadingAnimTypeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TopLiveNewLoadingStyleBackgroundSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC21500319Cf(featureKey = "tiktok_live_play")
public class LivePlayActivity extends AbstractActivityC484150Iyj implements InterfaceC479780Irg<Intent>, InterfaceC471660Iea {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZiklPyp9BCw6LB8/KTwNKjs6Piw4MA==";
    public final C479740Irc LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public int LLILZLL;

    @Override // X.InterfaceC479780Irg
    public final Context Jh() {
        return this;
    }

    @Override // X.InterfaceC479780Irg
    public final C19GS U6() {
        return this;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC479780Irg
    public final LifecycleOwner xL() {
        return this;
    }

    @Override // X.C0IFS
    public final void KR() {
        this.LL.LJJIII();
    }

    @Override // X.C0IFX
    public final void LJLL() {
        C475460Iki c475460Iki = this.LL.LJJIFFI;
        if (c475460Iki != null) {
            c475460Iki.LIZIZ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        this.LL.LJIJJ(new ARunnableS107S0100000_7(this, 137));
    }

    @Override // X.InterfaceC479780Irg, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        this.LL.getClass();
        return "b4180";
    }

    @Override // X.InterfaceC471660Iea
    public final Fragment getCurrentFragment() {
        InterfaceC479770Irf interfaceC479770Irf = this.LL.LIZIZ;
        if (interfaceC479770Irf != null) {
            return interfaceC479770Irf.getCurrentFragment();
        }
        return null;
    }

    @Override // X.AbstractActivityC484150Iyj
    public final int getPageType() {
        this.LL.getClass();
        return 0;
    }

    @Override // android.app.Activity
    public final int getRequestedOrientation() {
        C479740Irc c479740Irc = this.LL;
        if (c479740Irc.LJJJJZ == -1) {
            c479740Irc.LJJJJZ = Integer.valueOf(super.getRequestedOrientation()).intValue();
        }
        return c479740Irc.LJJJJZ;
    }

    @Override // android.app.Activity
    public final boolean isInPictureInPictureMode() {
        this.LL.getClass();
        return LLZLI(this).booleanValue();
    }

    @Override // X.C0IFS
    public final C0IKH k6() {
        return this.LL.LJI;
    }

    @Override // X.C0IFX
    public final boolean lB() {
        C475460Iki c475460Iki = this.LL.LJJIFFI;
        return c475460Iki != null && TopLiveLoadingAnimTypeSetting.INSTANCE.getAnimType() > 0 && c475460Iki.LIZIZ;
    }

    @Override // X.InterfaceC479780Irg
    public final InterfaceC479830Irl<Intent> mK() {
        return new C480290IsV(this, true, null);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.LL.LJJIIZI(new ARunnableS107S0100000_7(this, 134));
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        this.LL.LJJIJL(new ARunnableS107S0100000_7(this, 132));
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", true);
        this.LL.LJJIJLIJ(new ARunnableS107S0100000_7(this, 136), false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onUserLeaveHint() {
        C479740Irc c479740Irc = this.LL;
        c479740Irc.getClass();
        LLLZ(this);
        C0IEG c0ieg = c479740Irc.LJFF;
        if (c0ieg != null) {
            c0ieg.LJLLLL();
        }
    }

    @Override // X.C0IFX
    public final boolean pa() {
        C1324720kZq c1324720kZq;
        C479740Irc c479740Irc = this.LL;
        C475460Iki c475460Iki = c479740Irc.LJJIFFI;
        return c475460Iki != null && (c1324720kZq = c475460Iki.LJ) != null && c1324720kZq.getVisibility() == 0 && TopLiveNewLoadingStyleBackgroundSetting.INSTANCE.getBackgroundShowType() == 1 && c479740Irc.LJJIFFI.LIZIZ;
    }

    @Override // X.C0IFS
    public final C472280Ifa q6() {
        return this.LL.LJII;
    }

    @Override // X.C0IFX
    public final void qd() {
        this.LL.LJJIFFI();
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return this.LL.LJIJJLI();
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(this.LL.hashCode());
    }

    public LivePlayActivity() {
        C475360IkY.LIZ.getClass();
        this.LL = new C479740Irc(this);
    }

    @Override // X.InterfaceC479780Irg
    public final FragmentManager GJ() {
        return getSupportFragmentManager();
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        boolean zLJI = MethodIDManager.LJI(72039);
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isLivePlayRootFragment(abstractC1387200mCc)) {
                C479990Is1.LIZ = true;
            }
        }
        if (!C479990Is1.LIZ) {
            C479990Is1.LIZIZ = false;
        }
        this.LL.LJJIJIIJIL(new ARunnableS107S0100000_7(this, 133));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        boolean zLJI = MethodIDManager.LJI(71631);
        this.LL.getClass();
        LLLZIL(this);
        AppLogFlushOptSetting.INSTANCE.backgroundFlush();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractActivityC484150Iyj, X.InterfaceC479780Irg
    public final void vQ() {
        super.vQ();
    }

    public static /* synthetic */ void LLLLZI(LivePlayActivity livePlayActivity) {
        livePlayActivity.getClass();
        C1C7U.LIZ("LivePlayActivity@c748.onResume$1L");
        super.onResume();
        C1C7U.LIZIZ("LivePlayActivity@c748.onResume$1L");
    }

    public static /* synthetic */ void LLLLZIL(LivePlayActivity livePlayActivity) {
        livePlayActivity.getClass();
        C1C7U.LIZ("LivePlayActivity@c748.onBackPressed$1L");
        super.onBackPressed();
        C1C7U.LIZIZ("LivePlayActivity@c748.onBackPressed$1L");
    }

    public static /* synthetic */ void LLLLZLL(LivePlayActivity livePlayActivity) {
        livePlayActivity.getClass();
        C1C7U.LIZ("LivePlayActivity@c748.finish$1L");
        super.finish();
        C1C7U.LIZIZ("LivePlayActivity@c748.finish$1L");
    }

    public static /* synthetic */ void LLLLZLLLI(LivePlayActivity livePlayActivity) {
        livePlayActivity.getClass();
        C1C7U.LIZ("LivePlayActivity@c748.onPause$1L");
        super.onPause();
        C1C7U.LIZIZ("LivePlayActivity@c748.onPause$1L");
    }

    public static /* synthetic */ void LLLZ(LivePlayActivity livePlayActivity) {
        livePlayActivity.getClass();
        C1C7U.LIZ("LivePlayActivity@c748.onUserLeaveHint$1L");
        super.onUserLeaveHint();
        C1C7U.LIZIZ("LivePlayActivity@c748.onUserLeaveHint$1L");
    }

    public static /* synthetic */ void LLLZIL(LivePlayActivity livePlayActivity) {
        livePlayActivity.getClass();
        C1C7U.LIZ("LivePlayActivity@c748.com_ss_android_ugc_aweme_live_LivePlayActivity__onStop$___twin___$1L");
        super.onStop();
        C1C7U.LIZIZ("LivePlayActivity@c748.com_ss_android_ugc_aweme_live_LivePlayActivity__onStop$___twin___$1L");
    }

    public static /* synthetic */ void LLLZZIL(LivePlayActivity livePlayActivity) {
        livePlayActivity.getClass();
        C1C7U.LIZ("LivePlayActivity@c748.onDestroy$1L");
        super.onDestroy();
        C1C7U.LIZIZ("LivePlayActivity@c748.onDestroy$1L");
    }

    public static /* synthetic */ Boolean LLZLI(LivePlayActivity livePlayActivity) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            if (super.isInPictureInPictureMode()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        livePlayActivity.getClass();
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LL.LJJIL, 0, interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LL.LJJIJLIJ).add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LL.LJJIJLIJ).remove(interfaceC484050IyZ);
    }

    @Override // X.C0IFX
    public final void T8(boolean z) {
        this.LL.LJJII();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.InterfaceC479780Irg
    public final void activityConfiguration(Function1<? super C06W2, Unit> function1) {
        super.activityConfiguration(function1);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.LL.LJJIL.remove(interfaceC362610EJn);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        C479740Irc c479740Irc = this.LL;
        c479740Irc.getClass();
        if (!LiveInflaterHookSetting.getEnable()) {
            return super.getSystemService(str);
        }
        try {
            if ("layout_inflater".equals(str) && !c479740Irc.LIZ.U6().isFinishing() && c479740Irc.LIZ.U6().getBaseContext() != null) {
                C485720J3a c485720J3a = c479740Irc.LJJI;
                if (c485720J3a != null) {
                    return c485720J3a;
                }
                LayoutInflater layoutInflater = (LayoutInflater) super.getSystemService(str);
                if (layoutInflater != null) {
                    c479740Irc.LJJI = new C485720J3a(layoutInflater);
                    if (C786410Ut5.Qd(layoutInflater) == null) {
                        C786410Ut5.Vd(layoutInflater, new C1091720eW2());
                    }
                    return c479740Irc.LJJI;
                }
            }
            return super.getSystemService(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("LiveHookLayoutInflater error", th);
            return super.getSystemService(str);
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.LL.LJJIL.add(interfaceC362610EJn);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        View view;
        super.onConfigurationChanged(configuration);
        if (LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) {
            C1697630uHJ.LJ(this);
        }
        if (configuration.orientation == 2 && (view = this.LLILLJJLI) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(72047);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onCreate", true);
        C479990Is1.LIZIZ = true;
        this.LL.LJJIJ(bundle, new ARunnableS76S0200000_7(this, bundle, 29));
        this.LL.LJJIJIIJI(true);
        if (Build.VERSION.SDK_INT >= 35) {
            this.LLILLJJLI = new View(this);
            this.LLILLL = new View(this);
            this.LLILZ = new View(this);
            this.LLILZIL = new View(this);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
            viewGroup.addView(this.LLILLJJLI, -1, 0);
            viewGroup.addView(this.LLILLL, -1, 0);
            viewGroup.addView(this.LLILZ, 0, -1);
            viewGroup.addView(this.LLILZIL, 0, -1);
            this.LLILLJJLI.setBackgroundColor(C20736316Cj.LIZIZ(com.zhiliaoapp.musically.R.attr.exg, this));
            this.LLILLL.setBackgroundColor(C20736316Cj.LIZIZ(com.zhiliaoapp.musically.R.attr.exg, this));
            this.LLILZ.setBackgroundColor(C20736316Cj.LIZIZ(com.zhiliaoapp.musically.R.attr.exg, this));
            this.LLILZIL.setBackgroundColor(C20736316Cj.LIZIZ(com.zhiliaoapp.musically.R.attr.exg, this));
            ((FrameLayout.LayoutParams) this.LLILLJJLI.getLayoutParams()).gravity = 48;
            ((FrameLayout.LayoutParams) this.LLILLL.getLayoutParams()).gravity = 80;
            ((FrameLayout.LayoutParams) this.LLILZ.getLayoutParams()).gravity = 8388611;
            ((FrameLayout.LayoutParams) this.LLILZIL.getLayoutParams()).gravity = 8388613;
            C14K9.LJIJJ(findViewById(R.id.content), new C522010Kdb(this, 2));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onCreate", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @C14EU
    public void onEvent(C484240Iys c484240Iys) {
        this.LL.onEvent(c484240Iys);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        this.LL.LJJIJIL(new C480290IsV(this, false, intent), intent, new C521860KdM(this, 11));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        this.LL.getClass();
        super.onPictureInPictureModeChanged(Boolean.valueOf(z).booleanValue());
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        this.LL.getClass();
        super.onRestoreInstanceState(bundle);
        C0IL2.LIZ.LIZJ(bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        this.LL.LJJIL(bundle, new C521860KdM(this, 12));
    }

    @Override // X.InterfaceC836750Ws5
    public final void setActivityResultListener(InterfaceC342470Dbh interfaceC342470Dbh) {
        this.LL.LJJIIZI = interfaceC342470Dbh;
    }

    @Override // X.C19FO, android.app.Activity
    public final void setRequestedOrientation(int i) {
        C479740Irc c479740Irc = this.LL;
        c479740Irc.getClass();
        super.setRequestedOrientation(Integer.valueOf(i).intValue());
        c479740Irc.LJJJJZ = i;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(com.zhiliaoapp.musically.R.style.ih);
        if (this.LL.LIZ.mK().getBooleanValue("smooth_enter_room")) {
            super.setTheme(Integer.valueOf(com.zhiliaoapp.musically.R.style.ae5).intValue());
        } else {
            super.setTheme(Integer.valueOf(com.zhiliaoapp.musically.R.style.ae4).intValue());
        }
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(com.zhiliaoapp.musically.R.style.a9t), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9u), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9v), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(com.zhiliaoapp.musically.R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(com.zhiliaoapp.musically.R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9u, true);
                } else {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9v, true);
                } else {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9y, true);
        }
    }

    public static /* synthetic */ void LLLLZLLIL(LivePlayActivity livePlayActivity, Bundle bundle) {
        livePlayActivity.getClass();
        C1C7U.LIZ("LivePlayActivity@c748.onCreate$1L");
        super.onCreate(bundle);
        C1C7U.LIZIZ("LivePlayActivity@c748.onCreate$1L");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Boolean boolValueOf;
        ArrayList<InterfaceC362610EJn> arrayList = this.LL.LJJIL;
        if (arrayList != null) {
            Iterator<InterfaceC362610EJn> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().onKeyDown(i, keyEvent)) {
                    boolValueOf = Boolean.TRUE;
                    break;
                }
            }
            boolValueOf = Boolean.valueOf(super.onKeyDown(Integer.valueOf(i).intValue(), keyEvent));
        } else {
            boolValueOf = Boolean.valueOf(super.onKeyDown(Integer.valueOf(i).intValue(), keyEvent));
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        C479740Irc c479740Irc = this.LL;
        c479740Irc.getClass();
        super.onActivityResult(Integer.valueOf(i).intValue(), Integer.valueOf(i2).intValue(), intent);
        Iterator it2 = ((ArrayList) c479740Irc.LJJIJLIJ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        InterfaceC342470Dbh interfaceC342470Dbh = c479740Irc.LJJIIZI;
        if (interfaceC342470Dbh == null) {
            return;
        }
        interfaceC342470Dbh.onActivityResult(i, i2, intent);
    }
}
