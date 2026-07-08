package com.ss.android.ugc.aweme.creative.model.publish;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.DescAutoFillTrackModel;

/* JADX INFO: loaded from: classes9.dex */
public final class DescAutoFillTrackModel implements Parcelable {
    public static final Parcelable.Creator<DescAutoFillTrackModel> CREATOR = new Parcelable.Creator<DescAutoFillTrackModel>() { // from class: X.0MpP
        @Override // android.os.Parcelable.Creator
        public final DescAutoFillTrackModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            return new DescAutoFillTrackModel(string, string2, z, z2, z3, z4, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final DescAutoFillTrackModel[] newArray(int i) {
            return new DescAutoFillTrackModel[i];
        }
    };

    @C09CT("auto_fill_handled")
    public boolean autoFillHandled;

    @C09CT("card_applied")
    public boolean cardApplied;

    @C09CT("card_shown")
    public boolean cardShown;

    @C09CT("hashtag_via_card")
    public boolean hashtagViaCard;

    @C09CT("proposed_hashtags")
    public String proposedHashtags;

    @C09CT("proposed_text")
    public String proposedText;

    @C09CT("text_via_card")
    public boolean textViaCard;

    public DescAutoFillTrackModel() {
        this(null, null, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.proposedText);
        parcel.writeString(this.proposedHashtags);
        parcel.writeInt(this.textViaCard ? 1 : 0);
        parcel.writeInt(this.hashtagViaCard ? 1 : 0);
        parcel.writeInt(this.cardShown ? 1 : 0);
        parcel.writeInt(this.cardApplied ? 1 : 0);
        parcel.writeInt(this.autoFillHandled ? 1 : 0);
    }

    public DescAutoFillTrackModel(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.proposedText = str;
        this.proposedHashtags = str2;
        this.textViaCard = z;
        this.hashtagViaCard = z2;
        this.cardShown = z3;
        this.cardApplied = z4;
        this.autoFillHandled = z5;
    }
}
