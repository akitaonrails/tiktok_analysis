package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PopUpMessage implements Parcelable {

    @C09CT("contents")
    public List<ECRichText> contents;

    @C09CT("lead_icon")
    public Icon leadIcon;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<PopUpMessage> CREATOR = new Parcelable.Creator<PopUpMessage>() { // from class: X.02kv
        @Override // android.os.Parcelable.Creator
        public final PopUpMessage createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(PopUpMessage.class.getClassLoader()));
                }
            }
            return new PopUpMessage(string, arrayList, (Icon) parcel.readParcelable(PopUpMessage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PopUpMessage[] newArray(int i) {
            return new PopUpMessage[i];
        }
    };
    public static final int $stable = 8;

    public PopUpMessage() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopUpMessage)) {
            return false;
        }
        PopUpMessage popUpMessage = (PopUpMessage) obj;
        return Intrinsics.LJFF(this.title, popUpMessage.title) && Intrinsics.LJFF(this.contents, popUpMessage.contents) && Intrinsics.LJFF(this.leadIcon, popUpMessage.leadIcon);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ECRichText> list = this.contents;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Icon icon = this.leadIcon;
        return iHashCode2 + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopUpMessage(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", contents=");
        sbLIZ.append(this.contents);
        sbLIZ.append(", leadIcon=");
        sbLIZ.append(this.leadIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<ECRichText> list = this.contents;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ECRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeParcelable(this.leadIcon, i);
    }

    public PopUpMessage(String str, List<ECRichText> list, Icon icon) {
        this.title = str;
        this.contents = list;
        this.leadIcon = icon;
    }
}
