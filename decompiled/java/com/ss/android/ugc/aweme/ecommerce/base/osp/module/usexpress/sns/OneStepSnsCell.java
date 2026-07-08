package com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.sns;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03O0;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C719702rT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsOptionButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OneStepSnsCell extends ECPowerCell<C719702rT> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public static final int LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public static final int LLJJL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public Boolean LLJJ;
    public int LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OneStepSnsCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public OneStepSnsCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 781);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(119);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 770), awS545S0100000_1, AFwS207S0000000_19.get$arr$(184), new AwS545S0100000_1((C03K6) this, 773), new AwS545S0100000_1((C03K6) this, 775), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 777), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1257), null, new AwS545S0100000_1((C03K6) this, 779));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 774);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 776);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 778);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 70));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1258);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1259);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1260);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1261);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1262);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 780), awS545S0100000_1, AFwS207S0000000_19.get$arr$(185), new AwS545S0100000_1((C03K6) this, 782), new AwS545S0100000_1((C03K6) this, 783), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 784), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1263), null, new AwS545S0100000_1((C03K6) this, 785));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 786), awS545S0100000_1, AFwS207S0000000_19.get$arr$(183), new AwS545S0100000_1((C03K6) this, 763), new AwS545S0100000_1((C03K6) this, 764), new AwS545S0100000_1((C03K6) this, 766), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 768));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(45));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(44));
        this.LLJILJILJ = "";
        this.LLJILLL = "";
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 767));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 765));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 772));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 771));
        this.LLJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 769));
    }

    public static LinkedHashMap L5(C719702rT c719702rT) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C03O0.LIZ.getClass();
        linkedHashMap.putAll(C03O0.LIZIZ);
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("module_name", "subscribe_and_save");
        String str = c719702rT.LLIZLLLIL;
        if (str != null) {
            linkedHashMap.put("product_id", str);
        }
        String str2 = c719702rT.LLJ;
        if (str2 != null) {
            linkedHashMap.put("sku_id", str2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r23) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.sns.OneStepSnsCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.app, viewGroup, false);
        viewTd.setTag("one_step_sns_view_tag");
        return viewTd;
    }

    public final LinkedHashMap<String, Object> N5(C719702rT c719702rT, SnsPeriodInfo snsPeriodInfo) {
        int i;
        LinkedHashMap<String, Object> linkedHashMapL5 = L5(c719702rT);
        linkedHashMapL5.putAll((Map) this.LLJI.getValue());
        String str = snsPeriodInfo.periodText;
        Object obj = "";
        if (str == null) {
            str = "";
        }
        linkedHashMapL5.put("button_name", str);
        linkedHashMapL5.put("button_type", "subscription_period");
        Object obj2 = snsPeriodInfo.periodUnit;
        if (obj2 == null) {
            obj2 = "";
        }
        linkedHashMapL5.put("selected_unit", obj2);
        Integer num = snsPeriodInfo.period;
        if (num != null) {
            obj = num;
        }
        linkedHashMapL5.put("selected_time", obj);
        if (this.LLJILJIL && Intrinsics.LJFF(snsPeriodInfo.periodText, this.LLJILLL)) {
            i = 1;
        } else {
            i = 0;
        }
        linkedHashMapL5.put("is_default_pre_select", Integer.valueOf(i));
        Object obj3 = ((Map) this.LLJIJIL.getValue()).get("module_type");
        if (obj3 != null) {
            linkedHashMapL5.put("module_type", obj3);
        }
        return linkedHashMapL5;
    }

    public final LinkedHashMap<String, Object> P5(C719702rT c719702rT, SnsOptionButton snsOptionButton) {
        LinkedHashMap<String, Object> linkedHashMapL5 = L5(c719702rT);
        linkedHashMapL5.putAll((Map) this.LLJI.getValue());
        String str = snsOptionButton.buttonName;
        if (str == null) {
            str = "";
        }
        linkedHashMapL5.put("button_name", str);
        linkedHashMapL5.put("button_type", "purchase_type");
        linkedHashMapL5.put("is_default_pre_select", Integer.valueOf(Intrinsics.LJFF(snsOptionButton.buttonName, this.LLJILJILJ) ? 1 : 0));
        Object obj = ((Map) this.LLJIJIL.getValue()).get("module_type");
        if (obj != null) {
            linkedHashMapL5.put("module_type", obj);
        }
        return linkedHashMapL5;
    }
}
