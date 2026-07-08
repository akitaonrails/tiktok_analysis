package com.ss.android.ugc.aweme.rss.feed.models;

import X.C2188811AlT;
import X.InterfaceC111300bX;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RssFeedParam implements IRouteArg, InterfaceC111300bX {
    public static final Parcelable.Creator<RssFeedParam> CREATOR = new Parcelable.Creator<RssFeedParam>() { // from class: X.0gS1
        @Override // android.os.Parcelable.Creator
        public final RssFeedParam createFromParcel(Parcel parcel) {
            return new RssFeedParam(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RssFeedParam[] newArray(int i) {
            return new RssFeedParam[i];
        }
    };
    public final String enterFrom;
    public final String rssFeedUrl;

    public final RssFeedParam copy(String str, String str2) {
        return new RssFeedParam(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RssFeedParam)) {
            return false;
        }
        RssFeedParam rssFeedParam = (RssFeedParam) obj;
        return Intrinsics.LJFF(this.rssFeedUrl, rssFeedParam.rssFeedUrl) && Intrinsics.LJFF(this.enterFrom, rssFeedParam.enterFrom);
    }

    public int hashCode() {
        return (this.rssFeedUrl.hashCode() * 31) + this.enterFrom.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RssFeedParam(rssFeedUrl=");
        sbLIZ.append(this.rssFeedUrl);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.rssFeedUrl);
        parcel.writeString(this.enterFrom);
    }

    public RssFeedParam() {
        this("", "");
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getRssFeedUrl() {
        return this.rssFeedUrl;
    }

    public static RssFeedParam __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("rss_url")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("rss_url"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("enter_from")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 2;
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return new RssFeedParam(str, str2);
    }

    public RssFeedParam(String str, String str2) {
        this.rssFeedUrl = str;
        this.enterFrom = str2;
    }
}
