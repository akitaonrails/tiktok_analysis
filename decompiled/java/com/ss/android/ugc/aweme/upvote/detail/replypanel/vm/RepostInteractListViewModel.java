package com.ss.android.ugc.aweme.upvote.detail.replypanel.vm;

import X.AbstractC1387200mCc;
import X.AbstractC316870CbV;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0PEM;
import X.C10EU;
import X.C1158140gFA;
import X.C1284660jXE;
import X.C1357870lRJ;
import X.C1357950lRR;
import X.C1357960lRS;
import X.C1357970lRT;
import X.C1358360lS6;
import X.C1358380lS8;
import X.C1358400lSA;
import X.C1358470lSH;
import X.C1358490lSJ;
import X.C1358510lSL;
import X.C1358520lSM;
import X.C1358560lSQ;
import X.C1358770lSl;
import X.C1359600lU6;
import X.C1359720lUI;
import X.C13LP;
import X.C1554610qYd;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C429520Gso;
import X.C452501pT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1355220lN2;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol;
import com.ss.android.ugc.aweme.upvote.detail.notice.RepostQuickActionRepliedRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS128S0101000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostInteractListViewModel extends AssemListViewModel<C1358490lSJ, InterfaceC1891350zJl, Long> implements InterfaceC1355220lN2 {
    public static final /* synthetic */ int LLJJIII = 0;
    public Aweme LL;
    public VideoItemParams LLILLJJLI;
    public RepostSyncViewModel LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public C1358560lSQ LLJI;
    public boolean LLJIJIL;
    public boolean LLJILLL;
    public AnonymousClass0956 LLJJ;
    public volatile boolean LLJJI;
    public Integer LLILLL = 0;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(374));
    public final Set<String> LLJILJILJ = new LinkedHashSet();

    public final String AQ2() {
        String str = this.LLIZLLLIL;
        return str == null ? "click_recommend_avatar" : str;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1358490lSJ(0);
    }

    public final Map<String, List<String>> zQ2() {
        C1358560lSQ c1358560lSQ = this.LLJI;
        if (c1358560lSQ != null) {
            String str = c1358560lSQ.LLILZLL;
            String str2 = c1358560lSQ.LLILZIL;
            if (str2 == null || str == null || str.length() == 0) {
                return null;
            }
            return C2097908Jt.LIZJ(new Pair(str2, a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean FQ2() {
        List<InterfaceC1891350zJl> list = ((C1358490lSJ) getState()).LL.LLILZ;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<InterfaceC1891350zJl> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if ((it2.next() instanceof C1357970lRT) && (i = i + 1) < 0) {
                C1697810uHb.LJIJ();
                throw null;
            }
        }
        return i == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int pw() {
        List<InterfaceC1891350zJl> list = ((C1358490lSJ) getState()).LL.LLILZ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static boolean EQ2(UpvoteStruct upvoteStruct) {
        String uid;
        User user;
        User user2 = upvoteStruct.user;
        if (user2 != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        if (C10EU.LJIIZILJ(uid) || (user = upvoteStruct.user) == null || user.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[PHI: r1
      0x0055: PHI (r1v1 com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) = 
      (r1v3 com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct)
      (r1v3 com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct)
      (r1v7 com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct)
     binds: [B:17:0x0032, B:24:0x0046, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BQ2(X.C1358510lSL r5) {
        /*
            r4 = this;
            java.util.List<X.0lSE> r0 = r5.LIZIZ
            r3 = 0
            if (r0 == 0) goto L85
            java.util.Iterator r2 = r0.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0lSE r0 = (X.C1358440lSE) r0
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = r0.LIZ
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            if (r0 == 0) goto L81
            java.lang.String r0 = r0.getUid()
        L20:
            boolean r0 = X.C10EU.LJIIZILJ(r0)
            if (r0 == 0) goto L9
        L26:
            X.0lSE r1 = (X.C1358440lSE) r1
            if (r1 == 0) goto L85
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r1 = r1.LIZ
            if (r1 != 0) goto L55
        L2e:
            boolean r0 = X.C1359600lU6.LIZIZ()
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
        L3c:
            boolean r0 = X.C10EU.LJIILLIIL(r0)
            if (r0 == 0) goto L48
            boolean r0 = X.C429520Gso.LIZ()
            if (r0 == 0) goto L55
        L48:
            r2 = 1
        L49:
            kotlin.jvm.internal.AwS7S0011000_21 r1 = new kotlin.jvm.internal.AwS7S0011000_21
            r0 = 1
            r1.<init>(r2, r0)
            r4.setState(r1)
            return
        L53:
            r0 = r3
            goto L3c
        L55:
            boolean r0 = X.C263730AVf.LIZ()
            if (r0 == 0) goto L7f
            if (r1 == 0) goto L7f
            boolean r0 = X.C1359720lUI.LJ(r1)
            if (r0 != 0) goto L7f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getAuthor()
        L6b:
            boolean r0 = X.C10EU.LJIILLIIL(r3)
            if (r0 == 0) goto L77
            boolean r0 = X.C429520Gso.LIZ()
            if (r0 == 0) goto L7f
        L77:
            boolean r0 = X.C0CHP.LIZ()
            if (r0 == 0) goto L7f
            r2 = 2
            goto L49
        L7f:
            r2 = 0
            goto L49
        L81:
            r0 = r3
            goto L20
        L83:
            r1 = r3
            goto L26
        L85:
            r1 = r3
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel.BQ2(X.0lSL):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> CQ2(X.C1358510lSL r33) {
        /*
            Method dump skipped, instruction units count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel.CQ2(X.0lSL):java.util.List");
    }

    public final boolean DQ2(String str) {
        String str2;
        if (Intrinsics.LJFF(str, "auto_open")) {
            List listLJIIJJI = C1697810uHb.LJIIJJI("notification_page", "inner_push", "out_push");
            VideoItemParams videoItemParams = this.LLILLJJLI;
            if (videoItemParams != null) {
                str2 = videoItemParams.mEventType;
            } else {
                str2 = null;
            }
            if (C13LP.LJJJJ(str2, listLJIIJJI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void L1(int i) {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            setState(new AwS128S0101000_21(activityLIZIZ, i, 3));
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS600S0100000_21(c627660Ojc, (C627660Ojc<C1158140gFA>) 184));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1358420lSC
            if (r0 == 0) goto L94
            r4 = r8
            X.0lSC r4 = (X.C1358420lSC) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 0
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L3f
            if (r0 == r2) goto L68
            if (r0 != r6) goto L9b
            X.C155000ia.LIZIZ(r1)
        L26:
            r0 = 366(0x16e, float:5.13E-43)
            kotlin.jvm.internal.AFwS259S0000000_21 r0 = kotlin.jvm.internal.AFwS259S0000000_21.get$arr$(r0)
            r7.setState(r0)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        L3f:
            X.C155000ia.LIZIZ(r1)
            X.0lS8 r1 = X.C1358380lS8.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LL
            if (r0 == 0) goto L66
            java.lang.String r0 = r0.getAid()
        L4c:
            r1.getClass()
            X.0lSL r1 = X.C1358380lS8.LJ(r0)
            if (r1 == 0) goto L5d
            java.lang.String r0 = r7.LLILZIL
            boolean r0 = r7.DQ2(r0)
            if (r0 == 0) goto La3
        L5d:
            r4.LLILLL = r2
            java.lang.Object r1 = r7.yQ2(r4)
            if (r1 != r3) goto L6b
            return r3
        L66:
            r0 = r5
            goto L4c
        L68:
            X.C155000ia.LIZIZ(r1)
        L6b:
            X.0lSL r1 = (X.C1358510lSL) r1
            if (r1 != 0) goto La3
            java.lang.String r0 = r7.LLILZIL
            boolean r0 = r7.DQ2(r0)
            if (r0 == 0) goto L26
            r4.LLILLL = r6
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.01mp r1 = new X.01mp
            r0 = 2131825009(0x7f111171, float:1.9282862E38)
            r1.<init>(r0, r5)
            java.lang.Object r1 = X.C23250099c.LJI(r4, r2, r1)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L91
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L91:
            if (r1 != r3) goto L26
            return r3
        L94:
            X.0lSC r4 = new X.0lSC
            r4.<init>(r7, r8)
            goto L12
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La3:
            java.util.List r1 = r7.CQ2(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel.vQ2(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void xQ2(String str) {
        String aid;
        int i;
        String uid;
        if (str == null) {
            return;
        }
        C1358380lS8 c1358380lS8 = C1358380lS8.LIZ;
        Aweme aweme = this.LL;
        User author = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c1358380lS8.getClass();
        C1358510lSL c1358510lSLLJ = C1358380lS8.LJ(aid);
        if (c1358510lSLLJ != null) {
            C1358380lS8.LJIIIIZZ(C1358380lS8.LJFF(c1358510lSLLJ, str), aid);
        }
        List<InterfaceC1891350zJl> list = ((C1358490lSJ) getState()).LL.LLILZ;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC1891350zJl> it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1891350zJl next = it2.next();
            if (next instanceof C1357970lRT) {
                User user = ((C1357970lRT) next).LLILZIL.user;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(uid, str)) {
                    if (i2 >= 0) {
                        Pair pairLIZ = C1359720lUI.LIZ(list, i2, AFwS259S0000000_21.get$arr$(270));
                        if (((Number) pairLIZ.getFirst()).intValue() >= 0) {
                            listSetItemsAt(i2, ((Number) pairLIZ.getFirst()).intValue() - i2, new ArrayList());
                        } else {
                            listSetItemsAt(i2, list.size() - i2, new ArrayList());
                        }
                        if (i2 == 0 && ((Number) pairLIZ.getFirst()).intValue() < 0) {
                            setState(AFwS259S0000000_21.get$arr$(268));
                            return;
                        }
                    }
                }
            }
            i2++;
        }
        boolean zLJIIZILJ = C10EU.LJIIZILJ(str);
        if (zLJIIZILJ && C1359600lU6.LIZIZ()) {
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                author = aweme2.getAuthor();
            }
            if (!C10EU.LJIILLIIL(author) || C429520Gso.LIZ()) {
                setState(AFwS259S0000000_21.get$arr$(269));
            }
        }
        C1358520lSM c1358520lSM = ((C1358490lSJ) getState()).LLILLJJLI;
        if (zLJIIZILJ) {
            i = c1358520lSM.LIZ;
        } else {
            i = c1358520lSM.LIZ - 1;
        }
        setState(new C1358470lSH(i, c1358520lSM.LIZIZ - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.InterfaceC1364105Vn<? super X.C1358510lSL> r16) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel.yQ2(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1355220lN2
    public final void Gw(RepostReplyStruct repostReplyStruct, UpvoteStruct upvoteStruct) {
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1358400lSA(repostReplyStruct, upvoteStruct, this, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        l.longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wQ2(String str, boolean z) {
        List<InterfaceC1891350zJl> list;
        Object next;
        C1357950lRR c1357950lRR;
        C1358360lS6 c1358360lS6;
        int i;
        List arrayList;
        String str2;
        UpvoteStruct upvoteStruct;
        String aid;
        String aid2;
        if (str != null && (list = ((C1358490lSJ) getState()).LL.LLILZ) != null) {
            ArrayList arrayList2 = new ArrayList(list);
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
                    if (interfaceC1891350zJl instanceof C1357950lRR) {
                        C1357950lRR c1357950lRR2 = (C1357950lRR) interfaceC1891350zJl;
                        if (Intrinsics.LJFF(c1357950lRR2.LL, str) || C1357960lRS.LIZIZ(c1357950lRR2, str)) {
                            break;
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next instanceof C1357950lRR) {
                c1357950lRR = (C1357950lRR) next;
                if (c1357950lRR != null) {
                    arrayList2.remove(c1357950lRR);
                    if (!z) {
                        C1358380lS8 c1358380lS8 = C1358380lS8.LIZ;
                        Aweme aweme = this.LL;
                        if (aweme != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        RepostReplyStruct repostReplyStruct = c1357950lRR.LLILZLL;
                        c1358380lS8.getClass();
                        C1358380lS8.LIZJ(aid, repostReplyStruct);
                        RepostSyncViewModel repostSyncViewModel = this.LLILZ;
                        if (repostSyncViewModel != null) {
                            Aweme aweme2 = this.LL;
                            if (aweme2 != null) {
                                aid2 = aweme2.getAid();
                            } else {
                                aid2 = null;
                            }
                            RepostReplyStruct repostReplyStruct2 = c1357950lRR.LLILZLL;
                            if (aid2 != null) {
                                C1357870lRJ c1357870lRJ = new C1357870lRJ(repostReplyStruct2);
                                repostSyncViewModel.setState(new AwS600S0100000_21(c1357870lRJ, 298));
                                List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, IRepostInteractionSyncProtocol.class, false);
                                if (listLIZIZ != null) {
                                    Iterator it3 = ((ArrayList) listLIZIZ).iterator();
                                    while (it3.hasNext()) {
                                        ((IRepostInteractionSyncProtocol) it3.next()).PO(c1357870lRJ);
                                    }
                                }
                                RepostQuickActionRepliedRegistry.LL.LJII(repostReplyStruct2.replyId);
                            }
                        }
                    }
                }
            } else {
                c1357950lRR = null;
            }
            Iterator it4 = arrayList2.iterator();
            int i2 = 0;
            while (true) {
                if (it4.hasNext()) {
                    InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) it4.next();
                    if (interfaceC1891350zJl2 instanceof C1358360lS6) {
                        String str3 = ((C1358360lS6) interfaceC1891350zJl2).LLILLJJLI;
                        if (c1357950lRR != null && (upvoteStruct = c1357950lRR.LLILZIL) != null) {
                            str2 = upvoteStruct.upvoteId;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str3, str2)) {
                            break;
                        }
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(i2, arrayList2);
            if ((objLJJJLZIJ instanceof C1358360lS6) && (c1358360lS6 = (C1358360lS6) objLJJJLZIJ) != null) {
                long j = c1358360lS6.LLILLL;
                if (((int) j) == 1) {
                    arrayList2.remove(c1358360lS6);
                } else {
                    long j2 = j - 1;
                    int i3 = c1358360lS6.LLILZIL - 1;
                    ArrayList arrayList3 = new ArrayList(c1358360lS6.LLILZLL);
                    C1358770lSl c1358770lSl = C1358770lSl.LIZ;
                    C1358770lSl.LJFF(c1358770lSl, arrayList3, new AwS600S0100000_21(c1357950lRR, 182));
                    if (c1357950lRR != null && c1357950lRR.LLIZ) {
                        i = c1358360lS6.LLIZ - 1;
                    } else {
                        i = c1358360lS6.LLIZ;
                    }
                    if (c1357950lRR != null && c1357950lRR.LLIZ) {
                        arrayList = new ArrayList(c1358360lS6.LLIZLLLIL);
                        C1358770lSl.LJFF(c1358770lSl, arrayList, new AwS600S0100000_21(c1357950lRR, 183));
                    } else {
                        arrayList = c1358360lS6.LLIZLLLIL;
                    }
                    ListProtector.set(arrayList2, i2, C1358360lS6.LIZ(c1358360lS6, j2, 0, i3, arrayList3, i, arrayList, 0L, false, 779));
                }
            }
            listSetItems(arrayList2);
        }
    }

    public final int GQ2(int i, int i2, int i3) {
        if (!this.LLJIJIL && i2 > 0 && i3 > i2) {
            this.LLJIJIL = true;
            Integer num = this.LLILLL;
            if (num != null) {
                return num.intValue();
            }
            return i;
        }
        return i;
    }
}
