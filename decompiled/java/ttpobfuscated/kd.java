package ttpobfuscated;

import X.C2097608Jq;
import X.InterfaceC1364105Vn;
import java.util.Map;
import kotlin.Unit;
import ttp.orbu.sdk.app.domain.usecase.TTPResult;

/* JADX INFO: loaded from: classes24.dex */
public interface kd {
    Object a(String str, byte[] bArr, String str2, Map<String, String> map, InterfaceC1364105Vn<? super TTPResult<Unit>> interfaceC1364105Vn);

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(kd kdVar, String str, byte[] bArr, String str2, Map map, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    map = C2097608Jq.LJ();
                }
                return kdVar.a(str, bArr, str2, map, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putSample");
        }
    }
}
