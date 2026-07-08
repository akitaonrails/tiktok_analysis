package com.ss.android.ugc.aweme.im.message.template.card.dynamic;

import X.C08FF;
import X.C18SX;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes33.dex */
public final class DynamicUiLocationType implements BaseComponent<C18SX> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ DynamicUiLocationType[] $VALUES;
    public static final DynamicUiLocationType BANNER_BOTTOM;
    public static final DynamicUiLocationType BANNER_TOP;
    public static final Parcelable.Creator<DynamicUiLocationType> CREATOR;
    public static final DynamicUiLocationType MESSAGE_CENTER;
    public static final DynamicUiLocationType MESSAGE_NORMAL;
    public static final DynamicUiLocationType POPUP_BOTTOM;
    public static final DynamicUiLocationType POPUP_TOP;
    public final int value;

    public static InterfaceC2044707zh<DynamicUiLocationType> getEntries() {
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
        DynamicUiLocationType dynamicUiLocationType = new DynamicUiLocationType("MESSAGE_NORMAL", 0, C18SX.MessageNormal.getValue());
        MESSAGE_NORMAL = dynamicUiLocationType;
        DynamicUiLocationType dynamicUiLocationType2 = new DynamicUiLocationType("MESSAGE_CENTER", 1, C18SX.MessageCenter.getValue());
        MESSAGE_CENTER = dynamicUiLocationType2;
        DynamicUiLocationType dynamicUiLocationType3 = new DynamicUiLocationType("BANNER_TOP", 2, C18SX.BannerTop.getValue());
        BANNER_TOP = dynamicUiLocationType3;
        DynamicUiLocationType dynamicUiLocationType4 = new DynamicUiLocationType("BANNER_BOTTOM", 3, C18SX.BannerBottom.getValue());
        BANNER_BOTTOM = dynamicUiLocationType4;
        DynamicUiLocationType dynamicUiLocationType5 = new DynamicUiLocationType("POPUP_TOP", 4, C18SX.PopupTop.getValue());
        POPUP_TOP = dynamicUiLocationType5;
        DynamicUiLocationType dynamicUiLocationType6 = new DynamicUiLocationType("POPUP_BOTTOM", 5, C18SX.PopupBottom.getValue());
        POPUP_BOTTOM = dynamicUiLocationType6;
        DynamicUiLocationType[] dynamicUiLocationTypeArr = {dynamicUiLocationType, dynamicUiLocationType2, dynamicUiLocationType3, dynamicUiLocationType4, dynamicUiLocationType5, dynamicUiLocationType6};
        $VALUES = dynamicUiLocationTypeArr;
        $ENTRIES = new C2254308sP(dynamicUiLocationTypeArr);
        CREATOR = new Parcelable.Creator<DynamicUiLocationType>() { // from class: X.18SY
            @Override // android.os.Parcelable.Creator
            public final DynamicUiLocationType createFromParcel(Parcel parcel) {
                return DynamicUiLocationType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DynamicUiLocationType[] newArray(int i) {
                return new DynamicUiLocationType[i];
            }
        };
    }

    public static DynamicUiLocationType[] values() {
        return (DynamicUiLocationType[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public C18SX toProto() {
        return C18SX.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static DynamicUiLocationType valueOf(String str) {
        return (DynamicUiLocationType) C08FF.LIZ(DynamicUiLocationType.class, str);
    }

    public DynamicUiLocationType(String str, int i, int i2) {
        this.value = i2;
    }
}
