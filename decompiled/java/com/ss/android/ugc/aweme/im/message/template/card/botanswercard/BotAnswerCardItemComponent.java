package com.ss.android.ugc.aweme.im.message.template.card.botanswercard;

import X.C2188811AlT;
import X.C2244431Csz;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.botanswercard.BotAnswerCardItemComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class BotAnswerCardItemComponent implements BaseComponent<C2244431Csz> {
    public static final Parcelable.Creator<BotAnswerCardItemComponent> CREATOR = new Parcelable.Creator<BotAnswerCardItemComponent>() { // from class: X.18jr
        @Override // android.os.Parcelable.Creator
        public final BotAnswerCardItemComponent createFromParcel(Parcel parcel) {
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            Parcelable.Creator<ImageComponent> creator = ImageComponent.CREATOR;
            return new BotAnswerCardItemComponent(j, j2, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BotAnswerCardItemComponent[] newArray(int i) {
            return new BotAnswerCardItemComponent[i];
        }
    };
    public final ImageComponent cover;
    public final long diggCount;
    public final ImageComponent fallback;
    public final long itemId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotAnswerCardItemComponent)) {
            return false;
        }
        BotAnswerCardItemComponent botAnswerCardItemComponent = (BotAnswerCardItemComponent) obj;
        return this.itemId == botAnswerCardItemComponent.itemId && this.diggCount == botAnswerCardItemComponent.diggCount && Intrinsics.LJFF(this.cover, botAnswerCardItemComponent.cover) && Intrinsics.LJFF(this.fallback, botAnswerCardItemComponent.fallback);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.itemId) * 31) + C786410Ut5.Y2(this.diggCount)) * 31) + this.cover.hashCode()) * 31) + this.fallback.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotAnswerCardItemComponent(itemId=");
        sbLIZ.append(this.itemId);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(this.diggCount);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.cover);
        sbLIZ.append(", fallback=");
        sbLIZ.append(this.fallback);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.itemId);
        parcel.writeLong(this.diggCount);
        this.cover.writeToParcel(parcel, i);
        this.fallback.writeToParcel(parcel, i);
    }

    public BotAnswerCardItemComponent(long j, long j2, ImageComponent imageComponent, ImageComponent imageComponent2) {
        this.itemId = j;
        this.diggCount = j2;
        this.cover = imageComponent;
        this.fallback = imageComponent2;
    }
}
