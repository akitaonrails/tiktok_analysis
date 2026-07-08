package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C0IBL;
import X.C0IBN;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.RepostCardStatusComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class RepostCardStatusComponent implements BaseComponent<C0IBL> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ RepostCardStatusComponent[] $VALUES;
    public static final Parcelable.Creator<RepostCardStatusComponent> CREATOR;
    public static final C0IBN Companion;
    public static final RepostCardStatusComponent REPOST_CARD_STATUS_POST_INVISIBLE;
    public static final RepostCardStatusComponent REPOST_CARD_STATUS_REPOST_INVISIBLE;
    public static final RepostCardStatusComponent REPOST_CARD_STATUS_REPOST_SUCCESS;
    public static final RepostCardStatusComponent REPOST_CARD_STATUS_REPOST_UNKNOWN;
    public final int value;

    public static InterfaceC2044707zh<RepostCardStatusComponent> getEntries() {
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

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0IBN] */
    static {
        RepostCardStatusComponent repostCardStatusComponent = new RepostCardStatusComponent("REPOST_CARD_STATUS_REPOST_UNKNOWN", 0, 0);
        REPOST_CARD_STATUS_REPOST_UNKNOWN = repostCardStatusComponent;
        RepostCardStatusComponent repostCardStatusComponent2 = new RepostCardStatusComponent("REPOST_CARD_STATUS_REPOST_SUCCESS", 1, 1);
        REPOST_CARD_STATUS_REPOST_SUCCESS = repostCardStatusComponent2;
        RepostCardStatusComponent repostCardStatusComponent3 = new RepostCardStatusComponent("REPOST_CARD_STATUS_REPOST_INVISIBLE", 2, 2);
        REPOST_CARD_STATUS_REPOST_INVISIBLE = repostCardStatusComponent3;
        RepostCardStatusComponent repostCardStatusComponent4 = new RepostCardStatusComponent("REPOST_CARD_STATUS_POST_INVISIBLE", 3, 3);
        REPOST_CARD_STATUS_POST_INVISIBLE = repostCardStatusComponent4;
        RepostCardStatusComponent[] repostCardStatusComponentArr = {repostCardStatusComponent, repostCardStatusComponent2, repostCardStatusComponent3, repostCardStatusComponent4};
        $VALUES = repostCardStatusComponentArr;
        $ENTRIES = new C2254308sP(repostCardStatusComponentArr);
        Companion = new Object() { // from class: X.0IBN
        };
        CREATOR = new Parcelable.Creator<RepostCardStatusComponent>() { // from class: X.0IBK
            @Override // android.os.Parcelable.Creator
            public final RepostCardStatusComponent createFromParcel(Parcel parcel) {
                return RepostCardStatusComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RepostCardStatusComponent[] newArray(int i) {
                return new RepostCardStatusComponent[i];
            }
        };
    }

    public static RepostCardStatusComponent[] values() {
        return (RepostCardStatusComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public C0IBL toProto() {
        return C0IBL.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static RepostCardStatusComponent valueOf(String str) {
        return (RepostCardStatusComponent) C08FF.LIZ(RepostCardStatusComponent.class, str);
    }

    public RepostCardStatusComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
