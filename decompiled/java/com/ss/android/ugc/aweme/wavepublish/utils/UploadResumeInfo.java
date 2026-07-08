package com.ss.android.ugc.aweme.wavepublish.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class UploadResumeInfo {
    public static final int $stable = 0;

    @C09CT("is_compile_finished")
    public final boolean isCompileFinished;

    @C09CT("output_file_path")
    public final String outputFilePath;

    @C09CT("skip_ve_write_file")
    public final boolean skipVEWriteFile;

    @C09CT("synthesis_file_hash")
    public final String synthesisFileHash;

    @C09CT("synthesis_file_path")
    public final String synthesisFilePath;

    public final String getRealSynthesisFilePath() {
        return this.skipVEWriteFile ? this.outputFilePath : this.synthesisFilePath;
    }

    public final boolean isCompileFinished() {
        return this.isCompileFinished;
    }

    public UploadResumeInfo(boolean z, String str, String str2, String str3, boolean z2) {
        this.isCompileFinished = z;
        this.outputFilePath = str;
        this.synthesisFilePath = str2;
        this.synthesisFileHash = str3;
        this.skipVEWriteFile = z2;
    }
}
