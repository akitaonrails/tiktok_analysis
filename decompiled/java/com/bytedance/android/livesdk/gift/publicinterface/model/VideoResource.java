package com.bytedance.android.livesdk.gift.publicinterface.model;

import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class VideoResource {
    public final String videoMd5;
    public final String videoTypeName;
    public final List<String> videoUrl;

    public VideoResource() {
        this(null, null, null, 7, null);
    }

    public VideoResource(String str, List<String> list, String str2) {
        this.videoTypeName = str;
        this.videoUrl = list;
        this.videoMd5 = str2;
    }

    public VideoResource(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? "" : str2);
    }
}
