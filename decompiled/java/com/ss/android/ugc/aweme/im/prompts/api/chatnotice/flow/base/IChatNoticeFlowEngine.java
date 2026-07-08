package com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base;

import X.AbstractC2252651DEx;
import X.AnonymousClass0684;
import X.C069Y;
import X.C06N8;
import X.C06NH;
import X.C06O6;
import X.C06OD;
import X.C06OO;
import X.C13E8;
import X.C15591068n;
import X.C1599606Oc;
import X.EnumC1596306Mv;
import X.InterfaceC1364105Vn;
import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public interface IChatNoticeFlowEngine extends C06N8 {
    public static final C15591068n LIZ = C15591068n.LIZ;

    @Override // X.C06N8
    Object LIZ(boolean z, String str, Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LIZIZ();

    EnumC1596306Mv LIZJ(C06NH c06nh);

    Object LIZLLL(InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2, boolean z, boolean z2);

    void LJ(C069Y c069y);

    C13E8<C1599606Oc> LJFF();

    void LJIIIIZZ(boolean z);

    <T extends C06OO> void LJIIIZ(C06OD<T> c06od);

    void LJIIJ(LifecycleCoroutineScope lifecycleCoroutineScope, boolean z, String str, AbstractC2252651DEx abstractC2252651DEx);

    <T extends C06OO> void LJIIJJI(C06O6<T> c06o6);

    void LJIIL(EnumC1596306Mv enumC1596306Mv);

    AnonymousClass0684<C06OO> LJIILIIL(EnumC1596306Mv enumC1596306Mv);

    Object LJIILJJIL(C06OO c06oo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJIILL(Set<? extends EnumC1596306Mv> set, Function0<? extends C06O6<? extends C06OO>> function0);

    void LJIILLIIL(AwS546S0100000_2 awS546S0100000_2);
}
