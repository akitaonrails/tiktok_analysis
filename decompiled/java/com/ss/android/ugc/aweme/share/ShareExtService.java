package com.ss.android.ugc.aweme.share;

import X.AbstractC1549150qPp;
import X.AbstractC19483511Kn;
import X.C0R01;
import X.C0R23;
import X.C0SU5;
import X.C1260870iur;
import X.C1371600lnS;
import X.C1372180loO;
import X.C1374890lsl;
import X.C1375070lt3;
import X.C1375110lt7;
import X.C1375120lt8;
import X.C1375400lta;
import X.C1376170lup;
import X.C1376210lut;
import X.C1445970njP;
import X.C19EG;
import X.C687600Qy6;
import X.C688130Qyx;
import X.C735420St2;
import X.C737030Svd;
import X.C737310Sw5;
import X.C790120Uz4;
import X.EnumC114200c0;
import X.EnumC1371620lnU;
import X.EnumC1373410lqN;
import X.InterfaceC1369790lkX;
import X.InterfaceC1370310llN;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.challenge.presenter.ChallengeSharePackageV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinBoardInviteSharePackage;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.presenter.MusicSharePackageV2;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoImageSharePackage;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public interface ShareExtService {
    void LIZ();

    boolean LIZLLL();

    void LJ(Aweme aweme, String str);

    int LJFF(Aweme aweme);

    C0R01 LJI();

    boolean LJII(int i);

    C1375070lt3 LJIIIIZZ();

    EnumC1373410lqN LJIIIZ(String str, String str2);

    void LJIIJ(Aweme aweme);

    boolean LJIIJJI(ShareOperationInfo shareOperationInfo);

    boolean LJIIL();

    boolean LJIILIIL(Aweme aweme, String str);

    boolean LJIILJJIL(Aweme aweme);

    void LJIILL(Activity activity, Function1<? super Pair<? extends InterfaceC1369790lkX, ? extends Drawable>, Unit> function1);

    boolean LJIILLIIL(Comment comment);

    boolean LJIIZILJ(Context context, Aweme aweme, String str);

    C1376170lup LJIJ(Activity activity, Aweme aweme, String str, String str2, String str3);

    AbstractC19483511Kn LJIJI(int i, String str, String str2, String str3);

    void LJIJJ(Aweme aweme, Activity activity, String str, String str2, int i);

    void LJIJJLI(Fragment fragment, C737030Svd c737030Svd);

    void LJIL(MusicSharePackageV2 musicSharePackageV2);

    Drawable LJJ(Activity activity);

    void LJJI(SharePackage sharePackage);

    String LJJIFFI();

    int LJJII(int i, String str, String str2);

    void LJJIII(Aweme aweme);

    C1375120lt8 LJJIIJ(Challenge challenge, boolean z, String str, String str2, String str3);

    C0R23 LJJIIJZLJL(Music music);

    void LJJIIZ(C1371600lnS c1371600lnS, boolean z);

    boolean LJJIIZI(Aweme aweme);

    List<InterfaceC1369790lkX> LJJIJ(ShareContentType[] shareContentTypeArr);

    String[] LJJIJIIJI();

    void LJJIJIIJIL();

    Drawable LJJIJIL(Context context);

    void LJJIJL(C19EG c19eg, C0SU5 c0su5);

    void LJJIJLIJ(BulletinBoardInviteSharePackage bulletinBoardInviteSharePackage);

    void LJJIL(String str, String str2, Aweme aweme);

    C1375110lt7 LJJIZ(Music music);

    Drawable LJJJ(Context context);

    boolean LJJJI(ShareOperationInfo shareOperationInfo, boolean z);

    void LJJJIL(BaseSharePackage baseSharePackage);

    void LJJJJ();

    void LJJJJI(String str, Integer num, C1260870iur<?, ?> c1260870iur, Pair<Integer, String> pair);

    void LJJJJIZL(String str, Aweme aweme);

    void LJJJJJ(Bundle bundle, Aweme aweme, String str);

    String LJJJJJL(int i, String str);

    Map<String, String> LJJJJL();

    boolean LJJJJLI(String str);

    String LJJJJLL();

    FrameLayout.LayoutParams LJJJJZ(Context context, int i, int i2, int i3, int i4, int i5, int i6);

    void LJJJJZI();

    void LJJJLIIL(String str);

    void LJJJLL(Context context, String str);

    Drawable LJJJLZIJ(Activity activity, String str);

    boolean LJJJZ(Context context, Aweme aweme);

    boolean LJJL(Context context, Activity activity, C1376210lut c1376210lut, AwS635S0100000_21 awS635S0100000_21);

    void LJJLI(int i, String str, String str2);

    InterfaceC1370310llN LJJLIIIIJ(Activity activity, Aweme aweme, String str, String str2, String str3, String str4);

    Map<String, InterfaceC1369790lkX> LJJLIIIJ();

    void LJJLIIIJILLIZJL(InterfaceC1369790lkX interfaceC1369790lkX, C1371600lnS c1371600lnS);

    C687600Qy6 LJJLIIIJJI(Challenge challenge);

    boolean LJJLIIIJJIZ(C19EG c19eg, C1445970njP c1445970njP);

    void LJJLIIIJL(String str);

    C737310Sw5 LJJLIIIJLJLI(Aweme aweme, String str, String str2);

    EnumC114200c0 LJJLIIIJLLLLLLLZ(String str);

    void LJJLIIJ(ChallengeSharePackageV2 challengeSharePackageV2);

    void LJJLIL(Aweme aweme, C19EG c19eg, String str, Function1 function1);

    C790120Uz4 LJJLJ(String str);

    void LJJLJLI(Aweme aweme, String str, int i, int i2);

    C1372180loO LJJLL(BaseSharePackage baseSharePackage, EnumC1371620lnU enumC1371620lnU);

    void LJJZ(Aweme aweme);

    C1374890lsl LJJZZI();

    C1375400lta LJJZZIII(String str, InterfaceC1370310llN interfaceC1370310llN, Context context);

    C688130Qyx LJL(Music music);

    void LJLI();

    List<String> LJLIIIL();

    void LJLIIL(Aweme aweme);

    void LJLIL(TakoImageSharePackage takoImageSharePackage);

    C735420St2 LJLILLLLZI(Aweme aweme);

    List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList();
}
