package com.ss.lyrax.engine;

import android.content.Context;
import android.os.Environment;
import com.ss.bytertc.engine.GLESVersion;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAndroidOption {
    public Context context;
    public Object eglContext;
    public Environment env;
    public GLESVersion glesVersion;

    public Context getContext() {
        return this.context;
    }

    public Environment getEnv() {
        return this.env;
    }
}
