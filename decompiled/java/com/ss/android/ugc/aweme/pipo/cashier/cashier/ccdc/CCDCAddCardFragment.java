package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0OM1;
import X.C1192680h8s;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1397510mTF;
import X.C13LE;
import X.C1440005kM;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1708610uZ1;
import X.C1709040uZi;
import X.C1709630uaf;
import X.C1709640uag;
import X.C1710970ucp;
import X.C1722550uvV;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.C991750bun;
import X.EnumC1709020uZg;
import X.EnumC1712090ued;
import X.InterfaceC1709310ua9;
import X.InterfaceC1722540uvU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC902903fv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardFragment;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCAddCardFragment extends PipoCashierBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyQ/ISY2HELIOSOmsvKDw7ISA+ZywwLCZiCgwXCwQoLQwyOiEKOy40JSAiPQ==";
    public C1709640uag LLJJJ;
    public InterfaceC902903fv LLJJJIL;
    public boolean LLJJJJ;
    public C1397510mTF LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCAddCardFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CCDCAddCardFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 968);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(398);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 969), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new AwS570S0100000_26((Fragment) this, 970), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 971), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJJLIIL = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ = aS();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 967));
        c0om1.LJ(c1251150ifB);
        return c0om1;
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final C1250250idj aS() {
        String string;
        C1250250idj c1250250idj = new C1250250idj();
        Context context = getContext();
        if (context == null || (string = context.getString(2131857119)) == null) {
            string = "";
        }
        c1250250idj.LIZJ = string;
        return c1250250idj;
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final void cS() {
        EnumC1709020uZg enumC1709020uZgLIZ;
        C1709640uag c1709640uag = this.LLJJJ;
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(c1709640uag != null ? c1709640uag.LIZ.payRequestId : null);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("pay_type", "CCDC"));
        C1709640uag c1709640uag2 = this.LLJJJ;
        mapLJIIJ.put("enter_from", (c1709640uag2 == null || (enumC1709020uZgLIZ = c1709640uag2.LIZ()) == null) ? "" : C1709040uZi.LIZ(enumC1709020uZgLIZ));
        interfaceC1709310ua9LIZIZ.LIZIZ("ccdc_card_info", mapLJIIJ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        IPipoCcdcService iPipoCcdcService;
        C19EG activity;
        super.onResume();
        C1710970ucp c1710970ucp = C1710970ucp.LIZ;
        Context context = getContext();
        c1710970ucp.getClass();
        if (!C1710970ucp.LIZ(context)) {
            C1710970ucp.LIZIZ = EnumC1712090ued.NOT_SUPPORT;
            return;
        }
        Context context2 = getContext();
        if (context2 == null || (iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null)) == null || !iPipoCcdcService.LJIIL(context2)) {
            EnumC1712090ued enumC1712090ued = EnumC1712090ued.NOT_ENABLED;
            C1710970ucp.LIZIZ = enumC1712090ued;
            C1440005kM.LIZ(new C991750bun(enumC1712090ued));
            return;
        }
        if (C1710970ucp.LIZIZ == EnumC1712090ued.NOT_ENABLED || C1710970ucp.LIZIZ == EnumC1712090ued.NOT_SUPPORT) {
            EnumC1712090ued enumC1712090ued2 = EnumC1712090ued.ENABLED;
            C1710970ucp.LIZIZ = enumC1712090ued2;
            C1440005kM.LIZ(new C991750bun(enumC1712090ued2));
        }
        if (this.LLJJJJ || (activity = getActivity()) == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        InterfaceC1722540uvU interfaceC1722540uvU = new InterfaceC1722540uvU() { // from class: X.0uep
            @Override // X.InterfaceC1722540uvU
            public final void LIZIZ(List<String> list) {
            }

            @Override // X.InterfaceC1722540uvU
            public final void LIZJ() {
                C1710970ucp c1710970ucp2 = C1710970ucp.LIZ;
                c1710970ucp2.getClass();
                EnumC1712090ued enumC1712090ued3 = C1710970ucp.LIZIZ;
                EnumC1712090ued enumC1712090ued4 = EnumC1712090ued.SCANNING;
                if (enumC1712090ued3 != enumC1712090ued4) {
                    c1710970ucp2.getClass();
                    C1710970ucp.LIZIZ = enumC1712090ued4;
                    c1710970ucp2.getClass();
                    C1440005kM.LIZ(new C991750bun(C1710970ucp.LIZIZ));
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1722540uvU
            public final void LIZ(C897203f0 c897203f0) {
                char[] charArray;
                Object obj;
                Object obj2;
                C1710970ucp.LIZ.getClass();
                EnumC1712090ued enumC1712090ued3 = C1710970ucp.LIZIZ;
                EnumC1712090ued enumC1712090ued4 = EnumC1712090ued.ENABLED;
                if (enumC1712090ued3 != enumC1712090ued4) {
                    C1710970ucp.LIZIZ = enumC1712090ued4;
                    C1440005kM.LIZ(new C991750bun(enumC1712090ued4));
                    C259800zU c259800zU = new C259800zU();
                    C259800zU c259800zU2 = new C259800zU();
                    String str = c897203f0.LIZIZ;
                    if (str != null && (charArray = str.toCharArray()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (char c : charArray) {
                            if ('0' <= c && c < ':') {
                                arrayList.add(Character.valueOf(c));
                            }
                        }
                        char[] cArrLLFFF = C13LP.LLFFF(arrayList);
                        if (cArrLLFFF != null) {
                            String str2 = new String(cArrLLFFF);
                            try {
                                String strLJJLIIIJLLLLLLLZ = a0.LJJLIIIJLLLLLLLZ(str2, new IntRange(0, 1));
                                C189200o6.m2constructorimpl(strLJJLIIIJLLLLLLLZ);
                                obj = strLJJLIIIJLLLLLLLZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C098200Yq c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                                obj = c098200Yq;
                            }
                            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                            T t = obj;
                            if (zM7isFailureimpl) {
                                t = 0;
                            }
                            c259800zU.element = t;
                            try {
                                String strSubstring = str2.substring(2, Math.min(str2.length(), 4));
                                C189200o6.m2constructorimpl(strSubstring);
                                obj2 = strSubstring;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C098200Yq c098200Yq2 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq2);
                                obj2 = c098200Yq2;
                            }
                            boolean zM7isFailureimpl2 = C189200o6.m7isFailureimpl(obj2);
                            T t2 = obj2;
                            if (zM7isFailureimpl2) {
                                t2 = 0;
                            }
                            c259800zU2.element = t2;
                        }
                    }
                    CCDCAddCardFragment cCDCAddCardFragment = this.LIZ;
                    String str3 = CCDCAddCardFragment._pnsPageId;
                    cCDCAddCardFragment.oS(true, null);
                    C1440005kM.LIZ(new C1710980ucq(c897203f0.LIZ, (String) c259800zU2.element, (String) c259800zU.element));
                }
            }

            @Override // X.InterfaceC1722540uvU
            public final void onError(int i) {
                Context context3;
                this.LIZ.oS(false, Integer.valueOf(i));
                C1710970ucp.LIZ.getClass();
                EnumC1712090ued enumC1712090ued3 = C1710970ucp.LIZIZ;
                EnumC1712090ued enumC1712090ued4 = EnumC1712090ued.ENABLED;
                if (enumC1712090ued3 != enumC1712090ued4) {
                    C1710970ucp.LIZIZ = enumC1712090ued4;
                    C1440005kM.LIZ(new C991750bun(enumC1712090ued4));
                    CCDCAddCardFragment cCDCAddCardFragment = this.LIZ;
                    C1397510mTF c1397510mTF = cCDCAddCardFragment.LLJJJJJIL;
                    if ((c1397510mTF != null && c1397510mTF.LJIIIZ()) || (context3 = cCDCAddCardFragment.getContext()) == null) {
                        return;
                    }
                    C1397580mTM c1397580mTM = new C1397580mTM(context3);
                    c1397580mTM.LIZIZ(cCDCAddCardFragment.getString(2131832877));
                    c1397580mTM.LJI(cCDCAddCardFragment.getString(2131832878));
                    C985403tE.LIZ(c1397580mTM, AFwS268S0000000_26.get$arr$(520));
                    c1397580mTM.LJII = false;
                    c1397580mTM.LIZLLL(AFwS268S0000000_26.get$arr$(521));
                    C1397510mTF c1397510mTF2 = new C1397510mTF(c1397580mTM);
                    cCDCAddCardFragment.LLJJJJJIL = c1397510mTF2;
                    c1397510mTF2.LIZLLL();
                }
            }
        };
        IPipoCcdcService iPipoCcdcService2 = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null);
        C1722550uvV c1722550uvVLJIILIIL = iPipoCcdcService2 != null ? iPipoCcdcService2.LJIILIIL(activity, viewLifecycleOwner, interfaceC1722540uvU) : null;
        this.LLJJJIL = c1722550uvVLJIILIIL;
        if (c1722550uvVLJIILIIL != null) {
            c1722550uvVLJIILIIL.LIZIZ();
        }
        this.LLJJJJ = true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1192680h8s c1192680h8s;
        View view;
        ViewGroup viewGroup;
        super.onDestroyView();
        InterfaceC902903fv interfaceC902903fv = this.LLJJJIL;
        if (interfaceC902903fv != null) {
            interfaceC902903fv.LIZ();
        }
        C1709640uag c1709640uag = this.LLJJJ;
        if (c1709640uag == null || (c1192680h8s = c1709640uag.LJFF) == null || (view = c1192680h8s.LIZ) == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(view, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final void dS(long j, String str) {
        String str2;
        String strLIZ;
        EnumC1709020uZg enumC1709020uZgLIZ;
        C1709640uag c1709640uag = this.LLJJJ;
        if (c1709640uag != null) {
            str2 = c1709640uag.LIZ.payRequestId;
        } else {
            str2 = null;
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("pay_type", "CCDC"));
        C1709640uag c1709640uag2 = this.LLJJJ;
        if (c1709640uag2 != null && (enumC1709020uZgLIZ = c1709640uag2.LIZ()) != null) {
            strLIZ = C1709040uZi.LIZ(enumC1709020uZgLIZ);
        } else {
            strLIZ = "";
        }
        mapLJIIJ.put("enter_from", strLIZ);
        interfaceC1709310ua9LIZIZ.LJII(j, "ccdc_card_info", str, mapLJIIJ, true);
    }

    public final void oS(boolean z, Integer num) {
        String str;
        String str2;
        C1709640uag c1709640uag = this.LLJJJ;
        if (c1709640uag == null || (str = c1709640uag.LIZ.payRequestId) == null) {
            str = "nfc";
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
        HashMap map = new HashMap();
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("success", str2);
        if (num != null) {
            map.put("error_code", String.valueOf(num.intValue()));
        }
        interfaceC1709310ua9LIZIZ.LIZ("rd_pipo_nfc_read", map);
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1709640uag c1709640uag = this.LLJJJ;
        if (c1709640uag != null) {
            CCDCAddCardAssem.LLJJI.getClass();
            CCDCAddCardAssem.LLJJIJI = c1709640uag;
            C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 404), 3);
        }
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        C1709630uaf c1709630uafAQ2 = ((CCDCAddCardViewModel) assemVMLazy.getValue()).AQ2();
        if (c1709630uafAQ2 != null) {
            c1709630uafAQ2.LIZJ("continue", null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dvf, viewGroup, false);
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
