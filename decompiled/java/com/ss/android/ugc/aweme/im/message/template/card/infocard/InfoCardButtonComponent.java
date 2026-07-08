package com.ss.android.ugc.aweme.im.message.template.card.infocard;

import X.C2188811AlT;
import X.C2243341CrE;
import X.C2243491CrT;
import X.C2244301Csm;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class InfoCardButtonComponent implements BaseComponent<C2243341CrE> {
    public static final Parcelable.Creator<InfoCardButtonComponent> CREATOR = new Parcelable.Creator<InfoCardButtonComponent>() { // from class: X.1CrN
        @Override // android.os.Parcelable.Creator
        public final InfoCardButtonComponent createFromParcel(Parcel parcel) {
            TextComponent textComponentCreateFromParcel;
            Parcelable.Creator<TextComponent> creator = TextComponent.CREATOR;
            TextComponent textComponentCreateFromParcel2 = creator.createFromParcel(parcel);
            CardButtonType cardButtonTypeCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                textComponentCreateFromParcel = null;
            } else {
                textComponentCreateFromParcel = creator.createFromParcel(parcel);
            }
            TextComponent textComponent = textComponentCreateFromParcel;
            ActionLinkComponent actionLinkComponentCreateFromParcel = ActionLinkComponent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                cardButtonTypeCreateFromParcel = CardButtonType.CREATOR.createFromParcel(parcel);
            }
            return new InfoCardButtonComponent(textComponentCreateFromParcel2, textComponent, actionLinkComponentCreateFromParcel, cardButtonTypeCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InfoCardButtonComponent[] newArray(int i) {
            return new InfoCardButtonComponent[i];
        }
    };
    public final CardButtonType buttonType;
    public final TextComponent cardText;
    public final TextComponent hint;
    public final ActionLinkComponent linkInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoCardButtonComponent() {
        this((TextComponent) null, (ActionLinkComponent) (0 == true ? 1 : 0), (CardButtonType) (0 == true ? 1 : 0), 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoCardButtonComponent)) {
            return false;
        }
        InfoCardButtonComponent infoCardButtonComponent = (InfoCardButtonComponent) obj;
        return Intrinsics.LJFF(this.cardText, infoCardButtonComponent.cardText) && Intrinsics.LJFF(this.hint, infoCardButtonComponent.hint) && Intrinsics.LJFF(this.linkInfo, infoCardButtonComponent.linkInfo) && this.buttonType == infoCardButtonComponent.buttonType;
    }

    public final int hashCode() {
        int iHashCode = this.cardText.hashCode() * 31;
        TextComponent textComponent = this.hint;
        int iHashCode2 = (((iHashCode + (textComponent == null ? 0 : textComponent.hashCode())) * 31) + this.linkInfo.hashCode()) * 31;
        CardButtonType cardButtonType = this.buttonType;
        return iHashCode2 + (cardButtonType != null ? cardButtonType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoCardButtonComponent(cardText=");
        sbLIZ.append(this.cardText);
        sbLIZ.append(", hint=");
        sbLIZ.append(this.hint);
        sbLIZ.append(", linkInfo=");
        sbLIZ.append(this.linkInfo);
        sbLIZ.append(", buttonType=");
        sbLIZ.append(this.buttonType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.cardText.writeToParcel(parcel, i);
        TextComponent textComponent = this.hint;
        if (textComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent.writeToParcel(parcel, i);
        }
        this.linkInfo.writeToParcel(parcel, i);
        CardButtonType cardButtonType = this.buttonType;
        if (cardButtonType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardButtonType.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InfoCardButtonComponent(TextComponent textComponent, ActionLinkComponent actionLinkComponent, CardButtonType cardButtonType, int i) {
        TextComponent textComponentLIZ;
        if ((i & 1) != 0) {
            TextComponent.Companion.getClass();
            textComponent = C2243491CrT.LIZ();
        }
        if ((i & 2) != 0) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        } else {
            textComponentLIZ = null;
        }
        if ((i & 4) != 0) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponent = C2244301Csm.LIZ();
        }
        this(textComponent, textComponentLIZ, actionLinkComponent, (i & 8) != 0 ? CardButtonType.DEFAULT : cardButtonType);
    }

    public InfoCardButtonComponent(TextComponent textComponent, TextComponent textComponent2, ActionLinkComponent actionLinkComponent, CardButtonType cardButtonType) {
        this.cardText = textComponent;
        this.hint = textComponent2;
        this.linkInfo = actionLinkComponent;
        this.buttonType = cardButtonType;
    }
}
