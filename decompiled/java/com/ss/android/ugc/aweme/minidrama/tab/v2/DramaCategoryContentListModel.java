package com.ss.android.ugc.aweme.minidrama.tab.v2;

import X.AbstractC316870CbV;
import X.C1165890gRf;
import X.C1559210qg3;
import X.C1559260qg8;
import X.C627660Ojc;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaCategoryContentListModel extends AssemListViewModel<C1165890gRf, InterfaceC1891350zJl, String> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1559210qg3.class, "drama_category_content_list_page_key"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1165890gRf(0);
    }

    public final C1559210qg3 vQ2() {
        return (C1559210qg3) this.LL.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 150));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        return wQ2("", true, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(String str, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        return wQ2(str, false, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0185 A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:68:0x00fd, B:69:0x0100, B:73:0x0108, B:75:0x010e, B:76:0x0112, B:78:0x0118, B:80:0x011c, B:81:0x012c, B:83:0x0132, B:85:0x013a, B:87:0x0144, B:89:0x0148, B:92:0x014d, B:93:0x0156, B:94:0x0159, B:102:0x0171, B:103:0x0176, B:104:0x017f, B:106:0x0185, B:108:0x0191, B:109:0x0195, B:113:0x01b1, B:115:0x01be, B:118:0x01cc, B:120:0x01d9, B:123:0x01e8, B:125:0x01f3, B:98:0x015f, B:100:0x0165, B:101:0x0167, B:95:0x015a, B:15:0x0042, B:19:0x0049, B:21:0x0056, B:23:0x005a, B:26:0x0060, B:28:0x0067, B:30:0x006d, B:36:0x0079, B:38:0x007d, B:40:0x0081, B:45:0x009f, B:49:0x00b2, B:48:0x00aa, B:50:0x00b9, B:52:0x00bd, B:54:0x00c3, B:56:0x00c7, B:59:0x00cc, B:61:0x00d6, B:62:0x00dc, B:25:0x005e), top: B:130:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:68:0x00fd, B:69:0x0100, B:73:0x0108, B:75:0x010e, B:76:0x0112, B:78:0x0118, B:80:0x011c, B:81:0x012c, B:83:0x0132, B:85:0x013a, B:87:0x0144, B:89:0x0148, B:92:0x014d, B:93:0x0156, B:94:0x0159, B:102:0x0171, B:103:0x0176, B:104:0x017f, B:106:0x0185, B:108:0x0191, B:109:0x0195, B:113:0x01b1, B:115:0x01be, B:118:0x01cc, B:120:0x01d9, B:123:0x01e8, B:125:0x01f3, B:98:0x015f, B:100:0x0165, B:101:0x0167, B:95:0x015a, B:15:0x0042, B:19:0x0049, B:21:0x0056, B:23:0x005a, B:26:0x0060, B:28:0x0067, B:30:0x006d, B:36:0x0079, B:38:0x007d, B:40:0x0081, B:45:0x009f, B:49:0x00b2, B:48:0x00aa, B:50:0x00b9, B:52:0x00bd, B:54:0x00c3, B:56:0x00c7, B:59:0x00cc, B:61:0x00d6, B:62:0x00dc, B:25:0x005e), top: B:130:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015a A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:68:0x00fd, B:69:0x0100, B:73:0x0108, B:75:0x010e, B:76:0x0112, B:78:0x0118, B:80:0x011c, B:81:0x012c, B:83:0x0132, B:85:0x013a, B:87:0x0144, B:89:0x0148, B:92:0x014d, B:93:0x0156, B:94:0x0159, B:102:0x0171, B:103:0x0176, B:104:0x017f, B:106:0x0185, B:108:0x0191, B:109:0x0195, B:113:0x01b1, B:115:0x01be, B:118:0x01cc, B:120:0x01d9, B:123:0x01e8, B:125:0x01f3, B:98:0x015f, B:100:0x0165, B:101:0x0167, B:95:0x015a, B:15:0x0042, B:19:0x0049, B:21:0x0056, B:23:0x005a, B:26:0x0060, B:28:0x0067, B:30:0x006d, B:36:0x0079, B:38:0x007d, B:40:0x0081, B:45:0x009f, B:49:0x00b2, B:48:0x00aa, B:50:0x00b9, B:52:0x00bd, B:54:0x00c3, B:56:0x00c7, B:59:0x00cc, B:61:0x00d6, B:62:0x00dc, B:25:0x005e), top: B:130:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015f A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:68:0x00fd, B:69:0x0100, B:73:0x0108, B:75:0x010e, B:76:0x0112, B:78:0x0118, B:80:0x011c, B:81:0x012c, B:83:0x0132, B:85:0x013a, B:87:0x0144, B:89:0x0148, B:92:0x014d, B:93:0x0156, B:94:0x0159, B:102:0x0171, B:103:0x0176, B:104:0x017f, B:106:0x0185, B:108:0x0191, B:109:0x0195, B:113:0x01b1, B:115:0x01be, B:118:0x01cc, B:120:0x01d9, B:123:0x01e8, B:125:0x01f3, B:98:0x015f, B:100:0x0165, B:101:0x0167, B:95:0x015a, B:15:0x0042, B:19:0x0049, B:21:0x0056, B:23:0x005a, B:26:0x0060, B:28:0x0067, B:30:0x006d, B:36:0x0079, B:38:0x007d, B:40:0x0081, B:45:0x009f, B:49:0x00b2, B:48:0x00aa, B:50:0x00b9, B:52:0x00bd, B:54:0x00c3, B:56:0x00c7, B:59:0x00cc, B:61:0x00d6, B:62:0x00dc, B:25:0x005e), top: B:130:0x0025 }] */
    /* JADX WARN: Type inference failed for: r0v69, types: [T] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(java.lang.String r23, boolean r24, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r25) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.tab.v2.DramaCategoryContentListModel.wQ2(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
