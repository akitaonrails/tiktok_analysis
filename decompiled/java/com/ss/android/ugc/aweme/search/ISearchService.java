package com.ss.android.ugc.aweme.search;

import X.AbstractC1387200mCc;
import X.AbstractC329610Cw3;
import X.AbstractC738140SxQ;
import X.C03H5;
import X.C0J3R;
import X.C0N0Y;
import X.C0O85;
import X.C0PHW;
import X.C0PSX;
import X.C0Q3P;
import X.C0QDS;
import X.C0QER;
import X.C0QF6;
import X.C0QFY;
import X.C0QMP;
import X.C0SAD;
import X.C0SMG;
import X.C0SZ8;
import X.C0TRR;
import X.C0WHU;
import X.C1051660dTQ;
import X.C10GR;
import X.C1163440gNi;
import X.C1242650iRT;
import X.C1311670kEn;
import X.C1331670kl3;
import X.C1390920mIc;
import X.C13IQ;
import X.C1445970njP;
import X.C14SH;
import X.C19EG;
import X.C2189821An6;
import X.C2203531BLz;
import X.C434640H2o;
import X.C654590Plx;
import X.C683220Qr2;
import X.EnumC1594380ram;
import X.EnumC584570MwJ;
import X.EnumC667230QFd;
import X.EnumC673010QaZ;
import X.InterfaceC1051730dTX;
import X.InterfaceC1051760dTa;
import X.InterfaceC1063710dmr;
import X.InterfaceC1294060jmO;
import X.InterfaceC1355760lNu;
import X.InterfaceC1370310llN;
import X.InterfaceC1386220mB2;
import X.InterfaceC1386380mBI;
import X.InterfaceC1448230nn3;
import X.InterfaceC1569760qx4;
import X.InterfaceC1570140qxg;
import X.InterfaceC1571010qz5;
import X.InterfaceC1584170rKJ;
import X.InterfaceC1586210rNb;
import X.InterfaceC1600790rl7;
import X.InterfaceC1601620rmS;
import X.InterfaceC1604910rrl;
import X.InterfaceC1606680ruc;
import X.InterfaceC1611110s1l;
import X.InterfaceC1685420txc;
import X.InterfaceC1911280zpu;
import X.InterfaceC20267614Sc;
import X.InterfaceC20290714aP;
import X.InterfaceC214902198i;
import X.InterfaceC21663319qJ;
import X.InterfaceC302520BtS;
import X.InterfaceC434580H2i;
import X.InterfaceC581770Mrn;
import X.InterfaceC587940N4e;
import X.InterfaceC634440OuY;
import X.InterfaceC665370Q7z;
import X.InterfaceC665680Q9e;
import X.InterfaceC665700Q9g;
import X.InterfaceC666730QDf;
import X.InterfaceC666850QDr;
import X.InterfaceC668720QKw;
import X.InterfaceC676470Qg9;
import X.InterfaceC676520QgE;
import X.InterfaceC682070QpB;
import X.InterfaceC688200Qz4;
import X.InterfaceC690490R6p;
import X.InterfaceC725760SdS;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS101S0101000_19;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.google.gson.n;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.abtest.SearchSecurityControlValue;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.SmartSearchInfoStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public interface ISearchService extends InterfaceC1355760lNu, InterfaceC1611110s1l, InterfaceC1586210rNb, InterfaceC1584170rKJ, InterfaceC1570140qxg, InterfaceC1571010qz5, InterfaceC1604910rrl, InterfaceC1386380mBI, InterfaceC1601620rmS, C0O85, InterfaceC1600790rl7, InterfaceC634440OuY, InterfaceC20290714aP, C14SH, InterfaceC1569760qx4, InterfaceC688200Qz4, InterfaceC302520BtS, InterfaceC20267614Sc, InterfaceC1386220mB2, ISearchContextService {
    @InterfaceC1294060jmO
    void B(C0QDS c0qds);

    void B0(Aweme aweme, String str);

    C0QF6 C(ECSearchEntranceData eCSearchEntranceData);

    boolean E(C2189821An6 c2189821An6, Fragment fragment, C0SZ8 c0sz8, Aweme aweme);

    void E0(String str, List list);

    boolean F0();

    Map<String, InterfaceC1051760dTa> G0(C2203531BLz c2203531BLz, WeakReference<Context> weakReference);

    boolean H(C19EG c19eg, AbstractC1387200mCc abstractC1387200mCc, C1445970njP c1445970njP);

    void H0(C2189821An6 c2189821An6, Aweme aweme, ViewGroup viewGroup, int i);

    Map<String, String> I(Aweme aweme, String str);

    void I0(View view, C683220Qr2 c683220Qr2);

    void J(Fragment fragment, boolean z);

    boolean J0();

    int K();

    void K0(Map<String, String> map);

    void LIZ();

    C0WHU LIZIZ();

    void LIZJ(int i);

    boolean LIZLLL();

    String LJ();

    LynxUI<?> LJFF(s sVar);

    void LJIIIZ(String str, String str2, String str3, String str4);

    void LJIIJ(Map<String, String> map);

    Intent LJIIJJI(Activity activity, Uri uri);

    void LJIILIIL(String str, boolean z);

    LynxUI<?> LJIJ(s sVar);

    LynxUI<?> LJIJI(s sVar);

    void LJIJJ(Function0<Unit> function0);

    void LJIJJLI(LastSearch lastSearch);

    List<C1311670kEn> LJJIFFI();

    LynxUI<?> LJJIII(s sVar);

    void LJJIIJ(Context context, Uri uri, Bundle bundle, Object obj);

    InterfaceC1448230nn3 LJJIIJZLJL();

    Map<String, Class<?>> LJJIIZ();

    Integer LJJIIZI();

    Integer LJJIJ(User user);

    void LJJIJIIJI(EnumC584570MwJ enumC584570MwJ);

    Map<String, String> LJJIJIIJIL(Integer num);

    boolean LJJIJIL();

    void LJJIJL(Context context, String str, TextExtraStruct textExtraStruct, Map<String, String> map, Aweme aweme, boolean z);

    void LJJIJLIJ(IMUser iMUser, SharePackage sharePackage, String str);

    void LJJIL(Context context, String str, TextExtraStruct textExtraStruct, Map<String, String> map);

    boolean LJJIZ(String str);

    HashMap<String, String> LJJJ(String str, String str2, String str3);

    C0QMP LJJJI(Context context, Bitmap bitmap);

    InterfaceC725760SdS LJJJIL();

    InterfaceC587940N4e LJJJJ();

    void LJJJJI(FragmentManager fragmentManager, Map<String, ? extends Object> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4);

    C10GR LJJJJIZL(C19EG c19eg, View view, String str, InterfaceC1685420txc<? super View, ? super String, ? super String, ? super String, ? super String, Unit> interfaceC1685420txc);

    boolean LJJJJJ();

    C13IQ<? extends AbstractC738140SxQ> LJJJJJL();

    Map<String, String> LJJJJL();

    String LJJJJLI();

    boolean LJJJJLL();

    InterfaceC690490R6p LJJJJZ();

    void LJJJJZI();

    boolean LJJJLIIL(List<? extends Map<String, ? extends Object>> list, boolean z);

    boolean LJJJLL(String str);

    boolean LJJJLZIJ(String str, String str2);

    String LJJJZ();

    void LJJL(Object obj);

    View LJJLI(int i, ViewGroup viewGroup);

    void LJJLIIIIJ(int i);

    void LJJLIIIJ(Aweme aweme, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    void LJJLIIIJILLIZJL(Aweme aweme, C19EG c19eg, Fragment fragment, Bundle bundle, EnumC667230QFd enumC667230QFd);

    void LJJLIIIJJI();

    String LJJLIIIJJIZ(String str, C0PSX c0psx);

    boolean LJJLIIIJL(Aweme aweme, String str);

    void LJJLIIIJLJLI(Aweme aweme, boolean z);

    void LJJLIIIJLLLLLLLZ(Context context, String str, Aweme aweme, String str2, String str3);

    ISearchResultStatistics LJJLIIJ();

    C0J3R LJJLIL();

    C0QER LJJLJ();

    String LJJLJLI();

    void LJJLL(Aweme aweme, Integer num, String str, String str2, boolean z);

    String LJJZ();

    Map<String, String> LJJZZI(Map<String, String> map);

    void LJJZZIII(Uri uri);

    void LJLI(int i, String str, boolean z, String str2, long j, long j2);

    void LJLIIIL();

    boolean LJLIIL(String str, String str2);

    boolean LJLIL();

    HashMap LJLILLLLZI(String str, String str2);

    InterfaceC21663319qJ LJLJI(String str);

    boolean LJLJJI(Aweme aweme);

    boolean LJLJJL();

    void LJLJJLL(C0QDS c0qds);

    InterfaceC581770Mrn LJLJL();

    boolean LJLJLJ();

    InterfaceC665680Q9e LJLJLLL(SearchResultParam searchResultParam, SearchKeywordPresenter searchKeywordPresenter, C1242650iRT c1242650iRT);

    void LJLL(View view, String str, String str2, int i, Aweme aweme, boolean z);

    boolean LJLLI();

    void LJLLILLLL(int i, View view);

    boolean LJLLJ();

    boolean LJLLL(Activity activity, Fragment fragment);

    void LJLLLLLL(String str);

    boolean LJLZ(Aweme aweme);

    String LJZ(Context context);

    boolean LJZI();

    void LJZL(String str);

    InterfaceC1370310llN LL(String str, String str2, String str3, Aweme aweme);

    void LLD(String str);

    void LLF(EnumC1594380ram enumC1594380ram, boolean z);

    boolean LLFF(Aweme aweme, String str);

    void LLFFF(Function1<? super Boolean, Unit> function1);

    boolean LLFZ(String str);

    boolean LLIFFJFJJ(Aweme aweme);

    void LLII(String str, String str2);

    void LLIIII(Aweme aweme);

    boolean LLIIIILZ(String str);

    void LLIIIJ(Context context);

    boolean LLIIIL();

    void LLIIJI(Context context, Bundle bundle);

    void LLIIJLIL(Context context, String str, String str2, Map map, Map map2, Aweme aweme, Fragment fragment);

    Pair LLIIL(Activity activity, int i, Intent intent);

    int LLIILII(C0PHW c0phw);

    InterfaceC682070QpB LLIILZL();

    void LLIIZ(Comment comment, Aweme aweme, String str);

    float LLILII();

    void LLILIL();

    String LLILL();

    void LLILLIZIL(int i);

    EnumC584570MwJ LLILLJJLI();

    void LLILLL(Activity activity, String str, String str2, long j, long j2, long j3, Integer num);

    void LLILZ(Aweme aweme, String str, Object obj);

    InterfaceC1051760dTa LLILZIL(C2203531BLz c2203531BLz, WeakReference<Context> weakReference, String str);

    void LLILZLL(Object obj);

    Map LLIZ(String str, String str2, String str3, String str4, Map map);

    boolean LLIZLLLIL();

    void LLJ(Integer num, String str);

    void LLJI(ViewGroup viewGroup, Context context, Aweme aweme, String str, String str2, boolean z, long j, boolean z2, Integer num);

    C0SMG LLJIJIL(String str);

    void LLJILJIL();

    void LLJILJILJ(Fragment fragment, boolean z);

    void LLJILLL();

    void LLJJ(Activity activity, String str, long j, String str2);

    Function2<Uri.Builder, n, Unit> LLJJIII(InterfaceC665370Q7z interfaceC665370Q7z);

    void LLJJIJI();

    void LLJJIJIIJIL(Context context, TextExtraStruct textExtraStruct, Aweme aweme, String str, String str2, String str3, Integer num, int i);

    String LLJJIJIL();

    Class<? extends InterfaceC1063710dmr>[] LLJJJ();

    C10GR LLJJJIL(View view, C19EG c19eg);

    void LLJJJJJIL(long j, String str, boolean z);

    void LLJJJJLIIL(C19EG c19eg, BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew, SearchResultParam searchResultParam);

    boolean LLJJL(String str);

    void LLJJLIIIJLLLLLLLZ(Context context, Fragment fragment, SearchResultParam searchResultParam);

    void LLJL(Fragment fragment, List<String> list, boolean z, Activity activity, String str);

    boolean LLJLIL();

    String LLJLILLLLZIIL();

    void LLJLL();

    InterfaceC1051730dTX LLJLLIL(C1051660dTQ c1051660dTQ, String str);

    boolean LLJLLL(String str);

    void LLJZ();

    boolean LLJZIJLIL(Aweme aweme, String str);

    void LLL();

    void LLLF(Aweme aweme, String str, Object obj);

    void LLLFF(String str, Fragment fragment, InterfaceC666730QDf interfaceC666730QDf);

    String LLLFFI(boolean z, boolean z2);

    View LLLFZ(Context context, Aweme aweme, String str, String str2, boolean z, long j, boolean z2, boolean z3, Function0<Unit> function0, Integer num);

    void LLLI(EnumC673010QaZ enumC673010QaZ);

    Aweme LLLII(Aweme aweme, Function1<? super String, ? extends Aweme> function1);

    void LLLIIIIL(Context context, Bundle bundle);

    InterfaceC665700Q9g LLLIIIL();

    Map<String, String> LLLIIL(Aweme aweme);

    boolean LLLIILIL();

    C13IQ<? extends UIContentAssem> LLLILZ();

    boolean LLLILZJ(Context context);

    boolean LLLILZLLLI();

    void LLLIZZ();

    void LLLJ(String str, String str2, String str3);

    InterfaceC1606680ruc LLLJIL();

    C1390920mIc LLLJL(View view, C434640H2o c434640H2o, Function2<? super Integer, ? super InterfaceC434580H2i, Unit> function2, Function2<? super Integer, ? super InterfaceC434580H2i, Unit> function22, AbstractC329610Cw3<?> abstractC329610Cw3, Function1<? super Function0<? extends ViewOnAttachStateChangeListenerC20604515jv>, Unit> function1);

    Integer LLLL(String str);

    void LLLLIIIILLL();

    void LLLLIIL(SearchResultParam searchResultParam);

    void LLLLIL(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, PromotionInfo promotionInfo, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, Integer num2, Integer num3, Boolean bool, Boolean bool2, Map<String, String> map, String str16, String str17, String str18, Boolean bool3, String str19, C0QFY c0qfy, String str20, String str21);

    void LLLLILI(String str, String str2);

    EnterRoomConfig LLLLJ(Aweme aweme, C654590Plx c654590Plx, EnterRoomConfig enterRoomConfig, String str, View view, Context context);

    boolean LLLLJI();

    int LLLLL(int i);

    void LLLLLIL(String str, String str2);

    int LLLLLILLIL(Aweme aweme);

    String LLLLLJIL(int i);

    C13IQ<? extends ReusedUIAssem<? extends C03H5>> LLLLLL();

    boolean LLLLLLIL(Context context);

    View LLLLLLJ(View view);

    void LLLLLLL();

    boolean LLLLLLLLL();

    boolean LLLLLLLLLL(Aweme aweme);

    List<String> LLLLLLLZIL(int i);

    void LLLLLLZ(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, PromotionInfo promotionInfo, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str16, String str17, String str18, Boolean bool4, String str19, C0QFY c0qfy, String str20, String str21);

    InterfaceC1911280zpu LLLLLLZZ(InterfaceC665370Q7z interfaceC665370Q7z);

    Map<String, String> LLLLLZ(String str);

    void LLLLLZIL(SharePackage sharePackage, List list);

    boolean LLLLLZL();

    String LLLLZ();

    boolean LLLLZI();

    boolean LLLLZIL();

    String LLLLZLL(Aweme aweme);

    void LLLLZLLIL(Uri uri);

    void LLLLZLLLI(String str, Fragment fragment, InterfaceC666850QDr interfaceC666850QDr);

    String LLLZ();

    boolean LLLZI();

    boolean LLLZIIL();

    Object LLLZIL(Aweme aweme, C2189821An6 c2189821An6);

    void LLLZL();

    Map<String, String> LLLZLL();

    C0Q3P LLLZLZ();

    C1163440gNi LLLZZIL();

    Map<String, String> LLZ();

    void LLZILL(View view, Aweme aweme, Map<String, String> map);

    SearchSecurityControlValue LLZLI();

    void LLZLL(View view, LifecycleOwner lifecycleOwner);

    boolean LLZLLIL(Aweme aweme, C19EG c19eg, Fragment fragment, String str, SmartSearchInfoStruct smartSearchInfoStruct);

    String LLZLLLL(String str);

    C0SAD LLZZJLIL(String str);

    boolean LLZZZIL();

    void LLZZZZ(Aweme aweme, int i, String str, int i2, int i3);

    InterfaceC676520QgE M();

    void M0(Aweme aweme, C0N0Y c0n0y, int i);

    List<FeedbackMultipleChoice> N(String str);

    boolean N0();

    String O();

    void O0(Function0<Unit> function0, Function0<Unit> function02);

    void Q(InterfaceC665370Q7z interfaceC665370Q7z, Fragment fragment, Aweme aweme, AObjectS101S0101000_19 aObjectS101S0101000_19);

    void R();

    void R0(LifecycleOwner lifecycleOwner, Aweme aweme, Map<String, String> map, C2189821An6 c2189821An6);

    C13IQ<? extends ReusedUIAssem<? extends C03H5>> S();

    void T(String str);

    boolean U(C2189821An6 c2189821An6, Fragment fragment, Aweme aweme);

    boolean V(String str);

    String W(Context context, User user);

    void X(String str, int i, String str2, String str3, String str4, String str5);

    void Y();

    void Z(Fragment fragment, List<ImageData> list, int i, HashMap<String, String> map);

    void a0(C1331670kl3 c1331670kl3, Map<String, ? extends Object> map, Object obj, View view, InterfaceC1911280zpu interfaceC1911280zpu, NimbleMobAbility nimbleMobAbility);

    List<C0TRR> b();

    void b0();

    void c(Fragment fragment, String str);

    Map<String, String> c0(Map<String, String> map);

    Map<String, String> d(String str);

    boolean e();

    boolean e0();

    String f(n nVar, String str);

    String f0();

    Map<String, String> fetchSearchParams(String str, String str2);

    void g(C19EG c19eg);

    void g0();

    JSONObject getEcommerceSearchInfo();

    String getLatestSearchId();

    Map<String, String> getLogParamsFromSearch(String str, String str2, String... strArr);

    boolean h();

    Map<String, String> h0(Aweme aweme);

    boolean i(Aweme aweme, C2189821An6 c2189821An6);

    boolean i0(Aweme aweme, String str, String str2);

    void j(Aweme aweme, Object obj);

    boolean j0(Context context, Aweme aweme, String str, EnumC667230QFd enumC667230QFd, boolean z, boolean z2);

    int k(Aweme aweme);

    void k0(String str, String str2);

    boolean l0();

    boolean m();

    boolean m0();

    C13IQ<? extends ReusedUIAssem<? extends C03H5>> n();

    void n0(String str, String str2, boolean z);

    void notifyFromRnAndH5(JSONObject jSONObject);

    void o(Fragment fragment, View view, Aweme aweme, String str, String str2, int i);

    void o0(String str, String str2);

    Fragment p(Fragment fragment, InterfaceC668720QKw interfaceC668720QKw);

    Aweme q(Aweme aweme);

    String q0();

    String r0(String str);

    boolean s(PublishModel publishModel, InterfaceC214902198i interfaceC214902198i, C19EG c19eg);

    boolean s0(Context context, Aweme aweme, Fragment fragment);

    String t(Aweme aweme, Integer num);

    Map<String, String> t0();

    void u(Context context, Fragment fragment, SearchResultParam searchResultParam);

    void u0(String str, String str2, String str3, String str4);

    void v(Context context, String str, Bundle bundle);

    boolean w(Aweme aweme, String str);

    void w0(Context context, String str, TextExtraStruct textExtraStruct, Map<String, String> map, String str2);

    C13IQ<? extends UIContentAssem> x();

    void y(BasePanelUIComponent basePanelUIComponent);

    InterfaceC676470Qg9 y0();

    void z(String str);

    boolean z0(Fragment fragment);
}
