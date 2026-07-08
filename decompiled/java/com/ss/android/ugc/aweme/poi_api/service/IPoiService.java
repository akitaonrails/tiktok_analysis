package com.ss.android.ugc.aweme.poi_api.service;

import X.AbstractC1189550h3p;
import X.AbstractC1549150qPp;
import X.AbstractC738140SxQ;
import X.C03H5;
import X.C0OFL;
import X.C0WIY;
import X.C0ZYL;
import X.C1192360h8M;
import X.C1199450hJn;
import X.C13IQ;
import X.C19EG;
import X.C2189821An6;
import X.EnumC1201990hNt;
import X.EnumC642080PGk;
import X.InterfaceC1186204kW;
import X.InterfaceC1188520h2A;
import X.InterfaceC1191270h6b;
import X.InterfaceC1192370h8N;
import X.InterfaceC1194100hBA;
import X.InterfaceC1197120hG2;
import X.InterfaceC1364105Vn;
import X.InterfaceC1393680mN4;
import X.InterfaceC1605290rsN;
import X.InterfaceC691450RAh;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.interceptor.IInterceptor;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiRevisitBannerRelatedResponse;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi.collect.IPoiCollectService;
import com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService;
import com.ss.android.ugc.aweme.poi.feedcard.ILSFeedGPSCardService;
import com.ss.android.ugc.aweme.poi.hybrid.IPoiHybridService;
import com.ss.android.ugc.aweme.poi.poidetail.IPoiDetailPageService;
import com.ss.android.ugc.aweme.poi.reviews.IReviewsService;
import com.ss.android.ugc.aweme.poi.tag.IPoiTagService;
import com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.services.publish.AVPublishPageScene;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import j27.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS194S1100000_18;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes19.dex */
public interface IPoiService extends IPoiTagService, IPoiAnchorService, IPoiVideoPublishService, IReviewsService, IPoiTransactionService, IPoiHybridService, IPoiDetailPageService, IPoiCollectService, ILSFeedCardService, ILSFeedGPSCardService {
    HashMap<String, InterfaceC1186204kW> LIZ();

    C0ZYL LIZIZ();

    void LIZJ(int i);

    LynxUI<?> LJ(s sVar);

    void LJFF(String str, String str2);

    boolean LJI(Context context);

    boolean LJII();

    InterfaceC1605290rsN LJIIIIZZ(Fragment fragment);

    String LJIIIZ();

    void LJIIJ(String str, AwS600S0100000_21 awS600S0100000_21);

    int LJIIJJI();

    View LJIIL(Context context);

    IInterceptor LJIILIIL();

    Map LJIILJJIL(Aweme aweme, String str);

    void LJIILL(Bundle bundle, View view, FragmentManager fragmentManager);

    void LJIILLIIL(ViewGroup viewGroup, Fragment fragment);

    InterfaceC1194100hBA LJIIZILJ();

    void LJIJ(Context context, String str);

    void LJIJI(Context context, String str, List<String> list, String str2, String str3);

    void LJIJJ(CreativeModel creativeModel);

    boolean LJIJJLI();

    boolean LJIL();

    Map LJJ(String str, String str2);

    String LJJI(String str);

    Boolean LJJIFFI(Aweme aweme);

    void LJJII(EnumC642080PGk enumC642080PGk);

    void LJJIII(String str, String str2);

    void LJJIIJ(Context context, EnumC642080PGk enumC642080PGk);

    View LJJIIJZLJL(Context context, String str, List list);

    void LJJIIZ(C19EG c19eg, String str);

    List<Class<? extends AbstractC1549150qPp<?, ?>>> LJJIIZI();

    void LJJIJ(Integer num, String str, String str2, String str3);

    boolean LJJIJIIJI();

    boolean LJJIJIIJIL(C2189821An6 c2189821An6);

    InterfaceC1191270h6b LJJIJIL(PoiData poiData);

    InterfaceC1605290rsN LJJIJL(Fragment fragment);

    boolean LJJIJLIJ(String str, String str2);

    C0OFL LJJIL(Context context);

    boolean LJJIZ();

    void LJJJ(Aweme aweme, HashMap map);

    Class<? extends AbstractC1549150qPp<?, ?>> LJJJI();

    void LJJJIL(EnumC1201990hNt enumC1201990hNt, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13);

    C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJJJ();

    InterfaceC1605290rsN LJJJJI(Fragment fragment);

    Object LJJJJIZL(String str, InterfaceC1364105Vn<? super PoiRevisitBannerRelatedResponse> interfaceC1364105Vn);

    void LJJJJJ(Context context, Number number, String str, Boolean bool, Boolean bool2, AwS384S0200000_18 awS384S0200000_18, AwS562S0100000_18 awS562S0100000_18);

    Object LJJJJJL(InterfaceC691450RAh interfaceC691450RAh);

    boolean LJJJJL();

    C0WIY<Class<?>, IAVPublishExtension<?>> LJJJJLI(AVPublishPageScene aVPublishPageScene, String str);

    void LJJJJLL(PoiDataStruct poiDataStruct, ImageUrlModel imageUrlModel, SmartImageView smartImageView);

    <T extends InterfaceC1188520h2A> T LJJJJZI(String str);

    void LJJJLIIL();

    boolean LJJJLL();

    Integer LJJJLZIJ();

    InterfaceC1197120hG2 LJJJZ();

    View LJJL(Context context, Aweme aweme);

    boolean LJJLI(Context context);

    InterfaceC1192370h8N LJJLIIIIJ(ViewGroup viewGroup);

    Class<? extends AbstractC738140SxQ> LJJLIIIJ();

    Integer LJJLIIIJILLIZJL(Aweme aweme);

    void LJJLIIIJJI(Integer num, String str, String str2, String str3);

    C0WIY<Boolean, Integer> LJJLIIIJJIZ();

    void LJJLIIIJL(SmartRoute smartRoute, Context context, String str);

    void LJJLIIIJLJLI();

    void LJJLIIIJLLLLLLLZ(Context context, String str);

    boolean LJJLIIJ(C2189821An6 c2189821An6);

    C13IQ<? extends AbstractC738140SxQ> LJJLIL();

    void LJJLJ(String str, String str2);

    void LJJLJLI(String str, String str2, C1192360h8M c1192360h8M, AFwS206S0000000_18 aFwS206S0000000_18);

    boolean LJJLL(String str, String str2);

    AbstractC1189550h3p LJJZ();

    void LJJZZI(C19EG c19eg);

    void LJJZZIII(C1199450hJn c1199450hJn);

    void LJL(String str, String str2, String str3, String str4, boolean z, boolean z2);

    String LJLI(String str, String str2);

    float LJLIIIL();

    boolean LJLIIL();

    String LJLIL(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6);

    void LJLILLLLZI();

    boolean LJLJI();

    void LJLJJI(String str, String str2);

    boolean LJLJJL();

    boolean LJLJJLL();

    String LJLJL(String str);

    boolean LJLJLJ();

    void LJLJLLL(String str, AwS194S1100000_18 awS194S1100000_18, boolean z);

    boolean LJLL(Context context, Double d, Double d2, String str, String str2, Float f, String str3, String str4, PageFinder pageFinder);

    void LJLLI(Map<String, String> map);

    C13IQ<? extends AbstractC738140SxQ> LJLLILLLL(C2189821An6 c2189821An6);

    boolean LJLLJ();

    C13IQ<? extends UIContentAssem> LJLLL();

    Fragment LJLLLL(Aweme aweme);

    void LJLLLLLL(PoiData poiData, Map<String, String> map);

    View LJLZ(Context context, Aweme aweme, String str, AwS255S0300000_11 awS255S0300000_11);

    CreateAnchorInfo LJZ(PoiData poiData);

    void LJZI(Aweme aweme, C2189821An6 c2189821An6, Map<String, String> map);

    boolean LJZL(Context context);

    Map<String, String> LL(Context context);

    String LLD();

    View LLF(Context context, Aweme aweme, String str, String str2);

    boolean LLFF();

    <T> boolean LLFFF(T t, String str);

    IInterceptor LLFII();

    void LLI(ViewGroup viewGroup, Fragment fragment);

    String LLIFFJFJJ(Aweme aweme);

    Map<String, String> LLII();

    boolean LLIIII(String str, String str2);

    InterfaceC1393680mN4 LLIIIILZ();

    <T extends InterfaceC1188520h2A> void LLIIIJ(String str, T t);

    IInterceptor LLIIIL();

    boolean enable();
}
