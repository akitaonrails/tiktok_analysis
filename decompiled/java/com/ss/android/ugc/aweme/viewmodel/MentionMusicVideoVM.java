package com.ss.android.ugc.aweme.viewmodel;

import X.AbstractC316870CbV;
import X.C1157130gDX;
import X.C1220270hrN;
import X.C12823050b;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MentionMusicVideoVM extends BaseVideoListVM<C1220270hrN, C12823050b, Long> {
    public String LLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1220270hrN(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        withState(new AwS598S0100000_19(this, 600));
        super.manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C12823050b> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 278));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        this.LLILZLL = true;
        String str = this.LLJ;
        if (str == null) {
            str = null;
        }
        return zQ2(this.LLIZLLLIL, 0L, str, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        long jLongValue = ((Number) obj).longValue();
        String str = this.LLJ;
        if (str == null) {
            str = null;
        }
        return zQ2(this.LLIZLLLIL, jLongValue, str, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:29:0x00a5, B:30:0x00a8, B:34:0x00b7, B:35:0x00bb, B:37:0x00c1, B:38:0x00d0, B:40:0x00e0, B:43:0x00e6, B:45:0x00ec, B:47:0x00f0, B:53:0x00fc, B:56:0x0101, B:57:0x010b, B:59:0x0113, B:61:0x0120, B:25:0x007a, B:26:0x007d, B:17:0x0043, B:22:0x0054, B:63:0x012b, B:64:0x0132, B:20:0x004e, B:18:0x0046), top: B:87:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:29:0x00a5, B:30:0x00a8, B:34:0x00b7, B:35:0x00bb, B:37:0x00c1, B:38:0x00d0, B:40:0x00e0, B:43:0x00e6, B:45:0x00ec, B:47:0x00f0, B:53:0x00fc, B:56:0x0101, B:57:0x010b, B:59:0x0113, B:61:0x0120, B:25:0x007a, B:26:0x007d, B:17:0x0043, B:22:0x0054, B:63:0x012b, B:64:0x0132, B:20:0x004e, B:18:0x0046), top: B:87:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:29:0x00a5, B:30:0x00a8, B:34:0x00b7, B:35:0x00bb, B:37:0x00c1, B:38:0x00d0, B:40:0x00e0, B:43:0x00e6, B:45:0x00ec, B:47:0x00f0, B:53:0x00fc, B:56:0x0101, B:57:0x010b, B:59:0x0113, B:61:0x0120, B:25:0x007a, B:26:0x007d, B:17:0x0043, B:22:0x0054, B:63:0x012b, B:64:0x0132, B:20:0x004e, B:18:0x0046), top: B:87:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:29:0x00a5, B:30:0x00a8, B:34:0x00b7, B:35:0x00bb, B:37:0x00c1, B:38:0x00d0, B:40:0x00e0, B:43:0x00e6, B:45:0x00ec, B:47:0x00f0, B:53:0x00fc, B:56:0x0101, B:57:0x010b, B:59:0x0113, B:61:0x0120, B:25:0x007a, B:26:0x007d, B:17:0x0043, B:22:0x0054, B:63:0x012b, B:64:0x0132, B:20:0x004e, B:18:0x0046), top: B:87:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:29:0x00a5, B:30:0x00a8, B:34:0x00b7, B:35:0x00bb, B:37:0x00c1, B:38:0x00d0, B:40:0x00e0, B:43:0x00e6, B:45:0x00ec, B:47:0x00f0, B:53:0x00fc, B:56:0x0101, B:57:0x010b, B:59:0x0113, B:61:0x0120, B:25:0x007a, B:26:0x007d, B:17:0x0043, B:22:0x0054, B:63:0x012b, B:64:0x0132, B:20:0x004e, B:18:0x0046), top: B:87:0x0022, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(int r19, long r20, java.lang.String r22, X.InterfaceC1364105Vn r23) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewmodel.MentionMusicVideoVM.zQ2(int, long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
