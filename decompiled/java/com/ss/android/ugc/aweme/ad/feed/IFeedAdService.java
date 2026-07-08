package com.ss.android.ugc.aweme.ad.feed;

import X.C0RAE;
import X.C0RQG;
import X.C0SW3;
import X.C0T2F;
import X.C0T2G;
import X.C0T2H;
import X.C1000020c88;
import X.C1000080c8E;
import X.C1000130c8J;
import X.C1000380c8i;
import X.C1000840c9S;
import X.C1000880c9W;
import X.C1008080cL8;
import X.C1008720cMA;
import X.C1020420cf2;
import X.C1020750cfZ;
import X.C1023960ckk;
import X.C581540MrQ;
import X.C708090Rq3;
import X.C735630StN;
import X.C735660StQ;
import X.C987460bns;
import X.C997380c3s;
import X.C997450c3z;
import X.C997780c4W;
import X.C997820c4a;
import X.C998340c5Q;
import X.C999460c7E;
import X.C999500c7I;
import X.C999700c7c;
import X.C999710c7d;
import X.C999720c7e;
import X.C999880c7u;
import X.C999920c7y;
import X.C999950c81;
import X.InterfaceC665370Q7z;
import X.InterfaceC988630bpl;
import X.InterfaceC990700bt6;
import X.ViewOnClickListenerC998120c54;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface IFeedAdService {
    boolean LIZ(Context context);

    C1000020c88 LIZIZ(ViewStub viewStub);

    C999460c7E LIZJ(ViewStub viewStub, FrameLayout frameLayout);

    List<C0T2H> LIZLLL();

    boolean LJ(Aweme aweme);

    C999710c7d LJFF();

    C999920c7y LJI();

    C1000840c9S LJII(C987460bns c987460bns);

    void LJIIIIZZ(String str, AwemeRawAd awemeRawAd, Map map);

    C1008720cMA LJIIIZ(ViewStub viewStub);

    C1008080cL8 LJIIJ(Context context, Aweme aweme);

    void LJIIJJI(String str);

    void LJIIL(int i);

    C1020420cf2 LJIILIIL();

    Bundle LJIILJJIL();

    C1000080c8E LJIILL(ViewStub viewStub, String str);

    C997450c3z LJIILLIIL();

    InterfaceC988630bpl LJIIZILJ();

    C581540MrQ LJIJ();

    C0T2G LJIJI(C0T2F c0t2f);

    C999880c7u LJIJJ();

    C1000380c8i LJIJJLI();

    TuxActionSheet LJIL(Context context, Aweme aweme, String str, String str2);

    C999700c7c LJJ();

    void LJJI();

    C0SW3 LJJIFFI(View view, C0RAE c0rae, String str);

    boolean LJJII(Integer num);

    C1020750cfZ LJJIII(ViewGroup viewGroup);

    List<InterfaceC990700bt6> LJJIIJ();

    C998340c5Q LJJIIJZLJL(C735660StQ c735660StQ);

    void LJJIIZ(int i, Aweme aweme);

    C1008080cL8 LJJIIZI(Context context, Aweme aweme, String str);

    C1000880c9W LJJIJ(Context context, Aweme aweme);

    C999500c7I LJJIJIIJI(View view, InterfaceC665370Q7z interfaceC665370Q7z, VideoPlayTaskManager videoPlayTaskManager);

    C999720c7e LJJIJIIJIL();

    C997380c3s LJJIJIL(ViewStub viewStub);

    C0RQG LJJIJL();

    void LJJIJLIJ();

    void LJJIL(Aweme aweme, C1023960ckk c1023960ckk, String str);

    C999950c81 LJJIZ();

    void LJJJ(Bundle bundle);

    void LJJJI(C708090Rq3 c708090Rq3);

    C1000130c8J LJJJIL(ViewStub viewStub);

    C997820c4a LJJJJ();

    ViewOnClickListenerC998120c54 LJJJJI(C735630StN c735630StN);

    C997780c4W LJJJJIZL();

    String LJJJJJ();

    String getEnterFrom();

    String getProductId();

    void setEnterFrom(String str);

    void setProductId(String str);
}
