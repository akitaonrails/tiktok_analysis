package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC2244051CsN;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class IconTypeComponent implements BaseComponent<EnumC2244051CsN> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ IconTypeComponent[] $VALUES;
    public static final IconTypeComponent ABNORMAL;
    public static final Parcelable.Creator<IconTypeComponent> CREATOR;
    public static final IconTypeComponent DEFAULT;
    public static final IconTypeComponent LOADING;
    public static final IconTypeComponent MODERATION;
    public static final IconTypeComponent RESTRICTED;
    public static final IconTypeComponent SERVER_ERROR;
    public final int value;

    public static InterfaceC2044707zh<IconTypeComponent> getEntries() {
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
        IconTypeComponent iconTypeComponent = new IconTypeComponent(LivePreviewCTASmartDisplayManager.DEFAULT, 0, EnumC2244051CsN.Default.getValue());
        DEFAULT = iconTypeComponent;
        IconTypeComponent iconTypeComponent2 = new IconTypeComponent("SERVER_ERROR", 1, EnumC2244051CsN.ServerError.getValue());
        SERVER_ERROR = iconTypeComponent2;
        IconTypeComponent iconTypeComponent3 = new IconTypeComponent("MODERATION", 2, EnumC2244051CsN.Moderation.getValue());
        MODERATION = iconTypeComponent3;
        IconTypeComponent iconTypeComponent4 = new IconTypeComponent("LOADING", 3, EnumC2244051CsN.Loading.getValue());
        LOADING = iconTypeComponent4;
        IconTypeComponent iconTypeComponent5 = new IconTypeComponent("RESTRICTED", 4, EnumC2244051CsN.Restricted.getValue());
        RESTRICTED = iconTypeComponent5;
        IconTypeComponent iconTypeComponent6 = new IconTypeComponent("ABNORMAL", 5, EnumC2244051CsN.Abnormal.getValue());
        ABNORMAL = iconTypeComponent6;
        IconTypeComponent[] iconTypeComponentArr = {iconTypeComponent, iconTypeComponent2, iconTypeComponent3, iconTypeComponent4, iconTypeComponent5, iconTypeComponent6};
        $VALUES = iconTypeComponentArr;
        $ENTRIES = new C2254308sP(iconTypeComponentArr);
        CREATOR = new Parcelable.Creator<IconTypeComponent>() { // from class: X.1CsO
            @Override // android.os.Parcelable.Creator
            public final IconTypeComponent createFromParcel(Parcel parcel) {
                return IconTypeComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconTypeComponent[] newArray(int i) {
                return new IconTypeComponent[i];
            }
        };
    }

    public static IconTypeComponent[] values() {
        return (IconTypeComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2244051CsN toProto() {
        return EnumC2244051CsN.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static IconTypeComponent valueOf(String str) {
        return (IconTypeComponent) C08FF.LIZ(IconTypeComponent.class, str);
    }

    public IconTypeComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
