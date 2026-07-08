package com.ss.android.ugc.aweme.feed.landscape.component.profile;

import X.C01GW;
import X.C0KBN;
import X.C1CSU;
import X.C20599915jB;
import X.C2189821An6;
import X.C326020CqG;
import X.C341910Dan;
import X.C452501pT;
import X.C584850Mwl;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC726620Seq;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class LandscapeProfileListViewModel extends BaseDetailShareVM<C326020CqG, C341910Dan, C20599915jB> implements InterfaceC726620Seq {
    public long LLILZIL;
    public long LLILZLL;
    public Aweme LLIZ;
    public VideoItemParams LLJ;
    public int LLIZLLLIL = -1;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(186));

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 26000;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326020CqG(0);
    }

    @Override // X.InterfaceC726620Seq
    public final List<Aweme> p01() {
        return getAwemeList();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C341910Dan> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 71));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[Catch: Exception -> 0x0277, LOOP:3: B:36:0x0095->B:38:0x009b, LOOP_END, TryCatch #0 {Exception -> 0x0277, blocks: (B:48:0x00d2, B:49:0x00d5, B:51:0x00e2, B:53:0x00e6, B:55:0x00ea, B:56:0x00ee, B:58:0x00f4, B:60:0x00f8, B:61:0x00fc, B:63:0x0103, B:65:0x0107, B:66:0x0114, B:68:0x011a, B:71:0x0131, B:74:0x013d, B:75:0x0144, B:77:0x0148, B:79:0x014c, B:80:0x0159, B:82:0x015f, B:83:0x0170, B:86:0x0179, B:90:0x0185, B:91:0x0192, B:93:0x0198, B:95:0x01a2, B:96:0x01a6, B:98:0x01aa, B:99:0x01ae, B:101:0x01b7, B:103:0x01c1, B:104:0x01c5, B:107:0x01cd, B:108:0x01d0, B:113:0x01dd, B:115:0x01e5, B:117:0x01eb, B:119:0x01ef, B:121:0x01f3, B:126:0x01fe, B:128:0x0208, B:130:0x020c, B:132:0x0210, B:137:0x021c, B:138:0x021f, B:140:0x0225, B:142:0x022b, B:144:0x022f, B:146:0x0233, B:151:0x023e, B:153:0x0248, B:155:0x024c, B:157:0x0250, B:159:0x0256, B:160:0x0259, B:163:0x0265, B:15:0x003d, B:17:0x0041, B:18:0x004a, B:22:0x005d, B:25:0x0064, B:27:0x0068, B:30:0x006f, B:32:0x0073, B:34:0x0077, B:35:0x0080, B:36:0x0095, B:38:0x009b, B:45:0x00bf, B:39:0x00ad, B:41:0x00b1, B:43:0x00b7), top: B:168:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1 A[RETURN] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C20599915jB>> r23) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String aid;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme aweme = ((C341910Dan) it2.next()).LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C341910Dan) interfaceC1891350zJl).LL;
    }

    public static void BQ2(Aweme aweme, C1CSU c1csu) {
        aweme.setLogPbBean(new LogPbBean(c1csu.log_pb.impr_id));
        aweme.setRequestId(c1csu.log_pb.impr_id);
        C584850Mwl.LIZ.LJI(aweme.getRequestId(), aweme.getLogPbBean());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a A[Catch: Exception -> 0x01cd, TryCatch #0 {Exception -> 0x01cd, blocks: (B:30:0x009f, B:31:0x00a2, B:33:0x00af, B:35:0x00b3, B:37:0x00b7, B:38:0x00bb, B:40:0x00c2, B:42:0x00c6, B:43:0x00d3, B:45:0x00d9, B:47:0x00ed, B:50:0x00f9, B:53:0x0105, B:54:0x0115, B:56:0x011c, B:58:0x0129, B:60:0x0133, B:61:0x0137, B:64:0x013f, B:65:0x0142, B:68:0x014b, B:70:0x0151, B:72:0x0157, B:74:0x015b, B:76:0x015f, B:82:0x0174, B:84:0x017c, B:86:0x0182, B:88:0x0186, B:90:0x018a, B:97:0x0198, B:99:0x01a2, B:101:0x01a6, B:103:0x01aa, B:105:0x01b0, B:106:0x01b3, B:81:0x016a, B:109:0x01bb, B:18:0x0045, B:20:0x0051, B:23:0x0059, B:24:0x0072, B:26:0x0078, B:27:0x008a), top: B:116:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0196  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: CQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadLatest(X.C20599915jB r23, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C20599915jB>> r24) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel.onLoadLatest(X.15jB, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0167 A[Catch: Exception -> 0x01c8, TryCatch #0 {Exception -> 0x01c8, blocks: (B:30:0x009f, B:31:0x00a2, B:33:0x00af, B:35:0x00b3, B:37:0x00b7, B:38:0x00bb, B:40:0x00c2, B:42:0x00c6, B:43:0x00d3, B:45:0x00d9, B:47:0x00ed, B:50:0x00f6, B:53:0x0102, B:54:0x0112, B:56:0x0119, B:58:0x0126, B:60:0x0130, B:61:0x0134, B:64:0x013c, B:65:0x013f, B:68:0x0148, B:70:0x014e, B:72:0x0154, B:74:0x0158, B:76:0x015c, B:82:0x0171, B:84:0x0179, B:86:0x017f, B:88:0x0183, B:90:0x0187, B:95:0x0192, B:97:0x019c, B:99:0x01a0, B:101:0x01a4, B:105:0x01ae, B:106:0x01b1, B:81:0x0167, B:108:0x01b6, B:18:0x0045, B:20:0x0051, B:23:0x0059, B:24:0x0072, B:26:0x0078, B:27:0x008a), top: B:115:0x0023 }] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: DQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C20599915jB r24, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C20599915jB>> r25) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel.onLoadMore(X.15jB, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C20599915jB yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        long createTime = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return new C20599915jB(0L, false);
                }
                return new C20599915jB(this.LLILZIL, true);
            }
            return new C20599915jB(this.LLILZLL, true);
        }
        Aweme aweme = this.LLIZ;
        if (aweme != null) {
            createTime = aweme.getCreateTime() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return new C20599915jB(createTime, true);
    }
}
