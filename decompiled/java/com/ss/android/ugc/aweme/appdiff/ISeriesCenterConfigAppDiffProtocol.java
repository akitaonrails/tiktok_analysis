package com.ss.android.ugc.aweme.appdiff;

import X.C01GW;
import X.C2097608Jq;
import X.C279230Awz;
import X.C296910BkP;
import X.C452501pT;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public interface ISeriesCenterConfigAppDiffProtocol {
    public static final Companion LIZ = Companion.LIZ;

    public static final class Companion {
        public static final /* synthetic */ Companion LIZ = new Companion();
        public static final C01GW<ISeriesCenterConfigAppDiffProtocol> LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(945));

        public static final class DowngradeInstance implements ISeriesCenterConfigAppDiffProtocol {
            @Override // com.ss.android.ugc.aweme.appdiff.ISeriesCenterConfigAppDiffProtocol
            public final int getColumnCount() {
                return ((Boolean) C279230Awz.LIZ.getValue()).booleanValue() ? 2 : 3;
            }

            @Override // com.ss.android.ugc.aweme.appdiff.ISeriesCenterConfigAppDiffProtocol
            public final boolean LIZ() {
                return C296910BkP.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.appdiff.ISeriesCenterConfigAppDiffProtocol
            public final Map<String, Object> LIZIZ() {
                return C2097608Jq.LJ();
            }
        }
    }

    boolean LIZ();

    Map<String, Object> LIZIZ();

    int getColumnCount();
}
