package com.ss.android.ugc.tiktok.report.utils;

import X.C0C64;
import X.C1129204bK;
import X.C1381110m2n;
import X.C1381180m2u;
import X.C1954807lC;
import X.C2097908Jt;
import X.EnumC1381120m2o;
import X.InterfaceC1381130m2p;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class ReportConfigUtils {
    public static final ReportConfigUtils INSTANCE = new ReportConfigUtils();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public final int resolveNavType(InterfaceC1381130m2p interfaceC1381130m2p) {
        ?? linkedHashMap;
        EnumC1381120m2o enumC1381120m2oLJII = interfaceC1381130m2p.LJII();
        if (enumC1381120m2oLJII != null) {
            int i = C1381110m2n.LIZ[enumC1381120m2oLJII.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return 1;
                }
                throw new C1954807lC();
            }
            return 0;
        }
        Map map = (Map) C0C64.LJIILLIIL().LJJII(Map.class, C1129204bK.LIZ, "report_page_presentation_style", true);
        if (map != null) {
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), Integer.valueOf((int) ((Number) entry.getValue()).doubleValue()));
            }
        } else {
            linkedHashMap = C1129204bK.LIZ;
        }
        Integer num = (Integer) linkedHashMap.get(interfaceC1381130m2p.getReportType());
        if (num == null && (num = (Integer) linkedHashMap.get("server_default")) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_report_utils_ReportConfigUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final InterfaceC1381130m2p uriToReportConfig(Uri.Builder builder, Bundle bundle) {
        String string;
        Uri uriBuild = builder.build();
        C1381180m2u c1381180m2u = new C1381180m2u();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "report_type");
        if (!(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter instanceof String) || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "video";
        }
        c1381180m2u.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        c1381180m2u.LIZJ = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "owner_id");
        c1381180m2u.LIZIZ = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "object_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str : UriProtector.getQueryParameterNames(uriBuild)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, str);
            if (str != null) {
                switch (str.hashCode()) {
                    case -1489595877:
                        if (str.equals("object_id")) {
                        }
                        break;
                    case -246541467:
                        if (str.equals("report_type")) {
                        }
                        break;
                    case 96965648:
                        if (str.equals("extra")) {
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
                                linkedHashMap2.put("extra", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                            }
                        }
                        break;
                    case 1663147559:
                        if (str.equals("owner_id")) {
                        }
                        break;
                }
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
                linkedHashMap.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            }
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_report_utils_ReportConfigUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_report_utils_ReportConfigUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str2);
                if (objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_report_utils_ReportConfigUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_get != null && (string = objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_report_utils_ReportConfigUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_get.toString()) != null) {
                    linkedHashMap.put(str2, string);
                }
            }
        }
        c1381180m2u.LIZLLL = linkedHashMap;
        c1381180m2u.LJ = linkedHashMap2;
        return c1381180m2u;
    }

    public final InterfaceC1381130m2p convertToReportConfig(Uri.Builder builder, Bundle bundle) {
        return uriToReportConfig(builder, bundle);
    }
}
