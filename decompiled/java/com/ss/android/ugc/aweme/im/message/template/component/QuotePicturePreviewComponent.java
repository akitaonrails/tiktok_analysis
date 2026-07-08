package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C18ZU;
import X.C2188811AlT;
import X.C2243901Cs8;
import X.C2244041CsM;
import X.C2244301Csm;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewIconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TTLComponent;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class QuotePicturePreviewComponent implements BaseComponent<C2243901Cs8> {
    public final IconTypeComponent fallbackIcon;
    public final ActionLinkComponent linkInfo;
    public final ImageComponent previewImage;
    public final PreviewIconTypeComponent quotePreviewIcon;
    public final String resourceId;
    public final Long senderUid;
    public final TTLComponent ttl;
    public static final C2244041CsM Companion = new Object() { // from class: X.1CsM
    };
    public static final Parcelable.Creator<QuotePicturePreviewComponent> CREATOR = new Parcelable.Creator<QuotePicturePreviewComponent>() { // from class: X.1CsE
        @Override // android.os.Parcelable.Creator
        public final QuotePicturePreviewComponent createFromParcel(Parcel parcel) {
            Long lValueOf;
            ImageComponent imageComponentCreateFromParcel;
            IconTypeComponent iconTypeComponentCreateFromParcel;
            PreviewIconTypeComponent previewIconTypeComponentCreateFromParcel;
            ActionLinkComponent actionLinkComponentCreateFromParcel;
            String string = parcel.readString();
            TTLComponent tTLComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                imageComponentCreateFromParcel = null;
            } else {
                imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            }
            ImageComponent imageComponent = imageComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                iconTypeComponentCreateFromParcel = null;
            } else {
                iconTypeComponentCreateFromParcel = IconTypeComponent.CREATOR.createFromParcel(parcel);
            }
            IconTypeComponent iconTypeComponent = iconTypeComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                previewIconTypeComponentCreateFromParcel = null;
            } else {
                previewIconTypeComponentCreateFromParcel = PreviewIconTypeComponent.CREATOR.createFromParcel(parcel);
            }
            PreviewIconTypeComponent previewIconTypeComponent = previewIconTypeComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                actionLinkComponentCreateFromParcel = null;
            } else {
                actionLinkComponentCreateFromParcel = ActionLinkComponent.CREATOR.createFromParcel(parcel);
            }
            ActionLinkComponent actionLinkComponent = actionLinkComponentCreateFromParcel;
            if (parcel.readInt() != 0) {
                tTLComponentCreateFromParcel = TTLComponent.CREATOR.createFromParcel(parcel);
            }
            return new QuotePicturePreviewComponent(string, lValueOf, imageComponent, iconTypeComponent, previewIconTypeComponent, actionLinkComponent, tTLComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final QuotePicturePreviewComponent[] newArray(int i) {
            return new QuotePicturePreviewComponent[i];
        }
    };
    public static final C01GW<QuotePicturePreviewComponent> EMPTY_PICTURE_PREVIEW$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(76));

    /* JADX WARN: Multi-variable type inference failed */
    public QuotePicturePreviewComponent() {
        this((String) null, (Long) (0 == true ? 1 : 0), (ImageComponent) (0 == true ? 1 : 0), (IconTypeComponent) (0 == true ? 1 : 0), (PreviewIconTypeComponent) (0 == true ? 1 : 0), (TTLComponent) (0 == true ? 1 : 0), 127);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuotePicturePreviewComponent)) {
            return false;
        }
        QuotePicturePreviewComponent quotePicturePreviewComponent = (QuotePicturePreviewComponent) obj;
        return Intrinsics.LJFF(this.resourceId, quotePicturePreviewComponent.resourceId) && Intrinsics.LJFF(this.senderUid, quotePicturePreviewComponent.senderUid) && Intrinsics.LJFF(this.previewImage, quotePicturePreviewComponent.previewImage) && this.fallbackIcon == quotePicturePreviewComponent.fallbackIcon && this.quotePreviewIcon == quotePicturePreviewComponent.quotePreviewIcon && Intrinsics.LJFF(this.linkInfo, quotePicturePreviewComponent.linkInfo) && Intrinsics.LJFF(this.ttl, quotePicturePreviewComponent.ttl);
    }

    public final int hashCode() {
        String str = this.resourceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.senderUid;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        ImageComponent imageComponent = this.previewImage;
        int iHashCode3 = (iHashCode2 + (imageComponent == null ? 0 : imageComponent.hashCode())) * 31;
        IconTypeComponent iconTypeComponent = this.fallbackIcon;
        int iHashCode4 = (iHashCode3 + (iconTypeComponent == null ? 0 : iconTypeComponent.hashCode())) * 31;
        PreviewIconTypeComponent previewIconTypeComponent = this.quotePreviewIcon;
        int iHashCode5 = (iHashCode4 + (previewIconTypeComponent == null ? 0 : previewIconTypeComponent.hashCode())) * 31;
        ActionLinkComponent actionLinkComponent = this.linkInfo;
        int iHashCode6 = (iHashCode5 + (actionLinkComponent == null ? 0 : actionLinkComponent.hashCode())) * 31;
        TTLComponent tTLComponent = this.ttl;
        return iHashCode6 + (tTLComponent != null ? tTLComponent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotePicturePreviewComponent(resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", senderUid=");
        sbLIZ.append(this.senderUid);
        sbLIZ.append(", previewImage=");
        sbLIZ.append(this.previewImage);
        sbLIZ.append(", fallbackIcon=");
        sbLIZ.append(this.fallbackIcon);
        sbLIZ.append(", quotePreviewIcon=");
        sbLIZ.append(this.quotePreviewIcon);
        sbLIZ.append(", linkInfo=");
        sbLIZ.append(this.linkInfo);
        sbLIZ.append(", ttl=");
        sbLIZ.append(this.ttl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resourceId);
        Long l = this.senderUid;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        ImageComponent imageComponent = this.previewImage;
        if (imageComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageComponent.writeToParcel(parcel, i);
        }
        IconTypeComponent iconTypeComponent = this.fallbackIcon;
        if (iconTypeComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconTypeComponent.writeToParcel(parcel, i);
        }
        PreviewIconTypeComponent previewIconTypeComponent = this.quotePreviewIcon;
        if (previewIconTypeComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            previewIconTypeComponent.writeToParcel(parcel, i);
        }
        ActionLinkComponent actionLinkComponent = this.linkInfo;
        if (actionLinkComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionLinkComponent.writeToParcel(parcel, i);
        }
        TTLComponent tTLComponent = this.ttl;
        if (tTLComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(tTLComponent.expiredAt);
        }
    }

    public static QuotePicturePreviewComponent LIZ(QuotePicturePreviewComponent quotePicturePreviewComponent, ImageComponent imageComponent, IconTypeComponent iconTypeComponent) {
        return new QuotePicturePreviewComponent(quotePicturePreviewComponent.resourceId, quotePicturePreviewComponent.senderUid, imageComponent, iconTypeComponent, quotePicturePreviewComponent.quotePreviewIcon, quotePicturePreviewComponent.linkInfo, quotePicturePreviewComponent.ttl);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QuotePicturePreviewComponent(String str, Long l, ImageComponent imageComponent, IconTypeComponent iconTypeComponent, PreviewIconTypeComponent previewIconTypeComponent, TTLComponent tTLComponent, int i) {
        TTLComponent tTLComponent2 = tTLComponent;
        IconTypeComponent iconTypeComponent2 = iconTypeComponent;
        ImageComponent imageComponentLIZ = imageComponent;
        Long l2 = l;
        PreviewIconTypeComponent previewIconTypeComponent2 = previewIconTypeComponent;
        ActionLinkComponent actionLinkComponentLIZ = null;
        String str2 = (i & 1) != 0 ? null : str;
        l2 = (i & 2) != 0 ? null : l2;
        if ((i & 4) != 0) {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        }
        iconTypeComponent2 = (i & 8) != 0 ? IconTypeComponent.DEFAULT : iconTypeComponent2;
        previewIconTypeComponent2 = (i & 16) != 0 ? PreviewIconTypeComponent.NOICON : previewIconTypeComponent2;
        if ((i & 32) != 0) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        this(str2, l2, imageComponentLIZ, iconTypeComponent2, previewIconTypeComponent2, actionLinkComponentLIZ, (i & 64) != 0 ? new TTLComponent(0) : tTLComponent2);
    }

    public QuotePicturePreviewComponent(String str, Long l, ImageComponent imageComponent, IconTypeComponent iconTypeComponent, PreviewIconTypeComponent previewIconTypeComponent, ActionLinkComponent actionLinkComponent, TTLComponent tTLComponent) {
        this.resourceId = str;
        this.senderUid = l;
        this.previewImage = imageComponent;
        this.fallbackIcon = iconTypeComponent;
        this.quotePreviewIcon = previewIconTypeComponent;
        this.linkInfo = actionLinkComponent;
        this.ttl = tTLComponent;
    }
}
