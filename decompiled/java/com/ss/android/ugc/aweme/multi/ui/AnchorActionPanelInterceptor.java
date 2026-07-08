package com.ss.android.ugc.aweme.multi.ui;

import X.C0OM1;
import X.C1067000dsA;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1390920mIc;
import X.C19EG;
import X.C259800zU;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS55S2100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class AnchorActionPanelInterceptor implements IRouteAction {
    public static final /* synthetic */ int LL = 0;

    /* JADX WARN: Type inference failed for: r1v6, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Serializable serializable;
        AnchorCommonStruct anchorCommonStruct;
        AnchorPanelExtraInfo anchorPanelExtraInfo;
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            if (str == null) {
                return Boolean.FALSE;
            }
            if (bundle != null) {
                serializable = bundle.getSerializable("anchor_struct");
            } else {
                serializable = null;
            }
            if ((serializable instanceof AnchorCommonStruct) && (anchorCommonStruct = (AnchorCommonStruct) serializable) != null) {
                String string = bundle.getString("group_id");
                String str2 = "";
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("action_url");
                if (string2 != null) {
                    str2 = string2;
                }
                Serializable serializable2 = bundle.getSerializable("anchor_extra_action_info");
                if (serializable2 instanceof AnchorPanelExtraInfo) {
                    anchorPanelExtraInfo = (AnchorPanelExtraInfo) serializable2;
                } else {
                    anchorPanelExtraInfo = null;
                }
                AwS55S2100000_12 awS55S2100000_12 = new AwS55S2100000_12(context, str2, string, 0);
                C259800zU c259800zU = new C259800zU();
                C0OM1 c0om1 = new C0OM1();
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = context.getString(2131828256);
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZLLL = true;
                c1251150ifB.LIZJ(new AwS556S0100000_12(c259800zU, (C259800zU<TuxSheet>) 817));
                c0om1.LIZIZ(c1251150ifB);
                c0om1.LIZLLL = true;
                C1067000dsA c1067000dsA = new C1067000dsA(context);
                c1067000dsA.LIZ(anchorCommonStruct, anchorPanelExtraInfo, awS55S2100000_12, awS55S2100000_12);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIL = c0om1;
                tuxSheet.LLJJJ = null;
                tuxSheet.LLJJIII = c1067000dsA;
                c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(R.attr.bx, context);
                c1390920mIc.LJIIIIZZ(0);
                ?? r1 = c1390920mIc.LIZ;
                c259800zU.element = r1;
                r1.show(supportFragmentManager, "AnchorActionPanelInterceptor");
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
