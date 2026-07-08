package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell;

import X.C1173300gdc;
import X.C1174830gg5;
import X.C1180090goZ;
import X.C1180560gpK;
import X.C1180570gpL;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1183810guZ;
import X.C1185600gxS;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1189390h3Z;
import X.C1208590hYX;
import X.C13LP;
import X.C2211631BhB;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1177510gkP;
import X.InterfaceC1181010gq3;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BasePoiHeaderTopVideosCardCell extends PowerCell<C1183810guZ> {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public TuxIconView LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;

    public void R5(C1183810guZ c1183810guZ) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PoiListApi.PoiDetailResponse L5() {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ2;
        C1173300gdc c1173300gdcQr0;
        C1185600gxS c1185600gxS;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (interfaceC1181010gq3LIZ2 = C1174830gg5.LIZ(fragmentLJIIJ)) != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZ2.qr0()) != null && (c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ) != null && (poiDetailResponse = c1185600gxS.LJIIIZ) != null) {
            return poiDetailResponse;
        }
        Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ2 == null || (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJIIJ2)) == null) {
            return null;
        }
        return (PoiListApi.PoiDetailResponse) interfaceC1181010gq3LIZ.ta2(new C1180090goZ("poi_head_info"));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new AkS87S0100000_18(this, 26), this.itemView);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 306));
    }

    public static String N5(C1183810guZ c1183810guZ) {
        Integer mediaType = c1183810guZ.LLILLJJLI.getMediaType();
        if (mediaType != null && mediaType.intValue() == 1) {
            return "";
        }
        if (c1183810guZ.LLILLL == 52500) {
            return "multi_media_big";
        }
        Aweme aweme = c1183810guZ.LLILLJJLI.getAweme();
        if (aweme == null || aweme.getAwemeType() != 240) {
            return "";
        }
        return "multi_media_vertical";
    }

    public final void I5(View view) {
        this.LL = (SmartImageView) view.findViewById(R.id.ld7);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.tv_topic_tag);
        this.LLILLL = view.findViewById(R.id.ffk);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.lr7);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(C1183810guZ c1183810guZ) {
        String str;
        List<String> urlList;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        boolean z = true;
        if (c1183810guZ.LLILZ > 0 && c1183810guZ.LLILZIL > 0) {
            ViewGroup.LayoutParams layoutParams3 = this.itemView.getLayoutParams();
            if ((layoutParams3 == null || layoutParams3.width != c1183810guZ.LLILZ) && (layoutParams = this.itemView.getLayoutParams()) != null) {
                layoutParams.width = c1183810guZ.LLILZ;
            }
            ViewGroup.LayoutParams layoutParams4 = this.itemView.getLayoutParams();
            if ((layoutParams4 == null || layoutParams4.height != c1183810guZ.LLILZIL) && (layoutParams2 = this.itemView.getLayoutParams()) != null) {
                layoutParams2.height = c1183810guZ.LLILZIL;
            }
        }
        UrlModel cropAwemeCover = c1183810guZ.LLILLJJLI.getCropAwemeCover();
        if (cropAwemeCover != null && (urlList = cropAwemeCover.getUrlList()) != null) {
            str = (String) C13LP.LJJJLL(urlList);
        } else {
            str = null;
        }
        if (!this.LLILZIL || !Intrinsics.LJFF(str, this.LLILZLL)) {
            this.LLILZLL = str;
            ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(c1183810guZ.LLILLJJLI.getCropAwemeCover());
            C1180560gpK c1180560gpK = new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_32_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12))), null);
            c1180560gpK.LJ = imageUrlModelLIZ;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            Drawable drawableLIZ = c384050F3z.LIZ(this.itemView.getContext());
            EnumC1177510gkP enumC1177510gkP = EnumC1177510gkP.LIGHT;
            C1189390h3Z c1189390h3Z = new C1189390h3Z(new LayerDrawable(new Drawable[]{drawableLIZ, C1180570gpL.LIZIZ(c1180560gpK, enumC1177510gkP)}));
            C1189390h3Z c1189390h3Z2 = new C1189390h3Z(new LayerDrawable(new Drawable[]{drawableLIZ, C1180570gpL.LIZ(c1180560gpK, enumC1177510gkP)}));
            SmartImageView smartImageView = this.LL;
            if (smartImageView != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zj);
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                smartImageView.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
            }
            C1189360h3W c1189360h3WLIZ = new C1180600gpO("poi_detail", "poi_detail_top_video_cover", null).LIZ(imageUrlModelLIZ);
            c1189360h3WLIZ.LIZ.LJJIJL(this.itemView.getContext());
            c1189360h3WLIZ.LIZ.LJJIIZI(c1189390h3Z);
            c1189360h3WLIZ.LIZ.LJIL(c1189390h3Z2);
            c1189360h3WLIZ.LIZLLL(this.LL);
            c1189360h3WLIZ.LIZJ(new C1208590hYX(this, c1183810guZ, 1));
        }
        String awemeTopicTag = c1183810guZ.LLILLJJLI.getAwemeTopicTag();
        int i = c1183810guZ.LLILZ;
        if (awemeTopicTag != null && !a0.LJJJIL(awemeTopicTag)) {
            z = false;
        }
        if (!z && i > 0) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                int iLIZIZ = (i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                if (iLIZIZ <= 0) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                    View view = this.LLILLL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(8, view);
                        return;
                    }
                    return;
                }
                if (StaticLayout.Builder.obtain(awemeTopicTag, 0, awemeTopicTag.length(), tuxTextView.getPaint(), iLIZIZ).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build().getLineCount() > 2) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                    View view2 = this.LLILLL;
                    if (view2 == null) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(8, view2);
                    return;
                }
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                View view3 = this.LLILLL;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                tuxTextView.setText(awemeTopicTag);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        View view4 = this.LLILLL;
        if (view4 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view4);
    }
}
