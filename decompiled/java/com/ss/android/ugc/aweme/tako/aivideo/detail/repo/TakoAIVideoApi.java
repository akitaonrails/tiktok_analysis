package com.ss.android.ugc.aweme.tako.aivideo.detail.repo;

import X.C326610CrD;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;

/* JADX INFO: loaded from: classes5.dex */
public interface TakoAIVideoApi {
    @InterfaceC1501170pAR("/tiktok/feed/tako/accompany")
    Object fetchAIVideoList(@InterfaceC1485405rg C326610CrD c326610CrD, InterfaceC1364105Vn<? super TakoAIVideoResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/feed/tako/accompany")
    @InterfaceC1501310pAf({"x-schedule-vdc: my"})
    Object fetchAIVideoListDebug(@InterfaceC1485405rg C326610CrD c326610CrD, InterfaceC1364105Vn<? super TakoAIVideoResponse> interfaceC1364105Vn);
}
