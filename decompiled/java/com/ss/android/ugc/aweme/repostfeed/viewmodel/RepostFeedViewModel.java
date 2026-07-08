package com.ss.android.ugc.aweme.repostfeed.viewmodel;

import X.AbstractC1264080j02;
import X.AbstractC848400XPy;
import X.C09YA;
import X.C0CNO;
import X.C0SR4;
import X.C0VNG;
import X.C0VNS;
import X.C0VRX;
import X.C0XQ7;
import X.C1210880hcE;
import X.C1264120j06;
import X.C1265700j2e;
import X.C1360460lVU;
import X.C1360680lVq;
import X.C1400330mXn;
import X.C14EU;
import X.C15438062q;
import X.C1564680qos;
import X.C1567630qtd;
import X.C1576740r8K;
import X.C1583220rIm;
import X.C1583340rIy;
import X.C1593830rZt;
import X.C1593840rZu;
import X.C1593850rZv;
import X.C1603560rpa;
import X.C1603660rpk;
import X.C2188811AlT;
import X.C627660Ojc;
import X.C690440R6k;
import X.C729510SjV;
import X.C888460YtI;
import X.EnumC1154920g9y;
import X.EnumC1359020lTA;
import X.EnumC1581150rFR;
import X.EnumC1603630rph;
import X.InterfaceC0148002o;
import X.InterfaceC1359090lTH;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import Y.ARunnableS13S1000000_21;
import android.text.TextUtils;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.repostfeed.feed.RepostFeedPanel;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeed;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedViewModel extends AssemSingleListViewModel<RepostFeed, C1567630qtd, Long> {
    public boolean LL;
    public RepostFeedPanel LLILLJJLI;
    public boolean LLILZIL;
    public boolean LLIZ;
    public int LLJIJIL;
    public int LLJILJIL;
    public final C09YA LLILLL = new C09YA(this, AFwS213S0000000_24.get$arr$(258));
    public final List<String> LLILZ = new ArrayList();
    public int LLILZLL = EnumC1581150rFR.SORT.getDataLevel();
    public int LLIZLLLIL = -1;
    public final C1603560rpa LLJ = new C1603560rpa();
    public boolean LLJI = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1567630qtd(0);
    }

    public final void refresh() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            c1576740r8KLIZ.LJI(false);
        }
        RepostFeedPanel repostFeedPanel = this.LLILLJJLI;
        if (repostFeedPanel != null) {
            repostFeedPanel.l = this.LL;
        }
        manualListRefresh();
    }

    public final void xQ2() {
        RepostFeedPanel repostFeedPanel = this.LLILLJJLI;
        if (repostFeedPanel != null) {
            repostFeedPanel.l = this.LL;
        }
        manualListLoadMore(0L);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EventBus.LIZLLL().LJIJJ(this);
    }

    public final void CQ2(boolean z) {
        if (z) {
            C1583220rIm.LIZ(1);
            RepostFeedPanel repostFeedPanel = this.LLILLJJLI;
            if (repostFeedPanel != null) {
                C0CNO.LIZLLL(0L, new AwS568S0100000_24(repostFeedPanel, 1832));
            }
            setState(AFwS264S0000000_24.get$arr$(269));
            return;
        }
        setState(AFwS264S0000000_24.get$arr$(270));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LLZLLIL(Aweme aweme) {
        int iIndexOf;
        Integer numValueOf;
        List<RepostFeed> list = ((C1567630qtd) getState()).LL.LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<RepostFeed> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().aweme);
            }
            iIndexOf = arrayList.indexOf(aweme);
        } else {
            iIndexOf = -1;
        }
        List<RepostFeed> list2 = ((C1567630qtd) getState()).LL.LLILZ;
        if (list2 != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        if (iIndexOf != -1) {
            listRemoveItemAt(iIndexOf);
            RepostFeedPanel repostFeedPanel = this.LLILLJJLI;
            if (repostFeedPanel != null) {
                repostFeedPanel.Y1(iIndexOf);
            }
            RepostFeedPanel repostFeedPanel2 = this.LLILLJJLI;
            if (repostFeedPanel2 != null) {
                repostFeedPanel2.p(aweme.getAid());
            }
            if (numValueOf != null && numValueOf.intValue() == 1 && !this.LLILZIL) {
                CQ2(true);
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<RepostFeed> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 191));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockAccount(C888460YtI c888460YtI) {
        RepostFeedPanel repostFeedPanel;
        List<Aweme> listLJJJLZIJ;
        User user = c888460YtI.LIZ;
        if (user != null && (repostFeedPanel = this.LLILLJJLI) != null) {
            String uid = user.getUid();
            ArrayList arrayList = new ArrayList();
            C0SR4 c0sr4 = repostFeedPanel.LLJL;
            if (c0sr4 != null && (listLJJJLZIJ = c0sr4.LJJJLZIJ()) != null) {
                for (Aweme aweme : listLJJJLZIJ) {
                    if (TextUtils.equals(uid, AwemeExtKt.getAuthorUid(aweme))) {
                        arrayList.add(aweme);
                    }
                }
            }
            vQ2(this, arrayList, null, null, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU
    public final void onDeleteAwemeEvent(C1210880hcE c1210880hcE) {
        int awemeType;
        boolean z;
        String aid;
        if (Intrinsics.LJFF(c1210880hcE.LIZIZ, "repost_feed") && Intrinsics.LJFF(c1210880hcE.LIZJ, "FUNCTION_FROM_NOT_INTERESTED")) {
            Aweme aweme = c1210880hcE.LIZ;
            List<RepostFeed> list = ((C1567630qtd) getState()).LL.LLILZ;
            RepostFeed repostFeed = null;
            if (list != null) {
                Iterator<RepostFeed> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    RepostFeed next = it2.next();
                    Aweme aweme2 = next.aweme;
                    if (aweme2 != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, aweme.getAid())) {
                        repostFeed = next;
                        break;
                    }
                }
                repostFeed = repostFeed;
            }
            if (C729510SjV.LJJIJIL(aweme)) {
                awemeType = 40;
            } else {
                awemeType = aweme.getAwemeType();
            }
            if (repostFeed != null && repostFeed.source == EnumC1581150rFR.SORT.getDataLevel()) {
                z = true;
            } else {
                z = false;
            }
            String str = "";
            if (z) {
                String aid2 = aweme.getAid();
                if (aid2 != null) {
                    str = aid2;
                }
                C1593830rZt.LIZIZ.LJ(new C0VNS(str, System.currentTimeMillis(), -1, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), awemeType));
                return;
            }
            if (repostFeed == null || repostFeed.source != EnumC1581150rFR.HISTORY.getDataLevel()) {
                return;
            }
            String aid3 = aweme.getAid();
            if (aid3 != null) {
                str = aid3;
            }
            C0VRX.LIZIZ.LIZJ(new C0VNG(awemeType, str, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), System.currentTimeMillis()));
        }
    }

    @C14EU
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
        this.LLIZLLLIL = c1564680qos.LIZ;
    }

    public final List wQ2(List list) {
        int size;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                RepostFeed repostFeed = (RepostFeed) it2.next();
                Aweme aweme = repostFeed.aweme;
                if (aweme != null) {
                    if (!((ArrayList) this.LLILZ).contains(aweme.getAid())) {
                        arrayList.add(repostFeed);
                        if (aweme.getAid() != null) {
                            ((ArrayList) this.LLILZ).add(aweme.getAid());
                        }
                    } else if (aweme.getAid() != null) {
                        arrayList2.add(aweme.getAid());
                    }
                }
            }
            size = list.size();
        } else {
            size = 0;
        }
        this.LLJ.LIZJ(Integer.valueOf(size - arrayList.size()), "duplicated_count");
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenRefresh(X.InterfaceC1364105Vn<? super X.AbstractC1264080j02<com.ss.android.ugc.aweme.repostfeed.model.RepostFeed>> r14) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel.whenRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(long r13, X.InterfaceC1364105Vn<? super X.AbstractC1264080j02<com.ss.android.ugc.aweme.repostfeed.model.RepostFeed>> r15) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel.DQ2(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final /* bridge */ /* synthetic */ Object whenLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC1264080j02<RepostFeed>> interfaceC1364105Vn) {
        return DQ2(l.longValue(), interfaceC1364105Vn);
    }

    public final void yQ2(List<RepostFeed> list, EnumC1603630rph enumC1603630rph) {
        String str;
        String str2;
        Aweme item;
        String aid;
        C0SR4 c0sr4;
        int i = this.LLIZLLLIL;
        if (i != 0) {
            if (i != 13) {
                str = "";
            } else {
                str = "click";
            }
        } else {
            str = "draw";
        }
        if (enumC1603630rph == EnumC1603630rph.REFRESH) {
            this.LLIZLLLIL = -1;
        }
        if (str.length() > 0) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty() && !this.LLILZIL) {
                str2 = "no_video";
            } else {
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Aweme aweme = ((RepostFeed) ListProtector.get(list, i2)).aweme;
                        RepostFeedPanel repostFeedPanel = this.LLILLJJLI;
                        String aid2 = null;
                        if (repostFeedPanel != null && (c0sr4 = repostFeedPanel.LLJL) != null) {
                            item = c0sr4.getItem(i2);
                        } else {
                            item = null;
                        }
                        if (aweme != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        if (item != null) {
                            aid2 = item.getAid();
                        }
                        if (!Intrinsics.LJFF(aid, aid2)) {
                            str2 = "with_update";
                            break;
                        }
                        i2++;
                    } else {
                        str2 = "no_update";
                        break;
                    }
                }
            }
            C1400330mXn.LIZ.getClass();
            C1400330mXn.LJFF("repost_feed", str, str2);
        }
    }

    public final synchronized AbstractC1264080j02<RepostFeed> AQ2(EnumC1603630rph enumC1603630rph, RepostFeedResponse repostFeedResponse, int i) {
        boolean z;
        AbstractC1264080j02<RepostFeed> c1264120j06;
        String aid;
        Aweme aweme;
        if (enumC1603630rph == EnumC1603630rph.REFRESH) {
            z = true;
            ((ArrayList) this.LLILZ).clear();
            C1360680lVq c1360680lVq = C1360680lVq.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1360680lVq.getClass();
            Keva keva = C1360680lVq.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_read_time_");
            sbLIZ.append(C1360680lVq.LIZ());
            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
        } else {
            z = false;
        }
        C1360680lVq c1360680lVq2 = C1360680lVq.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c1360680lVq2.getClass();
        Keva keva2 = C1360680lVq.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("last_request_time_");
        sbLIZ2.append(C1360680lVq.LIZ());
        keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), jCurrentTimeMillis2);
        this.LL = false;
        this.LLILZIL = repostFeedResponse.getHasMore();
        this.LLILZLL = repostFeedResponse.getSource();
        ((ExecutorService) C1360680lVq.LIZJ.getValue()).submit(new ARunnableS13S1000000_21(repostFeedResponse.getPageToken(), 5));
        String lastViewItemId = repostFeedResponse.getLastViewItemId();
        if (lastViewItemId != null && !a0.LJJJIL(lastViewItemId)) {
            C1583340rIy.LIZ = lastViewItemId;
        }
        final List listWQ2 = wQ2(repostFeedResponse.getRepostFeedData());
        ArrayList arrayList = (ArrayList) listWQ2;
        if (!arrayList.isEmpty()) {
            C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Aweme aweme2 = ((RepostFeed) it2.next()).aweme;
                if (aweme2 != null) {
                    arrayList2.add(aweme2);
                }
            }
            c1360460lVU.LJJI(arrayList2, EnumC1359020lTA.REPOST_FEED, new InterfaceC1359090lTH() { // from class: X.0rpS
                @Override // X.InterfaceC1359090lTH
                public final void onFail() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0141  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
                @Override // X.InterfaceC1359090lTH
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(java.lang.String r16, java.util.List r17, java.util.List r18) {
                    /*
                        Method dump skipped, instruction units count: 458
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1603480rpS.LIZ(java.lang.String, java.util.List, java.util.List):void");
                }
            });
        }
        yQ2(listWQ2, enumC1603630rph);
        zQ2(repostFeedResponse.getRepostFeedData(), listWQ2, enumC1603630rph, i);
        if (arrayList.isEmpty()) {
            if (!repostFeedResponse.getHasMore()) {
                if (z && !repostFeedResponse.getHasMore()) {
                    CQ2(true);
                }
            } else {
                throw new C1603660rpk("refresh but fetch empty");
            }
        } else {
            CQ2(false);
        }
        ArrayList<RepostFeed> arrayList3 = (ArrayList) listWQ2;
        for (RepostFeed repostFeed : arrayList3) {
            if (repostFeed.feedRecallType == EnumC1154920g9y.REPOST.getType() && (aweme = repostFeed.aweme) != null) {
                AwemeBizExtKt.setReplaceRecTagByRepost(aweme, true);
            }
        }
        C1593840rZu c1593840rZu = C1593840rZu.LIZ;
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Aweme aweme3 = ((RepostFeed) it3.next()).aweme;
            if (aweme3 != null && (aid = aweme3.getAid()) != null) {
                arrayList4.add(aid);
            }
        }
        c1593840rZu.getClass();
        C1593840rZu.LIZ(arrayList4);
        this.LLJI = false;
        if (repostFeedResponse.getHasMore()) {
            c1264120j06 = new C1265700j2e<>(null, null, listWQ2);
        } else {
            c1264120j06 = new C1264120j06<>(listWQ2);
        }
        return c1264120j06;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0073 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(int r10, kotlin.jvm.functions.Function1 r11, kotlin.jvm.functions.Function2 r12, X.InterfaceC1364105Vn r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C1603580rpc
            if (r0 == 0) goto L7d
            r7 = r13
            X.0rpc r7 = (X.C1603580rpc) r7
            int r2 = r7.LLIZLLLIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r7.LLIZLLLIL = r2
        L12:
            java.lang.Object r2 = r7.LLILZLL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLIZLLLIL
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L76
            if (r0 == r5) goto L4a
            if (r0 != r6) goto L8f
            int r4 = r7.LLILLJJLI
            long r0 = r7.LLILLL
            int r10 = r7.LL
            kotlin.jvm.functions.Function2 r12 = r7.LLILZIL
            kotlin.jvm.functions.Function1 r11 = r7.LLILZ
            X.C155000ia.LIZIZ(r2)
        L2f:
            int r4 = r4 + 1
        L31:
            if (r4 >= r10) goto L87
            java.lang.Integer r2 = X.C2286608xc.LJ(r4)     // Catch: java.lang.Exception -> L48
            r7.LLILZ = r11     // Catch: java.lang.Exception -> L48
            r7.LLILZIL = r12     // Catch: java.lang.Exception -> L48
            r7.LL = r10     // Catch: java.lang.Exception -> L48
            r7.LLILLL = r0     // Catch: java.lang.Exception -> L48
            r7.LLILLJJLI = r4     // Catch: java.lang.Exception -> L48
            r7.LLIZLLLIL = r5     // Catch: java.lang.Exception -> L48
            java.lang.Object r2 = r12.invoke(r2, r7)     // Catch: java.lang.Exception -> L48
            goto L83
        L48:
            r3 = move-exception
            goto L59
        L4a:
            int r4 = r7.LLILLJJLI
            long r0 = r7.LLILLL
            int r10 = r7.LL
            kotlin.jvm.functions.Function2 r12 = r7.LLILZIL
            kotlin.jvm.functions.Function1 r11 = r7.LLILZ
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L58
            goto L97
        L58:
            r3 = move-exception
        L59:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            boolean r2 = r3 instanceof X.C1603660rpk
            if (r2 == 0) goto L98
            r11.invoke(r3)
            r7.LLILZ = r11
            r7.LLILZIL = r12
            r7.LL = r10
            r7.LLILLL = r0
            r7.LLILLJJLI = r4
            r7.LLIZLLLIL = r6
            java.lang.Object r2 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r2 != r8) goto L2f
            return r8
        L76:
            X.C155000ia.LIZIZ(r2)
            r0 = 0
            r4 = 0
            goto L31
        L7d:
            X.0rpc r7 = new X.0rpc
            r7.<init>(r9, r13)
            goto L12
        L83:
            if (r2 != r8) goto L86
            return r8
        L86:
            return r2
        L87:
            X.0rpl r1 = new X.0rpl
            java.lang.String r0 = "Max retries reached. Stopping retry."
            r1.<init>(r0)
            throw r1
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L97:
            return r2
        L98:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel.BQ2(int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(java.util.List<com.ss.android.ugc.aweme.repostfeed.model.RepostFeed> r9, java.util.List<com.ss.android.ugc.aweme.repostfeed.model.RepostFeed> r10, X.EnumC1603630rph r11, int r12) {
        /*
            r8 = this;
            r4 = 0
            r7 = 1
            r6 = 0
            if (r9 == 0) goto L35
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r9.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.repostfeed.model.RepostFeed r0 = (com.ss.android.ugc.aweme.repostfeed.model.RepostFeed) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.aweme
            if (r0 == 0) goto Le
            r3.add(r1)
            goto Le
        L23:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L35
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L33
            r5 = 2
            goto L36
        L33:
            r5 = 0
            goto L36
        L35:
            r5 = 1
        L36:
            X.0rph r3 = X.EnumC1603630rph.REFRESH
            if (r11 != r3) goto L96
            boolean r0 = r8.LLJI
            if (r0 == 0) goto L3f
            r7 = 0
        L3f:
            X.0rpa r2 = r8.LLJ
            java.lang.String r1 = "pull_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.LIZIZ(r0, r1)
            X.0rpa r2 = r8.LLJ
            java.lang.String r1 = "retry_time"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2.LIZIZ(r0, r1)
            X.0rpa r2 = r8.LLJ
            java.lang.String r1 = "is_empty"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.LIZIZ(r0, r1)
            X.0rpa r1 = r8.LLJ
            if (r9 == 0) goto L6c
            int r0 = r9.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L6c:
            java.lang.String r0 = "item_count"
            r1.LIZJ(r4, r0)
            int r0 = r8.LLJIJIL
            if (r9 == 0) goto L79
            int r6 = r9.size()
        L79:
            int r0 = r0 + r6
            r8.LLJIJIL = r0
            X.0rpa r2 = r8.LLJ
            java.lang.String r1 = "total_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LIZJ(r0, r1)
            X.0rpa r0 = r8.LLJ
            r0.LJ()
            if (r11 != r3) goto L95
            boolean r0 = r8.LLJI
            X.C1578000rAM.LJIIIIZZ = r0
            X.C1578000rAM.LIZ()
        L95:
            return
        L96:
            r7 = 2
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel.zQ2(java.util.List, java.util.List, X.0rph, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void vQ2(RepostFeedViewModel repostFeedViewModel, List list, List list2, String str, int i) {
        boolean z;
        int iLJLLJ;
        boolean z2 = false;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        List<RepostFeed> list3 = ((C1567630qtd) repostFeedViewModel.getState()).LL.LLILZ;
        if (list3 != null) {
            int size = list.size();
            int size2 = list3.size();
            RepostFeedPanel repostFeedPanel = repostFeedViewModel.LLILLJJLI;
            if (repostFeedPanel != null) {
                iLJLLJ = repostFeedPanel.LJLLJ();
            } else {
                iLJLLJ = 0;
            }
            if (size == (size2 - iLJLLJ) - 1) {
                z2 = true;
            }
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                repostFeedViewModel.LLZLLIL((Aweme) it2.next());
            }
        }
        if (z && z2 && repostFeedViewModel.LLILZIL) {
            repostFeedViewModel.LL = true;
            repostFeedViewModel.xQ2();
            int i2 = repostFeedViewModel.LLJILJIL + 1;
            repostFeedViewModel.LLJILJIL = i2;
            C1593850rZv.LIZ.getClass();
            C1593850rZv.LIZJ(i2, str, list2);
        }
    }
}
