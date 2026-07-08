package com.ss.android.ugc.aweme.poi.mapmode.assem;

import X.C01D1;
import X.C098200Yq;
import X.C1173220gdU;
import X.C1174430gfR;
import X.C1177230gjx;
import X.C1189060h32;
import X.C1208670hYf;
import X.C123100dR;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C189200o6;
import X.C19719912Dl;
import X.C20584615gi;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2217381BqS;
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
import Y.AObserverS222S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.mapmode.cell.PoiMapModeHorizontalCardCell;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeHorizontalCardAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public ViewGroup LLJJIII;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJIJI;
    public C1177230gjx LLJJIJIIJIL;
    public boolean LLJJIJIL;

    public interface PoiMapModeHorizontalCardAbility extends InterfaceC494301wD {
        void cr(PoiDiscoveryCard poiDiscoveryCard, int i);

        boolean d4();

        void e2(C1177230gjx c1177230gjx);

        C1177230gjx getCardInfo();
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeHorizontalCardAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiMapModeHorizontalCardAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1455), AFwS256S0000000_18.get$arr$(504), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e4x;
    }

    public final PoiMapModePageVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
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
        if (!c614900O9w.LJI && C123100dR.LIZ(c614900O9w.LIZIZ)) {
            int i = 0;
            PoiMapModeResponse poiMapModeResponseXQ2 = hp().xQ2(c614900O9w, false);
            if (poiMapModeResponseXQ2 != null && (poiList = poiMapModeResponseXQ2.getPoiList()) != null) {
                for (PoiDiscoveryCard poiDiscoveryCard : poiList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        PoiDiscoveryCard poiDiscoveryCard2 = poiDiscoveryCard;
                        if (Intrinsics.LJFF(poiDiscoveryCard2.poiId, c614900O9w.LIZIZ)) {
                            ip(poiDiscoveryCard2, i);
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
            C1189060h32.LJJIIJ(viewGroup2, new AwS597S0100000_18(this, 404));
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null) {
            viewItemOperator2.LIZJ(PoiMapModeHorizontalCardCell.class);
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
            viewOnAttachStateChangeListenerC20631115oD4.registerOnPageChangeCallback(new C1208670hYf(this, 8));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Unit unit = null;
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), new PoiMapModeHorizontalCardAbility() { // from class: com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeHorizontalCardAssem$loadAllAbility$1$1
                @Override // com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeHorizontalCardAssem.PoiMapModeHorizontalCardAbility
                public final boolean d4() {
                    return this.LL.LLJJIJIL;
                }

                @Override // com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeHorizontalCardAssem.PoiMapModeHorizontalCardAbility
                public final C1177230gjx getCardInfo() {
                    return this.LL.LLJJIJIIJIL;
                }

                @Override // com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeHorizontalCardAssem.PoiMapModeHorizontalCardAbility
                public final void e2(C1177230gjx c1177230gjx) {
                    this.LL.LLJJIJIIJIL = c1177230gjx;
                }

                @Override // com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeHorizontalCardAssem.PoiMapModeHorizontalCardAbility
                public final void cr(PoiDiscoveryCard poiDiscoveryCard, int i) {
                    boolean zBooleanValue;
                    String str;
                    String str2;
                    String str3;
                    List<PoiDiscoveryCard> poiList;
                    Boolean boolIsCollected;
                    PoiMapModePageVM poiMapModePageVMHp = this.LL.hp();
                    if (poiDiscoveryCard != null && (boolIsCollected = poiDiscoveryCard.isCollected()) != null) {
                        zBooleanValue = boolIsCollected.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    boolean z = !zBooleanValue;
                    PoiDiscoveryCard poiDiscoveryCard2 = null;
                    if (poiDiscoveryCard != null) {
                        str = poiDiscoveryCard.poiId;
                        str2 = poiDiscoveryCard.poiName;
                        str3 = poiDiscoveryCard.formattedAddress;
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    PoiMapModeResponse poiMapModeResponseXQ2 = poiMapModePageVMHp.xQ2(new C614900O9w(z, str, str2, str3, String.valueOf(this.LL.hashCode()), false, true, false, false, 384), true);
                    PoiMapModeHorizontalCardAssem poiMapModeHorizontalCardAssem = this.LL;
                    if (poiMapModeResponseXQ2 != null && (poiList = poiMapModeResponseXQ2.getPoiList()) != null) {
                        poiDiscoveryCard2 = (PoiDiscoveryCard) ListProtector.get(poiList, i);
                    }
                    poiMapModeHorizontalCardAssem.ip(poiDiscoveryCard2, i);
                }
            }, PoiMapModeHorizontalCardAbility.class, null, null);
        }
        C736680Sv4.LJIIIZ(this, hp(), new C2217381BqS() { // from class: X.0gfJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1174440gfS) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0gf9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1174440gfS) obj).LLILLJJLI;
            }
        }, null, new AwS667S0100000_18(this, 38), 12);
        hp().LLILLL.observe(this, new AObserverS222S0100000_18(this, 30));
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

    public final void ip(PoiDiscoveryCard poiDiscoveryCard, int i) {
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        if (poiDiscoveryCard != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("card_view updateSpecifiedCard  index: ");
            sbLIZ.append(i);
            sbLIZ.append("  poiId: ");
            sbLIZ.append(poiDiscoveryCard.poiId);
            sbLIZ.append("  poiName: ");
            sbLIZ.append(poiDiscoveryCard.poiName);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJIJI;
            if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
                state.LJIILJJIL(i, new C1174430gfR(poiDiscoveryCard, false));
            }
        }
    }
}
