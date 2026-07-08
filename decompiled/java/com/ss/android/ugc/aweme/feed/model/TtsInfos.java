package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TtsInfos implements Serializable {

    @C09CT("bit_rate")
    public Integer bitRate;

    @C09CT("format")
    public String format;

    @C09CT("lang")
    public String lang;

    @C09CT("language_code")
    public String languageCode;

    @C09CT("language_id")
    public Long languageId;

    @C09CT("play_addr")
    public PlayAddress playAddress;

    @C09CT("sub_info")
    public String subInfo;

    @C09CT("voice_type")
    public String voiceType;

    @C09CT("volume_info")
    public String volumeInfo;

    public TtsInfos() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TtsInfos(lang=");
        sbLIZ.append(this.lang);
        sbLIZ.append(", languageId=");
        sbLIZ.append(this.languageId);
        sbLIZ.append(", languageCode=");
        sbLIZ.append(this.languageCode);
        sbLIZ.append(", voiceType=");
        sbLIZ.append(this.voiceType);
        sbLIZ.append(", playAddress=");
        sbLIZ.append(this.playAddress);
        sbLIZ.append(", volumeInfo=");
        sbLIZ.append(this.volumeInfo);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(this.bitRate);
        sbLIZ.append(", format=");
        sbLIZ.append(this.format);
        sbLIZ.append(", subInfo=");
        sbLIZ.append(this.subInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TtsInfos(String str, Long l, String str2, String str3, PlayAddress playAddress, String str4, Integer num, String str5, String str6) {
        this.lang = str;
        this.languageId = l;
        this.languageCode = str2;
        this.voiceType = str3;
        this.playAddress = playAddress;
        this.volumeInfo = str4;
        this.bitRate = num;
        this.format = str5;
        this.subInfo = str6;
    }
}
