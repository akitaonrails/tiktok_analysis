package com.ss.android.ugc.aweme.creative.model.publish;

import X.C040H;
import X.C1436130nTX;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;
import com.ss.android.ugc.aweme.creative.model.publish.DirectUploadParams;
import com.ss.android.ugc.aweme.creative.model.publish.PrePublishStatusModel;
import com.ss.android.ugc.aweme.creative.model.publish.TrackParams;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;

/* JADX INFO: loaded from: classes23.dex */
public final class PrePublishStatusModel implements Parcelable {

    @C040H
    public CompileLevel compileLevel;

    @C040H
    public boolean hasPreCompileSuccess;

    @C040H
    public int musicStatusWhenStart;

    @C040H
    public StickerNewEngineModel originalStickerData;

    @C040H
    public String postPagePrePublishId;

    @C040H
    public String publishId;

    @C040H
    public DirectUploadParams replaceDirectUploadParams;

    @C040H
    public final TrackParams trackParams;
    public static final C1436130nTX Companion = new Object() { // from class: X.0nTX
    };
    public static final Parcelable.Creator<PrePublishStatusModel> CREATOR = new Parcelable.Creator<PrePublishStatusModel>() { // from class: X.0nTV
        @Override // android.os.Parcelable.Creator
        public final PrePublishStatusModel createFromParcel(Parcel parcel) {
            boolean z;
            StickerNewEngineModel stickerNewEngineModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            DirectUploadParams directUploadParamsCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                stickerNewEngineModelCreateFromParcel = null;
            } else {
                stickerNewEngineModelCreateFromParcel = StickerNewEngineModel.CREATOR.createFromParcel(parcel);
            }
            StickerNewEngineModel stickerNewEngineModel = stickerNewEngineModelCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            CompileLevel compileLevelCreateFromParcel = CompileLevel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                directUploadParamsCreateFromParcel = DirectUploadParams.CREATOR.createFromParcel(parcel);
            }
            return new PrePublishStatusModel(z, stickerNewEngineModel, string, string2, i, compileLevelCreateFromParcel, directUploadParamsCreateFromParcel, TrackParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PrePublishStatusModel[] newArray(int i) {
            return new PrePublishStatusModel[i];
        }
    };

    public PrePublishStatusModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasPreCompileSuccess ? 1 : 0);
        StickerNewEngineModel stickerNewEngineModel = this.originalStickerData;
        if (stickerNewEngineModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickerNewEngineModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.publishId);
        parcel.writeString(this.postPagePrePublishId);
        parcel.writeInt(this.musicStatusWhenStart);
        this.compileLevel.writeToParcel(parcel, i);
        DirectUploadParams directUploadParams = this.replaceDirectUploadParams;
        if (directUploadParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            directUploadParams.writeToParcel(parcel, i);
        }
        this.trackParams.writeToParcel(parcel, i);
    }

    public /* synthetic */ PrePublishStatusModel(int i) {
        this(true, null, null, null, -1, CompileLevel.UNKNOWN, null, new TrackParams(0));
    }

    public PrePublishStatusModel(boolean z, StickerNewEngineModel stickerNewEngineModel, String str, String str2, int i, CompileLevel compileLevel, DirectUploadParams directUploadParams, TrackParams trackParams) {
        this.hasPreCompileSuccess = z;
        this.originalStickerData = stickerNewEngineModel;
        this.publishId = str;
        this.postPagePrePublishId = str2;
        this.musicStatusWhenStart = i;
        this.compileLevel = compileLevel;
        this.replaceDirectUploadParams = directUploadParams;
        this.trackParams = trackParams;
    }
}
