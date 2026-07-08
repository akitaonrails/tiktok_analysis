package com.ss.android.ugc.aweme.im.message.template.component;

import X.C2188811AlT;
import X.C2244141CsW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AnchorBusinessTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AnchorInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class AnchorInfoComponent implements BaseComponent<C2244141CsW> {
    public static final Parcelable.Creator<AnchorInfoComponent> CREATOR = new Parcelable.Creator<AnchorInfoComponent>() { // from class: X.1Csf
        @Override // android.os.Parcelable.Creator
        public final AnchorInfoComponent createFromParcel(Parcel parcel) {
            ActionLinkComponent actionLinkComponentCreateFromParcel;
            String string = parcel.readString();
            ImageComponent imageComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                actionLinkComponentCreateFromParcel = null;
            } else {
                actionLinkComponentCreateFromParcel = ActionLinkComponent.CREATOR.createFromParcel(parcel);
            }
            ActionLinkComponent actionLinkComponent = actionLinkComponentCreateFromParcel;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            }
            return new AnchorInfoComponent(string, actionLinkComponent, string2, imageComponentCreateFromParcel, parcel.readString(), AnchorBusinessTypeComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AnchorInfoComponent[] newArray(int i) {
            return new AnchorInfoComponent[i];
        }
    };
    public final String extra;
    public final ImageComponent icon;
    public final String id;
    public final String keyword;
    public final ActionLinkComponent schema;
    public final AnchorBusinessTypeComponent type;

    public AnchorInfoComponent() {
        this(null, null, null, null, null, AnchorBusinessTypeComponent.ANCHOR_UNKNOWN);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorInfoComponent)) {
            return false;
        }
        AnchorInfoComponent anchorInfoComponent = (AnchorInfoComponent) obj;
        return Intrinsics.LJFF(this.keyword, anchorInfoComponent.keyword) && Intrinsics.LJFF(this.schema, anchorInfoComponent.schema) && Intrinsics.LJFF(this.id, anchorInfoComponent.id) && Intrinsics.LJFF(this.icon, anchorInfoComponent.icon) && Intrinsics.LJFF(this.extra, anchorInfoComponent.extra) && this.type == anchorInfoComponent.type;
    }

    public final int hashCode() {
        String str = this.keyword;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ActionLinkComponent actionLinkComponent = this.schema;
        int iHashCode2 = (iHashCode + (actionLinkComponent == null ? 0 : actionLinkComponent.hashCode())) * 31;
        String str2 = this.id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageComponent imageComponent = this.icon;
        int iHashCode4 = (iHashCode3 + (imageComponent == null ? 0 : imageComponent.hashCode())) * 31;
        String str3 = this.extra;
        return ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorInfoComponent(keyword=");
        sbLIZ.append(this.keyword);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.keyword);
        ActionLinkComponent actionLinkComponent = this.schema;
        if (actionLinkComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionLinkComponent.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
        ImageComponent imageComponent = this.icon;
        if (imageComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageComponent.writeToParcel(parcel, i);
        }
        parcel.writeString(this.extra);
        this.type.writeToParcel(parcel, i);
    }

    public AnchorInfoComponent(String str, ActionLinkComponent actionLinkComponent, String str2, ImageComponent imageComponent, String str3, AnchorBusinessTypeComponent anchorBusinessTypeComponent) {
        this.keyword = str;
        this.schema = actionLinkComponent;
        this.id = str2;
        this.icon = imageComponent;
        this.extra = str3;
        this.type = anchorBusinessTypeComponent;
    }
}
