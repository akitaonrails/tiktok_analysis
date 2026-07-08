package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreTokenType;
import com.mammon.audiosdk.enums.SAMICoreVopLanguage;
import com.mammon.audiosdk.enums.SAMICoreVopRecordingType;
import com.mammon.audiosdk.enums.SAMICoreVopTextType;

/* JADX INFO: loaded from: classes35.dex */
public class SAMICoreVopInitContext {
    public String appKey;
    public int channel;
    public int connectionTimeout;
    public float cutoffLength;
    public SAMICoreVopLanguage language;
    public int maxBlockSize;
    public SAMICoreVopRecordingType recordingType;
    public int resampleRate;
    public int sampleRate;
    public String sampleTextContent;
    public String saveFileDir;
    public String snrModelPath;
    public float snrThreshold;
    public SAMICoreVopTextType textType;
    public String token;
    public SAMICoreTokenType tokenType;
    public String ttsServerUrl;
    public String userId;
    public String userLocale;
    public String vopServerUrl;
    public int werFailedMaxTimes;
    public float werThreshold;
}
