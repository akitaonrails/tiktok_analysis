package com.ss.android.ugc.aweme.inbox.v2.container;

import X.AbstractC1865990yer;
import X.C0ZAN;
import X.C0ZAO;
import X.C0ZAP;
import X.C0ZAR;
import X.C1231704rr;
import X.C13BV;
import X.C15438062q;
import X.C1889140zGC;
import X.C1889180zGG;
import X.C1889340zGW;
import X.C1889360zGY;
import X.C2188811AlT;
import X.C296850BkJ;
import X.C890330YwJ;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TopBannerWidgetContainer extends InboxWidgetContainer {
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        C1231704rr c1231704rr = C0ZAR.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopBannerWidgetContainer provideDataList bbGuideWidgetShown = ");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" ageGraduationShown = ");
        sbLIZ.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        IMChatListApi.LJJIII.getClass();
        if (C890330YwJ.LIZ().LJIJI()) {
            if (!this.LLJJI) {
                c1231704rr.LIZIZ();
                return C13BV.INSTANCE;
            }
            InboxWidget inboxWidgetLo = Lo(C0ZAO.LIZIZ);
            if (inboxWidgetLo != null && (Intrinsics.LJFF(inboxWidgetLo.ko(), C1889360zGY.LIZ) || Intrinsics.LJFF(inboxWidgetLo.ko(), C1889340zGW.LIZ))) {
                c1231704rr.LIZIZ();
                return inboxWidgetLo.Ao();
            }
        }
        if (!this.LLJILLL) {
            c1231704rr.LIZIZ();
            return C13BV.INSTANCE;
        }
        InboxWidget inboxWidgetLo2 = Lo(C0ZAN.LIZIZ);
        if (inboxWidgetLo2 != null && Intrinsics.LJFF(inboxWidgetLo2.ko(), C1889360zGY.LIZ)) {
            c1231704rr.LIZIZ();
            return inboxWidgetLo2.Ao();
        }
        InboxWidget inboxWidgetLo3 = Lo(C0ZAP.LIZIZ);
        if (inboxWidgetLo3 == null || !Intrinsics.LJFF(inboxWidgetLo3.ko(), C1889360zGY.LIZ)) {
            return C13BV.INSTANCE;
        }
        c1231704rr.LIZIZ();
        return inboxWidgetLo3.Ao();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        ArrayList arrayList = new ArrayList();
        Map mapLJI = C296850BkJ.LIZ() ? C1889140zGC.LIZ.LJI(this) : C1889140zGC.LIZ.LJFF();
        C1889180zGG c1889180zGG = mapLJI.get(C0ZAO.LIZIZ);
        if (c1889180zGG != null && c1889180zGG.LIZLLL) {
            arrayList.add(c1889180zGG);
        }
        C1889180zGG c1889180zGG2 = mapLJI.get(C0ZAN.LIZIZ);
        if (c1889180zGG2 != null && c1889180zGG2.LIZLLL) {
            arrayList.add(c1889180zGG2);
        }
        C1889180zGG c1889180zGG3 = mapLJI.get(C0ZAP.LIZIZ);
        if (c1889180zGG3 != null && c1889180zGG3.LIZLLL) {
            arrayList.add(c1889180zGG3);
        }
        C1231704rr c1231704rr = C0ZAR.LIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getClass().getSimpleName());
        }
        arrayList2.toString();
        c1231704rr.LIZIZ();
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final void Zo(InboxWidget inboxWidget) {
        C1231704rr c1231704rr = C0ZAR.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopBannerWidgetContainer onWidgetStatusChange widget = ");
        sbLIZ.append(inboxWidget.getClass().getSimpleName());
        sbLIZ.append(" widgetStatus = ");
        sbLIZ.append(inboxWidget.ko());
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        AbstractC1865990yer abstractC1865990yerIdentity = inboxWidget.identity();
        if (Intrinsics.LJFF(abstractC1865990yerIdentity, C0ZAO.LIZIZ)) {
            this.LLJJIII = Intrinsics.LJFF(inboxWidget.ko(), C1889360zGY.LIZ);
            this.LLJJI = true;
            super.Zo(inboxWidget);
        } else {
            if (Intrinsics.LJFF(abstractC1865990yerIdentity, C0ZAN.LIZIZ)) {
                this.LLJILLL = true;
                if (this.LLJJIII || !this.LLJJI) {
                    return;
                }
                this.LLJJ = Intrinsics.LJFF(inboxWidget.ko(), C1889360zGY.LIZ);
                super.Zo(inboxWidget);
                return;
            }
            if (!Intrinsics.LJFF(abstractC1865990yerIdentity, C0ZAP.LIZIZ) || this.LLJJ || !this.LLJILLL) {
                return;
            }
            super.Zo(inboxWidget);
        }
    }
}
