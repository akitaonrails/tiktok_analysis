package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Utterance implements Serializable, Cloneable {

    @C09CT("alignment")
    public int alignment;

    @C09CT("bg_color")
    public String bgColor;

    @C09CT("end_time")
    public long endTime;

    @C09CT("filter_selected")
    public boolean filterSelected;

    @C09CT("source_height")
    public float srcHeight;

    @C09CT("source_width")
    public float srcWidth;

    @C09CT("start_time")
    public long startTime;

    @C09CT("tag")
    public String tag;

    @C09CT("text")
    public String text;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_size")
    public int textSize;

    @C09CT("words")
    public List<Word> words;

    public int hashCode() {
        long j = 31;
        return (int) ((j * ((this.startTime * j) + ((long) C786410Ut5.Y2(this.endTime)))) + ((long) this.text.hashCode()));
    }

    public Utterance() {
        this.tag = "";
        this.text = "";
        this.words = C13BV.INSTANCE;
        this.textColor = "#00FFFFF";
        this.textSize = 22;
        this.bgColor = "#00000000";
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Utterance m322clone() {
        try {
            return (Utterance) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return new Utterance();
        }
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final boolean getFilterSelected() {
        return this.filterSelected;
    }

    public final float getSrcHeight() {
        return this.srcHeight;
    }

    public final float getSrcWidth() {
        return this.srcWidth;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final List<Word> getWords() {
        return this.words;
    }

    public Utterance(Utterance utterance) {
        this();
        this.startTime = utterance.startTime;
        this.endTime = utterance.endTime;
        this.text = utterance.text;
        this.tag = utterance.tag;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Utterance utterance = (Utterance) obj;
        if (this.startTime == utterance.startTime && this.endTime == utterance.endTime && Intrinsics.LJFF(this.text, utterance.text)) {
            return true;
        }
        return false;
    }

    public final void setAlignment(int i) {
        this.alignment = i;
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setFilterSelected(boolean z) {
        this.filterSelected = z;
    }

    public final void setSrcHeight(float f) {
        this.srcHeight = f;
    }

    public final void setSrcWidth(float f) {
        this.srcWidth = f;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public final void setTextSize(int i) {
        this.textSize = i;
    }

    public final void setWords(List<Word> list) {
        this.words = list;
    }

    public Utterance(long j, long j2, String str, String str2, String str3, float f, float f2, int i, int i2, String str4, boolean z) {
        this();
        this.startTime = j;
        this.endTime = j2;
        this.text = str;
        this.bgColor = str2;
        this.textColor = str3;
        this.srcWidth = f;
        this.srcHeight = f2;
        this.textSize = i;
        this.alignment = i2;
        this.tag = str4;
        this.filterSelected = z;
    }
}
