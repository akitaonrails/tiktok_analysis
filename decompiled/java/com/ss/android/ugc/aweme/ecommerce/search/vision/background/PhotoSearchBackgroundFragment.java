package com.ss.android.ugc.aweme.ecommerce.search.vision.background;

import X.C01GW;
import X.C098200Yq;
import X.C1320700kTM;
import X.C1322110kVd;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C680360QmQ;
import X.C680380QmS;
import X.C680390QmT;
import X.C680400QmU;
import X.C680410QmV;
import X.C680640Qms;
import X.C786410Ut5;
import X.EnumC680530Qmh;
import X.InterfaceC1330440kj4;
import X.InterfaceC680590Qmn;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.background.PhotoSearchBackgroundFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.CropImageViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchBottomPanelViewModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS95S1200000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchBackgroundFragment extends AmeBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+Kid9Piw/HELIOSICA9ZictKiQ0Oio5Jyt9GC0jPSAALSQ+KicRKSYnLj08PSsoDz0yLygpJzs=";
    public C1322110kVd LL;
    public ViewGroup LLILLJJLI;
    public C680640Qms LLILLL;
    public C680380QmS LLILZ;
    public PhotoSearchBaseVM LLILZIL;
    public PhotoSearchBottomPanelViewModel LLILZLL;
    public CropImageWindowViewModel LLIZ;
    public CropImageViewModel LLIZLLLIL;
    public Bitmap LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 169));
    public final AObserverS214S0100000_10 LLJIJIL = new AObserverS214S0100000_10(this, 14);
    public final C680360QmQ LLJILJIL = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0QmQ
        @Override // X.C1320700kTM, X.InterfaceC1320650kTH
        public final void LIZLLL(String str, Throwable th) {
            Integer numValueOf;
            PhotoSearchEnterParams photoSearchEnterParams;
            PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
            MutableLiveData<Unit> mutableLiveData;
            PhotoSearchBaseVM photoSearchBaseVM = this.LIZIZ.LLILZIL;
            if (photoSearchBaseVM != null && (mutableLiveData = photoSearchBaseVM.LLILZIL) != null) {
                mutableLiveData.setValue(Unit.LIZ);
            }
            PhotoSearchBaseVM photoSearchBaseVM2 = this.LIZIZ.LLILZIL;
            if (photoSearchBaseVM2 != null && (photoSearchEnterParams = photoSearchBaseVM2.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
                numValueOf = Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType);
            } else {
                numValueOf = null;
            }
            C675840Qf8.LIZ("image_load_fail", "search_result", null, numValueOf, null, null, 1012);
        }

        /* JADX WARN: Removed duplicated region for block: B:91:0x0183  */
        @Override // X.C1320700kTM, X.InterfaceC1320650kTH
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LJ(java.lang.String r17, java.lang.Object r18, android.graphics.drawable.Animatable r19) {
            /*
                Method dump skipped, instruction units count: 472
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C680360QmQ.LJ(java.lang.String, java.lang.Object, android.graphics.drawable.Animatable):void");
        }
    };

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    public final void MR(List<C680390QmT> list) {
        RectF rectF;
        C680380QmS c680380QmS = this.LLILZ;
        if (c680380QmS != null) {
            c680380QmS.setPointList(list);
        }
        C680380QmS c680380QmS2 = this.LLILZ;
        if (c680380QmS2 != null) {
            c680380QmS2.LLJJIJIL = true;
            c680380QmS2.LJIIIIZZ();
            C680390QmT c680390QmT = c680380QmS2.LLJJL;
            if (c680390QmT != null && (rectF = c680390QmT.LIZIZ) != null) {
                EnumC680530Qmh.LEFT.setCoordinate(rectF.left);
                EnumC680530Qmh.TOP.setCoordinate(rectF.top);
                EnumC680530Qmh.RIGHT.setCoordinate(rectF.right);
                EnumC680530Qmh.BOTTOM.setCoordinate(rectF.bottom);
            }
            c680380QmS2.invalidate();
        }
        C680380QmS c680380QmS3 = this.LLILZ;
        if (c680380QmS3 != null) {
            c680380QmS3.LLJJIJIIJIL = true;
            c680380QmS3.invalidate();
        }
        C680380QmS c680380QmS4 = this.LLILZ;
        if (c680380QmS4 != null) {
            c680380QmS4.setOnRectMoveListener(new InterfaceC680590Qmn() { // from class: X.0Qfi
                @Override // X.InterfaceC680590Qmn
                public final void LIZ(RectF rectF2, C680390QmT c680390QmT2) throws JSONException {
                    String strLJIILIIL;
                    int i;
                    C676190Qfh c676190Qfh;
                    PhotoSearchBackgroundFragment photoSearchBackgroundFragment;
                    CropImageViewModel cropImageViewModel;
                    C676190Qfh c676190Qfh2;
                    C676190Qfh c676190Qfh3;
                    int i2;
                    int childCount;
                    boolean z;
                    PhotoSearchBaseVM photoSearchBaseVM;
                    JSONObject jSONObject;
                    PhotoSearchBaseVM photoSearchBaseVM2 = this.LIZ.LLILZIL;
                    if (photoSearchBaseVM2 != null && (jSONObject = photoSearchBaseVM2.LLIZLLLIL) != null) {
                        jSONObject.put("search_time", System.currentTimeMillis());
                    }
                    PhotoSearchBaseVM photoSearchBaseVM3 = this.LIZ.LLILZIL;
                    if (photoSearchBaseVM3 != null) {
                        photoSearchBaseVM3.FQ2();
                    }
                    C680380QmS c680380QmS5 = this.LIZ.LLILZ;
                    if (c680380QmS5 == null || (strLJIILIIL = c680380QmS5.LJIILIIL(rectF2)) == null) {
                        strLJIILIIL = "";
                    }
                    String strXQ2 = null;
                    C676050QfT c676050QfT = new C676050QfT(null, null, null, null, null, null, null);
                    PhotoSearchBackgroundFragment photoSearchBackgroundFragment2 = this.LIZ;
                    c676050QfT.setDetection(strLJIILIIL);
                    if (c680390QmT2 != null && !c680390QmT2.LJII) {
                        i = c680390QmT2.LIZ;
                    } else {
                        i = 1;
                    }
                    c676050QfT.setDetectionIdx(String.valueOf(i));
                    PhotoSearchBaseVM photoSearchBaseVM4 = photoSearchBackgroundFragment2.LLILZIL;
                    View view = null;
                    if (photoSearchBaseVM4 != null) {
                        strXQ2 = photoSearchBaseVM4.xQ2(null);
                    }
                    c676050QfT.setImageTosUri(strXQ2);
                    C674850QdX c674850QdX = new C674850QdX(null, "user_draw", null, null, null, null, null, null, null, null, null, null, null, null, null, c676050QfT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    if (this.LIZ.getContext() != null && (photoSearchBaseVM = this.LIZ.LLILZIL) != null) {
                        photoSearchBaseVM.DQ2(c674850QdX);
                    }
                    CropImageViewModel cropImageViewModel2 = this.LIZ.LLIZLLLIL;
                    if (cropImageViewModel2 != null && (c676190Qfh3 = cropImageViewModel2.LL) != null) {
                        C676240Qfm c676240Qfm = c676190Qfh3.LLILZLL;
                        if (c676240Qfm == null) {
                            C676240Qfm c676240QfmLIZ = C676190Qfh.LIZ(c676190Qfh3, ((ArrayList) c676190Qfh3.LLILZIL).size(), 1, strLJIILIIL);
                            c676190Qfh3.LLILZLL = c676240QfmLIZ;
                            view = c676240QfmLIZ.LIZ;
                        } else {
                            c676240Qfm.LIZ(strLJIILIIL);
                        }
                        C676240Qfm c676240Qfm2 = c676190Qfh3.LLILZLL;
                        if (c676240Qfm2 != null) {
                            i2 = c676240Qfm2.LJ;
                        } else {
                            i2 = 0;
                        }
                        c676190Qfh3.LIZJ(i2, view);
                        Function2<? super Integer, ? super Boolean, Unit> function2 = c676190Qfh3.LLIZ;
                        if (function2 != null) {
                            LinearLayout linearLayout = c676190Qfh3.LL;
                            if (linearLayout != null) {
                                childCount = linearLayout.getChildCount();
                            } else {
                                childCount = 0;
                            }
                            Integer numValueOf = Integer.valueOf(childCount);
                            if (c676190Qfh3.LLILZLL != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            function2.invoke(numValueOf, Boolean.valueOf(z));
                        }
                    }
                    CropImageViewModel cropImageViewModel3 = this.LIZ.LLIZLLLIL;
                    if (cropImageViewModel3 != null && (c676190Qfh = cropImageViewModel3.LL) != null && c676190Qfh.getItemCount() > 5 && (cropImageViewModel = (photoSearchBackgroundFragment = this.LIZ).LLIZLLLIL) != null && (c676190Qfh2 = cropImageViewModel.LL) != null) {
                        HandlerHook.viewPost(c676190Qfh2, new ARunnableS110S0100000_10(photoSearchBackgroundFragment, 34));
                    }
                    PhotoSearchBackgroundFragment photoSearchBackgroundFragment3 = this.LIZ;
                    PhotoSearchBaseVM photoSearchBaseVM5 = photoSearchBackgroundFragment3.LLILZIL;
                    if (photoSearchBaseVM5 != null) {
                        photoSearchBaseVM5.CQ2("pic_search_entity_show", new AwS95S1200000_10(c680390QmT2, strLJIILIIL, photoSearchBackgroundFragment3, 6));
                    }
                }

                @Override // X.InterfaceC680590Qmn
                public final void LIZIZ(RectF rectF2, C680390QmT c680390QmT2) {
                    String strLJIILIIL;
                    C676190Qfh c676190Qfh;
                    C680380QmS c680380QmS5 = this.LIZ.LLILZ;
                    if (c680380QmS5 == null || (strLJIILIIL = c680380QmS5.LJIILIIL(rectF2)) == null) {
                        strLJIILIIL = "";
                    }
                    CropImageViewModel cropImageViewModel = this.LIZ.LLIZLLLIL;
                    if (cropImageViewModel != null && (c676190Qfh = cropImageViewModel.LL) != null) {
                        c676190Qfh.LIZIZ(Integer.valueOf(c680390QmT2.LIZ), strLJIILIIL, "cursor");
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x040b A[PHI: r5
      0x040b: PHI (r5v12 java.io.File) = (r5v10 java.io.File), (r5v4 java.io.File) binds: [B:245:0x03bc, B:222:0x0329] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.background.PhotoSearchBackgroundFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ex0, viewGroup, false);
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

    public static void NR(C680640Qms c680640Qms, UrlModel urlModel, String str, C680360QmQ c680360QmQ) {
        C680400QmU c680400QmU = new C680400QmU(c680640Qms);
        c680400QmU.LIZIZ = urlModel;
        c680400QmU.LJFF = str;
        c680400QmU.LJ = c680360QmQ;
        c680400QmU.LJI = true;
        c680400QmU.LJII = true;
        c680400QmU.LIZJ = 720;
        c680400QmU.LIZLLL = 720;
        C680410QmV.LIZIZ(c680400QmU);
    }
}
