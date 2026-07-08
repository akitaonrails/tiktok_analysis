package com.ss.android.ugc.aweme.base.vm;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0AG9;
import X.C0CZP;
import X.C0KBN;
import X.C1336205Ku;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C20611915l7;
import X.C20612815lG;
import X.C20612915lH;
import X.C316410Cal;
import X.C316510Cav;
import X.C316530Cax;
import X.C316560Cb0;
import X.C316580Cb2;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C316690CbD;
import X.C317290CcB;
import X.C325560CpW;
import X.C452501pT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.IMentionApi;
import com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.model.MentionCheckResult;
import com.ss.android.ugc.aweme.model.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.model.MentionCommentSortedResponse;
import com.ss.android.ugc.aweme.model.MentionRecentContactResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class MentionListViewModel extends AssemListViewModel<C325560CpW, InterfaceC1891350zJl, Long> {
    public C20612815lG LL;
    public boolean LLILZ;
    public MentionContainerViewModel LLIZ;
    public String LLILLJJLI = "";
    public boolean LLILLL = true;
    public final Set<String> LLILZIL = new LinkedHashSet();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(952));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(953));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325560CpW(0);
    }

    public final HorizontalMentionMixSearchService wQ2() {
        return (HorizontalMentionMixSearchService) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        wQ2().release();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static long vQ2(String str) {
        switch (str.hashCode()) {
            case -1940398403:
                if (!str.equals("publish_quick")) {
                    return 0L;
                }
                return 6L;
            case -1890252483:
                if (!str.equals("sticker")) {
                    return 0L;
                }
                return 6L;
            case -1717040940:
                if (!str.equals("text_caption")) {
                    return 0L;
                }
                return 6L;
            case -235365105:
                if (!str.equals("publish")) {
                    return 0L;
                }
                return 6L;
            case 178010482:
                if (!str.equals("profile_bio")) {
                    return 0L;
                }
                return 9L;
            case 640943257:
                if (!str.equals("repost_text")) {
                    return 0L;
                }
                return 3L;
            case 950398559:
                if (!str.equals("comment")) {
                    return 0L;
                }
                return 3L;
            default:
                return 0L;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String xQ2(String str) {
        switch (str.hashCode()) {
            case -1940398403:
                if (!str.equals("publish_quick")) {
                    return "find_friends";
                }
                return "at_user";
            case -1890252483:
                if (!str.equals("sticker")) {
                    return "find_friends";
                }
                return "at_user";
            case -1717040940:
                if (!str.equals("text_caption")) {
                    return "find_friends";
                }
                return "at_user";
            case -235365105:
                if (!str.equals("publish")) {
                    return "find_friends";
                }
                return "at_user";
            case 178010482:
                if (!str.equals("profile_bio")) {
                    return "find_friends";
                }
                return "at_user";
            case 640943257:
                if (!str.equals("repost_text")) {
                    return "find_friends";
                }
                return "comment_user";
            case 950398559:
                if (!str.equals("comment")) {
                    return "find_friends";
                }
                return "comment_user";
            default:
                return "find_friends";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object FQ2(X.InterfaceC1364105Vn<? super X.C316510Cav> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C316470Car
            if (r0 == 0) goto L86
            r3 = r12
            X.0Car r3 = (X.C316470Car) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r10 = 0
            r2 = 1
            if (r0 == 0) goto L41
            if (r0 != r2) goto L8c
            X.C155000ia.LIZIZ(r1)
        L23:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L94
            java.util.Iterator r3 = r1.iterator()
        L2b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.0Cav r1 = (X.C316510Cav) r1
            boolean r0 = r1.LJI
            if (r0 == 0) goto L2b
            boolean r0 = r1.LJII
            if (r0 == 0) goto L2b
            return r2
        L41:
            X.C155000ia.LIZIZ(r1)
            X.15lG r0 = r11.LL
            if (r0 == 0) goto L94
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZLLL
            if (r1 == 0) goto L94
            java.lang.String r0 = "authorId"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L94
            int r0 = r0.length()
            if (r0 <= 0) goto L94
            X.15lG r0 = r11.LL
            if (r0 == 0) goto L84
            java.lang.String r1 = r0.LIZJ
        L62:
            java.lang.String r0 = "comment"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L94
            java.lang.Class<com.ss.android.ugc.aweme.im.search.api.service.IIMGroupSearchService> r5 = com.ss.android.ugc.aweme.im.search.api.service.IIMGroupSearchService.class
            r6 = 0
            r9 = 14
            r7 = r6
            r8 = r6
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.im.search.api.service.IIMGroupSearchService r1 = (com.ss.android.ugc.aweme.im.search.api.service.IIMGroupSearchService) r1
            if (r1 == 0) goto L94
            java.lang.String r0 = r11.LLILLJJLI
            r3.LLILLL = r2
            java.lang.Object r1 = r1.LIZ(r0, r3)
            if (r1 != r4) goto L23
            return r4
        L84:
            r1 = r10
            goto L62
        L86:
            X.0Car r3 = new X.0Car
            r3.<init>(r11, r12)
            goto L12
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L94:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.MentionListViewModel.FQ2(X.05Vn):java.lang.Object");
    }

    public final C316560Cb0 HQ2(C316510Cav c316510Cav) {
        MentionContainerViewModel mentionContainerViewModel = this.LLIZ;
        if (mentionContainerViewModel != null) {
            mentionContainerViewModel.LLILZIL.put(c316510Cav.LIZ, new C316530Cax(c316510Cav.LJIIIZ, c316510Cav.LJIIIIZZ, c316510Cav.LJIIJ));
        }
        return new C316560Cb0(c316510Cav.LIZJ, c316510Cav.LIZLLL, c316510Cav.LIZ, c316510Cav.LIZIZ, c316510Cav.LJ);
    }

    public final List<C316580Cb2> IQ2(List<C20611915l7> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C20611915l7 c20611915l7 : list) {
            arrayList.add(new C316580Cb2(c20611915l7, this.LLILZIL.contains(c20611915l7.LIZ)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> KQ2(java.util.List<? extends X.InterfaceC1891350zJl> r9) {
        /*
            r8 = this;
            r0 = r9
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r7 = 6 - r0
            r6 = 0
            if (r7 < 0) goto L43
            if (r7 <= 0) goto L43
            X.15lG r0 = r8.LL
            r5 = 1
            if (r0 == 0) goto L41
            int r0 = r0.LJIILJJIL
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r0 = r4.intValue()
            if (r0 == 0) goto L41
        L1f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r7)
            r2 = 0
        L25:
            X.00GN r1 = new X.00GN
            if (r4 == 0) goto L3c
            int r0 = r4.intValue()
            r1.<init>(r0, r5)
        L30:
            r3.add(r1)
            int r2 = r2 + 1
            if (r2 < r7) goto L25
            java.util.List r0 = X.C13LP.LJLIL(r3, r9)
            return r0
        L3c:
            r0 = 3
            r1.<init>(r6, r0)
            goto L30
        L41:
            r4 = 0
            goto L1f
        L43:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.MentionListViewModel.KQ2(java.util.List):java.util.List");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 40));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013f  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r24) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.MentionListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final List<C20611915l7> AQ2(MentionRecentContactResponse mentionRecentContactResponse, long j) {
        long jVQ2;
        String str;
        C316410Cal.LIZ.getClass();
        List<IMUser> listLJIIL = C1336205Ku.LIZ(false).getImUserService().LJIIL();
        List<IMUser> listLJIILL = C1336205Ku.LIZ(false).getImUserService().LJIILL();
        ArrayList arrayList = new ArrayList();
        Iterator<IMUser> it2 = listLJIIL.iterator();
        while (it2.hasNext()) {
            String uid = it2.next().getUid();
            if (uid != null) {
                arrayList.add(uid);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<IMUser> it3 = listLJIILL.iterator();
        while (it3.hasNext()) {
            String uid2 = it3.next().getUid();
            if (uid2 != null) {
                arrayList2.add(uid2);
            }
        }
        C20612815lG c20612815lG = this.LL;
        if (c20612815lG != null && (str = c20612815lG.LIZJ) != null) {
            jVQ2 = vQ2(str);
        } else {
            jVQ2 = 0;
        }
        C0CZP.LIZJ(arrayList.size(), arrayList2.size(), C13LP.LJJJJI(C13LP.LJLIL(arrayList2, arrayList)).size(), jVQ2);
        C0CZP.LIZIZ(System.currentTimeMillis() - j, jVQ2, false);
        C316690CbD.LIZ.getClass();
        return C316690CbD.LJIIIIZZ(mentionRecentContactResponse, listLJIIL, listLJIILL);
    }

    public final AbstractC316870CbV BQ2(long j, boolean z) {
        int i;
        try {
            C316410Cal c316410Cal = C316410Cal.LIZ;
            if (z) {
                i = 0;
            } else {
                i = (int) j;
            }
            int iIntValue = ((Number) C0AG9.LIZ.getValue()).intValue();
            c316410Cal.getClass();
            MentionCommentSortedResponse mentionCommentSortedResponse = ((IMentionApi) C316410Cal.LIZIZ.getValue()).queryMentionSortedList(iIntValue, i).execute().LIZIZ;
            if (z) {
                List<MentionCheckResult> list = mentionCommentSortedResponse.blockResults;
                ArrayList arrayList = new ArrayList();
                for (MentionCheckResult mentionCheckResult : list) {
                    List<MentionCheckSingleTypeResult> list2 = mentionCheckResult.userBlockedResults;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<MentionCheckSingleTypeResult> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (it2.next().blockType != 0) {
                                arrayList.add(mentionCheckResult);
                                break;
                            }
                        }
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    linkedHashSet.add(((MentionCheckResult) it3.next()).uid);
                }
                wQ2().LIZLLL = linkedHashSet;
            }
            C316690CbD c316690CbD = C316690CbD.LIZ;
            C20612815lG c20612815lG = this.LL;
            c316690CbD.getClass();
            List<C20611915l7> listLJ = C316690CbD.LJ(mentionCommentSortedResponse, c20612815lG);
            if (mentionCommentSortedResponse.hasMore) {
                return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, Long.valueOf(mentionCommentSortedResponse.cursor), IQ2(listLJ), 1);
            }
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            List<C316580Cb2> listIQ2 = IQ2(listLJ);
            c317290CcB.getClass();
            return new C316640Cb8(listIQ2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20612915lH.LIZIZ.LJIIIIZZ().LIZIZ(e, null);
            AbstractC316870CbV.LIZ.getClass();
            return new C316650Cb9(e);
        }
    }

    public final Object CQ2(boolean z, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        String str;
        C20612815lG c20612815lG = this.LL;
        if (c20612815lG != null && (str = c20612815lG.LIZJ) != null) {
            long jVQ2 = vQ2(str);
            String strXQ2 = xQ2(str);
            if (z) {
                return zQ2(jVQ2, strXQ2, interfaceC1364105Vn);
            }
            return yQ2(jVQ2, strXQ2, interfaceC1364105Vn);
        }
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB.getClass();
        return new C316640Cb8(c13bv);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e A[Catch: Exception -> 0x0143, TryCatch #1 {Exception -> 0x0143, blocks: (B:48:0x00f0, B:49:0x00f3, B:51:0x00fa, B:53:0x0108, B:54:0x0134, B:16:0x003c, B:18:0x0044, B:19:0x0046, B:21:0x004c, B:23:0x0050, B:24:0x0052, B:32:0x0062, B:34:0x0068, B:37:0x008b, B:39:0x00bc, B:41:0x00cd, B:43:0x00dc, B:45:0x00e2, B:50:0x00f6, B:35:0x006e), top: B:83:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b A[Catch: Exception -> 0x0143, TryCatch #1 {Exception -> 0x0143, blocks: (B:48:0x00f0, B:49:0x00f3, B:51:0x00fa, B:53:0x0108, B:54:0x0134, B:16:0x003c, B:18:0x0044, B:19:0x0046, B:21:0x004c, B:23:0x0050, B:24:0x0052, B:32:0x0062, B:34:0x0068, B:37:0x008b, B:39:0x00bc, B:41:0x00cd, B:43:0x00dc, B:45:0x00e2, B:50:0x00f6, B:35:0x006e), top: B:83:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[Catch: Exception -> 0x0143, TryCatch #1 {Exception -> 0x0143, blocks: (B:48:0x00f0, B:49:0x00f3, B:51:0x00fa, B:53:0x0108, B:54:0x0134, B:16:0x003c, B:18:0x0044, B:19:0x0046, B:21:0x004c, B:23:0x0050, B:24:0x0052, B:32:0x0062, B:34:0x0068, B:37:0x008b, B:39:0x00bc, B:41:0x00cd, B:43:0x00dc, B:45:0x00e2, B:50:0x00f6, B:35:0x006e), top: B:83:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108 A[Catch: Exception -> 0x0143, TryCatch #1 {Exception -> 0x0143, blocks: (B:48:0x00f0, B:49:0x00f3, B:51:0x00fa, B:53:0x0108, B:54:0x0134, B:16:0x003c, B:18:0x0044, B:19:0x0046, B:21:0x004c, B:23:0x0050, B:24:0x0052, B:32:0x0062, B:34:0x0068, B:37:0x008b, B:39:0x00bc, B:41:0x00cd, B:43:0x00dc, B:45:0x00e2, B:50:0x00f6, B:35:0x006e), top: B:83:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(X.InterfaceC1364105Vn r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.MentionListViewModel.DQ2(X.05Vn, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void GQ2(List<? extends InterfaceC1891350zJl> list, boolean z) {
        if (z) {
            listClear();
        }
        listAddAll(KQ2(list));
        if (!((C325560CpW) getState()).LLILLJJLI) {
            setState(AFwS232S0000000_4.get$arr$(19));
        }
    }

    public final AbstractC316870CbV JQ2(List list, boolean z) {
        if (z) {
            return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, 0L, list, 1);
        }
        AbstractC316870CbV.LIZ.getClass();
        return new C316640Cb8(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[PHI: r1
      0x0086: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v5 java.lang.Object) binds: [B:36:0x008e, B:33:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.Long r9, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r10) {
        /*
            r8 = this;
            r0 = 196704(0x30060, float:2.75641E-40)
            boolean r7 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            java.lang.Number r9 = (java.lang.Number) r9
            long r1 = r9.longValue()
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            java.lang.String r0 = r8.LLILLJJLI
            int r0 = r0.length()
            r3 = 0
            if (r0 != 0) goto L94
            r0 = 1
        L1b:
            r4 = 0
            if (r0 == 0) goto L66
            X.01GW r0 = X.C259640AFm.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L59
            X.15lG r0 = r8.LL
            if (r0 == 0) goto L57
            java.lang.String r5 = r0.LIZJ
        L32:
            java.lang.String r0 = "comment"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L48
            X.15lG r0 = r8.LL
            if (r0 == 0) goto L40
            java.lang.String r4 = r0.LIZJ
        L40:
            java.lang.String r0 = "repost_text"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L59
        L48:
            X.0CbV r1 = r8.BQ2(r1, r3)
        L4c:
            if (r6 == 0) goto L51
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L51:
            if (r7 == 0) goto L56
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L56:
            return r1
        L57:
            r5 = r4
            goto L32
        L59:
            X.0CcB r1 = X.AbstractC316870CbV.LIZ
            X.13BV r0 = X.C13BV.INSTANCE
            r1.getClass()
            X.0Cb8 r1 = new X.0Cb8
            r1.<init>(r0)
            goto L4c
        L66:
            X.15lG r0 = r8.LL
            if (r0 == 0) goto L91
            java.lang.String r2 = r0.LIZJ
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZLLL
            java.lang.String r0 = "is_note"
            java.lang.Object r1 = r1.get(r0)
        L74:
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            boolean r0 = X.C315740CZg.LIZ(r2, r0)
            if (r0 == 0) goto L8a
            java.lang.Object r1 = r8.CQ2(r3, r10)
            if (r6 == 0) goto L51
        L86:
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
            goto L51
        L8a:
            java.lang.Object r1 = r8.EQ2(r3, r4, r10)
            if (r6 == 0) goto L51
            goto L86
        L91:
            r2 = r4
            r1 = r4
            goto L74
        L94:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.MentionListViewModel.onLoadMore(java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143 A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:63:0x013a, B:64:0x013d, B:66:0x0143, B:68:0x0147, B:73:0x0156, B:74:0x0158, B:79:0x0163, B:80:0x0167, B:82:0x016d, B:84:0x0174, B:86:0x017a, B:88:0x0186, B:91:0x018b, B:93:0x018f, B:94:0x0194, B:96:0x01a5, B:98:0x01b0, B:43:0x00ab, B:44:0x00ae, B:48:0x00be, B:49:0x00c2, B:51:0x00ca, B:52:0x00d7, B:54:0x00dd, B:58:0x00ee, B:60:0x0120, B:20:0x004f, B:22:0x0053, B:23:0x0055, B:25:0x006a, B:28:0x0075, B:30:0x0079, B:31:0x007d, B:37:0x0087, B:38:0x0089, B:39:0x0096, B:41:0x009c), top: B:105:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:63:0x013a, B:64:0x013d, B:66:0x0143, B:68:0x0147, B:73:0x0156, B:74:0x0158, B:79:0x0163, B:80:0x0167, B:82:0x016d, B:84:0x0174, B:86:0x017a, B:88:0x0186, B:91:0x018b, B:93:0x018f, B:94:0x0194, B:96:0x01a5, B:98:0x01b0, B:43:0x00ab, B:44:0x00ae, B:48:0x00be, B:49:0x00c2, B:51:0x00ca, B:52:0x00d7, B:54:0x00dd, B:58:0x00ee, B:60:0x0120, B:20:0x004f, B:22:0x0053, B:23:0x0055, B:25:0x006a, B:28:0x0075, B:30:0x0079, B:31:0x007d, B:37:0x0087, B:38:0x0089, B:39:0x0096, B:41:0x009c), top: B:105:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a5 A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:63:0x013a, B:64:0x013d, B:66:0x0143, B:68:0x0147, B:73:0x0156, B:74:0x0158, B:79:0x0163, B:80:0x0167, B:82:0x016d, B:84:0x0174, B:86:0x017a, B:88:0x0186, B:91:0x018b, B:93:0x018f, B:94:0x0194, B:96:0x01a5, B:98:0x01b0, B:43:0x00ab, B:44:0x00ae, B:48:0x00be, B:49:0x00c2, B:51:0x00ca, B:52:0x00d7, B:54:0x00dd, B:58:0x00ee, B:60:0x0120, B:20:0x004f, B:22:0x0053, B:23:0x0055, B:25:0x006a, B:28:0x0075, B:30:0x0079, B:31:0x007d, B:37:0x0087, B:38:0x0089, B:39:0x0096, B:41:0x009c), top: B:105:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b0 A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:63:0x013a, B:64:0x013d, B:66:0x0143, B:68:0x0147, B:73:0x0156, B:74:0x0158, B:79:0x0163, B:80:0x0167, B:82:0x016d, B:84:0x0174, B:86:0x017a, B:88:0x0186, B:91:0x018b, B:93:0x018f, B:94:0x0194, B:96:0x01a5, B:98:0x01b0, B:43:0x00ab, B:44:0x00ae, B:48:0x00be, B:49:0x00c2, B:51:0x00ca, B:52:0x00d7, B:54:0x00dd, B:58:0x00ee, B:60:0x0120, B:20:0x004f, B:22:0x0053, B:23:0x0055, B:25:0x006a, B:28:0x0075, B:30:0x0079, B:31:0x007d, B:37:0x0087, B:38:0x0089, B:39:0x0096, B:41:0x009c), top: B:105:0x0025 }] */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.base.vm.MentionListViewModel] */
    /* JADX WARN: Type inference failed for: r33v0, types: [X.0957, X.0957<? extends java.util.List<X.0Caz>>] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(boolean r32, X.AnonymousClass0957<? extends java.util.List<X.C316550Caz>> r33, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r34) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.MentionListViewModel.EQ2(boolean, X.0957, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(long r14, java.lang.String r16, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r17) {
        /*
            r13 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C316480Cas
            if (r0 == 0) goto L26
            r12 = r3
            X.0Cas r12 = (X.C316480Cas) r12
            int r2 = r12.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r12.LLILZ = r2
        L14:
            java.lang.Object r5 = r12.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILZ
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 != r2) goto L2c
            java.lang.Object r4 = r12.LL
            java.util.Set r4 = (java.util.Set) r4
            goto L83
        L26:
            X.0Cas r12 = new X.0Cas
            r12.<init>(r13, r3)
            goto L14
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r5)
            X.15jK<ITEM extends X.0zJl> r0 = r13.state     // Catch: java.lang.Exception -> Lb9
            r5 = 0
            if (r0 == 0) goto L45
            java.util.List r1 = r0.LJII()     // Catch: java.lang.Exception -> Lb9
        L40:
            boolean r0 = r1 instanceof java.util.List     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L48
            goto L47
        L45:
            r1 = r5
            goto L40
        L47:
            r5 = r1
        L48:
            if (r5 != 0) goto L4c
            X.13BV r5 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> Lb9
        L4c:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet     // Catch: java.lang.Exception -> Lb9
            r4.<init>()     // Catch: java.lang.Exception -> Lb9
            java.util.Iterator r1 = r5.iterator()     // Catch: java.lang.Exception -> Lb9
        L55:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L69
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> Lb9
            X.0Cb2 r0 = (X.C316580Cb2) r0     // Catch: java.lang.Exception -> Lb9
            X.15l7 r0 = r0.LL     // Catch: java.lang.Exception -> Lb9
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Exception -> Lb9
            r4.add(r0)     // Catch: java.lang.Exception -> Lb9
            goto L55
        L69:
            com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService r5 = r13.wQ2()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r6 = r13.LLILLJJLI     // Catch: java.lang.Exception -> Lb9
            java.util.List r7 = X.C13LP.LLIIII(r4)     // Catch: java.lang.Exception -> Lb9
            X.15lG r11 = r13.LL     // Catch: java.lang.Exception -> Lb9
            r12.LL = r4     // Catch: java.lang.Exception -> Lb9
            r12.LLILZ = r2     // Catch: java.lang.Exception -> Lb9
            r10 = r16
            r8 = r14
            java.lang.Object r5 = r5.LJIIL(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Exception -> Lb9
            if (r5 != r3) goto L86
            return r3
        L83:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> Lb9
        L86:
            X.00vu r5 = (X.C237600vu) r5     // Catch: java.lang.Exception -> Lb9
            java.util.List<X.15l7> r0 = r5.LIZ     // Catch: java.lang.Exception -> Lb9
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb9
            r3.<init>()     // Catch: java.lang.Exception -> Lb9
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> Lb9
        L93:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto Lae
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lb9
            r0 = r1
            X.15l7 r0 = (X.C20611915l7) r0     // Catch: java.lang.Exception -> Lb9
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Exception -> Lb9
            boolean r0 = r4.contains(r0)     // Catch: java.lang.Exception -> Lb9
            r0 = r0 ^ 1
            if (r0 == 0) goto L93
            r3.add(r1)     // Catch: java.lang.Exception -> Lb9
            goto L93
        Lae:
            boolean r1 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb9
            java.util.List r0 = r13.IQ2(r3)     // Catch: java.lang.Exception -> Lb9
            X.0CbV r0 = r13.JQ2(r0, r1)     // Catch: java.lang.Exception -> Lb9
            return r0
        Lb9:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.MentionListViewModel.yQ2(long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(long r7, java.lang.String r9, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C316450Cap
            if (r0 == 0) goto L20
            r4 = r10
            X.0Cap r4 = (X.C316450Cap) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L40
        L20:
            X.0Cap r4 = new X.0Cap
            r4.<init>(r6, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0CZf r5 = new X.0CZf     // Catch: java.lang.Exception -> L46
            r10 = 0
            r5.<init>(r6, r7, r9, r10)     // Catch: java.lang.Exception -> L46
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L46
            java.lang.Object r3 = X.C2296808zG.LJ(r5, r4)     // Catch: java.lang.Exception -> L46
            if (r3 != r2) goto L43
            return r2
        L40:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L46
        L43:
            X.0CbV r3 = (X.AbstractC316870CbV) r3     // Catch: java.lang.Exception -> L46
            return r3
        L46:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r3 = new X.0Cb9
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.vm.MentionListViewModel.zQ2(long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
