package com.ss.android.ugc.feed.platform.panel.datalayer;

import X.C606500Nqa;
import X.C606540Nqe;
import X.C606560Nqg;
import X.C606580Nqi;
import X.C606600Nqk;
import X.InterfaceC494301wD;
import X.InterfaceC606850Nr9;
import X.InterfaceC606860NrA;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface DataLayerAbility extends InterfaceC494301wD {
    void Aq2(int i, String str, List list);

    void C3(List<? extends Aweme> list);

    void GF0(int i, Aweme aweme, String str);

    void GQ0(List<? extends Aweme> list);

    C606600Nqk Gm2(Aweme aweme, int i, C606500Nqa c606500Nqa);

    C606540Nqe KO1(List<? extends Aweme> list, C606500Nqa c606500Nqa);

    int Q0();

    C606540Nqe UM1(int i, C606500Nqa c606500Nqa);

    C606600Nqk V32(List<? extends Aweme> list, int i, C606500Nqa c606500Nqa);

    C606560Nqg YE0(int i, int i2, C606500Nqa c606500Nqa, List list);

    void Z61(List<? extends Aweme> list);

    int au(Aweme aweme);

    void gJ1(int i, int i2, String str, List list, List list2);

    Aweme getItem(int i);

    List<Aweme> getItems();

    void jl1(C606580Nqi c606580Nqi);

    void kh0(InterfaceC606860NrA interfaceC606860NrA);

    void oQ1(InterfaceC606850Nr9 interfaceC606850Nr9);

    void pV(InterfaceC606850Nr9 interfaceC606850Nr9);

    C606540Nqe qH0(int i, C606500Nqa c606500Nqa);

    void rR1(Map map);

    C606540Nqe wT(Aweme aweme, C606500Nqa c606500Nqa);
}
