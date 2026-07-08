package com.ss.android.ugc.aweme.topic.common.detail;

import X.C1331660kl2;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.detail.prefab.DetailCoverAssem;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicCoverAssem extends DetailCoverAssem {
    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailCoverAssem
    public final void lp() {
        SmartImageView smartImageView;
        String str;
        Integer num;
        View contentView = getContentView();
        if (!(contentView instanceof SmartImageView) || (smartImageView = (SmartImageView) contentView) == null) {
            return;
        }
        Map<String, Object> map = getConfig().LLILZ;
        Object obj = map.get("width_dp");
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num2 != null ? num2.intValue() : 75;
        Object obj2 = map.get("height_dp");
        int iIntValue2 = (!(obj2 instanceof Integer) || (num = (Integer) obj2) == null) ? 120 : num.intValue();
        float f = iIntValue;
        float f2 = iIntValue2;
        float f3 = f / f2;
        Object obj3 = map.get("img_width");
        Integer num3 = obj3 instanceof Integer ? (Integer) obj3 : null;
        Object obj4 = map.get("img_height");
        Integer num4 = obj4 instanceof Integer ? (Integer) obj4 : null;
        if (num3 == null || num4 == null || num3.intValue() == 0 || num4.intValue() == 0) {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
            C786410Ut5.W5(smartImageView, layoutParams);
        } else {
            float fIntValue = num3.intValue() / num4.intValue();
            ViewGroup.LayoutParams layoutParams2 = smartImageView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (fIntValue >= f3) {
                marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f / fIntValue)));
            } else {
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
                float f4 = f2 * fIntValue;
                marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f4)));
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf((75 - f4) / 2)));
                marginLayoutParams.setMargins(iLIZIZ, marginLayoutParams.topMargin, iLIZIZ, marginLayoutParams.bottomMargin);
            }
            C786410Ut5.W5(smartImageView, marginLayoutParams);
        }
        Object obj5 = map.get("img_url");
        if (!(obj5 instanceof String) || (str = (String) obj5) == null) {
            return;
        }
        smartImageView.LIZ(C1331660kl2.LJIIIZ(str).LIZJ());
    }
}
