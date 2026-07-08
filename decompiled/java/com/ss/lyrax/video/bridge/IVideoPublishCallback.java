package com.ss.lyrax.video.bridge;

import com.ss.lyrax.video.LyraxSimulcastUpdateLayoutConfigEvent;
import com.ss.lyrax.video.LyraxUpdateVideoParamsEvent;

/* JADX INFO: loaded from: classes21.dex */
public interface IVideoPublishCallback {
    void onSimulcastUpdateLayoutConfigEvent(LyraxSimulcastUpdateLayoutConfigEvent lyraxSimulcastUpdateLayoutConfigEvent);

    void onUpdateVideoParamsEvent(LyraxUpdateVideoParamsEvent lyraxUpdateVideoParamsEvent);
}
