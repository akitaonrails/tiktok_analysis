package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC1419230n2H;
import X.EnumC570120MXq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.PortraitAuthor;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.model.PortraitUrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PortraitStyleItem implements Parcelable {
    public static final Parcelable.Creator<PortraitStyleItem> CREATOR = new Parcelable.Creator<PortraitStyleItem>() { // from class: X.0MXr
        @Override // android.os.Parcelable.Creator
        public final PortraitStyleItem createFromParcel(Parcel parcel) {
            PortraitUrlModel portraitUrlModelCreateFromParcel;
            PortraitAuthor portraitAuthorCreateFromParcel;
            Long lValueOf;
            EnumC1419230n2H enumC1419230n2HValueOf;
            EnumC570120MXq enumC570120MXqValueOf;
            boolean z;
            Boolean boolValueOf;
            Long lValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf3 = null;
            if (parcel.readInt() == 0) {
                portraitUrlModelCreateFromParcel = null;
            } else {
                portraitUrlModelCreateFromParcel = PortraitUrlModel.CREATOR.createFromParcel(parcel);
            }
            PortraitUrlModel portraitUrlModel = portraitUrlModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                portraitAuthorCreateFromParcel = null;
            } else {
                portraitAuthorCreateFromParcel = PortraitAuthor.CREATOR.createFromParcel(parcel);
            }
            PortraitAuthor portraitAuthor = portraitAuthorCreateFromParcel;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                enumC1419230n2HValueOf = null;
            } else {
                enumC1419230n2HValueOf = EnumC1419230n2H.valueOf(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                enumC570120MXqValueOf = null;
            } else {
                enumC570120MXqValueOf = EnumC570120MXq.valueOf(parcel.readString());
            }
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
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            return new PortraitStyleItem(string, string2, portraitUrlModel, portraitAuthor, lValueOf, enumC1419230n2HValueOf, enumC570120MXqValueOf, boolValueOf, lValueOf2, lValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final PortraitStyleItem[] newArray(int i) {
            return new PortraitStyleItem[i];
        }
    };

    @C09CT("author")
    public final PortraitAuthor author;

    @C09CT("cover_url")
    public final PortraitUrlModel coverUrl;

    @C09CT("followed_prompt_id")
    public final Long followedPromptId;

    @C09CT("has_reference_image")
    public final Boolean hasReferenceImage;

    @C09CT("post_count")
    public final Long postCount;

    @C09CT("prompt")
    public final String prompt;

    @C09CT("res_pos")
    public final EnumC570120MXq resPos;

    @C09CT("root_prompt_id")
    public final Long rootPromptId;

    @C09CT("style_id")
    public final String styleId;

    @C09CT("style_type")
    public final EnumC1419230n2H styleType;

    public PortraitStyleItem() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortraitStyleItem)) {
            return false;
        }
        PortraitStyleItem portraitStyleItem = (PortraitStyleItem) obj;
        return Intrinsics.LJFF(this.styleId, portraitStyleItem.styleId) && Intrinsics.LJFF(this.prompt, portraitStyleItem.prompt) && Intrinsics.LJFF(this.coverUrl, portraitStyleItem.coverUrl) && Intrinsics.LJFF(this.author, portraitStyleItem.author) && Intrinsics.LJFF(this.postCount, portraitStyleItem.postCount) && this.styleType == portraitStyleItem.styleType && this.resPos == portraitStyleItem.resPos && Intrinsics.LJFF(this.hasReferenceImage, portraitStyleItem.hasReferenceImage) && Intrinsics.LJFF(this.followedPromptId, portraitStyleItem.followedPromptId) && Intrinsics.LJFF(this.rootPromptId, portraitStyleItem.rootPromptId);
    }

    public final int hashCode() {
        String str = this.styleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.prompt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PortraitUrlModel portraitUrlModel = this.coverUrl;
        int iHashCode3 = (iHashCode2 + (portraitUrlModel == null ? 0 : portraitUrlModel.hashCode())) * 31;
        PortraitAuthor portraitAuthor = this.author;
        int iHashCode4 = (iHashCode3 + (portraitAuthor == null ? 0 : portraitAuthor.hashCode())) * 31;
        Long l = this.postCount;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        EnumC1419230n2H enumC1419230n2H = this.styleType;
        int iHashCode6 = (iHashCode5 + (enumC1419230n2H == null ? 0 : enumC1419230n2H.hashCode())) * 31;
        EnumC570120MXq enumC570120MXq = this.resPos;
        int iHashCode7 = (iHashCode6 + (enumC570120MXq == null ? 0 : enumC570120MXq.hashCode())) * 31;
        Boolean bool = this.hasReferenceImage;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.followedPromptId;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.rootPromptId;
        return iHashCode9 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PortraitStyleItem(styleId=");
        sbLIZ.append(this.styleId);
        sbLIZ.append(", prompt=");
        sbLIZ.append(this.prompt);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", postCount=");
        sbLIZ.append(this.postCount);
        sbLIZ.append(", styleType=");
        sbLIZ.append(this.styleType);
        sbLIZ.append(", resPos=");
        sbLIZ.append(this.resPos);
        sbLIZ.append(", hasReferenceImage=");
        sbLIZ.append(this.hasReferenceImage);
        sbLIZ.append(", followedPromptId=");
        sbLIZ.append(this.followedPromptId);
        sbLIZ.append(", rootPromptId=");
        sbLIZ.append(this.rootPromptId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.styleId);
        parcel.writeString(this.prompt);
        PortraitUrlModel portraitUrlModel = this.coverUrl;
        if (portraitUrlModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            portraitUrlModel.writeToParcel(parcel, i);
        }
        PortraitAuthor portraitAuthor = this.author;
        if (portraitAuthor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            portraitAuthor.writeToParcel(parcel, i);
        }
        Long l = this.postCount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        EnumC1419230n2H enumC1419230n2H = this.styleType;
        if (enumC1419230n2H == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC1419230n2H.name());
        }
        EnumC570120MXq enumC570120MXq = this.resPos;
        if (enumC570120MXq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC570120MXq.name());
        }
        Boolean bool = this.hasReferenceImage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l2 = this.followedPromptId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.rootPromptId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
    }

    public PortraitStyleItem(String str, String str2, PortraitUrlModel portraitUrlModel, PortraitAuthor portraitAuthor, Long l, EnumC1419230n2H enumC1419230n2H, EnumC570120MXq enumC570120MXq, Boolean bool, Long l2, Long l3) {
        this.styleId = str;
        this.prompt = str2;
        this.coverUrl = portraitUrlModel;
        this.author = portraitAuthor;
        this.postCount = l;
        this.styleType = enumC1419230n2H;
        this.resPos = enumC570120MXq;
        this.hasReferenceImage = bool;
        this.followedPromptId = l2;
        this.rootPromptId = l3;
    }
}
