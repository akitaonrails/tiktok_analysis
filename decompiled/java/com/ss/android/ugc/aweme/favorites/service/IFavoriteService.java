package com.ss.android.ugc.aweme.favorites.service;

import X.AbstractC1549150qPp;
import X.C0O1H;
import X.C0OFL;
import X.C1210040has;
import X.C1210050hat;
import X.C1210060hau;
import X.C1372630lp7;
import X.C19719912Dl;
import X.C19EG;
import X.C443120HZe;
import X.C731840SnG;
import X.ViewOnTouchListenerC1171840gbG;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.favorites.business.collaboration.CollaborativeUserInfo;
import com.ss.android.ugc.aweme.favorites.business.monitor.FavoriteApiNetworkPartner;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionRouteInterceptor;
import com.ss.android.ugc.aweme.favorites.business.music.MusicDetailFromFavoriteInterceptor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface IFavoriteService {
    FavoriteApiNetworkPartner LIZ();

    C19719912Dl LIZIZ();

    void LIZJ(C19EG c19eg, CollaborativeUserInfo collaborativeUserInfo, String str);

    void LIZLLL();

    void LJ();

    void LJFF(C19EG c19eg, Object obj, String str, String str2, boolean z);

    MusicCollectionRouteInterceptor LJI();

    void LJII();

    boolean LJIIIIZZ();

    String LJIIIZ(String str);

    boolean LJIIJ();

    int LJIIJJI();

    void LJIIL(C19EG c19eg, String str, String str2, String str3, String str4, String str5);

    void LJIILIIL(Context context, Aweme aweme, String str, int[] iArr);

    ViewOnTouchListenerC1171840gbG LJIILJJIL(C731840SnG c731840SnG, C0O1H c0o1h);

    boolean LJIILL();

    void LJIILLIIL(C19EG c19eg, String str, String str2, String str3, Boolean bool, boolean z);

    boolean LJIIZILJ();

    boolean LJIJ();

    void LJIJI(View view, C19EG c19eg);

    C1210050hat LJIJJ();

    boolean LJIJJLI();

    boolean LJIL();

    void LJJ(C19EG c19eg, String str, String str2, String str3, Boolean bool, boolean z, String str4);

    AmeBaseFragment LJJI(User user, String str, boolean z, boolean z2);

    void LJJIFFI();

    void LJJII();

    void LJJIII(Fragment fragment, String str);

    boolean LJJIIJ();

    List<C0OFL> LJJIIJZLJL(List<C0OFL> list);

    boolean LJJIIZ();

    boolean LJJIIZI();

    void LJJIJ(Fragment fragment, String str);

    C1210040has LJJIJIIJI();

    void LJJIJIIJIL();

    void LJJIJIL(C19EG c19eg, String str, String str2, View view);

    boolean LJJIJL();

    boolean LJJIJLIJ();

    boolean LJJIL();

    C1210060hau LJJIZ(C1372630lp7 c1372630lp7);

    void LJJJ();

    void LJJJI(C19EG c19eg, String str, String str2, View view);

    String LJJJIL();

    C443120HZe LJJJJ(long j, String str);

    void LJJJJI(C19EG c19eg, String str, String str2, Boolean bool);

    MusicDetailFromFavoriteInterceptor LJJJJIZL();

    List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList();
}
