package com.ss.android.ugc.aweme.upvote.detail.reposttab;

import X.AbstractC316870CbV;
import X.C050A;
import X.C099G;
import X.C0BNU;
import X.C0C64;
import X.C0PEM;
import X.C0XQ7;
import X.C1157130gDX;
import X.C123100dR;
import X.C1258560ir8;
import X.C1359600lU6;
import X.C1360460lVU;
import X.C15438062q;
import X.C1720106oR;
import X.C20600815jK;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23250099c;
import X.C322990ClN;
import X.C627660Ojc;
import X.EnumC1231460i9Q;
import X.EnumC1359020lTA;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS34S0000100_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RepostListViewModel extends BaseDetailShareVM<C1258560ir8, C050A, Long> {
    public static final /* synthetic */ int LLJJJ = 0;
    public long LLILZIL;
    public long LLILZLL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public C099G LLJJ;
    public boolean LLJJIII;
    public Bundle LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public Map<String, String> LLIZ = C2097608Jq.LJ();
    public String LLIZLLLIL = "";
    public int LLJ = -1;
    public int LLJI = -1;
    public final Set<String> LLJIJIL = new LinkedHashSet();
    public String LLJILJIL = "";
    public final Map<String, UpvoteList> LLJJI = new LinkedHashMap();

    public final boolean FQ2() {
        String str = this.LLIZLLLIL;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        return Intrinsics.LJFF(str, iAccountUserServiceLJFF != null ? iAccountUserServiceLJFF.getCurUserId() : null);
    }

    public final void KQ2() {
        if (this.LLJILLL) {
            setState(AFwS257S0000000_19.get$arr$(333));
            return;
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("RepostTabFragment", "truly refresh");
        C1720106oR.LJI("RepostTabFragment", "Grid viewmodel tryRefresh");
        setState(AFwS257S0000000_19.get$arr$(334));
        if (C0BNU.LIZ()) {
            this.LLJILJILJ = false;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1258560ir8(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        if (this.LLJJIII) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322990ClN(this, null), 2);
        }
    }

    public final void JQ2(String str) {
        if (C0BNU.LIZ()) {
            if (!Intrinsics.LJFF(this.LLIZLLLIL, str) && C123100dR.LIZ(str)) {
                this.LLJILJILJ = true;
                this.LLJJ = null;
            }
        } else if (!Intrinsics.LJFF(this.LLIZLLLIL, str) && C123100dR.LIZ(str) && C123100dR.LIZ(this.LLIZLLLIL)) {
            this.LLJILJILJ = true;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Grid viewModel needRefresh=");
        sbLIZ.append(this.LLJILJILJ);
        C1720106oR.LJI("RepostTabFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJILJILJ) {
            setState(AFwS257S0000000_19.get$arr$(710));
        }
        this.LLIZLLLIL = str;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        if (Intrinsics.LJFF(this.LLJILJIL, EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE.getParamValue())) {
            return 54;
        }
        if (Intrinsics.LJFF(this.LLJILJIL, "personal_homepage")) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return 2000;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C050A> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 266));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        this.LLILZLL = 0L;
        setState(AFwS257S0000000_19.get$arr$(332));
        ((LinkedHashMap) this.LLJJI).clear();
        return BQ2(12, 0L, 0, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        int i = -1;
        if (!Intrinsics.LJFF(this.LLIZLLLIL, C0XQ7.LJFF().getCurUserId())) {
            return -1;
        }
        List<ITEM> listListGetAll = listGetAll();
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((C050A) it2.next()).LL.getAid(), str)) {
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
        return ((C050A) interfaceC1891350zJl).LL;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    /* JADX INFO: renamed from: GQ2, reason: merged with bridge method [inline-methods] */
    public final void listAddItemAt(int i, C050A c050a) {
        if (!Intrinsics.LJFF(this.LLIZLLLIL, C0XQ7.LJFF().getCurUserId())) {
            return;
        }
        C20600815jK<ITEM> c20600815jK = this.state;
        if (c20600815jK != 0) {
            List<InterfaceC1891350zJl> listLJII = c20600815jK.LJII();
            if (!listLJII.isEmpty()) {
                for (InterfaceC1891350zJl interfaceC1891350zJl : listLJII) {
                    if ((interfaceC1891350zJl instanceof C050A) && Intrinsics.LJFF(((C050A) interfaceC1891350zJl).LL.getAid(), c050a.LL.getAid())) {
                        return;
                    }
                }
            }
        }
        super.listAddItemAt(i, c050a);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        long jLongValue = ((Number) obj).longValue();
        setState(new AwS34S0000100_19(jLongValue, 1));
        return BQ2(12, jLongValue, 0, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    public final void EQ2(List list, List list2, Map map) {
        Pair pair;
        EnumC1359020lTA enumC1359020lTA;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL((Aweme) it3.next());
        }
        if (C1359600lU6.LIZLLL()) {
            String str = this.LLIZLLLIL;
            if (!arrayList.isEmpty() && str != null && str.length() != 0) {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                linkedHashMap = new LinkedHashMap(iLIZIZ);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    linkedHashMap.put(it4.next(), str);
                }
            } else {
                linkedHashMap = null;
            }
            pair = new Pair(null, linkedHashMap);
        } else {
            pair = new Pair(map, null);
        }
        Map<String, Long> map2 = (Map) pair.getFirst();
        Map<String, String> map3 = (Map) pair.getSecond();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "repost_tab_data_merge", true, false)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handle data combined uid = ");
            sbLIZ.append(this.LLIZLLLIL);
            sbLIZ.append(", upvoteLists = ");
            sbLIZ.append(list2);
            C1720106oR.LJI("RepostTabFragment", C2188811AlT.LIZIZ(sbLIZ));
            runOnUIThread(new AwS228S0300000_19(list, (List<? extends Aweme>) list2, (List<UpvoteList>) this, (RepostListViewModel) 27));
            if (list2 != null) {
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    UpvoteList upvoteList = (UpvoteList) it5.next();
                    this.LLJJI.put(upvoteList.itemId, upvoteList);
                }
            }
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("RepostTabFragment", "handle data combined finish");
            return;
        }
        int i3 = C2187451AjH.LIZ;
        C1720106oR.LJI("RepostTabFragment", "batch/list: ");
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        if (FQ2()) {
            enumC1359020lTA = EnumC1359020lTA.MY_UPVOTE_TAB;
        } else {
            enumC1359020lTA = EnumC1359020lTA.OTHERS_UPVOTE_TAB;
        }
        c1360460lVU.LJIIJJI(list, true, map2, map3, enumC1359020lTA, null);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return Long.valueOf(this.LLILZIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r8 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115 A[Catch: Exception -> 0x01a5, TryCatch #0 {Exception -> 0x01a5, blocks: (B:39:0x00ed, B:40:0x00f0, B:44:0x00fa, B:46:0x0115, B:47:0x011e, B:48:0x0130, B:50:0x0136, B:52:0x013e, B:53:0x014a, B:55:0x0150, B:56:0x0166, B:61:0x0171, B:62:0x0179, B:63:0x017d, B:64:0x017e, B:66:0x0189, B:68:0x019a, B:41:0x00f3, B:42:0x00f6, B:43:0x00f8, B:30:0x00ae, B:31:0x00b1, B:33:0x00b5, B:19:0x0076, B:21:0x007c, B:25:0x0084, B:27:0x009d, B:36:0x00d2), top: B:73:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136 A[Catch: Exception -> 0x01a5, TryCatch #0 {Exception -> 0x01a5, blocks: (B:39:0x00ed, B:40:0x00f0, B:44:0x00fa, B:46:0x0115, B:47:0x011e, B:48:0x0130, B:50:0x0136, B:52:0x013e, B:53:0x014a, B:55:0x0150, B:56:0x0166, B:61:0x0171, B:62:0x0179, B:63:0x017d, B:64:0x017e, B:66:0x0189, B:68:0x019a, B:41:0x00f3, B:42:0x00f6, B:43:0x00f8, B:30:0x00ae, B:31:0x00b1, B:33:0x00b5, B:19:0x0076, B:21:0x007c, B:25:0x0084, B:27:0x009d, B:36:0x00d2), top: B:73:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189 A[Catch: Exception -> 0x01a5, TryCatch #0 {Exception -> 0x01a5, blocks: (B:39:0x00ed, B:40:0x00f0, B:44:0x00fa, B:46:0x0115, B:47:0x011e, B:48:0x0130, B:50:0x0136, B:52:0x013e, B:53:0x014a, B:55:0x0150, B:56:0x0166, B:61:0x0171, B:62:0x0179, B:63:0x017d, B:64:0x017e, B:66:0x0189, B:68:0x019a, B:41:0x00f3, B:42:0x00f6, B:43:0x00f8, B:30:0x00ae, B:31:0x00b1, B:33:0x00b5, B:19:0x0076, B:21:0x007c, B:25:0x0084, B:27:0x009d, B:36:0x00d2), top: B:73:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a A[Catch: Exception -> 0x01a5, TryCatch #0 {Exception -> 0x01a5, blocks: (B:39:0x00ed, B:40:0x00f0, B:44:0x00fa, B:46:0x0115, B:47:0x011e, B:48:0x0130, B:50:0x0136, B:52:0x013e, B:53:0x014a, B:55:0x0150, B:56:0x0166, B:61:0x0171, B:62:0x0179, B:63:0x017d, B:64:0x017e, B:66:0x0189, B:68:0x019a, B:41:0x00f3, B:42:0x00f6, B:43:0x00f8, B:30:0x00ae, B:31:0x00b1, B:33:0x00b5, B:19:0x0076, B:21:0x007c, B:25:0x0084, B:27:0x009d, B:36:0x00d2), top: B:73:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(int r27, long r28, int r30, java.lang.String r31, X.InterfaceC1364105Vn r32) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel.BQ2(int, long, int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object IQ2(int r21, long r22, int r24, java.lang.String r25, X.InterfaceC1364105Vn r26) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel.IQ2(int, long, int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ee  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [long] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [long] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(java.lang.String r26, long r27, int r29, int r30, boolean r31, X.InterfaceC1364105Vn<? super X.C1260790iuj> r32) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel.CQ2(java.lang.String, long, int, int, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ab -> B:11:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(int r22, int r23, int r24, long r25, java.lang.String r27, X.InterfaceC1364105Vn r28) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel.HQ2(int, int, int, long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
