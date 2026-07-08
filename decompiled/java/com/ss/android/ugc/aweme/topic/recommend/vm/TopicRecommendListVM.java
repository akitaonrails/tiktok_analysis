package com.ss.android.ugc.aweme.topic.recommend.vm;

import X.AbstractC316870CbV;
import X.C013C;
import X.C09YA;
import X.C0O4J;
import X.C0O4K;
import X.C0O4L;
import X.C0O4X;
import X.C0O4Y;
import X.C0OAO;
import X.C0OAT;
import X.C0PEM;
import X.C1DFB;
import X.C2296808zG;
import X.C23250099c;
import X.C613220O3k;
import X.C623470Ocr;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility;
import com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailApi;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicRecommendListVM extends AssemListViewModel<C0OAO, C0OAT, String> implements SearchAbility {
    public C0O4X LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public final long LLILZLL = System.currentTimeMillis();
    public final C09YA LLIZ = new C09YA(this, AFwS195S0000000_9.get$arr$(332));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OAO(0);
    }

    public final C0O4X vQ2() {
        C0O4X c0o4x = this.LL;
        if (c0o4x != null) {
            return c0o4x;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility
    public final void LJJZZIII(String str) {
        this.LLILZ = str;
        manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C0OAT> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 406));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        return onLoadMore("", interfaceC1364105Vn);
    }

    public final void xQ2(TopicRawInfo topicRawInfo) {
        boolean zBooleanValue;
        InterfaceC346201Wa interfaceC346201WaLIZIZ;
        String str = topicRawInfo.id;
        if (str == null) {
            return;
        }
        Boolean bool = topicRawInfo.isCollected;
        boolean zBooleanValue2 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (this.LL == null) {
            return;
        }
        if (C0O4Y.LIZ[vQ2().ordinal()] == 1) {
            C0O4K c0o4k = C0O4K.BOOK;
            C013C c013c = new C013C();
            if (C0O4L.LIZIZ(c0o4k, str) == null) {
                C0O4L.LIZLLL(c0o4k, str, zBooleanValue);
                zBooleanValue2 = zBooleanValue;
            } else {
                Boolean boolLIZIZ = C0O4L.LIZIZ(c0o4k, str);
                if (boolLIZIZ != null) {
                    zBooleanValue2 = boolLIZIZ.booleanValue();
                }
            }
            c013c.element = zBooleanValue2;
            if (!zBooleanValue2) {
                if (vQ2() == C0O4X.BOOK) {
                    BookDetailApi.LIZ.getClass();
                    interfaceC346201WaLIZIZ = C613220O3k.LIZ(str);
                } else {
                    return;
                }
            } else {
                if (vQ2() != C0O4X.BOOK) {
                    return;
                }
                BookDetailApi.LIZ.getClass();
                interfaceC346201WaLIZIZ = C613220O3k.LIZIZ(str);
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C23250099c.LIZLLL(C2296808zG.LIZ(c1dfb), c1dfb, null, new C0O4J(interfaceC346201WaLIZIZ, c0o4k, str, c013c, topicRawInfo, this, zBooleanValue, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a3 A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:89:0x0185, B:90:0x0188, B:92:0x018e, B:93:0x019c, B:95:0x01a2, B:97:0x01aa, B:99:0x01b0, B:100:0x01d5, B:102:0x01de, B:104:0x01e6, B:105:0x01e8, B:106:0x01ed, B:108:0x01f3, B:110:0x01ff, B:111:0x020d, B:113:0x0216, B:114:0x0220, B:116:0x0251, B:117:0x0255, B:119:0x0269, B:120:0x026d, B:124:0x0277, B:129:0x0283, B:130:0x0287, B:133:0x028c, B:134:0x029c, B:135:0x02a0, B:138:0x02a6, B:137:0x02a3, B:48:0x00cd, B:49:0x00d0, B:51:0x00d6, B:52:0x00e3, B:54:0x00e9, B:56:0x00f8, B:58:0x0107, B:63:0x0113, B:64:0x0117, B:67:0x011c, B:70:0x012b, B:79:0x013c, B:80:0x0146, B:82:0x0152, B:84:0x015d, B:68:0x0127, B:17:0x004f, B:19:0x0053, B:25:0x005f, B:28:0x0071, B:34:0x007d, B:36:0x0081, B:38:0x0087, B:40:0x0098, B:42:0x00a5, B:45:0x00b8, B:86:0x016a), top: B:143:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6 A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:89:0x0185, B:90:0x0188, B:92:0x018e, B:93:0x019c, B:95:0x01a2, B:97:0x01aa, B:99:0x01b0, B:100:0x01d5, B:102:0x01de, B:104:0x01e6, B:105:0x01e8, B:106:0x01ed, B:108:0x01f3, B:110:0x01ff, B:111:0x020d, B:113:0x0216, B:114:0x0220, B:116:0x0251, B:117:0x0255, B:119:0x0269, B:120:0x026d, B:124:0x0277, B:129:0x0283, B:130:0x0287, B:133:0x028c, B:134:0x029c, B:135:0x02a0, B:138:0x02a6, B:137:0x02a3, B:48:0x00cd, B:49:0x00d0, B:51:0x00d6, B:52:0x00e3, B:54:0x00e9, B:56:0x00f8, B:58:0x0107, B:63:0x0113, B:64:0x0117, B:67:0x011c, B:70:0x012b, B:79:0x013c, B:80:0x0146, B:82:0x0152, B:84:0x015d, B:68:0x0127, B:17:0x004f, B:19:0x0053, B:25:0x005f, B:28:0x0071, B:34:0x007d, B:36:0x0081, B:38:0x0087, B:40:0x0098, B:42:0x00a5, B:45:0x00b8, B:86:0x016a), top: B:143:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127 A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:89:0x0185, B:90:0x0188, B:92:0x018e, B:93:0x019c, B:95:0x01a2, B:97:0x01aa, B:99:0x01b0, B:100:0x01d5, B:102:0x01de, B:104:0x01e6, B:105:0x01e8, B:106:0x01ed, B:108:0x01f3, B:110:0x01ff, B:111:0x020d, B:113:0x0216, B:114:0x0220, B:116:0x0251, B:117:0x0255, B:119:0x0269, B:120:0x026d, B:124:0x0277, B:129:0x0283, B:130:0x0287, B:133:0x028c, B:134:0x029c, B:135:0x02a0, B:138:0x02a6, B:137:0x02a3, B:48:0x00cd, B:49:0x00d0, B:51:0x00d6, B:52:0x00e3, B:54:0x00e9, B:56:0x00f8, B:58:0x0107, B:63:0x0113, B:64:0x0117, B:67:0x011c, B:70:0x012b, B:79:0x013c, B:80:0x0146, B:82:0x0152, B:84:0x015d, B:68:0x0127, B:17:0x004f, B:19:0x0053, B:25:0x005f, B:28:0x0071, B:34:0x007d, B:36:0x0081, B:38:0x0087, B:40:0x0098, B:42:0x00a5, B:45:0x00b8, B:86:0x016a), top: B:143:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:89:0x0185, B:90:0x0188, B:92:0x018e, B:93:0x019c, B:95:0x01a2, B:97:0x01aa, B:99:0x01b0, B:100:0x01d5, B:102:0x01de, B:104:0x01e6, B:105:0x01e8, B:106:0x01ed, B:108:0x01f3, B:110:0x01ff, B:111:0x020d, B:113:0x0216, B:114:0x0220, B:116:0x0251, B:117:0x0255, B:119:0x0269, B:120:0x026d, B:124:0x0277, B:129:0x0283, B:130:0x0287, B:133:0x028c, B:134:0x029c, B:135:0x02a0, B:138:0x02a6, B:137:0x02a3, B:48:0x00cd, B:49:0x00d0, B:51:0x00d6, B:52:0x00e3, B:54:0x00e9, B:56:0x00f8, B:58:0x0107, B:63:0x0113, B:64:0x0117, B:67:0x011c, B:70:0x012b, B:79:0x013c, B:80:0x0146, B:82:0x0152, B:84:0x015d, B:68:0x0127, B:17:0x004f, B:19:0x0053, B:25:0x005f, B:28:0x0071, B:34:0x007d, B:36:0x0081, B:38:0x0087, B:40:0x0098, B:42:0x00a5, B:45:0x00b8, B:86:0x016a), top: B:143:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:89:0x0185, B:90:0x0188, B:92:0x018e, B:93:0x019c, B:95:0x01a2, B:97:0x01aa, B:99:0x01b0, B:100:0x01d5, B:102:0x01de, B:104:0x01e6, B:105:0x01e8, B:106:0x01ed, B:108:0x01f3, B:110:0x01ff, B:111:0x020d, B:113:0x0216, B:114:0x0220, B:116:0x0251, B:117:0x0255, B:119:0x0269, B:120:0x026d, B:124:0x0277, B:129:0x0283, B:130:0x0287, B:133:0x028c, B:134:0x029c, B:135:0x02a0, B:138:0x02a6, B:137:0x02a3, B:48:0x00cd, B:49:0x00d0, B:51:0x00d6, B:52:0x00e3, B:54:0x00e9, B:56:0x00f8, B:58:0x0107, B:63:0x0113, B:64:0x0117, B:67:0x011c, B:70:0x012b, B:79:0x013c, B:80:0x0146, B:82:0x0152, B:84:0x015d, B:68:0x0127, B:17:0x004f, B:19:0x0053, B:25:0x005f, B:28:0x0071, B:34:0x007d, B:36:0x0081, B:38:0x0087, B:40:0x0098, B:42:0x00a5, B:45:0x00b8, B:86:0x016a), top: B:143:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0152 A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:89:0x0185, B:90:0x0188, B:92:0x018e, B:93:0x019c, B:95:0x01a2, B:97:0x01aa, B:99:0x01b0, B:100:0x01d5, B:102:0x01de, B:104:0x01e6, B:105:0x01e8, B:106:0x01ed, B:108:0x01f3, B:110:0x01ff, B:111:0x020d, B:113:0x0216, B:114:0x0220, B:116:0x0251, B:117:0x0255, B:119:0x0269, B:120:0x026d, B:124:0x0277, B:129:0x0283, B:130:0x0287, B:133:0x028c, B:134:0x029c, B:135:0x02a0, B:138:0x02a6, B:137:0x02a3, B:48:0x00cd, B:49:0x00d0, B:51:0x00d6, B:52:0x00e3, B:54:0x00e9, B:56:0x00f8, B:58:0x0107, B:63:0x0113, B:64:0x0117, B:67:0x011c, B:70:0x012b, B:79:0x013c, B:80:0x0146, B:82:0x0152, B:84:0x015d, B:68:0x0127, B:17:0x004f, B:19:0x0053, B:25:0x005f, B:28:0x0071, B:34:0x007d, B:36:0x0081, B:38:0x0087, B:40:0x0098, B:42:0x00a5, B:45:0x00b8, B:86:0x016a), top: B:143:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:89:0x0185, B:90:0x0188, B:92:0x018e, B:93:0x019c, B:95:0x01a2, B:97:0x01aa, B:99:0x01b0, B:100:0x01d5, B:102:0x01de, B:104:0x01e6, B:105:0x01e8, B:106:0x01ed, B:108:0x01f3, B:110:0x01ff, B:111:0x020d, B:113:0x0216, B:114:0x0220, B:116:0x0251, B:117:0x0255, B:119:0x0269, B:120:0x026d, B:124:0x0277, B:129:0x0283, B:130:0x0287, B:133:0x028c, B:134:0x029c, B:135:0x02a0, B:138:0x02a6, B:137:0x02a3, B:48:0x00cd, B:49:0x00d0, B:51:0x00d6, B:52:0x00e3, B:54:0x00e9, B:56:0x00f8, B:58:0x0107, B:63:0x0113, B:64:0x0117, B:67:0x011c, B:70:0x012b, B:79:0x013c, B:80:0x0146, B:82:0x0152, B:84:0x015d, B:68:0x0127, B:17:0x004f, B:19:0x0053, B:25:0x005f, B:28:0x0071, B:34:0x007d, B:36:0x0081, B:38:0x0087, B:40:0x0098, B:42:0x00a5, B:45:0x00b8, B:86:0x016a), top: B:143:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018e A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:89:0x0185, B:90:0x0188, B:92:0x018e, B:93:0x019c, B:95:0x01a2, B:97:0x01aa, B:99:0x01b0, B:100:0x01d5, B:102:0x01de, B:104:0x01e6, B:105:0x01e8, B:106:0x01ed, B:108:0x01f3, B:110:0x01ff, B:111:0x020d, B:113:0x0216, B:114:0x0220, B:116:0x0251, B:117:0x0255, B:119:0x0269, B:120:0x026d, B:124:0x0277, B:129:0x0283, B:130:0x0287, B:133:0x028c, B:134:0x029c, B:135:0x02a0, B:138:0x02a6, B:137:0x02a3, B:48:0x00cd, B:49:0x00d0, B:51:0x00d6, B:52:0x00e3, B:54:0x00e9, B:56:0x00f8, B:58:0x0107, B:63:0x0113, B:64:0x0117, B:67:0x011c, B:70:0x012b, B:79:0x013c, B:80:0x0146, B:82:0x0152, B:84:0x015d, B:68:0x0127, B:17:0x004f, B:19:0x0053, B:25:0x005f, B:28:0x0071, B:34:0x007d, B:36:0x0081, B:38:0x0087, B:40:0x0098, B:42:0x00a5, B:45:0x00b8, B:86:0x016a), top: B:143:0x0028 }] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r34, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r35) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }
}
