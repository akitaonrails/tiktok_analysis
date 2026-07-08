package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C2188811AlT;
import X.C2242321Cpa;
import X.C2242341Cpc;
import X.C2242371Cpf;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class BaseHeaderComponent implements BaseComponent<C2242321Cpa> {
    public final TextComponent text;
    public static final C2242371Cpf Companion = new Object() { // from class: X.1Cpf
    };
    public static final Parcelable.Creator<BaseHeaderComponent> CREATOR = new Parcelable.Creator<BaseHeaderComponent>() { // from class: X.1Cpe
        @Override // android.os.Parcelable.Creator
        public final BaseHeaderComponent createFromParcel(Parcel parcel) {
            return new BaseHeaderComponent(TextComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseHeaderComponent[] newArray(int i) {
            return new BaseHeaderComponent[i];
        }
    };
    public static final C01GW<BaseHeaderComponent> EMPTY_HEADER_COMPONENT$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(70));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseHeaderComponent) && Intrinsics.LJFF(this.text, ((BaseHeaderComponent) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseHeaderComponent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.text.writeToParcel(parcel, i);
    }

    public final C2242321Cpa LIZ() {
        C2242341Cpc c2242341Cpc = new C2242341Cpc();
        c2242341Cpc.LIZLLL = this.text.LIZ();
        return c2242341Cpc.build();
    }

    public BaseHeaderComponent(TextComponent textComponent) {
        this.text = textComponent;
    }
}
