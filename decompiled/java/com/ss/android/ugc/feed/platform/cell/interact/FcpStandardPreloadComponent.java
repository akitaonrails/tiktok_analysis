package com.ss.android.ugc.feed.platform.cell.interact;

import X.AnonymousClass0956;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C13LE;
import X.C2217381BqS;
import X.C2238831Cjx;
import X.C452501pT;
import X.C687700QyG;
import X.C700350RdZ;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardDataPreloadScene;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpStandardPreloadComponent extends BaseCellLogicComponent<FcpStandardPreloadComponent> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public AnonymousClass0956 LLJJIJIL;
    public boolean LLJJJJ;
    public volatile IFcpPolicyAbility LLJJJJJIL;
    public volatile FcpProtocolAbility LLJJJJLIIL;
    public InterfaceC665370Q7z LLJJL;
    public C0QSJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(554));
    public final Set<String> LLJJIJIIJIL = new LinkedHashSet();
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1188));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2146));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FcpStandardPreloadComponent.class, "fcpPolicyAbility", "getFcpPolicyAbility()Lcom/ss/android/ugc/feed/platform/componentmanager/IFcpPolicyAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FcpStandardPreloadComponent.class, "fcpProtocolAbility", "getFcpProtocolAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/FcpProtocolAbility;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (((Boolean) this.LLJJJ.getValue()).booleanValue() || ((Boolean) this.LLJJJIL.getValue()).booleanValue()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0Rdb
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJJIII;
                }
            }, null, new C700350RdZ(), 6);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0RO0
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJ;
                }
            }, null, AFwS294S0000000_11.get$arr$(204), 6);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    public final C0QSJ Bo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJLIIIJLLLLLLLZ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CellInteractAreaScope.class});
        this.LLJJLIIIJLLLLLLLZ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final IFcpPolicyAbility Co() {
        IFcpPolicyAbility iFcpPolicyAbility = this.LLJJJJJIL;
        if (iFcpPolicyAbility == null) {
            synchronized (this) {
                iFcpPolicyAbility = this.LLJJJJJIL;
                if (iFcpPolicyAbility == null) {
                    C0QSJ c0qsjBo = Bo();
                    IFcpPolicyAbility iFcpPolicyAbility2 = c0qsjBo != null ? (IFcpPolicyAbility) c0qsjBo.getAbility(IFcpPolicyAbility.class) : null;
                    this.LLJJJJJIL = iFcpPolicyAbility2;
                    return iFcpPolicyAbility2;
                }
            }
        }
        return iFcpPolicyAbility;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJL() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJJIJIIJIL.clear();
        this.LLJJJJ = false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C2238831Cjx.LIZJ(new FcpStandardDataPreloadScene(null), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Eo(double r25) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.FcpStandardPreloadComponent.Eo(double):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
