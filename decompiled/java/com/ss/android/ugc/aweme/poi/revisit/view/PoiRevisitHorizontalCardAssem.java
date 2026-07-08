package com.ss.android.ugc.aweme.poi.revisit.view;

import X.C01D1;
import X.C098200Yq;
import X.C0P4A;
import X.C1173220gdU;
import X.C1177230gjx;
import X.C1189060h32;
import X.C123100dR;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C20584615gi;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C296960BkU;
import X.C384050F3z;
import X.C418440Gaw;
import X.C614900O9w;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.AObserverS213S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class PoiRevisitHorizontalCardAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public ViewGroup LLJJIII;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJIJI;
    public boolean LLJJIJIIJIL;

    public interface PoiRevisitHorizontalCardAbility extends InterfaceC494301wD {
        void N72(PoiRevisitCardItem poiRevisitCardItem);

        boolean d4();

        void e2(C1177230gjx c1177230gjx);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRevisitHorizontalCardAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiRevisitHorizontalCardAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRevisitViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1441), AFwS240S0000000_9.get$arr$(600), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e8e;
    }

    public final PoiRevisitViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
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

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        if (!c614900O9w.LJII && C123100dR.LIZ(c614900O9w.LIZIZ)) {
            int i = 0;
            hp().xQ2(c614900O9w, false);
            PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = hp().wQ2(true, true, true);
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
                    ip((PoiRevisitApi.PoiRevisitCardModel) ListProtector.get(poiRevisitCardListResponseWQ2.poiCardList, numValueOf.intValue()), numValueOf.intValue());
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC1733780vDc viewItemOperator;
        InterfaceC1733780vDc viewItemOperator2;
        super.onViewCreated(view);
        this.LLJJIII = (ViewGroup) view.findViewById(R.id.msa);
        this.LLJJIJI = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.jr6);
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            viewGroup.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        ViewGroup viewGroup2 = this.LLJJIII;
        if (viewGroup2 != null) {
            C1189060h32.LJJIIJ(viewGroup2, new AwS595S0100000_16(this, 174));
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null) {
            viewItemOperator2.LIZJ(PoiRevisitHorizontalCell.class);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null) {
            C1173220gdU c1173220gdU = new C1173220gdU();
            c1173220gdU.LIZ = 1;
            viewItemOperator.LIZLLL(c1173220gdU);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
            viewOnAttachStateChangeListenerC20631115oD3.setPageTransformer(new C20584615gi(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD4 != null) {
            viewOnAttachStateChangeListenerC20631115oD4.registerOnPageChangeCallback(new C0P4A(this, 0));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Unit unit = null;
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), new PoiRevisitHorizontalCardAbility() { // from class: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCardAssem$loadAllAbility$1$1
                @Override // com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCardAssem.PoiRevisitHorizontalCardAbility
                public final boolean d4() {
                    return this.LL.LLJJIJIIJIL;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[PHI: r15
                  0x00bd: PHI (r15v2 java.lang.String) = (r15v0 java.lang.String), (r15v5 java.lang.String) binds: [B:30:0x00ba, B:25:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCardAssem.PoiRevisitHorizontalCardAbility
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void N72(com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem r22) {
                    /*
                        Method dump skipped, instruction units count: 419
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCardAssem$loadAllAbility$1$1.N72(com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem):void");
                }

                @Override // com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCardAssem.PoiRevisitHorizontalCardAbility
                public final void e2(C1177230gjx c1177230gjx) {
                    this.LL.getClass();
                }
            }, PoiRevisitHorizontalCardAbility.class, null, null);
        }
        C736680Sv4.LJIIIZ(this, hp(), new C2217381BqS() { // from class: X.0OGv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616670OGr) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0OH0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616670OGr) obj).LLILLJJLI;
            }
        }, null, new AwS658S0100000_9(this, 16), 12);
        hp().LLJIJIL.observe(this, new AObserverS213S0100000_9(this, 10));
        if (C296960BkU.LIZ()) {
            unit = null;
            C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0OGq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C616670OGr) obj).LLILZ;
                }
            }, null, new AwS623S0100000_9(this, 160), 6);
        }
        if (!C296960BkU.LIZ()) {
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
    }

    public final void ip(PoiRevisitApi.PoiRevisitCardModel poiRevisitCardModel, int i) {
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        if (poiRevisitCardModel != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Horizontal Card Assem updateSpecifiedCard  index: ");
            sbLIZ.append(i);
            sbLIZ.append("  poiId: ");
            sbLIZ.append(poiRevisitCardModel.poiId);
            sbLIZ.append("  poiName: ");
            sbLIZ.append(poiRevisitCardModel.poiName);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJIJI;
            if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
                state.LJIILJJIL(i, PoiRevisitCardItem.LIZ(poiRevisitCardModel.LIZIZ(), true, -11));
            }
        }
    }
}
