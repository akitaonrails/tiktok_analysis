package com.ss.android.ugc.aweme.friendstab.service;

import X.C03H5;
import X.C0TRR;
import X.C0WHU;
import X.C1393110mM9;
import X.C1393160mME;
import X.C1393190mMH;
import X.C13IQ;
import X.C1587420rPY;
import X.C19EG;
import X.EnumC1392960mLu;
import X.EnumC1393020mM0;
import X.InterfaceC1392880mLm;
import X.InterfaceC691450RAh;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public interface IFriendsFeedService {
    boolean A2();

    String B2(C19EG c19eg, String str, String str2);

    boolean C2();

    boolean D1();

    void D2(InterfaceC1392880mLm interfaceC1392880mLm);

    void E1();

    boolean E2();

    boolean F2();

    void G2();

    void H2(InterfaceC1392880mLm interfaceC1392880mLm);

    void I2(String str);

    int J2();

    void K2(User user, Fragment fragment, Activity activity, EnumC1393020mM0 enumC1393020mM0, EnumC1392960mLu enumC1392960mLu, View view, Function1<? super Boolean, Unit> function1);

    String L2(Aweme aweme, Activity activity);

    boolean LIZ();

    C0WHU LIZIZ();

    boolean LLLLLLL();

    void M2(Activity activity, View view, Fragment fragment, C1393190mMH c1393190mMH, EnumC1393020mM0 enumC1393020mM0, EnumC1392960mLu enumC1392960mLu, User user, Function1 function1);

    int N2();

    boolean O2();

    void P2(Context context);

    Object Q2(InterfaceC691450RAh interfaceC691450RAh);

    void R1(boolean z);

    void R2(boolean z);

    void S1();

    int S2();

    boolean T1();

    void T2();

    String U1();

    long U2();

    boolean V1();

    String V2();

    void W1(String str, String str2);

    boolean W2();

    String X1();

    void X2();

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> Y1();

    void Y2(Context context);

    void Z1(long j);

    void Z2();

    void a2(int i);

    Aweme a3();

    Boolean b2(String str, EnumC1392960mLu enumC1392960mLu);

    void b3(Context context, Fragment fragment, User user, EnumC1393020mM0 enumC1393020mM0, C1393160mME c1393160mME, C1393110mM9 c1393110mM9);

    View c2(Context context);

    void c3(int i);

    void d2();

    Object d3(View view, Fragment fragment);

    void e2();

    void e3();

    void f2(EnumC1392960mLu enumC1392960mLu, String str, boolean z);

    void f3(boolean z);

    void g2(FriendsTabTopExperiment.FriendsTabTopConfig friendsTabTopConfig, Integer num);

    void g3(int i);

    boolean h2();

    void h3();

    void i2(C19EG c19eg);

    void i3(String str, String str2, String str3);

    List<String> j2();

    void j3(boolean z);

    void k2(List<String> list, boolean z);

    void k3(C19EG c19eg);

    boolean l2();

    boolean l3();

    C1587420rPY m2();

    void m3();

    void n2(String str);

    void n3();

    void o2(String str, ArrayList arrayList);

    void o3(String str, String str2, String str3);

    void onAwemeRead(int i, Aweme aweme, String str);

    void onFriendsV3StoryDetailRead(int i, Aweme aweme, String str);

    void p2(boolean z);

    void q2();

    IInterceptor r2();

    boolean s2();

    boolean shouldShowFriendsTab();

    boolean t2(Fragment fragment);

    boolean u2();

    C0TRR v2();

    boolean w2();

    View x2(Context context);

    void y2(String str, String str2);

    void z2(List<String> list);
}
