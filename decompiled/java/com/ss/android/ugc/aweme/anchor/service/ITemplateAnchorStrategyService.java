package com.ss.android.ugc.aweme.anchor.service;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;

/* JADX INFO: loaded from: classes22.dex */
public interface ITemplateAnchorStrategyService {
    void LIZ(Activity activity, TemplateAnchorConfig templateAnchorConfig, boolean z);

    void LIZIZ(Context context, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3, String str4, MDPRecommendTemplateInfo mDPRecommendTemplateInfo);

    void LIZJ(Activity activity, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3, String str4, MDPRecommendTemplateInfo mDPRecommendTemplateInfo);

    TemplateAnchorConfig LIZLLL(AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3);
}
