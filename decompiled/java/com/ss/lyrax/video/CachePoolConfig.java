package com.ss.lyrax.video;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class CachePoolConfig implements Serializable {

    @C09CT("i420_buffer_pool_config")
    public JavaI420BufferPoolConfig i420BufferPoolConfig;

    @C09CT("texture_buffer_pool_config")
    public TextureBufferPoolConfig textureBufferPoolConfig;

    @C09CT("video_frame_pool_config")
    public VideoFramePoolConfig videoFramePoolConfig;

    public CachePoolConfig() {
        this.videoFramePoolConfig = new VideoFramePoolConfig();
        this.textureBufferPoolConfig = new TextureBufferPoolConfig();
        this.i420BufferPoolConfig = new JavaI420BufferPoolConfig();
    }

    public JavaI420BufferPoolConfig getI420BufferPoolConfig() {
        return this.i420BufferPoolConfig;
    }

    public TextureBufferPoolConfig getTextureBufferPoolConfig() {
        return this.textureBufferPoolConfig;
    }

    public VideoFramePoolConfig getVideoFramePoolConfig() {
        return this.videoFramePoolConfig;
    }

    public CachePoolConfig(VideoFramePoolConfig videoFramePoolConfig, TextureBufferPoolConfig textureBufferPoolConfig, JavaI420BufferPoolConfig javaI420BufferPoolConfig) {
        this.videoFramePoolConfig = new VideoFramePoolConfig();
        this.textureBufferPoolConfig = new TextureBufferPoolConfig();
        new JavaI420BufferPoolConfig();
        this.videoFramePoolConfig = videoFramePoolConfig;
        this.textureBufferPoolConfig = textureBufferPoolConfig;
        this.i420BufferPoolConfig = javaI420BufferPoolConfig;
    }
}
