package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell;

import X.C1183810guZ;
import X.C1202730hP5;
import X.C1336370ksd;
import X.C13LP;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.poi.PoiAwemePictureInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.experiment.PoiGalleryPicOptExperiment;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderTopVideosImageCell extends BasePoiHeaderTopVideosCardCell {
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.BasePoiHeaderTopVideosCardCell
    /* JADX INFO: renamed from: P5 */
    public final void onBindItemView(C1183810guZ c1183810guZ) {
        super.onBindItemView(c1183810guZ);
        S5(c1183810guZ);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.BasePoiHeaderTopVideosCardCell
    public final void R5(C1183810guZ c1183810guZ) {
        Integer num;
        Aweme aweme;
        PoiDataStruct poiDataStruct;
        PoiAwemePictureInfo poiAwemePictureInfo;
        UrlModel urlModel;
        List<String> urlList;
        Object objLJJJLL;
        PoiGalleryPicOptExperiment.LIZ.getClass();
        if (PoiGalleryPicOptExperiment.LIZIZ() && (num = ((PoiGalleryPicOptExperiment.PoiGalleryPicOptConfigModel) PoiGalleryPicOptExperiment.LIZJ.getValue()).poiDetailPreloadGalleyPic) != null && num.intValue() == 1 && (aweme = c1183810guZ.LLILLJJLI.getAweme()) != null && (poiDataStruct = aweme.getPoiDataStruct()) != null && (poiAwemePictureInfo = poiDataStruct.poiAwemePictureInfo) != null && (urlModel = poiAwemePictureInfo.compressedUrlInfo) != null && (urlList = urlModel.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
            C1336370ksd.LIZ.LJFF(new C1202730hP5(Collections.singletonList(objLJJJLL), "poi_detail", "poi_detail_preload_travel_gallery_pic"));
        }
    }

    public final void S5(C1183810guZ c1183810guZ) {
        Aweme aweme = c1183810guZ.LLILLJJLI.getAweme();
        if (aweme == null) {
            TuxIconView tuxIconView = this.LLILZ;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                return;
            }
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!AwemeExtKt.isPhotoMode(aweme) && aweme.getAwemeType() != 160) {
            TuxIconView tuxIconView2 = this.LLILZ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                return;
            }
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_square_corner_border_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        TuxIconView tuxIconView3 = this.LLILZ;
        if (tuxIconView3 != null) {
            tuxIconView3.setImageDrawable(tuxIconDrawableLIZ);
        }
        TuxIconView tuxIconView4 = this.LLILZ;
        if (tuxIconView4 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.BasePoiHeaderTopVideosCardCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C1183810guZ) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e1k, viewGroup, false);
        I5(viewTd);
        return viewTd;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1183810guZ c1183810guZ = (C1183810guZ) interfaceC1891350zJl;
        super.onBindItemView(c1183810guZ, list);
        if (Intrinsics.LJFF(C13LP.LJJJLL(list), "aweme_change_payload")) {
            S5(c1183810guZ);
        }
    }
}
