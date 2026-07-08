package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment;

import X.AbstractC509530JyZ;
import X.C01C5;
import X.C01GW;
import X.C098200Yq;
import X.C0JS5;
import X.C0K70;
import X.C0KJA;
import X.C1685300txQ;
import X.C16F5;
import X.C16FZ;
import X.C16G0;
import X.C16GX;
import X.C1834150xpV;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C19R6;
import X.C2097608Jq;
import X.C21546719Ub;
import X.C2660011e;
import X.C452501pT;
import X.C495170JbP;
import X.C497390Jez;
import X.C497740JfY;
import X.C500260Jjc;
import X.C508360Jwg;
import X.C508400Jwk;
import X.C508480Jws;
import X.C508560Jx0;
import X.C508570Jx1;
import X.C508680JxC;
import X.C508910JxZ;
import X.C509550Jyb;
import X.C512750K8z;
import X.C763970Txz;
import X.C770500UKi;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC507490JvH;
import X.InterfaceC508600Jx4;
import X.InterfaceC509740Jyu;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import webcast.api.sub.GetModeratorPinInfoRequest;
import webcast.api.sub.GetModeratorPinInfoResponse;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.SubPinRequest;
import webcast.api.sub.SubPinResponse;
import webcast.api.sub.SubUnPinRequest;
import webcast.api.sub.SubUnPinResponse;
import webcast.api.sub.Tip;
import webcast.api.sub.TipAction;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionPrivilegeDetailFragment extends AbsPrivilegeDetailBaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2sqJjo9HELIOSLCQ4ICA9ZjU+IDk6JCArLD8yLyBiLz0yLygpJzt9GzAuOiwhITU4ICA9GDclPyY/LSIpDSonKSwgDz0yLygpJzs=";
    public LiveIconView LLLJIL;
    public C16G0 LLLJL;
    public C16FZ LLLL;
    public ConstraintLayout LLLLII;
    public View LLLLIIIILLL;
    public C16F5 LLLLIIL;
    public View LLLLIILL;
    public C21546719Ub LLLLIILLL;
    public LinearLayout LLLLIL;
    public InterfaceC508600Jx4 LLLLJ;
    public boolean LLLLLIL;
    public String LLLLLILLIL;
    public PrivilegeDetailViewModel LLLLLJIL;
    public C509550Jyb LLLLLL;
    public C16F5 LLLLLLIL;
    public LiveIconView LLLLLLJ;
    public C19R6 LLLLLLL;
    public C0KJA LLLLLLLLL;
    public C0KJA LLLLLLLLLL;
    public C21546719Ub LLLLLLLZIL;
    public C21546719Ub LLLLLLZ;
    public View LLLLLLZZ;
    public FrameLayout LLLLLZ;
    public boolean LLLLLZIL;
    public C16GX LLLLLZL;
    public View LLLLZI;
    public C197039127h LLLLZIL;
    public C16F5 LLLLZLL;
    public LiveIconView LLLLZLLIL;
    public C16F5 LLLLZLLLI;
    public Tip LLLZ;
    public int LLLLILI = C497740JfY.LJIILLIIL();
    public String LLLLJI = "";
    public final Map<String, Parcelable> LLLLL = new LinkedHashMap();
    public String LLLLLJLJLL = "";
    public final C01GW LLLLZ = C452501pT.LIZIZ(new C508560Jx0(this));
    public final C01GW LLLZI = C452501pT.LIZIZ(new C0JS5());

    static {
        new C508360Jwg();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment
    public final void gS() {
    }

    public final ConstraintLayout BS() {
        View viewFindViewById = this.LLLLII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ics) : null;
            this.LLLLII = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C16FZ ES() {
        View viewFindViewById = this.LLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nld) : null;
            this.LLLL = (C16FZ) viewFindViewById;
        }
        return (C16FZ) viewFindViewById;
    }

    public final PrivilegeDetailViewModel FS() {
        PrivilegeDetailViewModel privilegeDetailViewModel = this.LLLLLJIL;
        if (privilegeDetailViewModel != null) {
            return privilegeDetailViewModel;
        }
        return null;
    }

    public final String wS() {
        String string;
        EnumC507490JvH enumC507490JvH = this.LLILLL;
        if (enumC507490JvH != null && enumC507490JvH.isFullScreen()) {
            return "";
        }
        String str = this.LLJJI;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("show_entrance", this.LLILZIL);
        C508400Jwk c508400Jwk = this.LLJJIII;
        if (c508400Jwk == null || (string = Boolean.valueOf(c508400Jwk.LIZ()).toString()) == null) {
            string = "false";
        }
        pairArr[1] = new Pair("preview_mode", string);
        return C497390Jez.LIZIZ(str, "popup", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final C16G0 yS() {
        View viewFindViewById = this.LLLJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eux) : null;
            this.LLLJL = (C16G0) viewFindViewById;
        }
        return (C16G0) viewFindViewById;
    }

    public final boolean HS() {
        return C1834150xpV.LJI(getContext());
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment
    public final void RR() {
        View view;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        String secUid;
        User owner;
        LiveIconView liveIconView;
        super.RR();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (view = parentFragment.getView()) == null || (dataChannel = this.LLJJ) == null || !C01C5.LIZ(dataChannel)) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.ojl);
        this.LLLLZI = viewFindViewById;
        if (viewFindViewById != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
        View view2 = this.LLLLZI;
        this.LLLLZIL = view2 != null ? (C197039127h) view2.findViewById(R.id.qh1) : null;
        View view3 = this.LLLLZI;
        this.LLLLZLL = view3 != null ? (C16F5) view3.findViewById(R.id.qh2) : null;
        View view4 = this.LLLLZI;
        this.LLLLZLLIL = view4 != null ? (LiveIconView) view4.findViewById(R.id.ojk) : null;
        View view5 = this.LLLLZI;
        if (view5 != null && (liveIconView = (LiveIconView) view5.findViewById(R.id.e2m)) != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0Jwx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    View view7 = this.LL.LLLLZI;
                    if (view7 != null) {
                        C500260Jjc.LJIILIIL(view7);
                    }
                }
            });
        }
        PrivilegeDetailViewModel privilegeDetailViewModelFS = FS();
        if (privilegeDetailViewModelFS != null && (dataChannel2 = this.LLJJ) != null && C01C5.LIZ(dataChannel2)) {
            C2660011e c2660011e = (C2660011e) dataChannel2.gg0(C770500UKi.class);
            InterfaceC509740Jyu interfaceC509740Jyu = (InterfaceC509740Jyu) (c2660011e != null ? c2660011e.LIZ(InterfaceC509740Jyu.class) : null);
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (interfaceC509740Jyu != null) {
                GetModeratorPinInfoRequest getModeratorPinInfoRequest = new GetModeratorPinInfoRequest();
                getModeratorPinInfoRequest.roomId = room != null ? room.getId() : 0L;
                if (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                    secUid = "";
                }
                getModeratorPinInfoRequest.secAnchorId = secUid;
                C512750K8z<GetModeratorPinInfoResponse.Data> c512750K8z = new C512750K8z<>();
                c512750K8z.LIZ = new C508480Jws(privilegeDetailViewModelFS);
                c512750K8z.LIZIZ = new C508570Jx1();
                interfaceC509740Jyu.LJJIJIIJIL(getModeratorPinInfoRequest, c512750K8z);
            }
        }
        C197039127h c197039127h = this.LLLLZIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0Jyt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    boolean z;
                    DataChannel dataChannel3;
                    long id;
                    String string;
                    String strLIZ;
                    long id2;
                    TipAction tipAction;
                    TipAction tipAction2;
                    User user;
                    SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LL;
                    Tip tip = subscriptionPrivilegeDetailFragment.LLLZ;
                    if (tip == null) {
                        return;
                    }
                    TipAction tipAction3 = tip.tipAction;
                    int iLIZJ = 0;
                    if (tipAction3 != null) {
                        if (tipAction3.actionType == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        AnonymousClass0101 anonymousClass0101LIZ = null;
                        long jLIZIZ = 0;
                        if (z) {
                            String str = subscriptionPrivilegeDetailFragment.LLILZIL;
                            GetSubPrivilegeDetailResponse.Data data = subscriptionPrivilegeDetailFragment.LLILLJJLI;
                            String strLIZLLL = "";
                            if (data == null || (user = data.anchorDetail) == null || (string = Long.valueOf(user.getId()).toString()) == null) {
                                string = "";
                            }
                            Tip tip2 = this.LL.LLLZ;
                            if (tip2 == null || (tipAction2 = tip2.tipAction) == null) {
                                strLIZ = "";
                            } else {
                                strLIZ = tipAction2.LIZ();
                            }
                            Tip tip3 = this.LL.LLLZ;
                            if (tip3 != null && (tipAction = tip3.tipAction) != null) {
                                strLIZLLL = tipAction.LIZLLL();
                            }
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_page_pincard_module_click");
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LJJII("moderator", "user_type");
                            c474500IjALIZ.LJJII(strLIZ, "perk_id");
                            c474500IjALIZ.LJJII(strLIZLLL, "template_id");
                            c474500IjALIZ.LJJII(str, "show_entrance");
                            c474500IjALIZ.LJJII("privilege_intro_page", "previous_page");
                            c474500IjALIZ.LJJII(string, "anchor_id");
                            c474500IjALIZ.LIZ();
                            DataChannel dataChannel4 = this.LL.LLJJ;
                            if (dataChannel4 != null) {
                                C2660011e c2660011e2 = (C2660011e) dataChannel4.gg0(C770500UKi.class);
                                if (c2660011e2 != null) {
                                    anonymousClass0101LIZ = c2660011e2.LIZ(InterfaceC509740Jyu.class);
                                }
                                InterfaceC509740Jyu interfaceC509740Jyu2 = (InterfaceC509740Jyu) anonymousClass0101LIZ;
                                if (interfaceC509740Jyu2 != null) {
                                    SubPinRequest subPinRequest = new SubPinRequest();
                                    SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = this.LL;
                                    Room roomAS = subscriptionPrivilegeDetailFragment2.aS();
                                    if (roomAS != null) {
                                        id2 = roomAS.getId();
                                    } else {
                                        id2 = 0;
                                    }
                                    subPinRequest.roomId = id2;
                                    subPinRequest.secAnchorId = subscriptionPrivilegeDetailFragment2.LLJJI;
                                    TipAction tipAction4 = tip.tipAction;
                                    if (tipAction4 != null) {
                                        jLIZIZ = tipAction4.LIZIZ();
                                    }
                                    subPinRequest.pinId = jLIZIZ;
                                    TipAction tipAction5 = tip.tipAction;
                                    if (tipAction5 != null) {
                                        iLIZJ = tipAction5.LIZJ();
                                    }
                                    subPinRequest.type = iLIZJ;
                                    C512750K8z<SubPinResponse> c512750K8z2 = new C512750K8z<>();
                                    c512750K8z2.LIZ = new C509710Jyr(this.LL, tip);
                                    interfaceC509740Jyu2.LIZLLL(subPinRequest, c512750K8z2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (tipAction3 == null || tipAction3.actionType != 2 || (dataChannel3 = subscriptionPrivilegeDetailFragment.LLJJ) == null) {
                            return;
                        }
                        C2660011e c2660011e3 = (C2660011e) dataChannel3.gg0(C770500UKi.class);
                        if (c2660011e3 != null) {
                            anonymousClass0101LIZ = c2660011e3.LIZ(InterfaceC509740Jyu.class);
                        }
                        InterfaceC509740Jyu interfaceC509740Jyu3 = (InterfaceC509740Jyu) anonymousClass0101LIZ;
                        if (interfaceC509740Jyu3 == null) {
                            return;
                        }
                        SubUnPinRequest subUnPinRequest = new SubUnPinRequest();
                        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3 = this.LL;
                        Room roomAS2 = subscriptionPrivilegeDetailFragment3.aS();
                        if (roomAS2 != null) {
                            id = roomAS2.getId();
                        } else {
                            id = 0;
                        }
                        subUnPinRequest.roomId = id;
                        subUnPinRequest.secAnchorId = subscriptionPrivilegeDetailFragment3.LLJJI;
                        TipAction tipAction6 = tip.tipAction;
                        if (tipAction6 != null) {
                            jLIZIZ = tipAction6.LIZIZ();
                        }
                        subUnPinRequest.unpinId = jLIZIZ;
                        TipAction tipAction7 = tip.tipAction;
                        if (tipAction7 != null) {
                            iLIZJ = tipAction7.LIZJ();
                        }
                        subUnPinRequest.type = iLIZJ;
                        C512750K8z<SubUnPinResponse> c512750K8z3 = new C512750K8z<>();
                        c512750K8z3.LIZ = new C509720Jys(this.LL);
                        interfaceC509740Jyu3.LJIJJ(subUnPinRequest, c512750K8z3);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment
    public final int VR() {
        int size;
        PrivilegeDetailViewModel privilegeDetailViewModelFS = FS();
        if (privilegeDetailViewModelFS == null || (size = privilegeDetailViewModelFS.LLJJIJIIJIL.size()) < 1) {
            return 1;
        }
        return size;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment
    public final PrivilegeDetailViewModel ZR() {
        return FS();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel = (EmotePerformanceTrackerViewModel) this.LLLLZ.getValue();
        if (emotePerformanceTrackerViewModel == null || emotePerformanceTrackerViewModel.LLILLJJLI != 0) {
            EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel2 = (EmotePerformanceTrackerViewModel) this.LLLLZ.getValue();
            if (emotePerformanceTrackerViewModel2 != null) {
                emotePerformanceTrackerViewModel2.LLILLL = System.currentTimeMillis();
            }
            EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel3 = (EmotePerformanceTrackerViewModel) this.LLLLZ.getValue();
            if (emotePerformanceTrackerViewModel3 != null) {
                emotePerformanceTrackerViewModel3.xQ2();
            }
        }
        this.LLLJIL = null;
        this.LLLJL = null;
        this.LLLL = null;
        this.LLLLII = null;
        this.LLLLIIIILLL = null;
        this.LLLLIIL = null;
        this.LLLLIILL = null;
        this.LLLLIILLL = null;
        this.LLLLIL = null;
    }

    public final SubPackagePrivilege zS() {
        PrivilegeDetailViewModel privilegeDetailViewModelFS = FS();
        if (privilegeDetailViewModelFS != null) {
            return privilegeDetailViewModelFS.vQ2();
        }
        return null;
    }

    public static void uS(C21546719Ub c21546719Ub) {
        float f = 0;
        c21546719Ub.setTabPaddingStart((int) C497740JfY.LIZIZ(f));
        c21546719Ub.setTabPaddingEnd((int) C497740JfY.LIZIZ(f));
        c21546719Ub.setTabPaddingTop((int) C497740JfY.LIZIZ(f));
        c21546719Ub.setTabPaddingBottom((int) C497740JfY.LIZIZ(f));
    }

    public final void GS(C763970Txz c763970Txz) {
        View viewFindViewById;
        View view = c763970Txz.LJI;
        if (view != null && (viewFindViewById = view.findViewById(R.id.wxy)) != null) {
            C500260Jjc.LLFFF(viewFindViewById);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment
    public final void mS(AbstractC509530JyZ abstractC509530JyZ) {
        if (this.LLILLL == EnumC507490JvH.FULL_PAGE) {
            C508910JxZ.LIZIZ(abstractC509530JyZ, new C508680JxC(this));
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        final long j;
        final long j2;
        String str;
        Map<String, String> mapLL;
        User owner;
        super.onCreate(bundle);
        final String str2 = "";
        C0K70.LJFF(requireContext(), "SubscriptionPrivilegeDetailFragment", this.LLILZIL, "");
        Room roomAS = aS();
        String secUid = null;
        if (roomAS != null && (owner = roomAS.getOwner()) != null) {
            secUid = owner.getSecUid();
        }
        if (secUid == null || secUid.length() == 0) {
            secUid = this.LLJJI;
        }
        this.LLJJI = secUid;
        Room roomAS2 = aS();
        if (roomAS2 == null || (string = Long.valueOf(roomAS2.getId()).toString()) == null || string.length() == 0) {
            string = "";
        }
        this.LLLLJI = string;
        this.LLLLILI = C497740JfY.LJIILIIL(getActivity()).heightPixels - ((int) C497740JfY.LIZIZ(96.0f));
        InterfaceC508600Jx4 interfaceC508600Jx4 = this.LLLLJ;
        if (interfaceC508600Jx4 != null) {
            interfaceC508600Jx4.LJJJJZI();
        }
        C508400Jwk c508400Jwk = this.LLJJIII;
        if (c508400Jwk != null) {
            if (c508400Jwk.LIZ.length() == 0) {
                mapLL = C2097608Jq.LJ();
            } else {
                mapLL = C500260Jjc.LL(c508400Jwk.LIZ);
            }
            Set<Map.Entry<String, String>> setEntrySet = mapLL.entrySet();
            if (setEntrySet != null) {
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    this.LLJJJ.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        final String str3 = this.LLLLJI;
        final String str4 = this.LLILZIL;
        final String str5 = this.LLILZLL;
        final String str6 = this.LLJJI;
        String str7 = this.LLLLLILLIL;
        if (str7 == null) {
            C508400Jwk c508400Jwk2 = this.LLJJIII;
            if (c508400Jwk2 != null && (str = c508400Jwk2.LIZIZ) != null) {
                str2 = str;
            }
        } else {
            str2 = str7;
        }
        final String str8 = this.LLJIJIL;
        final List<C495170JbP> list = this.LLJ;
        final EnumC507490JvH enumC507490JvH = this.LLILLL;
        C508400Jwk c508400Jwk3 = this.LLJJIII;
        if (c508400Jwk3 != null) {
            j = c508400Jwk3.LIZJ;
            j2 = c508400Jwk3.LIZLLL;
        } else {
            j = 0;
            j2 = 0;
        }
        this.LLLLLJIL = (PrivilegeDetailViewModel) ViewModelProviders.of(this, new ViewModelProvider.Factory(j, j2, this, enumC507490JvH, str3, str4, str5, str6, str2, str8, list) { // from class: X.0Jet
            public final String LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final List<C495170JbP> LJFF;
            public final LifecycleOwner LJI;
            public final EnumC507490JvH LJII;
            public final long LJIIIIZZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(PrivilegeDetailViewModel.class)) {
                    String str9 = this.LIZ;
                    String str10 = this.LIZJ;
                    String str11 = this.LIZIZ;
                    return new PrivilegeDetailViewModel(this.LJIIIIZZ, this.LJI, this.LJII, str9, str10, str11, this.LJ, this.LIZLLL, this.LJFF);
                }
                throw new IllegalArgumentException("Unknown ViewModel class");
            }

            {
                this.LIZ = str3;
                this.LIZIZ = str4;
                this.LIZJ = str6;
                this.LIZLLL = str2;
                this.LJ = str8;
                this.LJFF = list;
                this.LJI = this;
                this.LJII = enumC507490JvH;
                this.LJIIIIZZ = j;
            }
        }).get(PrivilegeDetailViewModel.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0253 A[PHI: r0
      0x0253: PHI (r0v63 android.view.View) = (r0v62 android.view.View), (r0v131 android.view.View) binds: [B:62:0x0240, B:67:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gb8, viewGroup, false);
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
