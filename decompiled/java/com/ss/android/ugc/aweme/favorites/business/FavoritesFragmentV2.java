package com.ss.android.ugc.aweme.favorites.business;

import X.AbstractC1604130rqV;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0HE6;
import X.C0HYB;
import X.C0T6K;
import X.C0XQ7;
import X.C1171990gbV;
import X.C11JF;
import X.C1206260hUm;
import X.C1206350hUv;
import X.C1206360hUw;
import X.C1206450hV5;
import X.C1206720hVW;
import X.C1260280itu;
import X.C128Y;
import X.C1458960o4M;
import X.C15580068c;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19Y2;
import X.C19Y3;
import X.C19Y5;
import X.C20277814Wa;
import X.C20673215v0;
import X.C20684815ws;
import X.C21594419fC;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.InterfaceC1206390hUz;
import X.InterfaceC1206430hV3;
import X.InterfaceC1258040iqI;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.FavoritePowerViewPagerViewModel;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteSearchViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class FavoritesFragmentV2 extends AmeBaseFragment implements InterfaceC1258040iqI, InterfaceC21503819Do, C0HE6 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITHELIOSEpOmExPTYlJyogO2sKKDk8Oiw4LDwVOiQrJCo9PBN+";
    public Boolean LL;
    public final String LLILLJJLI;
    public String LLILLL;
    public C19Y3 LLILZ;
    public C21594419fC LLILZIL;
    public C1206260hUm LLILZLL;
    public View LLIZ;
    public int LLIZLLLIL;
    public View LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public C1260280itu LLJJIJIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public final C1206350hUv LLJL;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    static {
        BtmSDK.INSTANCE.getDepend().LJIIIIZZ(new C1206720hVW(FavoritesFragmentV2.class, null, 2));
    }

    public FavoritesFragmentV2() {
        this(Boolean.FALSE, null);
    }

    public final FavoritePowerViewPagerViewModel NR() {
        return (FavoritePowerViewPagerViewModel) this.LLJJJIL.getValue();
    }

    public final AbstractC1604130rqV PR() {
        return (AbstractC1604130rqV) this.LLJJL.getValue();
    }

    public final FavoriteSearchViewModel RR() {
        return (FavoriteSearchViewModel) this.LLJJJJ.getValue();
    }

    public final void WR() {
        String curUserId;
        if (((Boolean) this.LLJIJIL.getValue()).booleanValue() && NR().yQ2("video") >= 0 && this.LLIZ != null) {
            C0HYB c0hyb = C0HYB.LIZ;
            String str = this.LLILLL;
            FavoriteSearchViewModel favoriteSearchViewModelRR = RR();
            int i = favoriteSearchViewModelRR != null ? favoriteSearchViewModelRR.LLJI : 0;
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
                curUserId = "";
            }
            c0hyb.getClass();
            C0HYB.LIZ(i, str, "video", "magnifier", curUserId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        if (getHost() == null) {
            return null;
        }
        FavoritePowerViewPagerViewModel favoritePowerViewPagerViewModelNR = NR();
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJJ;
        if (viewOnAttachStateChangeListenerC20631115oD == null) {
            viewOnAttachStateChangeListenerC20631115oD = null;
        }
        int i = this.LLJILJIL;
        favoritePowerViewPagerViewModelNR.getClass();
        Fragment fragmentLIZIZ = viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator().LIZIZ(i);
        if (fragmentLIZIZ != 0) {
            return fragmentLIZIZ instanceof InterfaceC1258040iqI ? ((InterfaceC1258040iqI) fragmentLIZIZ).LJJLIIIJILLIZJL() : C1206360hUw.LIZ(fragmentLIZIZ.getView());
        }
        return null;
    }

    public final void VR() {
        C19EG activity;
        Intent intent;
        String strMR;
        if (!C1171990gbV.LIZJ() || (activity = getActivity()) == null || (intent = activity.getIntent()) == null || (strMR = MR(intent, "favorite_auto_landing_method")) == null) {
            return;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("personal_homepage", "enter_from");
        pairArr[1] = new Pair(strMR, "enter_method");
        FavoritePowerViewPagerViewModel favoritePowerViewPagerViewModelNR = NR();
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJJ;
        if (viewOnAttachStateChangeListenerC20631115oD == null) {
            viewOnAttachStateChangeListenerC20631115oD = null;
        }
        pairArr[2] = new Pair(favoritePowerViewPagerViewModelNR.wQ2(viewOnAttachStateChangeListenerC20631115oD.getCurrentItem()), "tab_name");
        C20684815ws.LJIJI("enter_personal_favourite_auto_landing", pairArr);
    }

    public final void ZR() {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        InterfaceC1206430hV3 interfaceC1206430hV3;
        if (!C1171990gbV.LIZJ() || (viewOnAttachStateChangeListenerC20631115oD = this.LLJJJ) == null) {
            return;
        }
        int iLJIIIIZZ = viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator().getState().LJIIIIZZ();
        for (int i = 0; i < iLJIIIIZZ; i++) {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJJJ;
            if (viewOnAttachStateChangeListenerC20631115oD2 == null) {
                viewOnAttachStateChangeListenerC20631115oD2 = null;
            }
            C128Y c128yLIZIZ = viewOnAttachStateChangeListenerC20631115oD2.getFragmentItemOperator().LIZIZ(i);
            if ((c128yLIZIZ instanceof InterfaceC1206430hV3) && (interfaceC1206430hV3 = (InterfaceC1206430hV3) c128yLIZIZ) != null) {
                interfaceC1206430hV3.VE(this.LLJJLIIIJLLLLLLLZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1206260hUm c1206260hUm = this.LLILZLL;
        if (c1206260hUm == null) {
            c1206260hUm = null;
        }
        C11JF c11jf = c1206260hUm.LIZJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = c1206260hUm.LIZLLL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        ((LinkedHashMap) c1206260hUm.LJ).clear();
        C15580068c c15580068c = C15580068c.LIZ;
        C1206350hUv c1206350hUv = this.LLJL;
        c15580068c.getClass();
        C15580068c.LIZIZ(c1206350hUv);
        C20673215v0.LJIIIIZZ(R.layout.c6d);
        this.LLJJIJIL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC1206390hUz interfaceC1206390hUz;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(FavoritesFragmentV2.class.getName());
        }
        C1206450hV5.LIZ = this.LLILLL;
        super.onResume();
        if (!this.LLJILJILJ) {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJJ;
            if (viewOnAttachStateChangeListenerC20631115oD == null) {
                viewOnAttachStateChangeListenerC20631115oD = null;
            }
            C0T6K.LIZ(viewOnAttachStateChangeListenerC20631115oD, AFwS206S0000000_18.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT));
            this.LLJILJILJ = true;
        }
        FavoritePowerViewPagerViewModel favoritePowerViewPagerViewModelNR = NR();
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJJJ;
        if (viewOnAttachStateChangeListenerC20631115oD2 == null) {
            viewOnAttachStateChangeListenerC20631115oD2 = null;
        }
        int i = this.LLJILJIL;
        favoritePowerViewPagerViewModelNR.getClass();
        C128Y c128yLIZIZ = viewOnAttachStateChangeListenerC20631115oD2.getFragmentItemOperator().LIZIZ(i);
        if (!(c128yLIZIZ instanceof InterfaceC1206390hUz) || (interfaceC1206390hUz = (InterfaceC1206390hUz) c128yLIZIZ) == null) {
            return;
        }
        interfaceC1206390hUz.onPageSelected(i);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1458960o4M.LIZ = false;
        C1458960o4M.LIZIZ = -1;
    }

    public static Map SR(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : pairArr) {
            Object second = pair.getSecond();
            if (second != null) {
                if (second instanceof String) {
                    if (((CharSequence) second).length() > 0) {
                        linkedHashMap.put(pair.getFirst(), second);
                    }
                } else {
                    linkedHashMap.put(pair.getFirst(), second.toString());
                }
            }
        }
        return linkedHashMap;
    }

    public final Integer OR(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(NR().yQ2(str));
        if (numValueOf.intValue() < 0) {
            return null;
        }
        return numValueOf;
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        String string;
        Intent intent;
        Intent intent2;
        String strMR;
        Intent intent3;
        Uri data;
        BaseActivity baseActivity;
        String strMR2 = null;
        if ((activity instanceof BaseActivity) && (baseActivity = (BaseActivity) activity) != null) {
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(baseActivity, ImmersionBar.LJIILJJIL(baseActivity));
            tuxImmersionBar.LJIIIIZZ(R.attr.bx);
            tuxImmersionBar.LJ(R.attr.bx);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
            baseActivity.activityConfiguration(AFwS256S0000000_18.get$arr$(84));
        }
        if (activity != null && (intent3 = activity.getIntent()) != null && (data = intent3.getData()) != null) {
            string = data.toString();
        } else {
            string = null;
        }
        boolean zLJFF = Intrinsics.LJFF(string, "//setting/favorite");
        this.LLJI = zLJFF;
        if (zLJFF) {
            this.LL = Boolean.TRUE;
            if (activity != null && (intent2 = activity.getIntent()) != null && (strMR = MR(intent2, "target_tab_name")) != null) {
                this.LLJJ = strMR;
                return;
            }
            return;
        }
        if (activity != null && (intent = activity.getIntent()) != null) {
            strMR2 = intent.hasExtra("enter_from") ? MR(intent, "enter_from") : "h5";
        }
        this.LLILLL = strMR2;
    }

    public final void aS(boolean z) {
        int iYQ2 = NR().yQ2("video");
        if (iYQ2 >= 0 && this.LLJILJIL == iYQ2) {
            if (RR() == null) {
                return;
            }
            UR(!Intrinsics.LJFF(r0.LLILLJJLI.getValue(), Boolean.TRUE), z);
            return;
        }
        UR(false, z);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof InterfaceC1206430hV3) {
            ((InterfaceC1206430hV3) fragment).VE(this.LLJJLIIIJLLLLLLLZ);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C19Y2 c19y2;
        LinearLayout.LayoutParams layoutParams;
        super.onConfigurationChanged(configuration);
        C19Y3 c19y3 = this.LLILZ;
        if (c19y3 == null) {
            return;
        }
        int tabCount = c19y3.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            C19Y3 c19y32 = this.LLILZ;
            if (c19y32 == null) {
                c19y32 = null;
            }
            C19Y5 c19y5LJIIIZ = c19y32.LJIIIZ(i);
            if (c19y5LJIIIZ != null && (c19y2 = c19y5LJIIIZ.LJIIIIZZ) != null) {
                ViewGroup.LayoutParams layoutParams2 = c19y2.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.width = -2;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19y2);
                    c19y2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Type inference failed for: r0v98, types: [T, com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl$WishListFragmentData] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setUserVisibleHint(boolean r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2.setUserVisibleHint(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0hUv] */
    public FavoritesFragmentV2(Boolean bool, String str) {
        this.LL = bool;
        this.LLILLJJLI = str;
        this.LLILLL = "personal_homepage";
        this.LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 258));
        this.LLJJIJIIJIL = "landing";
        this.LLJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 256));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 259));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 257));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 255));
        this.LLJJL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(114));
        this.LLJL = new Object(this) { // from class: X.0hUv
            @C14EU(sticky = true)
            public final void onTabChanged(C1206460hV6 c1206460hV6) {
            }
        };
    }

    public static String MR(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void UR(boolean z, boolean z2) {
        View view = this.LLIZ;
        if (view == null) {
            return;
        }
        view.animate().cancel();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.xf);
        C19Y3 c19y3 = null;
        if (z) {
            C19Y3 c19y32 = this.LLILZ;
            if (c19y32 == null) {
                c19y32 = null;
            }
            int paddingLeft = c19y32.getPaddingLeft();
            C19Y3 c19y33 = this.LLILZ;
            if (c19y33 == null) {
                c19y33 = null;
            }
            int paddingTop = c19y33.getPaddingTop();
            C19Y3 c19y34 = this.LLILZ;
            if (c19y34 != null) {
                c19y3 = c19y34;
            }
            c19y32.setPadding(paddingLeft, paddingTop, dimensionPixelSize, c19y3.getPaddingBottom());
            C786410Ut5.T4(view, 0.0f);
            C786410Ut5.LJLLLLLL(0, view);
            if (z2) {
                view.animate().alpha(1.0f).setDuration(100L).setInterpolator(new LinearInterpolator()).start();
                return;
            } else {
                C786410Ut5.T4(view, 1.0f);
                return;
            }
        }
        C19Y3 c19y35 = this.LLILZ;
        if (c19y35 == null) {
            c19y35 = null;
        }
        int paddingLeft2 = c19y35.getPaddingLeft();
        C19Y3 c19y36 = this.LLILZ;
        if (c19y36 == null) {
            c19y36 = null;
        }
        int paddingTop2 = c19y36.getPaddingTop();
        int i = this.LLIZLLLIL;
        C19Y3 c19y37 = this.LLILZ;
        if (c19y37 != null) {
            c19y3 = c19y37;
        }
        c19y35.setPadding(paddingLeft2, paddingTop2, i, c19y3.getPaddingBottom());
        if (z2 && view.getVisibility() == 0) {
            view.animate().alpha(0.0f).setDuration(100L).setInterpolator(new LinearInterpolator()).withEndAction(new ARunnableS113S0100000_13(view, 101)).start();
        } else {
            C786410Ut5.T4(view, 0.0f);
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c6d, viewGroup, false);
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
