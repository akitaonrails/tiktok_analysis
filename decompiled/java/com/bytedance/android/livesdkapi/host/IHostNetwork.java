package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C0K8R;
import X.C0UC2;
import X.C0X9S;
import X.C1500830p9t;
import X.C520610KbL;
import X.EnumC784160UpS;
import X.InterfaceC1528010prj;
import X.InterfaceC1904907d9;
import X.InterfaceC2221911Bxl;
import X.InterfaceC742680TBi;
import X.InterfaceC784190UpV;
import android.content.Context;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface IHostNetwork extends C006A {
    C0X9S<TypedInput> do3rdPartGet(String str, Map<String, String> map);

    C0X9S<TypedInput> do3rdPartPost(String str, Map<String, String> map, String str2, byte[] bArr);

    C0K8R<C1500830p9t> downloadFile(boolean z, int i, String str, List<C520610KbL> list, Object obj);

    String executeGet(String str);

    InterfaceC742680TBi generateDualDeviceSignalManager();

    C0K8R<C1500830p9t> get(String str, List<C520610KbL> list, Object obj);

    String getApiHost();

    Map<String, String> getCommonParams();

    Retrofit getCustomHostRetrofit(String str);

    InterfaceC1904907d9 getFeedFeaturesUpdateInterceptor();

    String getHostDomain();

    Retrofit getHostRetrofit();

    Retrofit getHostRetrofitWithApiHost(String str);

    String getHostWebSocketDomain();

    String getKYCHostDomain();

    Retrofit getKYCRetrofit();

    C0UC2 getLiveHostWsManager();

    Retrofit getLiveRetrofit(boolean z);

    int getNetworkState();

    EnumC784160UpS getTTNetworkStatus();

    boolean isWsConnected();

    void minorModeInterceptMonitor(String str);

    void observerNetworkChange(InterfaceC784190UpV interfaceC784190UpV);

    /* bridge */ /* synthetic */ void onInit();

    C0K8R<C1500830p9t> post(String str, List<C520610KbL> list, String str2, byte[] bArr, Object obj);

    void registerHostWS();

    void registerHostWS(int i, int i2, InterfaceC1528010prj interfaceC1528010prj);

    void registerNetworkControl(String str, LiveDispatchConfig liveDispatchConfig);

    InterfaceC2221911Bxl registerWsChannel(Context context, String str, Map<String, String> map, InterfaceC1528010prj interfaceC1528010prj);

    void removeNetworkChangeObserver(InterfaceC784190UpV interfaceC784190UpV);

    void syncShareCookieToTarget();

    void unRegisterHostWS(int i, int i2, InterfaceC1528010prj interfaceC1528010prj);

    void unRegisterNetworkControl(String str);

    C0K8R<C1500830p9t> uploadFile(int i, String str, List<C520610KbL> list, String str2, byte[] bArr, long j, String str3);
}
