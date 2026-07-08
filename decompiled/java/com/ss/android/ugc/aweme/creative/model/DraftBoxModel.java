package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.DraftBoxModel;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftBoxModel implements Parcelable {
    public static final Parcelable.Creator<DraftBoxModel> CREATOR = new Parcelable.Creator<DraftBoxModel>() { // from class: X.0Map
        @Override // android.os.Parcelable.Creator
        public final DraftBoxModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new DraftBoxModel(string, string2, z, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DraftBoxModel[] newArray(int i) {
            return new DraftBoxModel[i];
        }
    };

    @C09CT("draft_again_prop_resource_id")
    public String draftAgainPropResourceId;

    @C09CT("draft_again_prop_selected_from")
    public String draftAgainPropSelectedFrom;

    @C09CT("draft_again_type")
    public String draftAgainType;

    @C040H
    public String draftEnterFrom;

    @C040H
    public String filterBy;

    @C040H
    public boolean isPostInDraftBox;

    @C040H
    public String sortBy;

    public DraftBoxModel() {
        this(null, null, false, "", null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sortBy);
        parcel.writeString(this.filterBy);
        parcel.writeInt(this.isPostInDraftBox ? 1 : 0);
        parcel.writeString(this.draftEnterFrom);
        parcel.writeString(this.draftAgainType);
        parcel.writeString(this.draftAgainPropSelectedFrom);
        parcel.writeString(this.draftAgainPropResourceId);
    }

    public DraftBoxModel(String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        this.sortBy = str;
        this.filterBy = str2;
        this.isPostInDraftBox = z;
        this.draftEnterFrom = str3;
        this.draftAgainType = str4;
        this.draftAgainPropSelectedFrom = str5;
        this.draftAgainPropResourceId = str6;
    }
}
