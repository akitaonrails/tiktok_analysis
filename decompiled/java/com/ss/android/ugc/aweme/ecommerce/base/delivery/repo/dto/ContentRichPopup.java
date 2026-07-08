package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPlaceholderRichText;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopupButton;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentRichPopup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentRichPopup implements Parcelable {

    @C09CT("buttons")
    public final ArrayList<ContentPopupButton> buttons;

    @C09CT("contents")
    public final List<ContentPlaceholderRichText> contents;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<ContentRichPopup> CREATOR = new Parcelable.Creator<ContentRichPopup>() { // from class: X.02xi
        @Override // android.os.Parcelable.Creator
        public final ContentRichPopup createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ContentPlaceholderRichText.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ContentPopupButton.CREATOR.createFromParcel(parcel));
                }
            }
            return new ContentRichPopup(string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ContentRichPopup[] newArray(int i) {
            return new ContentRichPopup[i];
        }
    };
    public static final int $stable = 8;

    public ContentRichPopup() {
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
        if (!(obj instanceof ContentRichPopup)) {
            return false;
        }
        ContentRichPopup contentRichPopup = (ContentRichPopup) obj;
        return Intrinsics.LJFF(this.title, contentRichPopup.title) && Intrinsics.LJFF(this.contents, contentRichPopup.contents) && Intrinsics.LJFF(this.buttons, contentRichPopup.buttons);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ContentPlaceholderRichText> list = this.contents;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ArrayList<ContentPopupButton> arrayList = this.buttons;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentRichPopup(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", contents=");
        sbLIZ.append(this.contents);
        sbLIZ.append(", buttons=");
        sbLIZ.append(this.buttons);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<ContentPlaceholderRichText> list = this.contents;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ContentPlaceholderRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<ContentPopupButton> arrayList = this.buttons;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<ContentPopupButton> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            parcel.writeString(it3.next().name);
        }
    }

    public ContentRichPopup(String str, List<ContentPlaceholderRichText> list, ArrayList<ContentPopupButton> arrayList) {
        this.title = str;
        this.contents = list;
        this.buttons = arrayList;
    }
}
