package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18ZU;
import X.C2188811AlT;
import X.C2243691Crn;
import X.C912420Zqq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class StickerCardFallbackInfoComponent implements BaseComponent<C2243691Crn> {
    public final ImageComponent placeholder;
    public static final C912420Zqq Companion = new Object() { // from class: X.0Zqq
    };
    public static final Parcelable.Creator<StickerCardFallbackInfoComponent> CREATOR = new Parcelable.Creator<StickerCardFallbackInfoComponent>() { // from class: X.0Zqr
        @Override // android.os.Parcelable.Creator
        public final StickerCardFallbackInfoComponent createFromParcel(Parcel parcel) {
            return new StickerCardFallbackInfoComponent(ImageComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StickerCardFallbackInfoComponent[] newArray(int i) {
            return new StickerCardFallbackInfoComponent[i];
        }
    };
    public static final StickerCardFallbackInfoComponent EMPTY_FALLBACK = new StickerCardFallbackInfoComponent(0);

    public StickerCardFallbackInfoComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickerCardFallbackInfoComponent) && Intrinsics.LJFF(this.placeholder, ((StickerCardFallbackInfoComponent) obj).placeholder);
    }

    public final int hashCode() {
        return this.placeholder.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerCardFallbackInfoComponent(placeholder=");
        sbLIZ.append(this.placeholder);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.placeholder.writeToParcel(parcel, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerCardFallbackInfoComponent(int i) {
        this(C18ZU.LIZ());
        ImageComponent.Companion.getClass();
    }

    public StickerCardFallbackInfoComponent(ImageComponent imageComponent) {
        this.placeholder = imageComponent;
    }
}
