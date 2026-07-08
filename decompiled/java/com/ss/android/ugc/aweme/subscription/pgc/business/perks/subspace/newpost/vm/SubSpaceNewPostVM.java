package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm;

import X.AbstractC511160K2w;
import X.C0K2M;
import X.C0K44;
import X.C0K4A;
import X.C0K4E;
import X.C0K4F;
import X.C0K4G;
import X.C0K4H;
import X.C0K4I;
import X.C1173704iV;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C502070JmX;
import X.C511240K3e;
import X.C511300K3k;
import X.C511320K3m;
import X.C511330K3n;
import X.C511520K4g;
import X.EnumC507460JvE;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.text.a0;
import kotlin.text.u;
import webcast.api.pgc_sub.PGCPostCreateReq;
import webcast.api.pgc_sub.PGCSpacePollReqInfo;
import webcast.api.pgc_sub.PGCTopicByCategory;
import webcast.api.sub.SpacePollReqInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceNewPostVM extends AssemViewModel<C502070JmX> {
    public InterfaceC665370Q7z LL;
    public C0K4F LLILLJJLI;
    public boolean LLILLL;
    public C511240K3e LLILZ;

    public final C0K4F DQ2() {
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0K4F.class, null);
            this.LLILLJJLI = interfaceC1555100qZQLIZIZ != null ? (C0K4F) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void HQ2() {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM.HQ2():void");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C502070JmX(0);
    }

    public final Collection<AbstractC511160K2w> vQ2() {
        List listLJIIJJI;
        SpacePollReqInfo spacePollReqInfo;
        List<String> list;
        C0K4A c0k4a;
        ArrayList arrayList = new ArrayList();
        C0K4F c0k4fDQ2 = DQ2();
        String str = (c0k4fDQ2 == null || (c0k4a = c0k4fDQ2.LL) == null) ? null : c0k4a.LJFF;
        if (str == null) {
            str = "";
        }
        C0K4F c0k4fDQ22 = DQ2();
        if (c0k4fDQ22 == null || (spacePollReqInfo = c0k4fDQ22.LLILLL) == null || (list = spacePollReqInfo.optionList) == null || (listLJIIJJI = C13LP.LLIIII(list)) == null) {
            listLJIIJJI = C13BV.INSTANCE;
        }
        arrayList.add(new C0K4H(new C1173704iV(str)));
        if (listLJIIJJI.size() < 2) {
            listLJIIJJI = C1697810uHb.LJIIJJI("", "");
        }
        int i = 0;
        for (Object obj : listLJIIJJI) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            arrayList.add(new C0K4G(new C0K44(i2, (String) obj, i < 2)));
            i = i2;
        }
        if (listLJIIJJI.size() < 10) {
            arrayList.add(new C511330K3n());
        }
        return arrayList;
    }

    public final String yQ2() {
        AbstractC511160K2w abstractC511160K2w;
        C0K4F c0k4fDQ2;
        C0K4A c0k4a;
        String str;
        C0K4H c0k4h;
        C1173704iV c1173704iV;
        ArrayList<AbstractC511160K2w> arrayList;
        AbstractC511160K2w next;
        C511240K3e c511240K3e = this.LLILZ;
        if (c511240K3e == null || (arrayList = c511240K3e.LL) == null) {
            abstractC511160K2w = null;
        } else {
            Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next instanceof C0K4H) {
                    break;
                }
            }
            abstractC511160K2w = next;
        }
        return ((!(abstractC511160K2w instanceof C0K4H) || (c0k4h = (C0K4H) abstractC511160K2w) == null || (c1173704iV = c0k4h.LIZ) == null || (str = c1173704iV.LIZ) == null) && ((c0k4fDQ2 = DQ2()) == null || (c0k4a = c0k4fDQ2.LL) == null || (str = c0k4a.LJFF) == null)) ? "" : str;
    }

    public final List<String> zQ2() {
        C0K4A c0k4a;
        SpaceTopicContent spaceTopicContent;
        C0K4A c0k4a2;
        SpaceTopicCategory spaceTopicCategory;
        ArrayList arrayList = new ArrayList();
        C0K4F c0k4fDQ2 = DQ2();
        if (c0k4fDQ2 != null && (c0k4a2 = c0k4fDQ2.LL) != null && (spaceTopicCategory = c0k4a2.LIZIZ) != null) {
            if (spaceTopicCategory.topicCategoryId != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("category_id:");
                sbLIZ.append(spaceTopicCategory.topicCategoryId);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!a0.LJJJIL(spaceTopicCategory.topicCategoryText)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("category_text:");
                sbLIZ2.append(spaceTopicCategory.topicCategoryText);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        C0K4F c0k4fDQ22 = DQ2();
        if (c0k4fDQ22 != null && (c0k4a = c0k4fDQ22.LL) != null && (spaceTopicContent = c0k4a.LIZLLL) != null) {
            if (spaceTopicContent.topicContentId != 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("topic_id:");
                sbLIZ3.append(spaceTopicContent.topicContentId);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (!a0.LJJJIL(spaceTopicContent.topicContentText)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("topic_text:");
                sbLIZ4.append(spaceTopicContent.topicContentText);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        return arrayList;
    }

    public static String AQ2() {
        User currentUser;
        String secUid;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null || !(a0.LJJJIL(secUid) ^ true)) ? "pgc_sub_space_new_post" : secUid;
    }

    public final PGCPostCreateReq CQ2() {
        String string = a0.LJLIIIL(yQ2()).toString();
        if (a0.LJJJIL(string)) {
            return null;
        }
        List<String> listXQ2 = xQ2(true);
        ArrayList arrayList = new ArrayList();
        for (String str : listXQ2) {
            if (!a0.LJJJIL(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.size() < 2) {
            return null;
        }
        PGCPostCreateReq pGCPostCreateReq = new PGCPostCreateReq();
        PGCSpacePollReqInfo pGCSpacePollReqInfo = new PGCSpacePollReqInfo();
        pGCSpacePollReqInfo.optionList = arrayList2;
        pGCPostCreateReq.text = string;
        pGCPostCreateReq.contentType = EnumC507460JvE.POLL.getValue();
        pGCPostCreateReq.pollInfo = pGCSpacePollReqInfo;
        return pGCPostCreateReq;
    }

    public final boolean EQ2() {
        C0K4A c0k4a;
        SpaceTopicCategory spaceTopicCategory;
        C0K4F c0k4fDQ2 = DQ2();
        return (c0k4fDQ2 == null || (c0k4a = c0k4fDQ2.LL) == null || (spaceTopicCategory = c0k4a.LIZIZ) == null || spaceTopicCategory.topicCategoryId != -1211) ? false : true;
    }

    public final void IQ2() {
        KQ2();
        setState(AFwS237S0000000_7.get$arr$(229));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void KQ2() {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM.KQ2():void");
    }

    public final void BQ2(PGCPostCreateReq pGCPostCreateReq) {
        C0K4A c0k4a;
        C0K4A c0k4a2;
        C0K4E.LIZ().LIZJ("sub_space_new_post");
        C0K4F c0k4fDQ2 = DQ2();
        if (c0k4fDQ2 != null && (c0k4a2 = c0k4fDQ2.LL) != null) {
            c0k4a2.LIZJ = null;
        }
        C0K4F c0k4fDQ22 = DQ2();
        if (c0k4fDQ22 != null && (c0k4a = c0k4fDQ22.LL) != null) {
            c0k4a.LJFF = null;
        }
        C0K4F c0k4fDQ23 = DQ2();
        if (c0k4fDQ23 != null) {
            c0k4fDQ23.LLILLL = null;
        }
        DQ2();
        setState(AFwS237S0000000_7.get$arr$(368));
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
        if (subSpaceFeedAbility != null) {
            subSpaceFeedAbility.e(pGCPostCreateReq);
        }
    }

    public final void JQ2(SpaceTopicContent spaceTopicContent) {
        withState(new AwS373S0200000_7(this, spaceTopicContent, 29));
        KQ2();
    }

    public final PGCPostCreateReq wQ2(String str) {
        C0K4A c0k4a;
        SpaceTopicCategory spaceTopicCategory;
        String string;
        C0K4F c0k4fDQ2;
        C0K4A c0k4a2;
        String str2;
        String string2;
        C0K4A c0k4a3;
        SpaceTopicContent spaceTopicContent;
        C0K4A c0k4a4;
        SpaceTopicContent spaceTopicContent2;
        String str3;
        C0K4F c0k4fDQ22 = DQ2();
        if (c0k4fDQ22 == null || (c0k4a = c0k4fDQ22.LL) == null || (spaceTopicCategory = c0k4a.LIZIZ) == null) {
            return null;
        }
        C0K4F c0k4fDQ23 = DQ2();
        if (c0k4fDQ23 != null && (c0k4a4 = c0k4fDQ23.LL) != null && (spaceTopicContent2 = c0k4a4.LIZLLL) != null && (str3 = spaceTopicContent2.topicContentText) != null) {
            string = a0.LJLIIIL(str3).toString();
        } else {
            string = null;
        }
        String str4 = "";
        if (string == null) {
            string = "";
        }
        if ((str != null && (string2 = a0.LJLIIIL(str).toString()) != null && !a0.LJJJIL(string2)) || ((c0k4fDQ2 = DQ2()) != null && (c0k4a2 = c0k4fDQ2.LL) != null && (str2 = c0k4a2.LIZJ) != null && (string2 = a0.LJLIIIL(str2).toString()) != null)) {
            str4 = string2;
        }
        if (!a0.LJJJIL(str4)) {
            string = str4;
        }
        if (a0.LJJJIL(string)) {
            return null;
        }
        PGCPostCreateReq pGCPostCreateReq = new PGCPostCreateReq();
        pGCPostCreateReq.text = string;
        pGCPostCreateReq.contentType = EnumC507460JvE.TEXT.getValue();
        SpaceTopicInfo spaceTopicInfo = new SpaceTopicInfo();
        spaceTopicInfo.spaceTopicCategory = spaceTopicCategory;
        C0K4F c0k4fDQ24 = DQ2();
        if (c0k4fDQ24 != null && (c0k4a3 = c0k4fDQ24.LL) != null && (spaceTopicContent = c0k4a3.LIZLLL) != null) {
            spaceTopicInfo.spaceTopicContent = spaceTopicContent;
        }
        pGCPostCreateReq.topicInfo = spaceTopicInfo;
        return pGCPostCreateReq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public final List<String> xQ2(boolean z) {
        ?? LLIIII;
        SpacePollReqInfo spacePollReqInfo;
        List<String> list;
        C511240K3e c511240K3e = this.LLILZ;
        if (c511240K3e != null) {
            ArrayList<AbstractC511160K2w> arrayList = c511240K3e.LL;
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC511160K2w abstractC511160K2w : arrayList) {
                    if (abstractC511160K2w instanceof C0K4G) {
                        arrayList2.add(abstractC511160K2w);
                    }
                }
                LLIIII = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    LLIIII.add(((C0K4G) it2.next()).LIZ.LIZIZ);
                }
            } else {
                LLIIII = C13BV.INSTANCE;
            }
        } else {
            C0K4F c0k4fDQ2 = DQ2();
            if (c0k4fDQ2 == null || (spacePollReqInfo = c0k4fDQ2.LLILLL) == null || (list = spacePollReqInfo.optionList) == null || (LLIIII = C13LP.LLIIII(list)) == 0) {
                LLIIII = C13BV.INSTANCE;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(LLIIII, 10));
            Iterator it3 = LLIIII.iterator();
            while (it3.hasNext()) {
                arrayList3.add(a0.LJLIIIL((String) it3.next()).toString());
            }
            return arrayList3;
        }
        return LLIIII;
    }

    public static String FQ2(String str, List list) {
        Object next;
        String strLJJJJZ;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (u.LJJIIJZLJL((String) next, str, false)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        String str2 = (String) next;
        if (str2 == null || (strLJJJJZ = a0.LJJJJZ(str, str2)) == null || !(!a0.LJJJIL(strLJJJJZ))) {
            return null;
        }
        return strLJJJJZ;
    }

    public final ArrayList<AbstractC511160K2w> GQ2(List<PGCTopicByCategory> list, SpaceTopicCategory spaceTopicCategory) {
        int size;
        PGCTopicByCategory pGCTopicByCategory;
        SpaceTopicCategory spaceTopicCategory2;
        List<SpaceTopicContent> list2;
        C0K4A c0k4a;
        SpaceTopicInfo spaceTopicInfo;
        C0K4A c0k4a2;
        SpaceTopicInfo spaceTopicInfo2;
        PGCTopicByCategory next;
        C0K4A c0k4a3;
        SpaceTopicCategory spaceTopicCategory3;
        C0K4F c0k4fDQ2;
        C0K4A c0k4a4;
        PGCTopicByCategory pGCTopicByCategory2;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        SpaceTopicContent spaceTopicContent = null;
        if (size <= 0) {
            return null;
        }
        ArrayList<AbstractC511160K2w> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator<PGCTopicByCategory> it2 = list.iterator();
            while (it2.hasNext()) {
                SpaceTopicCategory spaceTopicCategory4 = it2.next().topicCategory;
                if (spaceTopicCategory4 != null) {
                    arrayList2.add(spaceTopicCategory4);
                }
            }
        }
        SpaceTopicCategory spaceTopicCategory5 = new SpaceTopicCategory();
        spaceTopicCategory5.topicCategoryId = -1211L;
        String strLJII = C511520K4g.LJII(2131839558);
        if (strLJII == null) {
            strLJII = "";
        }
        spaceTopicCategory5.topicCategoryText = strLJII;
        arrayList2.add(spaceTopicCategory5);
        arrayList.add(new C511300K3k(arrayList2));
        if (spaceTopicCategory != null && spaceTopicCategory.topicCategoryId == -1211) {
            arrayList.addAll(vQ2());
        } else {
            arrayList.add(new C511320K3m());
            if (spaceTopicCategory == null && (list == null || (pGCTopicByCategory2 = (PGCTopicByCategory) ListProtector.get(list, 0)) == null || (spaceTopicCategory = pGCTopicByCategory2.topicCategory) == null)) {
                return null;
            }
            C0K4F c0k4fDQ22 = DQ2();
            if (c0k4fDQ22 != null && (c0k4a3 = c0k4fDQ22.LL) != null && (spaceTopicCategory3 = c0k4a3.LIZIZ) != null && spaceTopicCategory3.topicCategoryId == 0 && (c0k4fDQ2 = DQ2()) != null && (c0k4a4 = c0k4fDQ2.LL) != null) {
                c0k4a4.LIZIZ = spaceTopicCategory;
            }
            if (list != null) {
                Iterator<PGCTopicByCategory> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        SpaceTopicCategory spaceTopicCategory6 = next.topicCategory;
                        if (spaceTopicCategory6 != null && spaceTopicCategory6.topicCategoryId == spaceTopicCategory.topicCategoryId) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                pGCTopicByCategory = next;
            } else {
                pGCTopicByCategory = null;
            }
            C0K4F c0k4fDQ23 = DQ2();
            if (c0k4fDQ23 != null && (c0k4a2 = c0k4fDQ23.LL) != null && (spaceTopicInfo2 = c0k4a2.LJ) != null) {
                spaceTopicCategory2 = spaceTopicInfo2.spaceTopicCategory;
            } else {
                spaceTopicCategory2 = null;
            }
            C0K4F c0k4fDQ24 = DQ2();
            if (c0k4fDQ24 != null && (c0k4a = c0k4fDQ24.LL) != null && (spaceTopicInfo = c0k4a.LJ) != null) {
                spaceTopicContent = spaceTopicInfo.spaceTopicContent;
            }
            if (spaceTopicCategory2 != null && spaceTopicCategory2.topicCategoryId == spaceTopicCategory.topicCategoryId && spaceTopicContent != null) {
                arrayList.add(new C0K4I(spaceTopicContent));
            }
            if (pGCTopicByCategory != null && (list2 = pGCTopicByCategory.topicContentList) != null) {
                for (SpaceTopicContent spaceTopicContent2 : list2) {
                    if (spaceTopicContent == null || spaceTopicContent.topicContentId != spaceTopicContent2.topicContentId) {
                        arrayList.add(new C0K4I(spaceTopicContent2));
                    }
                }
            }
        }
        arrayList.add(new C0K2M(0));
        return arrayList;
    }
}
