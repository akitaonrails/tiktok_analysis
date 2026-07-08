package com.ss.android.ugc.aweme.search.ecommerce;

import X.AbstractC19484711Kz;
import X.C01BK;
import X.C0Q4V;
import X.C0QER;
import X.C0QL8;
import X.C0QLO;
import X.C0QNH;
import X.C0QSM;
import X.C0QWU;
import X.C0QXE;
import X.C0QXR;
import X.C0QY2;
import X.C0QY3;
import X.C0QYR;
import X.C19EG;
import X.C20472080g;
import X.C2284108xD;
import X.C650950Pg5;
import X.C667170QEx;
import X.C669560QOc;
import X.C670090QQd;
import X.C671660QWe;
import X.C671890QXb;
import X.C672020QXo;
import X.EnumC1769850w9n;
import X.EnumC683800Qry;
import X.InterfaceC1294060jmO;
import X.InterfaceC1770280wAU;
import X.InterfaceC2211711BhJ;
import X.InterfaceC655060Pmi;
import X.InterfaceC664250Q3r;
import X.InterfaceC668770QLb;
import X.InterfaceC668850QLj;
import X.InterfaceC686660Qwa;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.EcSearchDealsSkinData;
import com.ss.android.ugc.aweme.search.ecom.data.ECServerPerfInfo;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.IconTextInfo;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS159S1100000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS50S2100000_3;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public interface IEcomSearchService {
    void LIZ(String str, AwS159S1100000_10 awS159S1100000_10, String str2, String str3);

    void LIZIZ(ECServerPerfInfo eCServerPerfInfo, JSONObject jSONObject, String str);

    boolean LIZJ(Uri uri);

    void LIZLLL();

    void LJ();

    InterfaceC655060Pmi LJFF(Context context, C01BK c01bk);

    void LJI(String str, String str2);

    boolean LJII();

    ECSearchEntranceData LJIIIIZZ(Uri uri);

    void LJIIIZ(SearchResultParam searchResultParam, C0QER c0qer);

    boolean LJIIJ(C19EG c19eg);

    Intent LJIIJJI(Activity activity, Uri uri);

    SearchResultParam LJIIL(Uri uri);

    void LJIILIIL(SearchResultParam searchResultParam);

    String LJIILJJIL(String str, Uri uri, String str2, String str3, AwS50S2100000_3 awS50S2100000_3, C2284108xD c2284108xD);

    void LJIILL(String str, List list);

    void LJIILLIIL(SearchResultParam searchResultParam);

    void LJIIZILJ(Uri uri, SearchResultParam searchResultParam);

    boolean LJIJ(Fragment fragment);

    void LJIJI(SearchResultParam searchResultParam);

    void LJIJJ(List<? extends Aweme> list);

    void LJIJJLI(C0QWU c0qwu, Context context, ViewGroup viewGroup, C0QNH c0qnh);

    boolean LJIL(Uri uri);

    void LJJ(C0QXE c0qxe, C0QER c0qer, C19EG c19eg);

    PriorityProtocol LJJI(String str);

    void LJJIFFI();

    void LJJII(Context context);

    void LJJIII(View view, String str, Integer num);

    void LJJIIJ(Context context, Uri uri, Bundle bundle, Object obj);

    boolean LJJIIJZLJL(C19EG c19eg, String str, String str2);

    String LJJIIZ();

    AbsSearchBaseFragment LJJIIZI(InterfaceC664250Q3r interfaceC664250Q3r);

    boolean LJJIJ(Uri uri);

    void LJJIJIIJI(Aweme aweme);

    void LJJIJIIJIL();

    List<IInterceptor> LJJIJIL();

    Map<String, String> LJJIJL(String str);

    void LJJIJLIJ(Uri uri, String str);

    void LJJIL(Uri uri, SearchResultParam searchResultParam, String str, Function1 function1);

    C671660QWe LJJIZ(Context context, IconTextInfo iconTextInfo);

    Pair LJJJ(Uri uri, String str);

    void LJJJI(SearchResultParam searchResultParam, boolean z, int i, int i2, C650950Pg5 c650950Pg5);

    void LJJJIL(View view, Aweme aweme, C0Q4V c0q4v);

    InterfaceC668850QLj LJJJJ();

    void LJJJJI(String str, String str2, boolean z);

    int LJJJJIZL();

    String LJJJJJ(String str, String str2);

    int LJJJJJL();

    InterfaceC1770280wAU LJJJJL();

    String LJJJJLI(String str, EnumC1769850w9n enumC1769850w9n);

    void LJJJJLL(RecyclerView recyclerView, String str, String str2);

    SmartRoute LJJJJZ(Context context);

    void LJJJJZI(C0QYR c0qyr);

    String LJJJLIIL();

    AbsSearchBaseFragment LJJJLL(InterfaceC664250Q3r interfaceC664250Q3r);

    InterfaceC668770QLb LJJJLZIJ();

    void LJJJZ(C0QWU c0qwu, Context context, ViewGroup viewGroup, TextView textView, C0QL8 c0ql8, boolean z, C670090QQd c670090QQd);

    void LJJL(Uri uri, C0QSM c0qsm, C669560QOc c669560QOc, SearchResultParam searchResultParam);

    void LJJLI(SearchResultParam searchResultParam, C0QER c0qer, C650950Pg5 c650950Pg5, C19EG c19eg);

    void LJJLIIIIJ(EnumC683800Qry enumC683800Qry, Map map, AwS411S0200000_10 awS411S0200000_10, AwS411S0200000_10 awS411S0200000_102);

    C0QLO LJJLIIIJ();

    AbstractC19484711Kz<SuggestWordResponse> LJJLIIIJILLIZJL(String str, String str2, String str3, String str4, String str5);

    boolean LJJLIIIJJI(C19EG c19eg);

    boolean LJJLIIIJJIZ(Context context, C20472080g c20472080g, EditText editText, ImageView imageView, AwS624S0100000_10 awS624S0100000_10, AwS589S0100000_10 awS589S0100000_10);

    @InterfaceC1294060jmO
    boolean LJJLIIIJL(boolean z);

    ECSearchEntranceData LJJLIIIJLJLI(int i);

    C667170QEx LJJLIIIJLLLLLLLZ(Uri uri);

    void LJJLIIJ(View view, String str, String str2, Map<String, String> map, InterfaceC2211711BhJ interfaceC2211711BhJ);

    void LJJLIL(C20472080g c20472080g, EditText editText, ImageView imageView, boolean z);

    InterfaceC686660Qwa LJJLJ();

    void LJJLJLI(String str, String str2, String str3, C0QWU c0qwu, SearchResultParam searchResultParam, C0QER c0qer, Map map, String str4, String str5);

    void LJJLL(Map<String, ? extends Object> map);

    Object LJJZ();

    C0QSM LJJZZI(Uri uri);

    void LJJZZIII(String str, String str2, String str3, C672020QXo c672020QXo);

    void LJL(Uri uri, String str, boolean z);

    EcSearchDealsSkinData LJLI(C0QER c0qer, boolean z);

    Map<String, String> LJLIIIL();

    C0QY3 LJLIIL(SearchResultParam searchResultParam, boolean z);

    String LJLIL(View view, String str);

    boolean LJLILLLLZI(Aweme aweme, boolean z, boolean z2);

    void LJLJI(PageFinder pageFinder, String str, String str2, boolean z);

    Uri LJLJJI(Uri uri, C0QSM c0qsm);

    void LJLJJL(View view);

    void LJLJJLL(SmartImageView smartImageView, C0QY3 c0qy3);

    Map<String, String> LJLJL(String str);

    C0QY2 getEntranceView(Context context, C0QXR c0qxr, C671890QXb c671890QXb, LifecycleOwner lifecycleOwner, Function0<Unit> function0);

    String getParamByName(String str);

    String getUserId();

    void notifyFromRnAndH5(JSONObject jSONObject);

    void reportPDPLeaveRate(View view, Long l, long j, Map<String, ? extends Object> map);

    void verifySearchParams(Map<String, ? extends Object> map, List<String> list);
}
