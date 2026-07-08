package com.ss.android.ugc.aweme.creatorcenter.fragment;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0TVI;
import X.C0XQ7;
import X.C1242750iRd;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LP;
import X.C14K9;
import X.C15438062q;
import X.C1553780qXI;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1846060y8i;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20277814Wa;
import X.C20642515q3;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.CreatorCenterURLSetting;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class CreatorCenterFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+LC4nJzcvLCHELIOSEnLTdiLz0yLygpJzt9CzcpKDs8OgYpJzs2OgM+KCg+LSs4";
    public TuxNavBar LLJ;
    public C1846060y8i LLJI;
    public ViewPager LLJIJIL;
    public C1749280vcc LLJILJIL;
    public FrameLayout LLJILLL;
    public boolean LLJJ;
    public SparkContext LLJJI;
    public SparkContext LLJJIII;
    public int LLJJIJIIJIL;
    public volatile boolean LLJJJ;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(134));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(133));
    public final CreatorCenterURLSetting.CreatorCenterInfoStructJsonModel LLJILJILJ = CreatorCenterURLSetting.LIZ();
    public final int LLJJIJI = 1;
    public final Map<Integer, String> LLJJIJIL = C2097608Jq.LJIIIIZZ(new Pair(0, "tools"), new Pair(1, "live"));

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
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

    @Override // X.InterfaceC21503819Do
    public final void onActivityFinish() {
        ((SparkFragment) this.LLIZ.getValue()).finish();
        ((SparkFragment) this.LLIZLLLIL.getValue()).finish();
        this.LLJJIII = null;
        this.LLJJI = null;
    }

    public final void UR() {
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.y6b, (Fragment) this.LLIZ.getValue(), null);
        c19ehLJIIJ.LJIIJ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab_name", "tools");
        C20684815ws.LJIILLIIL("creator_center_tab_show", c2344009Gk.LIZ);
    }

    public static String SR(String str) {
        String curUserId;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId();
        } else {
            curUserId = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("studio_inapp_cache_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Uri uri = UriProtector.parse(str);
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        boolean z = false;
        for (String str2 : queryParameterNames) {
            if (Intrinsics.LJFF(str2, "preload_storage_keys")) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJLIL(URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "UTF-8"), '[', ']'), new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
                }
                builderClearQuery.appendQueryParameter(str2, URLEncoder.encode(C13LP.LJJLIIIJ(C13LP.LJJJJI(C13LP.LJLILLLLZI(strLIZIZ, arrayList)), ",", e3.e, e3.f, 0, null, null, 56), "UTF-8"));
                z = true;
            } else {
                builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
            }
        }
        if (!z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('[');
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(']');
            builderClearQuery.appendQueryParameter("preload_storage_keys", URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ2), "UTF-8"));
        }
        builderClearQuery.appendQueryParameter("user_id", curUserId);
        return builderClearQuery.build().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strLJI;
        super.onViewCreated(view, bundle);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0znu
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), c20246014Ju.LIZ(7).LIZLLL);
                    return c20246014Ju;
                }
            });
        } else {
            view.setFitsSystemWindows(true);
        }
        C1749280vcc c1749280vcc = this.LLJILJIL;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        C1749280vcc c1749280vcc2 = this.LLJILJIL;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
        if (i >= 35) {
            TuxNavBar tuxNavBar = this.LLJ;
            if (tuxNavBar != null) {
                C14K9.LJIJJ(tuxNavBar, new C0TVI() { // from class: X.0TVO
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                        view2.setPadding(0, c20246014Ju.LIZ(7).LIZIZ, 0, 0);
                        return c20246014Ju;
                    }
                });
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, requireContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                TuxNavBar tuxNavBar2 = this.LLJ;
                if (tuxNavBar2 != null) {
                    tuxNavBar2.setBackgroundColor(iIntValue);
                }
            }
        }
        TuxNavBar tuxNavBar3 = this.LLJ;
        if (tuxNavBar3 != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS572S0100000_28(this, 888));
            tuxNavBar3.LIZIZ(c1251150ifB);
        }
        TuxNavBar tuxNavBar4 = this.LLJ;
        if (tuxNavBar4 != null) {
            C1250250idj c1250250idj = new C1250250idj();
            if (C1242750iRd.LIZ() == 1) {
                strLJI = C20642515q3.LJI(2131850268);
            } else if (C1553780qXI.LIZIZ()) {
                strLJI = C20642515q3.LJI(2131830119);
            } else {
                strLJI = C20642515q3.LJI(2131830119);
            }
            c1250250idj.LIZJ = strLJI;
            tuxNavBar4.LJIJJ(c1250250idj);
        }
        TuxNavBar tuxNavBar5 = this.LLJ;
        if (tuxNavBar5 != null) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_gear;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new AwS567S0100000_23(this, 189));
            tuxNavBar5.LIZ(c1251150ifB2);
        }
        TuxNavBar tuxNavBar6 = this.LLJ;
        if (tuxNavBar6 != null) {
            tuxNavBar6.LJIIZILJ(false);
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, requireContext());
        if (numLIZJ2 != null) {
            int iIntValue2 = numLIZJ2.intValue();
            TuxNavBar tuxNavBar7 = this.LLJ;
            if (tuxNavBar7 != null) {
                tuxNavBar7.setNavBackground(iIntValue2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f6e, viewGroup, false);
        this.LLJ = (TuxNavBar) viewTd.findViewById(R.id.p15);
        this.LLJI = (C1846060y8i) viewTd.findViewById(R.id.wx3);
        this.LLJIJIL = (ViewPager) viewTd.findViewById(R.id.view_pager);
        this.LLJILJIL = (C1749280vcc) viewTd.findViewById(R.id.w28);
        this.LLJILLL = (FrameLayout) viewTd.findViewById(R.id.y6b);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
