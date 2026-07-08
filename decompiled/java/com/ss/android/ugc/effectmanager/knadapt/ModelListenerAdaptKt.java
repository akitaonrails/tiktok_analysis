package com.ss.android.ugc.effectmanager.knadapt;

import X.C13MA;
import X.C13QQ;
import X.C1662010tLr;
import com.ss.android.ugc.effectmanager.IFetchModelListener;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes31.dex */
public final class ModelListenerAdaptKt {
    public static final C13MA<String[]> toKNListener(final IFetchModelListener iFetchModelListener) {
        if (iFetchModelListener == null) {
            return null;
        }
        return new C13MA<String[]>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt.toKNListener.1
            @Override // X.C13MA
            public void preProcess(String[] strArr) {
            }

            @Override // X.C13MA
            public void onSuccess(String[] strArr) {
                iFetchModelListener.onSuccess(strArr);
            }

            @Override // X.C13MA
            public void onFail(String[] strArr, C1662010tLr c1662010tLr) {
                iFetchModelListener.onFailed(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr).getException());
            }
        };
    }

    public static final C13QQ toKNListener(final ModelEventListener modelEventListener) {
        if (modelEventListener == null) {
            return null;
        }
        return new C13QQ() { // from class: com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt.toKNListener.2
            public void onModelDownloadStart(Effect effect, ModelInfo modelInfo) {
                modelEventListener.onModelDownloadStart(effect, modelInfo);
            }

            @Override // X.C13QQ
            public void onModelNotFound(Effect effect, Exception exc) {
                modelEventListener.onModelNotFound(effect, exc);
            }

            public void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc) {
                modelEventListener.onModelDownloadError(effect, modelInfo, exc);
            }

            public void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j) {
                modelEventListener.onModelDownloadSuccess(effect, modelInfo, j);
            }

            public void onFetchModelList(boolean z, String str, long j, String str2) {
                modelEventListener.onFetchModelList(z, str, j, str2);
            }
        };
    }
}
