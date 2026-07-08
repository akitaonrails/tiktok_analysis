package com.ss.android.ugc.aweme.ttsvoice.repo;

import X.C0X52;
import X.C487890JBj;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface TTSVoiceApi {
    public static final C487890JBj LIZ = C487890JBj.LIZ;

    @InterfaceC1501160pAQ("/tiktok/sami/multi/ttsvoice/info/v1/")
    Object getVoiceDetails(@InterfaceC1501070pAH("tts_voice_ids") List<String> list, @InterfaceC1501070pAH("need_tts_voice_details") Boolean bool, @InterfaceC1501070pAH("need_total_video_count") Boolean bool2, @InterfaceC1501070pAH("need_video_list") Boolean bool3, @InterfaceC1501070pAH("video_list_count") Long l, @InterfaceC1501070pAH("video_list_offset") Long l2, InterfaceC1364105Vn<? super C0X52<TTSVoiceDetailsResponse>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/sami/multi/ttsvoice/info/v1/")
    ListenableFuture<TTSVoiceDetailsResponse> getVoiceDetailsFuture(@InterfaceC1501070pAH("tts_voice_ids") List<String> list, @InterfaceC1501070pAH("need_tts_voice_details") Boolean bool, @InterfaceC1501070pAH("need_total_video_count") Boolean bool2, @InterfaceC1501070pAH("need_video_list") Boolean bool3, @InterfaceC1501070pAH("video_list_count") Long l, @InterfaceC1501070pAH("video_list_offset") Long l2);
}
