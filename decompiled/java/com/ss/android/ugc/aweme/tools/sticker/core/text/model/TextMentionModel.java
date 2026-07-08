package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C19591311kt;
import X.C19598511m3;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import X.EnumC19597511lt;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMentionModel;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextMentionModel implements Serializable, Parcelable {

    @C09CT("url_model")
    public final UrlModel avatarThumb;

    @C09CT("base_sticker_model")
    public BaseStickerModel baseStickerModel;

    @C09CT("is_story_streak_mention")
    public final boolean isStoryStreakMention;

    @C09CT("mention_bottom")
    public final int mentionBottom;

    @C09CT("mention_end_index")
    public final int mentionEndIndex;

    @C09CT("mention_left")
    public final int mentionLeft;

    @C09CT("mention_right")
    public final int mentionRight;

    @C09CT("mention_start_index")
    public final int mentionStartIndex;

    @C09CT("mention_text")
    public final String mentionText;

    @C09CT("mention_top")
    public final int mentionTop;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("original_text_view_height")
    public final int originalTextViewHeight;

    @C09CT("original_text_view_width")
    public final int originalTextViewWidth;

    @C09CT("secUid")
    public final String secUid;

    @C09CT("uid")
    public final String uid;

    @C09CT("user_name")
    public final String username;
    public static final Parcelable.Creator<TextMentionModel> CREATOR = new Parcelable.Creator<TextMentionModel>() { // from class: X.0FMU
        @Override // android.os.Parcelable.Creator
        public final TextMentionModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TextMentionModel(string, string2, string3, string4, urlModel, i, i2, i3, i4, i5, i6, string5, z, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TextMentionModel[] newArray(int i) {
            return new TextMentionModel[i];
        }
    };
    public static final int $stable = 8;

    public final TextMentionModel copy(String str, String str2, String str3, String str4, UrlModel urlModel, int i, int i2, int i3, int i4, int i5, int i6, String str5, boolean z, int i7, int i8) {
        return new TextMentionModel(str, str2, str3, str4, urlModel, i, i2, i3, i4, i5, i6, str5, z, i7, i8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMentionModel)) {
            return false;
        }
        TextMentionModel textMentionModel = (TextMentionModel) obj;
        return Intrinsics.LJFF(this.uid, textMentionModel.uid) && Intrinsics.LJFF(this.secUid, textMentionModel.secUid) && Intrinsics.LJFF(this.username, textMentionModel.username) && Intrinsics.LJFF(this.nickname, textMentionModel.nickname) && Intrinsics.LJFF(this.avatarThumb, textMentionModel.avatarThumb) && this.mentionLeft == textMentionModel.mentionLeft && this.mentionTop == textMentionModel.mentionTop && this.mentionRight == textMentionModel.mentionRight && this.mentionBottom == textMentionModel.mentionBottom && this.mentionStartIndex == textMentionModel.mentionStartIndex && this.mentionEndIndex == textMentionModel.mentionEndIndex && Intrinsics.LJFF(this.mentionText, textMentionModel.mentionText) && this.isStoryStreakMention == textMentionModel.isStoryStreakMention && this.originalTextViewWidth == textMentionModel.originalTextViewWidth && this.originalTextViewHeight == textMentionModel.originalTextViewHeight;
    }

    public int hashCode() {
        int iHashCode = ((((((this.uid.hashCode() * 31) + this.secUid.hashCode()) * 31) + this.username.hashCode()) * 31) + this.nickname.hashCode()) * 31;
        UrlModel urlModel = this.avatarThumb;
        int iHashCode2 = (((((((((((((iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.mentionLeft) * 31) + this.mentionTop) * 31) + this.mentionRight) * 31) + this.mentionBottom) * 31) + this.mentionStartIndex) * 31) + this.mentionEndIndex) * 31;
        String str = this.mentionText;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isStoryStreakMention)) * 31) + this.originalTextViewWidth) * 31) + this.originalTextViewHeight;
    }

    public String toString() {
        return "TextMentionModel(uid=" + this.uid + ", secUid=" + this.secUid + ", username=" + this.username + ", nickname=" + this.nickname + ", avatarThumb=" + this.avatarThumb + ", mentionLeft=" + this.mentionLeft + ", mentionTop=" + this.mentionTop + ", mentionRight=" + this.mentionRight + ", mentionBottom=" + this.mentionBottom + ", mentionStartIndex=" + this.mentionStartIndex + ", mentionEndIndex=" + this.mentionEndIndex + ", mentionText=" + this.mentionText + ", isStoryStreakMention=" + this.isStoryStreakMention + ", originalTextViewWidth=" + this.originalTextViewWidth + ", originalTextViewHeight=" + this.originalTextViewHeight + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.secUid);
        parcel.writeString(this.username);
        parcel.writeString(this.nickname);
        parcel.writeSerializable(this.avatarThumb);
        parcel.writeInt(this.mentionLeft);
        parcel.writeInt(this.mentionTop);
        parcel.writeInt(this.mentionRight);
        parcel.writeInt(this.mentionBottom);
        parcel.writeInt(this.mentionStartIndex);
        parcel.writeInt(this.mentionEndIndex);
        parcel.writeString(this.mentionText);
        parcel.writeInt(this.isStoryStreakMention ? 1 : 0);
        parcel.writeInt(this.originalTextViewWidth);
        parcel.writeInt(this.originalTextViewHeight);
    }

    public final BaseStickerModel getBaseModel() {
        BaseStickerModel baseStickerModel = this.baseStickerModel;
        return baseStickerModel == null ? new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null) : baseStickerModel;
    }

    public final InteractStickerStruct getInteractStickerStruct() {
        C19591311kt c19591311kt = C19591311kt.LIZ;
        int type = EnumC1466150oFx.MENTION.getType();
        BaseStickerModel baseModel = getBaseModel();
        c19591311kt.getClass();
        InteractStickerStruct interactStickerStructLIZJ = C19591311kt.LIZJ(type, baseModel, true);
        interactStickerStructLIZJ.setMentionInfo(new MentionStruct(this.uid, this.secUid, this.username, this.nickname, this.avatarThumb));
        interactStickerStructLIZJ.getMentionInfo().setScenario(EnumC19597511lt.CAPTION_MODE.getValue());
        interactStickerStructLIZJ.setIndex(getBaseModel().getZIndex());
        HashMap map = new HashMap();
        map.put("mention_sticker_id", String.valueOf(getBaseModel().getId()));
        interactStickerStructLIZJ.setAttr(GsonProtectorUtils.toJson(C19598511m3.LIZ(), map));
        return interactStickerStructLIZJ;
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final int getMentionBottom() {
        return this.mentionBottom;
    }

    public final int getMentionEndIndex() {
        return this.mentionEndIndex;
    }

    public final int getMentionLeft() {
        return this.mentionLeft;
    }

    public final int getMentionRight() {
        return this.mentionRight;
    }

    public final int getMentionStartIndex() {
        return this.mentionStartIndex;
    }

    public final String getMentionText() {
        return this.mentionText;
    }

    public final int getMentionTop() {
        return this.mentionTop;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final int getOriginalTextViewHeight() {
        return this.originalTextViewHeight;
    }

    public final int getOriginalTextViewWidth() {
        return this.originalTextViewWidth;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean isStoryStreakMention() {
        return this.isStoryStreakMention;
    }

    public final void setBaseSticker(BaseStickerModel baseStickerModel) {
        float width;
        float height = 1.0f;
        if (this.originalTextViewWidth > 0 && baseStickerModel.getWidth() > 0) {
            width = baseStickerModel.getWidth() / this.originalTextViewWidth;
        } else {
            width = 1.0f;
        }
        if (this.originalTextViewHeight > 0 && baseStickerModel.getHeight() > 0) {
            height = baseStickerModel.getHeight() / this.originalTextViewHeight;
        }
        float f = this.mentionLeft * width;
        float f2 = this.mentionRight * width;
        float f3 = this.mentionTop * height;
        float f4 = this.mentionBottom * height;
        float width2 = (((f + f2) / 2.0f) - (baseStickerModel.getWidth() / 2)) * baseStickerModel.getScale();
        float height2 = (((f3 + f4) / 2.0f) - (baseStickerModel.getHeight() / 2)) * baseStickerModel.getScale();
        double radians = Math.toRadians(baseStickerModel.getRotation());
        double d = width2;
        double d2 = height2;
        double dCos = (Math.cos(radians) * d) - (Math.sin(radians) * d2);
        double dSin = (d * Math.sin(radians)) + (d2 * Math.cos(radians));
        this.baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.MENTION, 0, 0, 0.0f, 0.0f, Math.abs((int) (f2 - f)), (int) (f4 - f3), 0, 0, 0, 0, baseStickerModel.getMediaWidth(), baseStickerModel.getMediaHeight(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, (float) (((double) baseStickerModel.getTranslateX()) + dCos), (float) (((double) baseStickerModel.getTranslateY()) + dSin), baseStickerModel.getScale(), baseStickerModel.getRotation(), baseStickerModel.getStartTime(), baseStickerModel.getEndTime(), false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -132145541, 15, null);
    }

    public final void setBaseStickerModel(BaseStickerModel baseStickerModel) {
        this.baseStickerModel = baseStickerModel;
    }

    public TextMentionModel(String str, String str2, String str3, String str4, UrlModel urlModel, int i, int i2, int i3, int i4, int i5, int i6, String str5, boolean z, int i7, int i8) {
        this.uid = str;
        this.secUid = str2;
        this.username = str3;
        this.nickname = str4;
        this.avatarThumb = urlModel;
        this.mentionLeft = i;
        this.mentionTop = i2;
        this.mentionRight = i3;
        this.mentionBottom = i4;
        this.mentionStartIndex = i5;
        this.mentionEndIndex = i6;
        this.mentionText = str5;
        this.isStoryStreakMention = z;
        this.originalTextViewWidth = i7;
        this.originalTextViewHeight = i8;
    }
}
