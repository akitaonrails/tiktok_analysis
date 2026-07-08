package com.ss.android.ugc.aweme.homepage;

import X.AbstractC1563340qmi;
import X.AbstractC1583710rJZ;
import X.AbstractC1591090rVT;
import X.AbstractC1591940rWq;
import X.AnonymousClass0716;
import X.C0BH9;
import X.C0CCZ;
import X.C128Y;
import X.C1513750pUj;
import X.C1569860qxE;
import X.C1583630rJR;
import X.C1586420rNw;
import X.C1590990rVJ;
import X.C1591000rVK;
import X.C1591020rVM;
import X.C1591080rVS;
import X.C1591460rW4;
import X.C1591930rWp;
import X.C1592040rX0;
import X.C1592170rXD;
import X.C1593730rZj;
import X.C19348310mn;
import X.C19EG;
import X.C20094213jo;
import X.C2108208Ns;
import X.C2238608ps;
import X.C23250099c;
import X.C343710Ddh;
import X.C496801wc;
import X.C496901wd;
import X.C497001we;
import X.C826910WcD;
import X.InterfaceC1570600qyQ;
import X.InterfaceC1570710qyb;
import X.InterfaceC1577800rA2;
import X.InterfaceC1581590rG9;
import X.InterfaceC1588590rRR;
import X.InterfaceC1590050rTn;
import X.InterfaceC1590080rTq;
import X.InterfaceC1590350rUH;
import X.InterfaceC1590620rUi;
import X.InterfaceC1591910rWn;
import X.InterfaceC1591920rWo;
import X.InterfaceC1591950rWr;
import X.InterfaceC1592890rYN;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1594050raF;
import X.InterfaceC497601wk;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.business.PreloadMainTask;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IPreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import com.ss.android.ugc.aweme.homepage.ui.slide.XTabScrollProfileVM;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.legoImpl.task.AntispamApiUploadTask;
import com.ss.android.ugc.aweme.legoImpl.task.MobLaunchEventTask;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.SplitContainerManager;
import com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.text.a0;
import kotlin.text.u;
import u4.q0;

/* JADX INFO: loaded from: classes25.dex */
public final class HomePageServiceImpl implements IHomePageService {
    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final void LIZ() {
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
        if (iUnKnownOwnershipBusinessOuterService != null) {
            iUnKnownOwnershipBusinessOuterService.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1581590rG9 LJII() {
        return new InterfaceC1581590rG9() { // from class: X.0rLU
            public InterfaceC752360TfG LIZ;

            @Override // X.InterfaceC1581590rG9
            public final InterfaceC752360TfG mb() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1581590rG9
            public final View LIZ(AbsFragment absFragment, LayoutInflater layoutInflater) {
                int i;
                ComponentCallbacks2 componentCallbacks2LJFF;
                C19EG activity;
                if (C303460Buy.LIZJ()) {
                    i = R.layout.cda;
                } else {
                    i = R.layout.cd_;
                }
                C19EG activity2 = absFragment.getActivity();
                if (activity2 != null) {
                    Context context = absFragment.getContext();
                    InterfaceC214902198i interfaceC214902198i = null;
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        Fragment parentFragment = absFragment;
                        while (true) {
                            if (parentFragment instanceof InterfaceC214902198i) {
                                interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                                break;
                            }
                            parentFragment = parentFragment.getParentFragment();
                            if (parentFragment == null) {
                                break;
                            }
                        }
                    }
                    View viewLJJII = SAFExtensionKt.LJJII(activity2, layoutInflater.getContext(), i, C682840QqQ.LIZ(interfaceC214902198i, activity2));
                    if ((C285010BFb.LIZ == -1 || C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) && (activity = absFragment.getActivity()) != null) {
                        C0T45 c0t45LJIIIIZZ = C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("HOME_");
                        sbLIZ.append(activity.hashCode());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c0t45LJIIIIZZ.getClass();
                        InterfaceC752360TfG interfaceC752360TfGLIZ = SplitContainerManager.LIZ(strLIZIZ, absFragment, viewLJJII, false);
                        this.LIZ = interfaceC752360TfGLIZ;
                        View viewLJ = interfaceC752360TfGLIZ.LJ();
                        if (viewLJ != null) {
                            return viewLJ;
                        }
                    }
                    return viewLJJII;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1591950rWr LJIIIZ() {
        return new C1592040rX0();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1591910rWn LJIILJJIL() {
        return new InterfaceC1591910rWn() { // from class: X.0rWl
            @Override // X.InterfaceC1591910rWn
            public final View LIZ(C19EG c19eg) {
                C1150504el.LIZ().LIZLLL("method_main_set_content_view_duration", false);
                C1150504el.LIZ().LIZLLL("method_main_async_content_view_duration", false);
                FrameLayout frameLayout = new FrameLayout(c19eg);
                frameLayout.setId(R.id.tya);
                C1150504el.LIZ().LJI("method_main_async_content_view_duration", false);
                c19eg.setContentView(frameLayout);
                C1150504el.LIZ().LIZLLL("method_main_inflate_splash_viewstub", false);
                C1150504el.LIZ().LJI("method_main_inflate_splash_viewstub", false);
                C1150504el.LIZ().LJI("method_main_set_content_view_duration", false);
                return frameLayout;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1590350rUH LJIJ() {
        return new C1586420rNw();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final IFragmentMainPageIcon LJIJI() {
        return new X2CFragmentMainPageIcon();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final IPreDrawableInflate LJJ() {
        return new PreDrawableInflate();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final C0CCZ LJJIFFI() {
        return new AntispamApiUploadTask();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final void LJJIII() {
        C1513750pUj.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1590080rTq LIZLLL() {
        return new InterfaceC1590080rTq() { // from class: X.0rX5
            @Override // X.InterfaceC1590080rTq
            public final void LIZIZ() {
                C799900VZk c799900VZk = C799900VZk.LIZ;
                X2CFragmentMainPageIcon x2CFragmentMainPageIcon = new X2CFragmentMainPageIcon();
                c799900VZk.getClass();
                X2CFragmentMainPageIcon x2CFragmentMainPageIcon2 = (X2CFragmentMainPageIcon) C799900VZk.LIZLLL(x2CFragmentMainPageIcon);
                if (x2CFragmentMainPageIcon2 != null) {
                    Map<String, C1592950rYT> map = x2CFragmentMainPageIcon2.LL;
                    if (map != null) {
                        ((ConcurrentHashMap) map).clear();
                    }
                    x2CFragmentMainPageIcon2.LLILLJJLI = null;
                    x2CFragmentMainPageIcon2.LLILLL = null;
                    x2CFragmentMainPageIcon2.LLILZ = null;
                }
            }

            @Override // X.InterfaceC1590080rTq
            public final void LIZ(C19EG c19eg) {
                C799900VZk.LIZ.getClass();
                ((HashMap) C799900VZk.LIZLLL.LIZLLL).put(c19eg.getClass(), new WeakReference(c19eg));
                C799890VZj c799890VZj = new C799890VZj();
                c799890VZj.LIZ(new X2CFragmentMainPageIcon());
                C1592110rX7 c1592110rX7 = C1592110rX7.LIZIZ;
                c799890VZj.LIZ(c1592110rX7.LIZIZ());
                c799890VZj.LIZ(c1592110rX7.LIZ());
                c799890VZj.LIZIZ();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1590620rUi LJI() {
        return new InterfaceC1590620rUi() { // from class: X.0XJE
            public static PreloadMainTask LIZIZ;

            @Override // X.InterfaceC1590620rUi
            public final C0CCZ LIZ(Hox hox) {
                PreloadMainTask preloadMainTask = LIZIZ;
                if (preloadMainTask == null) {
                    PreloadMainTask preloadMainTask2 = new PreloadMainTask(hox);
                    LIZIZ = preloadMainTask2;
                    return preloadMainTask2;
                }
                return preloadMainTask;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1592890rYN LJIIJ() {
        return C1591460rW4.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1594050raF LJIILLIIL() {
        return new InterfaceC1594050raF() { // from class: X.0raC
            @Override // X.InterfaceC1594050raF
            public final String LIZ() {
                return C1594030raD.LIZIZ().LIZ();
            }

            @Override // X.InterfaceC1594050raF
            public final List<String> getLanguage() {
                return a0.LJJLIIIJILLIZJL(C1594030raD.LIZIZ().LIZ(), new String[]{","}, 0, 6);
            }

            @Override // X.InterfaceC1594050raF
            public final void LIZIZ(ContentLanguage contentLanguage) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C1594030raD.LIZIZ().LIZ(), new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJJLIIIJILLIZJL) {
                    if (!TextUtils.isEmpty((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (!C1594030raD.LIZ(contentLanguage.getLanguageCode(), false, arrayList2)) {
                    arrayList2.add(contentLanguage.getLanguageCode());
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
                    C1592040rX0 c1592040rX0LIZIZ = C1594030raD.LIZIZ();
                    c1592040rX0LIZIZ.getClass();
                    try {
                        ((InterfaceC1594010raB) c1592040rX0LIZIZ.LIZ.getValue()).LJII(strLJJLIIIJ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJFF(th, "MainTabPreferences AbstractMethodError");
                    }
                }
            }

            @Override // X.InterfaceC1594050raF
            public final void LIZJ(String str) {
                ArrayList arrayList = new ArrayList(a0.LJJLIIIJILLIZJL(C1594030raD.LIZIZ().LIZ(), new String[]{","}, 0, 6));
                if (C1594030raD.LIZ(str, true, arrayList)) {
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                    C1592040rX0 c1592040rX0LIZIZ = C1594030raD.LIZIZ();
                    c1592040rX0LIZIZ.getClass();
                    try {
                        ((InterfaceC1594010raB) c1592040rX0LIZIZ.LIZ.getValue()).LJII(strLJJLIIIJ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJFF(th, "MainTabPreferences AbstractMethodError");
                    }
                }
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC1594050raF
            public final String LIZLLL(TabChangeManager tabChangeManager, String str) {
                switch (str.hashCode()) {
                    case -1672998758:
                        if (str.equals("UNLOGIN_PROFILE")) {
                            str = "USER";
                        }
                        break;
                    case -1382453013:
                        if (str.equals("NOTIFICATION")) {
                            str = "UNLOGIN_NOTIFICATION";
                        }
                        break;
                    case 2614219:
                        if (str.equals("USER")) {
                            str = "UNLOGIN_PROFILE";
                        }
                        break;
                    case 53655674:
                        if (str.equals("UNLOGIN_NOTIFICATION")) {
                            str = "NOTIFICATION";
                        }
                        break;
                }
                if (tabChangeManager.zQ2(str) == null) {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("tab", str, bundle);
                    tabChangeManager.vQ2(bundle, str, UnloginSignUpFragment.class);
                }
                return str;
            }

            @Override // X.InterfaceC1594050raF
            public final C1594040raE LJ(List<String> list, List<ContentLanguage> list2) {
                if (!C086I.LIZIZ(list) && !C086I.LIZIZ(list2)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (ContentLanguage contentLanguage : list2) {
                        ContentLanguage contentLanguage2 = contentLanguage;
                        Iterator<String> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (u.LJIJI(contentLanguage2.getLanguageCode(), it2.next(), true)) {
                                    ContentLanguage contentLanguage3 = new ContentLanguage();
                                    contentLanguage3.setLanguageCode(contentLanguage2.getLanguageCode());
                                    contentLanguage3.setLocalName(contentLanguage2.getLocalName());
                                    contentLanguage3.setEnglishName(contentLanguage2.getEnglishName());
                                    arrayList.add(contentLanguage3);
                                    break;
                                }
                            } else {
                                arrayList2.add(contentLanguage);
                                break;
                            }
                        }
                    }
                    return new C1594040raE(arrayList, arrayList2);
                }
                return new C1594040raE(null, list2);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1590050rTn LJIIZILJ() {
        return C826910WcD.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final AbstractC1563340qmi LIZIZ(LifecycleOwner lifecycleOwner) {
        return new C19348310mn(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final boolean LJFF(C19EG c19eg) {
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        if (c19eg == null) {
            return false;
        }
        C128Y c128yBQ2 = C343710Ddh.LIZ(c19eg).BQ2();
        if (!(c128yBQ2 instanceof InterfaceC1593630rZZ) || (interfaceC1593630rZZ = (InterfaceC1593630rZZ) c128yBQ2) == null) {
            return false;
        }
        return interfaceC1593630rZZ.CI(0);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final C1591020rVM LJIIIIZZ(MainActivity mainActivity) {
        return new C1590990rVJ(mainActivity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1588590rRR LJIIJJI(C19EG c19eg) {
        if (C1569860qxE.LIZIZ()) {
            return C1569860qxE.LIZ(c19eg);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final void LJIIL(Context context) {
        if (((Boolean) AnonymousClass0716.LJ.getValue()).booleanValue()) {
            long j = C0BH9.LIZ;
            if (j != 1) {
                C1513750pUj.LIZ(R.drawable.cfa, context);
            }
            if (j != 2) {
                C1513750pUj.LIZ(R.drawable.a3b, context);
            }
            if (j != 3) {
                C1513750pUj.LIZ(R.drawable.al5, context);
                C1513750pUj.LIZ(R.drawable.bud, context);
                C1513750pUj.LIZ(R.drawable.bc8, context);
                C1513750pUj.LIZ(R.drawable.buh, context);
                C1513750pUj.LIZ(R.drawable.bvn, context);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final boolean LJIILIIL(C19EG c19eg) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1570600qyQ LJIILL(C19EG c19eg) {
        return HomeTabViewModel.LLILZIL.LIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1577800rA2 LJIJJ(C19EG c19eg) {
        return (XTabScrollProfileVM) new ViewModelProvider(c19eg, new C497001we(c19eg)).get(XTabScrollProfileVM.class);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final ITabStrip LJIJJLI(FrameLayout frameLayout) {
        return new MainTabStrip(frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final AbstractC1591090rVT LJIL(AbstractC1591940rWq abstractC1591940rWq) {
        C1591080rVS c1591080rVS = C1591080rVS.LIZIZ;
        C1591930rWp c1591930rWp = (C1591930rWp) abstractC1591940rWq;
        c1591080rVS.getClass();
        C1591080rVS.LJFF = c1591930rWp;
        AbstractC1591090rVT abstractC1591090rVTLJIIJJI = C1593730rZj.LIZIZ.LJIIJJI(c1591930rWp);
        if (abstractC1591090rVTLJIIJJI == null) {
            abstractC1591090rVTLJIIJJI = new C1592170rXD(c1591930rWp);
        }
        C1591080rVS.LJ = abstractC1591090rVTLJIIJJI;
        c1591930rWp.setOnTabVisibilityChangeListener(new InterfaceC1591920rWo() { // from class: X.0rWm
            @Override // X.InterfaceC1591920rWo
            public final void LIZ(int i) {
                boolean z;
                C1591080rVS c1591080rVS2 = C1591080rVS.LIZIZ;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != c1591080rVS2.LIZ) {
                    c1591080rVS2.LIZ = z;
                    C1592050rX1.LIZ(new AwS36S0010000_24(z, 24));
                }
            }
        });
        c1591930rWp.setImportantForAccessibility(1);
        c1591930rWp.setFocusable(false);
        q0.LJIJ(c1591930rWp, new C20094213jo() { // from class: X.0rXs
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int childCount = ((ViewGroup) view).getChildCount();
                if (childCount > 0) {
                    accessibilityNodeInfoCompat.setCollectionInfo(C20093113jd.LIZ(1, childCount));
                }
            }
        });
        return c1591080rVS;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC1570710qyb LJJII(final C19EG c19eg) {
        return new TiktokBaseMainHelper(c19eg) { // from class: X.0mYG
            public boolean LJ;

            @Override // X.InterfaceC1570710qyb
            public final void LIZLLL() {
                this.LJ = false;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0111  */
            @Override // X.InterfaceC1570710qyb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onBackPressed() {
                /*
                    Method dump skipped, instruction units count: 310
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1400620mYG.onBackPressed():boolean");
            }

            @Override // X.InterfaceC1570710qyb
            public final boolean LIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC1570710qyb
            public final void LIZIZ(String str) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                C20684815ws.LJIILLIIL("press_back", c2344009Gk.LIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final AbstractC1583710rJZ getRootNode(C19EG c19eg) {
        return new C1583630rJR(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final C0CCZ LIZJ(long j, boolean z) {
        return new MobLaunchEventTask(z, j);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final void LJ(C19EG c19eg, List list) {
        if (c19eg == null) {
            return;
        }
        XTabScrollProfileVM xTabScrollProfileVM = (XTabScrollProfileVM) new ViewModelProvider(c19eg, new C497001we(c19eg)).get(XTabScrollProfileVM.class);
        xTabScrollProfileVM.getClass();
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(xTabScrollProfileVM);
        C2238608ps c2238608ps = C2108208Ns.LIZ;
        C23250099c.LIZLLL(viewModelScope, c2238608ps, null, new C496901wd(list, xTabScrollProfileVM, null), 2);
        if (C1569860qxE.LIZIZ()) {
            SlideGuideViewModel slideGuideViewModelLIZ = C1569860qxE.LIZ(c19eg);
            slideGuideViewModelLIZ.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(slideGuideViewModelLIZ), c2238608ps, null, new C496801wc(list, slideGuideViewModelLIZ, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final C1591020rVM LJJI(MainActivity mainActivity, C1591020rVM c1591020rVM) {
        return new C1591000rVK(mainActivity, c1591020rVM);
    }
}
