package com.ss.android.ugc.aweme.tools.sticker.core.liveevent;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C19591311kt;
import X.C19633811rk;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveEventCountDownStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("editable")
    public final boolean editable;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("event_id")
    public final long eventId;

    @C09CT("is_default_title")
    public final boolean isDefaultTitle;

    @C09CT("last_edit_time")
    public final long lastEditTime;

    @C09CT("max_line")
    public int maxLine;

    @C09CT("is_subscribed")
    public Boolean subscribe;

    @C09CT("subscribe_count")
    public long subscribeNum;

    @C09CT("text_already_ended")
    public String textAlreadyExpired;

    @C09CT("text_already_subscribed")
    public String textAlreadySubscribed;

    @C09CT("text_to_be_subscribed")
    public String textTobeSubscribed;

    @C09CT("title")
    public String title;

    @C09CT("visible")
    public final boolean visible;
    public static final C19633811rk Companion = new Object() { // from class: X.11rk
    };
    public static final Parcelable.Creator<LiveEventCountDownStickerModel> CREATOR = new Parcelable.Creator<LiveEventCountDownStickerModel>() { // from class: X.0oGW
        @Override // android.os.Parcelable.Creator
        public final LiveEventCountDownStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
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
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            long j4 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new LiveEventCountDownStickerModel(baseStickerModelCreateFromParcel, string, j, j2, j3, boolValueOf, string2, string3, string4, i, z2, z3, z4, j4, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final LiveEventCountDownStickerModel[] newArray(int i) {
            return new LiveEventCountDownStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public LiveEventCountDownStickerModel() {
        this(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), null, 0L, System.currentTimeMillis(), 0L, Boolean.FALSE, "", "", "", 1, true, false, true, 0L, false);
    }

    public final LiveEventCountDownStickerModel copy(BaseStickerModel baseStickerModel, String str, long j, long j2, long j3, Boolean bool, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3, long j4, boolean z4) {
        return new LiveEventCountDownStickerModel(baseStickerModel, str, j, j2, j3, bool, str2, str3, str4, i, z, z2, z3, j4, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveEventCountDownStickerModel)) {
            return false;
        }
        LiveEventCountDownStickerModel liveEventCountDownStickerModel = (LiveEventCountDownStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, liveEventCountDownStickerModel.baseStickerModel) && Intrinsics.LJFF(this.title, liveEventCountDownStickerModel.title) && this.endTime == liveEventCountDownStickerModel.endTime && this.lastEditTime == liveEventCountDownStickerModel.lastEditTime && this.subscribeNum == liveEventCountDownStickerModel.subscribeNum && Intrinsics.LJFF(this.subscribe, liveEventCountDownStickerModel.subscribe) && Intrinsics.LJFF(this.textAlreadyExpired, liveEventCountDownStickerModel.textAlreadyExpired) && Intrinsics.LJFF(this.textTobeSubscribed, liveEventCountDownStickerModel.textTobeSubscribed) && Intrinsics.LJFF(this.textAlreadySubscribed, liveEventCountDownStickerModel.textAlreadySubscribed) && this.maxLine == liveEventCountDownStickerModel.maxLine && this.clickable == liveEventCountDownStickerModel.clickable && this.editable == liveEventCountDownStickerModel.editable && this.visible == liveEventCountDownStickerModel.visible && this.eventId == liveEventCountDownStickerModel.eventId && this.isDefaultTitle == liveEventCountDownStickerModel.isDefaultTitle;
    }

    public final String getStickerId() {
        return "6903504628151751170";
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.endTime)) * 31) + C786410Ut5.Y2(this.lastEditTime)) * 31) + C786410Ut5.Y2(this.subscribeNum)) * 31;
        Boolean bool = this.subscribe;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.textAlreadyExpired;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textTobeSubscribed;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textAlreadySubscribed;
        return ((((((((((((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.maxLine) * 31) + C786410Ut5.Z2(this.clickable)) * 31) + C786410Ut5.Z2(this.editable)) * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Y2(this.eventId)) * 31) + C786410Ut5.Z2(this.isDefaultTitle);
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
        return "LiveEventCountDownStickerModel(baseStickerModel=" + this.baseStickerModel + ", title=" + this.title + ", endTime=" + this.endTime + ", lastEditTime=" + this.lastEditTime + ", subscribeNum=" + this.subscribeNum + ", subscribe=" + this.subscribe + ", textAlreadyExpired=" + this.textAlreadyExpired + ", textTobeSubscribed=" + this.textTobeSubscribed + ", textAlreadySubscribed=" + this.textAlreadySubscribed + ", maxLine=" + this.maxLine + ", clickable=" + this.clickable + ", editable=" + this.editable + ", visible=" + this.visible + ", eventId=" + this.eventId + ", isDefaultTitle=" + this.isDefaultTitle + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeLong(this.endTime);
        parcel.writeLong(this.lastEditTime);
        parcel.writeLong(this.subscribeNum);
        Boolean bool = this.subscribe;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.textAlreadyExpired);
        parcel.writeString(this.textTobeSubscribed);
        parcel.writeString(this.textAlreadySubscribed);
        parcel.writeInt(this.maxLine);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeLong(this.eventId);
        parcel.writeInt(this.isDefaultTitle ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        CountDownStickerStruct countDownStickerStruct = new CountDownStickerStruct(this.title, this.endTime / ((long) LSPassThroughRecordSizeConfig.DEFAULT), this.subscribeNum, this.subscribe, this.textAlreadyExpired, this.textTobeSubscribed, this.textAlreadySubscribed);
        countDownStickerStruct.setEventId(this.eventId);
        interactStickerStructLIZLLL.setCountDownStickerStruct(countDownStickerStruct);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return this.eventId != 0;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getEventId() {
        return this.eventId;
    }

    public final long getLastEditTime() {
        return this.lastEditTime;
    }

    public final int getMaxLine() {
        return this.maxLine;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return EnumC1466150oFx.LIVE_EVENT_COUNTDOWN;
    }

    public final Boolean getSubscribe() {
        return this.subscribe;
    }

    public final long getSubscribeNum() {
        return this.subscribeNum;
    }

    public final String getTextAlreadyExpired() {
        return this.textAlreadyExpired;
    }

    public final String getTextAlreadySubscribed() {
        return this.textAlreadySubscribed;
    }

    public final String getTextTobeSubscribed() {
        return this.textTobeSubscribed;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final boolean isDefaultTitle() {
        return this.isDefaultTitle;
    }

    public final void setMaxLine(int i) {
        this.maxLine = i;
    }

    public final void setSubscribe(Boolean bool) {
        this.subscribe = bool;
    }

    public final void setSubscribeNum(long j) {
        this.subscribeNum = j;
    }

    public final void setTextAlreadyExpired(String str) {
        this.textAlreadyExpired = str;
    }

    public final void setTextAlreadySubscribed(String str) {
        this.textAlreadySubscribed = str;
    }

    public final void setTextTobeSubscribed(String str) {
        this.textTobeSubscribed = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.title, this.endTime, this.lastEditTime, this.subscribeNum, this.subscribe, this.textAlreadyExpired, this.textTobeSubscribed, this.textAlreadySubscribed, this.maxLine, this.clickable, this.editable, this.visible, this.eventId, this.isDefaultTitle);
    }

    public LiveEventCountDownStickerModel(BaseStickerModel baseStickerModel, String str, long j, long j2, long j3, Boolean bool, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3, long j4, boolean z4) {
        this.baseStickerModel = baseStickerModel;
        this.title = str;
        this.endTime = j;
        this.lastEditTime = j2;
        this.subscribeNum = j3;
        this.subscribe = bool;
        this.textAlreadyExpired = str2;
        this.textTobeSubscribed = str3;
        this.textAlreadySubscribed = str4;
        this.maxLine = i;
        this.clickable = z;
        this.editable = z2;
        this.visible = z3;
        this.eventId = j4;
        this.isDefaultTitle = z4;
    }
}
