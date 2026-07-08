package com.ss.mediakit.medialoader;

import java.util.HashMap;

/* JADX INFO: loaded from: classes24.dex */
public class LoaderEventInfo {
    public String fileHash;
    public int what = -1;
    public HashMap<String, String> mHeaders = new HashMap<>();
    public int taskType = -1;
    public int dataType = -1;
    public long bytesLoaded = -1;
    public long bitrate = -1;
    public long elapsedRealtimeMs = -1;
    public long loadDurationMs = -1;
    public long off = -1;
    public long endOff = -1;
}
