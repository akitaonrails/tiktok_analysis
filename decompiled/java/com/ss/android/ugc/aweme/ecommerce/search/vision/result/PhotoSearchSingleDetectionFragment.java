package com.ss.android.ugc.aweme.ecommerce.search.vision.result;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0PE2;
import X.C0QES;
import X.C0QSJ;
import X.C1018703yb;
import X.C1361400lX0;
import X.C13LP;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C1766870w4z;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C21246818Cs;
import X.C2188811AlT;
import X.C262100zr;
import X.C315220CXg;
import X.C426750GoL;
import X.C452501pT;
import X.C488690JEl;
import X.C673150Qan;
import X.C674850QdX;
import X.C675840Qf8;
import X.C676050QfT;
import X.C676160Qfe;
import X.C676180Qfg;
import X.C676310Qft;
import X.C676320Qfu;
import X.C677230QhN;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1058150ddt;
import X.InterfaceC1141530foN;
import X.InterfaceC1146704e9;
import X.InterfaceC21659319pf;
import X.InterfaceC21659919pl;
import X.InterfaceC344240DeY;
import X.InterfaceC651320Pgg;
import X.InterfaceC687730QyJ;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.ability.IPhotoSearchMixContainerAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.ability.IPhotoSearchRootFragmentAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.ability.PhotoSearchRootFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.search.vision.mix.MixPhotoSearchAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.vision.IPhotoSearchService;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceLogParams;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.ss.android.ugc.aweme.vision.model.ProductCard;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS47S0100100_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchSingleDetectionFragment extends SAFTikTokFragment implements InterfaceC344240DeY, InterfaceC1141530foN, InterfaceC1058150ddt, InterfaceC21659919pl, C0PE2, InterfaceC651320Pgg, IPhotoSearchRootFragmentAbility, InterfaceC21659319pf, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+Kid9Piw/HELIOSICA9ZjcpOjo/PGscISAnJxYpKD0wIBYlJyg/LQEpPSowPCwjJwkhKSIhLCEn";
    public TuxNavBar LLJILLL;
    public FrameLayout LLJJ;
    public ConstraintLayout LLJJI;
    public ViewGroup LLJJIII;
    public long LLJJIJIL;
    public long LLJJJ;
    public PhotoSearchBaseVM LLJJJIL;
    public C0OM1 LLJJJJ;
    public boolean LLJJJJJIL;
    public C677230QhN LLJJJJLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public FrameLayout LLJLIL;
    public C676180Qfg LLJLLIL;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 180));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 179));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 177));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 178));
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(122));
    public final AObserverS214S0100000_10 LLJLLL = new AObserverS214S0100000_10(this, 16);

    @Override // X.InterfaceC21659919pl
    public final void Pn() {
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSearchRootFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSearchRootFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC21659919pl
    public final void h6() {
    }

    @Override // X.InterfaceC21659919pl
    public final boolean kk() {
        return true;
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21659319pf
    public final View uN() {
        IPhotoSearchMixContainerAbility iPhotoSearchMixContainerAbility = (IPhotoSearchMixContainerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPhotoSearchMixContainerAbility.class, null);
        if (iPhotoSearchMixContainerAbility != null) {
            return iPhotoSearchMixContainerAbility.Bu1();
        }
        return null;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21659919pl
    public final Function1<Context, View> R9() {
        return new AwS585S0100000_6(this, 54);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.ability.IPhotoSearchRootFragmentAbility
    public final C1361400lX0 c41() {
        return (C1361400lX0) this.LLJJIJIIJIL.getValue();
    }

    public final FrameLayout hS() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.htp) : null;
            this.LLJJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final TuxNavBar iS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hu9) : null;
            this.LLJILLL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        PhotoSearchBaseVM photoSearchBaseVM = this.LLJJJIL;
        if (photoSearchBaseVM != null) {
            photoSearchBaseVM.BQ2();
        }
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        String str2;
        List listLJJLIIIJILLIZJL;
        MixPhotoSearchAssem mixPhotoSearchAssem;
        MixPhotoSearchAssem mixPhotoSearchAssem2;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        String str3 = null;
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IPhotoSearchRootFragmentAbility.class, null);
        C1548820qPI.LJIIIIZZ("ttec_photo_search_retry", this);
        PhotoSearchBaseVM photoSearchBaseVM = this.LLJJJIL;
        if (photoSearchBaseVM != null) {
            photoSearchBaseVM.AQ2();
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Scene.SCENE_SERVICE, "leave");
            linkedHashMap.put("page_name", "photo_search_result");
            linkedHashMap.put("duration", Long.valueOf(this.LLJJJ - this.LLJJIJIL));
            long j = this.LLJJJ;
            PhotoSearchBaseVM photoSearchBaseVM2 = this.LLJJJIL;
            linkedHashMap.put("duration_ext1", Long.valueOf(j - (photoSearchBaseVM2 != null ? photoSearchBaseVM2.LLJJIJIL : 0L)));
            PhotoSearchBaseVM photoSearchBaseVM3 = this.LLJJJIL;
            int i = -1;
            linkedHashMap.put("is_api_success", Integer.valueOf(photoSearchBaseVM3 != null ? photoSearchBaseVM3.LLJJJIL : -1));
            PhotoSearchBaseVM photoSearchBaseVM4 = this.LLJJJIL;
            linkedHashMap.put("is_empty_search", Integer.valueOf(photoSearchBaseVM4 != null ? photoSearchBaseVM4.LLJJJ : -1));
            PhotoSearchBaseVM photoSearchBaseVM5 = this.LLJJJIL;
            linkedHashMap.put("root_enter_from_type", Integer.valueOf((photoSearchBaseVM5 == null || (photoSearchEnterParams2 = photoSearchBaseVM5.LLILLL) == null || (photoSearchBusinessEnterParams2 = photoSearchEnterParams2.businessParams) == null) ? -1 : photoSearchBusinessEnterParams2.rootEnterFromType));
            PhotoSearchBaseVM photoSearchBaseVM6 = this.LLJJJIL;
            if (photoSearchBaseVM6 == null || (photoSearchEnterParams = photoSearchBaseVM6.LLILLL) == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null || (str = photoSearchBusinessEnterParams.enterMethod) == null) {
                str = "error";
            }
            linkedHashMap.put("enter_method", str);
            PhotoSearchBaseVM photoSearchBaseVM7 = this.LLJJJIL;
            linkedHashMap.put("last_state", Long.valueOf(photoSearchBaseVM7 != null ? photoSearchBaseVM7.LLJJIJIIJIL : 0L));
            linkedHashMap.put("rd_mixed_page", 1);
            PhotoSearchBaseVM photoSearchBaseVM8 = this.LLJJJIL;
            linkedHashMap.put("last_state", Integer.valueOf((photoSearchBaseVM8 == null || (mixPhotoSearchAssem2 = photoSearchBaseVM8.LLJLL) == null) ? -1 : mixPhotoSearchAssem2.hp().LLJLIL));
            PhotoSearchBaseVM photoSearchBaseVM9 = this.LLJJJIL;
            if (photoSearchBaseVM9 != null && (mixPhotoSearchAssem = photoSearchBaseVM9.LLJLL) != null) {
                i = mixPhotoSearchAssem.hp().LLJLILLLLZIIL;
            }
            linkedHashMap.put("last_state_data", Integer.valueOf(i));
            PhotoSearchBaseVM photoSearchBaseVM10 = this.LLJJJIL;
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
        super.onDestroy();
    }

    @Override // X.InterfaceC651320Pgg
    public final boolean T0() {
        return SAFExtensionKt.LJIIZILJ(this);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLJJJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        return this.LLJJJJ;
    }

    public final void mS(PhotoSearchResponse photoSearchResponse) {
        long jLongValue;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime;
        Long l;
        RDPhotoSearchTraceLogParams rDPhotoSearchTraceLogParams;
        Long lValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime2 = photoSearchResponse.techLogParams;
        Integer numValueOf = null;
        if (rDPhotoSearchTraceTime2 != null && (rDPhotoSearchTraceLogParams = rDPhotoSearchTraceTime2.logParams) != null) {
            Long l2 = rDPhotoSearchTraceTime2.netReceive;
            if (l2 != null) {
                lValueOf = Long.valueOf(jCurrentTimeMillis - l2.longValue());
            } else {
                lValueOf = null;
            }
            rDPhotoSearchTraceLogParams.setClientProcess(lValueOf);
        }
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime3 = photoSearchResponse.techLogParams;
        if (rDPhotoSearchTraceTime3 != null) {
            rDPhotoSearchTraceTime3.setUpdateDataTimestamp(Long.valueOf(jCurrentTimeMillis));
        }
        PhotoSearchBaseVM photoSearchBaseVM = this.LLJJJIL;
        if (photoSearchBaseVM != null && (rDPhotoSearchTraceTime = photoSearchBaseVM.LLJI) != null && (l = rDPhotoSearchTraceTime.netReceive) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long lValueOf2 = Long.valueOf(jCurrentTimeMillis - jLongValue);
        PhotoSearchBaseVM photoSearchBaseVM2 = this.LLJJJIL;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams = photoSearchBaseVM2.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            numValueOf = Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType);
        }
        C675840Qf8.LIZ("api_result_data_process", "search_result", lValueOf2, numValueOf, null, null, 1008);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C674850QdX c674850QdX;
        C676050QfT c676050QfT;
        TypedByteArray typedByteArray;
        String str;
        PhotoSearchBaseVM photoSearchBaseVM;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        C674850QdX c674850QdX2;
        C676050QfT c676050QfT2;
        JSONObject jSONObject;
        if (SAFExtensionKt.LJIIZILJ(this)) {
            return;
        }
        try {
            if (Intrinsics.LJFF("ttec_photo_search_retry", c262100zr.LIZ)) {
                PhotoSearchBaseVM photoSearchBaseVM2 = this.LLJJJIL;
                if (photoSearchBaseVM2 != null && (jSONObject = photoSearchBaseVM2.LLIZLLLIL) != null) {
                    jSONObject.put("search_time", System.currentTimeMillis());
                }
                PhotoSearchBaseVM photoSearchBaseVM3 = this.LLJJJIL;
                if (photoSearchBaseVM3 != null) {
                    photoSearchBaseVM3.FQ2();
                }
                PhotoSearchBaseVM photoSearchBaseVM4 = this.LLJJJIL;
                if (photoSearchBaseVM4 != null && (c674850QdX = photoSearchBaseVM4.LLILZLL) != null && (c676050QfT = c674850QdX.photoSearch) != null && (typedByteArray = c676050QfT.image) != null) {
                    String str2 = null;
                    C676050QfT c676050QfT3 = new C676050QfT(null, null, null, null, null, null, null);
                    c676050QfT3.setImage(typedByteArray);
                    c676050QfT3.setImageTosUri(null);
                    c676050QfT3.setDetection(null);
                    c676050QfT3.setDetectionIdx(null);
                    PhotoSearchBaseVM photoSearchBaseVM5 = this.LLJJJIL;
                    if (photoSearchBaseVM5 != null && (c674850QdX2 = photoSearchBaseVM5.LLILZLL) != null && (c676050QfT2 = c674850QdX2.photoSearch) != null) {
                        str2 = c676050QfT2.localPath;
                    }
                    c676050QfT3.setLocalPath(str2);
                    PhotoSearchBaseVM photoSearchBaseVM6 = this.LLJJJIL;
                    if (photoSearchBaseVM6 == null || (((photoSearchEnterParams = photoSearchBaseVM6.LLILLL) == null || (photoSearchToolsEnterParams = photoSearchEnterParams.toolsParams) == null || (str = photoSearchToolsEnterParams.searchSource) == null) && ((photoSearchEnterParams2 = photoSearchBaseVM6.LLILLL) == null || (photoSearchBusinessEnterParams = photoSearchEnterParams2.businessParams) == null || (str = photoSearchBusinessEnterParams.enterMethod) == null))) {
                        str = "";
                    }
                    C674850QdX c674850QdX3 = new C674850QdX(null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, c676050QfT3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    if (getContext() != null && (photoSearchBaseVM = this.LLJJJIL) != null) {
                        photoSearchBaseVM.DQ2(c674850QdX3);
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

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object c098200Yq;
        long jLongValue;
        String str;
        String str2;
        String ecSearchSessionId;
        String string;
        String str3;
        String str4;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams4;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams3;
        PhotoSearchEnterParams photoSearchEnterParams5;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams4;
        PhotoSearchEnterParams photoSearchEnterParams6;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams5;
        PhotoSearchEnterParams photoSearchEnterParams7;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams6;
        PhotoSearchEnterParams photoSearchEnterParams8;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        Long l;
        String str5;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams2;
        List<ProductCard> list;
        ProductCard productCard;
        Serializable serializable;
        C488690JEl c488690JEl;
        super.onCreate(bundle);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IPhotoSearchRootFragmentAbility.class, null, null);
        C1361400lX0 c1361400lX0 = (C1361400lX0) this.LLJJIJIIJIL.getValue();
        if ((c1361400lX0 instanceof C488690JEl) && (c488690JEl = (C488690JEl) c1361400lX0) != null) {
            c488690JEl.LLIZ = new WeakReference<>(this);
        }
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("photo_search_enter_param");
            } else {
                serializable = null;
            }
            if (serializable instanceof PhotoSearchEnterParams) {
                c098200Yq = (PhotoSearchEnterParams) serializable;
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
        PhotoSearchEnterParams photoSearchEnterParams9 = (PhotoSearchEnterParams) c098200Yq;
        if (photoSearchEnterParams9 != null) {
            IPhotoSearchService iPhotoSearchService = (IPhotoSearchService) PluggableExtentionKt.pluggableSpi$default(IPhotoSearchService.class, false, false, false, 14, null);
            if (iPhotoSearchService != null) {
                iPhotoSearchService.LJIIJ(photoSearchEnterParams9);
            }
            PhotoSearchBaseVM photoSearchBaseVMLIZJ = C676160Qfe.LIZJ(this);
            this.LLJJJIL = photoSearchBaseVMLIZJ;
            if (photoSearchBaseVMLIZJ != null) {
                photoSearchBaseVMLIZJ.EQ2(photoSearchEnterParams9);
            }
            PhotoSearchBaseVM photoSearchBaseVM = this.LLJJJIL;
            if (photoSearchBaseVM != null) {
                photoSearchBaseVM.LLJJJJLIIL = true;
                PhotoSearchEnterParams photoSearchEnterParams10 = photoSearchBaseVM.LLILLL;
                if (photoSearchEnterParams10 != null && (photoSearchToolsEnterParams2 = photoSearchEnterParams10.toolsParams) != null && (list = photoSearchToolsEnterParams2.fypProductImages) != null && (productCard = (ProductCard) C13LP.LJJJLZIJ(0, list)) != null) {
                    str5 = productCard.productId;
                } else {
                    str5 = null;
                }
                photoSearchBaseVM.LLJILJIL = str5;
            }
        } else {
            C19EG activity = getActivity();
            if (activity != null) {
                this.LLJJJIL = C676160Qfe.LIZIZ(activity);
            }
        }
        PhotoSearchBaseVM photoSearchBaseVM2 = this.LLJJJIL;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams8 = photoSearchBaseVM2.LLILLL) != null && (photoSearchToolsEnterParams = photoSearchEnterParams8.toolsParams) != null && (l = photoSearchToolsEnterParams.searchTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = jCurrentTimeMillis;
        }
        C676310Qft c676310Qft = new C676310Qft();
        c676310Qft.LIZIZ = jLongValue;
        C676320Qfu.LIZ = c676310Qft;
        C676320Qfu.LIZJ(new AwS47S0100100_10(jCurrentTimeMillis, this, 2));
        PhotoSearchBaseVM photoSearchBaseVM3 = this.LLJJJIL;
        if (photoSearchBaseVM3 != null && (photoSearchEnterParams7 = photoSearchBaseVM3.LLILLL) != null && (photoSearchBusinessEnterParams6 = photoSearchEnterParams7.businessParams) != null) {
            str = photoSearchBusinessEnterParams6.sourceBtmToken;
        } else {
            str = null;
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        btmSDK.registerBtmPageOnCreate(this, "a2270.b5442", str);
        C1766870w4z c1766870w4z = C1766870w4z.LIZ;
        List listSingletonList = Collections.singletonList(PageFinder.via(btmSDK.getLastCreatePage()));
        Pair[] pairArr = new Pair[5];
        PhotoSearchBaseVM photoSearchBaseVM4 = this.LLJJJIL;
        if (photoSearchBaseVM4 != null && (photoSearchEnterParams6 = photoSearchBaseVM4.LLILLL) != null && (photoSearchBusinessEnterParams5 = photoSearchEnterParams6.businessParams) != null) {
            str2 = photoSearchBusinessEnterParams5.searchSessionId;
        } else {
            str2 = null;
        }
        pairArr[0] = new Pair("search_session_id", str2);
        PhotoSearchBaseVM photoSearchBaseVM5 = this.LLJJJIL;
        if (photoSearchBaseVM5 != null && (photoSearchEnterParams5 = photoSearchBaseVM5.LLILLL) != null && (photoSearchBusinessEnterParams4 = photoSearchEnterParams5.businessParams) != null) {
            ecSearchSessionId = photoSearchBusinessEnterParams4.getEcSearchSessionId();
        } else {
            ecSearchSessionId = null;
        }
        pairArr[1] = new Pair("ec_search_session_id", ecSearchSessionId);
        PhotoSearchBaseVM photoSearchBaseVM6 = this.LLJJJIL;
        if (photoSearchBaseVM6 != null && (photoSearchEnterParams4 = photoSearchBaseVM6.LLILLL) != null && (photoSearchBusinessEnterParams3 = photoSearchEnterParams4.businessParams) != null) {
            string = Integer.valueOf(photoSearchBusinessEnterParams3.rootEnterFromType).toString();
        } else {
            string = null;
        }
        pairArr[2] = new Pair("ec_search_root_enter_from_type", string);
        PhotoSearchBaseVM photoSearchBaseVM7 = this.LLJJJIL;
        if (photoSearchBaseVM7 != null && (photoSearchEnterParams3 = photoSearchBaseVM7.LLILLL) != null && (photoSearchLogEnterParams = photoSearchEnterParams3.logParams) != null) {
            str3 = photoSearchLogEnterParams.searchEntrance;
        } else {
            str3 = null;
        }
        pairArr[3] = new Pair("search_entrance", str3);
        PhotoSearchBaseVM photoSearchBaseVM8 = this.LLJJJIL;
        if (photoSearchBaseVM8 != null && (photoSearchEnterParams2 = photoSearchBaseVM8.LLILLL) != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams2.businessParams) != null) {
            str4 = photoSearchBusinessEnterParams2.enterMethod;
        } else {
            str4 = null;
        }
        pairArr[4] = new Pair("ec_search_enter_method", str4);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1766870w4z.getClass();
        C1766870w4z.LJ(true, listSingletonList, mapLJIIIIZZ);
        PhotoSearchBaseVM photoSearchBaseVM9 = this.LLJJJIL;
        if (photoSearchBaseVM9 != null && (photoSearchEnterParams = photoSearchBaseVM9.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            IEcomSearchService iEcomSearchServiceLIZ = C315220CXg.LIZ();
            iEcomSearchServiceLIZ.LJLJI(null, "search_session_id", photoSearchBusinessEnterParams.searchSessionId, false);
            iEcomSearchServiceLIZ.LJLJI(null, "ec_search_session_id", photoSearchBusinessEnterParams.getEcSearchSessionId(), false);
            C0QES.LJ(C0QES.LIZ, photoSearchBusinessEnterParams.getEndToEndSessionId(), null, 4);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        C677230QhN c677230QhN = this.LLJJJJLIIL;
        if (c677230QhN != null) {
            c677230QhN.LIZ();
        }
        if (!this.LLJJLIIIJLLLLLLLZ || f > 1.0f) {
            return;
        }
        if (f >= 0.6f) {
            FrameLayout frameLayout = this.LLJLIL;
            if (frameLayout != null) {
                C426750GoL.LJIIIZ(frameLayout, null, Integer.valueOf((int) (((((double) f) * 2.5d) - 1.5d) * ((double) ((Number) this.LLJLL.getValue()).intValue()))), null, null, false, 29);
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = this.LLJLIL;
        if (frameLayout2 == null) {
            return;
        }
        C426750GoL.LJIIIZ(frameLayout2, null, 0, null, null, false, 29);
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        if (!this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        if (i != 3) {
            if (i != 4 && i != 5) {
                return;
            }
            kS(this, tuxSheet, false, true);
            return;
        }
        kS(this, tuxSheet, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[PHI: r1
      0x006d: PHI (r1v31 android.view.View) = (r1v30 android.view.View), (r1v34 android.view.View) binds: [B:21:0x0057, B:26:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchSingleDetectionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.exg, viewGroup, false);
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

    public static final void kS(PhotoSearchSingleDetectionFragment photoSearchSingleDetectionFragment, TuxSheet tuxSheet, boolean z, boolean z2) {
        if (!((Boolean) photoSearchSingleDetectionFragment.LLJJIJI.getValue()).booleanValue() && tuxSheet.getDialog() != null) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(tuxSheet, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIJ(z);
            tuxImmersionBarLIZJ.LIZIZ.LJIIL();
            tuxImmersionBarLIZJ.LIZ(z2);
            tuxImmersionBarLIZJ.LIZLLL();
        }
    }
}
