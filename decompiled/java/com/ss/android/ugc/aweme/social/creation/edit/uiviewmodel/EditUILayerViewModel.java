package com.ss.android.ugc.aweme.social.creation.edit.uiviewmodel;

import X.AnonymousClass0951;
import X.C01GW;
import X.C054G;
import X.C05YD;
import X.C05YW;
import X.C09IC;
import X.C0PEM;
import X.C1370905Yd;
import X.C13LE;
import X.C1453840nw6;
import X.C1454460nx6;
import X.C1661820tLY;
import X.C1664740tQG;
import X.C1664770tQJ;
import X.C1666450tT1;
import X.C1666530tT9;
import X.C1666540tTA;
import X.C1666550tTB;
import X.C1BNE;
import X.C1DFH;
import X.C1DRG;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2221411Bwx;
import X.C2221461Bx2;
import X.C2296808zG;
import X.C298680BnG;
import X.C414301jJ;
import X.C452501pT;
import X.InterfaceC1456870o0z;
import X.InterfaceC1666580tTE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346201Wa;
import X.InterfaceC379610EuV;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class EditUILayerViewModel extends ViewModel implements InterfaceC1666580tTE, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LL;
    public final InterfaceC1666580tTE LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C1664740tQG LLILZLL;
    public final C01GW LLIZ;
    public final AnonymousClass0951 LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditUILayerViewModel.class, "socialEditTopComponent", "getSocialEditTopComponent()Lcom/ss/android/ugc/aweme/social/creation/edit/component/toparea/SocialEditTopUIApi;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1666580tTE
    public final C05YD<C1661820tLY> E90() {
        return this.LLILLJJLI.E90();
    }

    @Override // X.InterfaceC1666580tTE
    public final void PC1(boolean z, boolean z2) {
        this.LLILLJJLI.PC1(z, z2);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.05Vn, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    public EditUILayerViewModel(C1DRG c1drg, InterfaceC1666580tTE interfaceC1666580tTE) {
        InterfaceC346201Wa interfaceC346201WaLIZ;
        InterfaceC346201Wa interfaceC346201WaLIZ2;
        Boolean boolValueOf;
        this.LL = c1drg;
        this.LLILLJJLI = interfaceC1666580tTE;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 367));
        this.LLILLL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS569S0100000_25(this, 365));
        this.LLILZ = c01gwLIZIZ2;
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS569S0100000_25(this, 366));
        this.LLILZIL = c01gwLIZIZ3;
        C2221461Bx2 c2221461Bx2 = 0;
        c2221461Bx2 = 0;
        c2221461Bx2 = 0;
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1456870o0z.class, null);
        this.LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 368));
        if (C1454460nx6.LIZ()) {
            interfaceC346201WaLIZ = ((C1666550tTB) c01gwLIZIZ.getValue()).LLILZ;
        } else {
            interfaceC346201WaLIZ = C1BNE.LIZ(new C1666530tT9(0, 62));
        }
        if (C298680BnG.LIZ()) {
            if (C1454460nx6.LIZ()) {
                interfaceC346201WaLIZ2 = ((C2221411Bwx) c01gwLIZIZ2.getValue()).LLILZ;
            } else {
                MusicObject musicObject = ((VideoPublishEditModel) c01gwLIZIZ3.getValue()).creativeModel.musicBuzModel.music;
                if (musicObject != null) {
                    boolValueOf = Boolean.valueOf(musicObject.isCommerceMusic);
                } else {
                    boolValueOf = null;
                }
                interfaceC346201WaLIZ2 = C1BNE.LIZ(new C1666540tTA(false, boolValueOf, Boolean.valueOf(C1453840nw6.LJ((VideoPublishEditModel) c01gwLIZIZ3.getValue())), null, false, false, false, null, null, null, null, null, null, null, null, null, 524280));
            }
        } else if (C1454460nx6.LIZ()) {
            interfaceC346201WaLIZ2 = ((C2221411Bwx) c01gwLIZIZ2.getValue()).LLILZ;
        } else {
            c2221461Bx2 = 0;
            interfaceC346201WaLIZ2 = C1BNE.LIZ(new C1666540tTA(false, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, 524286));
        }
        C414301jJ c414301jJ = new C414301jJ(interfaceC346201WaLIZ, interfaceC346201WaLIZ2, new C1666450tT1(c2221461Bx2));
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII());
        C05YW.LIZ.getClass();
        this.LLIZLLLIL = C09IC.LJJIJIL(c414301jJ, c054gLIZ, C1370905Yd.LIZIZ, new EditUILayerViewState(new C1666530tT9(0, 63), new C1666540tTA(false, c2221461Bx2, c2221461Bx2, c2221461Bx2, false, false, false, c2221461Bx2, c2221461Bx2, c2221461Bx2, c2221461Bx2, c2221461Bx2, c2221461Bx2, c2221461Bx2, c2221461Bx2, c2221461Bx2, 524287)));
    }
}
