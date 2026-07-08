package com.ss.android.ugc.aweme.creative.model.stickers;

import X.C040H;
import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursStickerExtras implements Parcelable, Serializable {
    public static final Parcelable.Creator<AddYoursStickerExtras> CREATOR = new Parcelable.Creator<AddYoursStickerExtras>() { // from class: X.0OvP
        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerExtras createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Boolean boolValueOf;
            Long lValueOf;
            ArrayList arrayList;
            boolean z5;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(AddYoursStickerExtras.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new AddYoursStickerExtras(z, string, string2, string3, z2, z3, boolValueOf, lValueOf, arrayList, numValueOf, z5, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerExtras[] newArray(int i) {
            return new AddYoursStickerExtras[i];
        }
    };

    @C09CT("addYoursEnterMethod")
    public final String addYoursEnterMethod;

    @C09CT("add_yours_from_group_content")
    public String addYoursFromGroupContent;

    @C09CT("add_yours_invitees")
    public List<UserInvitee> addYoursInvitees;

    @C040H
    public boolean autoEnterStickerEdit;

    @C09CT("enterFrom")
    public final String enterFrom;

    @C09CT("followStatus")
    public final String followStatus;

    @C09CT("from_item_id")
    public final Long fromItemId;

    @C09CT("from_photo_mode")
    public boolean fromPhotoMode;

    @C09CT("isFollowAY")
    public final boolean isFollowAY;

    @C09CT("isFromQA")
    public final boolean isFromQA;

    @C09CT("is_operation_set")
    public final Integer isOperationSet;

    @C09CT("viewer_is_invited")
    public final Boolean viewerInvited;

    public AddYoursStickerExtras() {
        this(false, null, null, null, true, false, null, null, null, 0, false, null);
    }

    public final AddYoursStickerExtras copy(boolean z, String str, String str2, String str3, boolean z2, boolean z3, Boolean bool, Long l, List<UserInvitee> list, Integer num, boolean z4, String str4) {
        return new AddYoursStickerExtras(z, str, str2, str3, z2, z3, bool, l, list, num, z4, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursStickerExtras)) {
            return false;
        }
        AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) obj;
        return this.autoEnterStickerEdit == addYoursStickerExtras.autoEnterStickerEdit && Intrinsics.LJFF(this.enterFrom, addYoursStickerExtras.enterFrom) && Intrinsics.LJFF(this.addYoursEnterMethod, addYoursStickerExtras.addYoursEnterMethod) && Intrinsics.LJFF(this.followStatus, addYoursStickerExtras.followStatus) && this.isFollowAY == addYoursStickerExtras.isFollowAY && this.isFromQA == addYoursStickerExtras.isFromQA && Intrinsics.LJFF(this.viewerInvited, addYoursStickerExtras.viewerInvited) && Intrinsics.LJFF(this.fromItemId, addYoursStickerExtras.fromItemId) && Intrinsics.LJFF(this.addYoursInvitees, addYoursStickerExtras.addYoursInvitees) && Intrinsics.LJFF(this.isOperationSet, addYoursStickerExtras.isOperationSet) && this.fromPhotoMode == addYoursStickerExtras.fromPhotoMode && Intrinsics.LJFF(this.addYoursFromGroupContent, addYoursStickerExtras.addYoursFromGroupContent);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.autoEnterStickerEdit) * 31;
        String str = this.enterFrom;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addYoursEnterMethod;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.followStatus;
        int iHashCode3 = (((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.isFollowAY)) * 31) + C786410Ut5.Z2(this.isFromQA)) * 31;
        Boolean bool = this.viewerInvited;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.fromItemId;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        List<UserInvitee> list = this.addYoursInvitees;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.isOperationSet;
        int iHashCode7 = (((iHashCode6 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.fromPhotoMode)) * 31;
        String str4 = this.addYoursFromGroupContent;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "AddYoursStickerExtras(autoEnterStickerEdit=" + this.autoEnterStickerEdit + ", enterFrom=" + this.enterFrom + ", addYoursEnterMethod=" + this.addYoursEnterMethod + ", followStatus=" + this.followStatus + ", isFollowAY=" + this.isFollowAY + ", isFromQA=" + this.isFromQA + ", viewerInvited=" + this.viewerInvited + ", fromItemId=" + this.fromItemId + ", addYoursInvitees=" + this.addYoursInvitees + ", isOperationSet=" + this.isOperationSet + ", fromPhotoMode=" + this.fromPhotoMode + ", addYoursFromGroupContent=" + this.addYoursFromGroupContent + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.autoEnterStickerEdit ? 1 : 0);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.addYoursEnterMethod);
        parcel.writeString(this.followStatus);
        parcel.writeInt(this.isFollowAY ? 1 : 0);
        parcel.writeInt(this.isFromQA ? 1 : 0);
        Boolean bool = this.viewerInvited;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l = this.fromItemId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<UserInvitee> list = this.addYoursInvitees;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UserInvitee> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        Integer num = this.isOperationSet;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.fromPhotoMode ? 1 : 0);
        parcel.writeString(this.addYoursFromGroupContent);
    }

    public final String getAddYoursEnterMethod() {
        return this.addYoursEnterMethod;
    }

    public final String getAddYoursFromGroupContent() {
        return this.addYoursFromGroupContent;
    }

    public final List<UserInvitee> getAddYoursInvitees() {
        return this.addYoursInvitees;
    }

    public final boolean getAutoEnterStickerEdit() {
        return this.autoEnterStickerEdit;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFollowStatus() {
        return this.followStatus;
    }

    public final Long getFromItemId() {
        return this.fromItemId;
    }

    public final boolean getFromPhotoMode() {
        return this.fromPhotoMode;
    }

    public final Boolean getViewerInvited() {
        return this.viewerInvited;
    }

    public final boolean isFollowAY() {
        return this.isFollowAY;
    }

    public final boolean isFromQA() {
        return this.isFromQA;
    }

    public final Integer isOperationSet() {
        return this.isOperationSet;
    }

    public final void setAddYoursFromGroupContent(String str) {
        this.addYoursFromGroupContent = str;
    }

    public final void setAddYoursInvitees(List<UserInvitee> list) {
        this.addYoursInvitees = list;
    }

    public final void setAutoEnterStickerEdit(boolean z) {
        this.autoEnterStickerEdit = z;
    }

    public final void setFromPhotoMode(boolean z) {
        this.fromPhotoMode = z;
    }

    public AddYoursStickerExtras(boolean z, String str, String str2, String str3, boolean z2, boolean z3, Boolean bool, Long l, List<UserInvitee> list, Integer num, boolean z4, String str4) {
        this.autoEnterStickerEdit = z;
        this.enterFrom = str;
        this.addYoursEnterMethod = str2;
        this.followStatus = str3;
        this.isFollowAY = z2;
        this.isFromQA = z3;
        this.viewerInvited = bool;
        this.fromItemId = l;
        this.addYoursInvitees = list;
        this.isOperationSet = num;
        this.fromPhotoMode = z4;
        this.addYoursFromGroupContent = str4;
    }
}
