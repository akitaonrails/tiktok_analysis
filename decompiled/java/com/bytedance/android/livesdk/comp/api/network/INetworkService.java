package com.bytedance.android.livesdk.comp.api.network;

import X.AbstractC2343909Gj;
import X.C006A;
import X.C09S8;
import X.C09SJ;
import X.C0IMD;
import X.C0K8R;
import X.C0X9S;
import X.C1500830p9t;
import X.C1502000pBm;
import X.C2163708dn;
import X.C520610KbL;
import X.InterfaceC1132110fZB;
import X.InterfaceC1528010prj;
import X.InterfaceC2221911Bxl;
import android.content.Context;
import com.bytedance.android.live.network.ResponseInterceptorV2;
import com.bytedance.android.live.network.interceptors.InjectFeedFeatureInterceptor;
import com.bytedance.android.live.network.interceptors.NtpTimeInterceptor;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface INetworkService extends C006A {
    void Co1(Map<String, String> map);

    void Ht1(Map<Class<?>, ? extends C0IMD<?>> map);

    Map K60();

    C0K8R<C1500830p9t> LU1(String str, List<? extends C520610KbL> list, String str2, byte[] bArr);

    Retrofit P80();

    void Pg0(C1502000pBm c1502000pBm);

    <T> InterfaceC1132110fZB<T> R00(Class<T> cls);

    void RF1(C1502000pBm c1502000pBm);

    void Rb1(Map<Class<?>, ? extends InterfaceC1132110fZB<?>> map);

    void SI0();

    <T> T SP2(Class<T> cls);

    NtpTimeInterceptor X01();

    boolean cc0(C09SJ<?, ?> c09sj);

    C0X9S<TypedInput> do3rdPartPost(String str, Map<String, String> map, String str2, byte[] bArr);

    C0K8R<C1500830p9t> downloadFile(boolean z, int i, String str, List<? extends C520610KbL> list, Object obj);

    ResponseInterceptorV2 e72();

    <T> T eo1(Class<T> cls);

    C0K8R<C1500830p9t> get(String str, List<? extends C520610KbL> list);

    C0K8R<C1500830p9t> get(String str, List<? extends C520610KbL> list, Object obj);

    Map<String, String> getCommonParams();

    String getHostDomain();

    <T> T getService(Class<T> cls);

    void iG(C2163708dn c2163708dn);

    InjectFeedFeatureInterceptor kR0();

    List<C09S8> lr2(boolean z);

    List<AbstractC2343909Gj> mk1();

    C0K8R<C1500830p9t> post(String str, List<? extends C520610KbL> list, String str2, byte[] bArr, Object obj);

    <T> C0IMD<T> qL2(Class<T> cls);

    InterfaceC2221911Bxl registerWsChannel(Context context, String str, Map<String, String> map, InterfaceC1528010prj interfaceC1528010prj);

    C0K8R<C1500830p9t> uploadFile(int i, String str, List<? extends C520610KbL> list, String str2, byte[] bArr, long j, String str3);
}
