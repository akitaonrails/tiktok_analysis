package com.ss.android.ugc.aweme.poi.detail.gallery;

import X.C01GW;
import X.C0QSJ;
import X.C1182990gtF;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185440gxC;
import X.C1185490gxH;
import X.C1188440h22;
import X.C1196110hEP;
import X.C1202420hOa;
import X.C1308910kAL;
import X.C1365870leD;
import X.C1389600mGU;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1599690rjL;
import X.C1697810uHb;
import X.C197039127h;
import X.C19HL;
import X.C299020Bno;
import X.C335910DEv;
import X.C339190DRl;
import X.C422030Ggj;
import X.C452501pT;
import X.C585240MxO;
import X.C622680Oba;
import X.C673150Qan;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1146704e9;
import X.InterfaceC342470Dbh;
import X.InterfaceC687730QyJ;
import X.InterfaceC836750Ws5;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGalleryActivity extends BaseActivity implements PoiGalleryAbility, InterfaceC836750Ws5, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGE3LTHELIOSEtICN9LyQgJSohMWscJiYUKSkgLD0qCSY4IDk6PDw=";
    public C422030Ggj LLJJIII;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJIJI;
    public C1196110hEP LLJJIJIIJIL;
    public View LLJJIJIL;
    public TuxIconView LLJJJ;
    public TuxIconView LLJJJIL;
    public ViewGroup LLJJJJ;
    public View LLJJJJJIL;
    public C197039127h LLJJJJLIIL;
    public ViewGroup LLJJL;
    public C1185440gxC LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public C19HL LLJLLIL;
    public InterfaceC342470Dbh LLJLLL;
    public final C01GW LL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(330), "poi_gallery_images", ArrayList.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(328), "poi_gallery_index", Integer.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(329), "image_size", Integer.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(399), "enable_exit_anim", Boolean.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(397), "poi_gallery_anchor_data", ArrayList.class);
    public final C01GW LLILZLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(404), "poi_picture_infos", ArrayList.class);
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(406), "thumbnail_urls", ArrayList.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(401), "mob_data", PoiInnerPageMobData.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(398), "current_poi_session_info", PoiCurrentSessionInfo.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(403), "poi_common_mob_params", PoiCommonMobParams.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(334), "poi_detail_response", PoiListApi.PoiDetailResponse.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(331), "poi_anchor_data", C1188440h22.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(333), "poi_detail_params", C1185410gx9.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(332), "poi_anchor_mob_data", C1185490gxH.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(400), "poi_enter_gallery_scene", String.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(405), "source_btm_token", String.class);
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1129));

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PoiGalleryScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiGalleryScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiGalleryScope.class);
        return arrayList;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryActivity", "onResume", true);
        super.onResume();
        C1185440gxC c1185440gxC = this.LLJJLIIIJLLLLLLLZ;
        if (c1185440gxC != null) {
            c1185440gxC.LJ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    public final void LLLLLZL() {
        C19HL c19hl;
        C19HL c19hl2;
        if (Intrinsics.LJFF(this.LLILZ.getValue(), Boolean.FALSE)) {
            finish();
            return;
        }
        C1182990gtF c1182990gtF = C1182990gtF.LIZ;
        ArrayList arrayList = (ArrayList) this.LLILZIL.getValue();
        int i = this.LLJLL;
        c1182990gtF.getClass();
        if (!C1182990gtF.LJFF(i, arrayList) || (c19hl = this.LLJLLIL) == null || c19hl.getDrawable() == null) {
            C1182990gtF.LJ(this);
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.LLILZIL.getValue();
        if (arrayList2 == null || (c19hl2 = this.LLJLLIL) == null) {
            return;
        }
        C1182990gtF.LIZLLL(this, arrayList2, c19hl2, this.LLJLL);
    }

    public final PoiCurrentSessionInfo LLLLZI() {
        return (PoiCurrentSessionInfo) this.LLJ.getValue();
    }

    public final int LLLLZIL() {
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    public final PoiInnerPageMobData LLLLZLL() {
        return (PoiInnerPageMobData) this.LLIZLLLIL.getValue();
    }

    public final PageFinder LLLLZLLIL() {
        return (PageFinder) this.LLJL.getValue();
    }

    public final C1188440h22 LLLLZLLLI() {
        return (C1188440h22) this.LLJILJIL.getValue();
    }

    public final C1185410gx9 LLLZ() {
        return (C1185410gx9) this.LLJILJILJ.getValue();
    }

    public final ArrayList<PoiPicture> LLLZIL() {
        return (ArrayList) this.LLILZLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryAbility
    public final void XO1() {
        if (Intrinsics.LJFF(this.LLJJ.getValue(), "album_gallery")) {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            PoiCurrentSessionInfo poiCurrentSessionInfoLLLLZI = LLLLZI();
            String str = poiCurrentSessionInfoLLLLZI != null ? poiCurrentSessionInfoLLLLZI.poiId : null;
            PoiCurrentSessionInfo poiCurrentSessionInfoLLLLZI2 = LLLLZI();
            eventBusLIZLLL.LJIILL(new C585240MxO(str, poiCurrentSessionInfoLLLLZI2 != null ? poiCurrentSessionInfoLLLLZI2.albumSessionId : null));
        }
        LLLLLZL();
    }

    public final PoiListApi.PoiDetailResponse fZ1() {
        return (PoiListApi.PoiDetailResponse) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        int i;
        int i2;
        super.finish();
        C339190DRl.LIZIZ(this.LLJJJJ);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
            i2 = 0;
        } else {
            i = R.anim.d9;
            i2 = R.anim.d_;
        }
        overridePendingTransition(i, i2);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        C1558520qew.LJIIJ(this, PoiGalleryScope.class, PoiGalleryAbility.class, null);
        C1185440gxC c1185440gxC = this.LLJJLIIIJLLLLLLLZ;
        if (c1185440gxC != null) {
            c1185440gxC.LIZJ(this, null);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C1185440gxC c1185440gxC = this.LLJJLIIIJLLLLLLLZ;
        if (c1185440gxC != null) {
            c1185440gxC.LIZLLL();
        }
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

    @Override // X.InterfaceC1182630gsf
    public final void Yx() {
        LLLLLZL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0210  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r61) {
        /*
            Method dump skipped, instruction units count: 1538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryActivity.onCreate(android.os.Bundle):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1365870leD c1365870leD) {
        if (Intrinsics.LJFF(c1365870leD.LIZLLL, "point_of_interest") && isActive()) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIL(C1202420hOa.LIZ(), this.LLJJIJI, c1365870leD);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1185440gxC c1185440gxC = this.LLJJLIIIJLLLLLLLZ;
        if (c1185440gxC != null) {
            bundle.putLong("play_time_in_current_page", c1185440gxC.LIZLLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x049b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShareClick(android.view.View r52) {
        /*
            Method dump skipped, instruction units count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryActivity.onShareClick(android.view.View):void");
    }

    @Override // X.InterfaceC836750Ws5
    public final void setActivityResultListener(InterfaceC342470Dbh interfaceC342470Dbh) {
        this.LLJLLL = interfaceC342470Dbh;
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

    @Override // X.InterfaceC1182630gsf
    public final void yt(float f) {
        View view = this.LLJJIJIL;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    public final void yv2(String str) {
        String str2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        PoiInnerPageMobData poiInnerPageMobDataLLLLZLL = LLLLZLL();
        if (poiInnerPageMobDataLLLLZLL != null) {
            str2 = poiInnerPageMobDataLLLLZLL.enterFrom;
        } else {
            str2 = null;
        }
        C1185430gxB.LJJIJL(c1185430gxB, str2, str, C1558360qeg.LJI(this, null), "poi_secondary_preview_page", "category_background_album", PageFinder.via(this));
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryAbility
    public final void Je2(int i, C19HL c19hl) {
        int iIntValue;
        PoiInnerPageMobData poiInnerPageMobDataLLLLZLL;
        if (this.LLJLILLLLZIIL && (poiInnerPageMobDataLLLLZLL = LLLLZLL()) != null) {
            C1185430gxB.LJJIL(C1185430gxB.LIZ, poiInnerPageMobDataLLLLZLL.poiId, poiInnerPageMobDataLLLLZLL.collectInfo, poiInnerPageMobDataLLLLZLL.moduleName, poiInnerPageMobDataLLLLZLL.enterFrom, null, LLLLZLLIL(), 16);
        }
        this.LLJLL = i;
        this.LLJLLIL = c19hl;
        C1196110hEP c1196110hEP = this.LLJJIJIIJIL;
        if (c1196110hEP != null) {
            if (((Number) this.LLILLL.getValue()).intValue() <= 0) {
                iIntValue = ((ArrayList) this.LL.getValue()).size();
            } else {
                iIntValue = ((Number) this.LLILLL.getValue()).intValue();
            }
            c1196110hEP.LJJJJJ(i, iIntValue);
        }
        C422030Ggj c422030Ggj = this.LLJJIII;
        if (c422030Ggj != null) {
            c422030Ggj.setSelectedIndex(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryAbility
    public final void Gg(boolean z, C19HL c19hl, int i) {
        if (i == LLLLZIL() && !this.LLJLIL) {
            ArrayList arrayList = (ArrayList) this.LLILZIL.getValue();
            if (z) {
                C1182990gtF.LIZ.getClass();
                if (C1182990gtF.LJFF(i, arrayList)) {
                    Context context = c19hl.getContext();
                    if (arrayList != null) {
                        C1182990gtF.LIZIZ(context, arrayList, c19hl, i);
                    }
                } else {
                    C1182990gtF.LIZ.getClass();
                    C1182990gtF.LIZJ(this);
                }
            } else {
                C1182990gtF.LIZ.getClass();
                C1182990gtF.LIZ(this);
            }
            this.LLJLIL = true;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC342470Dbh interfaceC342470Dbh = this.LLJLLL;
        if (interfaceC342470Dbh != null) {
            interfaceC342470Dbh.onActivityResult(i, i2, intent);
        }
    }
}
