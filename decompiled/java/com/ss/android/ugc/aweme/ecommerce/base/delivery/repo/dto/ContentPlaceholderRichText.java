package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentAction;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPlaceholderRichText;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentRichTextElem;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentPlaceholderRichText implements Parcelable {

    @C09CT("action")
    public final ContentAction action;

    @C09CT("arguments")
    public final HashMap<String, ContentRichTextElem> arguments;

    @C09CT("template")
    public final String template;
    public static final Parcelable.Creator<ContentPlaceholderRichText> CREATOR = new Parcelable.Creator<ContentPlaceholderRichText>() { // from class: X.02xh
        @Override // android.os.Parcelable.Creator
        public final ContentPlaceholderRichText createFromParcel(Parcel parcel) {
            HashMap map;
            String string = parcel.readString();
            ContentAction contentActionCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                map = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map.put(parcel.readString(), ContentRichTextElem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                contentActionCreateFromParcel = ContentAction.CREATOR.createFromParcel(parcel);
            }
            return new ContentPlaceholderRichText(string, map, contentActionCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ContentPlaceholderRichText[] newArray(int i) {
            return new ContentPlaceholderRichText[i];
        }
    };
    public static final int $stable = 8;

    public ContentPlaceholderRichText() {
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
        if (!(obj instanceof ContentPlaceholderRichText)) {
            return false;
        }
        ContentPlaceholderRichText contentPlaceholderRichText = (ContentPlaceholderRichText) obj;
        return Intrinsics.LJFF(this.template, contentPlaceholderRichText.template) && Intrinsics.LJFF(this.arguments, contentPlaceholderRichText.arguments) && Intrinsics.LJFF(this.action, contentPlaceholderRichText.action);
    }

    public final int hashCode() {
        String str = this.template;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        HashMap<String, ContentRichTextElem> map = this.arguments;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        ContentAction contentAction = this.action;
        return iHashCode2 + (contentAction != null ? contentAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentPlaceholderRichText(template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.template);
        HashMap<String, ContentRichTextElem> map = this.arguments;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, ContentRichTextElem> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        ContentAction contentAction = this.action;
        if (contentAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentAction.writeToParcel(parcel, i);
        }
    }

    public ContentPlaceholderRichText(String str, HashMap<String, ContentRichTextElem> map, ContentAction contentAction) {
        this.template = str;
        this.arguments = map;
        this.action = contentAction;
    }
}
