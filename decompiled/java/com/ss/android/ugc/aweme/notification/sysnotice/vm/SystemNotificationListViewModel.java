package com.ss.android.ugc.aweme.notification.sysnotice.vm;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C09R9;
import X.C1157130gDX;
import X.C11NJ;
import X.C1218080hnq;
import X.C1244890iV5;
import X.C1244900iV6;
import X.C1244910iV7;
import X.C1246330iXP;
import X.C1246430iXZ;
import X.C1246520iXi;
import X.C13BV;
import X.C13LE;
import X.C15438062q;
import X.C1697810uHb;
import X.C1907840zkM;
import X.C20684815ws;
import X.C2344009Gk;
import X.C316640Cb8;
import X.C323380Cm0;
import X.C452501pT;
import X.C627660Ojc;
import X.C635440OwA;
import X.C637670Ozl;
import X.EnumC1244930iV9;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC635450OwB;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SystemNoticeResponse;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SystemNotificationListViewModel extends AssemListViewModel<C1218080hnq, InterfaceC1891350zJl, String> implements InterfaceC635450OwB {
    public int LLILLJJLI;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C637670Ozl.class));
    public int LLILLL = Integer.MIN_VALUE;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(272));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(273));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(271));
    public boolean LLJI = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1218080hnq(0);
    }

    public final C11NJ getDisposables() {
        return (C11NJ) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((ArrayList) C635440OwA.LIZJ).remove(this);
        getDisposables().LJ();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        ((ArrayList) C635440OwA.LIZJ).add(this);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 197));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r12) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // X.InterfaceC635450OwB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dz0(int r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel.dz0(int, boolean):void");
    }

    public final AbstractC316870CbV<String> vQ2(SystemNoticeResponse systemNoticeResponse, EnumC1244930iV9 enumC1244930iV9) {
        List list;
        String str;
        int size;
        boolean z;
        List<NoticeChannelInfo> channelList = systemNoticeResponse.getChannelList();
        if (channelList != null && !channelList.isEmpty()) {
            if (this.LLJI) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("account_type", "all");
                c2344009Gk.LIZJ(1, "rank");
                C20684815ws.LJIILLIIL("enter_system_account", c2344009Gk.LIZ);
                this.LLJI = false;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(channelList, 10));
            for (NoticeChannelInfo noticeChannelInfo : channelList) {
                int i = noticeChannelInfo.group;
                String str2 = noticeChannelInfo.name;
                if (i == this.LLILLJJLI) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C1246430iXZ(i, noticeChannelInfo, str2, z, new C1244910iV7(this)));
            }
            setState(new AwS598S0100000_19(arrayList, (List<? extends ProfileComponents>) 620));
        }
        if (systemNoticeResponse.getGroupUnsubscribeSettings() != null) {
            List<GroupUnsubscribeSetting> groupUnsubscribeSettings = systemNoticeResponse.getGroupUnsubscribeSettings();
            if (groupUnsubscribeSettings == null) {
                groupUnsubscribeSettings = C13BV.INSTANCE;
            }
            C635440OwA.LIZ = new ArrayList(groupUnsubscribeSettings);
            C635440OwA.LIZIZ = systemNoticeResponse.getEntranceSettings();
            setState(new AwS598S0100000_19(groupUnsubscribeSettings, (List<? extends ProfileComponents>) 621));
        }
        NoticeItems noticeItem = systemNoticeResponse.getNoticeItem();
        if (noticeItem != null) {
            this.LLIZ = noticeItem.maxTime;
            this.LLIZLLLIL = noticeItem.minTime;
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("system_notifications_load_more_unread_fix", true)) {
                this.LLJ = noticeItem.commonLastReadTime;
            }
            ArrayList arrayList2 = new ArrayList();
            List<InterfaceC1891350zJl> list2 = ((C1218080hnq) getState()).LL.LLILZ;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (InterfaceC1891350zJl interfaceC1891350zJl : list2) {
                    if (interfaceC1891350zJl instanceof C1246520iXi) {
                        arrayList3.add(interfaceC1891350zJl);
                    }
                }
                size = arrayList3.size();
            } else {
                size = 0;
            }
            List<? extends MusNotice> list3 = noticeItem.items;
            if (list3 != null) {
                int i2 = 0;
                for (MusNotice musNotice : list3) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        MusNotice musNotice2 = musNotice;
                        arrayList2.add(new C1246520iXi(musNotice2, C1907840zkM.LIZ(musNotice2), i2 + size, new C1244890iV5(this), new C1246330iXP(this), new C1244900iV6(this), this.LLILLJJLI));
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            wQ2(arrayList2, enumC1244930iV9);
            list = arrayList2;
        } else {
            list = C13BV.INSTANCE;
        }
        NoticeItems noticeItem2 = systemNoticeResponse.getNoticeItem();
        if (noticeItem2 != null && noticeItem2.hasMore) {
            NoticeItems noticeItem3 = systemNoticeResponse.getNoticeItem();
            if (noticeItem3 != null) {
                str = noticeItem3.cursor;
            } else {
                str = null;
            }
            return new C323380Cm0(null, str, list);
        }
        return new C316640Cb8(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(java.util.List<X.InterfaceC1891350zJl> r10, X.EnumC1244930iV9 r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel.wQ2(java.util.List, X.0iV9):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: xQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r16, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r17) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC635450OwB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cb0(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r1, r0)
            X.002o r0 = r7.getState()
            X.0hnq r0 = (X.C1218080hnq) r0
            X.0Ojc<X.0zJl> r0 = r0.LL
            java.util.List<ITEM> r1 = r0.LLILZ
            if (r1 == 0) goto L79
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L28:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r1 = r6.next()
            X.0zJl r1 = (X.InterfaceC1891350zJl) r1
            boolean r0 = r1 instanceof X.C1246520iXi
            if (r0 == 0) goto L73
            r3 = r1
            X.0iXi r3 = (X.C1246520iXi) r3
            if (r3 == 0) goto L73
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r3.LL
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo r0 = r0.channelInfo
            if (r0 == 0) goto L73
            int r0 = r0.group
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r3.LL
            int r0 = r0.channelCategory
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r3.LL
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r1 = r0.mo291clone()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice
            if (r0 == 0) goto L77
            if (r1 == 0) goto L77
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1.updateUnsubscribeStatus(r0)
            X.0iXi r1 = X.C1246520iXi.LIZ(r3, r1)
        L73:
            r4.add(r1)
            goto L28
        L77:
            r1 = r3
            goto L73
        L79:
            X.13BV r4 = X.C13BV.INSTANCE
        L7b:
            r7.listSetItems(r4)
            r0 = 238(0xee, float:3.34E-43)
            kotlin.jvm.internal.AFwS257S0000000_19 r0 = kotlin.jvm.internal.AFwS257S0000000_19.get$arr$(r0)
            r7.setState(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel.Cb0(int, int, boolean):void");
    }
}
