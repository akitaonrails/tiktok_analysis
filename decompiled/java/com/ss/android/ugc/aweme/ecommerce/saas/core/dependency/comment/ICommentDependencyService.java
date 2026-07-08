package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface ICommentDependencyService extends IECommerceHostService {
    boolean enableCommentRefactor();

    boolean enablePreloadHighestAnchor();

    Context getCommentThemeContext(Context context);

    Map<String, String> getCommentThemeSparkParams();

    Map<String, String> getContentRecReasonParams(Aweme aweme, String str);

    boolean isCommentDarkModeOptExp();
}
