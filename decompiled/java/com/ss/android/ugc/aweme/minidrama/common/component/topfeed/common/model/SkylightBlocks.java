package com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightBlocks implements Serializable {

    @C09CT("skylight_card_list")
    public List<SkylightBlockInfo> blocks;

    public final SkylightBlocks copy(List<SkylightBlockInfo> list) {
        return new SkylightBlocks(list);
    }

    public SkylightBlocks(List<SkylightBlockInfo> list) {
        this.blocks = list;
    }

    public final void setBlocks(List<SkylightBlockInfo> list) {
        this.blocks = list;
    }
}
