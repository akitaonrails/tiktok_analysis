package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C2188811AlT;
import X.C2242681CqA;
import X.C2242801CqM;
import X.C2242821CqO;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class BaseFooterComponent implements BaseComponent<C2242801CqM> {
    public final String footerScene;
    public final TextComponent text;
    public static final C2242681CqA Companion = new Object() { // from class: X.1CqA
    };
    public static final Parcelable.Creator<BaseFooterComponent> CREATOR = new Parcelable.Creator<BaseFooterComponent>() { // from class: X.1CqP
        @Override // android.os.Parcelable.Creator
        public final BaseFooterComponent createFromParcel(Parcel parcel) {
            return new BaseFooterComponent(TextComponent.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseFooterComponent[] newArray(int i) {
            return new BaseFooterComponent[i];
        }
    };
    public static final C01GW<BaseFooterComponent> EMPTY_FOOTER_COMPONENT$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(69));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseFooterComponent)) {
            return false;
        }
        BaseFooterComponent baseFooterComponent = (BaseFooterComponent) obj;
        return Intrinsics.LJFF(this.text, baseFooterComponent.text) && Intrinsics.LJFF(this.footerScene, baseFooterComponent.footerScene);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.footerScene;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseFooterComponent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", footerScene=");
        sbLIZ.append(this.footerScene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.text.writeToParcel(parcel, i);
        parcel.writeString(this.footerScene);
    }

    public final C2242801CqM LIZ() {
        C2242821CqO c2242821CqO = new C2242821CqO();
        c2242821CqO.LJ = this.footerScene;
        c2242821CqO.LIZLLL = this.text.LIZ();
        return c2242821CqO.build();
    }

    public BaseFooterComponent(TextComponent textComponent, String str) {
        this.text = textComponent;
        this.footerScene = str;
    }
}
