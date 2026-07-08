package com.bytedance.android.livesdk.api;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import tikcast.api.eco.CaptchaCheckResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LiveCaptchaCheckApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/eco/captcha_check/")
    C11NZ<CaptchaCheckResponse> getCaptchaCheckResponse(@InterfaceC1501050pAF("captcha_record_id") long j, @InterfaceC1501050pAF("room_id") long j2, @InterfaceC1501050pAF("check_failed") boolean z);
}
