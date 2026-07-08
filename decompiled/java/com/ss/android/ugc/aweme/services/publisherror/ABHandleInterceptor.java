package com.ss.android.ugc.aweme.services.publisherror;

import com.ss.android.ugc.aweme.services.publisherror.PublishErrorHandleInterceptorResult;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public final class ABHandleInterceptor implements PublishErrorHandleInterceptor {
    public static final ABHandleInterceptor INSTANCE = new ABHandleInterceptor();

    @Override // com.ss.android.ugc.aweme.services.publisherror.PublishErrorHandleInterceptor
    public PublishErrorHandleInterceptorResult intercept(PublishErrorHandleContext publishErrorHandleContext) {
        StudioPublishErrorHandleConfig studioPublishErrorHandleConfig = StudioPublishErrorHandleConfig.INSTANCE;
        PublishErrorHandleModel publishErrorHandleModelFindErrorHandle = studioPublishErrorHandleConfig.findErrorHandle(studioPublishErrorHandleConfig.getPublishErrorHandleListFromAB(), publishErrorHandleContext.region, publishErrorHandleContext.getErrorMatchKey(), publishErrorHandleContext.retryCount);
        if (publishErrorHandleModelFindErrorHandle == null) {
            return PublishErrorHandleInterceptorResult.Pass.INSTANCE;
        }
        String strResolveI18nText = studioPublishErrorHandleConfig.resolveI18nText(publishErrorHandleContext.context, publishErrorHandleModelFindErrorHandle.content, publishErrorHandleModelFindErrorHandle.contentPlural);
        if (strResolveI18nText != null && (!a0.LJJJIL(strResolveI18nText)) && strResolveI18nText != null) {
            String strResolveI18nText2 = studioPublishErrorHandleConfig.resolveI18nText(publishErrorHandleContext.context, publishErrorHandleModelFindErrorHandle.btnText, null);
            if (strResolveI18nText2 == null) {
                strResolveI18nText2 = "";
            }
            return new PublishErrorHandleInterceptorResult.Resolved(new ResolvedPublishErrorHandle(strResolveI18nText, strResolveI18nText2, PublishErrorHandleBtnType.Companion.fromValue(publishErrorHandleModelFindErrorHandle.btnType), publishErrorHandleModelFindErrorHandle.btnAction));
        }
        return PublishErrorHandleInterceptorResult.Pass.INSTANCE;
    }
}
