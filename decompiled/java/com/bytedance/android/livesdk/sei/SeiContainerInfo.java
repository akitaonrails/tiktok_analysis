package com.bytedance.android.livesdk.sei;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SeiContainerInfo {

    @C09CT("ch_extra")
    public final String cohostLayoutExtra;

    @C09CT("custom_insets")
    public final List<Double> customInsets;

    @C09CT("dsl_version")
    public final int dslVersion;

    @C09CT("has_split_line")
    public final boolean hasSplitLine;

    @C09CT("layout_key")
    public final String layoutKey;

    @C09CT("container_mode")
    public final String mode;

    @C09CT("layout_mg_extra")
    public final String multiGuestLayoutExtra;

    @C09CT("ratio")
    public final double ratio;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiContainerInfo)) {
            return false;
        }
        SeiContainerInfo seiContainerInfo = (SeiContainerInfo) obj;
        return Intrinsics.LJFF(this.layoutKey, seiContainerInfo.layoutKey) && Double.compare(this.ratio, seiContainerInfo.ratio) == 0 && Intrinsics.LJFF(this.mode, seiContainerInfo.mode) && this.hasSplitLine == seiContainerInfo.hasSplitLine && Intrinsics.LJFF(this.multiGuestLayoutExtra, seiContainerInfo.multiGuestLayoutExtra) && Intrinsics.LJFF(this.cohostLayoutExtra, seiContainerInfo.cohostLayoutExtra) && this.dslVersion == seiContainerInfo.dslVersion && Intrinsics.LJFF(this.customInsets, seiContainerInfo.customInsets);
    }

    public SeiContainerInfo(String str, double d, String str2, boolean z, String str3, String str4, int i, List<Double> list) {
        this.layoutKey = str;
        this.ratio = d;
        this.mode = str2;
        this.hasSplitLine = z;
        this.multiGuestLayoutExtra = str3;
        this.cohostLayoutExtra = str4;
        this.dslVersion = i;
        this.customInsets = list;
    }
}
