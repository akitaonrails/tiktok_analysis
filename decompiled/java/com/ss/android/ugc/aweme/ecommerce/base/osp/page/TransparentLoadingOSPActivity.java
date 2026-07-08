package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.AbstractActivityC1743740vTg;
import X.AnonymousClass0408;
import X.C04CH;
import X.C0PEM;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1308910kAL;
import X.C1323720kYE;
import X.C1390410mHn;
import X.C13LE;
import X.C1421105hJ;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1AF0;
import X.C1DFH;
import X.C2095008Iq;
import X.C2107308Nj;
import X.C212391189t;
import X.C2188811AlT;
import X.C23250099c;
import X.C2371409Qy;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C817503Hh;
import X.C878103bv;
import X.C955103oL;
import X.EnumC1740810vOx;
import X.EnumC335920DEw;
import X.InterfaceC1740760vOs;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class TransparentLoadingOSPActivity extends AbstractActivityC1743740vTg implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZyAgOGs8KCg2ZhE+KCEgOCQ+LCEnBCotLSY9LwofGQ4wPCw6IDsq";
    public C1390410mHn LLILZIL;
    public OrderSubmitRequestParam LLILZLL;
    public HashMap<String, Object> LLIZ;
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public String LLJI = "";
    public String LLJIJIL;
    public int LLJILJIL;

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onStart", true);
        super.onStart();
        C786410Ut5.LLLZZIL(LLLLZLLLI(), 0);
        LLLLZLLLI().LIZJ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final C1390410mHn LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z06);
            this.LLILZIL = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.TRAN_LOADING_OSP.getPageCode();
    }

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748820vbs
    public final String getPageName() {
        String str;
        HashMap<String, Object> map = this.LLIZ;
        Object obj = map != null ? map.get("previous_page") : null;
        return (!(obj instanceof String) || (str = (String) obj) == null) ? super.getPageName() : str;
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

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        String string;
        String string2;
        long longExtra;
        Boolean boolValueOf;
        Integer numLJIIJJI;
        OrderSubmitRequestParam orderSubmitRequestParam;
        OrderSubmitRequestParam orderSubmitRequestParam2;
        Long keyTimestamp;
        List<OrderShopDigest> orderShopDigest;
        Type type;
        HashMap<String, Object> map;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fx2);
        String str = CardStruct.IStatusCode.DEFAULT;
        if (bundle == null) {
            string = LLLLZLLIL(getIntent(), "requestParams");
            this.LLIZ = C1741890vQh.LIZIZ(getIntent(), "trackParams");
            string2 = LLLLZLLIL(getIntent(), "repoId");
            String strLLLLZLLIL = LLLLZLLIL(getIntent(), "buy_type");
            if (strLLLLZLLIL != null) {
                str = strLLLLZLLIL;
            }
            this.LLJI = str;
            this.LLJ = LLLLZLLIL(getIntent(), "_originalSchema");
            this.LLJIJIL = LLLLZLLIL(getIntent(), "cart_storage_key");
            longExtra = getIntent().getLongExtra("key_timestamp", Long.MIN_VALUE);
            String strLLLLZLLIL2 = LLLLZLLIL(getIntent(), "is_from_follow");
            if (strLLLLZLLIL2 != null) {
                boolValueOf = Boolean.valueOf(Boolean.parseBoolean(strLLLLZLLIL2));
            } else {
                boolValueOf = Boolean.FALSE;
            }
            String strLLLLZLLIL3 = LLLLZLLIL(getIntent(), "biz_type");
            if (strLLLLZLLIL3 != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(strLLLLZLLIL3);
            } else {
                numLJIIJJI = null;
            }
        } else {
            string = bundle.getString("requestParams");
            this.LLIZ = C1741890vQh.LIZLLL(bundle, "trackParams");
            string2 = bundle.getString("repoId");
            this.LLJ = bundle.getString("_originalSchema");
            String string3 = bundle.getString("buy_type");
            if (string3 != null) {
                str = string3;
            }
            this.LLJI = str;
            this.LLJIJIL = bundle.getString("cart_storage_key");
            longExtra = bundle.getLong("key_timestamp", Long.MIN_VALUE);
            String string4 = bundle.getString("is_from_follow");
            if (string4 != null) {
                boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string4));
            } else {
                boolValueOf = Boolean.FALSE;
            }
            String string5 = bundle.getString("biz_type");
            if (string5 != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(string5);
            } else {
                numLJIIJJI = null;
            }
        }
        if (longExtra != Long.MIN_VALUE && (map = this.LLIZ) != null) {
            map.put("start_click_time", Long.valueOf(longExtra));
        }
        HashMap<String, Object> map2 = this.LLIZ;
        if (map2 != null && map2.get("entrance_info") == null) {
            map2.put("entrance_info", C1741890vQh.LJIIIIZZ(map2));
        }
        C212391189t c212391189t = C212391189t.LIZ;
        String str2 = this.LLJIJIL;
        c212391189t.getClass();
        String strLIZ = C212391189t.LIZ("cart_order_submit_params", str2);
        if (strLIZ != null) {
            string = strLIZ;
        } else if (string == null && this.LLJIJIL != null) {
            Object objLIZ = C1323720kYE.LIZ(this).LIZ(this.LLJIJIL);
            if (objLIZ instanceof String) {
                string = (String) objLIZ;
            } else {
                string = null;
            }
        }
        if (string2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("default_repo_id");
            sbLIZ.append(UUID.randomUUID());
            string2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LLIZLLLIL = string2;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJ(OrderSubmitRequestParam.class));
            } else {
                type = new TypeToken<OrderSubmitRequestParam>() { // from class: X.03tb
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
            if (!(objFromJson instanceof OrderSubmitRequestParam)) {
                objFromJson = null;
            }
            orderSubmitRequestParam = (OrderSubmitRequestParam) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            orderSubmitRequestParam = null;
        }
        this.LLILZLL = orderSubmitRequestParam;
        if (orderSubmitRequestParam == null || (orderShopDigest = orderSubmitRequestParam.getOrderShopDigest()) == null || orderShopDigest.isEmpty()) {
            C1AF0.LJ(new RuntimeException("orderShop is null"));
        }
        this.LLJILJIL = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(numLJIIJJI), "order_submit", null, null, 12);
        OrderSubmitRequestParam orderSubmitRequestParam3 = this.LLILZLL;
        if (orderSubmitRequestParam3 != null) {
            orderSubmitRequestParam3.setFromFollow(boolValueOf);
        }
        if (getIntent().hasExtra("key_timestamp") && ((orderSubmitRequestParam2 = this.LLILZLL) == null || (keyTimestamp = orderSubmitRequestParam2.getKeyTimestamp()) == null || keyTimestamp.longValue() != longExtra)) {
            this.LLILZLL = null;
        }
        C1421105hJ.LIZLLL("rd_tiktokec_cart_submit_params_get", new Pair("start_click_to_now", Long.valueOf(System.currentTimeMillis() - longExtra)));
        new C04CH("TransparentLoading").LIZJ(false);
        OrderSubmitRequestParam orderSubmitRequestParam4 = this.LLILZLL;
        HashMap<String, Object> map3 = this.LLIZ;
        if (map3 == null) {
            map3 = new HashMap<>();
        }
        if (orderSubmitRequestParam4 == null) {
            C1AF0.LIZJ("OSP_fetchBillInfoForCart: requestParamIsEmpty");
        } else {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C878103bv(orderSubmitRequestParam4, this, map3, orderSubmitRequestParam4, null), 2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onCreate", false);
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
}
