package com.ss.android.ugc.aweme.tools.sticker.core.liveshare;

import X.AbstractC1442160ndG;
import X.C040H;
import X.C09CT;
import X.C0FKI;
import X.C123100dR;
import X.C1440500naa;
import X.C19591311kt;
import X.C2188811AlT;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.model.LiveShareStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class LiveShareStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public BaseStickerModel baseStickerModel;

    @C09CT("live_owner_name")
    public String liveOwnerName;

    @C040H
    public LiveRoomStruct liveRoomStruct;

    @C09CT("room_id")
    public String roomId;
    public static final Parcelable.Creator<LiveShareStickerModel> CREATOR = new Parcelable.Creator<LiveShareStickerModel>() { // from class: X.0oGV
        @Override // android.os.Parcelable.Creator
        public final LiveShareStickerModel createFromParcel(Parcel parcel) {
            return new LiveShareStickerModel(BaseStickerModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (LiveRoomStruct) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final LiveShareStickerModel[] newArray(int i) {
            return new LiveShareStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public LiveShareStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.LIVE_SHARE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), "", "", null);
    }

    public final LiveShareStickerModel copy(BaseStickerModel baseStickerModel, String str, String str2, LiveRoomStruct liveRoomStruct) {
        return new LiveShareStickerModel(baseStickerModel, str, str2, liveRoomStruct);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveShareStickerModel)) {
            return false;
        }
        LiveShareStickerModel liveShareStickerModel = (LiveShareStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, liveShareStickerModel.baseStickerModel) && Intrinsics.LJFF(this.roomId, liveShareStickerModel.roomId) && Intrinsics.LJFF(this.liveOwnerName, liveShareStickerModel.liveOwnerName) && Intrinsics.LJFF(this.liveRoomStruct, liveShareStickerModel.liveRoomStruct);
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        String str = this.roomId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.liveOwnerName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LiveRoomStruct liveRoomStruct = this.liveRoomStruct;
        return iHashCode3 + (liveRoomStruct != null ? liveRoomStruct.hashCode() : 0);
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
        sbLIZ.append("LiveShareStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", liveOwnerName=");
        sbLIZ.append(this.liveOwnerName);
        sbLIZ.append(", liveRoomStruct=");
        sbLIZ.append(this.liveRoomStruct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.roomId);
        parcel.writeString(this.liveOwnerName);
        parcel.writeSerializable(this.liveRoomStruct);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        String str = this.roomId;
        interactStickerStructLIZLLL.setLiveShareStickerStruct(new LiveShareStickerStruct(str != null ? Long.valueOf(CastLongProtector.parseLong(str)) : null, this.liveOwnerName));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return C123100dR.LIZ(this.roomId) && C123100dR.LIZ(this.liveOwnerName);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final String getLiveOwnerName() {
        return this.liveOwnerName;
    }

    public final LiveRoomStruct getLiveRoomStruct() {
        return this.liveRoomStruct;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final void setBaseStickerModel(BaseStickerModel baseStickerModel) {
        this.baseStickerModel = baseStickerModel;
    }

    public final void setLiveOwnerName(String str) {
        this.liveOwnerName = str;
    }

    public final void setLiveRoomStruct(LiveRoomStruct liveRoomStruct) {
        this.liveRoomStruct = liveRoomStruct;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public LiveShareStickerModel(BaseStickerModel baseStickerModel, String str, String str2, LiveRoomStruct liveRoomStruct) {
        this.baseStickerModel = baseStickerModel;
        this.roomId = str;
        this.liveOwnerName = str2;
        this.liveRoomStruct = liveRoomStruct;
    }
}
