package com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel;

import X.C09YA;
import X.C0PEM;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C478720Ipy;
import X.C478820Iq8;
import X.EnumC479370Ir1;
import X.InterfaceC0148002o;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class HangoutRoomFeedViewModel extends AssemViewModel<C478820Iq8> {
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>(Boolean.FALSE);
    public final C09YA LLILLJJLI = new C09YA(this, AFwS193S0000000_7.get$arr$(136));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C478820Iq8(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String vQ2(int r8) {
        /*
            r7 = this;
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveParmasConfigSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveParmasConfigSetting.INSTANCE
            java.lang.String r6 = r0.getTopLivePageEnterFrom()
            java.lang.String r5 = r0.getFeedCardEnterMethodV2()
            r0 = 1
            if (r8 == r0) goto L43
            r0 = 2
            if (r8 == r0) goto L40
            r0 = 3
            if (r8 != r0) goto L43
            java.lang.String r4 = "_preload"
        L15:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            X.0ISY r2 = com.bytedance.android.livesdk.live.model.LiveFeedDraw.Companion
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            r0 = 95
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            java.lang.String r0 = X.C0ISY.LIZIZ(r0)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            return r0
        L40:
            java.lang.String r4 = "_loadmore"
            goto L15
        L43:
            java.lang.String r4 = "_refresh"
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.HangoutRoomFeedViewModel.vQ2(int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf A[Catch: Exception -> 0x01a2, TryCatch #3 {Exception -> 0x01a2, blocks: (B:33:0x00ba, B:34:0x00bd, B:36:0x00c3, B:42:0x00cf, B:44:0x00fa, B:46:0x00fe, B:47:0x0107, B:49:0x0113, B:51:0x0120, B:52:0x0128, B:54:0x015c, B:56:0x0160, B:57:0x0169, B:61:0x0172, B:63:0x0176, B:64:0x017d, B:66:0x0181, B:67:0x0183, B:69:0x018b, B:70:0x0193), top: B:98:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113 A[Catch: Exception -> 0x01a2, TryCatch #3 {Exception -> 0x01a2, blocks: (B:33:0x00ba, B:34:0x00bd, B:36:0x00c3, B:42:0x00cf, B:44:0x00fa, B:46:0x00fe, B:47:0x0107, B:49:0x0113, B:51:0x0120, B:52:0x0128, B:54:0x015c, B:56:0x0160, B:57:0x0169, B:61:0x0172, B:63:0x0176, B:64:0x017d, B:66:0x0181, B:67:0x0183, B:69:0x018b, B:70:0x0193), top: B:98:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.EnumC479370Ir1 r24, java.lang.String r25, X.InterfaceC1364105Vn<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.HangoutRoomFeedViewModel.wQ2(X.0Ir1, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void xQ2(EnumC479370Ir1 enumC479370Ir1, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshPlayFeedData: scene=");
        sbLIZ.append(enumC479370Ir1);
        sbLIZ.append(", forceRefresh=");
        sbLIZ.append(true);
        C20441214yg.LIZIZ("HangoutRoomFeedVM", C2188811AlT.LIZIZ(sbLIZ));
        if (getState().LLILLL) {
            C20441214yg.LIZIZ("HangoutRoomFeedVM", "refreshPlayFeedData: already loading, skip");
        } else {
            setState(AFwS237S0000000_7.get$arr$(92));
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C478720Ipy(this, enumC479370Ir1, str, null), 2);
        }
    }
}
