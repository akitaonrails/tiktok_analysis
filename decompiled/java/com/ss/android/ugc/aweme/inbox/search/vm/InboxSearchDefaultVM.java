package com.ss.android.ugc.aweme.inbox.search.vm;

import X.C0PE7;
import X.C0PEG;
import X.C0PEM;
import X.C1241310iPJ;
import X.C1241350iPN;
import X.C1241370iPP;
import X.C1241470iPZ;
import X.C13BV;
import X.C13LP;
import X.C1DEV;
import X.C2097608Jq;
import X.C2191201ApK;
import X.C23250099c;
import X.EnumC1241340iPM;
import X.EnumC1241490iPb;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchDefaultVM extends AssemViewModel<C1241370iPP> {
    public boolean LLIZ;
    public final int LL = 3;
    public final List<InterfaceC1891350zJl> LLILLJJLI = new ArrayList();
    public final List<InterfaceC1891350zJl> LLILLL = new ArrayList();
    public final Set<String> LLILZ = new LinkedHashSet();
    public final C0PEG LLILZIL = C0PEG.LIZ;
    public boolean LLILZLL = true;
    public final C1DEV LLIZLLLIL = C2191201ApK.LIZ();
    public final Map<EnumC1241340iPM, Set<String>> LLJ = C2097608Jq.LJIIIIZZ(new Pair(EnumC1241340iPM.RECENT, new LinkedHashSet()), new Pair(EnumC1241340iPM.SUGGESTED, new LinkedHashSet()));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1241370iPP(EnumC1241490iPb.REFRESH, C13BV.INSTANCE, new C1241470iPZ(0L, 0, 0L, 0, "", 0L, 0L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0iPN] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0iPJ] */
    public final List<InterfaceC1891350zJl> vQ2(List<? extends InterfaceC1891350zJl> list) {
        ?? r2;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (interfaceC1891350zJl instanceof C1241350iPN) {
                r2 = (C1241350iPN) interfaceC1891350zJl;
                if (!C13LP.LJJJJ(r2.LL.getUid(), this.LLILZ)) {
                    arrayList.add(r2);
                }
            } else if (interfaceC1891350zJl instanceof C1241310iPJ) {
                r2 = (C1241310iPJ) interfaceC1891350zJl;
                if (!this.LLILZ.contains(r2.LL.getConversationId())) {
                    arrayList.add(r2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(2:4|(1:6)(1:15))(0)|7|(1:78)|(1:(4:(1:(1:(1:(7:14|55|56|(1:58)|59|60|61)(2:16|17))(5:18|81|43|44|(4:83|46|47|48)(2:51|(1:53)(6:54|56|(0)|59|60|61))))(10:19|79|20|85|37|(1:39)|40|(1:42)|44|(0)(0)))(13:23|76|24|87|34|(1:36)|85|37|(0)|40|(0)|44|(0)(0))|69|72|73)(1:27))(2:28|(1:30))|74|31|(1:33)|87|34|(0)|85|37|(0)|40|(0)|44|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(2:4|(1:6)(1:15))(0)|7|78|(1:(4:(1:(1:(1:(7:14|55|56|(1:58)|59|60|61)(2:16|17))(5:18|81|43|44|(4:83|46|47|48)(2:51|(1:53)(6:54|56|(0)|59|60|61))))(10:19|79|20|85|37|(1:39)|40|(1:42)|44|(0)(0)))(13:23|76|24|87|34|(1:36)|85|37|(0)|40|(0)|44|(0)(0))|69|72|73)(1:27))(2:28|(1:30))|74|31|(1:33)|87|34|(0)|85|37|(0)|40|(0)|44|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x029c, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x029e, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02a0, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013e A[Catch: all -> 0x029c, TryCatch #6 {all -> 0x029c, blocks: (B:37:0x0119, B:39:0x013e, B:40:0x0147), top: B:85:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0162 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ee A[Catch: all -> 0x029a, TRY_ENTER, TryCatch #4 {all -> 0x029a, blocks: (B:43:0x0163, B:44:0x0166, B:51:0x01ee), top: B:81:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0250 A[Catch: all -> 0x02a5, TryCatch #2 {all -> 0x02a5, blocks: (B:55:0x0238, B:56:0x023b, B:58:0x0250, B:59:0x026b, B:69:0x02a1), top: B:78:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v13, types: [T] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM] */
    /* JADX WARN: Type inference failed for: r5v8, types: [T, X.0iPI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM.xQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(X.C1241470iPZ r13) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM.yQ2(X.0iPZ):void");
    }

    public final void zQ2(InboxSearchRecentStoreItem inboxSearchRecentStoreItem) {
        C23250099c.LIZLLL(getLifecycleScope(), C0PEM.LIZJ, null, new C0PE7(this, inboxSearchRecentStoreItem, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(java.util.List<com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem> r20, boolean r21, X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1891350zJl>> r22) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM.wQ2(java.util.List, boolean, X.05Vn):java.lang.Object");
    }
}
