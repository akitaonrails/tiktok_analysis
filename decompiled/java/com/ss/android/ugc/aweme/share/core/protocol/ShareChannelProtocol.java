package com.ss.android.ugc.aweme.share.core.protocol;

import X.C06KX;
import X.C0M7Y;
import X.C1369610lkF;
import X.C1371600lnS;
import X.EnumC1369700lkO;
import X.EnumC1371620lnU;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import X.InterfaceC1372360log;
import android.graphics.drawable.Drawable;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public interface ShareChannelProtocol extends C06KX, InterfaceC1372360log {
    List<String> Ay2();

    Drawable DC();

    List<InterfaceC1369790lkX> KB0();

    InterfaceC1371860lns LK0();

    Comparator<InterfaceC1369790lkX> Pz0();

    Function1<C0M7Y, Unit> UR1();

    Set<String> V41(List<? extends InterfaceC1369790lkX> list);

    Boolean Vv2();

    C1369610lkF getUiConfig();

    String jv0();

    boolean oM();

    EnumC1369700lkO tC2();

    void tD();

    void tu(C1371600lnS c1371600lnS);

    EnumC1371620lnU xc0();

    Boolean z72();
}
