package com.ss.android.ugc.aweme.notice.api.services;

import X.AbstractC738140SxQ;
import X.C0OPB;
import X.C11NZ;
import X.C13IQ;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creation.config.DMMediaAuthConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public interface IBulletinBoardService {
    boolean LIZ();

    void LIZIZ(LifecycleOwner lifecycleOwner, String str, String str2, BaseSharePackage baseSharePackage, int i, boolean z, String str3, int i2, String str4, Function1<? super HashMap<String, String>, Unit> function1, Aweme aweme);

    TuxSheet LIZJ(Bundle bundle, FragmentManager fragmentManager);

    Object LIZLLL(int i, InterfaceC1364105Vn<? super DMMediaAuthConfig> interfaceC1364105Vn);

    C0OPB LJ();

    void LJFF();

    boolean LJI();

    Object LJII(Context context, String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void LJIIIIZZ();

    void LJIIIZ();

    Object LJIIJ(Context context, String str, String str2, Map map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z);

    C11NZ<Boolean> LJIIJJI();

    C13IQ<? extends AbstractC738140SxQ> LJIIL();

    void LJIILIIL(Activity activity, Bundle bundle, Function0<Unit> function0);

    void LJIILJJIL(boolean z, boolean z2);

    boolean LJIILL();

    void LJIILLIIL(LifecycleOwner lifecycleOwner, Aweme aweme, AwemeSharePackage awemeSharePackage);

    String LJIIZILJ(long j);

    void LJIJ(boolean z);

    boolean LJIJI();

    void LJIJJ(boolean z);

    boolean LLIL();

    void LLILII(String str, boolean z);

    boolean LLILIL();

    void LLILL(Activity activity, View view, String str, Function0<Unit> function0);

    Object LLZZJLIL(String str, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn);

    void d0(Aweme aweme, Map<String, String> map);

    boolean e0();

    boolean isPrivateAccount();
}
