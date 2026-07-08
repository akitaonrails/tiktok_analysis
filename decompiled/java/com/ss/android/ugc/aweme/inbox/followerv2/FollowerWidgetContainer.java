package com.ss.android.ugc.aweme.inbox.followerv2;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0BVT;
import X.C0C64;
import X.C0CJI;
import X.C0QSJ;
import X.C0T3T;
import X.C0ZBD;
import X.C0ZP4;
import X.C1075780e6K;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1245050iVL;
import X.C1273804ye;
import X.C1389890mGx;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C15O7;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1770850wBP;
import X.C1866050yex;
import X.C1869660ykm;
import X.C1889180zGG;
import X.C1889730zH9;
import X.C1900360zYI;
import X.C1900490zYV;
import X.C1900590zYf;
import X.C1900610zYh;
import X.C1900970zZH;
import X.C1900990zZJ;
import X.C1904370zel;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20642515q3;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C890290YwF;
import X.C895500ZBc;
import X.C897970ZKp;
import X.EnumC1599580rjA;
import X.EnumC1889520zGo;
import X.EnumC1889540zGq;
import X.InterfaceC0148002o;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1889460zGi;
import X.InterfaceC1891350zJl;
import X.InterfaceC1900470zYT;
import X.InterfaceC1902130zb9;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC332260D0u;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACallableS431S0100000_28;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol;
import com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerUserCardContainerAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerWidgetContainerAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.v2.cell.NotificationCollapseCell;
import com.ss.android.ugc.aweme.notification.v2.cell.NotificationTopCell;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowerWidgetContainer extends InboxWidgetContainer implements FollowerPageAbilityCenter$IFollowerWidgetContainerAbility, InterfaceC724530SbT, InterfaceC1889460zGi, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(200));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(201));
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1869660ykm.class, "notification_follower_fragment_model"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final Set<String> LLJJJIL;
    public final Set<String> LLJJJJ;
    public final AtomicBoolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public TuxActionSheet LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public volatile InterfaceC1900470zYT LLJL;
    public InterfaceC665370Q7z LLJLIL;
    public C0QSJ LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowerWidgetContainer.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FollowerWidgetContainer.class, "followerViewModel", "getFollowerViewModel()Lcom/ss/android/ugc/aweme/inbox/followerv2/FollowerViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(FollowerWidgetContainer.class, "ability", "getAbility()Lcom/ss/android/ugc/aweme/notification/creator/api/CreatorTabBarFilterAbility;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public FollowerWidgetContainer() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ, 244), AFwS271S0000000_28.get$arr$(107), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(199));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FollowerViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ2, 245), AFwS271S0000000_28.get$arr$(108), null, true);
        this.LLJJJIL = new LinkedHashSet();
        this.LLJJJJ = new LinkedHashSet();
        this.LLJJJJJIL = new AtomicBoolean(true);
    }

    @Override // X.InterfaceC1889460zGi
    public final void LLLILZLLLI() {
        this.LLJJIJIIJIL = false;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        C1869660ykm c1869660ykmCp;
        List<NoticeTabModel> list;
        NoticeTabModel next;
        NoticeTabModel noticeTabModel;
        NoticeTabModel noticeTabModel2;
        Integer num;
        super.onCreate();
        C1558520qew.LJI(this, FollowerFragmentScope.class, this, FollowerPageAbilityCenter$IFollowerWidgetContainerAbility.class, null, null);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0zYE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900300zYC) obj).LLILZ;
            }
        }, null, new AwS633S0100000_19(this, 52), 6);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0zYF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900300zYC) obj).LLILZIL;
            }
        }, null, new AwS642S0100000_28(this, 17), 6);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0zYG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900300zYC) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 18), 4);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0zYH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900300zYC) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 53), 4);
        C1869660ykm c1869660ykmCp2 = cp();
        if (((c1869660ykmCp2 == null || (num = c1869660ykmCp2.LL) == null || num.intValue() != 22) ? false : true) && (c1869660ykmCp = cp()) != null && c1869660ykmCp.LLILLJJLI != null) {
            C1869660ykm c1869660ykmCp3 = cp();
            if (c1869660ykmCp3 != null && (noticeTabModel2 = c1869660ykmCp3.LLILLJJLI) != null) {
                dp().CQ2(noticeTabModel2);
            }
            C1900610zYh c1900610zYhLIZ = ep().getState().LLILZIL.LIZ();
            if (c1900610zYhLIZ != null && (list = c1900610zYhLIZ.LIZJ) != null) {
                Iterator<NoticeTabModel> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    NoticeTabModel noticeTabModel3 = next;
                    C1869660ykm c1869660ykmCp4 = cp();
                    if (c1869660ykmCp4 != null && (noticeTabModel = c1869660ykmCp4.LLILLJJLI) != null && noticeTabModel3.tabId == noticeTabModel.tabId) {
                        break;
                    }
                }
                NoticeTabModel noticeTabModel4 = next;
                if (noticeTabModel4 != null) {
                    dp().CQ2(noticeTabModel4);
                }
            }
            AssemViewModel.asyncSubscribe$default(ep(), new C2217381BqS() { // from class: X.0zYK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1900660zYm) obj).LLILZIL;
                }
            }, this, null, null, null, new AwS607S0100000_28(this, 81), 28, null);
            C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0zYD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1900300zYC) obj).LLIZLLLIL;
                }
            }, null, new AwS642S0100000_28(this, 16), 6);
        }
        FollowerViewModel followerViewModelDp = dp();
        C1869660ykm c1869660ykmCp5 = cp();
        followerViewModelDp.LLILLL = c1869660ykmCp5 != null ? c1869660ykmCp5.LLILLL : 0L;
        FollowerPageAbilityCenter$IFollowerUserCardContainerAbility followerPageAbilityCenter$IFollowerUserCardContainerAbility = (FollowerPageAbilityCenter$IFollowerUserCardContainerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FollowerPageAbilityCenter$IFollowerUserCardContainerAbility.class, null);
        if (followerPageAbilityCenter$IFollowerUserCardContainerAbility != null) {
            followerPageAbilityCenter$IFollowerUserCardContainerAbility.fI1();
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1063255222) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        ArrayList arrayList;
        int i;
        C1900990zZJ c1900990zZJ;
        FollowRequestData followRequestData;
        User user;
        String uid;
        C1900970zZH c1900970zZH;
        MusNotice musNotice;
        String str;
        C1900990zZJ c1900990zZJ2;
        MusNotice musNotice2;
        List<InterfaceC1891350zJl> listAo = super.Ao();
        if (this.LLJJJJJIL.get()) {
            int size = listAo.size();
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean zLIZ = C0BVT.LIZ();
            int iIntValue = -1;
            int i2 = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : listAo) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                C1900970zZH c1900970zZH2 = interfaceC1891350zJl2 instanceof C1900970zZH ? (C1900970zZH) interfaceC1891350zJl2 : null;
                if (c1900970zZH2 != null && (musNotice2 = c1900970zZH2.LL) != null) {
                    boolean z = jCurrentTimeMillis - (musNotice2.createTime * 1000) <= ((Number) this.LLJJ.getValue()).longValue();
                    boolean z2 = !musNotice2.hasRead;
                    boolean z3 = zLIZ && musNotice2.isPriority;
                    if (z || z2 || z3) {
                        iIntValue = i3;
                    }
                }
                if ((interfaceC1891350zJl2 instanceof C1900990zZJ) && (c1900990zZJ2 = (C1900990zZJ) interfaceC1891350zJl2) != null) {
                    FollowRequestData followRequestData2 = c1900990zZJ2.LL;
                    boolean z4 = jCurrentTimeMillis - (followRequestData2.createTime * 1000) <= ((Number) this.LLJJ.getValue()).longValue();
                    boolean z5 = !followRequestData2.hasRead;
                    boolean z6 = zLIZ && c1900990zZJ2.LLILLL;
                    if (z4 || z5 || z6) {
                        iIntValue = i3;
                    }
                }
                i2 = i3;
            }
            if (iIntValue < 0) {
                iIntValue = ((Number) this.LLJILLL.getValue()).intValue();
            }
            if (iIntValue < ((Number) this.LLJILLL.getValue()).intValue()) {
                iIntValue = ((Number) this.LLJILLL.getValue()).intValue();
            }
            if (iIntValue >= size) {
                C1904370zel.LIZ.getClass();
                C0T3T c0t3t = new C0T3T(0L);
                if (C0CJI.LIZIZ()) {
                    int i4 = C2187451AjH.LIZ;
                    C1720106oR.LJI("InboxJankOptimizationV2", "asyncJankMethod");
                    C15O7.LIZJ(new ACallableS431S0100000_28(c0t3t, 30));
                } else {
                    c0t3t.invoke();
                }
            }
            if (iIntValue <= size) {
                size = iIntValue;
            }
            arrayList = new ArrayList(listAo.subList(0, size));
        } else {
            arrayList = new ArrayList(listAo);
        }
        if (arrayList.size() < listAo.size()) {
            arrayList.add(new C895500ZBc(C20642515q3.LJI(2131847250), new C1900490zYV(this)));
            hp().LIZJ(1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FollowerWidgetContainer, provideDataList, shouldCollapse, _isToEnd: ");
            sbLIZ.append(hp().getValue().intValue());
            C1245050iVL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            hp().LIZJ(Integer.valueOf(super.bo() == EnumC1889520zGo.COMPLETE ? 1 : 0));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FollowerWidgetContainer, provideDataList, not collapse, hasMore: ");
            sbLIZ2.append(super.bo());
            sbLIZ2.append(", _isToEnd: ");
            sbLIZ2.append(hp().getValue().intValue());
            C1245050iVL.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            InterfaceC1891350zJl interfaceC1891350zJl3 = (InterfaceC1891350zJl) obj;
            boolean zContains = (!(interfaceC1891350zJl3 instanceof C1900970zZH) || (c1900970zZH = (C1900970zZH) interfaceC1891350zJl3) == null || (musNotice = c1900970zZH.LL) == null || (str = musNotice.nid) == null) ? false : this.LLJJJIL.contains(str);
            if (!(interfaceC1891350zJl3 instanceof C1900990zZJ) || (c1900990zZJ = (C1900990zZJ) interfaceC1891350zJl3) == null || (followRequestData = c1900990zZJ.LL) == null || (user = followRequestData.user) == null || (uid = user.getUid()) == null || !this.LLJJJJ.contains(uid)) {
                if (!zContains) {
                    arrayList2.add(obj);
                }
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List listSingletonList = arrayList2;
        if (zIsEmpty) {
            listSingletonList = Collections.singletonList(new C897970ZKp(2131830303, 2131830302, Integer.valueOf(R.raw.icon_large_person)));
        }
        ArrayList arrayList3 = new ArrayList(listSingletonList);
        if (C0BVT.LIZ()) {
            Iterator it2 = arrayList3.iterator();
            int i5 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!Intrinsics.LJFF(C1900360zYI.LIZ((InterfaceC1891350zJl) it2.next()), Boolean.TRUE)) {
                    i5++;
                } else if (i5 != -1) {
                    ListProtector.add(arrayList3, i5, new C1273804ye(true));
                    Iterator it3 = arrayList3.iterator();
                    int i6 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!Intrinsics.LJFF(C1900360zYI.LIZ((InterfaceC1891350zJl) it3.next()), Boolean.FALSE)) {
                            i6++;
                        } else if (i6 != -1) {
                            i = 0;
                            ListProtector.add(arrayList3, i6, new C1273804ye(false));
                        }
                    }
                }
            }
            i = 0;
        } else {
            i = 0;
        }
        ListProtector.add(arrayList3, i, new C0ZBD(i));
        return arrayList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1900470zYT bp() {
        /*
            r4 = this;
            X.0zYT r0 = r4.LLJL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0zYT r0 = r4.LLJL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJLILLLLZIIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJLIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJLIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope> r1 = com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJLILLLLZIIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0zYT> r0 = X.InterfaceC1900470zYT.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0zYT r0 = (X.InterfaceC1900470zYT) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.followerv2.FollowerWidgetContainer.bp():X.0zYT");
    }

    public final C1869660ykm cp() {
        return (C1869660ykm) this.LLJJI.getValue();
    }

    public final FollowerViewModel dp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (FollowerViewModel) assemVMLazy.getValue();
    }

    public final NotificationFragmentV2ViewModel ep() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (NotificationFragmentV2ViewModel) assemVMLazy.getValue();
    }

    public final InterfaceC332260D0u<Integer> hp() {
        return (InterfaceC332260D0u) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerWidgetContainerAbility
    public final void tb0() {
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerWidgetContainer, observeUserCardState, userCardAbility: ");
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558520qew.LJIIL(this), FollowerPageAbilityCenter$IFollowerUserCardContainerAbility.class, null);
        sbLIZ.append(interfaceC494301wDLIZ != null ? interfaceC494301wDLIZ.hashCode() : 0);
        C1245050iVL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        FollowerPageAbilityCenter$IFollowerUserCardContainerAbility followerPageAbilityCenter$IFollowerUserCardContainerAbility = (FollowerPageAbilityCenter$IFollowerUserCardContainerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FollowerPageAbilityCenter$IFollowerUserCardContainerAbility.class, null);
        if (followerPageAbilityCenter$IFollowerUserCardContainerAbility != null) {
            this.LLJJLIIIJLLLLLLLZ = true;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1889730zH9(followerPageAbilityCenter$IFollowerUserCardContainerAbility, this, null), 3);
            followerPageAbilityCenter$IFollowerUserCardContainerAbility.fI1();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        ArrayList arrayList = new ArrayList(super.Bo());
        arrayList.add(C13LE.LIZ(C895500ZBc.class));
        arrayList.add(C13LE.LIZ(C0ZBD.class));
        arrayList.add(C13LE.LIZ(C1273804ye.class));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerWidgetContainerAbility
    public final InterfaceC332260D0u Ea2() {
        return hp();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), FollowerFragmentInjectProtocol.class, false);
        if (listLIZIZ == null) {
            return C13BV.INSTANCE;
        }
        ArrayList<FollowerFragmentInjectProtocol> arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZIZ) {
            FollowerFragmentInjectProtocol followerFragmentInjectProtocol = (FollowerFragmentInjectProtocol) obj;
            if (Intrinsics.LJFF(followerFragmentInjectProtocol.identity(), C1866050yex.LIZIZ) && followerFragmentInjectProtocol.enable()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (FollowerFragmentInjectProtocol followerFragmentInjectProtocol2 : arrayList) {
            arrayList2.add(new C1889180zGG(followerFragmentInjectProtocol2.j0(), followerFragmentInjectProtocol2.z0(), followerFragmentInjectProtocol2.identity(), followerFragmentInjectProtocol2.enable()));
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final EnumC1889520zGo bo() {
        return hp().getValue().intValue() == 1 ? EnumC1889520zGo.COMPLETE : super.bo();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends PowerCell<?>>> fo() {
        ArrayList arrayList = new ArrayList(super.fo());
        arrayList.add(C13LE.LIZ(NotificationCollapseCell.class));
        arrayList.add(C13LE.LIZ(NotificationTopCell.class));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerWidgetContainerAbility
    public final void L1(int i) {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final void Zo(InboxWidget inboxWidget) {
        FollowerPageAbilityCenter$IFollowerFragmentAbility followerPageAbilityCenter$IFollowerFragmentAbility;
        super.Zo(inboxWidget);
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "inbox_follower_refresh_anim_fix", true) >= 1 && (followerPageAbilityCenter$IFollowerFragmentAbility = (FollowerPageAbilityCenter$IFollowerFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FollowerPageAbilityCenter$IFollowerFragmentAbility.class, null)) != null) {
            followerPageAbilityCenter$IFollowerFragmentAbility.Wv2();
        }
    }

    public final void ap(boolean z) {
        String str;
        if (this.LLJJJJJIL.compareAndSet(true, false)) {
            C1245050iVL.LIZ("FollowerWidgetContainer, expandNotice, trigger onWidgetStatusChange");
            if (z) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "notification_page");
                if (this.LLJJJJLIIL) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_recommend_connect", str);
                C20684815ws.LJIILLIIL("click_see_all_followers", linkedHashMap);
            }
            Zo(this);
        }
    }

    @Override // X.InterfaceC1889460zGi
    public final void onPageSelected(int i) {
        if (C890290YwF.LIZIZ.LIZJ(false)) {
            InterfaceC1900470zYT interfaceC1900470zYTBp = bp();
            if (interfaceC1900470zYTBp != null) {
                interfaceC1900470zYTBp.p0(new InterfaceC1902130zb9() { // from class: X.0zYZ
                    @Override // X.InterfaceC1902130zb9
                    public final String LIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC1902130zb9
                    public final void LIZIZ(List<Integer> list) {
                    }
                });
            }
            InterfaceC1900470zYT interfaceC1900470zYTBp2 = bp();
            if (interfaceC1900470zYTBp2 != null) {
                C13BV c13bv = C13BV.INSTANCE;
                interfaceC1900470zYTBp2.A9(new C1900590zYf(c13bv, c13bv));
            }
        }
        this.LLJJIJIIJIL = true;
        if (dp().LLJJ != null && this.LLJJIJI) {
            this.LLJJIJI = false;
            FollowerPageAbilityCenter$IFollowerFragmentAbility followerPageAbilityCenter$IFollowerFragmentAbility = (FollowerPageAbilityCenter$IFollowerFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FollowerPageAbilityCenter$IFollowerFragmentAbility.class, null);
            if (followerPageAbilityCenter$IFollowerFragmentAbility != null) {
                followerPageAbilityCenter$IFollowerFragmentAbility.zP0(EnumC1889540zGq.SHOW_LOADING, null);
            }
            EnumC1599580rjA enumC1599580rjA = EnumC1599580rjA.PULL_TO_REFRESH;
            enumC1599580rjA.setDetail("change_tab");
            vo(enumC1599580rjA);
        }
    }

    public final void ip(BaseNotice baseNotice, boolean z, String str) {
        String str2;
        String str3;
        GeneralTemplateNotice generalTemplateNotice;
        if (z) {
            str2 = "notification_message_slide_click";
        } else {
            str2 = "notification_message_slide_show";
        }
        if (baseNotice != null && (generalTemplateNotice = baseNotice.templateNotice) != null) {
            str3 = generalTemplateNotice.messageExtra;
        } else {
            str3 = null;
        }
        Map<String, String> mapLIZ = C1075780e6K.LIZ(str3);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(mapLIZ);
        if (z && str != null) {
            c2344009Gk.LJFF("click_type", str);
        }
        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
    }

    public final void kp(MusNotice musNotice, String str, String str2) {
        String str3;
        GeneralTemplateNotice generalTemplateNotice;
        String str4 = null;
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null) {
            str3 = generalTemplateNotice.messageExtra;
        } else {
            str3 = null;
        }
        Map<String, String> mapLIZ = C1075780e6K.LIZ(str3);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        String accountType = musNotice.getAccountType();
        if (accountType == null) {
            accountType = "";
        }
        c2344009Gk.LJIIIIZZ("account_type", accountType);
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("click_type", str2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZ;
        String str5 = (String) linkedHashMap.get("from_user_id");
        if (str5 != null && str5.length() > 0) {
            if (musNotice.type == 283) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str5, new String[]{","}, 0, 6);
                if (listLJJLIIIJILLIZJL != null && (!listLJJLIIIJILLIZJL.isEmpty())) {
                    str4 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                }
            } else {
                str4 = str5;
            }
            c2344009Gk.LJFF("from_user_id", str4);
        }
        String str6 = (String) linkedHashMap.get("group_id");
        if (str6 != null) {
            c2344009Gk.LJFF("group_id", str6);
        }
        String str7 = (String) linkedHashMap.get("is_together");
        if (str7 != null) {
            c2344009Gk.LJFF("is_together", str7);
        }
        C20684815ws.LJIILLIIL("notification_message_mute_operation", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
