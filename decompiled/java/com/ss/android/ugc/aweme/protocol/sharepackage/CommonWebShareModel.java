package com.ss.android.ugc.aweme.protocol.sharepackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.protocol.sharepackage.CommonWebShareModel;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;

/* JADX INFO: loaded from: classes22.dex */
public final class CommonWebShareModel extends ShareModel {
    public static final Parcelable.Creator<CommonWebShareModel> CREATOR = new Parcelable.Creator<CommonWebShareModel>() { // from class: X.0lwZ
        @Override // android.os.Parcelable.Creator
        public final CommonWebShareModel createFromParcel(Parcel parcel) {
            return new CommonWebShareModel((WebShareInfo) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final CommonWebShareModel[] newArray(int i) {
            return new CommonWebShareModel[i];
        }
    };
    public final WebShareInfo shareInfo;

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.shareInfo);
    }

    public CommonWebShareModel(WebShareInfo webShareInfo) {
        super(webShareInfo);
        this.shareInfo = webShareInfo;
    }
}
