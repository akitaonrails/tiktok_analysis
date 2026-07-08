package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopup;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopupButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentPopup implements Parcelable {

    @C09CT("button")
    public ContentPopupButton button;

    @C09CT("contents")
    public List<String> contents;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<ContentPopup> CREATOR = new Parcelable.Creator<ContentPopup>() { // from class: X.02hN
        @Override // android.os.Parcelable.Creator
        public final ContentPopup createFromParcel(Parcel parcel) {
            ContentPopupButton contentPopupButtonCreateFromParcel;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                contentPopupButtonCreateFromParcel = null;
            } else {
                contentPopupButtonCreateFromParcel = ContentPopupButton.CREATOR.createFromParcel(parcel);
            }
            return new ContentPopup(string, arrayListCreateStringArrayList, contentPopupButtonCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ContentPopup[] newArray(int i) {
            return new ContentPopup[i];
        }
    };
    public static final int $stable = 8;

    public ContentPopup() {
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
        if (!(obj instanceof ContentPopup)) {
            return false;
        }
        ContentPopup contentPopup = (ContentPopup) obj;
        return Intrinsics.LJFF(this.title, contentPopup.title) && Intrinsics.LJFF(this.contents, contentPopup.contents) && Intrinsics.LJFF(this.button, contentPopup.button);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.contents;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ContentPopupButton contentPopupButton = this.button;
        return iHashCode2 + (contentPopupButton != null ? contentPopupButton.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentPopup(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", contents=");
        sbLIZ.append(this.contents);
        sbLIZ.append(", button=");
        sbLIZ.append(this.button);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeStringList(this.contents);
        ContentPopupButton contentPopupButton = this.button;
        if (contentPopupButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(contentPopupButton.name);
        }
    }

    public ContentPopup(String str, List<String> list, ContentPopupButton contentPopupButton) {
        this.title = str;
        this.contents = list;
        this.button = contentPopupButton;
    }
}
