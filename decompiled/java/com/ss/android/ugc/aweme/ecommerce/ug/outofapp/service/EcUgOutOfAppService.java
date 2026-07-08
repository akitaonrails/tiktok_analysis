package com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service;

import X.C00ZS;
import X.C13LP;
import X.C13LQ;
import X.C1735560vGU;
import X.C2188811AlT;
import X.C2284008xC;
import X.C2284308xF;
import X.C2284408xG;
import X.C2341109Fh;
import X.C5182020e;
import X.C786410Ut5;
import android.app.Activity;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.settings.EcSeoDiversionConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.settings.EcSeoShopHostDiversionSettings;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.sharepdp.libra.PdpShareRecurringConfigSettings;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class EcUgOutOfAppService implements IEcUgOutOfAppService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService
    public final List<String> LJFF() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Object[] objArr = C2284308xF.LIZ;
        Object[] objArr2 = (Object[]) settingsManagerLIZLLL.LJIIIIZZ("ec_deeplink_allow_path", String[].class, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        return C13LQ.LJJLL(objArr);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService
    public final String LIZ(Uri uri) {
        EcSeoShopHostDiversionSettings.CommonPathConfig commonPathConfig;
        boolean z;
        boolean z2;
        String strLIZIZ = null;
        if (uri == null) {
            return null;
        }
        C2284008xC.LIZ.getClass();
        EcSeoShopHostDiversionSettings.CommonPathConfig commonPathConfig2 = EcSeoShopHostDiversionSettings.LIZ;
        String encodedPath = uri.getEncodedPath();
        String str = "";
        if (encodedPath == null) {
            encodedPath = "";
        }
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            commonPathConfig = EcSeoShopHostDiversionSettings.LIZ;
            EcSeoShopHostDiversionSettings.CommonPathConfig commonPathConfig3 = (EcSeoShopHostDiversionSettings.CommonPathConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_seo_shop_host_diversion_config", EcSeoShopHostDiversionSettings.CommonPathConfig.class, commonPathConfig);
            if (commonPathConfig3 != null) {
                commonPathConfig = commonPathConfig3;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            commonPathConfig = EcSeoShopHostDiversionSettings.LIZ;
        }
        Map<String, String> map = commonPathConfig.map;
        if (encodedPath.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !map.isEmpty()) {
            String str2 = null;
            for (String str3 : map.keySet()) {
                if (str3.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && u.LJJIIJZLJL(encodedPath, str3, false) && (str2 == null || str3.length() > str2.length())) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                String str4 = map.get(str2);
                if (str4 != null) {
                    str = str4;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(encodedPath.substring(str2.length()));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        if (strLIZIZ != null) {
            uri = uri.buildUpon().encodedPath(strLIZIZ).build();
        }
        return C2284008xC.LIZIZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService
    public final String LIZJ(Uri uri) {
        boolean z;
        String strLJJIFFI = null;
        if (uri == null) {
            return null;
        }
        C2284008xC.LIZ.getClass();
        EcSeoDiversionConfigSettings.EcSeoDiversionConfigModel ecSeoDiversionConfigModelLIZ = EcSeoDiversionConfigSettings.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("config", ecSeoDiversionConfigModelLIZ.toString());
        if (uri.getPathSegments().size() < 2) {
            linkedHashMap.put("error_info", "Invalid Uri");
            C2284008xC.LIZJ(uri);
            return C2284008xC.LIZ();
        }
        String str = ecSeoDiversionConfigModelLIZ.defaultSearchSchema;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return C2284008xC.LIZ();
        }
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(ecSeoDiversionConfigModelLIZ.defaultSearchSchema).buildUpon();
            String scheme = builderBuildUpon.build().getScheme();
            if (scheme != null && !Intrinsics.LJFF(scheme, "musically")) {
                builderBuildUpon.scheme("musically");
            }
            String str2 = (String) C13LP.LJJJLZIJ(1, uri.getPathSegments());
            if (str2 != null) {
                strLJJIFFI = u.LJJIFFI(str2, "-", " ", false);
            }
            builderBuildUpon.appendQueryParameter("keyword", strLJJIFFI);
            builderBuildUpon.appendQueryParameter("ec_ug_skip_channel_check", "true");
            if (Intrinsics.LJFF(C13LP.LJJJLZIJ(0, uri.getPathSegments()), "discover")) {
                builderBuildUpon.appendQueryParameter("ecom_seo_extra_params", C786410Ut5.J3(new JSONObject().put("source_page_type", "discover")));
            }
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            if (queryParameterNames != null) {
                for (String str3 : queryParameterNames) {
                    builderBuildUpon.appendQueryParameter(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
                }
            }
            return builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Uri parse exception: ");
            String message = e.getMessage();
            if (message == null) {
                message = "Empty exception message";
            }
            sbLIZ.append(message);
            linkedHashMap.put("error_info", C2188811AlT.LIZIZ(sbLIZ));
            C2284008xC.LIZJ(uri);
            return C2284008xC.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService
    public final String LJI(Uri uri) {
        if (uri == null) {
            return null;
        }
        C2284008xC.LIZ.getClass();
        return C2284008xC.LIZIZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService
    public final boolean LIZIZ(Activity activity, Uri uri) {
        C1735560vGU.LIZ.getClass();
        Pair pairLIZ = C1735560vGU.LIZ(activity, uri, false);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        C5182020e c5182020e = new C5182020e(pairLIZ, (Pair<Boolean, String>) 202);
        c2341109Fh.getClass();
        C2341109Fh.LJFF(c5182020e);
        return ((Boolean) pairLIZ.getFirst()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a A[Catch: all -> 0x016d, TryCatch #0 {all -> 0x016d, blocks: (B:36:0x00f6, B:38:0x0107, B:40:0x010f, B:42:0x011a, B:45:0x012a, B:47:0x0136, B:50:0x0144, B:52:0x0148), top: B:64:0x00f6 }] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.net.Uri] */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent LIZLLL(android.app.Activity r40, android.net.Uri r41) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.EcUgOutOfAppService.LIZLLL(android.app.Activity, android.net.Uri):android.content.Intent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, android.net.Uri] */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ(android.net.Uri r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.EcUgOutOfAppService.LJ(android.net.Uri, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent LJII(android.app.Activity r33, android.net.Uri r34) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.EcUgOutOfAppService.LJII(android.app.Activity, android.net.Uri):android.content.Intent");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService
    public final boolean LJIIIIZZ(Activity activity, Uri uri) {
        C1735560vGU.LIZ.getClass();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        C5182020e c5182020e = new C5182020e(uri, 203);
        c2341109Fh.getClass();
        C2341109Fh.LJFF(c5182020e);
        return ((Boolean) C1735560vGU.LIZ(activity, uri, true).getFirst()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService
    public final String handlePdpShareInfo(String str, String str2, Map<String, Object> map) {
        PdpShareRecurringConfigSettings.PdpShareRecurringConfigModel pdpShareRecurringConfigModel;
        boolean z;
        C2284408xG.LIZ.getClass();
        String strJ3 = "";
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            pdpShareRecurringConfigModel = PdpShareRecurringConfigSettings.LIZ;
            PdpShareRecurringConfigSettings.PdpShareRecurringConfigModel pdpShareRecurringConfigModel2 = (PdpShareRecurringConfigSettings.PdpShareRecurringConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pdp_share_recurring_config", PdpShareRecurringConfigSettings.PdpShareRecurringConfigModel.class, pdpShareRecurringConfigModel);
            if (pdpShareRecurringConfigModel2 != null) {
                pdpShareRecurringConfigModel = pdpShareRecurringConfigModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            pdpShareRecurringConfigModel = PdpShareRecurringConfigSettings.LIZ;
        }
        Integer num = pdpShareRecurringConfigModel.enableShopTabPopup;
        if (num != null && num.intValue() == 1 && map != null) {
            map.put("enable_shop_tab_popup", 1);
        }
        if (((Number) C00ZS.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && map != null) {
            map.put("device_id", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        }
        try {
            Integer num2 = pdpShareRecurringConfigModel.enableOpenGraph;
            if (num2 != null && num2.intValue() == 1) {
                JSONObject jSONObject = new JSONObject();
                if (str == null) {
                    str = "";
                }
                JSONObject jSONObjectPut = jSONObject.put("title", str);
                if (str2 == null) {
                    str2 = "";
                }
                strJ3 = C786410Ut5.J3(jSONObjectPut.put("image", str2));
                return strJ3;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return strJ3;
    }
}
