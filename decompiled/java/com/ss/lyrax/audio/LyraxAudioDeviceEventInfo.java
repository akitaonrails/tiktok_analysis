package com.ss.lyrax.audio;

import X.C2188811AlT;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.utils.LyraxValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioDeviceEventInfo {
    public LyraxAudioDeviceType deviceType;
    public LyraxErrorCode errorCode;
    public LyraxAudioDeviceEventType eventType;
    public Map<LyraxAudioExtensionKey, LyraxValue> extensionMap;
    public String message;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAudioDeviceEventInfo {eventType: ");
        sbLIZ.append(this.eventType.toString());
        sbLIZ.append(", deviceType: ");
        sbLIZ.append(this.deviceType.toString());
        sbLIZ.append(", errorCode: ");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", message='");
        sbLIZ.append(this.message);
        sbLIZ.append('\'');
        sbLIZ.append(", extension_map= ");
        sbLIZ.append(this.extensionMap.toString());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxAudioDeviceEventInfo(LyraxAudioDeviceEventType lyraxAudioDeviceEventType, LyraxAudioDeviceType lyraxAudioDeviceType, LyraxErrorCode lyraxErrorCode, String str, Map<LyraxAudioExtensionKey, LyraxValue> map) {
        this.eventType = LyraxAudioDeviceEventType.UNKNOWN;
        this.deviceType = LyraxAudioDeviceType.UNKNOWN;
        new HashMap();
        this.eventType = lyraxAudioDeviceEventType;
        this.deviceType = lyraxAudioDeviceType;
        this.errorCode = lyraxErrorCode;
        this.message = str;
        this.extensionMap = map;
    }

    public static LyraxAudioDeviceEventInfo create(LyraxAudioDeviceEventType lyraxAudioDeviceEventType, LyraxAudioDeviceType lyraxAudioDeviceType, LyraxErrorCode lyraxErrorCode, String str, Map<LyraxAudioExtensionKey, LyraxValue> map) {
        return new LyraxAudioDeviceEventInfo(lyraxAudioDeviceEventType, lyraxAudioDeviceType, lyraxErrorCode, str, map);
    }
}
