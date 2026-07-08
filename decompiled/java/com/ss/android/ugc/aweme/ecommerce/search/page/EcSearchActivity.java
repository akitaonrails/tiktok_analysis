package com.ss.android.ugc.aweme.ecommerce.search.page;

import X.AbstractActivityC1743740vTg;
import X.C01GW;
import X.C0QEQ;
import X.C0QER;
import X.C0QSJ;
import X.C0QTN;
import X.C0QXR;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1878350yyn;
import X.C19EH;
import X.C20633086l;
import X.C293710BfF;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C640270P9l;
import X.C646000PVm;
import X.C646040PVq;
import X.C650500PfM;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C669560QOc;
import X.C669740QOu;
import X.C673150Qan;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC669620QOi;
import X.InterfaceC1146704e9;
import X.InterfaceC1740760vOs;
import X.InterfaceC1760590vur;
import X.InterfaceC530790Krl;
import X.InterfaceC666860QDs;
import X.InterfaceC687730QyJ;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchActivity extends AbstractActivityC1743740vTg implements InterfaceC1740760vOs, InterfaceC666860QDs, InterfaceC530790Krl, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTHELIOScvLGEgLSQ+Kid9OCQrLGEWKxYpKD0wIAQvPSYlITE1";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 51));

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ECSearchPageScope.class});
    }

    @Override // X.InterfaceC666860QDs
    public final View dp() {
        return null;
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC666860QDs
    public final JSONObject getEcommerceSearchInfo() {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ECSearchPageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ECSearchPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC666860QDs
    public final JSONObject iC() throws JSONException {
        ECSearchEntranceData ecSearchEntranceData;
        String stringStrategy;
        C0QER c0qer = C640270P9l.LIZ(null, this).LL;
        if (c0qer == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || (stringStrategy = ecSearchEntranceData.getStringStrategy("result_channel")) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_channel", stringStrategy);
        return jSONObject;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        boolean zLJI = MethodIDManager.LJI(202340);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity", "onStart", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLLZLLIL() {
        String stringExtra;
        String stringExtra2;
        ECSearchEntranceData ecSearchEntranceData;
        C0QER searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData2;
        Bundle extras;
        SearchResultParam searchResultParam = (SearchResultParam) getIntent().getSerializableExtra("searchParam");
        C0QER c0qerLJ = (C0QER) getIntent().getSerializableExtra("search_enter_param");
        C650950Pg5 c650950Pg5Copy = (C650950Pg5) getIntent().getSerializableExtra("search_context_source");
        String stringExtra3 = null;
        if (c650950Pg5Copy != null) {
            try {
                extras = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (extras == null || !extras.getBoolean("in_single_stack")) {
                SAFHelper.LIZ.getClass();
                Activity activityLJJIII = SAFHelper.LJJIII();
                if (activityLJJIII != 0 && (activityLJJIII instanceof EcSearchActivity) && !activityLJJIII.isFinishing()) {
                    C650950Pg5.Companion.getClass();
                    C650950Pg5 c650950Pg5LJIIIZ = C646000PVm.LJIIIZ(null, (LifecycleOwner) activityLJJIII);
                    if (c650950Pg5LJIIIZ != null) {
                        C650960Pg6 immutableData = c650950Pg5Copy.getImmutableData();
                        c650950Pg5Copy = c650950Pg5Copy.copy(immutableData.copy(c650950Pg5LJIIIZ.getImmutableData().searchCommonModel, immutableData.searchInputModel, c650950Pg5LJIIIZ.getImmutableData().searchVideoModel, immutableData.searchEventModel, c650950Pg5LJIIIZ.getImmutableData().searchSessionModel, c650950Pg5LJIIIZ.getImmutableData().searchEcommerceModel, immutableData.singleSearchEcommerceModel), c650950Pg5Copy.LLILLJJLI);
                        String str = c650950Pg5LJIIIZ.getImmutableData().searchEcommerceModel.singleTabType;
                        if (searchResultParam != null) {
                            searchResultParam.setSingleTabType(str);
                        }
                        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && (ecSearchEntranceData2 = searchEnterParam.getEcSearchEntranceData()) != null) {
                            ecSearchEntranceData2.updateFeatureStrategy("single_tab_type", str);
                        }
                        if (c0qerLJ != null && (ecSearchEntranceData = c0qerLJ.getEcSearchEntranceData()) != null) {
                            ecSearchEntranceData.updateFeatureStrategy("single_tab_type", str);
                        }
                        boolean zIsFromShopVideo = c650950Pg5LJIIIZ.getImmutableData().searchEcommerceModel.isFromShopVideo();
                        if (c0qerLJ != null) {
                            c0qerLJ.setFromShopVideo(zIsFromShopVideo);
                        }
                        List<EnumC669620QOi> list = C669740QOu.LIZ;
                        C669740QOu.LJFF(searchResultParam);
                    }
                }
            }
        }
        if (c0qerLJ == null) {
            c0qerLJ = searchResultParam != null ? searchResultParam.getSearchEnterParam() : null;
        }
        if (c0qerLJ == null) {
            try {
                String stringExtra4 = getIntent().getStringExtra("enter_from");
                if (stringExtra4 != null && stringExtra4.length() != 0) {
                    try {
                        stringExtra = getIntent().getStringExtra("group_id");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        stringExtra = null;
                    }
                    try {
                        stringExtra2 = getIntent().getStringExtra("author_id");
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        stringExtra2 = null;
                    }
                    C0QEQ c0qeqNewBuilder = C0QER.Companion.newBuilder();
                    c0qeqNewBuilder.LIZ = stringExtra4;
                    c0qeqNewBuilder.LJIIL = stringExtra;
                    c0qeqNewBuilder.LJIILIIL = stringExtra2;
                    c0qerLJ = c0qeqNewBuilder.LJ();
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        if (searchResultParam != null && searchResultParam.getSourceBtmToken() == null) {
            try {
                stringExtra3 = getIntent().getStringExtra("source_btm_token");
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            searchResultParam.setSourceBtmToken(stringExtra3);
        }
        if (c0qerLJ != null) {
            if (c0qerLJ.getUseSingleStack()) {
                getIntent().putExtra("in_single_stack", true);
            }
            c0qerLJ.setUseSingleStack(false);
        }
        if (c650950Pg5Copy != null) {
            C646040PVq.LIZ(this, c650950Pg5Copy, C650950Pg5.class);
            C650950Pg5.Companion.getClass();
            C646000PVm.LIZ(this, c650950Pg5Copy);
        }
        if (searchResultParam != null) {
            EcSearchFragment.LLJZ.getClass();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "searchParam", searchResultParam);
            C786410Ut5.LJJIZ(bundle, "search_enter_param", c0qerLJ);
            EcSearchFragment ecSearchFragment = new EcSearchFragment();
            ecSearchFragment.setArguments(bundle);
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, ecSearchFragment, "container");
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // X.InterfaceC530790Krl
    public final C0QTN getInflater() {
        return (C0QTN) this.LLILZIL.getValue();
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        C669560QOc c669560QOc;
        String str;
        ECSearchEntranceData ecSearchEntranceData;
        C0QER searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity", "onResume", true);
        super.onResume();
        SearchResultParam searchResultParam = (SearchResultParam) getIntent().getSerializableExtra("searchParam");
        C0QER c0qer = (C0QER) getIntent().getSerializableExtra("search_enter_param");
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(null, this);
        if (c650960Pg6LJII != null && (c669560QOc = c650960Pg6LJII.searchEcommerceModel) != null && (str = c669560QOc.singleTabType) != null) {
            if (searchResultParam != null) {
                searchResultParam.setSingleTabType(str);
            }
            if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && (ecSearchEntranceData2 = searchEnterParam.getEcSearchEntranceData()) != null) {
                ecSearchEntranceData2.updateFeatureStrategy("single_tab_type", str);
            }
            if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null) {
                ecSearchEntranceData.updateFeatureStrategy("single_tab_type", str);
            }
        }
        List<EnumC669620QOi> list = C669740QOu.LIZ;
        C669740QOu.LJFF(searchResultParam);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity", "onResume", false);
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        C0QER c0qer = (C0QER) getIntent().getSerializableExtra("search_enter_param");
        Integer numValueOf = c0qer != null ? Integer.valueOf(C650500PfM.LIZIZ(c0qer)) : null;
        int value = C0QXR.BUY_X_GET_Y.getValue();
        if (numValueOf != null && numValueOf.intValue() == value) {
            return "b9476";
        }
        int value2 = C0QXR.EU_BMRM.getValue();
        if (numValueOf == null || numValueOf.intValue() != value2) {
            return (numValueOf == null || numValueOf.intValue() != C0QXR.SEA_BXGY.getValue()) ? "b7349" : "b92570";
        }
        return "b27850";
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Queue<List<EcSearchActivity>> queue = C20633086l.LIZ;
        if (!queue.isEmpty()) {
            Iterator<List<EcSearchActivity>> it2 = queue.iterator();
            while (it2.hasNext()) {
                List<EcSearchActivity> next = it2.next();
                Iterator<EcSearchActivity> it3 = next.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(it3.next(), this)) {
                        it3.remove();
                    }
                }
                if (next.size() == 0) {
                    it2.remove();
                }
            }
        }
        if (C293710BfF.LIZ()) {
            C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
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

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LLLLZLLIL();
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
}
