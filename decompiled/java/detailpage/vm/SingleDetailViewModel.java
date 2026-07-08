package detailpage.vm;

import X.C01GW;
import X.C069P;
import X.C098200Yq;
import X.C0I0B;
import X.C0Y8T;
import X.C1434905jX;
import X.C1479605qk;
import X.C14EU;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1705506m5;
import X.C1721006oa;
import X.C1721506of;
import X.C189200o6;
import X.C2201941BFw;
import X.C291001Au;
import X.C461720I8s;
import X.C723600SZy;
import X.C879070Ye9;
import X.C879350Yeb;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import kotlin.Unit;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleDetailViewModel extends AssemViewModel<C1721506of> {
    public BlockUserController LLILZLL;
    public IMUser LLIZLLLIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1721006oa.class, null), true);
    public final C01GW LLILLJJLI = C1509305vX.LIZ(new AwS546S0100000_2(this, 919));
    public final C01GW LLILLL = C1509305vX.LIZ(new AwS546S0100000_2(this, 920));
    public final C01GW LLILZ = C1509305vX.LIZ(new AwS546S0100000_2(this, 918));
    public final C01GW LLILZIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 921));
    public final SingleDetailViewModel$eventBusLifecycleObserver$1 LLIZ = new SingleDetailViewModel$eventBusLifecycleObserver$1(this);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C1721006oa c1721006oaVQ2 = vQ2();
        C291001Au c291001Au = new C291001Au(c1721006oaVQ2 != null ? c1721006oaVQ2.LL : null);
        C0Y8T c0y8t = (C0Y8T) this.LLILZ.getValue();
        boolean z = c0y8t != null && c0y8t.isMute();
        C0Y8T c0y8t2 = (C0Y8T) this.LLILZ.getValue();
        boolean z2 = c0y8t2 != null && c0y8t2.isStickTop();
        C0Y8T c0y8t3 = (C0Y8T) this.LLILZ.getValue();
        boolean z3 = c0y8t3 != null && C879070Ye9.LJ(c0y8t3, false);
        C0Y8T c0y8t4 = (C0Y8T) this.LLILZ.getValue();
        return new C1721506of(c291001Au, z, z2, z3, c0y8t4 != null && C879070Ye9.LJFF(c0y8t4), null, new C291001Au(null));
    }

    public final C1721006oa vQ2() {
        return (C1721006oa) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            getLifecycle().removeObserver(this.LLIZ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        try {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            if (eventBusLIZLLL.LJIIJ(this)) {
                eventBusLIZLLL.LJJI(this);
            }
            c098200Yq2 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        this.LLILZLL = null;
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        getLifecycle().addObserver(this.LLIZ);
    }

    public final boolean xQ2() {
        IMUser iMUser = getState().LL.LIZ;
        if (iMUser == null) {
            return false;
        }
        C1721006oa c1721006oaVQ2 = vQ2();
        return (Intrinsics.LJFF(c1721006oaVQ2 != null ? Boolean.valueOf(c1721006oaVQ2.LLILLL) : null, Boolean.TRUE) || C461720I8s.LJI(iMUser.getUid())) ? false : true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserSuccessEvent(C1479605qk c1479605qk) {
        setState(new AwS581S0100000_2(this, 367));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserUpdateEvent(C1434905jX c1434905jX) {
        String uid;
        IMUser iMUser;
        C1721006oa c1721006oaVQ2 = vQ2();
        if (c1721006oaVQ2 != null && (iMUser = c1721006oaVQ2.LL) != null) {
            uid = iMUser.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, c1434905jX.LIZ)) {
            setState(new AwS581S0100000_2(c1434905jX, 368));
        }
    }

    public final void wQ2(String str) {
        IAuthorSupporterHelper iAuthorSupporterHelper;
        IMUser iMUser = getState().LL.LIZ;
        if (iMUser == null) {
            return;
        }
        C1721006oa c1721006oaVQ2 = vQ2();
        if (c1721006oaVQ2 == null || !c1721006oaVQ2.LLILLL || ((iAuthorSupporterHelper = (IAuthorSupporterHelper) PluggableExtentionKt.pluggableSpiForReal(IAuthorSupporterHelper.class)) != null && iAuthorSupporterHelper.LIZJ())) {
            IMContactApi.LIZ.getClass();
            C069P.LIZ().LIZLLL().LIZIZ(iMUser.getUid());
            IUserProfilePreload iUserProfilePreload = (IUserProfilePreload) PluggableExtentionKt.pluggableSpiForReal(IUserProfilePreload.class);
            if (iUserProfilePreload != null) {
                IMUser.Companion.getClass();
                iUserProfilePreload.LIZ(C2201941BFw.LJII(iMUser));
            }
            C879350Yeb c879350Yeb = C879350Yeb.LIZ;
            String uid = iMUser.getUid();
            c879350Yeb.getClass();
            C879350Yeb.LIZ(uid, str, "chat_settings");
            IIMChatAnalytics.LIZ.getClass();
            IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
            if (iIMChatAnalyticsLIZ != null) {
                iIMChatAnalyticsLIZ.LJIIIIZZ(C0I0B.LJFF.LIZIZ(), Integer.valueOf(iMUser.getFollowStatus()), iMUser.getUid(), str, String.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
