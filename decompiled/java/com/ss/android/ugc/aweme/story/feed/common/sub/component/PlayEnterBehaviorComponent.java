package com.ss.android.ugc.aweme.story.feed.common.sub.component;

import X.C0QSJ;
import X.C0RJN;
import X.C123100dR;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C628500Oky;
import X.C630740Ooa;
import X.C738920Syg;
import X.InterfaceC1585190rLx;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.story.feed.common.sub.ability.PlayEnterBehaviorAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.component.PlayEnterBehaviorComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PlayEnterBehaviorComponent extends BaseCellLogicComponent<PlayEnterBehaviorComponent> implements PlayEnterBehaviorAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public C738920Syg LLJJIJI;
    public C738920Syg LLJJIJIIJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public volatile HomeTabAbility LLJL;
    public InterfaceC665370Q7z LLJLIL;
    public C0QSJ LLJLILLLLZIIL;
    public String LLJJIJIL = "";
    public String LLJJJ = "";
    public String LLJJJIL = "";
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 609));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 608));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 610));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlayEnterBehaviorComponent.class, "homeTabAbilityByDI", "getHomeTabAbilityByDI()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    public final Fragment Co() {
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService == null) {
            return null;
        }
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        return iDetailFeedSafService.LIZLLL(c0rjnLIZIZ != null ? c0rjnLIZIZ.LJ : null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.ability.PlayEnterBehaviorAbility
    public final String RC() {
        return C123100dR.LIZ(this.LLJJJIL) ? this.LLJJJIL : Bo();
    }

    public final String Bo() {
        return Eo() ? "inner_feed" : "outer_feed";
    }

    public final boolean Eo() {
        return !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getContext());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Syg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Syg] */
    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        HomeTabAbility homeTabAbility;
        String strCt0;
        String strZj2;
        super.onCreate();
        if (Co() == null) {
            HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLJJJJLIIL.getValue();
            String str = "";
            if (homeTabAbility2 == null || (strCt0 = homeTabAbility2.Ct0()) == null) {
                strCt0 = "";
            }
            this.LLJJIJIL = strCt0;
            HomeTabAbility homeTabAbility3 = (HomeTabAbility) this.LLJJJJLIIL.getValue();
            if (homeTabAbility3 != null && (strZj2 = homeTabAbility3.Zj2()) != null) {
                str = strZj2;
            }
            this.LLJJJ = str;
        }
        final int i = 0;
        this.LLJJIJI = new InterfaceC1585190rLx(this, i) { // from class: X.0Syg
            public final int $t;
            public Object l0;

            @Override // X.InterfaceC1585190rLx
            public final void p1(String str2, String str3) {
                switch (this.$t) {
                    case 0:
                        p1$0(this, str2, str3);
                        break;
                    case 1:
                        p1$1(this, str2, str3);
                        break;
                }
            }

            {
                this.$t = i;
                this.l0 = this;
            }

            public static final void p1$0(C738920Syg c738920Syg, String str2, String str3) {
                if (!Intrinsics.LJFF(str2, ((PlayEnterBehaviorComponent) c738920Syg.l0).LLJJIJIL) && Intrinsics.LJFF(str3, ((PlayEnterBehaviorComponent) c738920Syg.l0).LLJJIJIL)) {
                    PlayEnterBehaviorComponent playEnterBehaviorComponent = (PlayEnterBehaviorComponent) c738920Syg.l0;
                    playEnterBehaviorComponent.LLJJJIL = playEnterBehaviorComponent.Bo();
                }
            }

            public static final void p1$1(C738920Syg c738920Syg, String str2, String str3) {
                if (!Intrinsics.LJFF(str2, ((PlayEnterBehaviorComponent) c738920Syg.l0).LLJJJ) && Intrinsics.LJFF(str3, ((PlayEnterBehaviorComponent) c738920Syg.l0).LLJJJ)) {
                    PlayEnterBehaviorComponent playEnterBehaviorComponent = (PlayEnterBehaviorComponent) c738920Syg.l0;
                    playEnterBehaviorComponent.LLJJJIL = playEnterBehaviorComponent.Bo();
                }
            }
        };
        final int i2 = 1;
        this.LLJJIJIIJIL = new InterfaceC1585190rLx(this, i2) { // from class: X.0Syg
            public final int $t;
            public Object l0;

            @Override // X.InterfaceC1585190rLx
            public final void p1(String str2, String str3) {
                switch (this.$t) {
                    case 0:
                        p1$0(this, str2, str3);
                        break;
                    case 1:
                        p1$1(this, str2, str3);
                        break;
                }
            }

            {
                this.$t = i2;
                this.l0 = this;
            }

            public static final void p1$0(C738920Syg c738920Syg, String str2, String str3) {
                if (!Intrinsics.LJFF(str2, ((PlayEnterBehaviorComponent) c738920Syg.l0).LLJJIJIL) && Intrinsics.LJFF(str3, ((PlayEnterBehaviorComponent) c738920Syg.l0).LLJJIJIL)) {
                    PlayEnterBehaviorComponent playEnterBehaviorComponent = (PlayEnterBehaviorComponent) c738920Syg.l0;
                    playEnterBehaviorComponent.LLJJJIL = playEnterBehaviorComponent.Bo();
                }
            }

            public static final void p1$1(C738920Syg c738920Syg, String str2, String str3) {
                if (!Intrinsics.LJFF(str2, ((PlayEnterBehaviorComponent) c738920Syg.l0).LLJJJ) && Intrinsics.LJFF(str3, ((PlayEnterBehaviorComponent) c738920Syg.l0).LLJJJ)) {
                    PlayEnterBehaviorComponent playEnterBehaviorComponent = (PlayEnterBehaviorComponent) c738920Syg.l0;
                    playEnterBehaviorComponent.LLJJJIL = playEnterBehaviorComponent.Bo();
                }
            }
        };
        if (Co() != null || (homeTabAbility = (HomeTabAbility) this.LLJJJJLIIL.getValue()) == null) {
            return;
        }
        C738920Syg c738920Syg = this.LLJJIJI;
        if (c738920Syg != null) {
            homeTabAbility.ao(c738920Syg);
        }
        C738920Syg c738920Syg2 = this.LLJJIJIIJIL;
        if (c738920Syg2 != null) {
            homeTabAbility.UC1(c738920Syg2);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        HomeTabAbility homeTabAbility;
        super.onDestroy();
        if (Co() == null && (homeTabAbility = (HomeTabAbility) this.LLJJJJLIIL.getValue()) != null) {
            C738920Syg c738920Syg = this.LLJJIJI;
            if (c738920Syg != null) {
                homeTabAbility.tx0(c738920Syg);
            }
            C738920Syg c738920Syg2 = this.LLJJIJIIJIL;
            if (c738920Syg2 != null) {
                homeTabAbility.Ik0(c738920Syg2);
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, PlayEnterBehaviorAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, PlayEnterBehaviorAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLJJJJ = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLJJJJ) {
            this.LLJJJIL = Bo();
        }
        this.LLJJJJ = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.ability.PlayEnterBehaviorAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void KK(java.lang.String r3) {
        /*
            r2 = this;
            boolean r1 = r2.Eo()
            int r0 = r3.hashCode()
            switch(r0) {
                case -906021636: goto L42;
                case 3005871: goto L32;
                case 94750088: goto L22;
                case 109526449: goto L12;
                default: goto Lb;
            }
        Lb:
            if (r1 == 0) goto L4f
            java.lang.String r0 = "inner_feed"
        Lf:
            r2.LLJJJIL = r0
            return
        L12:
            java.lang.String r0 = "slide"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            if (r1 == 0) goto L1f
            java.lang.String r0 = "inner_hslide"
            goto Lf
        L1f:
            java.lang.String r0 = "outer_hslide"
            goto Lf
        L22:
            java.lang.String r0 = "click"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            if (r1 == 0) goto L2f
            java.lang.String r0 = "inner_click"
            goto Lf
        L2f:
            java.lang.String r0 = "outer_click"
            goto Lf
        L32:
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            if (r1 == 0) goto L3f
            java.lang.String r0 = "inner_auto"
            goto Lf
        L3f:
            java.lang.String r0 = "outer_auto"
            goto Lf
        L42:
            java.lang.String r0 = "select"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            if (r1 == 0) goto L4f
            java.lang.String r0 = "inner_vslide"
            goto Lf
        L4f:
            java.lang.String r0 = "outer_feed"
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.sub.component.PlayEnterBehaviorComponent.KK(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        this.LLJJJJJIL = true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        if (this.LLJJJJJIL) {
            this.LLJJJIL = Bo();
        }
        this.LLJJJJJIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void p(int i) {
        if (this.LLJJJJJIL) {
            this.LLJJJIL = Bo();
        }
        this.LLJJJJJIL = false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.ability.PlayEnterBehaviorAbility
    public final void vS(boolean z) {
        StoryDetailAbility storyDetailAbility;
        if (!Eo()) {
            KK("select");
            return;
        }
        if (z && (storyDetailAbility = (StoryDetailAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null && storyDetailAbility.vn2()) {
            StoryDetailAbility storyDetailAbility2 = (StoryDetailAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (storyDetailAbility2 != null) {
                storyDetailAbility2.Xt2();
            }
            KK("");
            return;
        }
        KK("select");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
