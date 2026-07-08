package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C684002li;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CountdownUiTypeConfig;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CountdownUiTypeConfig implements Parcelable {

    @C09CT("countdown_text")
    public LinkRichText countdownText;

    @C09CT("countdown_text_ec_richtext")
    public ECRichText countdownTextECRichText;

    @C09CT("countdown_type")
    public int countdownType;

    @C09CT("time_control_second")
    public long timeControlSecond;
    public static final C684002li Companion = new Object() { // from class: X.02li
    };
    public static final Parcelable.Creator<CountdownUiTypeConfig> CREATOR = new Parcelable.Creator<CountdownUiTypeConfig>() { // from class: X.02lh
        @Override // android.os.Parcelable.Creator
        public final CountdownUiTypeConfig createFromParcel(Parcel parcel) {
            LinkRichText linkRichTextCreateFromParcel;
            long j = parcel.readLong();
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            return new CountdownUiTypeConfig(j, i, linkRichTextCreateFromParcel, (ECRichText) parcel.readParcelable(CountdownUiTypeConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CountdownUiTypeConfig[] newArray(int i) {
            return new CountdownUiTypeConfig[i];
        }
    };
    public static final int $stable = 8;

    public CountdownUiTypeConfig() {
        this(0L, 0, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownUiTypeConfig)) {
            return false;
        }
        CountdownUiTypeConfig countdownUiTypeConfig = (CountdownUiTypeConfig) obj;
        return this.timeControlSecond == countdownUiTypeConfig.timeControlSecond && this.countdownType == countdownUiTypeConfig.countdownType && Intrinsics.LJFF(this.countdownText, countdownUiTypeConfig.countdownText) && Intrinsics.LJFF(this.countdownTextECRichText, countdownUiTypeConfig.countdownTextECRichText);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.timeControlSecond) * 31) + this.countdownType) * 31;
        LinkRichText linkRichText = this.countdownText;
        int iHashCode = (iY2 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        ECRichText eCRichText = this.countdownTextECRichText;
        return iHashCode + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownUiTypeConfig(timeControlSecond=");
        sbLIZ.append(this.timeControlSecond);
        sbLIZ.append(", countdownType=");
        sbLIZ.append(this.countdownType);
        sbLIZ.append(", countdownText=");
        sbLIZ.append(this.countdownText);
        sbLIZ.append(", countdownTextECRichText=");
        sbLIZ.append(this.countdownTextECRichText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timeControlSecond);
        parcel.writeInt(this.countdownType);
        LinkRichText linkRichText = this.countdownText;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.countdownTextECRichText, i);
    }

    public CountdownUiTypeConfig(long j, int i, LinkRichText linkRichText, ECRichText eCRichText) {
        this.timeControlSecond = j;
        this.countdownType = i;
        this.countdownText = linkRichText;
        this.countdownTextECRichText = eCRichText;
    }
}
