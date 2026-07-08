package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.C01GW;
import X.C06KX;
import X.C0HB9;
import X.C0RD6;
import X.C0RDX;
import X.C0RGA;
import X.C0S12;
import X.C1389300mG0;
import X.C1554610qYd;
import X.C1558420qem;
import X.C1558520qew;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C729510SjV;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CollectionCleanModeProtocol;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressMonitorAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.SubCellAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.ability.FakePlayerAbility;
import com.ss.android.ugc.aweme.story.ability.StoryGestureEducationAbility;
import com.ss.android.ugc.aweme.story.feed.guideuploadcard.ICardFakePlayerAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LongPressMonitorComponent extends BaseCellLogicComponent<LongPressMonitorComponent> implements LongPressMonitorAbility, C0RGA {
    public final C630740Ooa LLJJIJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 342));
    public final C630740Ooa LLJJIJIIJIL;
    public final C630740Ooa LLJJIJIL;
    public final C630740Ooa LLJJJ;
    public boolean LLJJJIL;
    public final C630740Ooa LLJJJJ;
    public final C630740Ooa LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressMonitorAbility
    public final LongPressMonitorComponent WA1() {
        return this;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressMonitorAbility
    public final void uI1() {
        this.LLJJJIL = false;
    }

    @Override // X.C0R8Z
    public final boolean Kh() {
        return C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this)) || C1389300mG0.LJIILJJIL(C724240Sb0.LJI(this));
    }

    public LongPressMonitorComponent() {
        C628500Oky.LIZ(new AwS555S0100000_11(this, 343));
        this.LLJJIJIIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 340));
        this.LLJJIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 341));
        this.LLJJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 345));
        this.LLJJJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 344));
        this.LLJJJJJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 346));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 339));
    }

    @Override // X.C0RGA
    public final void Lb() {
        if (Kh()) {
            this.LLJJJIL = false;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (!C0S12.LIZJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (!C729510SjV.LJJIJIIJIL(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme())) {
                    IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJJIJI.getValue();
                    if (iPlayerComponentAbility == null || iPlayerComponentAbility.uz1() != 3) {
                        return;
                    }
                    IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LLJJIJI.getValue();
                    if (iPlayerComponentAbility2 != null) {
                        C724270Sb3 c724270Sb33 = this.LLJI;
                        iPlayerComponentAbility2.Y2(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme(), false, true);
                    }
                    FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) this.LLJJIJIL.getValue();
                    if (fakePlayerAbility != null) {
                        fakePlayerAbility.D7();
                    }
                    StoryGestureEducationAbility storyGestureEducationAbility = (StoryGestureEducationAbility) this.LLJJJJ.getValue();
                    if (storyGestureEducationAbility != null) {
                        storyGestureEducationAbility.resume();
                        return;
                    }
                    return;
                }
            }
            ICardFakePlayerAbility iCardFakePlayerAbility = (ICardFakePlayerAbility) this.LLJJJ.getValue();
            if (iCardFakePlayerAbility != null) {
                iCardFakePlayerAbility.D7();
            }
        }
    }

    @Override // X.C0RGA
    public final void mf() {
        BasePostViewCell basePostViewCellBV0;
        if (Kh()) {
            this.LLJJJIL = true;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (!C0S12.LIZJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (!C729510SjV.LJJIJIIJIL(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme())) {
                    IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJJIJI.getValue();
                    if (iPlayerComponentAbility == null || iPlayerComponentAbility.uz1() != 2) {
                        return;
                    }
                    SubCellAbility subCellAbility = (SubCellAbility) this.LLJJJJJIL.getValue();
                    if (subCellAbility != null && (basePostViewCellBV0 = subCellAbility.BV0()) != null) {
                        basePostViewCellBV0.LLJLIL(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime())));
                    }
                    IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LLJJIJI.getValue();
                    if (iPlayerComponentAbility2 != null) {
                        C724270Sb3 c724270Sb33 = this.LLJI;
                        iPlayerComponentAbility2.Y2(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme(), false, true);
                    }
                    FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) this.LLJJIJIL.getValue();
                    if (fakePlayerAbility != null) {
                        fakePlayerAbility.lv();
                    }
                    StoryGestureEducationAbility storyGestureEducationAbility = (StoryGestureEducationAbility) this.LLJJJJ.getValue();
                    if (storyGestureEducationAbility != null) {
                        storyGestureEducationAbility.pause();
                        return;
                    }
                    return;
                }
            }
            ICardFakePlayerAbility iCardFakePlayerAbility = (ICardFakePlayerAbility) this.LLJJJ.getValue();
            if (iCardFakePlayerAbility != null) {
                iCardFakePlayerAbility.lv();
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onDestroy();
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLJJIJIIJIL.getValue();
        if (commonCellAbility == null || (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) {
            return;
        }
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, LongPressMonitorAbility.class, null);
        C06KX c06kx = (C06KX) this.LLJJJJLIIL.getValue();
        if (c06kx != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zLIZIZ, CollectionCleanModeProtocol.class, c06kx);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onParentSet();
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLJJIJIIJIL.getValue();
        if (commonCellAbility == null || (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) {
            return;
        }
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, LongPressMonitorAbility.class, null, null);
        jm();
        Iterator it2 = ((List) C0HB9.LIZ.getValue()).iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            ((CollectionCleanModeProtocol) next).UH0();
            if (next != null) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLIZIZ, CollectionCleanModeProtocol.class, C1697810uHb.LJIILJJIL(next));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressMonitorAbility
    public final boolean nA1() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        C0RDX.LIZJ(this, "event_on_play_progress_change", new AwS590S0100000_11(this, 128));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
