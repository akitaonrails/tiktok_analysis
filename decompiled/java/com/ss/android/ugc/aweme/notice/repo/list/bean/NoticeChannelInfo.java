package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C1246510iXh;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class NoticeChannelInfo implements Parcelable {

    @C09CT("group")
    public int group;

    @C09CT("has_read")
    public boolean hasRead;

    @C09CT("last_notice_create_time")
    public long lastNoticeCreateTime;

    @C09CT("image_url")
    public UrlModel logo;

    @C09CT("image_url_dark")
    public UrlModel logoDark;

    @C09CT("need_top")
    public boolean needTop;
    public static final C1246510iXh Companion = new Object() { // from class: X.0iXh
    };
    public static final Parcelable.Creator<NoticeChannelInfo> CREATOR = new Parcelable.Creator<NoticeChannelInfo>() { // from class: X.0iXg
        @Override // android.os.Parcelable.Creator
        public final NoticeChannelInfo createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new NoticeChannelInfo();
        }

        @Override // android.os.Parcelable.Creator
        public final NoticeChannelInfo[] newArray(int i) {
            return new NoticeChannelInfo[i];
        }
    };

    @C09CT("name")
    public String name = "";

    @C09CT("account_type")
    public String accountType = "";

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final int hashCode() {
        int iHashCode = this.group + this.name.hashCode();
        UrlModel urlModel = this.logo;
        return iHashCode + (urlModel != null ? urlModel.hashCode() : 0) + C786410Ut5.Z2(this.hasRead) + C786410Ut5.Z2(this.needTop) + C786410Ut5.Y2(this.lastNoticeCreateTime) + this.accountType.hashCode();
    }

    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof NoticeChannelInfo)) {
            NoticeChannelInfo noticeChannelInfo = (NoticeChannelInfo) obj;
            if (this.group == noticeChannelInfo.group && Intrinsics.LJFF(this.name, noticeChannelInfo.name) && Intrinsics.LJFF(this.logo, noticeChannelInfo.logo) && this.hasRead == noticeChannelInfo.hasRead && this.needTop == noticeChannelInfo.needTop && this.lastNoticeCreateTime == noticeChannelInfo.lastNoticeCreateTime && Intrinsics.LJFF(this.accountType, noticeChannelInfo.accountType)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
