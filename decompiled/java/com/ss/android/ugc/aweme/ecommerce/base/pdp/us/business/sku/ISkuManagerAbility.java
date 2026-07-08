package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku;

import X.C04AZ;
import X.InterfaceC1053504Ab;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DefaultSelection;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS16S1210000_26;

/* JADX INFO: loaded from: classes2.dex */
public interface ISkuManagerAbility extends InterfaceC494301wD {
    boolean EO2(String str, String str2, String[] strArr);

    boolean F11();

    int FC1();

    boolean FK2();

    boolean Fi1();

    List<InterfaceC1053504Ab> G42();

    boolean Gw1(String str);

    void Ig2();

    boolean Jl0();

    int M01();

    void Mt2();

    SkuPanelState Pv0();

    void RE2(SkuPanelState skuPanelState);

    DefaultSelection U82();

    void UE(boolean z);

    String Wp0(String[] strArr);

    void Wu2(IPdpStarter.PdpEnterParam pdpEnterParam);

    C04AZ Ww2();

    Map<String, Object> eG1(String[] strArr);

    void ev2(int i, String str, ImageSelectData imageSelectData, View view, AwS16S1210000_26 awS16S1210000_26);

    PreOrderInfo jw0();

    void m1(ProductPackStruct productPackStruct);

    int vZ1(String[] strArr);

    boolean w52();
}
