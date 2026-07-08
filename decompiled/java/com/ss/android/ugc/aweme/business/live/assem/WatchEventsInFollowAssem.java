package com.ss.android.ugc.aweme.business.live.assem;

import X.AbstractC738140SxQ;
import X.C01D1;
import X.C0PSR;
import X.C1220000hqw;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1595010rbn;
import X.C1595180rc4;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C479940Irw;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C888460YtI;
import X.EnumC1582650rHr;
import X.InterfaceC1594910rbd;
import X.InterfaceC1595940rdI;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class WatchEventsInFollowAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLILLJJLI = C628500Oky.LIZ(new AwS568S0100000_24(this, 145));
    public final C736950SvV LLILLL = new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), new AwS568S0100000_24(this, 144), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(45), new AwS568S0100000_24((AbstractC738140SxQ) this, 146), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final AssemVMLazy LLILZ;
    public final C630740Ooa LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WatchEventsInFollowAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/aweme/base/vm/FeedSkylightContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WatchEventsInFollowAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 142);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(44), null, true);
        this.LLILZIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 143));
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    public final void bo(User user) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        InterfaceC1594910rbd interfaceC1594910rbd;
        ISkylightListAbility iSkylightListAbility;
        Object next;
        String uid;
        List listListGetAll = ((AssemSingleListViewModel) this.LLILLL.getValue()).listGetAll();
        if (listListGetAll != null) {
            Iterator it2 = listListGetAll.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) next;
                    if ((interfaceC1891350zJl2 instanceof InterfaceC1595940rdI) && Intrinsics.LJFF(((InterfaceC1595940rdI) interfaceC1891350zJl2).LLIILZL().getUser().getUid(), user.getUid())) {
                        break;
                    }
                    if (interfaceC1891350zJl2 instanceof SkylightFollowingUserItem) {
                        User user2 = ((SkylightFollowingUserItem) interfaceC1891350zJl2).followingUser;
                        if (user2 != null) {
                            uid = user2.getUid();
                        } else {
                            uid = null;
                        }
                        if (Intrinsics.LJFF(uid, user.getUid())) {
                            break;
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            interfaceC1891350zJl = (InterfaceC1891350zJl) next;
        } else {
            interfaceC1891350zJl = null;
        }
        if ((interfaceC1891350zJl instanceof InterfaceC1594910rbd) && (interfaceC1594910rbd = (InterfaceC1594910rbd) interfaceC1891350zJl) != null && (iSkylightListAbility = (ISkylightListAbility) this.LLILZIL.getValue()) != null) {
            iSkylightListAbility.nC0(interfaceC1594910rbd);
        }
    }

    @C14EU
    public final void onAutoRefreshLiveEvent(C1595010rbn c1595010rbn) {
        String str;
        if (c1595010rbn.LIZ) {
            AssemVMLazy assemVMLazy = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
            FeedSkylightContainerViewModel feedSkylightContainerViewModel = (FeedSkylightContainerViewModel) assemVMLazy.getValue();
            if (!feedSkylightContainerViewModel.wQ2()) {
                feedSkylightContainerViewModel.BQ2(true);
            }
            FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, true, "auto", true, false, false, null, 56);
            feedSkylightContainerViewModel.zQ2(false, true);
        }
        if (c1595010rbn.LIZIZ) {
            FeedSkylightListViewModel feedSkylightListViewModel = (FeedSkylightListViewModel) this.LLILLL.getValue();
            EnumC1582650rHr enumC1582650rHr = EnumC1582650rHr.MANUAL_REFRESH;
            boolean z = c1595010rbn.LIZJ;
            if (z) {
                str = "time_auto";
            } else {
                str = "auto";
            }
            FeedSkylightListViewModel.OQ2(feedSkylightListViewModel, enumC1582650rHr, "auto", false, new C1595180rc4("homepage_folllow_refresh", str, z), c1595010rbn.LIZLLL, 4);
            AssemVMLazy assemVMLazy2 = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILZLL;
            ((FeedSkylightContainerViewModel) assemVMLazy2.getValue()).LL = "auto";
        }
    }

    @C14EU
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        User user = c888460YtI.LIZ;
        if (user == null) {
            return;
        }
        bo(user);
    }

    @C14EU
    public final void onLiveRoomScrollEvent(C479940Irw c479940Irw) {
        ISkylightListAbility iSkylightListAbility;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl;
        List<InterfaceC1891350zJl> listItems;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl2;
        long j = c479940Irw.LIZ;
        if (j >= 0 && (iSkylightListAbility = (ISkylightListAbility) this.LLILZIL.getValue()) != null && (viewOnAttachStateChangeListenerC20604515jvWl = iSkylightListAbility.Wl()) != null && (listItems = viewOnAttachStateChangeListenerC20604515jvWl.getListItems()) != null) {
            int i = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : listItems) {
                if ((interfaceC1891350zJl instanceof InterfaceC1595940rdI) && ((InterfaceC1595940rdI) interfaceC1891350zJl).LLIILZL().getUser().roomId == j) {
                    if (i >= 0) {
                        if (i > 0) {
                            i--;
                        }
                        ISkylightListAbility iSkylightListAbility2 = (ISkylightListAbility) this.LLILZIL.getValue();
                        if (iSkylightListAbility2 != null && (viewOnAttachStateChangeListenerC20604515jvWl2 = iSkylightListAbility2.Wl()) != null) {
                            viewOnAttachStateChangeListenerC20604515jvWl2.scrollToPosition(i);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    @C14EU
    public final void onProfileFollowEvent(C0PSR c0psr) {
        User user;
        if (c0psr.LIZ != 0) {
            return;
        }
        Object obj = c0psr.LIZIZ;
        if ((obj instanceof User) && (user = (User) obj) != null) {
            bo(user);
        }
    }
}
