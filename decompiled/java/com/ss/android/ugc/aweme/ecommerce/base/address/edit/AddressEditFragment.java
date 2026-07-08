package com.ss.android.ugc.aweme.ecommerce.base.address.edit;

import X.AbstractC1252750ihl;
import X.AnonymousClass0378;
import X.C004I;
import X.C01GW;
import X.C034S;
import X.C03IF;
import X.C03UB;
import X.C049X;
import X.C07EQ;
import X.C098200Yq;
import X.C1019103yf;
import X.C10508049a;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11DL;
import X.C11DT;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1233040iBy;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1745180vW0;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1745800vX0;
import X.C1745810vX1;
import X.C1746220vXg;
import X.C1746840vYg;
import X.C1747210vZH;
import X.C1747440vZe;
import X.C1747460vZg;
import X.C1748720vbi;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1749280vcc;
import X.C1765020w20;
import X.C189200o6;
import X.C197039127h;
import X.C19719512Dh;
import X.C19719612Di;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C1AQS;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2371409Qy;
import X.C343970De7;
import X.C384000F3u;
import X.C450740Hlw;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C943803mW;
import X.C958103op;
import X.C983603sw;
import X.C985403tE;
import X.C992303uL;
import X.DialogC1389620mGW;
import X.EnumC1014603xw;
import X.InterfaceC1002303vx;
import X.InterfaceC1058150ddt;
import X.InterfaceC1075600e62;
import X.InterfaceC1164530gPT;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC21506019Ek;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.InterfaceC988203tg;
import X.InterfaceC988703tl;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775950wJd;
import Y.ARunnableS126S0100000_26;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressTipButton;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressTipInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressVerifyData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionResult;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressBean;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressModule;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS28S2200000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressEditFragment extends ECBaseFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.Factory>, InterfaceC988203tg, InterfaceC1164530gPT, InterfaceC1058150ddt, InterfaceC988703tl {
    public static AddressEditFragment LLLII = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExHELIOSKTYpZy43LDcpOjx9LSElPWESLCE+LDwgDSElPQkhKSIhLCEn";
    public C450740Hlw LLILLL;
    public C197039127h LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;
    public RecyclerView LLIZ;
    public C943803mW LLIZLLLIL;
    public C1749280vcc LLJ;
    public FrameLayout LLJI;
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public FrameLayout LLJILLL;
    public ViewGroup LLJJ;
    public ViewGroup LLJJI;
    public View LLJJIII;
    public TuxNavBar LLJJIJI;
    public String LLJJIJIIJIL;
    public ViewTreeObserverOnGlobalLayoutListenerC1775950wJd LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 165));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 160));
    public final lifecycleAwareLazy LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public String LLJLIL;
    public KeyBoardVisibilityUtil LLJLILLLLZIIL;
    public boolean LLJLL;
    public AddressPageStarter.AddressEditEnterParams LLJLLIL;
    public final AFwS268S0000000_26 LLJLLL;
    public long LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public final BPEAHandler LLLF;
    public C1745810vX1 LLLFF;
    public final C1745800vX0 LLLFFI;
    public C03UB LLLFZ;
    public Fragment LLLI;

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    public final FragmentManager dS() {
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

    public final boolean nS() {
        boolean zLJFF = false;
        try {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            int iLJJLIIIIJ = parentFragmentManager.LJJLIIIIJ();
            if (iLJJLIIIIJ <= 0) {
                return false;
            }
            zLJFF = Intrinsics.LJFF(parentFragmentManager.LJJLI(iLJJLIIIIJ - 1).getName(), "address_edit_fragment");
            return zLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1019103yf.LIZ(EnumC1014603xw.ERR20006, th, null);
            return zLJFF;
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        VR(false);
        return true;
    }

    @Override // X.InterfaceC988703tl
    public final boolean onBackPressed() {
        VR(false);
        return true;
    }

    public final Map<String, Object> qS() {
        HashMap<String, Object> mapLJIIJ;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("page_show_type", this.LLL ? "full_screen" : "seven_screen");
        String str = this.LLJLLIL.trackParams;
        pairArr[1] = new Pair("source_previous_page", String.valueOf((str == null || (mapLJIIJ = C1741890vQh.LJIIJ(str)) == null) ? null : mapLJIIJ.get("previous_page")));
        pairArr[2] = new Pair("trigger_event", String.valueOf(this.LLJLLIL.triggerEvent));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0vX1] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0vX0] */
    public AddressEditFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 164);
        this.LLJJL = new lifecycleAwareLazy(this, awS570S0100000_26, new AwS154S0400000_26(this, awS570S0100000_26, c19719912DlLIZ, AFwS313S0000000_26.get$arr$(2), 2));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 158));
        this.LLJL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 161));
        this.LLJLLIL = new AddressPageStarter.AddressEditEnterParams(null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, 0, null, false, null, null, null, false, null, null, null, null, null);
        this.LLJLLL = AFwS268S0000000_26.get$arr$(144);
        this.LLJZ = -1L;
        this.LLL = true;
        this.LLLF = new BPEAHandler(Looper.getMainLooper());
        this.LLLFF = new C1747460vZg() { // from class: X.0vX1
            @Override // X.C1747460vZg, X.InterfaceC1747220vZI
            public final void LIZIZ(Address address, Boolean bool, String str, String str2, Integer num, String str3, Integer num2, String str4) {
                HashMap<String, Object> mapLJIIJ;
                String str5 = str;
                if (num != null && num.intValue() == 1) {
                    if (address != null && str4 != null && str4.length() != 0 && str3 != null && str3.length() != 0) {
                        AddressEditViewModel.dS2(this.LIZ.mS(), address, str4, str3, num2, "address", null, new AwS570S0100000_26(this.LIZ, 159), new AwS28S2200000_26(this.LIZ, str2, str5, bool, 0), 32);
                        return;
                    } else {
                        this.LIZ.wS();
                        return;
                    }
                }
                this.LIZ.mS().pS2(address);
                AddressEditViewModel addressEditViewModelMS = this.LIZ.mS();
                if (str2 != null) {
                    mapLJIIJ = C1741890vQh.LJIIJ(str2);
                } else {
                    mapLJIIJ = null;
                }
                if (str5 == null) {
                    str5 = "latitude_longitude";
                }
                AddressEditViewModel.tS2(addressEditViewModelMS, address, null, null, null, true, false, bool, mapLJIIJ, str5, null, 4830);
                this.LIZ.mS().LLLLIIIILLL = true;
                this.LIZ.rS();
            }
        };
        this.LLLFFI = new InterfaceC21506019Ek() { // from class: X.0vX0
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
                C1745680vWo next;
                if (this.LL.nS()) {
                    if (this.LL.mS().LLLJL || this.LL.mS().LLLL) {
                        if (!this.LL.mS().LLLLIIIILLL) {
                            Iterator<C1745680vWo> it2 = this.LL.mS().XR2().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                } else {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(next.LIZ.key, "address")) {
                                        break;
                                    }
                                }
                            }
                            C1745680vWo c1745680vWo = next;
                            if (c1745680vWo != null) {
                                C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
                                String str = c1745680vWo.LIZ.key;
                                Object obj = c1745680vWo.LIZIZ;
                                c1746460vY4.getClass();
                                C1746460vY4.LJIIIZ(str, obj, null, true);
                            }
                            C1745480vWU c1745480vWU = this.LL.mS().LLJJIJIL;
                            long j = this.LL.mS().LLLJIL;
                            boolean z = this.LL.mS().LLLLIIIILLL;
                            Long lValueOf = Long.valueOf(j);
                            c1745480vWU.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C0OFE.LIZ("is_finish", z ? "1" : CardStruct.IStatusCode.DEFAULT);
                            String str2 = C1745480vWU.LIZIZ;
                            if (str2 != null) {
                                linkedHashMap.put("input_method", str2);
                            }
                            Integer num = C1745480vWU.LIZJ;
                            if (num != null) {
                                linkedHashMap.put("rank", Integer.valueOf(num.intValue()));
                            }
                            c1745480vWU.LJI(c1745680vWo, lValueOf, true, linkedHashMap);
                            C1745480vWU.LIZIZ = null;
                            C1745480vWU.LIZJ = null;
                        }
                        this.LL.mS().LLLL = false;
                        this.LL.mS().LLLJL = false;
                        this.LL.mS().LLLLIIIILLL = false;
                    }
                    this.LL.mS().LLLLILI = SystemClock.elapsedRealtime();
                }
            }
        };
    }

    public final void WR() {
        if (!this.LLL) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        } else {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // X.InterfaceC988203tg
    public final void Z0() {
        try {
            C1748720vbi.LIZIZ(this, new C10508049a(), new AwS605S0100000_26(this, 148));
            C1745480vWU.LIZLLL = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final C1746220vXg aS() {
        return (C1746220vXg) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final RecyclerView bS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gy_) : null;
            this.LLIZ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final TuxTextView cS() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rez) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C450740Hlw gS() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0h) : null;
            this.LLILLL = (C450740Hlw) viewFindViewById;
        }
        return (C450740Hlw) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return this.LLJJJJ ? "pickup_person" : "shipping_address";
    }

    public final View hS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tz7) : null;
            this.LLILZLL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C197039127h iS() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tz6) : null;
            this.LLILZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return (ViewModelProvider.Factory) this.LLJJJJJIL.getValue();
    }

    public final C943803mW kS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w40) : null;
            this.LLIZLLLIL = (C943803mW) viewFindViewById;
        }
        return (C943803mW) viewFindViewById;
    }

    public final AddressEditViewModel mS() {
        return (AddressEditViewModel) this.LLJJL.getValue();
    }

    public final void sS() {
        if (this.LLJJJJ) {
            C1748720vbi.LIZIZ(this, new C049X(), AFwS268S0000000_26.get$arr$(145));
        } else if (iS().getVisibility() == 0) {
            C1748720vbi.LIZIZ(this, new C049X(), new AwS605S0100000_26(this, 149));
        }
    }

    public final void yS() {
        if (((Dialog) this.LLJL.getValue()).isShowing()) {
            C786410Ut5.LJIIJ((DialogC1389620mGW) this.LLJL.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        if (mS().LLLILZJ.LIZ) {
            return;
        }
        mS().LLLILZJ.LIZJ = this.LLJLLIL.btmToken;
        mS().LLLILZJ.LJIIL(this, "a2270.b7527", null);
    }

    public final void oS() {
        C1745480vWU c1745480vWU = mS().LLJJIJIL;
        String str = this.LLJLLIL.quitMessage == null ? "quit_editing_address" : "quit_checkout";
        Map<String, Object> mapLIZ = mS().LLLILZJ.LIZ("c1877.d26920");
        Map<String, Object> mapQS = qS();
        c1745480vWU.getClass();
        C1745480vWU.LIZ(str, "cancel", "quit_editing", mapLIZ, mapQS);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        ((InterfaceC1002303vx) this.LLJJJJLIIL.getValue()).onDestroy();
        AnonymousClass0378.LIZ().LIZJ("ec_address_edit_popup", this);
        AnonymousClass0378.LIZ().LIZJ("ec_show_check_address_result", this);
        AnonymousClass0378.LIZ().LIZJ("ec_change_address_on_order", this);
        AnonymousClass0378.LIZ().LIZJ("ec_change_address_on_edit_detail", this);
        AnonymousClass0378.LIZ().LIZJ("ec_live_end_event", this);
        AnonymousClass0378.LIZ().LIZJ("ec_pudo_address_select", this);
        AnonymousClass0378.LIZ().LIZJ("ec_delivery_instruction_save", this);
        View view = getView();
        if (view != null && (rootView = view.getRootView()) != null && (viewTreeObserver = rootView.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1775950wJd viewTreeObserverOnGlobalLayoutListenerC1775950wJd = this.LLJJIJIL;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775950wJd);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775950wJd, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLJJIJIL = null;
        LLLII = null;
        C1746840vYg c1746840vYgLIZ = C1747440vZe.LIZ();
        C1745810vX1 c1745810vX1 = this.LLLFF;
        if (c1745810vX1 != null) {
            ((ArrayList) c1746840vYgLIZ.LIZ).remove(c1745810vX1);
        } else {
            c1746840vYgLIZ.getClass();
        }
        this.LLLFF = null;
        getParentFragmentManager().LLD(this.LLLFFI);
        this.LLLF.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroyView() {
        /*
            r10 = this;
            super.onDestroyView()
            boolean r0 = r10.LLJZIJLIL
            r2 = 0
            if (r0 == 0) goto L52
            r5 = 0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = r10.mS()
            java.lang.String r1 = r0.LLJI
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L53
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = r10.mS()
            java.lang.String r4 = r0.LLJI
        L1d:
            com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter r0 = com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter$AddressEvent r3 = new com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter$AddressEvent
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.getClass()
            X.099m r0 = com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter.LIZIZ
            if (r0 == 0) goto L37
            X.C189200o6.m2constructorimpl(r3)
            r0.resumeWith(r3)
            com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter.LIZIZ = r6
        L37:
            r10.LLJZIJLIL = r2
            r10.LLILLL = r6
            r10.LLILZ = r6
            r10.LLILZIL = r6
            r10.LLILZLL = r6
            r10.LLIZ = r6
            r10.LLIZLLLIL = r6
            r10.LLJ = r6
            r10.LLJI = r6
            r10.LLJIJIL = r6
            r10.LLJILJIL = r6
            r10.LLJILJILJ = r6
            r10.LLJILLL = r6
            return
        L52:
            r5 = -1
        L53:
            java.lang.String r4 = ""
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment.onDestroyView():void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(AddressEditFragment.class.getName());
        }
        super.onResume();
        mS().wS2(C1745180vW0.LJFF());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.LLL) {
            return;
        }
        onVisible();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LLL) {
            return;
        }
        Z0();
    }

    @Override // X.InterfaceC988203tg
    public final void onVisible() {
        mS().LLLLILI = SystemClock.elapsedRealtime();
    }

    public final void rS() {
        if (!C07EQ.LIZ()) {
            FragmentManager fragmentManagerDS = dS();
            if (fragmentManagerDS != null) {
                fragmentManagerDS.LJLLJ(0, "address_edit_fragment");
                return;
            }
            return;
        }
        FragmentManager fragmentManagerDS2 = dS();
        if (fragmentManagerDS2 != null) {
            if (fragmentManagerDS2.LJLJJI()) {
                C786410Ut5.LJJZZIII(this.LLLF, new ARunnableS126S0100000_26(fragmentManagerDS2, 20));
            } else {
                fragmentManagerDS2.LJLLJ(0, "address_edit_fragment");
            }
        }
    }

    public final void wS() {
        C19EG activity;
        if (getActivity() == null || (activity = getActivity()) == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131848087);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        InputItemData inputItemData = mS().LLJJJJ;
        String strLIZIZ = "";
        if (inputItemData != null && inputItemData.addressRight != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append("address_rights;");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (strLIZIZ.length() > 0) {
            ((HashMap) map).put("ui_elements_data", strLIZIZ);
        }
        AddressEditState addressEditStateFQ2 = mS().FQ2();
        if (addressEditStateFQ2.getInputItemFirstTimeLoadingStatus() != 0) {
            HashMap map2 = (HashMap) map;
            map2.put("content_list_size", String.valueOf(addressEditStateFQ2.getInputItemVOList().size()));
            if (addressEditStateFQ2.getInputItemFirstTimeLoadingStatus() != 2 && addressEditStateFQ2.getInputItemFirstTimeLoadingStatus() != 3) {
                List<C1745680vWo> inputItemVOList = addressEditStateFQ2.getInputItemVOList();
                if (inputItemVOList == null || inputItemVOList.isEmpty()) {
                    map2.put("blank_type", "empty_data_list");
                    return true;
                }
            } else {
                map2.put("blank_type", "error_status");
                return true;
            }
        }
        if (mS().FQ2().getInputItemFirstTimeLoadingStatus() != -1 || (gS().getChildCount() > 0 && gS().getHeight() > 0)) {
            return false;
        }
        ((HashMap) map).put("blank_type", "empty_view");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS605S0100000_26(this, 144));
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_rd", new AwS605S0100000_26(this, 145));
    }

    public final void VR(boolean z) {
        String str;
        Context context;
        if (C03IF.LIZ() && !this.LLL && !nS() && !z) {
            FragmentManager fragmentManagerDS = dS();
            if (fragmentManagerDS != null) {
                fragmentManagerDS.LJLLILLLL();
                return;
            }
            return;
        }
        withState(mS(), new AwS605S0100000_26(this, 848));
        C983603sw c983603sw = mS().LLLLLJLJLL;
        if (c983603sw != null && c983603sw.LIZLLL(this, null) && (context = getContext()) != null) {
            C983603sw c983603sw2 = mS().LLLLLJLJLL;
            if (c983603sw2 != null) {
                c983603sw2.LJ(context);
                return;
            }
            return;
        }
        if (!mS().LLJJIJI) {
            this.LLJLIL = "return";
            WR();
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            if (mS().xS2()) {
                C1397580mTM c1397580mTM = new C1397580mTM(activity);
                c1397580mTM.LJFF(2131832662);
                c1397580mTM.LIZIZ(getString(2131832663));
                C985403tE.LIZ(c1397580mTM, new AwS605S0100000_26(this, 846));
                c1397580mTM.LJII = true;
                new C1397510mTF(c1397580mTM).LIZLLL();
                C1745480vWU c1745480vWU = mS().LLJJIJIL;
                Map<String, Object> mapQS = qS();
                c1745480vWU.getClass();
                C1745480vWU.LIZJ("quit_editing_address_and_save", "quit_editing", mapQS);
                return;
            }
            C1397580mTM c1397580mTM2 = new C1397580mTM(activity);
            c1397580mTM2.LJFF(2131832685);
            String string = this.LLJLLIL.quitMessage;
            if (string == null) {
                string = getString(2131832686);
            }
            c1397580mTM2.LIZIZ(string);
            C985403tE.LIZ(c1397580mTM2, new AwS605S0100000_26(this, 836));
            c1397580mTM2.LJII = true;
            new C1397510mTF(c1397580mTM2).LIZLLL();
            C1745480vWU c1745480vWU2 = mS().LLJJIJIL;
            if (this.LLJLLIL.quitMessage == null) {
                str = "quit_editing_address";
            } else {
                str = "quit_checkout";
            }
            Map<String, Object> mapQS2 = qS();
            c1745480vWU2.getClass();
            C1745480vWU.LIZJ(str, "quit_editing", mapQS2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0567 A[PHI: r3
      0x0567: PHI (r3v34 java.lang.String) = (r3v31 java.lang.String), (r3v40 java.lang.String) binds: [B:159:0x0556, B:163:0x0565] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 1643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment.onActivityCreated(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        super.onConfigurationChanged(configuration);
        if (getParentFragment() instanceof TuxSheet) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isPad()) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJIILLIIL((int) (C958103op.LIZJ() * 0.9f), this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bc A[Catch: Exception -> 0x01c3, TryCatch #5 {Exception -> 0x01c3, blocks: (B:86:0x0114, B:88:0x0118, B:90:0x011c, B:92:0x0122, B:94:0x012c, B:96:0x0130, B:98:0x013d, B:100:0x0141, B:101:0x014b, B:106:0x015f, B:110:0x0167, B:112:0x0173, B:114:0x0177, B:116:0x0186, B:118:0x018a, B:119:0x0194, B:124:0x01a8, B:128:0x01b0, B:130:0x01bc, B:131:0x01be, B:122:0x019d, B:126:0x01ac, B:104:0x0154, B:108:0x0163), top: B:299:0x0114, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJIJL(bundle, "enter_params", this.LLJLLIL);
    }

    public final void uS(int i) {
        List listLIZIZ = C19719512Dh.LIZIZ(aS().LLILLJJLI.LJFF);
        int iLJIIJ = C1697810uHb.LJIIJ(listLIZIZ);
        Object obj = ListProtector.get(listLIZIZ, iLJIIJ);
        if (i > 0) {
            if (!(obj instanceof Integer)) {
                listLIZIZ.add(Integer.valueOf(i));
                aS().notifyItemInserted(iLJIIJ + 1);
                return;
            } else {
                if (i == ((Number) obj).intValue()) {
                    return;
                }
                ListProtector.set(listLIZIZ, iLJIIJ, Integer.valueOf(i));
                aS().notifyItemChanged(iLJIIJ);
                return;
            }
        }
        if (!(obj instanceof Integer)) {
            return;
        }
        C1746220vXg c1746220vXgAS = aS();
        ArrayList arrayList = new ArrayList(listLIZIZ);
        C19719612Di.LJJIJ(arrayList);
        c1746220vXgAS.getClass();
        C11DT.LIZ(c1746220vXgAS, arrayList, null);
    }

    public final void ZR(Integer num, Function0<Unit> function0) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (num != null) {
            if (num.intValue() == -1) {
                yS();
                function0.invoke();
                return;
            }
            if (num.intValue() == 0) {
                C786410Ut5.J4((DialogC1389620mGW) this.LLJL.getValue());
                return;
            }
            if (num.intValue() != 2) {
                return;
            }
            yS();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            C1233040iBy c1233040iBy = new C1233040iBy(((IApplicationDependencyService) iECommerceHostService).getApplicationContext());
            c1233040iBy.LIZJ(getString(2131848087));
            c1233040iBy.LIZLLL();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        PudoAddressBean pudoAddressBean;
        String str3;
        String str4;
        Address address;
        PudoAddress pudoAddress;
        PudoAddress pudoAddress2;
        PudoAddress pudoAddress3;
        Address address2;
        Type type;
        Address address3;
        Type type2;
        Type type3;
        AddressVerifyData addressVerifyData;
        List<AddressTipButton> list;
        String str5;
        String str6;
        String str7;
        Type type4;
        PudoAddressModule pudoAddressModule = null;
        String str8 = null;
        switch (str.hashCode()) {
            case -2114481835:
                if (str.equals("ec_pudo_address_select")) {
                    AddressEditViewModel addressEditViewModelMS = mS();
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJII(PudoAddressBean.class));
                        } else {
                            type = new TypeToken<PudoAddressBean>() { // from class: X.0vZK
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                        if (!(objFromJson instanceof PudoAddressBean)) {
                            objFromJson = null;
                        }
                        pudoAddressBean = (PudoAddressBean) objFromJson;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        pudoAddressBean = null;
                    }
                    AddressEditState addressEditStateFQ2 = addressEditViewModelMS.FQ2();
                    Address address4 = addressEditViewModelMS.LLJILJILJ;
                    if (address4 != null) {
                        str3 = address4.pudoId;
                    } else {
                        str3 = null;
                    }
                    if (pudoAddressBean != null && (pudoAddress3 = pudoAddressBean.pudoAddress) != null && (address2 = pudoAddress3.address) != null) {
                        str4 = address2.pudoId;
                    } else {
                        str4 = null;
                    }
                    if (!Intrinsics.LJFF(str3, str4)) {
                        addressEditViewModelMS.LLLLIIL = false;
                        if (pudoAddressBean != null && (pudoAddress2 = pudoAddressBean.pudoAddress) != null) {
                            address = pudoAddress2.address;
                        } else {
                            address = null;
                        }
                        addressEditViewModelMS.LLJILJILJ = address;
                        C1747210vZH pudoAddressVO = addressEditStateFQ2.getPudoAddressVO();
                        if (pudoAddressVO != null) {
                            PudoAddressModule pudoAddressModule2 = addressEditStateFQ2.getPudoAddressVO().LIZIZ;
                            if (pudoAddressModule2 != null) {
                                if (pudoAddressBean == null || (pudoAddress = pudoAddressBean.pudoAddress) == null) {
                                    pudoAddress = addressEditStateFQ2.getPudoAddressVO().LIZIZ.pudoAddress;
                                }
                                pudoAddressModule = new PudoAddressModule(pudoAddressModule2.title, pudoAddress, pudoAddressModule2.bgImage, pudoAddressModule2.jumpSchema, pudoAddressModule2.jumpIcon);
                            }
                            addressEditViewModelMS.setStateImmediate(new AwS392S0200000_26(addressEditStateFQ2, new C1747210vZH(pudoAddressVO.LIZ, pudoAddressModule, pudoAddressVO.LIZJ, pudoAddressVO.LIZLLL), 214));
                        }
                    }
                }
                break;
            case -1726668033:
                if (str.equals("ec_change_address_on_edit_detail")) {
                    AddressEditViewModel addressEditViewModelMS2 = mS();
                    try {
                        Gson gsonLJFF2 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                            type2 = C2371409Qy.LIZJ(C13LE.LJII(Address.class));
                        } else {
                            type2 = new TypeToken<Address>() { // from class: X.0vZD
                            }.getType();
                        }
                        Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type2);
                        if (!(objFromJson2 instanceof Address)) {
                            objFromJson2 = null;
                        }
                        address3 = (Address) objFromJson2;
                    } catch (s e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        address3 = null;
                    }
                    AddressEditViewModel.tS2(addressEditViewModelMS2, address3, null, null, null, false, false, null, null, null, null, 8186);
                }
                break;
            case -1631874432:
                if (str.equals("ec_show_check_address_result") && !this.LLJJJIL) {
                    this.LLJJJIL = true;
                    if (getContext() != null) {
                        try {
                            Gson gsonLJFF3 = C1741890vQh.LJFF();
                            C1120604Zw.LIZ.getClass();
                            C1121904a9 c1121904a9LIZIZ3 = C1120604Zw.LIZIZ();
                            if (c1121904a9LIZIZ3 != null && c1121904a9LIZIZ3.LJII) {
                                type3 = C2371409Qy.LIZJ(C13LE.LJII(CheckShippingAddressData.class));
                            } else {
                                type3 = new TypeToken<CheckShippingAddressData>() { // from class: X.0vZJ
                                }.getType();
                            }
                            Object objFromJson3 = GsonProtectorUtils.fromJson(gsonLJFF3, str2, type3);
                            if (!(objFromJson3 instanceof CheckShippingAddressData)) {
                                objFromJson3 = null;
                            }
                            CheckShippingAddressData checkShippingAddressData = (CheckShippingAddressData) objFromJson3;
                            if (checkShippingAddressData != null && (addressVerifyData = checkShippingAddressData.verifyData) != null) {
                                View viewSd = C786410Ut5.Sd(R.layout.ai4, C786410Ut5.ne(requireContext()), null);
                                C19EG activity = getActivity();
                                if (activity != null) {
                                    C1397580mTM c1397580mTM = new C1397580mTM(activity);
                                    AddressTipInfo addressTipInfo = addressVerifyData.tipInfo;
                                    if (addressTipInfo != null && (str7 = addressTipInfo.title) != null) {
                                        c1397580mTM.LJI(str7);
                                    }
                                    C384000F3u.LIZ(c1397580mTM, viewSd);
                                    AddressTipInfo addressTipInfo2 = addressVerifyData.tipInfo;
                                    if (addressTipInfo2 != null && (str6 = addressTipInfo2.content) != null) {
                                        c1397580mTM.LIZIZ(str6);
                                    }
                                    if (viewSd instanceof TuxTextView) {
                                        TextView textView = (TextView) viewSd;
                                        textView.setImportantForAccessibility(1);
                                        textView.setFocusable(true);
                                        AddressTipInfo addressTipInfo3 = addressVerifyData.tipInfo;
                                        if (addressTipInfo3 != null && (str5 = addressTipInfo3.tips) != null) {
                                            textView.setText(str5);
                                        }
                                    }
                                    AddressTipInfo addressTipInfo4 = addressVerifyData.tipInfo;
                                    if (addressTipInfo4 != null && (list = addressTipInfo4.buttons) != null) {
                                        C985403tE.LIZ(c1397580mTM, new AwS235S0300000_26((List) list, (List<AddressTipButton>) this, (AddressEditFragment) addressVerifyData, (AddressVerifyData) 10));
                                    }
                                    c1397580mTM.LJII = false;
                                    C1745480vWU c1745480vWU = mS().LLJJIJIL;
                                    Map<String, Object> mapQS = qS();
                                    c1745480vWU.getClass();
                                    C1745480vWU.LIZJ("update_address_format", null, mapQS);
                                    c1397580mTM.LIZLLL(new AwS605S0100000_26(this, 147));
                                    new C1397510mTF(c1397580mTM).LIZLLL();
                                }
                                break;
                            }
                        } catch (s e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            return;
                        }
                    } else {
                        C1AF0.LIZJ("editFragment context is null");
                        break;
                    }
                }
                break;
            case -384215964:
                if (str.equals("ec_live_end_event")) {
                    String str9 = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(this, C343970De7.LIZ);
                }
                break;
            case 493592344:
                if (str.equals("ec_delivery_instruction_save")) {
                    try {
                        Gson gsonLJFF4 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ4 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ4 != null && c1121904a9LIZIZ4.LJII) {
                            type4 = C2371409Qy.LIZJ(C13LE.LJII(DeliveryInstructionResult.class));
                        } else {
                            type4 = new TypeToken<DeliveryInstructionResult>() { // from class: X.0vZL
                            }.getType();
                        }
                        Object objFromJson4 = GsonProtectorUtils.fromJson(gsonLJFF4, str2, type4);
                        if (!(objFromJson4 instanceof DeliveryInstructionResult)) {
                            objFromJson4 = null;
                        }
                        DeliveryInstructionResult deliveryInstructionResult = (DeliveryInstructionResult) objFromJson4;
                        if (deliveryInstructionResult != null) {
                            AddressEditViewModel addressEditViewModelMS3 = mS();
                            DeliveryInstructionInfo deliveryInstructionInfo = deliveryInstructionResult.instructionInfo;
                            addressEditViewModelMS3.getClass();
                            addressEditViewModelMS3.setState(new AwS605S0100000_26(deliveryInstructionInfo, 840));
                        }
                    } catch (s e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        return;
                    }
                }
                break;
            case 2069927075:
                if (str.equals("ec_address_edit_popup")) {
                    try {
                        Object obj = new JSONObject(str2).get("type");
                        if (obj instanceof String) {
                            str8 = (String) obj;
                        }
                        if (Intrinsics.LJFF(str8, "give_up_deals") || Intrinsics.LJFF(str8, "component_unmount")) {
                            WR();
                        }
                    } catch (Exception e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC1002303vx interfaceC1002303vx = (InterfaceC1002303vx) this.LLJJJJLIIL.getValue();
        mS();
        interfaceC1002303vx.LIZ(view);
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
            viewLIZ = C992303uL.LIZ(layoutInflater.getContext(), R.layout.aig, viewGroup);
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
