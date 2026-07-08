package com.ss.android.ugc.aweme.search.pages.core.ui.activity;

import X.AbstractC1252750ihl;
import X.AbstractC1563340qmi;
import X.C004I;
import X.C01GW;
import X.C098200Yq;
import X.C0Q82;
import X.C0QTN;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1308910kAL;
import X.C1634100scq;
import X.C1644460stY;
import X.C1697810uHb;
import X.C1765020w20;
import X.C1835007Gq;
import X.C1835407Gu;
import X.C189200o6;
import X.C199Y;
import X.C19EG;
import X.C20629915o1;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C663640Q1i;
import X.C663750Q1t;
import X.C673940Qc4;
import X.C673950Qc5;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC673930Qc3;
import X.EnumC682280QpW;
import X.InterfaceC1171660gay;
import X.InterfaceC1294060jmO;
import X.InterfaceC1399350mWD;
import X.InterfaceC1581830rGX;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1740760vOs;
import X.InterfaceC214902198i;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC530790Krl;
import X.InterfaceC641270PDh;
import X.InterfaceC655270Pn3;
import X.InterfaceC666860QDs;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.config.SearchSAFLifecycleCheckSetting;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchResultActivity extends C199Y implements InterfaceC641270PDh, C0Q82, InterfaceC1171660gay, InterfaceC530790Krl, InterfaceC1581830rGX, InterfaceC1740760vOs, InterfaceC666860QDs, InterfaceC655270Pn3 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2HELIOSsvJj02ZjAlZy4wPCw6IDsqZhYpKD0wIBcpOjo/PAQvPSYlITE1";
    public final boolean LL = true;
    public final boolean LLILLJJLI = true;
    public final boolean LLILLL;
    public final Class<? extends InterfaceC214902198i> LLILZ;
    public View LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onStart", true);
        SearchMiddleMonitor searchMiddleMonitor = SearchMiddleMonitor.INSTANCE;
        searchMiddleMonitor.activityStart();
        super.onStart();
        searchMiddleMonitor.activityStartEnd();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onStart", false);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.C199Y
    public final AbstractC1563340qmi createSafLifecycleRegistry() {
        return new AbstractC1563340qmi(this) { // from class: X.0QTi
            @Override // X.AbstractC1563340qmi
            public final String LJ() {
                return "SearchSAFPrefixId";
            }

            @Override // X.AbstractC1563340qmi, X.InterfaceC1563360qmk
            public final boolean LIZIZ() {
                return C1835007Gq.LIZ() && ((SearchSAFLifecycleCheckSetting.MetaData) SearchSAFLifecycleCheckSetting.LIZIZ.getValue()).checkSAFCheck;
            }

            @Override // X.AbstractC1563340qmi
            public final boolean LJII() {
                if (!C1835007Gq.LIZ()) {
                    return false;
                }
                C01GW c01gw = SearchSAFLifecycleCheckSetting.LIZIZ;
                if (!((SearchSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).checkSAFCheck || ((SearchSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).crashRatio <= 0.0f) {
                    return false;
                }
                return ((SearchSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).crashRatio >= 1.0f || ((Random) SearchSAFLifecycleCheckSetting.LIZJ.getValue()).nextFloat() < ((SearchSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).crashRatio;
            }

            {
                super(this);
            }
        };
    }

    @Override // X.InterfaceC666860QDs
    public final View dp() {
        if (this.LLILZIL == null) {
            try {
                ViewStub viewStub = (ViewStub) findViewById(R.id.vfr);
                this.LLILZIL = viewStub != null ? C786410Ut5.LJLLLL(viewStub) : null;
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        View view = this.LLILZIL;
        if (view != null) {
            return view.findViewById(R.id.vft);
        }
        return null;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean migrateDarkModeImplToFragment() {
        SAFHelper.LIZ.getClass();
        return SAFHelper.LJIIL();
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean migrateImmersiveBarImplToFragment() {
        SAFHelper.LIZ.getClass();
        return SAFHelper.LJIIL();
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C663750Q1t.LIZ.getClass();
        ((ConcurrentHashMap) C663750Q1t.LIZIZ.getValue()).clear();
        super.onDestroy();
    }

    public SearchResultActivity() {
        SAFHelper.LIZ.getClass();
        this.LLILLL = ((Boolean) SAFHelper.LJFF.getValue()).booleanValue();
        this.LLILZ = SearchRootFragment.class;
        this.LLILZLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 389));
    }

    public final SearchRootFragment LLLLLZL() {
        InterfaceC214902198i interfaceC214902198iLIZ = C20629915o1.LIZ(this);
        if (interfaceC214902198iLIZ instanceof SearchRootFragment) {
            return (SearchRootFragment) interfaceC214902198iLIZ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void finish() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment r0 = r3.LLLLLZL()
            com.ss.android.ugc.aweme.search.model.SearchEnterViewModel r0 = X.C640270P9l.LIZ(r0, r3)
            X.0QER r2 = r0.LL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "finish: param: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            r1.append(r0)
            if (r2 == 0) goto L6e
            boolean r0 = r2.getLeftIcon()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L25:
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            if (r2 == 0) goto L64
            X.0QGn r0 = X.C667590QGn.LIZ
            r0.getClass()
            boolean r0 = X.C667590QGn.LIZIZ(r2)
            if (r0 == 0) goto L58
            r0 = 191(0xbf, float:2.68E-43)
            kotlin.jvm.internal.AFwS241S0000000_10 r0 = kotlin.jvm.internal.AFwS241S0000000_10.get$arr$(r0)
            r3.activityConfiguration(r0)
        L46:
            X.0QBD r0 = com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskControlService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskControlService r0 = X.C0QBD.LIZ()
            if (r0 == 0) goto L54
            r0.LJIL()
        L54:
            super.finish()
            return
        L58:
            boolean r0 = r2.getLeftIcon()
            if (r0 == 0) goto L64
            boolean r0 = X.C1585030rLh.LIZIZ()
            if (r0 != 0) goto L46
        L64:
            r0 = 192(0xc0, float:2.69E-43)
            kotlin.jvm.internal.AFwS241S0000000_10 r0 = kotlin.jvm.internal.AFwS241S0000000_10.get$arr$(r0)
            r3.activityConfiguration(r0)
            goto L46
        L6e:
            r0 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity.finish():void");
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        SearchRootFragment searchRootFragmentLLLLLZL;
        String btmPageCode;
        return C1835407Gu.LIZ() ? "SearchResultActivity" : (C1835007Gq.LIZ() || (searchRootFragmentLLLLLZL = LLLLLZL()) == null || (btmPageCode = searchRootFragmentLLLLLZL.getBtmPageCode()) == null) ? "b6880" : btmPageCode;
    }

    @Override // X.InterfaceC666860QDs
    public final JSONObject getEcommerceSearchInfo() {
        SearchRootFragment searchRootFragmentLLLLLZL = LLLLLZL();
        if (searchRootFragmentLLLLLZL != null) {
            return searchRootFragmentLLLLLZL.getEcommerceSearchInfo();
        }
        return null;
    }

    @Override // X.InterfaceC530790Krl
    public final C0QTN getInflater() {
        SearchRootFragment searchRootFragmentLLLLLZL = LLLLLZL();
        return (searchRootFragmentLLLLLZL == null || !this.LL) ? (C0QTN) this.LLILZLL.getValue() : (C0QTN) searchRootFragmentLLLLLZL.LLLII.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, android.app.Activity
    public final Intent getIntent() {
        return super.getIntent();
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        SearchRootFragment searchRootFragmentLLLLLZL = LLLLLZL();
        return searchRootFragmentLLLLLZL != null ? searchRootFragmentLLLLLZL.getPageName() : "";
    }

    @Override // X.InterfaceC666860QDs
    public final JSONObject iC() {
        SearchRootFragment searchRootFragmentLLLLLZL = LLLLLZL();
        if (searchRootFragmentLLLLLZL != null) {
            return searchRootFragmentLLLLLZL.iC();
        }
        return null;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean isDelegateFragmentManager() {
        return C663640Q1i.LIZ();
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        boolean zLJI = MethodIDManager.LJI(71772);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onResume", true);
        SearchMiddleMonitor searchMiddleMonitor = SearchMiddleMonitor.INSTANCE;
        searchMiddleMonitor.activityResume();
        super.onResume();
        searchMiddleMonitor.activityResumeEnd();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onResume", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        boolean zLJI = MethodIDManager.LJI(71836);
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
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.C199Y
    public final boolean getEnableNavigation() {
        return this.LLILLL;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean getEnableSAF() {
        return this.LLILLJJLI;
    }

    @Override // X.C199Y
    public final Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return this.LLILZ;
    }

    @Override // X.C0Q82
    @InterfaceC1294060jmO
    public final void Kd(C19EG c19eg) {
        SearchRootFragment searchRootFragmentLLLLLZL = LLLLLZL();
        if (searchRootFragmentLLLLLZL != null) {
            searchRootFragmentLLLLLZL.Kd(c19eg);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) getLifecycle();
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIJJI()) {
            abstractC1563340qmi.LIZLLL(EnumC682280QpW.MAIN.getValue() | EnumC682280QpW.FINISH.getValue() | EnumC682280QpW.IS_FINISHING.getValue() | EnumC682280QpW.IS_DESTROY.getValue());
            abstractC1563340qmi.LIZLLL(EnumC682280QpW.GET_CURRENT_STATE.getValue() | EnumC682280QpW.LIVEDATA_OBSERVE.getValue() | EnumC682280QpW.VSCOPE_ATTACH.getValue());
            abstractC1563340qmi.LIZLLL(EnumC682280QpW.VIEWMODEL_STORE.getValue());
        }
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onCreate", true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate, p2 enable: ");
        sbLIZ.append(C1835007Gq.LIZ());
        sbLIZ.append(", ");
        sbLIZ.append(getLifecycle());
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        SearchMiddleMonitor searchMiddleMonitor = SearchMiddleMonitor.INSTANCE;
        searchMiddleMonitor.activityCreate();
        C673950Qc5 c673950Qc5 = C673940Qc4.LIZIZ;
        if (c673950Qc5 != null) {
            c673950Qc5.LJIIIIZZ = Long.valueOf(System.currentTimeMillis());
        }
        C673940Qc4.LJIIIZ(EnumC673930Qc3.ACTIVITY_CREATE, null);
        activityConfiguration(new AwS589S0100000_10(this, 17));
        super.onCreate(bundle);
        searchMiddleMonitor.activityCreateEnd();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) throws JSONException {
        super.onRestoreInstanceState(bundle);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_recreate", 1);
        AppLogNewUtils.onEventV3("search_recreate_monitor", jSONObject);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        SearchRootFragment searchRootFragmentLLLLLZL;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if ((!getEnableUseNavigationSceneWindowFocusChangedDispatch() || !this.LLILLL) && (searchRootFragmentLLLLLZL = LLLLLZL()) != null) {
            searchRootFragmentLLLLLZL.onWindowFocusChanged(z);
        }
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        SearchRootFragment searchRootFragmentLLLLLZL = LLLLLZL();
        if (searchRootFragmentLLLLLZL != null) {
            searchRootFragmentLLLLLZL.registerActivityOnKeyDownListener(interfaceC1399350mWD);
        }
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

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        SearchRootFragment searchRootFragmentLLLLLZL = LLLLLZL();
        if (searchRootFragmentLLLLLZL != null) {
            searchRootFragmentLLLLLZL.unRegisterActivityOnKeyDownListener(interfaceC1399350mWD);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
