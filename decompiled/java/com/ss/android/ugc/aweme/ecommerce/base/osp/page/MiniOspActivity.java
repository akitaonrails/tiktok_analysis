package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.AbstractActivityC1743740vTg;
import X.AnonymousClass0317;
import X.C034S;
import X.C03H5;
import X.C0ZP4;
import X.C1120604Zw;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C128Y;
import X.C1308910kAL;
import X.C13LE;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C1AF0;
import X.C1AQS;
import X.C2217381BqS;
import X.C2341109Fh;
import X.C299020Bno;
import X.C335910DEv;
import X.C452070Ho5;
import X.C703302op;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C921103ir;
import X.EnumC1740810vOx;
import X.EnumC335920DEw;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC988203tg;
import X.InterfaceC988703tl;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniOspActivity extends AbstractActivityC1743740vTg implements InterfaceC1740760vOs, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvHELIOSLGExKTYpZyAgOGs8KCg2ZgglJyYcOzUNKjs6Piw4MA==";
    public Integer LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AFwS228S0000000_1 LLIZ;
    public long LLIZLLLIL;
    public Fragment LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MiniOspActivity.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/MiniOspViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "order_submit";
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity", "onStart", true);
        super.onStart();
        C128Y c128y = this.LLJ;
        if (c128y != null && (c128y instanceof InterfaceC988203tg)) {
            ((InterfaceC988203tg) c128y).onVisible();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final MiniOspViewModel LLLLZLLLI() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (MiniOspViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.ORDER_SUBMIT_PAGE.getPageCode();
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C921103ir.LIZ.getClass();
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("clear errorCodeSDK");
        C921103ir.LIZIZ = null;
        C921103ir.LIZJ = false;
        C921103ir.LIZLLL = false;
        super.onDestroy();
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity", "onResume", true);
        super.onResume();
        this.LLIZLLLIL = SystemClock.elapsedRealtime();
        ModuleManager moduleManager = LLLLZLLLI().LLLFFI;
        if (moduleManager != null) {
            ModuleManager.LJI(moduleManager, "t_resume_end", null, false, 6);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity", "onResume", false);
    }

    public MiniOspActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MiniOspViewModel.class);
        this.LLILZLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS545S0100000_1(c19719912DlLIZ, 861), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 862), AFwS228S0000000_1.get$arr$(137));
        this.LLIZ = AFwS228S0000000_1.get$arr$(135);
        this.LLIZLLLIL = -1L;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int iLJJLIIIIJ = getSupportFragmentManager().LJJLIIIIJ();
        if (iLJJLIIIIJ <= 0) {
            super.onBackPressed();
            return;
        }
        C128Y c128yLJJJJZI = getSupportFragmentManager().LJJJJZI(getSupportFragmentManager().LJJLI(iLJJLIIIIJ - 1).getName());
        if ((c128yLJJJJZI instanceof InterfaceC988703tl) && ((InterfaceC988703tl) c128yLJJJJZI).onBackPressed()) {
            return;
        }
        if (iLJJLIIIIJ == 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        super.onPause();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).addLiveDuration(SystemClock.elapsedRealtime() - this.LLIZLLLIL);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        C128Y c128y = this.LLJ;
        if (c128y != null && (c128y instanceof InterfaceC988203tg)) {
            ((InterfaceC988203tg) c128y).Z0();
        }
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

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public final void LLLZ(HashMap<String, Object> map) {
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        if (Intrinsics.LJFF(map.get("enter_from_info"), "goods_search") || Intrinsics.LJFF(map.get("enter_from_info"), "store_tab_search")) {
            HashMap mapLJ = C1741890vQh.LJ("entrance_info", map);
            if (mapLJ != null) {
                obj = mapLJ.get("search_id");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (C703302op.LIZ(str)) {
                if (mapLJ != null) {
                    obj2 = mapLJ.get("search_result_id");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str2 = (String) obj2;
                } else {
                    str2 = null;
                }
                if (C703302op.LIZ(str2)) {
                    if (mapLJ != null) {
                        obj3 = mapLJ.get("search_entrance");
                    } else {
                        obj3 = null;
                    }
                    if (obj3 instanceof String) {
                        str3 = (String) obj3;
                    } else {
                        str3 = null;
                    }
                    if (C703302op.LIZ(str3)) {
                        return;
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (mapLJ != null) {
                for (Map.Entry entry : mapLJ.entrySet()) {
                    Object value = entry.getValue();
                    if ((value instanceof String) && value != null) {
                        linkedHashMap.put(entry.getKey(), value);
                    }
                }
            }
            C1AF0.LIZLLL("search_params_missing", linkedHashMap);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.LLIZ.getClass();
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x032e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x033f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instruction units count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1AF0.LIZJ("OSP statistic page rebuild");
        String strLJIIIIZZ = null;
        C786410Ut5.LJJJI("requestParams", C1741890vQh.LJIIIIZZ(new OrderSubmitRequestParam(null, LLLLZLLLI().LLILLL, null, null, null, null, null, 0L, 0L, 0L, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null)), bundle);
        C786410Ut5.LJJJI("chain_key", LLLLZLLLI().LLILZ, bundle);
        HashMap<String, Object> map = LLLLZLLLI().LLJJJJ;
        String tag = null;
        if (map != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
        }
        C786410Ut5.LJJJI("trackParams", strLJIIIIZZ, bundle);
        C786410Ut5.LJJJI("repoId", LLLLZLLLI().LLJJJJLIIL, bundle);
        Fragment fragment = this.LLJ;
        if (fragment != null) {
            tag = fragment.getTag();
        }
        C786410Ut5.LJJJI("last_page", tag, bundle);
        bundle.putInt("buy_type", LLLLZLLLI().LL);
        C786410Ut5.LJJJI("pdp_from", LLLLZLLLI().LLJLIL, bundle);
        C786410Ut5.LJJJI("source_btm_token", LLLLZLLLI().LLLFF.LIZJ, bundle);
        String strLLLLZLLIL = LLLLZLLLI().LLLJL;
        if (strLLLLZLLIL == null) {
            strLLLLZLLIL = LLLLZLLIL(getIntent(), "us_voucher_popup_schema");
        }
        C786410Ut5.LJJJI("us_voucher_popup_schema", strLLLLZLLIL, bundle);
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

    public static String LLLLZLLIL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
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
