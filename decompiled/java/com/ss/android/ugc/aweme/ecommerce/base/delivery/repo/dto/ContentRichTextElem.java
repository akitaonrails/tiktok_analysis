package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C696802nm;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopup;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentRichTextElem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentRichTextElem implements Parcelable {

    @C09CT("popup")
    public final ContentPopup popup;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;
    public static final C696802nm Companion = new Object() { // from class: X.02nm
    };
    public static final Parcelable.Creator<ContentRichTextElem> CREATOR = new Parcelable.Creator<ContentRichTextElem>() { // from class: X.02nl
        @Override // android.os.Parcelable.Creator
        public final ContentRichTextElem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ContentPopup contentPopupCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                contentPopupCreateFromParcel = ContentPopup.CREATOR.createFromParcel(parcel);
            }
            return new ContentRichTextElem(numValueOf, string, contentPopupCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ContentRichTextElem[] newArray(int i) {
            return new ContentRichTextElem[i];
        }
    };
    public static final int $stable = 8;

    public ContentRichTextElem() {
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
        if (!(obj instanceof ContentRichTextElem)) {
            return false;
        }
        ContentRichTextElem contentRichTextElem = (ContentRichTextElem) obj;
        return Intrinsics.LJFF(this.type, contentRichTextElem.type) && Intrinsics.LJFF(this.text, contentRichTextElem.text) && Intrinsics.LJFF(this.popup, contentRichTextElem.popup);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ContentPopup contentPopup = this.popup;
        return iHashCode2 + (contentPopup != null ? contentPopup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentRichTextElem(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", popup=");
        sbLIZ.append(this.popup);
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
        parcel.writeString(this.text);
        ContentPopup contentPopup = this.popup;
        if (contentPopup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentPopup.writeToParcel(parcel, i);
        }
    }

    public ContentRichTextElem(Integer num, String str, ContentPopup contentPopup) {
        this.type = num;
        this.text = str;
        this.popup = contentPopup;
    }
}
