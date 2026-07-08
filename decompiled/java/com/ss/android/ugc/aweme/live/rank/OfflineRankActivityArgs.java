package com.ss.android.ugc.aweme.live.rank;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.live.rank.OfflineRankActivityArgs;

/* JADX INFO: loaded from: classes28.dex */
public final class OfflineRankActivityArgs implements IRouteArg {
    public final String rankEnterType;
    public final String rankGroupType;
    public final String rankPeriod;
    public final String selectRankType;
    public final String selectSubRankType;
    public final String source;
    public final String type;
    public static final Parcelable.Creator<OfflineRankActivityArgs> CREATOR = new Parcelable.Creator<OfflineRankActivityArgs>() { // from class: X.0xpQ
        @Override // android.os.Parcelable.Creator
        public final OfflineRankActivityArgs createFromParcel(Parcel parcel) {
            return new OfflineRankActivityArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OfflineRankActivityArgs[] newArray(int i) {
            return new OfflineRankActivityArgs[i];
        }
    };
    public static final int $stable = 8;

    public OfflineRankActivityArgs() {
        this(null, "", "", "", "", "", "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.source);
        parcel.writeString(this.rankEnterType);
        parcel.writeString(this.rankGroupType);
        parcel.writeString(this.selectRankType);
        parcel.writeString(this.selectSubRankType);
        parcel.writeString(this.rankPeriod);
    }

    public final String getRankEnterType() {
        return this.rankEnterType;
    }

    public final String getRankGroupType() {
        return this.rankGroupType;
    }

    public final String getRankPeriod() {
        return this.rankPeriod;
    }

    public final String getSelectRankType() {
        return this.selectRankType;
    }

    public final String getSelectSubRankType() {
        return this.selectSubRankType;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getType() {
        return this.type;
    }

    public static OfflineRankActivityArgs __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("type")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("type"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("source")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("source"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("rank_enter_type")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("rank_enter_type"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("rank_group_type")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("rank_group_type"), String.class);
        } else {
            i += 8;
            str4 = null;
        }
        if (bundle.containsKey("select_rank_type")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("select_rank_type"), String.class);
        } else {
            i += 16;
            str5 = null;
        }
        if (bundle.containsKey("select_sub_rank_type")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("select_sub_rank_type"), String.class);
        } else {
            i += 32;
            str6 = null;
        }
        if (bundle.containsKey("rank_period")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("rank_period"), String.class);
        } else {
            i += 64;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        String str8 = "";
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            str6 = "";
        }
        if ((i & 64) == 0) {
            str8 = str7;
        }
        return new OfflineRankActivityArgs(str, str2, str3, str4, str5, str6, str8);
    }

    public OfflineRankActivityArgs(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.type = str;
        this.source = str2;
        this.rankEnterType = str3;
        this.rankGroupType = str4;
        this.selectRankType = str5;
        this.selectSubRankType = str6;
        this.rankPeriod = str7;
    }
}
