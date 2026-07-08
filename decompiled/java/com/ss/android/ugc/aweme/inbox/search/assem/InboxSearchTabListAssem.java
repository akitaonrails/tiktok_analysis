package com.ss.android.ugc.aweme.inbox.search.assem;

import X.AbstractC1240270iNd;
import X.C019F;
import X.C01GW;
import X.C0PD6;
import X.C1241430iPV;
import X.C13BV;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C20607315kN;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS46S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchTabListAssem extends UIListContentAssem<InboxSearchResultListVM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C1559260qg8 LLJI;
    public final Set<String> LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxSearchTabListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchResultListVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InboxSearchTabListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxSearchResultListVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1562), AFwS257S0000000_19.get$arr$(198), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1561));
        this.LLJI = new C1559260qg8(new C723590SZx(this, C0PD6.class, "fragment info key"), checkSupervisorPrepared());
        this.LLJIJIL = new LinkedHashSet();
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1560));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 2;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        List<Class<? extends PowerCell<?>>> listLIZ;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        InboxSearchTabProtocol inboxSearchTabProtocol = ((InboxSearchResultListVM) assemVMLazy.getValue()).LL;
        if (inboxSearchTabProtocol == null || (listLIZ = inboxSearchTabProtocol.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        Class[] clsArr = (Class[]) listLIZ.toArray(new Class[0]);
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        Go().setItemAnimator(null);
        Go().LJII(new C20607315kN() { // from class: X.0iPt
            @Override // X.C20607315kN
            public final void LJIIIIZZ() {
                this.LL.LLJIJIL.clear();
            }
        });
        Go().addOnScrollListener(new AsS46S0100000_19(this, 8));
        ((PowerAdapter) Go().getAdapter()).LLLLII(new AbstractC1240270iNd() { // from class: X.0iPV
            @Override // X.AbstractC1240270iNd
            public final void LIZ(String str, Map map) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("position", "result");
                linkedHashMap.put("tab_name", ((C0PD6) this.LL.LLJI.getValue()).LLILLJJLI);
                if (str != null) {
                    linkedHashMap.put("action", str);
                }
                C1241460iPY.LIZ.getClass();
                C1241460iPY.LIZJ(linkedHashMap);
                C1241460iPY.LJIIIZ(EnumC1241340iPM.RESULT);
            }

            @Override // X.AbstractC1240270iNd
            public final void LIZIZ(String str, String str2, Map<String, String> map) {
                if (this.LL.LLJIJIL.contains(str2)) {
                    return;
                }
                this.LL.LLJIJIL.add(str2);
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("position", "result");
                linkedHashMap.put("tab_name", ((C0PD6) this.LL.LLJI.getValue()).LLILLJJLI);
                C1241460iPY.LIZ.getClass();
                C1241460iPY.LIZLLL(linkedHashMap);
            }
        }, C1241430iPV.class);
    }
}
