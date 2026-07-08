package com.ss.android.ugc.aweme.services.audio;

import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public interface ITTSService extends IAudioService {
    void destroyAudioSDKHandler();

    Object fetchTTSAudioFile(String str, String str2, String str3, CreativeInfo creativeInfo, boolean z, boolean z2, ITTSCallback iTTSCallback, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object fetchTTSAudioFile(String str, String str2, String str3, String str4, boolean z, boolean z2, ITTSCallback iTTSCallback, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void initAudioSDKHandler(CreativeInfo creativeInfo);

    void initAudioSDKHandler(String str);

    boolean isStreamReading();

    void onDestroy();

    void setForbidDestroy(boolean z);

    void stopStreamReading();
}
