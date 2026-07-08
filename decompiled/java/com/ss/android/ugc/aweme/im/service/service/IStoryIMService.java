package com.ss.android.ugc.aweme.im.service.service;

import X.C0I08;
import X.C0S1L;
import X.C11NZ;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C19600211mK;
import X.C19EG;
import X.EnumC713160RyE;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public interface IStoryIMService {
    boolean LIZ(Aweme aweme, EnumC713160RyE enumC713160RyE, Fragment fragment);

    void LIZIZ(User user, boolean z, String str, String str2);

    void LIZJ(String str, User user, Aweme aweme, String str2, String str3, String str4, Boolean bool, boolean z, Map<String, String> map, Function1<? super String, Unit> function1);

    void LIZLLL(C19EG c19eg, View view, FragmentManager fragmentManager, QuickDMEventParam quickDMEventParam, Aweme aweme, User user, String str, String str2, String str3, boolean z, C0I08 c0i08, Function0 function0, C19600211mK c19600211mK, String str4, Integer num, Integer num2, boolean z2, boolean z3, boolean z4, Fragment fragment, Map map);

    void LJ(View view);

    PointF LJFF();

    C11NZ<C0S1L> LJI(Aweme aweme, EnumC713160RyE enumC713160RyE, Fragment fragment);

    String LJII(Context context, boolean z);

    C1389880mGw LJIIIIZZ(C19EG c19eg);

    C1389890mGx LJIIIZ(Activity activity, String str);
}
