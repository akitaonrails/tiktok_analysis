package com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.LinkText;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkRichText implements Parcelable {
    public static final Parcelable.Creator<LinkRichText> CREATOR = new Parcelable.Creator<LinkRichText>() { // from class: X.02xg
        @Override // android.os.Parcelable.Creator
        public final LinkRichText createFromParcel(Parcel parcel) {
            LinkText linkTextCreateFromParcel;
            String string = parcel.readString();
            HashMap map = null;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                HashMap map2 = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkTextCreateFromParcel = null;
                    } else {
                        linkTextCreateFromParcel = LinkText.CREATOR.createFromParcel(parcel);
                    }
                    map2.put(string2, linkTextCreateFromParcel);
                }
                map = map2;
            }
            return new LinkRichText(string, map);
        }

        @Override // android.os.Parcelable.Creator
        public final LinkRichText[] newArray(int i) {
            return new LinkRichText[i];
        }
    };

    @C09CT("arguments")
    public final HashMap<String, LinkText> arguments;

    @C09CT("template")
    public final String template;

    public LinkRichText() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkRichText)) {
            return false;
        }
        LinkRichText linkRichText = (LinkRichText) obj;
        return Intrinsics.LJFF(this.template, linkRichText.template) && Intrinsics.LJFF(this.arguments, linkRichText.arguments);
    }

    public final int hashCode() {
        String str = this.template;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        HashMap<String, LinkText> map = this.arguments;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkRichText(template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.template);
        HashMap<String, LinkText> map = this.arguments;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, LinkText> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            LinkText value = entry.getValue();
            if (value == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                value.writeToParcel(parcel, i);
            }
        }
    }

    public LinkRichText(String str, HashMap<String, LinkText> map) {
        this.template = str;
        this.arguments = map;
    }
}
