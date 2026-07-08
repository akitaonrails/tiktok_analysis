package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta;

import X.C062U;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1186970gzf;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LP;
import X.C1559260qg8;
import X.C337180DJs;
import X.C418440Gaw;
import X.C438710HIf;
import X.C723580SZw;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1203020hPY;
import X.EnumC1338240kve;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingContent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiColorfulServiceButtonAssem extends PoiDetailHeaderPoiShopCtaBaseAssem {
    public final C1559260qg8 LLJJJ = new C1559260qg8(new C723580SZw(this, C062U.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2s;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final String LLIIJI() {
        return "click_button";
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final C062U kp() {
        return (C062U) this.LLJJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final void op(int i, View view, String str) {
        String str2;
        boolean z;
        String str3;
        PoiShopBookingInfo poiShopBookingInfo;
        List<PoiBookingContent> list;
        PoiBookingContent poiBookingContent;
        C1186970gzf c1186970gzf;
        Integer numLIZJ;
        PoiShopBookingInfo poiShopBookingInfo2;
        List<PoiBookingContent> list2;
        PoiBookingContent poiBookingContent2;
        UrlModel logoUrl;
        List<String> urlList;
        TextView textView = (TextView) view.findViewById(R.id.utw);
        if (textView != null) {
            textView.setText(str);
        }
        C062U c062u = (C062U) this.LLJJJ.getValue();
        UrlModel logoUrl2 = null;
        if (c062u != null && (poiShopBookingInfo2 = c062u.LL) != null && (list2 = poiShopBookingInfo2.contentList) != null && (poiBookingContent2 = (PoiBookingContent) C13LP.LJJJLL(list2)) != null && (logoUrl = poiBookingContent2.getLogoUrl()) != null && (urlList = logoUrl.getUrlList()) != null) {
            str2 = (String) C13LP.LJJJLL(urlList);
        } else {
            str2 = null;
        }
        int iIntValue = 0;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.utt);
            if (tuxIconView != null) {
                C337180DJs.LIZJ(tuxIconView);
                tuxIconView.setIconRes(i);
                return;
            }
            return;
        }
        View viewFindViewById = view.findViewById(R.id.utt);
        if (viewFindViewById != null) {
            C337180DJs.LIZ(viewFindViewById);
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.utu);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
        c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        c1331750klB.LIZJ = iIntValue;
        c1331750klB.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_service_logo_img", new C1180560gpK(getContext(), EnumC1177490gkN.FALLBACK_13_PX, new C1180580gpM(Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)))), null));
        C062U c062u2 = (C062U) this.LLJJJ.getValue();
        if (c062u2 != null && (c1186970gzf = c062u2.LLILLJJLI) != null) {
            str3 = c1186970gzf.poiId;
        } else {
            str3 = null;
        }
        c1180600gpO.LIZLLL = new C1202680hP0(str3, null, null, null, null, 30);
        C062U c062u3 = (C062U) this.LLJJJ.getValue();
        if (c062u3 != null && (poiShopBookingInfo = c062u3.LL) != null && (list = poiShopBookingInfo.contentList) != null && (poiBookingContent = (PoiBookingContent) C13LP.LJJJLL(list)) != null) {
            logoUrl2 = poiBookingContent.getLogoUrl();
        }
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(logoUrl2));
        c1189360h3WLIZ.LJI(smartImageView.getWidth(), smartImageView.getHeight());
        c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
        c1189360h3WLIZ.LIZLLL(smartImageView);
        c1189360h3WLIZ.LIZ.LIZLLL("poi_detail_service_logo_img");
        c1189360h3WLIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1189360h3WLIZ.LIZIZ();
    }
}
