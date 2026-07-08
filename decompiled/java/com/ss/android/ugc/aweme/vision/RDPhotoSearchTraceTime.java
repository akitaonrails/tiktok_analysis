package com.ss.android.ugc.aweme.vision;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class RDPhotoSearchTraceTime implements Serializable {
    public Long bgLoaded;
    public Long bgStartLoad;
    public Long enterResult;

    @C09CT("log_params")
    public RDPhotoSearchTraceLogParams logParams;
    public Long netDataProcess;

    @C09CT("request_end_timestamp")
    public Long netReceive;

    @C09CT("request_start_timestamp")
    public Long netRequest;

    @C09CT("update_data_timestamp")
    public Long updateDataTimestamp;

    public RDPhotoSearchTraceTime() {
        this(null, null, null, null, null, null, new RDPhotoSearchTraceLogParams(null, null, null, null, null, null, null, null, null), null);
    }

    public final void setBgLoaded(Long l) {
        this.bgLoaded = l;
    }

    public final void setBgStartLoad(Long l) {
        this.bgStartLoad = l;
    }

    public final void setEnterResult(Long l) {
        this.enterResult = l;
    }

    public final void setLogParams(RDPhotoSearchTraceLogParams rDPhotoSearchTraceLogParams) {
        this.logParams = rDPhotoSearchTraceLogParams;
    }

    public final void setNetDataProcess(Long l) {
        this.netDataProcess = l;
    }

    public final void setNetReceive(Long l) {
        this.netReceive = l;
    }

    public final void setNetRequest(Long l) {
        this.netRequest = l;
    }

    public final void setUpdateDataTimestamp(Long l) {
        this.updateDataTimestamp = l;
    }

    public RDPhotoSearchTraceTime(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, RDPhotoSearchTraceLogParams rDPhotoSearchTraceLogParams, Long l7) {
        this.enterResult = l;
        this.bgStartLoad = l2;
        this.bgLoaded = l3;
        this.netRequest = l4;
        this.netReceive = l5;
        this.updateDataTimestamp = l6;
        this.logParams = rDPhotoSearchTraceLogParams;
        this.netDataProcess = l7;
    }
}
