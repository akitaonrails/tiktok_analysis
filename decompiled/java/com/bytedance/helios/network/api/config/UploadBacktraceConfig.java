package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class UploadBacktraceConfig {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public final Set<String> f43default;

    @C09CT("web_image")
    public final Set<String> webImage;

    public UploadBacktraceConfig() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadBacktraceConfig)) {
            return false;
        }
        UploadBacktraceConfig uploadBacktraceConfig = (UploadBacktraceConfig) obj;
        return Intrinsics.LJFF(this.f43default, uploadBacktraceConfig.f43default) && Intrinsics.LJFF(this.webImage, uploadBacktraceConfig.webImage);
    }

    public final int hashCode() {
        return (this.f43default.hashCode() * 31) + this.webImage.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadBacktraceConfig(default=");
        sbLIZ.append(this.f43default);
        sbLIZ.append(", webImage=");
        sbLIZ.append(this.webImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UploadBacktraceConfig(Set<String> set, Set<String> set2) {
        this.f43default = set;
        this.webImage = set2;
    }

    public UploadBacktraceConfig(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2);
    }
}
