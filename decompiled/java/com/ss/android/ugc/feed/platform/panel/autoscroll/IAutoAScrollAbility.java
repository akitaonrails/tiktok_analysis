package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.EnumC584570MwJ;
import X.InterfaceC494301wD;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public interface IAutoAScrollAbility extends InterfaceC494301wD {
    boolean AU0();

    void HC1();

    void OE(int i, int i2);

    void Wa1(Function1<? super Boolean, Unit> function1);

    void dq1(Aweme aweme);

    MutableLiveData dr1();

    void lZ(boolean z, boolean z2);

    void mb1(Function1<? super Boolean, Unit> function1);

    void qt0(String str, boolean z);

    void uD2();

    EnumC584570MwJ xo1();

    void yb0(AwS590S0100000_11 awS590S0100000_11);
}
