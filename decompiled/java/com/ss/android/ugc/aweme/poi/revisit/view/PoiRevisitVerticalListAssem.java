package com.ss.android.ugc.aweme.poi.revisit.view;

import X.C01D1;
import X.C098200Yq;
import X.C123100dR;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C296960BkU;
import X.C614900O9w;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class PoiRevisitVerticalListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRevisitVerticalListAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiRevisitVerticalListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRevisitViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1442), AFwS240S0000000_9.get$arr$(601), null, true);
    }

    public final PoiRevisitViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (PoiRevisitViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        if (!C296960BkU.LIZ()) {
            try {
                EventBus eventBusLIZLLL = EventBus.LIZLLL();
                Unit unit = null;
                if (eventBusLIZLLL.LJIIJ(this)) {
                    eventBusLIZLLL.LJJI(this);
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        super.onDestroy();
    }

    public final void Ho(List<PoiRevisitApi.PoiRevisitCardModel> list) {
        ArrayList arrayList;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        PoiRevisitCardItem poiRevisitCardItem;
        String str;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<PoiRevisitApi.PoiRevisitCardModel> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().LIZIZ());
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                List<InterfaceC1891350zJl> listLJII = state2.LJII();
                arrayList = new ArrayList();
                for (InterfaceC1891350zJl interfaceC1891350zJl : listLJII) {
                    if ((interfaceC1891350zJl instanceof PoiRevisitCardItem) && (poiRevisitCardItem = (PoiRevisitCardItem) interfaceC1891350zJl) != null && (str = poiRevisitCardItem.poiId) != null) {
                        arrayList.add(str);
                    }
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<PoiRevisitApi.PoiRevisitCardModel> it3 = list.iterator();
            while (it3.hasNext()) {
                String str2 = it3.next().poiId;
                if (str2 != null) {
                    arrayList3.add(str2);
                }
            }
            boolean zLJFF = Intrinsics.LJFF(arrayList, arrayList3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateList, list size=");
            sbLIZ.append(arrayList2.size());
            sbLIZ.append(" ,isExactlySame=");
            sbLIZ.append(zLJFF);
            C2188811AlT.LIZIZ(sbLIZ);
            if (!zLJFF && (viewOnAttachStateChangeListenerC20604515jv = this.LLJ) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state.LJIILL(arrayList2, null);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        if (C123100dR.LIZ(c614900O9w.LIZIZ)) {
            int i = 0;
            Go().xQ2(c614900O9w, false);
            PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = Go().wQ2(true, true, true);
            if (poiRevisitCardListResponseWQ2 != null && (list = poiRevisitCardListResponseWQ2.poiCardList) != null) {
                Iterator<PoiRevisitApi.PoiRevisitCardModel> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().poiId, c614900O9w.LIZIZ)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                if (numValueOf != null) {
                    numValueOf.intValue();
                    Jo((PoiRevisitApi.PoiRevisitCardModel) ListProtector.get(poiRevisitCardListResponseWQ2.poiCardList, numValueOf.intValue()), numValueOf.intValue());
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.vertical_list);
        this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiRevisitCardCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext()));
        }
        C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0OGs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616670OGr) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0OGl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616670OGr) obj).LLILLJJLI;
            }
        }, null, new AwS658S0100000_9(this, 17), 12);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OGm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616670OGr) obj).LLILLL;
            }
        }, null, new AwS623S0100000_9(this, 159), 6);
        if (C296960BkU.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OGp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C616670OGr) obj).LLILZ;
                }
            }, null, new AwS623S0100000_9(this, 161), 6);
        }
        if (!C296960BkU.LIZ()) {
            try {
                EventBus eventBusLIZLLL = EventBus.LIZLLL();
                Unit unit = null;
                if (!eventBusLIZLLL.LJIIJ(this)) {
                    eventBusLIZLLL.LJIJJ(this);
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void Jo(PoiRevisitApi.PoiRevisitCardModel poiRevisitCardModel, int i) {
        if (poiRevisitCardModel != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Vertical Card Assem updateSpecifiedCard  index: ");
            sbLIZ.append(i);
            sbLIZ.append("  poiId: ");
            sbLIZ.append(poiRevisitCardModel.poiId);
            sbLIZ.append("  poiName: ");
            sbLIZ.append(poiRevisitCardModel.poiName);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.getState().LJIILJJIL(i, poiRevisitCardModel.LIZIZ());
            }
        }
    }
}
