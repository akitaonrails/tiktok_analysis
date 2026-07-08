package com.ss.android.ugc.aweme.repostfeed.viewmodel;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.AbstractC848400XPy;
import X.C09YA;
import X.C0VNG;
import X.C0VNS;
import X.C0VRX;
import X.C0XQ7;
import X.C1210880hcE;
import X.C1360460lVU;
import X.C1360680lVq;
import X.C1400330mXn;
import X.C14EU;
import X.C15438062q;
import X.C1564680qos;
import X.C1583220rIm;
import X.C1583340rIy;
import X.C1593830rZt;
import X.C1593840rZu;
import X.C1593850rZv;
import X.C1603560rpa;
import X.C1603660rpk;
import X.C2037707yZ;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217401BqU;
import X.C316640Cb8;
import X.C317290CcB;
import X.C612720O1m;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C729510SjV;
import X.C758702xl;
import X.C888460YtI;
import X.EnumC1154920g9y;
import X.EnumC1359020lTA;
import X.EnumC1581150rFR;
import X.EnumC1603630rph;
import X.InterfaceC0148002o;
import X.InterfaceC1209780haS;
import X.InterfaceC1359090lTH;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC614560O8o;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS13S1000000_21;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeed;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedDetailViewModel extends BaseDetailShareVM<C612720O1m, C758702xl, Long> {
    public InterfaceC1209780haS LLILZIL;
    public boolean LLIZLLLIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public final C09YA LLILZLL = new C09YA(this, AFwS213S0000000_24.get$arr$(257));
    public final List<String> LLIZ = new ArrayList();
    public int LLJ = EnumC1581150rFR.SORT.getDataLevel();
    public int LLJI = -1;
    public final C1603560rpa LLJIJIL = new C1603560rpa();
    public boolean LLJILJIL = true;

    public final C316640Cb8 GQ2() {
        C1583220rIm.LIZ(2);
        this.LLJILJIL = false;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List listBQ2 = BQ2(null);
        c317290CcB.getClass();
        return new C316640Cb8(listBQ2);
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 195;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C612720O1m(0);
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

    public static List BQ2(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        Aweme aweme = new Aweme();
        aweme.setAid(UUID.randomUUID().toString());
        aweme.setAwemeType(331);
        arrayList.add(new C758702xl(new RepostFeed(aweme, 0, 0, 0L, 0)));
        return arrayList;
    }

    public final List DQ2(List list) {
        int size;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                RepostFeed repostFeed = (RepostFeed) it2.next();
                Aweme aweme = repostFeed.aweme;
                if (aweme != null) {
                    if (!((ArrayList) this.LLIZ).contains(aweme.getAid())) {
                        arrayList.add(repostFeed);
                        ((ArrayList) this.LLIZ).add(aweme.getAid());
                    } else {
                        arrayList2.add(aweme.getAid());
                    }
                }
            }
            size = list.size();
        } else {
            size = 0;
        }
        this.LLJIJIL.LIZJ(Integer.valueOf(size - arrayList.size()), "duplicated_count");
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        Lifecycle lifecycle;
        this.LLILZIL = interfaceC1209780haS;
        Context context = interfaceC1209780haS.getFragment().getContext();
        if (context != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = false;
            c20603715jn.LJIIJ = false;
            c20603715jn.LIZ = 0;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
            viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(this) { // from class: X.0Oh7
                @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                public final Object get() {
                    return ((AssemListViewModel) this.receiver).getConfig();
                }
            }.get());
        }
        super.bindView(interfaceC1209780haS);
        Fragment fragment = interfaceC1209780haS.getFragment();
        if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel.bindView.2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1583220rIm.LIZ(3);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C758702xl> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 375));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockAccount(C888460YtI c888460YtI) {
        User user = c888460YtI.LIZ;
        if (user != null) {
            String uid = user.getUid();
            ArrayList arrayList = new ArrayList();
            List<ITEM> listListGetAll = listGetAll();
            if (listListGetAll != 0) {
                Iterator it2 = listListGetAll.iterator();
                while (it2.hasNext()) {
                    Aweme aweme = ((C758702xl) it2.next()).LL.aweme;
                    if (aweme != null && TextUtils.equals(uid, AwemeExtKt.getAuthorUid(aweme))) {
                        arrayList.add(aweme);
                    }
                }
            }
            CQ2(this, arrayList, null, null, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU
    public final void onDeleteAwemeEvent(C1210880hcE c1210880hcE) {
        int awemeType;
        C758702xl next;
        String aid;
        if (Intrinsics.LJFF(c1210880hcE.LIZIZ, "repost_feed") && Intrinsics.LJFF(c1210880hcE.LIZJ, "FUNCTION_FROM_NOT_INTERESTED")) {
            Aweme aweme = c1210880hcE.LIZ;
            List<C758702xl> list = ((C612720O1m) getState()).LL.LLILZ;
            RepostFeed repostFeed = null;
            if (list != null) {
                Iterator<C758702xl> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Aweme aweme2 = next.LL.aweme;
                        if (aweme2 != null) {
                            aid = aweme2.getAid();
                        } else {
                            aid = null;
                        }
                        if (Intrinsics.LJFF(aid, aweme.getAid())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C758702xl c758702xl = next;
                if (c758702xl != null) {
                    repostFeed = c758702xl.LL;
                }
            }
            if (C729510SjV.LJJIJIL(aweme)) {
                awemeType = 40;
            } else {
                awemeType = aweme.getAwemeType();
            }
            if (repostFeed != null) {
                if (repostFeed.source == EnumC1581150rFR.SORT.getDataLevel()) {
                    C1593830rZt.LIZIZ.LJ(new C0VNS(aweme.getAid(), System.currentTimeMillis(), -1, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), awemeType));
                } else {
                    if (repostFeed.source != EnumC1581150rFR.HISTORY.getDataLevel()) {
                        return;
                    }
                    C0VRX.LIZIZ.LIZJ(new C0VNG(awemeType, aweme.getAid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), System.currentTimeMillis()));
                }
            }
        }
    }

    @C14EU
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
        this.LLJI = c1564680qos.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRenderFirstFrameEvent(C2037707yZ c2037707yZ) {
        C1583220rIm.LIZ(0);
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
                Aweme aweme = ((C758702xl) it2.next()).LL.aweme;
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
        return ((C758702xl) interfaceC1891350zJl).LL.aweme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void EQ2(List<RepostFeed> list, EnumC1603630rph enumC1603630rph) {
        String str;
        String str2;
        String aid;
        RepostFeed repostFeed;
        Aweme aweme;
        int i = this.LLJI;
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
            this.LLJI = -1;
        }
        if (str.length() > 0) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty() && !this.LLIZLLLIL) {
                str2 = "no_video";
            } else {
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Aweme aweme2 = ((RepostFeed) ListProtector.get(list, i2)).aweme;
                        C758702xl c758702xl = (C758702xl) listGetAt(i2);
                        String aid2 = null;
                        if (aweme2 != null) {
                            aid = aweme2.getAid();
                        } else {
                            aid = null;
                        }
                        if (c758702xl != null && (repostFeed = c758702xl.LL) != null && (aweme = repostFeed.aweme) != null) {
                            aid2 = aweme.getAid();
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r13, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r15) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).longValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Long>>) interfaceC1364105Vn);
    }

    public final synchronized AbstractC316870CbV<Long> HQ2(EnumC1603630rph enumC1603630rph, RepostFeedResponse repostFeedResponse, int i) {
        AbstractC316870CbV<Long> c316640Cb8;
        String aid;
        Aweme aweme;
        if (enumC1603630rph == EnumC1603630rph.REFRESH) {
            ((ArrayList) this.LLIZ).clear();
            C1360680lVq c1360680lVq = C1360680lVq.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1360680lVq.getClass();
            Keva keva = C1360680lVq.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_read_time_");
            sbLIZ.append(C1360680lVq.LIZ());
            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
        }
        C1360680lVq c1360680lVq2 = C1360680lVq.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c1360680lVq2.getClass();
        Keva keva2 = C1360680lVq.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("last_request_time_");
        sbLIZ2.append(C1360680lVq.LIZ());
        keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), jCurrentTimeMillis2);
        this.LLIZLLLIL = repostFeedResponse.getHasMore();
        this.LLJ = repostFeedResponse.getSource();
        ((ExecutorService) C1360680lVq.LIZJ.getValue()).submit(new ARunnableS13S1000000_21(repostFeedResponse.getPageToken(), 5));
        String lastViewItemId = repostFeedResponse.getLastViewItemId();
        if (lastViewItemId != null && !a0.LJJJIL(lastViewItemId)) {
            C1583340rIy.LIZ = lastViewItemId;
        }
        final List listDQ2 = DQ2(repostFeedResponse.getRepostFeedData());
        ArrayList arrayList = (ArrayList) listDQ2;
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
            c1360460lVU.LJJI(arrayList2, EnumC1359020lTA.REPOST_FEED, new InterfaceC1359090lTH() { // from class: X.0rpT
                @Override // X.InterfaceC1359090lTH
                public final void onFail() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
                @Override // X.InterfaceC1359090lTH
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(java.lang.String r15, java.util.List r16, java.util.List r17) {
                    /*
                        Method dump skipped, instruction units count: 511
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1603490rpT.LIZ(java.lang.String, java.util.List, java.util.List):void");
                }
            });
        }
        EQ2(listDQ2, enumC1603630rph);
        FQ2(repostFeedResponse.getRepostFeedData(), listDQ2, enumC1603630rph, i);
        if (arrayList.isEmpty() && repostFeedResponse.getHasMore()) {
            throw new C1603660rpk("refresh but fetch empty");
        }
        ArrayList<RepostFeed> arrayList3 = (ArrayList) listDQ2;
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
        this.LLJILJIL = false;
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listDQ2, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList5.add(new C758702xl((RepostFeed) it4.next()));
        }
        if (repostFeedResponse.getHasMore() && (!arrayList5.isEmpty())) {
            c316640Cb8 = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, 0L, arrayList5, 1);
        } else {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            List listBQ2 = BQ2(arrayList5);
            c317290CcB.getClass();
            c316640Cb8 = new C316640Cb8<>(listBQ2);
        }
        return c316640Cb8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FQ2(java.util.List<com.ss.android.ugc.aweme.repostfeed.model.RepostFeed> r9, java.util.List<com.ss.android.ugc.aweme.repostfeed.model.RepostFeed> r10, X.EnumC1603630rph r11, int r12) {
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
            boolean r0 = r8.LLJILJIL
            if (r0 == 0) goto L3f
            r7 = 0
        L3f:
            X.0rpa r2 = r8.LLJIJIL
            java.lang.String r1 = "pull_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.LIZIZ(r0, r1)
            X.0rpa r2 = r8.LLJIJIL
            java.lang.String r1 = "retry_time"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2.LIZIZ(r0, r1)
            X.0rpa r2 = r8.LLJIJIL
            java.lang.String r1 = "is_empty"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.LIZIZ(r0, r1)
            X.0rpa r1 = r8.LLJIJIL
            if (r9 == 0) goto L6c
            int r0 = r9.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L6c:
            java.lang.String r0 = "item_count"
            r1.LIZJ(r4, r0)
            int r0 = r8.LLJILJILJ
            if (r9 == 0) goto L79
            int r6 = r9.size()
        L79:
            int r0 = r0 + r6
            r8.LLJILJILJ = r0
            X.0rpa r2 = r8.LLJIJIL
            java.lang.String r1 = "total_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LIZJ(r0, r1)
            X.0rpa r0 = r8.LLJIJIL
            r0.LJ()
            if (r11 != r3) goto L95
            boolean r0 = r8.LLJILJIL
            X.C1578000rAM.LJIIIIZZ = r0
            X.C1578000rAM.LIZ()
        L95:
            return
        L96:
            r7 = 2
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel.FQ2(java.util.List, java.util.List, X.0rph, int):void");
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
    public final java.lang.Object IQ2(int r10, kotlin.jvm.functions.Function1 r11, kotlin.jvm.functions.Function2 r12, X.InterfaceC1364105Vn r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C1603570rpb
            if (r0 == 0) goto L7d
            r7 = r13
            X.0rpb r7 = (X.C1603570rpb) r7
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
            X.0rpb r7 = new X.0rpb
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel.IQ2(int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void CQ2(RepostFeedDetailViewModel repostFeedDetailViewModel, List list, List list2, String str, int i) {
        boolean z;
        int iLJLLJ;
        BaseListFragmentPanel baseListFragmentPanel;
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
        List<C758702xl> list3 = ((C612720O1m) repostFeedDetailViewModel.getState()).LL.LLILZ;
        if (list3 != null) {
            int size = list.size();
            int size2 = list3.size();
            InterfaceC614560O8o interfaceC614560O8o = repostFeedDetailViewModel.LLILZIL;
            if (interfaceC614560O8o != null && (interfaceC614560O8o instanceof BaseListFragmentPanel) && (baseListFragmentPanel = (BaseListFragmentPanel) interfaceC614560O8o) != null) {
                iLJLLJ = baseListFragmentPanel.LJLLJ();
            } else {
                iLJLLJ = 0;
            }
            if (size == (size2 - iLJLLJ) - 1) {
                z2 = true;
            }
        }
        if (!list.isEmpty()) {
            for (Object obj : list) {
                C612720O1m c612720O1m = (C612720O1m) repostFeedDetailViewModel.getState();
                c612720O1m.getClass();
                List<C758702xl> list4 = c612720O1m.getListState().LLILZ;
                if (list4 != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    Iterator<C758702xl> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LL.aweme);
                    }
                    int iIndexOf = arrayList.indexOf(obj);
                    if (iIndexOf != -1) {
                        repostFeedDetailViewModel.listRemoveItemAt(iIndexOf);
                        InterfaceC1209780haS interfaceC1209780haS = repostFeedDetailViewModel.LLILZIL;
                        if (interfaceC1209780haS != null) {
                            interfaceC1209780haS.Y1(iIndexOf);
                        }
                    }
                }
            }
        }
        if (z && z2 && repostFeedDetailViewModel.LLIZLLLIL) {
            InterfaceC1209780haS interfaceC1209780haS2 = repostFeedDetailViewModel.LLILZIL;
            if (interfaceC1209780haS2 != null) {
                interfaceC1209780haS2.Uh(true);
            }
            repostFeedDetailViewModel.manualListLoadMore(0L);
            int i2 = repostFeedDetailViewModel.LLJILLL + 1;
            repostFeedDetailViewModel.LLJILLL = i2;
            C1593850rZv.LIZ.getClass();
            C1593850rZv.LIZJ(i2, str, list2);
        }
    }
}
