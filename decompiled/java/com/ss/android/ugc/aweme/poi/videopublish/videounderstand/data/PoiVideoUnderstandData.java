package com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PoiVideoUnderstandData {

    @C09CT("multimodal_embedding")
    public final String multimodalEmbedding;

    @C09CT("tier1_id")
    public final Integer tier1Id;

    @C09CT("tier1_name")
    public final String tier1Name;

    @C09CT("tier1_score")
    public final Float tier1Score;

    @C09CT("tier2_id")
    public final Integer tier2Id;

    @C09CT("tier2_name")
    public final String tier2Name;

    @C09CT("tier2_score")
    public final Float tier2Score;

    @C09CT("tier3_id")
    public final Integer tier3Id;

    @C09CT("tier3_name")
    public final String tier3Name;

    @C09CT("tier3_score")
    public final Float tier3Score;

    @C09CT("ttls_category")
    public final String ttlsCategory;

    public PoiVideoUnderstandData() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final String toString() {
        return "PoiVideoUnderstandData(ttlsCategory=" + this.ttlsCategory + ", multimodalEmbedding=" + this.multimodalEmbedding + ", tier1Id=" + this.tier1Id + ", tier1Name=" + this.tier1Name + ", tier1Score=" + this.tier1Score + ", tier2Id=" + this.tier2Id + ", tier2Name=" + this.tier2Name + ", tier2Score=" + this.tier2Score + ", tier3Id=" + this.tier3Id + ", tier3Name=" + this.tier3Name + ", tier3Score=" + this.tier3Score + ')';
    }

    public PoiVideoUnderstandData(String str, String str2, Integer num, String str3, Float f, Integer num2, String str4, Float f2, Integer num3, String str5, Float f3) {
        this.ttlsCategory = str;
        this.multimodalEmbedding = str2;
        this.tier1Id = num;
        this.tier1Name = str3;
        this.tier1Score = f;
        this.tier2Id = num2;
        this.tier2Name = str4;
        this.tier2Score = f2;
        this.tier3Id = num3;
        this.tier3Name = str5;
        this.tier3Score = f3;
    }
}
