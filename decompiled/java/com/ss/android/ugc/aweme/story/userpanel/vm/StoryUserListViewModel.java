package com.ss.android.ugc.aweme.story.userpanel.vm;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C04TU;
import X.C08CX;
import X.C0KBN;
import X.C13BV;
import X.C15438062q;
import X.C20612915lH;
import X.C316420Cam;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317110Cbt;
import X.C317130Cbv;
import X.C317160Cby;
import X.C317290CcB;
import X.C317760Ccw;
import X.C325570CpX;
import X.C452501pT;
import X.C627660Ojc;
import X.EnumC1439580nZ6;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.model.MentionCheckResult;
import com.ss.android.ugc.aweme.model.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.model.MentionQueryPaginationParam;
import com.ss.android.ugc.aweme.model.MentionRecommendQueryRequest;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;
import com.ss.android.ugc.aweme.model.UserListWithPagination;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.service.IMentionMixSearchService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryUserListViewModel extends AssemListViewModel<C325570CpX, InterfaceC1891350zJl, C317130Cbv> {
    public String LL;
    public String LLILZLL;
    public VideoPublishEditModel LLJ;
    public Function0<Unit> LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJJI;
    public Long LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZIL = "mention";
    public List<? extends User> LLIZ = C13BV.INSTANCE;
    public final Set<String> LLIZLLLIL = new LinkedHashSet();
    public String LLJI = "";
    public EnumC1439580nZ6 LLJILJILJ = EnumC1439580nZ6.UNKNOWN;
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1997));
    public Set<String> LLJJ = C08CX.INSTANCE;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325570CpX(0);
    }

    public final IMentionMixSearchService wQ2() {
        return (IMentionMixSearchService) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        IMentionMixSearchService iMentionMixSearchServiceWQ2 = wQ2();
        if (iMentionMixSearchServiceWQ2 != null) {
            iMentionMixSearchServiceWQ2.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C317130Cbv>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C317200Cc2
            if (r0 == 0) goto L20
            r3 = r13
            X.0Cc2 r3 = (X.C317200Cc2) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r2 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L47
        L20:
            X.0Cc2 r3 = new X.0Cc2
            r3.<init>(r12, r13)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.0lmR r0 = com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi.LIZ     // Catch: java.lang.Exception -> Lab
            r0.getClass()     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi r0 = X.C1370970lmR.LIZ()     // Catch: java.lang.Exception -> Lab
            X.0lcL r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Lab
            r3.LLILLL = r4     // Catch: java.lang.Exception -> Lab
            java.lang.Object r2 = r0.LJJIIJ(r3)     // Catch: java.lang.Exception -> Lab
            if (r2 != r1) goto L4a
            return r1
        L47:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> Lab
        L4a:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> Lab
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Exception -> Lab
            r7 = 0
            if (r0 == 0) goto L58
            X.0CbV r0 = r12.BQ2(r4, r7)     // Catch: java.lang.Exception -> Lab
            return r0
        L58:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lab
            r3.<init>()     // Catch: java.lang.Exception -> Lab
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Lab
        L61:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L92
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMContact) r1     // Catch: java.lang.Exception -> Lab
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L74
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r1     // Catch: java.lang.Exception -> Lab
            goto L75
        L74:
            r1 = r7
        L75:
            if (r1 == 0) goto L8b
            X.0Cby r5 = new X.0Cby     // Catch: java.lang.Exception -> Lab
            X.1BFw r0 = com.ss.android.ugc.aweme.im.contacts.api.model.IMUser.Companion     // Catch: java.lang.Exception -> Lab
            r0.getClass()     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.profile.model.User r6 = X.C2201941BFw.LJII(r1)     // Catch: java.lang.Exception -> Lab
            r8 = 0
            r11 = 30
            r9 = r8
            r10 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Lab
            goto L8c
        L8b:
            r5 = r7
        L8c:
            if (r5 == 0) goto L61
            r3.add(r5)     // Catch: java.lang.Exception -> Lab
            goto L61
        L92:
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L9d
            X.0CbV r0 = r12.BQ2(r4, r7)     // Catch: java.lang.Exception -> Lab
            return r0
        L9d:
            r12.vQ2(r3)     // Catch: java.lang.Exception -> Lab
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> Lab
            r0.getClass()     // Catch: java.lang.Exception -> Lab
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> Lab
            r0.<init>(r3)     // Catch: java.lang.Exception -> Lab
            return r0
        Lab:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel.AQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 132));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C317130Cbv>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C317170Cbz
            if (r0 == 0) goto L7d
            r4 = r7
            X.0Cbz r4 = (X.C317170Cbz) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 == r3) goto L8b
            if (r0 != r2) goto L83
            X.C155000ia.LIZIZ(r1)
        L25:
            return r1
        L26:
            X.C155000ia.LIZIZ(r1)
            r0 = 79
            kotlin.jvm.internal.AFwS232S0000000_4 r0 = kotlin.jvm.internal.AFwS232S0000000_4.get$arr$(r0)
            r6.setState(r0)
            java.lang.String r0 = r6.LLILZ
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L65
            r6.LLJJI = r0
            r2 = 0
            r6.LLJJIII = r2
            r6.LLJJIJI = r0
            r6.LLJJIJIIJIL = r0
            X.0Cbt r0 = X.C317110Cbt.LIZ
            r0.getClass()
            java.util.Set<java.lang.String> r0 = X.C317110Cbt.LIZIZ
            r0.clear()
            java.lang.String r1 = r6.LLILZIL
            java.lang.String r0 = "dm"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8f
            boolean r0 = r6.LLJILJIL
            if (r0 == 0) goto L8f
            r4.LLILLL = r3
            java.lang.Object r1 = r6.AQ2(r4)
            if (r1 != r5) goto L93
            return r5
        L65:
            com.ss.android.ugc.aweme.service.IMentionMixSearchService r0 = r6.wQ2()
            if (r0 == 0) goto L9a
            boolean r0 = r0.LIZIZ()
            if (r0 != r3) goto L9a
            r6.listClear()
            r4.LLILLL = r2
            java.lang.Object r1 = r6.yQ2(r4)
            if (r1 != r5) goto L25
            return r5
        L7d:
            X.0Cbz r4 = new X.0Cbz
            r4.<init>(r6, r7)
            goto L12
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8b:
            X.C155000ia.LIZIZ(r1)
            goto L93
        L8f:
            X.0CbV r1 = r6.BQ2(r3, r2)
        L93:
            boolean r0 = r1 instanceof X.C316650Cb9
            if (r0 != 0) goto L99
            r6.LLJJI = r3
        L99:
            return r1
        L9a:
            java.lang.String r1 = r6.LLILZ
            java.util.List r0 = r6.listGetAll()
            X.0CbV r1 = zQ2(r1, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final void vQ2(List<? extends InterfaceC1891350zJl> list) {
        String uid;
        User user;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (!(interfaceC1891350zJl instanceof C317160Cby)) {
                interfaceC1891350zJl = null;
            }
            arrayList.add(interfaceC1891350zJl);
        }
        ArrayList<C317160Cby> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C317160Cby c317160Cby = (C317160Cby) obj;
            if (c317160Cby != null && c317160Cby.LLILLL) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        for (C317160Cby c317160Cby2 : arrayList2) {
            if (c317160Cby2 == null || (user = c317160Cby2.LL) == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            arrayList3.add(uid);
        }
        this.LLIZLLLIL.addAll(arrayList3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C317130Cbv>> r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel.xQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C317130Cbv>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C317190Cc1
            if (r0 == 0) goto L20
            r5 = r7
            X.0Cc1 r5 = (X.C317190Cc1) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L58
        L20:
            X.0Cc1 r5 = new X.0Cc1
            r5.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            com.ss.android.ugc.aweme.service.IMentionMixSearchService r2 = r6.wQ2()
            if (r2 != 0) goto L49
            X.0CcB r2 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "Mix search service unavailable"
            r1.<init>(r0)
            r2.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        L49:
            X.0Cc6 r1 = new X.0Cc6     // Catch: java.lang.Exception -> L5e
            r0 = 0
            r1.<init>(r2, r6, r0)     // Catch: java.lang.Exception -> L5e
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L5e
            java.lang.Object r2 = X.C2296808zG.LJ(r1, r5)     // Catch: java.lang.Exception -> L5e
            if (r2 != r4) goto L5b
            return r4
        L58:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L5e
        L5b:
            X.0CbV r2 = (X.AbstractC316870CbV) r2     // Catch: java.lang.Exception -> L5e
            return r2
        L5e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r2 = new X.0Cb9
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel.yQ2(X.05Vn):java.lang.Object");
    }

    public final AbstractC316870CbV<C317130Cbv> BQ2(boolean z, C317130Cbv c317130Cbv) {
        long j;
        MentionRecommendQueryRequest mentionRecommendQueryRequestLIZ;
        UserListWithPagination userListWithPagination;
        UserListWithPagination userListWithPagination2;
        UserListWithPagination userListWithPagination3;
        long j2;
        if (!z && c317130Cbv != null) {
            if (this.LL != null) {
                j2 = 11;
            } else {
                j2 = 0;
            }
            mentionRecommendQueryRequestLIZ = C316420Cam.LIZ(j2, new MentionQueryPaginationParam(c317130Cbv.LIZ.getSecond().booleanValue(), c317130Cbv.LIZ.getFirst().longValue()), new MentionQueryPaginationParam(c317130Cbv.LIZIZ.getSecond().booleanValue(), c317130Cbv.LIZIZ.getFirst().longValue()), new MentionQueryPaginationParam(c317130Cbv.LIZJ.getSecond().booleanValue(), c317130Cbv.LIZJ.getFirst().longValue()), new MentionQueryPaginationParam(c317130Cbv.LIZLLL.getSecond().booleanValue(), c317130Cbv.LIZLLL.getFirst().longValue()), new MentionQueryPaginationParam(c317130Cbv.LJ.getSecond().booleanValue(), c317130Cbv.LJ.getFirst().longValue()), this.LL, 0L, 128);
            if (mentionRecommendQueryRequestLIZ == null) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                Exception exc = new Exception("Create mention recommend request failed");
                c317290CcB.getClass();
                return new C316650Cb9(exc);
            }
        } else {
            if (this.LL != null) {
                j = 11;
            } else {
                j = 0;
            }
            mentionRecommendQueryRequestLIZ = C316420Cam.LIZ(j, null, null, null, new MentionQueryPaginationParam(true, 0L), null, this.LL, 0L, 174);
            if (mentionRecommendQueryRequestLIZ == null) {
                C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
                Exception exc2 = new Exception("Failed to create mention recommendation request");
                c317290CcB2.getClass();
                return new C316650Cb9(exc2);
            }
        }
        try {
            MentionRecommendResponse mentionRecommendResponseLJFF = C20612915lH.LIZIZ.LJFF(mentionRecommendQueryRequestLIZ);
            if (z) {
                List<MentionCheckResult> list = mentionRecommendResponseLJFF.blockResults;
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
                this.LLJJ = linkedHashSet;
            }
            C317110Cbt c317110Cbt = C317110Cbt.LIZ;
            List<? extends User> list3 = this.LLIZ;
            c317110Cbt.getClass();
            List<? extends InterfaceC1891350zJl> listLIZJ = C317110Cbt.LIZJ(mentionRecommendResponseLJFF, list3);
            vQ2(listLIZJ);
            UserListWithPagination userListWithPagination4 = mentionRecommendResponseLJFF.friendUserList;
            if ((userListWithPagination4 == null || !userListWithPagination4.hasMore) && (((userListWithPagination = mentionRecommendResponseLJFF.followingUserList) == null || !userListWithPagination.hasMore) && (((userListWithPagination2 = mentionRecommendResponseLJFF.recentUserList) == null || !userListWithPagination2.hasMore) && ((userListWithPagination3 = mentionRecommendResponseLJFF.sortedUserList) == null || !userListWithPagination3.hasMore)))) {
                AbstractC316870CbV.LIZ.getClass();
                return new C316640Cb8(listLIZJ);
            }
            return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, C317110Cbt.LIZ(mentionRecommendResponseLJFF), listLIZJ, 1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC316870CbV.LIZ.getClass();
            return new C316650Cb9(e);
        }
    }

    public final AbstractC316870CbV CQ2(List list, boolean z) {
        if (z) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Boolean bool = Boolean.FALSE;
            return C317290CcB.LJ(c317290CcB, null, new C317130Cbv(new Pair(0L, bool), new Pair(0L, bool), new Pair(0L, bool), new Pair(0L, bool)), list, 1);
        }
        AbstractC316870CbV.LIZ.getClass();
        return new C316640Cb8(list);
    }

    public final List DQ2(String str, List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            User user = (User) it2.next();
            arrayList.add(new C317160Cby(user, this.LLILZ, false, this.LLJJ.contains(user.getUid()), str, 4));
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C317130Cbv c317130Cbv, InterfaceC1364105Vn<? super AbstractC316870CbV<C317130Cbv>> interfaceC1364105Vn) {
        C317130Cbv c317130Cbv2 = c317130Cbv;
        if (this.LLILZ.length() == 0) {
            if (Intrinsics.LJFF(this.LLILZIL, "dm") && this.LLJILJIL) {
                return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
            }
            return BQ2(false, c317130Cbv2);
        }
        IMentionMixSearchService iMentionMixSearchServiceWQ2 = wQ2();
        if (iMentionMixSearchServiceWQ2 != null && iMentionMixSearchServiceWQ2.LIZIZ()) {
            return xQ2(interfaceC1364105Vn);
        }
        return zQ2(this.LLILZ, false, listGetAll());
    }

    public static AbstractC316870CbV zQ2(String str, boolean z, List list) {
        ArrayList arrayList;
        Integer num;
        if (z) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                    if (interfaceC1891350zJl instanceof C317160Cby) {
                        arrayList.add(((C317160Cby) interfaceC1891350zJl).LL.getUid());
                    }
                }
            }
        }
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        try {
            SearchUserSugResponse searchUserSugResponseLIZJ = ((ISearchUserService) C04TU.LIZ.getValue()).LIZJ(new C317760Ccw(11L, str, "at_user", arrayList, num));
            C317110Cbt.LIZ.getClass();
            List listLIZLLL = C317110Cbt.LIZLLL(str, searchUserSugResponseLIZJ);
            if (searchUserSugResponseLIZJ.LIZ()) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                Boolean bool = Boolean.FALSE;
                return C317290CcB.LJ(c317290CcB, null, new C317130Cbv(new Pair(0L, bool), new Pair(0L, bool), new Pair(0L, bool), new Pair(0L, bool)), listLIZLLL, 1);
            }
            return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC316870CbV.LIZ.getClass();
            return new C316650Cb9(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C317160Cby> EQ2(java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r12, java.util.Set<java.lang.String> r13, java.util.Set<java.lang.String> r14) {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r12, r0)
            r2.<init>(r0)
            java.util.Iterator r3 = r12.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r5 = r3.next()
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.ss.android.ugc.aweme.profile.model.User) r5
            java.lang.String r1 = r5.getUid()
            r0 = r13
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L41
            java.lang.String r9 = "local"
        L2a:
            X.0Cby r4 = new X.0Cby
            java.lang.String r6 = r11.LLILZ
            r7 = 0
            java.util.Set<java.lang.String> r1 = r11.LLJJ
            java.lang.String r0 = r5.getUid()
            boolean r8 = r1.contains(r0)
            r10 = 4
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r2.add(r4)
            goto Lf
        L41:
            if (r14 == 0) goto L53
            java.lang.String r1 = r5.getUid()
            r0 = r14
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L53
            java.lang.String r9 = "SuG"
            goto L2a
        L53:
            java.lang.String r9 = "relation"
            goto L2a
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel.EQ2(java.util.List, java.util.Set, java.util.Set):java.util.List");
    }
}
