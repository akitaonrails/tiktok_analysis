package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.C0NBD;
import X.C0ZAY;
import X.C0ZAZ;
import X.C1599780rjU;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C889330Yuh;
import X.C889930Yvf;
import X.C890330YwJ;
import X.C892510Yzp;
import X.C895240ZAc;
import X.InterfaceC0148002o;
import Y.ARunnableS114S0100000_14;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS122S0101000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ArchiveEntranceViewModel extends AssemViewModel<C0ZAY> {
    public C892510Yzp LL;
    public C892510Yzp LLILLJJLI;
    public boolean LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0ZAY(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C889330Yuh(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(X.C892510Yzp r24, X.C892510Yzp r25) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.ArchiveEntranceViewModel.xQ2(X.0Yzp, X.0Yzp):void");
    }

    public final void wQ2(C895240ZAc c895240ZAc, int i, String str) {
        if (i == 50) {
            C0ZAZ.LIZ.getClass();
            ((Keva) C0ZAZ.LIZIZ.getValue()).storeBoolean(C0ZAZ.LIZ(), true);
            IMChatListApi.LJJIII.getClass();
            C890330YwJ.LIZ().LIZIZ().LJI(str, "switch_on", "pin_to_top");
        } else {
            C0ZAZ.LIZ.getClass();
            ((Keva) C0ZAZ.LIZIZ.getValue()).erase(C0ZAZ.LIZ());
            IMChatListApi.LJJIII.getClass();
            C890330YwJ.LIZ().LIZIZ().LJI(str, "switch_off", "pin_to_top");
        }
        if (c895240ZAc == null) {
            return;
        }
        setState(new AwS122S0101000_14(c895240ZAc, i, 0));
    }

    public static void vQ2(String str, String str2, C895240ZAc c895240ZAc, Integer num) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "notification_page"), new Pair("action_type", str), new Pair("cell_type", "archive"), new Pair("type", str2));
        Map<String, String> map = c895240ZAc.LLIZLLLIL;
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        if (num != null) {
            mapLJIIJ.put("client_order", String.valueOf(num.intValue()));
        }
        mapLJIIJ.put("inbox_mode", C889930Yvf.LIZ.LIZJ().getMobValue());
        String str3 = C0NBD.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        mapLJIIJ.put("inbox_session_id", str3);
        mapLJIIJ.put("is_first_screen", String.valueOf(C1599780rjU.LIZ.LIZJ("archive_entrance")));
        C20684815ws.LJFF().execute(new ARunnableS114S0100000_14(mapLJIIJ, 22));
    }
}
