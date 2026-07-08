package com.ss.lyrax.pushersession;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPusherSEIParam {
    public boolean allowsCovered;
    public String key;
    public boolean keyFrameOnly;
    public long pts;
    public int repeatTimes;
    public int seiFlag;
    public int timeGap;
    public String value;

    public long getSeiFlag() {
        return this.seiFlag;
    }

    public LyraxPusherSEIParam() {
        this.key = "";
        this.value = "";
        this.repeatTimes = 1;
        this.allowsCovered = true;
        this.pts = -1L;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxPusherSEIParam{key='");
        sbLIZ.append(this.key);
        sbLIZ.append('\'');
        sbLIZ.append(", value='");
        sbLIZ.append(this.value);
        sbLIZ.append('\'');
        sbLIZ.append(", repeatTimes=");
        sbLIZ.append(this.repeatTimes);
        sbLIZ.append(", keyFrameOnly=");
        sbLIZ.append(this.keyFrameOnly);
        sbLIZ.append(", allowsCovered=");
        sbLIZ.append(this.allowsCovered);
        sbLIZ.append(", pts=");
        sbLIZ.append(this.pts);
        sbLIZ.append(", seiFlag=");
        sbLIZ.append(this.seiFlag);
        sbLIZ.append(", timeGap=");
        sbLIZ.append(this.timeGap);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getKey() {
        return this.key;
    }

    public int getRepeatCount() {
        return this.repeatTimes;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isAllowOverwrite() {
        return this.allowsCovered;
    }

    public boolean isKeyFrameOnly() {
        return this.keyFrameOnly;
    }

    public LyraxPusherSEIParam setAllowsCovered(boolean z) {
        this.allowsCovered = z;
        return this;
    }

    public LyraxPusherSEIParam setKeyFrameOnly(boolean z) {
        this.keyFrameOnly = z;
        return this;
    }

    public LyraxPusherSEIParam setPts(long j) {
        this.pts = j;
        return this;
    }

    public LyraxPusherSEIParam setRepeatTimes(int i) {
        this.repeatTimes = i;
        return this;
    }

    public LyraxPusherSEIParam setSeiFlag(int i) {
        this.seiFlag = i;
        return this;
    }

    public LyraxPusherSEIParam setTimeGap(int i) {
        this.timeGap = i;
        return this;
    }

    public LyraxPusherSEIParam(String str, String str2) {
        this.repeatTimes = 1;
        this.allowsCovered = true;
        this.pts = -1L;
        this.key = str;
        this.value = str2;
    }
}
