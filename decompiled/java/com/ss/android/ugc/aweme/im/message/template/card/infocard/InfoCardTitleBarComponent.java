package com.ss.android.ugc.aweme.im.message.template.card.infocard;

import X.C2188811AlT;
import X.C2243361CrG;
import X.C2243491CrT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardTitleBarComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class InfoCardTitleBarComponent implements BaseComponent<C2243361CrG> {
    public static final Parcelable.Creator<InfoCardTitleBarComponent> CREATOR = new Parcelable.Creator<InfoCardTitleBarComponent>() { // from class: X.1CrQ
        @Override // android.os.Parcelable.Creator
        public final InfoCardTitleBarComponent createFromParcel(Parcel parcel) {
            ImageComponent imageComponentCreateFromParcel;
            TextComponent textComponentCreateFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                imageComponentCreateFromParcel = null;
            } else {
                imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            }
            return new InfoCardTitleBarComponent(textComponentCreateFromParcel, imageComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InfoCardTitleBarComponent[] newArray(int i) {
            return new InfoCardTitleBarComponent[i];
        }
    };
    public final ImageComponent image;
    public final TextComponent title;

    public InfoCardTitleBarComponent() {
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
        if (!(obj instanceof InfoCardTitleBarComponent)) {
            return false;
        }
        InfoCardTitleBarComponent infoCardTitleBarComponent = (InfoCardTitleBarComponent) obj;
        return Intrinsics.LJFF(this.title, infoCardTitleBarComponent.title) && Intrinsics.LJFF(this.image, infoCardTitleBarComponent.image);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        ImageComponent imageComponent = this.image;
        return iHashCode + (imageComponent == null ? 0 : imageComponent.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoCardTitleBarComponent(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.title.writeToParcel(parcel, i);
        ImageComponent imageComponent = this.image;
        if (imageComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageComponent.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoCardTitleBarComponent(int i) {
        this(C2243491CrT.LIZ(), null);
        TextComponent.Companion.getClass();
    }

    public InfoCardTitleBarComponent(TextComponent textComponent, ImageComponent imageComponent) {
        this.title = textComponent;
        this.image = imageComponent;
    }
}
