package com.ss.android.ugc.aweme.poi.mapmode.assem;

import X.C01D1;
import X.C098200Yq;
import X.C1174410gfP;
import X.C123100dR;
import X.C1308910kAL;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C189200o6;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C422570Ghb;
import X.C614900O9w;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.mapmode.cell.PoiMapModeVerticalListCell;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeVerticalListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;

    public interface PoiMapModeVerticalListAbility extends InterfaceC494301wD {
        void Az0();

        void UF();

        void cr(PoiDiscoveryCard poiDiscoveryCard, int i);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeVerticalListAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiMapModeVerticalListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1440), AFwS256S0000000_18.get$arr$(513), null, true);
    }

    public final PoiMapModePageVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
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
        super.onDestroy();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        List<PoiDiscoveryCard> poiList;
        if (C123100dR.LIZ(c614900O9w.LIZIZ)) {
            int i = 0;
            PoiMapModeResponse poiMapModeResponseXQ2 = Go().xQ2(c614900O9w, false);
            if (poiMapModeResponseXQ2 != null && (poiList = poiMapModeResponseXQ2.getPoiList()) != null) {
                for (PoiDiscoveryCard poiDiscoveryCard : poiList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        PoiDiscoveryCard poiDiscoveryCard2 = poiDiscoveryCard;
                        if (Intrinsics.LJFF(poiDiscoveryCard2.poiId, c614900O9w.LIZIZ)) {
                            Ho(poiDiscoveryCard2, i);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
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
            final int iIntValue = 0;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiMapModeVerticalListCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext()));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, viewOnAttachStateChangeListenerC20604515jv.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C422570Ghb(iIntValue, iLIZIZ, iLIZIZ2) { // from class: X.0gfM
            });
        }
        InterfaceC665370Q7z interfaceC665370Q7z = Go().LLIZ;
        Unit unit = null;
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, new PoiMapModeVerticalListAbility() { // from class: com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeVerticalListAssem$loadAllAbility$1$1
                @Override // com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeVerticalListAssem.PoiMapModeVerticalListAbility
                public final void Az0() {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LL.LLJ;
                    if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                        C2211751BhN.LIZIZ(viewOnAttachStateChangeListenerC20604515jv2);
                        C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
                    }
                }

                @Override // com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeVerticalListAssem.PoiMapModeVerticalListAbility
                public final void UF() {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LL.LLJ;
                    if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                        viewOnAttachStateChangeListenerC20604515jv2.scrollToPosition(0);
                    }
                }

                @Override // com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeVerticalListAssem.PoiMapModeVerticalListAbility
                public final void cr(PoiDiscoveryCard poiDiscoveryCard, int i) {
                    boolean zBooleanValue;
                    PoiDiscoveryCard poiDiscoveryCard2;
                    List<PoiDiscoveryCard> poiList;
                    PoiMapModePageVM poiMapModePageVMGo = this.LL.Go();
                    Boolean boolIsCollected = poiDiscoveryCard.isCollected();
                    if (boolIsCollected != null) {
                        zBooleanValue = boolIsCollected.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    PoiMapModeResponse poiMapModeResponseXQ2 = poiMapModePageVMGo.xQ2(new C614900O9w(!zBooleanValue, poiDiscoveryCard.poiId, poiDiscoveryCard.poiName, poiDiscoveryCard.formattedAddress, String.valueOf(this.LL.hashCode()), false, true, false, false, 384), true);
                    PoiMapModeVerticalListAssem poiMapModeVerticalListAssem = this.LL;
                    if (poiMapModeResponseXQ2 != null && (poiList = poiMapModeResponseXQ2.getPoiList()) != null) {
                        poiDiscoveryCard2 = (PoiDiscoveryCard) ListProtector.get(poiList, i);
                    } else {
                        poiDiscoveryCard2 = null;
                    }
                    poiMapModeVerticalListAssem.Ho(poiDiscoveryCard2, i);
                }
            }, PoiMapModeVerticalListAbility.class, null, null);
        }
        C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0gfL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1174440gfS) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0gfB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1174440gfS) obj).LLILLJJLI;
            }
        }, null, new AwS667S0100000_18(this, 40), 12);
        try {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
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

    public final void Ho(PoiDiscoveryCard poiDiscoveryCard, int i) {
        C20600815jK<InterfaceC1891350zJl> state;
        if (poiDiscoveryCard != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("list_view updateSepecificItem  index: ");
            sbLIZ.append(i);
            sbLIZ.append("  poiId: ");
            sbLIZ.append(poiDiscoveryCard.poiId);
            sbLIZ.append("  poiName: ");
            sbLIZ.append(poiDiscoveryCard.poiName);
            sbLIZ.append("  isCollected: ");
            sbLIZ.append(poiDiscoveryCard.isCollected());
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state.LJIILJJIL(i, new C1174410gfP(poiDiscoveryCard, false));
            }
        }
    }
}
