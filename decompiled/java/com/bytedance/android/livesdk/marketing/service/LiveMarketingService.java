package com.bytedance.android.livesdk.marketing.service;

import X.AbstractC1115900f92;
import X.C0KAJ;
import X.C1097740efk;
import X.C1097770efn;
import X.C1102070emj;
import X.C1102080emk;
import X.C1102420enI;
import X.C1115820f8u;
import X.C1115830f8v;
import X.C1115850f8x;
import X.C1115920f94;
import X.C1115940f96;
import X.C1115970f99;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C519360KYk;
import X.C916790Zxt;
import X.EnumC1115840f8w;
import X.EnumC1115870f8z;
import X.InterfaceC1102120emo;
import X.InterfaceC1115910f93;
import X.InterfaceC1115950f97;
import android.view.View;
import com.bytedance.android.live.marketing.service.ILiveMarketingService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMarketingComponentSetting;
import com.bytedance.android.livesdk.marketing.service.LiveMarketingController;
import com.bytedance.android.livesdk.marketing.ui.LiveMarketingWidget;
import com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class LiveMarketingService implements ILiveMarketingService {
    public final Map<EnumC1115870f8z, InterfaceC1115950f97> LL = new LinkedHashMap();

    @Override // com.bytedance.android.live.marketing.service.ILiveMarketingService
    public final boolean Iq() {
        C1097740efk c1097740efk;
        Iterable<C1102080emk> iterable;
        LiveMarketingController.LL.getClass();
        if (C916790Zxt.LIZ(14)) {
            C1102070emj c1102070emj = C1102070emj.LIZ;
            C1115920f94 c1115920f94 = LiveMarketingController.LLILLJJLI;
            DataChannel dataChannel = c1115920f94 != null ? c1115920f94.LJ : null;
            c1102070emj.getClass();
            if (dataChannel == null || (c1097740efk = (C1097740efk) ((LinkedHashMap) C1102070emj.LJ).get(dataChannel)) == null) {
                return false;
            }
            if (C1097770efn.LL.LJII(dataChannel, c1097740efk.LJIIIIZZ(14, 0)) != null && (!r0.isEmpty())) {
                return true;
            }
            if (!c1097740efk.LJIIIZ(14, 0) || (iterable = (Iterable) ((LinkedHashMap) C1102070emj.LIZJ).get(dataChannel)) == null) {
                return false;
            }
            long jLJFF = c1097740efk.LJFF(14, 0);
            for (C1102080emk c1102080emk : iterable) {
                if (c1097740efk.LJI(c1102080emk.LIZ) <= jLJFF && (c1102080emk.LJJII() || c1102080emk.LJIILLIIL)) {
                    return true;
                }
            }
            return false;
        }
        IBusinessAvoidanceService iBusinessAvoidanceService = (IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class);
        C1115820f8u c1115820f8u = LiveMarketingController.LLJIJIL;
        C1115920f94 c1115920f942 = LiveMarketingController.LLILLJJLI;
        if (iBusinessAvoidanceService.qD0(c1115820f8u, c1115920f942 != null ? c1115920f942.LJ : null).LIZ) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.marketing.service.ILiveMarketingService
    public final boolean Ot() {
        LiveMarketingController.LL.getClass();
        HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
        C1115920f94 c1115920f94 = LiveMarketingController.LLILLJJLI;
        return C1102420enI.LIZLLL(14, c1115920f94 != null ? c1115920f94.LJ : null, "watch", false, false).LIZ;
    }

    @Override // com.bytedance.android.live.marketing.service.ILiveMarketingService
    public final EnumC1115870f8z hc() {
        AbstractC1115900f92 abstractC1115900f92;
        LiveMarketingController.LL.getClass();
        InterfaceC1115910f93 interfaceC1115910f93LIZ = LiveMarketingController.LIZ();
        if (interfaceC1115910f93LIZ == null || !interfaceC1115910f93LIZ.isShowing() || (abstractC1115900f92 = LiveMarketingController.LLIZ) == null) {
            return null;
        }
        return abstractC1115900f92.LIZ();
    }

    @Override // com.bytedance.android.live.marketing.service.ILiveMarketingService
    public final boolean isAvailable() {
        return LiveMarketingComponentSetting.enable();
    }

    @Override // com.bytedance.android.live.marketing.service.ILiveMarketingService
    public final Class<? extends LiveRecyclableWidget> F31() {
        return LiveMarketingWidget.class;
    }

    @Override // com.bytedance.android.live.marketing.service.ILiveMarketingService
    public final Map<EnumC1115870f8z, InterfaceC1115950f97> xH1() {
        return this.LL;
    }

    @Override // com.bytedance.android.live.marketing.service.ILiveMarketingService
    public final void g81(EnumC1115870f8z enumC1115870f8z, InterfaceC1115950f97 interfaceC1115950f97) {
        this.LL.put(enumC1115870f8z, interfaceC1115950f97);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0f8v] */
    @Override // com.bytedance.android.live.marketing.service.ILiveMarketingService
    public final C1115970f99 t5(EnumC1115870f8z enumC1115870f8z, C1115940f96 c1115940f96, long j) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        EnumC1115870f8z enumC1115870f8zLIZ;
        DataChannel dataChannel3;
        DataChannel dataChannel4;
        DataChannel dataChannel5;
        DataChannel dataChannel6;
        DataChannel dataChannel7;
        LiveMarketingController liveMarketingController = LiveMarketingController.LL;
        liveMarketingController.getClass();
        HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
        C1115920f94 c1115920f94 = LiveMarketingController.LLILLJJLI;
        EnumC1115840f8w enumC1115840f8w = null;
        if (c1115920f94 != null) {
            dataChannel = c1115920f94.LJ;
        } else {
            dataChannel = null;
        }
        if (!C1102420enI.LIZLLL(14, dataChannel, "watch", false, false).LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Show failed due to ");
            EnumC1115840f8w enumC1115840f8w2 = EnumC1115840f8w.FREQUENCY;
            sbLIZ.append(enumC1115840f8w2);
            C20441214yg.LIZIZ("LiveMarketingController", C2188811AlT.LIZIZ(sbLIZ));
            return new C1115970f99(false, enumC1115840f8w2);
        }
        AbstractC1115900f92 abstractC1115900f92 = LiveMarketingController.LLIZ;
        if (abstractC1115900f92 != null && enumC1115870f8z.ordinal() >= abstractC1115900f92.LIZ().ordinal()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Show failed due to ");
            EnumC1115840f8w enumC1115840f8w3 = EnumC1115840f8w.BUSINESS_PRIORITY;
            sbLIZ2.append(enumC1115840f8w3);
            C20441214yg.LIZIZ("LiveMarketingController", C2188811AlT.LIZIZ(sbLIZ2));
            return new C1115970f99(false, enumC1115840f8w3);
        }
        AbstractC1115900f92 abstractC1115900f922 = (AbstractC1115900f92) ((LinkedHashMap) LiveMarketingController.LLILZLL).get(enumC1115870f8z);
        if (abstractC1115900f922 == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Show failed due to ");
            EnumC1115840f8w enumC1115840f8w4 = EnumC1115840f8w.NO_BEHAVIOR;
            sbLIZ3.append(enumC1115840f8w4);
            C20441214yg.LIZIZ("LiveMarketingController", C2188811AlT.LIZIZ(sbLIZ3));
            return new C1115970f99(false, enumC1115840f8w4);
        }
        C1115830f8v c1115830f8v = LiveMarketingController.LLJ;
        if (c1115830f8v != null) {
            C1102070emj c1102070emj = C1102070emj.LIZ;
            C1115920f94 c1115920f942 = LiveMarketingController.LLILLJJLI;
            if (c1115920f942 != null) {
                dataChannel7 = c1115920f942.LJ;
            } else {
                dataChannel7 = null;
            }
            C1102070emj.LJIILJJIL(c1102070emj, dataChannel7, liveMarketingController, c1115830f8v, C0KAJ.AUTO_TERMINATE, null, null, 112);
        }
        LiveMarketingController.LLIZ = abstractC1115900f922;
        LiveMarketingController.LLIZLLLIL = new C1115850f8x(enumC1115870f8z, c1115940f96, j);
        LiveMarketingController.LLJ = new InterfaceC1102120emo(enumC1115870f8z) { // from class: X.0f8v
            public final EnumC1115870f8z LIZ;
            public final long LIZIZ = C963140bAe.LIZIZ();
            public final String LIZJ = UUID.randomUUID().toString();

            @Override // X.InterfaceC1102120emo
            public final String LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC1102120emo
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1102120emo
            public final boolean LJ() {
                return true;
            }

            @Override // X.InterfaceC1102120emo
            public final boolean LJFF() {
                return true;
            }

            @Override // X.InterfaceC1102120emo
            public final void LJI() {
            }

            @Override // X.InterfaceC1102120emo
            public final boolean LJIIIIZZ() {
                return true;
            }

            @Override // X.InterfaceC1102120emo
            public final boolean LJIIJJI() {
                return true;
            }

            @Override // X.InterfaceC1102120emo
            public final Boolean LJIIL() {
                return null;
            }

            @Override // X.InterfaceC1102120emo
            public final boolean LJIILIIL() {
                return true;
            }

            @Override // X.InterfaceC1102120emo
            public final String LJJJ() {
                return null;
            }

            @Override // X.InterfaceC1102120emo
            public final Map<String, String> getExtras() {
                return null;
            }

            @Override // X.InterfaceC1102120emo
            public final C1099880ejC LJIIIZ() {
                LiveMarketingController.LL.getClass();
                InterfaceC1115910f93 interfaceC1115910f93LIZ = LiveMarketingController.LIZ();
                return new C1099880ejC(interfaceC1115910f93LIZ != null ? interfaceC1115910f93LIZ.LJJII() : false);
            }

            @Override // X.InterfaceC1102120emo
            public final View LJIILJJIL() {
                LiveMarketingController.LL.getClass();
                InterfaceC1115910f93 interfaceC1115910f93LIZ = LiveMarketingController.LIZ();
                if (interfaceC1115910f93LIZ != null) {
                    return interfaceC1115910f93LIZ.LJIILJJIL();
                }
                return null;
            }

            @Override // X.InterfaceC1102120emo
            public final String getBusinessName() {
                return this.LIZ.getBizType();
            }

            @Override // X.InterfaceC1102120emo
            public final EnumC245600xC LIZLLL() {
                return C245700xD.LIZ(this);
            }

            @Override // X.InterfaceC1102120emo
            public final int getComponentType() {
                return ((LiveMarketingController) LJII()).getComponentType();
            }

            @Override // X.InterfaceC1102120emo
            public final InterfaceC1102150emr LJII() {
                return LiveMarketingController.LL;
            }

            @Override // X.InterfaceC1102120emo
            public final long LJIIJ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1102120emo
            public final String getId() {
                return this.LIZJ;
            }

            {
                this.LIZ = enumC1115870f8z;
            }
        };
        C1102070emj c1102070emj2 = C1102070emj.LIZ;
        C1115920f94 c1115920f943 = LiveMarketingController.LLILLJJLI;
        if (c1115920f943 != null) {
            dataChannel2 = c1115920f943.LJ;
        } else {
            dataChannel2 = null;
        }
        C1115830f8v c1115830f8v2 = LiveMarketingController.LLJ;
        c1102070emj2.getClass();
        C1102070emj.LJJIII(dataChannel2, liveMarketingController, c1115830f8v2);
        LiveMarketingController.LLILZIL.removeCallbacksAndMessages(null);
        InterfaceC1115910f93 interfaceC1115910f93LIZ = LiveMarketingController.LIZ();
        if (interfaceC1115910f93LIZ != null) {
            interfaceC1115910f93LIZ.LLLLILI(c1115940f96);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Bind behavior, business: ");
        AbstractC1115900f92 abstractC1115900f923 = LiveMarketingController.LLIZ;
        if (abstractC1115900f923 != null) {
            enumC1115870f8zLIZ = abstractC1115900f923.LIZ();
        } else {
            enumC1115870f8zLIZ = null;
        }
        sbLIZ4.append(enumC1115870f8zLIZ);
        C20441214yg.LIZIZ("LiveMarketingController", C2188811AlT.LIZIZ(sbLIZ4));
        AbstractC1115900f92 abstractC1115900f924 = LiveMarketingController.LLIZ;
        if (abstractC1115900f924 != null) {
            abstractC1115900f924.LIZJ();
        }
        C1115920f94 c1115920f944 = LiveMarketingController.LLILLJJLI;
        if (c1115920f944 != null) {
            dataChannel3 = c1115920f944.LJ;
        } else {
            dataChannel3 = null;
        }
        boolean zLJJI = c1102070emj2.LJJI(dataChannel3, liveMarketingController, LiveMarketingController.LLJ, null);
        if (!C916790Zxt.LIZ(14)) {
            IBusinessAvoidanceService iBusinessAvoidanceService = (IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class);
            C1115820f8u c1115820f8u = LiveMarketingController.LLJIJIL;
            C1115920f94 c1115920f945 = LiveMarketingController.LLILLJJLI;
            if (c1115920f945 != null) {
                dataChannel4 = c1115920f945.LJ;
            } else {
                dataChannel4 = null;
            }
            C519360KYk c519360KYkQD0 = iBusinessAvoidanceService.qD0(c1115820f8u, dataChannel4);
            zLJJI = c519360KYkQD0.LIZ;
            if (zLJJI) {
                LiveMarketingController.LIZLLL();
                C1115920f94 c1115920f946 = LiveMarketingController.LLILLJJLI;
                if (c1115920f946 != null) {
                    dataChannel6 = c1115920f946.LJ;
                } else {
                    dataChannel6 = null;
                }
                c1102070emj2.LJIIJ(dataChannel6, liveMarketingController, LiveMarketingController.LLJ, null);
            } else {
                String str = c519360KYkQD0.LIZIZ;
                if (str == null) {
                    str = "";
                }
                liveMarketingController.LJ(false, null, Collections.singletonList(str));
                C1115920f94 c1115920f947 = LiveMarketingController.LLILLJJLI;
                if (c1115920f947 != null) {
                    dataChannel5 = c1115920f947.LJ;
                } else {
                    dataChannel5 = null;
                }
                C1102070emj.LJIJI(c1102070emj2, dataChannel5, liveMarketingController, LiveMarketingController.LLJ, c1115820f8u);
            }
        }
        if (!zLJJI) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Show failed due to ");
            sbLIZ5.append(EnumC1115840f8w.CONFLICT);
            C20441214yg.LIZIZ("LiveMarketingController", C2188811AlT.LIZIZ(sbLIZ5));
        }
        if (!zLJJI) {
            enumC1115840f8w = EnumC1115840f8w.CONFLICT;
        }
        return new C1115970f99(zLJJI, enumC1115840f8w);
    }
}
