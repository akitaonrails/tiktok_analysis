package com.ss.mediakit.medialoader;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLCopyResult {
    public final int code;
    public final String desc;
    public static final AVMDLCopyResult CR_SUCCESS = new AVMDLCopyResult(0, "copy success");
    public static final AVMDLCopyResult CR_INVALID_PARAM = new AVMDLCopyResult(-1, "invalid parameter");
    public static final AVMDLCopyResult CR_FILE_HAVE_HOLE = new AVMDLCopyResult(-5, "cache file read writer failed");
    public static final AVMDLCopyResult CR_FILE_NOT_CACHED = new AVMDLCopyResult(-3, "file not cached");
    public static final AVMDLCopyResult CR_DEMUXER_FAILED = new AVMDLCopyResult(-6, "demuxer failed");
    public static final AVMDLCopyResult CR_FILE_NOT_CACHING = new AVMDLCopyResult(-4, "file key not playing");
    public static final AVMDLCopyResult CR_MDL_NOT_RUNNING = new AVMDLCopyResult(-2, "medialoader not running");
    public static final AVMDLCopyResult CR_INSUFFICIENT_CACHE = new AVMDLCopyResult(-7, "insufficient cache");
    public static final AVMDLCopyResult CR_NO_RUNNING_TASK = new AVMDLCopyResult(-8, "no running task");
    public static final AVMDLCopyResult CR_FAILED = new AVMDLCopyResult(-99, "copy failed");

    public final boolean isSuccess() {
        return this.code == 0;
    }

    public static AVMDLCopyResult getCustomError(String str) {
        return new AVMDLCopyResult(-99, str);
    }

    public AVMDLCopyResult(int i, String str) {
        this.code = i;
        this.desc = str;
    }
}
