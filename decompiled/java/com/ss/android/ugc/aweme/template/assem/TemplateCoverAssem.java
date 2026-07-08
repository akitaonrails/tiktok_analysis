package com.ss.android.ugc.aweme.template.assem;

import X.C098200Yq;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C189200o6;
import X.C20627315nb;
import X.C418440Gaw;
import X.C627500OjM;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class TemplateCoverAssem extends DynamicAssem {
    public C20627315nb LLJJI;
    public TuxSkeletonLayout LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fuf;
    }

    public final void lp() {
        SmartImageView smartImageView;
        Integer num;
        String str;
        String str2;
        C20627315nb c20627315nb = this.LLJJI;
        if (c20627315nb != null) {
            C786410Ut5.LLLZLL(c20627315nb, 8);
        }
        TuxSkeletonLayout tuxSkeletonLayout = this.LLJJIII;
        if (tuxSkeletonLayout != null) {
            tuxSkeletonLayout.setLoading(false);
        }
        try {
            View viewFindViewById = getContentView().findViewById(R.id.bh2);
            Unit unit = null;
            if (!(viewFindViewById instanceof SmartImageView) || (smartImageView = (SmartImageView) viewFindViewById) == null) {
                return;
            }
            Map<String, Object> map = getConfig().LLILZ;
            Object obj = map.get("scale_type");
            if ((obj instanceof String) && (str2 = (String) obj) != null) {
                smartImageView.setActualImageScaleType(EnumC1338240kve.valueOf(str2));
            }
            Object obj2 = map.get("img_url");
            if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                smartImageView.LIZ(C1331660kl2.LJIIIZ(str).LIZJ());
            }
            Object obj3 = map.get("rounded_corner_radius");
            if ((obj3 instanceof Integer) && (num = (Integer) obj3) != null) {
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
        Integer num;
        Integer num2;
        mo127do();
        this.LLJJI = (C20627315nb) view.findViewById(R.id.bk_);
        this.LLJJIII = (TuxSkeletonLayout) view.findViewById(R.id.trb);
        Map<String, Object> map = getConfig().LLILZ;
        View contentView = getContentView();
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        if (layoutParams != null) {
            Object obj = map.get("width_dp");
            if ((obj instanceof Integer) && (num2 = (Integer) obj) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num2.intValue())));
            }
            Object obj2 = map.get("height_dp");
            if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num.intValue())));
            }
            C786410Ut5.W5(contentView, layoutParams);
            if (Intrinsics.LJFF(map.get("is_loading"), Boolean.TRUE)) {
                if (C627500OjM.LIZ()) {
                    C20627315nb c20627315nb = this.LLJJI;
                    if (c20627315nb != null) {
                        C786410Ut5.LLLZLL(c20627315nb, 0);
                    }
                    TuxSkeletonLayout tuxSkeletonLayout = this.LLJJIII;
                    if (tuxSkeletonLayout != null) {
                        tuxSkeletonLayout.setLoading(true);
                        return;
                    }
                    return;
                }
                lp();
                return;
            }
            lp();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
