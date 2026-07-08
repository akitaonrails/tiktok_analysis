package com.ss.bytertc.engine.data;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes17.dex */
public class StreamSycnInfoConfig {
    public int repeatCount;
    public StreamIndex streamIndex;
    public SyncInfoStreamType streamType;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamSycnInfoConfig{ streamIndex='");
        sbLIZ.append(this.streamIndex.toString());
        sbLIZ.append('\'');
        sbLIZ.append("repeatCount='");
        sbLIZ.append(this.repeatCount);
        sbLIZ.append('\'');
        sbLIZ.append("streamType=Audio }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public enum SyncInfoStreamType {
        SYNC_INFO_STREAM_TYPE_AUDIO;

        public static SyncInfoStreamType valueOf(String str) {
            return (SyncInfoStreamType) C08FF.LIZ(SyncInfoStreamType.class, str);
        }
    }

    public StreamSycnInfoConfig(StreamIndex streamIndex, int i, SyncInfoStreamType syncInfoStreamType) {
        this.streamIndex = streamIndex;
        this.repeatCount = i;
        this.streamType = syncInfoStreamType;
    }
}
