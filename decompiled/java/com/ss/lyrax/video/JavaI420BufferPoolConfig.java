package com.ss.lyrax.video;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class JavaI420BufferPoolConfig implements Serializable {

    @C09CT("cache_pool_strategy")
    public int cachePoolStrategy;

    @C09CT("config_pool_size")
    public int configPoolSize;

    @C09CT("enable")
    public boolean enable;

    public JavaI420BufferPoolConfig() {
        this.configPoolSize = 4;
    }

    public JavaI420BufferPoolConfig(boolean z, int i, int i2) {
        this.enable = z;
        this.configPoolSize = i;
        this.cachePoolStrategy = i2;
    }
}
