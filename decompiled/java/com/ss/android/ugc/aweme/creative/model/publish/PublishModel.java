package com.ss.android.ugc.aweme.creative.model.publish;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishModel implements Parcelable {
    public static final Parcelable.Creator<PublishModel> CREATOR = new Parcelable.Creator<PublishModel>() { // from class: X.0mfx
        @Override // android.os.Parcelable.Creator
        public final PublishModel createFromParcel(Parcel parcel) {
            CompileProbeResult compileProbeResultCreateFromParcel;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            String string = parcel.readString();
            int i6 = parcel.readInt();
            String string2 = parcel.readString();
            UploadSpeedInfo uploadSpeedInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                compileProbeResultCreateFromParcel = null;
            } else {
                compileProbeResultCreateFromParcel = CompileProbeResult.CREATOR.createFromParcel(parcel);
            }
            CompileProbeResult compileProbeResult = compileProbeResultCreateFromParcel;
            AVUploadSaveModel aVUploadSaveModel = (AVUploadSaveModel) parcel.readParcelable(PublishModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                uploadSpeedInfoCreateFromParcel = UploadSpeedInfo.CREATOR.createFromParcel(parcel);
            }
            return new PublishModel(i, i2, i3, i4, i5, string, i6, string2, compileProbeResult, aVUploadSaveModel, uploadSpeedInfoCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PublishModel[] newArray(int i) {
            return new PublishModel[i];
        }
    };

    @C040H
    public boolean allowSameAssetSlot;

    @C040H
    public boolean bindFreezeFrameSlot;

    @C040H
    public CompileProbeResult compileProbeResult;
    public transient boolean cropVideo;

    @C09CT("edit_mix_audio_file_path")
    @C0MY0
    public String editMixAudioFilePath;

    @C040H
    public boolean isBackgroundPublish;

    @C040H
    public boolean isCompileFinished;

    @C040H
    public boolean isOpenForegroundPublish;
    public transient boolean isSyntheticHardEncode;

    @C040H
    public int outVideoHeight;

    @C040H
    public int outVideoWidth;

    @C040H
    public String outputFile;

    @C040H
    public String parallelUploadOutputFile;

    @C040H
    public int publishStage;

    @C040H
    public AVUploadSaveModel saveModel;

    @C040H
    public int screenBrightness;

    @C040H
    public String synthesisFileHash;

    @C040H
    public UploadSpeedInfo uploadSpeedInfo;

    @C040H
    public int videoCanvasHeight;

    @C040H
    public int videoCanvasWidth;

    public PublishModel() {
        this(0, 0, 0, 0, 0, null, 0, null, null, null, new UploadSpeedInfo(-6L, "", -6L, -6L, -1), null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.outVideoWidth);
        parcel.writeInt(this.outVideoHeight);
        parcel.writeInt(this.videoCanvasWidth);
        parcel.writeInt(this.videoCanvasHeight);
        parcel.writeInt(this.publishStage);
        parcel.writeString(this.parallelUploadOutputFile);
        parcel.writeInt(this.screenBrightness);
        parcel.writeString(this.outputFile);
        CompileProbeResult compileProbeResult = this.compileProbeResult;
        if (compileProbeResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            compileProbeResult.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.saveModel, i);
        UploadSpeedInfo uploadSpeedInfo = this.uploadSpeedInfo;
        if (uploadSpeedInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uploadSpeedInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.editMixAudioFilePath);
    }

    public PublishModel(int i, int i2, int i3, int i4, int i5, String str, int i6, String str2, CompileProbeResult compileProbeResult, AVUploadSaveModel aVUploadSaveModel, UploadSpeedInfo uploadSpeedInfo, String str3) {
        this.outVideoWidth = i;
        this.outVideoHeight = i2;
        this.videoCanvasWidth = i3;
        this.videoCanvasHeight = i4;
        this.publishStage = i5;
        this.parallelUploadOutputFile = str;
        this.screenBrightness = i6;
        this.outputFile = str2;
        this.compileProbeResult = compileProbeResult;
        this.saveModel = aVUploadSaveModel;
        this.uploadSpeedInfo = uploadSpeedInfo;
        this.editMixAudioFilePath = str3;
        this.synthesisFileHash = "";
        this.allowSameAssetSlot = true;
        this.bindFreezeFrameSlot = true;
    }
}
