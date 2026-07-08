package com.ss.android.ugc.aweme.api.component.cip;

import X.C01GW;
import X.C0RF0;
import X.C1017070cZd;
import X.C1022620cia;
import X.C13LE;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1017820caq;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS100S1200000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class CIPLogicComponent extends BaseCellLogicComponent<CIPLogicComponent> {
    public AwS100S1200000_16 LLJJIJI;
    public final C01GW LLJJIJIIJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS252S0000000_16.get$arr$(82));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(103));

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0cay
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(6), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0caz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(7), 4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    public final InterfaceC1017820caq Bo() {
        return (InterfaceC1017820caq) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        InterfaceC1017820caq interfaceC1017820caqBo;
        AwS100S1200000_16 awS100S1200000_16 = this.LLJJIJI;
        if (awS100S1200000_16 != null && (interfaceC1017820caqBo = Bo()) != null) {
            interfaceC1017820caqBo.LJIILLIIL(awS100S1200000_16);
        }
        this.LLJJIJI = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        InterfaceC1017820caq interfaceC1017820caqBo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderPause ");
        sbLIZ.append(i);
        C1022620cia.LJ("CIPLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 3 && (interfaceC1017820caqBo = Bo()) != null) {
            interfaceC1017820caqBo.LIZLLL(null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        Object obj;
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderResume ");
        sbLIZ.append(i);
        C1022620cia.LJ("CIPLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1017820caq interfaceC1017820caqBo = Bo();
        if (interfaceC1017820caqBo != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            String packageName = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            VideoItemParams videoItemParams = (VideoItemParams) obj;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null) {
                packageName = awemeRawAdLJJIJLIJ.getPackageName();
            }
            interfaceC1017820caqBo.LIZLLL(packageName);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ2;
        String packageName;
        C0RF0 c0rf0;
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        InterfaceC1017820caq interfaceC1017820caqBo = Bo();
        if (interfaceC1017820caqBo != null) {
            Aweme aweme2 = videoItemParams2.getAweme();
            if (aweme2 != null) {
                awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme2);
            } else {
                awemeRawAdLJJIJLIJ = null;
            }
            if (interfaceC1017820caqBo.LJIIIZ(awemeRawAdLJJIJLIJ) && (aweme = videoItemParams2.getAweme()) != null && (awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme)) != null && (packageName = awemeRawAdLJJIJLIJ2.getPackageName()) != null && (c0rf0 = jm().LIZLLL) != null && (str = c0rf0.LJIIIZ) != null) {
                AwS100S1200000_16 awS100S1200000_16 = new AwS100S1200000_16(this, str, videoItemParams2.getAweme(), 7);
                InterfaceC1017820caq interfaceC1017820caqBo2 = Bo();
                if (interfaceC1017820caqBo2 != null) {
                    interfaceC1017820caqBo2.LJIIJ(packageName, awS100S1200000_16);
                }
                this.LLJJIJI = awS100S1200000_16;
            }
        }
    }
}
