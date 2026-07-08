package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultCommentDependencyService implements ICommentDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public boolean enableCommentRefactor() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public boolean enablePreloadHighestAnchor() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public Context getCommentThemeContext(Context context) {
        return context;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public Map<String, String> getContentRecReasonParams(Aweme aweme, String str) {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public boolean isCommentDarkModeOptExp() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public Map<String, String> getCommentThemeSparkParams() {
        return new HashMap();
    }
}
