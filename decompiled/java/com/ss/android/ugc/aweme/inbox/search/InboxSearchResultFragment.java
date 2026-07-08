package com.ss.android.ugc.aweme.inbox.search;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C09R3;
import X.C1241480iPa;
import X.C1241770iQ3;
import X.C1241800iQ6;
import X.C1241900iQG;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.search.ability.InboxSearchContainerAbility;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultContainerVM;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchResultFragment extends InboxSearchResultBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZjHELIOSYpKD0wIGsFJy08MBYpKD0wIBcpOjo/PAM+KCg+LSs4";
    public ViewOnAttachStateChangeListenerC20604515jv LLILZLL;
    public C1749280vcc LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public InboxSearchTabProtocol LLJI;
    public String LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxSearchResultFragment.class, "searchResultVM", "getSearchResultVM()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchResultListVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(InboxSearchResultFragment.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchResultContainerVM;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public InboxSearchResultFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxSearchResultListVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1540);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(186);
        InterfaceC724760Sbq interfaceC724760Sbq2 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq2)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1541), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 1542), aFwS257S0000000_19, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1543), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InboxSearchResultContainerVM.class);
        AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c19719912DlLIZ2, 1544);
        AFwS257S0000000_19 aFwS257S0000000_192 = AFwS257S0000000_19.get$arr$(187);
        if (Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq2)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_192, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1545), aFwS257S0000000_192, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq2, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_192, new AwS563S0100000_19((Fragment) this, 1546), aFwS257S0000000_192, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_192, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1539), aFwS257S0000000_192, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLJ = assemVMLazy2;
        this.LLJIJIL = "";
    }

    public final ViewOnAttachStateChangeListenerC20604515jv OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kjp) : null;
            this.LLILZLL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C1749280vcc PR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kju) : null;
            this.LLIZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchResultBaseFragment
    /* JADX INFO: renamed from: RR, reason: merged with bridge method [inline-methods] */
    public final InboxSearchResultListVM MR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (InboxSearchResultListVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchResultBaseFragment, X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        super.LLLILZLLLI();
        InboxSearchTabProtocol inboxSearchTabProtocol = this.LLJI;
        if (inboxSearchTabProtocol != null) {
            inboxSearchTabProtocol.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchResultBaseFragment
    public final String getTabName() {
        InboxSearchResultFragmentData inboxSearchResultFragmentData;
        String str;
        Bundle arguments = getArguments();
        return (arguments == null || (inboxSearchResultFragmentData = (InboxSearchResultFragmentData) arguments.getParcelable("power_viewpager_default_key")) == null || (str = inboxSearchResultFragmentData.name) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InboxSearchTabProtocol inboxSearchTabProtocol = this.LLJI;
        if (inboxSearchTabProtocol != null) {
            inboxSearchTabProtocol.LLILZ = null;
        }
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchResultBaseFragment, X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        InboxSearchTabProtocol inboxSearchTabProtocol = this.LLJI;
        if (inboxSearchTabProtocol != null) {
            inboxSearchTabProtocol.LJIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchResultBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InboxSearchTabProtocol inboxSearchTabProtocol;
        boolean zLJ;
        C1241480iPa c1241480iPaKs0;
        String str;
        super.onViewCreated(view, bundle);
        InboxSearchContainerAbility inboxSearchContainerAbility = (InboxSearchContainerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), InboxSearchContainerAbility.class, null);
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        InboxSearchResultContainerVM inboxSearchResultContainerVM = (InboxSearchResultContainerVM) assemVMLazy.getValue();
        String tabName = getTabName();
        Map<String, ? extends InboxSearchTabProtocol> map = inboxSearchResultContainerVM.LL;
        if (map != null) {
            inboxSearchTabProtocol = map.get(tabName);
        } else {
            inboxSearchTabProtocol = null;
        }
        this.LLJI = inboxSearchTabProtocol;
        if (inboxSearchTabProtocol != null) {
            InboxSearchResultListVM inboxSearchResultListVMMR = MR();
            inboxSearchResultListVMMR.LL = inboxSearchTabProtocol;
            inboxSearchTabProtocol.LLILLL = new C1241800iQ6(inboxSearchResultListVMMR);
            int i = C1241900iQG.LIZ[inboxSearchTabProtocol.LJIIIZ().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            str = "";
                        } else {
                            str = "comment";
                        }
                    } else {
                        str = "mention";
                    }
                } else {
                    str = "message";
                }
            } else {
                str = "account";
            }
            this.LLJIJIL = str;
            zLJ = inboxSearchTabProtocol.LJ();
        } else {
            zLJ = false;
        }
        InboxSearchTabProtocol inboxSearchTabProtocol2 = this.LLJI;
        if (inboxSearchTabProtocol2 != null) {
            InboxSearchGenericAbility inboxSearchGenericAbility = (InboxSearchGenericAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), InboxSearchGenericAbility.class, null);
            if (inboxSearchGenericAbility != null) {
                c1241480iPaKs0 = inboxSearchGenericAbility.Ks0();
            } else {
                c1241480iPaKs0 = null;
            }
            inboxSearchTabProtocol2.LLILZ = c1241480iPaKs0;
        }
        if (zLJ) {
            this.LLILLJJLI = true;
            Context context = getContext();
            if (context != null) {
                C1241770iQ3 c1241770iQ3 = new C1241770iQ3(context);
                TuxIconView deleteIcon = c1241770iQ3.getDeleteIcon();
                if (deleteIcon != null) {
                    C786410Ut5.a9(deleteIcon, new ACListenerS154S0100000_19(this, 112));
                }
                LinearLayout container = c1241770iQ3.getContainer();
                if (container != null) {
                    C786410Ut5.R7(container, new ACListenerS122S0200000_19(this, inboxSearchContainerAbility, 18));
                }
                OR().LJ(0, c1241770iQ3);
                C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0iQ1
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1241760iQ2) obj).LLILLJJLI;
                    }
                }, null, new AwS455S0200000_19(c1241770iQ3, this, 5), 6);
            }
        } else {
            final Context context2 = getContext();
            if (context2 != null) {
                OR().LJ(0, new FrameLayout(context2) { // from class: X.0GaE
                    {
                        super(context2, null);
                        FrameLayout.inflate(context2, R.layout.a_h, this);
                    }
                });
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 181), 3);
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0iQ0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1241760iQ2) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 56), 6);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a97, viewGroup, false);
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
