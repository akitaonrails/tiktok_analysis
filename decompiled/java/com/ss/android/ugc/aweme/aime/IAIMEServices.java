package com.ss.android.ugc.aweme.aime;

import X.C0MGA;
import X.C0MIO;
import X.C19A3;
import X.C19EG;
import X.C528850Kod;
import X.C534790KyD;
import X.C535240Kyw;
import X.C566210MIp;
import X.C566260MIu;
import X.EnumC1216670hlZ;
import X.EnumC566230MIr;
import X.InterfaceC1364105Vn;
import X.InterfaceC342760DcA;
import X.InterfaceC566190MIn;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public interface IAIMEServices {
    Object LIZ(Long l, Long l2, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn);

    void LIZIZ(Scene scene, EnumC566230MIr enumC566230MIr, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Function0<Unit> function0, int i);

    C0MIO LIZJ(Scene scene);

    Object LIZLLL(Object obj);

    Object LJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void LJFF(Activity activity, String str, String str2, Function0<Unit> function0);

    Object LJI(InterfaceC1364105Vn<? super C528850Kod> interfaceC1364105Vn);

    void LJII(C19EG c19eg, String str, String str2);

    ComposeView LJIIIIZZ(InterfaceC342760DcA interfaceC342760DcA, Context context);

    void LJIIIZ();

    Object LJIIJ(int i, int i2, InterfaceC1364105Vn<? super C535240Kyw> interfaceC1364105Vn);

    Object LJIIJJI(Context context, String str, String str2, String str3, String str4, String str5, boolean z, Function0 function0, InterfaceC1364105Vn interfaceC1364105Vn);

    C0MIO LJIIL(C19EG c19eg, C19A3 c19a3);

    void LJIILIIL(C19EG c19eg, long j, String str, AwS552S0100000_8 awS552S0100000_8);

    void LJIILJJIL(C19EG c19eg, List list, String str, String str2, Function0 function0, String str3, String str4, String str5, String str6, int i, Boolean bool, boolean z, String str7, String str8, Map map, Function0 function02, Function2 function2);

    void LJIILL(Fragment fragment, EnumC566230MIr enumC566230MIr, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, String str7, boolean z4, Function0 function0, int i);

    void LJIILLIIL(Fragment fragment, String str, String str2, String str3, String str4, String str5, String str6);

    Fragment LJIIZILJ(C19A3 c19a3, boolean z, String str, String str2, String str3, boolean z2, String str4, Function2<? super String, ? super String, Unit> function2, C0MGA c0mga, int i);

    String LJIJ(String str);

    Object LJIJI(AwS587S0100000_8 awS587S0100000_8, AwS552S0100000_8 awS552S0100000_8, AwS552S0100000_8 awS552S0100000_82, C566260MIu c566260MIu);

    Object LJIJJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    InterfaceC566190MIn LJIJJLI(Activity activity, LifecycleOwner lifecycleOwner, View view, ShortVideoContext shortVideoContext, AwS552S0100000_8 awS552S0100000_8, C566210MIp c566210MIp, C534790KyD c534790KyD);

    Object LJIL(Activity activity, String str, String str2, List list, String str3, String str4, String str5, boolean z, AwS552S0100000_8 awS552S0100000_8, InterfaceC1364105Vn interfaceC1364105Vn);

    Object LJJ(boolean z, InterfaceC1364105Vn<? super Pair<? extends EnumC1216670hlZ, String>> interfaceC1364105Vn);
}
