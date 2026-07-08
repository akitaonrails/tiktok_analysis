package com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker;

import X.AbstractC1177930gl5;
import X.C01GW;
import X.C03H5;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1232360iAs;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C13LE;
import X.C14K9;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C1853010yJv;
import X.C1853040yJy;
import X.C1853050yJz;
import X.C1853170yKB;
import X.C1862330yYx;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C299020Bno;
import X.C335910DEv;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS127S0100000_27;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoGalleryPickerActivity extends BaseActivity implements InterfaceC724530SbT {
    public static final C1853050yJz LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static Function1<? super List<C1853170yKB>, Unit> LLJILJIL = null;
    public static int LLJILJILJ = 0;
    public static boolean LLJILLL = false;
    public static String LLJJ = null;
    public static Map<String, String> LLJJI = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JTAgPSYjJCA4LCIjJCHELIOSQ4LGE0KSkgLD0qZjUlKiQ2OmsYKCQ8DyQgJSohMRUlKiQ2OgQvPSYlITE1";
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS264S0000000_24.get$arr$(443), "tako_gallery_new_ui", Boolean.class);
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public BottomSheetBehavior<View> LLILZ;
    public View LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0yJz] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoGalleryPickerActivity.class, "takoPhotoChooseVM", "getTakoPhotoChooseVM()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new Object() { // from class: X.0yJz
        };
        LLJILJILJ = 1;
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity", "onResume", true);
        super.onResume();
        if (this.LLJ) {
            this.LLJ = false;
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity", "onResume", false);
        } else {
            LLLLZLL().wQ2(this);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity", "onResume", false);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static List LLLLLZL() {
        return Collections.singletonList(new C1853170yKB(4, ""));
    }

    public final Boolean LLLLZIL() {
        return (Boolean) this.LL.getValue();
    }

    public final TakoPhotoChooseViewModel LLLLZLL() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (TakoPhotoChooseViewModel) assemVMLazy.getValue();
    }

    public TakoGalleryPickerActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        this.LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS568S0100000_24(c19719912DlLIZ, 1323), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1324), AFwS269S0000000_27.get$arr$(263));
        this.LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 843));
        this.LLJ = true;
    }

    public final boolean LLLLZLLIL() {
        if (!Intrinsics.LJFF(LLLLZIL(), Boolean.TRUE)) {
            return false;
        }
        Map<String, String> map = LLJJI;
        return Intrinsics.LJFF(map != null ? map.get("mode_source") : null, "visual_search_button");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().LJJLIIIIJ() > 0) {
            getSupportFragmentManager().LJLLILLLL();
        } else {
            LLLLZI("click_back", LLLLLZL());
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLILZLL) {
            return;
        }
        Function1<? super List<C1853170yKB>, Unit> function1 = LLJILJIL;
        if (function1 != null) {
            function1.invoke(LLLLLZL());
        }
        LLJILJIL = null;
        LLJJI = null;
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
    public final void onCreate(Bundle bundle) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ViewGroup viewGroup;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity", "onCreate", true);
        final TakoGalleryPickerActivity takoGalleryPickerActivity = this;
        super.onCreate(bundle);
        try {
            C1389600mGU.LIZIZ(takoGalleryPickerActivity);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        takoGalleryPickerActivity.overridePendingTransition(0, 0);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(takoGalleryPickerActivity, ImmersionBar.LJIILJJIL(takoGalleryPickerActivity));
        tuxImmersionBar.LJIIJJI();
        tuxImmersionBar.LIZLLL();
        takoGalleryPickerActivity.setContentView(R.layout.fol);
        Boolean boolLLLLZIL = takoGalleryPickerActivity.LLLLZIL();
        Boolean bool = Boolean.TRUE;
        String str7 = null;
        if (Intrinsics.LJFF(boolLLLLZIL, bool)) {
            View viewFindViewById = takoGalleryPickerActivity.findViewById(R.id.qd3);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(4, viewFindViewById);
                if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                if (takoGalleryPickerActivity.LLLLZLLIL()) {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    layoutParams.height = -1;
                    C786410Ut5.W5(viewFindViewById, layoutParams);
                }
                C14K9.LJIJJ(viewFindViewById, C1232360iAs.LL);
            }
        } else {
            View viewFindViewById2 = takoGalleryPickerActivity.findViewById(R.id.qd3);
            if (viewFindViewById2 != null) {
                C14K9.LJIJJ(viewFindViewById2, C1232360iAs.LL);
            }
        }
        takoGalleryPickerActivity.LLLLZLL().LLILLL = LLJILJILJ;
        C723850SaN.LIZIZ(takoGalleryPickerActivity, new AwS603S0100000_24(takoGalleryPickerActivity, 680));
        if (Intrinsics.LJFF(takoGalleryPickerActivity.LLLLZIL(), bool)) {
            TakoPhotoChooseViewModel takoPhotoChooseViewModelLLLLZLL = takoGalleryPickerActivity.LLLLZLL();
            C1853040yJy c1853040yJy = new C2217381BqS() { // from class: X.0yJy
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1853060yK0) obj).LLJJ);
                }
            };
            AwS641S0100000_27 awS641S0100000_27 = new AwS641S0100000_27(takoGalleryPickerActivity, 158);
            takoGalleryPickerActivity = takoGalleryPickerActivity;
            C736680Sv4.LJIIIIZZ(takoGalleryPickerActivity, takoPhotoChooseViewModelLLLLZLL, c1853040yJy, null, awS641S0100000_27, 6);
        } else {
            View viewFindViewById3 = takoGalleryPickerActivity.findViewById(R.id.qd4);
            takoGalleryPickerActivity.LLILZIL = viewFindViewById3;
            if (viewFindViewById3 != null) {
                viewFindViewById3.setBackgroundColor(Integer.MIN_VALUE);
            }
            View view = takoGalleryPickerActivity.LLILZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = takoGalleryPickerActivity.LLILZIL;
            if (view2 != null) {
                C786410Ut5.I7(new ACListenerS161S0100000_27(takoGalleryPickerActivity, 191), view2);
            }
            View viewFindViewById4 = takoGalleryPickerActivity.findViewById(R.id.qd3);
            if (viewFindViewById4 != null) {
                BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById4);
                bottomSheetBehaviorFrom.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0yJx
                    @Override // X.AbstractC1177930gl5
                    public final void LIZJ(View view3, float f) {
                        View view4;
                        float fLIZLLL = C13LZ.LIZLLL(1 + f, 0.0f, 1.0f);
                        View view5 = this.LIZ.LLILZIL;
                        if (view5 != null) {
                            C786410Ut5.T4(view5, fLIZLLL);
                        }
                        if (f > -1.0f && (view4 = this.LIZ.LLILZIL) != null) {
                            C786410Ut5.LJLLLLLL(0, view4);
                        }
                    }

                    @Override // X.AbstractC1177930gl5
                    public final void LIZLLL(int i, View view3) {
                        if (i != 3) {
                            if (i == 5) {
                                TakoGalleryPickerActivity takoGalleryPickerActivity2 = this.LIZ;
                                if (!takoGalleryPickerActivity2.LLIZLLLIL || takoGalleryPickerActivity2.getSupportFragmentManager().LJJLIIIIJ() > 0) {
                                    return;
                                }
                                TakoGalleryPickerActivity takoGalleryPickerActivity3 = this.LIZ;
                                takoGalleryPickerActivity3.getClass();
                                takoGalleryPickerActivity3.LLLLZI(null, TakoGalleryPickerActivity.LLLLLZL());
                                return;
                            }
                            return;
                        }
                        TakoGalleryPickerActivity takoGalleryPickerActivity4 = this.LIZ;
                        takoGalleryPickerActivity4.LLIZLLLIL = true;
                        View view4 = takoGalleryPickerActivity4.LLILZIL;
                        if (view4 != null) {
                            C786410Ut5.LJLLLLLL(0, view4);
                        }
                    }
                });
                takoGalleryPickerActivity.LLILZ = bottomSheetBehaviorFrom;
                HandlerHook.viewPost(viewFindViewById4, new ARunnableS127S0100000_27(takoGalleryPickerActivity, 75));
            }
        }
        C1853010yJv c1853010yJv = (C1853010yJv) takoGalleryPickerActivity.LLILLL.getValue();
        if (c1853010yJv != null) {
            Map<String, String> commonMobParams = c1853010yJv.getCommonMobParams();
            Pair[] pairArr = new Pair[7];
            pairArr[0] = new Pair("template_type", c1853010yJv.getTemplateType());
            pairArr[1] = new Pair("group_id", c1853010yJv.getGroupId());
            if (commonMobParams != null) {
                str7 = commonMobParams.get("search_id");
            }
            String str8 = "";
            if (str7 == null) {
                str7 = "";
            }
            pairArr[2] = new Pair("search_id", str7);
            if (commonMobParams == null || (str = commonMobParams.get("screen_type")) == null) {
                str = "";
            }
            pairArr[3] = new Pair("screen_type", str);
            pairArr[4] = new Pair("is_camera_show", c1853010yJv.isCameraShow());
            pairArr[5] = new Pair("is_cover", c1853010yJv.isCover());
            if (commonMobParams == null || (str2 = commonMobParams.get("push_id")) == null) {
                str2 = "";
            }
            pairArr[6] = new Pair("push_id", str2);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (commonMobParams != null && (str6 = commonMobParams.get("panel_impr_id")) != null && str6.length() > 0) {
                mapLJIIJ.put("panel_impr_id", str6);
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String enterFrom = c1853010yJv.getEnterFrom();
            String enterMethod = c1853010yJv.getEnterMethod();
            if (commonMobParams == null || (str3 = commonMobParams.get("process_id")) == null) {
                str3 = "";
            }
            if (commonMobParams == null || (str4 = commonMobParams.get("tako_session_id")) == null) {
                str4 = "";
            }
            if (commonMobParams != null && (str5 = commonMobParams.get("tako_chat_id")) != null) {
                str8 = str5;
            }
            C1862330yYx.LJJI(c1862330yYx, enterFrom, enterMethod, str3, str4, str8, c1853010yJv.getPageSource(), null, c1853010yJv.getMode(), c1853010yJv.getModeSource(), mapLJIIJ, 576);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity", "onCreate", false);
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

    public final void LLLLZI(String str, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = str;
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        C1853010yJv c1853010yJv = (C1853010yJv) this.LLILLL.getValue();
        if (c1853010yJv != null) {
            Map<String, String> commonMobParams = c1853010yJv.getCommonMobParams();
            if (str9 == null) {
                if ((list instanceof Collection) && list.isEmpty()) {
                    str9 = "click_cancel";
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((C1853170yKB) it2.next()).LIZ == 0) {
                            str9 = "click_next";
                            break;
                        }
                    }
                    str9 = "click_cancel";
                }
            }
            Pair[] pairArr = new Pair[7];
            pairArr[0] = new Pair("template_type", c1853010yJv.getTemplateType());
            pairArr[1] = new Pair("group_id", c1853010yJv.getGroupId());
            if (commonMobParams != null) {
                str2 = commonMobParams.get("search_id");
            } else {
                str2 = null;
            }
            String str10 = "";
            if (str2 == null) {
                str2 = "";
            }
            pairArr[2] = new Pair("search_id", str2);
            if (commonMobParams == null || (str3 = commonMobParams.get("screen_type")) == null) {
                str3 = "";
            }
            pairArr[3] = new Pair("screen_type", str3);
            String strIsCameraShow = c1853010yJv.isCameraShow();
            if (strIsCameraShow == null) {
                strIsCameraShow = "";
            }
            pairArr[4] = new Pair("is_camera_show", strIsCameraShow);
            String strIsCover = c1853010yJv.isCover();
            if (strIsCover == null) {
                strIsCover = "";
            }
            pairArr[5] = new Pair("is_cover", strIsCover);
            if (commonMobParams == null || (str4 = commonMobParams.get("push_id")) == null) {
                str4 = "";
            }
            pairArr[6] = new Pair("push_id", str4);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (commonMobParams != null && (str8 = commonMobParams.get("panel_impr_id")) != null && str8.length() > 0) {
                mapLJIIJ.put("panel_impr_id", str8);
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String enterFrom = c1853010yJv.getEnterFrom();
            String enterMethod = c1853010yJv.getEnterMethod();
            if (commonMobParams == null || (str5 = commonMobParams.get("process_id")) == null) {
                str5 = "";
            }
            if (commonMobParams == null || (str6 = commonMobParams.get("tako_session_id")) == null) {
                str6 = "";
            }
            if (commonMobParams != null && (str7 = commonMobParams.get("tako_chat_id")) != null) {
                str10 = str7;
            }
            C1862330yYx.LJJ(c1862330yYx, enterFrom, enterMethod, str5, str6, str10, c1853010yJv.getPageSource(), str9, "", null, c1853010yJv.getMode(), c1853010yJv.getModeSource(), null, null, null, mapLJIIJ, 47360);
        }
        Function1<? super List<C1853170yKB>, Unit> function1 = LLJILJIL;
        if (function1 != null) {
            function1.invoke(list);
        }
        LLJILJIL = null;
        LLJJ = null;
        LLJJI = null;
        finish();
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
