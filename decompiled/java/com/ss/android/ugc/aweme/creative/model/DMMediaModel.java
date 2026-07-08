package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C1435290nSB;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.GroupShotDataModel;

/* JADX INFO: loaded from: classes23.dex */
public final class DMMediaModel implements Parcelable {

    @C09CT("group_shot_data_Model")
    public GroupShotDataModel groupShotData;

    @C09CT("is_from_main_post")
    public final boolean isFromMainPost;

    @C09CT("is_synthesised")
    public final boolean isSynthesised;

    @C09CT("output_cover_file")
    public final String outputCoverFile;

    @C09CT("photo_file")
    public final String photoFile;

    @C09CT("skip_extract_video_cover")
    public final boolean skipExtractVideoCover;

    @C09CT("synthesised_file")
    public final String synthesisedFile;

    @C09CT("type")
    public final int type;
    public static final C1435290nSB Companion = new Object() { // from class: X.0nSB
    };
    public static final Parcelable.Creator<DMMediaModel> CREATOR = new Parcelable.Creator<DMMediaModel>() { // from class: X.0nMd
        @Override // android.os.Parcelable.Creator
        public final DMMediaModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            GroupShotDataModel groupShotDataModelCreateFromParcel;
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
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
            if (parcel.readInt() == 0) {
                groupShotDataModelCreateFromParcel = null;
            } else {
                groupShotDataModelCreateFromParcel = GroupShotDataModel.CREATOR.createFromParcel(parcel);
            }
            return new DMMediaModel(i, string, string2, string3, z, z2, z3, groupShotDataModelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DMMediaModel[] newArray(int i) {
            return new DMMediaModel[i];
        }
    };

    public DMMediaModel() {
        this(0, "", "", "", false, false, false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.photoFile);
        parcel.writeString(this.synthesisedFile);
        parcel.writeString(this.outputCoverFile);
        parcel.writeInt(this.isSynthesised ? 1 : 0);
        parcel.writeInt(this.skipExtractVideoCover ? 1 : 0);
        parcel.writeInt(this.isFromMainPost ? 1 : 0);
        GroupShotDataModel groupShotDataModel = this.groupShotData;
        if (groupShotDataModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupShotDataModel.writeToParcel(parcel, i);
        }
    }

    public DMMediaModel(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, GroupShotDataModel groupShotDataModel) {
        this.type = i;
        this.photoFile = str;
        this.synthesisedFile = str2;
        this.outputCoverFile = str3;
        this.isSynthesised = z;
        this.skipExtractVideoCover = z2;
        this.isFromMainPost = z3;
        this.groupShotData = groupShotDataModel;
    }
}
