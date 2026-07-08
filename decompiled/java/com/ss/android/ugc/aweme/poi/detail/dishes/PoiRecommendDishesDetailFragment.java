package com.ss.android.ugc.aweme.poi.detail.dishes;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0QSJ;
import X.C0ZP4;
import X.C1182380gsG;
import X.C1182480gsQ;
import X.C1182540gsW;
import X.C1182990gtF;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1185440gxC;
import X.C1196110hEP;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1208670hYf;
import X.C1220000hqw;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C19HL;
import X.C19HN;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C338520DOw;
import X.C422030Ggj;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C708540Rqm;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS9S0301000_12;
import Y.AUListenerS0S0300004_18;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryCell;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryScope;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS32S0001000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendDishesDetailFragment extends BaseFragment implements PoiRecommendDishesGalleryAbility, InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGE3LTEtICN9LCHELIOSw/ISogZhUjIB02KyohJCo9LAElOic2OwEpPS46JAM+KCg+LSs4";
    public final C736950SvV LLIZ;
    public C422030Ggj LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLJ;
    public C1196110hEP LLJI;
    public FrameLayout LLJIJIL;
    public View LLJILJIL;
    public TuxIconView LLJILJILJ;
    public ViewGroup LLJILLL;
    public int LLJJ;
    public PoiInnerPageMobData LLJJI;
    public ArrayList<PoiGalleryAnchorData> LLJJIII;
    public C1185440gxC LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;
    public C19HL LLJJJJJIL;
    public View LLJJJJLIIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PoiRecommendDishesGalleryScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiRecommendDishesGalleryScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiRecommendDishesGalleryScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1182630gsf
    public final void yt(float f) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    public final String C21() {
        PoiInnerPageMobData poiInnerPageMobData = this.LLJJI;
        if (poiInnerPageMobData != null) {
            return poiInnerPageMobData.poiId;
        }
        return null;
    }

    public final PoiRecommendDishesVM SR() {
        return (PoiRecommendDishesVM) this.LLIZ.getValue();
    }

    public PoiRecommendDishesDetailFragment() {
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1120);
        this.LLIZ = new C736950SvV(C13LE.LIZ(PoiRecommendDishesVM.class), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(393), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1118));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1119));
    }

    @Override // X.InterfaceC1182630gsf
    public final void Yx() {
        C19GS c19gs;
        C19HL c19hl;
        C19EG activity = getActivity();
        if (!(activity instanceof C19GS) || (c19gs = (C19GS) activity) == null) {
            return;
        }
        C1182990gtF c1182990gtF = C1182990gtF.LIZ;
        ArrayList<PoiGalleryAnchorData> arrayList = this.LLJJIII;
        int i = this.LLJJJJ;
        c1182990gtF.getClass();
        if (!C1182990gtF.LJFF(i, arrayList) || (c19hl = this.LLJJJJJIL) == null) {
            C1182990gtF.LJ(c19gs);
            return;
        }
        ArrayList<PoiGalleryAnchorData> arrayList2 = this.LLJJIII;
        if (arrayList2 == null) {
            return;
        }
        C1182990gtF.LIZLLL(c19gs, arrayList2, c19hl, this.LLJJJJ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() throws IllegalAccessException {
        super.onDestroyView();
        C1558520qew.LJIIJ(this, PoiRecommendDishesGalleryScope.class, PoiRecommendDishesGalleryAbility.class, null);
        C1185440gxC c1185440gxC = this.LLJJIJI;
        if (c1185440gxC != null) {
            c1185440gxC.LIZJ(getContext(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1185440gxC c1185440gxC = this.LLJJIJI;
        if (c1185440gxC != null) {
            c1185440gxC.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1185440gxC c1185440gxC = this.LLJJIJI;
        if (c1185440gxC != null) {
            c1185440gxC.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    public final void AP2(PoiDetailApi.RecommendedDish recommendedDish) {
        String str;
        String str2;
        boolean z;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        PoiInnerPageMobData poiInnerPageMobData = this.LLJJI;
        String str3 = null;
        if (poiInnerPageMobData != null) {
            str3 = poiInnerPageMobData.poiId;
            str = poiInnerPageMobData.collectInfo;
            str2 = poiInnerPageMobData.moduleName;
        } else {
            str = null;
            str2 = null;
        }
        List<UrlModel> images = recommendedDish.getImages();
        if (images != null && C13LP.LJJJLL(images) != null) {
            z = true;
        } else {
            z = false;
        }
        String dishId = recommendedDish.getDishId();
        Map map = (Map) this.LLJJIJIIJIL.getValue();
        PageFinder pageFinder = (PageFinder) this.LLJJIJIL.getValue();
        c1185430gxB.getClass();
        C1185430gxB.LJJ(str3, str, str2, z, dishId, map, pageFinder);
    }

    public final C1182540gsW VR(PoiDetailApi.RecommendedDish recommendedDish) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        boolean z;
        InterfaceC1733780vDc viewItemOperator;
        List<InterfaceC1891350zJl> listLIZ;
        InterfaceC1891350zJl next;
        String dishId;
        C1182540gsW c1182540gsW;
        PoiDetailApi.RecommendedDish recommendedDish2;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJ;
        C1182540gsW c1182540gsW2 = null;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (listLIZ = viewItemOperator.LIZ()) != null) {
            Iterator<InterfaceC1891350zJl> it2 = listLIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    InterfaceC1891350zJl interfaceC1891350zJl2 = next;
                    if ((interfaceC1891350zJl2 instanceof C1182540gsW) && (c1182540gsW = (C1182540gsW) interfaceC1891350zJl2) != null && (recommendedDish2 = c1182540gsW.LL) != null) {
                        dishId = recommendedDish2.getDishId();
                    } else {
                        dishId = null;
                    }
                    if (Intrinsics.LJFF(dishId, recommendedDish.getDishId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            interfaceC1891350zJl = next;
        } else {
            interfaceC1891350zJl = null;
        }
        if (interfaceC1891350zJl instanceof C1182540gsW) {
            c1182540gsW2 = (C1182540gsW) interfaceC1891350zJl;
        }
        if (c1182540gsW2 != null) {
            z = c1182540gsW2.LLILLJJLI;
        } else {
            z = false;
        }
        return new C1182540gsW(recommendedDish, z);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1185440gxC c1185440gxC = new C1185440gxC(getLifecycle(), null, false, new C1185050gwZ(PageFinder.via((Fragment) this)));
        this.LLJJIJI = c1185440gxC;
        c1185440gxC.LIZIZ(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1185440gxC c1185440gxC = this.LLJJIJI;
        if (c1185440gxC != null) {
            bundle.putLong("play_time_in_current_page", c1185440gxC.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    public final void v02(PoiDetailApi.RecommendedDish recommendedDish) {
        String str;
        String str2;
        boolean z;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        PoiInnerPageMobData poiInnerPageMobData = this.LLJJI;
        String str3 = null;
        if (poiInnerPageMobData != null) {
            str3 = poiInnerPageMobData.poiId;
            str = poiInnerPageMobData.collectInfo;
            str2 = poiInnerPageMobData.moduleName;
        } else {
            str = null;
            str2 = null;
        }
        List<UrlModel> images = recommendedDish.getImages();
        if (images != null && C13LP.LJJJLL(images) != null) {
            z = true;
        } else {
            z = false;
        }
        String dishId = recommendedDish.getDishId();
        Map map = (Map) this.LLJJIJIIJIL.getValue();
        PageFinder pageFinder = (PageFinder) this.LLJJIJIL.getValue();
        c1185430gxB.getClass();
        C1185430gxB.LJIIIZ(str3, str, str2, z, dishId, map, pageFinder);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    public final void yv2(String str) {
        String str2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        PoiInnerPageMobData poiInnerPageMobData = this.LLJJI;
        if (poiInnerPageMobData != null) {
            str2 = poiInnerPageMobData.enterFrom;
        } else {
            str2 = null;
        }
        C1185430gxB.LJJIJL(c1185430gxB, str2, "click", C1558360qeg.LJFF(this, null), "poi_secondary_feature_page", "poi_recommend_dish", PageFinder.via((Fragment) this));
    }

    public final boolean UR(int i, ArrayList arrayList) {
        PoiGalleryAnchorData poiGalleryAnchorData;
        if (arrayList == null || i < 0 || i >= arrayList.size() || 1 == 0 || (poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i)) == null || poiGalleryAnchorData.w <= 0 || poiGalleryAnchorData.h <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PoiInnerPageMobData poiInnerPageMobData;
        ArrayList<PoiGalleryAnchorData> parcelableArrayList;
        String str;
        String str2;
        String str3;
        InterfaceC1733780vDc viewItemOperator;
        int size;
        super.onViewCreated(view, bundle);
        C1558520qew.LJI(this, PoiRecommendDishesGalleryScope.class, this, PoiRecommendDishesGalleryAbility.class, null, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            poiInnerPageMobData = (PoiInnerPageMobData) arguments.getParcelable("mob_data");
        } else {
            poiInnerPageMobData = null;
        }
        this.LLJJI = poiInnerPageMobData;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            parcelableArrayList = arguments2.getParcelableArrayList("poi_anchor_data");
        } else {
            parcelableArrayList = null;
        }
        this.LLJJIII = parcelableArrayList;
        this.LLJJ = SR().getState().LLILLL;
        this.LLJ = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.r31);
        this.LLIZLLLIL = (C422030Ggj) view.findViewById(R.id.r2l);
        this.LLJI = (C1196110hEP) view.findViewById(R.id.r2x);
        this.LLJIJIL = (FrameLayout) view.findViewById(R.id.r2w);
        this.LLJILJIL = view.findViewById(R.id.r2i);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.r2h);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.r2n);
        C1196110hEP c1196110hEP = this.LLJI;
        int i = 0;
        if (c1196110hEP != null) {
            int i2 = this.LLJJJJ;
            ArrayList<PoiDetailApi.RecommendedDish> arrayList = SR().getState().LLILLJJLI;
            if (arrayList != null) {
                size = arrayList.size();
            } else {
                size = 0;
            }
            c1196110hEP.LJJJJJ(i2, size);
        }
        TuxIconView tuxIconView = this.LLJILJILJ;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 34), tuxIconView);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJ;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null) {
            viewItemOperator.LIZJ(PoiRecommendDishesGalleryCell.class);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
            viewOnAttachStateChangeListenerC20631115oD2.setPageTransformer(new C708540Rqm());
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
            viewOnAttachStateChangeListenerC20631115oD3.registerOnPageChangeCallback(new C1208670hYf(this, 2));
        }
        C422030Ggj c422030Ggj = this.LLIZLLLIL;
        if (c422030Ggj != null) {
            c422030Ggj.setLifecycleOwner(this);
        }
        C422030Ggj c422030Ggj2 = this.LLIZLLLIL;
        if (c422030Ggj2 != null) {
            c422030Ggj2.LLIZLLLIL = false;
        }
        C1182480gsQ state = SR().getState();
        ArrayList<PoiDetailApi.RecommendedDish> arrayList2 = state.LLILLJJLI;
        if (arrayList2 != null) {
            int i3 = state.LLILLL;
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20631115oD4 != null) {
                C20600815jK<InterfaceC1891350zJl> state2 = viewOnAttachStateChangeListenerC20631115oD4.getViewItemOperator().getState();
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator<PoiDetailApi.RecommendedDish> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(VR(it2.next()));
                }
                state2.LIZLLL(arrayList3, null);
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD4, new ARunnableS9S0301000_12(viewOnAttachStateChangeListenerC20631115oD4, this, i3, arrayList2, 0));
                C2211631BhB.LJ(viewOnAttachStateChangeListenerC20631115oD4, new AwS384S0200000_18(viewOnAttachStateChangeListenerC20631115oD4, this, 184));
            }
            int i4 = state.LLILLL;
            C422030Ggj c422030Ggj3 = this.LLIZLLLIL;
            if (c422030Ggj3 != null) {
                c422030Ggj3.setCount(arrayList2.size());
            }
            C422030Ggj c422030Ggj4 = this.LLIZLLLIL;
            if (c422030Ggj4 != null) {
                if (i4 >= 0 && i4 < arrayList2.size()) {
                    i = i4;
                }
                c422030Ggj4.setSelectedIndex(i);
            }
        }
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0gsX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1182480gsQ) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 112), 6);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        PoiInnerPageMobData poiInnerPageMobData2 = this.LLJJI;
        if (poiInnerPageMobData2 != null) {
            str = poiInnerPageMobData2.poiId;
            str2 = poiInnerPageMobData2.collectInfo;
            str3 = poiInnerPageMobData2.moduleName;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        C1185430gxB.LJIJI(c1185430gxB, str, str2, str3, null, (Map) this.LLJJIJIIJIL.getValue(), C1558360qeg.LJFF(this, null), (PageFinder) this.LLJJIJIL.getValue(), 8);
        C1185440gxC c1185440gxC = this.LLJJIJI;
        if (c1185440gxC != null) {
            c1185440gxC.LJFF = C1182380gsG.LJ(C1558360qeg.LJFF(this, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    public final void Gg(boolean z, C19HL c19hl, int i) {
        C19GS c19gs;
        View view;
        PoiGalleryAnchorData poiGalleryAnchorData;
        if (i == this.LLJJ && !this.LLJJJ) {
            ArrayList<PoiGalleryAnchorData> arrayList = this.LLJJIII;
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            if (c19gs != null) {
                if (z) {
                    if (UR(i, arrayList) && (view = this.LLJJJJLIIL) != null) {
                        if (arrayList != null && (poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i)) != null && poiGalleryAnchorData.w > 0 && poiGalleryAnchorData.h > 0) {
                            RectF rectFLJFF = C19HN.LJFF();
                            c19hl.LJI(rectFLJFF);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("tryDoStartAnimWithAnchor currentAnchor x: ");
                            sbLIZ.append(poiGalleryAnchorData.x);
                            sbLIZ.append(", y: ");
                            sbLIZ.append(poiGalleryAnchorData.y);
                            sbLIZ.append(", w: ");
                            sbLIZ.append(poiGalleryAnchorData.w);
                            sbLIZ.append(", h: ");
                            sbLIZ.append(poiGalleryAnchorData.h);
                            sbLIZ.append("; \n bound: x: ");
                            sbLIZ.append(rectFLJFF.left);
                            sbLIZ.append(", y: ");
                            sbLIZ.append(rectFLJFF.top);
                            sbLIZ.append(", w: ");
                            sbLIZ.append(rectFLJFF.width());
                            sbLIZ.append(", h: ");
                            sbLIZ.append(rectFLJFF.height());
                            C2188811AlT.LIZIZ(sbLIZ);
                            float fWidth = poiGalleryAnchorData.w / rectFLJFF.width();
                            float fHeight = poiGalleryAnchorData.h / rectFLJFF.height();
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(300L);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0300004_18(this, view, c19hl, (poiGalleryAnchorData.x + (poiGalleryAnchorData.w / 2)) - (rectFLJFF.left + (rectFLJFF.width() / 2)), ((poiGalleryAnchorData.y - C12ES.LJIIJJI(c19gs)) + (poiGalleryAnchorData.h / 2)) - (c19hl.getTop() + (c19hl.getHeight() / 2)), fWidth, fHeight, 0));
                            valueAnimatorOfFloat.start();
                        }
                    } else {
                        C1182990gtF.LIZ.getClass();
                        C1182990gtF.LIZJ(c19gs);
                    }
                } else {
                    C1182990gtF.LIZ.getClass();
                    C1182990gtF.LIZ(c19gs);
                }
            }
            this.LLJJJ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    public final void Ui2(int i, C19HL c19hl, View view) {
        int size;
        String str;
        String str2;
        PoiRecommendDishesVM poiRecommendDishesVMSR = SR();
        poiRecommendDishesVMSR.getClass();
        poiRecommendDishesVMSR.setState(new AwS32S0001000_18(i, 4));
        if (this.LLJJJIL) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            PoiInnerPageMobData poiInnerPageMobData = this.LLJJI;
            String str3 = null;
            if (poiInnerPageMobData != null) {
                str3 = poiInnerPageMobData.poiId;
                str = poiInnerPageMobData.collectInfo;
                str2 = poiInnerPageMobData.moduleName;
            } else {
                str = null;
                str2 = null;
            }
            C1185430gxB.LJJIL(c1185430gxB, str3, str, str2, null, (Map) this.LLJJIJIIJIL.getValue(), (PageFinder) this.LLJJIJIL.getValue(), 8);
        }
        this.LLJJJJ = i;
        this.LLJJJJJIL = c19hl;
        this.LLJJJJLIIL = view;
        C1196110hEP c1196110hEP = this.LLJI;
        if (c1196110hEP != null) {
            ArrayList<PoiDetailApi.RecommendedDish> arrayList = SR().getState().LLILLJJLI;
            if (arrayList != null) {
                size = arrayList.size();
            } else {
                size = 0;
            }
            c1196110hEP.LJJJJJ(i, size);
        }
        C422030Ggj c422030Ggj = this.LLIZLLLIL;
        if (c422030Ggj != null) {
            c422030Ggj.setSelectedIndex(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e44, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
