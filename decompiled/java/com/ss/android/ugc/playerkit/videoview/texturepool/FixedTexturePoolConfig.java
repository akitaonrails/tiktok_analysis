package com.ss.android.ugc.playerkit.videoview.texturepool;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class FixedTexturePoolConfig implements Serializable {

    @C09CT("fixed_pool_list")
    public List<FixTexturePoolParam> list;

    public List<FixTexturePoolParam> getList() {
        return this.list;
    }

    public void setList(List<FixTexturePoolParam> list) {
        this.list = list;
    }
}
