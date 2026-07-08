package com.ss.android.ugc.aweme.voiceconversion.repo;

import X.C0X52;
import X.C487940JBo;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface VoiceConversionApi {
    public static final C487940JBo LIZ = C487940JBo.LIZ;

    @InterfaceC1501160pAQ("/tiktok/sami/vcfilter/info/v1/")
    Object getVoiceDetailsInfo(@InterfaceC1501070pAH("vc_filter_id") String str, InterfaceC1364105Vn<? super C0X52<VoiceConversionDetailsResponse>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/sami/vcfilter/videolist/v1/")
    ListenableFuture<VoiceConversionDetailsResponse> getVoiceDetailsVideoListFuture(@InterfaceC1501070pAH("vc_filter_id") String str, @InterfaceC1501070pAH("video_list_count") Long l, @InterfaceC1501070pAH("video_list_offset") Long l2);
}
