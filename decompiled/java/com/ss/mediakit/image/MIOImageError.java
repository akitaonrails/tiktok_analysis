package com.ss.mediakit.image;

import X.C386801es;

/* JADX INFO: loaded from: classes35.dex */
public class MIOImageError {
    public final int code;
    public final String desc;
    public static MIOImageError MIO_NOT_RUNNING = new MIOImageError(-6000, "mio not running");
    public static MIOImageError TASK_ALREADY_EXIST = new MIOImageError(-1003, "task already exist");
    public static MIOImageError INVALID_REQUEST_INFO = new MIOImageError(-4000, "invalid request info");
    public static MIOImageError INVALID_RESPONSE_INFO = new MIOImageError(-4001, "invalid response info");
    public static MIOImageError ADD_TASK_FAILED = new MIOImageError(C386801es.DEFAULT, "add task failed");
    public static MIOImageError INVALID_RESPONSE_DATA = new MIOImageError(-4002, "invalid response data");
    public static MIOImageError TASK_CANCELED = new MIOImageError(-1004, "task canceled");

    public static class Builder {
        public int code;
        public String desc;

        public MIOImageError build() {
            return new MIOImageError(this.code, this.desc);
        }

        public Builder setCode(int i) {
            this.code = i;
            return this;
        }

        public Builder setDesc(String str) {
            this.desc = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public int code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

    public MIOImageError(int i) {
        this(i, null);
    }

    public MIOImageError(int i, String str) {
        this.code = i;
        this.desc = str;
    }
}
