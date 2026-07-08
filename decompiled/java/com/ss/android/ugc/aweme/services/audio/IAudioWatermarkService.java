package com.ss.android.ugc.aweme.services.audio;

import X.InterfaceC1364105Vn;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public interface IAudioWatermarkService extends IAudioService {
    boolean enbaleAudioWatermarkTTSVC();

    void fetchAudioWatermarkInfo(List<String> list, List<String> list2, Function1<? super AudioWatermarkInfo, Unit> function1);

    Object fetchTtsCreatorInfoByIdList(List<String> list, InterfaceC1364105Vn<? super TtsCreatorInfo> interfaceC1364105Vn);

    Object fetchVcCreatorInfoByIdList(List<String> list, InterfaceC1364105Vn<? super VcCreatorInfo> interfaceC1364105Vn);
}
