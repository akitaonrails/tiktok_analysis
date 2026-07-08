package com.ss.android.ugc.aweme.im.sdk.unreadindicator;

import X.C13BV;
import X.C13LP;
import X.C1527905yX;
import X.C15438062q;
import X.C1954807lC;
import X.C491201vi;
import X.C869590Y9l;
import X.C880100Yfo;
import X.C910640Zny;
import X.C910680Zo2;
import X.C910730Zo7;
import X.C910740Zo8;
import X.EnumC880090Yfn;
import X.InterfaceC1364105Vn;
import X.InterfaceC910720Zo6;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public abstract class UnreadImportantMsgHandler implements UnreadHandler {
    public final EnumC880090Yfn LL;
    public List<C910730Zo7> LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final boolean HZ0(long j, long j2) {
        return j <= j2;
    }

    public boolean LIZ(String str) {
        return true;
    }

    public final C910740Zo8 LIZJ() {
        C910740Zo8 c910740Zo8;
        Long lValueOf;
        List<C910730Zo7> list = this.LLILLJJLI;
        if (list != null) {
            long size = list.size();
            C910730Zo7 c910730Zo7 = (C910730Zo7) C13LP.LJJLIIIJL(list);
            c910740Zo8 = new C910740Zo8(size, c910730Zo7 != null ? c910730Zo7.LIZIZ : 0L);
            lValueOf = Long.valueOf(c910740Zo8.LIZ);
        } else {
            c910740Zo8 = null;
            lValueOf = null;
        }
        if (C1527905yX.LIZIZ(lValueOf) > 0) {
            return c910740Zo8;
        }
        return null;
    }

    public UnreadImportantMsgHandler(EnumC880090Yfn enumC880090Yfn) {
        this.LL = enumC880090Yfn;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final Object kQ1(InterfaceC910720Zo6 interfaceC910720Zo6, InterfaceC1364105Vn<? super C910740Zo8> interfaceC1364105Vn) {
        List<C869590Y9l> listLIZ;
        if (LIZ(interfaceC910720Zo6.getConversationId()) && (interfaceC910720Zo6 instanceof C491201vi)) {
            if (this.LLILLJJLI == null) {
                C491201vi c491201vi = (C491201vi) interfaceC910720Zo6;
                int i = C880100Yfo.LIZ[this.LL.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        listLIZ = c491201vi.LJ.LIZ();
                        if (listLIZ == null) {
                            listLIZ = C13BV.INSTANCE;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    listLIZ = c491201vi.LIZLLL.LIZ();
                    if (listLIZ == null) {
                        listLIZ = C13BV.INSTANCE;
                    }
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                for (C869590Y9l c869590Y9l : listLIZ) {
                    arrayList.add(new C910730Zo7(c869590Y9l.getMsgId(), c869590Y9l.getIndex()));
                }
                this.LLILLJJLI = arrayList;
            }
            return LIZJ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final C910680Zo2 nz1(MessageListScrollAbility messageListScrollAbility, C910740Zo8 c910740Zo8) {
        return C910640Zny.LIZIZ(this, c910740Zo8, messageListScrollAbility);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final Object mN1(long j, InterfaceC910720Zo6 interfaceC910720Zo6, MessageListScrollAbility messageListScrollAbility, InterfaceC1364105Vn<? super C910680Zo2> interfaceC1364105Vn) {
        return C910640Zny.LIZ(this, j, interfaceC910720Zo6, messageListScrollAbility, interfaceC1364105Vn);
    }
}
