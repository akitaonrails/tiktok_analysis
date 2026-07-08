package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C1516540pZE;
import X.C18ZK;
import X.C18ZU;
import X.C2188811AlT;
import X.C2244091CsR;
import X.C2244161CsY;
import X.C2244191Csb;
import X.C2244251Csh;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ImageComponent implements BaseComponent<C2244091CsR> {
    public final String decryptKey;
    public final String displayName;
    public final IconTypeComponent iconType;
    public final String id;
    public final ResolutionComponent resolution;
    public final List<String> urls;
    public static final C18ZU Companion = new C18ZU();
    public static final Parcelable.Creator<ImageComponent> CREATOR = new Parcelable.Creator<ImageComponent>() { // from class: X.19GR
        @Override // android.os.Parcelable.Creator
        public final ImageComponent createFromParcel(Parcel parcel) {
            ResolutionComponent resolutionComponentCreateFromParcel;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                resolutionComponentCreateFromParcel = null;
            } else {
                resolutionComponentCreateFromParcel = ResolutionComponent.CREATOR.createFromParcel(parcel);
            }
            return new ImageComponent(arrayListCreateStringArrayList, string, string2, resolutionComponentCreateFromParcel, parcel.readString(), IconTypeComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ImageComponent[] newArray(int i) {
            return new ImageComponent[i];
        }
    };
    public static final C01GW<ImageComponent> GREY_PLACEHOLDER$delegate = C452501pT.LIZIZ(new C18ZK());

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageComponent)) {
            return false;
        }
        ImageComponent imageComponent = (ImageComponent) obj;
        return Intrinsics.LJFF(this.urls, imageComponent.urls) && Intrinsics.LJFF(this.id, imageComponent.id) && Intrinsics.LJFF(this.displayName, imageComponent.displayName) && Intrinsics.LJFF(this.resolution, imageComponent.resolution) && Intrinsics.LJFF(this.decryptKey, imageComponent.decryptKey) && this.iconType == imageComponent.iconType;
    }

    public final int hashCode() {
        int iHashCode = this.urls.hashCode() * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ResolutionComponent resolutionComponent = this.resolution;
        int iHashCode4 = (iHashCode3 + (resolutionComponent == null ? 0 : resolutionComponent.hashCode())) * 31;
        String str3 = this.decryptKey;
        return ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.iconType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageComponent(urls=");
        sbLIZ.append(this.urls);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.displayName);
        sbLIZ.append(", resolution=");
        sbLIZ.append(this.resolution);
        sbLIZ.append(", decryptKey=");
        sbLIZ.append(this.decryptKey);
        sbLIZ.append(", iconType=");
        sbLIZ.append(this.iconType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.urls);
        parcel.writeString(this.id);
        parcel.writeString(this.displayName);
        ResolutionComponent resolutionComponent = this.resolution;
        if (resolutionComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            resolutionComponent.writeToParcel(parcel, i);
        }
        parcel.writeString(this.decryptKey);
        this.iconType.writeToParcel(parcel, i);
    }

    public final C2244091CsR LIZIZ() {
        C2244161CsY c2244161CsYLIZIZ;
        C2244191Csb c2244191Csb = new C2244191Csb();
        List<String> list = this.urls;
        C1516540pZE.LIZ(list);
        c2244191Csb.LJ = list;
        c2244191Csb.LIZLLL = this.id;
        c2244191Csb.LJFF = this.displayName;
        ResolutionComponent resolutionComponent = this.resolution;
        if (resolutionComponent != null) {
            C2244251Csh c2244251Csh = new C2244251Csh();
            c2244251Csh.LIZLLL = Integer.valueOf(resolutionComponent.width);
            c2244251Csh.LJ = Integer.valueOf(resolutionComponent.height);
            c2244161CsYLIZIZ = c2244251Csh.build();
        } else {
            c2244161CsYLIZIZ = null;
        }
        c2244191Csb.LJI = c2244161CsYLIZIZ;
        c2244191Csb.LJII = this.decryptKey;
        c2244191Csb.LJIIIIZZ = this.iconType.toProto();
        return c2244191Csb.build();
    }

    public static ImageComponent LIZ(ImageComponent imageComponent, List list, IconTypeComponent iconTypeComponent, int i) {
        String str;
        String str2;
        ResolutionComponent resolutionComponent;
        IconTypeComponent iconTypeComponent2 = iconTypeComponent;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = imageComponent.urls;
        }
        String str3 = null;
        if ((i & 2) != 0) {
            str = imageComponent.id;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = imageComponent.displayName;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            resolutionComponent = imageComponent.resolution;
        } else {
            resolutionComponent = null;
        }
        if ((i & 16) != 0) {
            str3 = imageComponent.decryptKey;
        }
        if ((i & 32) != 0) {
            iconTypeComponent2 = imageComponent.iconType;
        }
        imageComponent.getClass();
        return new ImageComponent((List<String>) list2, str, str2, resolutionComponent, str3, iconTypeComponent2);
    }

    public /* synthetic */ ImageComponent(List list, String str, ResolutionComponent resolutionComponent, String str2, IconTypeComponent iconTypeComponent, int i) {
        this((List<String>) list, (i & 2) != 0 ? null : str, (String) null, (i & 8) != 0 ? null : resolutionComponent, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? IconTypeComponent.DEFAULT : iconTypeComponent);
    }

    public ImageComponent(List<String> list, String str, String str2, ResolutionComponent resolutionComponent, String str3, IconTypeComponent iconTypeComponent) {
        this.urls = list;
        this.id = str;
        this.displayName = str2;
        this.resolution = resolutionComponent;
        this.decryptKey = str3;
        this.iconType = iconTypeComponent;
    }
}
