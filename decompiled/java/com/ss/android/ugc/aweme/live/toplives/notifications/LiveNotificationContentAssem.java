package com.ss.android.ugc.aweme.live.toplives.notifications;

import X.C0160003a;
import X.C019F;
import X.C01GW;
import X.C09JN;
import X.C11JF;
import X.C13LE;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C257100z3;
import X.C339190DRl;
import X.C452501pT;
import X.C484430IzB;
import X.C484460IzE;
import X.C484470IzF;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C784440Upu;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AfS176S0100000_7;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import webcast.api.feed.NoticeButton;
import webcast.api.feed.NoticeUIInfo;
import webcast.api.feed.NoticeUserStruct;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveNotificationContentAssem extends UIListContentAssem<LiveNotificationListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public boolean LLJI;
    public C11JF LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 326));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 322));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 323));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveNotificationContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/toplives/notifications/vm/LiveNotificationListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LiveNotificationContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveNotificationListViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 325), AFwS237S0000000_7.get$arr$(112), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 0;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final LiveNotificationListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (LiveNotificationListViewModel) assemVMLazy.getValue();
    }

    public final void Oo() {
        C1722300uv6 c1722300uv6 = (C1722300uv6) this.LLJ.getValue();
        if (c1722300uv6 == null || this.LLJI) {
            return;
        }
        this.LLJI = true;
        ((C1749280vcc) this.LLIZLLLIL.getValue()).setStatus(c1722300uv6);
        C484460IzE.LIZIZ("show");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLJILJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJILJIL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
    }

    public final void No(boolean z) {
        if (z) {
            C339190DRl.LIZLLL((View) this.LLIZLLLIL.getValue());
        } else {
            this.LLJI = false;
            C339190DRl.LIZIZ((View) this.LLIZLLLIL.getValue());
        }
    }

    public final void onEvent(C257100z3 c257100z3) {
        FollowPair followPair;
        List<ITEM> listListGetAll;
        List<NoticeUserStruct> list;
        NoticeUserStruct noticeUserStruct;
        LiveNotificationItem liveNotificationItem;
        List<NoticeUserStruct> list2;
        NoticeButton noticeButton;
        if (c257100z3 != null && (followPair = c257100z3.LIZ) != null) {
            int childCount = Go().getChildCount();
            int i = 0;
            while (true) {
                NoticeUserStruct noticeUserStruct2 = null;
                if (i >= childCount) {
                    break;
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
                View childAt = Go().getChildAt(i);
                if (childAt != null) {
                    RecyclerView.ViewHolder childViewHolder = viewOnAttachStateChangeListenerC20604515jvGo.getChildViewHolder(childAt);
                    if ((childViewHolder instanceof LiveNotificationItem) && (liveNotificationItem = (LiveNotificationItem) childViewHolder) != null) {
                        C484430IzB c484430IzBL5 = liveNotificationItem.L5();
                        NoticeUIInfo noticeUIInfo = c484430IzBL5.LLILZ;
                        if (noticeUIInfo != null && noticeUIInfo.uiType == 1 && (noticeButton = noticeUIInfo.button) != null && noticeButton.buttonType == 1) {
                            if (followPair.LIZIZ()) {
                                C197039127h c197039127h = c484430IzBL5.LLILLJJLI;
                                if (c197039127h != null) {
                                    C339190DRl.LIZIZ(c197039127h);
                                }
                            } else {
                                C197039127h c197039127h2 = c484430IzBL5.LLILLJJLI;
                                if (c197039127h2 != null) {
                                    c197039127h2.setText(c484430IzBL5.getContext().getString(R.string.jp2));
                                }
                                C197039127h c197039127h3 = c484430IzBL5.LLILLJJLI;
                                if (c197039127h3 != null) {
                                    C339190DRl.LIZLLL(c197039127h3);
                                }
                            }
                        }
                        NoticeUIInfo noticeUIInfo2 = c484430IzBL5.LLILZ;
                        if (noticeUIInfo2 != null && (list2 = noticeUIInfo2.fromUserList) != null && (true ^ list2.isEmpty())) {
                            noticeUserStruct2 = (NoticeUserStruct) ListProtector.get(list2, 0);
                        }
                        C484470IzF c484470IzF = C484470IzF.LIZ;
                        boolean zLIZIZ = followPair.LIZIZ();
                        c484470IzF.getClass();
                        C484470IzF.LIZLLL(noticeUserStruct2, zLIZIZ);
                    }
                }
                i++;
            }
            long j = followPair.LIZ;
            if (j > 0 && (listListGetAll = ip().listGetAll()) != 0) {
                Iterator it2 = listListGetAll.iterator();
                while (it2.hasNext()) {
                    NoticeUIInfo noticeUIInfo3 = ((C0160003a) it2.next()).LLILLJJLI.showUiInfo;
                    if (noticeUIInfo3 != null && (list = noticeUIInfo3.fromUserList) != null && (!list.isEmpty()) && (noticeUserStruct = (NoticeUserStruct) ListProtector.get(list, 0)) != null && noticeUserStruct.userId == j) {
                        C484470IzF c484470IzF2 = C484470IzF.LIZ;
                        boolean zLIZIZ2 = followPair.LIZIZ();
                        c484470IzF2.getClass();
                        C484470IzF.LIZLLL(noticeUserStruct, zLIZIZ2);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0IzA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C484340Iz2 c484340Iz2 = (C484340Iz2) obj;
                c484340Iz2.getClass();
                return C627260Oiy.LIZ(c484340Iz2);
            }
        }, null, new AwS621S0100000_7(this, 33), 6);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0Iz9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C484340Iz2 c484340Iz2 = (C484340Iz2) obj;
                c484340Iz2.getClass();
                return C627260Oiy.LIZLLL(c484340Iz2);
            }
        }, this, null, new AwS586S0100000_7(this, 243), new AwS551S0100000_7(this, 324), new AwS586S0100000_7(this, 244), 4, null);
        LiveNotificationListViewModel liveNotificationListViewModelIp = ip();
        liveNotificationListViewModelIp.withState(new AwS586S0100000_7(liveNotificationListViewModelIp, 593));
        UserService.getInstance().user();
        this.LLJILJIL = (C11JF) C784440Upu.LIZ().LJ(C257100z3.class).LJJLL(new AfS176S0100000_7(this, 292), new C09JN() { // from class: X.00OW
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LiveNotificationContentAssem@dac6.registerRxBus$2");
                C1C7U.LIZIZ("LiveNotificationContentAssem@dac6.registerRxBus$2");
            }
        });
    }
}
