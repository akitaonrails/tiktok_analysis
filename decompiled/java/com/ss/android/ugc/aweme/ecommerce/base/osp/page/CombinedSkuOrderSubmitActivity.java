package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.AbstractActivityC1743740vTg;
import X.AnonymousClass0317;
import X.C032I;
import X.C033K;
import X.C034S;
import X.C03H5;
import X.C0QSJ;
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
import X.C212391189t;
import X.C2217381BqS;
import X.C299020Bno;
import X.C335910DEv;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C703302op;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C903103fx;
import X.EnumC1740810vOx;
import X.EnumC335920DEw;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
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
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CombinedSkuOrderSubmitActivity extends AbstractActivityC1743740vTg implements InterfaceC1740760vOs, InterfaceC724530SbT, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyHELIOSAgOGs8KCg2ZgYjJC06JiAoGiQmBzcoLD0APSchIDsSKzElPyYnMQ==";
    public Integer LLILZIL;
    public final AssemVMLazy LLILZLL;
    public Function1<? super MotionEvent, Unit> LLIZ;
    public long LLIZLLLIL;
    public Fragment LLJ;
    public C032I LLJI;
    public C033K LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CombinedSkuOrderSubmitActivity.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{OrderSubmitPageScope.class}).unbindAbility(LLLZ(), C032I.class);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == C032I.class) {
            this.LLJI = (C032I) obj;
        } else if (cls == C033K.class) {
            this.LLJIJIL = (C033K) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{OrderSubmitPageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == C032I.class) {
            return this.LLJI;
        }
        if (cls == C033K.class) {
            return this.LLJIJIL;
        }
        return null;
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(OrderSubmitPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(OrderSubmitPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity", "onResume", true);
        super.onResume();
        this.LLIZLLLIL = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity", "onStart", true);
        super.onStart();
        C128Y c128y = this.LLJ;
        if (c128y != null && (c128y instanceof InterfaceC988203tg)) {
            ((InterfaceC988203tg) c128y).onVisible();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{OrderSubmitPageScope.class}).bindAbility(LLLZ(), C032I.class);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == C032I.class) {
            this.LLJI = null;
        } else if (cls == C033K.class) {
            this.LLJIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final OrderSubmitAssemViewModel LLLZ() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.ORDER_SUBMIT_PAGE.getPageCode();
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C903103fx.LIZ.getClass();
        C903103fx.LIZIZ = null;
        super.onDestroy();
    }

    public CombinedSkuOrderSubmitActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        this.LLILZLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS545S0100000_1(c19719912DlLIZ, 835), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 836), AFwS228S0000000_1.get$arr$(129));
        this.LLIZ = AFwS228S0000000_1.get$arr$(127);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZLLLI(java.util.HashMap<java.lang.String, java.lang.Object> r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r4.LLLZ()
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r0.LLLIL
            if (r1 == 0) goto L3f
            java.lang.String r0 = "source_page_type"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L3f
            java.lang.String r1 = r0.toString()
        L14:
            java.lang.String r0 = "shop_cart"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3c
            java.lang.String r3 = "multi_express_checkout"
        L1e:
            java.lang.String r2 = "checkout_type"
            if (r5 == 0) goto L3b
            r5.put(r2, r3)
            java.lang.String r1 = "entrance_info"
            java.util.HashMap r0 = X.C1741890vQh.LJ(r1, r5)
            if (r0 == 0) goto L36
            r0.put(r2, r3)
            java.lang.String r0 = X.C1741890vQh.LJIIIIZZ(r0)
            if (r0 != 0) goto L38
        L36:
            java.lang.String r0 = "{}"
        L38:
            r5.put(r1, r0)
        L3b:
            return
        L3c:
            java.lang.String r3 = "one_step_checkout"
            goto L1e
        L3f:
            r1 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity.LLLLZLLLI(java.util.HashMap):void");
    }

    public final void LLLZIL(HashMap<String, Object> map) {
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
        this.LLIZ.invoke(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d0 A[Catch: s -> 0x0409, Exception -> 0x0413, TRY_ENTER, TryCatch #0 {s -> 0x0409, blocks: (B:179:0x03da, B:180:0x03fd, B:183:0x0406, B:178:0x03d0), top: B:374:0x03c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3 A[Catch: s -> 0x02ae, TRY_ENTER, TryCatch #3 {s -> 0x02ae, blocks: (B:73:0x01ad, B:74:0x01c6, B:77:0x01cf, B:72:0x01a3), top: B:380:0x019b }] */
    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r40) {
        /*
            Method dump skipped, instruction units count: 2169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        String strLJIIIIZZ;
        String strLJIIIIZZ2;
        super.onSaveInstanceState(bundle);
        C1AF0.LIZJ("OSP statistic page rebuild");
        String tag = null;
        C786410Ut5.LJJJI("requestParams", C1741890vQh.LJIIIIZZ(new OrderSubmitRequestParam(LLLZ().LLILLL, LLLZ().LLILZIL, null, null, null, null, null, 0L, 0L, 0L, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null)), bundle);
        C786410Ut5.LJJJI("chain_key", LLLZ().LLJIJIL, bundle);
        HashMap<String, Object> map = LLLZ().LLLIL;
        String strLJIIIIZZ3 = null;
        if (map != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
        } else {
            strLJIIIIZZ = null;
        }
        C786410Ut5.LJJJI("trackParams", strLJIIIIZZ, bundle);
        C786410Ut5.LJJJI("repoId", LLLZ().LLLJ, bundle);
        BillInfoData billInfoData = LLLZ().LLJJI;
        if (billInfoData != null) {
            strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(billInfoData);
        } else {
            strLJIIIIZZ2 = null;
        }
        C212391189t.LIZ.getClass();
        C212391189t.LIZIZ("order_submit_page_cache", "bill_info_data", strLJIIIIZZ2);
        Fragment fragment = this.LLJ;
        if (fragment != null) {
            tag = fragment.getTag();
        }
        C786410Ut5.LJJJI("last_page", tag, bundle);
        bundle.putInt("buy_type", LLLZ().LL);
        C786410Ut5.LJJJI("pdp_from", LLLZ().LLLLILI, bundle);
        List<AddressPromotionSku> list = LLLZ().LLLLJI;
        if (list != null) {
            strLJIIIIZZ3 = C1741890vQh.LJIIIIZZ(list);
        }
        C786410Ut5.LJJJI("promotion_request", strLJIIIIZZ3, bundle);
        C786410Ut5.LJJJI("voucher_type_id", LLLZ().LLLLL, bundle);
        C786410Ut5.LJJJI("source_btm_token", LLLZ().LLLZLZ.LIZJ, bundle);
        bundle.putInt("sea_one_step_type", LLLZ().f353k0);
        bundle.putInt("sea_one_step_height_style", LLLZ().m0);
        bundle.putInt("sea_one_step_mask", LLLZ().l0);
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
