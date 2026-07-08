package com.ss.bytertc.engine.avclient;

import X.C786410Ut5;
import com.ss.lyrax.ILyraxEngine;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxAVClientLog {
    public static final Companion Companion = new Companion();
    public ILyraxEngine engineRef;
    public String mRoomId;

    public static final class Companion {
    }

    public final void release() {
        this.engineRef = null;
    }

    public final ILyraxEngine getEngineRef() {
        return this.engineRef;
    }

    public final String getMRoomId() {
        return this.mRoomId;
    }

    public final void setEngineRef(ILyraxEngine iLyraxEngine) {
        this.engineRef = iLyraxEngine;
    }

    public final void setMRoomId(String str) {
        this.mRoomId = str;
    }

    public LyraxAVClientLog(ILyraxEngine iLyraxEngine, String str) {
        this.engineRef = iLyraxEngine;
        this.mRoomId = str;
    }

    public final void traceAPICall(String str, JSONObject jSONObject) {
        ILyraxEngine iLyraxEngine = this.engineRef;
        if (iLyraxEngine != null) {
            iLyraxEngine.reportAPICall(str, C786410Ut5.J3(jSONObject));
        }
    }

    public final void traceSDKCallback(String str, JSONObject jSONObject) {
        ILyraxEngine iLyraxEngine = this.engineRef;
        if (iLyraxEngine != null) {
            iLyraxEngine.reportSDKCallback(str, C786410Ut5.J3(jSONObject));
        }
    }
}
