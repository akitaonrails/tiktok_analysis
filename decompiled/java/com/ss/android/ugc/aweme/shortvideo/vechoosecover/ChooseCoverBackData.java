package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import X.C1432210nND;
import X.C889340Yui;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishSecureModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverBackData;

/* JADX INFO: loaded from: classes23.dex */
public final class ChooseCoverBackData implements Parcelable {
    public String coverImagePath;
    public CoverPublishModel coverPublishModel;
    public PublishCustomCoverModel customCoverModel;
    public Boolean editPostCoverChosen;
    public String firstFramePath;
    public PostPageModel postPageModel;
    public PublishSecureModel publishSecureModel;
    public String videoCoverImgPath;
    public String videoCoverPath;
    public static final C1432210nND Companion = new Object() { // from class: X.0nND
    };
    public static final Parcelable.Creator<ChooseCoverBackData> CREATOR = new Parcelable.Creator<ChooseCoverBackData>() { // from class: X.0nNC
        @Override // android.os.Parcelable.Creator
        public final ChooseCoverBackData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            CoverPublishModel coverPublishModel = (CoverPublishModel) parcel.readParcelable(ChooseCoverBackData.class.getClassLoader());
            PostPageModel postPageModel = (PostPageModel) parcel.readParcelable(ChooseCoverBackData.class.getClassLoader());
            PublishCustomCoverModel publishCustomCoverModel = (PublishCustomCoverModel) parcel.readParcelable(ChooseCoverBackData.class.getClassLoader());
            PublishSecureModel publishSecureModel = (PublishSecureModel) parcel.readParcelable(ChooseCoverBackData.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new ChooseCoverBackData(coverPublishModel, postPageModel, publishCustomCoverModel, publishSecureModel, string, string2, string3, string4, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ChooseCoverBackData[] newArray(int i) {
            return new ChooseCoverBackData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeParcelable(this.coverPublishModel, i);
        parcel.writeParcelable(this.postPageModel, i);
        parcel.writeParcelable(this.customCoverModel, i);
        parcel.writeParcelable(this.publishSecureModel, i);
        parcel.writeString(this.videoCoverPath);
        parcel.writeString(this.videoCoverImgPath);
        parcel.writeString(this.coverImagePath);
        parcel.writeString(this.firstFramePath);
        Boolean bool = this.editPostCoverChosen;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean zBooleanValue;
        if (videoPublishEditModel == null) {
            return;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        creativeModel.coverPublishModel = this.coverPublishModel;
        creativeModel.postPageModel = this.postPageModel;
        creativeModel.publishCustomCoverModel = this.customCoverModel;
        creativeModel.publishSecureModel = this.publishSecureModel;
        if (C889340Yui.LIZ()) {
            videoPublishEditModel.setVideoCoverPath(this.videoCoverPath);
        }
        MvCreateVideoData mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
        if (mvCreateVideoData != null) {
            mvCreateVideoData.videoCoverImgPath = this.videoCoverImgPath;
        }
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.coverImagePath = this.coverImagePath;
        }
        CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
        creativeModel2.publishPreviewModel.firstFramePath = this.firstFramePath;
        EditPostModel editPostModel = creativeModel2.editPostModel;
        if (editPostModel != null) {
            Boolean bool = this.editPostCoverChosen;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            editPostModel.setChangeCover(zBooleanValue);
        }
    }

    public ChooseCoverBackData(CoverPublishModel coverPublishModel, PostPageModel postPageModel, PublishCustomCoverModel publishCustomCoverModel, PublishSecureModel publishSecureModel, String str, String str2, String str3, String str4, Boolean bool) {
        this.coverPublishModel = coverPublishModel;
        this.postPageModel = postPageModel;
        this.customCoverModel = publishCustomCoverModel;
        this.publishSecureModel = publishSecureModel;
        this.videoCoverPath = str;
        this.videoCoverImgPath = str2;
        this.coverImagePath = str3;
        this.firstFramePath = str4;
        this.editPostCoverChosen = bool;
    }
}
