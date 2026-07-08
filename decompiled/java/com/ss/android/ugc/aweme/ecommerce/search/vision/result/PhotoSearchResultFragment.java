package com.ss.android.ugc.aweme.ecommerce.search.vision.result;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C1319550kRV;
import X.C13IQ;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16GX;
import X.C1766870w4z;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C275020AqC;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C478401te;
import X.C676090QfX;
import X.C676160Qfe;
import X.C676190Qfh;
import X.C676310Qft;
import X.C676320Qfu;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.AObserverS214S0100000_10;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.cart.vm.SearchCartVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchImageResponse;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchResponse;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS23S1101000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS47S0100100_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchResultFragment extends AmeBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+KiHELIOSd9Piw/ICA9ZjcpOjo/PGscISAnJxYpKD0wIBcpOjo/PAM+KCg+LSs4";
    public C478401te LL;
    public C16GX LLILLJJLI;
    public LinearLayout LLILLL;
    public FrameLayout LLILZ;
    public C1319550kRV LLILZIL;
    public C676190Qfh LLILZLL;
    public PhotoSearchBaseVM LLIZ;
    public PhotoSearchBottomPanelViewModel LLIZLLLIL;
    public boolean LLJ;
    public final AssemVMLazy LLJI;
    public final AObserverS214S0100000_10 LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoSearchResultFragment.class, "searchCartVM", "getSearchCartVM()Lcom/ss/android/ugc/aweme/ecommerce/search/cart/vm/SearchCartVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PhotoSearchResultFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchCartVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 173);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(86);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 174), aFwS241S0000000_10, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new AwS554S0100000_10((Fragment) this, 175), aFwS241S0000000_10, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 176), aFwS241S0000000_10, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJI = assemVMLazy;
        this.LLJIJIL = new AObserverS214S0100000_10(this, 15);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        PhotoSearchBaseVM photoSearchBaseVM;
        C16GX c16gx = this.LLILLJJLI;
        if (c16gx != null && (photoSearchBaseVM = this.LLIZ) != null) {
            photoSearchBaseVM.vQ2(c16gx);
        }
        super.onDestroy();
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C19EG activity;
        Window window;
        View decorView;
        super.onDestroyView();
        this.LL = null;
        if (!((Boolean) C275020AqC.LIZ.getValue()).booleanValue() || (activity = getActivity()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setOnApplyWindowInsetsListener(null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    public final void MR(C676090QfX<PhotoSearchResponse> c676090QfX) {
        PhotoSearchImageResponse photoSearchImageResponse;
        List<String> boxDetection;
        if (!this.LLJ) {
            this.LLJ = true;
            PhotoSearchBaseVM photoSearchBaseVM = this.LLIZ;
            if (photoSearchBaseVM != null) {
                photoSearchBaseVM.CQ2("pic_search_module_show", new AwS376S0200000_10((C676090QfX) c676090QfX, (C676090QfX<PhotoSearchResponse>) this, (PhotoSearchResultFragment) 24));
            }
            PhotoSearchResponse photoSearchResponse = c676090QfX.LIZ;
            if (photoSearchResponse != null && (photoSearchImageResponse = photoSearchResponse.LIZ) != null && (boxDetection = photoSearchImageResponse.getBoxDetection()) != null) {
                int i = 0;
                for (String str : boxDetection) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        String str2 = str;
                        PhotoSearchBaseVM photoSearchBaseVM2 = this.LLIZ;
                        if (photoSearchBaseVM2 != null) {
                            photoSearchBaseVM2.CQ2("pic_search_entity_show", new AwS23S1101000_10(i, str2, this, 1));
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long jLongValue;
        String str;
        String str2;
        String ecSearchSessionId;
        String string;
        String str3;
        String str4;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        Long endToEndSessionId;
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
        super.onCreate(bundle);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLIZLLLIL = (PhotoSearchBottomPanelViewModel) ViewModelProviders.of(activity).get(PhotoSearchBottomPanelViewModel.class);
            this.LLIZ = C676160Qfe.LIZIZ(activity);
        }
        PhotoSearchBaseVM photoSearchBaseVM = this.LLIZ;
        if (photoSearchBaseVM != null && (photoSearchEnterParams8 = photoSearchBaseVM.LLILLL) != null && (photoSearchToolsEnterParams = photoSearchEnterParams8.toolsParams) != null && (l = photoSearchToolsEnterParams.searchTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = jCurrentTimeMillis;
        }
        C676310Qft c676310Qft = new C676310Qft();
        c676310Qft.LIZIZ = jLongValue;
        C676320Qfu.LIZ = c676310Qft;
        C676320Qfu.LIZJ(new AwS47S0100100_10(jCurrentTimeMillis, this, 1));
        PhotoSearchBaseVM photoSearchBaseVM2 = this.LLIZ;
        String string2 = null;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams7 = photoSearchBaseVM2.LLILLL) != null && (photoSearchBusinessEnterParams6 = photoSearchEnterParams7.businessParams) != null) {
            str = photoSearchBusinessEnterParams6.sourceBtmToken;
        } else {
            str = null;
        }
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b5442", str);
        C1766870w4z c1766870w4z = C1766870w4z.LIZ;
        List listSingletonList = Collections.singletonList(PageFinder.via((Fragment) this));
        Pair[] pairArr = new Pair[6];
        PhotoSearchBaseVM photoSearchBaseVM3 = this.LLIZ;
        if (photoSearchBaseVM3 != null && (photoSearchEnterParams6 = photoSearchBaseVM3.LLILLL) != null && (photoSearchBusinessEnterParams5 = photoSearchEnterParams6.businessParams) != null) {
            str2 = photoSearchBusinessEnterParams5.searchSessionId;
        } else {
            str2 = null;
        }
        pairArr[0] = new Pair("search_session_id", str2);
        PhotoSearchBaseVM photoSearchBaseVM4 = this.LLIZ;
        if (photoSearchBaseVM4 != null && (photoSearchEnterParams5 = photoSearchBaseVM4.LLILLL) != null && (photoSearchBusinessEnterParams4 = photoSearchEnterParams5.businessParams) != null) {
            ecSearchSessionId = photoSearchBusinessEnterParams4.getEcSearchSessionId();
        } else {
            ecSearchSessionId = null;
        }
        pairArr[1] = new Pair("ec_search_session_id", ecSearchSessionId);
        PhotoSearchBaseVM photoSearchBaseVM5 = this.LLIZ;
        if (photoSearchBaseVM5 != null && (photoSearchEnterParams4 = photoSearchBaseVM5.LLILLL) != null && (photoSearchBusinessEnterParams3 = photoSearchEnterParams4.businessParams) != null) {
            string = Integer.valueOf(photoSearchBusinessEnterParams3.rootEnterFromType).toString();
        } else {
            string = null;
        }
        pairArr[2] = new Pair("ec_search_root_enter_from_type", string);
        PhotoSearchBaseVM photoSearchBaseVM6 = this.LLIZ;
        if (photoSearchBaseVM6 != null && (photoSearchEnterParams3 = photoSearchBaseVM6.LLILLL) != null && (photoSearchLogEnterParams = photoSearchEnterParams3.logParams) != null) {
            str3 = photoSearchLogEnterParams.searchEntrance;
        } else {
            str3 = null;
        }
        pairArr[3] = new Pair("search_entrance", str3);
        PhotoSearchBaseVM photoSearchBaseVM7 = this.LLIZ;
        if (photoSearchBaseVM7 != null && (photoSearchEnterParams2 = photoSearchBaseVM7.LLILLL) != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams2.businessParams) != null) {
            str4 = photoSearchBusinessEnterParams2.enterMethod;
        } else {
            str4 = null;
        }
        pairArr[4] = new Pair("ec_search_enter_method", str4);
        PhotoSearchBaseVM photoSearchBaseVM8 = this.LLIZ;
        if (photoSearchBaseVM8 != null && (photoSearchEnterParams = photoSearchBaseVM8.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null && (endToEndSessionId = photoSearchBusinessEnterParams.getEndToEndSessionId()) != null) {
            string2 = endToEndSessionId.toString();
        }
        pairArr[5] = new Pair("end_to_end_search_session_id", string2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1766870w4z.getClass();
        C1766870w4z.LJ(true, listSingletonList, mapLJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d5 A[PHI: r19
      0x02d5: PHI (r19v2 java.lang.String) = (r19v1 java.lang.String), (r19v11 java.lang.String), (r19v11 java.lang.String) binds: [B:118:0x02d1, B:85:0x022d, B:87:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02da A[PHI: r15 r19
      0x02da: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v9 java.lang.String), (r15v9 java.lang.String) binds: [B:121:0x02d6, B:90:0x0237, B:92:0x023b] A[DONT_GENERATE, DONT_INLINE]
      0x02da: PHI (r19v3 java.lang.String) = (r19v2 java.lang.String), (r19v10 java.lang.String), (r19v10 java.lang.String) binds: [B:121:0x02d6, B:90:0x0237, B:92:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02df A[PHI: r14 r15 r19
      0x02df: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v7 java.lang.String), (r14v7 java.lang.String) binds: [B:124:0x02db, B:95:0x0241, B:97:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r15v4 java.lang.String) = (r15v3 java.lang.String), (r15v8 java.lang.String), (r15v8 java.lang.String) binds: [B:124:0x02db, B:95:0x0241, B:97:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r19v4 java.lang.String) = (r19v3 java.lang.String), (r19v9 java.lang.String), (r19v9 java.lang.String) binds: [B:124:0x02db, B:95:0x0241, B:97:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e4 A[PHI: r13 r14 r15 r19
      0x02e4: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v7 java.lang.String), (r13v7 java.lang.String) binds: [B:127:0x02e0, B:100:0x024b, B:102:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r14v4 java.lang.String) = (r14v3 java.lang.String), (r14v6 java.lang.String), (r14v6 java.lang.String) binds: [B:127:0x02e0, B:100:0x024b, B:102:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r15v5 java.lang.String) = (r15v4 java.lang.String), (r15v7 java.lang.String), (r15v7 java.lang.String) binds: [B:127:0x02e0, B:100:0x024b, B:102:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r19v5 java.lang.String) = (r19v4 java.lang.String), (r19v8 java.lang.String), (r19v8 java.lang.String) binds: [B:127:0x02e0, B:100:0x024b, B:102:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0249 A[PHI: r13 r14 r15 r19
      0x0249: PHI (r13v7 java.lang.String) = (r13v2 java.lang.String), (r13v8 java.lang.String) binds: [B:127:0x02e0, B:98:0x0247] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r14v6 java.lang.String) = (r14v3 java.lang.String), (r14v7 java.lang.String) binds: [B:127:0x02e0, B:98:0x0247] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r15v7 java.lang.String) = (r15v4 java.lang.String), (r15v8 java.lang.String) binds: [B:127:0x02e0, B:98:0x0247] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r19v8 java.lang.String) = (r19v4 java.lang.String), (r19v9 java.lang.String) binds: [B:127:0x02e0, B:98:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r54, android.os.Bundle r55) {
        /*
            Method dump skipped, instruction units count: 1121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchResultFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ex1, viewGroup, false);
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
}
