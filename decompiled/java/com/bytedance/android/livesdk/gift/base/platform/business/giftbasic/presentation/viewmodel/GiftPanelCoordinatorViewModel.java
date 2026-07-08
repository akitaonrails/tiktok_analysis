package com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C01GW;
import X.C09IC;
import X.C1125130fNv;
import X.C1129080fUI;
import X.C1129140fUO;
import X.C1129150fUP;
import X.C1129270fUb;
import X.C1129350fUj;
import X.C1130100fVw;
import X.C1131900fYq;
import X.C1151890g55;
import X.C1885707a3;
import X.C1BNE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C452501pT;
import X.C497740JfY;
import X.EnumC1129600fV8;
import X.InterfaceC1130090fVv;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftPanelCoordinatorViewModel extends ViewModel {
    public final InterfaceC1130090fVv LL;
    public final C2252321DDq LLILLJJLI;
    public final AnonymousClass0951 LLILLL;
    public final C01GW LLILZ;
    public C1125130fNv LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public AnonymousClass0956 LLIZ;
    public final AtomicLong LLIZLLLIL;
    public long LLJ;
    public final C1151890g55 LLJI;
    public final AtomicLong LLJIJIL;

    public final C1129080fUI yQ2() {
        String str;
        C1125130fNv c1125130fNv = this.LLILZIL;
        C1129080fUI c1129080fUI = c1125130fNv.LIZ;
        if (c1129080fUI != null) {
            return c1129080fUI;
        }
        long jLIZ = c1125130fNv.LIZ();
        C1129080fUI c1129080fUI2 = c1125130fNv.LIZ;
        long j = c1129080fUI2 != null ? c1129080fUI2.LIZIZ : 0L;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        C1129080fUI c1129080fUI3 = c1125130fNv.LIZ;
        boolean z = currentUserId == (c1129080fUI3 != null ? c1129080fUI3.LIZIZ : 0L);
        if (c1129080fUI3 == null || (str = c1129080fUI3.LIZJ) == null) {
            str = "";
        }
        return new C1129080fUI(jLIZ, j, str, 0L, z, (Long) null, (Integer) null, (Room) null, (C1885707a3) null, (C1129270fUb) null, (C1129350fUj) null, 4072);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLIZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LL.LIZLLL(this.LLILZIL.LIZ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Coordinator] onCleared - roomId=");
        sbLIZ.append(this.LLILZIL.LIZ());
        C20441214yg.LJIIIZ("GiftPanel.Coord", C2188811AlT.LIZIZ(sbLIZ));
    }

    public GiftPanelCoordinatorViewModel(InterfaceC1130090fVv interfaceC1130090fVv) {
        this.LL = interfaceC1130090fVv;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1129150fUP(0));
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLILZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 138));
        this.LLILZIL = new C1125130fNv(null);
        this.LLIZLLLIL = new AtomicLong(0L);
        this.LLJI = new C1151890g55(CoroutineExceptionHandler.LJJLIL, 1);
        this.LLJIJIL = new AtomicLong(0L);
    }

    public final void zQ2(Function1<? super C1129150fUP, C1129150fUP> function1) {
        Object value;
        C2252321DDq c2252321DDq = this.LLILLJJLI;
        long jIncrementAndGet = 0;
        do {
            value = c2252321DDq.getValue();
            if (jIncrementAndGet == 0) {
                jIncrementAndGet = this.LLJIJIL.incrementAndGet();
            }
        } while (!c2252321DDq.compareAndSet(value, C1129150fUP.LIZ(function1.invoke(value), null, null, 0, null, null, null, false, 0, null, 0, null, jIncrementAndGet, 2047)));
    }

    public final void vQ2(C1129140fUO c1129140fUO, EnumC1129600fV8 enumC1129600fV8) {
        zQ2(new AwS383S0200000_17(c1129140fUO, enumC1129600fV8, 21));
        Long l = c1129140fUO.LJFF;
        if (l != null && l.longValue() > 0) {
            long jLongValue = l.longValue();
            C1130100fVw.LIZ.getClass();
            C1131900fYq.LIZLLL(C497740JfY.LJII(), "default_dialog_item", jLongValue);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.C1129280fUc r8, X.InterfaceC1364105Vn<? super X.C1886107a7> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1129460fUu
            if (r0 == 0) goto L63
            r6 = r9
            X.0fUu r6 = (X.C1129460fUu) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r1 = 1
            if (r0 == 0) goto L3e
            if (r0 != r1) goto L69
            X.C155000ia.LIZIZ(r2)
            X.00o6 r2 = (X.C189200o6) r2
            java.lang.Object r3 = r2.m10unboximpl()
        L28:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r2 == 0) goto L3d
            java.lang.String r1 = "GiftPanel.Coord"
            java.lang.String r0 = "[Coordinator] insertRealTimeRecommendGift fallback"
            X.C20441214yg.LJIILIIL(r1, r0, r2)
            X.07a7 r3 = new X.07a7
            X.13BV r1 = X.C13BV.INSTANCE
            r0 = 0
            r3.<init>(r1, r1, r0)
        L3d:
            return r3
        L3e:
            X.C155000ia.LIZIZ(r2)
            X.01GW r0 = r7.LLILZ
            java.lang.Object r0 = r0.getValue()
            X.0fVs r0 = (X.C1130060fVs) r0
            X.01GW r0 = r0.LIZLLL
            java.lang.Object r4 = r0.getValue()
            X.0fUd r4 = (X.C1129290fUd) r4
            r6.LLILLL = r1
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftRealTimeApiSettings r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftRealTimeApiSettings.INSTANCE
            long r2 = r0.realTimeUpdateTimeoutMs()
            r0 = 100
            long r2 = r2 + r0
            java.lang.Object r3 = r4.LIZIZ(r8, r2, r6)
            if (r3 != r5) goto L28
            return r5
        L63:
            X.0fUu r6 = new X.0fUu
            r6.<init>(r7, r9)
            goto L12
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel.wQ2(X.0fUc, X.05Vn):java.lang.Object");
    }

    public final boolean xQ2(long j, String str) {
        if (j == this.LLJ) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Coordinator] stale panel result ignored - source=");
        sbLIZ.append(str);
        sbLIZ.append(", requestId=");
        sbLIZ.append(j);
        sbLIZ.append(", active=");
        sbLIZ.append(this.LLJ);
        C20441214yg.LJIIIZ("GiftPanel.Coord", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }
}
