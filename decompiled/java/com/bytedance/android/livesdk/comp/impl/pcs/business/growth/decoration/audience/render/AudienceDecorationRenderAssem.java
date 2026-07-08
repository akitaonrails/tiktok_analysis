package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.render;

import X.C019F;
import X.C01GW;
import X.C1092090eWd;
import X.C1092220eWq;
import X.C1145200fuI;
import X.C1145210fuJ;
import X.C1145240fuM;
import X.C1145330fuV;
import X.C1145410fud;
import X.C1161920gLG;
import X.C12964055m;
import X.C12965055n;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C500260Jjc;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1083620eIy;
import X.InterfaceC2217461Bqa;
import X.InterfaceC390601fU;
import android.view.View;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.audiencerender.AudienceDecorationRoomExitEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.AudienceDecorationDataViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class AudienceDecorationRenderAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AudienceDecorationRenderAssem.class, "decorationActionViewModel", "getDecorationActionViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/audience/AudienceDecorationDataViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AudienceDecorationRenderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AudienceDecorationDataViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12964055m(c19719912DlLIZ), new C1145330fuV(), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1145200fuI.class, null), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(new C12965055n(this));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1145200fuI Go() {
        return (C1145200fuI) this.LLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C20441214yg.LIZIZ("pcs_audience_decoration", "AudienceDecorationRenderAssem onDestroy");
        C1092090eWd c1092090eWd = (C1092090eWd) this.LLJI.getValue();
        c1092090eWd.LLJIJIL.removeCallbacks(c1092090eWd.LLJILJILJ);
        ((ArrayList) c1092090eWd.LLJILJIL).clear();
        ArrayList<View> arrayList = new ArrayList();
        int childCount = c1092090eWd.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c1092090eWd.getChildAt(i);
            if (childAt instanceof C1092220eWq) {
                arrayList.add(childAt);
            }
        }
        if (!arrayList.isEmpty()) {
            for (View view : arrayList) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1092090eWd, view);
                c1092090eWd.removeView(view);
            }
            ((ArrayList) c1092090eWd.LLJI.LIZJ).clear();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearAllBoardViews removed=");
            sbLIZ.append(arrayList.size());
            C20441214yg.LIZIZ("LiveBoardsTipView", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1145410fud.LIZIZ(Go().LL, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C20441214yg.LIZIZ("pcs_audience_decoration", "AudienceDecorationRenderAssem onPause");
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C20441214yg.LIZIZ("pcs_audience_decoration", "AudienceDecorationRenderAssem onResume");
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C20441214yg.LIZIZ("pcs_audience_decoration", "AudienceDecorationRenderAssem onStart");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        ((C1092090eWd) this.LLJI.getValue()).setLifecycleOwner(this);
        ((C1092090eWd) this.LLJI.getValue()).setDataChannel(Go().LLILLL);
        ((C1092090eWd) this.LLJI.getValue()).setAudienceRenderRoomId(Go().LL);
        DataChannel dataChannel = Go().LLILLL;
        if (dataChannel == null) {
            return;
        }
        dataChannel.BQ2(this, AudienceDecorationRoomExitEvent.class, new C1145240fuM(this));
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        if (Go().LLILLJJLI == EnumC1083620eIy.PREVIEW_CARD) {
            str = "preview_card";
        } else {
            str = "audience";
        }
        InterfaceC390601fU effectBoardService = iEffectService.getEffectBoardService(str, String.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)));
        if (effectBoardService != null) {
            getContext();
            effectBoardService.LIZ(dataChannel);
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0fuN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1145340fuW) obj).LL;
            }
        }, null, new C1145210fuJ(this), 6);
    }
}
