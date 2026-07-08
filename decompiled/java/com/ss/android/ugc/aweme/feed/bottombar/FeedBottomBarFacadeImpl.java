package com.ss.android.ugc.aweme.feed.bottombar;

import X.C01GW;
import X.C0BYV;
import X.C0DMM;
import X.C0NC1;
import X.C0RGG;
import X.C0RT2;
import X.C0S4U;
import X.C1383320m6M;
import X.C1386110mAr;
import X.C1386360mBG;
import X.C13LE;
import X.C1440005kM;
import X.C1578630rBN;
import X.C19252910Tv;
import X.C19EG;
import X.C1D0J;
import X.C1D0L;
import X.C20684815ws;
import X.C2344009Gk;
import X.C293260BeW;
import X.C299560Bog;
import X.C312230CLt;
import X.C586380MzE;
import X.C589960NBy;
import X.C714060Rzg;
import X.C729510SjV;
import X.C740570T3f;
import X.EnumC1390800mIQ;
import X.EnumC1616310sA9;
import X.EnumC584570MwJ;
import X.InterfaceC1603190roz;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.AwS630S0100000_16;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public final class FeedBottomBarFacadeImpl implements IFeedBottomBarFacade {
    public final ConcurrentHashMap<Function0<Unit>, Function2<Float, Aweme, Unit>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Function0<Unit>, C740570T3f> LIZIZ = new ConcurrentHashMap<>();
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final C1D0J LIZLLL = new C1D0J();

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final boolean LJIILIIL() {
        ISpecActService iSpecActService;
        return C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJLJJLL(false) && ((iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null)) == null || !iSpecActService.LJJIFFI());
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final boolean LJIJ() {
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        return C586380MzE.LIZ().LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final boolean LJJ() {
        return C312230CLt.LJ("panel_auto_scroll");
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final List<Float> LIZIZ() {
        return C299560Bog.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final boolean LIZJ() {
        return C0BYV.LIZ() != 1;
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final C1D0J getResources() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final boolean LIZLLL(String str) {
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        return C586380MzE.LIZ().LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final boolean LJI(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
        if ((iCommercePromoteService == null || !iCommercePromoteService.LJIIJ(aweme)) && !AwemeSaaSExtKt.isLive(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJIIIIZZ(AwS578S0100000_34 awS578S0100000_34) {
        AwS630S0100000_16 awS630S0100000_16 = new AwS630S0100000_16(awS578S0100000_34, 103);
        this.LIZ.put(awS578S0100000_34, awS630S0100000_16);
        C589960NBy.LIZ.getClass();
        ((ArrayList) C589960NBy.LJFF).add(awS630S0100000_16);
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJIIJJI(C19EG c19eg) {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        Fragment fragmentKi;
        if ((c19eg instanceof InterfaceC1603190roz) && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null && (fragmentKi = homeTabAbilityLIZ.Ki("For You")) != null) {
            C1578630rBN.LJIIL(fragmentKi, C13LE.LIZ(AutoScrollComponent.class));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJIIL(AwS578S0100000_34 awS578S0100000_34) {
        C740570T3f c740570T3fRemove = this.LIZIZ.remove(awS578S0100000_34);
        if (c740570T3fRemove != null) {
            EventBus.LIZLLL().LJJI(c740570T3fRemove);
            c740570T3fRemove.LIZ.removeCallbacks(c740570T3fRemove.LIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final float LJIILLIIL(Aweme aweme) {
        C589960NBy.LIZ.getClass();
        return C589960NBy.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final Boolean LJIJI(C19EG c19eg) {
        EnumC584570MwJ enumC584570MwJXo1;
        boolean z;
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(c19eg);
        if (iAutoAScrollAbilityLIZIZ != null && (enumC584570MwJXo1 = iAutoAScrollAbilityLIZIZ.xo1()) != null) {
            if (enumC584570MwJXo1 != EnumC584570MwJ.AUTO_SCROLL_STATE_STOP) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final boolean LJIJJ(Aweme aweme) {
        C589960NBy.LIZ.getClass();
        return C589960NBy.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJIJJLI(AwS578S0100000_34 awS578S0100000_34) {
        if (this.LIZIZ.containsKey(awS578S0100000_34)) {
            return;
        }
        C740570T3f c740570T3f = new C740570T3f(this.LIZJ, awS578S0100000_34);
        this.LIZIZ.put(awS578S0100000_34, c740570T3f);
        EventBus.LIZLLL().LJIJJ(c740570T3f);
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJIL(AwS578S0100000_34 awS578S0100000_34) {
        Function2<Float, Aweme, Unit> function2Remove = this.LIZ.remove(awS578S0100000_34);
        if (function2Remove != null) {
            C589960NBy.LIZ.getClass();
            ((ArrayList) C589960NBy.LJFF).remove(function2Remove);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final boolean LJJI(Aweme aweme) {
        if (C293260BeW.LIZ() && !C1383320m6M.LIZ(aweme) && !AwemeSaaSExtKt.isLive(aweme) && !C729510SjV.LJJIJIL(aweme) && !aweme.getIsCommentPostVideo() && !AwemeExtKt.isPhotoMode(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJFF(Aweme aweme, String str) {
        C1386110mAr.LIZ.getClass();
        C1386110mAr.LIZLLL(aweme, str, "feed_lower_button");
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJIIJ(C19EG c19eg, C1D0L c1d0l) {
        CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList;
        if (C1386360mBG.LIZIZ(c19eg) != null) {
            c1d0l.invoke();
            return;
        }
        Map<C19EG, CopyOnWriteArrayList<Function0<Unit>>> map = C1386360mBG.LIZJ;
        synchronized (map) {
            try {
                CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList2 = map.get(c19eg);
                if (copyOnWriteArrayList2 == null) {
                    copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    map.put(c19eg, copyOnWriteArrayList2);
                }
                copyOnWriteArrayList = copyOnWriteArrayList2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        copyOnWriteArrayList.add(c1d0l);
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJIILL(C19EG c19eg, AwS613S0100000_34 awS613S0100000_34) {
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(c19eg);
        if (iAutoAScrollAbilityLIZIZ != null) {
            iAutoAScrollAbilityLIZIZ.mb1(awS613S0100000_34);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final boolean LJIIZILJ(C19EG c19eg, AwS613S0100000_34 awS613S0100000_34) {
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(c19eg);
        if (iAutoAScrollAbilityLIZIZ == null) {
            return false;
        }
        iAutoAScrollAbilityLIZIZ.Wa1(awS613S0100000_34);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LIZ(String str, String str2, boolean z) {
        C1440005kM.LIZ(new C714060Rzg(z, EnumC1616310sA9.LONG_PRESS.getType(), str2, str));
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJ(float f, Aweme aweme, String str) {
        C0NC1.LIZ.getClass();
        C0NC1.LIZ(f, aweme, str, "feed_lower_button");
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJIILJJIL(C19EG c19eg, String str, Aweme aweme) {
        String aid;
        ICLACaptionService iCLACaptionServiceLIZ = C0RT2.LIZ();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        iCLACaptionServiceLIZ.LJIIL(aid, str, EnumC1390800mIQ.FEED_LOWER_BUTTON, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade
    public final void LJII(C19EG c19eg, Aweme aweme, String str, boolean z) {
        String aid;
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(c19eg);
        if (iAutoAScrollAbilityLIZIZ == null) {
            return;
        }
        if (z) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("enter_method", "feed_lower_button");
            String authorUid = null;
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            C20684815ws.LJIILLIIL("turn_on_auto_scroll", c2344009Gk.LIZ);
            iAutoAScrollAbilityLIZIZ.lZ(true, true);
            return;
        }
        iAutoAScrollAbilityLIZIZ.qt0("feed_lower_button", true);
    }
}
