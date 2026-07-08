package com.ss.android.ugc.aweme.tag;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C09S2;
import X.C0CQT;
import X.C0XQ7;
import X.C11S5;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C737520SwQ;
import X.C737530SwR;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC20510315Nl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2661011f;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.ACListenerS146S0100000_11;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.ss.android.ugc.aweme.tag.viewmodel.SocialVideoTagShareVM;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS31S2100000_2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedTaggedListFragment extends BaseFragment {
    public static final C737530SwR LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSEtLmEVLSAoHS40LyAoBSYgPAM+KCg+LSs4";
    public TuxIconView LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public ArrayList<User> LLJI;
    public Aweme LLJIJIL;
    public Function0<Unit> LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0SwR] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedTaggedListFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tag/viewmodel/FeedTaggedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJILJ = new Object() { // from class: X.0SwR
        };
    }

    public FeedTaggedListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedTaggedListViewModel.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ, 937);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(482);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS555S0100000_11, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 938), aFwS243S0000000_11, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS555S0100000_11, new AwS555S0100000_11((Fragment) this, 939), aFwS243S0000000_11, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS555S0100000_11, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 940), aFwS243S0000000_11, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 941));
        this.LLJILJIL = AFwS198S0000000_11.get$arr$(215);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        if (((FeedTaggedListViewModel) assemVMLazy.getValue()).LLILLL) {
            ((FeedTaggedListViewModel) this.LLIZLLLIL.getValue()).LLILLL = false;
            final SocialVideoTagShareVM socialVideoTagShareVM = (SocialVideoTagShareVM) this.LLJ.getValue();
            final Aweme aweme = this.LLJIJIL;
            socialVideoTagShareVM.getClass();
            if (aweme != null) {
                final String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                InterfaceC20510315Nl.LIZ.getClass();
                InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C0CQT.LIZJ);
                Object objCreate = interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(InterfaceC20510315Nl.class) : null;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(curUserId);
                sbLIZ.append(']');
                ((InterfaceC20510315Nl) objCreate).LJIIIZ("", C2188811AlT.LIZIZ(sbLIZ), CastLongProtector.parseLong(aweme.getAid())).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0SEz
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        ArrayList arrayList;
                        List<InteractionTagUserInfo> list;
                        C1C7U.LIZ("SocialVideoTagShareVM@b22e.updateTag$1$1");
                        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
                        if (interactionTagInfo != null && (list = interactionTagInfo.taggedUsers) != null) {
                            String str = curUserId;
                            ArrayList arrayList2 = new ArrayList();
                            for (InteractionTagUserInfo interactionTagUserInfo : list) {
                                if (!TextUtils.equals(str, interactionTagUserInfo.uid)) {
                                    arrayList2.add(interactionTagUserInfo);
                                }
                            }
                            arrayList = new ArrayList(arrayList2);
                        } else {
                            arrayList = new ArrayList();
                        }
                        InteractionTagInfo interactionTagInfo2 = aweme.getInteractionTagInfo();
                        if (interactionTagInfo2 != null) {
                            interactionTagInfo2.setTaggedUsers(arrayList);
                        }
                        socialVideoTagShareVM.LL.postValue(aweme);
                        C1C7U.LIZIZ("SocialVideoTagShareVM@b22e.updateTag$1$1");
                    }
                }, new C09JN() { // from class: X.00PI
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("SocialVideoTagShareVM@b22e.updateTag$1$2");
                        C1C7U.LIZIZ("SocialVideoTagShareVM@b22e.updateTag$1$2");
                    }
                });
            }
        }
        super.onDestroyView();
        this.LLIZ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS243S0000000_11.get$arr$(481));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        Serializable serializable2;
        String string;
        String string2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        View viewFindViewById = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("tagged_users");
        } else {
            serializable = null;
        }
        this.LLJI = (ArrayList) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("aweme");
        } else {
            serializable2 = null;
        }
        this.LLJIJIL = (Aweme) serializable2;
        Bundle arguments3 = getArguments();
        String str = "";
        if (arguments3 == null || (string = arguments3.getString("enter_from")) == null) {
            string = "";
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string2 = arguments4.getString("anchor_type")) != null) {
            str = string2;
        }
        C723850SaN.LIZ(this, false, null, new AwS31S2100000_2(this, string, str, 2), 3);
        View view2 = this.LLIZ;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.e1p);
            }
            this.LLIZ = (TuxIconView) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) view2, new ACListenerS146S0100000_11(this, 35));
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        try {
            C737520SwQ.LIZ("show_in_this_video_bottom_sheet", new AwS590S0100000_11((FeedTaggedListViewModel) assemVMLazy.getValue(), 587));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dli, viewGroup, false);
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
