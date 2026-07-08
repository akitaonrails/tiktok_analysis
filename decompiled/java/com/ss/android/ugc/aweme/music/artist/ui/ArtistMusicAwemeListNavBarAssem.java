package com.ss.android.ugc.aweme.music.artist.ui;

import X.AbstractC1250290idn;
import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C1164620gPc;
import X.C1250250idj;
import X.C1250300ido;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC638250P1r;
import X.InterfaceC1164640gPe;
import X.InterfaceC2217461Bqa;
import X.InterfaceC447510Hgj;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicAwemeListNavBarViewModel;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class ArtistMusicAwemeListNavBarAssem extends UIContentAssem implements InterfaceC1164640gPe {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 711));
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ArtistMusicAwemeListNavBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/music/artist/viewmodel/ArtistMusicAwemeListNavBarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ArtistMusicAwemeListNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ArtistMusicAwemeListNavBarViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 712), AFwS256S0000000_18.get$arr$(218), null, true);
    }

    private final void No() {
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gPa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995830c1N) obj).LL;
            }
        }, null, AFwS302S0000000_18.get$arr$(4), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gPZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C995830c1N) obj).LLILLJJLI);
            }
        }, null, new AwS632S0100000_18(this, 81), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gPb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995830c1N) obj).LLILLL;
            }
        }, null, AFwS302S0000000_18.get$arr$(5), 6);
    }

    @Override // X.InterfaceC1164640gPe, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final TuxNavBar Ho() {
        return (TuxNavBar) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0gPc] */
    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: Go, reason: merged with bridge method [inline-methods] */
    public C1164620gPc lt() {
        return new InterfaceC447510Hgj() { // from class: X.0gPc
        };
    }

    public final ArtistMusicAwemeListNavBarViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (ArtistMusicAwemeListNavBarViewModel) assemVMLazy.getValue();
    }

    private final void Lo() {
        String string;
        String string2;
        Resources resources;
        String string3;
        Resources resources2;
        Resources resources3;
        TuxNavBar tuxNavBarHo = Ho();
        tuxNavBarHo.LJIIZILJ(true);
        C0OM1 c0om1 = new C0OM1();
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1250300ido c1250300ido = new C1250300ido();
        Context context = tuxNavBarHo.getContext();
        String str = "";
        if (context == null || (resources3 = context.getResources()) == null || (string = resources3.getString(2131834508)) == null) {
            string = "";
        }
        c1250300ido.LIZJ = string;
        c1250300ido.LJ = true;
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ(new AwS562S0100000_18(this, 709));
        abstractC1250290idnArr[0] = c1250300ido;
        c0om1.LJ(abstractC1250290idnArr);
        C1250250idj c1250250idj = new C1250250idj();
        Context context2 = tuxNavBarHo.getContext();
        if (context2 == null || (resources2 = context2.getResources()) == null || (string2 = resources2.getString(2131834514)) == null) {
            string2 = "";
        }
        c1250250idj.LIZJ = string2;
        c0om1.LIZJ = c1250250idj;
        AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
        C1250300ido c1250300ido2 = new C1250300ido();
        c1250300ido2.LIZIZ = "save";
        Context context3 = tuxNavBarHo.getContext();
        if (context3 != null && (resources = context3.getResources()) != null && (string3 = resources.getString(2131834512)) != null) {
            str = string3;
        }
        c1250300ido2.LIZJ = str;
        c1250300ido2.LJ = false;
        c1250300ido2.LIZLLL = EnumC638250P1r.PRIMARY;
        c1250300ido2.LIZ(new AwS562S0100000_18(this, 710));
        abstractC1250290idnArr2[0] = c1250300ido2;
        c0om1.LIZIZ(abstractC1250290idnArr2);
        c0om1.LIZLLL = true;
        tuxNavBarHo.setNavActions(c0om1);
    }

    @Override // X.InterfaceC1164640gPe
    public void LLFII() {
        Ho().LJJ(AFwS256S0000000_18.get$arr$(217), "save");
    }

    @Override // X.InterfaceC1164640gPe
    public void LLIZLLLIL() {
        Ho().LJJ(AFwS256S0000000_18.get$arr$(216), "save");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Lo();
        No();
    }
}
