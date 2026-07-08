package com.ss.lyrax.video;

import X.C09CT;
import X.C2188811AlT;
import android.os.Handler;

/* JADX INFO: loaded from: classes21.dex */
public class VideoBufferPoolConfig {

    @C09CT("checkIntervalMs")
    public int checkIntervalMs;

    @C09CT("debugLogEnable")
    public boolean debugLogEnable;
    public Handler hander;

    @C09CT("maxSizePerResolution")
    public int maxSizePerResolution;

    @C09CT("recycleTimeoutMs")
    public int recycleTimeoutMs;

    @C09CT("resetMatrixWhenRecycle")
    public boolean resetMatrixWhenRecycle;

    public VideoBufferPoolConfig() {
        this.maxSizePerResolution = 5;
        this.checkIntervalMs = 5000;
        this.recycleTimeoutMs = 5000;
        this.resetMatrixWhenRecycle = true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoBufferPoolConfig(maxSizePerResolution=");
        sbLIZ.append(this.maxSizePerResolution);
        sbLIZ.append(", checkIntervalMs=");
        sbLIZ.append(this.checkIntervalMs);
        sbLIZ.append(", recycleTimeoutMs=");
        sbLIZ.append(this.recycleTimeoutMs);
        sbLIZ.append(", debugLogEnable=");
        sbLIZ.append(this.debugLogEnable);
        sbLIZ.append(", resetMatrixWhenRecycle=");
        sbLIZ.append(this.resetMatrixWhenRecycle);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Handler getHandler() {
        return this.hander;
    }

    public void setHandler(Handler handler) {
        this.hander = handler;
    }

    public VideoBufferPoolConfig(int i, int i2, int i3, boolean z, boolean z2) {
        this.maxSizePerResolution = i;
        this.checkIntervalMs = i2;
        this.recycleTimeoutMs = i3;
        this.debugLogEnable = z;
        this.resetMatrixWhenRecycle = z2;
    }
}
