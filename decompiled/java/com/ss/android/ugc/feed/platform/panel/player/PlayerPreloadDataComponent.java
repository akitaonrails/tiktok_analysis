package com.ss.android.ugc.feed.platform.panel.player;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0C64;
import X.C0NFO;
import X.C0RD6;
import X.C0SR4;
import X.C0XQ7;
import X.C1389300mG0;
import X.C1480850odf;
import X.C1481230oeH;
import X.C1484250oj9;
import X.C1558520qew;
import X.C1559850qh5;
import X.C1559860qh6;
import X.C1559870qh7;
import X.C1563480qmw;
import X.C1566140qrE;
import X.C1568270quf;
import X.C1568280qug;
import X.C1578630rBN;
import X.C2252031DCn;
import X.C296300BjQ;
import X.C299750Boz;
import X.C303210BuZ;
import X.C304820BxA;
import X.C304830BxB;
import X.C452501pT;
import X.C607330Nrv;
import X.C630740Ooa;
import X.C823050WQl;
import X.EnumC452301pR;
import X.InterfaceC1475300oUi;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1568300qui;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC739770T0d;
import Y.ARunnableS92S0200000_23;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class PlayerPreloadDataComponent extends BasePanelComponent implements InterfaceC1568300qui, InterfaceC1475300oUi, IPlayerPreloadDataAbility, InterfaceC1554640qYg {
    public static boolean LLILZLL = true;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public C1484250oj9 LLILZIL;

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void Dd(int i, String str, String str2, String str3) {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void LLLLZLLIL(String str) {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerPreloadDataAbility
    public final PlayerPreloadDataComponent ML2() {
        return this;
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void Sm() {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void T8(List list) {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void Xi(String str, String str2, long j, long j2) {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void Z9() {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void ck() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1996443098) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void t8(String str, long j, long j2, String str2) {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void tf(long j, long j2, String str, String str2) {
    }

    @Override // X.InterfaceC1568300qui
    public final void Dm() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo;
        C0SR4 c0sr4Zv0;
        C1484250oj9 c1484250oj9;
        Aweme awemeLJIIIIZZ;
        if (C1578630rBN.LJIIIZ(this) || (iFeedPanelPlatformAbilityBo = bo()) == null || !C1389300mG0.LJIL(getPanelContext()) || iFeedPanelPlatformAbilityBo.xy2() == null || !C0NFO.LIZ(iFeedPanelPlatformAbilityBo.xy2())) {
            return;
        }
        String bitRatedRatioUri = null;
        if (this.LLILZIL == null) {
            this.LLILZIL = new C1484250oj9(null, fo());
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility == null || (awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ()) == null) {
            bitRatedRatioUri = "";
        } else {
            Video video = awemeLJIIIIZZ.getVideo();
            if (video != null) {
                VideoUrlModel videoUrlModelLJIIJ = C0C64.LJIILLIIL().LJIIIZ(31744, "bytevc1_play_addr_policy_unify", true, true) ? C1481230oeH.LJIIJ(C607330Nrv.LIZ.LIZ().getVideoPlayAddr(C1481230oeH.LJI(video), C1480850odf.LIZJ.getPlayerType())) : video.getProperPlayAddr();
                if (videoUrlModelLJIIJ != null) {
                    bitRatedRatioUri = videoUrlModelLJIIJ.getBitRatedRatioUri();
                }
            }
        }
        if (TextUtils.isEmpty(bitRatedRatioUri) || (c0sr4Zv0 = iFeedPanelPlatformAbilityBo.Zv0()) == null || (c1484250oj9 = this.LLILZIL) == null) {
            return;
        }
        c1484250oj9.LIZ(false, bitRatedRatioUri, 0L, 0L, c0sr4Zv0, iFeedPanelPlatformAbilityBo.LJLLJ(), true);
    }

    public final IFeedPanelPlatformAbility bo() {
        return (IFeedPanelPlatformAbility) this.LL.getValue();
    }

    public PlayerPreloadDataComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1565), new AwS553S0100000_9((InterfaceC1565950qqv) this, 1737));
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559860qh6(true, this));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1566), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C1559850qh5(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
        this.LLILLL = C452501pT.LIZIZ(new C1563480qmw(this));
        this.LLILZ = C452501pT.LIZIZ(new C1559870qh7(this));
    }

    public final PreloadStrategyConfig fo() {
        if (C1389300mG0.LJII(getPanelContext())) {
            try {
                C0C64.LJIILLIIL().getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (((PreloadStrategyConfig) C0C64.LJJI(PreloadStrategyConfig.class, "preload_strategy_hp", true)) == null) {
                C303210BuZ.LIZ();
            }
        }
        return C303210BuZ.LIZ();
    }

    public final boolean ho() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        Aweme awemeLJIIIIZZ;
        return !C1389300mG0.LJII(getPanelContext()) || (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue()) == null || (awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ()) == null || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || awemeLJIIIIZZ.getAuthor() == null || !TextUtils.equals(awemeLJIIIIZZ.getAuthor().getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) || C0C64.LJIILLIIL().LJIJ(31744, 1, "enable_preload_hp_personal", true) == 1;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (C1389300mG0.LJIL(getPanelContext())) {
            C1568280qug.LIZ.getClass();
            C1568280qug.LIZLLL = new WeakReference<>(this);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final IPlayerPreloadDataAbility m347do(WeakReference<IBaseListFragmentPanel> weakReference) {
        IBaseListFragmentPanel iBaseListFragmentPanel;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityAk2;
        InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL;
        if (weakReference == null || (iBaseListFragmentPanel = weakReference.get()) == null || (iFeedPanelPlatformAbilityAk2 = iBaseListFragmentPanel.Ak2()) == null || (interfaceC665370Q7zLLIIJLIL = iFeedPanelPlatformAbilityAk2.LLIIJLIL()) == null) {
            return null;
        }
        return (IPlayerPreloadDataAbility) C1558520qew.LIZ(interfaceC665370Q7zLLIIJLIL, IPlayerPreloadDataAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_render_first_frame", new C1568270quf(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerPreloadDataAbility
    public final void gs1(final Aweme aweme) {
        C304830BxB.LIZ.getClass();
        if (C304830BxB.LIZIZ) {
            if (!LLILZLL) {
                if (aweme != null) {
                    C304820BxA.LIZ.getClass();
                    if (C304820BxA.LIZIZ) {
                        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0ojc
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("PlayerPreloadDataComponent@c41c.tryPreloadVideoWhenLoadMore$1");
                                try {
                                    if (C1483340ohg.LJIJI(aweme)) {
                                        ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS92S0200000_23(aweme, this, 62));
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("PlayerPreloadDataComponent@c41c.tryPreloadVideoWhenLoadMore$1");
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            LLILZLL = false;
            return;
        }
        if (aweme == null) {
            return;
        }
        C304820BxA.LIZ.getClass();
        if (!C304820BxA.LIZIZ) {
            return;
        }
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0ojc
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PlayerPreloadDataComponent@c41c.tryPreloadVideoWhenLoadMore$1");
                try {
                    if (C1483340ohg.LJIJI(aweme)) {
                        ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS92S0200000_23(aweme, this, 62));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PlayerPreloadDataComponent@c41c.tryPreloadVideoWhenLoadMore$1");
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerPreloadDataAbility
    public final void nx1(String str) {
        C0SR4 c0sr4Zv0;
        Aweme item;
        Video video;
        String bitRatedRatioUri = str;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
        if (iFeedPanelPlatformAbilityBo != null && (c0sr4Zv0 = iFeedPanelPlatformAbilityBo.Zv0()) != null && (item = c0sr4Zv0.getItem(iFeedPanelPlatformAbilityBo.LJLLJ())) != null && item.getVideo() != null && (video = item.getVideo()) != null && video.getPlayAddr() != null) {
            boolean zHasVideoModel = video.hasVideoModel();
            if (this.LLILZIL == null) {
                this.LLILZIL = new C1484250oj9(null, fo());
            }
            if (!zHasVideoModel) {
                bitRatedRatioUri = video.getPlayAddr().getBitRatedRatioUri();
            }
            if (bitRatedRatioUri == null) {
                bitRatedRatioUri = "";
            }
            C1484250oj9 c1484250oj9 = this.LLILZIL;
            if (c1484250oj9 != null) {
                c1484250oj9.LIZ(zHasVideoModel, bitRatedRatioUri, 0L, 0L, c0sr4Zv0, iFeedPanelPlatformAbilityBo.LJLLJ(), iFeedPanelPlatformAbilityBo.Y82());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerPreloadDataAbility
    public final void km(String str, boolean z) {
        C0SR4 c0sr4Zv0;
        InterfaceC739770T0d interfaceC739770T0dP2;
        String aid;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
        if (iFeedPanelPlatformAbilityBo == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityBo.Zv0()) == null) {
            return;
        }
        Aweme item = c0sr4Zv0.getItem(iFeedPanelPlatformAbilityBo.LJLLJ());
        if (C296300BjQ.LIZJ && C1389300mG0.LJIL(getPanelContext()) && item != null && (aid = item.getAid()) != null) {
            synchronized (C2252031DCn.LIZ) {
                ArrayList<String> arrayList = C2252031DCn.LJFF;
                if (!arrayList.contains(aid)) {
                    arrayList.add(aid);
                }
                while (true) {
                    ArrayList<String> arrayList2 = C2252031DCn.LJFF;
                    if (arrayList2.size() <= 16) {
                        break;
                    } else {
                        ListProtector.remove(arrayList2, 0);
                    }
                }
            }
        }
        if (z && ho()) {
            if (this.LLILZIL == null) {
                IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLILLL.getValue();
                if (iPlayerComponentAbility != null) {
                    interfaceC739770T0dP2 = iPlayerComponentAbility.P2();
                } else {
                    interfaceC739770T0dP2 = null;
                }
                this.LLILZIL = new C1484250oj9(interfaceC739770T0dP2, fo());
            }
            C1484250oj9 c1484250oj9 = this.LLILZIL;
            if (c1484250oj9 != null) {
                c1484250oj9.LIZ(z, str, 0L, 0L, c0sr4Zv0, iFeedPanelPlatformAbilityBo.LJLLJ(), iFeedPanelPlatformAbilityBo.Y82());
            }
        }
    }

    @Override // X.InterfaceC1475300oUi
    public final void qc(long j, long j2, String str) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo;
        C0SR4 c0sr4Zv0;
        C1484250oj9 c1484250oj9;
        if (C1578630rBN.LJIIIZ(this) || (iFeedPanelPlatformAbilityBo = bo()) == null || !ho()) {
            return;
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = new C1484250oj9(iFeedPanelPlatformAbilityBo.P2(), fo());
        }
        if ((!C0NFO.LIZ(iFeedPanelPlatformAbilityBo.xy2()) || iFeedPanelPlatformAbilityBo.getItemCount() > 1) && (c0sr4Zv0 = iFeedPanelPlatformAbilityBo.Zv0()) != null && (c1484250oj9 = this.LLILZIL) != null) {
            c1484250oj9.LIZ(false, str, j, j2, c0sr4Zv0, iFeedPanelPlatformAbilityBo.LJLLJ(), iFeedPanelPlatformAbilityBo.Y82());
        }
    }
}
