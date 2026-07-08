package com.ss.android.ugc.aweme.inbox.followerv2;

import X.AbstractC1865990yer;
import X.C01GW;
import X.C1273904yf;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1559260qg8;
import X.C1569910qxJ;
import X.C1866140yf6;
import X.C1866180yfA;
import X.C1869660ykm;
import X.C1889180zGG;
import X.C1889200zGI;
import X.C1889220zGK;
import X.C1889420zGe;
import X.C1889430zGf;
import X.C1889450zGh;
import X.C1889750zHB;
import X.C1901350zZt;
import X.C19252910Tv;
import X.C2188811AlT;
import X.C452501pT;
import X.C723580SZw;
import X.EnumC1889540zGq;
import X.EnumC1901360zZu;
import X.InterfaceC1889260zGO;
import X.InterfaceC1889380zGa;
import X.InterfaceC1889460zGi;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility;
import com.ss.android.ugc.aweme.notification.v2.cell.NotificationLoadMoreCell;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowerPageWidgetContainer extends InboxWidgetContainer implements InterfaceC1889380zGa, InterfaceC1889460zGi {
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 235));
    public final C1559260qg8 LLJJ = new C1559260qg8(new C723580SZw(this, C1869660ykm.class, "notification_follower_fragment_model"), checkSupervisorPrepared());
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 238));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 239));

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        C1889180zGG c1889180zGG;
        Map<AbstractC1865990yer, C1889180zGG> map = (Map) this.LLJJIII.getValue();
        if (map == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error: ");
            sbLIZ.append(C1889450zGh.INSTANCE.getMessage());
            C1569910qxJ.LIZ(this, C2188811AlT.LIZIZ(sbLIZ));
            return C13BV.INSTANCE;
        }
        C1889430zGf c1889430zGf = new C1889430zGf();
        c1889430zGf.LIZ = map;
        c1889430zGf.LIZIZ.getClass();
        ArrayList arrayList = new ArrayList();
        C1889180zGG c1889180zGG2 = map.get(C1866180yfA.LIZIZ);
        if (c1889180zGG2 != null && c1889180zGG2.LIZLLL) {
            c1889180zGG2.LJ = C1889200zGI.LIZ;
            arrayList.add(c1889180zGG2);
        }
        if (!C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJI() && (c1889180zGG = map.get(C1866140yf6.LIZIZ)) != null && c1889180zGG.LIZLLL) {
            arrayList.add(c1889180zGG);
        }
        return arrayList;
    }

    @Override // X.InterfaceC1889380zGa
    public final InterfaceC1889260zGO bc() {
        return (C1889220zGK) this.LLJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        ArrayList arrayList = new ArrayList(super.Ao());
        int i = C1889420zGe.LIZ[bo().ordinal()];
        if (i == 1) {
            arrayList.add(new C1273904yf(new AwS572S0100000_28(this, 236), false));
            return arrayList;
        }
        if (i == 2) {
            arrayList.add(new C1273904yf(new AwS572S0100000_28(this, 237), true));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        ArrayList arrayList = new ArrayList(super.Bo());
        arrayList.add(C13LE.LIZ(C1273904yf.class));
        return arrayList;
    }

    @Override // X.InterfaceC1889460zGi
    public final void LLLILZLLLI() {
        InterfaceC1889460zGi interfaceC1889460zGi;
        for (InterfaceC665370Q7z interfaceC665370Q7z : Jo()) {
            if ((interfaceC665370Q7z instanceof InterfaceC1889460zGi) && (interfaceC1889460zGi = (InterfaceC1889460zGi) interfaceC665370Q7z) != null) {
                interfaceC1889460zGi.LLLILZLLLI();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends PowerCell<?>>> fo() {
        ArrayList arrayList = new ArrayList(super.fo());
        arrayList.add(C13LE.LIZ(NotificationLoadMoreCell.class));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        FollowerPageAbilityCenter$IFollowerFragmentAbility followerPageAbilityCenter$IFollowerFragmentAbility = (FollowerPageAbilityCenter$IFollowerFragmentAbility) this.LLJILLL.getValue();
        if (followerPageAbilityCenter$IFollowerFragmentAbility != null) {
            followerPageAbilityCenter$IFollowerFragmentAbility.Mv(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final void Zo(InboxWidget inboxWidget) {
        FollowerPageAbilityCenter$IFollowerFragmentAbility followerPageAbilityCenter$IFollowerFragmentAbility;
        super.Zo(inboxWidget);
        List<InterfaceC1891350zJl> listAo = Ao();
        C1901350zZt c1901350zZt = C1901350zZt.LIZ;
        int size = ((ArrayList) C1889750zHB.LIZ(listAo)).size();
        c1901350zZt.getClass();
        if (C1901350zZt.LIZJ()) {
            EnumC1901360zZu.LLJILJIL.LIZJ();
            EnumC1901360zZu.LLJILJILJ.LJI(size);
        }
        if (ko().isShow() && (followerPageAbilityCenter$IFollowerFragmentAbility = (FollowerPageAbilityCenter$IFollowerFragmentAbility) this.LLJILLL.getValue()) != null) {
            followerPageAbilityCenter$IFollowerFragmentAbility.zP0(EnumC1889540zGq.SHOW_SUCCESS, listAo);
        }
    }

    @Override // X.InterfaceC1889460zGi
    public final void onPageSelected(int i) {
        InterfaceC1889460zGi interfaceC1889460zGi;
        for (InterfaceC665370Q7z interfaceC665370Q7z : Jo()) {
            if ((interfaceC665370Q7z instanceof InterfaceC1889460zGi) && (interfaceC1889460zGi = (InterfaceC1889460zGi) interfaceC665370Q7z) != null) {
                interfaceC1889460zGi.onPageSelected(i);
            }
        }
    }
}
