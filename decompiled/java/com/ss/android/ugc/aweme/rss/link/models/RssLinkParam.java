package com.ss.android.ugc.aweme.rss.link.models;

import X.C2188811AlT;
import X.InterfaceC111300bX;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RssLinkParam implements IRouteArg, InterfaceC111300bX {
    public static final Parcelable.Creator<RssLinkParam> CREATOR = new Parcelable.Creator<RssLinkParam>() { // from class: X.0v1j
        @Override // android.os.Parcelable.Creator
        public final RssLinkParam createFromParcel(Parcel parcel) {
            return new RssLinkParam(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RssLinkParam[] newArray(int i) {
            return new RssLinkParam[i];
        }
    };
    public final String enterFrom;
    public String rssFeedUrl;

    public final RssLinkParam copy(String str, String str2) {
        return new RssLinkParam(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RssLinkParam)) {
            return false;
        }
        RssLinkParam rssLinkParam = (RssLinkParam) obj;
        return Intrinsics.LJFF(this.rssFeedUrl, rssLinkParam.rssFeedUrl) && Intrinsics.LJFF(this.enterFrom, rssLinkParam.enterFrom);
    }

    public int hashCode() {
        return (this.rssFeedUrl.hashCode() * 31) + this.enterFrom.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RssLinkParam(rssFeedUrl=");
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

    public RssLinkParam() {
        this("", "");
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getRssFeedUrl() {
        return this.rssFeedUrl;
    }

    public static RssLinkParam __fromBundle(Bundle bundle) {
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
        return new RssLinkParam(str, str2);
    }

    public final void setRssFeedUrl(String str) {
        this.rssFeedUrl = str;
    }

    public RssLinkParam(String str, String str2) {
        this.rssFeedUrl = str;
        this.enterFrom = str2;
    }
}
