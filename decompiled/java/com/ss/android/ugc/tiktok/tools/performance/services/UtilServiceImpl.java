package com.ss.android.ugc.tiktok.tools.performance.services;

import X.AbstractC1656460tCu;
import X.C0BP3;
import X.C20102213l6;
import X.C201955140j;
import X.C2188811AlT;
import X.C268150Af7;
import X.C354000DuI;
import X.C786410Ut5;
import X.InterfaceC1450850nrH;
import X.InterfaceC214897198d;
import X.RunnableC514801zW;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS119S1200000_2;
import kotlin.jvm.internal.AwS13S2300000_3;
import kotlin.jvm.internal.AwS20S2300000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class UtilServiceImpl implements InterfaceC1450850nrH {
    public static final UtilServiceImpl LIZ = new UtilServiceImpl();

    @Override // X.InterfaceC1450850nrH
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1450850nrH
    public final void LIZJ(LifecycleOwner lifecycleOwner, String str, Function0<Unit> function0) {
        if (lifecycleOwner != null && !(lifecycleOwner instanceof InterfaceC214897198d)) {
            AwS119S1200000_2 awS119S1200000_2 = new AwS119S1200000_2(lifecycleOwner, str, function0, 11);
            if (Looper.getMainLooper().isCurrentThread()) {
                C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" add observer in main thread");
                C201955140j.LIZLLL(c20102213l6, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ));
                awS119S1200000_2.invoke();
                return;
            }
            C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" add observer post to main thread");
            C201955140j.LIZLLL(c20102213l62, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(awS119S1200000_2, (Function0<Unit>) 103));
            return;
        }
        C20102213l6 c20102213l63 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append(" lifecycleOwner is ");
        sbLIZ3.append(lifecycleOwner);
        sbLIZ3.append(", is null or ISAFActivity");
        C201955140j.LIZLLL(c20102213l63, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC1450850nrH
    public final void LIZ(NLEEditor nLEEditor, String str, LifecycleOwner lifecycleOwner, C354000DuI c354000DuI) {
        nLEEditor.addConsumer(c354000DuI);
        if (!((Boolean) C268150Af7.LIZ.getValue()).booleanValue()) {
            C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" addSafeConsumer: not enable");
            C201955140j.LIZLLL(c20102213l6, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (lifecycleOwner == null) {
            return;
        }
        AwS20S2300000_29 awS20S2300000_29 = new AwS20S2300000_29(lifecycleOwner, str, str, nLEEditor, c354000DuI, 0);
        if (Looper.getMainLooper().isCurrentThread()) {
            C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" add observer in main thread");
            C201955140j.LIZLLL(c20102213l62, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ2));
            awS20S2300000_29.invoke();
            return;
        }
        C20102213l6 c20102213l63 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append(" add observer post to main thread");
        C201955140j.LIZLLL(c20102213l63, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ3));
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(awS20S2300000_29, (Function0<Unit>) 103));
    }

    @Override // X.InterfaceC1450850nrH
    public final DownloadTask LIZIZ(LifecycleOwner lifecycleOwner, AbstractC1656460tCu abstractC1656460tCu, DownloadTask downloadTask, String str) {
        downloadTask.subThreadListener(abstractC1656460tCu);
        if (!((Boolean) C0BP3.LIZ.getValue()).booleanValue()) {
            C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" safeSubThreadListener: not enable");
            C201955140j.LIZLLL(c20102213l6, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" safeSubThreadListener: add lifecycleOwner = ");
            sbLIZ2.append(lifecycleOwner);
            C201955140j.LIZLLL(c20102213l62, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ2));
            if (lifecycleOwner != null) {
                AwS13S2300000_3 awS13S2300000_3 = new AwS13S2300000_3(lifecycleOwner, str, downloadTask, str, abstractC1656460tCu, 0);
                if (Looper.getMainLooper().isCurrentThread()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append(" add observer in main thread");
                    C201955140j.LIZLLL(c20102213l62, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ3));
                    awS13S2300000_3.invoke();
                    return downloadTask;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append(" add observer post to main thread");
                C201955140j.LIZLLL(c20102213l62, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ4));
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(awS13S2300000_3, (Function0<Unit>) 103));
                return downloadTask;
            }
        }
        return downloadTask;
    }
}
