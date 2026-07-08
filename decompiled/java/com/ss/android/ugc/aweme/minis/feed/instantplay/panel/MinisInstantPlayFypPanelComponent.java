package com.ss.android.ugc.aweme.minis.feed.instantplay.panel;

import X.C01GW;
import X.C1006360cIM;
import X.C1006500cIa;
import X.C1006540cIe;
import X.C14EU;
import X.C1564680qos;
import X.C1566140qrE;
import X.C1620830sHR;
import X.C299750Boz;
import X.C452501pT;
import X.C606500Nqa;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Collections;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class MinisInstantPlayFypPanelComponent extends BasePanelComponent {
    public final C01GW LL;
    public final C630740Ooa LLILLJJLI;
    public final C01GW LLILLL;
    public final C1620830sHR LLILZ;

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this.LLILZ);
        }
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    public MinisInstantPlayFypPanelComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 780), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 7));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C628500Oky.LIZ(new AwS568S0100000_24(this, 782));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 781), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 8));
        }
        this.LLILLL = c01gwLIZIZ2;
        this.LLILZ = new C1620830sHR(this, 4);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this.LLILZ);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedRefresh(C1564680qos c1564680qos) {
        int i = c1564680qos.LIZ;
        if (i != 0 && i != 1 && i != 2) {
            return;
        }
        C1006540cIe.LIZIZ();
        C1006360cIM.LIZ.clear();
        C1006360cIM.LIZIZ.clear();
        C1006360cIM.LIZJ.clear();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMinisInstantPlayPreviewInsert(C1006500cIa c1006500cIa) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        Aweme aweme = c1006500cIa.LIZ;
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null) {
            iAwemeService.LLILLL(aweme);
        }
        DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LLILLL.getValue();
        if (dataLayerAbility != null && dataLayerAbility.V32(Collections.singletonList(aweme), 0, new C606500Nqa("diff_type_minis_instant_play_preview_insert", "minis")).LIZ() && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue()) != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null) {
            iViewPagerComponentAbilityMb.LLFFF(0, true);
        }
    }
}
