package com.ss.android.ugc.aweme.topic.common.creator.vm;

import X.AbstractC316870CbV;
import X.C09YA;
import X.C0O4X;
import X.C0OAT;
import X.C325970CqB;
import X.C623470Ocr;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicSearchViewModel extends AssemListViewModel<C325970CqB, C0OAT, Long> implements SearchAbility, RefreshAbility {
    public String LL;
    public C0O4X LLILLJJLI;
    public final C09YA LLILLL = new C09YA(this, AFwS195S0000000_9.get$arr$(324));
    public final long LLILZ = System.currentTimeMillis();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325970CqB(0);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility
    public final void LJJZZIII(String str) {
        this.LL = str;
        manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C0OAT> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 399));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(0L, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b3 A[Catch: Exception -> 0x02d0, TryCatch #0 {Exception -> 0x02d0, blocks: (B:91:0x018a, B:92:0x018d, B:95:0x0193, B:97:0x0197, B:98:0x01a5, B:100:0x01ab, B:102:0x01b3, B:104:0x01b9, B:105:0x01dc, B:107:0x01e5, B:109:0x01ed, B:110:0x01ef, B:111:0x01f4, B:113:0x01fa, B:115:0x0206, B:116:0x0214, B:118:0x021d, B:119:0x0227, B:121:0x0232, B:122:0x0236, B:124:0x0254, B:125:0x025c, B:127:0x026c, B:128:0x0270, B:130:0x0284, B:131:0x0288, B:137:0x02ae, B:138:0x02b2, B:140:0x02b5, B:139:0x02b3, B:47:0x00bd, B:48:0x00c0, B:49:0x00c2, B:51:0x00c6, B:52:0x00d3, B:54:0x00d9, B:56:0x00e8, B:57:0x00f5, B:59:0x0107, B:61:0x0113, B:63:0x011c, B:58:0x0105, B:38:0x008e, B:39:0x0091, B:17:0x0044, B:19:0x0048, B:26:0x0056, B:28:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0070, B:40:0x0094, B:42:0x009c, B:44:0x00a2, B:65:0x0127, B:67:0x0137, B:69:0x013b, B:86:0x0169, B:88:0x016d, B:76:0x014e, B:78:0x0152, B:142:0x02c0), top: B:147:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6 A[Catch: Exception -> 0x02d0, TryCatch #0 {Exception -> 0x02d0, blocks: (B:91:0x018a, B:92:0x018d, B:95:0x0193, B:97:0x0197, B:98:0x01a5, B:100:0x01ab, B:102:0x01b3, B:104:0x01b9, B:105:0x01dc, B:107:0x01e5, B:109:0x01ed, B:110:0x01ef, B:111:0x01f4, B:113:0x01fa, B:115:0x0206, B:116:0x0214, B:118:0x021d, B:119:0x0227, B:121:0x0232, B:122:0x0236, B:124:0x0254, B:125:0x025c, B:127:0x026c, B:128:0x0270, B:130:0x0284, B:131:0x0288, B:137:0x02ae, B:138:0x02b2, B:140:0x02b5, B:139:0x02b3, B:47:0x00bd, B:48:0x00c0, B:49:0x00c2, B:51:0x00c6, B:52:0x00d3, B:54:0x00d9, B:56:0x00e8, B:57:0x00f5, B:59:0x0107, B:61:0x0113, B:63:0x011c, B:58:0x0105, B:38:0x008e, B:39:0x0091, B:17:0x0044, B:19:0x0048, B:26:0x0056, B:28:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0070, B:40:0x0094, B:42:0x009c, B:44:0x00a2, B:65:0x0127, B:67:0x0137, B:69:0x013b, B:86:0x0169, B:88:0x016d, B:76:0x014e, B:78:0x0152, B:142:0x02c0), top: B:147:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105 A[Catch: Exception -> 0x02d0, TryCatch #0 {Exception -> 0x02d0, blocks: (B:91:0x018a, B:92:0x018d, B:95:0x0193, B:97:0x0197, B:98:0x01a5, B:100:0x01ab, B:102:0x01b3, B:104:0x01b9, B:105:0x01dc, B:107:0x01e5, B:109:0x01ed, B:110:0x01ef, B:111:0x01f4, B:113:0x01fa, B:115:0x0206, B:116:0x0214, B:118:0x021d, B:119:0x0227, B:121:0x0232, B:122:0x0236, B:124:0x0254, B:125:0x025c, B:127:0x026c, B:128:0x0270, B:130:0x0284, B:131:0x0288, B:137:0x02ae, B:138:0x02b2, B:140:0x02b5, B:139:0x02b3, B:47:0x00bd, B:48:0x00c0, B:49:0x00c2, B:51:0x00c6, B:52:0x00d3, B:54:0x00d9, B:56:0x00e8, B:57:0x00f5, B:59:0x0107, B:61:0x0113, B:63:0x011c, B:58:0x0105, B:38:0x008e, B:39:0x0091, B:17:0x0044, B:19:0x0048, B:26:0x0056, B:28:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0070, B:40:0x0094, B:42:0x009c, B:44:0x00a2, B:65:0x0127, B:67:0x0137, B:69:0x013b, B:86:0x0169, B:88:0x016d, B:76:0x014e, B:78:0x0152, B:142:0x02c0), top: B:147:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113 A[Catch: Exception -> 0x02d0, TryCatch #0 {Exception -> 0x02d0, blocks: (B:91:0x018a, B:92:0x018d, B:95:0x0193, B:97:0x0197, B:98:0x01a5, B:100:0x01ab, B:102:0x01b3, B:104:0x01b9, B:105:0x01dc, B:107:0x01e5, B:109:0x01ed, B:110:0x01ef, B:111:0x01f4, B:113:0x01fa, B:115:0x0206, B:116:0x0214, B:118:0x021d, B:119:0x0227, B:121:0x0232, B:122:0x0236, B:124:0x0254, B:125:0x025c, B:127:0x026c, B:128:0x0270, B:130:0x0284, B:131:0x0288, B:137:0x02ae, B:138:0x02b2, B:140:0x02b5, B:139:0x02b3, B:47:0x00bd, B:48:0x00c0, B:49:0x00c2, B:51:0x00c6, B:52:0x00d3, B:54:0x00d9, B:56:0x00e8, B:57:0x00f5, B:59:0x0107, B:61:0x0113, B:63:0x011c, B:58:0x0105, B:38:0x008e, B:39:0x0091, B:17:0x0044, B:19:0x0048, B:26:0x0056, B:28:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0070, B:40:0x0094, B:42:0x009c, B:44:0x00a2, B:65:0x0127, B:67:0x0137, B:69:0x013b, B:86:0x0169, B:88:0x016d, B:76:0x014e, B:78:0x0152, B:142:0x02c0), top: B:147:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c A[Catch: Exception -> 0x02d0, TryCatch #0 {Exception -> 0x02d0, blocks: (B:91:0x018a, B:92:0x018d, B:95:0x0193, B:97:0x0197, B:98:0x01a5, B:100:0x01ab, B:102:0x01b3, B:104:0x01b9, B:105:0x01dc, B:107:0x01e5, B:109:0x01ed, B:110:0x01ef, B:111:0x01f4, B:113:0x01fa, B:115:0x0206, B:116:0x0214, B:118:0x021d, B:119:0x0227, B:121:0x0232, B:122:0x0236, B:124:0x0254, B:125:0x025c, B:127:0x026c, B:128:0x0270, B:130:0x0284, B:131:0x0288, B:137:0x02ae, B:138:0x02b2, B:140:0x02b5, B:139:0x02b3, B:47:0x00bd, B:48:0x00c0, B:49:0x00c2, B:51:0x00c6, B:52:0x00d3, B:54:0x00d9, B:56:0x00e8, B:57:0x00f5, B:59:0x0107, B:61:0x0113, B:63:0x011c, B:58:0x0105, B:38:0x008e, B:39:0x0091, B:17:0x0044, B:19:0x0048, B:26:0x0056, B:28:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0070, B:40:0x0094, B:42:0x009c, B:44:0x00a2, B:65:0x0127, B:67:0x0137, B:69:0x013b, B:86:0x0169, B:88:0x016d, B:76:0x014e, B:78:0x0152, B:142:0x02c0), top: B:147:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0193 A[Catch: Exception -> 0x02d0, TryCatch #0 {Exception -> 0x02d0, blocks: (B:91:0x018a, B:92:0x018d, B:95:0x0193, B:97:0x0197, B:98:0x01a5, B:100:0x01ab, B:102:0x01b3, B:104:0x01b9, B:105:0x01dc, B:107:0x01e5, B:109:0x01ed, B:110:0x01ef, B:111:0x01f4, B:113:0x01fa, B:115:0x0206, B:116:0x0214, B:118:0x021d, B:119:0x0227, B:121:0x0232, B:122:0x0236, B:124:0x0254, B:125:0x025c, B:127:0x026c, B:128:0x0270, B:130:0x0284, B:131:0x0288, B:137:0x02ae, B:138:0x02b2, B:140:0x02b5, B:139:0x02b3, B:47:0x00bd, B:48:0x00c0, B:49:0x00c2, B:51:0x00c6, B:52:0x00d3, B:54:0x00d9, B:56:0x00e8, B:57:0x00f5, B:59:0x0107, B:61:0x0113, B:63:0x011c, B:58:0x0105, B:38:0x008e, B:39:0x0091, B:17:0x0044, B:19:0x0048, B:26:0x0056, B:28:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0070, B:40:0x0094, B:42:0x009c, B:44:0x00a2, B:65:0x0127, B:67:0x0137, B:69:0x013b, B:86:0x0169, B:88:0x016d, B:76:0x014e, B:78:0x0152, B:142:0x02c0), top: B:147:0x0025 }] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.09Gk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r32, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r34) {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(l.longValue(), interfaceC1364105Vn);
    }
}
