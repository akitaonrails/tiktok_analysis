package com.ss.android.ugc.aweme.vibefeed.service;

import X.C0ZA0;
import X.C19719912Dl;
import X.EnumC2007507th;
import X.EnumC912680ZrG;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.vibefeed.feed.entrance.VibeFeedRouteInterceptor;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public interface IVibeEntranceService {
    boolean LIZ(String str);

    boolean LIZIZ(String str);

    void LIZJ(Context context, String str, IMUser iMUser, String str2, String str3, String str4);

    boolean LIZLLL(String str);

    void LJ(String str, String str2, int i, EnumC912680ZrG enumC912680ZrG);

    boolean LJFF();

    void LJI(Context context, String str, String str2, String str3, String str4, String str5, List<String> list);

    void LJII(String str, String str2);

    void LJIIIIZZ(String str, String str2, int i, EnumC912680ZrG enumC912680ZrG);

    void LJIIIZ(boolean z, String str, String str2, String str3, View view, EnumC2007507th enumC2007507th, Function0 function0);

    VibeFeedRouteInterceptor LJIIJ();

    C19719912Dl LJIIJJI();

    void LJIIL(boolean z, float f, String str, String str2);

    void LJIILIIL(String str, String str2, EnumC912680ZrG enumC912680ZrG);

    Object LJIILJJIL(List<C0ZA0> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Aweme LJIILL(String str);

    void LJIILLIIL(View view, String str, String str2);

    boolean LJIIZILJ();
}
