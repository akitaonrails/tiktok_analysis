package com.bytedance.realx;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RTCCapabilities {
    public List<String> supportedVideoCodecs;

    public static native String[] nativeGetSupportedVideoCodecs(long j);

    public List<String> getSupportedVideoCodecs() {
        return this.supportedVideoCodecs;
    }

    public RTCCapabilities(long j) {
        this.supportedVideoCodecs = Arrays.asList(nativeGetSupportedVideoCodecs(j));
    }

    public RTCCapabilities(List<String> list) {
        this.supportedVideoCodecs = list;
    }
}
