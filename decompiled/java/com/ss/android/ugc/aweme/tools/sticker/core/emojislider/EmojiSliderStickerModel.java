package com.ss.android.ugc.aweme.tools.sticker.core.emojislider;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C19591311kt;
import X.C19604111mx;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.emojislider.model.EmojiSliderStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.EmojiSliderStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class EmojiSliderStickerModel implements StickerModel, Serializable {

    @C09CT("android_ver")
    public String androidVer;

    @C09CT("answer_count")
    public final Long answerCount;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public boolean clickable;

    @C09CT("emoji_content")
    public String emojiContent;

    @C09CT("ios_ver")
    public String iosVer;

    @C09CT("prompt_text")
    public String questionText;

    @C09CT("visible")
    public boolean visible;

    @C09CT("answer_avg")
    public Long voteAverage;

    @C09CT("user_slider_value")
    public Integer voteVal;
    public static final C19604111mx Companion = new Object() { // from class: X.11mx
    };
    public static final Parcelable.Creator<EmojiSliderStickerModel> CREATOR = new Parcelable.Creator<EmojiSliderStickerModel>() { // from class: X.11ms
        @Override // android.os.Parcelable.Creator
        public final EmojiSliderStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            Long lValueOf;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            return new EmojiSliderStickerModel(baseStickerModelCreateFromParcel, z, z2, string, string2, numValueOf, lValueOf, lValueOf2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EmojiSliderStickerModel[] newArray(int i) {
            return new EmojiSliderStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public EmojiSliderStickerModel() {
        this(new BaseStickerModel(101, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), false, true, null, "😍", null, null, null, "19", "8.3");
    }

    public final EmojiSliderStickerModel copy(BaseStickerModel baseStickerModel, boolean z, boolean z2, String str, String str2, Integer num, Long l, Long l2, String str3, String str4) {
        return new EmojiSliderStickerModel(baseStickerModel, z, z2, str, str2, num, l, l2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiSliderStickerModel)) {
            return false;
        }
        EmojiSliderStickerModel emojiSliderStickerModel = (EmojiSliderStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, emojiSliderStickerModel.baseStickerModel) && this.clickable == emojiSliderStickerModel.clickable && this.visible == emojiSliderStickerModel.visible && Intrinsics.LJFF(this.questionText, emojiSliderStickerModel.questionText) && Intrinsics.LJFF(this.emojiContent, emojiSliderStickerModel.emojiContent) && Intrinsics.LJFF(this.voteVal, emojiSliderStickerModel.voteVal) && Intrinsics.LJFF(this.answerCount, emojiSliderStickerModel.answerCount) && Intrinsics.LJFF(this.voteAverage, emojiSliderStickerModel.voteAverage) && Intrinsics.LJFF(this.androidVer, emojiSliderStickerModel.androidVer) && Intrinsics.LJFF(this.iosVer, emojiSliderStickerModel.iosVer);
    }

    public int hashCode() {
        int iHashCode = ((((this.baseStickerModel.hashCode() * 31) + C786410Ut5.Z2(this.clickable)) * 31) + C786410Ut5.Z2(this.visible)) * 31;
        String str = this.questionText;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.emojiContent.hashCode()) * 31;
        Integer num = this.voteVal;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.answerCount;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.voteAverage;
        return ((((iHashCode4 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.androidVer.hashCode()) * 31) + this.iosVer.hashCode();
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
        sbLIZ.append("EmojiSliderStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.clickable);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", questionText=");
        sbLIZ.append(this.questionText);
        sbLIZ.append(", emojiContent=");
        sbLIZ.append(this.emojiContent);
        sbLIZ.append(", voteVal=");
        sbLIZ.append(this.voteVal);
        sbLIZ.append(", answerCount=");
        sbLIZ.append(this.answerCount);
        sbLIZ.append(", voteAverage=");
        sbLIZ.append(this.voteAverage);
        sbLIZ.append(", androidVer=");
        sbLIZ.append(this.androidVer);
        sbLIZ.append(", iosVer=");
        sbLIZ.append(this.iosVer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeString(this.questionText);
        parcel.writeString(this.emojiContent);
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
        parcel.writeString(this.androidVer);
        parcel.writeString(this.iosVer);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, false);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        String str = this.questionText;
        interactStickerStructLIZLLL.setEmojiSliderStickerStruct(new EmojiSliderStickerStruct(this.androidVer, this.iosVer, this.emojiContent, str, this.voteVal, this.answerCount, this.voteAverage));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return this.emojiContent.length() > 0 && this.androidVer.length() > 0 && this.iosVer.length() > 0;
    }

    public final String getAndroidVer() {
        return this.androidVer;
    }

    public final Long getAnswerCount() {
        return this.answerCount;
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

    public final String getEmojiContent() {
        return this.emojiContent;
    }

    public final String getIosVer() {
        return this.iosVer;
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final Long getVoteAverage() {
        return this.voteAverage;
    }

    public final Integer getVoteVal() {
        return this.voteVal;
    }

    public final void setAndroidVer(String str) {
        this.androidVer = str;
    }

    public final void setClickable(boolean z) {
        this.clickable = z;
    }

    public final void setEmojiContent(String str) {
        this.emojiContent = str;
    }

    public final void setIosVer(String str) {
        this.iosVer = str;
    }

    public final void setQuestionText(String str) {
        this.questionText = str;
    }

    public final void setVisible(boolean z) {
        this.visible = z;
    }

    public final void setVoteAverage(Long l) {
        this.voteAverage = l;
    }

    public final void setVoteVal(Integer num) {
        this.voteVal = num;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.clickable, this.visible, this.questionText, this.emojiContent, this.voteVal, this.answerCount, this.voteAverage, this.androidVer, this.iosVer);
    }

    public EmojiSliderStickerModel(BaseStickerModel baseStickerModel, boolean z, boolean z2, String str, String str2, Integer num, Long l, Long l2, String str3, String str4) {
        this.baseStickerModel = baseStickerModel;
        this.clickable = z;
        this.visible = z2;
        this.questionText = str;
        this.emojiContent = str2;
        this.voteVal = num;
        this.answerCount = l;
        this.voteAverage = l2;
        this.androidVer = str3;
        this.iosVer = str4;
    }
}
