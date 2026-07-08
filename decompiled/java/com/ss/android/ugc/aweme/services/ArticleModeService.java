package com.ss.android.ugc.aweme.services;

/* JADX INFO: loaded from: classes29.dex */
public final class ArticleModeService implements IArticleModeService {
    public static final ArticleModeService INSTANCE = new ArticleModeService();
    public final /* synthetic */ IArticleModeService $$delegate_0 = ArticleModeServiceImpl.createIArticleModeServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.services.IArticleModeService
    public IArticleModeAnchorService getArticleAnchorService() {
        return this.$$delegate_0.getArticleAnchorService();
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeService
    public IArticleModeLoggingService getArticleLoggingService() {
        return this.$$delegate_0.getArticleLoggingService();
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeService
    public IArticleModeRssService getArticleRssService() {
        return this.$$delegate_0.getArticleRssService();
    }
}
