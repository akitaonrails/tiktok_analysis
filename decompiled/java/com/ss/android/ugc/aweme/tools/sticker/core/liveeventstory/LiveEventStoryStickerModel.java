package com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C13LP;
import X.C1440500naa;
import X.C19591311kt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.BackgroundMessage;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveEventStoryStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("event_id")
    public final long eventId;

    @C09CT("is_subscribed")
    public Boolean subscribe;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<LiveEventStoryStickerModel> CREATOR = new Parcelable.Creator<LiveEventStoryStickerModel>() { // from class: X.0oGC
        @Override // android.os.Parcelable.Creator
        public final LiveEventStoryStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new LiveEventStoryStickerModel(baseStickerModelCreateFromParcel, string, j, boolValueOf, parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LiveEventStoryStickerModel[] newArray(int i) {
            return new LiveEventStoryStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public final LiveEventStoryStickerModel copy(BaseStickerModel baseStickerModel, String str, long j, Boolean bool, long j2, String str2) {
        return new LiveEventStoryStickerModel(baseStickerModel, str, j, bool, j2, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveEventStoryStickerModel)) {
            return false;
        }
        LiveEventStoryStickerModel liveEventStoryStickerModel = (LiveEventStoryStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, liveEventStoryStickerModel.baseStickerModel) && Intrinsics.LJFF(this.title, liveEventStoryStickerModel.title) && this.endTime == liveEventStoryStickerModel.endTime && Intrinsics.LJFF(this.subscribe, liveEventStoryStickerModel.subscribe) && this.eventId == liveEventStoryStickerModel.eventId && Intrinsics.LJFF(this.backgroundColor, liveEventStoryStickerModel.backgroundColor);
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.endTime)) * 31;
        Boolean bool = this.subscribe;
        int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Y2(this.eventId)) * 31;
        String str2 = this.backgroundColor;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveEventStoryStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", subscribe=");
        sbLIZ.append(this.subscribe);
        sbLIZ.append(", eventId=");
        sbLIZ.append(this.eventId);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeLong(this.endTime);
        Boolean bool = this.subscribe;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeLong(this.eventId);
        parcel.writeString(this.backgroundColor);
    }

    public LiveEventStoryStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.LIVE_EVENT_STORY, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -100663301, 15, null), null, 0L, Boolean.FALSE, 0L, null);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        List listLJJLIIIJILLIZJL;
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        CountDownStickerStruct countDownStickerStruct = new CountDownStickerStruct(this.title, this.endTime, 0L, this.subscribe, "", "", "");
        countDownStickerStruct.setEventId(this.eventId);
        String str = this.backgroundColor;
        countDownStickerStruct.setBackgroundMessage((str == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) == null) ? null : new BackgroundMessage((String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL), (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL)));
        interactStickerStructLIZLLL.setCountDownStickerStruct(countDownStickerStruct);
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return this.eventId != 0;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getEventId() {
        return this.eventId;
    }

    public final Boolean getSubscribe() {
        return this.subscribe;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setSubscribe(Boolean bool) {
        this.subscribe = bool;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public LiveEventStoryStickerModel(BaseStickerModel baseStickerModel, String str, long j, Boolean bool, long j2, String str2) {
        this.baseStickerModel = baseStickerModel;
        this.title = str;
        this.endTime = j;
        this.subscribe = bool;
        this.eventId = j2;
        this.backgroundColor = str2;
    }
}
