package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C13BV;
import X.C2188811AlT;
import X.C2240251CmF;
import X.C2240301CmK;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ImageStreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MediaStatusComponent;
import java.util.List;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ImageStreamBlockComponent implements BaseComponent<C2240251CmF> {
    public final String displayName;
    public final int height;
    public final MediaStatusComponent status;
    public final String uri;
    public final List<String> url;
    public final int width;
    public static final C2240301CmK Companion = new Object() { // from class: X.1CmK
    };
    public static final Parcelable.Creator<ImageStreamBlockComponent> CREATOR = new Parcelable.Creator<ImageStreamBlockComponent>() { // from class: X.1CmI
        @Override // android.os.Parcelable.Creator
        public final ImageStreamBlockComponent createFromParcel(Parcel parcel) {
            return new ImageStreamBlockComponent(MediaStatusComponent.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageStreamBlockComponent[] newArray(int i) {
            return new ImageStreamBlockComponent[i];
        }
    };
    public static final C01GW<ImageStreamBlockComponent> EMPTY$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(74));

    public ImageStreamBlockComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageStreamBlockComponent)) {
            return false;
        }
        ImageStreamBlockComponent imageStreamBlockComponent = (ImageStreamBlockComponent) obj;
        return this.status == imageStreamBlockComponent.status && this.width == imageStreamBlockComponent.width && this.height == imageStreamBlockComponent.height && Intrinsics.LJFF(this.uri, imageStreamBlockComponent.uri) && Intrinsics.LJFF(this.url, imageStreamBlockComponent.url) && Intrinsics.LJFF(this.displayName, imageStreamBlockComponent.displayName);
    }

    public final int hashCode() {
        return (((((((((this.status.hashCode() * 31) + this.width) * 31) + this.height) * 31) + this.uri.hashCode()) * 31) + this.url.hashCode()) * 31) + this.displayName.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageStreamBlockComponent(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.displayName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.uri);
        parcel.writeStringList(this.url);
        parcel.writeString(this.displayName);
    }

    public ImageStreamBlockComponent(int i) {
        this(MediaStatusComponent.UNKNOWN, 0, 0, "", C13BV.INSTANCE, "");
    }

    public ImageStreamBlockComponent(MediaStatusComponent mediaStatusComponent, int i, int i2, String str, List<String> list, String str2) {
        this.status = mediaStatusComponent;
        this.width = i;
        this.height = i2;
        this.uri = str;
        this.url = list;
        this.displayName = str2;
    }
}
