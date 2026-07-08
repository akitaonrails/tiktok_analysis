package com.ss.android.ugc.aweme.autopick.api;

import X.C0FOG;
import X.C19A3;
import X.EnumC2004507tD;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC524180Kh6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS657S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public interface AutoPickServiceApi {
    InterfaceC524180Kh6 LIZLLL();

    Object LJ(Context context, InterfaceC1364105Vn<? super EnumC2004507tD> interfaceC1364105Vn);

    void LJFF(String str, String str2, String str3);

    C19A3 LJI();

    boolean LJII();

    void LJIIIIZZ(String str, String str2, String str3);

    void LJIIIZ(C0FOG c0fog, AwS657S0100000_8 awS657S0100000_8, AwS587S0100000_8 awS587S0100000_8, AwS587S0100000_8 awS587S0100000_82, AwS552S0100000_8 awS552S0100000_8);

    InterfaceC1631620sYq LJIIJ(Activity activity, Intent intent);

    Object LJIIJJI(String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Class<? extends C19A3> LJIIL();

    boolean LJIILIIL(int i, String str, boolean z, boolean z2);
}
