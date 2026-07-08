package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center;

import X.AbstractC1146450fwJ;
import X.AbstractC2238408pq;
import X.C096600Ya;
import X.C096700Yb;
import X.C096800Yc;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0PEM;
import X.C1104530eqh;
import X.C1128450fTH;
import X.C1133610fbb;
import X.C1133640fbe;
import X.C1133650fbf;
import X.C1146120fvm;
import X.C1146350fw9;
import X.C1146360fwA;
import X.C1146380fwC;
import X.C1146400fwE;
import X.C1146420fwG;
import X.C1146430fwH;
import X.C1146440fwI;
import X.C1146460fwK;
import X.C1146530fwR;
import X.C1146600fwY;
import X.C1161920gLG;
import X.C11S5;
import X.C13LP;
import X.C15438062q;
import X.C1559260qg8;
import X.C158B;
import X.C1687430u0r;
import X.C1701940uOG;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2252611DEt;
import X.C23250099c;
import X.C389001fE;
import X.C480460Ism;
import X.C491101vh;
import X.EnumC1146490fwN;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1665500tRU;
import X.InterfaceC497601wk;
import Y.AfS6S0100100_17;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.gift.event.LiveSendRedEnvelopeEvent;
import com.bytedance.android.livesdk.gift.model.GiftActivityCreator;
import com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse;
import com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator;
import com.bytedance.android.livesdk.gift.model.GiftStructByCreator;
import com.bytedance.android.livesdk.gift.model.GiftStructByCreatorSchemeInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftAnchorListCacheSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import jkp.j;
import kotlin.jvm.internal.AwS114S0400000_17;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS51S0100100_17;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelGiftPageCenterViewModel extends AssemViewModel<C1146530fwR> {
    public final String LL = "GiftAnchorPanelCenterViewModel";
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1146120fvm.class, (Class<Object>) null, (String) 13), true);
    public boolean LLILLL;
    public volatile boolean LLILZ;
    public volatile IGiftAnchorPanelGiftPageScrollAbility LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1146530fwR(C491101vh.LIZ, new C1146430fwH(null, j.LLILLL, EnumC1146490fwN.INIT_WITH_SELECT), new C1146600fwY(this), false);
    }

    public final C096600Ya vQ2() {
        long id = zQ2().LL.getId();
        boolean z = !C1128450fTH.LJJIJIIJIL();
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        return new C096600Ya(id, z, iGiftService != null ? iGiftService.getESVersion() : null);
    }

    public final void wQ2() {
        if (!LiveGiftAnchorListCacheSetting.INSTANCE.enable()) {
            xQ2(false);
            return;
        }
        C096600Ya c096600YaVQ2 = vQ2();
        C096700Yb c096700YbLIZ = C096800Yc.LIZ(c096600YaVQ2, C158B.LIZJ());
        if (c096700YbLIZ == null) {
            xQ2(true);
            return;
        }
        if (this.LLILLL) {
            C20441214yg.LJ(this.LL, "ignore duplicate requesting (cache-hit path)");
            return;
        }
        this.LLILLL = true;
        GiftActivityCreator giftActivityCreator = c096700YbLIZ.LIZIZ.activity;
        Long lValueOf = giftActivityCreator != null ? Long.valueOf(giftActivityCreator.eventId) : null;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C23250099c.LIZLLL(viewModelScope, abstractC2238408pq, null, new C1146420fwG(this, c096700YbLIZ, null), 2);
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), abstractC2238408pq, null, new C1146380fwC(this, lValueOf, c096600YaVQ2, null), 2);
    }

    public final C1146120fvm zQ2() {
        return (C1146120fvm) this.LLILLJJLI.getValue();
    }

    public final void FQ2() {
        C1146350fw9 c1146350fw9LIZIZ = C1146440fwI.LIZIZ(getState().LLILLJJLI);
        if (c1146350fw9LIZIZ == null || c1146350fw9LIZIZ.LLJILJILJ == null) {
            return;
        }
        EQ2(c1146350fw9LIZIZ.LL, c1146350fw9LIZIZ.LLJILJILJ.longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ2(X.C262100zr r27) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel.AQ2(X.00zr):void");
    }

    public final Object BQ2(InterfaceC1364105Vn<? super GiftListByCreatorResponse.Data> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        long jUptimeMillis = SystemClock.uptimeMillis();
        String eSVersion = null;
        C1133640fbe.LJIIL(5, null, null, null, 14);
        C480460Ism.LIZ().getClass();
        GiftRetrofitApi giftRetrofitApi = (GiftRetrofitApi) C480460Ism.LIZIZ(GiftRetrofitApi.class);
        String strValueOf = String.valueOf(zQ2().LL.getId());
        boolean zLJJIJIIJIL = true ^ C1128450fTH.LJJIJIIJIL();
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        if (iGiftService != null) {
            eSVersion = iGiftService.getESVersion();
        }
        giftRetrofitApi.syncAnchorGiftList(strValueOf, 3, zLJJIJIIJIL, eSVersion).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS6S0100100_17(jUptimeMillis, c2252611DEt, 1), new AfS6S0100100_17(jUptimeMillis, c2252611DEt, 2));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc A[PHI: r3
      0x00bc: PHI (r3v3 com.bytedance.android.livesdk.gift.model.GiftPageByCreator) = 
      (r3v2 com.bytedance.android.livesdk.gift.model.GiftPageByCreator)
      (r3v21 com.bytedance.android.livesdk.gift.model.GiftPageByCreator)
     binds: [B:31:0x0091, B:43:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1146430fwH DQ2(com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse.Data r45) {
        /*
            Method dump skipped, instruction units count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel.DQ2(com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse$Data):X.0fwH");
    }

    public final void xQ2(boolean z) {
        if (this.LLILLL) {
            C20441214yg.LJ(this.LL, "ignore duplicate requesting");
            return;
        }
        this.LLILLL = true;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C1146400fwE(this, z, null), 2);
    }

    public static void EQ2(long j, long j2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gift_id", j);
        jSONObject.put("event_id", j2);
        C389001fE.LIZ("show_gift_selected_view_by_creator", jSONObject, System.currentTimeMillis(), false);
    }

    public static String yQ2(boolean z, Integer num) {
        if (num != null) {
            if (num.intValue() == 28) {
                if (z) {
                    return "eligible_locked";
                }
                return "eligible_omitted";
            }
            if (num.intValue() == 29) {
                if (z) {
                    return "eligible_unlocked";
                }
                return "eligible_omitted";
            }
            return "no_gift";
        }
        return "no_gift";
    }

    public final void GQ2(long j, Long l) {
        Long l2;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        C1146430fwH c1146430fwH = getState().LLILLJJLI;
        C1146350fw9 c1146350fw9LIZ = C1146440fwI.LIZ(c1146430fwH, new AwS51S0100100_17(j, l, 0));
        if (c1146350fw9LIZ == null) {
            C20441214yg.LJ(this.LL, "cannot find item to select, sth must be wrong!");
            return;
        }
        boolean z2 = false;
        if (c1146350fw9LIZ.LLILLJJLI == 3) {
            ImageModel imageModel = c1146350fw9LIZ.LLIZLLLIL;
            if (imageModel != null && !TextUtils.isEmpty(imageModel.getUri())) {
                z = true;
            } else {
                z = false;
            }
            GiftPanelCardletByCreator giftPanelCardletByCreator = (GiftPanelCardletByCreator) C13LP.LJJJLZIJ(0, c1146350fw9LIZ.LLJ);
            if (giftPanelCardletByCreator != null && (str4 = giftPanelCardletByCreator.schemaUrl) != null && a0.LJJIIZI(str4, "webcast_super_fan_box_send_panel", false)) {
                str = "superfan_box";
            } else {
                str = "treasure_box";
            }
            DataChannel dataChannel = zQ2().LLILLJJLI;
            if (dataChannel != null) {
                if (z) {
                    str2 = "portal";
                } else {
                    str2 = "";
                }
                if (z) {
                    str3 = "label";
                } else {
                    str3 = "normal";
                }
                dataChannel.LC0(LiveSendRedEnvelopeEvent.class, new C1104530eqh("gift", str2, str3, str, null, 32));
                return;
            }
            return;
        }
        C1146350fw9 c1146350fw9LIZIZ = C1146440fwI.LIZIZ(c1146430fwH);
        if (c1146350fw9LIZIZ != null && c1146350fw9LIZIZ.areItemTheSame(c1146350fw9LIZ)) {
            z2 = true;
            setState(new AwS226S0300000_17(c1146350fw9LIZ, this, c1146430fwH, 4));
        } else {
            setState(new AwS114S0400000_17(c1146430fwH, c1146350fw9LIZ, this, c1146350fw9LIZIZ, 7));
        }
        if ((c1146350fw9LIZIZ != null && c1146350fw9LIZIZ.LLJJIJI) || c1146350fw9LIZ.LLJJIJI) {
            if (!z2 && c1146350fw9LIZ.LLJJIJI && (l2 = c1146350fw9LIZ.LLJILJILJ) != null) {
                EQ2(c1146350fw9LIZ.LL, l2.longValue());
            } else {
                EQ2(0L, 0L);
            }
        }
    }

    public static C1146430fwH HQ2(C1146430fwH c1146430fwH, C1146350fw9 c1146350fw9, EnumC1146490fwN enumC1146490fwN) {
        C1146360fwA c1146360fwA;
        C1146360fwA c1146360fwA2 = c1146430fwH.LIZ;
        if (c1146360fwA2 != null) {
            InterfaceC1665500tRU<C1146350fw9> interfaceC1665500tRU = c1146360fwA2.LLILZLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(interfaceC1665500tRU, 10));
            for (C1146350fw9 c1146350fw92 : interfaceC1665500tRU) {
                if (c1146350fw92.LL == c1146350fw9.LL) {
                    c1146350fw92 = c1146350fw9;
                }
                arrayList.add(c1146350fw92);
            }
            c1146360fwA = new C1146360fwA(c1146360fwA2.LL, c1146360fwA2.LLILLJJLI, c1146360fwA2.LLILLL, c1146360fwA2.LLILZ, c1146360fwA2.LLILZIL, C1687430u0r.LIZ(arrayList));
        } else {
            c1146360fwA = null;
        }
        return new C1146430fwH(c1146360fwA, c1146430fwH.LIZIZ, enumC1146490fwN);
    }

    public static C1146430fwH IQ2(C1146430fwH c1146430fwH, C1146350fw9 c1146350fw9, EnumC1146490fwN enumC1146490fwN) {
        InterfaceC1665500tRU<C1146350fw9> interfaceC1665500tRU = c1146430fwH.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(interfaceC1665500tRU, 10));
        for (C1146350fw9 c1146350fw92 : interfaceC1665500tRU) {
            if (c1146350fw92.LL == c1146350fw9.LL) {
                c1146350fw92 = c1146350fw9;
            }
            arrayList.add(c1146350fw92);
        }
        return new C1146430fwH(c1146430fwH.LIZ, C1687430u0r.LIZ(arrayList), enumC1146490fwN);
    }

    public static C1146350fw9 CQ2(GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel, GiftStructByCreator giftStructByCreator, C1133650fbf c1133650fbf, Long l, AbstractC1146450fwJ abstractC1146450fwJ, String str, int i) {
        String str2;
        Integer numValueOf;
        String strYQ2 = str;
        AbstractC1146450fwJ abstractC1146450fwJ2 = abstractC1146450fwJ;
        Long l2 = l;
        String str3 = null;
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            abstractC1146450fwJ2 = C1146460fwK.LIZ;
        }
        if ((i & 32) != 0) {
            GiftPanelCardletByCreator giftPanelCardletByCreator = (GiftPanelCardletByCreator) C13LP.LJJJLL(giftStructByCreator.giftPanelCardlets);
            if (giftPanelCardletByCreator != null) {
                numValueOf = Integer.valueOf(giftPanelCardletByCreator.cardletType);
            } else {
                numValueOf = null;
            }
            giftAnchorPanelGiftPageCenterViewModel.getClass();
            strYQ2 = yQ2(true, numValueOf);
        }
        giftAnchorPanelGiftPageCenterViewModel.getClass();
        long j = giftStructByCreator.id;
        int i2 = giftStructByCreator.type;
        String str4 = giftStructByCreator.name;
        String str5 = giftStructByCreator.coinsText;
        int i3 = giftStructByCreator.diamondCount;
        ImageModel imageModelLIZIZ = C1133610fbb.LIZIZ(j, giftStructByCreator.image);
        ImageModel imageModel = giftStructByCreator.previewImage;
        ImageModel imageModel2 = giftStructByCreator.giftLabelIcon;
        InterfaceC1665500tRU interfaceC1665500tRULIZ = C1687430u0r.LIZ(giftStructByCreator.giftPanelCardlets);
        boolean z = giftStructByCreator.isBoxGift;
        GiftStructByCreatorSchemeInfo giftStructByCreatorSchemeInfo = giftStructByCreator.schemeInfo;
        if (giftStructByCreatorSchemeInfo != null) {
            str3 = giftStructByCreatorSchemeInfo.schemeUrl;
        }
        String str6 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (giftStructByCreatorSchemeInfo != null && (str2 = giftStructByCreatorSchemeInfo.schemeDescribe) != null) {
            str6 = str2;
        }
        return new C1146350fw9(j, i2, str4, str5, i3, imageModelLIZIZ, imageModel, imageModel2, interfaceC1665500tRULIZ, z, c1133650fbf, false, l2, str3, str6, abstractC1146450fwJ2, strYQ2);
    }
}
