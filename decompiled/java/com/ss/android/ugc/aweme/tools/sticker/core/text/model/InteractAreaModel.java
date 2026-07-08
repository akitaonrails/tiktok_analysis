package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C086I;
import X.C09CT;
import X.C19598511m3;
import X.C7740030o;
import X.EnumC19597511lt;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.l;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.InteractAreaModel;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class InteractAreaModel implements Parcelable, Serializable {

    @C09CT("user_avatar_url")
    public String avatarUrl;

    @C09CT("height")
    public float height;

    @C09CT("msg_type")
    public int messageType;

    @C09CT("nick_name")
    public String nickname;

    @C09CT("rotation")
    public float rotation;

    @C09CT("scale")
    public float scale;

    @C09CT("scenario")
    public int scenario;

    @C09CT("to_user_id")
    public String toUserId;

    @C09CT("user_name")
    public String userName;

    @C09CT("width")
    public float width;

    @C09CT("x")
    public float x;

    @C09CT("y")
    public float y;
    public static final Parcelable.Creator<InteractAreaModel> CREATOR = new Parcelable.Creator<InteractAreaModel>() { // from class: X.0wQh
        @Override // android.os.Parcelable.Creator
        public final InteractAreaModel createFromParcel(Parcel parcel) {
            return new InteractAreaModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final InteractAreaModel[] newArray(int i) {
            return new InteractAreaModel[i];
        }
    };
    public static final int $stable = 8;

    public final InteractAreaModel copy(String str, String str2, String str3, String str4, int i, float f, float f2, float f3, float f4, float f5, float f6, int i2) {
        return new InteractAreaModel(str, str2, str3, str4, i, f, f2, f3, f4, f5, f6, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractAreaModel)) {
            return false;
        }
        InteractAreaModel interactAreaModel = (InteractAreaModel) obj;
        return Intrinsics.LJFF(this.toUserId, interactAreaModel.toUserId) && Intrinsics.LJFF(this.userName, interactAreaModel.userName) && Intrinsics.LJFF(this.avatarUrl, interactAreaModel.avatarUrl) && Intrinsics.LJFF(this.nickname, interactAreaModel.nickname) && this.scenario == interactAreaModel.scenario && Float.compare(this.x, interactAreaModel.x) == 0 && Float.compare(this.y, interactAreaModel.y) == 0 && Float.compare(this.width, interactAreaModel.width) == 0 && Float.compare(this.height, interactAreaModel.height) == 0 && Float.compare(this.rotation, interactAreaModel.rotation) == 0 && Float.compare(this.scale, interactAreaModel.scale) == 0 && this.messageType == interactAreaModel.messageType;
    }

    public String toString() {
        return "InteractAreaModel(toUserId=" + this.toUserId + ", userName=" + this.userName + ", avatarUrl=" + this.avatarUrl + ", nickname=" + this.nickname + ", scenario=" + this.scenario + ", x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + ", scale=" + this.scale + ", messageType=" + this.messageType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.toUserId);
        parcel.writeString(this.userName);
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.nickname);
        parcel.writeInt(this.scenario);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
        parcel.writeFloat(this.rotation);
        parcel.writeFloat(this.scale);
        parcel.writeInt(this.messageType);
    }

    public InteractAreaModel() {
        this("", "", "", "", EnumC19597511lt.STORY_ANNIVERSARY_MENTION.getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1);
    }

    public final InteractStickerStruct generateInteractStruct() {
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setX(this.x);
        normalTrackTimeStamp.setY(this.y);
        interactStickerStruct.setType(8);
        normalTrackTimeStamp.setWidth(this.width);
        normalTrackTimeStamp.setHeight(this.height);
        normalTrackTimeStamp.setRotation(0.0f);
        normalTrackTimeStamp.setScale(Float.valueOf(this.scale));
        String str = this.toUserId;
        String str2 = this.userName;
        String str3 = this.nickname;
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(Collections.singletonList(this.avatarUrl));
        interactStickerStruct.setMentionInfo(new MentionStruct(str, "", str2, str3, urlModel));
        interactStickerStruct.getMentionInfo().setScenario(this.scenario);
        HashMap map = new HashMap();
        map.put("mention_sticker_id", CardStruct.IStatusCode.DEFAULT);
        interactStickerStruct.setAttr(GsonProtectorUtils.toJson(C19598511m3.LIZ(), map));
        linkedList.add(normalTrackTimeStamp);
        if (C086I.LIZIZ(linkedList)) {
            interactStickerStruct.setTrackList("");
            return interactStickerStruct;
        }
        try {
            interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), linkedList));
            return interactStickerStruct;
        } catch (l e) {
            TryCatchGuardChecker.doCheck(e);
            return interactStickerStruct;
        }
    }

    public int hashCode() {
        return (((((((((((((((((((((this.toUserId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.nickname.hashCode()) * 31) + this.scenario) * 31) + Float.floatToIntBits(this.x)) * 31) + Float.floatToIntBits(this.y)) * 31) + Float.floatToIntBits(this.width)) * 31) + Float.floatToIntBits(this.height)) * 31) + Float.floatToIntBits(this.rotation)) * 31) + Float.floatToIntBits(this.scale)) * 31) + this.messageType;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final float getHeight() {
        return this.height;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final int getScenario() {
        return this.scenario;
    }

    public final String getToUserId() {
        return this.toUserId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setMessageType(int i) {
        this.messageType = i;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setRotation(float f) {
        this.rotation = f;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setScenario(int i) {
        this.scenario = i;
    }

    public final void setToUserId(String str) {
        this.toUserId = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public InteractAreaModel(String str, String str2, String str3, String str4, int i, float f, float f2, float f3, float f4, float f5, float f6, int i2) {
        this.toUserId = str;
        this.userName = str2;
        this.avatarUrl = str3;
        this.nickname = str4;
        this.scenario = i;
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
        this.rotation = f5;
        this.scale = f6;
        this.messageType = i2;
    }
}
