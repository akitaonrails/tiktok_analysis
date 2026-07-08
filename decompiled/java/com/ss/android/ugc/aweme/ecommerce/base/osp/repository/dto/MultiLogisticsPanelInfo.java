package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MultiLogisticsPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiLogisticsPanelInfo implements Parcelable {

    @C09CT("transit_time_disclaimer_notice")
    public LogisticLinkRichText transitTimeDisclaimerNotice;
    public static final Parcelable.Creator<MultiLogisticsPanelInfo> CREATOR = new Parcelable.Creator<MultiLogisticsPanelInfo>() { // from class: X.02pW
        @Override // android.os.Parcelable.Creator
        public final MultiLogisticsPanelInfo createFromParcel(Parcel parcel) {
            LogisticLinkRichText logisticLinkRichTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                logisticLinkRichTextCreateFromParcel = null;
            } else {
                logisticLinkRichTextCreateFromParcel = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
            }
            return new MultiLogisticsPanelInfo(logisticLinkRichTextCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MultiLogisticsPanelInfo[] newArray(int i) {
            return new MultiLogisticsPanelInfo[i];
        }
    };
    public static final int $stable = 8;

    public MultiLogisticsPanelInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiLogisticsPanelInfo) && Intrinsics.LJFF(this.transitTimeDisclaimerNotice, ((MultiLogisticsPanelInfo) obj).transitTimeDisclaimerNotice);
    }

    public final int hashCode() {
        LogisticLinkRichText logisticLinkRichText = this.transitTimeDisclaimerNotice;
        if (logisticLinkRichText == null) {
            return 0;
        }
        return logisticLinkRichText.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiLogisticsPanelInfo(transitTimeDisclaimerNotice=");
        sbLIZ.append(this.transitTimeDisclaimerNotice);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LogisticLinkRichText logisticLinkRichText = this.transitTimeDisclaimerNotice;
        if (logisticLinkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticLinkRichText.writeToParcel(parcel, i);
        }
    }

    public MultiLogisticsPanelInfo(LogisticLinkRichText logisticLinkRichText) {
        this.transitTimeDisclaimerNotice = logisticLinkRichText;
    }
}
