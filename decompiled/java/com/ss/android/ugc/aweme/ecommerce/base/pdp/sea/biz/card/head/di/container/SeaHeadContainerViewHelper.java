package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container;

import X.C19719612Di;
import X.C2188811AlT;
import X.InterfaceC1755830vnB;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.godav1.SeaPdpHeadGodaV1ViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaHeadContainerViewHelper implements ISeaHeadContainerHelper {
    public final SeaPdpHeadGodaV1ViewHolder LL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper
    public final PdpPreviewInfo BI1() {
        return this.LL.d6().LLLIILIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper
    public final boolean DL0() {
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LL.d6().LLIZ;
        return pdpEnterParam != null && pdpEnterParam.fullScreen;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper
    public final boolean rz2() {
        EntranceBubble entranceBubble;
        ProductPackStruct productPackStruct = this.LL.d6().LLJIJIL;
        if (productPackStruct == null || (entranceBubble = productPackStruct.entranceBubble) == null) {
            return false;
        }
        Integer num = entranceBubble.style;
        if (num != null && num.intValue() == 2) {
            return true;
        }
        Integer num2 = entranceBubble.style;
        return num2 != null && num2.intValue() == 3;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper
    public final Map<String, Object> w50() {
        return new LinkedHashMap();
    }

    public SeaHeadContainerViewHelper(SeaPdpHeadGodaV1ViewHolder seaPdpHeadGodaV1ViewHolder) {
        this.LL = seaPdpHeadGodaV1ViewHolder;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper
    public final String VM(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c14140.d51616_i");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper
    public final void dw0(InterfaceC1755830vnB interfaceC1755830vnB) {
        C19719612Di.LJJIIJ(this.LL.d6().LLLLJI.LLILLJJLI.LIZ.LIZ, new AwS605S0100000_26(interfaceC1755830vnB, 679), true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper
    public final void ea1(InterfaceC1755830vnB interfaceC1755830vnB) {
        this.LL.d6().LLLLJI.LLILLJJLI.LIZ.LIZIZ(interfaceC1755830vnB);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper
    public final void jc1(boolean z) {
        this.LL.d6().q = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper
    public final void pq0(Context context, String str) {
        this.LL.d6().bS2(context, str);
    }
}
