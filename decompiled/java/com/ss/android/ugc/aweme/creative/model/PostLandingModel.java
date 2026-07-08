package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PostLandingModel;

/* JADX INFO: loaded from: classes23.dex */
public final class PostLandingModel implements Parcelable {
    public static final Parcelable.Creator<PostLandingModel> CREATOR = new Parcelable.Creator<PostLandingModel>() { // from class: X.0nYB
        @Override // android.os.Parcelable.Creator
        public final PostLandingModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            Bundle bundle = parcel.readBundle(PostLandingModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new PostLandingModel(z, string, bundle, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final PostLandingModel[] newArray(int i) {
            return new PostLandingModel[i];
        }
    };

    @C040H
    public transient Bundle backBundle;

    @C040H
    public boolean backByClearTop;

    @C040H
    public String backUrl;

    @C040H
    public boolean includeDraft;

    @C040H
    public boolean landingBack;

    public PostLandingModel() {
        this(false, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.landingBack ? 1 : 0);
        parcel.writeString(this.backUrl);
        parcel.writeBundle(this.backBundle);
        parcel.writeInt(this.includeDraft ? 1 : 0);
        parcel.writeInt(this.backByClearTop ? 1 : 0);
    }

    public /* synthetic */ PostLandingModel(boolean z, int i) {
        Bundle bundle;
        boolean z2 = (i & 1) != 0 ? false : z;
        if ((i & 4) != 0) {
            bundle = new Bundle();
        } else {
            bundle = null;
        }
        this(z2, null, bundle, false, false);
    }

    public PostLandingModel(boolean z, String str, Bundle bundle, boolean z2, boolean z3) {
        this.landingBack = z;
        this.backUrl = str;
        this.backBundle = bundle;
        this.includeDraft = z2;
        this.backByClearTop = z3;
    }
}
