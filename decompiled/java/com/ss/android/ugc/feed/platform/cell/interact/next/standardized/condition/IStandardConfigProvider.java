package com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition;

import X.AbstractC1387105bp;
import X.C704830Rkn;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC702490Rh1;
import X.InterfaceC702540Rh6;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public interface IStandardConfigProvider {
    Function1<WeakReference<C704830Rkn>, Function2<Map<String, Object>, Function0<Unit>, Unit>> Ca();

    Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> I5();

    Function2<WeakReference<C704830Rkn>, String, Map<String, String>> ak();

    Function1<WeakReference<C704830Rkn>, InterfaceC702540Rh6> g3();

    Function1<Lifecycle, InterfaceC702490Rh1<? extends Object>> h1();

    String o7();
}
