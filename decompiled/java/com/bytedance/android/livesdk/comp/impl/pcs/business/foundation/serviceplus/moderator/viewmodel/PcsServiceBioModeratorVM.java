package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.moderator.viewmodel;

import X.C09JN;
import X.C0JL3;
import X.C0JLC;
import X.C0JLJ;
import X.C1554960qZC;
import X.C1701940uOG;
import X.C1822490xWh;
import X.C1823250xXv;
import X.C1823280xXy;
import X.C930940aKi;
import X.EnumC1822480xWg;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.moderator.viewmodel.PcsServiceBioModeratorVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Pair;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsServiceBioModeratorVM extends AssemViewModel<C0JLJ> {
    public InterfaceC665370Q7z LL;
    public C0JL3 LLILLJJLI;
    public final C1823250xXv LLILLL = new C1823250xXv(new C1822490xWh());

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JLJ(0);
    }

    public final void vQ2() {
        final String secUid;
        User owner;
        String string;
        C0JLC c0jlc;
        String str;
        C0JLC c0jlc2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C0JL3 c0jl3WQ2 = wQ2();
        final String str2 = "";
        if ((c0jl3WQ2 == null || (c0jlc2 = c0jl3WQ2.LL) == null || (secUid = c0jlc2.LIZIZ) == null) && (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null)) {
            secUid = "";
        }
        C0JL3 c0jl3WQ22 = wQ2();
        if (c0jl3WQ22 != null && (c0jlc = c0jl3WQ22.LL) != null && (str = c0jlc.LIZLLL) != null) {
            str2 = str;
        } else if (room != null && (string = Long.valueOf(room.getId()).toString()) != null) {
            str2 = string;
        }
        this.LLILLL.LIZJ(new C1823280xXy(secUid, str2, false, EnumC1822480xWg.IGNORE_CACHE)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0Jxj
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PcsServiceBioModeratorVM@31cd.fetchServicePlusPreview$1");
                AbstractC509020Jxk abstractC509020Jxk = (AbstractC509020Jxk) obj;
                if (abstractC509020Jxk instanceof C509040Jxm) {
                    this.LL.setState(new C0JLG());
                } else if (abstractC509020Jxk instanceof C509030Jxl) {
                    SMBPreviewResponse.ResponseData responseData = ((C509030Jxl) abstractC509020Jxk).LIZ.LIZ;
                    PcsServiceBioModeratorVM pcsServiceBioModeratorVM = this.LL;
                    String str3 = secUid;
                    String str4 = str2;
                    pcsServiceBioModeratorVM.getClass();
                    C1103520ep4.LIZ.LJFF(str3, str4, new C1822320xWQ(responseData));
                    C1106750euH.LIZ.LJIILL(new C1100630ekP(C0KA3.LIZ), C2097608Jq.LJIIIIZZ(new Pair("sec_anchor_id", str3), new Pair("room_id", str4)), responseData, "/webcast/sub/smb/preview/");
                    this.LL.setState(new C0JLH(responseData));
                } else if (abstractC509020Jxk instanceof C490400JLa) {
                    this.LL.setState(new C0JLP(abstractC509020Jxk));
                } else {
                    throw new C1954807lC();
                }
                C1C7U.LIZIZ("PcsServiceBioModeratorVM@31cd.fetchServicePlusPreview$1");
            }
        }, new C09JN() { // from class: X.0JLO
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PcsServiceBioModeratorVM@31cd.fetchServicePlusPreview$2");
                this.LL.setState(new C0JLN((Throwable) obj));
                C1C7U.LIZIZ("PcsServiceBioModeratorVM@31cd.fetchServicePlusPreview$2");
            }
        });
    }

    public final C0JL3 wQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            C0JL3 c0jl3 = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0JL3.class, null)) != null) {
                c0jl3 = (C0JL3) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLJJLI = c0jl3;
        }
        return this.LLILLJJLI;
    }
}
