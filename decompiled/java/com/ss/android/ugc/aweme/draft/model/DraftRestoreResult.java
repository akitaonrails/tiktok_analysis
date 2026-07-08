package com.ss.android.ugc.aweme.draft.model;

import X.C0LQ1;
import X.C0M49;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftRestoreResult {
    public final DraftCheckResult checkResult;
    public final Throwable codeException;
    public final String creationId;
    public final CreativeModel creativeModel;
    public final int draftAwemeType;
    public final int draftType;
    public final int draftVersion;
    public final String fileTreeInfo;
    public boolean isDraftDeleted;
    public final boolean isPublishedDraft;
    public final long lastEditTime;
    public final DraftFileRestoreResults restoreFileResults;
    public String restoreScene;
    public final long saveDraftAppVersion;
    public final String saveDraftTime;
    public final int useCreativeFileStandard;

    public static /* synthetic */ DraftRestoreResult copy$default(DraftRestoreResult draftRestoreResult, String str, int i, String str2, long j, int i2, String str3, DraftCheckResult draftCheckResult, DraftFileRestoreResults draftFileRestoreResults, boolean z, Throwable th, int i3, int i4, long j2, String str4, boolean z2, CreativeModel creativeModel, int i5, Object obj) {
        long j3 = j;
        String str5 = str2;
        int i6 = i;
        String str6 = str;
        boolean z3 = z;
        DraftFileRestoreResults draftFileRestoreResults2 = draftFileRestoreResults;
        DraftCheckResult draftCheckResult2 = draftCheckResult;
        String str7 = str3;
        int i7 = i2;
        long j4 = j2;
        int i8 = i4;
        int i9 = i3;
        Throwable th2 = th;
        CreativeModel creativeModel2 = creativeModel;
        boolean z4 = z2;
        String str8 = str4;
        if ((i5 & 1) != 0) {
            str6 = draftRestoreResult.creationId;
        }
        if ((i5 & 2) != 0) {
            i6 = draftRestoreResult.draftType;
        }
        if ((i5 & 4) != 0) {
            str5 = draftRestoreResult.saveDraftTime;
        }
        if ((i5 & 8) != 0) {
            j3 = draftRestoreResult.saveDraftAppVersion;
        }
        if ((i5 & 16) != 0) {
            i7 = draftRestoreResult.useCreativeFileStandard;
        }
        if ((i5 & 32) != 0) {
            str7 = draftRestoreResult.fileTreeInfo;
        }
        if ((i5 & 64) != 0) {
            draftCheckResult2 = draftRestoreResult.checkResult;
        }
        if ((i5 & 128) != 0) {
            draftFileRestoreResults2 = draftRestoreResult.restoreFileResults;
        }
        if ((i5 & 256) != 0) {
            z3 = draftRestoreResult.isPublishedDraft;
        }
        if ((i5 & 512) != 0) {
            th2 = draftRestoreResult.codeException;
        }
        if ((i5 & 1024) != 0) {
            i9 = draftRestoreResult.draftAwemeType;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i8 = draftRestoreResult.draftVersion;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            j4 = draftRestoreResult.lastEditTime;
        }
        if ((i5 & 8192) != 0) {
            str8 = draftRestoreResult.restoreScene;
        }
        if ((i5 & 16384) != 0) {
            z4 = draftRestoreResult.isDraftDeleted;
        }
        if ((i5 & 32768) != 0) {
            creativeModel2 = draftRestoreResult.creativeModel;
        }
        int i10 = i7;
        String str9 = str7;
        return draftRestoreResult.copy(str6, i6, str5, j3, i10, str9, draftCheckResult2, draftFileRestoreResults2, z3, th2, i9, i8, j4, str8, z4, creativeModel2);
    }

    public final DraftRestoreResult copy(String str, int i, String str2, long j, int i2, String str3, DraftCheckResult draftCheckResult, DraftFileRestoreResults draftFileRestoreResults, boolean z, Throwable th, int i3, int i4, long j2, String str4, boolean z2, CreativeModel creativeModel) {
        return new DraftRestoreResult(str, i, str2, j, i2, str3, draftCheckResult, draftFileRestoreResults, z, th, i3, i4, j2, str4, z2, creativeModel);
    }

    public final long getDuration() {
        return this.checkResult.checkDuration + this.restoreFileResults.fileRestoreDuration;
    }

    public final int getErrorCode() {
        if (this.checkResult.isSuc() && this.restoreFileResults.isSuc() && this.codeException == null) {
            return 0;
        }
        if (!this.checkResult.isSuc()) {
            return this.checkResult.getErrorCode();
        }
        if (!this.restoreFileResults.isSuc()) {
            return this.restoreFileResults.getErrorCode();
        }
        Throwable th = this.codeException;
        if (th instanceof C0LQ1) {
            return -3005;
        }
        return th != null ? -4000 : -1;
    }

    public final boolean isSuc() {
        return !C0M49.LIZ() && getErrorCode() == 0;
    }

    public final boolean isDraftDeleted() {
        return this.isDraftDeleted;
    }

    public final boolean isPublishedDraft() {
        return this.isPublishedDraft;
    }

    public final void setDraftDeleted(boolean z) {
        this.isDraftDeleted = z;
    }

    public final void setRestoreScene(String str) {
        this.restoreScene = str;
    }

    public DraftRestoreResult(String str, int i, String str2, long j, int i2, String str3, DraftCheckResult draftCheckResult, DraftFileRestoreResults draftFileRestoreResults, boolean z, Throwable th, int i3, int i4, long j2, String str4, boolean z2, CreativeModel creativeModel) {
        this.creationId = str;
        this.draftType = i;
        this.saveDraftTime = str2;
        this.saveDraftAppVersion = j;
        this.useCreativeFileStandard = i2;
        this.fileTreeInfo = str3;
        this.checkResult = draftCheckResult;
        this.restoreFileResults = draftFileRestoreResults;
        this.isPublishedDraft = z;
        this.codeException = th;
        this.draftAwemeType = i3;
        this.draftVersion = i4;
        this.lastEditTime = j2;
        this.restoreScene = str4;
        this.isDraftDeleted = z2;
        this.creativeModel = creativeModel;
    }
}
