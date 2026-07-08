package ttpobfuscated;

import X.C1500770p9n;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501110pAL;
import X.InterfaceC1501200pAU;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public interface xa {
    @InterfaceC1501200pAU("/pki/keys.json")
    Object a(InterfaceC1364105Vn<? super C1500770p9n<List<String>>> interfaceC1364105Vn);

    @InterfaceC1501200pAU("pki/{type}/{version}/key.json")
    Object a(@InterfaceC1501110pAL("type") String str, @InterfaceC1501110pAL("version") int i, InterfaceC1364105Vn<? super C1500770p9n<String>> interfaceC1364105Vn);
}
