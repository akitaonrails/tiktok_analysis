package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.ss.android.ugc.aweme.services.ISDKService;

/* JADX INFO: loaded from: classes9.dex */
public final class SplitParams {
    public ISDKService.SplitCallback callback;
    public Context context;
    public int minDuration;
    public String targetAudioFile;
    public String targetVideoFile;
    public boolean useSplitVideo;
    public boolean usingVEEditor;
    public String videoPath;
    public String workspace;

    public final ISDKService.SplitCallback getCallback() {
        return this.callback;
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getTargetAudioFile() {
        return this.targetAudioFile;
    }

    public final String getTargetVideoFile() {
        return this.targetVideoFile;
    }

    public final boolean getUseSplitVideo() {
        return this.useSplitVideo;
    }

    public final boolean getUsingVEEditor() {
        return this.usingVEEditor;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final String getWorkspace() {
        return this.workspace;
    }

    public final void setCallback(ISDKService.SplitCallback splitCallback) {
        this.callback = splitCallback;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setMinDuration(int i) {
        this.minDuration = i;
    }

    public final void setTargetAudioFile(String str) {
        this.targetAudioFile = str;
    }

    public final void setTargetVideoFile(String str) {
        this.targetVideoFile = str;
    }

    public final void setUseSplitVideo(boolean z) {
        this.useSplitVideo = z;
    }

    public final void setUsingVEEditor(boolean z) {
        this.usingVEEditor = z;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public final void setWorkspace(String str) {
        this.workspace = str;
    }

    public SplitParams(Context context, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, ISDKService.SplitCallback splitCallback) {
        this.context = context;
        this.minDuration = i;
        this.workspace = str;
        this.videoPath = str2;
        this.targetAudioFile = str3;
        this.targetVideoFile = str4;
        this.usingVEEditor = z;
        this.useSplitVideo = z2;
        this.callback = splitCallback;
    }
}
