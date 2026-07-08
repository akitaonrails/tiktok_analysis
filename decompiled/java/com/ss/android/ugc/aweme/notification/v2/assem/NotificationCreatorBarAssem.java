package com.ss.android.ugc.aweme.notification.v2.assem;

import X.C013C;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0DXR;
import X.C0KFD;
import X.C0QSJ;
import X.C0ZC2;
import X.C12ES;
import X.C13LE;
import X.C15438062q;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1900930zZD;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C817403Hg;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC1900470zYT;
import X.InterfaceC21676519sR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope;
import com.ss.android.ugc.aweme.notification.v2.cell.CreatorNoticeTabCell;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationCreatorBarAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, StrategyCenter.ENABLE_SMART_SERVICE));
    public final AssemVMLazy LLJ;
    public LinearLayoutManager LLJI;
    public final C01GW LLJIJIL;
    public volatile InterfaceC1900470zYT LLJILJIL;
    public InterfaceC665370Q7z LLJILJILJ;
    public C0QSJ LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NotificationCreatorBarAssem.class, "creatorTabBarFilterAbility", "getCreatorTabBarFilterAbility()Lcom/ss/android/ugc/aweme/notification/creator/api/CreatorTabBarFilterAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(NotificationCreatorBarAssem.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public NotificationCreatorBarAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 807), AFwS271S0000000_28.get$arr$(176), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 806));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CreatorNoticeTabScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreatorNoticeTabScope.class);
        return arrayList;
    }

    public final NotificationFragmentV2ViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (NotificationFragmentV2ViewModel) assemVMLazy.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Ho() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    public final void Jo(List<NoticeTabModel> list) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvHo;
        C20600815jK<InterfaceC1891350zJl> state;
        boolean z;
        if (list != null && (viewOnAttachStateChangeListenerC20604515jvHo = Ho()) != null && (state = viewOnAttachStateChangeListenerC20604515jvHo.getState()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (NoticeTabModel noticeTabModel : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    NoticeTabModel noticeTabModel2 = noticeTabModel;
                    noticeTabModel2.index = i;
                    if (Go().getState().LL == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new C1900930zZD(noticeTabModel2, z));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            state.LJIILL(arrayList, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvHo = Ho();
        if (viewOnAttachStateChangeListenerC20604515jvHo != null) {
            C12ES.LJIILL(0, viewOnAttachStateChangeListenerC20604515jvHo);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvHo2 = Ho();
        if (viewOnAttachStateChangeListenerC20604515jvHo2 != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvHo2.getContext(), 0, false);
            this.LLJI = linearLayoutManager;
            viewOnAttachStateChangeListenerC20604515jvHo2.setLayoutManager(linearLayoutManager);
            viewOnAttachStateChangeListenerC20604515jvHo2.addItemDecoration((C0DXR) this.LLJIJIL.getValue());
            viewOnAttachStateChangeListenerC20604515jvHo2.LJIILJJIL(CreatorNoticeTabCell.class);
            if (C0ZC2.LIZ()) {
                final int scaledTouchSlop = ViewConfiguration.get(viewOnAttachStateChangeListenerC20604515jvHo2.getContext()).getScaledTouchSlop();
                final C817403Hg c817403Hg = new C817403Hg();
                final C817403Hg c817403Hg2 = new C817403Hg();
                final C013C c013c = new C013C();
                viewOnAttachStateChangeListenerC20604515jvHo2.addOnItemTouchListener(new C0KFD() { // from class: X.0JMw
                    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
                    @Override // X.InterfaceC21676019sM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LJJIFFI(androidx.recyclerview.widget.RecyclerView r7, android.view.MotionEvent r8) {
                        /*
                            r6 = this;
                            int r1 = r8.getActionMasked()
                            r3 = 0
                            r4 = 1
                            if (r1 == 0) goto L6c
                            if (r1 == r4) goto L5a
                            r0 = 2
                            if (r1 == r0) goto L11
                            r0 = 3
                            if (r1 == r0) goto L5a
                        L10:
                            return r3
                        L11:
                            float r5 = r8.getX()
                            X.03Hg r0 = r1
                            float r0 = r0.element
                            float r5 = r5 - r0
                            float r2 = r8.getY()
                            X.03Hg r0 = r2
                            float r0 = r0.element
                            float r2 = r2 - r0
                            float r1 = java.lang.Math.abs(r5)
                            int r0 = r4
                            float r0 = (float) r0
                            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                            if (r0 <= 0) goto L10
                            float r1 = java.lang.Math.abs(r5)
                            float r0 = java.lang.Math.abs(r2)
                            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                            if (r0 <= 0) goto L10
                            r0 = 0
                            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                            if (r0 <= 0) goto L58
                            r0 = -1
                        L40:
                            boolean r2 = r7.canScrollHorizontally(r0)
                            X.013C r1 = r3
                            boolean r0 = r1.element
                            if (r0 != 0) goto L10
                            if (r2 == 0) goto L10
                            r1.element = r4
                            android.view.ViewParent r0 = r7.getParent()
                            if (r0 == 0) goto L10
                            r0.requestDisallowInterceptTouchEvent(r4)
                            return r3
                        L58:
                            r0 = 1
                            goto L40
                        L5a:
                            X.013C r1 = r3
                            boolean r0 = r1.element
                            if (r0 == 0) goto L10
                            r1.element = r3
                            android.view.ViewParent r0 = r7.getParent()
                            if (r0 == 0) goto L10
                            r0.requestDisallowInterceptTouchEvent(r3)
                            return r3
                        L6c:
                            X.03Hg r1 = r1
                            float r0 = r8.getX()
                            r1.element = r0
                            X.03Hg r1 = r2
                            float r0 = r8.getY()
                            r1.element = r0
                            X.013C r0 = r3
                            r0.element = r4
                            android.view.ViewParent r0 = r7.getParent()
                            if (r0 == 0) goto L10
                            r0.requestDisallowInterceptTouchEvent(r4)
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C490880JMw.LJJIFFI(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
                    }
                });
            }
            viewOnAttachStateChangeListenerC20604515jvHo2.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0zaV
                @Override // X.InterfaceC21676519sR
                public final void m3(View view2) {
                }

                /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                @Override // X.InterfaceC21676519sR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void g5(android.view.View r6) {
                    /*
                        r5 = this;
                        com.ss.android.ugc.aweme.notification.v2.assem.NotificationCreatorBarAssem r4 = r5.LL
                        X.0zYT r0 = r4.LLJILJIL
                        if (r0 != 0) goto L3e
                        monitor-enter(r4)
                        X.0zYT r0 = r4.LLJILJIL     // Catch: java.lang.Throwable -> L39
                        if (r0 != 0) goto L37
                        X.0QSJ r1 = r4.LLJILLL     // Catch: java.lang.Throwable -> L39
                        if (r1 != 0) goto L2b
                        X.0Q7z r3 = r4.LLJILJILJ     // Catch: java.lang.Throwable -> L39
                        if (r3 != 0) goto L19
                        X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L39
                        r4.LLJILJILJ = r3     // Catch: java.lang.Throwable -> L39
                    L19:
                        r0 = 1
                        java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L39
                        java.lang.Class<com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope> r1 = com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope.class
                        r0 = 0
                        r2[r0] = r1     // Catch: java.lang.Throwable -> L39
                        X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L39
                        r4.LLJILLL = r1     // Catch: java.lang.Throwable -> L39
                        if (r1 != 0) goto L2b
                        r0 = 0
                        goto L33
                    L2b:
                        java.lang.Class<X.0zYT> r0 = X.InterfaceC1900470zYT.class
                        java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L39
                        X.0zYT r0 = (X.InterfaceC1900470zYT) r0     // Catch: java.lang.Throwable -> L39
                    L33:
                        r4.LLJILJIL = r0     // Catch: java.lang.Throwable -> L39
                        monitor-exit(r4)     // Catch: java.lang.Throwable -> L39
                        goto L3c
                    L37:
                        monitor-exit(r4)
                        goto L3e
                    L39:
                        r0 = move-exception
                        monitor-exit(r4)
                        throw r0
                    L3c:
                        if (r0 == 0) goto L41
                    L3e:
                        r0.lf()
                    L41:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1901730zaV.g5(android.view.View):void");
                }
            });
        }
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0zaU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900660zYm) obj).LLILZIL;
            }
        }, this, null, null, null, new AwS607S0100000_28(this, 95), 28, null);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0zaT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1900660zYm) obj).LL);
            }
        }, null, new AwS642S0100000_28(this, 21), 6);
    }
}
