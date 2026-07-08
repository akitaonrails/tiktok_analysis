package com.ss.android.ugc.aweme.shortvideo;

import X.C09CS;
import X.C09CT;
import X.C12YO;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.mapping.AVChallengeExtrasAdapterFactory;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public class AVChallenge implements Serializable, Parcelable {
    public static final Parcelable.Creator<AVChallenge> CREATOR = new C12YO(0);

    @C09CT("activity_creation_schema")
    public String activityCreationSchema;

    @C09CT("align")
    public int align;

    @C09CT("can_use_under_line")
    public boolean canUseUnderLine;

    @C09CT("cha_type")
    public int chaType;

    @C09CT("cha_name")
    public String challengeName;

    @C09CT("cid")
    public String cid;

    @C09CT("dynamic_activity_info")
    public String dynamicRecordActivityInfo;

    @C09CT("game_tpl_id")
    public String dynamicRecordLynxChannel;

    @C09CS(AVChallengeExtrasAdapterFactory.class)
    public HashMap<String, Serializable> extras;

    @C09CT("group_id")
    public String groupId;

    @C09CT("init_offset_isLeftAxis")
    public boolean initOffsetIsLeftAxis;

    @C09CT("init_offset_x")
    public float initOffsetX;

    @C09CT("init_offset_y")
    public float initOffsetY;

    @C09CT("is_commerce")
    public boolean isCommerce;

    @C09CT("is_strong_music")
    public int isStrongMusic;

    @C09CT("log_id")
    public String logId;

    @C09CT("is_status")
    public Boolean mStatus;

    @C09CT("with_sticker_on_edit_page")
    public int mWithStickerOnEditPage;

    @C09CT("music_id")
    public String musicId;

    @C09CT("mv_id")
    public String mvId;

    @C09CT("use_count")
    public long postCount;

    @C09CT("query_id")
    public String queryId;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("text_color")
    public int textColor;

    @C09CT("text_size")
    public float textSize;

    @C09CT("type")
    public int type;

    @C09CT("user_count")
    public int userCount;

    @C09CT("view_count")
    public long viewCount;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        String str2 = this.challengeName;
        return str2 != null ? str2.hashCode() : super.hashCode();
    }

    public AVChallenge() {
        this.viewCount = -1L;
        this.postCount = -1L;
        this.textSize = 24.0f;
        this.textColor = -1;
        this.align = 2;
        this.canUseUnderLine = true;
        this.mStatus = Boolean.FALSE;
        this.chaType = -1;
        this.extras = new HashMap<>();
    }

    public long getDisplayCount() {
        long viewCount = getViewCount();
        return viewCount < 0 ? getUserCount() : viewCount;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getCid() {
        return this.cid;
    }

    public Map<String, Serializable> getExtras() {
        return this.extras;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public float getInitOffsetX() {
        return this.initOffsetX;
    }

    public float getInitOffsetY() {
        return this.initOffsetY;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMvId() {
        return this.mvId;
    }

    public long getPostCount() {
        return this.postCount;
    }

    public Boolean getStatus() {
        return this.mStatus;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public int getWithStickerOnEditPage() {
        return this.mWithStickerOnEditPage;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public AVChallenge(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.viewCount = -1L;
        this.postCount = -1L;
        this.textSize = 24.0f;
        this.textColor = -1;
        this.align = 2;
        this.canUseUnderLine = true;
        this.mStatus = Boolean.FALSE;
        this.chaType = -1;
        this.extras = new HashMap<>();
        this.cid = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isCommerce = z;
        this.challengeName = parcel.readString();
        this.type = parcel.readInt();
        this.stickerId = parcel.readString();
        this.viewCount = parcel.readLong();
        this.userCount = parcel.readInt();
        this.musicId = parcel.readString();
        this.mvId = parcel.readString();
        this.mWithStickerOnEditPage = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mStatus = Boolean.valueOf(z2);
        this.extras = (HashMap) parcel.readSerializable();
        this.initOffsetX = parcel.readFloat();
        this.initOffsetY = parcel.readFloat();
        this.textSize = parcel.readFloat();
        this.textColor = parcel.readInt();
        this.align = parcel.readInt();
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.initOffsetIsLeftAxis = z3;
        this.canUseUnderLine = parcel.readInt() == 1;
        this.dynamicRecordLynxChannel = parcel.readString();
        this.activityCreationSchema = parcel.readString();
        this.queryId = parcel.readString();
        this.logId = parcel.readString();
        this.chaType = parcel.readInt();
        this.isStrongMusic = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AVChallenge) {
            AVChallenge aVChallenge = (AVChallenge) obj;
            if (TextUtils.equals(aVChallenge.cid, this.cid) && TextUtils.equals(aVChallenge.challengeName, this.challengeName)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public <T extends Serializable> T getFromExtra(String str) {
        Serializable serializable = this.extras.get(str);
        if (serializable == null) {
            return null;
        }
        return (T) serializable;
    }

    public boolean isNew(String str) {
        if (TextUtils.isEmpty(this.cid) && !TextUtils.isEmpty(str) && str.equals(this.challengeName)) {
            return true;
        }
        return false;
    }

    public void setWithStickerOnEditPage(int i) {
        this.mWithStickerOnEditPage = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cid);
        parcel.writeByte(this.isCommerce ? (byte) 1 : (byte) 0);
        parcel.writeString(this.challengeName);
        parcel.writeInt(this.type);
        parcel.writeString(this.stickerId);
        parcel.writeLong(this.viewCount);
        parcel.writeInt(this.userCount);
        parcel.writeString(this.musicId);
        parcel.writeString(this.mvId);
        parcel.writeInt(this.mWithStickerOnEditPage);
        parcel.writeByte(this.mStatus.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.extras);
        parcel.writeFloat(this.initOffsetX);
        parcel.writeFloat(this.initOffsetY);
        parcel.writeFloat(this.textSize);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.align);
        parcel.writeInt(this.initOffsetIsLeftAxis ? 1 : 0);
        parcel.writeInt(this.canUseUnderLine ? 1 : 0);
        parcel.writeString(this.dynamicRecordLynxChannel);
        parcel.writeString(this.activityCreationSchema);
        parcel.writeString(this.queryId);
        parcel.writeString(this.logId);
        parcel.writeInt(this.chaType);
        parcel.writeInt(this.isStrongMusic);
    }
}
