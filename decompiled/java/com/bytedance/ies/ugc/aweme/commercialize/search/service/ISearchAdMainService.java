package com.bytedance.ies.ugc.aweme.commercialize.search.service;

import X.C09AE;
import X.C0R13;
import X.C1010400cOs;
import X.C655360PnC;
import X.C656780PpU;
import X.EnumC658110Prd;
import X.EnumC658120Pre;
import X.InterfaceC1010140cOS;
import X.InterfaceC1010470cOz;
import X.InterfaceC1011400cQU;
import X.InterfaceC643990PNt;
import X.InterfaceC655240Pn0;
import X.InterfaceC655350PnB;
import X.InterfaceC656040PoI;
import X.InterfaceC656050PoJ;
import X.InterfaceC656120PoQ;
import X.InterfaceC656550Pp7;
import X.InterfaceC656730PpP;
import X.InterfaceC656740PpQ;
import X.InterfaceC657350PqP;
import X.InterfaceC682870QqT;
import X.InterfaceC688220Qz6;
import Y.AfS185S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardStruct;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS334S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchAdMainService {
    boolean LIZ();

    View LIZIZ(Context context, ViewGroup viewGroup, Aweme aweme, InterfaceC682870QqT interfaceC682870QqT);

    boolean LIZJ();

    C09AE LIZLLL(Aweme aweme);

    boolean LJ(Context context, Aweme aweme, String str, String str2, int i, String str3, String str4);

    C0R13 LJFF(Context context, AIAdCardStruct aIAdCardStruct, AFwS334S0000000_10 aFwS334S0000000_10);

    void LJI(Aweme aweme);

    InterfaceC682870QqT LJII(Aweme aweme);

    InterfaceC1010140cOS LJIIIIZZ();

    InterfaceC655240Pn0 LJIIIZ(InterfaceC657350PqP interfaceC657350PqP);

    InterfaceC655350PnB LJIIJ(C655360PnC c655360PnC);

    InterfaceC656040PoI LJIIJJI(Context context, Aweme aweme, AFwS334S0000000_10 aFwS334S0000000_10);

    InterfaceC656050PoJ LJIIL(Context context, Aweme aweme);

    View LJIILIIL(String str, ViewGroup viewGroup, EnumC658120Pre enumC658120Pre);

    boolean LJIILJJIL(Aweme aweme, String str);

    InterfaceC1010470cOz LJIILL(C1010400cOs c1010400cOs);

    boolean LJIILLIIL();

    View LJIIZILJ(AwemeRawAd awemeRawAd, ViewGroup viewGroup, EnumC658120Pre enumC658120Pre);

    void LJIJ(Aweme aweme, String str);

    void LJIJI(String str, String str2, AfS185S0100000_16 afS185S0100000_16, AfS185S0100000_16 afS185S0100000_162);

    InterfaceC656730PpP LJIJJ(InterfaceC1011400cQU interfaceC1011400cQU);

    boolean LJIJJLI(Context context, Aweme aweme, String str, String str2);

    boolean LJIL(Aweme aweme);

    InterfaceC656740PpQ LJJ(C656780PpU c656780PpU);

    InterfaceC688220Qz6 LJJI();

    List<Aweme> LJJIFFI(List<? extends Map<?, ?>> list);

    InterfaceC656550Pp7 LJJII(Aweme aweme, Context context, EnumC658110Prd enumC658110Prd);

    void LJJIII(Aweme aweme, Object obj);

    void LJJIIJ(Context context, Aweme aweme, int i);

    InterfaceC643990PNt LJJIIJZLJL();

    boolean LJJIIZ(Context context, Fragment fragment);

    InterfaceC656120PoQ LJJIIZI(Context context, Aweme aweme);
}
