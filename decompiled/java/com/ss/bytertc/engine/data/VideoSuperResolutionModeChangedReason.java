package com.ss.bytertc.engine.data;

import X.C08FF;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes.dex */
public enum VideoSuperResolutionModeChangedReason {
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_API_OFF(0),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_API_ON(1),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_RESOLUTION_EXCEED(2),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OVER_USE(3),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_DEVICE_NOT_SUPPORT(4),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_DYNAMIC_CLOSE(5),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OTHER_SETTING_DISABLED(6),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OTHER_SETTING_ENABLED(7),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_NO_COMPONENT(8),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_STREAM_NOT_EXIST(9);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 100 ? i != 101 ? i != 200 ? "" : "kVideoSuperResolutionModeChangedReasonOther" : "kVideoSuperResolutionModeChangedReasonStreamNotExist" : "kVideoSuperResolutionModeChangedReasonNoComponent" : "kVideoSuperResolutionModeChangedReasonDynamicClose" : "kVideoSuperResolutionModeChangedReasonDeviceNotSupport" : "kVideoSuperResolutionModeChangedReasonOverUse" : "kVideoSuperResolutionModeChangedReasonResolutionExceed" : "kVideoSuperResolutionModeChangedReasonAPIOn" : "kVideoSuperResolutionModeChangedReasonAPIOff";
    }

    public int value() {
        return this.value;
    }

    public static VideoSuperResolutionModeChangedReason fromId(int i) {
        switch (i) {
            case 0:
                return VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_API_OFF;
            case 1:
                return VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_API_ON;
            case 2:
                return VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_RESOLUTION_EXCEED;
            case 3:
                return VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OVER_USE;
            case 4:
                return VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_DEVICE_NOT_SUPPORT;
            case 5:
                return VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_DYNAMIC_CLOSE;
            case 6:
                return VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OTHER_SETTING_DISABLED;
            case 7:
                return VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OTHER_SETTING_ENABLED;
            case 8:
                return VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_NO_COMPONENT;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_STREAM_NOT_EXIST;
            default:
                return null;
        }
    }

    public static VideoSuperResolutionModeChangedReason valueOf(String str) {
        return (VideoSuperResolutionModeChangedReason) C08FF.LIZ(VideoSuperResolutionModeChangedReason.class, str);
    }

    VideoSuperResolutionModeChangedReason(int i) {
        this.value = i;
    }
}
