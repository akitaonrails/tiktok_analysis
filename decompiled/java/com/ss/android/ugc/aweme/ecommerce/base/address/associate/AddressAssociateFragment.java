package com.ss.android.ugc.aweme.ecommerce.base.address.associate;

import X.AbstractC1252750ihl;
import X.AnonymousClass0388;
import X.C004I;
import X.C01GW;
import X.C03DZ;
import X.C098200Yq;
import X.C0HTI;
import X.C0I7D;
import X.C0OM1;
import X.C0WZX;
import X.C1019103yf;
import X.C10515049h;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1427310nFJ;
import X.C1602160rnK;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1741890vQh;
import X.C1745180vW0;
import X.C1745480vWU;
import X.C1746760vYY;
import X.C1746770vYZ;
import X.C1746780vYa;
import X.C1746800vYc;
import X.C1746840vYg;
import X.C1746960vYs;
import X.C1747440vZe;
import X.C1747460vZg;
import X.C1748720vbi;
import X.C1749260vca;
import X.C1749280vcc;
import X.C1765020w20;
import X.C1766560w4U;
import X.C1775970wJf;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19FO;
import X.C19GS;
import X.C20642515q3;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C814420VxA;
import X.C992303uL;
import X.EnumC1014603xw;
import X.EnumC1070180dxI;
import X.EnumC1740810vOx;
import X.EnumC1746970vYt;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1740760vOs;
import X.InterfaceC21506019Ek;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775950wJd;
import Y.ACListenerS128S0200000_26;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS13S1200000_8;
import Y.ARunnableS95S0200000_26;
import Y.AsS8S0101000_26;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateState;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.LocationUseBar;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import g1c.AjS12S0000000_26;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressAssociateFragment extends ECBaseFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.Factory>, InterfaceC1740760vOs {
    public static AddressAssociateFragment LLJJLIIIJLLLLLLLZ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZy43HELIOSLDcpOjx9KTY/Jiw6KTEpZw43LDcpOjwSOzYjKiYyPCAKOy40JSAiPQ==";
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 157));
    public final lifecycleAwareLazy LLILZ;
    public C1746760vYY LLILZIL;
    public RecyclerView LLILZLL;
    public TuxNavBar LLIZ;
    public C1749260vca LLIZLLLIL;
    public TuxTextView LLJ;
    public KeyBoardVisibilityUtil LLJI;
    public C1749280vcc LLJIJIL;
    public C0I7D LLJILJIL;
    public ViewGroup LLJILJILJ;
    public AnonymousClass0388 LLJILLL;
    public boolean LLJJ;
    public ViewTreeObserverOnGlobalLayoutListenerC1775950wJd LLJJI;
    public boolean LLJJIII;
    public Function0<Unit> LLJJIJI;
    public AddressPageStarter.AddressAssociateEnterParams LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public long LLJJJIL;
    public boolean LLJJJJ;
    public final BPEAHandler LLJJJJJIL;
    public final C1746770vYZ LLJJJJLIIL;
    public C1746800vYc LLJJL;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0vYZ] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0vYc] */
    public AddressAssociateFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressAssociateViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 156);
        this.LLILZ = new lifecycleAwareLazy(this, awS570S0100000_26, new AwS154S0400000_26(this, awS570S0100000_26, c19719912DlLIZ, AFwS313S0000000_26.get$arr$(1), 1));
        this.LLJJ = true;
        this.LLJJIJIL = true;
        this.LLJJJJJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJJJLIIL = new InterfaceC21506019Ek() { // from class: X.0vYZ
            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeCancelled() {
            }

            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
            }

            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeProgressed(C1776540wKa c1776540wKa) {
            }

            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
            }

            @Override // X.InterfaceC21506019Ek
            public final void onBackStackChanged() {
                Integer numValueOf;
                InterfaceC988103tf interfaceC988103tfLJJLI;
                AddressAssociateFragment addressAssociateFragment = this.LL;
                addressAssociateFragment.getClass();
                try {
                    FragmentManager fragmentManagerWR = addressAssociateFragment.WR();
                    if (fragmentManagerWR == null || (numValueOf = Integer.valueOf(fragmentManagerWR.LJJLIIIIJ())) == null) {
                        return;
                    }
                    numValueOf.intValue();
                    if (numValueOf.intValue() >= 1) {
                        FragmentManager fragmentManagerWR2 = addressAssociateFragment.WR();
                        if (!Intrinsics.LJFF((fragmentManagerWR2 == null || (interfaceC988103tfLJJLI = fragmentManagerWR2.LJJLI(numValueOf.intValue() - 1)) == null) ? null : interfaceC988103tfLJJLI.getName(), "address_associate_fragment")) {
                            return;
                        }
                    }
                    this.LL.ZR().LLJILLL = null;
                    this.LL.ZR().LLJIJIL = System.currentTimeMillis();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1019103yf.LIZ(EnumC1014603xw.ERR20006, th, null);
                }
            }
        };
        this.LLJJL = new C1747460vZg() { // from class: X.0vYc
            @Override // X.C1747460vZg, X.InterfaceC1747220vZI
            public final void LIZ(Address address) {
                AddressAssociateViewModel addressAssociateViewModelZR = this.LIZ.ZR();
                addressAssociateViewModelZR.LLJ = address;
                addressAssociateViewModelZR.setState(new AwS605S0100000_26(address, 643));
                FragmentManager fragmentManagerWR = this.LIZ.WR();
                if (C07EQ.LIZ()) {
                    if (fragmentManagerWR != null) {
                        AddressAssociateFragment addressAssociateFragment = this.LIZ;
                        if (!fragmentManagerWR.LJLJJI()) {
                            fragmentManagerWR.LJLLJ(0, "address_associate_fragment");
                            return;
                        } else {
                            C786410Ut5.LJJZZIII(addressAssociateFragment.LLJJJJJIL, new ARunnableS95S0200000_26(fragmentManagerWR, fragmentManagerWR, 7));
                            return;
                        }
                    }
                    return;
                }
                if (fragmentManagerWR == null) {
                    return;
                }
                fragmentManagerWR.LJLLJ(0, "address_associate_fragment");
            }
        };
    }

    public final FragmentManager WR() {
        FragmentManager parentFragmentManager = null;
        try {
            if (isAdded() && !isDetached()) {
                parentFragmentManager = getParentFragmentManager();
                return parentFragmentManager;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR20009, e, null);
        }
        return parentFragmentManager;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final void VR() {
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams;
        RecyclerView recyclerView;
        Integer num;
        Integer num2;
        Editable editableLLLLJI;
        Editable editableLLLLJI2;
        AnonymousClass0388 anonymousClass0388;
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams2 = this.LLJJIJIIJIL;
        if ((addressAssociateEnterParams2 != null ? addressAssociateEnterParams2.locationUseBar : null) == null || C1745180vW0.LJFF()) {
            AnonymousClass0388 anonymousClass03882 = this.LLJILLL;
            if (anonymousClass03882 != null) {
                int visibility = anonymousClass03882.getVisibility();
                anonymousClass03882.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, anonymousClass03882);
            }
        } else {
            C0I7D c0i7d = this.LLJILJIL;
            if (c0i7d == null || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsGa2Pg4OQ5RODt+TbAv7M4T3tP1JDuI25fMsKL9ZcjPEJtw==", null))) == null || editableLLLLJI.length() == 0) {
                AnonymousClass0388 anonymousClass03883 = this.LLJILLL;
                if (anonymousClass03883 != null) {
                    int visibility2 = anonymousClass03883.getVisibility();
                    anonymousClass03883.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, anonymousClass03883);
                }
                if (this.LLJJ) {
                    C1746780vYa c1746780vYa = ZR().LLJILJILJ;
                    HashMap<String, Object> map = ZR().LLJILJIL;
                    c1746780vYa.getClass();
                    AddressAssociateFragment addressAssociateFragment = LLJJLIIIJLLLLLLLZ;
                    if (addressAssociateFragment != null) {
                        C1748720vbi.LIZIZ(addressAssociateFragment, new C10515049h(), new AwS140S1100000_26(map, 47));
                    }
                    this.LLJJ = false;
                }
            } else {
                C0I7D c0i7d2 = this.LLJILJIL;
                if (c0i7d2 != null && (editableLLLLJI2 = C2204961BRm.LLLLJI(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsGa2Pg4OQ5RODt+TbAv7M4T3tP1JDuI25fMsKL9ZcjPEJtw==", null))) != null && editableLLLLJI2.length() > 3 && (anonymousClass0388 = this.LLJILLL) != null) {
                    int visibility3 = anonymousClass0388.getVisibility();
                    anonymousClass0388.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility3, 8, anonymousClass0388);
                }
            }
        }
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams3 = this.LLJJIJIIJIL;
        if ((addressAssociateEnterParams3 != null && (num2 = addressAssociateEnterParams3.sourcePage) != null && num2.intValue() == 2) || ((addressAssociateEnterParams = this.LLJJIJIIJIL) != null && (num = addressAssociateEnterParams.sourcePage) != null && num.intValue() == 1)) {
            TuxTextView tuxTextView = this.LLJ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return;
            }
            return;
        }
        AnonymousClass0388 anonymousClass03884 = this.LLJILLL;
        if (anonymousClass03884 == null || anonymousClass03884.getVisibility() != 0 || ((recyclerView = this.LLILZLL) != null && recyclerView.getVisibility() == 0)) {
            TuxTextView tuxTextView2 = this.LLJ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LLJ;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
    }

    public final AddressAssociateViewModel ZR() {
        return (AddressAssociateViewModel) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.ADDRESS_ASSOCIATE_PAGE.getPageCode();
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return (ViewModelProvider.Factory) this.LLILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        super.onDestroyView();
        withState(ZR(), new AwS605S0100000_26(this, 140));
        C1746840vYg c1746840vYgLIZ = C1747440vZe.LIZ();
        C1746800vYc c1746800vYc = this.LLJJL;
        if (c1746800vYc != null) {
            ((ArrayList) c1746840vYgLIZ.LIZ).remove(c1746800vYc);
        } else {
            c1746840vYgLIZ.getClass();
        }
        this.LLJJL = null;
        FragmentManager fragmentManagerWR = WR();
        if (fragmentManagerWR != null) {
            fragmentManagerWR.LLD(this.LLJJJJLIIL);
        }
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLJI;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LLJJJJJIL.removeCallbacksAndMessages(null);
        View view = getView();
        if (view != null && (rootView = view.getRootView()) != null && (viewTreeObserver = rootView.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1775950wJd viewTreeObserverOnGlobalLayoutListenerC1775950wJd = this.LLJJI;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775950wJd);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775950wJd, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLJJI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams;
        Address address;
        List<AddressItem> list;
        AddressItem next;
        String str;
        C0I7D c0i7d;
        Integer num;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(AddressAssociateFragment.class.getName());
        }
        super.onResume();
        ZR().LLJIJIL = System.currentTimeMillis();
        if (this.LLJJIJIL) {
            AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams2 = this.LLJJIJIIJIL;
            if ((addressAssociateEnterParams2 == null || (num = addressAssociateEnterParams2.sourcePage) == null || num.intValue() != 2) && (addressAssociateEnterParams = this.LLJJIJIIJIL) != null && (address = addressAssociateEnterParams.address) != null && (list = address.items) != null) {
                Iterator<AddressItem> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.key, "address")) {
                            break;
                        }
                    }
                }
                AddressItem addressItem = next;
                if (addressItem != null && (str = addressItem.value) != null && (c0i7d = this.LLJILJIL) != null) {
                    HandlerHook.viewPost(c0i7d, new ARunnableS13S1200000_8(c0i7d, str, this, 3));
                }
            }
            withState(ZR(), new AwS605S0100000_26(this, 141));
            this.LLJJIJIL = false;
        }
        VR();
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public final void bS(EnumC1746970vYt enumC1746970vYt) {
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams;
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams2;
        Integer num;
        Integer num2;
        Context context;
        int i = C1746960vYs.LIZ[enumC1746970vYt.ordinal()];
        int i2 = 8;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && (context = getContext()) != null) {
                        C1749280vcc c1749280vcc = this.LLJIJIL;
                        if (c1749280vcc != null) {
                            C1722300uv6 c1722300uv6 = new C1722300uv6();
                            C0HTI c0hti = new C0HTI();
                            c0hti.LIZ = R.drawable.nj;
                            Drawable drawableLIZ = c0hti.LIZ(context);
                            c1722300uv6.LIZJ = 0;
                            c1722300uv6.LIZ = drawableLIZ;
                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
                            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                            c1722300uv6.LIZLLL = iLIZIZ;
                            c1722300uv6.LJ = iLIZIZ2;
                            c1722300uv6.LJI = context.getString(2131847071);
                            c1722300uv6.LJIIIZ = new AwS392S0200000_26(context, this, 23);
                            c1749280vcc.setStatus(c1722300uv6);
                        }
                        C1749280vcc c1749280vcc2 = this.LLJIJIL;
                        if (c1749280vcc2 != null) {
                            c1749280vcc2.setButtonTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                        }
                        RecyclerView recyclerView = this.LLILZLL;
                        if (recyclerView != null) {
                            C786410Ut5.LLIZLLLIL(recyclerView, 8);
                        }
                        ViewGroup viewGroup = this.LLJILJILJ;
                        if (viewGroup != null) {
                            C786410Ut5.LJLZ(8, viewGroup);
                        }
                        C1749280vcc c1749280vcc3 = this.LLJIJIL;
                        if (c1749280vcc3 != null) {
                            C786410Ut5.LLLZLZ(c1749280vcc3, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Context context2 = getContext();
                if (context2 == null) {
                    return;
                }
                C1749280vcc c1749280vcc4 = this.LLJIJIL;
                if (c1749280vcc4 != null) {
                    C1722300uv6 c1722300uv62 = new C1722300uv6();
                    C0HTI c0hti2 = new C0HTI();
                    c0hti2.LIZ = R.drawable.n7;
                    Drawable drawableLIZ2 = c0hti2.LIZ(context2);
                    c1722300uv62.LIZJ = 0;
                    c1722300uv62.LIZ = drawableLIZ2;
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                    c1722300uv62.LIZLLL = iLIZIZ3;
                    c1722300uv62.LJ = iLIZIZ4;
                    c1722300uv62.LJI = context2.getString(2131847073);
                    c1749280vcc4.setStatus(c1722300uv62);
                }
                RecyclerView recyclerView2 = this.LLILZLL;
                if (recyclerView2 != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView2, 8);
                }
                ViewGroup viewGroup2 = this.LLJILJILJ;
                if (viewGroup2 != null) {
                    C786410Ut5.LJLZ(8, viewGroup2);
                }
                C1749280vcc c1749280vcc5 = this.LLJIJIL;
                if (c1749280vcc5 != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc5, 0);
                }
                TuxTextView tuxTextView = this.LLJ;
                if (tuxTextView == null) {
                    return;
                }
                AnonymousClass0388 anonymousClass0388 = this.LLJILLL;
                if ((anonymousClass0388 == null || anonymousClass0388.getVisibility() != 0) && (((addressAssociateEnterParams = this.LLJJIJIIJIL) == null || (num2 = addressAssociateEnterParams.sourcePage) == null || num2.intValue() != 2) && ((addressAssociateEnterParams2 = this.LLJJIJIIJIL) == null || (num = addressAssociateEnterParams2.sourcePage) == null || num.intValue() != 1))) {
                    i2 = 0;
                }
                C786410Ut5.LLLLZLL(tuxTextView, i2);
                return;
            }
            C1749280vcc c1749280vcc6 = this.LLJIJIL;
            if (c1749280vcc6 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc6, 8);
            }
            ViewGroup viewGroup3 = this.LLJILJILJ;
            if (viewGroup3 == null) {
                return;
            }
            C786410Ut5.LJLZ(8, viewGroup3);
            return;
        }
        ViewGroup viewGroup4 = this.LLJILJILJ;
        if (viewGroup4 != null) {
            C786410Ut5.LJLZ(0, viewGroup4);
        }
        RecyclerView recyclerView3 = this.LLILZLL;
        if (recyclerView3 != null) {
            C786410Ut5.LLIZLLLIL(recyclerView3, 8);
        }
        C1749280vcc c1749280vcc7 = this.LLJIJIL;
        if (c1749280vcc7 == null) {
            return;
        }
        C786410Ut5.LLLZLZ(c1749280vcc7, 8);
    }

    public static final void aS(AddressAssociateFragment addressAssociateFragment, boolean z) {
        String string;
        Object obj;
        Object obj2;
        Integer num;
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = addressAssociateFragment.LLJI;
        boolean z2 = true;
        if (keyBoardVisibilityUtil != null && keyBoardVisibilityUtil.LIZJ()) {
            KeyboardUtils.LIZ(addressAssociateFragment.getContext(), addressAssociateFragment.LLJILJIL);
            C1746780vYa c1746780vYa = addressAssociateFragment.ZR().LLJILJILJ;
            String str = addressAssociateFragment.ZR().LLIZ;
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - addressAssociateFragment.LLJJJIL);
            AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams = addressAssociateFragment.LLJJIJIIJIL;
            if (addressAssociateEnterParams == null || (num = addressAssociateEnterParams.sourcePage) == null || num.intValue() != 1) {
                z2 = false;
            }
            HashMap<String, Object> map = addressAssociateFragment.ZR().LLJILJIL;
            String string2 = null;
            if (map != null && (obj2 = map.get("entrance_info")) != null) {
                string = obj2.toString();
            } else {
                string = null;
            }
            HashMap<String, Object> map2 = addressAssociateFragment.ZR().LLJILJIL;
            if (map2 != null && (obj = map2.get("fill_type")) != null) {
                string2 = obj.toString();
            }
            c1746780vYa.getClass();
            C1746780vYa.LIZIZ(lValueOf, str, string, string2, z2);
        }
        addressAssociateFragment.ZR().LLJILLL = "return";
        if (z) {
            C1745480vWU.LIZLLL = Boolean.TRUE;
            Function0<Unit> function0 = addressAssociateFragment.LLJJIJI;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        FragmentManager fragmentManagerWR = addressAssociateFragment.WR();
        if (fragmentManagerWR == null) {
            return;
        }
        fragmentManagerWR.LJLLILLLL();
    }

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
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Address address;
        String str;
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        Object obj2;
        boolean z;
        C0I7D editTextView;
        C19EG activity;
        Integer num;
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams;
        Integer num2;
        Integer num3;
        Integer num4;
        View view2;
        View rootView;
        Integer num5;
        Integer num6;
        TuxTextView tuxTextView;
        Integer num7;
        C1749260vca c1749260vca;
        View viewFindViewById;
        Integer num8;
        Integer num9;
        C1749280vcc c1749280vcc;
        LocationUseBar locationUseBar;
        Integer num10;
        RecyclerView recyclerView;
        String str2;
        String str3;
        super.onViewCreated(view, bundle);
        LLJJLIIIJLLLLLLLZ = this;
        AddressAssociateViewModel addressAssociateViewModelZR = ZR();
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams2 = this.LLJJIJIIJIL;
        addressAssociateViewModelZR.LLILZLL = addressAssociateEnterParams2;
        String string = null;
        if (addressAssociateEnterParams2 != null) {
            address = addressAssociateEnterParams2.address;
        } else {
            address = null;
        }
        addressAssociateViewModelZR.LLJ = address;
        if (addressAssociateEnterParams2 != null) {
            str = addressAssociateEnterParams2.previousPage;
        } else {
            str = null;
        }
        addressAssociateViewModelZR.LLIZ = str;
        if (addressAssociateEnterParams2 != null && (str3 = addressAssociateEnterParams2.trackParams) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str3);
        } else {
            mapLJIIJ = null;
        }
        addressAssociateViewModelZR.LLJILJIL = mapLJIIJ;
        C1746780vYa c1746780vYa = addressAssociateViewModelZR.LLJILJILJ;
        String str4 = addressAssociateViewModelZR.LLIZ;
        if (addressAssociateEnterParams2 != null && (str2 = addressAssociateEnterParams2.pageName) != null) {
            c1746780vYa.LIZIZ = str2;
        } else {
            c1746780vYa.getClass();
        }
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("previous_page", str4);
        if (mapLJIIJ != null) {
            obj = mapLJIIJ.get("fill_type");
        } else {
            obj = null;
        }
        pairArr[1] = new Pair("fill_type", obj);
        if (mapLJIIJ != null) {
            obj2 = mapLJIIJ.get("entrance_info");
        } else {
            obj2 = null;
        }
        pairArr[2] = new Pair("entrance_info", obj2);
        pairArr[3] = new Pair("trigger_event", "click_map_pin");
        pairArr[4] = new Pair("address_authorization_type", C1745180vW0.LIZJ());
        c1746780vYa.LIZ = C2097608Jq.LJIIIIZZ(pairArr);
        ZR().LLJIJIL = System.currentTimeMillis();
        FragmentManager fragmentManagerWR = WR();
        if (fragmentManagerWR != null) {
            fragmentManagerWR.LJFF(this.LLJJJJLIIL);
        }
        C786410Ut5.I7(new AjS12S0000000_26(1), view);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZLLL();
        this.LLILZIL = new C1746760vYY(ZR(), this);
        this.LLILZLL = (RecyclerView) view.findViewById(R.id.dbl);
        this.LLIZLLLIL = (C1749260vca) view.findViewById(R.id.u78);
        this.LLJ = (TuxTextView) view.findViewById(R.id.title);
        this.LLJIJIL = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJILJILJ = (ViewGroup) view.findViewById(R.id.nnp);
        RecyclerView recyclerView2 = this.LLILZLL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLILZIL);
        }
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams3 = this.LLJJIJIIJIL;
        if (addressAssociateEnterParams3 != null && (num10 = addressAssociateEnterParams3.sourcePage) != null && num10.intValue() == 2 && (recyclerView = this.LLILZLL) != null) {
            recyclerView.addOnScrollListener(new AsS8S0101000_26(this, 1));
        }
        AnonymousClass0388 anonymousClass0388 = (AnonymousClass0388) view.findViewById(R.id.b9x);
        this.LLJILLL = anonymousClass0388;
        if (anonymousClass0388 != null) {
            AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams4 = this.LLJJIJIIJIL;
            if (addressAssociateEnterParams4 != null) {
                locationUseBar = addressAssociateEnterParams4.locationUseBar;
            } else {
                locationUseBar = null;
            }
            anonymousClass0388.LIZ(locationUseBar);
        }
        AnonymousClass0388 anonymousClass03882 = this.LLJILLL;
        if (anonymousClass03882 != null) {
            anonymousClass03882.setGrantBtnClickListener(new AwS570S0100000_26(this, 1398));
        }
        this.LLIZ = (TuxNavBar) view.findViewById(R.id.b9y);
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams5 = this.LLJJIJIIJIL;
        if (addressAssociateEnterParams5 != null && (num9 = addressAssociateEnterParams5.isFullPage) != null && num9.intValue() == 0 && (c1749280vcc = this.LLJIJIL) != null) {
            c1749280vcc.setLayoutVariant(1);
        }
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams6 = this.LLJJIJIIJIL;
        if (addressAssociateEnterParams6 != null && (num8 = addressAssociateEnterParams6.isFullPage) != null && num8.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxNavBar tuxNavBar = this.LLIZ;
            if (tuxNavBar != null) {
                C03DZ.LIZJ(tuxNavBar);
            }
            TuxNavBar tuxNavBar2 = this.LLIZ;
            if (tuxNavBar2 != null) {
                C0OM1 c0om1 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
                c1251150ifB.LIZLLL = true;
                c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1399));
                c0om1.LJ(c1251150ifB);
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = view.getContext().getString(2131832691);
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB2.LIZLLL = true;
                c1251150ifB2.LJIIIIZZ = C20642515q3.LJI(2131823173);
                c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 1400));
                c0om1.LIZIZ(c1251150ifB2);
                tuxNavBar2.setNavActions(c0om1);
            }
        } else {
            TuxNavBar tuxNavBar3 = this.LLIZ;
            if (tuxNavBar3 != null) {
                C03DZ.LIZ(tuxNavBar3);
            }
            C1749260vca c1749260vca2 = this.LLIZLLLIL;
            if (c1749260vca2 != null) {
                C1427310nFJ c1427310nFJ = new C1427310nFJ();
                c1427310nFJ.LIZIZ(EnumC1070180dxI.SECONDARY);
                c1427310nFJ.LJI = R.raw.icon_chevron_left_ltr;
                TuxIconView tuxIconView = c1427310nFJ.LJII;
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_chevron_left_ltr);
                }
                c1427310nFJ.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                ACListenerS154S0100000_19 aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(new AwS605S0100000_26(this, 645), (Function1<? super View, Unit>) 261);
                c1427310nFJ.LJFF = aCListenerS154S0100000_19;
                TuxIconView tuxIconView2 = c1427310nFJ.LJII;
                if (tuxIconView2 != null) {
                    C786410Ut5.a9(tuxIconView2, aCListenerS154S0100000_19);
                }
                c1749260vca2.setStartAction(c1427310nFJ);
            }
        }
        C1749260vca c1749260vca3 = this.LLIZLLLIL;
        if (c1749260vca3 != null && (viewFindViewById = c1749260vca3.findViewById(R.id.u7a)) != null) {
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, viewFindViewById.getContext());
            if (numLIZJ != null) {
                viewFindViewById.setBackgroundColor(numLIZJ.intValue());
            }
        }
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams7 = this.LLJJIJIIJIL;
        if (addressAssociateEnterParams7 != null && (num7 = addressAssociateEnterParams7.sourcePage) != null && num7.intValue() == 2 && (c1749260vca = this.LLIZLLLIL) != null) {
            C03DZ.LIZ(c1749260vca);
        }
        C1749260vca c1749260vca4 = this.LLIZLLLIL;
        if (c1749260vca4 != null) {
            editTextView = c1749260vca4.getEditTextView();
        } else {
            editTextView = null;
        }
        this.LLJILJIL = editTextView;
        TuxTextView tuxTextView2 = this.LLJ;
        if (tuxTextView2 != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131847074);
            }
            tuxTextView2.setText(string);
        }
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams8 = this.LLJJIJIIJIL;
        if (addressAssociateEnterParams8 != null && (num6 = addressAssociateEnterParams8.sourcePage) != null && num6.intValue() == 1 && (tuxTextView = this.LLJ) != null) {
            C03DZ.LIZ(tuxTextView);
        }
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams9 = this.LLJJIJIIJIL;
        if ((addressAssociateEnterParams9 == null || (num5 = addressAssociateEnterParams9.sourcePage) == null || num5.intValue() != 2) && (activity = getActivity()) != null) {
            this.LLJI = new KeyBoardVisibilityUtil((C19FO) activity, (Integer) 16, (Function2<? super Boolean, ? super Integer, Unit>) new AwS640S0100000_26(this, 105));
        }
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams10 = this.LLJJIJIIJIL;
        if (addressAssociateEnterParams10 != null && (num4 = addressAssociateEnterParams10.isFullPage) != null && num4.intValue() == 0 && (view2 = getView()) != null && (rootView = view2.getRootView()) != null) {
            this.LLJJI = new ViewTreeObserverOnGlobalLayoutListenerC1775950wJd(view2, new Rect(), rootView, this, 1);
            C786410Ut5.x3(rootView.getViewTreeObserver(), this.LLJJI);
        }
        final C0I7D c0i7d = this.LLJILJIL;
        if (c0i7d != null) {
            c0i7d.setSaveEnabled(false);
            c0i7d.addTextChangedListener(new C1775970wJf(c0i7d, this, 2));
            C1749260vca c1749260vca5 = this.LLIZLLLIL;
            if (c1749260vca5 != null) {
                c1749260vca5.setOnClickClearListener(new ACListenerS128S0200000_26(c0i7d, this, 20));
            }
            final Context context2 = getContext();
            if (context2 != null) {
                c0i7d.setHint(context2.getString(2131847072));
                AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams11 = this.LLJJIJIIJIL;
                if ((addressAssociateEnterParams11 == null || (num3 = addressAssociateEnterParams11.sourcePage) == null || num3.intValue() != 1) && ((addressAssociateEnterParams = this.LLJJIJIIJIL) == null || (num2 = addressAssociateEnterParams.sourcePage) == null || num2.intValue() != 2)) {
                    c0i7d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0vYb
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) throws Throwable {
                            Editable editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsGa2Pg4OQ5RODt+TbAv7M4T3tP1JDuI25fMsKL9ZcjPEJtw==", null));
                            if (editableLLLLJI != null) {
                                C0I7D c0i7d2 = c0i7d;
                                Context context3 = context2;
                                AddressAssociateFragment addressAssociateFragment = this;
                                if (i == 3 && editableLLLLJI.length() > 0) {
                                    KeyboardUtils.LIZ(context3, c0i7d2);
                                    c0i7d2.clearFocus();
                                    C1745480vWU.LIZIZ = "user_search";
                                    addressAssociateFragment.ZR().hR2(addressAssociateFragment, null, "search");
                                }
                            }
                            return true;
                        }
                    });
                }
            }
        }
        bS(EnumC1746970vYt.LOADING);
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZ5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((AddressAssociateState) obj3).getCandInputDataOptions();
            }
        }, new AwS640S0100000_26(this, 106));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((AddressAssociateState) obj3).getPageState();
            }
        }, new AwS640S0100000_26(this, 107));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((AddressAssociateState) obj3).getAddress();
            }
        }, new AwS640S0100000_26(this, 108));
        C1746840vYg c1746840vYgLIZ = C1747440vZe.LIZ();
        C1746800vYc c1746800vYc = this.LLJJL;
        if (c1746800vYc != null) {
            ((ArrayList) c1746840vYgLIZ.LIZ).add(c1746800vYc);
        } else {
            c1746840vYgLIZ.getClass();
        }
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams12 = this.LLJJIJIIJIL;
        if (addressAssociateEnterParams12 != null && (num = addressAssociateEnterParams12.sourcePage) != null && num.intValue() == 1) {
            AddressAssociateViewModel addressAssociateViewModelZR2 = ZR();
            EnumC1746970vYt enumC1746970vYt = EnumC1746970vYt.SUCCESS;
            addressAssociateViewModelZR2.getClass();
            addressAssociateViewModelZR2.setState(new AwS605S0100000_26(enumC1746970vYt, 644));
            return;
        }
        ZR().iR2();
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ;
        C19GS c19gs = null;
        if (viewGroup != null) {
            viewLIZ = C992303uL.LIZ(layoutInflater.getContext(), R.layout.ahx, viewGroup);
        } else {
            viewLIZ = null;
        }
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
