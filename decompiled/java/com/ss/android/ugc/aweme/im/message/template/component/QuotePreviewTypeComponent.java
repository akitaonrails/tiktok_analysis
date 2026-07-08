package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC2243981CsG;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class QuotePreviewTypeComponent implements BaseComponent<EnumC2243981CsG> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ QuotePreviewTypeComponent[] $VALUES;
    public static final Parcelable.Creator<QuotePreviewTypeComponent> CREATOR;
    public static final QuotePreviewTypeComponent PICTURE;
    public static final QuotePreviewTypeComponent TEXT;
    public final int value;

    public static InterfaceC2044707zh<QuotePreviewTypeComponent> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }

    static {
        QuotePreviewTypeComponent quotePreviewTypeComponent = new QuotePreviewTypeComponent("TEXT", 0, EnumC2243981CsG.TEXT.getValue());
        TEXT = quotePreviewTypeComponent;
        QuotePreviewTypeComponent quotePreviewTypeComponent2 = new QuotePreviewTypeComponent("PICTURE", 1, EnumC2243981CsG.PICTURE.getValue());
        PICTURE = quotePreviewTypeComponent2;
        QuotePreviewTypeComponent[] quotePreviewTypeComponentArr = {quotePreviewTypeComponent, quotePreviewTypeComponent2};
        $VALUES = quotePreviewTypeComponentArr;
        $ENTRIES = new C2254308sP(quotePreviewTypeComponentArr);
        CREATOR = new Parcelable.Creator<QuotePreviewTypeComponent>() { // from class: X.1CsJ
            @Override // android.os.Parcelable.Creator
            public final QuotePreviewTypeComponent createFromParcel(Parcel parcel) {
                return QuotePreviewTypeComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final QuotePreviewTypeComponent[] newArray(int i) {
                return new QuotePreviewTypeComponent[i];
            }
        };
    }

    public static QuotePreviewTypeComponent[] values() {
        return (QuotePreviewTypeComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2243981CsG toProto() {
        return EnumC2243981CsG.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static QuotePreviewTypeComponent valueOf(String str) {
        return (QuotePreviewTypeComponent) C08FF.LIZ(QuotePreviewTypeComponent.class, str);
    }

    public QuotePreviewTypeComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
