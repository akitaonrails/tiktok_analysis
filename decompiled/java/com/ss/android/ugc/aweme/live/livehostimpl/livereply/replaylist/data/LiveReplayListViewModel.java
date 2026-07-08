package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data;

import X.AbstractC1844760y6c;
import X.AbstractC316870CbV;
import X.C15438062q;
import X.C1833750xor;
import X.C1833760xos;
import X.C1833770xot;
import X.C1833780xou;
import X.C1833940xpA;
import X.C23250099c;
import X.C2355009Kq;
import X.C316650Cb9;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1816030xMH;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import tikcast.api.anchor.AnchorFragmentListResult;
import tikcast.api.anchor.HighlightCollection;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayListViewModel extends AssemListViewModel<C1833780xou, C1833770xot, Long> {
    public C1833770xot LLILLJJLI;
    public final C1833750xor LL = new C1833750xor();
    public String LLILLL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1833780xou(0);
    }

    public static List vQ2(List list) {
        List arrayList;
        HighlightCollection highlightCollection;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            RoomReplay roomReplay = (RoomReplay) it2.next();
            AnchorFragmentListResult anchorFragmentListResult = roomReplay.anchorFragmentListResult;
            if (anchorFragmentListResult == null || (arrayList = anchorFragmentListResult.fragmentList) == null) {
                arrayList = new ArrayList();
            }
            AnchorFragmentListResult anchorFragmentListResult2 = roomReplay.anchorFragmentListResult;
            if (anchorFragmentListResult2 == null || (highlightCollection = anchorFragmentListResult2.highlightCollection) == null) {
                highlightCollection = new HighlightCollection();
            }
            C1833770xot c1833770xot = new C1833770xot(roomReplay, arrayList, highlightCollection);
            c1833770xot.LLILZ = true;
            arrayList2.add(c1833770xot);
        }
        return arrayList2;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1833770xot> c627660Ojc) {
        setState(new AwS606S0100000_27(c627660Ojc, (C627660Ojc<InterfaceC1816030xMH>) 153));
        List<C1833770xot> list = c627660Ojc.LLILZ;
        if (list != null && list.isEmpty()) {
            setState(AFwS269S0000000_27.get$arr$(100));
            C2355009Kq.LIZIZ("live_reply_list_response");
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        setState(AFwS269S0000000_27.get$arr$(101));
        C1833940xpA c1833940xpA = C1833940xpA.LJ;
        AnchorReplayInfoData anchorReplayInfoData = (AnchorReplayInfoData) AbstractC1844760y6c.LIZ();
        if (anchorReplayInfoData != null) {
            AbstractC1844760y6c.LIZIZ.remove("live_replay_list");
            try {
                return yQ2(0, anchorReplayInfoData, 0L);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                setState(new AwS606S0100000_27(e, 354));
                AbstractC316870CbV.LIZ.getClass();
                return new C316650Cb9(e);
            }
        }
        return wQ2(0, true, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return wQ2((int) l.longValue(), true, interfaceC1364105Vn);
    }

    public final void xQ2(Integer num, String str) {
        C23250099c.LIZIZ(getAssemVMScope(), null, null, new C1833760xos(this, str, System.currentTimeMillis(), num, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(int r25, java.lang.Boolean r26, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r27) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel.wQ2(int, java.lang.Boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC316870CbV<java.lang.Long> yQ2(int r21, com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData r22, long r23) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel.yQ2(int, com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData, long):X.0CbV");
    }
}
