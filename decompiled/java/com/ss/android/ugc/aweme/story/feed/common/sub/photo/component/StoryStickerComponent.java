package com.ss.android.ugc.aweme.story.feed.common.sub.photo.component;

import X.AbstractC712240Rwk;
import X.C01GW;
import X.C0RFM;
import X.C0RFN;
import X.C0RFT;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1591220rVg;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C360660ECa;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC19578611iq;
import X.InterfaceC665370Q7z;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS80S0200000_11;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IToolsBusinessService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.IViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.ability.FakePlayerAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryStickerComponent extends BaseCellContentComponent<StoryStickerComponent> implements InterfaceC19578611iq, StoryStickerInteractAbility {
    public C0RFT LLJJLIIIJLLLLLLLZ;
    public List<? extends InteractStickerStruct> LLJL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(338));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 636));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 635));
    public final C0RFN LLJLL = new C360660ECa() { // from class: X.0RFN
        @Override // X.C360660ECa, X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
            IToolsBusinessService iToolsBusinessService;
            if (i == 1 && (iToolsBusinessService = (IToolsBusinessService) PluggableExtentionKt.pluggableSpi$default(IToolsBusinessService.class, false, false, false, 14, null)) != null) {
                iToolsBusinessService.dismissStoryInnerSocialStickerBubble();
            }
        }
    };
    public final C0RFM LLJLLIL = new AbstractC712240Rwk() { // from class: X.0RFM
        @Override // X.AbstractC712240Rwk
        public final void onPageScrollStateChanged(int i) {
            IToolsBusinessService iToolsBusinessService;
            if (i == 1 && (iToolsBusinessService = (IToolsBusinessService) PluggableExtentionKt.pluggableSpi$default(IToolsBusinessService.class, false, false, false, 14, null)) != null) {
                iToolsBusinessService.dismissStoryInnerSocialStickerBubble();
            }
        }
    };

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        IToolsBusinessService iToolsBusinessService = (IToolsBusinessService) PluggableExtentionKt.pluggableSpi$default(IToolsBusinessService.class, false, false, false, 14, null);
        if (iToolsBusinessService != null) {
            iToolsBusinessService.dismissStoryInnerSocialStickerBubble();
        }
    }

    public final void ep() {
        UserFeedViewPagerAbility userFeedViewPagerAbility;
        if (this.LLJLILLLLZIIL) {
            IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FeedCollectionViewPagerAbility.class, null);
            if (iViewPagerAbility != null) {
                iViewPagerAbility.By1(this.LLJLL);
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (userFeedViewPagerAbility = (UserFeedViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserFeedViewPagerAbility.class, null)) != null) {
                userFeedViewPagerAbility.vE1(this.LLJLLIL);
            }
            this.LLJLILLLLZIIL = false;
        }
    }

    public final void hp() {
        if (this.LLJLILLLLZIIL) {
            return;
        }
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FeedCollectionViewPagerAbility.class, null);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        UserFeedViewPagerAbility userFeedViewPagerAbility = fragmentLJI != null ? (UserFeedViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserFeedViewPagerAbility.class, null) : null;
        if (iViewPagerAbility != null) {
            iViewPagerAbility.LLJJI(this.LLJLL);
            if (userFeedViewPagerAbility != null) {
            }
            this.LLJLILLLLZIIL = true;
        } else if (userFeedViewPagerAbility == null) {
            return;
        }
        userFeedViewPagerAbility.yR(this.LLJLLIL);
        this.LLJLILLLLZIIL = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        ep();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryStickerInteractAbility.class, null);
        }
        if (C1591220rVg.LIZLLL()) {
            C0RFT c0rft = this.LLJJLIIIJLLLLLLLZ;
            if (c0rft != null) {
                c0rft.destroy();
            }
            this.LLJJLIIIJLLLLLLLZ = null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryStickerInteractAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        ep();
        C0RFT c0rft = this.LLJJLIIIJLLLLLLLZ;
        if (c0rft != null) {
            c0rft.destroy();
        }
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryStickerInteractAbility
    public final void xv0() {
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        C0RFT c0rft = this.LLJJLIIIJLLLLLLLZ;
        if (c0rft != null) {
            c0rft.resume();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryStickerInteractAbility
    public final void zA0() {
        C786410Ut5.LJLLLLLL(4, LJJIJL());
        C0RFT c0rft = this.LLJJLIIIJLLLLLLLZ;
        if (c0rft != null) {
            c0rft.pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0R60 ip(com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            r9 = this;
            X.0R60 r1 = new X.0R60
            r1.<init>()
            if (r10 == 0) goto Ld
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r10)
            if (r0 != 0) goto Lf
        Ld:
            java.lang.String r0 = ""
        Lf:
            r1.LIZJ = r0
            X.0NyV r3 = X.C584850Mwl.LIZ
            r2 = 0
            if (r10 == 0) goto La5
            java.lang.String r0 = r10.getRequestId()
        L1a:
            java.lang.String r0 = r3.LIZIZ(r0)
            r1.LJ = r0
            if (r10 == 0) goto La3
            java.lang.String r0 = r10.getAid()
        L26:
            r1.LIZLLL = r0
            java.lang.Class<com.ss.android.ugc.aweme.IDetailFeedSafService> r3 = com.ss.android.ugc.aweme.IDetailFeedSafService.class
            r4 = 0
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.IDetailFeedSafService r3 = (com.ss.android.ugc.aweme.IDetailFeedSafService) r3
            if (r3 == 0) goto La1
            X.0R8b r0 = r9.jm()
            X.0RF0 r0 = r0.LIZLLL
            if (r0 == 0) goto L9f
            androidx.fragment.app.Fragment r0 = r0.LIZJ
        L42:
            androidx.fragment.app.Fragment r4 = r3.LIZLLL(r0)
        L46:
            boolean r0 = r4 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L9d
            X.198i r4 = (X.InterfaceC214902198i) r4
            if (r4 == 0) goto L9d
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
        L50:
            java.lang.String r3 = "add_yours_enter_from_before_detail_page"
            if (r4 == 0) goto L71
            android.os.Bundle r0 = r4.getArguments()
            if (r0 == 0) goto L92
            java.lang.String r0 = r0.getString(r3)
        L5e:
            if (r0 == 0) goto L92
            r2 = r0
        L61:
            r1.LIZ = r2
            boolean r0 = X.C729510SjV.LJJ(r10)
            if (r0 == 0) goto L6e
            java.lang.String r0 = "story"
        L6b:
            r1.LJFF = r0
            return r1
        L6e:
            java.lang.String r0 = "post"
            goto L6b
        L71:
            X.0R8b r0 = r9.jm()
            X.0RF0 r0 = r0.LIZLLL
            if (r0 == 0) goto L92
            androidx.fragment.app.Fragment r0 = r0.LIZJ
            if (r0 == 0) goto L92
            X.19EG r0 = r0.getActivity()
            if (r0 == 0) goto L92
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L92
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch: java.lang.Exception -> L8e
            goto L5e
        L8e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L92:
            X.0R8b r0 = r9.jm()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r0.LJ
            if (r0 == 0) goto L61
            java.lang.String r2 = r0.eventType
            goto L61
        L9d:
            r4 = r2
            goto L50
        L9f:
            r0 = r2
            goto L42
        La1:
            r4 = r2
            goto L46
        La3:
            r0 = r2
            goto L26
        La5:
            r0 = r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryStickerComponent.ip(com.ss.android.ugc.aweme.feed.model.Aweme):X.0R60");
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        FakePlayerAbility fakePlayerAbility;
        if (!C1697810uHb.LJIIJJI(8, 9).contains(Integer.valueOf(interactStickerStruct.getType())) && (fakePlayerAbility = (FakePlayerAbility) this.LLJJL.getValue()) != null) {
            fakePlayerAbility.lv();
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (!(view instanceof FrameLayout)) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0RFO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new AwS625S0100000_11(this, 51), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0RFP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(109), 4);
        HandlerHook.viewPost(LJJIJL(), new ARunnableS111S0100000_11(this, 49));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String aid;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBind, this = ");
            sbLIZ.append(this);
            sbLIZ.append(", aid = ");
            Aweme aweme = videoItemParams2.getAweme();
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            HandlerHook.viewPost(LJJIJL(), new ARunnableS80S0200000_11(videoItemParams2, this, 38));
        }
    }
}
