package com.ss.android.ugc.aweme.tars.wrap;

import X.C1273390jF3;
import X.C1273400jF4;
import X.C1273410jF5;
import X.C1273440jF8;
import X.InterfaceC1273460jFA;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public interface TarsWrapperInference {
    public static final C1273440jF8 LIZ = C1273440jF8.LIZ;

    public static final class TarsWrapperInferenceEmptyService implements TarsWrapperInference {
        @Override // com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference
        public final boolean LIZ() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference
        public final void LIZIZ(String str, InterfaceC1273460jFA interfaceC1273460jFA) {
        }

        @Override // com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference
        public final void LIZJ(String str, C1273390jF3 c1273390jF3) {
        }

        @Override // com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference
        public final void LIZLLL(String str, C1273400jF4 c1273400jF4) {
        }

        @Override // com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference
        public final void LJ(String str, Map map, C1273410jF5 c1273410jF5) {
        }

        @Override // com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference
        public final void release(String str) {
        }
    }

    boolean LIZ();

    void LIZIZ(String str, InterfaceC1273460jFA interfaceC1273460jFA);

    void LIZJ(String str, C1273390jF3 c1273390jF3);

    void LIZLLL(String str, C1273400jF4 c1273400jF4);

    void LJ(String str, Map map, C1273410jF5 c1273410jF5);

    void release(String str);
}
