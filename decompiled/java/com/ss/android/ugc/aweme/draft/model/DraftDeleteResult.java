package com.ss.android.ugc.aweme.draft.model;

import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftDeleteResult {
    public final AILivePhotoModel aiLivePhotoModel;
    public final Throwable codeException;
    public final String creationId;
    public final DraftDBDeleteResult deleteDBResult;
    public final long deleteDuration;
    public final DraftFileDeleteResult deleteFileResult;
    public final String deleteScene;
    public final int draftAwemeType;
    public final int draftType;
    public final int isEntryFromEditorTab;
    public final int isEntryFromProfile;
    public final long saveDraftAppVersion;
    public final String saveDraftTime;

    public final DraftDeleteResult copy(String str, int i, String str2, long j, long j2, String str3, DraftFileDeleteResult draftFileDeleteResult, DraftDBDeleteResult draftDBDeleteResult, Throwable th, int i2, int i3, int i4, AILivePhotoModel aILivePhotoModel) {
        return new DraftDeleteResult(str, i, str2, j, j2, str3, draftFileDeleteResult, draftDBDeleteResult, th, i2, i3, i4, aILivePhotoModel);
    }

    public final int getErrorCode() {
        if (this.deleteFileResult.isSuc() && this.deleteDBResult.isSuc() && this.codeException == null) {
            return 0;
        }
        return !this.deleteFileResult.isSuc() ? this.deleteFileResult.deleteException.errorCode : !this.deleteDBResult.isSuc() ? this.deleteDBResult.deleteException.errorCode : this.codeException != null ? -6000 : -1;
    }

    public final boolean isSuc() {
        return getErrorCode() == 0;
    }

    public final int isEntryFromEditorTab() {
        return this.isEntryFromEditorTab;
    }

    public final int isEntryFromProfile() {
        return this.isEntryFromProfile;
    }

    public DraftDeleteResult(String str, int i, String str2, long j, long j2, String str3, DraftFileDeleteResult draftFileDeleteResult, DraftDBDeleteResult draftDBDeleteResult, Throwable th, int i2, int i3, int i4, AILivePhotoModel aILivePhotoModel) {
        this.creationId = str;
        this.draftType = i;
        this.saveDraftTime = str2;
        this.saveDraftAppVersion = j;
        this.deleteDuration = j2;
        this.deleteScene = str3;
        this.deleteFileResult = draftFileDeleteResult;
        this.deleteDBResult = draftDBDeleteResult;
        this.codeException = th;
        this.draftAwemeType = i2;
        this.isEntryFromProfile = i3;
        this.isEntryFromEditorTab = i4;
        this.aiLivePhotoModel = aILivePhotoModel;
    }
}
