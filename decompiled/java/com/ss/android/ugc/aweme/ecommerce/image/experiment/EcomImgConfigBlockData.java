package com.ss.android.ugc.aweme.ecommerce.image.experiment;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class EcomImgConfigBlockData {

    @C09CT("block_list")
    public final Set<String> blockList;

    public EcomImgConfigBlockData() {
        this(null, 1, null);
    }

    public EcomImgConfigBlockData(Set<String> set) {
        this.blockList = set;
    }

    public EcomImgConfigBlockData(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set);
    }
}
