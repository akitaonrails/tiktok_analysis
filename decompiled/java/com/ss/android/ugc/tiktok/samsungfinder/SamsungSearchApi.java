package com.ss.android.ugc.tiktok.samsungfinder;

import X.C0CQO;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes5.dex */
public interface SamsungSearchApi {
    public static final C0CQO LIZ = C0CQO.LIZ;

    @InterfaceC1501170pAR("/growth/open/search/videos")
    C11NZ<SamsungSearchResponse> getVideos(@InterfaceC1501070pAH("gaid") String str, @InterfaceC1501070pAH("query") String str2, @InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("count") int i2);
}
