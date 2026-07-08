package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.AbstractC1189550h3p;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0C64;
import X.C0H4W;
import X.C1174860gg8;
import X.C1179140gn2;
import X.C1179160gn4;
import X.C1179490gnb;
import X.C1180060goW;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1180760gpe;
import X.C1181430gqj;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1184550gvl;
import X.C1184740gw4;
import X.C1184850gwF;
import X.C1184910gwL;
import X.C1184970gwR;
import X.C1184980gwS;
import X.C1185000gwU;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185490gxH;
import X.C1186070gyD;
import X.C1186690gzD;
import X.C1187180h00;
import X.C1188440h22;
import X.C1188530h2B;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1189520h3m;
import X.C1190820h5s;
import X.C1191160h6Q;
import X.C1192290h8F;
import X.C1200940hMC;
import X.C1202680hP0;
import X.C1202730hP5;
import X.C1209070hZJ;
import X.C1252710ihh;
import X.C1308910kAL;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1336370ksd;
import X.C1367960lha;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C14KI;
import X.C15438062q;
import X.C1545540qK0;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1767006w0;
import X.C1767206w2;
import X.C1843500y4a;
import X.C1871910yoP;
import X.C189200o6;
import X.C18JG;
import X.C19719912Dl;
import X.C19748612Om;
import X.C19M4;
import X.C19ME;
import X.C20600815jK;
import X.C20642515q3;
import X.C21415018rM;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2255108sX;
import X.C2344009Gk;
import X.C2365509Or;
import X.C262100zr;
import X.C280190AyX;
import X.C290960Bao;
import X.C290970Bap;
import X.C337180DJs;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C424890GlL;
import X.C426750GoL;
import X.C427690Gpr;
import X.C438710HIf;
import X.C444830HcP;
import X.C444840HcQ;
import X.C444920HcY;
import X.C444960Hcc;
import X.C452501pT;
import X.C586460MzM;
import X.C622680Oba;
import X.C703302op;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1156320gCE;
import X.EnumC1177490gkN;
import X.EnumC1179480gna;
import X.EnumC1203020hPY;
import X.EnumC1338240kve;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1184330gvP;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCircleFavoriteButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiSlashContextAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model.PoiHeadAiSummary;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model.PoiHeadMergedTag;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.dynamicbutton.PoiDetailHeaderDynamicButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.PoiChartCell;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.DistanceInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PhoneInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiHeaderButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbilityAdapter;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import com.ss.android.ugc.aweme.poi.experiment.PoiGalleryPicOptExperiment;
import com.ss.android.ugc.aweme.poi.map.LocationDetailMobParam;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import irm.AkS0S3300000_18;
import irm.AkS0S3410000_18;
import irm.AkS0S7410000_18;
import irm.AkS1S0600000_18;
import irm.AkS28S0300000_18;
import irm.AkS3S1300000_18;
import irm.AkS6S1200000_18;
import irm.AkS87S0100000_18;
import irm.AkS9S0400000_18;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS115S0400000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS23S1400000_18;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS38S1400000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS70S0210000_18;
import kotlin.jvm.internal.AwS83S1300000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public class PoiDetailHeaderAssem extends UIContentAssem implements IPoiTagAbility, InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1184460gvc.class, "PoiDetailContentHeaderHierarchyDataV3"), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final String LLJI;
    public final AssemVMLazy LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public PoiListApi.PoiDetailResponse LLJJI;
    public PoiListApi.PoiDetailResponse LLJJIII;
    public List<PoiHeadMergedTag> LLJJIJI;
    public List<PoiDetailTag> LLJJIJIIJIL;
    public View LLJJIJIL;
    public boolean LLJJJ;
    public View LLJJJIL;
    public final C1209070hZJ LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailHeaderAssem.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiDetailHeaderAssem.class, "poiCollectStatusViewModel", "getPoiCollectStatusViewModel()Lcom/ss/android/ugc/aweme/poi/collect/PoiCollectStatusViewModel;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiDetailHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ, 536), AFwS256S0000000_18.get$arr$(351), null, true);
        this.LLJI = "poi_detail";
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiCollectStatusViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ2, 537), AFwS256S0000000_18.get$arr$(352), null, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1004));
        this.LLJILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1002));
        this.LLJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1003));
        this.LLJJJJ = new C1209070hZJ(this, 2);
    }

    public int Jo() {
        return R.layout.e00;
    }

    public boolean mp() {
        return this instanceof PoiDetailFoodHeaderAssem;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IPoiTagAbility.class, null, null);
            ContainerEventDispatcher$RefreshActionCallBackAbilityAdapter containerEventDispatcher$RefreshActionCallBackAbilityAdapter = new ContainerEventDispatcher$RefreshActionCallBackAbilityAdapter() { // from class: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem$onCreate$1$1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
                public final void LLLLLZIL(Throwable th) {
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
                public final void i1() {
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
                public final void t0() {
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
                public final void X0(String str) {
                    this.LL.LLJJI = null;
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(this, ContainerEventDispatcher$RefreshActionCallBackAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(this, containerEventDispatcher$RefreshActionCallBackAbilityAdapter, ContainerEventDispatcher$RefreshActionCallBackAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (!(invocationHandler instanceof C2255108sX)) {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                    ((C2255108sX) invocationHandler).LL.add(containerEventDispatcher$RefreshActionCallBackAbilityAdapter);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(containerEventDispatcher$RefreshActionCallBackAbilityAdapter);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(ContainerEventDispatcher$RefreshActionCallBackAbility.class.getClassLoader(), new Class[]{ContainerEventDispatcher$RefreshActionCallBackAbility.class}, c2255108sX);
                    if (objNewProxyInstance == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher.RefreshActionCallBackAbility");
                    }
                    C1558520qew.LJII(this, (InterfaceC494301wD) objNewProxyInstance, ContainerEventDispatcher$RefreshActionCallBackAbility.class, null, null);
                }
            }
        }
        AssemViewModel.asyncSubscribe$default(cp(), new C2217381BqS() { // from class: X.0gwQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1181990grd) obj).LL;
            }
        }, this, null, null, null, new AwS597S0100000_18(this, 295), 28, null);
    }

    public final C1184460gvc Oo() {
        return (C1184460gvc) this.LLIZLLLIL.getValue();
    }

    public final PageFinder Zo() {
        return (PageFinder) this.LLJILLL.getValue();
    }

    public final PoiCollectStatusViewModel ap() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (PoiCollectStatusViewModel) assemVMLazy.getValue();
    }

    public final PoiCommonMobParams bp() {
        return (PoiCommonMobParams) this.LLJJ.getValue();
    }

    public final PoiDetailInfoViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (PoiDetailInfoViewModel) assemVMLazy.getValue();
    }

    public final PoiCurrentSessionInfo dp() {
        IPoiSlashContextAbility iPoiSlashContextAbility = (IPoiSlashContextAbility) this.LLJILJILJ.getValue();
        if (iPoiSlashContextAbility != null) {
            return iPoiSlashContextAbility.a50();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.IPoiTagAbility
    public final void ky1() {
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str = cp().LL;
        PoiListApi.PoiDetailResponse poiDetailResponse = this.LLJJI;
        String str2 = null;
        String collectInfo = poiDetailResponse != null ? poiDetailResponse.getCollectInfo() : null;
        C1184460gvc c1184460gvcOo = Oo();
        String str3 = (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null) ? null : c1184480gve2.LLILLJJLI;
        C1184460gvc c1184460gvcOo2 = Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve.LL;
        }
        PageFinder pageFinderZo = Zo();
        c1185430gxB.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_from", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_method", str2);
        C1189060h32.LIZJ(c2344009Gk, collectInfo);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderZo);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_poi_opening_hours", map, c1185050gwZ);
    }

    public final float So() {
        if (getContext() == null) {
            return 0.0f;
        }
        return (((C418440Gaw.LIZLLL(r0) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 8)) / 7.0f) * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IPoiTagAbility.class, null);
        }
        C1548820qPI.LJIIIIZZ("closeReviewSubmitPage", this);
        C622680Oba.LIZLLL(this);
    }

    public static Pair Go(PoiListApi.PoiDetailResponse poiDetailResponse) {
        Pair<ArrayList<String>, ArrayList<String>> pair;
        PictureAlbum pictureAlbum;
        if (poiDetailResponse == null || (pictureAlbum = poiDetailResponse.getPictureAlbum()) == null || (pair = pictureAlbum.getGalleryImageData()) == null) {
            pair = new Pair<>(new ArrayList(), new ArrayList());
        }
        return new Pair(pair.getFirst(), pair.getSecond());
    }

    public static boolean Ho(PoiListApi.PoiDetailResponse poiDetailResponse) {
        IntentButtonConfig intentButtonConfig;
        if (poiDetailResponse != null && (intentButtonConfig = poiDetailResponse.getIntentButtonConfig()) != null) {
            return Intrinsics.LJFF(intentButtonConfig.intentButtonStyle, "circle_favorite_button");
        }
        return false;
    }

    public static int ep(View view) {
        return (int) (((double) (ScreenUtils.getScreenWidth(view.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)))) * 0.38d);
    }

    public static void up(PoiListApi.PoiDetailResponse poiDetailResponse) {
        Integer num;
        PictureAlbum pictureAlbum;
        List<PoiPicture> list;
        PoiPicture poiPicture;
        UrlModel urlModel;
        List<String> urlList;
        Object objLJJJLL;
        if (!C1185000gwU.LIZ()) {
            return;
        }
        PoiGalleryPicOptExperiment.LIZ.getClass();
        if (PoiGalleryPicOptExperiment.LIZIZ() && (num = ((PoiGalleryPicOptExperiment.PoiGalleryPicOptConfigModel) PoiGalleryPicOptExperiment.LIZJ.getValue()).poiDetailPreloadGalleyPic) != null && num.intValue() == 1 && poiDetailResponse != null && (pictureAlbum = poiDetailResponse.getPictureAlbum()) != null && (list = pictureAlbum.poiPictures) != null && (poiPicture = (PoiPicture) C13LP.LJJJLZIJ(0, list)) != null && (urlModel = poiPicture.compressedUrlInfo) != null && (urlList = urlModel.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
            C1336370ksd.LIZ.LJFF(new C1202730hP5(Collections.singletonList(objLJJJLL), "poi_detail", "poi_detail_preload_gallery_pic"));
        }
    }

    public final void Fp(View view) {
        C1184480gve c1184480gve;
        C1184460gvc c1184460gvcOo = Oo();
        if (c1184460gvcOo != null && (c1184480gve = c1184460gvcOo.LLILLL) != null && c1184480gve.LLJJIII) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.jzi);
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C1189060h32.LJJIIJ(tuxIconView, new AwS597S0100000_18(this, 296));
        }
    }

    public boolean iq(PoiListApi.PoiDetailResponse poiDetailResponse) {
        List<PoiDetailTag> poiTopTags;
        PoiDetailTag poiDetailTag;
        if (!C1184910gwL.LIZ() || poiDetailResponse == null || poiDetailResponse.showPoiSmallPic() || (poiTopTags = poiDetailResponse.getPoiTopTags()) == null || poiTopTags.size() != 1 || (poiDetailTag = (PoiDetailTag) C13LP.LJJJLL(poiDetailResponse.getPoiTopTags())) == null || poiDetailTag.tagType != EnumC1179480gna.POI_DETAIL_TAG_TYPE_HOTEL_RATING.getValue() || poiDetailResponse.getChartTag() != null || !op(poiDetailResponse) || this.LLJILJIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        Boolean boolValueOf;
        if (Intrinsics.LJFF(c262100zr.LIZ, "closeReviewSubmitPage")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "originalPostSource", "")) == null) {
                strLJFF = "";
            }
            AbstractC1189550h3p abstractC1189550h3p = (AbstractC1189550h3p) C1189520h3m.class.newInstance();
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            String strLJFF2 = null;
            if (interfaceC1107590evd2 != null) {
                boolValueOf = Boolean.valueOf(C1871910yoP.LIZIZ(interfaceC1107590evd2, "isSubmitReviewSuccess", false));
            } else {
                boolValueOf = null;
            }
            if (abstractC1189550h3p.LIZIZ(strLJFF) && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null) {
                    strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd3, "poiID", "");
                }
                C1440005kM.LIZ(new C586460MzM(strLJFF2));
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null) {
                    C1184850gwF.LIZ.getClass();
                    C1184850gwF.LIZIZ(fragmentLJI);
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDeleteReviewEvent(C1187180h00 c1187180h00) {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        if (!Intrinsics.LJFF(c1187180h00.LIZ, cp().LL)) {
            return;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse = this.LLJJIII;
        PoiListApi.PoiDetailResponse poiDetailResponseCopy = null;
        if (poiDetailResponse != null && (poiReviewSummaryModel = poiDetailResponse.getPoiReviewSummaryModel()) != null) {
            Long l = poiReviewSummaryModel.totalCount;
            long jLongValue = 0;
            if (l != null && l.longValue() - 1 > 0) {
                Long l2 = poiReviewSummaryModel.totalCount;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                jLongValue--;
            }
            poiDetailResponseCopy = poiDetailResponse.copy(poiDetailResponse.name, poiDetailResponse.address, poiDetailResponse.cover, poiDetailResponse.pictureAlbum, poiDetailResponse.isCollected, poiDetailResponse.collectInfo, poiDetailResponse.poiInfoSource, poiDetailResponse.cityCode, poiDetailResponse.regionCode, poiDetailResponse.typeLevel, poiDetailResponse.fatherPoi, poiDetailResponse.storeInfo, poiDetailResponse.tags, poiDetailResponse.poiHighlightTagModule, poiDetailResponse.poiTopTags, poiDetailResponse.poiDetailTagStyleMap, poiDetailResponse.ownerInfo, poiDetailResponse.poiLocation, poiDetailResponse.distanceInfo, poiDetailResponse.phoneInfo, poiDetailResponse.editPoiStatus, poiDetailResponse.dynamicMapParams, poiDetailResponse.claimStoreStatus, poiDetailResponse.reportInfo, poiDetailResponse.isBaAccount, poiDetailResponse.categoryName, poiDetailResponse.averagePrice, poiDetailResponse.followOwnerStatus, poiDetailResponse.shareInfo, poiReviewSummaryModel.copy(Long.valueOf(jLongValue), poiReviewSummaryModel.score, poiReviewSummaryModel.maxScore, poiReviewSummaryModel.scoreBreakdown, poiReviewSummaryModel.source, poiReviewSummaryModel.brandName, poiReviewSummaryModel.externalUrl, poiReviewSummaryModel.brandLogo, poiReviewSummaryModel.darkModeBrandLogo, poiReviewSummaryModel.trackInfo, poiReviewSummaryModel.displayType, poiReviewSummaryModel.eligibleExtraInfo, poiReviewSummaryModel.noRating, poiReviewSummaryModel.reviewSummaryAuthors, poiReviewSummaryModel.totalCountDisplay, poiReviewSummaryModel.scoreRangeDisplay), poiDetailResponse.realFavoriteCnt, poiDetailResponse.bookingInfo, poiDetailResponse.poiShopBookingInfoList, poiDetailResponse.haveRegionDiscovery, poiDetailResponse.haveBackgroundTopMap, poiDetailResponse.poiThirdPartyKeyInfo, poiDetailResponse.haveProductShelf, poiDetailResponse.bannerListInfo, poiDetailResponse.headerCoverImage, poiDetailResponse.poiIntro, poiDetailResponse.showHelpCenter, poiDetailResponse.helpCenterUrl, poiDetailResponse.userLocation, poiDetailResponse.chartTag, poiDetailResponse.intentButtonConfig, poiDetailResponse.cleanModeHeaderConfig, poiDetailResponse.isSemiClosedLoopHotel, poiDetailResponse.provinceCode, poiDetailResponse.ttTypeCode, poiDetailResponse.geoNameIds, poiDetailResponse.ttTypeNameSuper, poiDetailResponse.cityPoiName, poiDetailResponse.cityPoiId, poiDetailResponse.cityName, poiDetailResponse.ttTypeNameMedium, poiDetailResponse.countryCode, poiDetailResponse.ttTypeNameTiny, poiDetailResponse.poiStyleConfig, poiDetailResponse.mergedTagsList, poiDetailResponse.aiSummary, poiDetailResponse.isProductVisible, poiDetailResponse.trustTags, poiDetailResponse.highLightCategoryName, poiDetailResponse.poiHeadButtonGroup, poiDetailResponse.showBottomBarWhenDisappear, poiDetailResponse.poiDetailPageOpt, poiDetailResponse.noNeedEmptyFeed, poiDetailResponse.poiReviewEntrance, poiDetailResponse.yearForDisplay, poiDetailResponse.LL, poiDetailResponse.LLILLJJLI);
        }
        yp(poiDetailResponseCopy);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPoiWriteReviewSuccess(C586460MzM c586460MzM) {
        Fragment fragmentLJI;
        ContainerEventDispatcher$RefreshActionCallBackAbility containerEventDispatcher$RefreshActionCallBackAbility;
        if (Intrinsics.LJFF(c586460MzM.LIZ, cp().LL) && this.LLJJJ && (fragmentLJI = C724240Sb0.LJI(this)) != null && (containerEventDispatcher$RefreshActionCallBackAbility = (ContainerEventDispatcher$RefreshActionCallBackAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ContainerEventDispatcher$RefreshActionCallBackAbility.class, null)) != null) {
            containerEventDispatcher$RefreshActionCallBackAbility.X0("header_post_review_success");
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean zLJFF;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        super.onViewCreated(view);
        PoiListApi.PoiDetailResponse poiDetailResponse2 = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            if (!SlashComponentUIPreloadExp.LIZ("poi_head_info") && !SlashComponentUIPreloadExp.LIZ("travel_head_info")) {
                viewGroup2 = (ViewGroup) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), Jo(), viewGroup, true).findViewById(R.id.r33);
            } else {
                viewGroup2 = (ViewGroup) C1181430gqj.LIZIZ(viewGroup.getContext(), Jo(), viewGroup, true).findViewById(R.id.r33);
            }
            C21415018rM c21415018rM = (C21415018rM) viewGroup2.findViewById(R.id.r4z);
            C1184460gvc c1184460gvcOo = Oo();
            if (c1184460gvcOo != null && (poiDetailResponse = c1184460gvcOo.LLILLJJLI) != null) {
                zLJFF = Intrinsics.LJFF(poiDetailResponse.getDataFromAnchor(), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            String strLIZIZ = C1174860gg8.LIZIZ(this);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            C1192290h8F.LIZ(this, strLIZIZ, "poi_head_info", zLJFF, null, viewGroup, 8);
            C1192290h8F.LIZJ(this, new AwS70S0210000_18(zLJFF, c21415018rM, this, 9));
            C1184460gvc c1184460gvcOo2 = Oo();
            if (c1184460gvcOo2 != null) {
                poiDetailResponse2 = c1184460gvcOo2.LLILLJJLI;
            }
            Gp(viewGroup2, poiDetailResponse2);
        }
        C622680Oba.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onWriteReviewEvent(C1186690gzD c1186690gzD) {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        long jLongValue;
        if (!Intrinsics.LJFF(c1186690gzD.LIZ, cp().LL)) {
            return;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse = this.LLJJIII;
        PoiListApi.PoiDetailResponse poiDetailResponseCopy = null;
        if (poiDetailResponse != null && (poiReviewSummaryModel = poiDetailResponse.getPoiReviewSummaryModel()) != null) {
            Long l = poiReviewSummaryModel.totalCount;
            long jLongValue2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue + 1 > 0) {
                Long l2 = poiReviewSummaryModel.totalCount;
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                }
                jLongValue2++;
            }
            poiDetailResponseCopy = poiDetailResponse.copy(poiDetailResponse.name, poiDetailResponse.address, poiDetailResponse.cover, poiDetailResponse.pictureAlbum, poiDetailResponse.isCollected, poiDetailResponse.collectInfo, poiDetailResponse.poiInfoSource, poiDetailResponse.cityCode, poiDetailResponse.regionCode, poiDetailResponse.typeLevel, poiDetailResponse.fatherPoi, poiDetailResponse.storeInfo, poiDetailResponse.tags, poiDetailResponse.poiHighlightTagModule, poiDetailResponse.poiTopTags, poiDetailResponse.poiDetailTagStyleMap, poiDetailResponse.ownerInfo, poiDetailResponse.poiLocation, poiDetailResponse.distanceInfo, poiDetailResponse.phoneInfo, poiDetailResponse.editPoiStatus, poiDetailResponse.dynamicMapParams, poiDetailResponse.claimStoreStatus, poiDetailResponse.reportInfo, poiDetailResponse.isBaAccount, poiDetailResponse.categoryName, poiDetailResponse.averagePrice, poiDetailResponse.followOwnerStatus, poiDetailResponse.shareInfo, poiReviewSummaryModel.copy(Long.valueOf(jLongValue2), poiReviewSummaryModel.score, poiReviewSummaryModel.maxScore, poiReviewSummaryModel.scoreBreakdown, poiReviewSummaryModel.source, poiReviewSummaryModel.brandName, poiReviewSummaryModel.externalUrl, poiReviewSummaryModel.brandLogo, poiReviewSummaryModel.darkModeBrandLogo, poiReviewSummaryModel.trackInfo, poiReviewSummaryModel.displayType, poiReviewSummaryModel.eligibleExtraInfo, poiReviewSummaryModel.noRating, poiReviewSummaryModel.reviewSummaryAuthors, poiReviewSummaryModel.totalCountDisplay, poiReviewSummaryModel.scoreRangeDisplay), poiDetailResponse.realFavoriteCnt, poiDetailResponse.bookingInfo, poiDetailResponse.poiShopBookingInfoList, poiDetailResponse.haveRegionDiscovery, poiDetailResponse.haveBackgroundTopMap, poiDetailResponse.poiThirdPartyKeyInfo, poiDetailResponse.haveProductShelf, poiDetailResponse.bannerListInfo, poiDetailResponse.headerCoverImage, poiDetailResponse.poiIntro, poiDetailResponse.showHelpCenter, poiDetailResponse.helpCenterUrl, poiDetailResponse.userLocation, poiDetailResponse.chartTag, poiDetailResponse.intentButtonConfig, poiDetailResponse.cleanModeHeaderConfig, poiDetailResponse.isSemiClosedLoopHotel, poiDetailResponse.provinceCode, poiDetailResponse.ttTypeCode, poiDetailResponse.geoNameIds, poiDetailResponse.ttTypeNameSuper, poiDetailResponse.cityPoiName, poiDetailResponse.cityPoiId, poiDetailResponse.cityName, poiDetailResponse.ttTypeNameMedium, poiDetailResponse.countryCode, poiDetailResponse.ttTypeNameTiny, poiDetailResponse.poiStyleConfig, poiDetailResponse.mergedTagsList, poiDetailResponse.aiSummary, poiDetailResponse.isProductVisible, poiDetailResponse.trustTags, poiDetailResponse.highLightCategoryName, poiDetailResponse.poiHeadButtonGroup, poiDetailResponse.showBottomBarWhenDisappear, poiDetailResponse.poiDetailPageOpt, poiDetailResponse.noNeedEmptyFeed, poiDetailResponse.poiReviewEntrance, poiDetailResponse.yearForDisplay, poiDetailResponse.LL, poiDetailResponse.LLILLJJLI);
        }
        yp(poiDetailResponseCopy);
    }

    public boolean op(PoiListApi.PoiDetailResponse poiDetailResponse) {
        if (poiDetailResponse != null && poiDetailResponse.getPoiReviewSummaryModel() != null && poiDetailResponse.getPoiHighlightTagModule() != null) {
            return true;
        }
        return false;
    }

    public boolean sp(PoiListApi.PoiDetailResponse poiDetailResponse) {
        List<PoiHeadMergedTag> mergedTagsList;
        if (poiDetailResponse == null || (mergedTagsList = poiDetailResponse.getMergedTagsList()) == null || !(!mergedTagsList.isEmpty()) || poiDetailResponse.getPoiHighlightTagModule() != null) {
            return false;
        }
        return true;
    }

    public void tp(View view) {
        View viewFindViewById = view.findViewById(R.id.jsp);
        View viewFindViewById2 = view.findViewById(R.id.doq);
        View viewFindViewById3 = view.findViewById(R.id.jo4);
        if (viewFindViewById.getVisibility() == 8 && viewFindViewById2.getVisibility() == 8) {
            C1189060h32.LJJII(viewFindViewById3, null, 0, null, null);
        } else {
            C1189060h32.LJJII(viewFindViewById3, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null);
        }
    }

    public void yp(PoiListApi.PoiDetailResponse poiDetailResponse) {
        String str;
        String str2;
        String str3;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1184480gve c1184480gve3;
        C1184480gve c1184480gve4;
        View viewFindViewById = LJJIJL().findViewById(R.id.r33);
        String str4 = cp().LL;
        C1184460gvc c1184460gvcOo = Oo();
        String str5 = null;
        if (c1184460gvcOo != null && (c1184480gve4 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve4.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = Oo();
        if (c1184460gvcOo2 != null && (c1184480gve3 = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve3.LL;
        } else {
            str2 = null;
        }
        Wp(viewFindViewById, poiDetailResponse, str4, str, str2);
        View viewFindViewById2 = LJJIJL().findViewById(R.id.r33);
        String str6 = cp().LL;
        C1184460gvc c1184460gvcOo3 = Oo();
        if (c1184460gvcOo3 != null && (c1184480gve2 = c1184460gvcOo3.LLILLL) != null) {
            str3 = c1184480gve2.LLILLJJLI;
        } else {
            str3 = null;
        }
        C1184460gvc c1184460gvcOo4 = Oo();
        if (c1184460gvcOo4 != null && (c1184480gve = c1184460gvcOo4.LLILLL) != null) {
            str5 = c1184480gve.LL;
        }
        Xp(viewFindViewById2, poiDetailResponse, str6, str3, str5);
    }

    public void Bp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        String address;
        boolean z;
        DistanceInfo distanceInfo;
        String name;
        if (((Number) C280190AyX.LIZ.getValue()).intValue() != 1 || poiDetailResponse == null) {
            return;
        }
        if (Intrinsics.LJFF(poiDetailResponse.getPoiInfoSource(), "google")) {
            C337180DJs.LIZJ(view.findViewById(R.id.qw1));
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJI;
        if (poiDetailResponse2 != null) {
            address = poiDetailResponse2.getAddress();
        } else {
            address = null;
        }
        if (Intrinsics.LJFF(address, poiDetailResponse.getAddress())) {
            PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LLJJI;
            if (poiDetailResponse3 != null) {
                distanceInfo = poiDetailResponse3.getDistanceInfo();
            } else {
                distanceInfo = null;
            }
            if (Intrinsics.LJFF(distanceInfo, poiDetailResponse.getDistanceInfo())) {
                PoiListApi.PoiDetailResponse poiDetailResponse4 = this.LLJJI;
                if (poiDetailResponse4 != null) {
                    name = poiDetailResponse4.getName();
                } else {
                    name = null;
                }
                if (Intrinsics.LJFF(name, poiDetailResponse.getName())) {
                    return;
                }
            }
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.qvy);
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_address_bg", null);
        c1180600gpO.LIZLLL = new C1202680hP0(cp().LL, null, null, null, null, 30);
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = view.getContext();
        c1186070gyD.getClass();
        C1189360h3W c1189360h3WLIZIZ = c1180600gpO.LIZIZ(C1186070gyD.LIZ(context));
        EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER_CROP;
        C1331670kl3 c1331670kl3 = c1189360h3WLIZIZ.LIZ;
        c1331670kl3.LJJ = enumC1338240kve;
        c1331670kl3.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3.LJJI(imageView);
        c1189360h3WLIZIZ.LIZ(imageView);
        c1189360h3WLIZIZ.LIZ.LJIIJJI();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        if (C1184910gwL.LIZJ() == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1189060h32.LJJII(view.findViewById(R.id.qw4), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        } else {
            C1189060h32.LJJII(view.findViewById(R.id.qw4), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        }
        if (view.findViewById(R.id.r1y).getVisibility() == 0) {
            C1189060h32.LJJII(view.findViewById(R.id.qw4), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        }
        View viewFindViewById = view.findViewById(R.id.po4);
        View viewFindViewById2 = view.findViewById(R.id.pof);
        if (viewFindViewById.getVisibility() == 0 || viewFindViewById2.getVisibility() == 0) {
            C1189060h32.LJJII(viewFindViewById, null, null, null, 0);
        }
        TextView textView = (TextView) view.findViewById(R.id.r1x);
        if (textView.getVisibility() == 0) {
            textView.setMaxLines(2);
        }
        View viewFindViewById3 = view.findViewById(R.id.r4n);
        View viewFindViewById4 = view.findViewById(R.id.rdx);
        if (C1184910gwL.LIZJ() == 4) {
            C1189060h32.LJJII(viewFindViewById3, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
            C1189060h32.LJJII(viewFindViewById4, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        } else {
            C1189060h32.LJJII(viewFindViewById3, null, 0, null, null);
            C1189060h32.LJJII(viewFindViewById4, null, 0, null, null);
        }
    }

    public final void Ep(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.r2_);
        C19ME c19me = null;
        if (poiDetailResponse != null && poiDetailResponse.getIntentButtonConfig() != null && Ho(poiDetailResponse)) {
            View viewFindViewById = view.findViewById(R.id.r52);
            C21415018rM c21415018rM = (C21415018rM) view.findViewById(R.id.r4z);
            View viewFindViewById2 = view.findViewById(R.id.jsp);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof C19ME) {
                c19me = (C19ME) layoutParams;
            }
            Layout textLayout = c21415018rM.getTextLayout();
            if ((textLayout == null || textLayout.getLineCount() <= 1) && viewFindViewById2.getVisibility() != 0) {
                if (c19me != null) {
                    c19me.topToTop = viewFindViewById.getId();
                    c19me.bottomToBottom = viewFindViewById.getId();
                }
            } else if (c19me != null) {
                c19me.topToTop = viewFindViewById.getId();
                c19me.bottomToBottom = -1;
            }
            C786410Ut5.X5(c19me, viewGroup);
            C337180DJs.LIZJ(viewGroup);
            C723850SaN.LIZLLL(this, new AwS384S0200000_18(this, poiDetailResponse, 294));
            return;
        }
        C723850SaN.LJII(this, C13LE.LIZ(PoiCircleFavoriteButtonAssem.class), null);
        C339190DRl.LIZIZ(viewGroup);
    }

    public void Gp(ViewGroup viewGroup, PoiListApi.PoiDetailResponse poiDetailResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String collectInfo;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String collectInfo2;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1184480gve c1184480gve3;
        C1184480gve c1184480gve4;
        C1184480gve c1184480gve5;
        C1184480gve c1184480gve6;
        C1184480gve c1184480gve7;
        C1184480gve c1184480gve8;
        C1184480gve c1184480gve9;
        C1184480gve c1184480gve10;
        C1184480gve c1184480gve11;
        C1184480gve c1184480gve12;
        C1184480gve c1184480gve13;
        C1184480gve c1184480gve14;
        if (Intrinsics.LJFF(this.LLJJI, poiDetailResponse)) {
            return;
        }
        this.LLJJJ = false;
        C1184480gve c1184480gve15 = null;
        C19748612Om.LIZ(viewGroup, null);
        Up(viewGroup, poiDetailResponse);
        Vp(viewGroup, poiDetailResponse, cp().LL);
        Fp(viewGroup);
        fq(viewGroup, poiDetailResponse);
        String str15 = cp().LL;
        C1184460gvc c1184460gvcOo = Oo();
        if (c1184460gvcOo != null && (c1184480gve14 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve14.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = Oo();
        if (c1184460gvcOo2 != null && (c1184480gve13 = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve13.LL;
        } else {
            str2 = null;
        }
        Wp(viewGroup, poiDetailResponse, str15, str, str2);
        String str16 = cp().LL;
        C1200940hMC c1200940hMC = C1200940hMC.LIZ;
        Context context = viewGroup.getContext();
        c1200940hMC.getClass();
        boolean zLIZIZ = C1200940hMC.LIZIZ(context);
        C1184460gvc c1184460gvcOo3 = Oo();
        if (c1184460gvcOo3 != null && (c1184480gve12 = c1184460gvcOo3.LLILLL) != null) {
            str3 = c1184480gve12.LLIZLLLIL;
        } else {
            str3 = null;
        }
        C1184460gvc c1184460gvcOo4 = Oo();
        if (c1184460gvcOo4 != null && (c1184480gve11 = c1184460gvcOo4.LLILLL) != null) {
            str4 = c1184480gve11.LLJ;
        } else {
            str4 = null;
        }
        C1184460gvc c1184460gvcOo5 = Oo();
        if (c1184460gvcOo5 != null && (c1184480gve10 = c1184460gvcOo5.LLILLL) != null) {
            str5 = c1184480gve10.LLJI;
        } else {
            str5 = null;
        }
        C1184460gvc c1184460gvcOo6 = Oo();
        if (c1184460gvcOo6 != null && (c1184480gve9 = c1184460gvcOo6.LLILLL) != null) {
            str6 = c1184480gve9.LLILLJJLI;
        } else {
            str6 = null;
        }
        C1184460gvc c1184460gvcOo7 = Oo();
        if (c1184460gvcOo7 != null && (c1184480gve8 = c1184460gvcOo7.LLILLL) != null) {
            str7 = c1184480gve8.LL;
        } else {
            str7 = null;
        }
        if (poiDetailResponse != null) {
            collectInfo = poiDetailResponse.getCollectInfo();
        } else {
            collectInfo = null;
        }
        dq(viewGroup, str16, zLIZIZ, poiDetailResponse, str3, str4, str5, str6, str7, collectInfo);
        String str17 = cp().LL;
        C1184460gvc c1184460gvcOo8 = Oo();
        if (c1184460gvcOo8 != null && (c1184480gve7 = c1184460gvcOo8.LLILLL) != null) {
            str8 = c1184480gve7.LLILLJJLI;
        } else {
            str8 = null;
        }
        C1184460gvc c1184460gvcOo9 = Oo();
        if (c1184460gvcOo9 != null && (c1184480gve6 = c1184460gvcOo9.LLILLL) != null) {
            str9 = c1184480gve6.LL;
        } else {
            str9 = null;
        }
        Xp(viewGroup, poiDetailResponse, str17, str8, str9);
        String str18 = cp().LL;
        boolean zLIZIZ2 = C1200940hMC.LIZIZ(viewGroup.getContext());
        C1184460gvc c1184460gvcOo10 = Oo();
        if (c1184460gvcOo10 != null && (c1184480gve5 = c1184460gvcOo10.LLILLL) != null) {
            str10 = c1184480gve5.LLIZLLLIL;
        } else {
            str10 = null;
        }
        C1184460gvc c1184460gvcOo11 = Oo();
        if (c1184460gvcOo11 != null && (c1184480gve4 = c1184460gvcOo11.LLILLL) != null) {
            str11 = c1184480gve4.LLJ;
        } else {
            str11 = null;
        }
        C1184460gvc c1184460gvcOo12 = Oo();
        if (c1184460gvcOo12 != null && (c1184480gve3 = c1184460gvcOo12.LLILLL) != null) {
            str12 = c1184480gve3.LLJI;
        } else {
            str12 = null;
        }
        C1184460gvc c1184460gvcOo13 = Oo();
        if (c1184460gvcOo13 != null && (c1184480gve2 = c1184460gvcOo13.LLILLL) != null) {
            str13 = c1184480gve2.LLILLJJLI;
        } else {
            str13 = null;
        }
        C1184460gvc c1184460gvcOo14 = Oo();
        if (c1184460gvcOo14 != null && (c1184480gve = c1184460gvcOo14.LLILLL) != null) {
            str14 = c1184480gve.LL;
        } else {
            str14 = null;
        }
        if (poiDetailResponse != null) {
            collectInfo2 = poiDetailResponse.getCollectInfo();
        } else {
            collectInfo2 = null;
        }
        Qp(viewGroup, str18, zLIZIZ2, poiDetailResponse, str10, str11, str12, str13, str14, collectInfo2);
        zp(viewGroup, poiDetailResponse);
        Jp(viewGroup, poiDetailResponse, cp().LL);
        String str19 = cp().LL;
        C1184460gvc c1184460gvcOo15 = Oo();
        if (c1184460gvcOo15 != null) {
            c1184480gve15 = c1184460gvcOo15.LLILLL;
        }
        Ap(viewGroup, str19, poiDetailResponse, c1184480gve15);
        Tp(viewGroup, poiDetailResponse);
        Bp(viewGroup, poiDetailResponse);
        Ep(viewGroup, poiDetailResponse);
        aq(viewGroup, poiDetailResponse);
        Ip(viewGroup, poiDetailResponse);
        tp(viewGroup);
        this.LLJJI = poiDetailResponse;
    }

    public final void Ip(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        PoiHeaderButtonGroup poiHeadButtonGroup;
        List<PoiButton> list;
        if (poiDetailResponse != null && (poiHeadButtonGroup = poiDetailResponse.getPoiHeadButtonGroup()) != null && (list = poiHeadButtonGroup.buttonList) != null && !list.isEmpty()) {
            C723850SaN.LJII(this, C13LE.LIZ(PoiDetailHeaderDynamicButtonAssem.class), null);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.jiz);
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            C723850SaN.LIZLLL(this, new AwS368S0200000_2(this, poiDetailResponse, 53));
        }
    }

    public void Tp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        ChartInfo chartTag;
        View viewFindViewById = view.findViewById(R.id.doo);
        View viewFindViewById2 = view.findViewById(R.id.doq);
        viewFindViewById.setTag(1706771800, "pick_entrance");
        viewFindViewById2.setTag(1706771800, "pick_entrance");
        if (poiDetailResponse != null && (chartTag = poiDetailResponse.getChartTag()) != null && !sp(poiDetailResponse)) {
            if (op(poiDetailResponse)) {
                C337180DJs.LIZJ(viewFindViewById2);
                C339190DRl.LIZIZ(viewFindViewById);
                viewFindViewById = viewFindViewById2;
            } else {
                C337180DJs.LIZJ(viewFindViewById);
                C339190DRl.LIZIZ(viewFindViewById2);
            }
            C1189060h32.LJJIIJ(viewFindViewById, new AwS227S0300000_18(this, poiDetailResponse, chartTag, 24));
            C786410Ut5.LJLLLLLL(0, viewFindViewById.findViewById(R.id.dov));
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById.findViewById(R.id.dou);
            tuxTextView.setText(chartTag.chartTopicName);
            tuxTextView.setTuxFont(62);
            C2211631BhB.LJ(viewFindViewById, new AwS115S0400000_18(viewFindViewById, this, poiDetailResponse, chartTag, 5));
            return;
        }
        C339190DRl.LIZIZ(viewFindViewById);
        C339190DRl.LIZIZ(viewFindViewById2);
    }

    public void Up(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        boolean z;
        UrlModel cover;
        UrlModel cover2;
        int iIntValue;
        List<UrlModel> picturesByExperiment;
        Integer numLIZJ;
        PictureAlbum pictureAlbum;
        PictureAlbum pictureAlbum2;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.r3e);
        TextView textView = (TextView) view.findViewById(R.id.r3f);
        View viewFindViewById = view.findViewById(R.id.jk8);
        int i = 0;
        if (poiDetailResponse != null && poiDetailResponse.isHeaderAlbumMode()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (viewFindViewById != null) {
                C337180DJs.LIZJ(viewFindViewById);
            }
            view.setPadding(view.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), view.getPaddingRight(), view.getPaddingBottom());
        } else {
            if (viewFindViewById != null) {
                C339190DRl.LIZIZ(viewFindViewById);
            }
            view.setPadding(view.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), view.getPaddingRight(), view.getPaddingBottom());
        }
        if (poiDetailResponse != null && poiDetailResponse.showPoiSmallPic()) {
            PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJI;
            if (poiDetailResponse2 != null) {
                cover = poiDetailResponse2.getCover();
            } else {
                cover = null;
            }
            if (poiDetailResponse != null) {
                cover2 = poiDetailResponse.getCover();
            } else {
                cover2 = null;
            }
            if (Intrinsics.LJFF(cover, cover2)) {
                PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LLJJI;
                if (poiDetailResponse3 != null) {
                    pictureAlbum = poiDetailResponse3.getPictureAlbum();
                } else {
                    pictureAlbum = null;
                }
                if (poiDetailResponse != null) {
                    pictureAlbum2 = poiDetailResponse.getPictureAlbum();
                } else {
                    pictureAlbum2 = null;
                }
                if (Intrinsics.LJFF(pictureAlbum, pictureAlbum2)) {
                    return;
                }
            }
            if (smartImageView != null) {
                C337180DJs.LIZJ(smartImageView);
            }
            int iSo = (int) So();
            smartImageView.setTag(1706771800, "head_pic");
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c1331750klB.LIZJ = iIntValue;
            c1331750klB.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            C1180060goW.LJIIJJI(smartImageView, iSo);
            C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_header_img", new C1180560gpK(getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(8))), null));
            c1180600gpO.LIZLLL = new C1202680hP0(cp().LL, null, null, null, null, 30);
            C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(poiDetailResponse.getCover()));
            c1189360h3WLIZ.LJI(iSo, iSo);
            c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
            c1189360h3WLIZ.LIZLLL(smartImageView);
            c1189360h3WLIZ.LIZ.LIZLLL("poi_detail_header_img");
            c1189360h3WLIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1189360h3WLIZ.LIZIZ();
            up(poiDetailResponse);
            PictureAlbum pictureAlbum3 = poiDetailResponse.getPictureAlbum();
            if (pictureAlbum3 != null && (picturesByExperiment = pictureAlbum3.getPicturesByExperiment()) != null && picturesByExperiment.size() > 1) {
                if (textView != null) {
                    C337180DJs.LIZJ(textView);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zg, view.getContext());
                    c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                    textView.setBackground(c384050F3z.LIZ(view.getContext()));
                    PictureAlbum pictureAlbum4 = poiDetailResponse.getPictureAlbum();
                    if (pictureAlbum4 != null) {
                        i = pictureAlbum4.totalPictureNum;
                    }
                    textView.setText(String.valueOf(i));
                }
            } else if (textView != null) {
                C339190DRl.LIZIZ(textView);
            }
            C786410Ut5.I7(new AkS28S0300000_18(smartImageView, this, poiDetailResponse, 8), smartImageView);
            C2211631BhB.LJ(smartImageView, new AwS227S0300000_18(smartImageView, this, poiDetailResponse, 25));
            return;
        }
        if (smartImageView != null) {
            C339190DRl.LIZIZ(smartImageView);
        }
        if (textView != null) {
            C339190DRl.LIZIZ(textView);
        }
    }

    public int Vo(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        int marginStart;
        View viewFindViewById = view.findViewById(R.id.r3e);
        int marginEnd = 0;
        if (poiDetailResponse == null || !poiDetailResponse.showPoiSmallPic()) {
            return 0;
        }
        int iSo = (int) So();
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        int i = iSo + marginStart;
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
        }
        return i + marginEnd;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aq(android.view.View r15, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r16) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem.aq(android.view.View, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):void");
    }

    public void fq(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        PoiDetailTag next;
        String str;
        C19M4 c19m4 = (C19M4) view.findViewById(R.id.jsp);
        if (iq(poiDetailResponse)) {
            C339190DRl.LIZIZ(c19m4);
            return;
        }
        if (poiDetailResponse != null && op(poiDetailResponse)) {
            List<PoiDetailTag> poiTopTags = poiDetailResponse.getPoiTopTags();
            PoiDetailTagStyle poiDetailTagStyle = null;
            if (poiTopTags != null) {
                Iterator<PoiDetailTag> it2 = poiTopTags.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.tagType == EnumC1179480gna.POI_DETAIL_TAG_TYPE_HOTEL_RATING.getValue()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PoiDetailTag poiDetailTag = next;
                if (poiDetailTag != null) {
                    C337180DJs.LIZJ(c19m4);
                    C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                    String strValueOf = String.valueOf(poiDetailTag.tagType);
                    String strMobPicMode = poiDetailResponse.mobPicMode();
                    PageFinder pageFinderZo = Zo();
                    c1185430gxB.getClass();
                    C1185430gxB.LJJJ(interfaceC665370Q7zLJIIL, false, null, strValueOf, strMobPicMode, "hotel_stars", pageFinderZo, null);
                    PoiDetailTagContent poiDetailTagContent = poiDetailTag.tagContent;
                    if (poiDetailTagContent != null) {
                        str = poiDetailTagContent.commonText;
                    } else {
                        str = null;
                    }
                    c19m4.setText(str);
                    C1179140gn2 c1179140gn2 = PoiTagCell.LLILLJJLI;
                    Context context = view.getContext();
                    Map<String, PoiDetailTagStyle> poiDetailTagStyleMap = poiDetailResponse.getPoiDetailTagStyleMap();
                    if (poiDetailTagStyleMap != null) {
                        poiDetailTagStyle = poiDetailTagStyleMap.get(String.valueOf(poiDetailTag.tagStyle));
                    }
                    C1179140gn2.LIZIZ(c1179140gn2, context, c19m4, poiDetailTagStyle, null, null, 24);
                    return;
                }
            }
            C339190DRl.LIZIZ(c19m4);
            return;
        }
        C339190DRl.LIZIZ(c19m4);
    }

    public void zp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        PoiHeadAiSummary aiSummary;
        C1180760gpe c1180760gpe = (C1180760gpe) view.findViewById(R.id.qw8);
        C339190DRl.LIZIZ(c1180760gpe);
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (poiDetailResponse != null && (aiSummary = poiDetailResponse.getAiSummary()) != null) {
            String str = aiSummary.recommendationText;
            if (str != null && str.length() > 0 && 1 != 0) {
                C337180DJs.LIZJ(c1180760gpe);
                c1180760gpe.LIZ(aiSummary);
                C337180DJs.LIZJ(view.findViewById(R.id.r1y));
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                String str2 = aiSummary.dimensionKey;
                PageFinder pageFinderZo = Zo();
                c1185430gxB.getClass();
                C1185430gxB.LJI(pageFinderZo, interfaceC665370Q7zLJIIL, null, str2);
            } else {
                C339190DRl.LIZIZ(c1180760gpe);
            }
            if (!Intrinsics.LJFF(aiSummary.clickEnable, Boolean.FALSE)) {
                if (c1180760gpe != null) {
                    C786410Ut5.I7(new AkS1S0600000_18(this, context, view, poiDetailResponse, c1180760gpe, aiSummary, 0), c1180760gpe);
                    return;
                }
                return;
            } else {
                if (c1180760gpe == null) {
                    return;
                }
                C786410Ut5.ia(c1180760gpe);
                c1180760gpe.setClickable(false);
                return;
            }
        }
        C339190DRl.LIZIZ(c1180760gpe);
    }

    public void Jp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str) {
        PhoneInfo phoneInfo;
        String address;
        Object c098200Yq;
        View viewFindViewById = view.findViewById(R.id.r4n);
        View viewFindViewById2 = view.findViewById(R.id.rdx);
        viewFindViewById2.setTag(1706771800, "phone_number");
        if (poiDetailResponse != null) {
            phoneInfo = poiDetailResponse.getPhoneInfo();
        } else {
            phoneInfo = null;
        }
        if (phoneInfo != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            C2211631BhB.LJ(viewFindViewById2, new AwS227S0300000_18(viewFindViewById2, this, poiDetailResponse, 23));
            try {
                c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C786410Ut5.I7(new AkS9S0400000_18(this, phoneInfo, poiDetailResponse, (C1185410gx9) c098200Yq, 2), viewFindViewById2);
            C427690Gpr.LJI(viewFindViewById2, null);
        } else {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        if (poiDetailResponse != null) {
            address = poiDetailResponse.getAddress();
        } else {
            address = null;
        }
        if (C703302op.LIZ(address)) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C786410Ut5.I7(new AkS6S1200000_18(this, str, poiDetailResponse, 2), viewFindViewById);
            C427690Gpr.LJI(viewFindViewById, null);
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
    }

    public final Layout Lo(Context context, CharSequence charSequence, int i) {
        C1184980gwS c1184980gwS;
        if (mp()) {
            c1184980gwS = new C1184980gwS(20, 20, 20, 15, 15);
        } else {
            C1184970gwR c1184970gwR = C1184910gwL.LIZIZ;
            c1184980gwS = new C1184980gwS(c1184970gwR.LIZ, c1184970gwR.LIZIZ, c1184970gwR.LIZJ, c1184970gwR.LIZLLL, c1184970gwR.LJ);
        }
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILIIL(charSequence);
        C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
        c444840HcQ.LJ = i;
        c444840HcQ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        c444830HcP.LJII(13);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            c444830HcP.LJIILJJIL(numLIZJ.intValue());
        }
        Layout layoutLIZ = C424890GlL.LIZ(1, c1184980gwS.LIZIZ, c1184980gwS.LIZ, c444830HcP);
        if (layoutLIZ == null && (layoutLIZ = C424890GlL.LIZ(2, c1184980gwS.LIZLLL, c1184980gwS.LIZJ, c444830HcP)) == null) {
            return C444830HcP.LIZJ(c444830HcP, 0.0f, false, Collections.singletonList(new Pair(Integer.valueOf(c1184980gwS.LJ), Integer.valueOf(c1184980gwS.LJ))), 27);
        }
        return layoutLIZ;
    }

    public void Vp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str) {
        String name;
        String name2;
        String name3;
        C21415018rM c21415018rM;
        Context context;
        Integer numValueOf;
        boolean z;
        int marginStart;
        int marginEnd;
        int iIntValue;
        int i;
        int iLIZIZ;
        PoiDetailTag poiDetailTag;
        String str2;
        PoiDetailTagStyle poiDetailTagStyle;
        Integer numValueOf2;
        PoiDetailTagContent poiDetailTagContent;
        PoiDetailTag next;
        int marginStart2;
        int marginEnd2;
        int iIntValue2;
        C1184480gve c1184480gve;
        View view2;
        int marginStart3;
        int marginEnd3;
        this.LLJILJIL = false;
        int iVo = Vo(view, poiDetailResponse);
        PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJI;
        String string = null;
        if (poiDetailResponse2 != null) {
            name = poiDetailResponse2.getName();
        } else {
            name = null;
        }
        if (poiDetailResponse != null) {
            name2 = poiDetailResponse.getName();
        } else {
            name2 = null;
        }
        if ((Intrinsics.LJFF(name, name2) && Vo(view, this.LLJJI) == iVo && !iq(poiDetailResponse) && !Ho(poiDetailResponse)) || poiDetailResponse == null || (name3 = poiDetailResponse.getName()) == null || name3.length() == 0 || (c21415018rM = (C21415018rM) view.findViewById(R.id.r4z)) == null || (context = getContext()) == null) {
            return;
        }
        Object parent = c21415018rM.getParent();
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart3 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart3 = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd3 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            } else {
                marginEnd3 = 0;
            }
            numValueOf = Integer.valueOf(marginStart3 + marginEnd3);
        } else {
            numValueOf = null;
        }
        C1184460gvc c1184460gvcOo = Oo();
        if (c1184460gvcOo != null && (c1184480gve = c1184460gvcOo.LLILLL) != null && c1184480gve.LLJJIII) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams3 = c21415018rM.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
            } else {
                marginStart2 = 0;
            }
            ViewGroup.LayoutParams layoutParams4 = c21415018rM.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
            } else {
                marginEnd2 = 0;
            }
            int i2 = marginStart2 + marginEnd2;
            if (numValueOf != null) {
                iIntValue2 = numValueOf.intValue();
            } else {
                iIntValue2 = 0;
            }
            i = i2 + iIntValue2;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
        } else {
            ViewGroup.LayoutParams layoutParams5 = c21415018rM.getLayoutParams();
            if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart();
            } else {
                marginStart = 0;
            }
            ViewGroup.LayoutParams layoutParams6 = c21415018rM.getLayoutParams();
            if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            int i3 = marginStart + marginEnd;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            i = i3 + iIntValue;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        }
        int iLIZIZ2 = i + iLIZIZ;
        if (Ho(poiDetailResponse)) {
            iLIZIZ2 += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        }
        int paddingStart = view.getPaddingStart() + view.getPaddingEnd();
        if (iq(poiDetailResponse)) {
            Context context2 = getContext();
            if (context2 != null) {
                List<PoiDetailTag> poiTopTags = poiDetailResponse.getPoiTopTags();
                if (poiTopTags != null) {
                    Iterator<PoiDetailTag> it2 = poiTopTags.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.tagType == EnumC1179480gna.POI_DETAIL_TAG_TYPE_HOTEL_RATING.getValue()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    poiDetailTag = next;
                } else {
                    poiDetailTag = null;
                }
                C19M4 c19m4 = new C19M4(context2, null, 6);
                c19m4.setTuxFont(61);
                if (poiDetailTag != null && (poiDetailTagContent = poiDetailTag.tagContent) != null) {
                    str2 = poiDetailTagContent.commonText;
                } else {
                    str2 = null;
                }
                c19m4.setText(str2);
                C1179140gn2 c1179140gn2 = PoiTagCell.LLILLJJLI;
                Map<String, PoiDetailTagStyle> poiDetailTagStyleMap = poiDetailResponse.getPoiDetailTagStyleMap();
                if (poiDetailTagStyleMap != null) {
                    if (poiDetailTag != null) {
                        numValueOf2 = Integer.valueOf(poiDetailTag.tagStyle);
                    } else {
                        numValueOf2 = null;
                    }
                    poiDetailTagStyle = poiDetailTagStyleMap.get(String.valueOf(numValueOf2));
                } else {
                    poiDetailTagStyle = null;
                }
                C1179140gn2.LIZIZ(c1179140gn2, context2, c19m4, poiDetailTagStyle, null, null, 24);
                new FrameLayout(context2).addView(c19m4);
                c19m4.measure(View.MeasureSpec.makeMeasureSpec(C418440Gaw.LIZLLL(context2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                c19m4.layout(0, 0, c19m4.getMeasuredWidth(), c19m4.getMeasuredHeight());
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c19m4.getWidth(), c19m4.getHeight(), Bitmap.Config.ARGB_8888);
                c19m4.draw(new Canvas(bitmapCreateBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context2.getResources(), bitmapCreateBitmap);
                bitmapDrawable.setBounds(0, 0, c19m4.getWidth(), c19m4.getHeight());
                SpannableString spannableStringNo = No(context2, bitmapDrawable, poiDetailResponse.getName(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                int iLIZLLL = ((C418440Gaw.LIZLLL(context) - iVo) - iLIZIZ2) - paddingStart;
                Layout layoutLo = Lo(context, spannableStringNo, iLIZLLL);
                if (layoutLo.getLineCount() > 1) {
                    int lineCount = layoutLo.getLineCount() - 1;
                    if (Intrinsics.LJFF(spannableStringNo.subSequence(layoutLo.getLineStart(lineCount), layoutLo.getLineEnd(lineCount)).toString(), "[poi_image]")) {
                        this.LLJILJIL = true;
                        layoutLo = Lo(context, poiDetailResponse.getName(), iLIZLLL);
                    }
                }
                c21415018rM.setTextLayout(layoutLo);
                this.LLJJJJ.invoke(c21415018rM, poiDetailResponse.getName(), str, Boolean.FALSE);
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                if (poiDetailTag != null) {
                    string = Integer.valueOf(poiDetailTag.tagType).toString();
                }
                String strMobPicMode = poiDetailResponse.mobPicMode();
                PageFinder pageFinderZo = Zo();
                c1185430gxB.getClass();
                C1185430gxB.LJJJ(interfaceC665370Q7zLJIIL, false, null, string, strMobPicMode, "hotel_stars", pageFinderZo, null);
                return;
            }
            return;
        }
        if (C1184910gwL.LIZ()) {
            c21415018rM.setTextLayout(Lo(context, poiDetailResponse.getName(), ((C418440Gaw.LIZLLL(context) - iVo) - iLIZIZ2) - paddingStart));
            this.LLJJJJ.invoke(c21415018rM, poiDetailResponse.getName(), str, Boolean.FALSE);
            return;
        }
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILIIL(poiDetailResponse.getName());
        int iLIZLLL2 = ((C418440Gaw.LIZLLL(context) - iVo) - iLIZIZ2) - paddingStart;
        C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
        c444840HcQ.LJ = iLIZLLL2;
        c444840HcQ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        c444840HcQ.LJII = TextUtils.TruncateAt.END;
        c444830HcP.LJII(13);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            c444830HcP.LJIILJJIL(numLIZJ.intValue());
        }
        Layout layoutLIZJ = C444830HcP.LIZJ(c444830HcP, 0.0f, false, C1697810uHb.LJIIJJI(new Pair(26, 28), new Pair(20, 26)), 27);
        if (layoutLIZJ.getLineCount() > 2) {
            c444830HcP.LJIIIZ(2);
            c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.0f, false, C1697810uHb.LJIIJJI(new Pair(26, 28), new Pair(20, 20)), 27));
        } else {
            c21415018rM.setTextLayout(layoutLIZJ);
        }
        this.LLJJJJ.invoke(c21415018rM, poiDetailResponse.getName(), str, Boolean.FALSE);
    }

    public static SpannableString No(Context context, BitmapDrawable bitmapDrawable, String str, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("[poi_image]");
        sbLIZ.append("");
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        C419890GdH c419890GdH = new C419890GdH(bitmapDrawable, 2);
        c419890GdH.LIZIZ(i, 0, C1545540qK0.LIZIZ(context));
        int length = str.length();
        C786410Ut5.p2(spannableString, c419890GdH, length, length + 11, 33);
        return spannableString;
    }

    public void Ap(View view, String str, PoiListApi.PoiDetailResponse poiDetailResponse, C1184480gve c1184480gve) {
        int i;
        String str2;
        String str3;
        String str4;
        C1184480gve c1184480gve2;
        C1184480gve c1184480gve3;
        if (poiDetailResponse == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.qw4);
        String address = poiDetailResponse.getAddress();
        if (address == null) {
            C786410Ut5.LJLZ(8, viewGroup);
            return;
        }
        int i2 = 0;
        C786410Ut5.LJLZ(0, viewGroup);
        viewGroup.setTag(1706771800, "address_bar");
        TextView textView = (TextView) view.findViewById(R.id.qw6);
        textView.setText(address);
        if (C444960Hcc.LIZJ(textView.getContext())) {
            i = 4;
        } else {
            i = 3;
        }
        textView.setTextDirection(i);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.r1x);
        if (C290970Bap.LIZ() || C290960Bao.LIZ()) {
            tuxTextView.setMaxLines(2);
            tuxTextView.setMinTextSize(12.0f);
        }
        if (poiDetailResponse.getDistanceInfo() != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            DistanceInfo distanceInfo = poiDetailResponse.getDistanceInfo();
            if (distanceInfo != null) {
                str2 = distanceInfo.distanceText;
            } else {
                str2 = null;
            }
            tuxTextView.setText(str2);
            textView.setMaxLines(1);
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            String str5 = cp().LL;
            String collectInfo = poiDetailResponse.getCollectInfo();
            C1184460gvc c1184460gvcOo = Oo();
            if (c1184460gvcOo != null && (c1184480gve3 = c1184460gvcOo.LLILLL) != null) {
                str3 = c1184480gve3.LLILLJJLI;
            } else {
                str3 = null;
            }
            C1184460gvc c1184460gvcOo2 = Oo();
            if (c1184460gvcOo2 != null && (c1184480gve2 = c1184460gvcOo2.LLILLL) != null) {
                str4 = c1184480gve2.LL;
            } else {
                str4 = null;
            }
            DistanceInfo distanceInfo2 = poiDetailResponse.getDistanceInfo();
            if (distanceInfo2 != null) {
                i2 = distanceInfo2.distanceType;
            }
            Integer userLocation = poiDetailResponse.getUserLocation();
            PageFinder pageFinderZo = Zo();
            c1185430gxB.getClass();
            C1185430gxB.LJJJLL(interfaceC665370Q7zLJIIL, str5, collectInfo, str3, str4, i2, userLocation, pageFinderZo, null);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            textView.setMaxLines(2);
        }
        C1209070hZJ c1209070hZJ = this.LLJJJJ;
        C1367960lha.LIZ.getClass();
        c1209070hZJ.invoke(textView, C1367960lha.LIZ().LJLI(poiDetailResponse.getName(), address), str, Boolean.TRUE);
        AwS38S1400000_18 awS38S1400000_18 = new AwS38S1400000_18(this, str, poiDetailResponse, viewGroup, c1184480gve, 0);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 17), viewGroup);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 18), textView);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 19), tuxTextView);
        C427690Gpr.LJI(textView, null);
        C427690Gpr.LJI(tuxTextView, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        r3 = 0;
     */
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.IPoiTagAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DD(android.view.View r37, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r38, java.lang.String r39, java.lang.String r40) {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem.DD(android.view.View, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag, java.lang.String, java.lang.String):void");
    }

    public void Wp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str, String str2, String str3) {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        long jLongValue;
        boolean z;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String string;
        String strLIZIZ;
        int i2;
        String string2;
        Object c098200Yq;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        Long l;
        String collectInfo;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.rb4);
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTag(1706771800, "review_entrance");
        if (poiDetailResponse == null || poiDetailResponse.getPoiReviewSummaryModel() == null || op(poiDetailResponse)) {
            int i4 = 8;
            C786410Ut5.LJLZ(i4, viewGroup);
            return;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJIII;
        if (poiDetailResponse2 != null) {
            poiReviewSummaryModel = poiDetailResponse2.getPoiReviewSummaryModel();
        } else {
            poiReviewSummaryModel = null;
        }
        if (Intrinsics.LJFF(poiReviewSummaryModel, poiDetailResponse.getPoiReviewSummaryModel())) {
            PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LLJJIII;
            if (poiDetailResponse3 != null) {
                collectInfo = poiDetailResponse3.getCollectInfo();
            } else {
                collectInfo = null;
            }
            if (Intrinsics.LJFF(collectInfo, poiDetailResponse.getCollectInfo())) {
                return;
            }
        }
        this.LLJJIII = poiDetailResponse;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2 = poiDetailResponse.getPoiReviewSummaryModel();
        TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.rbi);
        C19M4 c19m4 = (C19M4) viewGroup.findViewById(R.id.rb6);
        if (C1184910gwL.LIZ() && poiDetailResponse.showPoiSmallPic()) {
            C1189060h32.LJJII(viewGroup, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null);
            C1184970gwR c1184970gwR = C1184910gwL.LIZIZ;
            c19m4.setMaxLines(1);
            c19m4.LJJJJI(c1184970gwR.LJFF);
            c19m4.setMinTextSize(c1184970gwR.LJI);
            c19m4.setEllipsize(TextUtils.TruncateAt.END);
        }
        Long l2 = poiReviewSummaryModel2.totalCount;
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        if (!Intrinsics.LJFF(poiReviewSummaryModel2.noRating, Boolean.TRUE) && jLongValue > 0) {
            z = false;
        } else {
            z = true;
        }
        if (C1184550gvl.LIZ() && ((l = poiReviewSummaryModel2.totalCount) == null || l.longValue() <= 0)) {
            C786410Ut5.LJLZ(8, viewGroup);
            return;
        }
        C786410Ut5.LJLZ(0, viewGroup);
        String str4 = "";
        if (z) {
            viewGroup.setClickable(false);
            this.LLJJJ = true;
            tuxTextView.setText("");
            tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_star_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a02);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view.getContext());
            tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
            Context context = getContext();
            if (context != null && C426750GoL.LIZLLL(context)) {
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
            } else {
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            if (c19m4 != null) {
                String strLJI = C20642515q3.LJI(2131844738);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJI);
                sbLIZ.append(' ');
                c19m4.setText(new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ)));
                if (C444960Hcc.LIZJ(c19m4.getContext())) {
                    i3 = 4;
                } else {
                    i3 = 3;
                }
                c19m4.setTextDirection(i3);
                ViewGroup.LayoutParams layoutParams = c19m4.getLayoutParams();
                if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                }
            }
            try {
                c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
            if (c19m4 != null) {
                C1180060goW.LIZ(c19m4, new AwS83S1300000_18(c1185410gx9, this, str, poiDetailResponse, 3));
            }
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            PageFinder pageFinderZo = Zo();
            c1191160h6Q.getClass();
            C1191160h6Q.LJJIIJ(pageFinderZo, interfaceC665370Q7zLJIIL, null, "poi_detail_general_header");
        } else {
            if (!C1190820h5s.LJI(poiReviewSummaryModel2)) {
                viewGroup.setClickable(true);
                C427690Gpr.LJI(viewGroup, null);
                if (c19m4 != null) {
                    Resources resources = c19m4.getResources();
                    if (resources == null || (strLIZIZ = resources.getQuantityString(2131755624, (int) jLongValue, C1843500y4a.LIZIZ(jLongValue))) == null) {
                        strLIZIZ = "";
                    }
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_review_enrich_review", false) != 0) {
                        Resources resources2 = c19m4.getResources();
                        if (resources2 == null || (string2 = resources2.getString(2131846652)) == null) {
                            string2 = "";
                        }
                        Object[] objArr = new Object[1];
                        String str5 = poiReviewSummaryModel2.brandName;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        objArr[0] = str4;
                        String strJ4 = C786410Ut5.j4(string2, Arrays.copyOf(objArr, 1));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strJ4);
                        sbLIZ2.append(' ');
                        sbLIZ2.append(strLIZIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    c19m4.setText(strLIZIZ);
                    if (C444960Hcc.LIZJ(c19m4.getContext())) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                    c19m4.setTextDirection(i2);
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_chevron_right_slim_thin_ltr;
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(7.2d)));
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(14.4d)));
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
                    c19m4.setEndIcon(c419910GdJ2);
                }
                C1191160h6Q c1191160h6Q2 = C1191160h6Q.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
                PageFinder pageFinderZo2 = Zo();
                c1191160h6Q2.getClass();
                C1191160h6Q.LJJII(pageFinderZo2, interfaceC665370Q7zLJIIL2, null, "poi_detail_general_header");
            } else {
                viewGroup.setClickable(true);
                C427690Gpr.LJI(viewGroup, null);
                if (c19m4 != null) {
                    Resources resources3 = c19m4.getResources();
                    if (resources3 != null && (string = resources3.getString(2131846652)) != null) {
                        str4 = string;
                    }
                    c19m4.setText(C786410Ut5.j4(str4, Arrays.copyOf(new Object[]{poiReviewSummaryModel2.brandName}, 1)));
                    if (C444960Hcc.LIZJ(c19m4.getContext())) {
                        i = 4;
                    } else {
                        i = 3;
                    }
                    c19m4.setTextDirection(i);
                    ViewGroup.LayoutParams layoutParams2 = c19m4.getLayoutParams();
                    if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    }
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    c419910GdJ3.LIZ = R.raw.icon_chevron_right_slim_thin_ltr;
                    c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(7.2d)));
                    c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(14.4d)));
                    c419910GdJ3.LJ = Integer.valueOf(R.attr.a1j);
                    c19m4.setEndIcon(c419910GdJ3);
                }
                C1191160h6Q c1191160h6Q3 = C1191160h6Q.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL3 = C1558520qew.LJIIL(this);
                PageFinder pageFinderZo3 = Zo();
                c1191160h6Q3.getClass();
                C1191160h6Q.LJJII(pageFinderZo3, interfaceC665370Q7zLJIIL3, null, "poi_detail_general_header");
            }
            if (poiReviewSummaryModel2.displayType == EnumC1156320gCE.POI_REVIEW_SUMMARY_DISPLAY_TYPE_WITH_TOTAL_SCORE.getValue()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(poiReviewSummaryModel2.score));
                int length = spannableStringBuilder.length();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('/');
                sbLIZ3.append(poiReviewSummaryModel2.maxScore);
                spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ3));
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(103, false), 0, length, 17);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, view.getContext());
                if (numLIZJ != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), 0, length, 17);
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, view.getContext());
                if (numLIZJ2 != null) {
                    tuxTextView.setTextColor(numLIZJ2.intValue());
                }
                tuxTextView.setTuxFont(51);
                tuxTextView.setText(spannableStringBuilder);
            } else {
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, view.getContext());
                if (numLIZJ3 != null) {
                    tuxTextView.setTextColor(numLIZJ3.intValue());
                }
                tuxTextView.setTuxFont(52);
                tuxTextView.setText(String.valueOf(poiReviewSummaryModel2.score));
                C419910GdJ c419910GdJ4 = new C419910GdJ();
                c419910GdJ4.LIZ = R.raw.icon_star_fill;
                c419910GdJ4.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ4.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ4.LJ = Integer.valueOf(R.attr.ny);
                TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ4.LIZ(view.getContext());
                tuxIconDrawableLIZ2.setBounds(0, 0, tuxIconDrawableLIZ2.LJII, tuxIconDrawableLIZ2.LJIIIIZZ);
                Context context2 = getContext();
                if (context2 != null && C426750GoL.LIZLLL(context2)) {
                    tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ2, (Drawable) null);
                } else {
                    tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ2, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            }
        }
        C2211631BhB.LJ(viewGroup, new AwS23S1400000_18(viewGroup, str, poiDetailResponse, poiReviewSummaryModel2, this, 0));
        C786410Ut5.I7(new AkS0S3410000_18(this, z, str, poiDetailResponse, poiReviewSummaryModel2, str2, str3, viewGroup, 1), viewGroup);
    }

    public void Xp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str, String str2, String str3) {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel3;
        long jLongValue;
        boolean z;
        Object c098200Yq;
        TextView textView;
        TuxTextView tuxTextView;
        String string;
        TextView textView2;
        String string2;
        String strLIZIZ;
        String string3;
        int i;
        TuxTextView tuxTextView2;
        String collectInfo;
        String collectInfo2;
        if (op(poiDetailResponse) && str != null) {
            PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJIII;
            String string4 = null;
            if (poiDetailResponse2 != null) {
                poiReviewSummaryModel = poiDetailResponse2.getPoiReviewSummaryModel();
            } else {
                poiReviewSummaryModel = null;
            }
            if (poiDetailResponse != null) {
                poiReviewSummaryModel2 = poiDetailResponse.getPoiReviewSummaryModel();
            } else {
                poiReviewSummaryModel2 = null;
            }
            if (Intrinsics.LJFF(poiReviewSummaryModel, poiReviewSummaryModel2)) {
                PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LLJJIII;
                if (poiDetailResponse3 != null) {
                    collectInfo = poiDetailResponse3.getCollectInfo();
                } else {
                    collectInfo = null;
                }
                if (poiDetailResponse != null) {
                    collectInfo2 = poiDetailResponse.getCollectInfo();
                } else {
                    collectInfo2 = null;
                }
                if (Intrinsics.LJFF(collectInfo, collectInfo2)) {
                    return;
                }
            }
            this.LLJJIII = poiDetailResponse;
            if (this.LLJJIJIL == null) {
                View viewFindViewById = view.findViewById(R.id.tg1);
                this.LLJJIJIL = viewFindViewById;
                if (viewFindViewById != null) {
                    C1180060goW.LJIIJJI(viewFindViewById, ep(view));
                }
                View view2 = this.LLJJIJIL;
                if (view2 != null) {
                    view2.setTag(1706771800, "review_entrance");
                }
            }
            View view3 = this.LLJJIJIL;
            if (view3 != null) {
                C337180DJs.LIZJ(view3);
            }
            View view4 = this.LLJJIJIL;
            if (view4 != null) {
                C427690Gpr.LJI(view4, null);
            }
            if (poiDetailResponse != null && (poiReviewSummaryModel3 = poiDetailResponse.getPoiReviewSummaryModel()) != null) {
                Long l = poiReviewSummaryModel3.totalCount;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (!Intrinsics.LJFF(poiReviewSummaryModel3.noRating, Boolean.TRUE) && jLongValue > 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    View view5 = this.LLJJIJIL;
                    if (view5 != null && (tuxTextView2 = (TuxTextView) view5.findViewById(R.id.tv_review_title)) != null) {
                        if (C14KI.LJI(tuxTextView2.getContext())) {
                            tuxTextView2.setTuxFont(82);
                        } else {
                            tuxTextView2.setTuxFont(42);
                        }
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, view.getContext());
                        if (numLIZJ != null) {
                            tuxTextView2.setTextColor(numLIZJ.intValue());
                        }
                        Locale locale = Locale.US;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C786410Ut5.k4(locale, "%.1f", Arrays.copyOf(new Object[]{poiReviewSummaryModel3.score}, 1)));
                        int length = spannableStringBuilder.length();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('/');
                        sbLIZ.append(C786410Ut5.k4(locale, "%.0f", Arrays.copyOf(new Object[]{poiReviewSummaryModel3.maxScore}, 1)));
                        spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
                        C786410Ut5.q2(spannableStringBuilder, new RelativeSizeSpan(1.86f), 0, length, 17);
                        tuxTextView2.setText(spannableStringBuilder);
                    }
                    View view6 = this.LLJJIJIL;
                    if (view6 != null && (textView2 = (TextView) view6.findViewById(R.id.tv_review_desc)) != null) {
                        Resources resources = textView2.getResources();
                        String str4 = "";
                        if (resources == null || (string2 = resources.getString(2131846652)) == null) {
                            string2 = "";
                        }
                        if (C1190820h5s.LJI(poiReviewSummaryModel3)) {
                            strLIZIZ = C786410Ut5.j4(string2, Arrays.copyOf(new Object[]{poiReviewSummaryModel3.brandName}, 1));
                        } else {
                            Resources resources2 = textView2.getResources();
                            if (resources2 != null && (string3 = resources2.getString(2131844856, C1843500y4a.LIZIZ(jLongValue))) != null) {
                                str4 = string3;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str4);
                            sbLIZ2.append(' ');
                            sbLIZ2.append(C786410Ut5.j4(string2, Arrays.copyOf(new Object[]{poiReviewSummaryModel3.brandName}, 1)));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        textView2.setText(strLIZIZ);
                        if (C444960Hcc.LIZJ(textView2.getContext())) {
                            i = 4;
                        } else {
                            i = 3;
                        }
                        textView2.setTextDirection(i);
                    }
                    C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                    PageFinder pageFinderZo = Zo();
                    c1191160h6Q.getClass();
                    C1191160h6Q.LJJII(pageFinderZo, interfaceC665370Q7zLJIIL, null, "poi_detail_hotel_header");
                    View view7 = this.LLJJIJIL;
                    if (view7 != null) {
                        C786410Ut5.I7(new AkS0S3300000_18(this, str, poiDetailResponse, poiReviewSummaryModel3, str2, str3, 0), view7);
                        return;
                    }
                    return;
                }
                this.LLJJJ = true;
                try {
                    c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
                View view8 = this.LLJJIJIL;
                if (view8 != null) {
                    C1180060goW.LIZ(view8, new AwS83S1300000_18(c1185410gx9, this, str, poiDetailResponse, 2));
                }
                View view9 = this.LLJJIJIL;
                if (view9 != null && (tuxTextView = (TuxTextView) view9.findViewById(R.id.tv_review_title)) != null) {
                    tuxTextView.setTuxFont(52);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, view.getContext());
                    if (numLIZJ2 != null) {
                        tuxTextView.setTextColor(numLIZJ2.intValue());
                    }
                    Resources resources3 = tuxTextView.getResources();
                    if (resources3 != null) {
                        string = resources3.getString(2131844698);
                    } else {
                        string = null;
                    }
                    tuxTextView.setText(string);
                }
                View view10 = this.LLJJIJIL;
                if (view10 != null && (textView = (TextView) view10.findViewById(R.id.tv_review_desc)) != null) {
                    Resources resources4 = textView.getResources();
                    if (resources4 != null) {
                        string4 = resources4.getString(2131844847);
                    }
                    textView.setText(string4);
                }
                View view11 = this.LLJJIJIL;
                if (view11 != null) {
                    C786410Ut5.I7(new AkS3S1300000_18(this, view, str, poiDetailResponse, 0), view11);
                }
                C1191160h6Q c1191160h6Q2 = C1191160h6Q.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
                PageFinder pageFinderZo2 = Zo();
                c1191160h6Q2.getClass();
                C1191160h6Q.LJJIIJ(pageFinderZo2, interfaceC665370Q7zLJIIL2, null, "poi_detail_hotel_header");
                return;
            }
            return;
        }
        View view12 = this.LLJJIJIL;
        if (view12 != null) {
            C339190DRl.LIZIZ(view12);
        }
    }

    public final void hp(String str, boolean z, C1184480gve c1184480gve, String str2, String str3) {
        Object c098200Yq;
        C1188440h22 c1188440h22;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Map<String, String> map;
        Boolean bool;
        String anchorInteractMethod;
        String initialEnterFrom;
        Object c098200Yq2;
        Context context = getContext();
        if (context == null) {
            return;
        }
        Object obj = null;
        try {
            InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
            if (interfaceC1184330gvP != null) {
                c098200Yq = interfaceC1184330gvP.Nf();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        if (c1184480gve != null) {
            c1188440h22 = c1184480gve.LLILZLL;
            str4 = c1184480gve.LL;
            str5 = c1184480gve.LLILLJJLI;
            str6 = c1184480gve.LLIZLLLIL;
            str7 = c1184480gve.LLJ;
            str8 = c1184480gve.LLJI;
            str9 = c1184480gve.LLJIJIL;
            map = c1184480gve.LLJILJILJ;
            bool = c1184480gve.LLJILLL;
        } else {
            c1188440h22 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            map = null;
            bool = null;
        }
        if (c1185410gx9 != null) {
            anchorInteractMethod = c1185410gx9.getAnchorInteractMethod();
            initialEnterFrom = c1185410gx9.getInitialEnterFrom();
        } else {
            anchorInteractMethod = null;
            initialEnterFrom = null;
        }
        LocationDetailMobParam locationDetailMobParam = new LocationDetailMobParam(c1188440h22, str2, str4, str5, str6, str7, str8, str9, map, bool, anchorInteractMethod, initialEnterFrom);
        try {
            InterfaceC1184330gvP interfaceC1184330gvP2 = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
            if (interfaceC1184330gvP2 == null) {
                c098200Yq2 = null;
            } else {
                c098200Yq2 = interfaceC1184330gvP2.jN(false, null, null, null);
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//poi/map");
        smartRouteBuildRoute.withParam("poi_id", str);
        smartRouteBuildRoute.withParam("enter_from", this.LLJI);
        smartRouteBuildRoute.withParam("is_collected", z);
        smartRouteBuildRoute.withParam("mob_param", locationDetailMobParam);
        smartRouteBuildRoute.withParam("poi_collect_mob_data", (C1188530h2B) obj);
        smartRouteBuildRoute.withParam("source_btm_token", str3);
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(com.bytedance.android.btm.api.model.PageFinder r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem.kp(com.bytedance.android.btm.api.model.PageFinder, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[PHI: r4
      0x0084: PHI (r4v0 android.graphics.Rect) = 
      (r4v13 android.graphics.Rect)
      (r4v14 android.graphics.Rect)
      (r4v15 android.graphics.Rect)
      (r4v16 android.graphics.Rect)
     binds: [B:8:0x0025, B:10:0x0054, B:11:0x0056, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019b A[PHI: r10
      0x019b: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:77:0x019a, B:64:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0SxQ, com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.0SxQ] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.0gxS] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip(com.bytedance.lighten.loader.SmartImageView r21, java.util.ArrayList<? extends java.lang.String> r22, java.util.ArrayList<com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture> r23, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r24, java.lang.String r25, java.util.ArrayList<java.lang.String> r26) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem.ip(com.bytedance.lighten.loader.SmartImageView, java.util.ArrayList, java.util.ArrayList, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ee  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0kpH, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View, com.bytedance.tux.icon.TuxIconView] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0gpK] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.0h3W] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Qp(final android.view.View r33, final java.lang.String r34, final boolean r35, final com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r36, final java.lang.String r37, final java.lang.String r38, final java.lang.String r39, final java.lang.String r40, final java.lang.String r41, final java.lang.String r42) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem.Qp(android.view.View, java.lang.String, boolean, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void dq(View view, String str, boolean z, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z2;
        int iHashCode;
        PoiDetailTagStyle poiDetailTagStyle;
        GradientDrawable gradientDrawable;
        PoiDetailTagStyle poiDetailTagStyle2;
        Object c1179160gn4;
        GradientDrawable gradientDrawable2;
        List<PoiHeadMergedTag> mergedTagsList;
        if (poiDetailResponse != null && (mergedTagsList = poiDetailResponse.getMergedTagsList()) != null && (!mergedTagsList.isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<PoiDetailTag> tags = null;
        if (z2) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rdw);
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.olr);
            tuxIconView.setTag(1706771800, "info_bar");
            viewOnAttachStateChangeListenerC20604515jv.setTag(1706771800, "info_bar");
            if (poiDetailResponse != null && str != null && sp(poiDetailResponse)) {
                List<PoiHeadMergedTag> mergedTagsList2 = poiDetailResponse.getMergedTagsList();
                if (mergedTagsList2 != null) {
                    List<PoiHeadMergedTag> list = this.LLJJIJI;
                    if (list != null && Intrinsics.LJFF(list, mergedTagsList2)) {
                        return;
                    }
                    this.LLJJIJI = mergedTagsList2;
                    boolean zShowPoiSmallPic = poiDetailResponse.showPoiSmallPic();
                    if (mergedTagsList2.isEmpty()) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                    } else {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    }
                    if (C960203pA.LIZIZ(tuxIconView.getContext())) {
                        tuxIconView.setBackgroundResource(R.drawable.cuh);
                    } else {
                        tuxIconView.setBackgroundResource(R.drawable.cui);
                    }
                    tuxIconView.setLayoutDirection(C0H4W.LIZ() ? 1 : 0);
                    if (C0H4W.LIZ()) {
                        Drawable drawableMutate = tuxIconView.getBackground().mutate();
                        if ((drawableMutate instanceof GradientDrawable) && (gradientDrawable2 = (GradientDrawable) drawableMutate) != null) {
                            gradientDrawable2.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
                        }
                    }
                    C786410Ut5.I7(new AkS0S7410000_18(this, tuxIconView, str, z, tuxIconView, str2, str3, str4, str5, str6, str7, poiDetailResponse, 7), tuxIconView);
                    C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
                    viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
                    viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiChartCell.class);
                    viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiTagCell.class);
                    if (viewOnAttachStateChangeListenerC20604515jv.getItemDecorationCount() <= 0) {
                        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1767206w2(this, (C1180060goW.LJIILJJIL(tuxIconView) - C1180060goW.LJI(tuxIconView)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 1));
                    }
                    if (zShowPoiSmallPic && !C1184910gwL.LIZIZ()) {
                        C1189060h32.LJJII(viewOnAttachStateChangeListenerC20604515jv, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0);
                    } else {
                        C1189060h32.LJJII(viewOnAttachStateChangeListenerC20604515jv, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0);
                    }
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (PoiHeadMergedTag poiHeadMergedTag : mergedTagsList2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            PoiHeadMergedTag poiHeadMergedTag2 = poiHeadMergedTag;
                            if (poiHeadMergedTag2.getChartInfo() != null) {
                                c1179160gn4 = new C1184740gw4(Integer.valueOf(i), poiHeadMergedTag2.getChartInfo());
                            } else {
                                if (poiHeadMergedTag2.getPoiDetailTag() != null) {
                                    C1179490gnb c1179490gnb = EnumC1179480gna.Companion;
                                    int i3 = poiHeadMergedTag2.getPoiDetailTag().tagType;
                                    c1179490gnb.getClass();
                                    for (EnumC1179480gna enumC1179480gna : EnumC1179480gna.values()) {
                                        if (enumC1179480gna.getValue() == i3) {
                                            PoiDetailTag poiDetailTag = poiHeadMergedTag2.getPoiDetailTag();
                                            Map<String, PoiDetailTagStyle> poiDetailTagStyleMap = poiDetailResponse.getPoiDetailTagStyleMap();
                                            if (poiDetailTagStyleMap != null) {
                                                poiDetailTagStyle2 = poiDetailTagStyleMap.get(String.valueOf(poiHeadMergedTag2.getPoiDetailTag().tagStyle));
                                            } else {
                                                poiDetailTagStyle2 = null;
                                            }
                                            c1179160gn4 = new C1179160gn4(i, poiDetailTag, poiDetailTagStyle2);
                                        }
                                    }
                                }
                                i = i2;
                            }
                            arrayList.add(c1179160gn4);
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, null);
                    return;
                }
                return;
            }
            C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            this.LLJJIJI = null;
            viewOnAttachStateChangeListenerC20604515jv.getState().LJFF(null);
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rdw);
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.olr);
        tuxIconView2.setTag(1706771800, "info_bar");
        viewOnAttachStateChangeListenerC20604515jv2.setTag(1706771800, "info_bar");
        if (poiDetailResponse != null) {
            List<PoiDetailTag> tags2 = poiDetailResponse.getTags();
            if (str != null && tags2 != null && !tags2.isEmpty() && !op(poiDetailResponse)) {
                PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJI;
                if (poiDetailResponse2 != null) {
                    tags = poiDetailResponse2.getTags();
                }
                if (Intrinsics.LJFF(tags, tags2) || Intrinsics.LJFF(this.LLJJIJIIJIL, tags2)) {
                    return;
                }
                this.LLJJIJIIJIL = tags2;
                boolean zShowPoiSmallPic2 = poiDetailResponse.showPoiSmallPic();
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                if (C960203pA.LIZIZ(tuxIconView2.getContext())) {
                    tuxIconView2.setBackgroundResource(R.drawable.cuh);
                } else {
                    tuxIconView2.setBackgroundResource(R.drawable.cui);
                }
                tuxIconView2.setLayoutDirection(C0H4W.LIZ() ? 1 : 0);
                if (C0H4W.LIZ()) {
                    Drawable drawableMutate2 = tuxIconView2.getBackground().mutate();
                    if ((drawableMutate2 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableMutate2) != null) {
                        gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
                    }
                }
                C786410Ut5.I7(new AkS0S7410000_18(this, tuxIconView2, str, z, tuxIconView2, str2, str3, str4, str5, str6, str7, poiDetailResponse, 8), tuxIconView2);
                C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv2);
                viewOnAttachStateChangeListenerC20604515jv2.setOrientation(0);
                viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PoiTagCell.class);
                viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PoiTagSpaceCell.class);
                if (viewOnAttachStateChangeListenerC20604515jv2.getItemDecorationCount() <= 0) {
                    viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(new C1767006w0(this, 11));
                }
                if (zShowPoiSmallPic2 && !C1184910gwL.LIZIZ()) {
                    C1189060h32.LJJII(viewOnAttachStateChangeListenerC20604515jv2, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0);
                } else {
                    C1189060h32.LJJII(viewOnAttachStateChangeListenerC20604515jv2, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0);
                }
                C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv2.getState();
                ArrayList arrayList2 = new ArrayList();
                for (PoiDetailTag poiDetailTag2 : tags2) {
                    C1179490gnb c1179490gnb2 = EnumC1179480gna.Companion;
                    int i4 = poiDetailTag2.tagType;
                    c1179490gnb2.getClass();
                    EnumC1179480gna[] enumC1179480gnaArrValues = EnumC1179480gna.values();
                    int length = enumC1179480gnaArrValues.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (enumC1179480gnaArrValues[i5].getValue() == i4) {
                            arrayList2.add(poiDetailTag2);
                            break;
                        }
                        i5++;
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                int i6 = 0;
                for (Object obj : arrayList2) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        PoiDetailTag poiDetailTag3 = (PoiDetailTag) obj;
                        PoiDetailTagContent poiDetailTagContent = poiDetailTag3.tagContent;
                        if (poiDetailTagContent != null) {
                            iHashCode = poiDetailTagContent.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        int i8 = i6 | iHashCode;
                        Map<String, PoiDetailTagStyle> poiDetailTagStyleMap2 = poiDetailResponse.getPoiDetailTagStyleMap();
                        if (poiDetailTagStyleMap2 != null) {
                            poiDetailTagStyle = poiDetailTagStyleMap2.get(String.valueOf(poiDetailTag3.tagStyle));
                        } else {
                            poiDetailTagStyle = null;
                        }
                        arrayList3.add(new C1179160gn4(i8, poiDetailTag3, poiDetailTagStyle));
                        i6 = i7;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                state.LJIILL(arrayList3, null);
                C20600815jK.LIZJ(viewOnAttachStateChangeListenerC20604515jv2.getState(), new InterfaceC1891350zJl() { // from class: X.006m
                    public final String LL = "footer";

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof C0250006m) && Intrinsics.LJFF(this.LL, ((C0250006m) obj2).LL);
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return null;
                    }

                    public final int hashCode() {
                        return this.LL.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PoiTagSpaceItem(id=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }
                });
                return;
            }
        }
        C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv2);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        this.LLJJIJIIJIL = null;
        viewOnAttachStateChangeListenerC20604515jv2.getState().LJFF(null);
    }

    public final void jq(View view, String str, boolean z, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String strLJ;
        Object c098200Yq;
        String groupId;
        Object obj;
        boolean zLJFF;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185490gxH c1185490gxH;
        Map<String, Object> extraParam;
        C1184480gve c1184480gve3;
        C1185490gxH c1185490gxH2;
        PoiCurrentSessionInfo poiCurrentSessionInfoDp = dp();
        if (poiCurrentSessionInfoDp == null || (strLJ = C2365509Or.LJ(poiCurrentSessionInfoDp)) == null) {
            strLJ = "";
        }
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = view.getContext();
        String str9 = null;
        String strLIZ = C18JG.LIZ("c74061.d2545", PageFinder.via(this.LLJJJIL), null);
        try {
            InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
            if (interfaceC1184330gvP != null) {
                c098200Yq = interfaceC1184330gvP.Nf();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        C1184460gvc c1184460gvcOo = Oo();
        if (c1184460gvcOo != null && (c1184480gve3 = c1184460gvcOo.LLILLL) != null && (c1185490gxH2 = c1184480gve3.LLIZ) != null) {
            groupId = c1185490gxH2.getGroupId();
        } else {
            groupId = null;
        }
        C1184460gvc c1184460gvcOo2 = Oo();
        if (c1184460gvcOo2 != null && (c1184480gve2 = c1184460gvcOo2.LLILLL) != null && (c1185490gxH = c1184480gve2.LLIZ) != null && (extraParam = c1185490gxH.getExtraParam()) != null) {
            obj = extraParam.get("aweme_type");
        } else {
            obj = null;
        }
        C1184460gvc c1184460gvcOo3 = Oo();
        if (c1184460gvcOo3 != null && (c1184480gve = c1184460gvcOo3.LLILLL) != null) {
            zLJFF = Intrinsics.LJFF(c1184480gve.LLJILLL, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        PoiCurrentSessionInfo poiCurrentSessionInfoDp2 = dp();
        if (poiCurrentSessionInfoDp2 != null) {
            str9 = poiCurrentSessionInfoDp2.poiSessionId;
        }
        C1186070gyD.LIZJ(c1186070gyD, context, view, str, z, poiDetailResponse, str2, str3, str4, str5, str6, str7, strLIZ, c1185410gx9, groupId, obj, zLJFF, strLJ, "click_head_highlight", str9, "highlight", str8, null, 2097152);
    }
}
