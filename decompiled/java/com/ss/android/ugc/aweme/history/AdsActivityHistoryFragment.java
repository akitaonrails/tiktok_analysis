package com.ss.android.ugc.aweme.history;

import X.C01GW;
import X.C098200Yq;
import X.C0DKX;
import X.C0OM1;
import X.C1156160gBy;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LP;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C189200o6;
import X.C1954807lC;
import X.C19719612Di;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19KV;
import X.C19KW;
import X.C19KZ;
import X.C21520619Ka;
import X.C21520719Kb;
import X.C21520819Kc;
import X.C21520919Kd;
import X.C2188811AlT;
import X.C2249211D1r;
import X.C2265381Dlg;
import X.C2265391Dlh;
import X.C2265411Dlj;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1846110y8n;
import X.InterfaceC836760Ws6;
import Y.ARunnableS101S0200000_32;
import Y.ARunnableS132S0100000_32;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS7S3300000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes33.dex */
@InterfaceC836760Ws6
public final class AdsActivityHistoryFragment extends SAFTikTokFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi0lOjs8HELIOSOjxiCCsgCSY4IDk6PDwEIDwnJzc1Dz0yLygpJzs=";
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS278S0000000_32.get$arr$(42), "source", String.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS278S0000000_32.get$arr$(43), "tabs", String.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS278S0000000_32.get$arr$(40), "default_tab", String.class);
    public final C01GW LLJJIII = RouteArgExtension.INSTANCE.optionalArg(this, AFwS278S0000000_32.get$arr$(41), "extra_msg", String.class);
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 197));
    public C1846060y8i LLJJIJIIJIL;
    public TuxNavBar LLJJIJIL;
    public C19KV LLJJJ;
    public C19KZ LLJJJIL;
    public long LLJJJJ;
    public long LLJJJJJIL;
    public String LLJJJJLIIL;
    public C21520919Kd LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public final List<C19KW> LLJL;
    public final BPEAHandler LLJLIL;
    public final BPEAHandler LLJLILLLLZIIL;
    public final ARunnableS132S0100000_32 LLJLL;

    public final void iS() {
        Iterator it2 = ((ArrayList) this.LLJL).iterator();
        while (it2.hasNext()) {
            this.LLJLILLLLZIIL.removeCallbacks(((C19KW) it2.next()).LIZIZ);
        }
        ((ArrayList) this.LLJL).clear();
    }

    public final AdsActivityHistoryViewModel mS() {
        return (AdsActivityHistoryViewModel) this.LLJJIJI.getValue();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        this.LLJJLIIIJLLLLLLLZ = "system_back";
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        this.LLJLIL.removeCallbacks(this.LLJLL);
        iS();
        if (this.LLJJJJJIL > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJJJJJIL;
            long jElapsedRealtime2 = this.LLJJJJ > 0 ? SystemClock.elapsedRealtime() - this.LLJJJJ : 0L;
            String strVQ2 = mS().vQ2();
            C19KV c19kv = this.LLJJJ;
            if (c19kv == null || (str = c19kv.LIZ) == null) {
                str = "";
            }
            String str2 = this.LLJJJJLIIL;
            C19KZ c19kz = this.LLJJJIL;
            String str3 = this.LLJJLIIIJLLLLLLLZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("source=");
            sbLIZ.append(str);
            sbLIZ.append(", sessionId=");
            sbLIZ.append(str2);
            sbLIZ.append(", lastActiveTab=");
            sbLIZ.append(c19kz != null ? c19kz.getTrackingName() : null);
            sbLIZ.append(", pageDurationMs=");
            sbLIZ.append(jElapsedRealtime);
            sbLIZ.append(", lastActiveTabDurationMs=");
            sbLIZ.append(jElapsedRealtime2);
            C2188811AlT.LIZIZ(sbLIZ);
            C2249211D1r c2249211D1r = new C2249211D1r(new Object[0]);
            C2265381Dlg.LIZ.getClass();
            c2249211D1r.log(C2265381Dlg.LIZLLL, new C2265391Dlh(jElapsedRealtime, jElapsedRealtime2, c19kz, strVQ2, str, str2, str3));
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLJLIL.removeCallbacks(this.LLJLL);
        iS();
        this.LLJJL = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C19KV c19kv = this.LLJJJ;
        C21520819Kc.LIZ("pause", c19kv != null ? c19kv.LIZ : null, this.LLJJJJLIIL, this.LLJJJIL);
        this.LLJLIL.removeCallbacks(this.LLJLL);
        super.onPause();
    }

    public AdsActivityHistoryFragment() {
        aS(AFwS278S0000000_32.get$arr$(39));
        this.LLJJJJLIIL = "";
        this.LLJL = new ArrayList();
        this.LLJLIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJLILLLLZIIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJLL = new ARunnableS132S0100000_32(this, 35);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C19KV c19kv = this.LLJJJ;
        C21520819Kc.LIZ("resume", c19kv != null ? c19kv.LIZ : null, this.LLJJJJLIIL, this.LLJJJIL);
        if (this.LLJJJIL != null) {
            this.LLJLIL.removeCallbacks(this.LLJLL);
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLJLIL, this.LLJLL);
        }
    }

    public static String hS(C19KZ c19kz) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ads_activity_history_");
        sbLIZ.append(c19kz.getTrackingName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Fragment kS(C19KZ c19kz) {
        String str;
        C1156160gBy c1156160gBy;
        String string;
        C19KV c19kv = this.LLJJJ;
        if (c19kv == null) {
            return new Fragment();
        }
        int i = C21520619Ka.LIZ[c19kz.ordinal()];
        String lowerCase = null;
        if (i != 1 && i != 2) {
            if (i == 3) {
                String str2 = c19kv.LIZ;
                if (str2 != null && (string = a0.LJLIIIL(str2).toString()) != null) {
                    lowerCase = string.toLowerCase(Locale.ROOT);
                }
                if (Intrinsics.LJFF(lowerCase, "activity_center")) {
                    c1156160gBy = new C1156160gBy("activity_center", 1, "history");
                } else if (Intrinsics.LJFF(lowerCase, "iab_more_sheet")) {
                    c1156160gBy = new C1156160gBy("iab_more_sheet", 4, "ad");
                } else {
                    c1156160gBy = new C1156160gBy("unknown", 1, "history");
                }
                return C0DKX.LIZ(Integer.valueOf(c1156160gBy.LIZIZ), c1156160gBy.LIZJ, true);
            }
            throw new C1954807lC();
        }
        int titleRes = c19kz.getTitleRes();
        AdsActivityHistoryViewModel adsActivityHistoryViewModelMS = mS();
        adsActivityHistoryViewModelMS.getClass();
        String str3 = c19kv.LIZ;
        String strVQ2 = adsActivityHistoryViewModelMS.vQ2();
        int i2 = C21520719Kb.LIZ[c19kz.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                str = "";
            } else {
                str = "https://www.tiktok.com/ad/tetris/experience/feedback_ad_review";
            }
        } else {
            str = "https://www.tiktok.com/ad/tetris/experience/feedback_ad_history";
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("source", str3).appendQueryParameter("tt_user_id", strVQ2);
        String str4 = c19kv.LIZLLL;
        if (str4 != null && (true ^ a0.LJJJIL(str4))) {
            builderAppendQueryParameter.appendQueryParameter("extra_msg", str4);
        }
        String string2 = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", builderAppendQueryParameter.build().toString()).appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_spark", "1").build().toString();
        AdsActivityHistoryWebTabFragment adsActivityHistoryWebTabFragment = new AdsActivityHistoryWebTabFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("arg_tab_id", c19kz.getTrackingName(), bundle);
        bundle.putInt("arg_title_res", titleRes);
        C786410Ut5.LJJJI("arg_load_url", string2, bundle);
        adsActivityHistoryWebTabFragment.setArguments(bundle);
        return adsActivityHistoryWebTabFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bd  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.history.AdsActivityHistoryFragment.onCreate(android.os.Bundle):void");
    }

    public final void nS(C19KZ c19kz, boolean z) {
        String str;
        String trackingName;
        C1846060y8i c1846060y8i;
        boolean z2;
        String str2;
        String str3;
        C19KV c19kv = this.LLJJJ;
        if (c19kv == null) {
            return;
        }
        if (this.LLJJJIL == c19kz && z) {
            return;
        }
        List<C19KW> list = this.LLJL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((C19KW) obj).LIZ == c19kz) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LLJLILLLLZIIL.removeCallbacks(((C19KW) it2.next()).LIZIZ);
        }
        C19719612Di.LJJIIJ(this.LLJL, new AwS611S0100000_32(c19kz, 74), true);
        C19KZ c19kz2 = this.LLJJJIL;
        long jElapsedRealtime = 0;
        if (this.LLJJJJ > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJJJJ;
        }
        this.LLJJJIL = c19kz;
        this.LLJJJJ = SystemClock.elapsedRealtime();
        if (z) {
            str = "tab_switch_user";
        } else {
            str = "tab_switch_auto";
        }
        C21520819Kc.LIZ(str, c19kv.LIZ, this.LLJJJJLIIL, c19kz);
        if (isAdded() && getView() != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
            Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI(hS(c19kz));
            for (Fragment fragment : childFragmentManager.LJJLIIIJL()) {
                if (fragment.isAdded() && !fragment.isHidden()) {
                    c19ehLJIIJ.LJIILL(fragment);
                }
            }
            if (fragmentLJJJJZI != null) {
                z2 = true;
                c19ehLJIIJ.LJJIFFI(fragmentLJJJJZI);
            } else {
                z2 = false;
                c19ehLJIIJ.LIZJ(R.id.iiw, kS(c19kz), hS(c19kz));
            }
            C19KV c19kv2 = this.LLJJJ;
            if (c19kv2 == null || (str2 = c19kv2.LIZ) == null) {
                str2 = "";
            }
            String str4 = this.LLJJJJLIIL;
            if (c19kz == C19KZ.LINK_HISTORY) {
                str3 = "legacy_history";
            } else {
                str3 = "web_tab";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("source=");
            sbLIZ.append(str2);
            sbLIZ.append(", sessionId=");
            sbLIZ.append(str4);
            sbLIZ.append(", tab=");
            sbLIZ.append(c19kz.getTrackingName());
            sbLIZ.append(", childType=");
            sbLIZ.append(str3);
            sbLIZ.append(", reused=");
            sbLIZ.append(z2);
            C2188811AlT.LIZIZ(sbLIZ);
            c19ehLJIIJ.LJIIJ();
        }
        String strVQ2 = mS().vQ2();
        String str5 = c19kv.LIZ;
        String str6 = this.LLJJJJLIIL;
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("source=");
        sbLIZ2.append(str5);
        sbLIZ2.append(", sessionId=");
        sbLIZ2.append(str6);
        sbLIZ2.append(", activeTab=");
        sbLIZ2.append(c19kz.getTrackingName());
        sbLIZ2.append(", previousTab=");
        if (c19kz2 != null) {
            trackingName = c19kz2.getTrackingName();
        } else {
            trackingName = null;
        }
        sbLIZ2.append(trackingName);
        sbLIZ2.append(", previousTabDurationMs=");
        sbLIZ2.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ2);
        C2249211D1r c2249211D1r = new C2249211D1r(new Object[0]);
        C2265381Dlg.LIZ.getClass();
        c2249211D1r.log(C2265381Dlg.LIZJ, new AwS7S3300000_35(c19kz, c19kz2, lValueOf, strVQ2, str5, str6, 1));
        Iterator<C19KZ> it3 = c19kv.LIZIZ.iterator();
        int i = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (it3.next() == c19kz) {
                if (i >= 0 && !z && (c1846060y8i = this.LLJJIJIIJIL) != null) {
                    c1846060y8i.LJIILL(c1846060y8i.LJII(i), true);
                }
            } else {
                i++;
            }
        }
        this.LLJLIL.removeCallbacks(this.LLJLL);
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLJLIL, this.LLJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [X.0y8n, X.19Kd] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        this.LLJJIJIL = (TuxNavBar) view.findViewById(R.id.p16);
        this.LLJJIJIIJIL = (C1846060y8i) view.findViewById(R.id.wx4);
        C19EG activity = getActivity();
        if (activity != null) {
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, ImmersionBar.LJIILJJIL(activity));
            tuxImmersionBar.LJIIIIZZ(R.attr.bx);
            tuxImmersionBar.LJ(R.attr.bx);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
        }
        TuxNavBar tuxNavBar = this.LLJJIJIL;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS576S0100000_32(this, 774));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131835113);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
        }
        TuxNavBar tuxNavBar2 = this.LLJJIJIL;
        if (tuxNavBar2 != null) {
            tuxNavBar2.LJIIZILJ(false);
        }
        final C19KV c19kv = this.LLJJJ;
        if (c19kv == null) {
            this.LLJJLIIIJLLLLLLLZ = "system_back";
            finish();
            return;
        }
        this.LLJJJJLIIL = UUID.randomUUID().toString();
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJJJJJIL = SystemClock.elapsedRealtime();
        C21520819Kc.LIZ("page_state_ready", c19kv.LIZ, this.LLJJJJLIIL, c19kv.LIZJ);
        C1846060y8i c1846060y8i = this.LLJJIJIIJIL;
        if (c1846060y8i != 0) {
            C21520919Kd c21520919Kd = this.LLJJL;
            if (c21520919Kd != null) {
                c1846060y8i.LJIIL(c21520919Kd);
            }
            c1846060y8i.LJIIJJI();
            for (C19KZ c19kz : c19kv.LIZIZ) {
                C1845940y8W c1845940y8WLJIIIZ = c1846060y8i.LJIIIZ();
                c1845940y8WLJIIIZ.LIZIZ(getString(c19kz.getTitleRes()));
                c1846060y8i.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i.LLILZLL.size(), c1846060y8i.LLILZLL.isEmpty());
            }
            ?? r2 = new InterfaceC1846110y8n() { // from class: X.19Kd
                @Override // X.InterfaceC1846110y8n
                public final void LIZ(C1845940y8W c1845940y8W) {
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZJ(C1845940y8W c1845940y8W) {
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZIZ(C1845940y8W c1845940y8W) {
                    C19KZ c19kz2 = (C19KZ) C13LP.LJJJLZIJ(c1845940y8W.LIZLLL, c19kv.LIZIZ);
                    if (c19kz2 == null) {
                        return;
                    }
                    this.nS(c19kz2, true);
                }
            };
            this.LLJJL = r2;
            c1846060y8i.LIZ(r2);
        }
        String str = c19kv.LIZ;
        String str2 = this.LLJJJJLIIL;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(c19kv.LIZIZ, ",", null, null, 0, null, AFwS278S0000000_32.get$arr$(168), 30);
        C19KZ c19kz2 = c19kv.LIZJ;
        int size = c19kv.LIZIZ.size();
        if (c19kv.LIZIZ.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source=");
        sbLIZ.append(str);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(str2);
        sbLIZ.append(", tabSequence=");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(", defaultTab=");
        sbLIZ.append(c19kz2.getTrackingName());
        sbLIZ.append(", tabCount=");
        sbLIZ.append(size);
        sbLIZ.append(", tabBarVisible=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        String strVQ2 = mS().vQ2();
        String str3 = c19kv.LIZ;
        String str4 = this.LLJJJJLIIL;
        C19KZ c19kz3 = c19kv.LIZJ;
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(c19kv.LIZIZ, ",", null, null, 0, null, AFwS278S0000000_32.get$arr$(169), 30);
        int i = 0;
        String strLJJLIIIJ3 = C13LP.LJJLIIIJ(c19kv.LJ, ",", null, null, 0, null, null, 62);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("source=");
        sbLIZ2.append(str3);
        sbLIZ2.append(", sessionId=");
        sbLIZ2.append(str4);
        sbLIZ2.append(", defaultTab=");
        sbLIZ2.append(c19kz3.getTrackingName());
        sbLIZ2.append(", tabSequence=");
        sbLIZ2.append(strLJJLIIIJ2);
        sbLIZ2.append(", fallbackReason=");
        sbLIZ2.append(strLJJLIIIJ3);
        C2188811AlT.LIZIZ(sbLIZ2);
        C2249211D1r c2249211D1r = new C2249211D1r(new Object[0]);
        C2265381Dlg.LIZ.getClass();
        c2249211D1r.log(C2265381Dlg.LIZIZ, new C2265411Dlj(strVQ2, str3, str4, c19kz3, strLJJLIIIJ2, strLJJLIIIJ3));
        nS(c19kv.LIZJ, false);
        iS();
        List<C19KZ> list = c19kv.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (C19KZ c19kz4 : list) {
            C19KZ c19kz5 = c19kz4;
            C19KZ c19kz6 = this.LLJJJIL;
            if (c19kz6 == null) {
                c19kz6 = c19kv.LIZJ;
            }
            if (c19kz5 != c19kz6 && getChildFragmentManager().LJJJJZI(hS(c19kz5)) == null) {
                arrayList.add(c19kz4);
            }
        }
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                C19KZ c19kz7 = (C19KZ) obj;
                ARunnableS101S0200000_32 aRunnableS101S0200000_32 = new ARunnableS101S0200000_32(c19kz7, this, 17);
                ((ArrayList) this.LLJL).add(new C19KW(c19kz7, aRunnableS101S0200000_32));
                C786410Ut5.LJLIIL(((long) i2) * 1000, this.LLJLILLLLZIIL, aRunnableS101S0200000_32);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.mb, viewGroup, false);
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
