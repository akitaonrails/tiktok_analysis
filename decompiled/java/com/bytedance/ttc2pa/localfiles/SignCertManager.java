package com.bytedance.ttc2pa.localfiles;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttc2pa.ByteBufferInputStream;
import com.bytedance.ttc2pa.ByteBufferOutputStream;
import com.bytedance.ttc2pa.MoltenFfiTtC2paSdk;
import com.bytedance.ttc2pa.TTC2PA;
import com.bytedance.ttc2pa.TtC2paNetworkResponse;
import com.bytedance.ttc2pa.localfiles.SharedPreferencesUtils;
import com.bytedance.ttc2pa.localfiles.SignCertManager;
import com.bytedance.ttc2pa.utils.Logger;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.text.Charsets;
import okio.ByteString;
import org.json.JSONObject;
import tt_c2pa_sdk.proto.FuncParamsXa4a5c3f29571f109;
import tt_c2pa_sdk.proto.FuncReturnXe4439ef9481e6022;
import tt_c2pa_sdk.proto.TtC2paCheckCertResult;

/* JADX INFO: loaded from: classes35.dex */
public final class SignCertManager {
    public static ScheduledFuture<?> LIZJ;
    public static volatile long LJ;
    public static final SignCertManager LIZ = new SignCertManager();
    public static long LIZIZ = 300;
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static volatile CertState LJFF = new CertState(0, "", null);

    public final void LIZJ() {
        synchronized (this) {
            try {
                if (LJ != 0 && SystemClock.uptimeMillis() - LJ < 10) {
                    Logger.LIZ.getClass();
                    return;
                }
                LJ = SystemClock.uptimeMillis();
                AtomicBoolean atomicBoolean = LIZLLL;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean.set(true);
                TTC2PA.LIZ.getClass();
                TTC2PA.LIZIZ().submit(new Runnable() { // from class: X.1CHn
                    @Override // java.lang.Runnable
                    public final void run() {
                        SignCertManager.CertState certState;
                        C1C7U.LIZ("SignCertManager@eac0.tryRefreshCertInfo$1L");
                        SharedPreferencesUtils sharedPreferencesUtils = SharedPreferencesUtils.LIZ;
                        TTC2PA.LIZ.getClass();
                        Context context = TTC2PA.LIZJ().getContext();
                        sharedPreferencesUtils.getClass();
                        SharedPreferencesUtils.LIZ(context, "");
                        TtC2paNetworkResponse ttC2paNetworkResponseLIZ = TTC2PA.LIZJ().LIZ(TTC2PA.LIZJ().getRemoteCertDownloadURL(), C2097608Jq.LJ());
                        SignCertManager.LIZ.getClass();
                        if (ttC2paNetworkResponseLIZ.LIZ != 200) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Status:");
                            sbLIZ.append(ttC2paNetworkResponseLIZ.LIZ);
                            sbLIZ.append(", msg:");
                            sbLIZ.append(ttC2paNetworkResponseLIZ.LIZIZ);
                            certState = new SignCertManager.CertState(-6L, C2188811AlT.LIZIZ(sbLIZ), null);
                        } else {
                            try {
                                byte[] bArr = ttC2paNetworkResponseLIZ.LIZLLL;
                                Charset charset = Charsets.UTF_8;
                                String str = new String(bArr, charset);
                                if (C2093608Ic.LJ(str)) {
                                    certState = new SignCertManager.CertState(-7L, "Remote cert info empty", null);
                                } else {
                                    JSONObject jSONObject = new JSONObject(str);
                                    int iOptInt = jSONObject.optInt("code");
                                    String strOptString = jSONObject.optString("message");
                                    String strOptString2 = jSONObject.optString("trace_id");
                                    if (iOptInt != 0) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("Cert info code:");
                                        sbLIZ2.append(iOptInt);
                                        sbLIZ2.append(", message:");
                                        sbLIZ2.append(strOptString);
                                        sbLIZ2.append(", trace_id:");
                                        sbLIZ2.append(strOptString2);
                                        certState = new SignCertManager.CertState(-7L, C2188811AlT.LIZIZ(sbLIZ2), null);
                                    } else {
                                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                                        if (jSONObjectOptJSONObject == null) {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("Data object empty, message:");
                                            sbLIZ3.append(strOptString);
                                            sbLIZ3.append(", trace_id:");
                                            sbLIZ3.append(strOptString2);
                                            certState = new SignCertManager.CertState(-7L, C2188811AlT.LIZIZ(sbLIZ3), null);
                                        } else {
                                            String strOptString3 = jSONObjectOptJSONObject.optString("cert_chain");
                                            String strOptString4 = jSONObjectOptJSONObject.optString("cert_fingerprint");
                                            if (C2093608Ic.LJ(strOptString3) || C2093608Ic.LJ(strOptString4)) {
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("Cert_chain or cert_fingerprint:");
                                                sbLIZ4.append(strOptString4);
                                                sbLIZ4.append(" is empty");
                                                certState = new SignCertManager.CertState(-7L, C2188811AlT.LIZIZ(sbLIZ4), null);
                                            } else {
                                                Pair pairLIZLLL = SignCertManager.LIZLLL(strOptString3);
                                                if (((Boolean) pairLIZLLL.getFirst()).booleanValue()) {
                                                    try {
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        jSONObject2.put("cert_chain", Base64.encodeToString(strOptString3.getBytes(charset), 0));
                                                        jSONObject2.put("cert_fingerprint", strOptString4);
                                                        SharedPreferencesUtils.LIZ(TTC2PA.LIZJ().getContext(), C786410Ut5.J3(jSONObject2));
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                    }
                                                    certState = new SignCertManager.CertState(0L, "", new SignCertManager.CertInfo(strOptString4, strOptString3));
                                                } else {
                                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                    sbLIZ5.append("Refresh verify error:");
                                                    sbLIZ5.append((String) pairLIZLLL.getSecond());
                                                    certState = new SignCertManager.CertState(-14L, C2188811AlT.LIZIZ(sbLIZ5), null);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("Parse error:");
                                sbLIZ6.append(th2);
                                certState = new SignCertManager.CertState(-7L, C2188811AlT.LIZIZ(sbLIZ6), null);
                            }
                        }
                        SignCertManager.LJFF = certState;
                        try {
                            if (SignCertManager.LJFF.LIZJ == null) {
                                Logger logger = Logger.LIZ;
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("refresh cert failed. code:");
                                sbLIZ7.append(SignCertManager.LJFF.LIZ);
                                sbLIZ7.append(", desc:");
                                sbLIZ7.append(SignCertManager.LJFF.LIZIZ);
                                C2188811AlT.LIZIZ(sbLIZ7);
                                logger.getClass();
                                SignCertManager signCertManager = SignCertManager.LIZ;
                                SignCertManager.CertState certState2 = SignCertManager.LJFF;
                                signCertManager.getClass();
                                SignCertManager.LIZ(certState2);
                                SignCertManager.LIZIZ();
                            } else {
                                ScheduledFuture<?> scheduledFuture = SignCertManager.LIZJ;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(true);
                                }
                                SignCertManager.LIZJ = null;
                            }
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                        SignCertManager.LIZLLL.set(false);
                        C1C7U.LIZIZ("SignCertManager@eac0.tryRefreshCertInfo$1L");
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ() {
        try {
            TTC2PA.LIZ.getClass();
            long certFailRetryIntervalSeconds = TTC2PA.LIZJ().getCertFailRetryIntervalSeconds();
            long certFailRetryIntervalSeconds2 = LIZIZ;
            if (certFailRetryIntervalSeconds > certFailRetryIntervalSeconds2) {
                certFailRetryIntervalSeconds2 = TTC2PA.LIZJ().getCertFailRetryIntervalSeconds();
            }
            ScheduledFuture<?> scheduledFuture = LIZJ;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            LIZJ = TTC2PA.LIZIZ().schedule(new Runnable() { // from class: X.1CHv
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("SignCertManager@eac0.startLoopRefreshRetry$1L");
                    SignCertManager.LIZ.LIZJ();
                    C1C7U.LIZIZ("SignCertManager@eac0.startLoopRefreshRetry$1L");
                }
            }, certFailRetryIntervalSeconds2, TimeUnit.SECONDS);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZ(CertState certState) {
        if (certState.LIZ != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", certState.LIZ);
            jSONObject.put("error_desc", certState.LIZIZ);
            TTC2PA.LIZ.getClass();
            TTC2PA.LIZJ().monitorLogSend("c2pa_cert", C786410Ut5.J3(jSONObject));
        }
    }

    public static Pair LIZLLL(String str) {
        ByteBuffer byteBufferAllocateDirect;
        InputStream byteBufferInputStream;
        TtC2paCheckCertResult ttC2paCheckCertResult;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        FuncParamsXa4a5c3f29571f109 funcParamsXa4a5c3f29571f109 = new FuncParamsXa4a5c3f29571f109(ByteString.of(bytes, 0, bytes.length));
        int iEncodedSize = FuncParamsXa4a5c3f29571f109.ADAPTER.encodedSize(funcParamsXa4a5c3f29571f109);
        if (iEncodedSize > 0) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
            funcParamsXa4a5c3f29571f109.encode(new ByteBufferOutputStream(byteBufferAllocateDirect));
        } else {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
        }
        MoltenFfiTtC2paSdk.LIZ.getClass();
        ByteBuffer byteBufferMoltenFfiNativeCheckSignCertAvailableX2046833424069652343 = MoltenFfiTtC2paSdk.MoltenFfiNativeCheckSignCertAvailableX2046833424069652343(byteBufferAllocateDirect);
        if (byteBufferMoltenFfiNativeCheckSignCertAvailableX2046833424069652343 == null) {
            byteBufferInputStream = new ByteArrayInputStream(new byte[0]);
        } else {
            byteBufferInputStream = new ByteBufferInputStream(byteBufferMoltenFfiNativeCheckSignCertAvailableX2046833424069652343);
        }
        try {
            ttC2paCheckCertResult = FuncReturnXe4439ef9481e6022.ADAPTER.decode(byteBufferInputStream).ret;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ttC2paCheckCertResult = FuncReturnXe4439ef9481e6022.ADAPTER.decode(new byte[0]).ret;
        }
        if (byteBufferMoltenFfiNativeCheckSignCertAvailableX2046833424069652343 != null) {
            MoltenFfiTtC2paSdk.LIZ.getClass();
            MoltenFfiTtC2paSdk.freeNativeMemory(byteBufferMoltenFfiNativeCheckSignCertAvailableX2046833424069652343);
        }
        long jLongValue = ttC2paCheckCertResult.cert_count.longValue();
        String str2 = ttC2paCheckCertResult.error_message;
        if (jLongValue <= 0) {
            Boolean bool = Boolean.FALSE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Check certCount:");
            sbLIZ.append(jLongValue);
            sbLIZ.append(" failed. e:");
            sbLIZ.append(str2);
            return new Pair(bool, C2188811AlT.LIZIZ(sbLIZ));
        }
        return new Pair(Boolean.TRUE, "");
    }

    public static final class CertInfo {
        public final String LIZ;
        public final String LIZIZ;

        public CertInfo(String str, String str2) {
            this.LIZ = str;
            this.LIZIZ = str2;
        }
    }

    public static final class CertState {
        public final long LIZ;
        public final String LIZIZ;
        public final CertInfo LIZJ;

        public CertState(long j, String str, CertInfo certInfo) {
            this.LIZ = j;
            this.LIZIZ = str;
            this.LIZJ = certInfo;
        }
    }
}
