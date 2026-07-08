package com.ss.android.ugc.tiktok.location_api.service.net;

import X.C080U;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class TikTokLocationApi {
    public static final TikTokLocationApi LIZ = new TikTokLocationApi();

    public interface RealApi {
        @InterfaceC1501170pAR
        C0X9S<String> doPostJson(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z);
    }
}
