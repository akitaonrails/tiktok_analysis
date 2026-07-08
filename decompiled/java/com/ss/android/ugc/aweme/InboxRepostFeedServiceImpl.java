package com.ss.android.ugc.aweme;

import X.C098200Yq;
import X.C1360750lVx;
import X.C1389890mGx;
import X.C13BV;
import X.C13LQ;
import X.C1440005kM;
import X.C189200o6;
import X.C1952107kl;
import X.C19EG;
import X.C2188811AlT;
import X.C2276471E8n;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class InboxRepostFeedServiceImpl implements IInboxRepostFeedService {
    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZJ() {
        C1952107kl.LIZ.getClass();
        C2276471E8n.LIZIZ.LIZIZ("detail_feed", "InboxRepostList", "clearReadAids");
        ((ArrayList) C1952107kl.LIZIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZLLL() {
        C1440005kM.LIZ(new IEvent() { // from class: X.09Zl
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJ() {
        Object c098200Yq;
        C1952107kl.LIZ.getClass();
        try {
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("store read repost aids, read aids: ");
            List<String> list = C1952107kl.LIZIZ;
            sbLIZ.append(((ArrayList) list).size());
            sbLIZ.append(", ");
            sbLIZ.append(list);
            c2276471E8n.LIZIZ("detail_feed", "InboxRepostList", C2188811AlT.LIZIZ(sbLIZ));
            C1952107kl.LIZ().storeStringArray((String) C1952107kl.LIZJ.getValue(), (String[]) ((ArrayList) list).toArray(new String[0]));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C2276471E8n.LIZIZ.LIZJ("detail_feed", thM5exceptionOrNullimpl, "InboxRepostList", "storeReadRepostAids");
        }
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJI() {
        C1440005kM.LIZ(new IEvent() { // from class: X.09Zk
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZ(String str) {
        C1952107kl.LIZ.getClass();
        if (str != null) {
            List<String> list = C1952107kl.LIZIZ;
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.contains(str)) {
                ArrayList arrayList2 = (ArrayList) C1360750lVx.LLILLL;
                boolean z = !arrayList2.contains(str);
                C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aid:");
                sbLIZ.append(str);
                sbLIZ.append(" is viewed: ");
                sbLIZ.append(z);
                c2276471E8n.LIZIZ("detail_feed", "InboxRepostList", C2188811AlT.LIZIZ(sbLIZ));
                if (!z) {
                    arrayList.add(str);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cur aid: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", read aids size: ");
                    sbLIZ2.append(arrayList.size());
                    sbLIZ2.append(", aids: ");
                    sbLIZ2.append(list);
                    c2276471E8n.LIZIZ("detail_feed", "InboxRepostList", C2188811AlT.LIZIZ(sbLIZ2));
                    arrayList2.remove(str);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("aid:");
                    sbLIZ3.append(str);
                    sbLIZ3.append(" is removed from unViewedItems");
                    c2276471E8n.LIZIZ("detail_feed", "InboxRepostList", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final List<String> LIZIZ(int i) {
        C1952107kl.LIZ.getClass();
        boolean z = true;
        if (i == 1) {
            List list = null;
            try {
                List listLJJLL = C13LQ.LJJLL(C1952107kl.LIZ().getStringArray((String) C1952107kl.LIZJ.getValue(), null));
                if (listLJJLL != null && !listLJJLL.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("get read aids from store, readAids: ");
                    sbLIZ.append(listLJJLL);
                    c2276471E8n.LIZIZ("detail_feed", "InboxRepostList", C2188811AlT.LIZIZ(sbLIZ));
                    list = listLJJLL;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C2276471E8n.LIZIZ.LIZJ("detail_feed", thM5exceptionOrNullimpl, "InboxRepostList", "getReadRepostAids error");
                }
            }
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            ArrayList arrayList = (ArrayList) C1952107kl.LIZIZ;
            arrayList.clear();
            arrayList.addAll(list);
        }
        C2276471E8n c2276471E8n2 = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("query type: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", read aids: ");
        List<String> list2 = C1952107kl.LIZIZ;
        sbLIZ2.append(((ArrayList) list2).size());
        sbLIZ2.append(", ");
        sbLIZ2.append(list2);
        c2276471E8n2.LIZIZ("detail_feed", "InboxRepostList", C2188811AlT.LIZIZ(sbLIZ2));
        return list2;
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJFF(Fragment fragment) {
        C19EG activity;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            String string = activity.getString(2131846411);
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final boolean LJII(int i) {
        boolean z;
        C1952107kl.LIZ.getClass();
        if (i == 39) {
            z = true;
        } else {
            z = false;
        }
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page type：");
        sbLIZ.append(i);
        sbLIZ.append(", is inbox repost list : ");
        sbLIZ.append(z);
        c2276471E8n.LIZIZ("detail_feed", "InboxRepostList", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }
}
