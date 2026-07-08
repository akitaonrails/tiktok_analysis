package com.ss.android.ugc.aweme.poi.mapmode.assem;

import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C1176730gj9;
import X.C1176760gjC;
import X.C1177210gjv;
import X.C1177240gjy;
import X.C1179570gnj;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC1177110gjl;
import X.InterfaceC1177250gjz;
import X.InterfaceC2217461Bqa;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.MessageSyncer;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.mapmode.map.PoiMapModeClusterPicLoader;
import com.ss.android.ugc.aweme.poi.mapmode.map.permission.MapModePermissionChangeObserver;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeMapVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeMapAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final MessageSyncer LLJI;
    public InterfaceC1177250gjz LLJIJIL;
    public C1177240gjy LLJILJIL;
    public InterfaceC1177110gjl<C1177210gjv> LLJILJILJ;
    public final Set<Function1<Boolean, Unit>> LLJILLL;
    public PoiMapModeClusterPicLoader LLJJ;
    public C1176730gj9 LLJJI;
    public C1176760gjC LLJJIII;
    public final C01GW LLJJIJI;
    public final MapModePermissionChangeObserver LLJJIJIIJIL;
    public C1179570gnj LLJJIJIL;
    public FrameLayout LLJJJ;
    public TuxIconView LLJJJIL;
    public Integer LLJJJJ;
    public boolean LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeMapAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapModeMapAssem.class, "mapVM", "getMapVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModeMapVM;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapModeMapAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1458), AFwS256S0000000_18.get$arr$(505), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapModeMapVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1459), AFwS256S0000000_18.get$arr$(506), null, true);
        this.LLJI = new MessageSyncer();
        this.LLJILLL = new LinkedHashSet();
        this.LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1456));
        this.LLJJIJIIJIL = new MapModePermissionChangeObserver(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIIZILJ(), new AwS562S0100000_18(this, 1457));
        this.LLJJJJ = 0;
    }

    public final PoiMapModeMapVM Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (PoiMapModeMapVM) assemVMLazy.getValue();
    }

    public final PoiMapModePageVM Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0253  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeMapAssem.onViewCreated(android.view.View):void");
    }
}
