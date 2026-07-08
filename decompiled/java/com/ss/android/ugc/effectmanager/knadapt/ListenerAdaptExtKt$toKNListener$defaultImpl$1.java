package com.ss.android.ugc.effectmanager.knadapt;

import X.C13NY;
import X.C1662010tLr;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes31.dex */
public final class ListenerAdaptExtKt$toKNListener$defaultImpl$1 implements C13NY {
    public final /* synthetic */ IFetchEffectListener $oldListener;
    public Effect oldEffect;

    @Override // X.C13MA
    public void preProcess(Effect effect) {
    }

    public ListenerAdaptExtKt$toKNListener$defaultImpl$1(IFetchEffectListener iFetchEffectListener) {
        this.$oldListener = iFetchEffectListener;
    }

    @Override // X.C13NY
    public void onStart(Effect effect) {
        if (this.oldEffect == null) {
            this.oldEffect = effect;
        }
        this.$oldListener.onStart(this.oldEffect);
    }

    @Override // X.C13MA
    public void onSuccess(Effect effect) {
        if (this.oldEffect == null) {
            this.oldEffect = effect;
        }
        this.$oldListener.onSuccess(this.oldEffect);
    }

    @Override // X.C13MA
    public void onFail(Effect effect, C1662010tLr c1662010tLr) {
        if (this.oldEffect == null) {
            this.oldEffect = effect;
        }
        this.$oldListener.onFail(this.oldEffect, ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
    }

    @Override // X.C13NY
    public void onProgress(Effect effect, int i, long j) {
        if (this.oldEffect == null) {
            this.oldEffect = effect;
        }
        IFetchEffectListener iFetchEffectListener = this.$oldListener;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(this.oldEffect, i, j);
        }
    }
}
