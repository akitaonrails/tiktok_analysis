package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ChunkMetaStruct {

    @C09CT("chunk_name")
    public final String chunkName;

    @C09CT("product_pack_type")
    public final Integer productPackType;

    public ChunkMetaStruct() {
        this(null, null);
    }

    public ChunkMetaStruct(String str, Integer num) {
        this.chunkName = str;
        this.productPackType = num;
    }
}
