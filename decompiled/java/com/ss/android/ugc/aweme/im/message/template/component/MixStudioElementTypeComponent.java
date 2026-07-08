package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2243861Cs4;
import X.C2254308sP;
import X.EnumC2243741Crs;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.MixStudioElementTypeComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class MixStudioElementTypeComponent implements BaseComponent<EnumC2243741Crs> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MixStudioElementTypeComponent[] $VALUES;
    public static final Parcelable.Creator<MixStudioElementTypeComponent> CREATOR;
    public static final C2243861Cs4 Companion;
    public static final MixStudioElementTypeComponent EMOJI;
    public static final MixStudioElementTypeComponent IMAGE;
    public static final MixStudioElementTypeComponent MEME;
    public static final MixStudioElementTypeComponent STICKER;
    public static final MixStudioElementTypeComponent TEXT;
    public static final MixStudioElementTypeComponent UNKNOWN;
    public final int value;

    public static InterfaceC2044707zh<MixStudioElementTypeComponent> getEntries() {
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

    /* JADX WARN: Type inference failed for: r0v14, types: [X.1Cs4] */
    static {
        MixStudioElementTypeComponent mixStudioElementTypeComponent = new MixStudioElementTypeComponent("UNKNOWN", 0, EnumC2243741Crs.ImagineStudioElementType_Unknown.getValue());
        UNKNOWN = mixStudioElementTypeComponent;
        MixStudioElementTypeComponent mixStudioElementTypeComponent2 = new MixStudioElementTypeComponent("TEXT", 1, EnumC2243741Crs.ImagineStudioElementType_Text.getValue());
        TEXT = mixStudioElementTypeComponent2;
        MixStudioElementTypeComponent mixStudioElementTypeComponent3 = new MixStudioElementTypeComponent("EMOJI", 2, EnumC2243741Crs.ImagineStudioElementType_Emoji.getValue());
        EMOJI = mixStudioElementTypeComponent3;
        MixStudioElementTypeComponent mixStudioElementTypeComponent4 = new MixStudioElementTypeComponent("IMAGE", 3, EnumC2243741Crs.ImagineStudioElementType_Image.getValue());
        IMAGE = mixStudioElementTypeComponent4;
        MixStudioElementTypeComponent mixStudioElementTypeComponent5 = new MixStudioElementTypeComponent("MEME", 4, EnumC2243741Crs.ImagineStudioElementType_Meme.getValue());
        MEME = mixStudioElementTypeComponent5;
        MixStudioElementTypeComponent mixStudioElementTypeComponent6 = new MixStudioElementTypeComponent("STICKER", 5, EnumC2243741Crs.ImagineStudioElementType_Sticker.getValue());
        STICKER = mixStudioElementTypeComponent6;
        MixStudioElementTypeComponent[] mixStudioElementTypeComponentArr = {mixStudioElementTypeComponent, mixStudioElementTypeComponent2, mixStudioElementTypeComponent3, mixStudioElementTypeComponent4, mixStudioElementTypeComponent5, mixStudioElementTypeComponent6};
        $VALUES = mixStudioElementTypeComponentArr;
        $ENTRIES = new C2254308sP(mixStudioElementTypeComponentArr);
        Companion = new Object() { // from class: X.1Cs4
        };
        CREATOR = new Parcelable.Creator<MixStudioElementTypeComponent>() { // from class: X.1Crz
            @Override // android.os.Parcelable.Creator
            public final MixStudioElementTypeComponent createFromParcel(Parcel parcel) {
                return MixStudioElementTypeComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioElementTypeComponent[] newArray(int i) {
                return new MixStudioElementTypeComponent[i];
            }
        };
    }

    public static MixStudioElementTypeComponent[] values() {
        return (MixStudioElementTypeComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2243741Crs toProto() {
        return EnumC2243741Crs.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static MixStudioElementTypeComponent valueOf(String str) {
        return (MixStudioElementTypeComponent) C08FF.LIZ(MixStudioElementTypeComponent.class, str);
    }

    public MixStudioElementTypeComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
