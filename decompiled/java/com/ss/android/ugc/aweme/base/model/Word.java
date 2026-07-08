package com.ss.android.ugc.aweme.base.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class Word implements Serializable {

    @C09CT("qrec_json_info")
    public String qrecJsonInfo;

    @C09CT("textnet_id")
    public String textnetId;

    @C09CT("words_lang")
    public String wordsLang;

    public String getQrecJsonInfo() {
        return this.qrecJsonInfo;
    }

    public String getTextnetId() {
        return this.textnetId;
    }

    public String getWordsLang() {
        return this.wordsLang;
    }

    public void setQrecJsonInfo(String str) {
        this.qrecJsonInfo = str;
    }

    public void setTextnetId(String str) {
        this.textnetId = str;
    }

    public void setWordsLang(String str) {
        this.wordsLang = str;
    }
}
