package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public interface IShortVideoConfig {

    public interface MusicWaveDataListener {
    }

    String cutsameSdkVersion();

    void enableHookLibrary(boolean z);

    long extendedDuetOrStitchTime();

    List<String> getBOEBypassHostList();

    List<String> getBOEBypassPathList();

    String getErrorHintWhenDisableDuetOrStitch(int i);

    boolean getUsingOnline();

    boolean isHookLibrary();

    boolean isRecordSessionUI(Activity activity);

    boolean isRecordSessionUIPage(Object obj);

    boolean isRecording();

    long maxConsumerDuetOrStitchVideoTime();

    long maxCreatorDuetOrStitchVideoTime();
}
