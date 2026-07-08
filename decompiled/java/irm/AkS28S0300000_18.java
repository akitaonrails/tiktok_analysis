package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C03EY;
import X.C1173300gdc;
import X.C1174830gg5;
import X.C1174850gg7;
import X.C1175120ggY;
import X.C1175850ghj;
import X.C1179160gn4;
import X.C1180880gpq;
import X.C1181890grT;
import X.C1184630gvt;
import X.C1184720gw2;
import X.C1184740gw4;
import X.C1185340gx2;
import X.C1185350gx3;
import X.C1185360gx4;
import X.C1185370gx5;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185600gxS;
import X.C1185640gxW;
import X.C1187300h0C;
import X.C1189060h32;
import X.C1193350h9x;
import X.C1202420hOa;
import X.C1388190mED;
import X.C1390920mIc;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C197039127h;
import X.C19EG;
import X.C19M4;
import X.C2344009Gk;
import X.C339190DRl;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1181010gq3;
import X.InterfaceC1185170gwl;
import X.InterfaceC665370Q7z;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumFragment;
import com.ss.android.ugc.aweme.poi.album.assem.PoiAlbumBottomShareAssem;
import com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixBottomShareAssem;
import com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixPageFooterAssem;
import com.ss.android.ugc.aweme.poi.content.poicampaign.HashtagInfo;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiSlashContextAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.IPoiTagAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiTagCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.PoiChartCell;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.background.map.PoiBackgroundMapAssem;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamic.PoiNavigateButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.DistanceInfo;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2;
import com.ss.android.ugc.aweme.poi.detail.dishes.IRecommendDishesAbility;
import com.ss.android.ugc.aweme.poi.detail.dishes.RecommendDishesCell;
import com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.ss.android.ugc.aweme.poi.osp.repo.model.DialogContent;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceItem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.slash.data.AnchorComponentInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS235S0000000_6;
import kotlin.jvm.internal.AwS255S0000000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes19.dex */
public class AkS28S0300000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS28S0300000_18 akS28S0300000_18, View view) {
        ((PoiBackgroundMapAssem) akS28S0300000_18.l0).tp((PoiDiscoveryCard) akS28S0300000_18.l1, MapModeEnterMethod.CLICK_MAP_POI_MARKER, (PoiDiscoveryApi$PoiDiscoveryCardListResponse) akS28S0300000_18.l2, null);
    }

    public static final void LIZ$1(AkS28S0300000_18 akS28S0300000_18, View view) {
        C19EG c19egLIZIZ;
        AnchorComponentInfo anchorComponentInfo;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str = ((PoiAlbumFragment) akS28S0300000_18.l0).UR().poiId;
        String str2 = ((AnchorComponentInfo) akS28S0300000_18.l1).iconType;
        String str3 = ((PoiAlbumFragment) akS28S0300000_18.l0).UR().collectInfo;
        String str4 = null;
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ((C197039127h) akS28S0300000_18.l2, null);
        PageFinder pageFinder = (PageFinder) ((PoiAlbumFragment) akS28S0300000_18.l0).LLJLIL.getValue();
        c1185430gxB.getClass();
        C1185430gxB.LJIILIIL("album_page", str, str2, str3, null, interfaceC665370Q7zLJ, pageFinder);
        ((PoiAlbumFragment) akS28S0300000_18.l0).VR().wQ2((PageFinder) ((PoiAlbumFragment) akS28S0300000_18.l0).LLJLIL.getValue(), C1558360qeg.LJ((C197039127h) akS28S0300000_18.l2, null), "click");
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        String str5 = ((PoiAlbumFragment) akS28S0300000_18.l0).UR().poiId;
        String str6 = ((PoiAlbumFragment) akS28S0300000_18.l0).UR().poiSessionId;
        List<AnchorComponentInfo> list = ((PoiAlbumFragment) akS28S0300000_18.l0).UR().anchorModuleList;
        if (list != null && (anchorComponentInfo = (AnchorComponentInfo) C13LP.LJJJLL(list)) != null) {
            str4 = anchorComponentInfo.instanceId;
        }
        eventBusLIZLLL.LJIILL(new C1185640gxW(str5, str6, str4, null, 24));
        Context context = ((C197039127h) akS28S0300000_18.l2).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c19egLIZIZ.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$10(irm.AkS28S0300000_18 r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS28S0300000_18.LIZ$10(irm.AkS28S0300000_18, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$11(AkS28S0300000_18 akS28S0300000_18, View view) {
        C1185410gx9 c1185410gx9;
        Integer numValueOf;
        Integer userLocation;
        String initialEnterFrom;
        String initialEnterMethod;
        DistanceInfo distanceInfo;
        C1185600gxS c1185600gxS;
        C1175850ghj c1175850ghj = C1175850ghj.LIZ;
        Context context = ((PoiNavigateButtonAssem) akS28S0300000_18.l0).getContext();
        PoiNavigateButtonAssem poiNavigateButtonAssem = (PoiNavigateButtonAssem) akS28S0300000_18.l0;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) akS28S0300000_18.l1;
        String collectInfo = null;
        String poiId = ((InterfaceC1185170gwl) akS28S0300000_18.l2).getPoiId();
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI((PoiNavigateButtonAssem) akS28S0300000_18.l0));
        c1175850ghj.getClass();
        C1175850ghj.LIZIZ(context, poiNavigateButtonAssem, poiDetailResponse, null, poiId, "poi_header", pageFinderVia);
        PoiNavigateButtonAssem poiNavigateButtonAssem2 = (PoiNavigateButtonAssem) akS28S0300000_18.l0;
        poiNavigateButtonAssem2.getClass();
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(poiNavigateButtonAssem2);
        String initialPoiFromGroupId = null;
        if (c1173300gdcLJ != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null) {
            c1185410gx9 = c1185600gxS.LJFF;
        } else {
            c1185410gx9 = null;
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String poiId2 = ((InterfaceC1185170gwl) akS28S0300000_18.l2).getPoiId();
        if (poiId2 == null) {
            poiId2 = "";
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = (PoiListApi.PoiDetailResponse) akS28S0300000_18.l1;
        if (poiDetailResponse2 != null) {
            collectInfo = poiDetailResponse2.getCollectInfo();
        }
        String strLJIIJJI = ((InterfaceC1185170gwl) akS28S0300000_18.l2).LJIIJJI();
        String strLJ = ((InterfaceC1185170gwl) akS28S0300000_18.l2).LJ();
        PoiListApi.PoiDetailResponse poiDetailResponse3 = (PoiListApi.PoiDetailResponse) akS28S0300000_18.l1;
        if (poiDetailResponse3 != null && (distanceInfo = poiDetailResponse3.getDistanceInfo()) != null) {
            numValueOf = Integer.valueOf(distanceInfo.distanceType);
        } else {
            numValueOf = null;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse4 = (PoiListApi.PoiDetailResponse) akS28S0300000_18.l1;
        if (poiDetailResponse4 != null) {
            userLocation = poiDetailResponse4.getUserLocation();
        } else {
            userLocation = null;
        }
        if (c1185410gx9 != null) {
            initialEnterFrom = c1185410gx9.getInitialEnterFrom();
            initialEnterMethod = c1185410gx9.getInitialEnterMethod();
            initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
        } else {
            initialEnterFrom = null;
            initialEnterMethod = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiNavigateButtonAssem) akS28S0300000_18.l0);
        PageFinder pageFinderVia2 = PageFinder.via(C724240Sb0.LJI((PoiNavigateButtonAssem) akS28S0300000_18.l0));
        c1185430gxB.getClass();
        C1185430gxB.LJJIFFI(poiId2, collectInfo, strLJIIJJI, strLJ, numValueOf, userLocation, "click_bottom_bar", initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, interfaceC665370Q7zLJIIL, pageFinderVia2);
    }

    public static final void LIZ$12(AkS28S0300000_18 akS28S0300000_18, View view) {
        ((PoiBackgroundMapComponent) akS28S0300000_18.l0).up((PoiGeneralCard) akS28S0300000_18.l1, MapModeEnterMethod.CLICK_MAP_POI_MARKER, (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) akS28S0300000_18.l2, null, true);
    }

    public static final void LIZ$13(AkS28S0300000_18 akS28S0300000_18, View view) {
        IRecommendDishesAbility iRecommendDishesAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((RecommendDishesCell) akS28S0300000_18.l0);
        if (fragmentLJIIJ != null && (iRecommendDishesAbility = (IRecommendDishesAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IRecommendDishesAbility.class, null)) != null) {
            iRecommendDishesAbility.PN2(((RecommendDishesCell) akS28S0300000_18.l0).getBindingAdapterPosition(), (SmartImageView) akS28S0300000_18.l1, (PoiDetailApi.RecommendedDish) akS28S0300000_18.l2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0hA2, android.view.View] */
    public static final void LIZ$14(AkS28S0300000_18 akS28S0300000_18, View view) {
        C19EG c19egLIZIZ;
        C1193350h9x c1193350h9x = C1193350h9x.LIZ;
        final Context context = ((TuxIconView) akS28S0300000_18.l0).getContext();
        DialogContent dialogContent = ((PriceItem) akS28S0300000_18.l1).estimatedTaxesModal;
        c1193350h9x.getClass();
        if (dialogContent != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            ?? r0 = new LinearLayout(context) { // from class: X.0hA2
                public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
                public final C166U LL;

                static {
                    C2217381BqS c2217381BqS = new C2217381BqS(C1193400hA2.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderTaxInfoSheetBinding;", 0);
                    C13LE.LIZ.getClass();
                    LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
                }

                private final C1193420hA4 getViewBinding() {
                    C166U c166u = this.LL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
                    return (C1193420hA4) c166u.LIZ(this);
                }

                {
                    super(context, null, 0);
                    this.LL = new C166U(new AwS235S0000000_6(3));
                    C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e5z, this, true);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v9, types: [X.0hA3, android.view.View] */
                public final void setData(DialogContent dialogContent2) {
                    TuxTextView tuxTextView = getViewBinding().LLILZLL;
                    String str = dialogContent2.title;
                    if (str == null) {
                        str = "";
                    }
                    tuxTextView.setText(str);
                    TuxTextView tuxTextView2 = getViewBinding().LLILLL;
                    String str2 = dialogContent2.message;
                    if (str2 == null) {
                        str2 = "";
                    }
                    tuxTextView2.setText(str2);
                    TuxTextView tuxTextView3 = getViewBinding().LLILZ;
                    String str3 = dialogContent2.breakdownHeading;
                    if (str3 == null) {
                        str3 = "";
                    }
                    tuxTextView3.setText(str3);
                    C786410Ut5.I7(new AkS87S0100000_18(this, 52), getViewBinding().LLILLJJLI);
                    C786410Ut5.LJJJJJL(getViewBinding().LLILZIL);
                    List<PriceItem> list = dialogContent2.breakdownItems;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    for (PriceItem priceItem : list) {
                        LinearLayout linearLayout = getViewBinding().LLILZIL;
                        final Context context2 = getContext();
                        ?? r1 = new LinearLayout(context2) { // from class: X.0hA3
                            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
                            public final C166U LL;

                            static {
                                C2217381BqS c2217381BqS = new C2217381BqS(C1193410hA3.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderTaxInfoPriceItemBinding;", 0);
                                C13LE.LIZ.getClass();
                                LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
                            }

                            private final C1193460hA8 getViewBinding() {
                                C166U c166u = this.LL;
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
                                return (C1193460hA8) c166u.LIZ(this);
                            }

                            {
                                super(context2, null, 0);
                                this.LL = new C166U(new AwS255S0000000_18(2));
                                C786410Ut5.Td(C786410Ut5.ne(context2), R.layout.e5y, this, true);
                            }

                            public final void setData(PriceItem priceItem2) {
                                String strLIZIZ;
                                int i;
                                TuxTextView tuxTextView4 = getViewBinding().LLILLL;
                                String str4 = priceItem2.name;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                tuxTextView4.setText(str4);
                                Boolean boolIsDiscount = priceItem2.isDiscount();
                                Boolean bool = Boolean.TRUE;
                                if (Intrinsics.LJFF(boolIsDiscount, bool)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append('-');
                                    String str5 = priceItem2.currencySymbol;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    sbLIZ.append(str5);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                } else {
                                    strLIZIZ = priceItem2.currencySymbol;
                                    if (strLIZIZ == null) {
                                        strLIZIZ = "";
                                    }
                                }
                                if (Intrinsics.LJFF(priceItem2.isDiscount(), bool)) {
                                    i = R.attr.a1q;
                                } else {
                                    i = R.attr.a1h;
                                }
                                TuxTextView tuxTextView5 = getViewBinding().LLILLJJLI;
                                C041W c041w = new C041W();
                                String str6 = priceItem2.price;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                c041w.LIZJ(0, str6, strLIZIZ, "");
                                c041w.LJ = 51;
                                c041w.LJFF = 51;
                                c041w.LJII = i;
                                c041w.LJIIIIZZ = false;
                                tuxTextView5.setText(c041w.LIZIZ(getContext()));
                            }
                        };
                        r1.setData(priceItem);
                        linearLayout.addView(r1);
                    }
                    PriceItem priceItem2 = dialogContent2.breakdownTotal;
                    if (priceItem2 != null) {
                        C786410Ut5.LL(0, getViewBinding().LLIZ);
                        TuxTextView tuxTextView4 = getViewBinding().LLIZLLLIL;
                        String str4 = priceItem2.name;
                        if (str4 == null) {
                            str4 = "";
                        }
                        tuxTextView4.setText(str4);
                        TuxTextView tuxTextView5 = getViewBinding().LLJ;
                        C041W c041w = new C041W();
                        String str5 = priceItem2.price;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = priceItem2.currencySymbol;
                        if (str6 == null) {
                            str6 = "";
                        }
                        c041w.LIZJ(0, str5, str6, "");
                        c041w.LJ = 22;
                        c041w.LJFF = 22;
                        c041w.LJII = R.attr.a1h;
                        c041w.LJIIIIZZ = false;
                        tuxTextView5.setText(c041w.LIZIZ(getContext()));
                        return;
                    }
                    C786410Ut5.LL(8, getViewBinding().LLIZ);
                }
            };
            r0.setData(dialogContent);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIII = r0;
            tuxSheet.LLJLL = true;
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJIJIIJIL = true;
            tuxSheet2.LLJLLL = true;
            tuxSheet2.show(c19egLIZIZ.getSupportFragmentManager(), "poi_order_tax_info_sheet");
        }
        Function0 function0 = (Function0) akS28S0300000_18.l2;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$15(AkS28S0300000_18 akS28S0300000_18, View view) {
        C1180880gpq c1180880gpq = C1180880gpq.LIZ;
        String str = ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).Jo().LL.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI((MyMomentsMainElementsAssem) akS28S0300000_18.l0);
        String aid = ((Aweme) akS28S0300000_18.l1).getAid();
        Integer num = (Integer) akS28S0300000_18.l2;
        c1180880gpq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJ(num, "is_poi_publish_new_user");
        C1180880gpq.LIZLLL(c2344009Gk);
        c2344009Gk.LJIIIIZZ("current_page", "my_year_campaign_landing_page");
        c2344009Gk.LJIIIIZZ("group_id", aid);
        C1180880gpq.LJ(fragmentLJI, "ttls_my_year_campaign_feature_video_click", c2344009Gk.LIZ);
        String aid2 = ((Aweme) akS28S0300000_18.l1).getAid();
        if (aid2 != null) {
            try {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((MyMomentsMainElementsAssem) akS28S0300000_18.l0).getContext(), "//aweme/detail");
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aid2);
                smartRouteBuildRoute.open();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void LIZ$16(AkS28S0300000_18 akS28S0300000_18, View view) {
        String tabCode;
        C19EG c19egLIZIZ;
        AnchorComponentInfo anchorComponentInfo;
        C1187300h0C c1187300h0CBQ2;
        PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str = ((PoiAlbumMixPageFooterAssem) akS28S0300000_18.l0).hp().poiId;
        String str2 = ((AnchorComponentInfo) akS28S0300000_18.l1).iconType;
        String str3 = ((PoiAlbumMixPageFooterAssem) akS28S0300000_18.l0).hp().collectInfo;
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModel = (PoiHeaderTopVideosSharedViewModel) ((PoiAlbumMixPageFooterAssem) akS28S0300000_18.l0).LLJJJ.getValue();
        String str4 = null;
        if (poiHeaderTopVideosSharedViewModel != null && (c1187300h0CBQ2 = poiHeaderTopVideosSharedViewModel.BQ2()) != null && (poiMultiMediumTab = c1187300h0CBQ2.LLILLJJLI) != null) {
            tabCode = poiMultiMediumTab.getTabCode();
        } else {
            tabCode = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ((C197039127h) akS28S0300000_18.l2, null);
        PageFinder pageFinder = (PageFinder) ((PoiAlbumMixPageFooterAssem) akS28S0300000_18.l0).LLJJJIL.getValue();
        c1185430gxB.getClass();
        C1185430gxB.LJIILIIL("album_page", str, str2, str3, tabCode, interfaceC665370Q7zLJ, pageFinder);
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModel2 = (PoiHeaderTopVideosSharedViewModel) ((PoiAlbumMixPageFooterAssem) akS28S0300000_18.l0).LLJJJ.getValue();
        if (poiHeaderTopVideosSharedViewModel2 != null) {
            poiHeaderTopVideosSharedViewModel2.DQ2((PageFinder) ((PoiAlbumMixPageFooterAssem) akS28S0300000_18.l0).LLJJJIL.getValue(), C1558360qeg.LJ((C197039127h) akS28S0300000_18.l2, null), "click");
        }
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        String str5 = ((PoiAlbumMixPageFooterAssem) akS28S0300000_18.l0).hp().poiId;
        String str6 = ((PoiAlbumMixPageFooterAssem) akS28S0300000_18.l0).hp().poiSessionId;
        List<AnchorComponentInfo> list = ((PoiAlbumMixPageFooterAssem) akS28S0300000_18.l0).hp().anchorModuleList;
        if (list != null && (anchorComponentInfo = (AnchorComponentInfo) C13LP.LJJJLL(list)) != null) {
            str4 = anchorComponentInfo.instanceId;
        }
        eventBusLIZLLL.LJIILL(new C1185640gxW(str5, str6, str4, null, 24));
        Context context = ((C197039127h) akS28S0300000_18.l2).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c19egLIZIZ.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$17(AkS28S0300000_18 akS28S0300000_18, View view) {
        PoiCurrentSessionInfo poiCurrentSessionInfoA50;
        C1185600gxS c1185600gxS;
        String str;
        String str2;
        String fromGroupId;
        String collectInfo;
        Integer num;
        String str3;
        String str4;
        String str5;
        String collectInfo2;
        String groupId;
        String str6;
        C1185410gx9 c1185410gx9;
        C1185410gx9 c1185410gx92;
        C1173300gdc c1173300gdcQr0;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiChartCell) akS28S0300000_18.l0);
        if (fragmentLJIIJ != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
            IPoiSlashContextAbility iPoiSlashContextAbility = (IPoiSlashContextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiSlashContextAbility.class, null);
            if (iPoiSlashContextAbility != null) {
                poiCurrentSessionInfoA50 = iPoiSlashContextAbility.a50();
            } else {
                poiCurrentSessionInfoA50 = null;
            }
            InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJIIJ);
            if (interfaceC1181010gq3LIZ != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) != null) {
                c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
            } else {
                c1185600gxS = null;
            }
            PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(C1189060h32.LJIIJ((PoiChartCell) akS28S0300000_18.l0));
            C1184630gvt c1184630gvt = C1184630gvt.LIZ;
            Application applicationLIZ = C1202420hOa.LIZ();
            C03EY c03ey = (C03EY) akS28S0300000_18.l1;
            if (c1185600gxS != null) {
                str = c1185600gxS.LIZ;
            } else {
                str = null;
            }
            ChartInfo chartInfo = ((C1184740gw4) akS28S0300000_18.l2).LLILLJJLI;
            if (chartInfo != null) {
                str2 = chartInfo.regionPoiId;
            } else {
                str2 = null;
            }
            if (c1185600gxS != null && (c1185410gx92 = c1185600gxS.LJFF) != null) {
                fromGroupId = c1185410gx92.getFromGroupId();
            } else {
                fromGroupId = null;
            }
            if (poiDetailResponseLIZ != null) {
                collectInfo = poiDetailResponseLIZ.getCollectInfo();
            } else {
                collectInfo = null;
            }
            ChartInfo chartInfo2 = ((C1184740gw4) akS28S0300000_18.l2).LLILLJJLI;
            if (chartInfo2 != null) {
                num = chartInfo2.chartType;
            } else {
                num = null;
            }
            int iLIZJ = C1175120ggY.LIZJ(num);
            ChartInfo chartInfo3 = ((C1184740gw4) akS28S0300000_18.l2).LLILLJJLI;
            if (chartInfo3 != null) {
                str3 = chartInfo3.chartId;
            } else {
                str3 = null;
            }
            if (poiCurrentSessionInfoA50 != null) {
                str4 = poiCurrentSessionInfoA50.poiSessionId;
            } else {
                str4 = null;
            }
            c1184630gvt.getClass();
            C1184630gvt.LIZ(applicationLIZ, c03ey, str, str2, fromGroupId, collectInfo, iLIZJ, str3, str4, null);
            C1184720gw2 c1184720gw2 = C1184720gw2.LIZ;
            if (c1185600gxS != null) {
                str5 = c1185600gxS.LIZ;
            } else {
                str5 = null;
            }
            if (poiDetailResponseLIZ != null) {
                collectInfo2 = poiDetailResponseLIZ.getCollectInfo();
            } else {
                collectInfo2 = null;
            }
            if (c1185600gxS != null && (c1185410gx9 = c1185600gxS.LJFF) != null) {
                groupId = c1185410gx9.getGroupId();
            } else {
                groupId = null;
            }
            ChartInfo chartInfo4 = ((C1184740gw4) akS28S0300000_18.l2).LLILLJJLI;
            if (chartInfo4 != null) {
                str6 = chartInfo4.chartTopicName;
            } else {
                str6 = null;
            }
            Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ((PoiChartCell) akS28S0300000_18.l0);
            if (fragmentLJIIJ2 != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ2, null);
            }
            c1184720gw2.getClass();
            C1184720gw2.LIZ(str5, collectInfo2, groupId, str6, interfaceC665370Q7zLJFF);
        }
    }

    public static final void LIZ$18(AkS28S0300000_18 akS28S0300000_18, View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        IPoiTagAbility iPoiTagAbility;
        PoiTagCell poiTagCell = (PoiTagCell) akS28S0300000_18.l0;
        Integer numValueOf = Integer.valueOf(((C1179160gn4) akS28S0300000_18.l1).LLILLJJLI.tagType);
        poiTagCell.getClass();
        if (!PoiTagCell.L5(numValueOf)) {
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiTagCell) akS28S0300000_18.l0);
            String strMobPicMode = null;
            if (fragmentLJIIJ != null && (iPoiTagAbility = (IPoiTagAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiTagAbility.class, null)) != null) {
                iPoiTagAbility.DD((C19M4) akS28S0300000_18.l2, ((C1179160gn4) akS28S0300000_18.l1).LLILLJJLI, null, "click_tag");
            }
            PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(C1189060h32.LJIIJ((PoiTagCell) akS28S0300000_18.l0));
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ((PoiTagCell) akS28S0300000_18.l0);
            if (fragmentLJIIJ2 != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ2, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            String strValueOf = String.valueOf(((C1179160gn4) akS28S0300000_18.l1).LLILLJJLI.tagType);
            if (poiDetailResponseLIZ != null) {
                strMobPicMode = poiDetailResponseLIZ.mobPicMode();
            }
            PoiTagCell poiTagCell2 = (PoiTagCell) akS28S0300000_18.l0;
            C1179160gn4 c1179160gn4 = (C1179160gn4) akS28S0300000_18.l1;
            poiTagCell2.getClass();
            String strI5 = PoiTagCell.I5(c1179160gn4);
            PageFinder pageFinderVia = PageFinder.via((PoiTagCell) akS28S0300000_18.l0);
            c1185430gxB.getClass();
            C1185430gxB.LJJIZ(pageFinderVia, interfaceC665370Q7zLJFF, null, strValueOf, strMobPicMode, strI5, false);
        }
    }

    public static final void LIZ$2(AkS28S0300000_18 akS28S0300000_18, View view) {
        C1185340gx2 c1185340gx2 = C1185340gx2.LIZ;
        C1185350gx3 c1185350gx3 = (C1185350gx3) ((PoiAlbumBottomShareAssem) akS28S0300000_18.l0).LLJJI.getValue();
        C19EG c19egLIZ = C724240Sb0.LIZ((PoiAlbumBottomShareAssem) akS28S0300000_18.l0);
        View view2 = ((PoiAlbumBottomShareAssem) akS28S0300000_18.l0).LLJJIII;
        if (view2 == null) {
            view2 = (View) akS28S0300000_18.l1;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiAlbumBottomShareAssem) akS28S0300000_18.l0);
        PageFinder pageFinder = (PageFinder) akS28S0300000_18.l2;
        c1185340gx2.getClass();
        C1185340gx2.LIZIZ(c1185350gx3, c19egLIZ, view2, "bottom_operate_btn", interfaceC665370Q7zLJIIL, pageFinder);
    }

    public static final void LIZ$3(AkS28S0300000_18 akS28S0300000_18, View view) {
        C1185360gx4 c1185360gx4 = C1185360gx4.LIZ;
        C1185370gx5 c1185370gx5 = (C1185370gx5) ((PoiAlbumMixBottomShareAssem) akS28S0300000_18.l0).LLJJI.getValue();
        C19EG c19egLIZ = C724240Sb0.LIZ((PoiAlbumMixBottomShareAssem) akS28S0300000_18.l0);
        View view2 = ((PoiAlbumMixBottomShareAssem) akS28S0300000_18.l0).LLJJIII;
        if (view2 == null) {
            view2 = (View) akS28S0300000_18.l1;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiAlbumMixBottomShareAssem) akS28S0300000_18.l0);
        PageFinder pageFinder = (PageFinder) akS28S0300000_18.l2;
        c1185360gx4.getClass();
        C1185360gx4.LIZIZ(c1185370gx5, c19egLIZ, view2, "bottom_operate_btn", interfaceC665370Q7zLJIIL, pageFinder);
    }

    public static final void LIZ$4(AkS28S0300000_18 akS28S0300000_18, View view) {
        C339190DRl.LIZIZ(((MyMomentsMainElementsAssem) akS28S0300000_18.l0).LLLLJ);
        C339190DRl.LIZIZ(((MyMomentsMainElementsAssem) akS28S0300000_18.l0).LLLLLLLLL);
        ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).Vo(false);
        View view2 = ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).LLLIILIL;
        if (view2 != null) {
            view2.setEnabled(true);
        }
        MyMomentsMainElementsAssem myMomentsMainElementsAssem = (MyMomentsMainElementsAssem) akS28S0300000_18.l0;
        View view3 = myMomentsMainElementsAssem.LLLIILIL;
        if (view3 != null) {
            C786410Ut5.I7(new AkS28S0300000_18((Context) akS28S0300000_18.l2, myMomentsMainElementsAssem, (MyMomentsData) akS28S0300000_18.l1, 5), view3);
        }
        ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).Zo();
    }

    public static final void LIZ$5(AkS28S0300000_18 akS28S0300000_18, View view) {
        ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).Ho(true, Boolean.TRUE, (MyMomentsData) akS28S0300000_18.l1, (Context) akS28S0300000_18.l2);
    }

    public static final void LIZ$6(AkS28S0300000_18 akS28S0300000_18, View view) {
        Integer num;
        HashtagInfo hashtagInfo;
        C1180880gpq c1180880gpq = C1180880gpq.LIZ;
        String str = ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).Jo().LL.LIZ;
        Integer num2 = ((MyMomentsData) akS28S0300000_18.l1).userType;
        Fragment fragmentLJJJJLL = FragmentManager.LJJJJLL((TuxTextView) akS28S0300000_18.l2);
        c1180880gpq.getClass();
        C1180880gpq.LIZ(fragmentLJJJJLL, num2, str);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((TuxTextView) akS28S0300000_18.l2).getContext(), "aweme://poi/add_poi_campaign/add_location");
        smartRouteBuildRoute.withParam("enter_from", "my_year_campaign_landing_page");
        MyMomentsData myMomentsData = (MyMomentsData) akS28S0300000_18.l1;
        Long l = null;
        if (myMomentsData != null) {
            num = myMomentsData.userType;
        } else {
            num = null;
        }
        smartRouteBuildRoute.withParam("user_type", num);
        smartRouteBuildRoute.withParam("hide_shoot", ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).Jo().LL.LIZLLL);
        smartRouteBuildRoute.withParam("from_user_id", ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).Jo().LL.LIZIZ);
        MyMomentsData myMomentsData2 = (MyMomentsData) akS28S0300000_18.l1;
        if (myMomentsData2 != null && (hashtagInfo = myMomentsData2.hashtagInfo) != null) {
            l = hashtagInfo.hashtagId;
        }
        smartRouteBuildRoute.withParam("challenge_id", String.valueOf(l));
        smartRouteBuildRoute.open();
    }

    public static final void LIZ$7(AkS28S0300000_18 akS28S0300000_18, View view) {
        Integer num;
        Integer num2;
        HashtagInfo hashtagInfo;
        C1180880gpq c1180880gpq = C1180880gpq.LIZ;
        String str = ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).Jo().LL.LIZ;
        MyMomentsData myMomentsData = (MyMomentsData) akS28S0300000_18.l1;
        Long l = null;
        if (myMomentsData != null) {
            num = myMomentsData.userType;
        } else {
            num = null;
        }
        Fragment fragmentLJJJJLL = FragmentManager.LJJJJLL((FrameLayout) akS28S0300000_18.l2);
        c1180880gpq.getClass();
        C1180880gpq.LIZ(fragmentLJJJJLL, num, str);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((FrameLayout) akS28S0300000_18.l2).getContext(), "aweme://poi/add_poi_campaign/add_location");
        smartRouteBuildRoute.withParam("enter_from", "my_year_campaign_landing_page");
        MyMomentsData myMomentsData2 = (MyMomentsData) akS28S0300000_18.l1;
        if (myMomentsData2 != null) {
            num2 = myMomentsData2.userType;
        } else {
            num2 = null;
        }
        smartRouteBuildRoute.withParam("user_type", num2);
        smartRouteBuildRoute.withParam("hide_shoot", ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).Jo().LL.LIZLLL);
        smartRouteBuildRoute.withParam("from_user_id", ((MyMomentsMainElementsAssem) akS28S0300000_18.l0).Jo().LL.LIZIZ);
        MyMomentsData myMomentsData3 = (MyMomentsData) akS28S0300000_18.l1;
        if (myMomentsData3 != null && (hashtagInfo = myMomentsData3.hashtagInfo) != null) {
            l = hashtagInfo.hashtagId;
        }
        smartRouteBuildRoute.withParam("challenge_id", String.valueOf(l));
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$8(irm.AkS28S0300000_18 r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS28S0300000_18.LIZ$8(irm.AkS28S0300000_18, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$9(irm.AkS28S0300000_18 r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS28S0300000_18.LIZ$9(irm.AkS28S0300000_18, android.view.View):void");
    }

    public AkS28S0300000_18(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
