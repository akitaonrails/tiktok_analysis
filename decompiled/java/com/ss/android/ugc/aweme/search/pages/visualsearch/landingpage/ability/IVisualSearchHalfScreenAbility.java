package com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability;

import X.C665260Q7o;
import X.EnumC667250QFf;
import X.EnumC670450QRn;
import X.InterfaceC494301wD;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS104S0400000_6;

/* JADX INFO: loaded from: classes11.dex */
public interface IVisualSearchHalfScreenAbility extends InterfaceC494301wD {
    void A00(EnumC667250QFf enumC667250QFf, EnumC670450QRn enumC670450QRn);

    void Ey1(LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1);

    void Ic2(String str);

    void TR1(C665260Q7o c665260Q7o);

    void Uo0(LifecycleOwner lifecycleOwner, AwS104S0400000_6 awS104S0400000_6);

    boolean isFullScreen();

    boolean isShowing();

    Activity kp2();

    boolean pU();

    void wM(int i, int i2, boolean z);
}
