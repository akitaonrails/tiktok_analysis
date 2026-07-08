package com.ss.android.ugc.aweme.shortvideo.inlinecaption;

import X.C123P;
import X.C13BV;
import X.C1697810uHb;
import X.C786410Ut5;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.sticker.data.Word;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class CaptionUtterance implements Parcelable {
    public static final Parcelable.Creator<CaptionUtterance> CREATOR = new Parcelable.Creator<CaptionUtterance>() { // from class: X.0EV7
        @Override // android.os.Parcelable.Creator
        public final CaptionUtterance createFromParcel(Parcel parcel) {
            return new CaptionUtterance((Utterance) parcel.readSerializable(), (TextStickerData) parcel.readParcelable(CaptionUtterance.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionUtterance[] newArray(int i) {
            return new CaptionUtterance[i];
        }
    };
    public TextStickerData inlineUtterance;
    public boolean isSelected;
    public boolean needAnim;
    public Utterance utterance;

    public CaptionUtterance() {
        this((Utterance) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.utterance);
        parcel.writeParcelable(this.inlineUtterance, i);
    }

    public final long LIZ() {
        if (this.inlineUtterance != null) {
            return r0.getEndTime();
        }
        Utterance utterance = this.utterance;
        if (utterance != null) {
            return utterance.getEndTime();
        }
        return 0L;
    }

    public final boolean LIZIZ() {
        Utterance utterance = this.utterance;
        if (utterance != null) {
            return utterance.getFilterSelected();
        }
        TextStickerData textStickerData = this.inlineUtterance;
        if (textStickerData != null) {
            return textStickerData.getFilterSelected();
        }
        return false;
    }

    public final long LIZJ() {
        if (this.inlineUtterance != null) {
            return r0.getStartTime();
        }
        Utterance utterance = this.utterance;
        if (utterance != null) {
            return utterance.getStartTime();
        }
        return 0L;
    }

    public final String LIZLLL() {
        String tag;
        Utterance utterance = this.utterance;
        if (utterance != null && (tag = utterance.getTag()) != null) {
            return tag;
        }
        TextStickerData textStickerData = this.inlineUtterance;
        return textStickerData != null ? textStickerData.getFilterTag() : "";
    }

    public final String LJ() {
        String text;
        String textStr;
        TextStickerData textStickerData = this.inlineUtterance;
        if (textStickerData != null && (textStr = textStickerData.getTextStr()) != null) {
            return textStr;
        }
        Utterance utterance = this.utterance;
        return (utterance == null || (text = utterance.getText()) == null) ? "" : text;
    }

    public final List<Word> LJFF() {
        List<Word> words;
        Utterance utterance = this.utterance;
        if (utterance != null && (words = utterance.getWords()) != null) {
            return words;
        }
        TextStickerData textStickerData = this.inlineUtterance;
        return textStickerData != null ? textStickerData.getWords() : C13BV.INSTANCE;
    }

    public final int hashCode() {
        long j = 31;
        return (int) ((j * ((LIZJ() * j) + ((long) C786410Ut5.Y2(LIZ())))) + ((long) LJ().hashCode()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CaptionUtterance(CaptionUtterance captionUtterance) {
        Utterance utterance;
        this((Utterance) (0 == true ? 1 : 0), 3);
        Utterance utterance2 = captionUtterance.utterance;
        if (utterance2 != null) {
            utterance = new Utterance(utterance2);
        } else {
            utterance = null;
        }
        this.utterance = utterance;
        TextStickerData textStickerData = captionUtterance.inlineUtterance;
        this.inlineUtterance = textStickerData != null ? textStickerData.m187clone() : null;
    }

    public final void LJI(boolean z) {
        Utterance utterance = this.utterance;
        if (utterance != null) {
            utterance.setFilterSelected(z);
        }
        TextStickerData textStickerData = this.inlineUtterance;
        if (textStickerData != null) {
            textStickerData.setFilterSelected(z);
        }
    }

    public final void LJII(long j) {
        TextStickerData textStickerData = this.inlineUtterance;
        if (textStickerData != null) {
            textStickerData.setEndTime((int) j);
        }
        Utterance utterance = this.utterance;
        if (utterance != null) {
            utterance.setEndTime(j);
        }
    }

    public final boolean equals(Object obj) {
        String textStr;
        String textStr2;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numValueOf6;
        String fontType;
        String fontType2;
        Integer numValueOf7;
        Integer numValueOf8;
        Integer numValueOf9;
        Integer numValueOf10;
        Integer numValueOf11;
        Integer numValueOf12;
        Integer numValueOf13;
        Integer numValueOf14;
        Integer numValueOf15;
        Integer numValueOf16;
        String fontType3;
        if (this == obj) {
            return true;
        }
        CaptionUtterance captionUtterance = (CaptionUtterance) obj;
        if (!Intrinsics.LJFF(this.utterance, captionUtterance.utterance)) {
            return false;
        }
        TextStickerData textStickerData = this.inlineUtterance;
        String fontType4 = null;
        if (textStickerData != null) {
            textStr = textStickerData.getTextStr();
        } else {
            textStr = null;
        }
        TextStickerData textStickerData2 = captionUtterance.inlineUtterance;
        if (textStickerData2 != null) {
            textStr2 = textStickerData2.getTextStr();
        } else {
            textStr2 = null;
        }
        if (!Intrinsics.LJFF(textStr, textStr2)) {
            return false;
        }
        TextStickerData textStickerData3 = this.inlineUtterance;
        if (textStickerData3 != null) {
            numValueOf = Integer.valueOf(textStickerData3.getBgMode());
        } else {
            numValueOf = null;
        }
        TextStickerData textStickerData4 = captionUtterance.inlineUtterance;
        if (textStickerData4 != null) {
            numValueOf2 = Integer.valueOf(textStickerData4.getBgMode());
        } else {
            numValueOf2 = null;
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
            return false;
        }
        TextStickerData textStickerData5 = this.inlineUtterance;
        if (textStickerData5 != null) {
            numValueOf3 = Integer.valueOf(textStickerData5.getColor());
        } else {
            numValueOf3 = null;
        }
        TextStickerData textStickerData6 = captionUtterance.inlineUtterance;
        if (textStickerData6 != null) {
            numValueOf4 = Integer.valueOf(textStickerData6.getColor());
        } else {
            numValueOf4 = null;
        }
        if (!Intrinsics.LJFF(numValueOf3, numValueOf4)) {
            return false;
        }
        TextStickerData textStickerData7 = this.inlineUtterance;
        if (textStickerData7 != null) {
            numValueOf5 = Integer.valueOf(textStickerData7.getAlign());
        } else {
            numValueOf5 = null;
        }
        TextStickerData textStickerData8 = captionUtterance.inlineUtterance;
        if (textStickerData8 != null) {
            numValueOf6 = Integer.valueOf(textStickerData8.getAlign());
        } else {
            numValueOf6 = null;
        }
        if (!Intrinsics.LJFF(numValueOf5, numValueOf6)) {
            return false;
        }
        TextStickerData textStickerData9 = this.inlineUtterance;
        if (textStickerData9 != null) {
            fontType = textStickerData9.getFontType();
        } else {
            fontType = null;
        }
        TextStickerData textStickerData10 = captionUtterance.inlineUtterance;
        if (textStickerData10 != null) {
            fontType2 = textStickerData10.getFontType();
        } else {
            fontType2 = null;
        }
        if (!Intrinsics.LJFF(fontType, fontType2)) {
            return false;
        }
        TextStickerData textStickerData11 = this.inlineUtterance;
        if (textStickerData11 != null) {
            numValueOf7 = Integer.valueOf(textStickerData11.getStartTime());
        } else {
            numValueOf7 = null;
        }
        TextStickerData textStickerData12 = captionUtterance.inlineUtterance;
        if (textStickerData12 != null) {
            numValueOf8 = Integer.valueOf(textStickerData12.getStartTime());
        } else {
            numValueOf8 = null;
        }
        if (!Intrinsics.LJFF(numValueOf7, numValueOf8)) {
            return false;
        }
        TextStickerData textStickerData13 = this.inlineUtterance;
        if (textStickerData13 != null) {
            numValueOf9 = Integer.valueOf(textStickerData13.getEndTime());
        } else {
            numValueOf9 = null;
        }
        TextStickerData textStickerData14 = captionUtterance.inlineUtterance;
        if (textStickerData14 != null) {
            numValueOf10 = Integer.valueOf(textStickerData14.getEndTime());
        } else {
            numValueOf10 = null;
        }
        if (!Intrinsics.LJFF(numValueOf9, numValueOf10)) {
            return false;
        }
        TextStickerData textStickerData15 = this.inlineUtterance;
        if (textStickerData15 != null) {
            numValueOf11 = Integer.valueOf(textStickerData15.getBgMode());
        } else {
            numValueOf11 = null;
        }
        TextStickerData textStickerData16 = captionUtterance.inlineUtterance;
        if (textStickerData16 != null) {
            numValueOf12 = Integer.valueOf(textStickerData16.getBgMode());
        } else {
            numValueOf12 = null;
        }
        if (!Intrinsics.LJFF(numValueOf11, numValueOf12)) {
            return false;
        }
        TextStickerData textStickerData17 = this.inlineUtterance;
        if (textStickerData17 != null) {
            numValueOf13 = Integer.valueOf(textStickerData17.getAlign());
        } else {
            numValueOf13 = null;
        }
        TextStickerData textStickerData18 = captionUtterance.inlineUtterance;
        if (textStickerData18 != null) {
            numValueOf14 = Integer.valueOf(textStickerData18.getAlign());
        } else {
            numValueOf14 = null;
        }
        if (!Intrinsics.LJFF(numValueOf13, numValueOf14)) {
            return false;
        }
        TextStickerData textStickerData19 = this.inlineUtterance;
        if (textStickerData19 != null) {
            numValueOf15 = Integer.valueOf(textStickerData19.getColor());
        } else {
            numValueOf15 = null;
        }
        TextStickerData textStickerData20 = captionUtterance.inlineUtterance;
        if (textStickerData20 != null) {
            numValueOf16 = Integer.valueOf(textStickerData20.getColor());
        } else {
            numValueOf16 = null;
        }
        if (!Intrinsics.LJFF(numValueOf15, numValueOf16)) {
            return false;
        }
        TextStickerData textStickerData21 = this.inlineUtterance;
        if (textStickerData21 != null) {
            fontType3 = textStickerData21.getFontType();
        } else {
            fontType3 = null;
        }
        TextStickerData textStickerData22 = captionUtterance.inlineUtterance;
        if (textStickerData22 != null) {
            fontType4 = textStickerData22.getFontType();
        }
        if (Intrinsics.LJFF(fontType3, fontType4)) {
            return true;
        }
        return false;
    }

    public CaptionUtterance(TextStickerData textStickerData) {
        this((Utterance) null, 3);
        this.utterance = null;
        this.inlineUtterance = textStickerData;
    }

    public /* synthetic */ CaptionUtterance(Utterance utterance, int i) {
        this((i & 1) != 0 ? null : utterance, (TextStickerData) null);
    }

    public final void LJIIIIZZ(Context context, String str) {
        if (context == null) {
            return;
        }
        TextStickerData textStickerData = this.inlineUtterance;
        if (textStickerData != null) {
            textStickerData.setTextStr(str);
            textStickerData.setTextWrapList(C1697810uHb.LJ(C123P.LIZJ(C123P.LJIILJJIL(textStickerData, context))));
            textStickerData.setInlineTextStyles(C13BV.INSTANCE);
        }
        Utterance utterance = this.utterance;
        if (utterance != null) {
            utterance.setText(str);
        }
    }

    public CaptionUtterance(Utterance utterance, TextStickerData textStickerData) {
        this.utterance = utterance;
        this.inlineUtterance = textStickerData;
    }
}
