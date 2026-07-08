package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository;

import X.AbstractC1751520vgE;
import X.AnonymousClass0317;
import X.C034S;
import X.C059T;
import X.C0C64;
import X.C0PEM;
import X.C10340042o;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13LE;
import X.C1741890vQh;
import X.C1750760vf0;
import X.C1751940vgu;
import X.C1751960vgw;
import X.C1752000vh0;
import X.C1AF0;
import X.C1AQS;
import X.C2174541A8m;
import X.C23250099c;
import X.C2371409Qy;
import X.C259800zU;
import X.C786410Ut5;
import X.C817503Hh;
import X.InterfaceC2024807wU;
import X.InterfaceC2027807wy;
import Y.ARunnableS103S0100000_3;
import android.app.Activity;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.OrderEntranceType;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class OrderCenterEntry implements InterfaceC2024807wU, GenericLifecycleObserver {
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public final Keva LLILLJJLI = Keva.getRepo("ec_order_center_entrance_infos");
    public final List<InterfaceC2027807wy> LLILLL = new ArrayList();
    public final C1751960vgw LLILZ = new Keva.OnChangeListener() { // from class: X.0vgw
        @Override // com.bytedance.keva.Keva.OnChangeListener
        public final void onChanged(Keva keva, String str) {
            this.LIZ.LJFF();
        }
    };
    public boolean LLILZIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    public final TradeEntranceInfo LJ() {
        TradeEntranceInfo tradeEntranceInfo;
        String string = this.LLILLJJLI.getString(LIZLLL(), null);
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<TradeEntranceInfo>() { // from class: X.0vgv
            }.getType() : C2371409Qy.LIZJ(C13LE.LJ(TradeEntranceInfo.class)));
            if (!(objFromJson instanceof TradeEntranceInfo)) {
                objFromJson = null;
            }
            tradeEntranceInfo = (TradeEntranceInfo) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        return tradeEntranceInfo == null ? new TradeEntranceInfo(Integer.valueOf(OrderEntranceType.CLOSE.ordinal()), "", "", null, null, null, null, 0) : tradeEntranceInfo;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory() {
        this.LLILLJJLI.unRegisterChangeListener(this.LLILZ);
        this.LL.removeCallbacksAndMessages(null);
        ((ArrayList) this.LLILLL).clear();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        C1750760vf0 c1750760vf0 = C1750760vf0.LIZ;
        AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 194);
        c1750760vf0.getClass();
        C1750760vf0.LIZJ(awS605S0100000_26);
        LJFF();
    }

    public static String LIZLLL() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        String userId = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId();
        return (userId == null || userId.length() == 0) ? "unknown" : userId;
    }

    public final void LJFF() {
        TradeEntranceInfo tradeEntranceInfoLJ = LJ();
        Integer num = tradeEntranceInfoLJ.type;
        boolean z = num != null && num.intValue() == OrderEntranceType.OPEN.ordinal();
        String str = tradeEntranceInfoLJ.tips;
        if (str == null) {
            str = "";
        }
        C1751940vgu c1751940vgu = new C1751940vgu(this, z, tradeEntranceInfoLJ, str);
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            c1751940vgu.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS103S0100000_3((Object) c1751940vgu, 3));
        }
        if (!z || this.LLILZIL) {
            return;
        }
        final Integer num2 = tradeEntranceInfoLJ.toReviewCount;
        final String str2 = tradeEntranceInfoLJ.entryName;
        new AbstractC1751520vgE(num2, str2) { // from class: X.0vgt
            {
                super("tiktokec_ecommerce_centre_entry_show");
                LinkedHashMap<String, Object> linkedHashMap = this.LIZIZ;
                linkedHashMap.put("entry", "navigation_panel");
                if (str2 != null && !a0.LJJJIL(str2)) {
                    linkedHashMap.put("entry_name", str2);
                }
                if (num2 != null && num2.intValue() > 0) {
                    linkedHashMap.put("copywriting", "review_orders");
                    linkedHashMap.put("to_review_cnt", num2);
                }
            }
        }.LIZIZ();
        this.LLILZIL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2024807wU
    public final void LIZ(Activity activity) {
        TradeEntranceInfo tradeEntranceInfoLJ = LJ();
        if (activity instanceof LifecycleOwner) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), C0PEM.LIZJ, null, new C10340042o(null), 2);
        }
        String str = tradeEntranceInfoLJ.schema;
        if (str != null && str.length() != 0) {
            LJI(activity, tradeEntranceInfoLJ);
            return;
        }
        C1750760vf0 c1750760vf0 = C1750760vf0.LIZ;
        AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(this, activity, 38);
        c1750760vf0.getClass();
        C1750760vf0.LIZJ(awS392S0200000_26);
    }

    @Override // X.InterfaceC2024807wU
    public final void LIZJ(InterfaceC2027807wy interfaceC2027807wy) {
        ((ArrayList) this.LLILLL).add(interfaceC2027807wy);
    }

    public final void LJII(TradeEntranceInfo tradeEntranceInfo) {
        TradeEntranceInfo tradeEntranceInfo2 = tradeEntranceInfo;
        Keva keva = this.LLILLJJLI;
        String strLIZLLL = LIZLLL();
        if (tradeEntranceInfo2 == null) {
            tradeEntranceInfo2 = new TradeEntranceInfo(Integer.valueOf(OrderEntranceType.CLOSE.ordinal()), "", "", null, null, null, null, 0);
        }
        keva.storeString(strLIZLLL, C1741890vQh.LJIIIIZZ(tradeEntranceInfo2));
    }

    @Override // X.InterfaceC2024807wU
    public final void LIZIZ(Lifecycle lifecycle, C2174541A8m c2174541A8m) {
        if (!(!((ArrayList) this.LLILLL).isEmpty())) {
            ((ArrayList) this.LLILLL).add(c2174541A8m);
            lifecycle.addObserver(this);
            this.LLILLJJLI.registerChangeListener(this.LLILZ);
            return;
        }
        throw new RuntimeException("Do not init reduplicative!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void LJI(Activity activity, TradeEntranceInfo tradeEntranceInfo) {
        ?? r1;
        C259800zU c259800zU = new C259800zU();
        String str = tradeEntranceInfo.schema;
        if (str != null && str.length() != 0) {
            r1 = tradeEntranceInfo.schema;
        } else {
            String str2 = (String) SettingsManager.LIZLLL().LJIIIIZZ("ecom_order_center_default_schema", String.class, "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_tts_shop_center%2Fpages%2Fshop-center%2Ftemplate.js&hide_nav_bar=1&trans_status_bar=1&use_new_container=1&use_spark=1");
            r1 = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_tts_shop_center%2Fpages%2Fshop-center%2Ftemplate.js&hide_nav_bar=1&trans_status_bar=1&use_new_container=1&use_spark=1";
            if (str2 != null) {
                r1 = str2;
            }
        }
        c259800zU.element = r1;
        Uri uri = UriProtector.parse(r1);
        Uri.Builder builderEncodedPath = new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).encodedPath(uri.getPath());
        for (String str3 : UriProtector.getQueryParameterNames(uri)) {
            builderEncodedPath.appendQueryParameter(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("start_click_time", System.currentTimeMillis());
        builderEncodedPath.appendQueryParameter("trackParams", C786410Ut5.J3(jSONObject));
        if (!UriProtector.getQueryParameterNames(uri).contains("previous_page")) {
            builderEncodedPath.appendQueryParameter("previous_page", "navigation_panel");
        }
        c259800zU.element = builderEncodedPath.build().toString();
        C1752000vh0.LIZ.getClass();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_order_center_first_screen_optimize_precise_setting", true, false)) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C059T(c259800zU, null), 3);
        }
        SmartRouter.buildRoute(activity, (String) c259800zU.element).open();
        tradeEntranceInfo.setTips("");
        tradeEntranceInfo.setSchema("");
        LJII(tradeEntranceInfo);
        final Integer num = tradeEntranceInfo.toReviewCount;
        final String str4 = tradeEntranceInfo.entryName;
        new AbstractC1751520vgE(num, str4) { // from class: X.0vgr
            {
                super("tiktokec_ecommerce_centre_entry_click");
                LinkedHashMap<String, Object> linkedHashMap = this.LIZIZ;
                linkedHashMap.put("button_for", "orders");
                linkedHashMap.put("entry", "navigation_panel");
                if (str4 != null && !a0.LJJJIL(str4)) {
                    linkedHashMap.put("entry_name", str4);
                }
                if (num != null && num.intValue() > 0) {
                    linkedHashMap.put("copywriting", "review_orders");
                    linkedHashMap.put("to_review_cnt", num);
                }
            }
        }.LIZIZ();
    }
}
