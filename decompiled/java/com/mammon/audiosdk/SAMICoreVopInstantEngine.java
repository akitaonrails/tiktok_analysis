package com.mammon.audiosdk;

import com.bytedance.speech.speechaudio.SpeechAudioLoader;
import com.mammon.audiosdk.bridge.SAMICoreBridge;
import com.mammon.audiosdk.enums.SAMICoreVopProcessRecordAudioResult;
import com.mammon.audiosdk.enums.SAMICoreVopSpeakerInfoCommand;
import com.mammon.audiosdk.enums.SAMICoreVopState;
import com.mammon.audiosdk.enums.SAMICoreVopTextState;
import com.mammon.audiosdk.structures.SAMICoreVopInitContext;
import com.mammon.audiosdk.structures.SAMICoreVopSpeakerInfo;
import com.mammon.audiosdk.structures.SAMICoreVopTextInfo;

/* JADX INFO: loaded from: classes35.dex */
public final class SAMICoreVopInstantEngine {
    public static SAMICoreBridge bridge;
    public volatile long engine = bridge.VopInstantEngine_native_createEngine();

    public void destroyEngine() {
        bridge.VopInstantEngine_native_destroyEngine(this.engine);
    }

    public int play() {
        return bridge.VopInstantEngine_native_play(this.engine);
    }

    public int stop() {
        return bridge.VopInstantEngine_native_stop(this.engine);
    }

    static {
        SpeechAudioLoader.getInstance().load();
        bridge = SpeechAudioLoader.getInstance().createSAMICoreBridge();
    }

    public int getCurrentState(SAMICoreVopState[] sAMICoreVopStateArr) {
        int[] iArr = new int[1];
        int iVopInstantEngine_native_getCurrentState = bridge.VopInstantEngine_native_getCurrentState(this.engine, iArr);
        sAMICoreVopStateArr[0] = SAMICoreVopState.values()[iArr[0]];
        return iVopInstantEngine_native_getCurrentState;
    }

    public int getNextTextInfo(SAMICoreVopTextInfo sAMICoreVopTextInfo) {
        String[] strArr = new String[1];
        int[] iArr = new int[1];
        int iVopInstantEngine_native_getNextTextInfo = bridge.VopInstantEngine_native_getNextTextInfo(this.engine, strArr, iArr);
        sAMICoreVopTextInfo.textJson = strArr[0];
        sAMICoreVopTextInfo.textState = SAMICoreVopTextState.values()[iArr[0]];
        return iVopInstantEngine_native_getNextTextInfo;
    }

    public int getSpeakerInfo(SAMICoreVopSpeakerInfo sAMICoreVopSpeakerInfo) {
        return bridge.VopInstantEngine_native_getSpeakerInfo(this.engine, sAMICoreVopSpeakerInfo);
    }

    public int init(SAMICoreVopInitContext sAMICoreVopInitContext) {
        return bridge.VopInstantEngine_native_init(this.engine, sAMICoreVopInitContext);
    }

    public int manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand sAMICoreVopSpeakerInfoCommand) {
        return bridge.VopInstantEngine_native_manageSpeakerInfo(this.engine, sAMICoreVopSpeakerInfoCommand);
    }

    public int preparePlayer(String str) {
        return bridge.VopInstantEngine_native_preparePlayer(this.engine, str);
    }

    public int processRecordAudio(byte[] bArr, int i, SAMICoreVopProcessRecordAudioResult[] sAMICoreVopProcessRecordAudioResultArr) {
        int[] iArr = new int[1];
        int iVopInstantEngine_native_processRecordAudio = bridge.VopInstantEngine_native_processRecordAudio(this.engine, bArr, i, iArr);
        sAMICoreVopProcessRecordAudioResultArr[0] = SAMICoreVopProcessRecordAudioResult.values()[iArr[0]];
        return iVopInstantEngine_native_processRecordAudio;
    }
}
