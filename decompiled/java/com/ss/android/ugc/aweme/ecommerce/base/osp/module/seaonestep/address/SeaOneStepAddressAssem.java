package com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.address;

import X.AnonymousClass0376;
import X.C01D1;
import X.C03C8;
import X.C03O0;
import X.C09R3;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1637906bB;
import X.C1741890vQh;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723002s0;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C7806033c;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import g1c.AjS60S0100000_1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaOneStepAddressAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public C723002s0 LLJJIJIIJIL;
    public AnonymousClass0376 LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaOneStepAddressAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SeaOneStepAddressAssem.class, "skuSpecViewModel", "getSkuSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SeaOneStepAddressAssem.class, "addressViewModel", "getAddressViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/address/OspAddressViewModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public SeaOneStepAddressAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS545S0100000_1(c19719912DlLIZ, 464), AFwS228S0000000_1.get$arr$(92), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SeaSkuSpecViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS545S0100000_1(c19719912DlLIZ2, 465), AFwS228S0000000_1.get$arr$(93), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(OspAddressViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS545S0100000_1(c19719912DlLIZ3, 466), AFwS228S0000000_1.get$arr$(94), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.avh;
    }

    public final SeaSkuSpecViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (SeaSkuSpecViewModel) assemVMLazy.getValue();
    }

    public final OrderSubmitAssemViewModel mp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final void up() {
        Integer num;
        Integer num2;
        LogisticTextDTO logisticTextDTO;
        Map<String, Object> map;
        Object obj;
        C723002s0 c723002s0 = this.LLJJIJIIJIL;
        if (c723002s0 != null) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapLp = lp(c723002s0);
            AnonymousClass0376 anonymousClass0376 = this.LLJJIJIL;
            if (anonymousClass0376 != null) {
                num = anonymousClass0376.LLJZIJLIL;
                num2 = anonymousClass0376.LLJJJIL;
            } else {
                num = null;
                num2 = null;
            }
            String strValueOf = String.valueOf(num2);
            AnonymousClass0376 anonymousClass03762 = this.LLJJIJIL;
            String string = (anonymousClass03762 == null || (map = anonymousClass03762.LLJLLL) == null || (obj = map.get("invalid_reason_code")) == null) ? null : obj.toString();
            LogisticDTO logisticDTO = c723002s0.LLILZIL;
            C03O0.LJJJLZIJ(c03o0, "logistics_edit_shipping", mapLp, null, null, null, null, (logisticDTO == null || (logisticTextDTO = logisticDTO.logisticText) == null) ? null : logisticTextDTO.thresholdTextEn, null, num, strValueOf, null, string, mp().LLLZLZ.LIZ("c50980.d0"), C7806033c.LJIIJ(mp()), null, null, 806780);
        }
    }

    public final boolean op() {
        SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (!(fragmentLJI instanceof SeaOneStepOrderSubmitFragment) || (seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) fragmentLJI) == null) {
            return false;
        }
        return seaOneStepOrderSubmitFragment.cS();
    }

    public static LogisticExpressionArea ip(C723002s0 c723002s0) {
        LogisticArea logisticArea;
        List<LogisticExpressionArea> list;
        String str;
        LogisticPanelModule logisticPanelModule = c723002s0.LLJJIJIIJIL;
        LogisticExpressionArea logisticExpressionArea = null;
        if (logisticPanelModule == null || (logisticArea = logisticPanelModule.logisticArea) == null || (list = logisticArea.logisticExpressionAreas) == null) {
            return null;
        }
        Iterator<LogisticExpressionArea> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LogisticExpressionArea next = it2.next();
            String str2 = c723002s0.LLJJJ;
            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = next.extraInfo;
            if (logisticsExpressionAreaExtraInfo != null) {
                str = logisticsExpressionAreaExtraInfo.logisticsServiceId;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                logisticExpressionArea = next;
                break;
            }
        }
        LogisticExpressionArea logisticExpressionArea2 = logisticExpressionArea;
        if (logisticExpressionArea2 == null) {
            return (LogisticExpressionArea) C13LP.LJJJLL(list);
        }
        return logisticExpressionArea2;
    }

    public final LogisticDTO hp(LogisticExpressionArea logisticExpressionArea) {
        String str;
        String str2;
        String str3;
        String str4;
        HashMap<String, Object> mapLJIIJ;
        C723002s0 c723002s0 = this.LLJJIJIIJIL;
        String str5 = null;
        if (c723002s0 != null) {
            str = c723002s0.LLJJJ;
        } else {
            str = null;
        }
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = logisticExpressionArea.extraInfo;
        if (logisticsExpressionAreaExtraInfo != null) {
            str2 = logisticsExpressionAreaExtraInfo.logisticsServiceId;
        } else {
            str2 = null;
        }
        Boolean boolValueOf = Boolean.valueOf(Intrinsics.LJFF(str, str2));
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo2 = logisticExpressionArea.extraInfo;
        if (logisticsExpressionAreaExtraInfo2 != null) {
            str3 = logisticsExpressionAreaExtraInfo2.logisticsServiceId;
        } else {
            str3 = null;
        }
        if (logisticsExpressionAreaExtraInfo2 != null) {
            str5 = logisticsExpressionAreaExtraInfo2.daInfo;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo3 = logisticExpressionArea.extraInfo;
        if (logisticsExpressionAreaExtraInfo3 != null && (str4 = logisticsExpressionAreaExtraInfo3.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str4)) != null) {
            for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(key, value.toString());
                }
            }
        }
        return new LogisticDTO(null, null, boolValueOf, null, null, null, null, null, null, null, null, str3, null, null, str5, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    public final HashMap<String, Object> lp(C723002s0 c723002s0) {
        ?? BooleanValue;
        DeliveryInstructionInfo deliveryInstructionInfo;
        Integer num;
        Boolean bool;
        LogisticArea logisticArea;
        List<LogisticExpressionArea> list;
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo;
        String str;
        HashMap<String, Object> mapLJIIJ;
        String str2;
        Map<String, String> map;
        int iIntValue = 0;
        HashMap<String, Object> mapHi1 = mp().hi1(false);
        LogisticDTO logisticDTO = c723002s0.LLILZIL;
        if (logisticDTO != null && (map = logisticDTO.eventTrackInfo) != null) {
            mapHi1.putAll(map);
        }
        LogisticPanelModule logisticPanelModule = c723002s0.LLJJIJIIJIL;
        LogisticExpressionArea logisticExpressionArea = null;
        if (logisticPanelModule != null && (logisticArea = logisticPanelModule.logisticArea) != null && (list = logisticArea.logisticExpressionAreas) != null) {
            Iterator<LogisticExpressionArea> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                LogisticExpressionArea next = it2.next();
                String str3 = c723002s0.LLJJJ;
                LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo2 = next.extraInfo;
                if (logisticsExpressionAreaExtraInfo2 != null) {
                    str2 = logisticsExpressionAreaExtraInfo2.logisticsServiceId;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str3, str2)) {
                    logisticExpressionArea = next;
                    break;
                }
            }
            LogisticExpressionArea logisticExpressionArea2 = logisticExpressionArea;
            if ((logisticExpressionArea2 != null || (logisticExpressionArea2 = (LogisticExpressionArea) C13LP.LJJJLL(list)) != null) && (logisticsExpressionAreaExtraInfo = logisticExpressionArea2.extraInfo) != null && (str = logisticsExpressionAreaExtraInfo.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
                mapHi1.putAll(mapLJIIJ);
            }
        }
        mapHi1.putAll(mp().MR2(c723002s0));
        LogisticDTO logisticDTO2 = c723002s0.LLILZIL;
        if (logisticDTO2 != null && (bool = logisticDTO2.isDefault) != null) {
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        mapHi1.put("is_default", Integer.valueOf((int) BooleanValue));
        String strIR2 = mp().iR2();
        if (strIR2 == null) {
            strIR2 = "";
        }
        mapHi1.put("delivery_info", strIR2);
        AnonymousClass0376 anonymousClass0376 = this.LLJJIJIL;
        if (anonymousClass0376 != null && (deliveryInstructionInfo = anonymousClass0376.LLJJLIIIJLLLLLLLZ) != null && (num = deliveryInstructionInfo.instructionType) != null) {
            iIntValue = num.intValue();
        }
        mapHi1.put("delivery_instruction_type", Integer.valueOf(iIntValue));
        mapHi1.put("is_clickable", 1);
        return mapHi1;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.03IG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLILZIL;
            }
        }, null, new AwS437S0200000_1(this, view, 8), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.03IH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).c;
            }
        }, null, new AwS437S0200000_1(this, view, 9), 6);
    }

    public final void tp(View view, LogisticExpressionArea logisticExpressionArea) {
        ECRichText eCRichText;
        SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment;
        List<ECRichText> list;
        TextView textView = (TextView) view.findViewById(R.id.u47);
        if (logisticExpressionArea != null && (list = logisticExpressionArea.logisticsDescriptions) != null) {
            eCRichText = (ECRichText) C13LP.LJJJLL(list);
        } else {
            eCRichText = null;
        }
        int i = 8;
        if (eCRichText == null) {
            C786410Ut5.LJLLLLLL(8, textView);
            textView.setText("");
            C786410Ut5.I7(new AjS10S0000000_1(1), textView);
            return;
        }
        C03C8.LIZJ(textView, eCRichText, "sea_one_step_logistic", null);
        C786410Ut5.I7(new AjS60S0100000_1(this, 17), textView);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (!(fragmentLJI instanceof SeaOneStepOrderSubmitFragment) || (seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) fragmentLJI) == null || seaOneStepOrderSubmitFragment.LLJLILLLLZIIL) {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(android.content.Context r64, int r65, X.AnonymousClass0376 r66, X.C723002s0 r67) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.address.SeaOneStepAddressAssem.sp(android.content.Context, int, X.0376, X.02s0):void");
    }
}
