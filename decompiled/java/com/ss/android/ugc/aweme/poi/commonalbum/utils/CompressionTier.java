package com.ss.android.ugc.aweme.poi.commonalbum.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class CompressionTier {

    @C09CT("compress_strategy")
    public final CompressStrategy compressStrategy;

    @C09CT("down")
    public final Long down;

    @C09CT("upper")
    public final Long upper;

    public CompressionTier() {
        this(null, null, null);
    }

    public CompressionTier(Long l, Long l2, CompressStrategy compressStrategy) {
        this.down = l;
        this.upper = l2;
        this.compressStrategy = compressStrategy;
    }
}
