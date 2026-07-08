package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AnonymousClass0317;
import X.AnonymousClass0408;
import X.C034S;
import X.C035Q;
import X.C03O0;
import X.C03SW;
import X.C098200Yq;
import X.C0C64;
import X.C1014903xz;
import X.C1017003yK;
import X.C1017203yM;
import X.C1017303yN;
import X.C1018503yZ;
import X.C1019103yf;
import X.C1020403ys;
import X.C1120604Zw;
import X.C1121904a9;
import X.C123100dR;
import X.C1323720kYE;
import X.C1388190mED;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1547280qMo;
import X.C1741890vQh;
import X.C1752360vha;
import X.C1758250vr5;
import X.C189200o6;
import X.C1976907ol;
import X.C19EG;
import X.C1AF0;
import X.C1AQS;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C212391189t;
import X.C2188811AlT;
import X.C2371409Qy;
import X.C416901jj;
import X.C786410Ut5;
import X.C919503ib;
import X.C928203k0;
import X.C928503k3;
import X.C934703l3;
import X.C955103oL;
import X.C966003q6;
import X.C976203rk;
import X.C976403rm;
import X.C978703s9;
import X.C981403sa;
import X.C993603uY;
import X.EnumC1014603xw;
import X.EnumC10415045l;
import X.EnumC1752350vhZ;
import X.EnumC969503qf;
import X.InterfaceC1059280dfi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.tab.AddressTabEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.address.tab.AddressTabFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcAddressEditRefactorModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcAddressFullScreenConfigsModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcCombinedSkuOspRollbackConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSchemaBizTypeDetectionModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS118S1200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ECRouterInterceptor implements IInterceptor {
    public int LL;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x0d22  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x0d97 A[Catch: s -> 0x0dac, TryCatch #1 {s -> 0x0dac, blocks: (B:796:0x0d8c, B:798:0x0da0, B:801:0x0da9, B:797:0x0d97), top: B:1154:0x0d85 }] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Integer] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r82, com.bytedance.router.RouteIntent r83) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 5106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static Bundle LIZIZ(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJFF(RouteIntent routeIntent) {
        String string;
        String string2;
        String string3;
        String string4;
        String url;
        Intent extra = routeIntent.getExtra();
        if (extra == null) {
            return;
        }
        Uri uri = routeIntent.getUri();
        if (uri == null && ((url = routeIntent.getUrl()) == null || (uri = UriProtector.parse(url)) == null)) {
            return;
        }
        String strLIZ = C416901jj.LIZ(uri, "room_id");
        if (strLIZ != null && (string4 = a0.LJLIIIL(strLIZ).toString()) != null && string4.length() > 0) {
            extra.putExtra("room_id", string4);
        }
        String strLIZ2 = C416901jj.LIZ(uri, "enter_from");
        if (strLIZ2 != null && (string3 = a0.LJLIIIL(strLIZ2).toString()) != null && string3.length() > 0) {
            extra.putExtra("enter_from", string3);
        }
        String strLIZ3 = C416901jj.LIZ(uri, "order_id");
        if (strLIZ3 != null && (string2 = a0.LJLIIIL(strLIZ3).toString()) != null && string2.length() > 0) {
            extra.putExtra("order_id", string2);
        }
        String strLIZ4 = C416901jj.LIZ(uri, "order_create_time_ms");
        if (strLIZ4 != null && (string = a0.LJLIIIL(strLIZ4).toString()) != null && string.length() > 0) {
            extra.putExtra("order_create_time_ms", string);
        }
    }

    public static boolean LJI(RouteIntent routeIntent) {
        String strLIZJ;
        Integer numLJIIJJI;
        Intent extra = routeIntent.getExtra();
        if (extra != null && (strLIZJ = LIZJ(extra, "from_ocp_fail")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZJ)) != null && numLJIIJJI.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static int LJII(RouteIntent routeIntent) {
        String strLIZJ;
        Integer numLJIIJJI;
        Intent extra = routeIntent.getExtra();
        if (extra != null && (strLIZJ = LIZJ(extra, "buy_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZJ)) != null) {
            return numLJIIJJI.intValue();
        }
        return -1;
    }

    public static List LJIIIIZZ(Intent intent) {
        String strLIZJ;
        boolean z;
        if (intent != null) {
            try {
                strLIZJ = LIZJ(intent, "container_params");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        } else {
            strLIZJ = null;
        }
        if (strLIZJ == null || strLIZJ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            JSONArray jSONArray = new JSONArray(strLIZJ);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(C786410Ut5.J3(JSONArrayProtectorUtils.getJSONObject(jSONArray, i)));
            }
            return arrayList;
        }
        return null;
    }

    public static String LJIIJJI(RouteIntent routeIntent) {
        int i;
        Intent extra;
        String strLIZJ;
        try {
            extra = routeIntent.getExtra();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extra != null && (strLIZJ = LIZJ(extra, "display_mode")) != null) {
            i = CastIntegerProtector.parseInt(strLIZJ);
        } else {
            i = 0;
        }
        C1752360vha c1752360vha = EnumC1752350vhZ.Companion;
        Integer numValueOf = Integer.valueOf(i);
        c1752360vha.getClass();
        return C1752360vha.LIZ(numValueOf);
    }

    public static String LJIIL(RouteIntent routeIntent) {
        Object obj;
        String strLIZJ;
        Intent extra = routeIntent.getExtra();
        if (extra == null || (strLIZJ = LIZJ(extra, "source_page_type")) == null) {
            HashMap<String, Object> mapLIZIZ = C1741890vQh.LIZIZ(routeIntent.getExtra(), "trackParams");
            if (mapLIZIZ != null) {
                obj = mapLIZIZ.get("source_page_type");
            } else {
                obj = null;
            }
            if (!(obj instanceof String)) {
                return null;
            }
            return (String) obj;
        }
        return strLIZJ;
    }

    public static C19EG LJIILIIL(Uri uri) {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        Activity activity;
        C19EG c19eg;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IActivityStackDependencyService.class.getName();
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        Activity[] activityStack = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getActivityStack();
        int length = activityStack.length;
        Object objLJJJJIZL = C13LQ.LJJJJIZL(activityStack);
        if (objLJJJJIZL != null && (objLJJJJIZL instanceof C19EG) && (objLJJJJIZL instanceof InterfaceC1059280dfi)) {
            c19eg = (C19EG) C13LQ.LJJJJIZL(activityStack);
        } else {
            if (length > 1 && (activity = activityStack[length - 2]) != null && (activity instanceof C19EG) && (activity instanceof InterfaceC1059280dfi)) {
                c19eg = (C19EG) activity;
            }
            return null;
        }
        if (c19eg != null) {
            Uri data = c19eg.getIntent().getData();
            if (data != null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "url");
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                String path = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).getPath();
                String host = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).getHost();
                String path2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2).getPath();
                String host2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2).getHost();
                if (u.LJIJI(path, path2, false) && u.LJIJI(host, host2, false)) {
                    return c19eg;
                }
            }
        }
        return null;
    }

    public static boolean LJJ(Uri uri) {
        String host;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return false;
        }
        Uri uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ecom_fix_payment_schema_settings", false) && ((host = uri2.getHost()) == null || host.length() == 0)) {
            return false;
        }
        if (!u.LJIJI(uri2.getHost(), "oec-api.tiktokv.com", false) && !u.LJIJI(uri2.getHost(), (String) C1020403ys.LIZIZ.getValue(), false)) {
            return false;
        }
        return true;
    }

    public static Integer LJJIFFI(RouteIntent routeIntent) {
        HashMap<String, Object> map;
        String strLIZJ;
        EcomSchemaBizTypeDetectionModel ecomSchemaBizTypeDetectionModel = C1014903xz.LIZ;
        List list = ecomSchemaBizTypeDetectionModel.checkPath;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        Integer numLJIIJJI = null;
        if (!list.contains(routeIntent.getPath())) {
            return null;
        }
        Intent extra = routeIntent.getExtra();
        if ((extra == null || (strLIZJ = LIZJ(extra, "biz_type")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZJ)) == null) && Intrinsics.LJFF(ecomSchemaBizTypeDetectionModel.enableReport, Boolean.TRUE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not contains bizType params in path ");
            sbLIZ.append(routeIntent.getPath());
            sbLIZ.append(", schema: ");
            sbLIZ.append(routeIntent.getUrl());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Intent extra2 = routeIntent.getExtra();
        if (extra2 == null || (map = C1741890vQh.LIZIZ(extra2, "trackParams")) == null) {
            map = new HashMap<>();
        }
        if (map.containsKey("biz_type")) {
            map.remove("biz_type");
        }
        if (numLJIIJJI != null) {
            map.put("biz_type", Integer.valueOf(numLJIIJJI.intValue()));
        }
        Intent extra3 = routeIntent.getExtra();
        if (extra3 != null) {
            extra3.putExtra("trackParams", C1741890vQh.LJIIIIZZ(map));
        }
        return numLJIIJJI;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "ec");
    }

    public static Object LIZ(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static String LIZJ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static OrderSubmitRequestParam LJIIIZ(RouteIntent routeIntent, String str) {
        String strLIZJ;
        String strLIZJ2;
        Type type;
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            strLIZJ = LIZJ(extra, "cart_storage_key");
        } else {
            strLIZJ = null;
        }
        if (Intrinsics.LJFF(str, "shop_cart")) {
            C212391189t.LIZ.getClass();
            strLIZJ2 = C212391189t.LIZ("cart_order_submit_params", strLIZJ);
        } else {
            Intent extra2 = routeIntent.getExtra();
            if (extra2 != null) {
                strLIZJ2 = LIZJ(extra2, "requestParams");
            } else {
                strLIZJ2 = null;
            }
        }
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJ(OrderSubmitRequestParam.class));
            } else {
                type = new TypeToken<OrderSubmitRequestParam>() { // from class: X.03uA
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strLIZJ2, type);
            if (!(objFromJson instanceof OrderSubmitRequestParam)) {
                objFromJson = null;
            }
            return (OrderSubmitRequestParam) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Integer LJIIJ(Intent intent, String str) {
        BillInfoRequest billInfoRequest;
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        OrderSubmitRequestParam orderSubmitRequestParam;
        int iCountSkuNum;
        Type type;
        Object objLIZ = C993603uY.LIZ(str, "bill_info_request");
        if (objLIZ instanceof BillInfoRequest) {
            billInfoRequest = (BillInfoRequest) objLIZ;
        } else {
            billInfoRequest = null;
        }
        String strLIZJ = LIZJ(intent, "cart_storage_key");
        String strLIZJ2 = LIZJ(intent, "requestParams");
        C212391189t.LIZ.getClass();
        String strLIZ = C212391189t.LIZ("cart_order_submit_params", strLIZJ);
        boolean z2 = true;
        if (strLIZ != null) {
            strLIZJ2 = strLIZ;
        } else if (strLIZJ2 == null && strLIZJ != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Object objLIZ2 = C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplicationContext()).LIZ(strLIZJ);
            strLIZJ2 = objLIZ2 instanceof String ? (String) objLIZ2 : null;
        }
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                z2 = false;
            }
            if (!z2) {
                type = new TypeToken<OrderSubmitRequestParam>() { // from class: X.03y4
                }.getType();
            } else {
                type = C2371409Qy.LIZJ(C13LE.LJ(OrderSubmitRequestParam.class));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strLIZJ2, type);
            if (!(objFromJson instanceof OrderSubmitRequestParam)) {
                objFromJson = null;
            }
            orderSubmitRequestParam = (OrderSubmitRequestParam) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            orderSubmitRequestParam = null;
        }
        if (billInfoRequest != null) {
            iCountSkuNum = billInfoRequest.countSkuNum();
        } else {
            if (orderSubmitRequestParam == null) {
                return null;
            }
            iCountSkuNum = orderSubmitRequestParam.countSkuNum();
        }
        return Integer.valueOf(iCountSkuNum);
    }

    public final void LJIL(RouteIntent routeIntent, int i) {
        int i2;
        C03O0 c03o0 = C03O0.LIZ;
        if (i == C03SW.DEFAULT_FLOW.getValue()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = this.LL;
        int iLJII = LJII(routeIntent);
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C03O0.LIZIZ);
        linkedHashMap.put("force_full_screen", Integer.valueOf(i2));
        linkedHashMap.put("force_reason", Integer.valueOf(i3));
        linkedHashMap.put("buy_type", Integer.valueOf(iLJII));
        linkedHashMap.put("flow_type", Integer.valueOf(i));
        C1018503yZ.LIZIZ("one_step_checkout_force_full_screen", linkedHashMap, true);
        this.LL = 0;
    }

    public static final void LJ(Intent intent, JSONObject jSONObject, String str) throws JSONException {
        String strLIZJ;
        Uri uri;
        if (intent != null) {
            String strLIZJ2 = LIZJ(intent, str);
            if ((strLIZJ2 != null || (intent != null && (strLIZJ = LIZJ(intent, "params_url")) != null && (uri = UriProtector.parse(strLIZJ)) != null && (strLIZJ2 = C416901jj.LIZ(uri, str)) != null)) && jSONObject != null) {
                jSONObject.put(str, strLIZJ2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Map] */
    public static boolean LJIILJJIL(RouteIntent routeIntent, Context context, Integer num) {
        String strLIZJ;
        AddressPageStarter.AddressEditEnterParams addressEditEnterParamsLIZJ;
        String str;
        Address address;
        Region region;
        boolean zLJFF;
        EcAddressEditRefactorModel ecAddressEditRefactorModel;
        String str2;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        ?? linkedHashMap;
        int i;
        try {
            Intent extra = routeIntent.getExtra();
            if (extra != null) {
                strLIZJ = LIZJ(extra, "is_half_screen");
            } else {
                strLIZJ = null;
            }
            C978703s9 c978703s9 = AddressPageStarter.AddressEditEnterParams.Companion;
            Intent extra2 = routeIntent.getExtra();
            c978703s9.getClass();
            addressEditEnterParamsLIZJ = C978703s9.LIZJ(extra2);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_address_fullscreen_toggle", false)) {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcAddressFullScreenConfigsModel ecAddressFullScreenConfigsModel = C1017003yK.LIZ;
                EcAddressFullScreenConfigsModel ecAddressFullScreenConfigsModel2 = (EcAddressFullScreenConfigsModel) settingsManagerLIZLLL.LJIIIIZZ("ec_address_full_screen_configs", EcAddressFullScreenConfigsModel.class, ecAddressFullScreenConfigsModel);
                if (ecAddressFullScreenConfigsModel2 != null) {
                    ecAddressFullScreenConfigsModel = ecAddressFullScreenConfigsModel2;
                }
                Boolean bool = ecAddressFullScreenConfigsModel.addressEditFullScreen;
                if (bool == null || !bool.booleanValue()) {
                    zLJFF = true;
                } else {
                    zLJFF = false;
                }
            } else if (strLIZJ == null) {
                if (addressEditEnterParamsLIZJ == null || (address = addressEditEnterParamsLIZJ.address) == null || (region = address.region) == null) {
                    str = null;
                } else {
                    str = region.code;
                }
                if (AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(num), "shipping_address", str, null, 8) == EnumC969503qf.TTS_US_ADDRESS_EDIT_V1.getTemplate()) {
                    zLJFF = true;
                }
                zLJFF = false;
            } else {
                zLJFF = Intrinsics.LJFF("1", strLIZJ);
            }
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ecAddressEditRefactorModel = C1017303yN.LIZ;
            EcAddressEditRefactorModel ecAddressEditRefactorModel2 = (EcAddressEditRefactorModel) c0c64LJIILLIIL.LJJII(EcAddressEditRefactorModel.class, ecAddressEditRefactorModel, "ec_address_edit_refactor", true);
            if (ecAddressEditRefactorModel2 != null) {
                ecAddressEditRefactorModel = ecAddressEditRefactorModel2;
            }
            if (zLJFF) {
                str2 = ecAddressEditRefactorModel.schemaHalf;
            } else {
                str2 = ecAddressEditRefactorModel.schema;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR53, e, null);
        }
        if (ecAddressEditRefactorModel.enableRefactor && C123100dR.LIZ(str2) && context != null) {
            Uri uri = routeIntent.getUri();
            if (uri == null) {
                linkedHashMap = C2097608Jq.LJ();
            } else {
                linkedHashMap = new LinkedHashMap();
                for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                    List<String> queryParameters = UriProtector.getQueryParameters(uri, str3);
                    if (!queryParameters.isEmpty()) {
                        int size = queryParameters.size();
                        Object obj = queryParameters;
                        if (size == 1) {
                            obj = ListProtector.get(queryParameters, 0);
                        }
                        linkedHashMap.put(str3, obj);
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) linkedHashMap);
            if (zLJFF) {
                i = 1;
            } else {
                i = 0;
            }
            linkedHashMap2.put("native_screen_status", Integer.valueOf(i));
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str2);
            C1547280qMo.LJ(sparkContext, TemplateData.LJII(linkedHashMap2));
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
            return true;
        }
        if (zLJFF) {
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C981403sa.LIZ(supportFragmentManager, addressEditEnterParamsLIZJ);
                return true;
            }
            C1019103yf.LIZ(EnumC1014603xw.ERR65, null, null);
            return true;
        }
        return false;
    }

    public static void LJIILLIIL(RouteIntent routeIntent, String str, Context context) {
        AddressTabEnterParams addressTabEnterParams;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Bundle bundleLIZIZ;
        Object objLIZ;
        Object obj;
        String str2;
        Type type;
        try {
            Intent extra = routeIntent.getExtra();
            if (extra != null && (bundleLIZIZ = LIZIZ(extra)) != null && (objLIZ = LIZ(bundleLIZIZ, "enter_params_str")) != null) {
                if (!(objLIZ instanceof AddressTabEnterParams)) {
                    obj = null;
                } else {
                    obj = objLIZ;
                }
                addressTabEnterParams = (AddressTabEnterParams) obj;
                if (addressTabEnterParams == null) {
                    if (objLIZ instanceof String) {
                        str2 = (String) objLIZ;
                    } else {
                        str2 = null;
                    }
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJ(AddressTabEnterParams.class));
                        } else {
                            type = new TypeToken<AddressTabEnterParams>() { // from class: X.03rR
                            }.getType();
                        }
                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str2, type);
                        if (!(objLJIIIIZZ instanceof AddressTabEnterParams)) {
                            objLJIIIIZZ = null;
                        }
                        addressTabEnterParams = (AddressTabEnterParams) objLJIIIIZZ;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        addressTabEnterParams = null;
                    }
                }
            } else {
                addressTabEnterParams = null;
            }
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && addressTabEnterParams != null) {
                AddressTabFragment.LLILZIL.getClass();
                C966003q6.LIZ(supportFragmentManager, addressTabEnterParams, str);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1019103yf.LIZ(EnumC1014603xw.ERR52, e2, null);
        }
    }

    public static void LJIJI(RouteIntent routeIntent, String str, Integer num) throws JSONException {
        LJJI(routeIntent, str, num);
        C035Q.LIZ(AFwS228S0000000_1.get$arr$(11));
    }

    public static boolean LJIJJLI(RouteIntent routeIntent, Context context, String str) {
        int i;
        String strLIZJ;
        OrderSubmitEnterParams orderSubmitEnterParams;
        String strLIZJ2;
        boolean z;
        boolean z2;
        int iIntValue;
        String string;
        IECommerceHostService iECommerceHostService;
        boolean z3;
        List<OrderShopDigest> orderShopDigest;
        OrderShopDigest orderShopDigest2;
        List<OrderSKUDTO> list;
        OrderSKUDTO orderSKUDTO;
        String str2;
        String strLIZ;
        Type type;
        String strLIZJ3;
        if (context == null || EcCombinedSkuOspRollbackConfig.LIZ().skuRouterInterceptorRollback) {
            return false;
        }
        Intent extra = routeIntent.getExtra();
        if (extra != null && (strLIZJ3 = LIZJ(extra, "click_from")) != null) {
            i = CastIntegerProtector.parseInt(strLIZJ3);
        } else {
            i = 0;
        }
        boolean zLIZ = C928503k3.LIZ();
        if (i != 1 && (!zLIZ || i != 14)) {
            return false;
        }
        Intent extra2 = routeIntent.getExtra();
        if (extra2 == null || (strLIZJ = LIZJ(extra2, "combined_sku_storage_key")) == null) {
            strLIZJ = "combined_sku_order_req_params";
        }
        String name = null;
        try {
            C212391189t.LIZ.getClass();
            strLIZ = C212391189t.LIZ("combined_sku_order_submit_params", strLIZJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (strLIZ != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(OrderSubmitEnterParams.class));
                } else {
                    type = new TypeToken<OrderSubmitEnterParams>() { // from class: X.03yA
                    }.getType();
                }
                Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(strLIZ, type);
                if (!(objLJIIIIZZ instanceof OrderSubmitEnterParams)) {
                    objLJIIIIZZ = null;
                }
                orderSubmitEnterParams = (OrderSubmitEnterParams) objLJIIIIZZ;
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
                orderSubmitEnterParams = null;
            }
        } else {
            orderSubmitEnterParams = null;
        }
        Intent extra3 = routeIntent.getExtra();
        if (extra3 != null) {
            strLIZJ2 = LIZJ(extra3, "product_id");
        } else {
            strLIZJ2 = null;
        }
        if (orderSubmitEnterParams != null) {
            OrderSubmitRequestParam requestParams = orderSubmitEnterParams.getRequestParams();
            if (requestParams != null && (orderShopDigest = requestParams.getOrderShopDigest()) != null && (orderShopDigest2 = (OrderShopDigest) C13LP.LJJJJZI(orderShopDigest)) != null && (list = orderShopDigest2.orderSKUs) != null && (orderSKUDTO = (OrderSKUDTO) C13LP.LJJJLL(list)) != null && (str2 = orderSKUDTO.productId) != null && Intrinsics.LJFF(strLIZJ2, str2)) {
                z = true;
            } else {
                z = false;
            }
            if (orderSubmitEnterParams != null) {
                boolean zLJFF = Intrinsics.LJFF(orderSubmitEnterParams.isPlatformProduct(), Boolean.TRUE);
                Integer purchaseMethod = orderSubmitEnterParams.getPurchaseMethod();
                int value = EnumC10415045l.SUBSCRIBE.getValue();
                if (purchaseMethod != null && purchaseMethod.intValue() == value && !zLIZ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (orderSubmitEnterParams != null && z && !zLJFF && !z2) {
                    Integer combinedSkuOspType = orderSubmitEnterParams.getCombinedSkuOspType();
                    if (combinedSkuOspType != null) {
                        iIntValue = combinedSkuOspType.intValue();
                    } else {
                        Intent extra4 = routeIntent.getExtra();
                        if (extra4 != null && LIZJ(extra4, "pdp_from") != null) {
                            iIntValue = 1;
                        } else {
                            iIntValue = -1;
                        }
                    }
                    C928203k0 c928203k0 = C928203k0.LIZ;
                    String strLJIIL = LJIIL(routeIntent);
                    c928203k0.getClass();
                    if (!C928203k0.LIZJ(iIntValue, 0, strLJIIL, null, null)) {
                        return false;
                    }
                    String originUrl = routeIntent.getOriginUrl();
                    if (originUrl != null && originUrl.length() != 0) {
                        string = C919503ib.LJ(originUrl, "/order_submit_sku");
                    } else {
                        string = C919503ib.LIZJ("aweme://ec/order_submit_sku", C2097608Jq.LJ()).build().toString();
                    }
                    routeIntent.setUrl(string);
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        if (iECommerceHostService != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String name2 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService != null) {
                            name = iECommerceHostService.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((IApplicationDependencyService) iECommerceHostService).getCurrentActivity(), string);
                    smartRouteBuildRoute.withParam(routeIntent.getExtra());
                    smartRouteBuildRoute.withParam("store_node_id", str);
                    smartRouteBuildRoute.withParam("buy_type", 0);
                    smartRouteBuildRoute.withParam("combined_sku_enable", true);
                    smartRouteBuildRoute.open();
                    return true;
                }
            }
        }
        C212391189t.LIZ.getClass();
        C212391189t.LIZIZ("cart_order_submit_params", strLIZJ, null);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x025f A[Catch: s -> 0x0274, TryCatch #3 {s -> 0x0274, blocks: (B:133:0x0254, B:135:0x0268, B:138:0x0271, B:134:0x025f), top: B:265:0x024d }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x035c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJI(com.bytedance.router.RouteIntent r34, java.lang.String r35, java.lang.Integer r36) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor.LJJI(com.bytedance.router.RouteIntent, java.lang.String, java.lang.Integer):void");
    }

    public static void LJJII(String str, RouteIntent routeIntent, String str2) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Object objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        Object objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        Object c098200Yq4;
        Long lValueOf;
        Long l;
        Object obj;
        Object objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
        Integer numLJIIJ;
        try {
            Uri uri = routeIntent.getUri();
            try {
                c098200Yq2 = C1741890vQh.LIZJ(uri, "trackParams");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            HashMap map = (HashMap) c098200Yq2;
            if (map == null) {
                try {
                    c098200Yq3 = C1741890vQh.LIZJ(uri, "track_params");
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq3 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                    c098200Yq3 = null;
                }
                map = (HashMap) c098200Yq3;
                if (map == null) {
                    map = (HashMap) C993603uY.LIZ(str2, "trackParams");
                }
            }
            if (uri == null) {
                objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            } else {
                try {
                    objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "previous_page");
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
            }
            C189200o6.m2constructorimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            if (C189200o6.m7isFailureimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            }
            Object obj2 = (String) objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            if (obj2 == null) {
                if (map != null) {
                    obj2 = map.get("previous_page");
                } else {
                    obj2 = null;
                }
            }
            if (uri == null) {
                objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
            } else {
                try {
                    objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "entrance_form");
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = new C098200Yq(th4);
                    C189200o6.m2constructorimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                }
            }
            C189200o6.m2constructorimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            if (C189200o6.m7isFailureimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
            }
            Object obj3 = (String) objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
            if (obj3 == null) {
                if (map != null) {
                    obj3 = map.get("entrance_form");
                } else {
                    obj3 = null;
                }
            }
            if (uri == null) {
                objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = null;
            } else {
                try {
                    objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_info");
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = new C098200Yq(th5);
                    C189200o6.m2constructorimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                }
            }
            C189200o6.m2constructorimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
            if (C189200o6.m7isFailureimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = null;
            }
            Object obj4 = (String) objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
            if (obj4 == null) {
                if (map != null) {
                    obj4 = map.get("enter_from_info");
                } else {
                    obj4 = null;
                }
            }
            if (uri == null) {
                c098200Yq4 = null;
            } else {
                try {
                    c098200Yq4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "start_click_time");
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                    c098200Yq4 = new C098200Yq(th6);
                    C189200o6.m2constructorimpl(c098200Yq4);
                }
            }
            C189200o6.m2constructorimpl(c098200Yq4);
            if (C189200o6.m7isFailureimpl(c098200Yq4)) {
                c098200Yq4 = null;
            }
            String str3 = (String) c098200Yq4;
            if (str3 != null) {
                lValueOf = Long.valueOf(CastLongProtector.parseLong(str3));
            } else {
                lValueOf = null;
            }
            if (C1758250vr5.LIZ().startClickTime) {
                l = lValueOf;
            } else {
                l = null;
            }
            if (map != null) {
                obj = map.get("source_page_type");
            } else {
                obj = null;
            }
            if (uri == null) {
                objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = null;
            } else {
                try {
                    objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "click_from");
                } catch (Throwable th7) {
                    TryCatchGuardChecker.doCheck(th7);
                    objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = new C098200Yq(th7);
                    C189200o6.m2constructorimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                }
            }
            C189200o6.m2constructorimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
            if (C189200o6.m7isFailureimpl(objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
                objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = null;
            }
            String str4 = (String) objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
            HashMap<String, Object> map2 = new HashMap<>();
            if (obj2 != null) {
                map2.put("previous_page", obj2);
            }
            if (obj3 != null) {
                map2.put("entrance_form", obj3);
            }
            if (obj4 != null) {
                map2.put("enter_from_info", obj4);
            }
            if (lValueOf != null) {
                map2.put("start_to_now", Long.valueOf(System.currentTimeMillis() - lValueOf.longValue()));
            }
            if (obj != null) {
                map2.put("source_page_type", obj);
            }
            if (Intrinsics.LJFF(str, "order_submit")) {
                Intent extra = routeIntent.getExtra();
                if (extra != null && (numLJIIJ = LJIIJ(extra, str2)) != null) {
                    map2.put("sku_num", Integer.valueOf(numLJIIJ.intValue()));
                }
            } else if (Intrinsics.LJFF(str, "sku") && str4 != null) {
                map2.put("click_from", str4);
            }
            ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIIZZ(str, map2, l, null, routeIntent.getUrl());
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th8) {
            TryCatchGuardChecker.doCheck(th8);
            c098200Yq = new C098200Yq(th8);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1019103yf.LIZ(EnumC1014603xw.ERR39, thM5exceptionOrNullimpl, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIJ(RouteIntent routeIntent, String str, Integer num) throws JSONException {
        int i;
        Object obj;
        Map<String, Object> orderRequestParams;
        String string;
        IECommerceHostService iECommerceHostService;
        boolean z;
        String strLIZJ;
        String string2;
        int iIntValue;
        IECommerceHostService iECommerceHostService2;
        boolean z2;
        String strLIZJ2;
        Integer numLJIIJJI;
        String string3;
        IECommerceHostService iECommerceHostService3;
        boolean z3;
        this.LL = 0;
        C928203k0 c928203k0 = C928203k0.LIZ;
        Object name = null;
        if (C928203k0.LJ(c928203k0, LJIIIZ(routeIntent, null), null, 2)) {
            String originUrl = routeIntent.getOriginUrl();
            if (originUrl != null && originUrl.length() != 0) {
                string3 = C919503ib.LJ(originUrl, "/order_submit_mini");
            } else {
                string3 = C919503ib.LIZJ("aweme://ec/order_submit_mini", C2097608Jq.LJ()).build().toString();
            }
            routeIntent.setUrl(string3);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService3 != null) {
                    name = iECommerceHostService3.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((IApplicationDependencyService) iECommerceHostService3).getCurrentActivity(), string3);
            smartRouteBuildRoute.withParam(routeIntent.getExtra());
            smartRouteBuildRoute.withParam("store_node_id", str);
            smartRouteBuildRoute.open();
            return true;
        }
        LJIIIZ(routeIntent, null);
        if (C928203k0.LJI(c928203k0, null, routeIntent, 1)) {
            String originUrl2 = routeIntent.getOriginUrl();
            if (originUrl2 != null && originUrl2.length() != 0) {
                string2 = C919503ib.LJ(originUrl2, "/order_submit_sku");
            } else {
                string2 = C919503ib.LIZJ("aweme://ec/order_submit_sku", C2097608Jq.LJ()).build().toString();
            }
            Intent extra = routeIntent.getExtra();
            if (extra != null && (strLIZJ2 = LIZJ(extra, "sea_one_step_height_style")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZJ2)) != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = ((Number) C1017203yM.LIZ.getValue()).intValue();
            }
            routeIntent.setUrl(string2);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name3, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(((IApplicationDependencyService) iECommerceHostService2).getCurrentActivity(), string2);
            smartRouteBuildRoute2.withParam(routeIntent.getExtra());
            smartRouteBuildRoute2.withParam("store_node_id", str);
            smartRouteBuildRoute2.withParam("sea_one_step_height_style", iIntValue);
            smartRouteBuildRoute2.open();
            return true;
        }
        String strLJIIL = LJIIL(routeIntent);
        Intent extra2 = routeIntent.getExtra();
        if (extra2 != null && (strLIZJ = LIZJ(extra2, "combined_sku_osp_type")) != null) {
            i = CastIntegerProtector.parseInt(strLIZJ);
        } else {
            i = -1;
        }
        if (C928203k0.LIZJ(i, Integer.valueOf(LJII(routeIntent)), strLJIIL, new AwS118S1200000_1(this, routeIntent, str, 3), new AwS580S0100000_1(this, 340)) && !LJI(routeIntent)) {
            String originUrl3 = routeIntent.getOriginUrl();
            if (originUrl3 != null && originUrl3.length() != 0) {
                string = C919503ib.LJ(originUrl3, "/order_submit_sku");
            } else {
                string = C919503ib.LIZJ("aweme://ec/order_submit_sku", C2097608Jq.LJ()).build().toString();
            }
            routeIntent.setUrl(string);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            SmartRoute smartRouteBuildRoute3 = SmartRouter.buildRoute(((IApplicationDependencyService) iECommerceHostService).getCurrentActivity(), string);
            smartRouteBuildRoute3.withParam(routeIntent.getExtra());
            smartRouteBuildRoute3.withParam("store_node_id", str);
            smartRouteBuildRoute3.withParam("combined_sku_enable", true);
            smartRouteBuildRoute3.open();
            LJIL(routeIntent, C03SW.COMBINED_SKU_FLOW.getValue());
            return true;
        }
        if (this.LL == 0) {
            if (LJI(routeIntent) || (LJII(routeIntent) != 0 && LJII(routeIntent) != 2)) {
                this.LL = 8;
            } else {
                OrderSubmitRequestParam orderSubmitRequestParamLJIIIZ = LJIIIZ(routeIntent, LJIIL(routeIntent));
                if (orderSubmitRequestParamLJIIIZ != null && (orderRequestParams = orderSubmitRequestParamLJIIIZ.getOrderRequestParams()) != null) {
                    obj = orderRequestParams.get("force_normal_checkout");
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    name = obj;
                }
                if (Intrinsics.LJFF(name, Boolean.TRUE)) {
                    this.LL = 4;
                } else {
                    C934703l3.LL.getClass();
                    if (!C934703l3.LJ() || C934703l3.LIZ()) {
                        this.LL = 6;
                    }
                }
            }
        }
        LJJI(routeIntent, str, num);
        C035Q.LIZ(AFwS228S0000000_1.get$arr$(377));
        LJIL(routeIntent, C03SW.DEFAULT_FLOW.getValue());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05d2 A[PHI: r20 r21 r22 r36
      0x05d2: PHI (r20v3 java.lang.Boolean) = (r20v1 java.lang.Boolean), (r20v4 java.lang.Boolean) binds: [B:410:0x06c5, B:341:0x05d0] A[DONT_GENERATE, DONT_INLINE]
      0x05d2: PHI (r21v4 java.lang.Float) = (r21v2 java.lang.Float), (r21v5 java.lang.Float) binds: [B:410:0x06c5, B:341:0x05d0] A[DONT_GENERATE, DONT_INLINE]
      0x05d2: PHI (r22v5 java.lang.Float) = (r22v3 java.lang.Float), (r22v6 java.lang.Float) binds: [B:410:0x06c5, B:341:0x05d0] A[DONT_GENERATE, DONT_INLINE]
      0x05d2: PHI (r36v2 boolean) = (r36v0 boolean), (r36v3 boolean) binds: [B:410:0x06c5, B:341:0x05d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0658 A[PHI: r6
      0x0658: PHI (r6v10 java.lang.String) = (r6v3 java.lang.String), (r6v11 java.lang.String) binds: [B:376:0x0656, B:374:0x0653] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06a9 A[PHI: r12
      0x06a9: PHI (r12v3 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String) binds: [B:348:0x05e0, B:346:0x05dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06b7 A[PHI: r22
      0x06b7: PHI (r22v1 java.lang.Float) = (r22v0 java.lang.Float), (r22v9 java.lang.Float) binds: [B:401:0x06b3, B:332:0x05a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06bd A[PHI: r21 r22
      0x06bd: PHI (r21v1 java.lang.Float) = (r21v0 java.lang.Float), (r21v7 java.lang.Float) binds: [B:404:0x06b9, B:335:0x05b4] A[DONT_GENERATE, DONT_INLINE]
      0x06bd: PHI (r22v2 java.lang.Float) = (r22v1 java.lang.Float), (r22v8 java.lang.Float) binds: [B:404:0x06b9, B:335:0x05b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06c3 A[PHI: r20 r21 r22
      0x06c3: PHI (r20v1 java.lang.Boolean) = (r20v0 java.lang.Boolean), (r20v5 java.lang.Boolean) binds: [B:407:0x06bf, B:338:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06c3: PHI (r21v2 java.lang.Float) = (r21v1 java.lang.Float), (r21v6 java.lang.Float) binds: [B:407:0x06bf, B:338:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06c3: PHI (r22v3 java.lang.Float) = (r22v2 java.lang.Float), (r22v7 java.lang.Float) binds: [B:407:0x06bf, B:338:0x05c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06eb A[Catch: s -> 0x0702, TryCatch #10 {s -> 0x0702, blocks: (B:417:0x06e0, B:419:0x06f4, B:422:0x06fd, B:418:0x06eb), top: B:511:0x06d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0739 A[PHI: r10 r48 r53
      0x0739: PHI (r10v4 int) = (r10v1 int), (r10v5 int) binds: [B:458:0x07a8, B:440:0x0735] A[DONT_GENERATE, DONT_INLINE]
      0x0739: PHI (r48v4 java.lang.String) = (r48v1 java.lang.String), (r48v5 java.lang.String) binds: [B:458:0x07a8, B:440:0x0735] A[DONT_GENERATE, DONT_INLINE]
      0x0739: PHI (r53v3 boolean) = (r53v0 boolean), (r53v4 boolean) binds: [B:458:0x07a8, B:440:0x0735] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0751 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x07ab A[PHI: r10 r48 r53
      0x07ab: PHI (r10v2 int) = (r10v1 int), (r10v4 int) binds: [B:458:0x07a8, B:442:0x073f] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r48v2 java.lang.String) = (r48v1 java.lang.String), (r48v4 java.lang.String) binds: [B:458:0x07a8, B:442:0x073f] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r53v1 boolean) = (r53v0 boolean), (r53v3 boolean) binds: [B:458:0x07a8, B:442:0x073f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x07df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x083d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam LIZLLL(android.content.Intent r62, java.lang.String r63, java.lang.Integer r64, java.lang.String r65) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor.LIZLLL(android.content.Intent, java.lang.String, java.lang.Integer, java.lang.String):com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam");
    }

    public static boolean LJIILL(RouteIntent routeIntent, String str, Context context, Integer num) {
        String strLIZJ;
        String strLIZJ2;
        String strLIZJ3;
        boolean z;
        boolean z2;
        String strLIZJ4;
        String strLIZJ5;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        String strLIZJ6;
        try {
            Intent extra = routeIntent.getExtra();
            if (extra != null) {
                strLIZJ = LIZJ(extra, "is_half_screen");
            } else {
                strLIZJ = null;
            }
            Intent extra2 = routeIntent.getExtra();
            if (extra2 != null) {
                strLIZJ2 = LIZJ(extra2, "selected_address_id");
            } else {
                strLIZJ2 = null;
            }
            Intent extra3 = routeIntent.getExtra();
            if (extra3 != null) {
                strLIZJ3 = LIZJ(extra3, "unavailable_address_ids");
            } else {
                strLIZJ3 = null;
            }
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_address_fullscreen_toggle", false)) {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcAddressFullScreenConfigsModel ecAddressFullScreenConfigsModel = C1017003yK.LIZ;
                EcAddressFullScreenConfigsModel ecAddressFullScreenConfigsModel2 = (EcAddressFullScreenConfigsModel) settingsManagerLIZLLL.LJIIIIZZ("ec_address_full_screen_configs", EcAddressFullScreenConfigsModel.class, ecAddressFullScreenConfigsModel);
                if (ecAddressFullScreenConfigsModel2 != null) {
                    ecAddressFullScreenConfigsModel = ecAddressFullScreenConfigsModel2;
                }
                Boolean bool = ecAddressFullScreenConfigsModel.addressListFullScreen;
                if (bool == null || !bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                if (AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(num), "shipping_info", null, null, 12) == EnumC969503qf.TTS_US_ADDRESS_LIST_V1.getTemplate()) {
                    z = true;
                }
                z = false;
            }
            Intent extra4 = routeIntent.getExtra();
            if (extra4 == null || (strLIZJ6 = LIZJ(extra4, "is_select_mode")) == null || !(z2 = Boolean.parseBoolean(strLIZJ6))) {
                Intent extra5 = routeIntent.getExtra();
                if (extra5 != null && (strLIZJ5 = LIZJ(extra5, "from_incentive")) != null) {
                    z2 = Boolean.parseBoolean(strLIZJ5);
                    if (!z2) {
                    }
                } else {
                    z2 = false;
                }
                Intent extra6 = routeIntent.getExtra();
                if (extra6 != null && (strLIZJ4 = LIZJ(extra6, "is_select_mode")) != null && CastIntegerProtector.parseInt(strLIZJ4) == 1) {
                    z2 = true;
                }
            }
            if (Intrinsics.LJFF("1", strLIZJ) || (z && z2)) {
                if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                    C976403rm c976403rm = AddressPageStarter.AddressListEnterParams.Companion;
                    Intent extra7 = routeIntent.getExtra();
                    c976403rm.getClass();
                    C976203rk.LIZ(supportFragmentManager, C976403rm.LIZIZ(extra7), str, strLIZJ2, strLIZJ3);
                    return true;
                }
                C1019103yf.LIZ(EnumC1014603xw.ERR64, null, null);
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR52, e, null);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ce A[Catch: s -> 0x02e3, TryCatch #7 {s -> 0x02e3, blocks: (B:181:0x02c3, B:183:0x02d7, B:186:0x02e0, B:182:0x02ce), top: B:300:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x035e A[Catch: s -> 0x0373, TryCatch #6 {s -> 0x0373, blocks: (B:221:0x0353, B:223:0x0367, B:226:0x0370, B:222:0x035e), top: B:298:0x034c }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150 A[Catch: all -> 0x015e, TryCatch #9 {all -> 0x015e, blocks: (B:78:0x0148, B:80:0x0150, B:81:0x0158), top: B:304:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0190 A[Catch: all -> 0x019e, TryCatch #8 {all -> 0x019e, blocks: (B:93:0x0188, B:95:0x0190, B:96:0x0198), top: B:302:0x0188 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(com.bytedance.router.RouteIntent r48, java.lang.String r49, android.content.Context r50, android.os.Bundle r51) {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor.LJIIZILJ(com.bytedance.router.RouteIntent, java.lang.String, android.content.Context, android.os.Bundle):void");
    }
}
