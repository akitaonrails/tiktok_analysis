package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;

/* JADX INFO: loaded from: classes11.dex */
public final class EcClickSearchWord {
    public boolean LIZ;

    @C09CT("group_id")
    public final String groupId;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("penetrate_info")
    public final String penetrateInfo;

    @C09CT("product_id")
    public final String productId;

    @C09CT("sug_word")
    public final String word;

    @C09CT("word_record")
    public final Word wordRecord;

    public EcClickSearchWord() {
        this(null, null, null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcClickSearchWord(word=");
        sbLIZ.append(this.word);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.groupId);
        sbLIZ.append(", wordRecord=");
        sbLIZ.append(this.wordRecord);
        sbLIZ.append(", penetrateInfo=");
        sbLIZ.append(this.penetrateInfo);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcClickSearchWord(String str, String str2, Word word, String str3, String str4, String str5) {
        this.word = str;
        this.groupId = str2;
        this.wordRecord = word;
        this.penetrateInfo = str3;
        this.productId = str4;
        this.imageUrl = str5;
    }
}
