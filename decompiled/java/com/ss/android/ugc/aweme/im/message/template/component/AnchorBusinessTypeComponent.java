package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C1375870luL;
import X.C2254308sP;
import X.EnumC2244221Cse;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.AnchorBusinessTypeComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class AnchorBusinessTypeComponent implements BaseComponent<EnumC2244221Cse> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AnchorBusinessTypeComponent[] $VALUES;
    public static final AnchorBusinessTypeComponent ANCHOR_POI;
    public static final AnchorBusinessTypeComponent ANCHOR_UNKNOWN;
    public static final Parcelable.Creator<AnchorBusinessTypeComponent> CREATOR;
    public static final C1375870luL Companion;
    public final int value;

    public static InterfaceC2044707zh<AnchorBusinessTypeComponent> getEntries() {
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

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0luL] */
    static {
        AnchorBusinessTypeComponent anchorBusinessTypeComponent = new AnchorBusinessTypeComponent("ANCHOR_UNKNOWN", 0, EnumC2244221Cse.ANCHOR_UNKNOWN.getValue());
        ANCHOR_UNKNOWN = anchorBusinessTypeComponent;
        AnchorBusinessTypeComponent anchorBusinessTypeComponent2 = new AnchorBusinessTypeComponent("ANCHOR_POI", 1, EnumC2244221Cse.ANCHOR_POI.getValue());
        ANCHOR_POI = anchorBusinessTypeComponent2;
        AnchorBusinessTypeComponent[] anchorBusinessTypeComponentArr = {anchorBusinessTypeComponent, anchorBusinessTypeComponent2};
        $VALUES = anchorBusinessTypeComponentArr;
        $ENTRIES = new C2254308sP(anchorBusinessTypeComponentArr);
        Companion = new Object() { // from class: X.0luL
        };
        CREATOR = new Parcelable.Creator<AnchorBusinessTypeComponent>() { // from class: X.1Csi
            @Override // android.os.Parcelable.Creator
            public final AnchorBusinessTypeComponent createFromParcel(Parcel parcel) {
                return AnchorBusinessTypeComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AnchorBusinessTypeComponent[] newArray(int i) {
                return new AnchorBusinessTypeComponent[i];
            }
        };
    }

    public static AnchorBusinessTypeComponent[] values() {
        return (AnchorBusinessTypeComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2244221Cse toProto() {
        return EnumC2244221Cse.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static AnchorBusinessTypeComponent valueOf(String str) {
        return (AnchorBusinessTypeComponent) C08FF.LIZ(AnchorBusinessTypeComponent.class, str);
    }

    public AnchorBusinessTypeComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
