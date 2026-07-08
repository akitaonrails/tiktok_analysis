package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C03O0;
import X.C701302oV;
import X.C719702rT;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.sns.OneStepSnsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsOptionButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AkS2S0310000_1 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS2S0310000_1 akS2S0310000_1, View view) {
        SnsPeriodInfo snsPeriodInfo;
        if (!akS2S0310000_1.z3) {
            C03O0 c03o0 = C03O0.LIZ;
            LinkedHashMap<String, Object> linkedHashMapP5 = ((OneStepSnsCell) akS2S0310000_1.l0).P5((C719702rT) akS2S0310000_1.l1, (SnsOptionButton) akS2S0310000_1.l2);
            c03o0.getClass();
            C03O0.LLF("tiktokec_button_click", linkedHashMapP5);
            AssemVMLazy assemVMLazy = ((OneStepSnsCell) akS2S0310000_1.l0).LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = OneStepSnsCell.LLJJJIL;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) assemVMLazy.getValue();
            C719702rT c719702rT = (C719702rT) akS2S0310000_1.l1;
            boolean z = !c719702rT.LIZLLL();
            BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
            AwS615S0100000_1 awS615S0100000_1 = new AwS615S0100000_1(orderSubmitAssemViewModel, 86);
            AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(orderSubmitAssemViewModel, 410);
            awS615S0100000_1.invoke(c719702rT.LLJ, c719702rT.LLIZLLLIL);
            SnsInfo snsInfoLIZIZ = C701302oV.LIZIZ(c719702rT.LLJ, c719702rT.LLIZLLLIL, billInfoData);
            if (snsInfoLIZIZ == null && (snsInfoLIZIZ = c719702rT.LLIZ) == null) {
                snsInfoLIZIZ = new SnsInfo(null, null, null, null, null, null, null, null, null);
            }
            if (z) {
                snsPeriodInfo = snsInfoLIZIZ.selectPeriodInfoCache;
                if (snsPeriodInfo == null) {
                    snsPeriodInfo = snsInfoLIZIZ.snsPeriodInfo;
                }
            } else {
                snsPeriodInfo = null;
            }
            SnsPeriodInfo snsPeriodInfoLIZIZ = c719702rT.LIZIZ();
            if (snsPeriodInfoLIZIZ == null && (snsPeriodInfoLIZIZ = snsInfoLIZIZ.selectPeriodInfoCache) == null) {
                snsPeriodInfoLIZIZ = snsInfoLIZIZ.snsPeriodInfo;
            }
            awS580S0100000_1.invoke(SnsInfo.LIZ(snsInfoLIZIZ, snsPeriodInfo, Boolean.valueOf(z), snsPeriodInfoLIZIZ, 318));
        }
    }

    public static final void LIZ$1(AkS2S0310000_1 akS2S0310000_1, View view) {
        if (!akS2S0310000_1.z3) {
            C03O0 c03o0 = C03O0.LIZ;
            LinkedHashMap<String, Object> linkedHashMapN5 = ((OneStepSnsCell) akS2S0310000_1.l0).N5((C719702rT) akS2S0310000_1.l1, (SnsPeriodInfo) akS2S0310000_1.l2);
            c03o0.getClass();
            C03O0.LLF("tiktokec_button_click", linkedHashMapN5);
            AssemVMLazy assemVMLazy = ((OneStepSnsCell) akS2S0310000_1.l0).LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = OneStepSnsCell.LLJJJIL;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) assemVMLazy.getValue();
            C719702rT c719702rT = (C719702rT) akS2S0310000_1.l1;
            SnsPeriodInfo snsPeriodInfo = (SnsPeriodInfo) akS2S0310000_1.l2;
            BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
            AwS615S0100000_1 awS615S0100000_1 = new AwS615S0100000_1(orderSubmitAssemViewModel, 87);
            AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(orderSubmitAssemViewModel, 412);
            Boolean bool = snsPeriodInfo.isSelect;
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.LJFF(bool, bool2)) {
                awS615S0100000_1.invoke(c719702rT.LLJ, c719702rT.LLIZLLLIL);
                SnsInfo snsInfoLIZIZ = C701302oV.LIZIZ(c719702rT.LLJ, c719702rT.LLIZLLLIL, billInfoData);
                if (snsInfoLIZIZ == null && (snsInfoLIZIZ = c719702rT.LLIZ) == null) {
                    snsInfoLIZIZ = new SnsInfo(null, null, null, null, null, null, null, null, null);
                }
                awS580S0100000_1.invoke(SnsInfo.LIZ(snsInfoLIZIZ, snsPeriodInfo, bool2, snsPeriodInfo, 318));
            }
        }
    }

    public AkS2S0310000_1(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.z3 = z;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
