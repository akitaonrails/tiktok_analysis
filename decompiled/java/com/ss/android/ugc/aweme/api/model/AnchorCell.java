package com.ss.android.ugc.aweme.api.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorIcon;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorCell implements Parcelable {
    public static final Parcelable.Creator<AnchorCell> CREATOR = new Parcelable.Creator<AnchorCell>() { // from class: X.119D
        @Override // android.os.Parcelable.Creator
        public final AnchorCell createFromParcel(Parcel parcel) {
            AnchorIcon anchorIconCreateFromParcel;
            boolean z;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                anchorIconCreateFromParcel = null;
            } else {
                anchorIconCreateFromParcel = AnchorIcon.CREATOR.createFromParcel(parcel);
            }
            AnchorIcon anchorIcon = anchorIconCreateFromParcel;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AnchorCell(string, anchorIcon, string2, string3, string4, string5, i, z);
        }

        @Override // android.os.Parcelable.Creator
        public final AnchorCell[] newArray(int i) {
            return new AnchorCell[i];
        }
    };

    @C09CT("extra")
    public String extra;

    @C09CT("icon")
    public AnchorIcon icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;
    public boolean isEditable;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("title")
    public String title;
    public int type;

    @C09CT("schema_url")
    public String url;

    public AnchorCell() {
        this(null, null, null, null, null, null, -100, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        AnchorIcon anchorIcon = this.icon;
        if (anchorIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            anchorIcon.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.url);
        parcel.writeString(this.extra);
        parcel.writeInt(this.type);
        parcel.writeInt(this.isEditable ? 1 : 0);
    }

    public final int hashCode() {
        String str = this.id;
        if (str == null) {
            str = "";
        }
        return CastIntegerProtector.valueOf(str).hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnchorCell) {
            return TextUtils.equals(this.id, ((AnchorCell) obj).id);
        }
        return false;
    }

    public AnchorCell(String str, AnchorIcon anchorIcon, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.id = str;
        this.icon = anchorIcon;
        this.title = str2;
        this.subTitle = str3;
        this.url = str4;
        this.extra = str5;
        this.type = i;
        this.isEditable = z;
    }
}
