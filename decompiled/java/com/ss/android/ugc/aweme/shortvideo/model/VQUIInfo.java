package com.ss.android.ugc.aweme.shortvideo.model;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class VQUIInfo {
    public final String compileResolution;
    public final List<String> segmentResolution;
    public final boolean shouldEncode;
    public final String sourceResolution;

    public VQUIInfo(String str, String str2, boolean z, List<String> list) {
        this.sourceResolution = str;
        this.compileResolution = str2;
        this.shouldEncode = z;
        this.segmentResolution = list;
    }
}
