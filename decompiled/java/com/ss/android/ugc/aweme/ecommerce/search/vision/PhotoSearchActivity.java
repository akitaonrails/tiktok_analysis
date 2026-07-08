package com.ss.android.ugc.aweme.ecommerce.search.vision;

import X.C098200Yq;
import X.C0QES;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1878350yyn;
import X.C189200o6;
import X.C19EH;
import X.C293710BfF;
import X.C299020Bno;
import X.C315220CXg;
import X.C335910DEv;
import X.C634750Ov3;
import X.C675840Qf8;
import X.C675950QfJ;
import X.C676160Qfe;
import X.C786410Ut5;
import X.EnumC1740810vOx;
import X.EnumC335920DEw;
import X.InterfaceC1740760vOs;
import X.InterfaceC1760590vur;
import X.InterfaceC666860QDs;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ecommerce.search.vision.entrance.PhotoSearchEntranceConfig;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceLogParams;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchActivity extends BaseActivity implements InterfaceC1740760vOs, InterfaceC666860QDs {
    public static String LLILZ = "";
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSEgLSQ+Kid9Piw/ICA9ZhUkJjs8GyAtOyw7CSY4IDk6PDw=";
    public View LL;
    public long LLILLJJLI;
    public PhotoSearchBaseVM LLILLL;

    @Override // X.InterfaceC666860QDs
    public final View dp() {
        return null;
    }

    @Override // X.InterfaceC666860QDs
    public final JSONObject getEcommerceSearchInfo() {
        return null;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchActivity", "onResume", true);
        super.onResume();
        LLILZ = null;
        this.LLILLJJLI = System.currentTimeMillis();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.jvm.functions.Function1] */
    public final void LLLLLZL() {
        Serializable c098200Yq;
        Serializable c098200Yq2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams3;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        Long l;
        PhotoSearchEnterParams photoSearchEnterParams4;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams2;
        Long l2;
        PhotoSearchEnterParams photoSearchEnterParams5;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams4;
        PhotoSearchBaseVM photoSearchBaseVMLIZIZ = C676160Qfe.LIZIZ(this);
        this.LLILLL = photoSearchBaseVMLIZIZ;
        PageFinder pageFinder = null;
        if (photoSearchBaseVMLIZIZ != null) {
            try {
                c098200Yq = getIntent().getSerializableExtra("photo_search_enter_param");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null && (c098200Yq instanceof PhotoSearchEnterParams)) {
                photoSearchBaseVMLIZIZ.EQ2((PhotoSearchEnterParams) c098200Yq);
                PhotoSearchEnterParams photoSearchEnterParams6 = photoSearchBaseVMLIZIZ.LLILLL;
                if (photoSearchEnterParams6 != null && (photoSearchBusinessEnterParams = photoSearchEnterParams6.businessParams) != null) {
                    photoSearchBusinessEnterParams.setPersonalContextInfo(LLILZ);
                }
            }
            try {
                c098200Yq2 = getIntent().getSerializableExtra("searchParam");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2) && c098200Yq2 != null && (c098200Yq2 instanceof SearchResultParam)) {
                photoSearchBaseVMLIZIZ.LLILZ = (SearchResultParam) c098200Yq2;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        PhotoSearchBaseVM photoSearchBaseVM = this.LLILLL;
        if (photoSearchBaseVM != null) {
            pageFinder = null;
            RDPhotoSearchTraceTime rDPhotoSearchTraceTime = new RDPhotoSearchTraceTime(null, null, null, null, null, null, new RDPhotoSearchTraceLogParams(null, null, null, null, null, null, null, null, null), null);
            rDPhotoSearchTraceTime.setEnterResult(Long.valueOf(jCurrentTimeMillis));
            RDPhotoSearchTraceLogParams rDPhotoSearchTraceLogParams = rDPhotoSearchTraceTime.logParams;
            if (rDPhotoSearchTraceLogParams != null) {
                PhotoSearchBaseVM photoSearchBaseVM2 = this.LLILLL;
                rDPhotoSearchTraceLogParams.setRootEnterFromType((photoSearchBaseVM2 == null || (photoSearchEnterParams5 = photoSearchBaseVM2.LLILLL) == null || (photoSearchBusinessEnterParams4 = photoSearchEnterParams5.businessParams) == null) ? null : Integer.valueOf(photoSearchBusinessEnterParams4.rootEnterFromType).toString());
                PhotoSearchBaseVM photoSearchBaseVM3 = this.LLILLL;
                rDPhotoSearchTraceLogParams.setPrepareRouterCost((photoSearchBaseVM3 == null || (photoSearchEnterParams4 = photoSearchBaseVM3.LLILLL) == null || (photoSearchToolsEnterParams2 = photoSearchEnterParams4.toolsParams) == null || (l2 = photoSearchToolsEnterParams2.searchTime) == null) ? null : Long.valueOf(jCurrentTimeMillis - l2.longValue()));
            }
            photoSearchBaseVM.LLJI = rDPhotoSearchTraceTime;
        }
        PhotoSearchBaseVM photoSearchBaseVM4 = this.LLILLL;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis - ((photoSearchBaseVM4 == null || (photoSearchEnterParams3 = photoSearchBaseVM4.LLILLL) == null || (photoSearchToolsEnterParams = photoSearchEnterParams3.toolsParams) == null || (l = photoSearchToolsEnterParams.searchTime) == null) ? 0L : l.longValue()));
        PhotoSearchBaseVM photoSearchBaseVM5 = this.LLILLL;
        C675840Qf8.LIZ("enter_page", "search_result", lValueOf, (photoSearchBaseVM5 == null || (photoSearchEnterParams2 = photoSearchBaseVM5.LLILLL) == null || (photoSearchBusinessEnterParams3 = photoSearchEnterParams2.businessParams) == null) ? pageFinder : Integer.valueOf(photoSearchBusinessEnterParams3.rootEnterFromType), pageFinder, pageFinder, 1008);
        PhotoSearchBaseVM photoSearchBaseVM6 = this.LLILLL;
        if (photoSearchBaseVM6 == null || (photoSearchEnterParams = photoSearchBaseVM6.LLILLL) == null || (photoSearchBusinessEnterParams2 = photoSearchEnterParams.businessParams) == null) {
            return;
        }
        IEcomSearchService iEcomSearchServiceLIZ = C315220CXg.LIZ();
        iEcomSearchServiceLIZ.LJLJI(pageFinder, "search_session_id", photoSearchBusinessEnterParams2.searchSessionId, false);
        iEcomSearchServiceLIZ.LJLJI(pageFinder, "ec_search_session_id", photoSearchBusinessEnterParams2.getEcSearchSessionId(), false);
        C0QES.LJ(C0QES.LIZ, photoSearchBusinessEnterParams2.getEndToEndSessionId(), pageFinder, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024e A[PHI: r5
      0x024e: PHI (r5v1 float) = (r5v0 float), (r5v3 float), (r5v3 float), (r5v3 float) binds: [B:75:0x024a, B:32:0x0116, B:34:0x011a, B:36:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZI() {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchActivity.LLLLZI():void");
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.PHOTO_SEARCH_RESULT_PAGE.getPageCode();
    }

    @Override // X.InterfaceC666860QDs
    public final JSONObject iC() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_channel", "tiktok_mall_photo_search");
        return jSONObject;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C786410Ut5.ge(this, 0, 0);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        PhotoSearchBaseVM photoSearchBaseVM = this.LLILLL;
        if (photoSearchBaseVM != null) {
            photoSearchBaseVM.BQ2();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLILLL != null) {
            C675950QfJ.LIZ.getClass();
            C675950QfJ.LIZJ.clear();
            C675950QfJ.LIZLLL.clear();
        }
        if (C293710BfF.LIZ()) {
            C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        super.onPause();
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - this.LLILLJJLI);
        PhotoSearchBaseVM photoSearchBaseVM = this.LLILLL;
        C675840Qf8.LIZ("leave_result_page", "search_result", lValueOf, (photoSearchBaseVM == null || (photoSearchEnterParams = photoSearchBaseVM.LLILLL) == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null) ? null : Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType), null, null, 1008);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PhotoSearchEntranceConfig photoSearchEntranceConfig;
        boolean z;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEntranceConfig photoSearchEntranceConfig2;
        PhotoSearchEntranceConfig photoSearchEntranceConfig3;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchActivity", "onCreate", true);
        super.onCreate(bundle);
        LLLLLZL();
        PhotoSearchBaseVM photoSearchBaseVM = this.LLILLL;
        Integer numValueOf = null;
        if (photoSearchBaseVM != null) {
            photoSearchEntranceConfig = photoSearchBaseVM.LLILLJJLI;
        } else {
            photoSearchEntranceConfig = null;
        }
        if (photoSearchEntranceConfig != null && photoSearchEntranceConfig.pageStyle == 1) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, this);
            if (numLIZJ != null) {
                getWindow().setBackgroundDrawable(new ColorDrawable(numLIZJ.intValue()));
            }
        } else {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(R.layout.jt);
        PhotoSearchBaseVM photoSearchBaseVM2 = this.LLILLL;
        if (photoSearchBaseVM2 != null && (photoSearchEntranceConfig3 = photoSearchBaseVM2.LLILLJJLI) != null && photoSearchEntranceConfig3.pageStyle == 1) {
            C786410Ut5.ge(this, R.anim.fv, R.anim.g2);
        } else {
            C786410Ut5.ge(this, 0, 0);
        }
        PhotoSearchBaseVM photoSearchBaseVM3 = this.LLILLL;
        if (photoSearchBaseVM3 != null && (photoSearchEntranceConfig2 = photoSearchBaseVM3.LLILLJJLI) != null && photoSearchEntranceConfig2.pageStyle == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
            immersionBarLJIILJJIL.LJIIL();
            tuxImmersionBar.LJFF(-16777216);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
        } else {
            TuxImmersionBar tuxImmersionBar2 = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
            tuxImmersionBar2.LJFF(-16777216);
            tuxImmersionBar2.LJIIIIZZ(R.attr.e1);
            tuxImmersionBar2.LIZLLL();
        }
        LLLLZI();
        C634750Ov3 c634750Ov3 = C634750Ov3.LIZ;
        PhotoSearchBaseVM photoSearchBaseVM4 = this.LLILLL;
        if (photoSearchBaseVM4 != null && (photoSearchEnterParams = photoSearchBaseVM4.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            numValueOf = Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType);
        }
        c634750Ov3.getClass();
        C634750Ov3.LIZJ(numValueOf);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LLLLLZL();
        List<Fragment> listLJJLIIIJL = getSupportFragmentManager().LJJLIIIJL();
        if (!listLJJLIIIJL.isEmpty()) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
            while (it2.hasNext()) {
                c19ehLJIIJ.LJIIZILJ(it2.next());
            }
            c19ehLJIIJ.LJIIL();
        }
        LLLLZI();
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setNineScreenBackgroundFromXml(View view) {
        this.LL = view;
    }

    @Override // X.C19FO, android.app.Activity
    public final void setRequestedOrientation(int i) {
        super.setRequestedOrientation(1);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
