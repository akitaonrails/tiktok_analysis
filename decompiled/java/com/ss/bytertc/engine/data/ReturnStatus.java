package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum ReturnStatus {
    RETURN_STATUS_SUCCESS(0),
    RETURN_STATUS_FAILURE(-1),
    RETURN_STATUS_PARAMETER_ERR(-2),
    RETURN_STATUS_WRONG_STATE(-3),
    RETURN_STATUS_HAS_IN_ROOM(-4),
    RETURN_STATUS_HAS_IN_LOGIN(-5),
    RETURN_STATUS_HAS_IN_ECHO_TEST(-6),
    RETURN_STATUS_NEITHER_VIDEO_NOR_AUDIO(-7),
    RETURN_STATUS_ROOMID_IN_USE(-8),
    RETURN_STATUS_SCREEN_NOT_SUPPORT(-9),
    RETURN_STATUS_NOT_SUPPORT(-10),
    RETURN_STATUS_RESOURCE_OVERFLOW(-11),
    RETURN_STATUS_AUDIO_NO_FRAME(-101),
    RETURN_STATUS_AUDIO_NOT_IMPLEMENTED(-102),
    RETURN_STATUS_AUDIO_NO_PERMISSION(-103),
    RETURN_STATUS_AUDIO_DEVICE_NOT_EXISTS(-104),
    RETURN_STATUS_AUDIO_DEVICE_FORMAT_NOT_SUPPORT(-105),
    RETURN_STATUS_AUDIO_DEVICE_NO_DEVICE(-106),
    RETURN_STATUS_AUDIO_DEVICE_CAN_NOT_USE(-107),
    RETURN_STATUS_AUDIO_DEVICE_INIT_FAILED(-108),
    RETURN_STATUS_AUDIO_DEVICE_START_FAILED(-109),
    RETURN_STATUS_NATIVE_IN_VALID(-201),
    RETURN_STATUS_VIDEO_TIMESTAMP_WARNING(-202);

    public int value;

    public int value() {
        return this.value;
    }

    public static ReturnStatus fromId(int i) {
        for (ReturnStatus returnStatus : values()) {
            if (returnStatus.value() == i) {
                return returnStatus;
            }
        }
        return null;
    }

    public static ReturnStatus valueOf(String str) {
        return (ReturnStatus) C08FF.LIZ(ReturnStatus.class, str);
    }

    ReturnStatus(int i) {
        this.value = i;
    }
}
