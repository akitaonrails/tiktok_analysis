package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreAbConfigType;

/* JADX INFO: loaded from: classes5.dex */
public interface SAMICoreAbCallback {
    Boolean getSAMICoreAbBoolConfig(String str);

    Object getSAMICoreAbConfig(String str, SAMICoreAbConfigType sAMICoreAbConfigType);

    Float getSAMICoreAbFloatConfig(String str);

    Integer getSAMICoreAbIntConfig(String str);

    String getSAMICoreAbStringConfig(String str);
}
