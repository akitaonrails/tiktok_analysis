package com.ss.android.ugc.aweme.im.message.template.component;

import X.C2188811AlT;
import X.C2243081Cqo;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ButtonComponent implements BaseComponent<C2243081Cqo> {
    public static final Parcelable.Creator<ButtonComponent> CREATOR = new Parcelable.Creator<ButtonComponent>() { // from class: X.1Cqu
        @Override // android.os.Parcelable.Creator
        public final ButtonComponent createFromParcel(Parcel parcel) {
            return new ButtonComponent(TextComponent.CREATOR.createFromParcel(parcel), ActionLinkComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonComponent[] newArray(int i) {
            return new ButtonComponent[i];
        }
    };
    public final ActionLinkComponent linkComponent;
    public final TextComponent text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponent)) {
            return false;
        }
        ButtonComponent buttonComponent = (ButtonComponent) obj;
        return Intrinsics.LJFF(this.text, buttonComponent.text) && Intrinsics.LJFF(this.linkComponent, buttonComponent.linkComponent);
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.linkComponent.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonComponent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", linkComponent=");
        sbLIZ.append(this.linkComponent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.text.writeToParcel(parcel, i);
        this.linkComponent.writeToParcel(parcel, i);
    }

    public ButtonComponent(TextComponent textComponent, ActionLinkComponent actionLinkComponent) {
        this.text = textComponent;
        this.linkComponent = actionLinkComponent;
    }
}
