package com.ss.android.ugc.aweme.comment.widgets;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentEmojiSpan extends CharacterStyle implements Parcelable, Serializable {
    public static final Parcelable.Creator<CommentEmojiSpan> CREATOR = new Parcelable.Creator<CommentEmojiSpan>() { // from class: X.0IBp
        @Override // android.os.Parcelable.Creator
        public final CommentEmojiSpan createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new CommentEmojiSpan(string, numValueOf, string2, string3, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentEmojiSpan[] newArray(int i) {
            return new CommentEmojiSpan[i];
        }
    };

    @C09CT("emoji_id")
    public final String emojiId;

    @C09CT("emoji_num")
    public final Integer emojiNum;

    @C09CT("emoji_score")
    public final Integer emojiScore;

    @C09CT("emoji_source")
    public final String emojiSource;

    @C09CT("emoji_strategy_type")
    public final String emojiStrategyType;

    public final CommentEmojiSpan copy(String str, Integer num, String str2, String str3, Integer num2) {
        return new CommentEmojiSpan(str, num, str2, str3, num2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentEmojiSpan)) {
            return false;
        }
        CommentEmojiSpan commentEmojiSpan = (CommentEmojiSpan) obj;
        return Intrinsics.LJFF(this.emojiId, commentEmojiSpan.emojiId) && Intrinsics.LJFF(this.emojiScore, commentEmojiSpan.emojiScore) && Intrinsics.LJFF(this.emojiStrategyType, commentEmojiSpan.emojiStrategyType) && Intrinsics.LJFF(this.emojiSource, commentEmojiSpan.emojiSource) && Intrinsics.LJFF(this.emojiNum, commentEmojiSpan.emojiNum);
    }

    public int hashCode() {
        int iHashCode = this.emojiId.hashCode() * 31;
        Integer num = this.emojiScore;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.emojiStrategyType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.emojiSource;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.emojiNum;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentEmojiSpan(emojiId=");
        sbLIZ.append(this.emojiId);
        sbLIZ.append(", emojiScore=");
        sbLIZ.append(this.emojiScore);
        sbLIZ.append(", emojiStrategyType=");
        sbLIZ.append(this.emojiStrategyType);
        sbLIZ.append(", emojiSource=");
        sbLIZ.append(this.emojiSource);
        sbLIZ.append(", emojiNum=");
        sbLIZ.append(this.emojiNum);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.emojiId);
        Integer num = this.emojiScore;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.emojiStrategyType);
        parcel.writeString(this.emojiSource);
        Integer num2 = this.emojiNum;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public final String getEmojiId() {
        return this.emojiId;
    }

    public final Integer getEmojiNum() {
        return this.emojiNum;
    }

    public final Integer getEmojiScore() {
        return this.emojiScore;
    }

    public final String getEmojiSource() {
        return this.emojiSource;
    }

    public final String getEmojiStrategyType() {
        return this.emojiStrategyType;
    }

    public CommentEmojiSpan(String str, Integer num, String str2, String str3, Integer num2) {
        this.emojiId = str;
        this.emojiScore = num;
        this.emojiStrategyType = str2;
        this.emojiSource = str3;
        this.emojiNum = num2;
    }
}
