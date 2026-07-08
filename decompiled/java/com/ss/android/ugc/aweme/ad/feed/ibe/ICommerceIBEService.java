package com.ss.android.ugc.aweme.ad.feed.ibe;

import X.C1057930ddX;
import X.C1063050dln;
import X.C987620bo8;
import X.EnumC1063200dm2;
import X.InterfaceC1364105Vn;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public interface ICommerceIBEService {
    C1063050dln LIZ(C987620bo8 c987620bo8);

    void LIZIZ(IBEInfo iBEInfo, Context context, C1057930ddX c1057930ddX, Function1<? super SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Unit> function1, Function0<Unit> function0);

    boolean LIZJ(String str);

    void LIZLLL(List<? extends Aweme> list, EnumC1063200dm2 enumC1063200dm2, Integer num);

    Object LJ(IBEInfo iBEInfo, C1057930ddX c1057930ddX, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);
}
