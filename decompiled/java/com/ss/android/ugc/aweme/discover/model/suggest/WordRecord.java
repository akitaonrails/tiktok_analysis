package com.ss.android.ugc.aweme.discover.model.suggest;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class WordRecord implements Serializable {

    @C09CT("qrec_json_info")
    public final String qrecJsonInfo;

    @C09CT("textnet_id")
    public final String textnetId;

    @C09CT("words_lang")
    public final String wordsLang;

    public WordRecord() {
        this(null, null, null);
    }

    public WordRecord(String str, String str2, String str3) {
        this.wordsLang = str;
        this.textnetId = str2;
        this.qrecJsonInfo = str3;
    }
}
