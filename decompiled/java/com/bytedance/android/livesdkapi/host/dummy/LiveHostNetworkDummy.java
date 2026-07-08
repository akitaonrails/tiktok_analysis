package com.bytedance.android.livesdkapi.host.dummy;

import X.C0K8R;
import X.C0UC2;
import X.C0X9S;
import X.C1500830p9t;
import X.C1515400pXO;
import X.C520610KbL;
import X.EnumC784160UpS;
import X.InterfaceC1528010prj;
import X.InterfaceC1904907d9;
import X.InterfaceC2221911Bxl;
import X.InterfaceC742680TBi;
import X.InterfaceC784190UpV;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.LiveDispatchConfig;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class LiveHostNetworkDummy implements IHostNetwork {
    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0X9S<TypedInput> do3rdPartGet(String str, Map<String, String> map) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0X9S<TypedInput> do3rdPartPost(String str, Map<String, String> map, String str2, byte[] bArr) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0K8R<C1500830p9t> downloadFile(boolean z, int i, String str, List<C520610KbL> list, Object obj) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String executeGet(String str) {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final InterfaceC742680TBi generateDualDeviceSignalManager() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0K8R<C1500830p9t> get(String str, List<C520610KbL> list, Object obj) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getApiHost() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Retrofit getCustomHostRetrofit(String str) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final /* synthetic */ InterfaceC1904907d9 getFeedFeaturesUpdateInterceptor() {
        return C1515400pXO.LIZ(this);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getHostDomain() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Retrofit getHostRetrofit() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Retrofit getHostRetrofitWithApiHost(String str) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getHostWebSocketDomain() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getKYCHostDomain() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Retrofit getKYCRetrofit() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0UC2 getLiveHostWsManager() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Retrofit getLiveRetrofit(boolean z) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final int getNetworkState() {
        return -1;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final boolean isWsConnected() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void minorModeInterceptMonitor(String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void observerNetworkChange(InterfaceC784190UpV interfaceC784190UpV) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0K8R<C1500830p9t> post(String str, List<C520610KbL> list, String str2, byte[] bArr, Object obj) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void registerHostWS() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void registerHostWS(int i, int i2, InterfaceC1528010prj interfaceC1528010prj) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void registerNetworkControl(String str, LiveDispatchConfig liveDispatchConfig) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void removeNetworkChangeObserver(InterfaceC784190UpV interfaceC784190UpV) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void syncShareCookieToTarget() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void unRegisterHostWS(int i, int i2, InterfaceC1528010prj interfaceC1528010prj) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void unRegisterNetworkControl(String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0K8R<C1500830p9t> uploadFile(int i, String str, List<C520610KbL> list, String str2, byte[] bArr, long j, String str3) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Map<String, String> getCommonParams() {
        return new HashMap();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final EnumC784160UpS getTTNetworkStatus() {
        return EnumC784160UpS.NOT_AVAILABLE;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final InterfaceC2221911Bxl registerWsChannel(Context context, String str, Map<String, String> map, InterfaceC1528010prj interfaceC1528010prj) {
        return new InterfaceC2221911Bxl() { // from class: X.0pXC
            @Override // X.InterfaceC2221911Bxl
            public final void LIZ(LiveWsMessage liveWsMessage) {
            }

            @Override // X.InterfaceC2221911Bxl
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2221911Bxl
            public final boolean isConnected() {
                return false;
            }
        };
    }
}
