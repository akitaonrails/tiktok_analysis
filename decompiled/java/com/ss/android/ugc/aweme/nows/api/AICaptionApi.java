package com.ss.android.ugc.aweme.nows.api;

import X.C092G;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501030pAD;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.bytedance.retrofit2.mime.TypedFile;
import com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule;

/* JADX INFO: loaded from: classes15.dex */
public interface AICaptionApi {
    @C092G
    @InterfaceC1501170pAR("/tiktok/v1/aigc_caption/generate")
    Object getImageInfo(@InterfaceC1501030pAD("file") TypedFile typedFile, @InterfaceC1501070pAH("translate_to") String str, InterfaceC1364105Vn<? super AICaptionNetworkModule.AICaptionResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/aigc/video_caption/generate")
    Object getImageInfos(@InterfaceC1485405rg MemeAudioRequestBody memeAudioRequestBody, InterfaceC1364105Vn<? super AICaptionNetworkModule.AICaptionResponse> interfaceC1364105Vn);
}
