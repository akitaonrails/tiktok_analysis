package com.ss.android.ugc.aweme.services.audio;

import X.C01GW;
import X.C452501pT;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes23.dex */
public interface IAudioGlitchService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final C01GW<IAudioGlitchService> INSTANCE$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(633));

        public final IAudioGlitchService getINSTANCE() {
            return INSTANCE$delegate.getValue();
        }
    }

    void enablePlayGlitchInShootScene(VERecorder vERecorder, boolean z);

    void enableRecordGlitchInShootScene(VEAudioCapture vEAudioCapture, boolean z);

    void getPlayGlitchAndReportInShootScene(CreativeModel creativeModel, VERecorder vERecorder, boolean z, String str);

    void getRecordGlitchAndReportInShootScene(VEAudioCapture vEAudioCapture);

    void startDevicesChangedListener();

    void stopDevicesChangedListener();
}
