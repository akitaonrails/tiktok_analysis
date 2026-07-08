package com.ss.android.ugc.aweme.draft.model;

import X.C0C64;
import X.C625790Ogb;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftSaveResult {
    public final AILivePhotoModel aiLivePhotoModel;
    public final DraftCheckResult checkResult;
    public final Throwable codeException;
    public ArrayList<Long> contentFileSizeList;
    public String contentSource;
    public String contentType;
    public final String creationId;
    public final CreativeModel creativeModel;
    public final int draftAwemeType;
    public final int draftFrom;
    public final String draftScene;
    public final int draftType;
    public final int draftVersion;
    public final String fileTreeInfo;
    public Integer isLiveVideo;
    public final boolean isPublishedDraft;
    public String liveMode;
    public Integer livePhotoCount;
    public String notStandardsPath;
    public Integer picCount;
    public final DraftSavePreProcessResults preProcessResults;
    public final DraftDBSaveResult saveDBResult;
    public final long saveDraftAppVersion;
    public final String saveDraftTime;
    public final DraftFileSaveResults saveFileResults;
    public String uploadTabName;
    public final int useCreativeFileStandard;
    public Integer videoCount;

    public final DraftSaveResult copy(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, String str5, AILivePhotoModel aILivePhotoModel, String str6, String str7, Integer num, Integer num2, Integer num3, Integer num4, String str8, String str9, CreativeModel creativeModel) {
        return new DraftSaveResult(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, arrayList, str5, aILivePhotoModel, str6, str7, num, num2, num3, num4, str8, str9, creativeModel);
    }

    public final long getDuration() {
        return this.preProcessResults.preProcessDuration + this.checkResult.checkDuration + this.saveFileResults.fileSaveDuration + this.saveDBResult.dbSaveDuration;
    }

    public final int getErrorCode() {
        if (this.preProcessResults.isSuc() && this.checkResult.isSuc() && this.saveFileResults.isSuc() && this.saveDBResult.isSuc() && this.codeException == null) {
            return 0;
        }
        return !this.preProcessResults.isSuc() ? this.preProcessResults.getErrorCode() : !this.checkResult.isSuc() ? this.checkResult.getErrorCode() : !this.saveFileResults.isSuc() ? this.saveFileResults.getErrorCode() : !this.saveDBResult.isSuc() ? this.saveDBResult.saveException.errorCode : this.codeException != null ? -2000 : -1;
    }

    public final boolean isSuc() {
        return !(C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_fake_draft_operation_response", true) == 1 && C625790Ogb.LIZ()) && getErrorCode() == 0;
    }

    public final Integer isLiveVideo() {
        return this.isLiveVideo;
    }

    public final boolean isPublishedDraft() {
        return this.isPublishedDraft;
    }

    public final void setContentFileSizeList(ArrayList<Long> arrayList) {
        this.contentFileSizeList = arrayList;
    }

    public final void setContentSource(String str) {
        this.contentSource = str;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setLiveMode(String str) {
        this.liveMode = str;
    }

    public final void setLivePhotoCount(Integer num) {
        this.livePhotoCount = num;
    }

    public final void setLiveVideo(Integer num) {
        this.isLiveVideo = num;
    }

    public final void setNotStandardsPath(String str) {
        this.notStandardsPath = str;
    }

    public final void setPicCount(Integer num) {
        this.picCount = num;
    }

    public final void setUploadTabName(String str) {
        this.uploadTabName = str;
    }

    public final void setVideoCount(Integer num) {
        this.videoCount = num;
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, boolean z, String str3, int i3, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, 0, "", new DraftSavePreProcessResults(0L, null, null, 7, null), new DraftCheckResult(0L, new DraftFileCheckResults(null, null, 3, null), null, 0), new DraftFileSaveResults(0L, null, null, 7, null), new DraftDBSaveResult(0L, new DraftDBSaveException(0, null)), z, null, str3, i3, -1, new ArrayList(), "", aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, boolean z, String str3, int i4, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, "", new DraftSavePreProcessResults(0L, null, null, 7, null), new DraftCheckResult(0L, new DraftFileCheckResults(null, null, 3, null), null, 0), new DraftFileSaveResults(0L, null, null, 7, null), new DraftDBSaveResult(0L, new DraftDBSaveException(0, null)), z, null, str3, i4, -1, new ArrayList(), "", aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, boolean z, String str4, int i4, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, new DraftSavePreProcessResults(0L, null, null, 7, null), new DraftCheckResult(0L, new DraftFileCheckResults(null, null, 3, null), null, 0), new DraftFileSaveResults(0L, null, null, 7, null), new DraftDBSaveResult(0L, new DraftDBSaveException(0, null)), z, null, str4, i4, -1, new ArrayList(), "", aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, boolean z, String str4, int i4, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, new DraftCheckResult(0L, new DraftFileCheckResults(null, null, 3, null), null, 0), new DraftFileSaveResults(0L, null, null, 7, null), new DraftDBSaveResult(0L, new DraftDBSaveException(0, null)), z, null, str4, i4, -1, new ArrayList(), "", aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, boolean z, String str4, int i4, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, new DraftFileSaveResults(0L, null, null, 7, null), new DraftDBSaveResult(0L, new DraftDBSaveException(0, null)), z, null, str4, i4, -1, new ArrayList(), "", aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, boolean z, String str4, int i4, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, new DraftDBSaveResult(0L, new DraftDBSaveException(0, null)), z, null, str4, i4, -1, new ArrayList(), "", aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, String str4, int i4, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, null, str4, i4, -1, new ArrayList(), "", aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, -1, new ArrayList(), "", aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, new ArrayList(), "", aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, arrayList, "", aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, String str5, AILivePhotoModel aILivePhotoModel, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, arrayList, str5, aILivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, String str5, AILivePhotoModel aILivePhotoModel, String str6, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, arrayList, str5, aILivePhotoModel, str6, "", null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, String str5, AILivePhotoModel aILivePhotoModel, String str6, String str7, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, arrayList, str5, aILivePhotoModel, str6, str7, null, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, String str5, AILivePhotoModel aILivePhotoModel, String str6, String str7, Integer num, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, arrayList, str5, aILivePhotoModel, str6, str7, num, null, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, String str5, AILivePhotoModel aILivePhotoModel, String str6, String str7, Integer num, Integer num2, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, arrayList, str5, aILivePhotoModel, str6, str7, num, num2, null, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, String str5, AILivePhotoModel aILivePhotoModel, String str6, String str7, Integer num, Integer num2, Integer num3, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, arrayList, str5, aILivePhotoModel, str6, str7, num, num2, num3, null, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, String str5, AILivePhotoModel aILivePhotoModel, String str6, String str7, Integer num, Integer num2, Integer num3, Integer num4, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, arrayList, str5, aILivePhotoModel, str6, str7, num, num2, num3, num4, null, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, String str5, AILivePhotoModel aILivePhotoModel, String str6, String str7, Integer num, Integer num2, Integer num3, Integer num4, String str8, CreativeModel creativeModel) {
        this(str, i, i2, str2, j, i3, str3, draftSavePreProcessResults, draftCheckResult, draftFileSaveResults, draftDBSaveResult, z, th, str4, i4, i5, arrayList, str5, aILivePhotoModel, str6, str7, num, num2, num3, num4, str8, null, creativeModel);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, ArrayList<Long> arrayList, String str5, AILivePhotoModel aILivePhotoModel, String str6, String str7, Integer num, Integer num2, Integer num3, Integer num4, String str8, String str9, CreativeModel creativeModel) {
        this.creationId = str;
        this.draftType = i;
        this.draftFrom = i2;
        this.saveDraftTime = str2;
        this.saveDraftAppVersion = j;
        this.useCreativeFileStandard = i3;
        this.fileTreeInfo = str3;
        this.preProcessResults = draftSavePreProcessResults;
        this.checkResult = draftCheckResult;
        this.saveFileResults = draftFileSaveResults;
        this.saveDBResult = draftDBSaveResult;
        this.isPublishedDraft = z;
        this.codeException = th;
        this.draftScene = str4;
        this.draftAwemeType = i4;
        this.draftVersion = i5;
        this.contentFileSizeList = arrayList;
        this.notStandardsPath = str5;
        this.aiLivePhotoModel = aILivePhotoModel;
        this.contentSource = str6;
        this.contentType = str7;
        this.videoCount = num;
        this.picCount = num2;
        this.livePhotoCount = num3;
        this.isLiveVideo = num4;
        this.liveMode = str8;
        this.uploadTabName = str9;
        this.creativeModel = creativeModel;
    }
}
