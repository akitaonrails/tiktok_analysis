package com.ss.videoarch.live.ttquic;

import X.C2188811AlT;
import android.os.Bundle;

/* JADX INFO: loaded from: classes27.dex */
public class TTEvent {
    public int audioCachedNum;
    public int audioInitSectionCached;
    public Bundle bundle;
    public long cacheDuration;
    public int cacheFrameCount;
    public int cacheMode;
    public long cacheReadBytes;
    public int cacheSize;
    public long cacheWriteBytes;
    public long cancelCostTime;
    public int code;
    public String error;
    public int mode;
    public int optCancelTask;
    public int preloadNum;
    public int subCode;
    public String url;
    public int videoCachedNum;
    public int videoInitSectionCached;
    public int what;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTEvent{what=");
        sbLIZ.append(this.what);
        sbLIZ.append(", url='");
        sbLIZ.append(this.url);
        sbLIZ.append('\'');
        sbLIZ.append(", error='");
        sbLIZ.append(this.error);
        sbLIZ.append('\'');
        sbLIZ.append(", code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", subCode=");
        sbLIZ.append(this.subCode);
        sbLIZ.append(", preloadNum=");
        sbLIZ.append(this.preloadNum);
        sbLIZ.append(", videoCachedNum=");
        sbLIZ.append(this.videoCachedNum);
        sbLIZ.append(", audioCachedNum=");
        sbLIZ.append(this.audioCachedNum);
        sbLIZ.append(", videoInitSectionCached=");
        sbLIZ.append(this.videoInitSectionCached);
        sbLIZ.append(", audioInitSectionCached=");
        sbLIZ.append(this.audioInitSectionCached);
        sbLIZ.append(", cacheReadBytes=");
        sbLIZ.append(this.cacheReadBytes);
        sbLIZ.append(", cacheWriteBytes=");
        sbLIZ.append(this.cacheWriteBytes);
        sbLIZ.append(", cacheMode=");
        sbLIZ.append(this.cacheMode);
        sbLIZ.append(", cacheFrameCount=");
        sbLIZ.append(this.cacheFrameCount);
        sbLIZ.append(", cacheDuration=");
        sbLIZ.append(this.cacheDuration);
        sbLIZ.append(", cacheSize=");
        sbLIZ.append(this.cacheSize);
        sbLIZ.append(", cancelCostTime=");
        sbLIZ.append(this.cancelCostTime);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.mode);
        sbLIZ.append(", optCancelTask=");
        sbLIZ.append(this.optCancelTask);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
