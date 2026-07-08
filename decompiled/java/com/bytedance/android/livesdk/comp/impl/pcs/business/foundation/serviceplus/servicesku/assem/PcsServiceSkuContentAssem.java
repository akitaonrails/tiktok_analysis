package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem;

import X.C019F;
import X.C01GW;
import X.C0KVU;
import X.C1158720gG6;
import X.C1161920gLG;
import X.C1166404hK;
import X.C12962055k;
import X.C13LE;
import X.C1554960qZC;
import X.C1555840qac;
import X.C1558520qew;
import X.C1637806bA;
import X.C16F5;
import X.C1782110wTZ;
import X.C1822010xVv;
import X.C1822030xVx;
import X.C1822060xW0;
import X.C1826730xdX;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C452501pT;
import X.C500260Jjc;
import X.C517520KRi;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC1785280wYg;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1822080xW2;
import X.InterfaceC2217461Bqa;
import X.InterfaceC517590KRp;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.viewmodel.PcsServiceSkuVM;
import com.bytedance.android.livesdk.livesetting.pcs.PcsCalendlyBookingFaq;
import com.bytedance.android.livesdk.livesetting.pcs.PcsCoursePageFaqSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionFAQSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.ThirdPartyLinkDisplayInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceSkuContentAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public LiveIconView LLIZLLLIL;
    public LiveIconView LLJ;
    public View LLJI;
    public C16F5 LLJIJIL;
    public LiveIconView LLJILJIL;
    public C16F5 LLJILJILJ;
    public LinearLayout LLJILLL;
    public View LLJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public C1555840qac LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceSkuContentAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicesku/viewmodel/PcsServiceSkuVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServiceSkuContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceSkuVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12962055k(c19719912DlLIZ), new C1822060xW0(), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new C1822030xVx(this));
    }

    public final LiveIconView Ho() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.bnb) : null;
            this.LLIZLLLIL = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final LinearLayout Jo() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dj2) : null;
            this.LLJILLL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final LiveIconView Lo() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dj3) : null;
            this.LLJILJIL = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final C16F5 No() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dj5) : null;
            this.LLJILJILJ = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final LiveIconView So() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.t24) : null;
            this.LLJ = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final C1555840qac Vo() {
        if (this.LLJJIJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1555840qac.class, null);
            this.LLJJIJI = interfaceC1555100qZQLIZIZ != null ? (C1555840qac) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJI;
    }

    public final PcsServiceSkuVM Zo() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (PcsServiceSkuVM) assemVMLazy.getValue();
    }

    public final InterfaceC1822080xW2 Go() {
        FragmentManager childFragmentManager;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Fragment fragmentLJJJJZ = (fragmentLJI == null || (childFragmentManager = fragmentLJI.getChildFragmentManager()) == null) ? null : childFragmentManager.LJJJJZ(R.id.vga);
        if (fragmentLJJJJZ instanceof InterfaceC1822080xW2) {
            return (InterfaceC1822080xW2) fragmentLJJJJZ;
        }
        return null;
    }

    public final Map<String, String> Oo() {
        C1822010xVv c1822010xVv;
        C1555840qac c1555840qacVo = Vo();
        return (c1555840qacVo == null || (c1822010xVv = c1555840qacVo.LL) == null) ? new LinkedHashMap() : C2097608Jq.LJIIJ(new Pair("is_service_plus_revamp", "1"), new Pair("is_anchor", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c1822010xVv.LIZ())) ? 1 : 0)), new Pair("is_single_sku", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c1822010xVv.LJ)) ? 1 : 0)));
    }

    public final void ap() {
        C1822010xVv c1822010xVv;
        EnumC1785280wYg enumC1785280wYg;
        C1555840qac c1555840qacVo = Vo();
        if (c1555840qacVo == null || (c1822010xVv = c1555840qacVo.LL) == null || (enumC1785280wYg = c1822010xVv.LIZ) == null) {
            return;
        }
        int i = C1782110wTZ.LIZ[enumC1785280wYg.ordinal()];
        if (i == 1) {
            bp();
            return;
        }
        if (i == 2) {
            bp();
            return;
        }
        if (i == 3) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), PcsCoursePageFaqSetting.INSTANCE.getValue().getCourseDetailFaq());
        } else if (i == 4) {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(getContext(), PcsCalendlyBookingFaq.INSTANCE.getValue(), new Bundle());
        } else if (i == 5) {
            bp();
        }
    }

    public final void bp() {
        InterfaceC1822080xW2 interfaceC1822080xW2Go = Go();
        if (interfaceC1822080xW2Go != null) {
            interfaceC1822080xW2Go.yI();
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), LiveSubscriptionFAQSetting.INSTANCE.getValue().getSmbDisclaimerUseCaution("service_plus_audience_page"));
    }

    public final boolean cp() {
        C1822010xVv c1822010xVv;
        EnumC1785280wYg enumC1785280wYg;
        C1555840qac c1555840qacVo;
        C1822010xVv c1822010xVv2;
        C1555840qac c1555840qacVo2 = Vo();
        if (c1555840qacVo2 != null && (c1822010xVv = c1555840qacVo2.LL) != null && (enumC1785280wYg = c1822010xVv.LIZ) != null) {
            if (enumC1785280wYg == EnumC1785280wYg.DM) {
                return true;
            }
            if (enumC1785280wYg == EnumC1785280wYg.FORM && ((c1555840qacVo = Vo()) == null || (c1822010xVv2 = c1555840qacVo.LL) == null || !c1822010xVv2.LIZIZ())) {
                return true;
            }
        }
        return false;
    }

    public final void dp() {
        User owner;
        C1822010xVv c1822010xVv;
        EnumC1785280wYg enumC1785280wYg;
        String serviceSkuTitle;
        SMBPreviewResponse.ResponseData responseData;
        ThirdPartyLinkDisplayInfo thirdPartyLinkDisplayInfo;
        SMBPreviewResponse.ResponseData responseData2;
        LiveIconView liveIconViewHo;
        C1822010xVv c1822010xVv2;
        if (Zo().getState().LLILLJJLI.getValue() != null && (liveIconViewHo = Ho()) != null) {
            C1555840qac c1555840qacVo = Vo();
            C786410Ut5.LLJJIJIL(liveIconViewHo, (c1555840qacVo == null || (c1822010xVv2 = c1555840qacVo.LL) == null || !c1822010xVv2.LIZJ || ((Boolean) Zo().getState().LLILLL.getValue()).booleanValue()) ? 8 : 0);
        }
        C1158720gG6 c1158720gG6 = (C1158720gG6) Zo().getState().LLILLJJLI.getValue();
        if (c1158720gG6 == null || (responseData2 = c1158720gG6.LIZ) == null || (owner = responseData2.anchorData) == null) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            owner = room != null ? room.getOwner() : null;
        }
        String strLIZ = C0KVU.LIZ(owner);
        C1158720gG6 c1158720gG62 = (C1158720gG6) Zo().getState().LLILLJJLI.getValue();
        String str = (c1158720gG62 == null || (responseData = c1158720gG62.LIZ) == null || (thirdPartyLinkDisplayInfo = responseData.thirdPartyLinkInfo) == null) ? null : thirdPartyLinkDisplayInfo.platformName;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C1166404hK c1166404hK = new C1166404hK(str);
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.title) : null;
            this.LLJIJIL = (C16F5) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (textView != null) {
            C1555840qac c1555840qacVo2 = Vo();
            if (c1555840qacVo2 != null && (c1822010xVv = c1555840qacVo2.LL) != null && (enumC1785280wYg = c1822010xVv.LIZ) != null && (serviceSkuTitle = enumC1785280wYg.getServiceSkuTitle(strLIZ, c1166404hK)) != null) {
                str2 = serviceSkuTitle;
            }
            textView.setText(str2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Fragment fragmentLJI;
        if (cp() && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
            int iHashCode = fragmentLJI.hashCode();
            InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
            if (interfaceC517590KRpLIZJ != null) {
                interfaceC517590KRpLIZJ.LJIIJJI(new C517520KRi(iHashCode, Oo()));
            }
        }
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[PHI: r1
      0x0077: PHI (r1v5 android.view.View) = (r1v4 android.view.View), (r1v15 android.view.View) binds: [B:14:0x0064, B:19:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.PcsServiceSkuContentAssem.onViewCreated(android.view.View):void");
    }
}
