package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EditPostCheckResult;
import com.ss.android.ugc.aweme.creative.model.EditPostNewsAnchorChangeType;
import com.ss.android.ugc.aweme.creative.model.EditPostPoiChangeType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class EditPostCheckResult implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditPostCheckResult> CREATOR = new Parcelable.Creator<EditPostCheckResult>() { // from class: X.0nJm
        @Override // android.os.Parcelable.Creator
        public final EditPostCheckResult createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
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
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            EditPostPoiChangeType editPostPoiChangeTypeCreateFromParcel = EditPostPoiChangeType.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new EditPostCheckResult(z, z2, z3, z4, z5, editPostPoiChangeTypeCreateFromParcel, z6, z7, EditPostNewsAnchorChangeType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EditPostCheckResult[] newArray(int i) {
            return new EditPostCheckResult[i];
        }
    };

    @C040H
    public final boolean isAltTextChanged;

    @C040H
    public final boolean isAtFriendEdited;

    @C040H
    public boolean isCoverEdited;

    @C040H
    public final boolean isHashtagEdited;

    @C040H
    public final boolean isHeadingChanged;

    @C040H
    public final boolean isMentionVideoEdited;

    @C040H
    public final boolean isTitleChanged;

    @C040H
    public final EditPostNewsAnchorChangeType newsAnchorChangedType;

    @C040H
    public final EditPostPoiChangeType poiChangedType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isTitleChanged ? 1 : 0);
        parcel.writeInt(this.isHashtagEdited ? 1 : 0);
        parcel.writeInt(this.isAtFriendEdited ? 1 : 0);
        parcel.writeInt(this.isMentionVideoEdited ? 1 : 0);
        parcel.writeInt(this.isCoverEdited ? 1 : 0);
        this.poiChangedType.writeToParcel(parcel, i);
        parcel.writeInt(this.isHeadingChanged ? 1 : 0);
        parcel.writeInt(this.isAltTextChanged ? 1 : 0);
        this.newsAnchorChangedType.writeToParcel(parcel, i);
    }

    public final EditPostNewsAnchorChangeType getNewsAnchorChangedType() {
        return this.newsAnchorChangedType;
    }

    public final EditPostPoiChangeType getPoiChangedType() {
        return this.poiChangedType;
    }

    public final boolean isAltTextChanged() {
        return this.isAltTextChanged;
    }

    public final boolean isAtFriendEdited() {
        return this.isAtFriendEdited;
    }

    public final boolean isCoverEdited() {
        return this.isCoverEdited;
    }

    public final boolean isHashtagEdited() {
        return this.isHashtagEdited;
    }

    public final boolean isHeadingChanged() {
        return this.isHeadingChanged;
    }

    public final boolean isMentionVideoEdited() {
        return this.isMentionVideoEdited;
    }

    public final boolean isTitleChanged() {
        return this.isTitleChanged;
    }

    public final void setCoverEdited(boolean z) {
        this.isCoverEdited = z;
    }

    public EditPostCheckResult(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, EditPostPoiChangeType editPostPoiChangeType, boolean z6, boolean z7, EditPostNewsAnchorChangeType editPostNewsAnchorChangeType) {
        this.isTitleChanged = z;
        this.isHashtagEdited = z2;
        this.isAtFriendEdited = z3;
        this.isMentionVideoEdited = z4;
        this.isCoverEdited = z5;
        this.poiChangedType = editPostPoiChangeType;
        this.isHeadingChanged = z6;
        this.isAltTextChanged = z7;
        this.newsAnchorChangedType = editPostNewsAnchorChangeType;
    }
}
