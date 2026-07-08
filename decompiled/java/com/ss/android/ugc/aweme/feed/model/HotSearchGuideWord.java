package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class HotSearchGuideWord {

    @C09CT("breathe_times")
    public int breatheTimes;

    @C09CT("word")
    public String displayWord;

    @C09CT("search_word")
    public String searchWord;

    @C09CT("type")
    public int type;

    public String getSearchWord() {
        return TextUtils.isEmpty(this.searchWord) ? this.displayWord : this.searchWord;
    }

    public boolean isAd() {
        return this.type == 3;
    }

    public boolean isNormalWord() {
        return this.type == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("displayWord: ");
        sbLIZ.append(this.displayWord);
        sbLIZ.append(", searchWord: ");
        sbLIZ.append(this.searchWord);
        sbLIZ.append(", type: ");
        sbLIZ.append(this.type);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getBreatheTimes() {
        return this.breatheTimes;
    }

    public String getDisplayWord() {
        return this.displayWord;
    }

    public int getType() {
        return this.type;
    }

    public void setBreatheTimes(int i) {
        this.breatheTimes = i;
    }

    public void setDisplayWord(String str) {
        this.displayWord = str;
    }

    public void setSearchWord(String str) {
        this.searchWord = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
