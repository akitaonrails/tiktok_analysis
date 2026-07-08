package com.ss.android.ugc.aweme.recording.js;

import X.C496401wY;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes.dex */
public interface RecordingJsApi {
    public static final C496401wY LIZ = C496401wY.LIZ;

    @InterfaceC1501160pAQ("/api/ad/v1/iab/url/feature/")
    Object fetchJsRules(@InterfaceC1501070pAH("first_jump_url") String str, @InterfaceC1501070pAH("current_url") String str2, InterfaceC1364105Vn<? super IABRecordingJsUrlFeatureResponse> interfaceC1364105Vn);
}
