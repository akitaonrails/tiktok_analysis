package com.ss.android.ugc.aweme.comment.audio.ui.recorder;

import X.C0VSJ;
import X.C1342260l28;
import X.C1344030l4z;
import X.C1352520lIg;
import X.C1352580lIm;
import X.C1352670lIv;
import X.C1352690lIx;
import X.C1383370m6R;
import X.C13LE;
import X.C13LP;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C458520HyU;
import X.InterfaceC0148002o;
import X.InterfaceC1352650lIt;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentAudioRecordViewModel extends AssemViewModel<C1352520lIg> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public InterfaceC665370Q7z LL;
    public final C1352580lIm LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentAudioRecordViewModel.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1352520lIg(0);
    }

    public final void vQ2() {
        C1352670lIv.LIZ.getClass();
        if (C1352670lIv.LIZLLL && C1352670lIv.LIZIZ(C1383370m6R.LIZ) && C1352670lIv.LIZLLL) {
            try {
                C1352670lIv.LIZJ().stopRecord();
                C1352670lIv.LIZLLL = false;
                InterfaceC1352650lIt interfaceC1352650lIt = C1352670lIv.LJIIIIZZ;
                if (interfaceC1352650lIt != null) {
                    interfaceC1352650lIt.LIZ(null);
                }
                String wavFilePath = C1352670lIv.LIZJ().getWavFilePath();
                if (wavFilePath == null || wavFilePath.length() == 0) {
                    return;
                }
                new C0VSJ(wavFilePath).delete();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to stop recording in cancel: ");
                sbLIZ.append(e.getMessage());
                C1344030l4z.LIZ("CommentAudioRecorder", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void yQ2() {
        List listLLIIII;
        C1352670lIv c1352670lIv = C1352670lIv.LIZ;
        c1352670lIv.getClass();
        if (C1352670lIv.LIZLLL && C1352670lIv.LIZIZ(C1383370m6R.LIZ)) {
            C1352670lIv.LIZLLL = false;
            try {
                long jStopRecord = C1352670lIv.LIZJ().stopRecord();
                synchronized (c1352670lIv) {
                    try {
                        listLLIIII = C13LP.LLIIII(C1352670lIv.LJFF);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                InterfaceC1352650lIt interfaceC1352650lIt = C1352670lIv.LJIIIIZZ;
                if (interfaceC1352650lIt != null) {
                    String wavFilePath = C1352670lIv.LIZJ().getWavFilePath();
                    if (wavFilePath == null) {
                        wavFilePath = "";
                    }
                    interfaceC1352650lIt.LIZ(new C458520HyU(wavFilePath, jStopRecord, listLLIIII, C1352690lIx.LIZ().pointRate));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Recording stopped, duration: ");
                sbLIZ.append(jStopRecord);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed to stop recording: ");
                sbLIZ2.append(e.getMessage());
                C1344030l4z.LIZ("CommentAudioRecorder", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0lIm] */
    public CommentAudioRecordViewModel() {
        new C1342260l28(new AwS565S0100000_21(this, 105));
        this.LLILLJJLI = new InterfaceC1352650lIt() { // from class: X.0lIm
            @Override // X.InterfaceC1352650lIt
            public final void onStart() {
                this.LIZ.setState(AFwS259S0000000_21.get$arr$(58));
                C23250099c.LIZLLL(this.LIZ.getAssemVMScope(), null, null, new C1352590lIn(this.LIZ, null), 3);
            }

            @Override // X.InterfaceC1352650lIt
            public final void LIZ(C458520HyU c458520HyU) {
                float[] fArrLLI;
                synchronized (C1352670lIv.LIZ) {
                    try {
                        fArrLLI = C13LP.LLI(C1352670lIv.LJFF);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (c458520HyU != null) {
                    C23250099c.LIZLLL(this.LIZ.getAssemVMScope(), null, null, new C1352630lIr(c458520HyU, this.LIZ, fArrLLI, null), 3);
                } else {
                    this.LIZ.setState(AFwS259S0000000_21.get$arr$(59));
                }
                C1352670lIv.LJIIIIZZ = null;
            }
        };
    }

    public final long wQ2(long j) {
        if (j > getState().LLILLL) {
            return getState().LLILLL;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r15 = this;
            r4 = r16
            boolean r0 = r4 instanceof X.C1352600lIo
            r8 = r15
            if (r0 == 0) goto Lb0
            r3 = r4
            X.0lIo r3 = (X.C1352600lIo) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb0
            int r2 = r2 - r1
            r3.LLILLL = r2
        L15:
            java.lang.Object r1 = r3.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r2 = 1
            if (r0 == 0) goto L99
            if (r0 != r2) goto Lbd
            X.C155000ia.LIZIZ(r1)
        L25:
            X.0lIv r7 = X.C1352670lIv.LIZ
            r7.getClass()
            boolean r0 = X.C1352670lIv.LIZLLL
            if (r0 == 0) goto L96
            long r9 = android.os.SystemClock.uptimeMillis()
            long r0 = X.C1352670lIv.LJ
            long r9 = r9 - r0
        L35:
            X.002o r0 = r8.getState()
            X.0lIg r0 = (X.C1352520lIg) r0
            long r0 = r0.LLILLL
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 < 0) goto L56
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "over max duration, duration = "
            r1.append(r0)
            r1.append(r9)
            X.C2188811AlT.LIZIZ(r1)
            r8.yQ2()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L56:
            X.002o r0 = r8.getState()
            X.0lIg r0 = (X.C1352520lIg) r0
            long r4 = r0.LLILLL
            r0 = 5000(0x1388, float:7.006E-42)
            long r0 = (long) r0
            long r4 = r4 - r0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L7f
            r11 = 1
        L67:
            if (r11 == 0) goto L7c
            X.002o r0 = r8.getState()
            X.0lIg r0 = (X.C1352520lIg) r0
            long r12 = r0.LLILLL
            long r12 = r12 - r9
            r0 = 800(0x320, float:1.121E-42)
            long r0 = (long) r0
            long r12 = r12 + r0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r12 = r12 / r0
        L7a:
            monitor-enter(r7)
            goto L81
        L7c:
            r12 = 0
            goto L7a
        L7f:
            r11 = 0
            goto L67
        L81:
            java.util.List<java.lang.Float> r0 = X.C1352670lIv.LJI     // Catch: java.lang.Throwable -> Lb7
            java.util.List r14 = X.C13LP.LLIIII(r0)     // Catch: java.lang.Throwable -> Lb7
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Lb7
            r0.clear()     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r7)
            X.0lIp r7 = new X.0lIp
            r7.<init>(r8, r9, r11, r12, r14)
            r8.setState(r7)
            goto L9c
        L96:
            r9 = -1
            goto L35
        L99:
            X.C155000ia.LIZIZ(r1)
        L9c:
            X.0lIv r0 = X.C1352670lIv.LIZ
            r0.getClass()
            boolean r0 = X.C1352670lIv.LIZLLL
            if (r0 == 0) goto Lc5
            r3.LLILLL = r2
            r0 = 100
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r3)
            if (r0 != r6) goto L25
            return r6
        Lb0:
            X.0lIo r3 = new X.0lIo
            r3.<init>(r8, r4)
            goto L15
        Lb7:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r7)
            throw r0
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc5:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel.xQ2(X.05Vn):java.lang.Object");
    }
}
