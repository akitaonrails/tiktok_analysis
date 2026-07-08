package com.ss.android.ugc.aweme.poi.uiwidget.gallery;

import X.C00G8;
import X.C01GW;
import X.C108300b3;
import X.C118300cf;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1191440h6s;
import X.C1191500h6y;
import X.C1191580h76;
import X.C1192120h7y;
import X.C1196110hEP;
import X.C1209090hZL;
import X.C1247530iZL;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1390850mIV;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C15438062q;
import X.C1558360qeg;
import X.C1697810uHb;
import X.C18JG;
import X.C197039127h;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C337180DJs;
import X.C339190DRl;
import X.C422030Ggj;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC469360Ias;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS153S0100000_18;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import irm.AkS0S2100000_18;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGalleryActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEmITIlHELIOSLSg2PGsrKCM/LTc1Zx88IQItJSM2OjwNKjs6Piw4MA==";
    public C1191440h6s LLJJ;
    public C422030Ggj LLJJI;
    public ViewPager LLJJIII;
    public C1196110hEP LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public View LLJJIJIL;
    public TuxIconView LLJJJ;
    public View LLJJJIL;
    public TuxActionSheet LLJJJJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJJJJIL;
    public final C01GW LL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS189S0000000_3.get$arr$(524), "poi_gallery_images", ArrayList.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS189S0000000_3.get$arr$(523), "poi_gallery_index", Integer.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS189S0000000_3.get$arr$(525), "poi_gallery_need_report", Boolean.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS189S0000000_3.get$arr$(522), "poi_gallery_image_ids", ArrayList.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS189S0000000_3.get$arr$(526), "poi_gallery_uid", String.class);
    public final C01GW LLILZLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(49), "poi_gallery_anchor_data", ArrayList.class);
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT), "mob_data", PoiInnerPageMobData.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(56), "poi_track_params", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(53), "poi_biz_info", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(50), "bottom_button", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(52), "lynx_view_data", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(51), "disable_audience_focus", Boolean.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(54), "source_btm_token", String.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS231S0000000_3.get$arr$(55), "thumbnail_urls", ArrayList.class);
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2073));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 47));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 45));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 46));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2072));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final ArrayList<String> LLLLLZL() {
        return (ArrayList) this.LL.getValue();
    }

    public final int LLLLZI() {
        if (((Number) this.LLILLJJLI.getValue()).intValue() < 0 || ((Number) this.LLILLJJLI.getValue()).intValue() >= LLLLLZL().size()) {
            return 0;
        }
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        int i;
        int i2;
        super.finish();
        C339190DRl.LIZIZ(this.LLJJJIL);
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
    public final void onDestroy() {
        super.onDestroy();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity", "onCreate", true);
        activityConfiguration(new AwS597S0100000_18(this, 526));
        super.onCreate(bundle);
        setContentView(R.layout.e3t);
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
        this.LLJJIII = (ViewPager) findViewById(R.id.r31);
        this.LLJJI = (C422030Ggj) findViewById(R.id.r2l);
        this.LLJJIJI = (C1196110hEP) findViewById(R.id.r2x);
        this.LLJJIJIIJIL = (FrameLayout) findViewById(R.id.r2w);
        this.LLJJIJIL = findViewById(R.id.r2i);
        this.LLJJJ = (TuxIconView) findViewById(R.id.r2h);
        this.LLJJJIL = findViewById(R.id.r2n);
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJ(R.style.xm);
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZJ(R.raw.icon_flag);
        c1247530iZL.LIZIZ(R.string.s65);
        c1247530iZL.LIZ(new AwS597S0100000_18(this, 753));
        c1390850mIV.LIZ(c1247530iZL);
        this.LLJJJJ = c1390850mIV.LIZJ();
        if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
            TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.r2v);
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C786410Ut5.a9(tuxIconView, new ACListenerS153S0100000_18(this, 157));
        }
        ArrayList<String> arrayListLLLLLZL = LLLLLZL();
        int iLLLLZI = LLLLZI();
        ArrayList<String> arrayListLLLLLZL2 = LLLLLZL();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLLLLLZL2, 10));
        Iterator<String> it2 = arrayListLLLLLZL2.iterator();
        int i3 = 0;
        while (true) {
            String str4 = null;
            if (it2.hasNext()) {
                String next = it2.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    String str5 = next;
                    ArrayList arrayList2 = (ArrayList) this.LLJILLL.getValue();
                    if (arrayList2 != null) {
                        str4 = (String) C13LP.LJJJLZIJ(i3, arrayList2);
                    }
                    arrayList.add(new C1191500h6y(str5, str4));
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                C1191440h6s c1191440h6s = new C1191440h6s(this, arrayListLLLLLZL, iLLLLZI, null, arrayList, null, false, false, 232);
                c1191440h6s.LLJI = (ArrayList) this.LLILZLL.getValue();
                this.LLJJ = c1191440h6s;
                Integer numValueOf = Integer.valueOf(((Number) C108300b3.LIZ.getValue()).intValue());
                if (numValueOf != null && numValueOf.intValue() >= 0) {
                    int iIntValue = numValueOf.intValue();
                    ViewPager viewPager = this.LLJJIII;
                    if (viewPager != null) {
                        viewPager.setOffscreenPageLimit(iIntValue);
                    }
                }
                ViewPager viewPager2 = this.LLJJIII;
                if (viewPager2 != null) {
                    C1191440h6s c1191440h6s2 = this.LLJJ;
                    if (c1191440h6s2 == null) {
                        c1191440h6s2 = null;
                    }
                    viewPager2.setAdapter(c1191440h6s2);
                }
                ViewPager viewPager3 = this.LLJJIII;
                if (viewPager3 != null) {
                    viewPager3.setCurrentItem(LLLLZI());
                }
                final C118300cf c118300cf = new C118300cf();
                c118300cf.element = LLLLZI();
                ViewPager viewPager4 = this.LLJJIII;
                if (viewPager4 != null) {
                    viewPager4.addOnPageChangeListener(new InterfaceC469360Ias() { // from class: X.0h75
                        @Override // X.InterfaceC469360Ias
                        public final void onPageScrollStateChanged(int i5) {
                        }

                        @Override // X.InterfaceC469360Ias
                        public final void onPageScrolled(int i5, float f, int i6) {
                        }

                        @Override // X.InterfaceC469360Ias
                        public final void onPageSelected(int i5) {
                            C422030Ggj c422030Ggj = this.LL.LLJJI;
                            if (c422030Ggj != null) {
                                c422030Ggj.setSelectedIndex(i5);
                            }
                            PoiInnerPageMobData poiInnerPageMobData = (PoiInnerPageMobData) this.LL.LLIZ.getValue();
                            if (poiInnerPageMobData != null) {
                                PoiGalleryActivity poiGalleryActivity = this.LL;
                                C1185430gxB.LJJIL(C1185430gxB.LIZ, poiInnerPageMobData.poiId, poiInnerPageMobData.collectInfo, poiInnerPageMobData.moduleName, null, (Map) poiGalleryActivity.LLJJJJLIIL.getValue(), (PageFinder) poiGalleryActivity.LLJLIL.getValue(), 8);
                            }
                            C118300cf c118300cf2 = c118300cf;
                            int i6 = c118300cf2.element;
                            c118300cf2.element = i5;
                            HashMap map = new HashMap();
                            PoiGalleryActivity poiGalleryActivity2 = this.LL;
                            Object objLJJJLZIJ = C13LP.LJJJLZIJ(i6, poiGalleryActivity2.LLLLLZL());
                            Object obj = "";
                            if (objLJJJLZIJ == null) {
                                objLJJJLZIJ = "";
                            }
                            map.put("pre_image_url", objLJJJLZIJ);
                            Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i5, poiGalleryActivity2.LLLLLZL());
                            if (objLJJJLZIJ2 != null) {
                                obj = objLJJJLZIJ2;
                            }
                            map.put("next_image_url", obj);
                            map.put("pre_index", Integer.valueOf(i6));
                            map.put("next_index", Integer.valueOf(i5));
                            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(new JSONObject(map)), "ttls_gallery_scroll"));
                        }
                    });
                }
                ArrayList<String> arrayListLLLLLZL3 = LLLLLZL();
                C422030Ggj c422030Ggj = this.LLJJI;
                if (c422030Ggj != null) {
                    c422030Ggj.setCount(arrayListLLLLLZL3.size());
                }
                C422030Ggj c422030Ggj2 = this.LLJJI;
                if (c422030Ggj2 != null) {
                    c422030Ggj2.setLifecycleOwner(this);
                }
                C422030Ggj c422030Ggj3 = this.LLJJI;
                if (c422030Ggj3 != null) {
                    c422030Ggj3.LLIZLLLIL = true;
                    c422030Ggj3.setSelectedIndex(LLLLZI());
                }
                C1196110hEP c1196110hEP = this.LLJJIJI;
                if (c1196110hEP != null) {
                    c1196110hEP.setViewPager(this.LLJJIII);
                }
                if (this.LLJJL.getValue() != null) {
                    C1192120h7y c1192120h7y = (C1192120h7y) findViewById(R.id.r86);
                    C337180DJs.LIZJ(c1192120h7y);
                    c1192120h7y.setData((PoiBizInfo) this.LLJJL.getValue());
                }
                if (this.LLJJLIIIJLLLLLLLZ.getValue() != null) {
                    C197039127h c197039127h = (C197039127h) findViewById(R.id.r2j);
                    if (c197039127h != null) {
                        C337180DJs.LIZJ(c197039127h);
                        BottomButtonData bottomButtonData = (BottomButtonData) this.LLJJLIIIJLLLLLLLZ.getValue();
                        if (bottomButtonData != null) {
                            str3 = bottomButtonData.text;
                        } else {
                            str3 = null;
                        }
                        c197039127h.setText(str3);
                    }
                    BottomButtonData bottomButtonData2 = (BottomButtonData) this.LLJJLIIIJLLLLLLLZ.getValue();
                    if (bottomButtonData2 != null && bottomButtonData2.complianceTheme == C00G8.TOKOPEDIA.getType()) {
                        c197039127h.LJJJJL(AFwS228S0000000_1.get$arr$(545));
                    } else {
                        c197039127h.LJJJJL(AFwS256S0000000_18.get$arr$(878));
                        c197039127h.setButtonVariant(0);
                    }
                    String strLIZJ = C18JG.LIZJ(PageFinder.via((View) c197039127h));
                    C1191580h76 c1191580h76 = C1191580h76.LIZ;
                    Map map = (Map) this.LLJJJJLIIL.getValue();
                    PageFinder pageFinder = (PageFinder) this.LLJLIL.getValue();
                    c1191580h76.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C1189060h32.LJJIFFI(c2344009Gk, "bcm_chain", strLIZJ);
                    for (Map.Entry entry : map.entrySet()) {
                        C1189060h32.LJJIFFI(c2344009Gk, (String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                    Map<String, String> map2 = c2344009Gk.LIZ;
                    C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
                    c1185040gwY.getClass();
                    C1185040gwY.LJFF("ttls_inner_detail_page_btn_show", map2, c1185050gwZ);
                    BottomButtonData bottomButtonData3 = (BottomButtonData) this.LLJJLIIIJLLLLLLLZ.getValue();
                    if (bottomButtonData3 != null && (str2 = bottomButtonData3.schema) != null) {
                        C786410Ut5.I7(new AkS0S2100000_18(this, strLIZJ, str2, 0), c197039127h);
                    }
                }
                LynxViewData lynxViewData = (LynxViewData) this.LLJL.getValue();
                if (lynxViewData != null && (str = lynxViewData.url) != null && str.length() != 0) {
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(str);
                    sparkContext.LJJJJZ(new C1209090hZL(this, 4));
                    c1537900q7g.getClass();
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(this, sparkContext).LIZ(false);
                    this.LLJJJJJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                    ViewGroup viewGroup = (ViewGroup) findViewById(R.id.r2u);
                    if (viewGroup != null) {
                        C337180DJs.LIZJ(viewGroup);
                        viewGroup.addView(this.LLJJJJJIL, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
                TuxIconView tuxIconView2 = this.LLJJJ;
                if (tuxIconView2 != null) {
                    C786410Ut5.a9(tuxIconView2, new ACListenerS153S0100000_18(this, 109));
                }
                C18JG.LJI(this, "a4257.b75061", (String) this.LLJILJILJ.getValue());
                PoiInnerPageMobData poiInnerPageMobData = (PoiInnerPageMobData) this.LLIZ.getValue();
                if (poiInnerPageMobData != null) {
                    C1185430gxB.LJIJI(C1185430gxB.LIZ, poiInnerPageMobData.poiId, poiInnerPageMobData.collectInfo, poiInnerPageMobData.moduleName, null, (Map) this.LLJJJJLIIL.getValue(), C1558360qeg.LJI(this, null), (PageFinder) this.LLJLIL.getValue(), 8);
                }
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity", "onCreate", false);
                return;
            }
        }
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
