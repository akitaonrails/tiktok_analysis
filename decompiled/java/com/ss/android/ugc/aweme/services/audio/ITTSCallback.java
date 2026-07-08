package com.ss.android.ugc.aweme.services.audio;

import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreTtsResult;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public interface ITTSCallback {
    void onCancel(int i);

    void onConnectToServerSuc();

    void onFailure(int i, int i2, String str, String str2, SAMICoreServerEvent sAMICoreServerEvent);

    void onFirstAudioReceived(SAMICoreTtsResult sAMICoreTtsResult);

    void onStreamTTSPlayFinish();

    void onSuccess(int i, File file, String str, SAMICoreServerEvent sAMICoreServerEvent);
}
