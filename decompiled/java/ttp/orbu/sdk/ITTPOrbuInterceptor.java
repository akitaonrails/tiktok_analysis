package ttp.orbu.sdk;

import ttp.orbu.sdk.ITTPOrbuRequestPayload;
import ttp.orbu.sdk.requestvalidator.OrbuResult;

/* JADX INFO: loaded from: classes24.dex */
public interface ITTPOrbuInterceptor<T extends ITTPOrbuRequestPayload> {
    OrbuResult getOrbuResult();

    TTPOrbuResponse shouldInterceptRequest(ITTPOrbuRequest<? extends T> iTTPOrbuRequest);

    public static final class a {
        public static <T extends ITTPOrbuRequestPayload> OrbuResult a(ITTPOrbuInterceptor<? super T> iTTPOrbuInterceptor) {
            return OrbuResult.a.a;
        }
    }
}
