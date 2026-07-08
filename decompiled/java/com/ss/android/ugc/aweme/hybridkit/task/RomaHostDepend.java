package com.ss.android.ugc.aweme.hybridkit.task;

import X.C080U;
import X.C08KC;
import X.C098200Yq;
import X.C09S2;
import X.C0C5P;
import X.C0X52;
import X.C0XB4;
import X.C0XMB;
import X.C1319780kRs;
import X.C13LQ;
import X.C1494590ozp;
import X.C1499850p8J;
import X.C1520080pew;
import X.C1520200pf8;
import X.C1520350pfN;
import X.C1520360pfO;
import X.C1550330qRj;
import X.C1697810uHb;
import X.C189200o6;
import X.C2097608Jq;
import X.C2107108Nh;
import X.C2213981Bky;
import X.C2222691Bz1;
import X.C786410Ut5;
import X.EnumC1153760g86;
import X.EnumC1536200q4w;
import X.EnumC993170bx5;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.content.Context;
import com.bytedance.hybrid.spark.roma.IRomaHostDepend;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hybridkit.experiment.RomaGlobalDynamicParamsConfig;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class RomaHostDepend implements IRomaHostDepend {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Long LJI() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            return iSparkHostApi.LJI();
        }
        return null;
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final String LJIIIZ() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.LJJIJIL();
        }
        return null;
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final C1550330qRj LJIIJJI() throws JSONException {
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        Context applicationContext = c2213981Bky.getApplicationContext();
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        String str = CardStruct.IStatusCode.DEFAULT;
        if (iSparkHostApi == null) {
            String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null) {
                str = strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
            }
            long versionCode = c2213981Bky.getVersionCode();
            int iLIZ = C1319780kRs.LIZ(applicationContext);
            String strLIZ = C0XB4.LIZ(applicationContext);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_pad", "false");
            return new C1550330qRj(iLIZ, "", str, versionCode, null, strLIZ, C786410Ut5.J3(jSONObject));
        }
        String str2 = iSparkHostApi.LJJIIJ().LIZ;
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2 = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2 != null) {
            str = strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2;
        }
        long versionCode2 = c2213981Bky.getVersionCode();
        String str3 = iSparkHostApi.LJJIIJ().LIZIZ;
        int iLIZ2 = C1319780kRs.LIZ(applicationContext);
        String strLIZ2 = C0XB4.LIZ(applicationContext);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_pad", String.valueOf(iSparkHostApi.LJJIJLIJ()));
        return new C1550330qRj(iLIZ2, str2, str, versionCode2, str3, strLIZ2, C786410Ut5.J3(jSONObject2));
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final EnumC1153760g86 LJIIL() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.LJJIIJZLJL();
        }
        return Intrinsics.LJFF("PROD", "BOE") ? EnumC1153760g86.BOE : Intrinsics.LJFF("PROD", "PPE") ? EnumC1153760g86.PPE : EnumC1153760g86.PROD;
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Set<String> LJIILIIL() {
        return C13LQ.LJLIIL(new String[]{"tiktokcdn.com", "tiktokcdn-us.com", "tiktokcdn-eu.com"});
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Set<String> LJIILJJIL() {
        return C13LQ.LJLIIL(new String[]{"tiktok.com", "tiktok.us", "tiktokv.com", "tiktokv.us"});
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final String LJIIZILJ() {
        Object c098200Yq;
        try {
            InputStream inputStreamOpen = C2213981Bky.LIZIZ.getApplicationContext().getAssets().open("roma_integrated_fallback_config.json");
            try {
                c098200Yq = C08KC.LIZJ(new InputStreamReader(inputStreamOpen, Charsets.UTF_8));
                C2107108Nh.LIZ(inputStreamOpen, null);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(inputStreamOpen, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        C189200o6.m8isSuccessimpl(c098200Yq);
        return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final String getOpRegion() {
        String strLIZ;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        return (iSparkHostApi == null || iSparkHostApi.LLIL() == null || (strLIZ = C2222691Bz1.LIZ()) == null) ? "" : strLIZ;
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final boolean isLocalTest() {
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        return c2213981Bky.isDebug() || Intrinsics.LJFF(c2213981Bky.getChannel(), "local_test");
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final boolean LIZLLL(String str) {
        SparkHostApiImpl sparkHostApiImplLLIIJI;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null && (sparkHostApiImplLLIIJI = iSparkHostApi.LLIIJI()) != null) {
            return sparkHostApiImplLLIIJI.LLJZIJLIL(str, EnumC1536200q4w.THIRD_PARTY_URL);
        }
        return false;
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Map<String, String> LJIILL(String str) {
        Map<String, String> mapLLZZZIL;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        RomaGlobalDynamicParamsConfig.RomaGlobalDynamicParamsModel romaGlobalDynamicParamsModel = RomaGlobalDynamicParamsConfig.LIZ;
        RomaGlobalDynamicParamsConfig.RomaGlobalDynamicParamsModel romaGlobalDynamicParamsModel2 = (RomaGlobalDynamicParamsConfig.RomaGlobalDynamicParamsModel) settingsManagerLIZLLL.LJIIIIZZ("roma_global_dynamic_params", RomaGlobalDynamicParamsConfig.RomaGlobalDynamicParamsModel.class, romaGlobalDynamicParamsModel);
        if (romaGlobalDynamicParamsModel2 != null) {
            romaGlobalDynamicParamsModel = romaGlobalDynamicParamsModel2;
        }
        if (romaGlobalDynamicParamsModel.enableLive && (u.LJJIIJZLJL(a0.LJJLIL(str, "://", str), "webcast", false) || a0.LJJIIZI(str, "__live_platform__=webcast", false))) {
            ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi == null || (mapLLZZZIL = iSparkHostApi.LLZZZIL()) == null) {
                return C2097608Jq.LJ();
            }
            return mapLLZZZIL;
        }
        return C2097608Jq.LJ();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Object LJIILLIIL(Class cls) {
        Object c098200Yq;
        try {
            if (LJIIL() == EnumC1153760g86.BOE) {
                C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ("https://api.tiktokv.com");
                c1499850p8J.LIZLLL = C1697810uHb.LJIILJJIL(new InterfaceC1904907d9() { // from class: com.ss.android.ugc.aweme.hybridkit.task.RomaHostDepend$buildRetrofit$1$1
                    @Override // X.InterfaceC1904907d9
                    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
                        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
                        Request request = c1494590ozp.LIZJ;
                        ArrayList arrayList = new ArrayList(request.getHeaders());
                        arrayList.add(new C080U("bypass-boe", "1"));
                        C0XMB c0xmbNewBuilder = request.newBuilder();
                        c0xmbNewBuilder.LIZJ = arrayList;
                        c0xmbNewBuilder.LIZIZ(request.getBody(), request.getMethod());
                        return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
                    }
                });
                c098200Yq = c1499850p8J.build().retrofit.LIZ(cls);
            } else {
                c098200Yq = C09S2.LIZJ(cls, "https://api.tiktokv.com");
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final boolean ki(String str) {
        return u.LJJIIJZLJL(str, "aweme://roma_redirect", false);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final void LIZ(Context context, String str) {
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withUrl(str);
        smartRoute.open();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final void LJII(String str, JSONObject jSONObject) {
        if (Intrinsics.LJFF(str, "roma_sdk_error")) {
            C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
            C1520360pfO c1520360pfO = new C1520360pfO(str);
            c1520360pfO.LIZLLL = jSONObject;
            c1520360pfO.LJIIJJI = EnumC993170bx5.Slardar;
            c1520360pfO.LIZIZ(0);
            c1520360pfO.LIZIZ = "sparkTrace";
            C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
            c1520200pf8.getClass();
            C1520200pf8.LIZ(c1520350pfNLIZ);
            return;
        }
        if (Intrinsics.LJFF(str, "roma_sdk_pv")) {
            C1520360pfO c1520360pfO2 = new C1520360pfO(str);
            c1520360pfO2.LIZLLL = jSONObject;
            c1520360pfO2.LJIIJJI = EnumC993170bx5.Tea;
            C1520080pew.LIZ(null, c1520360pfO2.LIZ());
            return;
        }
        AppLogNewUtils.onEventV3(str, jSONObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: all -> 0x0115, TryCatch #0 {all -> 0x0115, blocks: (B:3:0x000b, B:5:0x0013, B:7:0x0021, B:11:0x0039, B:12:0x003d, B:13:0x0040, B:15:0x004d, B:16:0x004f, B:17:0x0058, B:19:0x005f, B:21:0x0065, B:24:0x0076, B:26:0x007c, B:29:0x008e, B:31:0x0096, B:34:0x00ad, B:36:0x00b3, B:39:0x00c4, B:41:0x00ca, B:44:0x00dc, B:46:0x00e2, B:49:0x00f4, B:51:0x00fc), top: B:60:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112 A[PHI: r5
      0x0112: PHI (r5v9 java.lang.Object) = 
      (r5v1 java.lang.Object)
      (r5v3 java.lang.Object)
      (r5v5 java.lang.Object)
      (r5v7 java.lang.Object)
      (r5v8 java.lang.Object)
      (r5v11 java.lang.Object)
     binds: [B:52:0x0110, B:47:0x00f0, B:42:0x00d8, B:37:0x00c1, B:33:0x00ac, B:22:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.Class r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.task.RomaHostDepend.LJIIIIZZ(java.lang.Class, java.lang.String):java.lang.Object");
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final void LJIIJ(IRomaHostDepend.ExposeType exposeType, String str) {
        boolean z;
        if (exposeType == IRomaHostDepend.ExposeType.UID) {
            z = true;
        } else {
            z = false;
        }
        C0C5P c0c5pLIZJ = C0C5P.LIZJ();
        List listSingletonList = Collections.singletonList(str);
        c0c5pLIZJ.getClass();
        C0C5P.LIZIZ(listSingletonList, z);
    }
}
