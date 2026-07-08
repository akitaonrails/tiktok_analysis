package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C18ZU;
import X.C2188811AlT;
import X.C2242211CpP;
import X.C2242261CpU;
import X.C2242271CpV;
import X.C2243491CrT;
import X.C2244301Csm;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class FallbackInfoComponent implements BaseComponent<C2242211CpP> {
    public final ImageComponent imageComponent;
    public final ActionLinkComponent linkComponent;
    public final TextComponent textComponent;
    public static final C2242271CpV Companion = new Object() { // from class: X.1CpV
    };
    public static final Parcelable.Creator<FallbackInfoComponent> CREATOR = new Parcelable.Creator<FallbackInfoComponent>() { // from class: X.1CpI
        @Override // android.os.Parcelable.Creator
        public final FallbackInfoComponent createFromParcel(Parcel parcel) {
            TextComponent textComponentCreateFromParcel;
            ActionLinkComponent actionLinkComponentCreateFromParcel;
            ImageComponent imageComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                textComponentCreateFromParcel = null;
            } else {
                textComponentCreateFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
            }
            TextComponent textComponent = textComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                actionLinkComponentCreateFromParcel = null;
            } else {
                actionLinkComponentCreateFromParcel = ActionLinkComponent.CREATOR.createFromParcel(parcel);
            }
            ActionLinkComponent actionLinkComponent = actionLinkComponentCreateFromParcel;
            if (parcel.readInt() != 0) {
                imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            }
            return new FallbackInfoComponent(actionLinkComponent, imageComponentCreateFromParcel, textComponent);
        }

        @Override // android.os.Parcelable.Creator
        public final FallbackInfoComponent[] newArray(int i) {
            return new FallbackInfoComponent[i];
        }
    };
    public static final C01GW<BaseRequestComponent> EMPTY_BASE_REQUEST$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(72));

    public FallbackInfoComponent() {
        this(7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FallbackInfoComponent)) {
            return false;
        }
        FallbackInfoComponent fallbackInfoComponent = (FallbackInfoComponent) obj;
        return Intrinsics.LJFF(this.textComponent, fallbackInfoComponent.textComponent) && Intrinsics.LJFF(this.linkComponent, fallbackInfoComponent.linkComponent) && Intrinsics.LJFF(this.imageComponent, fallbackInfoComponent.imageComponent);
    }

    public final int hashCode() {
        TextComponent textComponent = this.textComponent;
        int iHashCode = (textComponent == null ? 0 : textComponent.hashCode()) * 31;
        ActionLinkComponent actionLinkComponent = this.linkComponent;
        int iHashCode2 = (iHashCode + (actionLinkComponent == null ? 0 : actionLinkComponent.hashCode())) * 31;
        ImageComponent imageComponent = this.imageComponent;
        return iHashCode2 + (imageComponent != null ? imageComponent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FallbackInfoComponent(textComponent=");
        sbLIZ.append(this.textComponent);
        sbLIZ.append(", linkComponent=");
        sbLIZ.append(this.linkComponent);
        sbLIZ.append(", imageComponent=");
        sbLIZ.append(this.imageComponent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextComponent textComponent = this.textComponent;
        if (textComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent.writeToParcel(parcel, i);
        }
        ActionLinkComponent actionLinkComponent = this.linkComponent;
        if (actionLinkComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionLinkComponent.writeToParcel(parcel, i);
        }
        ImageComponent imageComponent = this.imageComponent;
        if (imageComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageComponent.writeToParcel(parcel, i);
        }
    }

    public final C2242211CpP LIZ() {
        C2242261CpU c2242261CpU = new C2242261CpU();
        ActionLinkComponent actionLinkComponent = this.linkComponent;
        c2242261CpU.LJFF = actionLinkComponent != null ? actionLinkComponent.LIZIZ() : null;
        ImageComponent imageComponent = this.imageComponent;
        c2242261CpU.LIZLLL = imageComponent != null ? imageComponent.LIZIZ() : null;
        TextComponent textComponent = this.textComponent;
        c2242261CpU.LJ = textComponent != null ? textComponent.LIZ() : null;
        return c2242261CpU.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FallbackInfoComponent(int i) {
        TextComponent textComponentLIZ;
        ActionLinkComponent actionLinkComponentLIZ;
        ImageComponent imageComponentLIZ = null;
        if ((i & 1) != 0) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        } else {
            textComponentLIZ = null;
        }
        if ((i & 2) != 0) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        } else {
            actionLinkComponentLIZ = null;
        }
        if ((i & 4) != 0) {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        }
        this(actionLinkComponentLIZ, imageComponentLIZ, textComponentLIZ);
    }

    public FallbackInfoComponent(ActionLinkComponent actionLinkComponent, ImageComponent imageComponent, TextComponent textComponent) {
        this.textComponent = textComponent;
        this.linkComponent = actionLinkComponent;
        this.imageComponent = imageComponent;
    }
}
