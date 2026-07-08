package com.ss.android.ugc.aweme.notification.v2.widget.container;

import X.C01GW;
import X.C1273904yf;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1569910qxJ;
import X.C1866160yf8;
import X.C1866170yf9;
import X.C1889180zGG;
import X.C1889200zGI;
import X.C1889360zGY;
import X.C1889410zGd;
import X.C1889440zGg;
import X.C1889450zGh;
import X.C1889530zGp;
import X.C19252910Tv;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1889260zGO;
import X.InterfaceC1889380zGa;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter;
import com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationFragmentInjectProtocol;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import com.ss.android.ugc.aweme.notification.v2.cell.NotificationLoadMoreCell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationPageWidgetContainer extends InboxWidgetContainer implements InterfaceC1889380zGa {
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 820));

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final boolean Vo() {
        return true;
    }

    @Override // X.InterfaceC1889380zGa
    public final InterfaceC1889260zGO bc() {
        return new InterfaceC1889260zGO() { // from class: X.0zGN
            public final EnumC1889240zGM LIZ = EnumC1889240zGM.ACTIVITY;
            public final String LIZIZ = "new_activities";

            @Override // X.InterfaceC1889260zGO
            public final Map<AbstractC1865990yer, Integer> LIZJ() {
                return new HashMap();
            }

            @Override // X.InterfaceC1889260zGO
            public final EnumC1889240zGM LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1889260zGO
            public final String LIZIZ() {
                return this.LIZIZ;
            }
        };
    }

    public NotificationPageWidgetContainer() {
        NotificationFragmentV2.LLJILJIL.getClass();
        C1889530zGp.LIZ("NotificationPageWidgetContainer", "init");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        ArrayList arrayList = new ArrayList(super.Ao());
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("provideDataList(), dataList.size = ");
        sbLIZ.append(arrayList);
        sbLIZ.append(", hasMore = ");
        sbLIZ.append(bo());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ("NotificationPageWidgetContainer", strLIZIZ);
        int i = C1889410zGd.LIZ[bo().ordinal()];
        if (i == 1) {
            arrayList.add(new C1273904yf(new AwS572S0100000_28(this, 451), false));
        } else if (i == 2) {
            arrayList.add(new C1273904yf(new AwS572S0100000_28(this, 452), true));
        }
        return C13LP.LLIIII(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        ArrayList arrayList = new ArrayList(super.Bo());
        arrayList.add(C13LE.LIZ(C1273904yf.class));
        return C13LP.LLIIII(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        C1889180zGG c1889180zGG;
        List<? extends NotificationFragmentInjectProtocol> listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), NotificationFragmentInjectProtocol.class, false);
        if (listLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error: ");
            sbLIZ.append(C1889450zGh.INSTANCE.getMessage());
            C1569910qxJ.LIZ(this, C2188811AlT.LIZIZ(sbLIZ));
            return C13BV.INSTANCE;
        }
        C1889440zGg c1889440zGg = new C1889440zGg();
        c1889440zGg.LIZ = listLIZIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLIZIZ, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (NotificationFragmentInjectProtocol notificationFragmentInjectProtocol : (ArrayList) listLIZIZ) {
            Pair pair = new Pair(notificationFragmentInjectProtocol.identity(), new C1889180zGG(notificationFragmentInjectProtocol.j0(), notificationFragmentInjectProtocol.z0(), notificationFragmentInjectProtocol.identity(), notificationFragmentInjectProtocol.enable()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        c1889440zGg.LIZIZ.getClass();
        ArrayList arrayList = new ArrayList();
        C1889180zGG c1889180zGG2 = (C1889180zGG) linkedHashMap.get(C1866160yf8.LIZIZ);
        if (c1889180zGG2 != null && c1889180zGG2.LIZLLL) {
            c1889180zGG2.LJ = C1889200zGI.LIZ;
            arrayList.add(c1889180zGG2);
        }
        if (!C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJI() && (c1889180zGG = (C1889180zGG) linkedHashMap.get(C1866170yf9.LIZIZ)) != null && c1889180zGG.LIZLLL) {
            arrayList.add(c1889180zGG);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends PowerCell<?>>> fo() {
        ArrayList arrayList = new ArrayList(super.fo());
        arrayList.add(C13LE.LIZ(NotificationLoadMoreCell.class));
        return C13LP.LLIIII(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        NotificationAbilityCenter.INotificationFragmentAbility iNotificationFragmentAbility = (NotificationAbilityCenter.INotificationFragmentAbility) this.LLJILLL.getValue();
        if (iNotificationFragmentAbility != null) {
            iNotificationFragmentAbility.Mv(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final void Zo(InboxWidget inboxWidget) {
        super.Zo(inboxWidget);
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWidgetStatusChange(), widget = ");
        sbLIZ.append(inboxWidget.identity());
        sbLIZ.append(", status = ");
        sbLIZ.append(inboxWidget.ko());
        sbLIZ.append(", page status = ");
        sbLIZ.append(ko());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ("NotificationPageWidgetContainer", strLIZIZ);
        if (Intrinsics.LJFF(ko(), C1889360zGY.LIZ)) {
            List<InterfaceC1891350zJl> listAo = Ao();
            NotificationAbilityCenter.INotificationFragmentAbility iNotificationFragmentAbility = (NotificationAbilityCenter.INotificationFragmentAbility) this.LLJILLL.getValue();
            if (iNotificationFragmentAbility != null) {
                iNotificationFragmentAbility.Pd0(listAo);
                return;
            }
            return;
        }
        NotificationAbilityCenter.INotificationFragmentAbility iNotificationFragmentAbility2 = (NotificationAbilityCenter.INotificationFragmentAbility) this.LLJILLL.getValue();
        if (iNotificationFragmentAbility2 == null) {
            return;
        }
        iNotificationFragmentAbility2.Pd0(C13BV.INSTANCE);
    }
}
