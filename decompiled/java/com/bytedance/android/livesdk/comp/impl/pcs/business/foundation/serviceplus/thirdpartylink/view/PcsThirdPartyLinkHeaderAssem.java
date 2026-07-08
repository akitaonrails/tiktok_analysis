package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view;

import X.C019F;
import X.C0HTI;
import X.C1217650hn9;
import X.C1322090kVb;
import X.C13LE;
import X.C1637806bA;
import X.C16F5;
import X.C1821710xVR;
import X.C1821790xVZ;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkHeaderAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.viewmodel.PcsThirdPartyLinkVm;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsThirdPartyLinkHeaderAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public C16F5 LLJJIII;
    public C16F5 LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsThirdPartyLinkHeaderAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/thirdpartylink/viewmodel/PcsThirdPartyLinkVm;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsThirdPartyLinkHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsThirdPartyLinkVm.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217650hn9(c19719912DlLIZ), new C1821790xVZ(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fza;
    }

    public final PcsThirdPartyLinkVm ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (PcsThirdPartyLinkVm) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (C16F5) view.findViewById(R.id.jkv);
        this.LLJJIJI = (C16F5) view.findViewById(R.id.jko);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.jjz);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0xce
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C1821500xV6.LIZIZ("click", "more_option", false, this.LL.ip().wQ2());
                    PcsThirdPartyLinkHeaderAssem pcsThirdPartyLinkHeaderAssem = this.LL;
                    pcsThirdPartyLinkHeaderAssem.getClass();
                    Context context = view2.getContext();
                    C443090HZb[] c443090HZbArr = new C443090HZb[2];
                    String strLJIJI = C497740JfY.LJIJI(2131856140);
                    if (strLJIJI == null) {
                        strLJIJI = "Refresh";
                    }
                    c443090HZbArr[0] = new C443090HZb(strLJIJI, new C1821730xVT(pcsThirdPartyLinkHeaderAssem), 0, new C1821910xVl(pcsThirdPartyLinkHeaderAssem), 0, null, 0, false, false, null, 1012);
                    String strLJIJI2 = C497740JfY.LJIJI(2131856141);
                    if (strLJIJI2 == null) {
                        strLJIJI2 = "Report";
                    }
                    c443090HZbArr[1] = new C443090HZb(strLJIJI2, new C1821720xVS(pcsThirdPartyLinkHeaderAssem, context), 0, new C1821920xVm(pcsThirdPartyLinkHeaderAssem), 0, null, 0, false, false, null, 1012);
                    List listLJIIJJI = C1697810uHb.LJIIJJI(c443090HZbArr);
                    C0HWQ c0hwq = new C0HWQ(context);
                    c0hwq.LJIIL(Collections.singletonList(listLJIIJJI));
                    c0hwq.LLILZLL = (ViewGroup) view2.getRootView();
                    C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
                    c1391600mJi.LIZIZ = view2;
                    c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                    c1391600mJi.LJIIL = false;
                    c0hwq.LIZIZ().show();
                }
            });
        }
        C500260Jjc.LJIILIIL(LJJIJL());
        C1322090kVb c1322090kVb = (C1322090kVb) view.findViewById(R.id.g81);
        if (c1322090kVb != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.f8l;
            c1322090kVb.setImageDrawable(c0hti.LIZ(view.getContext()));
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0xVY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1821680xVO) obj).LLILLJJLI;
            }
        }, null, new C1821710xVR(this), 6);
    }

    public static LiveIconView hp(int i, LinearLayout linearLayout) {
        LiveIconView liveIconView = new LiveIconView(linearLayout.getContext(), null);
        C786410Ut5.w6(liveIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        liveIconView.setIconAttr(i);
        return liveIconView;
    }
}
