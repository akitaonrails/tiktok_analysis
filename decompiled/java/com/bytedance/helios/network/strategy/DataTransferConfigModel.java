package com.bytedance.helios.network.strategy;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class DataTransferConfigModel {

    @C09CT("block_list")
    public final Set<String> blockList;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("sample_rate")
    public final double reportSampleRate;

    public DataTransferConfigModel() {
        this(false, null, 0.0d, 7, null);
    }

    public DataTransferConfigModel(boolean z, Set<String> set, double d) {
        this.enable = z;
        this.blockList = set;
        this.reportSampleRate = d;
    }

    public DataTransferConfigModel(boolean z, Set set, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C08CX.INSTANCE : set, (i & 4) != 0 ? 0.0d : d);
    }
}
