package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C0IB9;
import X.C0IBA;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class FallbackStatusComponent implements BaseComponent<C0IBA> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ FallbackStatusComponent[] $VALUES;
    public static final Parcelable.Creator<FallbackStatusComponent> CREATOR;
    public static final C0IB9 Companion;
    public static final FallbackStatusComponent FRIENDS_ONLY;
    public static final FallbackStatusComponent STORY_EXPIRED;
    public static final FallbackStatusComponent UNAVAILABLE;
    public static final FallbackStatusComponent UNKNOWN;
    public final int value;

    public static InterfaceC2044707zh<FallbackStatusComponent> getEntries() {
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

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0IB9] */
    static {
        FallbackStatusComponent fallbackStatusComponent = new FallbackStatusComponent("UNKNOWN", 0, C0IBA.UNKNOWN.getValue());
        UNKNOWN = fallbackStatusComponent;
        FallbackStatusComponent fallbackStatusComponent2 = new FallbackStatusComponent("UNAVAILABLE", 1, C0IBA.UNAVAILABLE.getValue());
        UNAVAILABLE = fallbackStatusComponent2;
        FallbackStatusComponent fallbackStatusComponent3 = new FallbackStatusComponent("STORY_EXPIRED", 2, C0IBA.STORY_EXPIRED.getValue());
        STORY_EXPIRED = fallbackStatusComponent3;
        FallbackStatusComponent fallbackStatusComponent4 = new FallbackStatusComponent("FRIENDS_ONLY", 3, C0IBA.FRIENDS_ONLY.getValue());
        FRIENDS_ONLY = fallbackStatusComponent4;
        FallbackStatusComponent[] fallbackStatusComponentArr = {fallbackStatusComponent, fallbackStatusComponent2, fallbackStatusComponent3, fallbackStatusComponent4};
        $VALUES = fallbackStatusComponentArr;
        $ENTRIES = new C2254308sP(fallbackStatusComponentArr);
        Companion = new Object() { // from class: X.0IB9
        };
        CREATOR = new Parcelable.Creator<FallbackStatusComponent>() { // from class: X.0IBB
            @Override // android.os.Parcelable.Creator
            public final FallbackStatusComponent createFromParcel(Parcel parcel) {
                return FallbackStatusComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FallbackStatusComponent[] newArray(int i) {
                return new FallbackStatusComponent[i];
            }
        };
    }

    public static FallbackStatusComponent[] values() {
        return (FallbackStatusComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public C0IBA toProto() {
        return C0IBA.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static FallbackStatusComponent valueOf(String str) {
        return (FallbackStatusComponent) C08FF.LIZ(FallbackStatusComponent.class, str);
    }

    public FallbackStatusComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
