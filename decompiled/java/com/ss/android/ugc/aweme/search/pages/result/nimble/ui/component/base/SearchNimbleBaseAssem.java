package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base;

import X.C01GW;
import X.C0PXJ;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC684990Qtt;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC685020Qtw;
import X.InterfaceC685060Qu0;
import X.InterfaceC712990Rxx;
import X.InterfaceC724760Sbq;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import com.ss.android.ugc.aweme.nimblecard.model.search.NimbleConfig;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.pov.viewmodel.SearchPovCardVM;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS139S0400000_10;
import kotlin.jvm.internal.AwS150S0101000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchNimbleBaseAssem<T> extends ReusedUISlotAssem<SearchNimbleBaseAssem<T>> implements InterfaceC712990Rxx<InterfaceC685060Qu0> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10((SearchNimbleBaseAssem) this, 572));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchNimbleBaseAssem) this, 568));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchNimbleBaseAssem) this, 567));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchNimbleBaseAssem) this, 571));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchNimbleBaseAssem) this, 566));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchNimbleBaseAssem) this, 569));
    public final InterfaceC1731706qJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchNimbleBaseAssem.class, "povCardVM", "getPovCardVM()Lcom/ss/android/ugc/aweme/search/pages/result/pov/viewmodel/SearchPovCardVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchNimbleBaseAssem() {
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchPovCardVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), interfaceC724760SbqLJJJIL, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 570), null, AFwS241S0000000_10.get$arr$(270));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
    }

    public boolean op(T t) {
        return t != null;
    }

    public abstract T tp();

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final boolean Ap() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((InterfaceC685020Qtw) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJIIIZ();
    }

    public final InterfaceC665370Q7z LLIIJLIL() {
        return (InterfaceC665370Q7z) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final NimbleConfig sp() {
        return (NimbleConfig) this.LLJLIL.getValue();
    }

    public final int up() {
        return ((Number) this.LLJL.getValue()).intValue();
    }

    public final String yp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        String itemId = ((InterfaceC685020Qtw) (c724270Sb3 != null ? c724270Sb3.LL : null)).getItemId();
        return itemId == null ? "" : itemId;
    }

    public final Template zp() {
        return (Template) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Bp, reason: merged with bridge method [inline-methods] */
    public void up(InterfaceC685060Qu0 interfaceC685060Qu0) {
        int i;
        View viewLJJIJL = LJJIJL();
        if (op(tp())) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC685060Qu0 interfaceC685060Qu0) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC685060Qu0 interfaceC685060Qu0) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public static void Ep(SearchNimbleBaseAssem searchNimbleBaseAssem, View view, EnumC684990Qtt enumC684990Qtt, AwS554S0100000_10 awS554S0100000_10, AwS150S0101000_10 awS150S0101000_10, int i) {
        AwS150S0101000_10 awS150S0101000_102 = awS150S0101000_10;
        AwS554S0100000_10 awS554S0100000_102 = awS554S0100000_10;
        if ((i & 4) != 0) {
            awS554S0100000_102 = null;
        }
        if ((i & 8) != 0) {
            awS150S0101000_102 = null;
        }
        searchNimbleBaseAssem.getClass();
        C0PXJ c0pxj = C0PXJ.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL = searchNimbleBaseAssem.LLIIJLIL();
        AwS139S0400000_10 awS139S0400000_10 = new AwS139S0400000_10(searchNimbleBaseAssem, (SearchNimbleBaseAssem<Object>) enumC684990Qtt, (EnumC684990Qtt) awS554S0100000_102, (Function0<String>) awS150S0101000_102, (Function0<? extends Map<String, ? extends Object>>) 0);
        c0pxj.getClass();
        C0PXJ.LJFF(view, interfaceC665370Q7zLLIIJLIL, awS139S0400000_10);
    }
}
