package com.ss.android.ugc.aweme.detail.prefab;

import X.C098200Yq;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C189200o6;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public class DetailCoverAssem extends DynamicAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bk9;
    }

    public void lp() {
        SmartImageView smartImageView;
        Integer num;
        String str;
        String str2;
        Integer num2;
        Integer num3;
        try {
            View contentView = getContentView();
            Unit unit = null;
            if (!(contentView instanceof SmartImageView) || (smartImageView = (SmartImageView) contentView) == null) {
                return;
            }
            Map<String, Object> map = getConfig().LLILZ;
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            Object obj = map.get("width_dp");
            if ((obj instanceof Integer) && (num3 = (Integer) obj) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num3.intValue())));
            }
            Object obj2 = map.get("height_dp");
            if ((obj2 instanceof Integer) && (num2 = (Integer) obj2) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num2.intValue())));
            }
            C786410Ut5.W5(smartImageView, layoutParams);
            Object obj3 = map.get("scale_type");
            if ((obj3 instanceof String) && (str2 = (String) obj3) != null) {
                smartImageView.setActualImageScaleType(EnumC1338240kve.valueOf(str2));
            }
            Object obj4 = map.get("img_url");
            if ((obj4 instanceof String) && (str = (String) obj4) != null) {
                smartImageView.LIZ(C1331660kl2.LJIIIZ(str).LIZJ());
            }
            Object obj5 = map.get("rounded_corner_radius");
            if ((obj5 instanceof Integer) && (num = (Integer) obj5) != null) {
                int iIntValue = num.intValue();
                C1331070kk5 hierarchy = smartImageView.getHierarchy();
                C1331100kk8 c1331100kk8 = new C1331100kk8();
                c1331100kk8.LJII(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                hierarchy.LJJIII(c1331100kk8);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        lp();
    }
}
