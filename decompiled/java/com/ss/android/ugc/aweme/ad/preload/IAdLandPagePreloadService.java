package com.ss.android.ugc.aweme.ad.preload;

import X.C1024380clQ;
import X.C1035880d3y;
import X.C1037010d5n;
import X.C1040640dBe;
import X.C1042360dEQ;
import X.C443120HZe;
import X.EnumC1042380dES;
import X.InterfaceC1040680dBi;
import com.ss.android.ugc.aweme.ad.network.SingletonWebViewTasks;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface IAdLandPagePreloadService {
    String A0(Long l);

    String B0();

    void C0();

    int D0(String str);

    JSONObject E0(String str);

    int F0(String str);

    C1024380clQ G0();

    C1042360dEQ H0(AdSparkHybridContext adSparkHybridContext, EnumC1042380dES enumC1042380dES);

    C443120HZe<String, String, String> I0(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, C1035880d3y c1035880d3y);

    void J0(Long l, String str);

    String K0(String str);

    SingletonWebViewTasks L0();

    String M0(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i3, C1035880d3y c1035880d3y);

    C1037010d5n N0();

    void O0(String str, InterfaceC1040680dBi interfaceC1040680dBi);

    JSONObject P0(String str);

    void Q0(String str);

    void getAdPackageBundleName();

    String p0(String str, String str2);

    boolean q0(String str, String str2);

    void r0();

    String s0(Long l);

    void t0(AwemeRawAd awemeRawAd);

    int u0(String str);

    void v0(String str);

    JSONObject w0(String str);

    void x0();

    C1040640dBe y0(String str);

    JSONObject z0(String str);
}
