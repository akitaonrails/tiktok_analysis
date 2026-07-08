package com.ss.android.ugc.aweme.im.message.template.card.infocard;

import X.C08FF;
import X.C2254308sP;
import X.EnumC2243411CrL;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class CardButtonType implements BaseComponent<EnumC2243411CrL> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CardButtonType[] $VALUES;
    public static final CardButtonType CLICKABLE_TEXT;
    public static final Parcelable.Creator<CardButtonType> CREATOR;
    public static final CardButtonType DEFAULT;
    public final int value;

    public static InterfaceC2044707zh<CardButtonType> getEntries() {
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
        CardButtonType cardButtonType = new CardButtonType(LivePreviewCTASmartDisplayManager.DEFAULT, 0, EnumC2243411CrL.DEFAULT.getValue());
        DEFAULT = cardButtonType;
        CardButtonType cardButtonType2 = new CardButtonType("CLICKABLE_TEXT", 1, EnumC2243411CrL.CLICKABLE_TEXT.getValue());
        CLICKABLE_TEXT = cardButtonType2;
        CardButtonType[] cardButtonTypeArr = {cardButtonType, cardButtonType2};
        $VALUES = cardButtonTypeArr;
        $ENTRIES = new C2254308sP(cardButtonTypeArr);
        CREATOR = new Parcelable.Creator<CardButtonType>() { // from class: X.1CrR
            @Override // android.os.Parcelable.Creator
            public final CardButtonType createFromParcel(Parcel parcel) {
                return CardButtonType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CardButtonType[] newArray(int i) {
                return new CardButtonType[i];
            }
        };
    }

    public static CardButtonType[] values() {
        return (CardButtonType[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2243411CrL toProto() {
        return EnumC2243411CrL.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static CardButtonType valueOf(String str) {
        return (CardButtonType) C08FF.LIZ(CardButtonType.class, str);
    }

    public CardButtonType(String str, int i, int i2) {
        this.value = i2;
    }
}
