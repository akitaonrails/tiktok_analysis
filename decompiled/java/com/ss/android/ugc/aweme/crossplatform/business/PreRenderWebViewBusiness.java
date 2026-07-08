package com.ss.android.ugc.aweme.crossplatform.business;

import X.C1041550dD7;
import X.C1041660dDI;
import X.C1968907nT;
import X.C2097608Jq;
import X.InterfaceC1037490d6Z;
import X.InterfaceC1969007nU;
import android.content.Context;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public final class PreRenderWebViewBusiness extends BusinessService.Business {
    public static final Map<Integer, String> LJFF = C2097608Jq.LJIIIIZZ(new Pair(2, "video_bottom_button"), new Pair(3, "video_mask_button"), new Pair(6, "comment_end_button"), new Pair(8, "profile_bottom_button"), new Pair(33, "ad_card"), new Pair(46, "ads_explain_clic"), new Pair(47, "ad_desc_label"));
    public int LIZLLL;
    public String LJ;

    public PreRenderWebViewBusiness(C1968907nT c1968907nT) {
        super(c1968907nT);
    }

    public static final PreRenderWebViewBusiness LIZ(InterfaceC1037490d6Z interfaceC1037490d6Z) {
        Context context;
        C1041660dDI c1041660dDILJIIIIZZ;
        C1041550dD7 c1041550dD7;
        InterfaceC1969007nU interfaceC1969007nULJIILL;
        if (interfaceC1037490d6Z != null) {
            context = interfaceC1037490d6Z.getContext();
        } else {
            context = null;
        }
        if ((context instanceof CrossPlatformActivity) || interfaceC1037490d6Z == null || (c1041660dDILJIIIIZZ = interfaceC1037490d6Z.LJIIIIZZ()) == null || (c1041550dD7 = c1041660dDILJIIIIZZ.LIZIZ) == null || c1041550dD7.LLJJJJJIL != 7 || (interfaceC1969007nULJIILL = interfaceC1037490d6Z.LJIILL()) == null) {
            return null;
        }
        return (PreRenderWebViewBusiness) ((C1968907nT) interfaceC1969007nULJIILL).LIZ(PreRenderWebViewBusiness.class);
    }
}
