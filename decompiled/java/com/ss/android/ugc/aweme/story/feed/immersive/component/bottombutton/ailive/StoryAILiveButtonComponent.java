package com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.ailive;

import X.C01GW;
import X.C1399270mW5;
import X.C13LE;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C724270Sb3;
import X.C735370Ssx;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1399260mW4;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryAILiveButtonComponent extends BaseCellSlotComponent<StoryAILiveButtonComponent> {
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 737));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(394));
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(172));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fd7;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 738);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_standard_button", true, awS555S0100000_11);
    }

    public final IAILiveService Ep() {
        return (IAILiveService) this.LLJZ.getValue();
    }

    public final void Fp(String str) {
        Object obj;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("entrance_type", "AI_LIVE_PHOTO");
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(((VideoItemParams) obj).getAweme()));
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0S8Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, null, new AwS625S0100000_11(this, 55), 6);
        C1399270mW5 c1399270mW5 = (C1399270mW5) view.findViewById(R.id.d6g);
        C1399270mW5.LJJLIIIIJ(c1399270mW5, EnumC1399260mW4.AI_LIVE);
        C786410Ut5.I7(new AbS701S0100000_21(this, 10, 42), c1399270mW5);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
