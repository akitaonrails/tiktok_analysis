package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc;

import X.C0X9S;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes14.dex */
public final class VoiceConversionApi {
    public static final /* synthetic */ int LIZ = 0;

    public interface Api {
        @InterfaceC1501240pAY("/tiktok/v1/voice/conversion/")
        C0X9S<VCAudioResponse> downloadVoiceConversion(@InterfaceC1501070pAH("vids") JSONArray jSONArray, @InterfaceC1501070pAH("speakers") JSONArray jSONArray2, @InterfaceC1501070pAH("response_type") Integer num, @InterfaceC1501070pAH("params") String str);

        @InterfaceC1501240pAY("/tiktok/v1/voice/conversion/")
        @InterfaceC1501300pAe
        C0X9S<VCAudioResponse> downloadVoiceConversion2(@InterfaceC1501050pAF("vids") JSONArray jSONArray, @InterfaceC1501050pAF("speakers") JSONArray jSONArray2, @InterfaceC1501050pAF("response_type") Integer num, @InterfaceC1501050pAF("params") String str);
    }
}
