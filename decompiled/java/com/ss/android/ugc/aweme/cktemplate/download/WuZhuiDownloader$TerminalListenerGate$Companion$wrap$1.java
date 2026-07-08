package com.ss.android.ugc.aweme.cktemplate.download;

import X.C0L6T;
import com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes9.dex */
public final class WuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 implements IWuZhuiDownloaderListener {
    public final /* synthetic */ C0L6T LIZ;

    public WuZhuiDownloader$TerminalListenerGate$Companion$wrap$1(C0L6T c0l6t) {
        this.LIZ = c0l6t;
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
    public void onProgress(float f) {
        C0L6T c0l6t = this.LIZ;
        synchronized (c0l6t.LIZIZ) {
            try {
                if (c0l6t.LIZJ) {
                    return;
                }
                c0l6t.LIZ.onProgress(f);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
    public void onSuccess(NLEModel nLEModel) {
        C0L6T c0l6t = this.LIZ;
        synchronized (c0l6t.LIZIZ) {
            try {
                if (c0l6t.LIZJ) {
                    return;
                }
                c0l6t.LIZJ = true;
                c0l6t.LIZ.onSuccess(nLEModel);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
    public void onFailure(String str, int i, String str2) {
        C0L6T c0l6t = this.LIZ;
        synchronized (c0l6t.LIZIZ) {
            try {
                if (c0l6t.LIZJ) {
                    return;
                }
                c0l6t.LIZJ = true;
                c0l6t.LIZ.onFailure(str, i, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
