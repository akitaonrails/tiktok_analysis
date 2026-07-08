package com.ss.android.ugc.effectmanager;

import X.C13MA;
import X.C1662010tLr;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;

/* JADX INFO: loaded from: classes31.dex */
public final class IFetchResourceListenerKt {
    public static final C13MA<Long> toKNListener(final IFetchResourceListener iFetchResourceListener) {
        if (iFetchResourceListener == null) {
            return null;
        }
        return new C13MA<Long>() { // from class: com.ss.android.ugc.effectmanager.IFetchResourceListenerKt.toKNListener.1
            public void preProcess(long j) {
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void onSuccess(Long l) {
                onSuccess(l.longValue());
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void preProcess(Long l) {
                preProcess(l.longValue());
            }

            public void onSuccess(long j) {
                iFetchResourceListener.onSuccess(j);
            }

            @Override // X.C13MA
            public void onFail(Long l, C1662010tLr c1662010tLr) {
                iFetchResourceListener.onFailure(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr).getException());
            }
        };
    }
}
