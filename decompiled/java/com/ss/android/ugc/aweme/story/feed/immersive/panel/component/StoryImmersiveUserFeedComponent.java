package com.ss.android.ugc.aweme.story.feed.immersive.panel.component;

import X.C01GW;
import X.C0AWH;
import X.C0AWJ;
import X.C0RGJ;
import X.C0RJN;
import X.C0RT8;
import X.C0SR4;
import X.C0SVD;
import X.C0SZ8;
import X.C13LP;
import X.C1483340ohg;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C1600710rkz;
import X.C1605650rsx;
import X.C1609930rzr;
import X.C1618440sDa;
import X.C2189821An6;
import X.C2217421BqW;
import X.C298540Bn2;
import X.C325790Cpt;
import X.C452501pT;
import X.C614770O9j;
import X.C628500Oky;
import X.C630740Ooa;
import X.C712190Rwf;
import X.C712830Rxh;
import X.C714420S0q;
import X.C729510SjV;
import X.C729980SkG;
import X.C735840Sti;
import X.EnumC1615506Uf;
import X.InterfaceC1619900sFw;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.InterfaceC729990SkH;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedVHProxyAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility;
import com.ss.android.ugc.aweme.story.api.ISkylightDetailAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.ability.PlayEnterBehaviorAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.IStoryImmersiveUserFeedAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StorySwipeInterceptComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.ability.StoryPanelVPCompatAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.ui.ImmersiveGestureMonitor;
import com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS137S0201000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryImmersiveUserFeedComponent extends BaseUserFeedComponent implements ISkylightDetailAbility, IStoryImmersiveUserFeedAbility, StoryPanelVPCompatAbility {
    public C2217421BqW LLLFZ;
    public C0RT8 LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public C712190Rwf LLLIIIL;
    public AwS137S0201000_11 LLLIIL;
    public boolean LLLJIL;
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 901));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 902));
    public final C630740Ooa LLLI = C628500Oky.LIZ(new AwS555S0100000_11(this, 903));
    public final C630740Ooa LLLIILIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 897));
    public final C630740Ooa LLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 898));
    public final C630740Ooa LLLILZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 900));
    public final C630740Ooa LLLILZJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 899));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(196));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(197));
    public final C01GW LLLJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(195));

    public final BaseDetailShareVM<?, ?, ?> Ep() {
        return (BaseDetailShareVM) this.LLLFF.getValue();
    }

    public final IStoryFeedUserDataAbility<?> Fp() {
        return (IStoryFeedUserDataAbility) this.LLLFFI.getValue();
    }

    public final void Qp() {
        C735840Sti.LIZ.getClass();
        C735840Sti.LJIJI(false, false);
        IStoryFeedUserDataAbility<?> iStoryFeedUserDataAbilityFp = Fp();
        if (iStoryFeedUserDataAbilityFp != null) {
            iStoryFeedUserDataAbilityFp.yA1(false);
        }
    }

    public final void Vp() {
        C614770O9j.LIZIZ.LJ().LJJIIZ(Ep(), this, new AwS590S0100000_11(this, 259), null, new AwS590S0100000_11(this, 260));
    }

    @Override // com.ss.android.ugc.aweme.story.api.ISkylightDetailAbility
    public final void kO2() {
        AwS137S0201000_11 awS137S0201000_11 = this.LLLIIL;
        if (awS137S0201000_11 != null) {
            awS137S0201000_11.invoke();
        }
        this.LLLIIL = null;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent
    public final C714420S0q sp() {
        return (C714420S0q) this.LLLI.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0248, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c7 A[EDGE_INSN: B:122:0x00c7->B:32:0x00c7 BREAK  A[LOOP:0: B:24:0x0085->B:47:0x0112], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[PHI: r3
      0x0039: PHI (r3v5 ??) = (r3v2 ??), (r3v6 ??) binds: [B:131:0x0039, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent, com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ap() {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent.Ap():boolean");
    }

    public final PlayEnterBehaviorAbility Bp() {
        C0RGJ c0rgjIK2;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        UserFeedVHProxyAbility userFeedVHProxyAbilityMp = mp();
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (userFeedVHProxyAbilityMp == null || (c0rgjIK2 = userFeedVHProxyAbilityMp.iK2()) == null) {
            return null;
        }
        if (!(c0rgjIK2 instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0rgjIK2) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, PlayEnterBehaviorAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL = c0rgjIK2.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, PlayEnterBehaviorAbility.class, null);
            }
        } else {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        }
        return (PlayEnterBehaviorAbility) interfaceC494301wDLIZ2;
    }

    public final boolean Ip() {
        C0RGJ c0rgjIK2;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        UserFeedVHProxyAbility userFeedVHProxyAbilityMp = mp();
        if (userFeedVHProxyAbilityMp == null || (c0rgjIK2 = userFeedVHProxyAbilityMp.iK2()) == null) {
            return false;
        }
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (!(c0rgjIK2 instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0rgjIK2) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, IPinchMonitorAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL = c0rgjIK2.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IPinchMonitorAbility.class, null);
            }
        } else {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        }
        IPinchMonitorAbility iPinchMonitorAbility = (IPinchMonitorAbility) interfaceC494301wDLIZ2;
        if (iPinchMonitorAbility != null) {
            return iPinchMonitorAbility.Eo0();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tp() {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent.Tp():void");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent, com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        BaseDetailShareVM<?, ?, ?> baseDetailShareVMEp;
        super.Vo();
        IStoryFeedUserDataAbility<?> iStoryFeedUserDataAbilityFp = Fp();
        if (iStoryFeedUserDataAbilityFp != null) {
            iStoryFeedUserDataAbilityFp.pF2();
        }
        Fragment fragment = lp().LIZJ;
        if (fragment != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragment, null), IStoryImmersiveUserFeedAbility.class, null);
        }
        Fragment fragment2 = lp().LIZJ;
        if (fragment2 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment2, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, ISkylightDetailAbility.class, null);
            if (Fp() != null) {
                C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, IStoryFeedUserDataAbility.class, null);
            }
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, StoryPanelVPCompatAbility.class, null);
        }
        if (C298540Bn2.LIZ()) {
            ((C0SVD) this.LLLILZLLLI.getValue()).LIZJ("story_immersive_feed", "exit");
        }
        if (!Intrinsics.LJFF(lp().LJ.param.getFrom(), "STORY_ENTRANCE_INBOX_GROUP_CHAT") || (baseDetailShareVMEp = Ep()) == null) {
            return;
        }
        baseDetailShareVMEp.listClear();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent, com.ss.android.ugc.aweme.feed.collection.collection.ability.IStorySafCompatAbility
    public final void j12() {
        super.j12();
        C712190Rwf c712190Rwf = this.LLLIIIL;
        if (c712190Rwf != null) {
            c712190Rwf.invoke();
        }
        this.LLLIIIL = null;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragment = lp().LIZJ;
        if (fragment != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragment, null), this, IStoryImmersiveUserFeedAbility.class, null, null);
        }
        Fragment fragment2 = lp().LIZJ;
        if (fragment2 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment2, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, ISkylightDetailAbility.class, null, null);
            IStoryFeedUserDataAbility<?> iStoryFeedUserDataAbilityFp = Fp();
            if (iStoryFeedUserDataAbilityFp != null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iStoryFeedUserDataAbilityFp, IStoryFeedUserDataAbility.class, null, null);
            }
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, StoryPanelVPCompatAbility.class, null, null);
        }
        IStoryFeedUserDataAbility<?> iStoryFeedUserDataAbilityFp2 = Fp();
        if (iStoryFeedUserDataAbilityFp2 != null) {
            iStoryFeedUserDataAbilityFp2.fm2(C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(lp().LIZJ));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent
    public final void tp() {
        List<Aweme> listLJJJLZIJ;
        super.tp();
        InterfaceC729990SkH interfaceC729990SkH = (InterfaceC729990SkH) this.LLLIZZ.getValue();
        if (interfaceC729990SkH != null) {
            interfaceC729990SkH.LIZIZ(200);
        }
        C0RT8 c0rt8 = new C0RT8(this);
        if (!kp().LIZ$0().contains(c0rt8)) {
            kp().LIZ$0().add(c0rt8);
        }
        this.LLLII = c0rt8;
        ((ImmersiveGestureMonitor) this.LLLIILIL.getValue()).setEventListener$story_release(new InterfaceC1619900sFw() { // from class: X.0RT7
            @Override // X.InterfaceC1619900sFw
            public final void E5() {
                this.LL.rf0("slide");
            }

            @Override // X.InterfaceC1619900sFw
            public final void F5() {
                C01GW<C0K77> c01gw = StorySwipeInterceptComponent.LLJLIL;
                UserFeedVHProxyAbility userFeedVHProxyAbilityMp = this.LL.mp();
                C0RI4.LIZ(userFeedVHProxyAbilityMp != null ? userFeedVHProxyAbilityMp.iK2() : null, this.LL.sp());
            }

            @Override // X.InterfaceC1619900sFw
            public final boolean LLLLLZL() {
                return this.LL.sp().LLLIZZ;
            }

            @Override // X.InterfaceC1619900sFw
            public final boolean Qc() {
                return (this.LL.Ka0() || this.LL.Ip() || this.LL.LLLJIL) ? false : true;
            }

            @Override // X.InterfaceC1619900sFw
            public final void Yi() {
                Fragment fragment;
                IDetailBaseAbility iDetailBaseAbilityLIZ;
                C0RJN c0rjnLIZIZ = this.LL.jm().LIZIZ();
                if (c0rjnLIZIZ == null || (fragment = c0rjnLIZIZ.LJ) == null || (iDetailBaseAbilityLIZ = C1600710rkz.LIZ(fragment)) == null) {
                    return;
                }
                iDetailBaseAbilityLIZ.yF(-1, "slide_right");
            }

            @Override // X.InterfaceC1619900sFw
            public final boolean f5() {
                return (this.LL.Ip() || this.LL.LLLJIL) ? false : true;
            }

            @Override // X.InterfaceC1619900sFw
            public final boolean p8() {
                StoryDetailAbility storyDetailAbility;
                StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent = this.LL;
                storyImmersiveUserFeedComponent.getClass();
                return C1223104qT.LIZ() && (storyDetailAbility = (StoryDetailAbility) C1558520qew.LIZ(C1558520qew.LJIIL(storyImmersiveUserFeedComponent), StoryDetailAbility.class, null)) != null && storyDetailAbility.Um0() == -1;
            }

            @Override // X.InterfaceC1619900sFw
            public final boolean wl() {
                return (this.LL.sp().getCurrentItem() != 0 || this.LL.Ip() || this.LL.LLLJIL) ? false : true;
            }

            @Override // X.InterfaceC1619900sFw
            public final void kh() {
                StoryDetailAbility storyDetailAbility;
                if (!C1223104qT.LIZ() || (storyDetailAbility = (StoryDetailAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), StoryDetailAbility.class, null)) == null) {
                    return;
                }
                storyDetailAbility.yI1();
            }

            @Override // X.InterfaceC1619900sFw
            public final void ki() {
                StoryDetailAbility storyDetailAbility;
                if (!C1223104qT.LIZ() || (storyDetailAbility = (StoryDetailAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), StoryDetailAbility.class, null)) == null) {
                    return;
                }
                storyDetailAbility.N20(1);
            }
        });
        if (lp().LJ.param.getEnterStoryImmersiveFeedWithOutData()) {
            C0SR4 c0sr4 = (C0SR4) this.LLLILZJ.getValue();
            Aweme aweme = null;
            if (c0sr4 != null && (listLJJJLZIJ = c0sr4.LJJJLZIJ()) != null) {
                aweme = (Aweme) C13LP.LJJJLL(listLJJJLZIJ);
            }
            if (C729980SkG.LJIIIIZZ(aweme) && aweme != null && aweme.getUserStory() != null) {
                op().setData(Collections.singletonList(aweme));
                return;
            }
        }
        Ap();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1BqW, kotlin.jvm.functions.Function0] */
    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent
    public final void zp() {
        ?? r0;
        if (Ep() == null || (r0 = this.LLLFZ) == 0) {
            return;
        }
        r0.invoke();
    }

    public static boolean Jp(Aweme aweme) {
        String authorUid;
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            return false;
        }
        if (a0.LJJIIZI(aweme.getAid(), "highlight", false)) {
            return Intrinsics.LJFF(C1605650rsx.LIZIZ.LJIILL(authorUid), Boolean.FALSE);
        }
        if (C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, authorUid) != 1) {
            return false;
        }
        return true;
    }

    public final void Up(List<? extends Aweme> list) {
        String strZc;
        if (!((Boolean) C0AWH.LIZ.getValue()).booleanValue()) {
            return;
        }
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLLILZ.getValue();
        if (iPlayerComponentAbility == null || (strZc = iPlayerComponentAbility.Zc()) == null) {
            strZc = "";
        }
        String strLIZ = C712830Rxh.LIZ(lp().LJ.param.getEventType(), C1609930rzr.LJIL(lp().LJ.param), "");
        if (((Boolean) C0AWJ.LIZ.getValue()).booleanValue()) {
            IStoryPreloaderV2 iStoryPreloaderV2LJJLI = C1618440sDa.LIZIZ.LJJLI();
            if (iStoryPreloaderV2LJJLI != null) {
                iStoryPreloaderV2LJJLI.LIZIZ(list, new C325790Cpt(strZc, "", strLIZ, false, false));
                return;
            }
            return;
        }
        C1483340ohg.LIZ(list, false, false, strZc, true, strLIZ);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.IStoryImmersiveUserFeedAbility
    public final void dT(boolean z) {
        this.LLLJIL = z;
        StoryDetailAbility storyDetailAbility = (StoryDetailAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), StoryDetailAbility.class, null);
        if (storyDetailAbility != null) {
            storyDetailAbility.AB2(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.ability.StoryPanelVPCompatAbility
    public final void lQ2(int i) {
        if (this.LLLIIII || i != sp().getCurrentItem()) {
            return;
        }
        this.LLLIIII = true;
        C0RT8 c0rt8 = this.LLLII;
        if (c0rt8 != null) {
            c0rt8.onPageSelected(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent, com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility
    public final boolean rf0(String str) {
        Fragment fragment;
        IDetailBaseAbility iDetailBaseAbilityLIZ;
        String from;
        C2189821An6 c2189821An6;
        int i = 1;
        if (super.rf0(str)) {
            return true;
        }
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLLILZ.getValue();
        if (iPlayerComponentAbility != null) {
            iPlayerComponentAbility.LLLLLLLLLL();
        }
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ != null && (fragment = c0rjnLIZIZ.LJ) != null && (iDetailBaseAbilityLIZ = C1600710rkz.LIZ(fragment)) != null) {
            BaseFeedPageParams baseFeedPageParams = lp().LJ;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                from = c2189821An6.getFrom();
            } else {
                from = null;
            }
            if (!Intrinsics.LJFF("STORY_ENTRANCE_GUIDE_CARD", from)) {
                i = 10;
            }
            iDetailBaseAbilityLIZ.yF(i, "slide");
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C729510SjV.LJJIIZ(videoItemParams.getAweme());
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> Gp(int r19, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r20) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent.Gp(int, java.util.List):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent
    public final boolean yp(Aweme aweme, String str) {
        String aid;
        if (up()) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            return Intrinsics.LJFF(aid, str);
        }
        return super.yp(aweme, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp(int r12, X.C0RGJ r13, X.C0RGJ r14) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent.hp(int, X.0RGJ, X.0RGJ):void");
    }
}
