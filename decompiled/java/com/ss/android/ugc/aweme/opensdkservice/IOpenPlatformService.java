package com.ss.android.ugc.aweme.opensdkservice;

import X.AbstractC20656215sG;
import X.C11VZ;
import X.C1B4M;
import X.DialogC19267910Zp;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes35.dex */
public interface IOpenPlatformService {
    Intent LIZ(Context context);

    void LIZIZ(C11VZ c11vz);

    boolean LIZJ(Intent intent);

    void LIZLLL(String str);

    void LJ(Activity activity, ArrayList arrayList, String str, Bundle bundle);

    Pair<Boolean, Boolean> LJFF();

    void LJI(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, Function1 function1);

    AbstractC20656215sG LJII(Activity activity, DialogC19267910Zp dialogC19267910Zp);

    void LJIIIIZZ(Activity activity, String str, Bundle bundle, Function2<? super Boolean, ? super Boolean, Unit> function2);

    void LJIIIZ(Intent intent, C1B4M c1b4m);

    void LJIIJ(String str, String str2, String str3, String str4, String str5, boolean z, Function1 function1);

    void LJIIJJI(Context context, Bundle bundle, Function1<? super String, Unit> function1, Function0<Unit> function0, String str);

    void LJIIL(String str);
}
