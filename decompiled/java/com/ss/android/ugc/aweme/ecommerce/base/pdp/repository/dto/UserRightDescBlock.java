package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserRightDescBlock implements Parcelable {

    @C09CT("link_text")
    public LinkText linkText;

    @C09CT("logos")
    public List<Icon> logos;

    @C09CT("mix_link_description")
    public LinkRichText mixLinkDescription;

    @C09CT("plain_description")
    public String plainDescription;

    @C09CT("type")
    public Integer type;
    public static final Parcelable.Creator<UserRightDescBlock> CREATOR = new Parcelable.Creator<UserRightDescBlock>() { // from class: X.02Xb
        @Override // android.os.Parcelable.Creator
        public final UserRightDescBlock createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList;
            LinkRichText linkRichTextCreateFromParcel;
            LinkText linkTextCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(UserRightDescBlock.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText = linkRichTextCreateFromParcel;
            if (parcel.readInt() != 0) {
                linkTextCreateFromParcel = LinkText.CREATOR.createFromParcel(parcel);
            }
            return new UserRightDescBlock(numValueOf, string, arrayList, linkRichText, linkTextCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UserRightDescBlock[] newArray(int i) {
            return new UserRightDescBlock[i];
        }
    };
    public static final int $stable = 8;

    public UserRightDescBlock() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRightDescBlock)) {
            return false;
        }
        UserRightDescBlock userRightDescBlock = (UserRightDescBlock) obj;
        return Intrinsics.LJFF(this.type, userRightDescBlock.type) && Intrinsics.LJFF(this.plainDescription, userRightDescBlock.plainDescription) && Intrinsics.LJFF(this.logos, userRightDescBlock.logos) && Intrinsics.LJFF(this.mixLinkDescription, userRightDescBlock.mixLinkDescription) && Intrinsics.LJFF(this.linkText, userRightDescBlock.linkText);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.plainDescription;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Icon> list = this.logos;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LinkRichText linkRichText = this.mixLinkDescription;
        int iHashCode4 = (iHashCode3 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        LinkText linkText = this.linkText;
        return iHashCode4 + (linkText != null ? linkText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserRightDescBlock(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", plainDescription=");
        sbLIZ.append(this.plainDescription);
        sbLIZ.append(", logos=");
        sbLIZ.append(this.logos);
        sbLIZ.append(", mixLinkDescription=");
        sbLIZ.append(this.mixLinkDescription);
        sbLIZ.append(", linkText=");
        sbLIZ.append(this.linkText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.plainDescription);
        List<Icon> list = this.logos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Icon> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        LinkRichText linkRichText = this.mixLinkDescription;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        LinkText linkText = this.linkText;
        if (linkText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkText.writeToParcel(parcel, i);
        }
    }

    public UserRightDescBlock(Integer num, String str, List<Icon> list, LinkRichText linkRichText, LinkText linkText) {
        this.type = num;
        this.plainDescription = str;
        this.logos = list;
        this.mixLinkDescription = linkRichText;
        this.linkText = linkText;
    }
}
