package com.ss.android.ugc.aweme.feed.flexible;

import X.C01GW;
import X.C03H5;
import X.C07ZL;
import X.C098200Yq;
import X.C0OGM;
import X.C0QFS;
import X.C0QSJ;
import X.C0ZP4;
import X.C1041990dDp;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1594210raV;
import X.C1594220raW;
import X.C1685300txQ;
import X.C16G1;
import X.C1770850wBP;
import X.C189200o6;
import X.C18KG;
import X.C18KT;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19LM;
import X.C1A5L;
import X.C1AF0;
import X.C20673215v0;
import X.C20684815ws;
import X.C21659719pj;
import X.C21698919w3;
import X.C21699219w6;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2344009Gk;
import X.C452070Ho5;
import X.C452501pT;
import X.C488600JEc;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1783090wV9;
import X.EnumC21658519pX;
import X.InterfaceC0148002o;
import X.InterfaceC1059280dfi;
import X.InterfaceC1146704e9;
import X.InterfaceC1399350mWD;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1581830rGX;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1740760vOs;
import X.InterfaceC21503819Do;
import X.InterfaceC21659219pe;
import X.InterfaceC21659319pf;
import X.InterfaceC21659919pl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC655270Pn3;
import X.InterfaceC676690QgV;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC744180THc;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.fragment.FragmentNavigationContainer;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.feed.flexible.api.FlexibleComponentCallback;
import com.ss.android.ugc.aweme.feed.flexible.api.FlexibleSupportAbility;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.AwS80S1000000_30;
import kotlin.jvm.internal.AwS82S1000000_32;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes34.dex */
public final class FlexibleRootFragment extends SAFTikTokFragment implements InterfaceC724530SbT, InterfaceC1581830rGX, InterfaceC1740760vOs, C0OGM, C0QFS, InterfaceC744180THc, InterfaceC655270Pn3, InterfaceC21659319pf, FragmentNavigationContainer, InterfaceC21659219pe, InterfaceC1059280dfi, InterfaceC676690QgV, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpLCt9HELIOSLikpMSYxJCBiDyM2MCwuJSoBJyo4Dz0yLygpJzs=";
    public FlexibleComponentCallback LLJILLL;
    public FlexibleSupportAbility LLJJ;
    public SAFTikTokFragment LLJJI;
    public final AssemVMLazy LLJJIII;
    public List<InterfaceC1399350mWD> LLJJIJI;
    public String LLJJIJIIJIL;
    public C21699219w6 LLJJIJIL;
    public String LLJJJ;
    public final C01GW LLJJJIL;
    public C21659719pj LLJJJJ;
    public C19LM LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FlexibleRootFragment.class, "stateVM", "getStateVM()Lcom/ss/android/ugc/aweme/feed/flexible/FlexiblePanelVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.router.fragment.FragmentNavigationContainer
    public final boolean addFragmentToBackStack() {
        return true;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{FlexibleRootFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
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

    @Override // com.bytedance.router.fragment.FragmentNavigationContainer
    public final int getFragmentContainer() {
        return R.id.icg;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FlexibleRootFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FlexibleRootFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
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

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void YP() {
        SAFTikTokFragment sAFTikTokFragment = this.LLJJI;
        if (sAFTikTokFragment != null) {
            sAFTikTokFragment.YP();
        }
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        InterfaceC744180THc interfaceC744180THc;
        InterfaceC21503819Do interfaceC21503819Do = this.LLJJI;
        if (!(interfaceC21503819Do instanceof InterfaceC744180THc) || (interfaceC744180THc = (InterfaceC744180THc) interfaceC21503819Do) == null) {
            return null;
        }
        return interfaceC744180THc.getAnalysis();
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        InterfaceC1740760vOs interfaceC1740760vOs;
        String btmPageCode;
        InterfaceC21503819Do interfaceC21503819Do = this.LLJJI;
        return (!(interfaceC21503819Do instanceof InterfaceC1740760vOs) || (interfaceC1740760vOs = (InterfaceC1740760vOs) interfaceC21503819Do) == null || (btmPageCode = interfaceC1740760vOs.getBtmPageCode()) == null) ? "" : btmPageCode;
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        InterfaceC1581830rGX interfaceC1581830rGX;
        String pageName;
        InterfaceC21503819Do interfaceC21503819Do = this.LLJJI;
        return (!(interfaceC21503819Do instanceof InterfaceC1581830rGX) || (interfaceC1581830rGX = (InterfaceC1581830rGX) interfaceC21503819Do) == null || (pageName = interfaceC1581830rGX.getPageName()) == null) ? "flexible_root" : pageName;
    }

    @Override // X.C0OGM
    public final int getPageType() {
        C0OGM c0ogm;
        InterfaceC21503819Do interfaceC21503819Do = this.LLJJI;
        if (!(interfaceC21503819Do instanceof C0OGM) || (c0ogm = (C0OGM) interfaceC21503819Do) == null) {
            return -1;
        }
        return c0ogm.getPageType();
    }

    public final FlexiblePanelVM hS() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (FlexiblePanelVM) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (this.LLJILLL != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), FlexibleComponentCallback.class, null);
        }
        if (this.LLJJ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), FlexibleSupportAbility.class, null);
        }
        this.LLJILLL = null;
        this.LLJJ = null;
        super.onDestroy();
    }

    @Override // X.InterfaceC21659319pf
    public final View uN() {
        InterfaceC21659319pf interfaceC21659319pf;
        InterfaceC21503819Do interfaceC21503819Do = this.LLJJI;
        if (!(interfaceC21503819Do instanceof InterfaceC21659319pf) || (interfaceC21659319pf = (InterfaceC21659319pf) interfaceC21503819Do) == null) {
            return null;
        }
        return interfaceC21659319pf.uN();
    }

    public FlexibleRootFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FlexiblePanelVM.class);
        this.LLJJIII = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS565S0100000_21(c19719912DlLIZ, 555), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 556), AFwS279S0000000_33.get$arr$(134));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2183));
        C21659719pj.Companion.getClass();
        this.LLJJJJ = C21659719pj.DEFAULT;
        aS(AFwS259S0000000_21.get$arr$(156));
    }

    @Override // X.InterfaceC676690QgV
    public final void LLZLI() {
        hS().setStateImmediate(new AwS80S1000000_30("close_x", 3));
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        hS().setStateImmediate(new AwS80S1000000_30("close_x", 3));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        if (hS().getState().LLILLJJLI == EnumC1783090wV9.PANEL) {
            hS().setStateImmediate(new AwS80S1000000_30("close_system_gesture", 3));
        } else {
            finish();
            C21699219w6 c21699219w6 = this.LLJJIJIL;
            if (c21699219w6 != null) {
                c21699219w6.LIZIZ((String) this.LLJJJIL.getValue(), "close_system_gesture");
                return true;
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        super.onDestroyView();
        this.LLJJI = null;
        C19EG activity = getActivity();
        FlexibleComponentCallback flexibleComponentCallback = this.LLJILLL;
        FlexibleSupportAbility flexibleSupportAbility = this.LLJJ;
        AwS268S0300000_24 awS268S0300000_24 = new AwS268S0300000_24(activity, this, flexibleComponentCallback, 7);
        if ((flexibleComponentCallback != null || flexibleSupportAbility != null) && new C1594210raV(flexibleComponentCallback, awS268S0300000_24, new C1594220raW(flexibleSupportAbility)).LIZJ != null && (str = this.LLJJIJIIJIL) != null && str.length() > 0) {
            C18KG.LIZ.LIZ(new C18KT(str), new AwS82S1000000_32(13), null, true);
        }
        C19LM c19lm = this.LLJJJJJIL;
        if (c19lm != null) {
            getChildFragmentManager().LLIILZL(c19lm);
        }
        this.LLJJJJJIL = null;
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void iS(Fragment fragment) {
        InterfaceC21659919pl interfaceC21659919pl;
        ViewGroup viewGroup;
        View viewInvoke;
        C21659719pj c21659719pj = this.LLJJJJ;
        if (c21659719pj.hasOverLay && c21659719pj.variant == EnumC21658519pX.AUTO && (fragment instanceof InterfaceC21659919pl) && (interfaceC21659919pl = (InterfaceC21659919pl) fragment) != null) {
            Context contextRequireContext = requireContext();
            interfaceC21659919pl.h6();
            FrameLayout frameLayout = new FrameLayout(contextRequireContext);
            C16G1 c16g1 = new C16G1(-1, -2);
            c16g1.LIZJ = 81;
            C786410Ut5.a6(frameLayout, c16g1);
            frameLayout.setId(R.id.elh);
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setBackgroundColor(0);
            C786410Ut5.LJZ(4, frameLayout);
            C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.19w8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            Function1<Context, View> function1R9 = interfaceC21659919pl.R9();
            if (function1R9 != null && (viewInvoke = function1R9.invoke(getActivity())) != null) {
                frameLayout.addView(viewInvoke);
            }
            View view = getView();
            if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.ice)) != null) {
                viewGroup.addView(frameLayout);
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C07ZL.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                interfaceC1555100qZQLIZIZ.LIZIZ(new AwS612S0100000_33(interfaceC21659919pl, 75));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[Catch: Exception -> 0x00d8, TryCatch #1 {Exception -> 0x00d8, blocks: (B:29:0x00a1, B:31:0x00a7, B:32:0x00ad, B:34:0x00b1, B:36:0x00b5, B:38:0x00bd, B:40:0x00c5, B:42:0x00cb, B:44:0x00d2), top: B:51:0x00a1 }] */
    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.flexible.FlexibleRootFragment.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC21659219pe
    public final void q(String str) {
        C21699219w6 c21699219w6 = this.LLJJIJIL;
        if (c21699219w6 != null) {
            c21699219w6.LIZIZ((String) this.LLJJJIL.getValue(), str);
        }
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        if (!isAdded()) {
            return;
        }
        List<InterfaceC1399350mWD> list = this.LLJJIJI;
        if (list != null && list.contains(interfaceC1399350mWD)) {
            return;
        }
        if (this.LLJJIJI == null) {
            this.LLJJIJI = new ArrayList();
        }
        List<InterfaceC1399350mWD> list2 = this.LLJJIJI;
        if (list2 != null) {
            list2.add(interfaceC1399350mWD);
        }
    }

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        List<InterfaceC1399350mWD> list = this.LLJJIJI;
        if (list != null) {
            ((ArrayList) list).remove(interfaceC1399350mWD);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean onKeyDown(int i, KeyEvent keyEvent) {
        Boolean boolOnKeyDown;
        SAFTikTokFragment sAFTikTokFragment = this.LLJJI;
        if (sAFTikTokFragment != null && (boolOnKeyDown = sAFTikTokFragment.onKeyDown(i, keyEvent)) != null) {
            return boolOnKeyDown;
        }
        List<InterfaceC1399350mWD> list = this.LLJJIJI;
        if (list != null) {
            Iterator<InterfaceC1399350mWD> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().onKeyDown(i, keyEvent)) {
                    return Boolean.TRUE;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean onKeyUp(int i, KeyEvent keyEvent) {
        Boolean boolOnKeyUp;
        SAFTikTokFragment sAFTikTokFragment = this.LLJJI;
        if (sAFTikTokFragment == null || (boolOnKeyUp = sAFTikTokFragment.onKeyUp(i, keyEvent)) == null) {
            return super.onKeyUp(i, keyEvent);
        }
        return boolOnKeyUp;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        SAFTikTokFragment sAFTikTokFragment;
        String string2;
        String str;
        Pair<Integer, FcpPageNode> pairLIZLLL;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        String string3;
        Serializable serializable;
        String str7;
        SAFTikTokFragment sAFTikTokFragment2;
        C21698919w3 c21698919w3;
        super.onViewCreated(view, bundle);
        String str8 = null;
        C723850SaN.LIZ(this, false, null, new AwS612S0100000_33(this, 74), 3);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("flexible_inset_fragment");
        } else {
            string = null;
        }
        if (string != null) {
            try {
                Fragment fragment = (Fragment) Class.forName(string).newInstance();
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    arguments2.putBoolean("flexible_start_from_panel", true);
                    fragment.setArguments(arguments2);
                }
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZIZ(R.id.icg, fragment);
                c19ehLJIIJ.LJIIIZ();
                if (fragment instanceof SAFTikTokFragment) {
                    sAFTikTokFragment = (SAFTikTokFragment) fragment;
                } else {
                    sAFTikTokFragment = null;
                }
                this.LLJJI = sAFTikTokFragment;
                iS(fragment);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C19EG activity = getActivity();
                FlexibleComponentCallback flexibleComponentCallback = this.LLJILLL;
                FlexibleSupportAbility flexibleSupportAbility = this.LLJJ;
                AwS268S0300000_24 awS268S0300000_24 = new AwS268S0300000_24(activity, this, flexibleComponentCallback, 7);
                if (flexibleComponentCallback != null || flexibleSupportAbility != null) {
                    new C1594210raV(flexibleComponentCallback, awS268S0300000_24, new C1594220raW(flexibleSupportAbility)).LIZ(false);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FlexibleRootFragment routeToTargetFragment insetFragment class not found:");
                sbLIZ.append(string);
                C1AF0.LJ(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
            }
        } else {
            Bundle arguments3 = getArguments();
            if (arguments3 != null && (string3 = arguments3.getString("target_schema")) != null) {
                String string4 = UriProtector.parse(string3).buildUpon().appendQueryParameter("enter_from", this.LLJJJ).appendQueryParameter("from_fcp_flex_panel", "1").build().toString();
                Integer num2 = this.LLJJJJ.useFlexPanel;
                if (num2 != null && num2.intValue() == 1) {
                    Fragment flexibleWebFragment = new FlexibleWebFragment();
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(string4);
                    sparkContext.autoLoad = true;
                    Bundle arguments4 = getArguments();
                    if (arguments4 != null) {
                        serializable = arguments4.getSerializable("flexible_sheet_mob_params");
                    } else {
                        serializable = null;
                    }
                    if (!(serializable instanceof C21698919w3) || (c21698919w3 = (C21698919w3) serializable) == null || (str7 = c21698919w3.enterFrom) == null) {
                        str7 = "";
                    }
                    sparkContext.LJJJZ("enter_from", str7);
                    sparkContext.LJJJZ("need_wrapper_view", "1");
                    C1041990dDp.LIZ.getClass();
                    C1041990dDp.LIZJ(sparkContext);
                    sparkContext.LJJJJJ(this);
                    this.LLJJJJ.setTransparentBackground(true);
                    Bundle arguments5 = getArguments();
                    if (arguments5 != null) {
                        arguments5.putBoolean("flexible_start_from_panel", true);
                        C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, arguments5);
                        flexibleWebFragment.setArguments(arguments5);
                    }
                    C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ2.LIZIZ(R.id.icg, flexibleWebFragment);
                    c19ehLJIIJ2.LJIIIZ();
                    if (flexibleWebFragment instanceof SAFTikTokFragment) {
                        sAFTikTokFragment2 = (SAFTikTokFragment) flexibleWebFragment;
                    } else {
                        sAFTikTokFragment2 = null;
                    }
                    this.LLJJI = sAFTikTokFragment2;
                    iS(flexibleWebFragment);
                } else {
                    C19LM c19lm = this.LLJJJJJIL;
                    if (c19lm != null) {
                        getChildFragmentManager().LLIILZL(c19lm);
                    }
                    C19LM c19lm2 = new C19LM(this, 1);
                    this.LLJJJJJIL = c19lm2;
                    getChildFragmentManager().LJZL(c19lm2, false);
                    FragmentRoute fragmentRouteFragmentNavigation = SmartRouter.fragmentNavigation(this);
                    fragmentRouteFragmentNavigation.withUrl(string4);
                    fragmentRouteFragmentNavigation.push(string4, "flexible_business", 0);
                    fragmentRouteFragmentNavigation.commit(Boolean.FALSE);
                }
            }
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            string2 = arguments6.getString("flexible_fcp_component_key");
        } else {
            string2 = null;
        }
        this.LLJJIJIIJIL = string2;
        C19EG activity2 = getActivity();
        FlexibleComponentCallback flexibleComponentCallback2 = this.LLJILLL;
        FlexibleSupportAbility flexibleSupportAbility2 = this.LLJJ;
        AwS268S0300000_24 awS268S0300000_242 = new AwS268S0300000_24(activity2, this, flexibleComponentCallback2, 7);
        if ((flexibleComponentCallback2 != null || flexibleSupportAbility2 != null) && new C1594210raV(flexibleComponentCallback2, awS268S0300000_242, new C1594220raW(flexibleSupportAbility2)).LIZJ != null && (str = this.LLJJIJIIJIL) != null && (!a0.LJJJIL(str)) && (pairLIZLLL = C18KG.LIZ.LIZLLL(new AwS82S1000000_32(str, 14))) != null) {
            pairLIZLLL.getSecond().getInfo().setWillEndRecordManually(true);
        }
        View viewFindViewById = view.findViewById(R.id.ice);
        if (viewFindViewById != null) {
            C19EG activity3 = getActivity();
            FlexibleComponentCallback flexibleComponentCallback3 = this.LLJILLL;
            FlexibleSupportAbility flexibleSupportAbility3 = this.LLJJ;
            AwS268S0300000_24 awS268S0300000_243 = new AwS268S0300000_24(activity3, this, flexibleComponentCallback3, 7);
            if ((flexibleComponentCallback3 != null || flexibleSupportAbility3 != null) && new C1594210raV(flexibleComponentCallback3, awS268S0300000_243, new C1594220raW(flexibleSupportAbility3)).LIZJ != null) {
                C2271391DvN.LIZ(viewFindViewById, (C1A5L) C2271381DvM.u0.getValue());
            }
        }
        C736680Sv4.LJIIIIZZ(this, hS(), new C2217381BqS() { // from class: X.19pk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20247714Kl) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS647S0100000_33(this, 9), 4);
        C21699219w6 c21699219w6 = this.LLJJIJIL;
        if (c21699219w6 != null) {
            String str9 = (String) this.LLJJJIL.getValue();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c21699219w6.LIZ(c2344009Gk);
            C21698919w3 c21698919w32 = c21699219w6.LIZ;
            if (c21698919w32 != null) {
                str2 = c21698919w32.groupId;
            } else {
                str2 = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", str2);
            C21698919w3 c21698919w33 = c21699219w6.LIZ;
            if (c21698919w33 != null) {
                str3 = c21698919w33.authorId;
            } else {
                str3 = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", str3);
            C21698919w3 c21698919w34 = c21699219w6.LIZ;
            if (c21698919w34 != null) {
                str4 = c21698919w34.componentKey;
            } else {
                str4 = null;
            }
            c2344009Gk.LJIIIIZZ("component_key", str4);
            C21698919w3 c21698919w35 = c21699219w6.LIZ;
            if (c21698919w35 != null) {
                num = c21698919w35.awemeType;
            } else {
                num = null;
            }
            c2344009Gk.LJ(num, "aweme_type");
            C21698919w3 c21698919w36 = c21699219w6.LIZ;
            if (c21698919w36 != null) {
                str5 = c21698919w36.componentType;
            } else {
                str5 = null;
            }
            c2344009Gk.LJIIIIZZ("component_type", str5);
            c2344009Gk.LJIIIIZZ("enter_type", str9);
            C21698919w3 c21698919w37 = c21699219w6.LIZ;
            if (c21698919w37 != null) {
                str6 = c21698919w37.enterFrom;
            } else {
                str6 = null;
            }
            c2344009Gk.LJIIIIZZ("enter_from", str6);
            C21698919w3 c21698919w38 = c21699219w6.LIZ;
            if (c21698919w38 != null) {
                str8 = c21698919w38.enterMethod;
            }
            c2344009Gk.LJIIIIZZ("enter_method", str8);
            Map<String, String> map = c2344009Gk.LIZ;
            c21699219w6.LIZIZ = System.currentTimeMillis();
            C20684815ws.LJIILLIIL("show_core_fdmt_landing_page", map);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ;
        C488600JEc c488600JEcLJIILIIL = SAFExtensionKt.LJIILIIL(this);
        if (c488600JEcLJIILIIL != null) {
            viewLIZJ = SAFExtensionKt.LJJII(requireActivity(), layoutInflater.getContext(), R.layout.b6m, c488600JEcLJIILIIL);
        } else {
            viewLIZJ = C20673215v0.LIZJ(R.layout.b6m, requireActivity());
        }
        C19GS c19gs = null;
        if (!(viewLIZJ instanceof View)) {
            viewLIZJ = null;
        }
        if (viewLIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
                viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZJ;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        SAFTikTokFragment sAFTikTokFragment = this.LLJJI;
        if (sAFTikTokFragment != null) {
            return sAFTikTokFragment.onResult(i, i2, intent);
        }
        return super.onResult(i, i2, intent);
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
