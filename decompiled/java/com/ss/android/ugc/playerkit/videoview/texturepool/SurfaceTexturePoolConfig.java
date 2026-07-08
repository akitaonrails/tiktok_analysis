package com.ss.android.ugc.playerkit.videoview.texturepool;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public class SurfaceTexturePoolConfig implements Serializable {

    @C09CT("fixed_pool_config")
    public FixedTexturePoolConfig fixedPoolConfig;

    @C09CT("other_pool_config")
    public OtherTexturePoolConfig otherTexturePoolConfig;

    public FixedTexturePoolConfig getFixedPoolConfig() {
        return this.fixedPoolConfig;
    }

    public OtherTexturePoolConfig getOtherTexturePoolConfig() {
        return this.otherTexturePoolConfig;
    }

    public void setFixedPoolConfig(FixedTexturePoolConfig fixedTexturePoolConfig) {
        this.fixedPoolConfig = fixedTexturePoolConfig;
    }

    public void setOtherTexturePoolConfig(OtherTexturePoolConfig otherTexturePoolConfig) {
        this.otherTexturePoolConfig = otherTexturePoolConfig;
    }
}
