package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C1405940mgq;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NoticeMessageUiConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class NoticeMessageUiConfig implements Parcelable {

    @C09CT("lead_icon_alignment")
    public final Integer leadIconAlignment;

    @C09CT("leading_content_margin")
    public final Integer leadingContentMargin;

    @C09CT("show_trailing_icon")
    public final Boolean showTailingIcon;

    @C09CT("trailing_content_margin")
    public final Integer tailingContentMargin;

    @C09CT("text_alignment")
    public final Integer textAlignment;
    public static final C1405940mgq Companion = new Object() { // from class: X.0mgq
    };
    public static final Parcelable.Creator<NoticeMessageUiConfig> CREATOR = new Parcelable.Creator<NoticeMessageUiConfig>() { // from class: X.0mgp
        @Override // android.os.Parcelable.Creator
        public final NoticeMessageUiConfig createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            boolean z;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new NoticeMessageUiConfig(numValueOf, numValueOf2, numValueOf3, numValueOf4, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final NoticeMessageUiConfig[] newArray(int i) {
            return new NoticeMessageUiConfig[i];
        }
    };
    public static final int $stable = 8;

    public NoticeMessageUiConfig() {
        this(null, null, null, null, Boolean.TRUE);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeMessageUiConfig)) {
            return false;
        }
        NoticeMessageUiConfig noticeMessageUiConfig = (NoticeMessageUiConfig) obj;
        return Intrinsics.LJFF(this.leadIconAlignment, noticeMessageUiConfig.leadIconAlignment) && Intrinsics.LJFF(this.textAlignment, noticeMessageUiConfig.textAlignment) && Intrinsics.LJFF(this.leadingContentMargin, noticeMessageUiConfig.leadingContentMargin) && Intrinsics.LJFF(this.tailingContentMargin, noticeMessageUiConfig.tailingContentMargin) && Intrinsics.LJFF(this.showTailingIcon, noticeMessageUiConfig.showTailingIcon);
    }

    public final int hashCode() {
        Integer num = this.leadIconAlignment;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.textAlignment;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.leadingContentMargin;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.tailingContentMargin;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.showTailingIcon;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeMessageUiConfig(leadIconAlignment=");
        sbLIZ.append(this.leadIconAlignment);
        sbLIZ.append(", textAlignment=");
        sbLIZ.append(this.textAlignment);
        sbLIZ.append(", leadingContentMargin=");
        sbLIZ.append(this.leadingContentMargin);
        sbLIZ.append(", tailingContentMargin=");
        sbLIZ.append(this.tailingContentMargin);
        sbLIZ.append(", showTailingIcon=");
        sbLIZ.append(this.showTailingIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.leadIconAlignment;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.textAlignment;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.leadingContentMargin;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.tailingContentMargin;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Boolean bool = this.showTailingIcon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public NoticeMessageUiConfig(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool) {
        this.leadIconAlignment = num;
        this.textAlignment = num2;
        this.leadingContentMargin = num3;
        this.tailingContentMargin = num4;
        this.showTailingIcon = bool;
    }
}
