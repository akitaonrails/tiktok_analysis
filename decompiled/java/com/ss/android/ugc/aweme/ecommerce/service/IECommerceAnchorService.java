package com.ss.android.ugc.aweme.ecommerce.service;

import X.AbstractC19511111Vd;
import X.C12BP;
import X.C19EG;
import X.C2344009Gk;
import X.EnumC1235690iGF;
import X.InterfaceC1294060jmO;
import X.InterfaceC1392790mLd;
import X.InterfaceC1394860mOy;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.RouteIntent;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ECAvMusic;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes30.dex */
public interface IECommerceAnchorService {
    boolean LIZ();

    C12BP LIZIZ();

    boolean LIZJ(Aweme aweme);

    String LIZLLL(Aweme aweme, boolean z);

    View LJ(Context context, Aweme aweme, String str, AwS265S0300000_21 awS265S0300000_21);

    void LJFF(C2344009Gk c2344009Gk, Aweme aweme);

    void LJI(Bundle bundle, Aweme aweme);

    Map<String, Object> LJII(Aweme aweme);

    boolean LJIIIIZZ();

    n LJIIIZ(String str, String str2);

    void LJIIJ(Aweme aweme, Integer num, String str, String str2);

    String LJIIJJI();

    View LJIIL(Context context, String str);

    void LJIILIIL(Aweme aweme, String str, AnoleComponentModel anoleComponentModel);

    void LJIILJJIL(Context context, Aweme aweme, AnoleComponentModel anoleComponentModel, String str, View view);

    Integer LJIILL(Aweme aweme);

    Map<String, Integer> LJIILLIIL();

    void LJIIZILJ(Context context, String str);

    int LJIJ();

    void LJIJI(String str, String str2, AwS601S0100000_22 awS601S0100000_22);

    boolean LJIJJ();

    String LJIJJLI(String str, Map map);

    boolean LJIL();

    List<String> LJJ(boolean z, boolean z2);

    void LJJI(ProductListModel productListModel, String str);

    boolean LJJIFFI();

    void LJJII(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, Integer num);

    boolean LJJIII(Aweme aweme);

    @InterfaceC1294060jmO
    boolean LJJIIJ(Aweme aweme);

    void LJJIIJZLJL(Integer num, String str, Map<String, Object> map);

    boolean LJJIIZ(Aweme aweme);

    InterfaceC1394860mOy LJJIIZI();

    boolean LJJIJ();

    void LJJIJIIJI(AwS608S0100000_29 awS608S0100000_29);

    void LJJIJIIJIL(Aweme aweme);

    void LJJIJIL(List<? extends Aweme> list);

    void LJJIJL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool);

    boolean LJJIJLIJ();

    List<Integer> LJJIL();

    boolean LJJIZ();

    List<Integer> LJJJ();

    void LJJJI(Aweme aweme, List list);

    boolean LJJJIL(Aweme aweme);

    void LJJJJ(Integer num, String str, Map<String, Object> map);

    void LJJJJI(Uri uri);

    void LJJJJIZL(String str);

    void LJJJJJ(Aweme aweme, String str);

    C12BP LJJJJJL();

    Map<String, String> LJJJJL(List<CreateAnchorInfo> list);

    boolean LJJJJLI(List<AnchorTransData> list);

    boolean LJJJJLL();

    boolean LJJJJZ(Aweme aweme);

    boolean LJJJJZI();

    void LJJJLIIL(Aweme aweme, Integer num, String str, String str2);

    void LJJJLL(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6);

    boolean LJJJLZIJ(String str);

    boolean LJJJZ();

    void LJJL(List list, boolean z, boolean z2, String str, Function1 function1);

    void LJJLI();

    boolean LJJLIIIIJ(C19EG c19eg, RouteIntent routeIntent);

    List<AnchorProductInfo> LJJLIIIJ(Aweme aweme);

    IPanelProviderProtocol LJJLIIIJILLIZJL();

    boolean LJJLIIIJJI(Aweme aweme);

    void LJJLIIIJJIZ(String str, Integer num, String str2, String str3, String str4);

    List<AnchorProductInfoModel> LJJLIIIJL(AnchorCommonStruct anchorCommonStruct);

    void LJJLIIIJLJLI();

    boolean LJJLIIIJLLLLLLLZ();

    String LJJLIIJ();

    boolean LJJLIL(Aweme aweme);

    List LJJLJ(List list, boolean z, AbstractC19511111Vd abstractC19511111Vd);

    C12BP LJJLJLI();

    AnchorPdpPreloadModel LJJLL();

    void LJJZ(Integer num, Map map);

    boolean LJJZZI(Aweme aweme);

    boolean LJJZZIII();

    void LJL(Aweme aweme, List<AnchorProductInfoModel> list);

    int LJLI();

    int LJLIIIL(Aweme aweme);

    boolean LJLIIL();

    String LJLIL(AnchorProductInfoModel anchorProductInfoModel, Aweme aweme, String str, String str2, boolean z);

    InterfaceC1392790mLd LJLILLLLZI();

    boolean LJLJI();

    boolean LJLJJI();

    ProductListModel LJLJJL();

    List<Integer> LJLJJLL();

    void LJLJL(Integer num, String str, Map map, boolean z);

    void LJLJLJ(GetAnchorMotionInfoRequest getAnchorMotionInfoRequest, AwS595S0100000_16 awS595S0100000_16, AwS617S0100000_3 awS617S0100000_3);

    int LJLJLLL();

    boolean LJLL(Aweme aweme);

    RelatedProductInfo LJLLI(String str, String str2);

    boolean LJLLILLLL(AnchorCommonStruct anchorCommonStruct);

    int LJLLJ();

    boolean LJLLL(ECAvMusic eCAvMusic);

    void LJLLLL(Activity activity, View view, EnumC1235690iGF enumC1235690iGF, boolean z, boolean z2);

    String getRecommendId();
}
