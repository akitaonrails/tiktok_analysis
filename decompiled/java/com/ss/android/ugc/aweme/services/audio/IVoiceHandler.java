package com.ss.android.ugc.aweme.services.audio;

import X.InterfaceC1364105Vn;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public interface IVoiceHandler {

    public static final class DefaultImpls {
        public static void onExtractAudio(IVoiceHandler iVoiceHandler, String str, int i, int i2) {
        }
    }

    void onExtractAudio(String str, int i, int i2);

    Object onUpdateResult(VoiceDetectionResult voiceDetectionResult, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);
}
