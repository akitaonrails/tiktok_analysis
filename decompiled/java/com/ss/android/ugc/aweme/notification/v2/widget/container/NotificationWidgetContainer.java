package com.ss.android.ugc.aweme.notification.v2.widget.container;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0QSJ;
import X.C0XQ7;
import X.C0ZBD;
import X.C0ZP4;
import X.C1075780e6K;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1251110if7;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C1866150yf7;
import X.C1868400yik;
import X.C1869670ykn;
import X.C1889180zGG;
import X.C1889530zGp;
import X.C1889800zHG;
import X.C1900510zYX;
import X.C1902710zc5;
import X.C1904270zeb;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C261600ANa;
import X.C452501pT;
import X.C634610Oup;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C890290YwF;
import X.C895500ZBc;
import X.C897970ZKp;
import X.EnumC1599580rjA;
import X.EnumC1889520zGo;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC1900470zYT;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC332260D0u;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter;
import com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationFragmentInjectProtocol;
import com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationResultFragmentScope;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupFilterStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import com.ss.android.ugc.aweme.notification.v2.cell.NotificationCollapseCell;
import com.ss.android.ugc.aweme.notification.v2.cell.NotificationEmptyStatusCell;
import com.ss.android.ugc.aweme.notification.v2.cell.NotificationTopCell;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.INotificationResultViewModelAbility;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationWidgetContainer extends InboxWidgetContainer implements NotificationAbilityCenter.INotificationWidgetContainerAbility, INotificationResultViewModelAbility, InterfaceC724530SbT, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C1559260qg8 LLJILLL = new C1559260qg8(new C723580SZw(this, C1869670ykn.class, "notification_result_fragment_model"), checkSupervisorPrepared());
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final Set<String> LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public TuxActionSheet LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public volatile InterfaceC1900470zYT LLJJL;
    public InterfaceC665370Q7z LLJJLIIIJLLLLLLLZ;
    public C0QSJ LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NotificationWidgetContainer.class, "ability", "getAbility()Lcom/ss/android/ugc/aweme/notification/creator/api/CreatorTabBarFilterAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(NotificationWidgetContainer.class, "resultViewModel", "getResultViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/BaseNotificationResultViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(NotificationWidgetContainer.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public NotificationWidgetContainer() {
        checkSupervisorPrepared();
        new C723580SZw(this, C1868400yik.class, "notification_fragment_params");
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 459));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 456));
        this.LLJJIII = new LinkedHashSet();
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(314));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 458));
        this.LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 457));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(313));
        C019F c019f = C019F.LIZ;
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 460);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BaseNotificationResultViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ, 461), AFwS271S0000000_28.get$arr$(196), awS572S0100000_28, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ2, 462), AFwS271S0000000_28.get$arr$(197), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CreatorNoticeTabScope.class});
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreatorNoticeTabScope.class);
        return arrayList;
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
        NotificationCreatorResultViewModel notificationCreatorResultViewModel;
        super.onCreate();
        C1558520qew.LJI(this, NotificationResultFragmentScope.class, this, NotificationAbilityCenter.INotificationWidgetContainerAbility.class, null, null);
        C1558520qew.LJI(this, NotificationResultFragmentScope.class, this, INotificationResultViewModelAbility.class, null, null);
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        String tag = getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate, fragmentAbility = ");
        sbLIZ.append(bp());
        sbLIZ.append(", userCardAbility = ");
        sbLIZ.append(this.LLJJJ.getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ(tag, strLIZIZ);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0zYN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900430zYP) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 30), 4);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0zYR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900430zYP) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 31), 4);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0zYS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900430zYP) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 32), 4);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0zYO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900430zYP) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 33), 4);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0zYQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900430zYP) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 26), 4);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0zYM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900430zYP) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 27), 4);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0zYU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900660zYm) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 28), 4);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0zYW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900660zYm) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 29), 4);
        AssemViewModel.asyncSubscribe$default(cp(), new C2217381BqS() { // from class: X.0zYL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900660zYm) obj).LLILZIL;
            }
        }, this, null, null, null, new AwS607S0100000_28(this, 114), 28, null);
        if (C890290YwF.LIZIZ.LIZJ(false)) {
            BaseNotificationResultViewModel baseNotificationResultViewModelEp = ep();
            if ((baseNotificationResultViewModelEp instanceof NotificationCreatorResultViewModel) && (notificationCreatorResultViewModel = (NotificationCreatorResultViewModel) baseNotificationResultViewModelEp) != null) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1889800zHG(this, notificationCreatorResultViewModel, null), 3);
                C736680Sv4.LJIIIIZZ(this, notificationCreatorResultViewModel, new C2217381BqS() { // from class: X.0zYY
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1900430zYP) obj).LLJI;
                    }
                }, null, new AwS642S0100000_28(this, 93), 6);
            }
        }
        if (C1251110if7.LIZ()) {
            ri0();
        }
        C1869670ykn c1869670yknDp = dp();
        if (c1869670yknDp == null || !c1869670yknDp.LLILLJJLI) {
            this.LLJJIJI = false;
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1019142950 || iHashCode == -15928455) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1900470zYT ap() {
        /*
            r4 = this;
            X.0zYT r0 = r4.LLJJL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0zYT r0 = r4.LLJJL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJLIIIJLLLLLLLZ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope> r1 = com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0zYT> r0 = X.InterfaceC1900470zYT.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0zYT r0 = (X.InterfaceC1900470zYT) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJL = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationWidgetContainer.ap():X.0zYT");
    }

    public final NotificationAbilityCenter.INotificationFragmentAbility bp() {
        return (NotificationAbilityCenter.INotificationFragmentAbility) this.LLJJIJIL.getValue();
    }

    public final NotificationFragmentV2ViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (NotificationFragmentV2ViewModel) assemVMLazy.getValue();
    }

    public final C1869670ykn dp() {
        return (C1869670ykn) this.LLJILLL.getValue();
    }

    public final BaseNotificationResultViewModel ep() {
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (BaseNotificationResultViewModel) assemVMLazy.getValue();
    }

    public final String getTag() {
        return (String) this.LLJJI.getValue();
    }

    public final InterfaceC332260D0u<Boolean> ip() {
        return (InterfaceC332260D0u) this.LLJJJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationWidgetContainerAbility
    public final void ri0() {
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        String tag = getTag();
        c1889530zGp.getClass();
        C1889530zGp.LIZ(tag, "expandNotification()");
        this.LLJJIJI = false;
        Co(ko());
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0277, code lost:
    
        r8 = new java.util.LinkedHashSet();
        r7 = r4.iterator();
        r6 = 0;
        r10 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0287, code lost:
    
        if (r7.hasNext() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0289, code lost:
    
        r3 = r7.next();
        r2 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028f, code lost:
    
        if (r6 < 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0291, code lost:
    
        r3 = (X.InterfaceC1891350zJl) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0295, code lost:
    
        if ((r3 instanceof X.C1900970zZH) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x029e, code lost:
    
        if (((X.C1900970zZH) r3).LL.isPriority == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a0, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02a4, code lost:
    
        if ((r3 instanceof X.C1273804ye) == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ab, code lost:
    
        if (r6 == (r4.size() - 1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b2, code lost:
    
        if (r6 >= (r4.size() - 1)) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02ba, code lost:
    
        if ((com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2) instanceof X.C1900970zZH) != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02bc, code lost:
    
        r8.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02bf, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02c1, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e0, code lost:
    
        X.C1697810uHb.LJIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e4, code lost:
    
        r7 = new java.util.ArrayList();
        r6 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f1, code lost:
    
        if (r6.hasNext() == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f3, code lost:
    
        r3 = r6.next();
        r2 = (X.InterfaceC1891350zJl) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02fc, code lost:
    
        if ((r2 instanceof X.C1273804ye) == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02fe, code lost:
    
        if (r9 == 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0300, code lost:
    
        if (r10 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0306, code lost:
    
        if (((X.C1273804ye) r2).LL != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0308, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0309, code lost:
    
        if (r0 == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x030b, code lost:
    
        r7.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x030f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0311, code lost:
    
        r8.addAll(r7);
        r4.removeAll(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0325, code lost:
    
        if ((ep().getState().LLILLL instanceof X.C1623606Xi) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0335, code lost:
    
        if (ip().getValue().booleanValue() == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x033b, code lost:
    
        if (r4.isEmpty() != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0341, code lost:
    
        if (r4.size() != 1) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0349, code lost:
    
        if ((X.C13LP.LJJJLL(r4) instanceof X.C1901600zaI) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x034b, code lost:
    
        r0 = ep().xQ2();
        r4.add(new X.C897970ZKp(r0.LIZ, r0.LIZIZ, r0.LIZJ));
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0361, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r4, 0, new X.C0ZBD(0));
        r3 = com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2.LLJILJIL;
        r2 = getTag();
        r0 = "provideDataList(), displayList.size = " + r4.size();
        r3.getClass();
        X.C1889530zGp.LIZ(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0387, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> Ao() {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationWidgetContainer.Ao():java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        ArrayList arrayList = new ArrayList(super.Bo());
        arrayList.add(C13LE.LIZ(C895500ZBc.class));
        arrayList.add(C13LE.LIZ(C897970ZKp.class));
        arrayList.add(C13LE.LIZ(C0ZBD.class));
        return C13LP.LLIIII(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), NotificationFragmentInjectProtocol.class, false);
        if (listLIZIZ == null) {
            return C13BV.INSTANCE;
        }
        ArrayList<NotificationFragmentInjectProtocol> arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZIZ) {
            NotificationFragmentInjectProtocol notificationFragmentInjectProtocol = (NotificationFragmentInjectProtocol) obj;
            if (Intrinsics.LJFF(notificationFragmentInjectProtocol.identity(), C1866150yf7.LIZIZ) && notificationFragmentInjectProtocol.enable()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (NotificationFragmentInjectProtocol notificationFragmentInjectProtocol2 : arrayList) {
            arrayList2.add(new C1889180zGG(notificationFragmentInjectProtocol2.j0(), notificationFragmentInjectProtocol2.z0(), notificationFragmentInjectProtocol2.identity(), notificationFragmentInjectProtocol2.enable()));
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationWidgetContainerAbility
    public final InterfaceC332260D0u RK1() {
        return ip();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final EnumC1889520zGo bo() {
        return ip().getValue().booleanValue() ? EnumC1889520zGo.COMPLETE : super.bo();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends PowerCell<?>>> fo() {
        ArrayList arrayList = new ArrayList(super.fo());
        arrayList.add(C13LE.LIZ(NotificationCollapseCell.class));
        arrayList.add(C13LE.LIZ(NotificationEmptyStatusCell.class));
        arrayList.add(C13LE.LIZ(NotificationTopCell.class));
        return C13LP.LLIIII(arrayList);
    }

    public final String hp() {
        GroupFilterStruct groupFilterStruct;
        NoticeTabModel noticeTabModel;
        C1869670ykn c1869670yknDp = dp();
        if (c1869670yknDp == null || !c1869670yknDp.LL) {
            C1869670ykn c1869670yknDp2 = dp();
            return C1902710zc5.LIZ(Integer.valueOf((c1869670yknDp2 == null || (groupFilterStruct = c1869670yknDp2.LLILZ) == null) ? C1904270zeb.LIZJ : groupFilterStruct.noticeGroup));
        }
        C1869670ykn c1869670yknDp3 = dp();
        if (c1869670yknDp3 == null || (noticeTabModel = c1869670yknDp3.LLILLL) == null) {
            return null;
        }
        return noticeTabModel.trackingName;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationWidgetContainerAbility
    public final void Ao1(String str) {
        NotificationAbilityCenter.INotificationFragmentAbility iNotificationFragmentAbility = (NotificationAbilityCenter.INotificationFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), NotificationAbilityCenter.INotificationFragmentAbility.class, null);
        if (iNotificationFragmentAbility != null) {
            iNotificationFragmentAbility.qf2(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final void Zo(InboxWidget inboxWidget) {
        super.Zo(inboxWidget);
        NotificationAbilityCenter.INotificationFragmentAbility iNotificationFragmentAbilityBp = bp();
        if (iNotificationFragmentAbilityBp != null) {
            iNotificationFragmentAbilityBp.lL0();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.INotificationResultViewModelAbility
    public final boolean rD1(MusNotice musNotice) {
        BaseNotificationResultViewModel baseNotificationResultViewModelEp = ep();
        if (musNotice == null) {
            return false;
        }
        C1900510zYX.LIZ.getClass();
        Keva keva = (Keva) C1900510zYX.LIZIZ.getValue();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_displayed_disable_guide_tip_");
        sbLIZ.append(curUserId);
        if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false) || !baseNotificationResultViewModelEp.LL || ((Number) C261600ANa.LIZ.getValue()).intValue() == -1) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        for (MusNotice musNotice2 : baseNotificationResultViewModelEp.zQ2()) {
            int i4 = i2 + 1;
            if (i2 >= 0) {
                MusNotice musNotice3 = musNotice2;
                if (C634610Oup.LIZIZ(musNotice3) != null && i3 == -1) {
                    i3 = i2;
                }
                if (!musNotice3.hasRead) {
                    i++;
                }
                i2 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (i < ((Number) C261600ANa.LIZ.getValue()).intValue() || i3 > 2 || i3 != baseNotificationResultViewModelEp.zQ2().indexOf(musNotice)) {
            return false;
        }
        C1900510zYX.LIZ.getClass();
        Keva keva2 = (Keva) C1900510zYX.LIZIZ.getValue();
        String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("has_displayed_disable_guide_tip_");
        sbLIZ2.append(curUserId2);
        keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        if (Intrinsics.LJFF(enumC1599580rjA.getDetail(), "change_sort_type") || Intrinsics.LJFF(enumC1599580rjA.getDetail(), "change_filter_type")) {
            this.LLJJIJI = false;
        }
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        String tag = getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefresh(), from = ");
        sbLIZ.append(enumC1599580rjA.getDetail());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ(tag, strLIZIZ);
        super.vo(enumC1599580rjA);
    }

    public final void kp(BaseNotice baseNotice, boolean z, String str) {
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

    public final void lp(MusNotice musNotice, String str, String str2) {
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
        c2344009Gk.LJIIIIZZ("tab_name", hp());
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
