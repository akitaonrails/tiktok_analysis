package com.ss.android.ttvecamera.cameraalgorithm;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: loaded from: classes21.dex */
public class TETaintSceneDetectParams extends TECameraAlgorithmParam {
    public int backendType;
    public String kernelBinPath;
    public String modelPath;
    public int detectFrequency = 3;
    public int numThread = 2;
    public int detectRepeatNum = 1;

    public TETaintSceneDetectParams() {
        this.type = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
    }
}
