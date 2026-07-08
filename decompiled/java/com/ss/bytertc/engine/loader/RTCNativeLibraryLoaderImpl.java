package com.ss.bytertc.engine.loader;

import X.C2188811AlT;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.engineimpl.NativeLoader;

/* JADX INFO: loaded from: classes21.dex */
public class RTCNativeLibraryLoaderImpl implements RTCNativeLibraryLoader {
    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoader
    public boolean load(String str) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load so :");
            sbLIZ.append(str);
            Logging.i("RtcNativeLibraryLoaderImpl", C2188811AlT.LIZIZ(sbLIZ));
            NativeLoader.INVOKESTATIC_com_ss_bytertc_engine_engineimpl_NativeLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("load so failed:");
            sbLIZ2.append(str);
            Logging.i("RtcNativeLibraryLoaderImpl", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
    }
}
