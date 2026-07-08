package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC2243991CsH;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewIconTypeComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class PreviewIconTypeComponent implements BaseComponent<EnumC2243991CsH> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PreviewIconTypeComponent[] $VALUES;
    public static final Parcelable.Creator<PreviewIconTypeComponent> CREATOR;
    public static final PreviewIconTypeComponent NOICON;
    public static final PreviewIconTypeComponent PLAYICON;
    public final int value;

    public static InterfaceC2044707zh<PreviewIconTypeComponent> getEntries() {
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
        PreviewIconTypeComponent previewIconTypeComponent = new PreviewIconTypeComponent("NOICON", 0, EnumC2243991CsH.NoIcon.getValue());
        NOICON = previewIconTypeComponent;
        PreviewIconTypeComponent previewIconTypeComponent2 = new PreviewIconTypeComponent("PLAYICON", 1, EnumC2243991CsH.PlayIcon.getValue());
        PLAYICON = previewIconTypeComponent2;
        PreviewIconTypeComponent[] previewIconTypeComponentArr = {previewIconTypeComponent, previewIconTypeComponent2};
        $VALUES = previewIconTypeComponentArr;
        $ENTRIES = new C2254308sP(previewIconTypeComponentArr);
        CREATOR = new Parcelable.Creator<PreviewIconTypeComponent>() { // from class: X.1CsI
            @Override // android.os.Parcelable.Creator
            public final PreviewIconTypeComponent createFromParcel(Parcel parcel) {
                return PreviewIconTypeComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PreviewIconTypeComponent[] newArray(int i) {
                return new PreviewIconTypeComponent[i];
            }
        };
    }

    public static PreviewIconTypeComponent[] values() {
        return (PreviewIconTypeComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2243991CsH toProto() {
        return EnumC2243991CsH.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static PreviewIconTypeComponent valueOf(String str) {
        return (PreviewIconTypeComponent) C08FF.LIZ(PreviewIconTypeComponent.class, str);
    }

    public PreviewIconTypeComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
