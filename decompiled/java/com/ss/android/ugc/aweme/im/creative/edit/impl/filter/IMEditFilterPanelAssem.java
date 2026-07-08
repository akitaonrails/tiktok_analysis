package com.ss.android.ugc.aweme.im.creative.edit.impl.filter;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C11NJ;
import X.C11NZ;
import X.C11RK;
import X.C127G;
import X.C13LE;
import X.C1571910r0X;
import X.C1640210smh;
import X.C1641660sp2;
import X.C1642580sqW;
import X.C1644490stb;
import X.C19475711Hn;
import X.C19719912Dl;
import X.C1A73;
import X.C2174131A6x;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC429570Gst;
import X.InterfaceC1146704e9;
import X.InterfaceC1571900r0W;
import X.InterfaceC1572020r0i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS398S0100000_24;
import Y.AfS193S0100000_24;
import Y.AfS194S0100000_25;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.creative.edit.impl.ui.IMEditPageScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: loaded from: classes25.dex */
public final class IMEditFilterPanelAssem extends UISlotAssem implements InterfaceC1571900r0W, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 595));
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C11NJ LLJJJIL;
    public volatile C2174131A6x LLJJJJ;
    public C127G LLJJJJJIL;
    public InterfaceC665370Q7z LLJJJJLIIL;
    public C0QSJ LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMEditFilterPanelAssem.class, "featureGraph", "getFeatureGraph()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/di/IMEditFeatureGraph;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(IMEditFilterPanelAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/filter/IMEditFilterPanelVM;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cgv;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{IMEditPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IMEditPageScope.class);
        return arrayList;
    }

    public final C2174131A6x hp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJLIIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJJJLIIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{IMEditPageScope.class});
            this.LLJJL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C2174131A6x c2174131A6x = (C2174131A6x) c0qsjLIZLLL.getAbility(C2174131A6x.class);
        C687700QyG.LJ(c2174131A6x, C2174131A6x.class);
        return c2174131A6x;
    }

    public final C1A73 ip() {
        return (C1A73) this.LLJJI.getValue();
    }

    public final C1644490stb kp() {
        return (C1644490stb) this.LLJJIJI.getValue();
    }

    public final IMEditFilterPanelVM lp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (IMEditFilterPanelVM) assemVMLazy.getValue();
    }

    public IMEditFilterPanelAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMEditFilterPanelVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 597);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(177);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 598), aFwS264S0000000_24, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIII = assemVMLazy;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 181));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 180));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 179));
        this.LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 596));
        this.LLJJJIL = new C11NJ();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IMEditFilterPanelVM.class, new AObjectS398S0100000_24(this, 7)}, defaultViewModelProviderFactory);
                    this.LLJJJJJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC1571900r0W
    public final void show() {
        lp().of(true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJJIL.LIZ(((InterfaceC1572020r0i) this.LLJJIJIL.getValue()).LIZ().LJJLJLI(new AfS193S0100000_24(this, 5)));
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0r0g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572040r0k) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 44), 6);
        C11NZ<C1641660sp2<C1640210smh>> c11nzLJIJ = kp().LJIJ();
        if (c11nzLJIJ != null) {
            this.LLJJJIL.LIZ(c11nzLJIJ.LJJLJLI(new AfS193S0100000_24(this, 6)));
        }
        this.LLJJJIL.LIZ(kp().LJIIZILJ().LJJLJLI(new AfS193S0100000_24(this, 7)));
        C11RK c11rk = kp().LJIJI;
        c11rk.getClass();
        this.LLJJJIL.LIZ(new C19475711Hn(c11rk).LJJLJLI(new AfS193S0100000_24(this, 8)));
        C11RK c11rk2 = ((C1642580sqW) this.LLJJIJIIJIL.getValue()).LJI;
        c11rk2.getClass();
        this.LLJJJIL.LIZ(new C19475711Hn(c11rk2).LJJLJLI(new AfS194S0100000_25(this, 6)));
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0r0j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572040r0k) obj).LLILLL;
            }
        }, null, new AwS639S0100000_25(this, 27), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0r0f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1572040r0k) obj).LL);
            }
        }, null, new AwS638S0100000_24(this, 42), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0r0h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572040r0k) obj).LLILZ;
            }
        }, null, new AwS638S0100000_24(this, 43), 6);
        C1571910r0X value = ip().LIZ.getValue();
        synchronized (value) {
            EnumC429570Gst enumC429570Gst = EnumC429570Gst.FILTER;
            HashMap<EnumC429570Gst, List<InterfaceC1571900r0W>> map = value.LIZ;
            List<InterfaceC1571900r0W> arrayList = map.get(enumC429570Gst);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            map.put(enumC429570Gst, arrayList);
            List<InterfaceC1571900r0W> list = value.LIZ.get(enumC429570Gst);
            if (list != null) {
                list.add(this);
            }
        }
    }
}
