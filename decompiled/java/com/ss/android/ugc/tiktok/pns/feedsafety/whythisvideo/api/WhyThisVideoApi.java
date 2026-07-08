package com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.api;

import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.WTVValidationResponse;
import com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.models.WTVValidationRequest;

/* JADX INFO: loaded from: classes29.dex */
public interface WhyThisVideoApi {
    @InterfaceC1501170pAR("tiktok/pns/why_this_video/validate")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C0X9S<WTVValidationResponse> validateWhyThisVideo(@InterfaceC1485405rg WTVValidationRequest wTVValidationRequest);
}
