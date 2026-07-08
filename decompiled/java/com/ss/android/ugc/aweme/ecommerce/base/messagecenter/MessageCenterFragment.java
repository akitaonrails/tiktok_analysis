package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.AbstractC738140SxQ;
import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C03H5;
import X.C098200Yq;
import X.C0TVI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0ZP4;
import X.C1120604Zw;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1251150ifB;
import X.C1324460kZQ;
import X.C13LE;
import X.C14K9;
import X.C1507790pL7;
import X.C1685300txQ;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1750720vew;
import X.C1751080vfW;
import X.C1756030vnV;
import X.C1756050vnX;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C20097313kJ;
import X.C20277814Wa;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C296580Bjs;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C876100YYm;
import X.C960603pE;
import X.C988803tm;
import X.EnumC1751090vfX;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1739440vMk;
import X.InterfaceC1739450vMl;
import X.InterfaceC1740480vOQ;
import X.InterfaceC1748810vbr;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.dependency.notice.NoticeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class MessageCenterFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC1740480vOQ, InterfaceC21503819Do, InterfaceC1739450vMl {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTHELIOSYpZyI2OzYtLiowLSs4LD19BSA/Oi40LQYpJzs2OgM+KCg+LSs4";
    public TuxNavBar LLIZ;
    public C1324460kZQ LLIZLLLIL;
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(148), "previous_page", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(184), "show_tablist", Boolean.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(186), "title", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(181), "show_order_center", Boolean.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(180), "show_notice", Boolean.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(179), "show_move_reminder", Boolean.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(178), "show_description", Boolean.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(149), "trackParams", String.class);
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 222));
    public final C01GW LLJJIJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(183), "show_seller_message", Boolean.class);
    public final C01GW LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(176), "hide_inbox_nav_bar", Boolean.class);
    public final C01GW LLJJIJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(174), "has_parent_page_fragment", Boolean.class);
    public final C01GW LLJJJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(175), "hide_creator_msg", Boolean.class);
    public final C01GW LLJJJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(182), "show_recommend", Boolean.class);
    public final C01GW LLJJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(187), "traffic_source", String.class);
    public final C01GW LLJJJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(188), "traffic_source_list", String.class);
    public final AssemVMLazy LLJJJJLIIL;
    public final String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageCenterFragment.class, "messageCenterViewModel", "getMessageCenterViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/messagecenter/MessageCenterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

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

    @Override // X.InterfaceC1748820vbs
    public final String getPageName() {
        return "shop_message";
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
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

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final MessageCenterViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (MessageCenterViewModel) assemVMLazy.getValue();
    }

    public final C1324460kZQ UR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.o9l) : null;
            this.LLIZLLLIL = (C1324460kZQ) viewFindViewById;
        }
        return (C1324460kZQ) viewFindViewById;
    }

    public final TuxNavBar VR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p15) : null;
            this.LLIZ = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public MessageCenterFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageCenterViewModel.class);
        this.LLJJJJLIIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS563S0100000_19(c19719912DlLIZ, 1074), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 221), AFwS268S0000000_26.get$arr$(185));
        this.LLJJL = "click_back";
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C960603pE.LIZJ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (C296580Bjs.LIZ()) {
            C876100YYm.LLJILJILJ.LJFF("list");
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        AnonymousClass0317 anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin;
        super.onResume();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin = NoticeDependencyService.createINoticeDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, INoticeDependencyService.class.getName(), anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INoticeDependencyService.class);
        }
        ((INoticeDependencyService) anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin).clearUnreadCount(210, 214, 342);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    @Override // X.InterfaceC21503819Do
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tv() {
        /*
            r10 = this;
            X.C20277814Wa.LIZIZ(r10)
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterViewModel r1 = r10.SR()
            java.lang.String r0 = "return"
            r1.LLJ = r0
            X.0pL7 r9 = X.C1507790pL7.LIZ
            r8 = 3
            kotlin.Pair[] r4 = new kotlin.Pair[r8]
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification_page"
            r2.<init>(r1, r0)
            r0 = 0
            r4[r0] = r2
            X.19EG r7 = r10.requireActivity()
            r3 = 2
            r6 = 1
            if (r7 == 0) goto Laa
            android.content.res.Resources r5 = r7.getResources()
            java.lang.String r2 = "integer"
            java.lang.String r1 = "android"
            java.lang.String r0 = "config_navBarInteractionMode"
            int r0 = X.C786410Ut5.n3(r5, r0, r2, r1)
            if (r0 <= 0) goto La8
            int r5 = r5.getInteger(r0)
        L38:
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r7)
            boolean r2 = r0.hasPermanentMenuKey()
            r0 = 4
            boolean r1 = android.view.KeyCharacterMap.deviceHasKey(r0)
            boolean r0 = android.view.KeyCharacterMap.deviceHasKey(r8)
            if (r2 != 0) goto L4f
            if (r1 == 0) goto L72
            if (r0 == 0) goto L72
        L4f:
            java.lang.String r2 = "backpress_real_icon"
        L51:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_method"
            r1.<init>(r0, r2)
            r4[r6] = r1
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "from_inbox_page"
            java.lang.String r0 = "shop"
            r2.<init>(r1, r0)
            r4[r3] = r2
            java.util.Map r1 = X.C2097608Jq.LJIIJ(r4)
            r9.getClass()
            java.lang.String r0 = "enter_homepage_message_navi"
            X.C1507790pL7.LIZJ(r0, r1)
            return
        L72:
            if (r5 >= r3) goto Laa
            android.view.Window r0 = r7.getWindow()
            android.view.View r2 = r0.getDecorView()
            if (r2 != 0) goto L9b
            r1 = 0
        L7f:
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r0)
            if (r2 != 0) goto L8e
            r2 = 0
        L89:
            if (r1 == r2) goto Laa
            java.lang.String r2 = "backpress_virtual_icon"
            goto L51
        L8e:
            int[] r0 = new int[r3]
            r2.getLocationOnScreen(r0)
            int r2 = r2.getHeight()
            r0 = r0[r6]
            int r2 = r2 + r0
            goto L89
        L9b:
            int[] r0 = new int[r3]
            r2.getLocationOnScreen(r0)
            int r1 = r2.getHeight()
            r0 = r0[r6]
            int r1 = r1 + r0
            goto L7f
        La8:
            r5 = 0
            goto L38
        Laa:
            java.lang.String r2 = "backpress_virtual_gesture"
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterFragment.tv():void");
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    @Override // X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        int i;
        MessageCenterViewModel messageCenterViewModelSR = SR();
        C1750720vew c1750720vew = (C1750720vew) messageCenterViewModelSR.vmDispatcher.getState();
        if (messageCenterViewModelSR.LLILLL.get() == 3) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = C1751080vfW.LIZIZ[c1750720vew.LL.LIZ.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                i += 4;
            }
        } else {
            i += 2;
        }
        messageCenterViewModelSR.LLJILJIL = i;
        if (c1750720vew.LL.LIZ != EnumC1751090vfX.EMPTY) {
            String strValueOf = String.valueOf(i);
            HashMap map2 = (HashMap) map;
            map2.put("content_list_size", strValueOf);
            map2.put("shop_info_cnt", String.valueOf(messageCenterViewModelSR.LLJI));
            map2.put("seller_message_cnt", String.valueOf(messageCenterViewModelSR.LLJIJIL));
            EnumC1751090vfX enumC1751090vfX = c1750720vew.LL.LIZ;
            if (enumC1751090vfX != EnumC1751090vfX.ERROR && enumC1751090vfX != EnumC1751090vfX.NETWORK_UNAVAILABLE) {
                if (messageCenterViewModelSR.LLJI + messageCenterViewModelSR.LLJIJIL <= 0) {
                    map2.put("blank_type", "no_meta_data");
                    return true;
                }
            } else {
                map2.put("blank_type", "error_status");
                return true;
            }
        }
        if (UR().getChildCount() > SR().LLJILJIL && UR().getHeight() > 0) {
            return false;
        }
        ((HashMap) map).put("blank_type", "empty_view");
        return true;
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_rd", new AwS605S0100000_26(this, 188));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string = null;
        if (C296580Bjs.LIZ()) {
            C876100YYm.LLJILJILJ.LIZLLL("list", null);
        }
        super.onCreate(bundle);
        NR(AFwS268S0000000_26.get$arr$(177));
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "notification_page"));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("enter_tiktok_shop", mapLJIIJ);
        C1756030vnV.LIZ(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("source_btm_token");
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        btmSDK.registerBtmPageOnCreate(this, "a2270.b76963", string);
        this.LLJJLIIIJLLLLLLLZ = btmSDK.getPageId(PageFinder.via((Fragment) this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/ecommerce/base/messagecenter/MessageCenterFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5K4dkOA92qwh325HrCbldlts4wI1sdCjdGtUyP+JJ+xw/er/", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1739440vMk) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1739440vMk) it2.next()).onHiddenChanged(z);
            }
        }
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        SR().LLJILJILJ = (String) this.LLJJI.getValue();
        mG(view, null);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "notification_page"));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("enter_social_interaction", mapLJIIJ);
        Object obj = ((Map) this.LLJJIII.getValue()).get("enter_from");
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        C723850SaN.LIZ(this, false, null, new AwS140S1100000_26(this, str, 11), 3);
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.0vMi
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                int i;
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                C1324460kZQ c1324460kZQUR = this.LL.UR();
                c1324460kZQUR.setPadding(c1324460kZQUR.getPaddingLeft(), c1324460kZQUR.getPaddingTop(), c1324460kZQUR.getPaddingRight(), c20244914JjLIZ.LIZLLL);
                View viewFindViewById = view.findViewById(R.id.wvs);
                if (viewFindViewById != null) {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    int i2 = layoutParams.height;
                    int i3 = c20244914JjLIZ.LIZLLL;
                    if (i2 != i3) {
                        layoutParams.height = i3;
                        C786410Ut5.W5(viewFindViewById, layoutParams);
                    }
                    if (c20244914JjLIZ.LIZLLL > 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, viewFindViewById);
                }
                return c20246014Ju;
            }
        });
        C20097313kJ.LIZJ(view);
        TuxNavBar tuxNavBarVR = VR();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 220));
        tuxNavBarVR.LIZIZ(c1251150ifB);
        if (((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue()) {
            C786410Ut5.LJLLLLLL(8, VR());
        } else {
            C786410Ut5.LJLLLLLL(0, VR());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ao3, viewGroup, false);
        if (!((Boolean) this.LLJJIJIL.getValue()).booleanValue()) {
            Context context = getContext();
            if (context != null) {
                viewTd.setPadding(0, C497820Jfg.LIZJ(context), 0, 0);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
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
