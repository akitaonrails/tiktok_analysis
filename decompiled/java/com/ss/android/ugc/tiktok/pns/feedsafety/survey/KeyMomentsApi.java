package com.ss.android.ugc.tiktok.pns.feedsafety.survey;

import X.C10KF;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes29.dex */
public interface KeyMomentsApi {
    public static final C10KF LIZ = C10KF.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/topic-preferences/key_moment_filter")
    C11NZ<KeyMomentsResponse> getKeyMomentsTopics(@InterfaceC1485405rg KeyMomentsRequest keyMomentsRequest);
}
