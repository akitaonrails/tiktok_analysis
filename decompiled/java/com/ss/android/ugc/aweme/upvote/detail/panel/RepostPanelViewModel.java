package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.C01GW;
import X.C08CX;
import X.C1358750lSj;
import X.C1358770lSl;
import X.C1359720lUI;
import X.C13LP;
import X.C13LZ;
import X.C15442062u;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C298730BnL;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1359100lTI;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostPanelViewModel extends AssemViewModel<C1358750lSj> implements InterfaceC1359100lTI {
    public UpvoteList LL;
    public Aweme LLILLJJLI;
    public VideoItemParams LLILLL;
    public String LLILZ;
    public List<String> LLILZIL;
    public final Map<String, Integer> LLILZLL = new LinkedHashMap();
    public final Map<String, Set<String>> LLIZ = new LinkedHashMap();
    public final Map<String, Set<String>> LLIZLLLIL = new LinkedHashMap();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(351));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1358750lSj(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList wQ2(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r35) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.RepostPanelViewModel.wQ2(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList):com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList");
    }

    public final boolean xQ2(UpvoteStruct upvoteStruct) {
        String uid;
        if (!upvoteStruct.isPublished()) {
            return false;
        }
        if (!Intrinsics.LJFF(upvoteStruct.upvoteId, this.LLILZ)) {
            List<String> list = this.LLILZIL;
            if (list == null) {
                return false;
            }
            User user = upvoteStruct.user;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (!list.contains(uid)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.RepostPanelViewModel.vQ2(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList, boolean):void");
    }

    @Override // X.InterfaceC1359100lTI
    public final void P12(String str, UpvoteList upvoteList, String str2, boolean z) {
        String aid;
        List<UpvoteStruct> commentUpvotes;
        int i;
        int iLJ;
        Set set;
        String uid;
        if (z) {
            Aweme aweme = this.LLILLJJLI;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, str)) {
                UpvoteList upvoteListWQ2 = wQ2(upvoteList);
                if (C298730BnL.LIZIZ() && upvoteListWQ2 != null && (commentUpvotes = upvoteListWQ2.getCommentUpvotes()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (UpvoteStruct upvoteStruct : commentUpvotes) {
                        if (upvoteStruct.carrierType == CarrierType.COMMENT.getValue()) {
                            arrayList.add(upvoteStruct);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : arrayList) {
                        User user = ((UpvoteStruct) obj).user;
                        if (user == null || (uid = user.getUid()) == null) {
                            uid = "";
                        }
                        Object arrayList2 = linkedHashMap.get(uid);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(uid, arrayList2);
                        }
                        ((List) arrayList2).add(obj);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        Object key = entry.getKey();
                        List<UpvoteStruct> list = (List) entry.getValue();
                        Set set2 = (Set) ((LinkedHashMap) this.LLIZLLLIL).get(key);
                        ArrayList arrayList3 = new ArrayList();
                        for (UpvoteStruct upvoteStruct2 : list) {
                            C1358770lSl.LIZ.getClass();
                            String strLJII = C1358770lSl.LJII(upvoteStruct2);
                            if (strLJII != null) {
                                arrayList3.add(strLJII);
                            }
                        }
                        Set setLLIIIZ = C13LP.LLIIIZ(arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((UpvoteStruct) obj2).upvoteId.length() > 0) {
                                arrayList4.add(obj2);
                            }
                        }
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            String str3 = ((UpvoteStruct) it2.next()).carrierId;
                            if (str3 != null && str3.length() > 0) {
                                if (set2 == null) {
                                    set = C08CX.INSTANCE;
                                } else {
                                    set = set2;
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("fake_");
                                sbLIZ.append(str3);
                                if (set.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("fake_");
                                    sbLIZ2.append(str3);
                                    setLLIIIZ.add(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                        }
                        Set<String> setLLIIJI = C13LP.LLIIJI(setLLIIIZ);
                        this.LLIZLLLIL.put((String) key, setLLIIJI);
                        if (this.LLIZ.containsKey(key) && set2 != null) {
                            Set linkedHashSet = (Set) ((LinkedHashMap) this.LLIZ).get(key);
                            if (linkedHashSet == null) {
                                linkedHashSet = new LinkedHashSet();
                            }
                            ArrayList<UpvoteStruct> arrayList5 = new ArrayList();
                            for (Object obj3 : list) {
                                if (((UpvoteStruct) obj3).upvoteId.length() > 0) {
                                    arrayList5.add(obj3);
                                }
                            }
                            for (UpvoteStruct upvoteStruct3 : arrayList5) {
                                String str4 = upvoteStruct3.carrierId;
                                if (str4 != null && str4.length() > 0) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("fake_");
                                    sbLIZ3.append(str4);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                    if (linkedHashSet.contains(strLIZIZ)) {
                                        linkedHashSet.remove(strLIZIZ);
                                        linkedHashSet.add(upvoteStruct3.upvoteId);
                                    }
                                }
                            }
                            Set setLJII = C15442062u.LJII(set2, setLLIIJI);
                            if (setLJII.isEmpty()) {
                                continue;
                            } else {
                                if ((setLJII instanceof Collection) && setLJII.isEmpty()) {
                                    i = 0;
                                } else {
                                    Iterator it3 = setLJII.iterator();
                                    i = 0;
                                    while (it3.hasNext()) {
                                        if (linkedHashSet.remove(it3.next()) && (i = i + 1) < 0) {
                                            C1697810uHb.LJIJ();
                                            throw null;
                                        }
                                    }
                                }
                                int iIntValue = ((Number) C1359720lUI.LIZIZ(this.LLILZLL, key, 3)).intValue();
                                Map<String, Integer> map = this.LLILZLL;
                                if (i > 0 && iIntValue == linkedHashSet.size() + i) {
                                    iLJ = linkedHashSet.size();
                                } else {
                                    iLJ = C13LZ.LJ(iIntValue - setLJII.size(), 0, list.size());
                                }
                                map.put((String) key, Integer.valueOf(iLJ));
                            }
                        }
                    }
                }
                this.LL = upvoteListWQ2;
                vQ2(upvoteListWQ2, false);
            }
        }
    }
}
