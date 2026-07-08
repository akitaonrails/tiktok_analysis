package com.ss.android.ugc.aweme.shortvideo.record;

import X.C1A75;
import X.C1DLR;
import X.C1DLT;
import X.InterfaceC1652760t6w;
import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes36.dex */
public class AudioRecordModule {
    public final C1DLT audioRecordListener;
    public final C1A75 cameraBehaviorConfig;
    public volatile long mStartTime = -1;
    public WeakReference<Activity> weakReference;

    public InterfaceC1652760t6w getAudioRecorderInterface() {
        return new C1DLR() { // from class: X.1DLO
        };
    }

    public AudioRecordModule(Activity activity, C1A75 c1a75, C1DLT c1dlt) {
        this.weakReference = new WeakReference<>(activity);
        this.cameraBehaviorConfig = c1a75;
        this.audioRecordListener = c1dlt;
    }
}
