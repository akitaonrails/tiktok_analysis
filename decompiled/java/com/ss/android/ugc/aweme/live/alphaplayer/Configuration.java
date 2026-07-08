package com.ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes35.dex */
public class Configuration {
    public int alphaVideoViewType;
    public Context context;
    public boolean enableElementEvent;
    public boolean enableRendererWorkerThread;
    public LifecycleOwner lifecycleOwner;
    public String threadName = "alpha-play-thread";
    public int rendererVersion = 1;

    public Configuration copy() {
        Configuration configuration = new Configuration();
        configuration.setContext(this.context);
        configuration.setLifecycleOwner(this.lifecycleOwner);
        configuration.setAlphaVideoViewType(this.alphaVideoViewType);
        configuration.setThreadName(this.threadName);
        configuration.setRendererWorkerThread(this.enableRendererWorkerThread);
        configuration.setEnableElementEvent(this.enableElementEvent);
        configuration.useVideoRendererVersion(this.rendererVersion);
        return configuration;
    }

    public int getAlphaVideoViewType() {
        return this.alphaVideoViewType;
    }

    public Context getContext() {
        return this.context;
    }

    public LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public boolean isEnableElementEvent() {
        return this.enableElementEvent;
    }

    public boolean isEnableRendererWorkerThread() {
        return this.enableRendererWorkerThread;
    }

    public int videoRendererVersion() {
        return this.rendererVersion;
    }

    public Configuration setAlphaVideoViewType(int i) {
        this.alphaVideoViewType = i;
        return this;
    }

    public Configuration setContext(Context context) {
        this.context = context;
        return this;
    }

    public Configuration setEnableElementEvent(boolean z) {
        this.enableElementEvent = z;
        return this;
    }

    public Configuration setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
        return this;
    }

    public Configuration setRendererWorkerThread(boolean z) {
        this.enableRendererWorkerThread = z;
        return this;
    }

    public Configuration setThreadName(String str) {
        this.threadName = str;
        return this;
    }

    public Configuration useVideoRendererVersion(int i) {
        this.rendererVersion = i;
        return this;
    }
}
