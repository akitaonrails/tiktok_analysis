package com.bytedance.ttnet;

import X.C1493430oxx;
import X.C1493630oyH;
import X.InterfaceC827270Wcn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTALog;
import com.ss.android.agilelogger.ALog;

/* JADX INFO: loaded from: classes24.dex */
public class TTALog {
    public static volatile long sALogFuncAddr;

    public static void ensureALogInitialized() {
        sALogFuncAddr = ALog.getALogWriteFuncAddr();
        if (sALogFuncAddr == 0) {
            ALog.addNativeFuncAddrCallback(new InterfaceC827270Wcn() { // from class: X.0oxn
                @Override // X.InterfaceC827270Wcn
                public final void LIZ(long j) {
                    TTALog.lambda$ensureALogInitialized$0(j);
                }
            });
        }
    }

    public static C1493630oyH getCronetHttpClient() {
        if (C1493430oxx.LIZ()) {
            return C1493630oyH.LIZLLL(TTNetInit.getTTNetDepend().getContext());
        }
        return null;
    }

    public static long getALogFuncAddr() {
        return sALogFuncAddr;
    }

    public static void init() {
        ensureALogInitialized();
    }

    public static void lambda$ensureALogInitialized$0(long j) {
        if (sALogFuncAddr != 0 || j == 0) {
            return;
        }
        sALogFuncAddr = j;
        try {
            if (getCronetHttpClient() != null) {
                long j2 = sALogFuncAddr;
                C1493630oyH.LIZIZ();
                C1493630oyH.LIZJ.setAlogFuncAddr(j2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
