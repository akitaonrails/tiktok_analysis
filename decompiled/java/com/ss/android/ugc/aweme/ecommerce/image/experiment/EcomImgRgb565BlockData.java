package com.ss.android.ugc.aweme.ecommerce.image.experiment;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public final class EcomImgRgb565BlockData {

    @C09CT("block_list")
    public final Set<String> blockList;

    @C09CT("block_processor")
    public final boolean blockProcess;

    @C09CT("block_processor_list")
    public final Set<String> blockProcessorList;

    @C09CT("enable")
    public final boolean enable;

    public EcomImgRgb565BlockData() {
        this(false, null, false, null, 15, null);
    }

    public EcomImgRgb565BlockData(boolean z, Set<String> set, boolean z2, Set<String> set2) {
        this.enable = z;
        this.blockList = set;
        this.blockProcess = z2;
        this.blockProcessorList = set2;
    }

    public EcomImgRgb565BlockData(boolean z, Set set, boolean z2, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C08CX.INSTANCE : set, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? C08CX.INSTANCE : set2);
    }
}
