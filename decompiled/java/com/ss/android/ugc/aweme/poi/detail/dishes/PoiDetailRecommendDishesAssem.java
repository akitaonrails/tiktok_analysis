package com.ss.android.ugc.aweme.poi.detail.dishes;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0IDF;
import X.C1174850gg7;
import X.C1175130ggZ;
import X.C1175440gh4;
import X.C1181030gq5;
import X.C1182380gsG;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1185610gxT;
import X.C1189060h32;
import X.C1195630hDd;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C339190DRl;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS153S0100000_18;
import Y.AsS7S0101000_18;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS32S0001000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailRecommendDishesAssem extends PoiDetailBaseAssem<PoiDetailApi.PoiRecommendDishesGroupInfo> implements IRecommendDishesAbility {
    public final C736950SvV LLJJL;
    public C1175130ggZ LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public PoiDetailApi.PoiRecommendDishesGroupInfo LLJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3h;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final PoiRecommendDishesVM Ep() {
        return (PoiRecommendDishesVM) this.LLJJL.getValue();
    }

    public final boolean Fp() {
        ArrayList<PoiDetailApi.RecommendedDish> recommendDishes;
        PoiDetailApi.RecommendedDish recommendedDish;
        List<UrlModel> images;
        PoiDetailApi.PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo = this.LLJLL;
        if (poiRecommendDishesGroupInfo == null || (recommendDishes = poiRecommendDishesGroupInfo.getRecommendDishes()) == null || (recommendedDish = (PoiDetailApi.RecommendedDish) C13LP.LJJJLL(recommendDishes)) == null || (images = recommendedDish.getImages()) == null) {
            return false;
        }
        return !images.isEmpty();
    }

    public PoiDetailRecommendDishesAssem() {
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1117);
        this.LLJJL = new C736950SvV(C13LE.LIZ(PoiRecommendDishesVM.class), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(387), new AwS562S0100000_18((AbstractC738140SxQ) this, 1116), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1115));
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.dishes.IRecommendDishesAbility
    public final boolean FE1() {
        PoiDetailApi.PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo = (PoiDetailApi.PoiRecommendDishesGroupInfo) C1174850gg7.LIZJ(this);
        return poiRecommendDishesGroupInfo != null && poiRecommendDishesGroupInfo.isAiSummaryRecommendDishes$poi_release();
    }

    public final String Gp() {
        return FE1() ? "ai_recommend_dishes" : "dishes";
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final void fm1() {
        super.fm1();
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String poiId = ((C1185610gxT) mp()).getPoiId();
        mp().getClass();
        PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        String collectInfo = poiDetailResponseLp != null ? poiDetailResponseLp.getCollectInfo() : null;
        String strGp = Gp();
        boolean zFp = Fp();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PageFinder pageFinder = (PageFinder) this.LLJLILLLLZIIL.getValue();
        c1185430gxB.getClass();
        C1185430gxB.LJJLIIIJ(poiId, collectInfo, strGp, zFp, interfaceC665370Q7zLJIIL, pageFinder);
        if (FE1()) {
            C01GW c01gw = C1181030gq5.LIZ;
            C1181030gq5.LIZIZ(this, BK2(), "ttls_highlight_module_show", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.dishes.IRecommendDishesAbility
    public final String getPoiId() {
        return ((C1185610gxT) mp()).getPoiId();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IRecommendDishesAbility.class, null, null);
        }
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = "";
        }
        C1175440gh4.LIZ(this, strLJFF, null, 10);
        pH(new AwS597S0100000_18(this, 327));
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IRecommendDishesAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.dishes.IRecommendDishesAbility
    public final int x00() {
        ArrayList<PoiDetailApi.RecommendedDish> recommendDishes;
        PoiDetailApi.PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo = (PoiDetailApi.PoiRecommendDishesGroupInfo) C1174850gg7.LIZJ(this);
        if (poiRecommendDishesGroupInfo == null || (recommendDishes = poiRecommendDishesGroupInfo.getRecommendDishes()) == null) {
            return 0;
        }
        return recommendDishes.size();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        C1195630hDd c1195630hDd;
        String moreButtonText;
        C1195630hDd tvViewAll;
        String moreButtonText2;
        C1195630hDd tvViewAll2;
        String categoryTitle;
        PoiDetailApi.PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo = (PoiDetailApi.PoiRecommendDishesGroupInfo) baseComponentData;
        super.CG1(poiRecommendDishesGroupInfo);
        if (!Intrinsics.LJFF(this.LLJLL, poiRecommendDishesGroupInfo)) {
            this.LLJLL = poiRecommendDishesGroupInfo;
            PoiRecommendDishesVM poiRecommendDishesVMEp = Ep();
            poiRecommendDishesVMEp.getClass();
            if (poiRecommendDishesGroupInfo != null && poiRecommendDishesGroupInfo.hasRecommendDishes$poi_release()) {
                poiRecommendDishesVMEp.setState(new AwS597S0100000_18(poiRecommendDishesGroupInfo, 704));
            } else {
                poiRecommendDishesVMEp.setState(AFwS256S0000000_18.get$arr$(862));
            }
            String categoryTitle2 = null;
            if (poiRecommendDishesGroupInfo != null && (categoryTitle = poiRecommendDishesGroupInfo.getCategoryTitle()) != null && categoryTitle.length() != 0) {
                TuxTextView tuxTextView = this.LLJL;
                if (tuxTextView != null) {
                    C339190DRl.LIZLLL(tuxTextView);
                }
                TuxTextView tuxTextView2 = this.LLJL;
                if (tuxTextView2 != null) {
                    if (poiRecommendDishesGroupInfo != null) {
                        categoryTitle2 = poiRecommendDishesGroupInfo.getCategoryTitle();
                    }
                    tuxTextView2.setText(categoryTitle2);
                }
            } else {
                TuxTextView tuxTextView3 = this.LLJL;
                if (tuxTextView3 != null) {
                    C339190DRl.LIZIZ(tuxTextView3);
                }
            }
            if (poiRecommendDishesGroupInfo != null && (moreButtonText = poiRecommendDishesGroupInfo.getMoreButtonText()) != null && moreButtonText.length() != 0) {
                C1175130ggZ c1175130ggZ = this.LLJJLIIIJLLLLLLLZ;
                if (c1175130ggZ != null && (tvViewAll2 = c1175130ggZ.getTvViewAll()) != null) {
                    C339190DRl.LIZLLL(tvViewAll2);
                }
                C1175130ggZ c1175130ggZ2 = this.LLJJLIIIJLLLLLLLZ;
                String str = "";
                if (c1175130ggZ2 != null && (tvViewAll = c1175130ggZ2.getTvViewAll()) != null) {
                    if (poiRecommendDishesGroupInfo == null || (moreButtonText2 = poiRecommendDishesGroupInfo.getMoreButtonText()) == null) {
                        moreButtonText2 = "";
                    }
                    tvViewAll.LIZLLL(moreButtonText2);
                }
                C1175130ggZ c1175130ggZ3 = this.LLJJLIIIJLLLLLLLZ;
                if (c1175130ggZ3 != null) {
                    String strLJFF = C1174850gg7.LJFF(this);
                    if (strLJFF != null) {
                        str = strLJFF;
                    }
                    C1175130ggZ.LIZ(c1175130ggZ3, str);
                }
                C1175130ggZ c1175130ggZ4 = this.LLJJLIIIJLLLLLLLZ;
                if (c1175130ggZ4 != null) {
                    c1175130ggZ4.setStandardDebounceOnClickListener(new ACListenerS153S0100000_18(this, 149));
                }
            } else {
                C1175130ggZ c1175130ggZ5 = this.LLJJLIIIJLLLLLLLZ;
                if (c1175130ggZ5 != null && (c1195630hDd = c1175130ggZ5.LLILZ) != null) {
                    C339190DRl.LIZIZ(c1195630hDd);
                }
            }
        }
        if (poiRecommendDishesGroupInfo.getNeedShowBottomDivider()) {
            this.LLJJJIL = true;
            View view = this.LLJJIJIIJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.dishes.IRecommendDishesAbility
    public final void K7(String str) {
        String collectInfo;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String poiId = ((C1185610gxT) mp()).getPoiId();
        mp().getClass();
        PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        if (poiDetailResponseLp != null) {
            collectInfo = poiDetailResponseLp.getCollectInfo();
        } else {
            collectInfo = null;
        }
        String strGp = Gp();
        boolean zFp = Fp();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PageFinder pageFinder = (PageFinder) this.LLJLILLLLZIIL.getValue();
        c1185430gxB.getClass();
        C1185430gxB.LJJLI(pageFinder, interfaceC665370Q7zLJIIL, poiId, collectInfo, strGp, str, zFp);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJL = (TuxTextView) view.findViewById(R.id.tv_sub_title);
        this.LLJJLIIIJLLLLLLLZ = (C1175130ggZ) view.findViewById(R.id.y3o);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJLIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(RecommendDishesCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJLIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setOrientation(0);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJLIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.addItemDecoration(new C0IDF(this, 1));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJLIL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.addOnScrollListener(new AsS7S0101000_18(this, 0));
        }
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0gsO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1182480gsQ) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 110), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0gsM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1182480gsQ) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 111), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0gsN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1182480gsQ) obj).LLILZIL;
            }
        }, null, new AwS620S0100000_6(this, 44), 6);
        String poiId = ((C1185610gxT) mp()).getPoiId();
        if (poiId != null) {
            PoiRecommendDishesVM poiRecommendDishesVMEp = Ep();
            poiRecommendDishesVMEp.getClass();
            poiRecommendDishesVMEp.setState(new AwS69S1000000_18(poiId, 9));
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.dishes.IRecommendDishesAbility
    public final void PN2(int i, SmartImageView smartImageView, PoiDetailApi.RecommendedDish recommendedDish) {
        String collectInfo;
        String str;
        PoiGalleryAnchorData poiGalleryAnchorData;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String poiId = ((C1185610gxT) mp()).getPoiId();
        mp().getClass();
        PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        String collectInfo2 = null;
        if (poiDetailResponseLp != null) {
            collectInfo = poiDetailResponseLp.getCollectInfo();
        } else {
            collectInfo = null;
        }
        String strGp = Gp();
        boolean zFp = Fp();
        String dishId = recommendedDish.getDishId();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PageFinder pageFinder = (PageFinder) this.LLJLILLLLZIIL.getValue();
        c1185430gxB.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJIIL);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", poiId);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", strGp);
        if (zFp) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "has_image", str);
        C1189060h32.LJJIFFI(c2344009Gk, "content_id", dishId);
        C1189060h32.LIZJ(c2344009Gk, collectInfo);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_poi_struct_content", map, c1185050gwZ);
        ArrayList<PoiDetailApi.RecommendedDish> arrayList = Ep().getState().LLILLJJLI;
        if (arrayList != null && !arrayList.isEmpty()) {
            PoiRecommendDishesVM poiRecommendDishesVMEp = Ep();
            poiRecommendDishesVMEp.getClass();
            poiRecommendDishesVMEp.setState(new AwS32S0001000_18(i, 4));
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(smartImageView.getContext(), "aweme://poi/dishes/detail");
            ArrayList arrayList2 = new ArrayList();
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 == i) {
                    int[] iArr = new int[2];
                    smartImageView.getLocationOnScreen(iArr);
                    poiGalleryAnchorData = new PoiGalleryAnchorData(smartImageView.getWidth(), smartImageView.getHeight(), iArr[0], iArr[1], 240);
                } else {
                    poiGalleryAnchorData = null;
                }
                arrayList2.add(poiGalleryAnchorData);
            }
            smartRouteBuildRoute.withParam("poi_anchor_data", arrayList2);
            String strGp2 = Gp();
            String poiId2 = ((C1185610gxT) mp()).getPoiId();
            mp().getClass();
            PoiListApi.PoiDetailResponse poiDetailResponseLp2 = lp();
            if (poiDetailResponseLp2 != null) {
                collectInfo2 = poiDetailResponseLp2.getCollectInfo();
            }
            smartRouteBuildRoute.withParam("mob_data", new PoiInnerPageMobData("poi_detail", strGp2, poiId2, collectInfo2, 496));
            PoiCommonMobParams poiCommonMobParamsLJ = C1182380gsG.LJ(C1558520qew.LJIIL(this));
            if (poiCommonMobParamsLJ != null) {
                smartRouteBuildRoute.withParam("poi_common_mob_params", poiCommonMobParamsLJ);
            }
            smartRouteBuildRoute.open();
        }
    }
}
