package com.ss.android.ugc.aweme.account.oneclicklogin;

import X.C09AE;
import X.C0XWB;
import X.C0XWC;
import X.C0XWD;
import X.C0XWE;
import X.C19EG;
import X.InterfaceC420801kM;
import Y.AObjectS356S0100000_13;
import Y.AObjectS388S0100000_13;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public interface IOneClickLoginService {
    void LIZ(String str);

    boolean LIZIZ();

    List<BaseLoginMethod> LIZJ();

    BaseLoginMethod LIZLLL();

    boolean LJ();

    InterfaceC420801kM LJFF(C19EG c19eg, BaseLoginMethod baseLoginMethod, C0XWB c0xwb, Map map, Function0 function0, Function1 function1);

    void LJI(Function0 function0, Function1 function1);

    void LJII(String str, String str2, String str3, String str4, Function0 function0, Function1 function1, boolean z);

    void LJIIIIZZ(boolean z, C0XWD c0xwd, String str, String str2, Function0<Unit> function0, Function1<? super Integer, Unit> function1);

    List<BaseLoginMethod> LJIIIZ(C0XWE c0xwe);

    boolean LJIIJ(C0XWE c0xwe);

    boolean LJIIJJI();

    void LJIIL(C0XWD c0xwd, String str, String str2, AObjectS388S0100000_13 aObjectS388S0100000_13, AObjectS356S0100000_13 aObjectS356S0100000_13);

    void LJIILIIL(Bundle bundle);

    C09AE LJIILJJIL(C19EG c19eg, BaseLoginMethod baseLoginMethod, C0XWB c0xwb, Map map, Function0 function0, Function1 function1);

    void LJIILL(String str, String str2, boolean z, C0XWC c0xwc, String str3, Function0 function0, Function1 function1);

    boolean LJIILLIIL();

    MutableLiveData LJIIZILJ();
}
