package com.ss.android.ugc.aweme.pcs.course;

import X.AbstractActivityC484150Iyj;
import X.C03H5;
import X.C0I27;
import X.C0I28;
import X.C0JHF;
import X.C0JHL;
import X.C0JHY;
import X.C0TVI;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13LE;
import X.C1443310nf7;
import X.C1445760nj4;
import X.C14K9;
import X.C1554960qZC;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EH;
import X.C2173931A6d;
import X.C2217381BqS;
import X.C299020Bno;
import X.C335910DEv;
import X.C338530DOx;
import X.C452070Ho5;
import X.C489400JHe;
import X.C489550JHt;
import X.C489560JHu;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC335920DEw;
import X.EnumC489360JHa;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.provider.impl.GScope;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui.PcsCourseVideoEditFragment;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.ui.PcsCourseVideoPublishFragment;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoPublishVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoReEditVm;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsVideoPublishActivity extends AbstractActivityC484150Iyj implements InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvOmEwHELIOSJzA+Oip9GCY/HyY3LSocPC0/ITYkCCwnITMlPTY=";
    public final C736950SvV LL;
    public final C736950SvV LLILLJJLI;
    public C489400JHe LLILLL;

    @Override // X.AbstractActivityC484150Iyj, X.InterfaceC20573715ex
    public final boolean K6() {
        return true;
    }

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsVideoPublishActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsVideoPublishActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsVideoPublishActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsVideoPublishActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsVideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC484150Iyj, X.InterfaceC20573715ex
    public final boolean wy() {
        return true;
    }

    public PcsVideoPublishActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsVideoEditVM.class);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(122);
        C0I27 c0i27 = new C0I27(this);
        C0I28 c0i28 = new C0I28(this);
        C338530DOx c338530DOx = new C338530DOx(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LL = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS237S0000000_7, c0i27, c0i28, c338530DOx);
        this.LLILLJJLI = new C736950SvV(C13LE.LIZ(PcsVideoReEditVm.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(123), new C0I27(this), new C0I28(this), new C338530DOx(this));
        C13LE.LIZ(PcsVideoPublishVM.class);
        AFwS237S0000000_7.get$arr$(124);
        new C0I27(this);
        new C0I28(this);
        new C338530DOx(this);
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().LJJLIIIIJ() > 1) {
            getSupportFragmentManager().LJLLILLLL();
        } else {
            finish();
        }
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1554960qZC.LIZLLL(GScope.LL, C489400JHe.class, null);
        ((AssemViewModel) this.LL.getValue()).setState(AFwS237S0000000_7.get$arr$(362));
        PcsVideoReEditVm pcsVideoReEditVm = (PcsVideoReEditVm) this.LLILLJJLI.getValue();
        pcsVideoReEditVm.setState(new AwS586S0100000_7(pcsVideoReEditVm, 498));
        C1445760nj4.LIZ.getClass();
        C1445760nj4.LIZIZ = null;
        C1445760nj4.LIZJ = null;
        C1445760nj4.LIZLLL = null;
        C1445760nj4.LJ = null;
        C1445760nj4.LJFF = false;
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

    @Override // X.AbstractActivityC484150Iyj, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C0JHF.LIZ(this, motionEvent, Collections.singletonList("pcs_managed_keyboard"));
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        EnumC489360JHa enumC489360JHa;
        Bundle extras;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsVideoPublishActivity", "onCreate", true);
        super.onCreate(bundle);
        C2173931A6d.LIZ(this);
        setContentView(R.layout.fxg);
        C14K9.LJIJJ(findViewById(R.id.nvx), new C0TVI() { // from class: X.0JHh
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                view.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                return c20246014Ju;
            }
        });
        View viewFindViewById = findViewById(R.id.pyc);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ext, this);
        if (numLIZJ != null) {
            viewFindViewById.setBackgroundColor(numLIZJ.intValue());
        }
        if (bundle == null) {
            try {
                extras = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (extras == null) {
                serializable = null;
            } else {
                serializable = extras.getSerializable("video_publish_scene_key");
            }
            if (!(serializable instanceof EnumC489360JHa) || (enumC489360JHa = (EnumC489360JHa) serializable) == null) {
                enumC489360JHa = EnumC489360JHa.UNKNOWN;
            }
            GScope gScope = GScope.LL;
            C489400JHe c489400JHe = new C489400JHe();
            c489400JHe.LL = enumC489360JHa;
            C1554960qZC.LIZ(gScope, c489400JHe, C489400JHe.class, "source_default_key");
            int i = C0JHY.LIZ[enumC489360JHa.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new C1954807lC();
                    }
                } else {
                    PcsCourseVideoPublishFragment pcsCourseVideoPublishFragment = new PcsCourseVideoPublishFragment();
                    C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                    c19ehLJIIJ.LJIJ(R.id.pyc, pcsCourseVideoPublishFragment, null);
                    c19ehLJIIJ.LJII(null);
                    c19ehLJIIJ.LJIIIZ();
                }
            } else {
                C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LL.getValue(), new C2217381BqS() { // from class: X.0JHs
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C489550JHt) obj).LLILZ;
                    }
                }, null, new AwS621S0100000_7(this, 120), 6);
                PcsCourseVideoEditFragment pcsCourseVideoEditFragment = new PcsCourseVideoEditFragment();
                C19EH c19ehLJIIJ2 = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ2.LJIJ(R.id.pyc, pcsCourseVideoEditFragment, null);
                c19ehLJIIJ2.LJII(null);
                c19ehLJIIJ2.LJIIIZ();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pcs.course.PcsVideoPublishActivity", "onCreate", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        EnumC489360JHa enumC489360JHa;
        PublishModel publishModel;
        VideoPublishEditModel videoPublishEditModelLIZ;
        super.onActivityResult(i, i2, intent);
        C489400JHe c489400JHe = null;
        if (this.LLILLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C489400JHe.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                c489400JHe = (C489400JHe) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLL = c489400JHe;
        }
        C489400JHe c489400JHe2 = this.LLILLL;
        if (c489400JHe2 != null && (enumC489360JHa = c489400JHe2.LL) != null) {
            int i3 = C0JHY.LIZ[enumC489360JHa.ordinal()];
            if (i3 != 1) {
                if (i3 == 2 && (publishModel = ((C0JHL) ((AssemViewModel) this.LLILLJJLI.getValue()).getState()).LLILZIL) != null && (videoPublishEditModelLIZ = C489560JHu.LIZ(publishModel)) != null) {
                    C1443310nf7.LIZIZ.LJI(i, intent, videoPublishEditModelLIZ, new AwS408S0200000_7(this, videoPublishEditModelLIZ, 25));
                    return;
                }
                return;
            }
            VideoPublishEditModel videoPublishEditModel = ((C489550JHt) ((AssemViewModel) this.LL.getValue()).getState()).LLILLJJLI.LIZ;
            C1443310nf7.LIZIZ.LJI(i, intent, videoPublishEditModel, new AwS408S0200000_7(this, videoPublishEditModel, 24));
        }
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
