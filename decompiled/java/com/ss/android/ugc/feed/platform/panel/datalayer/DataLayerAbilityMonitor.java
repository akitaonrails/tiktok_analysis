package com.ss.android.ugc.feed.platform.panel.datalayer;

import X.C299770Bp1;
import X.C606450NqV;
import X.C606480NqY;
import X.C606500Nqa;
import X.C606510Nqb;
import X.C606520Nqc;
import X.C606530Nqd;
import X.C606540Nqe;
import X.C606560Nqg;
import X.C606580Nqi;
import X.C606600Nqk;
import X.InterfaceC606850Nr9;
import X.InterfaceC606860NrA;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS135S0201000_9;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS69S0301000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class DataLayerAbilityMonitor implements DataLayerAbility {
    public final DataLayerAbility LL;
    public final C606480NqY LLILLJJLI;

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final int Q0() {
        return this.LL.Q0();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final List<Aweme> getItems() {
        return this.LL.getItems();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void C3(List<? extends Aweme> list) {
        this.LL.C3(list);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void GQ0(List<? extends Aweme> list) {
        this.LL.GQ0(list);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void Z61(List<? extends Aweme> list) {
        this.LL.Z61(list);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final int au(Aweme aweme) {
        return this.LL.au(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final Aweme getItem(int i) {
        return this.LL.getItem(i);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void jl1(C606580Nqi c606580Nqi) {
        this.LL.jl1(c606580Nqi);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void kh0(InterfaceC606860NrA interfaceC606860NrA) {
        this.LL.kh0(interfaceC606860NrA);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void oQ1(InterfaceC606850Nr9 interfaceC606850Nr9) {
        this.LL.oQ1(interfaceC606850Nr9);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void pV(InterfaceC606850Nr9 interfaceC606850Nr9) {
        this.LL.pV(interfaceC606850Nr9);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void rR1(Map map) {
        this.LL.rR1(map);
    }

    public DataLayerAbilityMonitor(DataLayerAbilityImpl dataLayerAbilityImpl, String str) {
        this.LL = dataLayerAbilityImpl;
        C606480NqY c606480NqY = new C606480NqY(str);
        this.LLILLJJLI = c606480NqY;
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            pV(c606480NqY);
            if (C299770Bp1.LIZ() == 2 || C299770Bp1.LIZ() == 4) {
                pV(new C606450NqV(this));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606540Nqe KO1(List<? extends Aweme> list, C606500Nqa c606500Nqa) {
        C606540Nqe c606540NqeKO1 = this.LL.KO1(list, c606500Nqa);
        C606480NqY c606480NqY = this.LLILLJJLI;
        c606480NqY.getClass();
        if (!c606540NqeKO1.LIZ()) {
            c606480NqY.LJI("delete", c606500Nqa, c606540NqeKO1);
            return c606540NqeKO1;
        }
        c606480NqY.LIZJ(1, c606540NqeKO1.LIZLLL, c606500Nqa, c606540NqeKO1.LIZJ);
        C606480NqY.LIZIZ.LJIIJJI(new AwS253S0300000_9(c606540NqeKO1, c606500Nqa, list, 6));
        return c606540NqeKO1;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606540Nqe UM1(int i, C606500Nqa c606500Nqa) {
        C606540Nqe c606540NqeUM1 = this.LL.UM1(i, c606500Nqa);
        C606480NqY c606480NqY = this.LLILLJJLI;
        c606480NqY.getClass();
        if (!c606540NqeUM1.LIZ()) {
            c606480NqY.LJI("delete", c606500Nqa, c606540NqeUM1);
            return c606540NqeUM1;
        }
        c606480NqY.LIZJ(1, i, c606500Nqa, c606540NqeUM1.LIZJ);
        C606480NqY.LIZIZ.LJIIJJI(new AwS135S0201000_9(i, c606500Nqa, c606540NqeUM1, 5));
        return c606540NqeUM1;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606540Nqe qH0(int i, C606500Nqa c606500Nqa) {
        C606540Nqe c606540NqeQH0 = this.LL.qH0(i, c606500Nqa);
        C606480NqY c606480NqY = this.LLILLJJLI;
        c606480NqY.getClass();
        if (!c606540NqeQH0.LIZ()) {
            c606480NqY.LJI("delete", c606500Nqa, c606540NqeQH0);
            return c606540NqeQH0;
        }
        c606480NqY.LIZJ(1, c606540NqeQH0.LIZLLL, c606500Nqa, c606540NqeQH0.LIZJ);
        C606480NqY.LIZIZ.LJIIJJI(new C606520Nqc(i, c606500Nqa, c606540NqeQH0));
        return c606540NqeQH0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606540Nqe wT(Aweme aweme, C606500Nqa c606500Nqa) {
        C606540Nqe c606540NqeWT = this.LL.wT(aweme, c606500Nqa);
        C606480NqY c606480NqY = this.LLILLJJLI;
        c606480NqY.getClass();
        if (!c606540NqeWT.LIZ()) {
            c606480NqY.LJI("delete", c606500Nqa, c606540NqeWT);
            return c606540NqeWT;
        }
        c606480NqY.LIZJ(1, c606540NqeWT.LIZLLL, c606500Nqa, Collections.singletonList(aweme));
        C606480NqY.LIZIZ.LJIIJJI(new C606510Nqb(aweme, c606540NqeWT, c606500Nqa));
        return c606540NqeWT;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void Aq2(int i, String str, List list) {
        this.LL.Aq2(i, str, list);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void GF0(int i, Aweme aweme, String str) {
        this.LL.GF0(i, aweme, str);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606600Nqk Gm2(Aweme aweme, int i, C606500Nqa c606500Nqa) {
        C606600Nqk c606600NqkGm2 = this.LL.Gm2(aweme, i, c606500Nqa);
        C606480NqY c606480NqY = this.LLILLJJLI;
        c606480NqY.getClass();
        if (!c606600NqkGm2.LIZ()) {
            c606480NqY.LJI("insert", c606500Nqa, c606600NqkGm2);
            return c606600NqkGm2;
        }
        c606480NqY.LIZJ(0, i, c606500Nqa, Collections.singletonList(aweme));
        C606480NqY.LIZIZ.LJIIJJI(new AwS69S0301000_9(aweme, i, c606500Nqa, c606600NqkGm2, 1));
        return c606600NqkGm2;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606600Nqk V32(List<? extends Aweme> list, int i, C606500Nqa c606500Nqa) {
        C606600Nqk c606600NqkV32 = this.LL.V32(list, i, c606500Nqa);
        C606480NqY c606480NqY = this.LLILLJJLI;
        c606480NqY.getClass();
        if (!c606600NqkV32.LIZ()) {
            c606480NqY.LJI("insert", c606500Nqa, c606600NqkV32);
            return c606600NqkV32;
        }
        c606480NqY.LIZJ(0, i, c606500Nqa, list);
        C606480NqY.LIZIZ.LJIIJJI(new AwS69S0301000_9((List) list, (List<? extends Aweme>) i, (int) c606500Nqa, (C606500Nqa) c606600NqkV32, (C606600Nqk) 2));
        return c606600NqkV32;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606560Nqg YE0(int i, int i2, C606500Nqa c606500Nqa, List list) {
        C606560Nqg c606560NqgYE0 = this.LL.YE0(i, i2, c606500Nqa, list);
        C606480NqY c606480NqY = this.LLILLJJLI;
        c606480NqY.getClass();
        if (!c606560NqgYE0.LIZ()) {
            c606480NqY.LJI("replace", c606500Nqa, c606560NqgYE0);
            return c606560NqgYE0;
        }
        c606480NqY.LIZJ(2, i, c606500Nqa, list);
        C606480NqY.LIZIZ.LJIIJJI(new C606530Nqd(list, i, i2, c606500Nqa, c606560NqgYE0));
        return c606560NqgYE0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void gJ1(int i, int i2, String str, List list, List list2) {
        this.LL.gJ1(i, i2, str, list, list2);
    }
}
