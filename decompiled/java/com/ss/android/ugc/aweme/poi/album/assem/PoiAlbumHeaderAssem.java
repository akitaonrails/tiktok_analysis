package com.ss.android.ugc.aweme.poi.album.assem;

import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C1183770guV;
import X.C1185340gx2;
import X.C1185350gx3;
import X.C1186250gyV;
import X.C1226204qy;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C848230XPh;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumHeaderAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1185350gx3.class, "PoiAlbumHierarchyData"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 763));
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiAlbumHeaderAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/album/PoiAlbumViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiAlbumHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiAlbumViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 762), AFwS256S0000000_18.get$arr$(252), null, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxNavBar tuxNavBar = ((C1186250gyV) this.LLJ.getValue()).LLILLJJLI;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 761));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = view.getContext().getString(2131844687);
        c0om1.LIZJ = c1250250idj;
        C1185340gx2.LIZ.getClass();
        if (!C1226204qy.LIZ() && C1183770guV.LIZ() && C848230XPh.LL.LJI()) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_arrow_turn_up_right;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new AwS419S0200000_18(this, view, 52));
            c0om1.LIZIZ(c1251150ifB2);
        }
        tuxNavBar.setNavActions(c0om1);
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gyS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1186500gyu) obj).LL;
            }
        }, this, null, null, null, new AwS384S0200000_18(this, view, 71), 28, null);
    }
}
