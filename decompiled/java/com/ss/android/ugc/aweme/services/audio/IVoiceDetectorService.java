package com.ss.android.ugc.aweme.services.audio;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public interface IVoiceDetectorService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void addHandler(IVoiceHandler iVoiceHandler);

    void addVoiceDetectionResultListener(int i, VoiceDetectionListener voiceDetectionListener);

    void clearHandler();

    void clearVoiceActivityDetection(Integer num);

    void removeVoiceDetectionResultListener(VoiceDetectionListener voiceDetectionListener);

    void setVoiceDetectionTaskListener(int i, VoiceDetectionListener voiceDetectionListener);

    void startDetectVoiceActivity(VoiceDetectionParam voiceDetectionParam, IVoiceDetectorConfig iVoiceDetectorConfig, Function0<Unit> function0);

    /* JADX INFO: loaded from: classes6.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startDetectVoiceActivity$default(IVoiceDetectorService iVoiceDetectorService, VoiceDetectionParam voiceDetectionParam, IVoiceDetectorConfig iVoiceDetectorConfig, Function0 function0, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    function0 = null;
                }
                iVoiceDetectorService.startDetectVoiceActivity(voiceDetectionParam, iVoiceDetectorConfig, function0);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startDetectVoiceActivity");
        }
    }
}
