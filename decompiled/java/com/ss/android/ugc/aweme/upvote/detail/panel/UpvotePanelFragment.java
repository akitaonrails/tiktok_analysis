package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.AbstractC343940De4;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0HU6;
import X.C0HV5;
import X.C0R52;
import X.C0RSD;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1342130l1v;
import X.C1355260lN6;
import X.C1356810lPb;
import X.C1358690lSd;
import X.C1358720lSg;
import X.C1358770lSl;
import X.C1358950lT3;
import X.C1359060lTE;
import X.C1359600lU6;
import X.C1359670lUD;
import X.C1359820lUS;
import X.C1359870lUX;
import X.C1359970lUh;
import X.C1360460lVU;
import X.C1360890lWB;
import X.C1365840leA;
import X.C1365870leD;
import X.C1391190mJ3;
import X.C13LE;
import X.C1402210map;
import X.C1402270mav;
import X.C1479605qk;
import X.C14EU;
import X.C1558360qeg;
import X.C1576740r8K;
import X.C1587150rP7;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19746312Np;
import X.C19746412Nq;
import X.C19EG;
import X.C19GS;
import X.C21146717pB;
import X.C21647019ng;
import X.C2217381BqS;
import X.C298440Bms;
import X.C298760BnO;
import X.C338490DOt;
import X.C338520DOw;
import X.C343970De7;
import X.C418440Gaw;
import X.C426750GoL;
import X.C441580HTg;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C690440R6k;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C888460YtI;
import X.C987103tV;
import X.EnumC19746112Nn;
import X.InterfaceC0148002o;
import X.InterfaceC1359760lUM;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21641019mi;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.zhiliaoapp.musically.R;
import defpackage.RepostFeedEntranceVM;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvotePanelFragment extends BaseFragment implements InterfaceC724530SbT, RepostPanelFragmentAbility, InterfaceC1359760lUM {
    public static final C1359870lUX LLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjA8PyAnLWsoHELIOSLDsyISliOS49LSliHD8lJzEpGS49LSkKOy40JSAiPQ==";
    public ConstraintLayout LLIZ;
    public LinearLayout LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public View LLJI;
    public LinearLayout LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 890));
    public final AssemVMLazy LLJILJILJ;
    public final C736950SvV LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public C1402270mav LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public Aweme LLJJJJ;
    public VideoItemParams LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public List<String> LLJJLIIIJLLLLLLLZ;
    public TuxNavBar LLJL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public int LLJLLIL;
    public C0R52 LLJLLL;
    public String LLJZ;
    public Long LLJZIJLIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0lUX] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UpvotePanelFragment.class, "panelVm", "getPanelVm()Lcom/ss/android/ugc/aweme/upvote/detail/panel/RepostPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(UpvotePanelFragment.class, "affinityVM", "getAffinityVM()Lcom/ss/android/ugc/aweme/upvote/detail/panel/RepostAffinityViewModel;", 0), new C2217381BqS(UpvotePanelFragment.class, "repostFeedEntranceVM", "getRepostFeedEntranceVM()LRepostFeedEntranceVM;", 0)};
        LLL = new Object() { // from class: X.0lUX
        };
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

    public UpvotePanelFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostPanelViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 898);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(242);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 899), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new AwS565S0100000_21((Fragment) this, 900), aFwS259S0000000_21, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 901), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJILJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(UpvotePublishVM.class);
        AFwS259S0000000_21 aFwS259S0000000_212 = AFwS259S0000000_21.get$arr$(240);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, z);
        C451620HnM c451620HnM = new C451620HnM(this, z2);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJILLL = new C736950SvV(c19719912DlLIZ2, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS259S0000000_212, c451460Hn6, c451620HnM, c338520DOw);
        this.LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 891));
        this.LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 889));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(RepostAffinityViewModel.class);
        AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(c19719912DlLIZ3, 902);
        AFwS259S0000000_21 aFwS259S0000000_213 = AFwS259S0000000_21.get$arr$(243);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS565S0100000_212, c452070Ho5, new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 903), aFwS259S0000000_213, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = false;
            z4 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            z3 = false;
            z4 = true;
            C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS565S0100000_212, new AwS565S0100000_21((Fragment) this, 888), aFwS259S0000000_213, null, null, null);
        } else {
            z3 = false;
            z4 = true;
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            c452070Ho5 = c452070Ho5;
            new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS565S0100000_212, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 893), aFwS259S0000000_213, new C451460Hn6(this, z), new C451620HnM(this, false), new C987103tV(this, false));
        }
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(RepostFeedEntranceVM.class);
        AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21(c19719912DlLIZ4, 894);
        AFwS259S0000000_21 aFwS259S0000000_214 = AFwS259S0000000_21.get$arr$(241);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS565S0100000_213, c452070Ho5, new C1622206Wu(this, z4), new C338490DOt(this, z4), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 895), aFwS259S0000000_214, new C451460Hn6(this, z4), new C451620HnM(this, z4), new C987103tV(this, z4));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS565S0100000_213, new AwS565S0100000_21((Fragment) this, 896), aFwS259S0000000_214, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS565S0100000_213, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 897), aFwS259S0000000_214, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
        }
        this.LLJJIJI = assemVMLazy2;
        this.LLJLLIL = -1;
    }

    public final boolean SR() {
        UpvoteList upvoteListUR;
        return ((!this.LLJJIJIL && !this.LLJJJ) || (upvoteListUR = UR()) == null || C1359820lUS.LIZJ(upvoteListUR)) ? false : true;
    }

    public final RepostPanelViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (RepostPanelViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1359760lUM
    public final void WF() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    public final RepostFeedEntranceVM WR() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (RepostFeedEntranceVM) assemVMLazy.getValue();
    }

    public final LinearLayout ZR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y_b) : null;
            this.LLJIJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final UpvotePanelListViewModel aS() {
        return (UpvotePanelListViewModel) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1359760lUM
    public final int R8() {
        LinearLayout linearLayoutZR = ZR();
        if (linearLayoutZR != null) {
            return linearLayoutZR.getHeight();
        }
        return 0;
    }

    public final UpvoteList UR() {
        MutableLiveData<UpvoteList> mutableLiveDataWQ2;
        if (C1358690lSd.LIZ()) {
            return VR().LL;
        }
        UpvotePanelListViewModel upvotePanelListViewModelAS = aS();
        if (upvotePanelListViewModelAS == null || (mutableLiveDataWQ2 = upvotePanelListViewModelAS.wQ2()) == null) {
            return null;
        }
        return mutableLiveDataWQ2.getValue();
    }

    public final boolean cS() {
        if (!C298760BnO.LIZ()) {
            return ((Number) C1359060lTE.LIZ.getValue()).intValue() == 1 && !C1360460lVU.LIZIZ.LJIJJLI(this.LLJJJJ) && C1359600lU6.LIZ();
        }
        if (((Number) C1359060lTE.LIZ.getValue()).intValue() != 1 || C1360460lVU.LIZIZ.LJIJJLI(this.LLJJJJ)) {
            return false;
        }
        C1359670lUD.LIZ.getClass();
        return !C1359670lUD.LIZJ();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String aid;
        HomeTabAbility homeTabAbility;
        String aid2;
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        if (C1358690lSd.LIZ()) {
            RepostPanelViewModel repostPanelViewModelVR = VR();
            Aweme aweme = this.LLJJJJ;
            if (aweme != null && (aid2 = aweme.getAid()) != null) {
                C1358950lT3.LIZ.getClass();
                C1358950lT3.LJIIJJI(aid2, repostPanelViewModelVR);
            }
            ((LinkedHashMap) repostPanelViewModelVR.LLIZ).clear();
            ((LinkedHashMap) repostPanelViewModelVR.LLILZLL).clear();
            ((LinkedHashMap) repostPanelViewModelVR.LLIZLLLIL).clear();
        } else {
            UpvotePanelListViewModel upvotePanelListViewModelAS = aS();
            if (upvotePanelListViewModelAS != null) {
                Aweme aweme2 = this.LLJJJJ;
                if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                    C1358950lT3.LIZ.getClass();
                    C1358950lT3.LJIIJJI(aid, upvotePanelListViewModelAS);
                }
                ((LinkedHashMap) upvotePanelListViewModelAS.LLJJ).clear();
                ((LinkedHashMap) upvotePanelListViewModelAS.LLJILLL).clear();
                ((LinkedHashMap) upvotePanelListViewModelAS.LLJJI).clear();
            }
        }
        C1402270mav c1402270mav = this.LLJJIII;
        if (c1402270mav != null && (homeTabAbility = (HomeTabAbility) this.LLJJ.getValue()) != null) {
            homeTabAbility.Ik0(c1402270mav);
        }
        if (C1355260lN6.LIZ()) {
            C1358720lSg.LIZ.getClass();
            Map mapLIZJ = C1358720lSg.LIZJ().LIZJ();
            ArrayList arrayList = new ArrayList(mapLIZJ.size());
            Iterator it2 = mapLIZJ.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(((Map.Entry) it2.next()).getKey());
            }
            C1358720lSg.LIZIZ().storeString(C1358720lSg.LIZ("repost_quick_heart_click"), GsonProtectorUtils.toJson((Gson) C1358720lSg.LIZJ.getValue(), arrayList));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            c1576740r8KLIZ.LIZJ(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            c1576740r8KLIZ.LIZJ(true);
        }
    }

    @Override // X.InterfaceC1359760lUM
    public final void QG(Editable editable) {
        View view;
        int height;
        int i;
        IPanelButtonAbility iPanelButtonAbility;
        if (!isAdded()) {
            return;
        }
        if (C1359970lUh.LIZIZ() && editable != null && (iPanelButtonAbility = (IPanelButtonAbility) this.LLJJI.getValue()) != null) {
            iPanelButtonAbility.dh(editable);
        }
        if (this.LLJJIJIIJIL != 0 && (view = getView()) != null && (height = view.getHeight()) != (i = this.LLJJIJIIJIL)) {
            C21647019ng c21647019ng = new C21647019ng(requireContext(), new View(getContext()), new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(631.65f), new C1342130l1v(50.27f)), Collections.singletonList(new C19746412Nq("height_collapse_anim", new C0HV5(height, i)))), false);
            c21647019ng.LIZJ("height_collapse_anim", new C1402210map(this, 6));
            UpvotePanelListViewModel upvotePanelListViewModelAS = aS();
            if (upvotePanelListViewModelAS != null) {
                ((LiveData) upvotePanelListViewModelAS.LLILZLL.getValue()).postValue(Boolean.FALSE);
            }
            c21647019ng.LJI(true);
        }
    }

    public final void bS(UpvoteList upvoteList) {
        String str;
        List<UpvoteStruct> list;
        String quantityString;
        if (upvoteList != null && (list = upvoteList.upvotes) != null) {
            int size = list.size();
            if (size == 0) {
                String str2 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(this, C343970De7.LIZ);
            }
            if (!cS()) {
                long j = size;
                if (j < 0) {
                    j = 0;
                }
                String str3 = new DecimalFormat(",###", new DecimalFormatSymbols(Locale.getDefault())).format(j);
                if (C0RSD.LIZ()) {
                    quantityString = getResources().getString(2131834319);
                } else {
                    quantityString = getResources().getQuantityString(2131755664, size, str3);
                }
                TuxNavBar tuxNavBar = this.LLJL;
                if (tuxNavBar != null) {
                    C1250250idj c1250250idj = new C1250250idj();
                    c1250250idj.LIZJ = quantityString;
                    tuxNavBar.LJIJJ(c1250250idj);
                }
            }
            if (this.LLJLLIL == -1) {
                this.LLJLLIL = size;
            }
            if (this.LLJLLIL != size) {
                this.LLJLLIL = size;
            }
        }
        C1587150rP7 c1587150rP7 = C1587150rP7.LIZIZ;
        VideoItemParams videoItemParams = this.LLJJJJJIL;
        String str4 = null;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        if (c1587150rP7.LJIILIIL(str, this.LLJZ)) {
            WR().LL = C1558360qeg.LJFF(this, null);
            WR().LLILLL = this.LLJJJJ;
            RepostFeedEntranceVM repostFeedEntranceVMWR = WR();
            VideoItemParams videoItemParams2 = this.LLJJJJJIL;
            if (videoItemParams2 != null) {
                str4 = videoItemParams2.mEventType;
            }
            repostFeedEntranceVMWR.LLILLJJLI = str4;
            WR().LLILZ = this.LLJZ;
        }
    }

    @C14EU
    public final void onBlockUserSuccessEvent(C1479605qk c1479605qk) {
        UpvoteList upvoteListLIZIZ;
        RepostPanelViewModel repostPanelViewModelVR = VR();
        UpvoteList upvoteList = repostPanelViewModelVR.LL;
        if (upvoteList != null) {
            C1358770lSl c1358770lSl = C1358770lSl.LIZ;
            String str = c1479605qk.LIZ;
            if (str == null) {
                str = "";
            }
            c1358770lSl.getClass();
            upvoteListLIZIZ = C1358770lSl.LIZIZ(upvoteList, str);
        } else {
            upvoteListLIZIZ = null;
        }
        repostPanelViewModelVR.LL = upvoteListLIZIZ;
        repostPanelViewModelVR.vQ2(upvoteListLIZIZ, false);
    }

    @C14EU
    public final void onEvent(C1365870leD c1365870leD) {
        BottomToastVM bottomToastVM;
        int i;
        int iLIZIZ;
        int iLIZIZ2;
        Window window;
        View decorView;
        if (TextUtils.equals("repost", c1365870leD.LIZLLL)) {
            C0R52 c0r52 = this.LLJLLL;
            if (c0r52 != null && (bottomToastVM = c0r52.LIZ) != null) {
                C19EG activity = getActivity();
                boolean z = false;
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    Rect rect = new Rect();
                    decorView.getGlobalVisibleRect(rect);
                    int i2 = rect.bottom;
                    decorView.findViewById(android.R.id.content).getGlobalVisibleRect(rect);
                    i = i2 - rect.bottom;
                } else {
                    i = 0;
                }
                UpvoteList upvoteListUR = UR();
                if (upvoteListUR != null && C1359820lUS.LIZJ(upvoteListUR)) {
                    z = true;
                }
                if (z) {
                    iLIZIZ = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
                } else {
                    iLIZIZ = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
                }
                int i3 = iLIZIZ - iLIZIZ2;
                C1360890lWB c1360890lWB = bottomToastVM.LLILLJJLI;
                if (c1360890lWB != null) {
                    c1360890lWB.LJII = Integer.valueOf(i3);
                }
            }
            C1365840leA.LJ(c1365870leD, this.LLJLLL, this.LLJJJJ, 0L);
        }
    }

    @C14EU
    public final void onUserBlocked(C888460YtI c888460YtI) {
        UpvoteList upvoteListLIZIZ;
        String uid;
        RepostPanelViewModel repostPanelViewModelVR = VR();
        UpvoteList upvoteList = repostPanelViewModelVR.LL;
        if (upvoteList != null) {
            C1358770lSl c1358770lSl = C1358770lSl.LIZ;
            User user = c888460YtI.LIZ;
            if (user == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            c1358770lSl.getClass();
            upvoteListLIZIZ = C1358770lSl.LIZIZ(upvoteList, uid);
        } else {
            upvoteListLIZIZ = null;
        }
        repostPanelViewModelVR.LL = upvoteListLIZIZ;
        repostPanelViewModelVR.vQ2(upvoteListLIZIZ, false);
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.panel.RepostPanelFragmentAbility
    public final void uz2(AbstractC343940De4 abstractC343940De4) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, abstractC343940De4);
    }

    @C14EU
    public final void onEvent(C1356810lPb c1356810lPb) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // X.InterfaceC1359760lUM
    public final void OH(int i, boolean z) {
        int height;
        int iLIZ;
        final int height2;
        if (!isAdded()) {
            return;
        }
        LinearLayout linearLayoutZR = ZR();
        if (linearLayoutZR != null) {
            height = linearLayoutZR.getHeight();
        } else {
            height = 0;
        }
        int iLIZIZ = height + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)) + i;
        Context context = getContext();
        if (context != null) {
            iLIZ = (int) (((double) C497820Jfg.LIZ(context)) + 0.9d);
        } else {
            iLIZ = iLIZIZ;
        }
        int iMin = Math.min(iLIZ, iLIZIZ);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
        }
        View view = getView();
        if (view != null) {
            height2 = view.getHeight();
        } else {
            height2 = this.LLJJIJIIJIL;
        }
        if (Math.abs(height2 - iMin) >= 10) {
            if (z) {
                C21647019ng c21647019ng = new C21647019ng(requireContext(), new View(getContext()), new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(35.9f)), Collections.singletonList(new C19746412Nq("height_expand_anim", new C0HV5(height2, iMin)))), false);
                c21647019ng.LIZJ("height_expand_anim", new InterfaceC21641019mi() { // from class: X.0lUT
                    @Override // X.InterfaceC21641019mi
                    public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    }

                    @Override // X.InterfaceC21641019mi
                    public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                        float value = interfaceC1844880y6o.getValue();
                        View view2 = this.LIZ.getView();
                        if (view2 != null) {
                            C441580HTg.LIZ((int) value, view2);
                        }
                        FrameLayout frameLayout = this.LIZ.LLJLL;
                        if (frameLayout != null) {
                            C426750GoL.LJIIIZ(frameLayout, null, null, null, Integer.valueOf((int) (value - height2)), false, 23);
                        }
                    }
                });
                UpvotePanelListViewModel upvotePanelListViewModelAS = aS();
                if (upvotePanelListViewModelAS != null) {
                    ((LiveData) upvotePanelListViewModelAS.LLILZLL.getValue()).postValue(Boolean.TRUE);
                }
                c21647019ng.LJI(true);
                return;
            }
            View view2 = getView();
            if (view2 != null) {
                C441580HTg.LIZ(iMin, view2);
            }
            FrameLayout frameLayout = this.LLJLL;
            if (frameLayout == null) {
                return;
            }
            C426750GoL.LJIIIZ(frameLayout, null, null, null, Integer.valueOf(iMin - height2), false, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02df  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        boolean zLJI = MethodIDManager.LJI(202420);
        if (C298440Bms.LIZ()) {
            viewTd = C21146717pB.LIZIZ(requireContext(), R.layout.i6c, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.i6c, viewGroup, false);
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
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
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
