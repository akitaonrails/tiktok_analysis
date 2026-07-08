package com.ss.android.ugc.aweme.api.component.photomode;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0SCL;
import X.C0SPE;
import X.C1001650cAl;
import X.C1001930cBD;
import X.C1001940cBE;
import X.C1001950cBF;
import X.C1001970cBH;
import X.C1002030cBN;
import X.C1002040cBO;
import X.C1002060cBQ;
import X.C1009740cNo;
import X.C1012040cRW;
import X.C1022030chd;
import X.C1022290ci3;
import X.C1077480e94;
import X.C11S5;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C1524805y2;
import X.C1558520qew;
import X.C1832707Ft;
import X.C2126108Up;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C307430C3h;
import X.C390701fV;
import X.C390801fW;
import X.C452501pT;
import X.C655610Pnb;
import X.C687700QyG;
import X.C690450R6l;
import X.C719510SKf;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C844470XAv;
import X.C960203pA;
import X.EnumC1002140cBY;
import X.EnumC1019010ccl;
import X.InterfaceC1001990cBJ;
import X.InterfaceC1008930cMV;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC689860R4e;
import X.InterfaceC719460SKa;
import X.InterfaceC719500SKe;
import X.InterfaceC988260bpA;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS27S0101000_16;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoModeAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.component.photomode.CommercePhotoModeAssem;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.AdCarouselColorInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CarouselColorImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.web.experiment.IABLoadingFormatConfigExp;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommercePhotoModeAssem extends BaseCellLogicComponent<CommercePhotoModeAssem> implements ICommercePhotoModeAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLLFFI = 0;
    public C1002030cBN LLJJL;
    public AnonymousClass0956 LLJJLIIIJLLLLLLLZ;
    public Aweme LLJLILLLLZIIL;
    public boolean LLJZ;
    public int LLJZIJLIL;
    public C390701fV LLL;
    public boolean LLLF;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 72));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 69));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 73));
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(44));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(45));
    public final C01GW LLJJJJ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS252S0000000_16.get$arr$(92));
    public final C01GW LLJJJJJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS252S0000000_16.get$arr$(93));
    public final C1001930cBD LLJJJJLIIL = new C1001930cBD(new AwS590S0100000_11(this, 40));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 68));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 73));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 70));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 71));
    public final C1001970cBH LLJLLL = new C1001970cBH(new InterfaceC1001990cBJ() { // from class: X.0cBG
        @Override // X.InterfaceC1001990cBJ
        public final C1002030cBN getLogger() {
            return this.LIZ.LLJJL;
        }
    });
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 74));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(), new C2217381BqS() { // from class: X.0RTy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(13), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(), new C2217381BqS() { // from class: X.0RTz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(14), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(), new C2217381BqS() { // from class: X.0RTx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJLILLLLZIIL;
            }
        }, null, AFwS300S0000000_16.get$arr$(15), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJJIL.getValue(), new C2217381BqS() { // from class: X.0c3l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(16), 4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 905594967) {
            return null;
        }
        return this;
    }

    public final IPhotoSlidesAbility Bo() {
        return (IPhotoSlidesAbility) this.LLJJIJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoModeAbility
    public final void g00() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).baseFeedPageParams;
        Integer numValueOf = baseFeedPageParams != null ? Integer.valueOf(baseFeedPageParams.awemeFromPage) : null;
        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null);
        if (iAdPhotoModeService != null) {
            iAdPhotoModeService.LJJI(EnumC1002140cBY.SLIDE_GUIDE);
        }
        IAdPhotoModeService iAdPhotoModeService2 = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
        if (iAdPhotoModeService2 == null || !iAdPhotoModeService2.LJIJI()) {
            IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
            if (iAdSceneService == null || iAdSceneService.LIZIZ() == null) {
                return;
            }
            Context context = getContext();
            C724270Sb3 c724270Sb32 = this.LLJI;
            C1022290ci3.LJIILLIIL(context, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType);
            return;
        }
        C1012040cRW.LIZIZ().LJIIIIZZ = 40;
        C724270Sb3 c724270Sb33 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).mEventType;
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        C690450R6l c690450R6l = new C690450R6l(str);
        Context context2 = getContext();
        int iHashCode = context2 != null ? context2.hashCode() : 0;
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        C0SPE c0spe = new C0SPE(iHashCode, 0);
        if (C307430C3h.LIZ("scroll_to_slide") && ((IAdPhotoModeService) this.LLJJJ.getValue()).LJII(this.LLJLILLLLZIIL)) {
            c0spe.LIZJ = "scroll_to_slide";
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        C1440005kM.LIZ(c690450R6l);
        C1440005kM.LIZ(c0spe);
        IAdSceneService iAdSceneService2 = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (iAdSceneService2 == null || iAdSceneService2.LIZIZ() == null) {
            return;
        }
        C1022290ci3.LJIIJJI(getContext(), this.LLJLILLLLZIIL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) this.LLJJIJIL.getValue();
        if (iPhotoSlidesEventDispatchAbility != null) {
            iPhotoSlidesEventDispatchAbility.b3((C1077480e94) this.LLLFF.getValue());
        }
        this.LLJJL = null;
        C1001940cBE c1001940cBE = (C1001940cBE) this.LLJLIL.getValue();
        if (c1001940cBE != null) {
            c1001940cBE.LIZLLL = false;
            c1001940cBE.LJFF = false;
            c1001940cBE.LJIIJ = null;
            c1001940cBE.LJI = false;
            c1001940cBE.LJIILL.clear();
            C1524805y2.LIZIZ(0L, new AwS560S0100000_16(c1001940cBE, 640));
        }
        this.LLJLILLLLZIIL = null;
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) this.LLJJIJIL.getValue();
        if (iPhotoSlidesEventDispatchAbility2 != null) {
            iPhotoSlidesEventDispatchAbility2.lv0(null);
        }
        this.LLLF = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C719510SKf.LIZ("onResume");
        if (C1832707Ft.LIZ()) {
            IPhotoSlidesAbility iPhotoSlidesAbilityBo = Bo();
            Fo(iPhotoSlidesAbilityBo != null ? iPhotoSlidesAbilityBo.LJLIL() : null, 0L);
        }
    }

    @Override // X.C0S7Z
    public final /* bridge */ /* synthetic */ C1001970cBH c1() {
        return this.LLJLLL;
    }

    public final void Eo(int i) {
        Object obj;
        Aweme aweme;
        C1001930cBD c1001930cBD;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        this.LLJJJJLIIL.LIZ = i;
        int iLJI = C1009740cNo.LJI(this.LLJLILLLLZIIL);
        int i2 = i * iLJI;
        int i3 = iLJI + i2;
        while (true) {
            obj = null;
            photoModeImageUrlModel = null;
            photoModeImageUrlModel = null;
            PhotoModeImageUrlModel photoModeImageUrlModel = null;
            if (i2 >= i3) {
                break;
            }
            C1002030cBN c1002030cBN = this.LLJJL;
            if (c1002030cBN != null) {
                Object obj2 = c1002030cBN.getProvidedContexts().get(Aweme.class);
                if (obj2 instanceof Aweme) {
                    aweme = (Aweme) obj2;
                } else {
                    aweme = null;
                }
                Object obj3 = c1002030cBN.getProvidedContexts().get(C1001930cBD.class);
                if (obj3 instanceof C1001930cBD) {
                    c1001930cBD = (C1001930cBD) obj3;
                } else {
                    c1001930cBD = null;
                }
                if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i2, imageList);
                }
                C1002060cBQ.LIZ.getClass();
                c1002030cBN.logAd(C1002060cBQ.LIZIZ, new C1002040cBO(i2, c1001930cBD, aweme, c1002030cBN, photoModeImageUrlModel));
            }
            i2++;
        }
        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) this.LLJJJ.getValue();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        iAdPhotoModeService.LJJIIZ(((VideoItemParams) obj).getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        C390701fV c390701fV = this.LLL;
        if (c390701fV != null) {
            c390701fV.LIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        C390701fV c390701fV = this.LLL;
        if (c390701fV != null) {
            c390701fV.LIZLLL(this.LLJZIJLIL, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoModeAbility
    public final void np1(C390801fW c390801fW) {
        C390701fV c390701fV = this.LLL;
        if (c390701fV != null) {
            c390701fV.LIZIZ(c390801fW);
        }
        C390701fV c390701fV2 = this.LLL;
        if (c390701fV2 != null) {
            c390701fV2.LJ(this.LLJZIJLIL, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0SKg] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImage> photoModeImageList;
        AwemeRawAd awemeRawAd;
        AdCarouselColorInfo carouselColorInfo;
        List<CarouselColorImage> images;
        int iIntValue;
        int i;
        boolean z;
        int iLIZJ;
        int iLIZJ2;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLJLILLLLZIIL = videoItemParams2.getAweme();
        int size = 0;
        this.LLLF = false;
        this.LLJJL = new C1002030cBN(videoItemParams2.getAweme(), this.LLJJJJLIIL);
        C719510SKf.LIZ("onBind");
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) this.LLJJIJIL.getValue();
        if (iPhotoSlidesEventDispatchAbility != null) {
            iPhotoSlidesEventDispatchAbility.LLJJI((C1077480e94) this.LLLFF.getValue());
        }
        InterfaceC689860R4e interfaceC689860R4eK9 = null;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
        if (iVideoCellAbility != null) {
            interfaceC689860R4eK9 = iVideoCellAbility.K9();
        }
        C1001940cBE c1001940cBE = (C1001940cBE) this.LLJLIL.getValue();
        if (c1001940cBE != null) {
            ICommercePhotoSlideAbility iCommercePhotoSlideAbility = (ICommercePhotoSlideAbility) this.LLJJIJIIJIL.getValue();
            c1001940cBE.LIZLLL = false;
            Aweme aweme = videoItemParams2.getAweme();
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (carouselColorInfo = awemeRawAd.getCarouselColorInfo()) != null && (images = carouselColorInfo.getImages()) != null) {
                Integer changeColorSeparate = carouselColorInfo.getChangeColorSeparate();
                if (changeColorSeparate != null) {
                    iIntValue = changeColorSeparate.intValue();
                } else {
                    iIntValue = 0;
                }
                c1001940cBE.LJII = iIntValue;
                if (AwemeExtKt.isAdTraffic(videoItemParams2.getAweme()) && !images.isEmpty() && (i = c1001940cBE.LJII) > 0) {
                    c1001940cBE.LJIIIIZZ = 1.0f / i;
                    c1001940cBE.LJIIIZ = iCommercePhotoSlideAbility;
                    c1001940cBE.LJIIJ = interfaceC689860R4eK9;
                    Context contextLIZ = c1001940cBE.LIZ;
                    if (contextLIZ == null) {
                        C844470XAv.LIZ.getClass();
                        contextLIZ = C844470XAv.LIZ();
                    }
                    int iLJI = C1022030chd.LJI(contextLIZ, videoItemParams2.getAweme());
                    int iLIZ = C960203pA.LIZ(R.attr.ee, contextLIZ);
                    if (!c1001940cBE.LJFF) {
                        c1001940cBE.LJFF = true;
                        c1001940cBE.LJIIJJI.clear();
                        c1001940cBE.LJIIL.clear();
                        c1001940cBE.LJIILIIL.clear();
                        c1001940cBE.LJIILJJIL.clear();
                        for (int i2 = 0; i2 < images.size(); i2++) {
                            CarouselColorImage carouselColorImage = (CarouselColorImage) ListProtector.get(images, i2);
                            String topBackGroundColor = carouselColorImage.getTopBackGroundColor();
                            if (topBackGroundColor != null && topBackGroundColor.length() != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            String str = "#000000";
                            if (z) {
                                topBackGroundColor = "#000000";
                            }
                            String bottomBackGroundColor = carouselColorImage.getBottomBackGroundColor();
                            if (bottomBackGroundColor != null && bottomBackGroundColor.length() != 0) {
                                str = bottomBackGroundColor;
                            }
                            String ctaBackGroundColor = carouselColorImage.getCtaBackGroundColor();
                            String ctaTextColor = carouselColorImage.getCtaTextColor();
                            c1001940cBE.LJIILIIL.add(Integer.valueOf(C1001940cBE.LIZJ(topBackGroundColor)));
                            c1001940cBE.LJIILJJIL.add(Integer.valueOf(C1001940cBE.LIZJ(str)));
                            ArrayList<Integer> arrayList = c1001940cBE.LJIIJJI;
                            if (ctaBackGroundColor != null && ctaBackGroundColor.length() != 0) {
                                iLIZJ = C1001940cBE.LIZJ(ctaBackGroundColor);
                            } else {
                                iLIZJ = iLJI;
                            }
                            arrayList.add(Integer.valueOf(iLIZJ));
                            ArrayList<Integer> arrayList2 = c1001940cBE.LJIIL;
                            if (ctaTextColor != null && ctaTextColor.length() != 0) {
                                iLIZJ2 = C1001940cBE.LIZJ(ctaTextColor);
                            } else {
                                iLIZJ2 = iLIZ;
                            }
                            arrayList2.add(Integer.valueOf(iLIZJ2));
                        }
                        if (c1001940cBE.LJIILIIL.size() >= 2 && c1001940cBE.LJII > 0) {
                            try {
                                C2126108Up.LJ.execute(new ARunnableS116S0100000_16(c1001940cBE, 106));
                            } catch (NullPointerException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                    c1001940cBE.LIZLLL = true;
                }
            }
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) this.LLJJIJIL.getValue();
        if (iPhotoSlidesEventDispatchAbility2 != 0) {
            iPhotoSlidesEventDispatchAbility2.lv0(new InterfaceC719500SKe() { // from class: X.0SKg
                @Override // X.InterfaceC719500SKe
                public final void n5(int i3, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC719500SKe
                public final void u6(SlidesImageLoadParams slidesImageLoadParams) {
                }

                @Override // X.InterfaceC719500SKe
                public final void p2(SlidesImageLoadParams slidesImageLoadParams) {
                    InterfaceC719460SKa interfaceC719460SKaLJLIL;
                    IPhotoSlidesAbility iPhotoSlidesAbilityBo = this.LL.Bo();
                    if (iPhotoSlidesAbilityBo != null && iPhotoSlidesAbilityBo.xt0() == slidesImageLoadParams.index) {
                        CommercePhotoModeAssem commercePhotoModeAssem = this.LL;
                        IPhotoSlidesAbility iPhotoSlidesAbilityBo2 = commercePhotoModeAssem.Bo();
                        if (iPhotoSlidesAbilityBo2 != null) {
                            interfaceC719460SKaLJLIL = iPhotoSlidesAbilityBo2.LJLIL();
                        } else {
                            interfaceC719460SKaLJLIL = null;
                        }
                        commercePhotoModeAssem.Fo(interfaceC719460SKaLJLIL, 0L);
                    }
                }
            });
        }
        C390701fV c390701fV = this.LLL;
        if (c390701fV != null) {
            c390701fV.LIZJ();
        }
        Aweme aweme2 = this.LLJLILLLLZIIL;
        if (aweme2 != null && (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) != null && (photoModeImageList = photoModeImageInfo.getPhotoModeImageList()) != null) {
            size = photoModeImageList.size();
        }
        this.LLL = new C390701fV(size, new AwS595S0100000_16(this, 194));
        InterfaceC988260bpA interfaceC988260bpALIZIZ = C655610Pnb.LIZIZ.LIZIZ(this.LLJLILLLLZIIL);
        if (interfaceC988260bpALIZIZ != null) {
            interfaceC988260bpALIZIZ.y70();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoModeAbility
    public final void sx2(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((IAdPhotoModeService) this.LLJJJ.getValue()).LJIJ(EnumC1019010ccl.PICTURE);
        }
    }

    public final void Co(int i, boolean z) {
        int iAl;
        String aid;
        InterfaceC719460SKa interfaceC719460SKaLJLIL;
        long j;
        int iMax;
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPhotoPageSelected: index -> ");
        sbLIZ.append(i);
        sbLIZ.append(", isFirst -> ");
        sbLIZ.append(z);
        C719510SKf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJZIJLIL = i;
        IPhotoSlidesAbility iPhotoSlidesAbilityBo = Bo();
        if (iPhotoSlidesAbilityBo != null) {
            iAl = iPhotoSlidesAbilityBo.Al();
        } else {
            iAl = Integer.MAX_VALUE;
        }
        if (i < iAl) {
            ((IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class)).LJJIL(i);
        }
        Aweme aweme2 = this.LLJLILLLLZIIL;
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        C1440005kM.LIZ(new C1001950cBF(aid, z, i));
        IPhotoSlidesAbility iPhotoSlidesAbilityBo2 = Bo();
        Object obj = null;
        if (iPhotoSlidesAbilityBo2 != null) {
            interfaceC719460SKaLJLIL = iPhotoSlidesAbilityBo2.LJLIL();
        } else {
            interfaceC719460SKaLJLIL = null;
        }
        if (z) {
            j = 250;
        } else {
            j = 0;
        }
        Fo(interfaceC719460SKaLJLIL, j);
        C390701fV c390701fV = this.LLL;
        if (c390701fV != null) {
            c390701fV.LJ(i, 0L);
        }
        IPhotoSlidesAbility iPhotoSlidesAbilityBo3 = Bo();
        if (iPhotoSlidesAbilityBo3 != null) {
            int iAl2 = iPhotoSlidesAbilityBo3.Al();
            int i2 = IABLoadingFormatConfigExp.LJI;
            if (i2 != 0 && iAl2 > 0) {
                if (i2 > 0) {
                    iMax = Math.min(iAl2 - 1, i2 - 1);
                } else {
                    iMax = Math.max(0, iAl2 + i2);
                }
                if (iMax < iAl2 && iMax >= 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preloadGecko: index -> ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" pullIndex -> ");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(" tPullIndex-> ");
                    sbLIZ2.append(iMax);
                    C719510SKf.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (iMax == i && (aweme = this.LLJLILLLLZIIL) != null && aweme.getAwemeType() == 150) {
                        C11S5.LIZ().LIZIZ(new ARunnableS27S0101000_16(i, this, 3));
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "productSelected");
        jSONObject.put("productIndex", i);
        IFeedService iFeedService = (IFeedService) this.LLJJJIL.getValue();
        Context context = getContext();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = iFeedService.LIZJ(context, this.LLJLILLLLZIIL, ((VideoItemParams) obj).mEventType, true);
        if (interfaceC1008930cMVLIZJ != null) {
            interfaceC1008930cMVLIZJ.LJIILL(new C0SCL(jSONObject));
        }
    }

    public final void Fo(InterfaceC719460SKa interfaceC719460SKa, long j) {
        FrameLayout frameLayoutLJ;
        if (interfaceC719460SKa == null || (frameLayoutLJ = interfaceC719460SKa.LJ()) == null) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJLIIIJLLLLLLLZ = C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C1001650cAl(j, interfaceC719460SKa, this, frameLayoutLJ, null), 3);
    }
}
