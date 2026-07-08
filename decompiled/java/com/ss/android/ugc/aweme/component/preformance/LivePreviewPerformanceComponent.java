package com.ss.android.ugc.aweme.component.preformance;

import X.C01GW;
import X.C0RUJ;
import X.C1213220hg0;
import X.C1300550jwr;
import X.C1389300mG0;
import X.C1ACB;
import X.C1ACL;
import X.C1ACR;
import X.C452501pT;
import X.InterfaceC1616070s9l;
import com.bytedance.android.performanhtune.IPTFService;
import com.ss.android.ugc.aweme.component.preformance.LivePreviewPerformanceComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.vm.VideoStateViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewPerformanceComponent extends BasePanelComponent implements C0RUJ {
    public final C01GW LL = C452501pT.LIZIZ(new C1213220hg0(this));
    public C1ACL LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "live_preview_performance_component";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    public final IViewPagerComponentAbility bo() {
        return (IViewPagerComponentAbility) this.LL.getValue();
    }

    public final void start() {
        Aweme awemeLJIIIIZZ;
        C01GW c01gw;
        C1ACB c1acb;
        LiveRoomStruct newLiveRoomDataExt;
        if ((!VideoStateViewModel.LLILZLL && !VideoStateViewModel.LLIZ) || this.LLILLL || this.LLILZ) {
            return;
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityBo = bo();
        Aweme first = null;
        if (iViewPagerComponentAbilityBo != null && (awemeLJIIIIZZ = iViewPagerComponentAbilityBo.LJIIIIZZ()) != null) {
            IViewPagerComponentAbility iViewPagerComponentAbilityBo2 = bo();
            Aweme awemeRh = iViewPagerComponentAbilityBo2 != null ? iViewPagerComponentAbilityBo2.Rh(awemeLJIIIIZZ) : null;
            IViewPagerComponentAbility iViewPagerComponentAbilityBo3 = bo();
            Aweme awemeK12 = iViewPagerComponentAbilityBo3 != null ? iViewPagerComponentAbilityBo3.k12(awemeLJIIIIZZ) : null;
            if (AwemeSaaSExtKt.isLive(awemeLJIIIIZZ) || ((awemeRh != null && AwemeSaaSExtKt.isLive(awemeRh)) || (awemeK12 != null && AwemeSaaSExtKt.isLive(awemeK12)))) {
                IViewPagerComponentAbility iViewPagerComponentAbilityBo4 = bo();
                Aweme awemeLJIIIIZZ2 = iViewPagerComponentAbilityBo4 != null ? iViewPagerComponentAbilityBo4.LJIIIIZZ() : null;
                C1ACR.LIZ.getClass();
                if (awemeLJIIIIZZ2 != null) {
                    C1ACR.LJ = true;
                    LiveRoomStruct newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(awemeLJIIIIZZ2);
                    long j = newLiveRoomDataExt2 != null ? newLiveRoomDataExt2.id : 0L;
                    Pair<? extends Aweme, Boolean> pair = C1ACR.LIZLLL;
                    if ((AwemeSaaSExtKt.isLive(awemeLJIIIIZZ2) && j > 0 && first != null && AwemeSaaSExtKt.isLive(first) && ((pair == null || (first = pair.getFirst()) == null || (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(first)) == null) ? 0L : newLiveRoomDataExt.id) == j) ? false : true) {
                        float fNextFloat = C1ACR.LIZJ.nextFloat();
                        float f = 0.0f;
                        float f2 = (Intrinsics.LJFF("preview_slide", "preview_slide") || Intrinsics.LJFF("preview_slide", "preview_watch")) ? C1300550jwr.LIZ().fluencySamplingRate : 0.0f;
                        double d = f2;
                        if (0.0d <= d && d <= 1.0d) {
                            f = f2;
                        }
                        C1ACR.LIZLLL = new Pair<>(awemeLJIIIIZZ2, Boolean.valueOf(fNextFloat <= f));
                    }
                    Pair<? extends Aweme, Boolean> pair2 = C1ACR.LIZLLL;
                    if (pair2 != null && pair2.getSecond().booleanValue() && (c01gw = (C01GW) ((LinkedHashMap) C1ACR.LIZIZ).get("preview_slide")) != null && (c1acb = (C1ACB) c01gw.getValue()) != null) {
                        c1acb.LIZIZ(awemeLJIIIIZZ2);
                        c1acb.LIZJ.put("enter_from_merge", C1389300mG0.LIZ(getPanelContext()));
                        c1acb.LIZJ.put("enter_method", "live_cell");
                    }
                }
                this.LLILLL = true;
                return;
            }
        }
        this.LLILZ = true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        IViewPagerComponentAbility iViewPagerComponentAbilityBo;
        super.onDestroy();
        if (this.LLILLJJLI == null || (iViewPagerComponentAbilityBo = bo()) == null) {
            return;
        }
        C1ACL c1acl = this.LLILLJJLI;
        if (c1acl == null) {
            c1acl = null;
        }
        iViewPagerComponentAbilityBo.Xl0(c1acl);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1ACL] */
    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        this.LLILLJJLI = new InterfaceC1616070s9l() { // from class: X.1ACL
            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onBeforePageChange() {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageScrolledEnd(int i, float f, int i2) {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageSelected(int i, boolean z) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageUnSelected(C0SZ8 c0sz8) {
            }

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onScrollToItemStart(int i) {
            }

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                Aweme awemeLJIIIIZZ;
                long j;
                long j2;
                boolean zBooleanValue;
                C1ACB c1acb;
                Aweme first;
                LiveRoomStruct newLiveRoomDataExt;
                if (i != 0) {
                    if (i != 1) {
                        this.LL.start();
                        return;
                    } else {
                        this.LL.start();
                        ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).S5(EnumC480200IsM.FEED_SLIDE_START);
                        return;
                    }
                }
                LivePreviewPerformanceComponent livePreviewPerformanceComponent = this.LL;
                if (livePreviewPerformanceComponent.LLILLL) {
                    C1ACR c1acr = C1ACR.LIZ;
                    IViewPagerComponentAbility iViewPagerComponentAbilityBo = livePreviewPerformanceComponent.bo();
                    if (iViewPagerComponentAbilityBo != null) {
                        awemeLJIIIIZZ = iViewPagerComponentAbilityBo.LJIIIIZZ();
                    } else {
                        awemeLJIIIIZZ = null;
                    }
                    c1acr.getClass();
                    if (awemeLJIIIIZZ != null) {
                        C1ACR.LJ = false;
                        LiveRoomStruct newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(awemeLJIIIIZZ);
                        if (newLiveRoomDataExt2 != null) {
                            j = newLiveRoomDataExt2.id;
                        } else {
                            j = 0;
                        }
                        Pair<? extends Aweme, Boolean> pair = C1ACR.LIZLLL;
                        if (pair != null && (first = pair.getFirst()) != null && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(first)) != null) {
                            j2 = newLiveRoomDataExt.id;
                        } else {
                            j2 = 0;
                        }
                        Pair<? extends Aweme, Boolean> pair2 = C1ACR.LIZLLL;
                        if (pair2 != null) {
                            zBooleanValue = pair2.getSecond().booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (j > 0 && j != j2) {
                            C1ACR.LIZLLL = new Pair<>(awemeLJIIIIZZ, Boolean.valueOf(zBooleanValue));
                        }
                        C01GW c01gw = (C01GW) ((LinkedHashMap) C1ACR.LIZIZ).get("preview_slide");
                        if (c01gw != null && (c1acb = (C1ACB) c01gw.getValue()) != null) {
                            if (c1acb.LJII) {
                                c1acb.LJ = awemeLJIIIIZZ;
                                c1acb.LIZIZ.LJI();
                                c1acb.LJIIIZ = System.currentTimeMillis();
                            }
                            c1acb.LJII = false;
                        }
                    }
                }
                livePreviewPerformanceComponent.LLILLL = false;
                livePreviewPerformanceComponent.LLILZ = false;
                ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).S5(EnumC480200IsM.FEED_SLIDE_END);
            }
        };
        IViewPagerComponentAbility iViewPagerComponentAbilityBo = bo();
        if (iViewPagerComponentAbilityBo != null) {
            C1ACL c1acl = this.LLILLJJLI;
            if (c1acl == null) {
                c1acl = null;
            }
            iViewPagerComponentAbilityBo.Bv0(c1acl);
        }
    }
}
