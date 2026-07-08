package com.ss.android.ugc.aweme.ecommerce.search.vision.tag;

import X.C098200Yq;
import X.C0QES;
import X.C0QSJ;
import X.C1361400lX0;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C1766860w4y;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C262100zr;
import X.C315220CXg;
import X.C673150Qan;
import X.C674850QdX;
import X.C675090Qdv;
import X.C676050QfT;
import X.C676090QfX;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1141530foN;
import X.InterfaceC1146704e9;
import X.InterfaceC1206390hUz;
import X.InterfaceC687730QyJ;
import Y.AObserverS214S0100000_10;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.ability.IPhotoSearchRootFragmentAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.ability.PhotoSearchRootFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchResponse;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchShopResultFragment extends AmeBaseFragment implements InterfaceC1141530foN, InterfaceC1206390hUz, IPhotoSearchRootFragmentAbility, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+Kid9HELIOSPiw/ICA9ZjEtLmEDICo4Jhw2KTcvIRw7JzUeLDwmJDEKOy40JSAiPQ==";
    public FrameLayout LL;
    public long LLILLJJLI;
    public long LLILLL;
    public PhotoSearchBaseVM LLILZ;
    public int LLILZIL = 1;
    public boolean LLILZLL = true;
    public final AObserverS214S0100000_10 LLIZ = new AObserverS214S0100000_10(this, 17);

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
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

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
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

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.ability.IPhotoSearchRootFragmentAbility
    public final C1361400lX0 c41() {
        PhotoSearchBaseVM photoSearchBaseVM = this.LLILZ;
        if (photoSearchBaseVM != null) {
            return photoSearchBaseVM.LLJLILLLLZIIL;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018d A[PHI: r13
      0x018d: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v4 java.lang.String), (r13v4 java.lang.String) binds: [B:84:0x018a, B:70:0x0152, B:72:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.tag.PhotoSearchShopResultFragment.onDestroy():void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[PHI: r7
      0x0048: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String), (r7v4 java.lang.String) binds: [B:25:0x0045, B:10:0x0014, B:12:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() throws org.json.JSONException {
        /*
            r11 = this;
            super.onPause()
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r1 = r11.LLILZ
            r6 = 0
            if (r1 == 0) goto L44
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r0 = r1.LLILLL
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r0.businessParams
            if (r0 == 0) goto L44
            java.lang.String r7 = r0.enterFrom
        L12:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r0 = r1.LLILLL
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r0.businessParams
            if (r0 == 0) goto L48
            java.lang.String r8 = r0.enterMethod
        L1c:
            long r3 = r1.LLJJLIIIJLLLLLLLZ
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
        L23:
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r0 = r11.LLILZ
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r0 = r0.LLILLL
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r0.businessParams
            if (r0 == 0) goto L35
            int r0 = r0.rootEnterFromType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L35:
            java.lang.String r3 = "leave_result_page"
            java.lang.String r4 = "search_result"
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r9 = 0
            r10 = 2544(0x9f0, float:3.565E-42)
            X.C675840Qf8.LIZJ(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L44:
            r7 = r6
            if (r1 == 0) goto L48
            goto L12
        L48:
            r8 = r6
            if (r1 != 0) goto L1c
            r1 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.tag.PhotoSearchShopResultFragment.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[PHI: r5
      0x0072: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String), (r5v4 java.lang.String) binds: [B:30:0x006f, B:18:0x0043, B:20:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws org.json.JSONException {
        /*
            r9 = this;
            boolean r0 = X.C616540OGe.LIZ()
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r0 = com.ss.android.ugc.aweme.services.IMainService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IMainService r1 = (com.ss.android.ugc.aweme.services.IMainService) r1
            X.19EG r0 = r9.getActivity()
            boolean r0 = r1.isMainPage(r0)
            if (r0 != 0) goto L25
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.vision.tag.PhotoSearchShopResultFragment> r0 = com.ss.android.ugc.aweme.ecommerce.search.vision.tag.PhotoSearchShopResultFragment.class
            java.lang.String r0 = r0.getName()
            X.C2187451AjH.LJJIJIIJI(r0)
        L25:
            super.onResume()
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r2 = r9.LLILZ
            if (r2 == 0) goto L32
            long r0 = java.lang.System.currentTimeMillis()
            r2.LLJJLIIIJLLLLLLLZ = r0
        L32:
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r1 = r9.LLILZ
            r4 = 0
            if (r1 == 0) goto L6e
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r0 = r1.LLILLL
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r0.businessParams
            if (r0 == 0) goto L6e
            java.lang.String r5 = r0.enterFrom
        L41:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r0 = r1.LLILLL
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r0.businessParams
            if (r0 == 0) goto L72
            java.lang.String r6 = r0.enterMethod
        L4b:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r0 = r1.LLILLL
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r0.businessParams
            if (r0 == 0) goto L59
            int r0 = r0.rootEnterFromType
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L59:
            java.lang.String r1 = "enter_result_page"
            java.lang.String r2 = "search_result"
            r3 = 0
            kotlin.jvm.internal.AwS589S0100000_10 r7 = new kotlin.jvm.internal.AwS589S0100000_10
            r0 = 99
            r7.<init>(r9, r0)
            r8 = 500(0x1f4, float:7.0E-43)
            X.C675840Qf8.LIZJ(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r9.LLILZIL = r0
            return
        L6e:
            r5 = r4
            if (r1 == 0) goto L72
            goto L41
        L72:
            r6 = r4
            if (r1 == 0) goto L59
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.tag.PhotoSearchShopResultFragment.onResume():void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLILLL = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075 A[PHI: r11
      0x0075: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v5 java.lang.String), (r11v5 java.lang.String) binds: [B:40:0x0072, B:21:0x003b, B:23:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079 A[PHI: r11 r12
      0x0079: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v4 java.lang.String), (r11v4 java.lang.String) binds: [B:43:0x0076, B:26:0x0045, B:28:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String), (r12v3 java.lang.String) binds: [B:43:0x0076, B:26:0x0045, B:28:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR(com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchResponse r16) {
        /*
            r15 = this;
            long r5 = java.lang.System.currentTimeMillis()
            r7 = r16
            com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime r0 = r7.techLogParams
            r10 = 0
            if (r0 == 0) goto L20
            com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceLogParams r4 = r0.logParams
            if (r4 == 0) goto L20
            java.lang.Long r0 = r0.netReceive
            if (r0 == 0) goto L7c
            long r2 = r0.longValue()
            long r0 = r5 - r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L1d:
            r4.setClientProcess(r0)
        L20:
            com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime r1 = r7.techLogParams
            if (r1 == 0) goto L2b
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1.setUpdateDataTimestamp(r0)
        L2b:
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r1 = r15.LLILZ
            if (r1 == 0) goto L71
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r0 = r1.LLILLL
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r0.businessParams
            if (r0 == 0) goto L71
            java.lang.String r11 = r0.enterFrom
        L39:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r0 = r1.LLILLL
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r0.businessParams
            if (r0 == 0) goto L75
            java.lang.String r12 = r0.enterMethod
        L43:
            com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime r0 = r1.LLJI
            if (r0 == 0) goto L79
            java.lang.Long r0 = r0.netReceive
            if (r0 == 0) goto L79
            long r0 = r0.longValue()
        L4f:
            long r5 = r5 - r0
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r0 = r15.LLILZ
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r0 = r0.LLILLL
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r0.businessParams
            if (r0 == 0) goto L62
            int r0 = r0.rootEnterFromType
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L62:
            java.lang.String r7 = "api_result_data_process"
            java.lang.String r8 = "search_result"
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            r13 = 0
            r14 = 2544(0x9f0, float:3.565E-42)
            X.C675840Qf8.LIZJ(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L71:
            r11 = r10
            if (r1 == 0) goto L75
            goto L39
        L75:
            r12 = r10
            if (r1 == 0) goto L79
            goto L43
        L79:
            r0 = 0
            goto L4f
        L7c:
            r0 = r10
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.tag.PhotoSearchShopResultFragment.MR(com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchResponse):void");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C674850QdX c674850QdX;
        C676050QfT c676050QfT;
        TypedByteArray typedByteArray;
        String str;
        String str2;
        PhotoSearchBaseVM photoSearchBaseVM;
        C674850QdX c674850QdX2;
        C676050QfT c676050QfT2;
        C674850QdX c674850QdX3;
        C676050QfT c676050QfT3;
        C674850QdX c674850QdX4;
        C676050QfT c676050QfT4;
        JSONObject jSONObject;
        if (this.mStatusDestroyed) {
            return;
        }
        try {
            if (Intrinsics.LJFF("ttec_photo_search_retry", c262100zr.LIZ)) {
                PhotoSearchBaseVM photoSearchBaseVM2 = this.LLILZ;
                if (photoSearchBaseVM2 != null && (jSONObject = photoSearchBaseVM2.LLIZLLLIL) != null) {
                    jSONObject.put("search_time", System.currentTimeMillis());
                }
                PhotoSearchBaseVM photoSearchBaseVM3 = this.LLILZ;
                if (photoSearchBaseVM3 != null) {
                    photoSearchBaseVM3.FQ2();
                }
                PhotoSearchBaseVM photoSearchBaseVM4 = this.LLILZ;
                if (photoSearchBaseVM4 != null && (c674850QdX = photoSearchBaseVM4.LLILZLL) != null && (c676050QfT = c674850QdX.photoSearch) != null && (typedByteArray = c676050QfT.image) != null) {
                    String str3 = null;
                    C676050QfT c676050QfT5 = new C676050QfT(null, null, null, null, null, null, null);
                    c676050QfT5.setImage(typedByteArray);
                    PhotoSearchBaseVM photoSearchBaseVM5 = this.LLILZ;
                    PhotoSearchEnterParams photoSearchEnterParams = null;
                    if (photoSearchBaseVM5 != null && (c674850QdX4 = photoSearchBaseVM5.LLILZLL) != null && (c676050QfT4 = c674850QdX4.photoSearch) != null) {
                        str = c676050QfT4.imageTosUri;
                    } else {
                        str = null;
                    }
                    c676050QfT5.setImageTosUri(str);
                    PhotoSearchBaseVM photoSearchBaseVM6 = this.LLILZ;
                    if (photoSearchBaseVM6 != null && (c674850QdX3 = photoSearchBaseVM6.LLILZLL) != null && (c676050QfT3 = c674850QdX3.photoSearch) != null) {
                        str2 = c676050QfT3.detection;
                    } else {
                        str2 = null;
                    }
                    c676050QfT5.setDetection(str2);
                    PhotoSearchBaseVM photoSearchBaseVM7 = this.LLILZ;
                    if (photoSearchBaseVM7 != null && (c674850QdX2 = photoSearchBaseVM7.LLILZLL) != null && (c676050QfT2 = c674850QdX2.photoSearch) != null) {
                        str3 = c676050QfT2.detectionIdx;
                    }
                    c676050QfT5.setDetectionIdx(str3);
                    PhotoSearchBaseVM photoSearchBaseVM8 = this.LLILZ;
                    if (photoSearchBaseVM8 != null) {
                        photoSearchEnterParams = photoSearchBaseVM8.LLILLL;
                    }
                    C674850QdX c674850QdXLIZIZ = C675090Qdv.LIZIZ(photoSearchEnterParams, c676050QfT5);
                    if (getActivity() != null && (photoSearchBaseVM = this.LLILZ) != null) {
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

    /* JADX WARN: Removed duplicated region for block: B:111:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d9 A[PHI: r10
      0x01d9: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String), (r10v3 java.lang.String) binds: [B:120:0x01d5, B:47:0x00d0, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.tag.PhotoSearchShopResultFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        long jLongValue;
        int i;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        Long l;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        MutableLiveData<C676090QfX<PhotoSearchResponse>> mutableLiveData;
        MutableLiveData<C676090QfX<PhotoSearchResponse>> mutableLiveData2;
        super.onViewCreated(view, bundle);
        PhotoSearchBaseVM photoSearchBaseVM = this.LLILZ;
        if (photoSearchBaseVM != null && (mutableLiveData2 = photoSearchBaseVM.LL) != null) {
            mutableLiveData2.removeObserver(this.LLIZ);
        }
        PhotoSearchBaseVM photoSearchBaseVM2 = this.LLILZ;
        if (photoSearchBaseVM2 != null && (mutableLiveData = photoSearchBaseVM2.LL) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), this.LLIZ);
        }
        PhotoSearchBaseVM photoSearchBaseVM3 = this.LLILZ;
        if (photoSearchBaseVM3 != null && (photoSearchEnterParams3 = photoSearchBaseVM3.LLILLL) != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams3.businessParams) != null) {
            IEcomSearchService iEcomSearchServiceLIZ = C315220CXg.LIZ();
            iEcomSearchServiceLIZ.LJLJI(null, "search_session_id", photoSearchBusinessEnterParams2.searchSessionId, false);
            iEcomSearchServiceLIZ.LJLJI(null, "ec_search_session_id", photoSearchBusinessEnterParams2.getEcSearchSessionId(), false);
            C0QES.LJ(C0QES.LIZ, photoSearchBusinessEnterParams2.getEndToEndSessionId(), PageFinder.via((Fragment) this), 2);
        }
        if (getContext() != null) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG activity = getActivity();
            sAFHelper.getClass();
            if (SAFHelper.LJIJJ(this, activity) != null) {
                PhotoSearchBaseVM photoSearchBaseVM4 = this.LLILZ;
                if (photoSearchBaseVM4 != null) {
                    View viewFindViewById = this.LL;
                    if (viewFindViewById == null) {
                        View view2 = getView();
                        if (view2 != null) {
                            viewFindViewById = view2.findViewById(R.id.htp);
                        } else {
                            viewFindViewById = null;
                        }
                        this.LL = (FrameLayout) viewFindViewById;
                    }
                    photoSearchBaseVM4.zQ2(viewFindViewById);
                }
                try {
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                C1548820qPI.LIZLLL("ttec_photo_search_retry", this);
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS589S0100000_10(this, 476), 3);
        PhotoSearchBaseVM photoSearchBaseVM5 = this.LLILZ;
        if (photoSearchBaseVM5 != null && (photoSearchEnterParams2 = photoSearchBaseVM5.LLILLL) != null && (photoSearchToolsEnterParams = photoSearchEnterParams2.toolsParams) != null && (l = photoSearchToolsEnterParams.searchTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LLILLJJLI = jLongValue;
        PhotoSearchBaseVM photoSearchBaseVM6 = this.LLILZ;
        if (photoSearchBaseVM6 != null) {
            photoSearchBaseVM6.LLJJJJ = PageFinder.via(view);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PhotoSearchBaseVM photoSearchBaseVM7 = this.LLILZ;
        if (photoSearchBaseVM7 != null && (photoSearchEnterParams = photoSearchBaseVM7.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            i = photoSearchBusinessEnterParams.rootEnterFromType;
        } else {
            i = -1;
        }
        linkedHashMap.put("ec_search_root_enter_from_type", String.valueOf(i));
        C1766860w4y.LIZ.getClass();
        C1766860w4y.LJIILIIL(view, linkedHashMap, false);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ex2, viewGroup, false);
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
