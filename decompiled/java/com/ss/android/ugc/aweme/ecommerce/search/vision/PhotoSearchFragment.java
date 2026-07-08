package com.ss.android.ugc.aweme.ecommerce.search.vision;

import X.AbstractC677220QhM;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09HI;
import X.C09HJ;
import X.C0BT6;
import X.C0QSJ;
import X.C0ZP4;
import X.C1018703yb;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C142400gY;
import X.C14KQ;
import X.C1548820qPI;
import X.C1602160rnK;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1766860w4y;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2084008Ek;
import X.C21246818Cs;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2365409Oq;
import X.C262100zr;
import X.C337180DJs;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C674850QdX;
import X.C675090Qdv;
import X.C675950QfJ;
import X.C676050QfT;
import X.C676090QfX;
import X.C676160Qfe;
import X.C676330Qfv;
import X.C679560Ql8;
import X.C680380QmS;
import X.C680390QmT;
import X.C680440QmY;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1141530foN;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS145S0100000_10;
import Y.AObserverS214S0100000_10;
import Y.AUListenerS260S0100000_10;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.cart.vm.SearchCartVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.ability.PhotoSearchRootFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.search.vision.background.PhotoSearchBackgroundFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.behavior.PhotoSearchBottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.search.vision.mix.MixPhotoSearchAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchResponse;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchBottomPanelViewModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchFragment extends AmeBaseFragment implements InterfaceC1141530foN, InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSEgLSQ+Kid9Piw/ICA9ZhUkJjs8GyAtOyw7DjctLiI2JjE=";
    public FrameLayout LL;
    public FrameLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public FrameLayout LLILZ;
    public FrameLayout LLILZIL;
    public FrameLayout LLILZLL;
    public FrameLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public PhotoSearchBaseVM LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(119));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(120));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(121));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 162));
    public PhotoSearchBottomPanelViewModel LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public final AObserverS214S0100000_10 LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoSearchFragment.class, "searchCartVM", "getSearchCartVM()Lcom/ss/android/ugc/aweme/ecommerce/search/cart/vm/SearchCartVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoSearchRootFragmentScope.class});
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
        arrayList.add(PhotoSearchRootFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSearchRootFragmentScope.class);
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

    public PhotoSearchFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchCartVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 165);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(83);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 166), aFwS241S0000000_10, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new AwS554S0100000_10((Fragment) this, 167), aFwS241S0000000_10, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 168), aFwS241S0000000_10, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIL = assemVMLazy;
        this.LLJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 164));
        this.LLJJJIL = new AObserverS214S0100000_10(this, 13);
    }

    public final PhotoSearchBottomSheetBehavior<FrameLayout> MR() {
        return (PhotoSearchBottomSheetBehavior) this.LLJJIJI.getValue();
    }

    public final FrameLayout NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qd_) : null;
            this.LLILLJJLI = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final void OR() {
        C680390QmT c680390QmT;
        if (((Fragment) this.LLJJI.getValue()).isVisible()) {
            FrameLayout frameLayout = this.LLILZ;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ((Fragment) this.LLJJI.getValue());
            c19ehLJIIJ.LJIIL();
            PhotoSearchBackgroundFragment photoSearchBackgroundFragment = (PhotoSearchBackgroundFragment) this.LLJJ.getValue();
            AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 163);
            C680380QmS c680380QmS = photoSearchBackgroundFragment.LLILZ;
            if (c680380QmS != null) {
                int visibility = c680380QmS.getVisibility();
                c680380QmS.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c680380QmS);
            }
            C680380QmS c680380QmS2 = photoSearchBackgroundFragment.LLILZ;
            if (c680380QmS2 != null) {
                AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(photoSearchBackgroundFragment, awS554S0100000_10, 67);
                if (C0BT6.LIZ() == 2 || C0BT6.LIZ() == 3) {
                    awS411S0200000_10.invoke();
                    c680380QmS2.LLIZ.setColor(C679560Ql8.LIZ);
                    return;
                }
                List<C680390QmT> list = c680380QmS2.LLJLIL;
                if (list == null || ListProtector.get(list, 0) == null) {
                    awS411S0200000_10.invoke();
                }
                List<C680390QmT> list2 = c680380QmS2.LLJLIL;
                if (list2 == null || (c680390QmT = (C680390QmT) C13LP.LJJJLZIJ(0, list2)) == null) {
                    return;
                }
                c680380QmS2.LIZIZ(C680440QmY.LIZLLL(c680390QmT), c680380QmS2.LJ(c680390QmT), new AUListenerS260S0100000_10(c680380QmS2, 13), new AUListenerS260S0100000_10(c680380QmS2, 12), awS411S0200000_10, Boolean.TRUE);
            }
        }
    }

    public final void RR() {
        FrameLayout frameLayout = this.LLILZ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.nlo, (Fragment) this.LLJJI.getValue(), "PhotoSearchFragment");
        c19ehLJIIJ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        MutableLiveData<C676090QfX<PhotoSearchResponse>> mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2;
        String str;
        String str2;
        List listLJJLIIIJILLIZJL;
        MixPhotoSearchAssem mixPhotoSearchAssem;
        MixPhotoSearchAssem mixPhotoSearchAssem2;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        Map<String, ? extends Object> map;
        super.onDestroy();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            PhotoSearchBaseVM photoSearchBaseVM = this.LLJIJIL;
            if (photoSearchBaseVM != null && (map = photoSearchBaseVM.LLJJJJJIL) != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        linkedHashMap.put(entry.getKey(), value);
                    }
                }
            }
            linkedHashMap.put(Scene.SCENE_SERVICE, "leave");
            linkedHashMap.put("page_name", "photo_search_result");
            linkedHashMap.put("duration", Long.valueOf(this.LLJILLL - this.LLJILJILJ));
            long j = this.LLJILLL;
            PhotoSearchBaseVM photoSearchBaseVM2 = this.LLJIJIL;
            linkedHashMap.put("duration_ext1", Long.valueOf(j - (photoSearchBaseVM2 != null ? photoSearchBaseVM2.LLJJIJIL : 0L)));
            PhotoSearchBaseVM photoSearchBaseVM3 = this.LLJIJIL;
            int i = -1;
            linkedHashMap.put("is_api_success", Integer.valueOf(photoSearchBaseVM3 != null ? photoSearchBaseVM3.LLJJJIL : -1));
            PhotoSearchBaseVM photoSearchBaseVM4 = this.LLJIJIL;
            linkedHashMap.put("is_empty_search", Integer.valueOf(photoSearchBaseVM4 != null ? photoSearchBaseVM4.LLJJJ : -1));
            PhotoSearchBaseVM photoSearchBaseVM5 = this.LLJIJIL;
            linkedHashMap.put("root_enter_from_type", Integer.valueOf((photoSearchBaseVM5 == null || (photoSearchEnterParams2 = photoSearchBaseVM5.LLILLL) == null || (photoSearchBusinessEnterParams2 = photoSearchEnterParams2.businessParams) == null) ? -1 : photoSearchBusinessEnterParams2.rootEnterFromType));
            PhotoSearchBaseVM photoSearchBaseVM6 = this.LLJIJIL;
            if (photoSearchBaseVM6 == null || (photoSearchEnterParams = photoSearchBaseVM6.LLILLL) == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null || (str = photoSearchBusinessEnterParams.enterMethod) == null) {
                str = "error";
            }
            linkedHashMap.put("enter_method", str);
            PhotoSearchBaseVM photoSearchBaseVM7 = this.LLJIJIL;
            linkedHashMap.put("last_state", Long.valueOf(photoSearchBaseVM7 != null ? photoSearchBaseVM7.LLJJIJIIJIL : 0L));
            linkedHashMap.put("rd_mixed_page", 1);
            PhotoSearchBaseVM photoSearchBaseVM8 = this.LLJIJIL;
            linkedHashMap.put("last_state", Integer.valueOf((photoSearchBaseVM8 == null || (mixPhotoSearchAssem2 = photoSearchBaseVM8.LLJLL) == null) ? -1 : mixPhotoSearchAssem2.hp().LLJLIL));
            PhotoSearchBaseVM photoSearchBaseVM9 = this.LLJIJIL;
            if (photoSearchBaseVM9 != null && (mixPhotoSearchAssem = photoSearchBaseVM9.LLJLL) != null) {
                i = mixPhotoSearchAssem.hp().LLJLILLLLZIIL;
            }
            linkedHashMap.put("last_state_data", Integer.valueOf(i));
            PhotoSearchBaseVM photoSearchBaseVM10 = this.LLJIJIL;
            String str3 = null;
            PageFinder pageFinder = photoSearchBaseVM10 != null ? photoSearchBaseVM10.LLJJJJ : null;
            C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(pageFinder);
            if (btmPageInfoV2 != null && (str2 = btmPageInfoV2.LIZIZ) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{e3.d}, 0, 6)) != null) {
                str3 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("a2270.");
            sbLIZ.append(str3);
            sbLIZ.append(".c0.d0");
            C1018703yb.LIZ(pageFinder, "rd_tiktokec_search_trace", C2188811AlT.LIZIZ(sbLIZ), linkedHashMap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            PhotoSearchBaseVM photoSearchBaseVM11 = this.LLJIJIL;
            if (photoSearchBaseVM11 != null && (mutableLiveData2 = photoSearchBaseVM11.LLILZIL) != null) {
                mutableLiveData2.removeObservers(activity);
            }
            PhotoSearchBaseVM photoSearchBaseVM12 = this.LLJIJIL;
            if (photoSearchBaseVM12 != null && (mutableLiveData = photoSearchBaseVM12.LL) != null) {
                mutableLiveData.removeObservers(activity);
            }
        }
        C1548820qPI.LJIIIIZZ("ttec_photo_search_retry", this);
        PhotoSearchBaseVM photoSearchBaseVM13 = this.LLJIJIL;
        if (photoSearchBaseVM13 != null) {
            photoSearchBaseVM13.AQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLJILLL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C674850QdX c674850QdX;
        C676050QfT c676050QfT;
        TypedByteArray typedByteArray;
        PhotoSearchBaseVM photoSearchBaseVM;
        C674850QdX c674850QdX2;
        C676050QfT c676050QfT2;
        JSONObject jSONObject;
        if (this.mStatusDestroyed) {
            return;
        }
        try {
            if (Intrinsics.LJFF("ttec_photo_search_retry", c262100zr.LIZ)) {
                PhotoSearchBaseVM photoSearchBaseVM2 = this.LLJIJIL;
                if (photoSearchBaseVM2 != null && (jSONObject = photoSearchBaseVM2.LLIZLLLIL) != null) {
                    jSONObject.put("search_time", System.currentTimeMillis());
                }
                PhotoSearchBaseVM photoSearchBaseVM3 = this.LLJIJIL;
                if (photoSearchBaseVM3 != null) {
                    photoSearchBaseVM3.FQ2();
                }
                PhotoSearchBaseVM photoSearchBaseVM4 = this.LLJIJIL;
                if (photoSearchBaseVM4 != null && (c674850QdX = photoSearchBaseVM4.LLILZLL) != null && (c676050QfT = c674850QdX.photoSearch) != null && (typedByteArray = c676050QfT.image) != null) {
                    String str = null;
                    C676050QfT c676050QfT3 = new C676050QfT(null, null, null, null, null, null, null);
                    c676050QfT3.setImage(typedByteArray);
                    PhotoSearchEnterParams photoSearchEnterParams = null;
                    c676050QfT3.setImageTosUri(null);
                    c676050QfT3.setDetection(null);
                    c676050QfT3.setDetectionIdx(null);
                    PhotoSearchBaseVM photoSearchBaseVM5 = this.LLJIJIL;
                    if (photoSearchBaseVM5 != null && (c674850QdX2 = photoSearchBaseVM5.LLILZLL) != null && (c676050QfT2 = c674850QdX2.photoSearch) != null) {
                        str = c676050QfT2.localPath;
                    }
                    c676050QfT3.setLocalPath(str);
                    PhotoSearchBaseVM photoSearchBaseVM6 = this.LLJIJIL;
                    if (photoSearchBaseVM6 != null) {
                        photoSearchEnterParams = photoSearchBaseVM6.LLILLL;
                    }
                    C674850QdX c674850QdXLIZIZ = C675090Qdv.LIZIZ(photoSearchEnterParams, c676050QfT3);
                    if (getActivity() != null && (photoSearchBaseVM = this.LLJIJIL) != null) {
                        photoSearchBaseVM.DQ2(c674850QdXLIZIZ);
                    }
                } else {
                    return;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void PR(int i, int i2) {
        int iLIZIZ;
        int i3;
        float f = 244;
        int iLIZIZ2 = 0;
        try {
            iLIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLIZIZ = 0;
        }
        if (i >= i2 - iLIZIZ) {
            float f2 = i2;
            try {
                iLIZIZ2 = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            i3 = (int) (f2 - iLIZIZ2);
        } else {
            i3 = i;
        }
        MR().LJJIIJZLJL = i;
        PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel = this.LLJJIJIIJIL;
        if (photoSearchBottomPanelViewModel != null) {
            photoSearchBottomPanelViewModel.LLILZLL = i;
            photoSearchBottomPanelViewModel.LLIZ = i3 - i;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        int iLIZIZ;
        int iLIZIZ2;
        float fFloatValue;
        int iLIZIZ3;
        long jLongValue;
        int i;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        Long l;
        C19EG activity;
        String str;
        String str2;
        TypedByteArray typedByteArrayLIZIZ;
        MutableLiveData mutableLiveDataDQ2;
        byte[] bArr;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams2;
        PhotoSearchEnterParams photoSearchEnterParams4;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        PhotoSearchEnterParams photoSearchEnterParams5;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        Float f;
        super.onViewCreated(view, bundle);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.ccd);
        this.LLILZ = (FrameLayout) view.findViewById(R.id.nlo);
        this.LLILZIL = (FrameLayout) view.findViewById(R.id.cfl);
        this.LLILZLL = (FrameLayout) view.findViewById(R.id.ceb);
        this.LLJ = view.findViewById(R.id.cgy);
        this.LLIZ = (FrameLayout) view.findViewById(R.id.cgv);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.cgx);
        this.LLJI = view.findViewById(R.id.ii2);
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            this.LLJIJIL = C676160Qfe.LIZIZ(activity2);
            this.LLJJIJIIJIL = (PhotoSearchBottomPanelViewModel) ViewModelProviders.of(activity2).get(PhotoSearchBottomPanelViewModel.class);
        }
        PhotoSearchBaseVM photoSearchBaseVM = this.LLJIJIL;
        if (photoSearchBaseVM != null) {
            photoSearchBaseVM.zQ2(getView());
        }
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout != null) {
            C337180DJs.LIZ(frameLayout);
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZJ(R.id.cfl, (Fragment) this.LLJJIII.getValue(), "PhotoSearchFragment");
        c19ehLJIIJ.LJIIL();
        View view2 = this.LLJ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS145S0100000_10(this, 10), view2);
        }
        C1548820qPI.LIZLLL("ttec_photo_search_retry", this);
        PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel = this.LLJJIJIIJIL;
        if (photoSearchBottomPanelViewModel != null) {
            photoSearchBottomPanelViewModel.LL = this.LLIZLLLIL;
            photoSearchBottomPanelViewModel.LLILLL = this.LLIZ;
        }
        FrameLayout frameLayout2 = this.LLIZLLLIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        FrameLayout frameLayout3 = this.LLILZIL;
        if (frameLayout3 != null) {
            frameLayout3.setBackgroundColor(0);
        }
        C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ2.LJIJ(R.id.ccd, (Fragment) this.LLJJ.getValue(), "PhotoSearchFragment");
        c19ehLJIIJ2.LJIIL();
        final int iLJ = C14KQ.LJ(getContext());
        int iLIZ = C2084008Ek.LIZ();
        try {
            iLIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 24, Resources.getSystem().getDisplayMetrics()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLIZIZ = 0;
        }
        if (iLIZ > iLIZIZ) {
            iLIZ = iLIZIZ;
        }
        try {
            iLIZIZ2 = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            iLIZIZ2 = 0;
        }
        int i2 = iLIZ + iLIZIZ2;
        final int i3 = iLJ - i2;
        PhotoSearchBaseVM photoSearchBaseVM2 = this.LLJIJIL;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams5 = photoSearchBaseVM2.LLILLL) != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams5.businessParams) != null && (f = photoSearchBusinessEnterParams2.initialHeightScale) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.2f;
        }
        float f2 = i3;
        float f3 = iLJ * fFloatValue;
        try {
            iLIZIZ3 = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 72, Resources.getSystem().getDisplayMetrics()));
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            iLIZIZ3 = 0;
        }
        PR((int) (f2 - (f3 + iLIZIZ3)), iLJ);
        FrameLayout frameLayout4 = this.LLILZLL;
        if (frameLayout4 != null && (layoutParams2 = frameLayout4.getLayoutParams()) != null) {
            layoutParams2.height = iLJ;
        }
        FrameLayout frameLayout5 = this.LLIZ;
        if (frameLayout5 != null && (layoutParams = frameLayout5.getLayoutParams()) != null) {
            layoutParams.height = i3;
        }
        MR().LJJIIZ = i2;
        MR().LJIIJ = true;
        MR().LJIIJJI = false;
        MR().LJJIJ = false;
        MR().setState(5);
        MR().LIZ(new AbstractC677220QhM() { // from class: X.0Qfj
            @Override // X.AbstractC677220QhM
            public final void LIZ(float f4) {
                float fAbs = Math.abs(f4);
                if (0.0f <= fAbs && fAbs <= 1.0f) {
                    View view3 = this.LIZ.LLJI;
                    if (view3 != null) {
                        C786410Ut5.T4(view3, 0.5f - (fAbs * 0.5f));
                    }
                    if (fAbs == 1.0f) {
                        FrameLayout frameLayoutNR = this.LIZ.NR();
                        if (frameLayoutNR != null) {
                            C337180DJs.LIZ(frameLayoutNR);
                            return;
                        }
                        return;
                    }
                    AssemVMLazy assemVMLazy = this.LIZ.LLJJIJIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PhotoSearchFragment.LLJJJJ;
                    if (!((Boolean) C736680Sv4.LJIJJ(assemVMLazy.getValue(), AFwS241S0000000_10.get$arr$(431))).booleanValue()) {
                        return;
                    }
                    FrameLayout frameLayoutNR2 = this.LIZ.NR();
                    if (frameLayoutNR2 != null) {
                        C337180DJs.LIZJ(frameLayoutNR2);
                    }
                    FrameLayout frameLayoutNR3 = this.LIZ.NR();
                    if (frameLayoutNR3 == null) {
                        return;
                    }
                    C786410Ut5.U4(frameLayoutNR3, 1 - fAbs);
                }
            }

            @Override // X.AbstractC677220QhM
            public final void LIZIZ(int i4) throws Throwable {
                int iLIZIZ4;
                PhotoSearchFragment photoSearchFragment = this.LIZ;
                PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel2 = photoSearchFragment.LLJJIJIIJIL;
                if (photoSearchBottomPanelViewModel2 != null) {
                    photoSearchBottomPanelViewModel2.LLIZLLLIL = i4;
                }
                if (i4 == 4) {
                    ((Fragment) photoSearchFragment.LLJJIII.getValue()).setUserVisibleHint(true);
                    return;
                }
                if (i4 != 2 && i4 != 3) {
                    return;
                }
                int i5 = i3;
                float f4 = iLJ * 0.2f;
                try {
                    iLIZIZ4 = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 72, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    iLIZIZ4 = 0;
                }
                this.LIZ.PR(i5 - ((int) (f4 + iLIZIZ4)), iLJ);
            }
        });
        FrameLayout frameLayout6 = this.LLILLL;
        if (frameLayout6 != null) {
            C786410Ut5.O7(frameLayout6, new ACListenerS145S0100000_10(this, 50));
        }
        RR();
        if (getActivity() != null && (activity = getActivity()) != null) {
            AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(this, activity, 65);
            if (((Boolean) C142400gY.LIZ.getValue()).booleanValue()) {
                C675950QfJ c675950QfJ = C675950QfJ.LIZ;
                PhotoSearchBaseVM photoSearchBaseVM3 = this.LLJIJIL;
                if (photoSearchBaseVM3 == null || (photoSearchEnterParams4 = photoSearchBaseVM3.LLILLL) == null || (str = photoSearchEnterParams4.imageKey) == null) {
                    str = "";
                }
                c675950QfJ.getClass();
                C676330Qfv c676330QfvLIZIZ = C675950QfJ.LIZIZ(str);
                PhotoSearchBaseVM photoSearchBaseVM4 = this.LLJIJIL;
                PhotoSearchEnterParams photoSearchEnterParams6 = null;
                if (photoSearchBaseVM4 != null && (photoSearchEnterParams3 = photoSearchBaseVM4.LLILLL) != null && (photoSearchToolsEnterParams2 = photoSearchEnterParams3.toolsParams) != null) {
                    str2 = photoSearchToolsEnterParams2.localFilePath;
                } else {
                    str2 = null;
                }
                if (c676330QfvLIZIZ != null && c676330QfvLIZIZ.LIZIZ != null) {
                    if (c676330QfvLIZIZ != null && (bArr = c676330QfvLIZIZ.LIZIZ) != null) {
                        typedByteArrayLIZIZ = C2365409Oq.LIZIZ(bArr);
                    } else {
                        typedByteArrayLIZIZ = null;
                    }
                    C09HI.LIZ.getClass();
                    if (!C09HJ.LIZ(str2)) {
                        str2 = null;
                    }
                    C676050QfT c676050QfT = new C676050QfT(typedByteArrayLIZIZ, null, null, null, null, null, str2);
                    PhotoSearchBaseVM photoSearchBaseVM5 = this.LLJIJIL;
                    if (photoSearchBaseVM5 != null) {
                        photoSearchEnterParams6 = photoSearchBaseVM5.LLILLL;
                    }
                    C674850QdX c674850QdXLIZIZ = C675090Qdv.LIZIZ(photoSearchEnterParams6, c676050QfT);
                    PhotoSearchBaseVM photoSearchBaseVM6 = this.LLJIJIL;
                    if (photoSearchBaseVM6 != null) {
                        photoSearchBaseVM6.FQ2();
                    }
                    PhotoSearchBaseVM photoSearchBaseVM7 = this.LLJIJIL;
                    if (photoSearchBaseVM7 != null && (mutableLiveDataDQ2 = photoSearchBaseVM7.DQ2(c674850QdXLIZIZ)) != null) {
                        mutableLiveDataDQ2.observe(activity, this.LLJJJIL);
                    }
                } else {
                    awS411S0200000_10.invoke();
                }
            } else {
                awS411S0200000_10.invoke();
            }
        }
        PhotoSearchBaseVM photoSearchBaseVM8 = this.LLJIJIL;
        if (photoSearchBaseVM8 != null && (photoSearchEnterParams2 = photoSearchBaseVM8.LLILLL) != null && (photoSearchToolsEnterParams = photoSearchEnterParams2.toolsParams) != null && (l = photoSearchToolsEnterParams.searchTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LLJILJILJ = jLongValue;
        View view3 = getView();
        if (view3 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            PhotoSearchBaseVM photoSearchBaseVM9 = this.LLJIJIL;
            if (photoSearchBaseVM9 != null && (photoSearchEnterParams = photoSearchBaseVM9.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
                i = photoSearchBusinessEnterParams.rootEnterFromType;
            } else {
                i = -1;
            }
            linkedHashMap.put("ec_search_root_enter_from_type", String.valueOf(i));
            C1766860w4y.LIZ.getClass();
            C1766860w4y.LJIILIIL(view3, linkedHashMap, false);
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        ((SearchCartVM) assemVMLazy.getValue()).L01(view);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ewz, viewGroup, false);
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
