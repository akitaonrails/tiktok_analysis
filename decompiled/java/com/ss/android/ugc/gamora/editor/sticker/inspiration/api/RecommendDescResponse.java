package com.ss.android.ugc.gamora.editor.sticker.inspiration.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.PoweredTextItem;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendDescResponse {

    @C09CT("count")
    public final Integer count;

    @C09CT("generated_descriptions")
    public final List<String> generatedDescriptions;

    @C09CT("generated_powered_text")
    public final List<PoweredTextItem> generatedPoweredText;

    @C09CT("generated_titles_and_suggestions")
    public GeneratedTitlesAndSuggestions generatedTitlesAndSuggestions;

    @C09CT("remaining")
    public final Integer remaining;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendDescResponse(count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", remaining=");
        sbLIZ.append(this.remaining);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", generatedDescriptions=");
        sbLIZ.append(this.generatedDescriptions);
        sbLIZ.append(", generatedPoweredText=");
        sbLIZ.append(this.generatedPoweredText);
        sbLIZ.append(", generatedTitlesAndSuggestions=");
        sbLIZ.append(this.generatedTitlesAndSuggestions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendDescResponse(Integer num, Integer num2, Integer num3, String str, List<String> list, List<PoweredTextItem> list2, GeneratedTitlesAndSuggestions generatedTitlesAndSuggestions) {
        this.count = num;
        this.remaining = num2;
        this.statusCode = num3;
        this.statusMsg = str;
        this.generatedDescriptions = list;
        this.generatedPoweredText = list2;
        this.generatedTitlesAndSuggestions = generatedTitlesAndSuggestions;
    }
}
