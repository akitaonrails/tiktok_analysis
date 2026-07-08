package com.ss.lyrax.video;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public class RtcVideoFramePoolConfig {

    @C09CT("aux_stream_config")
    public PoolConfig auxStreamConfig;

    @C09CT("main_stream_config")
    public PoolConfig rtcConfig;

    public RtcVideoFramePoolConfig() {
        this.rtcConfig = new PoolConfig();
        this.auxStreamConfig = new PoolConfig();
    }

    public PoolConfig getAuxStreamConfig() {
        return this.auxStreamConfig;
    }

    public PoolConfig getRtcConfig() {
        return this.rtcConfig;
    }

    public class PoolConfig {

        @C09CT("initial_size")
        public int initialSize;

        @C09CT("max_size")
        public int maxSize;

        public PoolConfig() {
            this.initialSize = 1;
            this.maxSize = 5;
        }

        public PoolConfig(int i, int i2) {
            this.initialSize = i;
            this.maxSize = i2;
        }
    }

    public RtcVideoFramePoolConfig(int i, int i2, int i3, int i4) {
        this.rtcConfig = new PoolConfig();
        this.auxStreamConfig = new PoolConfig();
        this.rtcConfig = new PoolConfig(i, i2);
        this.auxStreamConfig = new PoolConfig(i3, i4);
    }
}
