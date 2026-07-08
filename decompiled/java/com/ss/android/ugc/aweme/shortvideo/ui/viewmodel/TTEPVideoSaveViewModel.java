package com.ss.android.ugc.aweme.shortvideo.ui.viewmodel;

import X.AbstractC1409150mm1;
import X.C1409130mlz;
import X.C1409170mm3;
import X.C23250099c;
import X.C560530Lyd;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: loaded from: classes23.dex */
public final class TTEPVideoSaveViewModel extends ViewModel {
    public final PublishModel LL;
    public final C560530Lyd<AbstractC1409150mm1> LLILLJJLI;
    public final C560530Lyd LLILLL;

    public TTEPVideoSaveViewModel(PublishModel publishModel) {
        this.LL = publishModel;
        new MutableLiveData(Boolean.TRUE);
        C560530Lyd<AbstractC1409150mm1> c560530Lyd = new C560530Lyd<>();
        this.LLILLJJLI = c560530Lyd;
        this.LLILLL = c560530Lyd;
    }

    public final void vQ2(boolean z) {
        if (z) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1409130mlz(this, null), 3);
        } else {
            this.LLILLJJLI.LJIIJ(C1409170mm3.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[Catch: all -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0013, B:6:0x0037, B:7:0x003b, B:13:0x0049, B:16:0x004e, B:18:0x0058, B:20:0x005e, B:23:0x0076, B:25:0x007a, B:28:0x0081, B:30:0x0085, B:33:0x0097), top: B:44:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object wQ2(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r7, X.InterfaceC1364105Vn r8) {
        /*
            X.099m r4 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r8)
            r4.<init>(r0)
            X.0nPf r6 = X.C1433730nPf.LIZ
            kotlin.jvm.internal.AwS626S0100000_12 r5 = new kotlin.jvm.internal.AwS626S0100000_12
            r0 = 32
            r5.<init>(r4, r0)
            monitor-enter(r6)
            X.0WiJ r3 = X.C830690WiJ.LIZIZ     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "PublishScheduler | startPublish creationId:"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r7.creationId     // Catch: java.lang.Throwable -> Lab
            r1.append(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = " publishId:"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lab
            r2 = 0
            r1.append(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lab
            X.C201955140j.LIZJ(r3, r0)     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r7.isTTEPSave     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L3b
            X.C1433730nPf.LJJIII(r7, r5, r2)     // Catch: java.lang.Throwable -> Lab
            goto L9c
        L3b:
            java.lang.String r0 = r7.creationId     // Catch: java.lang.Throwable -> Lab
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto L44
            goto L46
        L44:
            r0 = 0
            goto L47
        L46:
            r0 = 1
        L47:
            if (r0 == 0) goto L4e
            X.C1433730nPf.LJJIII(r7, r2, r2)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r6)
            goto L9d
        L4e:
            X.0nPY r1 = X.C1433730nPf.LIZLLL     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = ""
            X.0nPL r3 = X.C1433660nPY.LIZJ(r1, r0, r7)     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L97
            X.0nOn r1 = r3.LIZLLL     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r1 instanceof X.C1433220nOq     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L76
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "ReStartNewPublish "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lab
            r1.append(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lab
            X.C1433730nPf.LJJIFFI(r0)     // Catch: java.lang.Throwable -> Lab
            X.C1433730nPf.LJJIII(r7, r2, r2)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r6)
            goto L9d
        L76:
            boolean r0 = r1 instanceof X.C1433210nOp     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L81
            X.0nOp r1 = (X.C1433210nOp) r1     // Catch: java.lang.Throwable -> Lab
            X.C1433730nPf.LJJIII(r7, r2, r2)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r6)
            goto L9d
        L81:
            boolean r0 = r1 instanceof X.C1433490nPH     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L97
            java.lang.String r0 = "ReStartRunningPublishWhenPublishIdIsNull"
            X.C1433730nPf.LJJIFFI(r0)     // Catch: java.lang.Throwable -> Lab
            java.util.concurrent.ExecutorService r2 = X.C1433730nPf.LJI     // Catch: java.lang.Throwable -> Lab
            Y.ARunnableS26S1200000_22 r1 = new Y.ARunnableS26S1200000_22     // Catch: java.lang.Throwable -> Lab
            r0 = 2
            r1.<init>(r3, r7, r0)     // Catch: java.lang.Throwable -> Lab
            r2.execute(r1)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r6)
            goto L9d
        L97:
            X.C1433730nPf.LJJIII(r7, r2, r2)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r6)
            goto L9d
        L9c:
            monitor-exit(r6)
        L9d:
            java.lang.Object r1 = r4.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto Laa
            X.C099Q.LIZJ(r8)
        Laa:
            return r1
        Lab:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.TTEPVideoSaveViewModel.wQ2(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel, X.05Vn):java.lang.Object");
    }
}
