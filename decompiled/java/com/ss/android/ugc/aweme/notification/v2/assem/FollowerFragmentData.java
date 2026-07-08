package com.ss.android.ugc.aweme.notification.v2.assem;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.inbox.followerv2.InboxFollowerFragmentV2;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.v2.assem.FollowerFragmentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowerFragmentData extends PowerViewPagerFragmentItem<InboxFollowerFragmentV2> {
    public final NoticeTabModel tabInfo;
    public static final Parcelable.Creator<FollowerFragmentData> CREATOR = new Parcelable.Creator<FollowerFragmentData>() { // from class: X.0zYk
        @Override // android.os.Parcelable.Creator
        public final FollowerFragmentData createFromParcel(Parcel parcel) {
            NoticeTabModel noticeTabModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                noticeTabModelCreateFromParcel = null;
            } else {
                noticeTabModelCreateFromParcel = NoticeTabModel.CREATOR.createFromParcel(parcel);
            }
            return new FollowerFragmentData(noticeTabModelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FollowerFragmentData[] newArray(int i) {
            return new FollowerFragmentData[i];
        }
    };
    public static final int $stable = 8;

    public FollowerFragmentData() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FollowerFragmentData) && Intrinsics.LJFF(this.tabInfo, ((FollowerFragmentData) obj).tabInfo);
    }

    public final int hashCode() {
        NoticeTabModel noticeTabModel = this.tabInfo;
        if (noticeTabModel == null) {
            return 0;
        }
        return noticeTabModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerFragmentData(tabInfo=");
        sbLIZ.append(this.tabInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        NoticeTabModel noticeTabModel = this.tabInfo;
        if (noticeTabModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            noticeTabModel.writeToParcel(parcel, i);
        }
    }

    public FollowerFragmentData(NoticeTabModel noticeTabModel) {
        this.tabInfo = noticeTabModel;
    }
}
