package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum VideoSolutionMode {
    VIDEO_SOLUTION_MODE_SINGLE(0),
    VIDEO_SOLUTION_MODE_SIMULCAST(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == VIDEO_SOLUTION_MODE_SINGLE ? "kVideoSolutionModeSingle" : "kVideoSolutionModeSimulcast";
    }

    public int value() {
        return this.value;
    }

    public static VideoSolutionMode fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VIDEO_SOLUTION_MODE_SIMULCAST;
        }
        return VIDEO_SOLUTION_MODE_SINGLE;
    }

    public static VideoSolutionMode valueOf(String str) {
        return (VideoSolutionMode) C08FF.LIZ(VideoSolutionMode.class, str);
    }

    VideoSolutionMode(int i) {
        this.value = i;
    }
}
