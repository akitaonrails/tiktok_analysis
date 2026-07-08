package com.ss.android.ugc.aweme.nxet.info;

import X.C01GW;
import X.C1163404gq;
import X.C452501pT;
import com.bytedance.bpea.transmit.IRegister;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class NxETEventMap {
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJII;
    public static int LIZ = -1;
    public static final ConcurrentHashMap<Integer, Long> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, JSONObject> LIZJ = new ConcurrentHashMap<>();
    public static final int LIZLLL = -1979025355;
    public static final C01GW LJI = C452501pT.LIZIZ(new C1163404gq());

    static {
        new JSONObject();
    }

    public static final class NxETEventMapClickRegister implements IRegister {
        @Override // com.bytedance.bpea.transmit.IRegister
        public final boolean enable() {
            return true;
        }

        @Override // com.bytedance.bpea.transmit.IRegister
        public final void LIZ(int i) {
            NxETEventMap.LIZ = i;
        }
    }

    public static final class NxETEventMapExposeRegister implements IRegister {
        @Override // com.bytedance.bpea.transmit.IRegister
        public final boolean enable() {
            return true;
        }

        @Override // com.bytedance.bpea.transmit.IRegister
        public final void LIZ(int i) {
            int i2 = NxETEventMap.LIZ;
        }
    }
}
