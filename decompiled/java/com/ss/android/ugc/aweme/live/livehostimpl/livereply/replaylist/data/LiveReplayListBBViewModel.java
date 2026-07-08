package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data;

import X.AbstractC316870CbV;
import X.C1833750xor;
import X.C1834080xpO;
import X.C316650Cb9;
import X.C317290CcB;
import X.C327140Cs4;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1816030xMH;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayListBBViewModel extends AssemListViewModel<C327140Cs4, C1834080xpO, Long> {
    public final C1833750xor LL = new C1833750xor();
    public String LLILLJJLI = "";
    public boolean LLILLL = true;
    public boolean LLILZ;
    public int LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C327140Cs4(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1834080xpO> c627660Ojc) {
        setState(new AwS606S0100000_27(c627660Ojc, (C627660Ojc<InterfaceC1816030xMH>) 146));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1834060xpM
            if (r0 == 0) goto L6d
            r5 = r8
            X.0xpM r5 = (X.C1834060xpM) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 == r3) goto L61
            if (r0 != r4) goto L73
            X.C155000ia.LIZIZ(r1)
        L25:
            return r1
        L26:
            X.C155000ia.LIZIZ(r1)
            r0 = 93
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r7.setState(r0)
            X.0xpA r0 = X.C1833940xpA.LJ
            java.lang.Object r2 = X.AbstractC1844760y6c.LIZ()
            com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData r2 = (com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData) r2
            if (r2 == 0) goto L64
            android.util.LruCache<java.lang.String, X.0y6e<?>> r1 = X.AbstractC1844760y6c.LIZIZ
            java.lang.String r0 = "live_replay_list"
            r1.remove(r0)
            X.0CbV r0 = r7.xQ2(r2)     // Catch: java.lang.Throwable -> L48
            goto L55
        L48:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            r0 = 0
        L55:
            if (r0 == 0) goto L58
            return r0
        L58:
            r5.LLILLL = r3
            java.lang.Object r0 = r7.wQ2(r5)
            if (r0 != r6) goto L64
            return r6
        L61:
            X.C155000ia.LIZIZ(r1)
        L64:
            r5.LLILLL = r4
            java.lang.Object r1 = r7.wQ2(r5)
            if (r1 != r6) goto L25
            return r6
        L6d:
            X.0xpM r5 = new X.0xpM
            r5.<init>(r7, r8)
            goto L12
        L73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C1834070xpN
            if (r0 == 0) goto L20
            r9 = r11
            X.0xpN r9 = (X.C1834070xpN) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r1 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L54
        L20:
            X.0xpN r9 = new X.0xpN
            r9.<init>(r10, r11)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0xor r0 = r10.LL     // Catch: java.lang.Exception -> L83
            X.0xp6 r1 = r0.LLILLL     // Catch: java.lang.Exception -> L83
            int r7 = r10.LLILZIL     // Catch: java.lang.Exception -> L83
            r0 = 5
            if (r7 != r0) goto L3c
            r5 = 1
            goto L3d
        L3c:
            r5 = 0
        L3d:
            java.lang.String r6 = r10.LLILLJJLI     // Catch: java.lang.Exception -> L83
            r9.LLILLL = r2     // Catch: java.lang.Exception -> L83
            X.0xor r0 = r1.LL     // Catch: java.lang.Exception -> L83
            X.01GW r0 = r0.LL     // Catch: java.lang.Exception -> L83
            java.lang.Object r4 = r0.getValue()     // Catch: java.lang.Exception -> L83
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayApi r4 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayApi) r4     // Catch: java.lang.Exception -> L83
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L83
            java.lang.Object r1 = r4.getReplayVideoInfosFromBB(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L83
            if (r1 != r3) goto L57
            return r3
        L54:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L83
        L57:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Exception -> L83
            if (r1 == 0) goto L60
            T r0 = r1.data     // Catch: java.lang.Exception -> L83
            com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData) r0     // Catch: java.lang.Exception -> L83
            goto L61
        L60:
            r0 = 0
        L61:
            if (r0 != 0) goto L7e
            r0 = 91
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)     // Catch: java.lang.Exception -> L83
            r10.setState(r0)     // Catch: java.lang.Exception -> L83
            X.0CcB r2 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L83
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "empty list"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L83
            r2.getClass()     // Catch: java.lang.Exception -> L83
            X.0Cb9 r0 = new X.0Cb9     // Catch: java.lang.Exception -> L83
            r0.<init>(r1)     // Catch: java.lang.Exception -> L83
            return r0
        L7e:
            X.0CbV r0 = r10.xQ2(r0)     // Catch: java.lang.Exception -> L83
            return r0
        L83:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel.wQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC316870CbV<java.lang.Long> xQ2(com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData r9) {
        /*
            r8 = this;
            java.util.List<com.bytedance.android.livesdk.chatroom.model.RoomReplay> r0 = r9.replays
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            r0 = 92
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r8.setState(r0)
            X.0CcB r2 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "empty list"
            r1.<init>(r0)
            r2.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        L23:
            java.lang.String r2 = r8.LLILLJJLI
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            r6 = 0
            java.util.List r1 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, r1, r6, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r7.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L40:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r0 = r0.toString()
            r7.add(r0)
            goto L40
        L58:
            java.util.List<com.bytedance.android.livesdk.chatroom.model.RoomReplay> r0 = r9.replays
            java.util.Iterator r5 = r0.iterator()
        L5e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r4 = r5.next()
            r3 = r4
            com.bytedance.android.livesdk.chatroom.model.RoomReplay r3 = (com.bytedance.android.livesdk.chatroom.model.RoomReplay) r3
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L5e
            java.util.Iterator r2 = r7.iterator()
        L75:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r3.id
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L75
            if (r4 != 0) goto L8a
        L89:
            r6 = 1
        L8a:
            kotlin.jvm.internal.AwS39S0010000_27 r1 = new kotlin.jvm.internal.AwS39S0010000_27
            r0 = 11
            r1.<init>(r6, r0)
            r8.setState(r1)
            X.0CcB r3 = X.AbstractC316870CbV.LIZ
            java.util.List<com.bytedance.android.livesdk.chatroom.model.RoomReplay> r2 = r9.replays
            boolean r1 = r8.LLILLL
            boolean r0 = r8.LLILZ
            java.util.List r1 = vQ2(r2, r1, r0)
            r3.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel.xQ2(com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData):X.0CbV");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        l.longValue();
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception("not support");
        c317290CcB.getClass();
        return new C316650Cb9(exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[PHI: r12
      0x0051: PHI (r12v3 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String) binds: [B:17:0x004f, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List vQ2(java.util.List r20, boolean r21, boolean r22) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            r1 = r20
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
        L11:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r3 = r8.next()
            com.bytedance.android.livesdk.chatroom.model.RoomReplay r3 = (com.bytedance.android.livesdk.chatroom.model.RoomReplay) r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            tikcast.api.anchor.AnchorFragmentListResult r0 = r3.anchorFragmentListResult
            r22 = r22
            r21 = r21
            if (r0 == 0) goto L71
            java.util.List<tikcast.api.anchor.LiveFragmentDetail> r0 = r0.fragmentList
            if (r0 == 0) goto L71
            java.util.Iterator r7 = r0.iterator()
        L32:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r1 = r7.next()
            tikcast.api.anchor.LiveFragmentDetail r1 = (tikcast.api.anchor.LiveFragmentDetail) r1
            X.0xpT r9 = new X.0xpT
            java.lang.String r10 = r1.coverUrl
            boolean r11 = r1.isPosted
            tikcast.api.anchor.LiveFragmentShowInfo r0 = r1.showInfo
            java.lang.String r13 = ""
            if (r0 == 0) goto L4e
            java.lang.String r12 = r0.icon
            if (r12 != 0) goto L51
        L4e:
            r12 = r13
            if (r0 == 0) goto L56
        L51:
            java.lang.String r0 = r0.desc
            if (r0 == 0) goto L56
            r13 = r0
        L56:
            int r14 = r1.videoStatus
            long r15 = r1.fragmentId
            java.lang.String r6 = r3.id
            java.lang.String r5 = r3.title
            java.lang.String r1 = r1.ownerUserIdStr
            boolean r0 = r3.supportBbDownload
            r20 = r0
            r18 = r5
            r19 = r1
            r17 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22)
            r2.add(r9)
            goto L32
        L71:
            X.0xpO r1 = new X.0xpO
            tikcast.api.anchor.AnchorFragmentListResult r0 = r3.anchorFragmentListResult
            if (r0 == 0) goto L7b
            java.util.List<tikcast.api.anchor.LiveFragmentDetail> r0 = r0.fragmentList
            if (r0 != 0) goto L80
        L7b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L80:
            r9 = r1
            r10 = r3
            r11 = r2
            r12 = r0
            r13 = r21
            r14 = r22
            r9.<init>(r10, r11, r12, r13, r14)
            r4.add(r1)
            goto L11
        L8f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel.vQ2(java.util.List, boolean, boolean):java.util.List");
    }
}
