package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.AnonymousClass0950;
import X.C1075800e6M;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1262300ixA;
import X.InterfaceC1261750iwH;
import X.InterfaceC1262230ix3;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public interface IUserCardListAbility extends InterfaceC494301wD {
    void Eg(InterfaceC1261750iwH interfaceC1261750iwH);

    int H40(InterfaceC1891350zJl interfaceC1891350zJl);

    boolean HP0(String str);

    void K70(C1075800e6M c1075800e6M);

    AnonymousClass0950 ND2();

    Set<String> Nr2();

    void Tr2(C1261650iw7 c1261650iw7, boolean z);

    void cN1(InterfaceC1262230ix3 interfaceC1262230ix3);

    void dL0(C1261860iwS c1261860iwS);

    void eZ(C1261860iwS c1261860iwS, String str);

    C1262300ixA getConfig();

    C1075800e6M getState();

    void hV();

    boolean it2(String str);

    void ng(InterfaceC1261750iwH interfaceC1261750iwH);

    void onCleared();

    void rz(C1261860iwS c1261860iwS);

    void v52(Function1<? super InterfaceC1261750iwH, Unit> function1);
}
