package com.ss.android.ugc.aweme;

import X.C04TD;
import X.C0PEM;
import X.C15464063q;
import X.C2227941CHw;
import X.C2296808zG;
import X.C23250099c;
import X.C2385409Wi;
import X.C786410Ut5;
import X.C822660WOy;
import X.InterfaceC2227891CHr;
import X.InterfaceC2227951CHx;
import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttc2pa.ByteBufferInputStream;
import com.bytedance.ttc2pa.ByteBufferOutputStream;
import com.bytedance.ttc2pa.CallbackInstance;
import com.bytedance.ttc2pa.ITTC2PADepend;
import com.bytedance.ttc2pa.MoltenFfiTtC2paSdk;
import com.bytedance.ttc2pa.TTC2PA;
import com.bytedance.ttc2pa.TTC2PACallback;
import com.bytedance.ttc2pa.TtC2paNetworkCallerProxy;
import com.bytedance.ttc2pa.TtC2paNetworkResponse;
import com.bytedance.ttc2pa.localfiles.SharedPreferencesUtils;
import com.bytedance.ttc2pa.localfiles.SignCertManager;
import com.bytedance.ttc2pa.utils.C2paThreadFactory;
import com.bytedance.ttc2pa.utils.HttpRequestCall;
import com.bytedance.ttc2pa.utils.Logger;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.u;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tt_c2pa_sdk.proto.FuncParamsX111419d20c7a3f6d;
import tt_c2pa_sdk.proto.FuncParamsX25f7600164bf39ed;
import tt_c2pa_sdk.proto.FuncParamsX913809d0daa224e7;
import tt_c2pa_sdk.proto.FuncReturnX0bf8b5c665c57f35;
import tt_c2pa_sdk.proto.FuncReturnX810b7d3a34ee8ade;
import tt_c2pa_sdk.proto.MoltenFfiInstanceMsg;
import tt_c2pa_sdk.proto.TtC2paResult;

/* JADX INFO: loaded from: classes35.dex */
public final class TTC2PAServiceImpl implements ITTC2PAService {
    public static final C2227941CHw Companion = new Object() { // from class: X.1CHw
    };
    public InterfaceC2227891CHr ttC2PADependWrapper;

    public static ITTC2PAService createITTC2PAServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ITTC2PAService.class, z);
        if (objLIZ != null) {
            return (ITTC2PAService) objLIZ;
        }
        if (C04TD.LJJZZI == null) {
            synchronized (ITTC2PAService.class) {
                if (C04TD.LJJZZI == null) {
                    C04TD.LJJZZI = new TTC2PAServiceImpl();
                }
            }
        }
        return C04TD.LJJZZI;
    }

    public final int getMediaType(String str) {
        String strNativeGetMimeType = TEVideoUtils.nativeGetMimeType(str);
        if (u.LJJIIJZLJL(strNativeGetMimeType, "video", false)) {
            return 2;
        }
        if (u.LJJIIJZLJL(strNativeGetMimeType, "image", false)) {
            return 1;
        }
        if (!Intrinsics.LJFF(strNativeGetMimeType, "unknown") || TEVideoUtils.nativeCheckAudioFile(str) != 0) {
            return 0;
        }
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.ITTC2PAService
    public void init(final InterfaceC2227891CHr interfaceC2227891CHr) {
        ScheduledExecutorService c822660WOy;
        this.ttC2PADependWrapper = interfaceC2227891CHr;
        TTC2PA ttc2pa = TTC2PA.LIZ;
        ITTC2PADepend iTTC2PADepend = new ITTC2PADepend() { // from class: X.1CHq
            @Override // com.bytedance.ttc2pa.ITTC2PADepend
            public final boolean enableDebug() {
                interfaceC2227891CHr.enableDebug();
                return false;
            }

            @Override // com.bytedance.ttc2pa.ITTC2PADepend
            public final long getCertFailRetryIntervalSeconds() {
                interfaceC2227891CHr.getCertFailRetryIntervalSeconds();
                return 300L;
            }

            @Override // com.bytedance.ttc2pa.ITTC2PADepend
            public final Context getContext() {
                return interfaceC2227891CHr.getContext();
            }

            @Override // com.bytedance.ttc2pa.ITTC2PADepend
            public final ScheduledExecutorService getIoExecutor() {
                interfaceC2227891CHr.getIoExecutor();
                return null;
            }

            @Override // com.bytedance.ttc2pa.ITTC2PADepend
            public final String getRemoteCertDownloadURL() {
                return interfaceC2227891CHr.getRemoteCertDownloadURL();
            }

            @Override // com.bytedance.ttc2pa.ITTC2PADepend
            public final String getTimeStampRequestHost() {
                return interfaceC2227891CHr.getTimeStampRequestHost();
            }

            @Override // com.bytedance.ttc2pa.ITTC2PADepend
            public final TtC2paNetworkResponse onRemoteSign(byte[] bArr) {
                C201948140c c201948140cOnRemoteSign = interfaceC2227891CHr.onRemoteSign(bArr);
                return new TtC2paNetworkResponse(c201948140cOnRemoteSign.LIZ, c201948140cOnRemoteSign.LIZIZ, c201948140cOnRemoteSign.LIZJ, c201948140cOnRemoteSign.LIZLLL);
            }

            @Override // com.bytedance.ttc2pa.ITTC2PADepend
            public final TtC2paNetworkResponse LIZ(String str, Map map) {
                C201948140c c201948140cLIZ = interfaceC2227891CHr.LIZ(str, map);
                return new TtC2paNetworkResponse(c201948140cLIZ.LIZ, c201948140cLIZ.LIZIZ, c201948140cLIZ.LIZJ, c201948140cLIZ.LIZLLL);
            }

            @Override // com.bytedance.ttc2pa.ITTC2PADepend
            public final void monitorLogSend(String str, String str2) {
                interfaceC2227891CHr.monitorLogSend(str, str2);
            }
        };
        ttc2pa.getClass();
        if (TTC2PA.LIZIZ == null) {
            TTC2PA.LIZIZ = iTTC2PADepend;
            if (TTC2PA.LIZJ().enableDebug()) {
                Logger.LIZ.getClass();
            }
            if (TTC2PA.LIZJ().getIoExecutor() != null) {
                c822660WOy = TTC2PA.LIZJ().getIoExecutor();
            } else {
                c822660WOy = new C822660WOy(1, new C2paThreadFactory());
            }
            TTC2PA.LIZJ = c822660WOy;
            TTC2PA.LIZIZ().submit(new Runnable() { // from class: X.1CHl
                @Override // java.lang.Runnable
                public final void run() {
                    ByteBuffer byteBufferAllocateDirect;
                    String string;
                    SignCertManager.CertState certState;
                    C1C7U.LIZ("TTC2PA@9b51.init$1L");
                    TTC2PA.LIZ.getClass();
                    FuncParamsX913809d0daa224e7 funcParamsX913809d0daa224e7 = new FuncParamsX913809d0daa224e7((String) TTC2PA.LIZ().getSecond());
                    int iEncodedSize = FuncParamsX913809d0daa224e7.ADAPTER.encodedSize(funcParamsX913809d0daa224e7);
                    if (iEncodedSize > 0) {
                        byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
                        funcParamsX913809d0daa224e7.encode(new ByteBufferOutputStream(byteBufferAllocateDirect));
                    } else {
                        byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
                    }
                    MoltenFfiTtC2paSdk.LIZ.getClass();
                    ByteBuffer byteBufferMoltenFfiNativeTtc2paSetTempDirX8932877268671037071 = MoltenFfiTtC2paSdk.MoltenFfiNativeTtc2paSetTempDirX8932877268671037071(byteBufferAllocateDirect);
                    try {
                        FuncReturnX0bf8b5c665c57f35.ADAPTER.decode(byteBufferMoltenFfiNativeTtc2paSetTempDirX8932877268671037071 == null ? new ByteArrayInputStream(new byte[0]) : new ByteBufferInputStream(byteBufferMoltenFfiNativeTtc2paSetTempDirX8932877268671037071));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        FuncReturnX0bf8b5c665c57f35.ADAPTER.decode(new byte[0]);
                    }
                    if (byteBufferMoltenFfiNativeTtc2paSetTempDirX8932877268671037071 != null) {
                        MoltenFfiTtC2paSdk.LIZ.getClass();
                        MoltenFfiTtC2paSdk.freeNativeMemory(byteBufferMoltenFfiNativeTtc2paSetTempDirX8932877268671037071);
                    }
                    SignCertManager signCertManager = SignCertManager.LIZ;
                    signCertManager.getClass();
                    TTC2PA.LIZ.getClass();
                    if (TTC2PA.LIZJ().enableDebug()) {
                        SignCertManager.LIZIZ = 10L;
                    }
                    SharedPreferencesUtils sharedPreferencesUtils = SharedPreferencesUtils.LIZ;
                    Context context = TTC2PA.LIZJ().getContext();
                    sharedPreferencesUtils.getClass();
                    try {
                        string = C810670Vr7.LIZJ(context, 0, "ttc2pa_main_process_config").getString("ttc2pa_config", "");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        string = null;
                    }
                    boolean z = string == null || string.length() == 0;
                    if (z) {
                        certState = new SignCertManager.CertState(-5L, "Local cert info empty", null);
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(string);
                            String strOptString = jSONObject.optString("cert_chain");
                            if (C2093608Ic.LJ(strOptString)) {
                                certState = new SignCertManager.CertState(-3L, "Local cert_chain is empty", null);
                            } else {
                                String strOptString2 = jSONObject.optString("cert_fingerprint");
                                if (C2093608Ic.LJ(strOptString2)) {
                                    certState = new SignCertManager.CertState(-4L, "Local cert_fingerprint is empty", null);
                                } else {
                                    Charset charset = Charsets.UTF_8;
                                    String str = new String(Base64.decode(strOptString.getBytes(charset), 0), charset);
                                    Pair pairLIZLLL = SignCertManager.LIZLLL(str);
                                    if (((Boolean) pairLIZLLL.getFirst()).booleanValue()) {
                                        certState = new SignCertManager.CertState(0L, "", new SignCertManager.CertInfo(strOptString2, str));
                                    } else {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("Verify local cert failed. cert_len:");
                                        sbLIZ.append(str.length());
                                        sbLIZ.append(" fp:");
                                        sbLIZ.append(strOptString2);
                                        sbLIZ.append(", e:");
                                        sbLIZ.append((String) pairLIZLLL.getSecond());
                                        sbLIZ.append('}');
                                        certState = new SignCertManager.CertState(-14L, C2188811AlT.LIZIZ(sbLIZ), null);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Local cert error:");
                            sbLIZ2.append(th2);
                            certState = new SignCertManager.CertState(-5L, C2188811AlT.LIZIZ(sbLIZ2), null);
                        }
                    }
                    SignCertManager.LJFF = certState;
                    if (SignCertManager.LJFF.LIZJ == null) {
                        Logger logger = Logger.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("get local cert failed. code:");
                        sbLIZ3.append(SignCertManager.LJFF.LIZ);
                        sbLIZ3.append(", desc:");
                        sbLIZ3.append(SignCertManager.LJFF.LIZIZ);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        logger.getClass();
                        SignCertManager.LIZ(SignCertManager.LJFF);
                        signCertManager.LIZJ();
                    }
                    C1C7U.LIZIZ("TTC2PA@9b51.init$1L");
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1CHt] */
    @Override // com.ss.android.ugc.aweme.ITTC2PAService
    public void readAndVerifyFromPath(final String str, final boolean z, final C15464063q c15464063q, final InterfaceC2227951CHx interfaceC2227951CHx) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        TTC2PA ttc2pa = TTC2PA.LIZ;
        final ?? r3 = new TTC2PACallback() { // from class: X.1CHt
            @Override // com.bytedance.ttc2pa.TTC2PACallback
            public final void onResult(int i, String str2, String str3) {
                interfaceC2227951CHx.onResult(i, str2, str3);
                this.mobEvent("read_c2pa", str, z, i, str2, SystemClock.elapsedRealtime() - jElapsedRealtime, false, c15464063q);
            }
        };
        ttc2pa.getClass();
        if (TTC2PA.LIZIZ == null) {
            r3.onResult(-1, "Must call init before use", "");
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        TTC2PA.LIZIZ().submit(new Runnable() { // from class: X.1CHp
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                ByteBuffer byteBufferAllocateDirect;
                TtC2paResult ttC2paResult;
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                long j = jUptimeMillis;
                TTC2PACallback tTC2PACallback = r3;
                C1C7U.LIZ("TTC2PA@9b51.asyncReadAndVerifyFromPath$1L");
                FuncParamsX25f7600164bf39ed funcParamsX25f7600164bf39ed = new FuncParamsX25f7600164bf39ed(str2);
                int iEncodedSize = FuncParamsX25f7600164bf39ed.ADAPTER.encodedSize(funcParamsX25f7600164bf39ed);
                if (iEncodedSize > 0) {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
                    funcParamsX25f7600164bf39ed.encode(new ByteBufferOutputStream(byteBufferAllocateDirect));
                } else {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
                }
                MoltenFfiTtC2paSdk.LIZ.getClass();
                ByteBuffer byteBufferMoltenFfiNativeTtc2paReadAndVerifyFromPathX3831892434230964710 = MoltenFfiTtC2paSdk.MoltenFfiNativeTtc2paReadAndVerifyFromPathX3831892434230964710(byteBufferAllocateDirect);
                try {
                    ttC2paResult = FuncReturnX810b7d3a34ee8ade.ADAPTER.decode(byteBufferMoltenFfiNativeTtc2paReadAndVerifyFromPathX3831892434230964710 == null ? new ByteArrayInputStream(new byte[0]) : new ByteBufferInputStream(byteBufferMoltenFfiNativeTtc2paReadAndVerifyFromPathX3831892434230964710)).ret;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ttC2paResult = FuncReturnX810b7d3a34ee8ade.ADAPTER.decode(new byte[0]).ret;
                }
                if (byteBufferMoltenFfiNativeTtc2paReadAndVerifyFromPathX3831892434230964710 != null) {
                    MoltenFfiTtC2paSdk.LIZ.getClass();
                    MoltenFfiTtC2paSdk.freeNativeMemory(byteBufferMoltenFfiNativeTtc2paReadAndVerifyFromPathX3831892434230964710);
                }
                long jLongValue = ttC2paResult.error_code.longValue();
                String str3 = ttC2paResult.error_desc;
                String str4 = ttC2paResult.result_json;
                jSONObject2.put("cost", SystemClock.uptimeMillis() - j);
                jSONObject2.put("error_code", jLongValue);
                jSONObject2.put("error_desc", str3);
                TTC2PA.LIZ.getClass();
                TTC2PA.LJ("c2pa_read_manifest", jSONObject2);
                tTC2PACallback.onResult((int) jLongValue, str3, str4);
                Logger logger = Logger.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("read callback: code:");
                sbLIZ.append(jLongValue);
                sbLIZ.append(", desc:");
                sbLIZ.append(str3);
                sbLIZ.append(", manifest:");
                sbLIZ.append(str4);
                C2188811AlT.LIZIZ(sbLIZ);
                logger.getClass();
                C1C7U.LIZIZ("TTC2PA@9b51.asyncReadAndVerifyFromPath$1L");
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1CHu] */
    @Override // com.ss.android.ugc.aweme.ITTC2PAService
    public void readIngredientsFromPath(final String str, final boolean z, final C15464063q c15464063q, final InterfaceC2227951CHx interfaceC2227951CHx) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        TTC2PA ttc2pa = TTC2PA.LIZ;
        final ?? r3 = new TTC2PACallback() { // from class: X.1CHu
            @Override // com.bytedance.ttc2pa.TTC2PACallback
            public final void onResult(int i, String str2, String str3) {
                interfaceC2227951CHx.onResult(i, str2, str3);
                this.mobEvent("get_ingredient", str, z, i, str2, SystemClock.elapsedRealtime() - jElapsedRealtime, false, c15464063q);
            }
        };
        ttc2pa.getClass();
        if (TTC2PA.LIZIZ == null) {
            r3.onResult(-1, "Must call init before use", "");
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        TTC2PA.LIZIZ().submit(new Runnable() { // from class: X.1CHo
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                ByteBuffer byteBufferAllocateDirect;
                TtC2paResult ttC2paResult;
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                long j = jUptimeMillis;
                TTC2PACallback tTC2PACallback = r3;
                C1C7U.LIZ("TTC2PA@9b51.asyncReadAsIngredientFromPath$1L");
                FuncParamsX25f7600164bf39ed funcParamsX25f7600164bf39ed = new FuncParamsX25f7600164bf39ed(str2);
                int iEncodedSize = FuncParamsX25f7600164bf39ed.ADAPTER.encodedSize(funcParamsX25f7600164bf39ed);
                if (iEncodedSize > 0) {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
                    funcParamsX25f7600164bf39ed.encode(new ByteBufferOutputStream(byteBufferAllocateDirect));
                } else {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
                }
                MoltenFfiTtC2paSdk.LIZ.getClass();
                ByteBuffer byteBufferMoltenFfiNativeTtc2paReadIngredientFromPathX7825190323969407641 = MoltenFfiTtC2paSdk.MoltenFfiNativeTtc2paReadIngredientFromPathX7825190323969407641(byteBufferAllocateDirect);
                try {
                    ttC2paResult = FuncReturnX810b7d3a34ee8ade.ADAPTER.decode(byteBufferMoltenFfiNativeTtc2paReadIngredientFromPathX7825190323969407641 == null ? new ByteArrayInputStream(new byte[0]) : new ByteBufferInputStream(byteBufferMoltenFfiNativeTtc2paReadIngredientFromPathX7825190323969407641)).ret;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ttC2paResult = FuncReturnX810b7d3a34ee8ade.ADAPTER.decode(new byte[0]).ret;
                }
                if (byteBufferMoltenFfiNativeTtc2paReadIngredientFromPathX7825190323969407641 != null) {
                    MoltenFfiTtC2paSdk.LIZ.getClass();
                    MoltenFfiTtC2paSdk.freeNativeMemory(byteBufferMoltenFfiNativeTtc2paReadIngredientFromPathX7825190323969407641);
                }
                long jLongValue = ttC2paResult.error_code.longValue();
                String str3 = ttC2paResult.error_desc;
                String str4 = ttC2paResult.result_json;
                jSONObject2.put("cost", SystemClock.uptimeMillis() - j);
                jSONObject2.put("error_code", jLongValue);
                jSONObject2.put("error_desc", str3);
                TTC2PA.LIZ.getClass();
                TTC2PA.LJ("c2pa_read_ingredient", jSONObject2);
                tTC2PACallback.onResult((int) jLongValue, str3, str4);
                Logger logger = Logger.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("read callback: code:");
                sbLIZ.append(jLongValue);
                sbLIZ.append(", desc:");
                sbLIZ.append(str3);
                sbLIZ.append(", manifest:");
                sbLIZ.append(str4);
                C2188811AlT.LIZIZ(sbLIZ);
                logger.getClass();
                C1C7U.LIZIZ("TTC2PA@9b51.asyncReadAsIngredientFromPath$1L");
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.1CHs] */
    @Override // com.ss.android.ugc.aweme.ITTC2PAService
    public void writeAndSignManifest(final String str, final boolean z, JSONObject jSONObject, String str2, List<String> list, final C15464063q c15464063q, final InterfaceC2227951CHx interfaceC2227951CHx) {
        try {
            jSONObject.put("input_file", str);
            jSONObject.put("output_file", str);
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("parent_ingredient", str2);
            }
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
                jSONObject.put("component_ingredients", jSONArray);
            }
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            TTC2PA ttc2pa = TTC2PA.LIZ;
            final String strJ3 = C786410Ut5.J3(jSONObject);
            final ?? r5 = new TTC2PACallback() { // from class: X.1CHs
                @Override // com.bytedance.ttc2pa.TTC2PACallback
                public final void onResult(int i, String str3, String str4) {
                    interfaceC2227951CHx.onResult(i, str3, str4);
                    this.mobEvent("write_c2pa", str, z, i, str3, SystemClock.elapsedRealtime() - jElapsedRealtime, false, c15464063q);
                }
            };
            ttc2pa.getClass();
            if (TTC2PA.LIZIZ == null) {
                r5.onResult(-1, "Must call init before use", "");
                return;
            }
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tsa_timeout", 2000L);
            TTC2PA.LIZIZ().submit(new Runnable() { // from class: X.1CHm
                public final /* synthetic */ long LLILZ = 2000;
                public final /* synthetic */ boolean LLILZIL = false;

                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    long jIncrementAndGet;
                    int i;
                    ByteBuffer byteBufferAllocateDirect;
                    TtC2paResult ttC2paResult;
                    TTC2PACallback tTC2PACallback = r5;
                    JSONObject jSONObject3 = jSONObject2;
                    String str3 = strJ3;
                    long j = this.LLILZ;
                    boolean z2 = this.LLILZIL;
                    C1C7U.LIZ("TTC2PA@9b51.asyncWriteAndSignManifest$1L");
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    TTC2PA.LIZ.getClass();
                    Pair pairLIZ = TTC2PA.LIZ();
                    if (((Boolean) pairLIZ.getFirst()).booleanValue()) {
                        SignCertManager.LIZ.getClass();
                        SignCertManager.CertState certState = SignCertManager.LJFF;
                        if (certState.LIZJ == null) {
                            if (SignCertManager.LIZJ == null) {
                                SignCertManager.LIZIZ();
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Cert not ready, retry later, code:");
                            sbLIZ.append(certState.LIZ);
                            sbLIZ.append(", ");
                            sbLIZ.append(certState.LIZIZ);
                            TTC2PA.LIZLLL(tTC2PACallback, jSONObject3, jUptimeMillis, new com.bytedance.ttc2pa.TtC2paResult(-2L, C2188811AlT.LIZIZ(sbLIZ), ""));
                        } else {
                            String str4 = "";
                            if (TTC2PA.LIZJ().getTimeStampRequestHost().length() > 0) {
                                str4 = "https://" + TTC2PA.LIZJ().getTimeStampRequestHost();
                            }
                            byte[] bytes = certState.LIZJ.LIZIZ.getBytes(Charsets.UTF_8);
                            String str5 = certState.LIZJ.LIZ;
                            HttpRequestCall httpRequestCall = HttpRequestCall.LIZ;
                            ByteString byteStringOf = ByteString.of(bytes, 0, bytes.length);
                            Long lValueOf = Long.valueOf(j);
                            Boolean boolValueOf = Boolean.valueOf(z2);
                            TtC2paNetworkCallerProxy.LIZIZ.getClass();
                            TtC2paNetworkCallerProxy ttC2paNetworkCallerProxy = new TtC2paNetworkCallerProxy(httpRequestCall);
                            synchronized (CallbackInstance.LIZ) {
                                try {
                                    jIncrementAndGet = CallbackInstance.LIZIZ.incrementAndGet();
                                    CallbackInstance.LIZJ.put(Long.valueOf(jIncrementAndGet), ttC2paNetworkCallerProxy);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            FuncParamsX111419d20c7a3f6d funcParamsX111419d20c7a3f6d = new FuncParamsX111419d20c7a3f6d(str3, byteStringOf, str5, str4, lValueOf, boolValueOf, new MoltenFfiInstanceMsg(-3223723316326955298L, Long.valueOf(jIncrementAndGet)));
                            int iEncodedSize = FuncParamsX111419d20c7a3f6d.ADAPTER.encodedSize(funcParamsX111419d20c7a3f6d);
                            if (iEncodedSize > 0) {
                                byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
                                funcParamsX111419d20c7a3f6d.encode(new ByteBufferOutputStream(byteBufferAllocateDirect));
                                i = 0;
                            } else {
                                i = 0;
                                byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
                            }
                            MoltenFfiTtC2paSdk.LIZ.getClass();
                            ByteBuffer byteBufferMoltenFfiNativeTtc2paWriteAndSignManifestMoltenX6196825777310389490 = MoltenFfiTtC2paSdk.MoltenFfiNativeTtc2paWriteAndSignManifestMoltenX6196825777310389490(byteBufferAllocateDirect);
                            try {
                                ttC2paResult = FuncReturnX810b7d3a34ee8ade.ADAPTER.decode(byteBufferMoltenFfiNativeTtc2paWriteAndSignManifestMoltenX6196825777310389490 == null ? new ByteArrayInputStream(new byte[i]) : new ByteBufferInputStream(byteBufferMoltenFfiNativeTtc2paWriteAndSignManifestMoltenX6196825777310389490)).ret;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                ttC2paResult = FuncReturnX810b7d3a34ee8ade.ADAPTER.decode(new byte[0]).ret;
                            }
                            if (byteBufferMoltenFfiNativeTtc2paWriteAndSignManifestMoltenX6196825777310389490 != null) {
                                MoltenFfiTtC2paSdk.LIZ.getClass();
                                MoltenFfiTtC2paSdk.freeNativeMemory(byteBufferMoltenFfiNativeTtc2paWriteAndSignManifestMoltenX6196825777310389490);
                            }
                            long jLongValue = ttC2paResult.error_code.longValue();
                            String str6 = ttC2paResult.error_desc;
                            com.bytedance.ttc2pa.TtC2paResult ttC2paResult2 = new com.bytedance.ttc2pa.TtC2paResult(jLongValue, str6, ttC2paResult.result_json);
                            if (jLongValue == 83) {
                                SignCertManager signCertManager = SignCertManager.LIZ;
                                signCertManager.getClass();
                                Logger logger = Logger.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("markLocalCertMisMatch ");
                                sbLIZ2.append(str6);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                logger.getClass();
                                SharedPreferencesUtils sharedPreferencesUtils = SharedPreferencesUtils.LIZ;
                                TTC2PA.LIZ.getClass();
                                Context context = TTC2PA.LIZJ().getContext();
                                sharedPreferencesUtils.getClass();
                                SharedPreferencesUtils.LIZ(context, "");
                                signCertManager.LIZJ();
                            } else if (jLongValue == 28 || jLongValue == 31 || jLongValue == 32 || jLongValue == 33) {
                                SignCertManager.LIZ.getClass();
                                if (SignCertManager.LIZJ == null) {
                                    SignCertManager.LIZIZ();
                                }
                            }
                            TTC2PA.LIZ.getClass();
                            TTC2PA.LIZLLL(tTC2PACallback, jSONObject3, jUptimeMillis, ttC2paResult2);
                        }
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Temp path check failed:");
                        sbLIZ3.append((String) pairLIZ.getSecond());
                        TTC2PA.LIZLLL(tTC2PACallback, jSONObject3, jUptimeMillis, new com.bytedance.ttc2pa.TtC2paResult(-15L, C2188811AlT.LIZIZ(sbLIZ3), ""));
                    }
                    C1C7U.LIZIZ("TTC2PA@9b51.asyncWriteAndSignManifest$1L");
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ITTC2PAService
    public void mobEvent(String str, String str2, boolean z, int i, String str3, long j, boolean z2, C15464063q c15464063q) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2385409Wi(str2, z, this, str, j, str3, i, z2, c15464063q, null), 3);
    }
}
