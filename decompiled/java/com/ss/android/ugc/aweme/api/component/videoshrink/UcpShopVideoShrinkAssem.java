package com.ss.android.ugc.aweme.api.component.videoshrink;

import X.AbstractC738140SxQ;
import X.C0DHB;
import X.C1058500deS;
import X.C1558520qew;
import X.C20571215eY;
import X.C335830DEn;
import X.C814420VxA;
import X.InterfaceC1058490deR;
import X.InterfaceC1350190lEv;
import X.InterfaceC1554640qYg;
import X.InterfaceC335820DEm;
import X.InterfaceC494301wD;
import X.InterfaceC679410Qkt;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility;
import com.ss.android.ugc.aweme.commercialize.ucp.api.callback.IUCPWatchWhileLoadingTuxSheetProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes17.dex */
public final class UcpShopVideoShrinkAssem extends AbstractC738140SxQ implements InterfaceC335820DEm, VideoShrinkAbility, InterfaceC1554640qYg {
    public final CopyOnWriteArrayList<InterfaceC1058490deR> LL = new CopyOnWriteArrayList<>();
    public VideoCommonShrinkAbility LLILLJJLI;
    public final C1058500deS LLILLL;

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void B4() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void LJJLIIIIJ() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void PE2() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final boolean dA0() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2016640377) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r1 != null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility bo() {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.component.videoshrink.UcpShopVideoShrinkAssem.bo():com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility");
    }

    @Override // X.InterfaceC335820DEm
    public final void h0() {
        this.LLILLL.LLILZIL = null;
        this.LLILLJJLI = null;
    }

    public UcpShopVideoShrinkAssem() {
        C1058500deS c1058500deS = new C1058500deS();
        c1058500deS.LLJ = 0.9f;
        c1058500deS.LLJI = C814420VxA.LIZIZ(c1058500deS.LLILZLL * 0.9f);
        InterfaceC1350190lEv interfaceC1350190lEv = new InterfaceC1350190lEv() { // from class: X.0deP
            @Override // X.InterfaceC1350190lEv
            public final Boolean LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC1350190lEv
            public final void LIZ(int i, int i2) {
                this.LIZ.t1(i, i2);
            }
        };
        InterfaceC679410Qkt interfaceC679410Qkt = new InterfaceC679410Qkt() { // from class: X.0deO
            @Override // X.InterfaceC679410Qkt
            public final void LLJLL(float f, float f2) {
                this.LL.ob(f, f2, new C20571215eY(true, 0, 831));
            }
        };
        c1058500deS.LLILLL = interfaceC1350190lEv;
        c1058500deS.LLILZ = interfaceC679410Qkt;
        this.LLILLL = c1058500deS;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility
    public final boolean I3() {
        VideoCommonShrinkAbility videoCommonShrinkAbilityBo = bo();
        if (videoCommonShrinkAbilityBo != null) {
            return videoCommonShrinkAbilityBo.I3();
        }
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IUCPWatchWhileLoadingTuxSheetProvider iUCPWatchWhileLoadingTuxSheetProvider = (IUCPWatchWhileLoadingTuxSheetProvider) PluggableExtentionKt.pluggableSpi$default(IUCPWatchWhileLoadingTuxSheetProvider.class, false, false, false, 14, null);
        if (iUCPWatchWhileLoadingTuxSheetProvider != null) {
            iUCPWatchWhileLoadingTuxSheetProvider.LIZ(C0DHB.IN_FLOW);
        } else if (C335830DEn.LIZ == this) {
            C335830DEn.LIZ = null;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        IUCPWatchWhileLoadingTuxSheetProvider iUCPWatchWhileLoadingTuxSheetProvider = (IUCPWatchWhileLoadingTuxSheetProvider) PluggableExtentionKt.pluggableSpi$default(IUCPWatchWhileLoadingTuxSheetProvider.class, false, false, false, 14, null);
        if (iUCPWatchWhileLoadingTuxSheetProvider != null) {
            iUCPWatchWhileLoadingTuxSheetProvider.LIZIZ(C0DHB.IN_FLOW, this);
        } else {
            C335830DEn.LIZ = this;
        }
    }

    @Override // X.InterfaceC335820DEm
    public final void Ai(TuxSheet tuxSheet) {
        this.LLILLJJLI = null;
        this.LLILLL.LLILZIL = tuxSheet;
        View view = tuxSheet.getView();
        if (view != null) {
            this.LLILLL.sy(view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void CS(InterfaceC1058490deR interfaceC1058490deR) {
        this.LL.remove(interfaceC1058490deR);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void EL(InterfaceC1058490deR interfaceC1058490deR) {
        if (!this.LL.contains(interfaceC1058490deR)) {
            this.LL.add(interfaceC1058490deR);
        }
    }

    @Override // X.InterfaceC335820DEm
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        this.LLILLL.LLLFFI(tuxSheet, f);
    }

    @Override // X.InterfaceC335820DEm
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        this.LLILLL.LLLLIIIILLL(tuxSheet, i);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility, com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility
    public final void t1(int i, int i2) {
        VideoCommonShrinkAbility videoCommonShrinkAbilityBo = bo();
        if (videoCommonShrinkAbilityBo != null) {
            videoCommonShrinkAbilityBo.t1(i, i2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility, com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility
    public final void ob(float f, float f2, C20571215eY c20571215eY) {
        VideoCommonShrinkAbility videoCommonShrinkAbilityBo = bo();
        if (videoCommonShrinkAbilityBo != null) {
            videoCommonShrinkAbilityBo.ob(f, f2, c20571215eY);
        }
        Iterator<InterfaceC1058490deR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(f, f2);
        }
    }
}
