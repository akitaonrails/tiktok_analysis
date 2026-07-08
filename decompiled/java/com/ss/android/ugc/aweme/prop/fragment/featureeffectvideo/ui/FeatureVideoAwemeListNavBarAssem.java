package com.ss.android.ugc.aweme.prop.fragment.featureeffectvideo.ui;

import X.AbstractC1250290idn;
import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C0WZX;
import X.C1250250idj;
import X.C1250300ido;
import X.C1252710ihh;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C1559260qg8;
import X.C1565750qqb;
import X.C1575040r5a;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC638250P1r;
import X.InterfaceC1575020r5Y;
import X.InterfaceC1575030r5Z;
import X.InterfaceC2217461Bqa;
import X.InterfaceC447510Hgj;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeatureVideoAwemeListNavBarViewModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeatureVideoAwemeListNavBarAssem extends UIContentAssem implements InterfaceC1575020r5Y {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1565750qqb.class, "hierarchy_data_feature_video"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 840));
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeatureVideoAwemeListNavBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/prop/fragment/featurevideo/viewmodel/FeatureVideoAwemeListNavBarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = 8;
    }

    public FeatureVideoAwemeListNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeatureVideoAwemeListNavBarViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 841), AFwS264S0000000_24.get$arr$(250), null, true);
    }

    private final void Oo() {
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0r5O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1556870qcH) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 58), 6);
    }

    @Override // X.InterfaceC1575020r5Y, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final TuxNavBar Jo() {
        return (TuxNavBar) this.LLJ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0r5a] */
    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: Go, reason: merged with bridge method [inline-methods] */
    public C1575040r5a lt() {
        return new InterfaceC447510Hgj() { // from class: X.0r5a
        };
    }

    public final C1565750qqb Ho() {
        return (C1565750qqb) this.LLIZLLLIL.getValue();
    }

    public final FeatureVideoAwemeListNavBarViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (FeatureVideoAwemeListNavBarViewModel) assemVMLazy.getValue();
    }

    public final void So() {
        Aweme awemeUa = ((InterfaceC1575030r5Z) C1252710ihh.LIZ(this, C13LE.LIZ(InterfaceC1575030r5Z.class), null)).ua();
        Intent intent = new Intent();
        intent.putExtra("extra_related_item", awemeUa);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C2204961BRm.LLJJIJIL(-1, intent, c19egLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bI+A2iDFBuAUxrsQgpUE9+a3BIpl1vHG4Jal2+zAk5tqBoKQ2cg/4yIThbOy9OAJMFCP2mC3iGCU3VaX6SGOKTAP", null));
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            c19egLIZ2.finish();
        }
    }

    private final void No() {
        String string;
        String string2;
        Resources resources;
        String string3;
        Resources resources2;
        Resources resources3;
        TuxNavBar tuxNavBarJo = Jo();
        tuxNavBarJo.LJIIZILJ(true);
        C0OM1 c0om1 = new C0OM1();
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1250300ido c1250300ido = new C1250300ido();
        Context context = tuxNavBarJo.getContext();
        String str = "";
        if (context == null || (resources3 = context.getResources()) == null || (string = resources3.getString(2131834508)) == null) {
            string = "";
        }
        c1250300ido.LIZJ = string;
        c1250300ido.LJ = true;
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ(new AwS568S0100000_24(this, 839));
        abstractC1250290idnArr[0] = c1250300ido;
        c0om1.LJ(abstractC1250290idnArr);
        C1250250idj c1250250idj = new C1250250idj();
        Context context2 = tuxNavBarJo.getContext();
        if (context2 == null || (resources2 = context2.getResources()) == null || (string2 = resources2.getString(2131834514)) == null) {
            string2 = "";
        }
        c1250250idj.LIZJ = string2;
        c0om1.LIZJ = c1250250idj;
        AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
        C1250300ido c1250300ido2 = new C1250300ido();
        c1250300ido2.LIZIZ = "save";
        Context context3 = tuxNavBarJo.getContext();
        if (context3 != null && (resources = context3.getResources()) != null && (string3 = resources.getString(2131834512)) != null) {
            str = string3;
        }
        c1250300ido2.LIZJ = str;
        c1250300ido2.LJ = false;
        c1250300ido2.LIZLLL = EnumC638250P1r.PRIMARY;
        c1250300ido2.LIZ(new AwS425S0200000_24(this, tuxNavBarJo, 33));
        abstractC1250290idnArr2[0] = c1250300ido2;
        c0om1.LIZIZ(abstractC1250290idnArr2);
        c0om1.LIZLLL = true;
        tuxNavBarJo.setNavActions(c0om1);
    }

    @Override // X.InterfaceC1575020r5Y
    public void LLFII() {
        Jo().LJJ(AFwS264S0000000_24.get$arr$(249), "save");
    }

    @Override // X.InterfaceC1575020r5Y
    public void LLIZLLLIL() {
        Jo().LJJ(AFwS264S0000000_24.get$arr$(248), "save");
    }

    public final void L1(int i) {
        Activity activityLIZ;
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        No();
        Oo();
    }
}
