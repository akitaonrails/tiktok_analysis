package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem;

import X.C019F;
import X.C0KCA;
import X.C0KCF;
import X.C0KDR;
import X.C0KG6;
import X.C0KGG;
import X.C0KGH;
import X.C0KH0;
import X.C0KH8;
import X.C0KHN;
import X.C0KHS;
import X.C0KI5;
import X.C0KJ2;
import X.C1163420gNg;
import X.C1163430gNh;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C513550KCb;
import X.C513680KCo;
import X.C513700KCq;
import X.C513720KCs;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC514750KGr;
import X.InterfaceC1555100qZQ;
import X.InterfaceC201986141o;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageSheet;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.bytedance.android.livesdk.dataChannel.CloseNewPackagePage;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS93S0201000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageMultiMonthAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final List<C0KH8> LLJJI;
    public final Map<EnumC514750KGr, Integer> LLJJIII;
    public List<? extends C0KHS<EnumC514750KGr>> LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public C513700KCq LLJJIJIL;
    public final C0KGH LLJJJ;
    public final C0KGG LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubPackageMultiMonthAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hpt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubPackageMultiMonthAssem() {
        final C1163430gNh c1163430gNhLIZ = C1163420gNg.LIZ(new InterfaceC201986141o() { // from class: X.0KH9
            @Override // X.InterfaceC201986141o
            public final void LIZ(Context context, int i, View view, Function1 function1) {
                ViewGroup viewGroup;
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(view.getContext());
                if (layoutInflaterLJI == null) {
                    layoutInflaterLJI = C786410Ut5.ne(context);
                }
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                function1.invoke(C786410Ut5.Td(layoutInflaterLJI, i, viewGroup, false));
            }
        });
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopNavigationBarAssem.class);
        final EnumC514750KGr enumC514750KGr = EnumC514750KGr.TOP_NAVIGATION_ASSEM;
        final C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ScrollablePackageContentAssem.class);
        final EnumC514750KGr enumC514750KGr2 = EnumC514750KGr.CONTENT_ASSEM;
        final C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BottomSubscribeComponent.class);
        final EnumC514750KGr enumC514750KGr3 = EnumC514750KGr.BOTTOM_ASSEM;
        this.LLJJI = C1697810uHb.LJIIJJI(new C0KHS<EnumC514750KGr>(c19719912DlLIZ, enumC514750KGr, c1163430gNhLIZ) { // from class: X.0KH8
            public final C13IQ<? extends UISlotAssem> LIZ;
            public final EnumC514750KGr LIZIZ;
            public final C1163440gNi LIZJ;

            @Override // X.C0KHS
            public final /* bridge */ /* synthetic */ EnumC514750KGr LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C0KHS
            public final C1163440gNi LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C0KHS
            public final C13IQ<? extends UISlotAssem> getType() {
                return this.LIZ;
            }

            {
                this.LIZ = c19719912DlLIZ;
                this.LIZIZ = enumC514750KGr;
                this.LIZJ = c1163430gNhLIZ;
            }
        }, new C0KHS<EnumC514750KGr>(c19719912DlLIZ2, enumC514750KGr2, c1163430gNhLIZ) { // from class: X.0KH8
            public final C13IQ<? extends UISlotAssem> LIZ;
            public final EnumC514750KGr LIZIZ;
            public final C1163440gNi LIZJ;

            @Override // X.C0KHS
            public final /* bridge */ /* synthetic */ EnumC514750KGr LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C0KHS
            public final C1163440gNi LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C0KHS
            public final C13IQ<? extends UISlotAssem> getType() {
                return this.LIZ;
            }

            {
                this.LIZ = c19719912DlLIZ2;
                this.LIZIZ = enumC514750KGr2;
                this.LIZJ = c1163430gNhLIZ;
            }
        }, new C0KHS<EnumC514750KGr>(c19719912DlLIZ3, enumC514750KGr3, c1163430gNhLIZ) { // from class: X.0KH8
            public final C13IQ<? extends UISlotAssem> LIZ;
            public final EnumC514750KGr LIZIZ;
            public final C1163440gNi LIZJ;

            @Override // X.C0KHS
            public final /* bridge */ /* synthetic */ EnumC514750KGr LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C0KHS
            public final C1163440gNi LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C0KHS
            public final C13IQ<? extends UISlotAssem> getType() {
                return this.LIZ;
            }

            {
                this.LIZ = c19719912DlLIZ3;
                this.LIZIZ = enumC514750KGr3;
                this.LIZJ = c1163430gNhLIZ;
            }
        });
        this.LLJJIII = C2097608Jq.LJIIIIZZ(new Pair(enumC514750KGr, Integer.valueOf(R.id.ybq)), new Pair(enumC514750KGr2, Integer.valueOf(R.id.wdw)), new Pair(enumC514750KGr3, Integer.valueOf(R.id.ccb)));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, C1637806bA.LIZ, new C0KHN(c19719912DlLIZ4), new C0KJ2(), null, true);
        this.LLJJJ = new C0KGH(this);
        this.LLJJJIL = new C0KGG(this);
    }

    public final C513700KCq ip() {
        if (this.LLJJIJIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C513700KCq.class, null);
            this.LLJJIJIL = interfaceC1555100qZQLIZIZ != null ? (C513700KCq) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJIL;
    }

    public final C513680KCo hp() {
        C513700KCq c513700KCqIp = ip();
        if (c513700KCqIp != null) {
            return c513700KCqIp.LLILLJJLI;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C513720KCs c513720KCs = SubPackagePageSheet.LLLI;
        C513700KCq c513700KCqIp = ip();
        c513720KCs.getClass();
        C513720KCs.LIZ(this, c513700KCqIp);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C513700KCq c513700KCqIp = ip();
        if (c513700KCqIp != null) {
            c513700KCqIp.LLJILJILJ = true;
        }
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        super.Eo(context);
        return context;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        Map<String, String> map;
        C0KCF c0kcfLIZ;
        C513550KCb c513550KCb;
        super.onViewCreated(view);
        ip();
        this.LLJJIJI = null;
        List<C0KH8> list = this.LLJJI;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C0KH8 c0kh8 : list) {
            linkedHashMap.put(c0kh8.LIZ(), c0kh8);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        List<? extends C0KHS<EnumC514750KGr>> list2 = this.LLJJIJI;
        if (list2 != null) {
            for (C0KHS<EnumC514750KGr> c0khs : list2) {
                linkedHashMap2.put(c0khs.LIZ(), c0khs);
            }
        }
        for (C0KHS c0khs2 : C13LP.LLIIII(linkedHashMap2.values())) {
            Integer num = this.LLJJIII.get(c0khs2.LIZ());
            if (num == null) {
                break;
            } else {
                C723850SaN.LIZLLL(this, new AwS93S0201000_7((UIAssem) this, (UIAssem) c0khs2, (C0KHS<Enum<Object>>) num.intValue(), 2));
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0KIA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILLJJLI;
            }
        }, C736820SvI.LJ(), new C0KG6(this), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0KI3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLJ;
            }
        }, null, new C0KH0(this), 6);
        DataChannelGlobal.LLILZ.CQ2(CloseNewPackagePage.class, this, new C0KI5(this));
        C513700KCq c513700KCqIp = ip();
        if (c513700KCqIp != null && (c513550KCb = c513700KCqIp.LLJ) != null) {
            c513550KCb.LIZIZ = "tpl_loading";
        }
        C513680KCo c513680KCoHp = hp();
        if (c513680KCoHp != null) {
            str = c513680KCoHp.LJI;
        } else {
            str = null;
        }
        C513700KCq c513700KCqIp2 = ip();
        if (c513700KCqIp2 != null) {
            map = c513700KCqIp2.LLILZIL;
        } else {
            map = null;
        }
        C0KDR.LJII(str, "sub_package_multi_month_assem", "init", map);
        SubPackagePageAssemVM subPackagePageAssemVM = (SubPackagePageAssemVM) this.LLJJIJIIJIL.getValue();
        C513680KCo c513680KCoHp2 = hp();
        if (c513680KCoHp2 != null) {
            c0kcfLIZ = c513680KCoHp2.LIZ();
        } else {
            C513700KCq c513700KCqIp3 = ip();
            if (c513700KCqIp3 != null) {
                c0kcfLIZ = c513700KCqIp3.LL;
            } else {
                c0kcfLIZ = null;
            }
        }
        subPackagePageAssemVM.vQ2(C0KCA.LIZJ(c0kcfLIZ, null));
    }
}
