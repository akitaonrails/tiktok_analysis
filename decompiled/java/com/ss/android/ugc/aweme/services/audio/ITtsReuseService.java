package com.ss.android.ugc.aweme.services.audio;

import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes23.dex */
public interface ITtsReuseService extends IAudioService {
    void destroyAudioSDKHandler();

    void fetchBatchTtsAudio(List<TtsReuseModel> list);

    void fetchEffectModel(List<TtsReuseModel> list);

    void fetchSingleTtsAudio(String str, String str2, String str3, boolean z);

    Object fetchTtsAudioFile(String str, String str2, String str3, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void initAudioSDKHandler();

    void initAudioSDKHandler(CreativeInfo creativeInfo);
}
