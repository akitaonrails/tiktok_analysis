package com.ss.android.ugc.aweme.emojislider.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.emojislider.model.EmojiSliderStickerStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class EmojiSliderStickerStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<EmojiSliderStickerStruct> CREATOR = new Parcelable.Creator<EmojiSliderStickerStruct>() { // from class: X.0wRY
        @Override // android.os.Parcelable.Creator
        public final EmojiSliderStickerStruct createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new EmojiSliderStickerStruct(string, string2, string3, string4, numValueOf, lValueOf, lValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final EmojiSliderStickerStruct[] newArray(int i) {
            return new EmojiSliderStickerStruct[i];
        }
    };

    @C09CT("android_ver")
    public String androidVer;

    @C09CT("answer_count")
    public Long answerCount;

    @C09CT("emoji_content")
    public String emojiContent;

    @C09CT("ios_ver")
    public String iosVer;

    @C09CT("prompt_text")
    public String questionText;

    @C09CT("answer_avg")
    public Long voteAverage;

    @C09CT("user_slider_value")
    public Integer voteVal;

    public EmojiSliderStickerStruct() {
        this(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, "", "", null, null, null);
    }

    public final EmojiSliderStickerStruct copy(String str, String str2, String str3, String str4, Integer num, Long l, Long l2) {
        return new EmojiSliderStickerStruct(str, str2, str3, str4, num, l, l2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiSliderStickerStruct)) {
            return false;
        }
        EmojiSliderStickerStruct emojiSliderStickerStruct = (EmojiSliderStickerStruct) obj;
        return Intrinsics.LJFF(this.androidVer, emojiSliderStickerStruct.androidVer) && Intrinsics.LJFF(this.iosVer, emojiSliderStickerStruct.iosVer) && Intrinsics.LJFF(this.emojiContent, emojiSliderStickerStruct.emojiContent) && Intrinsics.LJFF(this.questionText, emojiSliderStickerStruct.questionText) && Intrinsics.LJFF(this.voteVal, emojiSliderStickerStruct.voteVal) && Intrinsics.LJFF(this.answerCount, emojiSliderStickerStruct.answerCount) && Intrinsics.LJFF(this.voteAverage, emojiSliderStickerStruct.voteAverage);
    }

    public int hashCode() {
        int iHashCode = ((((this.androidVer.hashCode() * 31) + this.iosVer.hashCode()) * 31) + this.emojiContent.hashCode()) * 31;
        String str = this.questionText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.voteVal;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.answerCount;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.voteAverage;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmojiSliderStickerStruct(androidVer=");
        sbLIZ.append(this.androidVer);
        sbLIZ.append(", iosVer=");
        sbLIZ.append(this.iosVer);
        sbLIZ.append(", emojiContent=");
        sbLIZ.append(this.emojiContent);
        sbLIZ.append(", questionText=");
        sbLIZ.append(this.questionText);
        sbLIZ.append(", voteVal=");
        sbLIZ.append(this.voteVal);
        sbLIZ.append(", answerCount=");
        sbLIZ.append(this.answerCount);
        sbLIZ.append(", voteAverage=");
        sbLIZ.append(this.voteAverage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.androidVer);
        parcel.writeString(this.iosVer);
        parcel.writeString(this.emojiContent);
        parcel.writeString(this.questionText);
        Integer num = this.voteVal;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.answerCount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.voteAverage;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public final String getAndroidVer() {
        return this.androidVer;
    }

    public final Long getAnswerCount() {
        return this.answerCount;
    }

    public final String getEmojiContent() {
        return this.emojiContent;
    }

    public final String getIosVer() {
        return this.iosVer;
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    public final Long getVoteAverage() {
        return this.voteAverage;
    }

    public final Integer getVoteVal() {
        return this.voteVal;
    }

    public final void setVoteVal(Integer num) {
        this.voteVal = num;
    }

    public EmojiSliderStickerStruct(String str, String str2, String str3, String str4, Integer num, Long l, Long l2) {
        this.androidVer = str;
        this.iosVer = str2;
        this.emojiContent = str3;
        this.questionText = str4;
        this.voteVal = num;
        this.answerCount = l;
        this.voteAverage = l2;
    }
}
