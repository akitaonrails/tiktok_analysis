package com.ss.android.ugc.aweme.services.audio;

import com.ss.android.ugc.aweme.services.audio.IAudioParams;

/* JADX INFO: loaded from: classes4.dex */
public interface IAudioServiceFactory<T extends IAudioParams> {
    IAudioService getAudioService(T t);
}
