package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C758602xk;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentAction;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentRichPopup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentAction implements Parcelable {

    @C09CT("richPopup")
    public final ContentRichPopup richPopup;

    @C09CT("type")
    public final Integer type;
    public static final C758602xk Companion = new Object() { // from class: X.02xk
    };
    public static final Parcelable.Creator<ContentAction> CREATOR = new Parcelable.Creator<ContentAction>() { // from class: X.02xj
        @Override // android.os.Parcelable.Creator
        public final ContentAction createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ContentRichPopup contentRichPopupCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                contentRichPopupCreateFromParcel = ContentRichPopup.CREATOR.createFromParcel(parcel);
            }
            return new ContentAction(numValueOf, contentRichPopupCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ContentAction[] newArray(int i) {
            return new ContentAction[i];
        }
    };
    public static final int $stable = 8;

    public ContentAction() {
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
        if (!(obj instanceof ContentAction)) {
            return false;
        }
        ContentAction contentAction = (ContentAction) obj;
        return Intrinsics.LJFF(this.type, contentAction.type) && Intrinsics.LJFF(this.richPopup, contentAction.richPopup);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ContentRichPopup contentRichPopup = this.richPopup;
        return iHashCode + (contentRichPopup != null ? contentRichPopup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentAction(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", richPopup=");
        sbLIZ.append(this.richPopup);
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
        ContentRichPopup contentRichPopup = this.richPopup;
        if (contentRichPopup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentRichPopup.writeToParcel(parcel, i);
        }
    }

    public ContentAction(Integer num, ContentRichPopup contentRichPopup) {
        this.type = num;
        this.richPopup = contentRichPopup;
    }
}
