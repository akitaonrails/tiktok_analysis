package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.AbstractActivityC1743740vTg;
import X.AnonymousClass0317;
import X.C032I;
import X.C033K;
import X.C034S;
import X.C03H5;
import X.C0C64;
import X.C0QSJ;
import X.C0ZP4;
import X.C1120604Zw;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C13LE;
import X.C1533950q1J;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719512Dh;
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
import X.C724750Sbp;
import X.C736680Sv4;
import X.C770702zh;
import X.C786410Ut5;
import X.C903103fx;
import X.C987403tY;
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
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
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
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
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
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderSubmitActivity extends AbstractActivityC1743740vTg implements InterfaceC1740760vOs, InterfaceC724530SbT, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSExKTYpZyAgOGs8KCg2Zgo+LSohGzAuJCYnCSY4IDk6PDw=";
    public Integer LLILZIL;
    public final AssemVMLazy LLILZLL;
    public Function1<? super MotionEvent, Unit> LLIZ;
    public long LLIZLLLIL;
    public String LLJ;
    public C032I LLJI;
    public C033K LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OrderSubmitActivity.class, "assemViewModel", "getAssemViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity", "onWindowFocusChanged", true);
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
        if (!LLLZ().V) {
            String str = this.LLJ;
            if (C1533950q1J.LJ(str)) {
                C19719512Dh.LIZJ(C987403tY.LIZ).remove(str);
            }
        }
        super.onDestroy();
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity", "onResume", true);
        super.onResume();
        this.LLIZLLLIL = SystemClock.elapsedRealtime();
        ModuleManager moduleManager = LLLZ().LLZIL;
        if (moduleManager != null) {
            ModuleManager.LJI(moduleManager, "t_resume_end", null, false, 6);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity", "onResume", false);
    }

    public OrderSubmitActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        this.LLILZLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS545S0100000_1(c19719912DlLIZ, 870), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 871), AFwS228S0000000_1.get$arr$(141));
        this.LLIZ = AFwS228S0000000_1.get$arr$(139);
        this.LLIZLLLIL = -1L;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C736680Sv4.LJIJJ(LLLZ(), new AwS580S0100000_1(this, 118));
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
            if (C770702zh.LIZ(str)) {
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
                if (C770702zh.LIZ(str2)) {
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
                    if (C770702zh.LIZ(str3)) {
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

    /* JADX WARN: Can't wrap try/catch for region: R(77:0|2|(2:378|3)|6|(18:(1:11)|12|(1:14)(1:46)|15|(1:17)(1:45)|18|(1:20)(1:44)|21|(1:23)(1:43)|24|(1:26)(1:42)|27|(1:29)(1:41)|30|(1:32)(1:40)|33|(1:37)|38)(20:(1:52)|53|(1:55)|56|(1:58)(1:90)|59|(1:61)(1:89)|62|(1:64)(1:88)|(1:66)(1:87)|67|(1:69)(1:86)|70|(1:72)(1:85)|73|(1:75)(1:84)|76|(1:78)|(1:82)|83)|39|(12:370|92|(1:94)(1:115)|95|(1:97)|98|(3:100|(1:102)(1:114)|103)|104|(3:106|(1:108)(1:113)|109)|110|(1:117)|118)|(20:120|(3:122|(1:124)|125)(0)|316|(1:318)|319|(4:380|321|(2:323|384)|383)|326|(1:328)(1:356)|329|(1:331)|332|(1:334)(1:355)|335|(6:337|(1:339)|340|(1:342)|343|(8:345|(1:347)|348|(1:350)|351|(2:354|352)|382|357))|358|(1:360)|361|(1:363)|364|(2:366|367)(1:385))|126|(1:132)|133|(1:140)(1:139)|141|(1:143)(1:144)|376|145|(7:368|149|(1:157)(1:153)|154|(2:156|158)|159|162)|165|(1:167)(1:169)|168|(2:171|173)(1:172)|174|(2:176|178)(1:177)|179|(1:181)(1:187)|182|(1:184)(1:186)|185|(2:189|191)(1:190)|192|(5:194|(1:196)(1:198)|197|(1:200)(1:201)|202)|(1:207)(1:206)|208|(2:(1:213)|214)|215|(2:217|219)(1:218)|220|(3:224|372|(7:374|226|(1:234)(1:230)|231|(2:233|235)|236|239))|(2:243|245)(1:244)|246|(2:248|250)(1:249)|251|(1:253)(1:254)|255|(1:275)(1:259)|260|(1:274)(1:264)|265|(1:273)(1:269)|270|(1:272)(1:276)|277|(4:279|(1:281)(1:285)|282|(1:288)(2:287|289))|290|(3:292|(1:301)(1:296)|297)|298|(3:300|(1:305)|306)|307|(2:(2:310|312)(1:311)|313)|316|(0)|319|(0)|326|(0)(0)|329|(0)|332|(0)(0)|335|(0)|358|(0)|361|(0)|364|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x037e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x037f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r10);
        r1 = X.C2188811AlT.LIZ();
        r1.append("bundle deal parse da info exception: ");
        r1.append(r10);
        X.C1AF0.LIZJ(X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0651 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instruction units count: 1920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        String strLJIIIIZZ;
        super.onSaveInstanceState(bundle);
        C1AF0.LIZJ("OSP statistic page rebuild");
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_osp_restore_config", true, true)) {
            LLLZ().V = true;
        }
        String strLJIIIIZZ2 = null;
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
        }
        C212391189t.LIZ.getClass();
        C212391189t.LIZIZ("order_submit_page_cache", "bill_info_data", strLJIIIIZZ2);
        bundle.putInt("buy_type", LLLZ().LL);
        C786410Ut5.LJJJI("pdp_from", LLLZ().LLLLILI, bundle);
        List<AddressPromotionSku> list = LLLZ().LLLLJI;
        if (list != null) {
            strLJIIIIZZ3 = C1741890vQh.LJIIIIZZ(list);
        }
        C786410Ut5.LJJJI("promotion_request", strLJIIIIZZ3, bundle);
        C786410Ut5.LJJJI("voucher_type_id", LLLZ().LLLLL, bundle);
        C786410Ut5.LJJJI("source_btm_token", LLLZ().LLLZLZ.LIZJ, bundle);
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
