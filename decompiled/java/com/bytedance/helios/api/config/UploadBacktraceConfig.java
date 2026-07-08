package com.bytedance.helios.api.config;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class UploadBacktraceConfig {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public final Set<String> f42default;

    @C09CT("web_image")
    public final Set<String> webImage;

    public UploadBacktraceConfig() {
        this(null, null, 3, null);
    }

    public UploadBacktraceConfig(Set<String> set, Set<String> set2) {
        this.f42default = set;
        this.webImage = set2;
    }

    public UploadBacktraceConfig(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2);
    }
}
