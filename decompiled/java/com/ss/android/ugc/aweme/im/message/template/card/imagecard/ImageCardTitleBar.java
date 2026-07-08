package com.ss.android.ugc.aweme.im.message.template.card.imagecard;

import X.C01GW;
import X.C18ZU;
import X.C2188811AlT;
import X.C2243061Cqm;
import X.C2243151Cqv;
import X.C2243491CrT;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ImageCardTitleBar implements BaseComponent<C2243061Cqm> {
    public final ImageComponent leftImage;
    public final ButtonComponent rightButton;
    public final TextComponent subtitle;
    public final TextComponent title;
    public static final C2243151Cqv Companion = new Object() { // from class: X.1Cqv
    };
    public static final Parcelable.Creator<ImageCardTitleBar> CREATOR = new Parcelable.Creator<ImageCardTitleBar>() { // from class: X.1Cqt
        @Override // android.os.Parcelable.Creator
        public final ImageCardTitleBar createFromParcel(Parcel parcel) {
            ButtonComponent buttonComponentCreateFromParcel;
            ImageComponent imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<TextComponent> creator = TextComponent.CREATOR;
            TextComponent textComponentCreateFromParcel = creator.createFromParcel(parcel);
            TextComponent textComponentCreateFromParcel2 = creator.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                buttonComponentCreateFromParcel = null;
            } else {
                buttonComponentCreateFromParcel = ButtonComponent.CREATOR.createFromParcel(parcel);
            }
            return new ImageCardTitleBar(imageComponentCreateFromParcel, textComponentCreateFromParcel, textComponentCreateFromParcel2, buttonComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageCardTitleBar[] newArray(int i) {
            return new ImageCardTitleBar[i];
        }
    };
    public static final C01GW<ImageCardTitleBar> EMPTY_IMAGE_CARD_TITLE_BAR$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(67));

    /* JADX WARN: Multi-variable type inference failed */
    public ImageCardTitleBar() {
        this((ImageComponent) null, (TextComponent) (0 == true ? 1 : 0), (TextComponent) (0 == true ? 1 : 0), 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCardTitleBar)) {
            return false;
        }
        ImageCardTitleBar imageCardTitleBar = (ImageCardTitleBar) obj;
        return Intrinsics.LJFF(this.leftImage, imageCardTitleBar.leftImage) && Intrinsics.LJFF(this.title, imageCardTitleBar.title) && Intrinsics.LJFF(this.subtitle, imageCardTitleBar.subtitle) && Intrinsics.LJFF(this.rightButton, imageCardTitleBar.rightButton);
    }

    public final int hashCode() {
        int iHashCode = ((((this.leftImage.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
        ButtonComponent buttonComponent = this.rightButton;
        return iHashCode + (buttonComponent == null ? 0 : buttonComponent.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageCardTitleBar(leftImage=");
        sbLIZ.append(this.leftImage);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.subtitle);
        sbLIZ.append(", rightButton=");
        sbLIZ.append(this.rightButton);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.leftImage.writeToParcel(parcel, i);
        this.title.writeToParcel(parcel, i);
        this.subtitle.writeToParcel(parcel, i);
        ButtonComponent buttonComponent = this.rightButton;
        if (buttonComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonComponent.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImageCardTitleBar(ImageComponent imageComponent, TextComponent textComponent, TextComponent textComponent2, int i) {
        if ((i & 1) != 0) {
            ImageComponent.Companion.getClass();
            imageComponent = C18ZU.LIZ();
        }
        if ((i & 2) != 0) {
            TextComponent.Companion.getClass();
            textComponent = C2243491CrT.LIZ();
        }
        if ((i & 4) != 0) {
            TextComponent.Companion.getClass();
            textComponent2 = C2243491CrT.LIZ();
        }
        this(imageComponent, textComponent, textComponent2, (ButtonComponent) null);
    }

    public ImageCardTitleBar(ImageComponent imageComponent, TextComponent textComponent, TextComponent textComponent2, ButtonComponent buttonComponent) {
        this.leftImage = imageComponent;
        this.title = textComponent;
        this.subtitle = textComponent2;
        this.rightButton = buttonComponent;
    }
}
