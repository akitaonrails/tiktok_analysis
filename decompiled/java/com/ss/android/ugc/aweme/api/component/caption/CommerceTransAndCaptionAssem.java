package com.ss.android.ugc.aweme.api.component.caption;

import X.AbstractC1023470cjx;
import X.AnonymousClass0956;
import X.C01GW;
import X.C01LY;
import X.C05FK;
import X.C05RH;
import X.C09IC;
import X.C0O9N;
import X.C0PEM;
import X.C1024050ckt;
import X.C1024060cku;
import X.C14EU;
import X.C1558520qew;
import X.C160B;
import X.C1613206Ti;
import X.C1629806Zs;
import X.C1720106oR;
import X.C1DFH;
import X.C20703515zt;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C289640BWw;
import X.C414301jJ;
import X.C452501pT;
import X.C702650RhH;
import X.C702670RhJ;
import X.C724270Sb3;
import X.C746760TRa;
import X.C861640Xr8;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ARunnableS16S1100000_11;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class CommerceTransAndCaptionAssem extends BaseCellLogicComponent<CommerceTransAndCaptionAssem> implements ICommerceTransAndCaptionAbility, InterfaceC1554640qYg {
    public final CopyOnWriteArraySet<Function1<Boolean, Unit>> LLJJIJI = new CopyOnWriteArraySet<>();
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 58));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 59));
    public int LLJJJ = -1;
    public String LLJJJIL = "";
    public String LLJJJJ;
    public AnonymousClass0956 LLJJJJJIL;
    public C1024050ckt LLJJJJLIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1904077946) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility
    public final boolean GH1() {
        CLACaptionAbility cLACaptionAbility = (CLACaptionAbility) this.LLJJIJIIJIL.getValue();
        return (cLACaptionAbility != null ? cLACaptionAbility.vf() : null) == C160B.EXPANDED;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJL() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Co("commerce_reset_top_container", true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(eventBusLIZLLL)) {
            return;
        }
        eventBusLIZLLL.LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPanelShowEvent(C0O9N c0o9n) {
        Object obj;
        C1024050ckt c1024050ckt;
        String str;
        if (c0o9n.LIZ == null) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        }
        if (Intrinsics.LJFF(aid, c0o9n.LIZ) && (c1024050ckt = this.LLJJJJLIIL) != null) {
            if (c0o9n.LIZIZ) {
                str = "share_panel";
            } else {
                str = "feed_panel";
            }
            C1024060cku.LIZ.getClass();
            c1024050ckt.logAd(C1024060cku.LIZIZ, new AwS67S1000000_16(str, 23));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility
    public final void p72(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCardHide, tag:");
        sbLIZ.append(str);
        C1720106oR.LJI("CommerceCaptionAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(this.LLJJJJ, str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LLJJJIL);
            sbLIZ2.append("_hide");
            Co(C2188811AlT.LIZIZ(sbLIZ2), false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility
    public final void pg1(AwS590S0100000_11 awS590S0100000_11) {
        this.LLJJIJI.add(awS590S0100000_11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C1024050ckt c1024050ckt;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            final Object[] objArr = {aweme};
            c1024050ckt = new AbstractC1023470cjx(objArr) { // from class: X.0ckt
                public final C1023630ckD<?>[] LIZ;

                @Override // X.AbstractC1023380cjo, X.C1023640ckE
                public final C1023630ckD<?>[] getInternalLogics() {
                    return this.LIZ;
                }

                {
                    super(Arrays.copyOf(objArr, objArr.length));
                    this.LIZ = new C1023630ckD[0];
                }
            };
        } else {
            c1024050ckt = 0;
        }
        this.LLJJJJLIIL = c1024050ckt;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility
    public final void rz1(AwS590S0100000_11 awS590S0100000_11) {
        this.LLJJIJI.remove(awS590S0100000_11);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility
    public final void sL2(boolean z) {
        String str;
        C1024050ckt c1024050ckt = this.LLJJJJLIIL;
        if (c1024050ckt != null) {
            if (z) {
                str = "original";
            } else {
                str = "translation";
            }
            C1024060cku.LIZ.getClass();
            c1024050ckt.logAd(C1024060cku.LIZLLL, new AwS67S1000000_16(str, 22));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility
    public final void yS1(Aweme aweme) {
        Object obj;
        C1024050ckt c1024050ckt;
        if (aweme == null) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj).getAweme();
        if (aweme2 != null) {
            aid = aweme2.getAid();
        }
        if (Intrinsics.LJFF(aid, aweme.getAid()) && (c1024050ckt = this.LLJJJJLIIL) != null) {
            C1024060cku.LIZ.getClass();
            c1024050ckt.logAd(C1024060cku.LIZJ);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent
    /* JADX INFO: renamed from: zo */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C289640BWw.LIZ();
    }

    public final void Bo(String str, boolean z) {
        C702650RhH c702650RhHE71;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adjustCaptionPositionIfNeed, operatorKey:");
        sbLIZ.append(str);
        sbLIZ.append(", forceAdjust:");
        sbLIZ.append(z);
        C1720106oR.LJI("CommerceCaptionAssem", C2188811AlT.LIZIZ(sbLIZ));
        if ((!GH1() && !z) || this.LLJJJ <= 0) {
            return;
        }
        this.LLJJJJ = this.LLJJJIL;
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 38);
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJIJIL.getValue();
        if (interactAreaCommonAbility != null && (c702650RhHE71 = interactAreaCommonAbility.E71()) != null) {
            if (str == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LLJJJIL);
                sbLIZ2.append("_show");
                str = C2188811AlT.LIZIZ(sbLIZ2);
            }
            c702650RhHE71.LIZ(str, new C702670RhJ(awS590S0100000_11));
        }
    }

    public final void Co(String str, boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetCaptionPositionIfNeed, operatorKey:");
        sbLIZ.append(str);
        C1720106oR.LJI("CommerceCaptionAssem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJ = -1;
        String str2 = this.LLJJJJ;
        if (str2 != null && str2.length() != 0) {
            this.LLJJJJ = null;
            ARunnableS16S1100000_11 aRunnableS16S1100000_11 = new ARunnableS16S1100000_11(this, str, 4);
            if (z) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C01LY(aRunnableS16S1100000_11, null), 2);
                return;
            }
            aRunnableS16S1100000_11.run();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj).getAweme();
        if (aweme2 != null && C20703515zt.LJJI(aweme2)) {
            this.LLJJJJJIL = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C05FK(this, null), new C1629806Zs(new C05RH(new C414301jJ(C746760TRa.LIZ().LJJIII(), C746760TRa.LIZ().LJIJI(), new C1613206Ti(this, null))))));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility
    public final void d52(int i, String str) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCardShow, tag:");
        sbLIZ.append(str);
        sbLIZ.append(", height:");
        sbLIZ.append(i);
        C1720106oR.LJI("CommerceCaptionAssem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJIL = str;
        this.LLJJJ = i;
        Bo(null, false);
    }
}
