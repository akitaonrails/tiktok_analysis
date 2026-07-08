package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C18Y9;
import X.C2188811AlT;
import X.C2241591CoP;
import X.C2241611CoR;
import X.C2243891Cs7;
import X.C2243901Cs8;
import X.C2243941CsC;
import X.C2243951CsD;
import X.C2243971CsF;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class PreviewHintComponent implements BaseComponent<C2243941CsC> {
    public final TextComponent inAppPushPreviewText;
    public final QuotePicturePreviewComponent quotePicturePreview;
    public final TextComponent quotePreviewText;
    public final QuotePreviewTypeComponent quotePreviewType;
    public final TextComponent receiverPreviewText;
    public final TextComponent senderPreviewText;
    public static final C18Y9 Companion = new C18Y9();
    public static final Parcelable.Creator<PreviewHintComponent> CREATOR = new Parcelable.Creator<PreviewHintComponent>() { // from class: X.1Cs6
        @Override // android.os.Parcelable.Creator
        public final PreviewHintComponent createFromParcel(Parcel parcel) {
            QuotePreviewTypeComponent quotePreviewTypeComponentCreateFromParcel;
            QuotePicturePreviewComponent quotePicturePreviewComponentCreateFromParcel;
            Parcelable.Creator<TextComponent> creator = TextComponent.CREATOR;
            TextComponent textComponentCreateFromParcel = creator.createFromParcel(parcel);
            TextComponent textComponentCreateFromParcel2 = creator.createFromParcel(parcel);
            TextComponent textComponentCreateFromParcel3 = creator.createFromParcel(parcel);
            TextComponent textComponentCreateFromParcel4 = null;
            if (parcel.readInt() == 0) {
                quotePreviewTypeComponentCreateFromParcel = null;
            } else {
                quotePreviewTypeComponentCreateFromParcel = QuotePreviewTypeComponent.CREATOR.createFromParcel(parcel);
            }
            QuotePreviewTypeComponent quotePreviewTypeComponent = quotePreviewTypeComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                quotePicturePreviewComponentCreateFromParcel = null;
            } else {
                quotePicturePreviewComponentCreateFromParcel = QuotePicturePreviewComponent.CREATOR.createFromParcel(parcel);
            }
            QuotePicturePreviewComponent quotePicturePreviewComponent = quotePicturePreviewComponentCreateFromParcel;
            if (parcel.readInt() != 0) {
                textComponentCreateFromParcel4 = creator.createFromParcel(parcel);
            }
            return new PreviewHintComponent(textComponentCreateFromParcel, textComponentCreateFromParcel2, textComponentCreateFromParcel3, quotePreviewTypeComponent, quotePicturePreviewComponent, textComponentCreateFromParcel4);
        }

        @Override // android.os.Parcelable.Creator
        public final PreviewHintComponent[] newArray(int i) {
            return new PreviewHintComponent[i];
        }
    };
    public static final C01GW<PreviewHintComponent> DEFAULT_PREVIEW_HINT$delegate = C452501pT.LIZIZ(new C2243891Cs7());

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewHintComponent)) {
            return false;
        }
        PreviewHintComponent previewHintComponent = (PreviewHintComponent) obj;
        return Intrinsics.LJFF(this.senderPreviewText, previewHintComponent.senderPreviewText) && Intrinsics.LJFF(this.receiverPreviewText, previewHintComponent.receiverPreviewText) && Intrinsics.LJFF(this.quotePreviewText, previewHintComponent.quotePreviewText) && this.quotePreviewType == previewHintComponent.quotePreviewType && Intrinsics.LJFF(this.quotePicturePreview, previewHintComponent.quotePicturePreview) && Intrinsics.LJFF(this.inAppPushPreviewText, previewHintComponent.inAppPushPreviewText);
    }

    public final int hashCode() {
        int iHashCode = ((((this.senderPreviewText.hashCode() * 31) + this.receiverPreviewText.hashCode()) * 31) + this.quotePreviewText.hashCode()) * 31;
        QuotePreviewTypeComponent quotePreviewTypeComponent = this.quotePreviewType;
        int iHashCode2 = (iHashCode + (quotePreviewTypeComponent == null ? 0 : quotePreviewTypeComponent.hashCode())) * 31;
        QuotePicturePreviewComponent quotePicturePreviewComponent = this.quotePicturePreview;
        int iHashCode3 = (iHashCode2 + (quotePicturePreviewComponent == null ? 0 : quotePicturePreviewComponent.hashCode())) * 31;
        TextComponent textComponent = this.inAppPushPreviewText;
        return iHashCode3 + (textComponent != null ? textComponent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewHintComponent(senderPreviewText=");
        sbLIZ.append(this.senderPreviewText);
        sbLIZ.append(", receiverPreviewText=");
        sbLIZ.append(this.receiverPreviewText);
        sbLIZ.append(", quotePreviewText=");
        sbLIZ.append(this.quotePreviewText);
        sbLIZ.append(", quotePreviewType=");
        sbLIZ.append(this.quotePreviewType);
        sbLIZ.append(", quotePicturePreview=");
        sbLIZ.append(this.quotePicturePreview);
        sbLIZ.append(", inAppPushPreviewText=");
        sbLIZ.append(this.inAppPushPreviewText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.senderPreviewText.writeToParcel(parcel, i);
        this.receiverPreviewText.writeToParcel(parcel, i);
        this.quotePreviewText.writeToParcel(parcel, i);
        QuotePreviewTypeComponent quotePreviewTypeComponent = this.quotePreviewType;
        if (quotePreviewTypeComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quotePreviewTypeComponent.writeToParcel(parcel, i);
        }
        QuotePicturePreviewComponent quotePicturePreviewComponent = this.quotePicturePreview;
        if (quotePicturePreviewComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quotePicturePreviewComponent.writeToParcel(parcel, i);
        }
        TextComponent textComponent = this.inAppPushPreviewText;
        if (textComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent.writeToParcel(parcel, i);
        }
    }

    public final C2243941CsC LIZIZ() {
        C2243901Cs8 c2243901Cs8LIZIZ;
        C2241591CoP c2241591CoPLIZIZ;
        C2243971CsF c2243971CsF = new C2243971CsF();
        c2243971CsF.LIZLLL = this.senderPreviewText.LIZ();
        c2243971CsF.LJ = this.receiverPreviewText.LIZ();
        c2243971CsF.LJFF = this.quotePreviewText.LIZ();
        QuotePreviewTypeComponent quotePreviewTypeComponent = this.quotePreviewType;
        c2243971CsF.LJI = quotePreviewTypeComponent != null ? quotePreviewTypeComponent.toProto() : null;
        QuotePicturePreviewComponent quotePicturePreviewComponent = this.quotePicturePreview;
        if (quotePicturePreviewComponent != null) {
            C2243951CsD c2243951CsD = new C2243951CsD();
            c2243951CsD.LIZLLL = quotePicturePreviewComponent.resourceId;
            c2243951CsD.LJ = quotePicturePreviewComponent.senderUid;
            ImageComponent imageComponent = quotePicturePreviewComponent.previewImage;
            c2243951CsD.LJFF = imageComponent != null ? imageComponent.LIZIZ() : null;
            IconTypeComponent iconTypeComponent = quotePicturePreviewComponent.fallbackIcon;
            c2243951CsD.LJI = iconTypeComponent != null ? iconTypeComponent.toProto() : null;
            PreviewIconTypeComponent previewIconTypeComponent = quotePicturePreviewComponent.quotePreviewIcon;
            c2243951CsD.LJII = previewIconTypeComponent != null ? previewIconTypeComponent.toProto() : null;
            ActionLinkComponent actionLinkComponent = quotePicturePreviewComponent.linkInfo;
            c2243951CsD.LJIIIIZZ = actionLinkComponent != null ? actionLinkComponent.LIZIZ() : null;
            TTLComponent tTLComponent = quotePicturePreviewComponent.ttl;
            if (tTLComponent != null) {
                C2241611CoR c2241611CoR = new C2241611CoR();
                c2241611CoR.LIZLLL = Long.valueOf(tTLComponent.expiredAt);
                c2241591CoPLIZIZ = c2241611CoR.build();
            } else {
                c2241591CoPLIZIZ = null;
            }
            c2243951CsD.LJIIIZ = c2241591CoPLIZIZ;
            c2243901Cs8LIZIZ = c2243951CsD.build();
        } else {
            c2243901Cs8LIZIZ = null;
        }
        c2243971CsF.LJII = c2243901Cs8LIZIZ;
        TextComponent textComponent = this.inAppPushPreviewText;
        c2243971CsF.LJIIIZ = textComponent != null ? textComponent.LIZ() : null;
        return c2243971CsF.build();
    }

    public static PreviewHintComponent LIZ(PreviewHintComponent previewHintComponent, TextComponent textComponent, TextComponent textComponent2, QuotePicturePreviewComponent quotePicturePreviewComponent, int i) {
        TextComponent textComponent3;
        QuotePreviewTypeComponent quotePreviewTypeComponent;
        QuotePicturePreviewComponent quotePicturePreviewComponent2 = quotePicturePreviewComponent;
        TextComponent textComponent4 = textComponent2;
        TextComponent textComponent5 = textComponent;
        if ((i & 1) != 0) {
            textComponent5 = previewHintComponent.senderPreviewText;
        }
        if ((i & 2) != 0) {
            textComponent4 = previewHintComponent.receiverPreviewText;
        }
        TextComponent textComponent6 = null;
        if ((i & 4) != 0) {
            textComponent3 = previewHintComponent.quotePreviewText;
        } else {
            textComponent3 = null;
        }
        if ((i & 8) != 0) {
            quotePreviewTypeComponent = previewHintComponent.quotePreviewType;
        } else {
            quotePreviewTypeComponent = null;
        }
        if ((i & 16) != 0) {
            quotePicturePreviewComponent2 = previewHintComponent.quotePicturePreview;
        }
        if ((i & 32) != 0) {
            textComponent6 = previewHintComponent.inAppPushPreviewText;
        }
        previewHintComponent.getClass();
        return new PreviewHintComponent(textComponent5, textComponent4, textComponent3, quotePreviewTypeComponent, quotePicturePreviewComponent2, textComponent6);
    }

    public PreviewHintComponent(TextComponent textComponent, TextComponent textComponent2, TextComponent textComponent3, QuotePreviewTypeComponent quotePreviewTypeComponent, QuotePicturePreviewComponent quotePicturePreviewComponent, TextComponent textComponent4) {
        this.senderPreviewText = textComponent;
        this.receiverPreviewText = textComponent2;
        this.quotePreviewText = textComponent3;
        this.quotePreviewType = quotePreviewTypeComponent;
        this.quotePicturePreview = quotePicturePreviewComponent;
        this.inAppPushPreviewText = textComponent4;
    }

    public /* synthetic */ PreviewHintComponent(TextComponent textComponent, TextComponent textComponent2, TextComponent textComponent3, QuotePreviewTypeComponent quotePreviewTypeComponent, QuotePicturePreviewComponent quotePicturePreviewComponent, TextComponent textComponent4, int i) {
        this(textComponent, textComponent2, textComponent3, (i & 8) != 0 ? null : quotePreviewTypeComponent, (i & 16) != 0 ? null : quotePicturePreviewComponent, (i & 32) == 0 ? textComponent4 : null);
    }
}
