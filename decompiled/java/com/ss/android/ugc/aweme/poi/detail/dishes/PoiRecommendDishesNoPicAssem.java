package com.ss.android.ugc.aweme.poi.detail.dishes;

import X.C019F;
import X.C01GW;
import X.C0IDG;
import X.C0Q9R;
import X.C0XPD;
import X.C1174850gg7;
import X.C1175440gh4;
import X.C1185430gxB;
import X.C1185610gxT;
import X.C1208950hZ7;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20633915of;
import X.C2217381BqS;
import X.C2255108sX;
import X.C291001Au;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C848230XPh;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS7S0101000_18;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PoiDetailDataUpdateAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendDishesNoPicAssem extends PoiDetailBaseAssem<PoiDetailApi.PoiRecommendDishesGroupInfo> implements IRecommendDishesNoPicAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final AssemVMLazy LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJL;
    public final C01GW LLJLIL;
    public PoiDetailApi.PoiRecommendDishesGroupInfo LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRecommendDishesNoPicAssem.class, "dishesVM", "getDishesVM()Lcom/ss/android/ugc/aweme/poi/detail/dishes/PoiRecommendDishesVM;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiRecommendDishesNoPicAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRecommendDishesVM.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 546), AFwS256S0000000_18.get$arr$(394), null, true);
        this.LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1121));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3i;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final PoiRecommendDishesVM Ep() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (PoiRecommendDishesVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IRecommendDishesNoPicAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IRecommendDishesNoPicAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final void up() {
        if (sp()) {
            return;
        }
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = "";
        }
        C1175440gh4.LIZ(this, strLJFF, null, 10);
        pH(new AwS597S0100000_18(this, 328));
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String poiId = ((C1185610gxT) mp()).getPoiId();
        mp().getClass();
        PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        String collectInfo = poiDetailResponseLp != null ? poiDetailResponseLp.getCollectInfo() : null;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PageFinder pageFinder = (PageFinder) this.LLJLIL.getValue();
        c1185430gxB.getClass();
        C1185430gxB.LJJLIIIJ(poiId, collectInfo, "dishes", false, interfaceC665370Q7zLJIIL, pageFinder);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        PoiDetailApi.PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo = (PoiDetailApi.PoiRecommendDishesGroupInfo) baseComponentData;
        super.CG1(poiRecommendDishesGroupInfo);
        if (!Intrinsics.LJFF(this.LLJLILLLLZIIL, poiRecommendDishesGroupInfo)) {
            this.LLJLILLLLZIIL = poiRecommendDishesGroupInfo;
            PoiRecommendDishesVM poiRecommendDishesVMEp = Ep();
            PoiDetailApi.PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo2 = this.LLJLILLLLZIIL;
            if (poiRecommendDishesGroupInfo2 != null && poiRecommendDishesGroupInfo2.hasRecommendDishes$poi_release()) {
                poiRecommendDishesVMEp.setState(new AwS597S0100000_18(poiRecommendDishesGroupInfo2, 704));
            } else {
                poiRecommendDishesVMEp.setState(AFwS256S0000000_18.get$arr$(862));
            }
        }
    }

    public final void Fp(PoiDetailApi.RecommendedDish recommendedDish) {
        Ep().vQ2(recommendedDish.copy(recommendedDish.dishId, recommendedDish.images, recommendedDish.name, recommendedDish.desc, recommendedDish.likeNum, recommendedDish.userLiked, recommendedDish.priceNum, recommendedDish.priceCurrency, recommendedDish.cropImages));
        String collectInfo = null;
        if (recommendedDish.getUserLiked()) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            String poiId = ((C1185610gxT) mp()).getPoiId();
            mp().getClass();
            PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
            if (poiDetailResponseLp != null) {
                collectInfo = poiDetailResponseLp.getCollectInfo();
            }
            String dishId = recommendedDish.getDishId();
            PageFinder pageFinder = (PageFinder) this.LLJLIL.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c1185430gxB.getClass();
            C1185430gxB.LJIIIZ(poiId, collectInfo, "dishes", false, dishId, linkedHashMap, pageFinder);
            return;
        }
        C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
        String poiId2 = ((C1185610gxT) mp()).getPoiId();
        mp().getClass();
        PoiListApi.PoiDetailResponse poiDetailResponseLp2 = lp();
        if (poiDetailResponseLp2 != null) {
            collectInfo = poiDetailResponseLp2.getCollectInfo();
        }
        String dishId2 = recommendedDish.getDishId();
        PageFinder pageFinder2 = (PageFinder) this.LLJLIL.getValue();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        c1185430gxB2.getClass();
        C1185430gxB.LJJ(poiId2, collectInfo, "dishes", false, dishId2, linkedHashMap2, pageFinder2);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.dishes.IRecommendDishesNoPicAbility
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
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PageFinder pageFinder = (PageFinder) this.LLJLIL.getValue();
        c1185430gxB.getClass();
        C1185430gxB.LJJLI(pageFinder, interfaceC665370Q7zLJIIL, poiId, collectInfo, "dishes", str, false);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.dishes.IRecommendDishesNoPicAbility
    public final void h00(PoiDetailApi.RecommendedDish recommendedDish) {
        PoiDetailApi.RecommendedDish recommendedDish2;
        String dishId = null;
        if (C848230XPh.LL.LJI()) {
            C291001Au<PoiDetailApi.RecommendedDish> c291001Au = Ep().getState().LLIZ;
            if (c291001Au != null && c291001Au.LIZ != null) {
                C291001Au<PoiDetailApi.RecommendedDish> c291001Au2 = Ep().getState().LLIZ;
                if (c291001Au2 != null && (recommendedDish2 = c291001Au2.LIZ) != null) {
                    dishId = recommendedDish2.getDishId();
                }
                if (Intrinsics.LJFF(dishId, recommendedDish.getDishId())) {
                    PoiRecommendDishesVM poiRecommendDishesVMEp = Ep();
                    poiRecommendDishesVMEp.setState(new AwS384S0200000_18(recommendedDish, poiRecommendDishesVMEp, 185));
                    return;
                }
                return;
            }
            Fp(recommendedDish);
            return;
        }
        C0XPD.LIZJ(C724240Sb0.LJI(this), "poi_detail_recommended_dish_detail", "", null, new C1208950hZ7(this, recommendedDish, 2));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.tv_title);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(RecommendDishesNoPicCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new C20633915of(viewOnAttachStateChangeListenerC20604515jv2));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.setItemAnimator(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.addItemDecoration(new C0IDG(4));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
            viewOnAttachStateChangeListenerC20604515jv5.LL.LLLJ(new C0Q9R() { // from class: X.0gsV
                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LIZ.LLJL;
                    if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
                        viewOnAttachStateChangeListenerC20604515jv6.scrollToPosition(0);
                    }
                }

                @Override // X.AbstractC471570IeR
                public final void LJ(int i, int i2) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LIZ.LLJL;
                    if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
                        viewOnAttachStateChangeListenerC20604515jv6.scrollToPosition(0);
                    }
                }

                @Override // X.AbstractC471570IeR
                public final void LJFF(int i, int i2) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LIZ.LLJL;
                    if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
                        viewOnAttachStateChangeListenerC20604515jv6.scrollToPosition(0);
                    }
                }
            });
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
            viewOnAttachStateChangeListenerC20604515jv6.addOnScrollListener(new AsS7S0101000_18(this, 1));
        }
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0gsU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1182480gsQ) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 113), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0gsT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1182480gsQ) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 114), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0gsP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1182480gsQ) obj).LLILZIL;
            }
        }, null, new AwS620S0100000_6(this, 45), 6);
        String poiId = ((C1185610gxT) mp()).getPoiId();
        if (poiId != null) {
            Ep().setState(new AwS69S1000000_18(poiId, 9));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            ContainerEventDispatcher$PoiDetailDataUpdateAbility containerEventDispatcher$PoiDetailDataUpdateAbility = new ContainerEventDispatcher$PoiDetailDataUpdateAbility(this) { // from class: com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesNoPicAssem.onViewCreated.11
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, ContainerEventDispatcher$PoiDetailDataUpdateAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, containerEventDispatcher$PoiDetailDataUpdateAbility, ContainerEventDispatcher$PoiDetailDataUpdateAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(containerEventDispatcher$PoiDetailDataUpdateAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(containerEventDispatcher$PoiDetailDataUpdateAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(ContainerEventDispatcher$PoiDetailDataUpdateAbility.class.getClassLoader(), new Class[]{ContainerEventDispatcher$PoiDetailDataUpdateAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, ContainerEventDispatcher$PoiDetailDataUpdateAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher.PoiDetailDataUpdateAbility");
            }
        }
    }
}
