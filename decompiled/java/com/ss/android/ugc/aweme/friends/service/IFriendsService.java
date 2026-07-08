package com.ss.android.ugc.aweme.friends.service;

import X.AbstractC738140SxQ;
import X.C0SY1;
import X.C11NZ;
import X.C13IQ;
import X.C1590150rTx;
import X.C19EG;
import X.EnumC1262450ixP;
import X.InterfaceC1070270dxR;
import X.InterfaceC1070570dxv;
import X.InterfaceC1070980dya;
import X.InterfaceC1071740dzo;
import X.InterfaceC1073770e35;
import X.InterfaceC1074380e44;
import X.InterfaceC1294060jmO;
import X.InterfaceC1582690rHv;
import X.InterfaceC1908760zlq;
import X.InterfaceC800130Va7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public interface IFriendsService {
    InterfaceC1908760zlq LIZ();

    RelationService LIZIZ();

    C11NZ<ShortenUrlModel> LIZJ(String str);

    Intent LIZLLL(Activity activity);

    boolean LJ();

    InterfaceC1070270dxR LJFF();

    @InterfaceC1294060jmO
    void LJI(String str);

    InterfaceC1071740dzo LJII();

    C0SY1 LJIIIIZZ();

    void LJIIIZ();

    InterfaceC1070570dxv LJIIJ();

    boolean LJIIJJI(Activity activity);

    C13IQ<? extends AbstractC738140SxQ> LJIIL();

    InterfaceC1582690rHv LJIILIIL(C19EG c19eg);

    void LJIILJJIL();

    Fragment LJIILL(EnumC1262450ixP enumC1262450ixP, MufPageTrackInfo mufPageTrackInfo, int i, Function0<Unit> function0);

    @InterfaceC1294060jmO
    boolean LJIILLIIL();

    ISocialFriendsService LJIIZILJ();

    boolean LJIJ(User user);

    boolean LJIJI();

    void LJIJJ(String str, Map map);

    void LJIJJLI();

    InterfaceC1074380e44 LJIL(Fragment fragment, HomePageDataViewModel homePageDataViewModel, C1590150rTx c1590150rTx);

    void LJJ();

    InterfaceC1073770e35 LJJI();

    InterfaceC1070980dya LJJIFFI(String str, LifecycleOwner lifecycleOwner);

    boolean LJJII();

    @InterfaceC1294060jmO
    void LJJIII(String str, String str2, String str3);

    void LJJIIJ(boolean z);

    InterfaceC800130Va7 LJJIIJZLJL();

    Intent LJJIIZ(Context context, int i);

    void LJJIIZI(boolean z);

    void LJJIJ(String str, Map map);

    boolean LJJIJIIJI();

    InterfaceC800130Va7 LJJIJIIJIL();
}
