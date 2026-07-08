package com.ss.android.ugc.aweme.comment.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class CommentImagePublishOptExp {
    public static final CommentImagePublishOptConfig LIZ = new CommentImagePublishOptConfig(-1, -1, -1, -1, -1, -1, new UploadSdkConfig(-1, -1, -1));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(41));

    public static final class CommentImagePublishOptConfig {

        @C09CT("auth_clock_drift_tolerance_minutes")
        public final int authClockDriftToleranceMinutes;

        @C09CT("enable_bitmap_recycle_opt")
        public final int enableBitmapRecycleOpt;

        @C09CT("enable_bugfix")
        public final int enableBugfix;

        @C09CT("enable_compress_validation")
        public final int enableCompressValidation;

        @C09CT("enable_thread_opt")
        public final int enableThreadOpt;

        @C09CT("enable_upload_instance_reuse")
        public final int enableUploadInstanceReuse;

        @C09CT("upload_sdk_config")
        public final UploadSdkConfig uploadSdkConfig;

        public CommentImagePublishOptConfig() {
            this(-1, -1, -1, -1, -1, -1, new UploadSdkConfig(-1, -1, -1));
        }

        public CommentImagePublishOptConfig(int i, int i2, int i3, int i4, int i5, int i6, UploadSdkConfig uploadSdkConfig) {
            this.enableBugfix = i;
            this.enableBitmapRecycleOpt = i2;
            this.enableThreadOpt = i3;
            this.enableUploadInstanceReuse = i4;
            this.enableCompressValidation = i5;
            this.authClockDriftToleranceMinutes = i6;
            this.uploadSdkConfig = uploadSdkConfig;
        }
    }

    public static CommentImagePublishOptConfig LIZLLL() {
        return (CommentImagePublishOptConfig) LIZIZ.getValue();
    }

    public static final boolean LIZ() {
        CommentImagePublishOptConfig commentImagePublishOptConfigLIZLLL = LIZLLL();
        return commentImagePublishOptConfigLIZLLL != null && commentImagePublishOptConfigLIZLLL.enableBugfix > 0;
    }

    public static final boolean LIZIZ() {
        CommentImagePublishOptConfig commentImagePublishOptConfigLIZLLL = LIZLLL();
        return commentImagePublishOptConfigLIZLLL != null && commentImagePublishOptConfigLIZLLL.enableCompressValidation > 0;
    }

    public static final boolean LIZJ() {
        CommentImagePublishOptConfig commentImagePublishOptConfigLIZLLL = LIZLLL();
        return commentImagePublishOptConfigLIZLLL != null && commentImagePublishOptConfigLIZLLL.enableThreadOpt > 0;
    }

    public static final class UploadSdkConfig {

        @C09CT("file_retry_count")
        public final int fileRetryCount;

        @C09CT("max_fail_time")
        public final int maxFailTime;

        @C09CT("rw_timeout")
        public final int rwTimeout;

        public UploadSdkConfig() {
            this(-1, -1, -1);
        }

        public UploadSdkConfig(int i, int i2, int i3) {
            this.fileRetryCount = i;
            this.rwTimeout = i2;
            this.maxFailTime = i3;
        }
    }
}
