package com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class HardcodedTextSuggestionRepository implements TextSuggestionRepository {
    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.TextSuggestionRepository
    public final List<String> LIZ() {
        List<String> listRecommendedPrompts = MixStudioSettings.INSTANCE.recommendedPrompts();
        if (listRecommendedPrompts != null) {
            return listRecommendedPrompts;
        }
        final String str = "recommended prompts settings returned empty";
        throw new RuntimeException(str) { // from class: X.0HNL
            public static final int $stable = 8;
        };
    }
}
