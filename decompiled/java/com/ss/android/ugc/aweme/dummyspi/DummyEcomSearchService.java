package com.ss.android.ugc.aweme.dummyspi;

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
import X.C13BV;
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
import com.ss.android.ugc.aweme.config.TiktokEcSearchRegionConfigSettings;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.EcSearchDealsSkinData;
import com.ss.android.ugc.aweme.search.ecom.data.ECServerPerfInfo;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
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
public class DummyEcomSearchService implements IEcomSearchService {
    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LIZ(String str, AwS159S1100000_10 awS159S1100000_10, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LIZIZ(ECServerPerfInfo eCServerPerfInfo, JSONObject jSONObject, String str) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LIZJ(Uri uri) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final InterfaceC655060Pmi LJFF(Context context, C01BK c01bk) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJI(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJII() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final ECSearchEntranceData LJIIIIZZ(Uri uri) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIIIZ(SearchResultParam searchResultParam, C0QER c0qer) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJIIJ(C19EG c19eg) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final Intent LJIIJJI(Activity activity, Uri uri) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIILIIL(SearchResultParam searchResultParam) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String LJIILJJIL(String str, Uri uri, String str2, String str3, AwS50S2100000_3 awS50S2100000_3, C2284108xD c2284108xD) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIILL(String str, List list) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIILLIIL(SearchResultParam searchResultParam) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIIZILJ(Uri uri, SearchResultParam searchResultParam) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJIJ(Fragment fragment) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIJI(SearchResultParam searchResultParam) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIJJ(List<? extends Aweme> list) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIJJLI(C0QWU c0qwu, Context context, ViewGroup viewGroup, C0QNH c0qnh) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJIL(Uri uri) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJ(C0QXE c0qxe, C0QER c0qer, C19EG c19eg) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final PriorityProtocol LJJI(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIFFI() {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJII(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIII(View view, String str, Integer num) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIIJ(Context context, Uri uri, Bundle bundle, Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJIIJZLJL(C19EG c19eg, String str, String str2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String LJJIIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJIJ(Uri uri) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIJIIJI(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIJIIJIL() {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final Map<String, String> LJJIJL(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIJLIJ(Uri uri, String str) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIL(Uri uri, SearchResultParam searchResultParam, String str, Function1 function1) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final C671660QWe LJJIZ(Context context, IconTextInfo iconTextInfo) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJJI(SearchResultParam searchResultParam, boolean z, int i, int i2, C650950Pg5 c650950Pg5) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJJIL(View view, Aweme aweme, C0Q4V c0q4v) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final InterfaceC668850QLj LJJJJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJJJI(String str, String str2, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final int LJJJJIZL() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String LJJJJJ(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final int LJJJJJL() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final InterfaceC1770280wAU LJJJJL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String LJJJJLI(String str, EnumC1769850w9n enumC1769850w9n) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJJJLL(RecyclerView recyclerView, String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final SmartRoute LJJJJZ(Context context) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJJJZI(C0QYR c0qyr) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String LJJJLIIL() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final InterfaceC668770QLb LJJJLZIJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJJZ(C0QWU c0qwu, Context context, ViewGroup viewGroup, TextView textView, C0QL8 c0ql8, boolean z, C670090QQd c670090QQd) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJL(Uri uri, C0QSM c0qsm, C669560QOc c669560QOc, SearchResultParam searchResultParam) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJLI(SearchResultParam searchResultParam, C0QER c0qer, C650950Pg5 c650950Pg5, C19EG c19eg) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJLIIIIJ(EnumC683800Qry enumC683800Qry, Map map, AwS411S0200000_10 awS411S0200000_10, AwS411S0200000_10 awS411S0200000_102) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final AbstractC19484711Kz<SuggestWordResponse> LJJLIIIJILLIZJL(String str, String str2, String str3, String str4, String str5) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJLIIIJJI(C19EG c19eg) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJLIIIJJIZ(Context context, C20472080g c20472080g, EditText editText, ImageView imageView, AwS624S0100000_10 awS624S0100000_10, AwS589S0100000_10 awS589S0100000_10) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final ECSearchEntranceData LJJLIIIJLJLI(int i) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final C667170QEx LJJLIIIJLLLLLLLZ(Uri uri) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJLIIJ(View view, String str, String str2, Map<String, String> map, InterfaceC2211711BhJ interfaceC2211711BhJ) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJLIL(C20472080g c20472080g, EditText editText, ImageView imageView, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final InterfaceC686660Qwa LJJLJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJLJLI(String str, String str2, String str3, C0QWU c0qwu, SearchResultParam searchResultParam, C0QER c0qer, Map map, String str4, String str5) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJLL(Map<String, ? extends Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final Object LJJZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJZZIII(String str, String str2, String str3, C672020QXo c672020QXo) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJL(Uri uri, String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final EcSearchDealsSkinData LJLI(C0QER c0qer, boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final Map<String, String> LJLIIIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final C0QY3 LJLIIL(SearchResultParam searchResultParam, boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String LJLIL(View view, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJLILLLLZI(Aweme aweme, boolean z, boolean z2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJLJI(PageFinder pageFinder, String str, String str2, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final Uri LJLJJI(Uri uri, C0QSM c0qsm) {
        return uri;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJLJJL(View view) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJLJJLL(SmartImageView smartImageView, C0QY3 c0qy3) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final Map<String, String> LJLJL(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final C0QY2 getEntranceView(Context context, C0QXR c0qxr, C671890QXb c671890QXb, LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String getParamByName(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String getUserId() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void notifyFromRnAndH5(JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void reportPDPLeaveRate(View view, Long l, long j, Map<String, ? extends Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void verifySearchParams(Map<String, ? extends Object> map, List<String> list) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final List<IInterceptor> LJJIJIL() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final C0QLO LJJLIIIJ() {
        return C0QLO.NO_MALL;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final SearchResultParam LJIIL(Uri uri) {
        return new SearchResultParam();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final AbsSearchBaseFragment LJJIIZI(InterfaceC664250Q3r interfaceC664250Q3r) {
        return new DummySearchAdapter();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final AbsSearchBaseFragment LJJJLL(InterfaceC664250Q3r interfaceC664250Q3r) {
        return new DummySearchAdapter();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    @InterfaceC1294060jmO
    public final boolean LJJLIIIJL(boolean z) {
        if (z && !TiktokEcSearchRegionConfigSettings.LIZ().disableSuggestGuideFromMall) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final C0QSM LJJZZI(Uri uri) {
        return C0QSM.NOT_FROM_MALL_UG_OR_REVERT;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final Pair LJJJ(Uri uri, String str) {
        return new Pair(Boolean.FALSE, null);
    }
}
