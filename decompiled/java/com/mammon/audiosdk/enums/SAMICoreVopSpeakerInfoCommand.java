package com.mammon.audiosdk.enums;

import X.C08FF;

/* JADX INFO: loaded from: classes35.dex */
public enum SAMICoreVopSpeakerInfoCommand {
    SIGN_AGREEMENT(0),
    START_RECORD_TASK(1),
    START_BUILD_TASK(2),
    SET_PUBLIC(3),
    SET_PRIVATE(4),
    DELETE(5),
    BIND_VOICE(6),
    DISCARD_VOICE(7);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopSpeakerInfoCommand valueOf(String str) {
        return (SAMICoreVopSpeakerInfoCommand) C08FF.LIZ(SAMICoreVopSpeakerInfoCommand.class, str);
    }

    SAMICoreVopSpeakerInfoCommand(int i) {
        this.value = i;
    }
}
