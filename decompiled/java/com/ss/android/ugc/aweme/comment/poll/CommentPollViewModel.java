package com.ss.android.ugc.aweme.comment.poll;

import X.C09YA;
import X.C1075920e6Y;
import X.C1342030l1l;
import X.C1347140lA0;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.PollInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPollViewModel extends AssemViewModel<C1342030l1l> {
    public static final AtomicLong LLILZ = new AtomicLong(-1);
    public final C09YA LL = new C09YA(this, AFwS209S0000000_21.get$arr$(139));
    public final Map<Long, C1347140lA0> LLILLJJLI = new LinkedHashMap();
    public final Set<Long> LLILLL = new LinkedHashSet();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1342030l1l(0);
    }

    public final PollInfo AQ2(String str) {
        boolean z;
        PollInfo pollInfo;
        Integer num;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (pollInfo = getState().LL.get(str)) == null || (num = pollInfo.userPollOption) == null || num.intValue() < 0) {
            return null;
        }
        return pollInfo;
    }

    public final void zQ2(long j, String str) {
        setStateImmediate(new AwS600S0100000_21(new C1075920e6Y(str, null, Long.valueOf(j), 2), 89));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(long r13, java.lang.String r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel.yQ2(long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(int r8, long r9, java.lang.String r11, X.InterfaceC1364105Vn r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.C1347170lA3
            if (r0 == 0) goto L20
            r6 = r12
            X.0lA3 r6 = (X.C1347170lA3) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L5a
        L20:
            X.0lA3 r6 = new X.0lA3
            r6.<init>(r7, r12)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            r1 = 0
            r0 = 0
            X.C1344480l5i.LIZ(r11, r0, r1)
            X.09YA r0 = r7.LL     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L63
            X.0SvR r0 = (X.InterfaceC736910SvR) r0     // Catch: java.lang.Throwable -> L63
            X.00hg r3 = r0.getOperator()     // Catch: java.lang.Throwable -> L63
            X.0lA8 r3 = (X.InterfaceC1347220lA8) r3     // Catch: java.lang.Throwable -> L63
            com.ss.android.ugc.aweme.comment.poll.repository.CancelVoteRequest r2 = new com.ss.android.ugc.aweme.comment.poll.repository.CancelVoteRequest     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L63
            java.lang.Integer r0 = X.C2286608xc.LJ(r8)     // Catch: java.lang.Throwable -> L63
            r2.<init>(r11, r1, r0)     // Catch: java.lang.Throwable -> L63
            r6.LLILLL = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = r3.LLLLLJIL(r2, r6)     // Catch: java.lang.Throwable -> L63
            if (r1 != r5) goto L5d
            return r5
        L5a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L63
        L5d:
            X.0btJ r1 = (X.C990830btJ) r1     // Catch: java.lang.Throwable -> L63
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L63
            goto L6f
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L6f:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r1)
            X.C189200o6.m5exceptionOrNullimpl(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel.vQ2(int, long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(int r8, long r9, java.lang.String r11, X.InterfaceC1364105Vn r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.C1347180lA4
            if (r0 == 0) goto L20
            r6 = r12
            X.0lA4 r6 = (X.C1347180lA4) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L5a
        L20:
            X.0lA4 r6 = new X.0lA4
            r6.<init>(r7, r12)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            r1 = 0
            r0 = 0
            X.C1344480l5i.LIZ(r11, r0, r1)
            X.09YA r0 = r7.LL     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L63
            X.0SvR r0 = (X.InterfaceC736910SvR) r0     // Catch: java.lang.Throwable -> L63
            X.00hg r3 = r0.getOperator()     // Catch: java.lang.Throwable -> L63
            X.0lA8 r3 = (X.InterfaceC1347220lA8) r3     // Catch: java.lang.Throwable -> L63
            com.ss.android.ugc.aweme.comment.poll.repository.CastVoteRequest r2 = new com.ss.android.ugc.aweme.comment.poll.repository.CastVoteRequest     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L63
            java.lang.Integer r0 = X.C2286608xc.LJ(r8)     // Catch: java.lang.Throwable -> L63
            r2.<init>(r11, r1, r0)     // Catch: java.lang.Throwable -> L63
            r6.LLILLL = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = r3.LLJJJJLIIL(r2, r6)     // Catch: java.lang.Throwable -> L63
            if (r1 != r5) goto L5d
            return r5
        L5a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L63
        L5d:
            X.0btK r1 = (X.C990840btK) r1     // Catch: java.lang.Throwable -> L63
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L63
            goto L6f
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L6f:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r1)
            X.C189200o6.m5exceptionOrNullimpl(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel.wQ2(int, long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0214  */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, X.0e6Y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(int r33, java.lang.Long r34, java.lang.String r35, java.lang.String r36, X.InterfaceC1364105Vn r37) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel.xQ2(int, java.lang.Long, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
