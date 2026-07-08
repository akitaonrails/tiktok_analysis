package com.ss.android.ugc.aweme.notification.bean;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class MusNotificationDetailArg implements IRouteArg {
    public final String enterFrom;
    public final int groupType;
    public final boolean mergeTikTokShop;
    public final String nid;
    public final long startClickTime;
    public final String tabName;
    public final String title;
    public final int unReadMessageCount;
    public static final Parcelable.Creator<MusNotificationDetailArg> CREATOR = new Parcelable.Creator<MusNotificationDetailArg>() { // from class: X.0zmB
        @Override // android.os.Parcelable.Creator
        public final MusNotificationDetailArg createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MusNotificationDetailArg(i, i2, string, string2, string3, z, parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusNotificationDetailArg[] newArray(int i) {
            return new MusNotificationDetailArg[i];
        }
    };
    public static final int $stable = 8;

    public MusNotificationDetailArg() {
        this(-1, 0, null, "", null, false, 0L, null);
    }

    public final MusNotificationDetailArg copy(int i, int i2, String str, String str2, String str3, boolean z, long j, String str4) {
        return new MusNotificationDetailArg(i, i2, str, str2, str3, z, j, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusNotificationDetailArg)) {
            return false;
        }
        MusNotificationDetailArg musNotificationDetailArg = (MusNotificationDetailArg) obj;
        return this.groupType == musNotificationDetailArg.groupType && this.unReadMessageCount == musNotificationDetailArg.unReadMessageCount && Intrinsics.LJFF(this.tabName, musNotificationDetailArg.tabName) && Intrinsics.LJFF(this.title, musNotificationDetailArg.title) && Intrinsics.LJFF(this.nid, musNotificationDetailArg.nid) && this.mergeTikTokShop == musNotificationDetailArg.mergeTikTokShop && this.startClickTime == musNotificationDetailArg.startClickTime && Intrinsics.LJFF(this.enterFrom, musNotificationDetailArg.enterFrom);
    }

    public int hashCode() {
        int i = ((this.groupType * 31) + this.unReadMessageCount) * 31;
        String str = this.tabName;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31;
        String str2 = this.nid;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.mergeTikTokShop)) * 31) + C786410Ut5.Y2(this.startClickTime)) * 31;
        String str3 = this.enterFrom;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusNotificationDetailArg(groupType=");
        sbLIZ.append(this.groupType);
        sbLIZ.append(", unReadMessageCount=");
        sbLIZ.append(this.unReadMessageCount);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.tabName);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", nid=");
        sbLIZ.append(this.nid);
        sbLIZ.append(", mergeTikTokShop=");
        sbLIZ.append(this.mergeTikTokShop);
        sbLIZ.append(", startClickTime=");
        sbLIZ.append(this.startClickTime);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.groupType);
        parcel.writeInt(this.unReadMessageCount);
        parcel.writeString(this.tabName);
        parcel.writeString(this.title);
        parcel.writeString(this.nid);
        parcel.writeInt(this.mergeTikTokShop ? 1 : 0);
        parcel.writeLong(this.startClickTime);
        parcel.writeString(this.enterFrom);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final int getGroupType() {
        return this.groupType;
    }

    public final boolean getMergeTikTokShop() {
        return this.mergeTikTokShop;
    }

    public final String getNid() {
        return this.nid;
    }

    public final long getStartClickTime() {
        return this.startClickTime;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUnReadMessageCount() {
        return this.unReadMessageCount;
    }

    public MusNotificationDetailArg(int i) {
        this(i, 0, null, "", null, false, 0L, null);
    }

    public static MusNotificationDetailArg __fromBundle(Bundle bundle) {
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        Boolean bool;
        Long l;
        int iIntValue;
        int iIntValue2;
        long jLongValue;
        String str4 = null;
        if (bundle == null) {
            return null;
        }
        int i = 1;
        boolean zBooleanValue = false;
        if (bundle.containsKey("from_where")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("from_where"), Integer.class);
            if (num != null) {
                i = 0;
            }
        } else {
            num = null;
        }
        if (bundle.containsKey("unRead_message_count")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("unRead_message_count"), Integer.class);
            if (num2 == null) {
                i += 2;
            }
        } else {
            i += 2;
            num2 = null;
        }
        if (bundle.containsKey("second_tab_name")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("second_tab_name"), String.class);
        } else {
            i += 4;
            str = null;
        }
        if (bundle.containsKey("title")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("title"), String.class);
        } else {
            i += 8;
            str2 = null;
        }
        if (bundle.containsKey("nid")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("nid"), String.class);
        } else {
            i += 16;
            str3 = null;
        }
        if (bundle.containsKey("ec_merged_tiktok_shop")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("ec_merged_tiktok_shop"), Boolean.class);
            if (bool == null) {
                i += 32;
            }
        } else {
            i += 32;
            bool = null;
        }
        if (bundle.containsKey("start_click_time")) {
            l = (Long) RouteParser.INSTANCE.parse(bundle.get("start_click_time"), Long.class);
            if (l == null) {
                i += 64;
            }
        } else {
            i += 64;
            l = null;
        }
        if (bundle.containsKey("enter_from")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 128;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        String str5 = null;
        if ((i & 1) != 0) {
            iIntValue = -1;
        }
        boolean z = false;
        if ((i & 2) != 0) {
            iIntValue2 = 0;
        }
        String str6 = null;
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        if ((i & 16) == 0) {
            str5 = str3;
        }
        if ((i & 32) == 0) {
            z = zBooleanValue;
        }
        if ((i & 64) != 0) {
            jLongValue = 0;
        }
        if ((i & 128) == 0) {
            str6 = str4;
        }
        return new MusNotificationDetailArg(iIntValue, iIntValue2, str, str2, str5, z, jLongValue, str6);
    }

    public MusNotificationDetailArg(int i, int i2) {
        this(i, i2, null, "", null, false, 0L, null);
    }

    public MusNotificationDetailArg(int i, int i2, String str) {
        this(i, i2, str, "", null, false, 0L, null);
    }

    public MusNotificationDetailArg(int i, int i2, String str, String str2) {
        this(i, i2, str, str2, null, false, 0L, null);
    }

    public MusNotificationDetailArg(int i, int i2, String str, String str2, String str3) {
        this(i, i2, str, str2, str3, false, 0L, null);
    }

    public MusNotificationDetailArg(int i, int i2, String str, String str2, String str3, boolean z) {
        this(i, i2, str, str2, str3, z, 0L, null);
    }

    public MusNotificationDetailArg(int i, int i2, String str, String str2, String str3, boolean z, long j) {
        this(i, i2, str, str2, str3, z, j, null);
    }

    public MusNotificationDetailArg(int i, int i2, String str, String str2, String str3, boolean z, long j, String str4) {
        this.groupType = i;
        this.unReadMessageCount = i2;
        this.tabName = str;
        this.title = str2;
        this.nid = str3;
        this.mergeTikTokShop = z;
        this.startClickTime = j;
        this.enterFrom = str4;
    }
}
