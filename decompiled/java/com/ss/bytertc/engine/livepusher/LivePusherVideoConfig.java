package com.ss.bytertc.engine.livepusher;

import com.ss.bytertc.engine.live.MixedStreamConfig;

/* JADX INFO: loaded from: classes21.dex */
public class LivePusherVideoConfig {
    public boolean enableBFrame;
    public int fps;
    public int gopSize;
    public int height;
    public boolean isHardware;
    public int maxBitrateKbps;
    public int minBitrateKbps;
    public int simChannelNumber = 1;
    public int startBitrateKbps;
    public MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType videoCodecType;
    public int width;
}
