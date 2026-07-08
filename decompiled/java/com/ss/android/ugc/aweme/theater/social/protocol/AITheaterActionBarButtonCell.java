package com.ss.android.ugc.aweme.theater.social.protocol;

import X.C01GW;
import X.C0MW8;
import X.C2188811AlT;
import X.C427760Gpy;
import X.C452501pT;
import X.C547930LeJ;
import X.C549720LhC;
import X.C551460Lk0;
import X.EnumC428930Grr;
import X.EnumC429060Gs4;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterActionBarButtonCell extends ActionBarCell<C551460Lk0> {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 444));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 445));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ni;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C551460Lk0 c551460Lk0) {
        C0MW8 c0mw8LJ;
        super.onBindItemView(c551460Lk0);
        int size = c551460Lk0.LLILLL.size();
        if (c551460Lk0.LLILLL != null) {
            C427760Gpy c427760Gpy = (C427760Gpy) this.LLILZ.getValue();
            c427760Gpy.setTotalCount(size);
            int i = 0;
            while (i < size) {
                Object obj = ListProtector.get(c551460Lk0.LLILLL, i);
                if (obj == null) {
                    obj = "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("User ");
                int i2 = i + 1;
                sbLIZ.append(i2);
                C427760Gpy.LIZ(c427760Gpy, i, obj, C2188811AlT.LIZIZ(sbLIZ), null, null, false, null, 2040);
                i = i2;
            }
            c427760Gpy.setSize(EnumC428930Grr.SMALL);
            c427760Gpy.setStacking(EnumC429060Gs4.FIRST_ON_TOP);
        }
        ((TextView) this.LLILZIL.getValue()).setText(C547930LeJ.LIZ(2131826041, new Object[0]));
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (c0mw8LJ = iAITheaterFeatureServiceLIZ.LJ()) != null) {
            c0mw8LJ.LIZIZ();
        }
        AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
        if (aITheaterProfileService != null) {
            aITheaterProfileService.e9("dm");
        }
    }
}
