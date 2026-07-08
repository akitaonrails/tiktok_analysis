package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.CanvasComposer;
import com.ss.ugc.aweme.creation.base.EditConfigModel;
import com.ss.ugc.aweme.creation.base.EditFlowConfigModel;
import com.ss.ugc.aweme.creation.base.EditResourceModel;
import com.ss.ugc.aweme.creation.base.EditUIConfigModel;
import com.ss.ugc.aweme.creation.base.PhotoModeComposer;
import com.ss.ugc.aweme.creation.base.StickerConfigModel;
import com.ss.ugc.aweme.creation.base.VideoGroupComposer;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class EditConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditConfigModel> CREATOR = new Parcelable.Creator<EditConfigModel>() { // from class: X.0MSu
        @Override // android.os.Parcelable.Creator
        public final EditConfigModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z;
            StickerConfigModel stickerConfigModel = (StickerConfigModel) parcel.readParcelable(EditConfigModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            return new EditConfigModel(stickerConfigModel, boolValueOf, (EditUIConfigModel) parcel.readParcelable(EditConfigModel.class.getClassLoader()), (EditFlowConfigModel) parcel.readParcelable(EditConfigModel.class.getClassLoader()), (EditResourceModel) parcel.readParcelable(EditConfigModel.class.getClassLoader()), (PhotoModeComposer) parcel.readParcelable(EditConfigModel.class.getClassLoader()), (CanvasComposer) parcel.readParcelable(EditConfigModel.class.getClassLoader()), (VideoGroupComposer) parcel.readParcelable(EditConfigModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EditConfigModel[] newArray(int i) {
            return new EditConfigModel[i];
        }
    };

    @C09CT("canvas_composer")
    public CanvasComposer canvasComposer;

    @C09CT("edit_resources")
    public EditResourceModel editResources;

    @C09CT("flow_config")
    public EditFlowConfigModel flowConfig;

    @C09CT("hide")
    public Boolean hide;

    @C09CT("photomode_composer")
    public PhotoModeComposer photomodeComposer;

    @C09CT("stickerConfigModel")
    public StickerConfigModel stickerconfigmodel;

    @C09CT("ui_config")
    public EditUIConfigModel uiConfig;

    @C09CT("video_group_composer")
    public VideoGroupComposer videoGroupComposer;

    public EditConfigModel() {
        this(null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeParcelable(this.stickerconfigmodel, i);
        Boolean bool = this.hide;
        if (bool != null) {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        parcel.writeInt(BooleanValue);
        parcel.writeParcelable(this.uiConfig, i);
        parcel.writeParcelable(this.flowConfig, i);
        parcel.writeParcelable(this.editResources, i);
        parcel.writeParcelable(this.photomodeComposer, i);
        parcel.writeParcelable(this.canvasComposer, i);
        parcel.writeParcelable(this.videoGroupComposer, i);
    }

    public final CanvasComposer getCanvasComposer() {
        return this.canvasComposer;
    }

    public final EditResourceModel getEditResources() {
        return this.editResources;
    }

    public final EditFlowConfigModel getFlowConfig() {
        return this.flowConfig;
    }

    public final Boolean getHide() {
        return this.hide;
    }

    public final PhotoModeComposer getPhotomodeComposer() {
        return this.photomodeComposer;
    }

    public final StickerConfigModel getStickerconfigmodel() {
        return this.stickerconfigmodel;
    }

    public final EditUIConfigModel getUiConfig() {
        return this.uiConfig;
    }

    public final VideoGroupComposer getVideoGroupComposer() {
        return this.videoGroupComposer;
    }

    public final void setCanvasComposer(CanvasComposer canvasComposer) {
        this.canvasComposer = canvasComposer;
    }

    public final void setEditResources(EditResourceModel editResourceModel) {
        this.editResources = editResourceModel;
    }

    public final void setFlowConfig(EditFlowConfigModel editFlowConfigModel) {
        this.flowConfig = editFlowConfigModel;
    }

    public final void setHide(Boolean bool) {
        this.hide = bool;
    }

    public final void setPhotomodeComposer(PhotoModeComposer photoModeComposer) {
        this.photomodeComposer = photoModeComposer;
    }

    public final void setStickerconfigmodel(StickerConfigModel stickerConfigModel) {
        this.stickerconfigmodel = stickerConfigModel;
    }

    public final void setUiConfig(EditUIConfigModel editUIConfigModel) {
        this.uiConfig = editUIConfigModel;
    }

    public final void setVideoGroupComposer(VideoGroupComposer videoGroupComposer) {
        this.videoGroupComposer = videoGroupComposer;
    }

    public EditConfigModel(StickerConfigModel stickerConfigModel, Boolean bool, EditUIConfigModel editUIConfigModel, EditFlowConfigModel editFlowConfigModel, EditResourceModel editResourceModel, PhotoModeComposer photoModeComposer, CanvasComposer canvasComposer, VideoGroupComposer videoGroupComposer) {
        this.stickerconfigmodel = stickerConfigModel;
        this.hide = bool;
        this.uiConfig = editUIConfigModel;
        this.flowConfig = editFlowConfigModel;
        this.editResources = editResourceModel;
        this.photomodeComposer = photoModeComposer;
        this.canvasComposer = canvasComposer;
        this.videoGroupComposer = videoGroupComposer;
    }
}
