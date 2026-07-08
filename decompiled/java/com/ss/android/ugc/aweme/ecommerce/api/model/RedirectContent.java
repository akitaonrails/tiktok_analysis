package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.RedirectContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RedirectContent implements Parcelable {
    public static final Parcelable.Creator<RedirectContent> CREATOR = new Parcelable.Creator<RedirectContent>() { // from class: X.02kd
        @Override // android.os.Parcelable.Creator
        public final RedirectContent createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new RedirectContent(string, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RedirectContent[] newArray(int i) {
            return new RedirectContent[i];
        }
    };

    @C09CT("close_page")
    public Boolean closePage;

    @C09CT("jump_schema")
    public String jumpSchema;

    public RedirectContent() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedirectContent)) {
            return false;
        }
        RedirectContent redirectContent = (RedirectContent) obj;
        return Intrinsics.LJFF(this.jumpSchema, redirectContent.jumpSchema) && Intrinsics.LJFF(this.closePage, redirectContent.closePage);
    }

    public final int hashCode() {
        String str = this.jumpSchema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.closePage;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RedirectContent(jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(", closePage=");
        sbLIZ.append(this.closePage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.jumpSchema);
        Boolean bool = this.closePage;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public RedirectContent(String str, Boolean bool) {
        this.jumpSchema = str;
        this.closePage = bool;
    }
}
