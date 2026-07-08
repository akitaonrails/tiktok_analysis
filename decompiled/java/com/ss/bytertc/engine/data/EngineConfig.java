package com.ss.bytertc.engine.data;

import com.ss.bytertc.engine.GLESVersion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class EngineConfig {
    public String appID;
    public Object eglContext;
    public String nativeLoadPath;
    public GLESVersion glesVersion = GLESVersion.GLES_VERSION_2;
    public JSONObject parameters = new JSONObject();

    public EngineConfig(String str) {
        this.appID = str;
    }
}
