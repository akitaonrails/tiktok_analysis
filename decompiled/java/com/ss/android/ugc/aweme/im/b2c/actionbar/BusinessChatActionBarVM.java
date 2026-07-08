package com.ss.android.ugc.aweme.im.b2c.actionbar;

import X.C01GW;
import X.C0I0B;
import X.C1548820qPI;
import X.C1559260qg8;
import X.C1745106sT;
import X.C1763606vS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C262100zr;
import X.C452501pT;
import X.C457780HxI;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS116S1100000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessChatActionBarVM extends AssemViewModel<C1763606vS> implements InterfaceC1141530foN {
    public boolean LLILLJJLI;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 301));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1763606vS(null, null);
    }

    public final C1745106sT wQ2() {
        return (C1745106sT) this.LLILZ.getValue();
    }

    public final SessionInfo xQ2() {
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        if (c457780HxI != null) {
            return c457780HxI.LL;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.LLILLJJLI) {
            C1548820qPI.LJIIIIZZ("chat_room_form_card_submitted", this);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        String string2;
        if (Intrinsics.LJFF(c262100zr.LIZ, "chat_room_form_card_submitted")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && (string2 = interfaceC1107590evd.getString("enter_from")) != null) {
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("set_by", "advertiser"), new Pair("position", string2));
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("form_card_submit", mapLJIIIIZZ);
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null && (string = interfaceC1107590evd2.getString("pageId")) != null) {
                setState(new AwS116S1100000_2(string, this, 2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8 A[Catch: Exception -> 0x0153, TryCatch #0 {Exception -> 0x0153, blocks: (B:40:0x0084, B:41:0x0087, B:43:0x008b, B:45:0x0091, B:49:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00ab, B:56:0x00b3, B:57:0x00b5, B:67:0x00c8, B:69:0x00ce, B:71:0x00d4, B:74:0x00dd, B:76:0x00e5, B:77:0x00f4, B:79:0x00fa, B:81:0x0108, B:83:0x010c, B:84:0x0112, B:85:0x0122, B:91:0x012e, B:93:0x0132, B:94:0x0139, B:15:0x0039, B:17:0x0041, B:20:0x0048, B:22:0x004e, B:23:0x0052, B:25:0x005d, B:27:0x0063, B:37:0x0076), top: B:99:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarVM.vQ2(X.05Vn):java.lang.Object");
    }
}
