package com.ss.android.ugc.aweme.cubes.api;

import X.C0CQ4;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes5.dex */
public interface GoogleCubesVideosApi {
    public static final C0CQ4 LIZ = C0CQ4.LIZ;

    @InterfaceC1501170pAR("/growth/open/suggest/videos")
    C11NZ<GoogleCubesVideosResponse> getVideos(@InterfaceC1501070pAH("gaid") String str, @InterfaceC1501070pAH("source") int i);
}
