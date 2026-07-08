package com.ss.android.ugc.aweme.services.publisherror;

import com.ss.android.ugc.aweme.services.publisherror.PublishErrorHandleInterceptorResult;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public final class ErrorMessageHandleInterceptor implements PublishErrorHandleInterceptor {
    public static final ErrorMessageHandleInterceptor INSTANCE = new ErrorMessageHandleInterceptor();

    @Override // com.ss.android.ugc.aweme.services.publisherror.PublishErrorHandleInterceptor
    public PublishErrorHandleInterceptorResult intercept(PublishErrorHandleContext publishErrorHandleContext) {
        String str = publishErrorHandleContext.errorMsg;
        if (str != null && !a0.LJJJIL(str)) {
            ErrorMessageHandleDto errorMessageHandle = ErrorMessageHandleDto.Companion.parseErrorMessageHandle(publishErrorHandleContext.errorMsg);
            if (errorMessageHandle == null) {
                return PublishErrorHandleInterceptorResult.Pass.INSTANCE;
            }
            String str2 = errorMessageHandle.contentLoc;
            if (str2 != null && (!a0.LJJJIL(str2))) {
                String str3 = errorMessageHandle.btnTextLoc;
                if (str3 != null && (true ^ a0.LJJJIL(str3))) {
                    return new PublishErrorHandleInterceptorResult.Resolved(new ResolvedPublishErrorHandle(str2, str3, PublishErrorHandleBtnType.Companion.fromValue(errorMessageHandle.btnType), errorMessageHandle.btnAction));
                }
                return PublishErrorHandleInterceptorResult.Pass.INSTANCE;
            }
            return PublishErrorHandleInterceptorResult.Pass.INSTANCE;
        }
        return PublishErrorHandleInterceptorResult.Pass.INSTANCE;
    }
}
