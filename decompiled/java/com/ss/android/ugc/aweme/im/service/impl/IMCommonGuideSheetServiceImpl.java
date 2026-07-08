package com.ss.android.ugc.aweme.im.service.impl;

import X.C1667580tUq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C770750ULh;
import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.service.service.IMCommonGuideSheetService;
import com.ss.android.ugc.aweme.im.service.service.ImCommonGuideSheetConfig;
import com.ss.android.ugc.aweme.im.service.service.ImCommonGuideSheetItem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMCommonGuideSheetServiceImpl implements IMCommonGuideSheetService {
    public static final Map<String, Integer> LIZ = C2097908Jt.LIZJ(new Pair("illustration_m_facial_verification", Integer.valueOf(R.drawable.ug)));
    public static final Map<String, Integer> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("icon_two_person", Integer.valueOf(R.raw.icon_two_person)), new Pair("icon_arrow_turn_up_right", Integer.valueOf(R.raw.icon_arrow_turn_up_right)));

    @Override // com.ss.android.ugc.aweme.im.service.service.IMCommonGuideSheetService
    public final TuxSheet LIZ(Context context, ImCommonGuideSheetConfig imCommonGuideSheetConfig, AwS228S0300000_19 awS228S0300000_19) {
        int iIntValue;
        int iIntValue2;
        ImCommonGuideSheetItem imCommonGuideSheetItem = imCommonGuideSheetConfig.firstRow;
        ImCommonGuideSheetItem imCommonGuideSheetItem2 = imCommonGuideSheetConfig.secondRow;
        String str = imCommonGuideSheetConfig.btnTxt;
        String str2 = imCommonGuideSheetConfig.mainTitle;
        String str3 = imCommonGuideSheetItem.title;
        String str4 = imCommonGuideSheetItem.des;
        String str5 = imCommonGuideSheetItem2.title;
        String str6 = imCommonGuideSheetItem2.des;
        Map<String, Integer> map = LIZIZ;
        Integer num = map.get(imCommonGuideSheetItem.iconRes);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = R.raw.icon_arrow_turn_up_right;
        }
        Integer num2 = map.get(imCommonGuideSheetItem2.iconRes);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = R.raw.icon_arrow_turn_up_right;
        }
        Integer num3 = LIZ.get(imCommonGuideSheetConfig.imgRes);
        C770750ULh c770750ULh = new C770750ULh();
        c770750ULh.LIZJ = new AwS368S0200000_2(context, num3, 163);
        c770750ULh.LIZLLL = 2;
        c770750ULh.LJ = str2;
        c770750ULh.LJ(new C1667580tUq(iIntValue, str3, str4, null, 8), new C1667580tUq(iIntValue2, str5, str6, null, 8));
        c770750ULh.LJIILLIIL = true;
        c770750ULh.LJI(str, new AwS581S0100000_2(awS228S0300000_19, 661));
        return c770750ULh.LIZIZ().LIZ;
    }
}
