package com.ss.android.ugc.aweme.inbox.search.assem;

import X.AbstractC712240Rwk;
import X.C01D1;
import X.C01GW;
import X.C08XD;
import X.C09R3;
import X.C0PEK;
import X.C0PGF;
import X.C1194810hCJ;
import X.C1241460iPY;
import X.C1241480iPa;
import X.C1241620iPo;
import X.C13LE;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1618770sE7;
import X.C1637806bA;
import X.C1637906bB;
import X.C1720106oR;
import X.C1846060y8i;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C452501pT;
import X.C622840Obq;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.EnumC622850Obr;
import X.InterfaceC1194840hCM;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC636730OyF;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchGenericAbility;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchResultAllTabFragmentData;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchResultBaseFragment;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchResultFragmentData;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol;
import com.ss.android.ugc.aweme.inbox.search.ability.InboxSearchContainerAbility;
import com.ss.android.ugc.aweme.inbox.search.ability.InboxSearchKeyWordAbility;
import com.ss.android.ugc.aweme.inbox.search.assem.InboxSearchResultContainer;
import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultContainerVM;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchResultContainer extends UISlotAssem implements InboxSearchGenericAbility, InboxSearchContainerAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public C1241480iPa LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public Map<String, ? extends InboxSearchTabProtocol> LLJJIJIL;
    public final Map<String, Integer> LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxSearchResultContainer.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchResultContainerVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(InboxSearchResultContainer.class, "keyWordVM", "getKeyWordVM()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(InboxSearchResultContainer.class, "defaultVM", "getDefaultVM()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchDefaultVM;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public InboxSearchResultContainer() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxSearchResultContainerVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 1556), AFwS257S0000000_19.get$arr$(195), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InboxSearchVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 1557), AFwS257S0000000_19.get$arr$(196), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(InboxSearchDefaultVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ3, 1558), AFwS257S0000000_19.get$arr$(197), null, true);
        this.LLJJJ = new LinkedHashMap();
        this.LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1555));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(257));
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1559));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a_g;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -797132665 || iHashCode == 1794688217) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.ability.InboxSearchContainerAbility
    public final void BU1() {
        FragmentManager fragmentManager;
        InboxSearchKeyWordAbility inboxSearchKeyWordAbility = (InboxSearchKeyWordAbility) this.LLJJJIL.getValue();
        if (inboxSearchKeyWordAbility != null) {
            inboxSearchKeyWordAbility.Rq();
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (fragmentManager = fragmentLJI.getFragmentManager()) == null) {
            return;
        }
        ((DialogFragment) this.LLJJJJLIIL.getValue()).show(fragmentManager, "");
    }

    public final ViewOnAttachStateChangeListenerC20631115oD hp() {
        return (ViewOnAttachStateChangeListenerC20631115oD) LJJIJL().findViewById(R.id.kjq);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1241480iPa c1241480iPa = this.LLJJI;
        if (c1241480iPa != null && c1241480iPa.LJ) {
            C1241460iPY.LIZ.getClass();
            C1241460iPY.LJI(c1241480iPa);
            c1241480iPa.LJ = false;
        }
        this.LLJJI = null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchGenericAbility
    public final C1241480iPa Ks0() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.ability.InboxSearchContainerAbility
    public final void UP0(String str) {
        Fragment fragmentLIZIZ;
        InboxSearchResultBaseFragment inboxSearchResultBaseFragment;
        InterfaceC636730OyF fragmentItemOperator;
        Integer num = (Integer) ((LinkedHashMap) this.LLJJJ).get(str);
        if (num != null) {
            int iIntValue = num.intValue();
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDHp = hp();
            if (viewOnAttachStateChangeListenerC20631115oDHp != null && (fragmentItemOperator = viewOnAttachStateChangeListenerC20631115oDHp.getFragmentItemOperator()) != null) {
                fragmentLIZIZ = fragmentItemOperator.LIZIZ(iIntValue);
            } else {
                fragmentLIZIZ = null;
            }
            if ((fragmentLIZIZ instanceof InboxSearchResultBaseFragment) && (inboxSearchResultBaseFragment = (InboxSearchResultBaseFragment) fragmentLIZIZ) != null) {
                inboxSearchResultBaseFragment.NR(null, null, null, true);
            }
            hp().setCurrentItem(iIntValue);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws IllegalAccessException {
        super.onViewCreated(view);
        C1558520qew.LIZLLL(this);
        this.LLJJI = new C1241480iPa();
        int i = 0;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), InboxSearchTabProtocol.class, false);
        if (listLIZIZ != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                if (((InboxSearchTabProtocol) obj).LIZLLL()) {
                    arrayList.add(obj);
                }
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((InboxSearchTabProtocol) obj2).LJIIIIZZ(), obj2);
            }
            this.LLJJIJIL = linkedHashMap;
        }
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        InboxSearchResultContainerVM inboxSearchResultContainerVM = (InboxSearchResultContainerVM) assemVMLazy.getValue();
        Map<String, ? extends InboxSearchTabProtocol> map = this.LLJJIJIL;
        if (map == null) {
            map = null;
        }
        inboxSearchResultContainerVM.LL = map;
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSearchResultContainer", "ViewPager Init");
        final View viewLJJIJL = LJJIJL();
        InterfaceC636730OyF fragmentItemOperator = ((ViewOnAttachStateChangeListenerC20631115oD) viewLJJIJL.findViewById(R.id.kjq)).getFragmentItemOperator();
        C622840Obq c622840Obq = new C622840Obq();
        c622840Obq.LJII = EnumC622850Obr.FRAGMENTS_NO_DESTROY;
        fragmentItemOperator.LIZLLL(c622840Obq);
        final ArrayList arrayList2 = new ArrayList();
        C20600815jK.LIZJ(fragmentItemOperator.getState(), new InboxSearchResultAllTabFragmentData(0));
        arrayList2.add(C1618770sE7.LIZJ(2131835997));
        this.LLJJJ.put(C1618770sE7.LIZJ(2131835997), 0);
        Map<String, ? extends InboxSearchTabProtocol> map2 = this.LLJJIJIL;
        if (map2 == null) {
            map2 = null;
        }
        ArrayList<InboxSearchTabProtocol> arrayList3 = new ArrayList(map2.values());
        C08XD.LJJ(arrayList3, new Comparator() { // from class: X.0iPr
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                InboxSearchTabProtocol inboxSearchTabProtocol = (InboxSearchTabProtocol) obj3;
                InboxSearchTabProtocol inboxSearchTabProtocol2 = (InboxSearchTabProtocol) obj4;
                int iCompareTo = inboxSearchTabProtocol.LJFF().compareTo(inboxSearchTabProtocol2.LJFF());
                if (iCompareTo == 0) {
                    return Intrinsics.LJI(inboxSearchTabProtocol.LJII(), inboxSearchTabProtocol2.LJII());
                }
                return iCompareTo;
            }
        });
        for (InboxSearchTabProtocol inboxSearchTabProtocol : arrayList3) {
            i++;
            C20600815jK.LIZJ(fragmentItemOperator.getState(), new InboxSearchResultFragmentData(i, inboxSearchTabProtocol.LJIIIIZZ()));
            arrayList2.add(inboxSearchTabProtocol.LJIIIIZZ());
            this.LLJJJ.put(inboxSearchTabProtocol.LJIIIIZZ(), Integer.valueOf(i));
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) viewLJJIJL.findViewById(R.id.kjq);
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new AbstractC712240Rwk() { // from class: X.0iPp
                @Override // X.AbstractC712240Rwk
                public final void onPageSelected(int i3) {
                    InboxSearchResultContainer inboxSearchResultContainer = this.LL;
                    if (inboxSearchResultContainer.LLJJJJJIL) {
                        inboxSearchResultContainer.LLJJJJJIL = false;
                        return;
                    }
                    InboxSearchKeyWordAbility inboxSearchKeyWordAbility = (InboxSearchKeyWordAbility) C1558520qew.LIZ(C1558360qeg.LJ(viewLJJIJL, null), InboxSearchKeyWordAbility.class, null);
                    if (inboxSearchKeyWordAbility != null) {
                        inboxSearchKeyWordAbility.Rq();
                    }
                }
            });
        }
        new C1194810hCJ((C1846060y8i) viewLJJIJL.findViewById(R.id.kjr), (ViewOnAttachStateChangeListenerC20631115oD) viewLJJIJL.findViewById(R.id.kjq), true, new InterfaceC1194840hCM() { // from class: X.0hQP
            @Override // X.InterfaceC1194840hCM
            public final void LIZ(C1845940y8W c1845940y8W, int i3) {
                c1845940y8W.LIZIZ((CharSequence) ListProtector.get(arrayList2, i3));
            }
        }).LIZ();
        AssemVMLazy assemVMLazy2 = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJL;
        AssemViewModel value = assemVMLazy2.getValue();
        subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C1241620iPo(this));
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchGenericAbility
    public final void z30(C0PGF c0pgf, String str) {
        if (C0PEK.LIZ[c0pgf.ordinal()] == 1) {
            AssemVMLazy assemVMLazy = this.LLJJIJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
            str = ((InboxSearchVM) assemVMLazy.getValue()).LL;
        }
        if (str != null) {
            AssemVMLazy assemVMLazy2 = this.LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJL;
            ((InboxSearchDefaultVM) assemVMLazy2.getValue()).zQ2(new InboxSearchRecentStoreItem(c0pgf, str, System.currentTimeMillis()));
        }
    }
}
