package com.ss.android.ugc.aweme.im.messagelist.api.dynamic;

import X.C06T0;
import X.C09IR;
import X.C0I0B;
import X.C0Z2Z;
import X.C20684815ws;
import X.C2252331DDr;
import X.C830490Whz;
import X.C869590Y9l;
import X.C914160Zte;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public final class DynamicCardViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final C2252331DDr LL = C09IR.LIZIZ(0, 0, null, 7);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(7);
    }

    public final void vQ2(C869590Y9l c869590Y9l) {
        String str;
        String strValueOf;
        ImageComponent imageComponent;
        IconTypeComponent iconTypeComponent;
        String str2;
        DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l, DynamicCardTemplate.class);
        if (dynamicCardTemplate == null) {
            return;
        }
        if (c869590Y9l.isSuccessStatus()) {
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put(Scene.SCENE_SERVICE, c869590Y9l.getScene());
            DynamicInfoComponent dynamicInfoComponent = dynamicCardTemplate.dynamicInfo;
            String str3 = null;
            if (dynamicInfoComponent != null) {
                str3 = dynamicInfoComponent.cardKey;
            }
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            c830490Whz.put("card_key", str3);
            DynamicInfoComponent dynamicInfoComponent2 = dynamicCardTemplate.dynamicInfo;
            if (dynamicInfoComponent2 == null || (str = dynamicInfoComponent2.businessId) == null) {
                str = "";
            }
            c830490Whz.put("business_id", str);
            DynamicInfoComponent dynamicInfoComponent3 = dynamicCardTemplate.dynamicInfo;
            if (dynamicInfoComponent3 != null && (str2 = dynamicInfoComponent3.businessType) != null) {
                str4 = str2;
            }
            c830490Whz.put("business_type", str4);
            FallbackInfoComponent fallbackInfoComponent = dynamicCardTemplate.fallbackInfo;
            if (fallbackInfoComponent == null || (imageComponent = fallbackInfoComponent.imageComponent) == null || (iconTypeComponent = imageComponent.iconType) == null || (strValueOf = Integer.valueOf(iconTypeComponent.getValue()).toString()) == null) {
                strValueOf = String.valueOf(IconTypeComponent.DEFAULT.getValue());
            }
            c830490Whz.put("fallback_icon_type", strValueOf);
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("dm_spark_card_status", c830490Whz);
        }
        this.LL.LIZJ(new Pair(C06T0.CARD_EXPOSURE_ONCE, c869590Y9l));
    }
}
