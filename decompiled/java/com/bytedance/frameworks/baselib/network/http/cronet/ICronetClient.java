package com.bytedance.frameworks.baselib.network.http.cronet;

import X.C1276320jJm;
import X.C1494200ozC;
import X.C1494600ozq;
import X.C1497130p3v;
import X.C1497140p3w;
import X.EnumC1497190p41;
import android.content.Context;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface ICronetClient {

    public interface ICronetBootFailureCheckerProvider {
        boolean isCronetBootFailureExpected();
    }

    public interface ICronetThreadStackOptFailureCheckerProvider {
        String getThreadStackInitReason();

        boolean isCronetThreadStackOptFailureExpected();
    }

    void addClientOpaqueData(String[] strArr, byte[] bArr, byte[] bArr2, long j, long j2);

    void bindBigCore(EnumC1497190p41 enumC1497190p41);

    void bindLittleCore(EnumC1497190p41 enumC1497190p41);

    void clearClientOpaqueData();

    void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4);

    int getCronetInternalErrorCode(HttpURLConnection httpURLConnection);

    String getCronetVersion();

    int getEffectiveConnectionType();

    int getEffectiveHttpRttMs();

    int getEffectiveRxThroughputKbps();

    int getEffectiveTransportRttMs();

    Map<String, C1497140p3w> getGroupRttEstimates();

    void getMappingRequestState(String str);

    C1497140p3w getNetworkQuality();

    int getNetworkQualityLevel();

    C1497130p3v getPacketLossRateMetrics(int i);

    boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection);

    void notifyStoreRegionUpdated(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11);

    void notifyTNCConfigUpdated(String str, String str2, String str3, String str4, String str5, String str6);

    HttpURLConnection openConnection(Context context, String str, boolean z, String str2, C1494600ozq c1494600ozq, ICronetAppProvider iCronetAppProvider);

    void preconnectUrl(String str, Map<String, String> map);

    void removeClientOpaqueData(String str);

    void reportNetDiagnosisUserLog(String str);

    void resetCoreBind(EnumC1497190p41 enumC1497190p41);

    void runInBackGround(boolean z);

    void setAlogFuncAddr(long j);

    void setAppStartUpState(int i);

    void setBestHostWithRouteSelectionName(String str, String str2);

    void setCookieInitCompleted();

    void setCronetBootFailureCheckerProvider(ICronetBootFailureCheckerProvider iCronetBootFailureCheckerProvider);

    void setCronetThreadStackOptFailureCheckerProvider(ICronetThreadStackOptFailureCheckerProvider iCronetThreadStackOptFailureCheckerProvider);

    void setHostResolverRules(String str);

    void setHttpDnsForTesting(boolean z, boolean z2, boolean z3);

    void setOecCallbackAddress(long j);

    void setProxy(String str);

    void setSlaSamplingSetting(C1494200ozC c1494200ozC);

    void setZstdFuncAddr(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8);

    void startThrottle(String[] strArr, int i, long j);

    void stopThrottle(String[] strArr, int i);

    void triggerGetDomain(boolean z);

    void tryCreateCronetEngine(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, ICronetAppProvider iCronetAppProvider);

    void tryStartNetDetect(String[] strArr, int i, int i2);

    void ttDnsResolve(String str, int i, String str2, Map<String, String> map);

    C1276320jJm ttUrlDispatch(String str, int i, boolean z);
}
