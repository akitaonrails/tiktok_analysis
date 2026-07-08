package com.ss.android.ugc.aweme.comment.widgets;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.comment.widgets.EmojiStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class EmojiStruct implements Parcelable {
    public static final Parcelable.Creator<EmojiStruct> CREATOR = new Parcelable.Creator<EmojiStruct>() { // from class: X.0lKM
        @Override // android.os.Parcelable.Creator
        public final EmojiStruct createFromParcel(Parcel parcel) {
            CommentEmojiSpan commentEmojiSpanCreateFromParcel;
            if (parcel.readInt() == 0) {
                commentEmojiSpanCreateFromParcel = null;
            } else {
                commentEmojiSpanCreateFromParcel = CommentEmojiSpan.CREATOR.createFromParcel(parcel);
            }
            return new EmojiStruct(commentEmojiSpanCreateFromParcel, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EmojiStruct[] newArray(int i) {
            return new EmojiStruct[i];
        }
    };
    public final CommentEmojiSpan emojiSpan;
    public final int end;
    public final int start;

    public EmojiStruct() {
        this(null, 0, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiStruct)) {
            return false;
        }
        EmojiStruct emojiStruct = (EmojiStruct) obj;
        return Intrinsics.LJFF(this.emojiSpan, emojiStruct.emojiSpan) && this.start == emojiStruct.start && this.end == emojiStruct.end;
    }

    public final int hashCode() {
        CommentEmojiSpan commentEmojiSpan = this.emojiSpan;
        return ((((commentEmojiSpan == null ? 0 : commentEmojiSpan.hashCode()) * 31) + this.start) * 31) + this.end;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmojiStruct(emojiSpan=");
        sbLIZ.append(this.emojiSpan);
        sbLIZ.append(", start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", end=");
        sbLIZ.append(this.end);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CommentEmojiSpan commentEmojiSpan = this.emojiSpan;
        if (commentEmojiSpan == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commentEmojiSpan.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }

    public EmojiStruct(CommentEmojiSpan commentEmojiSpan, int i, int i2) {
        this.emojiSpan = commentEmojiSpan;
        this.start = i;
        this.end = i2;
    }
}
