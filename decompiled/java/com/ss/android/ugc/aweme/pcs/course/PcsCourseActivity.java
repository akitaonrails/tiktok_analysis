package com.ss.android.ugc.aweme.pcs.course;

import X.AbstractActivityC484150Iyj;
import X.C03H5;
import X.C0DHG;
import X.C0I27;
import X.C0I28;
import X.C0JH1;
import X.C0JHA;
import X.C0JHC;
import X.C0JHF;
import X.C0JIA;
import X.C0TVI;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C14K9;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EH;
import X.C2097608Jq;
import X.C2173931A6d;
import X.C299020Bno;
import X.C335910DEv;
import X.C338530DOx;
import X.C452070Ho5;
import X.C489110JGb;
import X.C580740Mq8;
import X.C632670Orh;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C985403tE;
import X.EnumC335920DEw;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC489200JGk;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.provider.impl.GScope;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.api.ui.IPcsCourseActivityAbility;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementFragment;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseVideoSortFragment;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementFragmentV2;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.pcs.course.musicpeelpage.ui.PcsCourseMusicPeelFragment;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS657S0100000_8;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseActivity extends AbstractActivityC484150Iyj implements InterfaceC724530SbT, IPcsCourseActivityAbility {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvHELIOSOmEwJzA+Oip9GCY/CiAmOjYpCCwnITMlPTY=";
    public Fragment LL;
    public final C736950SvV LLILLJJLI;
    public C580740Mq8 LLILLL;
    public int LLILZ;
    public C0JHC LLILZIL;
    public final C736950SvV LLILZLL;

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity
    public final boolean isDarkModeSupported() {
        return true;
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC484150Iyj, X.InterfaceC20573715ex
    public final boolean K6() {
        return this.LLILZ != 1;
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.api.ui.IPcsCourseActivityAbility
    public final void L70() {
        PcsCourseVideoSortFragment pcsCourseVideoSortFragment = new PcsCourseVideoSortFragment();
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        Fragment fragment = this.LL;
        if (fragment == null) {
            return;
        }
        c19ehLJIIJ.LJIILL(fragment);
        c19ehLJIIJ.LIZIZ(R.id.nwh, pcsCourseVideoSortFragment);
        c19ehLJIIJ.LJII(null);
        c19ehLJIIJ.LJIIIZ();
    }

    public final PcsCourseManageVM LLLLZIL() {
        return (PcsCourseManageVM) this.LLILLJJLI.getValue();
    }

    public final C0JHC LLLLZLL() {
        if (this.LLILZIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
            this.LLILZIL = interfaceC1555100qZQLIZIZ != null ? (C0JHC) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILZIL;
    }

    @Override // X.AbstractActivityC484150Iyj, X.InterfaceC20573715ex
    public final boolean wy() {
        return this.LLILZ != 1;
    }

    public PcsCourseActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseManageVM.class);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(119);
        C0I27 c0i27 = new C0I27(this);
        C0I28 c0i28 = new C0I28(this);
        C338530DOx c338530DOx = new C338530DOx(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILLJJLI = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS237S0000000_7, c0i27, c0i28, c338530DOx);
        this.LLILZLL = new C736950SvV(C13LE.LIZ(PcsVideoEditVM.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(120), new C0I27(this), new C0I28(this), new C338530DOx(this));
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Configuration configuration;
        Resources resources = getResources();
        Integer numValueOf = null;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            numValueOf = Integer.valueOf(configuration.orientation);
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            setRequestedOrientation(1);
            return;
        }
        if (getSupportFragmentManager().LJJLIIIIJ() > 1) {
            getSupportFragmentManager().LJLLILLLL();
            return;
        }
        for (Object obj : LLLLZIL().getState().LLILLL.LIZ) {
            InterfaceC489200JGk interfaceC489200JGk = (InterfaceC489200JGk) obj;
            if (interfaceC489200JGk.LJIIIIZZ() == C0JH1.UPLOAD_IN_PROGRESS || interfaceC489200JGk.LJIIIIZZ() == C0JH1.UPLOAD_SUCCESS_NOT_PUBLISHED_TO_COURSE) {
                if (obj != null) {
                    if (!C0DHG.LIZ() || C1388190mED.LIZ(this) == null) {
                        C1397580mTM c1397580mTM = new C1397580mTM(this);
                        c1397580mTM.LIZ(2131855799);
                        c1397580mTM.LJII = false;
                        C985403tE.LIZ(c1397580mTM, new AwS586S0100000_7(this, 567));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    } else {
                        C632670Orh.LIZIZ(this, new C19719212De(1675303282, new AwS657S0100000_8(this, 14), true));
                    }
                    C489110JGb.LIZJ(LLLLZIL().zQ2(), "", "show");
                    return;
                }
                finish();
            }
        }
        finish();
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C580740Mq8 c580740Mq8 = this.LLILLL;
        if (c580740Mq8 != null) {
            LocalBroadcastManager.LIZ(this).LIZLLL(c580740Mq8);
        }
        this.LLILLL = null;
        GScope gScope = GScope.LL;
        C1554960qZC.LIZLLL(gScope, C0JHC.class, null);
        C1558520qew.LJIIJJI(gScope, IPcsCourseActivityAbility.class, null);
        if (isFinishing()) {
            C0JHA.LIZIZ.setValue(C2097608Jq.LJ());
            synchronized (C0JHA.LIZLLL) {
                try {
                    C0JHA.LIZJ.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            synchronized (C0JHA.LJFF) {
                try {
                    ((LinkedHashMap) C0JHA.LJ).clear();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
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

    public static Bundle LLLLZI(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.AbstractActivityC484150Iyj, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C0JHF.LIZ(this, motionEvent, Collections.singletonList("pcs_managed_keyboard"));
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String string;
        long j;
        int i2;
        Fragment pcsCourseManagementFragment;
        Integer numValueOf;
        String string2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity", "onCreate", true);
        Bundle bundleLLLLZI = LLLLZI(getIntent());
        if (bundleLLLLZI != null) {
            i = bundleLLLLZI.getInt("theme_config", 0);
        } else {
            i = 0;
        }
        this.LLILZ = i;
        if (i == 1) {
            getDelegate().LJJIIJ();
        }
        super.onCreate(bundle);
        C2173931A6d.LIZ(this);
        setContentView(R.layout.fxf);
        C14K9.LJIJJ(findViewById(R.id.nvx), new C0TVI() { // from class: X.0JHD
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                view.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                return c20246014Ju;
            }
        });
        View viewFindViewById = findViewById(R.id.nwh);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ext, this);
        if (numLIZJ != null) {
            viewFindViewById.setBackgroundColor(numLIZJ.intValue());
        }
        this.LLILLL = new C580740Mq8(this, 0);
        IntentFilter intentFilter = new IntentFilter("pcs_choose_video_extra_identifier");
        C580740Mq8 c580740Mq8 = this.LLILLL;
        if (c580740Mq8 != null) {
            LocalBroadcastManager.LIZ(this).LIZIZ(c580740Mq8, intentFilter);
        }
        GScope gScope = GScope.LL;
        C1558520qew.LJII(gScope, this, IPcsCourseActivityAbility.class, null, null);
        Bundle bundleLLLLZI2 = LLLLZI(getIntent());
        String str = "";
        if (bundleLLLLZI2 == null || (string = bundleLLLLZI2.getString("show_entrance")) == null) {
            string = "";
        }
        Bundle bundleLLLLZI3 = LLLLZI(getIntent());
        if (bundleLLLLZI3 != null && (string2 = bundleLLLLZI3.getString("previous_page")) != null) {
            str = string2;
        }
        Bundle bundleLLLLZI4 = LLLLZI(getIntent());
        long j2 = 0;
        if (bundleLLLLZI4 != null) {
            j = bundleLLLLZI4.getLong("anchor_id");
        } else {
            j = 0;
        }
        Bundle bundleLLLLZI5 = LLLLZI(getIntent());
        if (bundleLLLLZI5 != null) {
            j2 = bundleLLLLZI5.getLong("course_id");
        }
        Bundle bundleLLLLZI6 = LLLLZI(getIntent());
        if (bundleLLLLZI6 != null) {
            i2 = bundleLLLLZI6.getInt("ui_version");
        } else {
            i2 = 0;
        }
        C1554960qZC.LIZ(gScope, new C0JHC(string, str, Long.valueOf(j), Long.valueOf(j2), i2), C0JHC.class, "source_default_key");
        if (bundle == null) {
            C0JHC c0jhcLLLLZLL = LLLLZLL();
            if (c0jhcLLLLZLL != null && (numValueOf = Integer.valueOf(c0jhcLLLLZLL.LLILZIL)) != null && numValueOf.intValue() != 0 && numValueOf.intValue() == 1) {
                pcsCourseManagementFragment = new PcsCourseManagementFragmentV2();
            } else {
                pcsCourseManagementFragment = new PcsCourseManagementFragment();
            }
            this.LL = pcsCourseManagementFragment;
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            Fragment fragment = this.LL;
            if (fragment == null) {
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity", "onCreate", false);
                return;
            } else {
                c19ehLJIIJ.LJIJ(R.id.nwh, fragment, null);
                c19ehLJIIJ.LJII(null);
                c19ehLJIIJ.LJIIIZ();
            }
        } else {
            this.LL = getSupportFragmentManager().LJJJJZ(R.id.nwh);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity", "onCreate", false);
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

    @Override // com.ss.android.ugc.aweme.pcs.course.api.ui.IPcsCourseActivityAbility
    public final void O52(long j, InterfaceC489200JGk interfaceC489200JGk) {
        String str;
        long jLongValue;
        long jLongValue2;
        Long l;
        Long l2;
        C0JIA c0jia = PcsCourseMusicPeelFragment.LLJJIII;
        C0JHC c0jhcLLLLZLL = LLLLZLL();
        if (c0jhcLLLLZLL == null || (str = c0jhcLLLLZLL.LLILLL) == null) {
            str = "";
        }
        C0JHC c0jhcLLLLZLL2 = LLLLZLL();
        if (c0jhcLLLLZLL2 != null && (l2 = c0jhcLLLLZLL2.LLILLJJLI) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        C0JHC c0jhcLLLLZLL3 = LLLLZLL();
        if (c0jhcLLLLZLL3 != null && (l = c0jhcLLLLZLL3.LL) != null) {
            jLongValue2 = l.longValue();
        } else {
            jLongValue2 = 0;
        }
        PcsCourseMusicPeelFragment pcsCourseMusicPeelFragmentLIZ = C0JIA.LIZ(c0jia, str, jLongValue, j, jLongValue2, null, interfaceC489200JGk, 16);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        Fragment fragment = this.LL;
        if (fragment == null) {
            return;
        }
        c19ehLJIIJ.LJIILL(fragment);
        c19ehLJIIJ.LIZIZ(R.id.nwh, pcsCourseMusicPeelFragmentLIZ);
        c19ehLJIIJ.LJII(null);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
