package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18ZU;
import X.C2188811AlT;
import X.C2242201CpO;
import X.C2243491CrT;
import X.C2244301Csm;
import X.C911330Zp5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class PictureCardFallbackInfoComponent implements BaseComponent<C2242201CpO> {
    public final ImageComponent image;
    public final ActionLinkComponent linkInfo;
    public final TextComponent text;
    public static final C911330Zp5 Companion = new Object() { // from class: X.0Zp5
    };
    public static final Parcelable.Creator<PictureCardFallbackInfoComponent> CREATOR = new Parcelable.Creator<PictureCardFallbackInfoComponent>() { // from class: X.1CpL
        @Override // android.os.Parcelable.Creator
        public final PictureCardFallbackInfoComponent createFromParcel(Parcel parcel) {
            return new PictureCardFallbackInfoComponent(ActionLinkComponent.CREATOR.createFromParcel(parcel), ImageComponent.CREATOR.createFromParcel(parcel), TextComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PictureCardFallbackInfoComponent[] newArray(int i) {
            return new PictureCardFallbackInfoComponent[i];
        }
    };
    public static final PictureCardFallbackInfoComponent EMPTY_FALLBACK = new PictureCardFallbackInfoComponent(0);

    public PictureCardFallbackInfoComponent() {
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
        if (!(obj instanceof PictureCardFallbackInfoComponent)) {
            return false;
        }
        PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent = (PictureCardFallbackInfoComponent) obj;
        return Intrinsics.LJFF(this.image, pictureCardFallbackInfoComponent.image) && Intrinsics.LJFF(this.text, pictureCardFallbackInfoComponent.text) && Intrinsics.LJFF(this.linkInfo, pictureCardFallbackInfoComponent.linkInfo);
    }

    public final int hashCode() {
        return (((this.image.hashCode() * 31) + this.text.hashCode()) * 31) + this.linkInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PictureCardFallbackInfoComponent(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", linkInfo=");
        sbLIZ.append(this.linkInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.image.writeToParcel(parcel, i);
        this.text.writeToParcel(parcel, i);
        this.linkInfo.writeToParcel(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PictureCardFallbackInfoComponent(int i) {
        ImageComponent.Companion.getClass();
        ImageComponent imageComponentLIZ = C18ZU.LIZ();
        TextComponent.Companion.getClass();
        TextComponent textComponentLIZ = C2243491CrT.LIZ();
        ActionLinkComponent.Companion.getClass();
        this(C2244301Csm.LIZ(), imageComponentLIZ, textComponentLIZ);
    }

    public PictureCardFallbackInfoComponent(ActionLinkComponent actionLinkComponent, ImageComponent imageComponent, TextComponent textComponent) {
        this.image = imageComponent;
        this.text = textComponent;
        this.linkInfo = actionLinkComponent;
    }
}
