package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center;

import X.C050G;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0PEM;
import X.C1085130eLP;
import X.C1133640fbe;
import X.C1135810ff9;
import X.C1135870ffF;
import X.C1136910fgv;
import X.C1145950fvV;
import X.C1145960fvW;
import X.C1145970fvX;
import X.C1145980fvY;
import X.C1146010fvb;
import X.C1146070fvh;
import X.C1146090fvj;
import X.C1146120fvm;
import X.C1161920gLG;
import X.C118300cf;
import X.C11S5;
import X.C13BV;
import X.C13LP;
import X.C1559260qg8;
import X.C1701940uOG;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C23250099c;
import X.C480460Ism;
import X.C491101vh;
import X.EnumC1145990fvZ;
import X.EnumC994430bz7;
import X.InterfaceC0148002o;
import X.InterfaceC1136020ffU;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import Y.AfS5S0200100_17;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.GiftAnchorPanelGiftRecordReceivedEvent;
import com.bytedance.android.livesdk.GiftAnchorPanelGiftRecordReceivedQueueModelEvent;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.gift.model.GiftReceiveRecordsResponse;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGiftCreatorPanelRecordSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS69S0210000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelRecordPageCenterAssemViewModel extends AssemViewModel<C1145980fvY> {
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLJI;
    public long LLJILLL;
    public long LLJJ;
    public final String LL = "GiftAnchorPanelRecordPageCenterAssemViewModel";
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1146120fvm.class, (Class<Object>) null, (String) 13), true);
    public long LLILZLL = -1;
    public long LLIZ = -1;
    public boolean LLIZLLLIL = true;
    public final double LLJ = 3.0d;
    public final ConcurrentHashMap<String, C1145950fvV> LLJIJIL = new ConcurrentHashMap<>();
    public final HashSet<Long> LLJILJIL = new HashSet<>();
    public final HashSet<Long> LLJILJILJ = new HashSet<>();
    public final AwS596S0100000_17 LLJJI = new AwS596S0100000_17(this, 142);
    public final AwS596S0100000_17 LLJJIII = new AwS596S0100000_17(this, 143);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1145980fvY(C491101vh.LIZ, new C1146010fvb(C13BV.INSTANCE, EnumC1145990fvZ.IDLE), new C1146090fvj(EnumC994430bz7.HIDE, 0, false, false, false), false);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (this.LLILLL) {
            yQ2().LLILLJJLI.SX0(C1085130eLP.class, Boolean.FALSE);
            yQ2().LLILLJJLI.HQ2(this, GiftAnchorPanelGiftRecordReceivedEvent.class, this.LLJJI);
            yQ2().LLILLJJLI.HQ2(this, GiftAnchorPanelGiftRecordReceivedQueueModelEvent.class, this.LLJJIII);
        }
        super.onCleared();
    }

    public final void refresh() {
        if (this.LLILZ) {
            C20441214yg.LJ(this.LL, "ignore duplicate refresh requesting");
            return;
        }
        this.LLILZ = true;
        List<C050G> list = getState().LLILLJJLI.LIZ;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C1145960fvW(list, this, null), 2);
    }

    public final void xQ2() {
        boolean z;
        Iterator<Map.Entry<String, C1145950fvV>> it2 = this.LLJIJIL.entrySet().iterator();
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        C118300cf c118300cf = new C118300cf();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, C1145950fvV> next = it2.next();
            if (CQ2(Long.valueOf(next.getValue().LIZ), Long.valueOf(next.getValue().LIZIZ), Long.valueOf(next.getValue().LIZJ), next.getValue().LIZLLL, next.getValue().LJ)) {
                it2.remove();
            } else if (next.getValue().LIZLLL == currentUserId) {
                c118300cf.element++;
            }
        }
        EnumC994430bz7 enumC994430bz7 = c118300cf.element > 0 ? EnumC994430bz7.SHOW_RECORD : this.LLJIJIL.isEmpty() ^ true ? EnumC994430bz7.SHOW_DIAMOND : EnumC994430bz7.HIDE;
        List<C050G> list = getState().LLILLJJLI.LIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<C050G> it3 = list.iterator();
            while (it3.hasNext()) {
                if (it3.next() instanceof C1146070fvh) {
                    break;
                }
            }
            z = false;
        }
        setState(new AwS69S0210000_17(enumC994430bz7, c118300cf, z, 2));
    }

    public final C1146120fvm yQ2() {
        return (C1146120fvm) this.LLILLJJLI.getValue();
    }

    public final void AQ2() {
        if (Intrinsics.LJFF(getState().LL, C491101vh.LIZ) || this.LLILZLL < 0 || this.LLIZ < 0) {
            C20441214yg.LJ(this.LL, "loadMore while Uninitialized");
            return;
        }
        if (!this.LLIZLLLIL) {
            C20441214yg.LJ(this.LL, "no more but it got called!");
            return;
        }
        if (this.LLILZIL) {
            C20441214yg.LJ(this.LL, "ignore duplicate load more requesting");
            return;
        }
        this.LLILZIL = true;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C1145970fvX(this, null), 2);
    }

    public static String vQ2(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (interfaceC1136020ffU != null && interfaceC1136020ffU.getGroupId() > 0) {
            return interfaceC1136020ffU.LJJI().LIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC1136020ffU.LJJI().LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(Long.valueOf(C1135870ffF.LIZ(interfaceC1136020ffU)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String wQ2(C1135810ff9 c1135810ff9) {
        Long lValueOf;
        GiftMessage giftMessage = c1135810ff9.LIZ;
        if (giftMessage != null && giftMessage.groupId > 0) {
            return c1135810ff9.LIZLLL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1135810ff9.LIZLLL);
        sbLIZ.append('_');
        GiftMessage giftMessage2 = c1135810ff9.LIZ;
        if (giftMessage2 != null) {
            lValueOf = Long.valueOf(C1136910fgv.LIZ(giftMessage2));
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1146080fvi BQ2(com.bytedance.android.livesdk.gift.model.GiftRecord r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel.BQ2(com.bytedance.android.livesdk.gift.model.GiftRecord, boolean):X.0fvi");
    }

    public final Object zQ2(Long l, Long l2, InterfaceC1364105Vn<? super GiftReceiveRecordsResponse.Data> interfaceC1364105Vn) {
        int i;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (l == null) {
            i = 11;
        } else {
            i = 14;
        }
        C1133640fbe.LJIIL(i, null, null, null, 14);
        C480460Ism.LIZ().getClass();
        ((GiftRetrofitApi) C480460Ism.LIZIZ(GiftRetrofitApi.class)).fetchGiftRecords(UserService.getInstance().user().getCurrentUserId(), String.valueOf(yQ2().LL.getId()), l, l2, LiveGiftCreatorPanelRecordSetting.INSTANCE.getFetchSize()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS5S0200100_17(jUptimeMillis, l, c2252611DEt, 1), new AfS5S0200100_17(jUptimeMillis, l, c2252611DEt, 2));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final boolean CQ2(Long l, Long l2, Long l3, long j, long j2) {
        long jLongValue;
        boolean z;
        long jLongValue2 = -1;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        if (jLongValue < 0 || l2 == null || l2.longValue() < 0 || l3 == null || l3.longValue() < 0 || j < 0) {
            return true;
        }
        if (j == UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        boolean zUI2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).uI2(yQ2().LLILLJJLI);
        if ((!getState().LLILZ && !z) || ((getState().LLILZ && !z && !zUI2) || this.LLJILJILJ.isEmpty())) {
            return true;
        }
        if (l != null) {
            jLongValue2 = l.longValue();
        }
        if (jLongValue2 <= this.LLJJ || C13LP.LJJJJ(l2, this.LLJILJILJ) || C13LP.LJJJJ(l3, this.LLJILJIL)) {
            return true;
        }
        if (!z && j2 < this.LLJILLL) {
            return true;
        }
        if (getState().LLILZ && !z && zUI2 && j2 < this.LLJILLL) {
            return true;
        }
        return false;
    }
}
