package com.ss.android.ugc.aweme.poi.mapmode.assem;

import X.C01D1;
import X.C09R3;
import X.C1180060goW;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS49S0300000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeMapVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeSearchBtnAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public C197039127h LLJI;
    public ViewGroup LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeSearchBtnAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapModeSearchBtnAssem.class, "mapVM", "getMapVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModeMapVM;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapModeSearchBtnAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 414), AFwS256S0000000_18.get$arr$(510), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapModeMapVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 415), AFwS256S0000000_18.get$arr$(511), null, true);
    }

    public final PoiMapModePageVM Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(boolean r14) {
        /*
            r13 = this;
            X.127h r0 = r13.LLJI
            r4 = 1
            r3 = 0
            if (r0 == 0) goto Lc5
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lc5
            r2 = 1
        Ld:
            X.127h r1 = r13.LLJI
            if (r1 == 0) goto Lb6
            boolean r0 = r1.LLLII
            if (r0 != r4) goto Lb6
        L15:
            X.C786410Ut5.LLLLLLJ(r1, r3)
        L18:
            if (r2 != 0) goto La7
            X.127h r0 = r13.LLJI
            if (r0 == 0) goto La7
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La7
            X.127h r0 = r13.LLJI
            if (r0 == 0) goto La7
            boolean r0 = r0.LLLII
            if (r0 != 0) goto La7
            X.0gfv r1 = X.C1174730gfv.LIZ
            com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM r0 = r13.Ho()
            com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams r0 = r0.LLILZLL
            r10 = 0
            if (r0 == 0) goto Lb4
            java.lang.String r2 = r0.getFromPoiId()
        L3b:
            com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM r0 = r13.Ho()
            com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams r0 = r0.LLILZIL
            if (r0 == 0) goto Lb2
            java.lang.String r4 = r0.getPagePoiId()
        L47:
            com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM r0 = r13.Ho()
            androidx.lifecycle.MutableLiveData r0 = r0.LLILLL
            java.lang.Object r0 = r0.getValue()
            X.0ggO r0 = (X.C1175020ggO) r0
            if (r0 == 0) goto Lb0
            java.lang.String r3 = r0.LIZ
        L57:
            com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM r0 = r13.Ho()
            com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams r0 = r0.LLILZLL
            if (r0 == 0) goto Lae
            java.lang.String r5 = r0.getPageCollectInfo()
        L63:
            com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM r0 = r13.Ho()
            com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams r0 = r0.LLILZLL
            if (r0 == 0) goto Lac
            java.lang.String r7 = r0.getPoiDetailEnterFrom()
        L6f:
            com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM r0 = r13.Ho()
            com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams r0 = r0.LLILZLL
            if (r0 == 0) goto Laa
            java.lang.String r8 = r0.getPoiDetailEnterMethod()
        L7b:
            com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM r0 = r13.Ho()
            com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams r0 = r0.LLILZLL
            if (r0 == 0) goto La8
            java.lang.String r9 = r0.getInitialPoiEnterFrom()
        L87:
            com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM r0 = r13.Ho()
            com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams r0 = r0.LLILZLL
            if (r0 == 0) goto L93
            java.lang.String r10 = r0.getInitialPoiEnterMethod()
        L93:
            X.0Q7z r11 = X.C1558520qew.LJIIL(r13)
            androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r13)
            com.bytedance.android.btm.api.model.PageFinder r12 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
            java.lang.String r6 = "show"
            r1.getClass()
            X.C1174730gfv.LJIIJJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        La7:
            return
        La8:
            r9 = r10
            goto L87
        Laa:
            r8 = r10
            goto L7b
        Lac:
            r7 = r10
            goto L6f
        Lae:
            r5 = r10
            goto L63
        Lb0:
            r3 = r10
            goto L57
        Lb2:
            r4 = r10
            goto L47
        Lb4:
            r2 = r10
            goto L3b
        Lb6:
            if (r14 == 0) goto Lbc
            if (r1 == 0) goto L18
            goto L15
        Lbc:
            if (r1 == 0) goto L18
            r0 = 8
            X.C786410Ut5.LLLLLLJ(r1, r0)
            goto L18
        Lc5:
            r2 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeSearchBtnAssem.Go(boolean):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        IPoiMapModeMapAssemAbility iPoiMapModeMapAssemAbility;
        super.onViewCreated(view);
        this.LLJIJIL = (ViewGroup) view.findViewById(R.id.trr);
        this.LLJI = (C197039127h) view.findViewById(R.id.nzs);
        Context context = getContext();
        if (context != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context);
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                C197039127h c197039127h = this.LLJI;
                if (c197039127h != null) {
                    C1180060goW.LJIIJ(C418440Gaw.LIZIZ(32), iIntValue, c197039127h);
                }
            }
            C197039127h c197039127h2 = this.LLJI;
            if (c197039127h2 != null) {
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c197039127h2, new ARunnableS49S0300000_16(c197039127h2, this, c197039127h2, 13));
            }
            C197039127h c197039127h3 = this.LLJI;
            if (c197039127h3 != null) {
                C786410Ut5.U8(c197039127h3, new ACListenerS153S0100000_18(this, 175));
            }
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gf6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1174440gfS) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 280), 6);
        InterfaceC665370Q7z interfaceC665370Q7z = Ho().LLIZ;
        if (interfaceC665370Q7z != null && (iPoiMapModeMapAssemAbility = (IPoiMapModeMapAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiMapModeMapAssemAbility.class, null)) != null) {
            iPoiMapModeMapAssemAbility.dg(new AwS597S0100000_18(this, 918));
        }
    }
}
