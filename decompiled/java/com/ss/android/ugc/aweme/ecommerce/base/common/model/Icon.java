package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C098200Yq;
import X.C09CT;
import X.C1744700vVE;
import X.C189200o6;
import X.C2188811AlT;
import X.C960203pA;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Icon implements Parcelable, Serializable {
    public static final Parcelable.Creator<Icon> CREATOR = new Parcelable.Creator<Icon>() { // from class: X.02rI
        @Override // android.os.Parcelable.Creator
        public final Icon createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Image image = (Image) parcel.readParcelable(Icon.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(Icon.class.getClassLoader());
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new Icon(image, image2, string, numValueOf, numValueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Icon[] newArray(int i) {
            return new Icon[i];
        }
    };

    @C09CT("da_info")
    public String daInfo;

    @C09CT("icon")
    public Image icon;

    @C09CT("icon_dark")
    public Image iconDark;

    @C09CT("link")
    public String link;

    @C09CT("text")
    public String text;

    @C09CT("text_link")
    public String textLink;

    @C09CT("tux_token")
    public String token;

    @C09CT("view_height")
    public Integer viewHeight;

    @C09CT("view_width")
    public Integer viewWidth;

    public Icon() {
    }

    public final Icon copy(Image image, Image image2, String str, Integer num, Integer num2, String str2, String str3, String str4, String str5) {
        return new Icon(image, image2, str, num, num2, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return Intrinsics.LJFF(this.icon, icon.icon) && Intrinsics.LJFF(this.iconDark, icon.iconDark) && Intrinsics.LJFF(this.link, icon.link) && Intrinsics.LJFF(this.viewWidth, icon.viewWidth) && Intrinsics.LJFF(this.viewHeight, icon.viewHeight) && Intrinsics.LJFF(this.text, icon.text) && Intrinsics.LJFF(this.textLink, icon.textLink) && Intrinsics.LJFF(this.daInfo, icon.daInfo) && Intrinsics.LJFF(this.token, icon.token);
    }

    public int hashCode() {
        Image image = this.icon;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.iconDark;
        int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str = this.link;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.viewWidth;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.viewHeight;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textLink;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.daInfo;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.token;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Icon(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", iconDark=");
        sbLIZ.append(this.iconDark);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", viewWidth=");
        sbLIZ.append(this.viewWidth);
        sbLIZ.append(", viewHeight=");
        sbLIZ.append(this.viewHeight);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", textLink=");
        sbLIZ.append(this.textLink);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", token=");
        sbLIZ.append(this.token);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeParcelable(this.iconDark, i);
        parcel.writeString(this.link);
        Integer num = this.viewWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.viewHeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.text);
        parcel.writeString(this.textLink);
        parcel.writeString(this.daInfo);
        parcel.writeString(this.token);
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final Image getIconDark() {
        return this.iconDark;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextLink() {
        return this.textLink;
    }

    public final String getToken() {
        return this.token;
    }

    public final Integer getViewHeight() {
        return this.viewHeight;
    }

    public final Integer getViewWidth() {
        return this.viewWidth;
    }

    public final Image requireImage(Context context) {
        Image image;
        if (C960203pA.LIZIZ(context)) {
            image = this.iconDark;
        } else {
            image = this.icon;
        }
        if (image == null) {
            return this.icon;
        }
        return image;
    }

    public final Image requireImageForEcDarkMode(Context context) {
        Image image;
        if (C1744700vVE.LJ(context, null)) {
            image = this.iconDark;
        } else {
            image = this.icon;
        }
        if (image == null) {
            return this.icon;
        }
        return image;
    }

    public final void openIconLink(Context context, Map<String, String> map) {
        Unit unit;
        try {
            String str = this.link;
            if (str != null) {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                }
                SmartRouter.buildRoute(context, builderBuildUpon.build().toString()).open();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void openTextLink(Context context, Map<String, String> map) {
        Unit unit;
        try {
            String str = this.textLink;
            if (str != null) {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                }
                SmartRouter.buildRoute(context, builderBuildUpon.build().toString()).open();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public Icon(Image image, Image image2, String str, Integer num, Integer num2, String str2, String str3, String str4, String str5) {
        this.icon = image;
        this.iconDark = image2;
        this.link = str;
        this.viewWidth = num;
        this.viewHeight = num2;
        this.text = str2;
        this.textLink = str3;
        this.daInfo = str4;
        this.token = str5;
    }
}
