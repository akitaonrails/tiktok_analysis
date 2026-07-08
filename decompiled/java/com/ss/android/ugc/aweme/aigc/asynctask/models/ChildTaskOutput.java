package com.ss.android.ugc.aweme.aigc.asynctask.models;

import X.C09CT;
import X.C0LQD;
import X.C1974507oN;
import com.ss.android.ugc.aweme.aigc.aicreation.models.ImagePreprocessTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadListTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.DraftQueryTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VPostProcessingTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.NleRestoreTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.SendDMMessageTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.SummaryCompositionTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.VideoUploadTosTaskOutput;

/* JADX INFO: loaded from: classes9.dex */
public final class ChildTaskOutput {

    @C09CT("AutoCutServerTaskOutput")
    public AutoCutServerTaskOutput autoCutServerTaskOutput;

    @C09CT("checkCameoPermissionTaskOutput")
    public C1974507oN checkCameoPermissionTaskOutput;

    @C09CT("aigcQuotaOutput")
    public C0LQD commonAigcQuotaOutput;

    @C09CT("compositionTaskOutput")
    public SummaryCompositionTaskOutput compositionTaskOutput;

    @C09CT("creationDownloadListTaskOutput")
    public CreationDownloadListTaskOutput creationDownloadListTaskOutput;

    @C09CT("creationDownloadTaskOutput")
    public CreationDownloadTaskOutput creationDownloadTaskOutput;

    @C09CT("DraftQueryTaskOutput")
    public DraftQueryTaskOutput draftQueryTaskOutput;

    @C09CT("faceDetectTaskOutput")
    public FaceDetectTaskOutput faceDetectTaskOutput;

    @C09CT("FrameUploadTaskOutput")
    public FrameUploadTaskOutput frameUploadTaskOutput;

    @C09CT("i2vPostProcessingTaskOutput")
    public GeneralI2VPostProcessingTaskOutput generalI2VPostProcessingTaskOutput;

    @C09CT("i2VServerTaskOutput")
    public I2VServerTaskOutput i2VServerTaskOutput;

    @C09CT("imagePreprocessTaskOutput")
    public ImagePreprocessTaskOutput imagePreprocessTaskOutput;

    @C09CT("imageUploadTaskOutput")
    public ImageUploadTaskOutput imageUploadTaskOutput;

    @C09CT("NleRestoreTaskOutput")
    public NleRestoreTaskOutput nleRestoreTaskOutput;

    @C09CT("sendDMMessageOutput")
    public SendDMMessageTaskOutput sendDMMessageOutput;

    @C09CT("videoUploadTaskOutput")
    public VideoUploadTosTaskOutput videoUploadTaskOutput;

    public ChildTaskOutput() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final String toString() {
        return "ChildTaskOutput(imageUploadTaskOutput=" + this.imageUploadTaskOutput + ", compositionTaskOutput=" + this.compositionTaskOutput + ", videoUploadTaskOutput=" + this.videoUploadTaskOutput + ", i2VServerTaskOutput=" + this.i2VServerTaskOutput + ", creationDownloadTaskOutput=" + this.creationDownloadTaskOutput + ", creationDownloadListTaskOutput=" + this.creationDownloadListTaskOutput + ", checkCameoPermissionTaskOutput=" + this.checkCameoPermissionTaskOutput + ", commonAigcQuotaOutput=" + this.commonAigcQuotaOutput + ", generalI2VPostProcessingTaskOutput=" + this.generalI2VPostProcessingTaskOutput + ", faceDetectTaskOutput=" + this.faceDetectTaskOutput + ", sendDMMessageOutput=" + this.sendDMMessageOutput + ", autoCutServerTaskOutput=" + this.autoCutServerTaskOutput + ", nleRestoreTaskOutput=" + this.nleRestoreTaskOutput + ", frameUploadTaskOutput=" + this.frameUploadTaskOutput + ", draftQueryTaskOutput=" + this.draftQueryTaskOutput + ", imagePreprocessTaskOutput=" + this.imagePreprocessTaskOutput + ')';
    }

    public ChildTaskOutput(ImageUploadTaskOutput imageUploadTaskOutput, SummaryCompositionTaskOutput summaryCompositionTaskOutput, VideoUploadTosTaskOutput videoUploadTosTaskOutput, I2VServerTaskOutput i2VServerTaskOutput, CreationDownloadTaskOutput creationDownloadTaskOutput, CreationDownloadListTaskOutput creationDownloadListTaskOutput, C1974507oN c1974507oN, C0LQD c0lqd, GeneralI2VPostProcessingTaskOutput generalI2VPostProcessingTaskOutput, FaceDetectTaskOutput faceDetectTaskOutput, SendDMMessageTaskOutput sendDMMessageTaskOutput, AutoCutServerTaskOutput autoCutServerTaskOutput, NleRestoreTaskOutput nleRestoreTaskOutput, FrameUploadTaskOutput frameUploadTaskOutput, DraftQueryTaskOutput draftQueryTaskOutput, ImagePreprocessTaskOutput imagePreprocessTaskOutput) {
        this.imageUploadTaskOutput = imageUploadTaskOutput;
        this.compositionTaskOutput = summaryCompositionTaskOutput;
        this.videoUploadTaskOutput = videoUploadTosTaskOutput;
        this.i2VServerTaskOutput = i2VServerTaskOutput;
        this.creationDownloadTaskOutput = creationDownloadTaskOutput;
        this.creationDownloadListTaskOutput = creationDownloadListTaskOutput;
        this.checkCameoPermissionTaskOutput = c1974507oN;
        this.commonAigcQuotaOutput = c0lqd;
        this.generalI2VPostProcessingTaskOutput = generalI2VPostProcessingTaskOutput;
        this.faceDetectTaskOutput = faceDetectTaskOutput;
        this.sendDMMessageOutput = sendDMMessageTaskOutput;
        this.autoCutServerTaskOutput = autoCutServerTaskOutput;
        this.nleRestoreTaskOutput = nleRestoreTaskOutput;
        this.frameUploadTaskOutput = frameUploadTaskOutput;
        this.draftQueryTaskOutput = draftQueryTaskOutput;
        this.imagePreprocessTaskOutput = imagePreprocessTaskOutput;
    }
}
