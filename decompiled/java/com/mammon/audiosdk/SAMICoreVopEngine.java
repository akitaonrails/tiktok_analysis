package com.mammon.audiosdk;

import com.bytedance.speech.speechaudio.SpeechAudioLoader;
import com.mammon.audiosdk.bridge.SAMICoreBridge;
import com.mammon.audiosdk.enums.SAMICoreVopProcessRecordAudioResult;
import com.mammon.audiosdk.enums.SAMICoreVopSpeakerInfoCommand;
import com.mammon.audiosdk.enums.SAMICoreVopState;
import com.mammon.audiosdk.enums.SAMICoreVopTextState;
import com.mammon.audiosdk.structures.SAMICoreVopInitContext;
import com.mammon.audiosdk.structures.SAMICoreVopRecordingStatus;
import com.mammon.audiosdk.structures.SAMICoreVopSpeakerInfo;
import com.mammon.audiosdk.structures.SAMICoreVopTextInfo;

/* JADX INFO: loaded from: classes35.dex */
public final class SAMICoreVopEngine {
    public static SAMICoreBridge bridge;
    public volatile long engine = bridge.VopEngine_native_createEngine();

    public void destroyEngine() {
        bridge.VopEngine_native_destroyEngine(this.engine);
    }

    public float getCurrentPositionMs() {
        return bridge.VopEngine_native_getCurrentPositionMs(this.engine);
    }

    public float getTotalDurationMs() {
        return bridge.VopEngine_native_getTotalDurationMs(this.engine);
    }

    public int play() {
        return bridge.VopEngine_native_play(this.engine);
    }

    public int preparePlayer() {
        return bridge.VopEngine_native_preparePlayer(this.engine);
    }

    public int stop() {
        return bridge.VopEngine_native_stop(this.engine);
    }

    static {
        SpeechAudioLoader.getInstance().load();
        bridge = SpeechAudioLoader.getInstance().createSAMICoreBridge();
    }

    public int getCurrentState(SAMICoreVopState[] sAMICoreVopStateArr) {
        int[] iArr = new int[1];
        int iVopEngine_native_getCurrentState = bridge.VopEngine_native_getCurrentState(this.engine, iArr);
        sAMICoreVopStateArr[0] = SAMICoreVopState.values()[iArr[0]];
        return iVopEngine_native_getCurrentState;
    }

    public int getNextTextInfo(SAMICoreVopTextInfo sAMICoreVopTextInfo) {
        String[] strArr = new String[1];
        int[] iArr = new int[1];
        int iVopEngine_native_getNextTextInfo = bridge.VopEngine_native_getNextTextInfo(this.engine, strArr, iArr);
        sAMICoreVopTextInfo.textJson = strArr[0];
        sAMICoreVopTextInfo.textState = SAMICoreVopTextState.values()[iArr[0]];
        return iVopEngine_native_getNextTextInfo;
    }

    public int getRecordingStatus(SAMICoreVopRecordingStatus sAMICoreVopRecordingStatus) {
        return bridge.VopEngine_native_getRecordingStatus(this.engine, sAMICoreVopRecordingStatus);
    }

    public int getSpeakerInfo(SAMICoreVopSpeakerInfo sAMICoreVopSpeakerInfo) {
        return bridge.VopEngine_native_getSpeakerInfo(this.engine, sAMICoreVopSpeakerInfo);
    }

    public int init(SAMICoreVopInitContext sAMICoreVopInitContext) {
        return bridge.VopEngine_native_init(this.engine, sAMICoreVopInitContext);
    }

    public int manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand sAMICoreVopSpeakerInfoCommand) {
        return bridge.VopEngine_native_manageSpeakerInfo(this.engine, sAMICoreVopSpeakerInfoCommand);
    }

    public int processRecordAudio(byte[] bArr, int i, SAMICoreVopProcessRecordAudioResult[] sAMICoreVopProcessRecordAudioResultArr) {
        int[] iArr = new int[1];
        int iVopEngine_native_processRecordAudio = bridge.VopEngine_native_processRecordAudio(this.engine, bArr, i, iArr);
        sAMICoreVopProcessRecordAudioResultArr[0] = SAMICoreVopProcessRecordAudioResult.values()[iArr[0]];
        return iVopEngine_native_processRecordAudio;
    }
}
