package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem;

import X.C019F;
import X.C01GW;
import X.C0KC4;
import X.C0KC5;
import X.C0KC9;
import X.C0KCC;
import X.C0KCM;
import X.C0KCS;
import X.C0KCX;
import X.C0KDQ;
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
import X.C452501pT;
import X.C457801qK;
import X.C513190KAr;
import X.C513520KBy;
import X.C521940KdU;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1555100qZQ;
import X.InterfaceC201986141o;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.bridge.SubscriptionBridgeViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageSheet;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS93S0201000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageMultiMonthAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final List<C0KCS> LLJJI;
    public final Map<C0KCM, Integer> LLJJIII;
    public List<? extends C0KCX<C0KCM>> LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C0KC4 LLJJJ;
    public final AwS586S0100000_7 LLJJJIL;
    public final AwS586S0100000_7 LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubPackageMultiMonthAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fii;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubPackageMultiMonthAssem() {
        final C1163430gNh c1163430gNhLIZ = C1163420gNg.LIZ(new InterfaceC201986141o() { // from class: X.0KCT
            @Override // X.InterfaceC201986141o
            public final void LIZ(Context context, int i, View view, Function1 function1) {
                ViewGroup viewGroup;
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(view.getContext());
                if (layoutInflaterLIZLLL == null) {
                    layoutInflaterLIZLLL = C786410Ut5.ne(context);
                }
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                function1.invoke(C786410Ut5.Td(layoutInflaterLIZLLL, i, viewGroup, false));
            }
        });
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopNavigationBarAssem.class);
        final C0KCM c0kcm = C0KCM.TOP_NAVIGATION_ASSEM;
        final C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ScrollablePackageContentAssem.class);
        final C0KCM c0kcm2 = C0KCM.CONTENT_ASSEM;
        final C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BottomSubscribeComponent.class);
        final C0KCM c0kcm3 = C0KCM.BOTTOM_ASSEM;
        this.LLJJI = C1697810uHb.LJIIJJI(new C0KCX<C0KCM>(c19719912DlLIZ, c0kcm, c1163430gNhLIZ) { // from class: X.0KCS
            public final C13IQ<? extends UISlotAssem> LIZ;
            public final C0KCM LIZIZ;
            public final C1163440gNi LIZJ;

            @Override // X.C0KCX
            public final /* bridge */ /* synthetic */ C0KCM LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C0KCX
            public final C1163440gNi LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C0KCX
            public final C13IQ<? extends UISlotAssem> getType() {
                return this.LIZ;
            }

            {
                this.LIZ = c19719912DlLIZ;
                this.LIZIZ = c0kcm;
                this.LIZJ = c1163430gNhLIZ;
            }
        }, new C0KCX<C0KCM>(c19719912DlLIZ2, c0kcm2, c1163430gNhLIZ) { // from class: X.0KCS
            public final C13IQ<? extends UISlotAssem> LIZ;
            public final C0KCM LIZIZ;
            public final C1163440gNi LIZJ;

            @Override // X.C0KCX
            public final /* bridge */ /* synthetic */ C0KCM LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C0KCX
            public final C1163440gNi LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C0KCX
            public final C13IQ<? extends UISlotAssem> getType() {
                return this.LIZ;
            }

            {
                this.LIZ = c19719912DlLIZ2;
                this.LIZIZ = c0kcm2;
                this.LIZJ = c1163430gNhLIZ;
            }
        }, new C0KCX<C0KCM>(c19719912DlLIZ3, c0kcm3, c1163430gNhLIZ) { // from class: X.0KCS
            public final C13IQ<? extends UISlotAssem> LIZ;
            public final C0KCM LIZIZ;
            public final C1163440gNi LIZJ;

            @Override // X.C0KCX
            public final /* bridge */ /* synthetic */ C0KCM LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C0KCX
            public final C1163440gNi LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C0KCX
            public final C13IQ<? extends UISlotAssem> getType() {
                return this.LIZ;
            }

            {
                this.LIZ = c19719912DlLIZ3;
                this.LIZIZ = c0kcm3;
                this.LIZJ = c1163430gNhLIZ;
            }
        });
        this.LLJJIII = C2097608Jq.LJIIIIZZ(new Pair(c0kcm, Integer.valueOf(R.id.ybq)), new Pair(c0kcm2, Integer.valueOf(R.id.wdw)), new Pair(c0kcm3, Integer.valueOf(R.id.ccb)));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ4, 442), AFwS237S0000000_7.get$arr$(203), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 441));
        this.LLJJJIL = new AwS586S0100000_7(this, 281);
        this.LLJJJJ = new AwS586S0100000_7(this, 280);
    }

    public final C0KC4 hp() {
        if (this.LLJJJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0KC4.class, null);
            this.LLJJJ = interfaceC1555100qZQLIZIZ != null ? (C0KC4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJJ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C513520KBy c513520KBy = SubPackagePageSheet.LLJZIJLIL;
        C0KC4 c0kc4Hp = hp();
        c513520KBy.getClass();
        C513520KBy.LIZ(this, c0kc4Hp);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0KC4 c0kc4Hp = hp();
        if (c0kc4Hp != null) {
            c0kc4Hp.LLJIJIL = true;
        }
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
        C0KCC c0kcc;
        C0KCC c0kcc2;
        C0KC5 c0kc5;
        super.onViewCreated(view);
        hp();
        this.LLJJIJI = null;
        List<C0KCS> list = this.LLJJI;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C0KCS c0kcs : list) {
            linkedHashMap.put(c0kcs.LIZ(), c0kcs);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        List<? extends C0KCX<C0KCM>> list2 = this.LLJJIJI;
        if (list2 != null) {
            for (C0KCX<C0KCM> c0kcx : list2) {
                linkedHashMap2.put(c0kcx.LIZ(), c0kcx);
            }
        }
        for (C0KCX c0kcx2 : C13LP.LLIIII(linkedHashMap2.values())) {
            Integer num = this.LLJJIII.get(c0kcx2.LIZ());
            if (num == null) {
                break;
            } else {
                C723850SaN.LIZLLL(this, new AwS93S0201000_7((UIAssem) this, (UIAssem) c0kcx2, (C0KCX<Enum<Object>>) num.intValue(), 1));
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0KEs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILLJJLI;
            }
        }, C736820SvI.LJ(), new AwS621S0100000_7(this, 86), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0KCc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLJ;
            }
        }, null, new AwS621S0100000_7(this, 88), 6);
        C457801qK.LIZ(new C521940KdU(((SubscriptionBridgeViewModel) this.LLJJIJIL.getValue()).LL, 2), this, new C513190KAr(this, null));
        C0KC4 c0kc4Hp = hp();
        if (c0kc4Hp != null && (c0kc5 = c0kc4Hp.LLIZ) != null) {
            c0kc5.LIZIZ = "tpl_loading";
        }
        C0KDQ c0kdq = C0KDQ.LIZ;
        C0KC4 c0kc4Hp2 = hp();
        if (c0kc4Hp2 != null && (c0kcc2 = c0kc4Hp2.LL) != null) {
            str = c0kcc2.LJII;
        } else {
            str = null;
        }
        C0KC4 c0kc4Hp3 = hp();
        if (c0kc4Hp3 != null) {
            map = c0kc4Hp3.LLILLL;
        } else {
            map = null;
        }
        c0kdq.getClass();
        C0KDQ.LJII(str, "sub_package_multi_month_assem", "init", map);
        SubPackagePageAssemVM subPackagePageAssemVM = (SubPackagePageAssemVM) this.LLJJIJIIJIL.getValue();
        C0KC9 c0kc9 = C0KC9.LIZ;
        C0KC4 c0kc4Hp4 = hp();
        if (c0kc4Hp4 != null) {
            c0kcc = c0kc4Hp4.LL;
        } else {
            c0kcc = null;
        }
        c0kc9.getClass();
        subPackagePageAssemVM.vQ2(C0KC9.LIZJ(c0kcc, null));
    }
}
