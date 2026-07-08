package com.ss.android.ugc.aweme.publish.privacy;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PermissionConfigure implements Parcelable, Serializable {
    public final int currentPermission;
    public final String enterMethod;
    public PostBtnConfigure postBtnConfigure;
    public final VideoPublishEditModel videoPublishEditModel;
    public static final Parcelable.Creator<PermissionConfigure> CREATOR = new Parcelable.Creator<PermissionConfigure>() { // from class: X.0nh0
        @Override // android.os.Parcelable.Creator
        public final PermissionConfigure createFromParcel(Parcel parcel) {
            PostBtnConfigure postBtnConfigureCreateFromParcel;
            int i = parcel.readInt();
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) parcel.readParcelable(PermissionConfigure.class.getClassLoader());
            if (parcel.readInt() == 0) {
                postBtnConfigureCreateFromParcel = null;
            } else {
                postBtnConfigureCreateFromParcel = PostBtnConfigure.CREATOR.createFromParcel(parcel);
            }
            return new PermissionConfigure(i, videoPublishEditModel, postBtnConfigureCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PermissionConfigure[] newArray(int i) {
            return new PermissionConfigure[i];
        }
    };
    public static final int $stable = 8;

    public PermissionConfigure() {
        this(-1, null, null, "");
    }

    public final PermissionConfigure copy(int i, VideoPublishEditModel videoPublishEditModel, PostBtnConfigure postBtnConfigure, String str) {
        return new PermissionConfigure(i, videoPublishEditModel, postBtnConfigure, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionConfigure)) {
            return false;
        }
        PermissionConfigure permissionConfigure = (PermissionConfigure) obj;
        return this.currentPermission == permissionConfigure.currentPermission && Intrinsics.LJFF(this.videoPublishEditModel, permissionConfigure.videoPublishEditModel) && Intrinsics.LJFF(this.postBtnConfigure, permissionConfigure.postBtnConfigure) && Intrinsics.LJFF(this.enterMethod, permissionConfigure.enterMethod);
    }

    public int hashCode() {
        int i = this.currentPermission * 31;
        VideoPublishEditModel videoPublishEditModel = this.videoPublishEditModel;
        int iHashCode = (i + (videoPublishEditModel == null ? 0 : videoPublishEditModel.hashCode())) * 31;
        PostBtnConfigure postBtnConfigure = this.postBtnConfigure;
        return ((iHashCode + (postBtnConfigure != null ? postBtnConfigure.hashCode() : 0)) * 31) + this.enterMethod.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermissionConfigure(currentPermission=");
        sbLIZ.append(this.currentPermission);
        sbLIZ.append(", videoPublishEditModel=");
        sbLIZ.append(this.videoPublishEditModel);
        sbLIZ.append(", postBtnConfigure=");
        sbLIZ.append(this.postBtnConfigure);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.currentPermission);
        parcel.writeParcelable(this.videoPublishEditModel, i);
        PostBtnConfigure postBtnConfigure = this.postBtnConfigure;
        if (postBtnConfigure == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            postBtnConfigure.writeToParcel(parcel, i);
        }
        parcel.writeString(this.enterMethod);
    }

    public final int getCurrentPermission() {
        return this.currentPermission;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final PostBtnConfigure getPostBtnConfigure() {
        return this.postBtnConfigure;
    }

    public final VideoPublishEditModel getVideoPublishEditModel() {
        return this.videoPublishEditModel;
    }

    public final void setPostBtnConfigure(PostBtnConfigure postBtnConfigure) {
        this.postBtnConfigure = postBtnConfigure;
    }

    public PermissionConfigure(int i, VideoPublishEditModel videoPublishEditModel, PostBtnConfigure postBtnConfigure, String str) {
        this.currentPermission = i;
        this.videoPublishEditModel = videoPublishEditModel;
        this.postBtnConfigure = postBtnConfigure;
        this.enterMethod = str;
    }
}
