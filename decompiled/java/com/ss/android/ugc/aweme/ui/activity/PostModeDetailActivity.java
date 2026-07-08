package com.ss.android.ugc.aweme.ui.activity;

import X.C01GW;
import X.C0I27;
import X.C0I28;
import X.C0SQX;
import X.C0SRK;
import X.C0SRW;
import X.C0SRX;
import X.C0SRZ;
import X.C0SSR;
import X.C0TVI;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13LE;
import X.C14K9;
import X.C1697810uHb;
import X.C199Y;
import X.C19EG;
import X.C20629915o1;
import X.C263250ATj;
import X.C299020Bno;
import X.C335910DEv;
import X.C338530DOx;
import X.C452070Ho5;
import X.C452501pT;
import X.C717470SCj;
import X.C721090SQh;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC214902198i;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeDetailActivity extends C199Y implements C0SRX {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAlZy4wHELIOSPCw6IDsqZhUjOjseJyEpDSonKSwgCCwnITMlPTY=";
    public C0SSR LL;
    public C0SRZ LLILLJJLI;
    public PostModeDetailParams LLILLL;
    public String LLILZIL;
    public boolean LLIZLLLIL;
    public View LLJI;
    public boolean LLJILJILJ;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 964));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 962));
    public final C736950SvV LLIZ = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), new AwS555S0100000_11((C19EG) this, 1462), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(640), new C0I27(this), new C0I28(this), new C338530DOx(this));
    public boolean LLJ = true;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(217));
    public final Class<? extends InterfaceC214902198i> LLJILJIL = PostModeDetailRootFragment.class;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 963));

    @Override // X.C0SRX
    public final void ft() {
        this.LLJ = false;
    }

    @Override // X.C0OGM
    public final int getPageType() {
        return 0;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean isDelegateFragmentManager() {
        return true;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        boolean zLJI = MethodIDManager.LJI(72038);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onStart", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0SRX
    public final C0SSR FO() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.view_pager);
            this.LL = (C0SSR) callbackFindViewById;
        }
        return (C0SSR) callbackFindViewById;
    }

    @Override // X.C0SRX
    public final CommentContextSource GL() {
        return (CommentContextSource) this.LLJIJIL.getValue();
    }

    @Override // X.C0SRX
    public final PhotoSharedViewModel LA() {
        return (PhotoSharedViewModel) this.LLIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLZL() {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity.LLLLLZL():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZI() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.model.PostModeDetailParams r3 = r4.LLILLL
            r2 = 1
            r1 = 0
            if (r3 == 0) goto L34
            boolean r0 = r3.enableAnimSimple
            if (r0 != r2) goto L1e
            r0 = 494(0x1ee, float:6.92E-43)
            kotlin.jvm.internal.AFwS243S0000000_11 r0 = kotlin.jvm.internal.AFwS243S0000000_11.get$arr$(r0)
            r4.activityConfiguration(r0)
        L13:
            kotlin.jvm.internal.AwS590S0100000_11 r1 = new kotlin.jvm.internal.AwS590S0100000_11
            r0 = 280(0x118, float:3.92E-43)
            r1.<init>(r4, r0)
            r4.activityConfiguration(r1)
            return
        L1e:
            boolean r0 = r3.useSwipeEnterAnim
            if (r0 != r2) goto L34
            boolean r0 = r3.enableScale
            if (r0 == r2) goto L34
            boolean r0 = r3.enableAnimDegrade
            if (r0 == r2) goto L34
            r0 = 495(0x1ef, float:6.94E-43)
            kotlin.jvm.internal.AFwS243S0000000_11 r0 = kotlin.jvm.internal.AFwS243S0000000_11.get$arr$(r0)
            r4.activityConfiguration(r0)
            goto L13
        L34:
            X.C1389600mGU.LIZIZ(r4)     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3c:
            r4.overridePendingTransition(r1, r1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity.LLLLZI():void");
    }

    @Override // X.C0SRX
    public final View Nd() {
        return this.LLIZLLLIL ? findViewById(R.id.tya) : findViewById(R.id.rk3);
    }

    @Override // X.C0SRX
    public final PostModeTimeLoggerViewModel SJ() {
        return (PostModeTimeLoggerViewModel) this.LLILZLL.getValue();
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        SAFTikTokFragment sAFTikTokFragment;
        if (!this.LLIZLLLIL) {
            C0SRW.LJIIIIZZ(this);
            super.finish();
        } else {
            if (this.LLJILJILJ) {
                super.finish();
                return;
            }
            this.LLJILJILJ = true;
            InterfaceC214902198i interfaceC214902198iLIZ = C20629915o1.LIZ(this);
            if (!(interfaceC214902198iLIZ instanceof PostModeDetailRootFragment) || (sAFTikTokFragment = (SAFTikTokFragment) interfaceC214902198iLIZ) == null) {
                return;
            }
            sAFTikTokFragment.finish();
        }
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean getUseRootFragmentForPageCallbacks() {
        return ((Boolean) this.LLJILLL.getValue()).booleanValue();
    }

    @Override // X.C0SRX
    public final PostModePageViewModel getViewModel() {
        return (PostModePageViewModel) this.LLILZ.getValue();
    }

    @Override // X.C199Y, X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.LLIZLLLIL) {
            super.onBackPressed();
        } else {
            C0SRW.LJFF(this);
        }
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onResume", true);
        super.onResume();
        if (this.LLIZLLLIL) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onResume", false);
            return;
        }
        C0SQX c0sqx = SJ().LL;
        c0sqx.getClass();
        c0sqx.LIZ = Long.valueOf(System.currentTimeMillis());
        getViewModel().LLJJIII.setValue(Unit.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onResume", false);
    }

    @Override // X.C0SRX
    public final boolean cw() {
        VideoItemParams videoItemParams = LA().LL;
        return Intrinsics.LJFF(videoItemParams != null ? videoItemParams.mEventType : null, "homepage_explore");
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean migrateDarkModeImplToFragment() {
        return LA().LLJILLL;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean migrateImmersiveBarImplToFragment() {
        return LA().LLJILLL;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.LLIZLLLIL) {
            return;
        }
        C0SRW.LJIIIZ(this);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
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
    }

    @Override // X.C0SRX
    public final PostModeDetailParams H() {
        return this.LLILLL;
    }

    @Override // X.C0SRX
    public final void LLLLLLIL() {
        C0SRW.LJ(this);
    }

    @Override // X.C0SRX
    public final void M9() {
        C0SRW.LIZ(this);
    }

    @Override // X.C0SRX
    public final C0SRZ N6() {
        return this.LLILLJJLI;
    }

    @Override // X.C0SRX
    public final void aL() {
        C0SRW.LJIIL(this);
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean getEnableSAF() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0SRX
    public final String getEnterFrom() {
        return this.LLILZIL;
    }

    @Override // X.C199Y
    public final Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return this.LLJILJIL;
    }

    @Override // X.C0SRX
    /* JADX INFO: renamed from: if */
    public final boolean mo33if() {
        return this.LLJ;
    }

    @Override // X.C0SRX
    public final void DP(PostModeDetailPageFragment postModeDetailPageFragment) {
        this.LLILLJJLI = postModeDetailPageFragment;
    }

    @Override // X.C0SRX
    public final void LI(PostModeDetailParams postModeDetailParams) {
        this.LLILLL = postModeDetailParams;
    }

    @Override // X.C199Y, X.C19GS, X.C19FO, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0SRW.LIZIZ(this, keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        Window window;
        View decorView;
        View viewFindViewById;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onCreate", true);
        String string = null;
        if (bundle != null) {
            string = bundle.getString("enter_from", "");
        }
        this.LLILZIL = string;
        C0SRK.LIZJ("activity_create");
        this.LLIZLLLIL = LA().LLJILLL;
        C721090SQh.LIZ.LIZLLL(LA().LLILZIL, LA().LLILLJJLI, "activity_create", Boolean.valueOf(this.LLIZLLLIL));
        if (this.LLIZLLLIL) {
            this.LLILLL = LA().LLILZIL;
            LLLLZI();
            super.onCreate(bundle);
            LLLLLZL();
            C717470SCj.LIZJ();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onCreate", false);
            return;
        }
        C0SRW.LJII(this);
        LLLLZI();
        super.onCreate(bundle);
        setContentView(R.layout.e_2);
        C0SRW.LJI(this);
        LLLLLZL();
        C717470SCj.LIZJ();
        if (Build.VERSION.SDK_INT >= 35 && (window = getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(android.R.id.content)) != null) {
            C14K9.LJIJJ(viewFindViewById, new C0TVI() { // from class: X.0SSg
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        C0SRK.LIZJ("activity_create_end");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onCreate", false);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        PostModeDetailParams postModeDetailParams = this.LLILLL;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C01GW c01gw = C263250ATj.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 2) {
            return;
        }
        super.onSaveInstanceState(bundle);
        if (((Number) c01gw.getValue()).intValue() == 1) {
            bundle.remove("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
    }

    public void setRootContainer(View view) {
        this.LLJI = view;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    @Override // X.C0SRX
    public final void vy(Context context) {
        C0SRW.LJIIJ(this, context);
    }

    @Override // X.C0SRX
    public final boolean FL(String str, String str2, String str3, PostModeDetailParams postModeDetailParams) {
        return C0SRW.LJIILJJIL(str, str2, str3, postModeDetailParams);
    }
}
