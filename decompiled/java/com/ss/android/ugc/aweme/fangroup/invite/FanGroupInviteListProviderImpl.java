package com.ss.android.ugc.aweme.fangroup.invite;

import X.C01GW;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.selector.choosegroup.api.IFanGroupInviteListProvider;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class FanGroupInviteListProviderImpl implements IFanGroupInviteListProvider {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(69));

    @Override // com.ss.android.ugc.aweme.selector.choosegroup.api.IFanGroupInviteListProvider
    public final View LIZIZ(Context context, ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dct, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // com.ss.android.ugc.aweme.selector.choosegroup.api.IFanGroupInviteListProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r7, long r9, X.InterfaceC1364105Vn<? super webcast.api.fans.FansGetGroupInviteListResponse.Data> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C21171817tE
            if (r0 == 0) goto L25
            r5 = r11
            X.17tE r5 = (X.C21171817tE) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L2b
            long r9 = r5.LLILLJJLI
            long r7 = r5.LL
            goto L56
        L25:
            X.17tE r5 = new X.17tE
            r5.<init>(r6, r11)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L62
            com.ss.android.ugc.aweme.fangroup.invite.FansGroupInviteApi r1 = (com.ss.android.ugc.aweme.fangroup.invite.FansGroupInviteApi) r1     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L7d
            webcast.api.fans.FansGetGroupInviteListRequest r0 = new webcast.api.fans.FansGetGroupInviteListRequest     // Catch: java.lang.Throwable -> L62
            r0.<init>()     // Catch: java.lang.Throwable -> L62
            r0.anchorId = r7     // Catch: java.lang.Throwable -> L62
            r0.targetUserId = r9     // Catch: java.lang.Throwable -> L62
            r5.LL = r7     // Catch: java.lang.Throwable -> L62
            r5.LLILLJJLI = r9     // Catch: java.lang.Throwable -> L62
            r5.LLILZIL = r2     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r1.getInviteGroupList(r0, r5)     // Catch: java.lang.Throwable -> L62
            if (r1 != r4) goto L59
            return r4
        L56:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L62
        L59:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L7d
            T r0 = r1.data     // Catch: java.lang.Throwable -> L62
            webcast.api.fans.FansGetGroupInviteListResponse$Data r0 = (webcast.api.fans.FansGetGroupInviteListResponse.Data) r0     // Catch: java.lang.Throwable -> L62
            return r0
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchInviteGroupList failed creatorUid="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " targetUserId="
            r1.append(r0)
            r1.append(r9)
            X.C2188811AlT.LIZIZ(r1)
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fangroup.invite.FanGroupInviteListProviderImpl.LIZ(long, long, X.05Vn):java.lang.Object");
    }
}
