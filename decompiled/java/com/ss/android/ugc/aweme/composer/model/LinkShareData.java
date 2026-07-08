package com.ss.android.ugc.aweme.composer.model;

import X.C09CT;
import X.C1402840mbq;
import X.C2188811AlT;
import X.EnumC567790MOr;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.model.LinkShareData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class LinkShareData implements Parcelable, Serializable {
    public static final Parcelable.Creator<LinkShareData> CREATOR = new Parcelable.Creator<LinkShareData>() { // from class: X.0MOq
        @Override // android.os.Parcelable.Creator
        public final LinkShareData createFromParcel(Parcel parcel) {
            LinkShareData.BackgroundColor backgroundColorCreateFromParcel;
            EnumC567790MOr enumC567790MOrValueOf = EnumC567790MOr.valueOf(parcel.readString());
            C1402840mbq c1402840mbq = (C1402840mbq) parcel.readSerializable();
            float f = parcel.readFloat();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                backgroundColorCreateFromParcel = null;
            } else {
                backgroundColorCreateFromParcel = LinkShareData.BackgroundColor.CREATOR.createFromParcel(parcel);
            }
            return new LinkShareData(enumC567790MOrValueOf, c1402840mbq, f, string, backgroundColorCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LinkShareData[] newArray(int i) {
            return new LinkShareData[i];
        }
    };

    @C09CT("backgroundColor")
    public final BackgroundColor backgroundColor;

    @C09CT("backgroundImagePath")
    public final String backgroundImagePath;

    @C09CT("coverImageScale")
    public final float coverImageScale;

    @C09CT("editType")
    public final EnumC567790MOr editType;

    @C09CT("shareContext")
    public final C1402840mbq shareContext;

    public LinkShareData() {
        this(EnumC567790MOr.PHOTO, new C1402840mbq(new Bundle()), 1.0f, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.editType.name());
        parcel.writeSerializable(this.shareContext);
        parcel.writeFloat(this.coverImageScale);
        parcel.writeString(this.backgroundImagePath);
        BackgroundColor backgroundColor = this.backgroundColor;
        if (backgroundColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            backgroundColor.writeToParcel(parcel, i);
        }
    }

    public static final class BackgroundColor implements Parcelable, Serializable {
        public static final Parcelable.Creator<BackgroundColor> CREATOR = new Parcelable.Creator<BackgroundColor>() { // from class: X.0MOs
            @Override // android.os.Parcelable.Creator
            public final LinkShareData.BackgroundColor createFromParcel(Parcel parcel) {
                return new LinkShareData.BackgroundColor(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LinkShareData.BackgroundColor[] newArray(int i) {
                return new LinkShareData.BackgroundColor[i];
            }
        };

        @C09CT("bottomColorHex")
        public final String bottomColorHex;

        @C09CT("topColorHex")
        public final String topColorHex;

        public final BackgroundColor copy(String str, String str2) {
            return new BackgroundColor(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BackgroundColor)) {
                return false;
            }
            BackgroundColor backgroundColor = (BackgroundColor) obj;
            return Intrinsics.LJFF(this.topColorHex, backgroundColor.topColorHex) && Intrinsics.LJFF(this.bottomColorHex, backgroundColor.bottomColorHex);
        }

        public int hashCode() {
            String str = this.topColorHex;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bottomColorHex;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BackgroundColor(topColorHex=");
            sbLIZ.append(this.topColorHex);
            sbLIZ.append(", bottomColorHex=");
            sbLIZ.append(this.bottomColorHex);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.topColorHex);
            parcel.writeString(this.bottomColorHex);
        }

        public final String getBottomColorHex() {
            return this.bottomColorHex;
        }

        public final String getTopColorHex() {
            return this.topColorHex;
        }

        public BackgroundColor(String str, String str2) {
            this.topColorHex = str;
            this.bottomColorHex = str2;
        }
    }

    public final BackgroundColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImagePath() {
        return this.backgroundImagePath;
    }

    public final float getCoverImageScale() {
        return this.coverImageScale;
    }

    public final EnumC567790MOr getEditType() {
        return this.editType;
    }

    public final C1402840mbq getShareContext() {
        return this.shareContext;
    }

    public LinkShareData(EnumC567790MOr enumC567790MOr, C1402840mbq c1402840mbq, float f, String str, BackgroundColor backgroundColor) {
        this.editType = enumC567790MOr;
        this.shareContext = c1402840mbq;
        this.coverImageScale = f;
        this.backgroundImagePath = str;
        this.backgroundColor = backgroundColor;
    }
}
