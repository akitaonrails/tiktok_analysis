package com.ss.android.ugc.aweme.inbox.search.assem;

import X.AbstractC1240270iNd;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C08XD;
import X.C09R3;
import X.C1241420iPU;
import X.C13BV;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1720106oR;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736820SvI;
import X.EnumC1154650g9X;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS46S0100000_19;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxGeneralSearchCell;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchFooterCell;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchHeaderCell;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultAllTabVM;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchAllTabListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final Map<String, Set<String>> LLJJIJI;
    public long LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxSearchAllTabListAssem.class, "resultViewModel", "getResultViewModel()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchResultAllTabVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(InboxSearchAllTabListAssem.class, "searchKeyWordVM", "getSearchKeyWordVM()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchVM;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public InboxSearchAllTabListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxSearchResultAllTabVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 1548), AFwS257S0000000_19.get$arr$(189), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InboxSearchVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 1549), AFwS257S0000000_19.get$arr$(190), null, true);
        this.LLJJIJI = new LinkedHashMap();
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1547));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a_f;
    }

    public final InboxSearchResultAllTabVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (InboxSearchResultAllTabVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ArrayList<InboxSearchPowerChunkProtocol> arrayList;
        Integer numValueOf;
        super.onViewCreated(view);
        ((RecyclerView) view.findViewById(R.id.kj8)).addOnScrollListener(new AsS46S0100000_19(this, 6));
        ((PowerAdapter) ((RecyclerView) view.findViewById(R.id.kj8)).getAdapter()).LLLLII(new AbstractC1240270iNd() { // from class: X.0iPU
            @Override // X.AbstractC1240270iNd
            public final void LIZ(String str, Map map) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("InboxSearchAllTabListAssem", "reportClickEvent");
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("position", "result");
                linkedHashMap.put("tab_name", "all");
                if (str != null) {
                    linkedHashMap.put("action", str);
                }
                C1241460iPY.LIZ.getClass();
                C1241460iPY.LIZJ(linkedHashMap);
                C1241460iPY.LJIIIZ(EnumC1241340iPM.RESULT);
            }

            @Override // X.AbstractC1240270iNd
            public final void LIZIZ(String str, String str2, Map<String, String> map) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reportShowEvent() - tabName = ");
                sbLIZ.append(str);
                sbLIZ.append(", uniqueId = ");
                sbLIZ.append(str2);
                C1720106oR.LJI("InboxSearchAllTabListAssem", C2188811AlT.LIZIZ(sbLIZ));
                if (!this.LL.LLJJIJI.containsKey(str)) {
                    this.LL.LLJJIJI.put(str, new LinkedHashSet());
                }
                Set set = (Set) ((LinkedHashMap) this.LL.LLJJIJI).get(str);
                if (set != null) {
                    if (set.contains(str2)) {
                        return;
                    } else {
                        set.add(str2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("position", "result");
                linkedHashMap.put("tab_name", "all");
                C1241460iPY.LIZ.getClass();
                C1241460iPY.LIZLLL(linkedHashMap);
            }
        }, C1241420iPU.class);
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), InboxSearchPowerChunkProtocol.class, false);
        if (listLIZIZ != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                if (((InboxSearchPowerChunkProtocol) obj).LJ()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        InboxSearchResultAllTabVM inboxSearchResultAllTabVMHp = hp();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doInit() - protocols.size = ");
        if (arrayList != null) {
            numValueOf = Integer.valueOf(arrayList.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1720106oR.LJI("InboxSearchResultAllTabVM", C2188811AlT.LIZIZ(sbLIZ));
        if (arrayList != null) {
            for (InboxSearchPowerChunkProtocol inboxSearchPowerChunkProtocol : arrayList) {
                ((ArrayList) inboxSearchResultAllTabVMHp.LLILLL).add(inboxSearchPowerChunkProtocol);
                if (inboxSearchPowerChunkProtocol.LIZJ() == EnumC1154650g9X.LOCAL) {
                    ((ArrayList) inboxSearchResultAllTabVMHp.LLILZ).add(inboxSearchPowerChunkProtocol);
                    inboxSearchResultAllTabVMHp.LLJ++;
                    inboxSearchResultAllTabVMHp.LLILZLL.put(inboxSearchPowerChunkProtocol.LJIIIZ(), C13BV.INSTANCE);
                } else {
                    ((ArrayList) inboxSearchResultAllTabVMHp.LLILZIL).add(inboxSearchPowerChunkProtocol);
                }
            }
        }
        C08XD.LJJ(inboxSearchResultAllTabVMHp.LLILLL, new Comparator() { // from class: X.0iPx
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                InboxSearchPowerChunkProtocol inboxSearchPowerChunkProtocol2 = (InboxSearchPowerChunkProtocol) obj2;
                InboxSearchPowerChunkProtocol inboxSearchPowerChunkProtocol3 = (InboxSearchPowerChunkProtocol) obj3;
                int iCompareTo = inboxSearchPowerChunkProtocol2.LJFF().compareTo(inboxSearchPowerChunkProtocol3.LJFF());
                if (iCompareTo == 0) {
                    return Intrinsics.LJI(inboxSearchPowerChunkProtocol2.LJII(), inboxSearchPowerChunkProtocol3.LJII());
                }
                return iCompareTo;
            }
        });
        ((RecyclerView) view.findViewById(R.id.kj8)).setItemAnimator(null);
        if (arrayList != null) {
            for (InboxSearchPowerChunkProtocol inboxSearchPowerChunkProtocol2 : arrayList) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.kj8);
                Class[] clsArr = (Class[]) inboxSearchPowerChunkProtocol2.LIZ().toArray(new Class[0]);
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
        }
        ((ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.kj8)).LJIILJJIL(InboxSearchHeaderCell.class, InboxSearchFooterCell.class, InboxGeneralSearchCell.class);
        InboxSearchResultAllTabVM inboxSearchResultAllTabVMHp2 = hp();
        subscribe(inboxSearchResultAllTabVMHp2, C736820SvI.LIZIZ(inboxSearchResultAllTabVMHp2.usedInReusedScene), null, new AwS455S0200000_19(view, this, 6));
    }
}
