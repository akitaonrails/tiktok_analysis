package com.ss.android.ugc.aweme.service;

import X.AnonymousClass1623;
import X.AnonymousClass1629;
import X.C00I7;
import X.C0Q5X;
import X.C0Q69;
import X.C160B;
import X.C160X;
import X.C2807016v;
import X.C2808016w;
import X.C581750Mrl;
import X.EnumC1782680wUU;
import X.EnumC20038913at;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public interface ICLAPerfETService {
    String LIZ(String str);

    void LIZIZ(Aweme aweme, C0Q5X c0q5x);

    void LIZJ(int i, Integer num, String str, String str2, boolean z, boolean z2);

    C2807016v LIZLLL(C00I7 c00i7, String str, String str2, Function0 function0, Function1 function1);

    void LJ(String str, String str2);

    C160X LJFF(Aweme aweme, String str);

    void LJI(Aweme aweme, C581750Mrl c581750Mrl);

    void LJII(String str, String str2, AnonymousClass1623 anonymousClass1623, int i, Integer num, Integer num2, Integer num3, Integer num4, String str3, String str4, Boolean bool);

    void LJIIIIZZ(String str, C160B c160b);

    C2808016w LJIIIZ(C00I7 c00i7, String str, String str2, String str3);

    void LJIIJ();

    void LJIIJJI(String str);

    void LJIIL(String str, String str2, String str3);

    void LJIILIIL(C0Q69 c0q69, boolean z);

    void LJIILJJIL(WeakReference<Context> weakReference, Aweme aweme, String str, boolean z);

    void LJIILL(Aweme aweme, String str, String str2, String str3, String str4, EnumC20038913at enumC20038913at, AnonymousClass1629 anonymousClass1629, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    void LJIILLIIL(String str, String str2);

    void LJIIZILJ(C0Q69 c0q69, String str);

    void LJIJ(String str, String str2);

    void LJIJI(long j, String str);

    void LJIJJ(Aweme aweme, C160B c160b, boolean z, WeakReference<Context> weakReference, String str);

    void LJIJJLI(String str);

    void LJIL(String str, EnumC1782680wUU enumC1782680wUU);

    void LJJ(String str);

    String LJJI(String str);

    void LJJIFFI(String str, String str2, String str3, String str4);

    void clear();

    void onDestroy();
}
