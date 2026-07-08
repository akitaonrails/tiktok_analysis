package com.ss.android.ugc.aweme.im.streak.api;

import X.AbstractC1549150qPp;
import X.C06ET;
import X.C06F6;
import X.C06G9;
import X.C06H2;
import X.C06H4;
import X.C06LY;
import X.C0Y8T;
import X.C1520305xJ;
import X.C1728606po;
import X.C354710DvR;
import X.C869590Y9l;
import X.EnumC1578206Fw;
import X.EnumC1579606Gk;
import X.InterfaceC1364105Vn;
import X.InterfaceC1890940zJ6;
import X.ViewOnClickListenerC1576306Fd;
import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS492S0200000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public interface IStreakService {
    public static final C06LY LJJIIZ = C06LY.LIZ;

    String A();

    Object B(String str, SystemContent.Key key);

    int C(String str, boolean z);

    boolean D(String str);

    boolean E(String str);

    void F(int i, int i2, String str, boolean z);

    boolean G(String str);

    void H(String str, String str2, String str3);

    Map<Integer, StreakInlineMsgInfo> I(String str);

    void J(C06F6 c06f6);

    void K(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2);

    void L(String str);

    void LIZ();

    void M();

    void N(Activity activity, C06G9 c06g9, C06H2 c06h2, C06ET c06et, String str, String str2, String str3, C06H4 c06h4);

    String O(int i);

    boolean P(String str, boolean z);

    void Q(String str);

    boolean R(C869590Y9l c869590Y9l);

    Integer S(String str);

    Object T(Integer num, String str, InterfaceC1364105Vn interfaceC1364105Vn);

    void U(Function0 function0);

    ViewOnClickListenerC1576306Fd V(Context context, EnumC1578206Fw enumC1578206Fw, Function1 function1);

    boolean W();

    void X(Function0 function0);

    Map<String, InterfaceC1890940zJ6> Y();

    Pair<String, Map<String, String>> Z();

    void a(int i, String str, List list, Long l);

    String a0();

    C1520305xJ b(C0Y8T c0y8t, String str);

    void b0(String str);

    void c();

    Class<? extends AbstractC1549150qPp<?, ?>> c0();

    void d(BusinessCommandMessage businessCommandMessage);

    int d0(long j, String str);

    void e(String str, String str2, C06H2 c06h2, String str3);

    int f(String str);

    C354710DvR g(int i, String str);

    boolean h(String str, Map<String, String> map);

    boolean i(int i, String str);

    void j(C06H2 c06h2);

    boolean k(EnumC1578206Fw enumC1578206Fw);

    void l(Map map, AwS492S0200000_31 awS492S0200000_31);

    boolean m(C869590Y9l c869590Y9l);

    void n(String str, int i, String str2, C06H2 c06h2, String str3, C869590Y9l c869590Y9l);

    EnumC1579606Gk o(StreakData streakData);

    C1728606po p(boolean z, FrameLayout frameLayout, int i, String str, AwS546S0100000_2 awS546S0100000_2, AwS581S0100000_2 awS581S0100000_2);

    void q(String str, Function1 function1);

    StreakData r(String str, boolean z);

    void s(int i, String str);

    Map t(String str, boolean z, List list);

    void u(String str);

    String v(String str);

    void w(String str, String str2, C06H2 c06h2, String str3);

    void x(C06F6 c06f6);

    void y();

    Map z(String str, boolean z, List list);
}
