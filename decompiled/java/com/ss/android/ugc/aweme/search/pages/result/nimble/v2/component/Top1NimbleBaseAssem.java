package com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component;

import X.C01GW;
import X.C07LW;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C444200HbO;
import X.C452501pT;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC685100Qu4;
import X.InterfaceC712990Rxx;
import X.InterfaceC724760Sbq;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.pov.viewmodel.SearchPovCardVM;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class Top1NimbleBaseAssem<T extends InterfaceC685100Qu4> extends ReusedUISlotAssem<Top1NimbleBaseAssem<T>> implements InterfaceC712990Rxx<T> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10((Top1NimbleBaseAssem) this, 614));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10((Top1NimbleBaseAssem) this, 616));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10((Top1NimbleBaseAssem) this, 613));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10((Top1NimbleBaseAssem) this, 615));
    public final InterfaceC1731706qJ LLJLL;
    public final C01GW LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(Top1NimbleBaseAssem.class, "povCardVM", "getPovCardVM()Lcom/ss/android/ugc/aweme/search/pages/result/pov/viewmodel/SearchPovCardVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public Top1NimbleBaseAssem() {
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchPovCardVM.class);
        this.LLJLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), interfaceC724760SbqLJJJIL, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 617), null, AFwS241S0000000_10.get$arr$(283));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10((Top1NimbleBaseAssem) this, 618));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
    }

    public boolean op(T t) {
        return t != null;
    }

    public abstract T tp();

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final InterfaceC665370Q7z LLIIJLIL() {
        return (InterfaceC665370Q7z) this.LLJLLIL.getValue();
    }

    public final Map<String, Object> up() {
        C07LW c07lw;
        INimbleContainerAbility iNimbleContainerAbility = (INimbleContainerAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        Object objUv2 = iNimbleContainerAbility != null ? iNimbleContainerAbility.uv2() : null;
        if (!(objUv2 instanceof C07LW) || (c07lw = (C07LW) objUv2) == null) {
            return null;
        }
        return c07lw.getData();
    }

    public final boolean zp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((InterfaceC685100Qu4) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJIIIZ();
    }

    public final boolean sp() {
        Map<String, Object> mapUp = up();
        Object objLIZIZ = mapUp != null ? C444200HbO.LIZIZ("async_render", mapUp) : null;
        return Intrinsics.LJFF(objLIZIZ instanceof Boolean ? objLIZIZ : null, Boolean.TRUE);
    }

    public final String yp() {
        String str;
        Map<String, Object> mapUp = up();
        Object objLIZIZ = mapUp != null ? C444200HbO.LIZIZ("item_id", mapUp) : null;
        return (!(objLIZIZ instanceof String) || (str = (String) objLIZIZ) == null) ? "" : str;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] */
    public void up(T t) {
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
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
