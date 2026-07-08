package com.bytedance.ies.ugc.aweme.commercialize.splash.api;

import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501350pAj;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174908fb;
import X.InterfaceC844460XAu;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface SplashAdApi {
    @InterfaceC1501160pAQ
    C0X9S<String> executeGet(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str);

    @InterfaceC1501160pAQ
    @InterfaceC844460XAu("vas_ad_track")
    C0X9S<String> executeGet(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501350pAj("User-Agent") String str2);

    @InterfaceC1501170pAR
    C0X9S<String> executePost(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<String> executePost(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501050pAF("ad_status") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<String> executePost(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501150pAP Map<String, String> map);
}
