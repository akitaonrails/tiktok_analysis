package com.ss.android.ugc.aweme.poi.detail.videolist.ui;

import X.C013C;
import X.C01GW;
import X.C1175120ggY;
import X.C1180600gpO;
import X.C1185410gx9;
import X.C1189060h32;
import X.C1189290h3P;
import X.C1189360h3W;
import X.C1189590h3t;
import X.C1191160h6Q;
import X.C1202680hP0;
import X.C123100dR;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1EDK;
import X.C2188811AlT;
import X.C2327809Ae;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C422830Gi1;
import X.C427870Gq9;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C904300Zdk;
import X.EnumC1190240h4w;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import Y.ACListenerS84S0300000_18;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMergedListItemReviewCell extends PowerCell<C1189290h3P> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1253));
    public FixedRatioFrameLayout LLILLJJLI;
    public SmartImageView LLILLL;
    public RadiusLayout LLILZ;
    public TuxTextView LLILZIL;
    public C427870Gq9 LLILZLL;
    public TuxTextView LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public C1189590h3t LLJIJIL;
    public LinearLayout LLJILJIL;
    public TuxTextView LLJILJILJ;

    public final C1185410gx9 L5() {
        return (C1185410gx9) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (FixedRatioFrameLayout) this.itemView.findViewById(R.id.trj);
        this.LLILLL = (SmartImageView) this.itemView.findViewById(R.id.cover);
        this.LLILZ = (RadiusLayout) this.itemView.findViewById(R.id.fn0);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.desc);
        this.LLILZLL = (C427870Gq9) this.itemView.findViewById(R.id.bbz);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.bc6);
        this.LLIZLLLIL = (TuxIconView) this.itemView.findViewById(R.id.srx);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.sry);
        this.LLJI = (TuxTextView) this.itemView.findViewById(R.id.g39);
        this.LLJIJIL = (C1189590h3t) this.itemView.findViewById(R.id.cik);
        this.LLJILJIL = (LinearLayout) this.itemView.findViewById(R.id.olm);
        this.LLJILJILJ = (TuxTextView) this.itemView.findViewById(R.id.oll);
    }

    public static float N5(PoiListApi.PoiReviewCardModel poiReviewCardModel) {
        Float fLJIIIIZZ;
        String str = poiReviewCardModel.ratingStr;
        if (str != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) != null) {
            return fLJIIIIZZ.floatValue();
        }
        Double d = poiReviewCardModel.rating;
        if (d != null) {
            return (float) d.doubleValue();
        }
        return 0.0f;
    }

    public final int I5(boolean z) {
        int iBW;
        IPoiVideoListAbility iPoiVideoListAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (iPoiVideoListAbility = (IPoiVideoListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiVideoListAbility.class, null)) != null) {
            iBW = iPoiVideoListAbility.bW();
        } else {
            iBW = 0;
        }
        if (z) {
            return getBindingAdapterPosition() - iBW;
        }
        return (getBindingAdapterPosition() - iBW) + 1;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        Integer numValueOf;
        String str2;
        int value;
        String fromGroupId;
        Long l;
        UrlStruct urlStruct;
        UrlModel urlModelLIZ;
        String str3;
        C427870Gq9 c427870Gq9;
        String str4;
        C1189290h3P c1189290h3P = (C1189290h3P) interfaceC1891350zJl;
        PoiListApi.PoiReviewCardModel poiReviewCardModel = c1189290h3P.LL;
        Context context = getContext();
        if (context != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
            int iLongValue = 0;
            if (poiReviewCardModel.image == null) {
                FixedRatioFrameLayout fixedRatioFrameLayout = this.LLILLJJLI;
                if (fixedRatioFrameLayout != null) {
                    C339190DRl.LIZIZ(fixedRatioFrameLayout);
                }
                RadiusLayout radiusLayout = this.LLILZ;
                if (radiusLayout != null) {
                    radiusLayout.setRadius(C418440Gaw.LIZIZ(10));
                }
            } else {
                FixedRatioFrameLayout fixedRatioFrameLayout2 = this.LLILLJJLI;
                if (fixedRatioFrameLayout2 != null) {
                    C339190DRl.LIZLLL(fixedRatioFrameLayout2);
                }
                SmartImageView smartImageView = this.LLILLL;
                if (smartImageView != null) {
                    C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "review_two_col", null);
                    c1180600gpO.LIZLLL = new C1202680hP0(c1189290h3P.LL.poiId, null, null, null, null, 30);
                    C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(poiReviewCardModel.image));
                    c1189360h3WLIZ.LIZLLL(smartImageView);
                    c1189360h3WLIZ.LIZIZ();
                }
                Integer num = poiReviewCardModel.imageCount;
                if (num != null && num.intValue() > 1) {
                    LinearLayout linearLayout = this.LLJILJIL;
                    if (linearLayout != null) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
                        linearLayout.setBackground(c384050F3z.LIZ(context));
                        C339190DRl.LIZLLL(linearLayout);
                    }
                    TuxTextView tuxTextView = this.LLJILJILJ;
                    if (tuxTextView != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('+');
                        sbLIZ.append(poiReviewCardModel.imageCount);
                        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            C013C c013c = new C013C();
            String str5 = poiReviewCardModel.text;
            if (str5 != null && str5.length() != 0) {
                if (poiReviewCardModel.image == null) {
                    TuxTextView tuxTextView2 = this.LLILZIL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setMaxLines(7);
                    }
                } else {
                    TuxTextView tuxTextView3 = this.LLILZIL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setMaxLines(3);
                    }
                }
                TuxTextView tuxTextView4 = this.LLILZIL;
                if (tuxTextView4 != null) {
                    if (C1EDK.LIZIZ() && C123100dR.LIZ(poiReviewCardModel.translatedContent)) {
                        c013c.element = true;
                        str4 = poiReviewCardModel.translatedContent;
                    } else {
                        str4 = poiReviewCardModel.text;
                    }
                    tuxTextView4.setText(str4);
                }
                C339190DRl.LIZLLL(this.LLILZIL);
            } else {
                C339190DRl.LIZIZ(this.LLILZIL);
            }
            C786410Ut5.I7(new ACListenerS84S0300000_18(this, c1189290h3P, c013c, 11), this.itemView);
            PoiReviewsApi.PoiReviewUserModel poiReviewUserModel = poiReviewCardModel.author;
            if (poiReviewUserModel != null && (c427870Gq9 = this.LLILZLL) != null) {
                UrlModel urlModel = poiReviewUserModel.avatarMedium;
                if (urlModel == null && (urlModel = poiReviewUserModel.avatarLarger) == null) {
                    urlModel = poiReviewUserModel.avatarThumb;
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                c1331670kl3LJIIIIZZ.LJJ(c427870Gq9);
                c1331670kl3LJIIIIZZ.LJIIJJI();
            }
            TuxTextView tuxTextView5 = this.LLIZ;
            if (tuxTextView5 != null) {
                PoiReviewsApi.PoiReviewUserModel poiReviewUserModel2 = poiReviewCardModel.author;
                if (poiReviewUserModel2 != null) {
                    str3 = poiReviewUserModel2.nickname;
                } else {
                    str3 = null;
                }
                tuxTextView5.setText(str3);
            }
            float fN5 = N5(poiReviewCardModel);
            if (fN5 >= 0.0f) {
                C339190DRl.LIZLLL(this.LLIZLLLIL);
                TuxTextView tuxTextView6 = this.LLJ;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(fN5)}, 1)));
                }
                C339190DRl.LIZLLL(this.LLJI);
            } else {
                C339190DRl.LIZIZ(this.LLIZLLLIL);
                C339190DRl.LIZIZ(this.LLJ);
                C339190DRl.LIZIZ(this.LLJI);
            }
            C1189590h3t c1189590h3t = this.LLJIJIL;
            if (c1189590h3t != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                SmartImageView smartImageView2 = c1189590h3t.LLILLJJLI;
                ViewGroup.LayoutParams layoutParams = smartImageView2.getLayoutParams();
                layoutParams.width = iLIZIZ;
                layoutParams.height = iLIZIZ2;
                C786410Ut5.G6(smartImageView2, layoutParams);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                c1189590h3t.LLILLL.setMaxLines(1);
                c1189590h3t.LLILLL.setEllipsize(truncateAt);
                c1189590h3t.LIZ(71);
                c1189590h3t.setMinTextSize(10.0f);
                if (!TextUtils.equals(C1308910kAL.LJIIIIZZ(context), "TikTok Theme Dark") || (urlStruct = poiReviewCardModel.darkModeBrandLogo) == null) {
                    urlStruct = poiReviewCardModel.brandLogo;
                    if (urlStruct == null) {
                        urlModelLIZ = null;
                    }
                    c1189590h3t.LIZIZ(urlModelLIZ, poiReviewCardModel.brandName);
                }
                urlModelLIZ = C904300Zdk.LIZ(urlStruct);
                c1189590h3t.LIZIZ(urlModelLIZ, poiReviewCardModel.brandName);
            }
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            String str6 = poiReviewCardModel.reviewId;
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            PoiReviewsApi.PoiReviewUserModel poiReviewUserModel3 = poiReviewCardModel.author;
            if (poiReviewUserModel3 == null || (str = poiReviewUserModel3.userId) == null) {
                str = "";
            }
            String str8 = poiReviewCardModel.poiId;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = c1189290h3P.LLILLL;
            if (str9 != null) {
                str7 = str9;
            }
            float fLIZIZ = C1175120ggY.LIZIZ(Float.valueOf(N5(poiReviewCardModel)));
            boolean zLIZ = C123100dR.LIZ(poiReviewCardModel.text);
            int iI5 = I5(false);
            PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = poiReviewCardModel.statistics;
            if (poiReviewStatisticsModel != null && (l = poiReviewStatisticsModel.likeCount) != null) {
                iLongValue = (int) l.longValue();
            }
            int iLIZJ = C1175120ggY.LIZJ(poiReviewCardModel.imageCount);
            String str10 = poiReviewCardModel.text;
            if (str10 != null) {
                numValueOf = Integer.valueOf(str10.length());
            } else {
                numValueOf = null;
            }
            int iLIZJ2 = C1175120ggY.LIZJ(numValueOf);
            PoiReviewsApi.PoiReviewUserModel poiReviewUserModel4 = poiReviewCardModel.author;
            if (poiReviewUserModel4 != null) {
                str2 = poiReviewUserModel4.reviewUserSource;
            } else {
                str2 = null;
            }
            Integer num2 = poiReviewCardModel.source;
            if (num2 != null) {
                value = num2.intValue();
            } else {
                value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
            }
            String str11 = c1189290h3P.LLILLJJLI;
            String str12 = poiReviewCardModel.textLang;
            boolean z = c013c.element;
            C1185410gx9 c1185410gx9L5 = L5();
            if (c1185410gx9L5 != null) {
                fromGroupId = c1185410gx9L5.getFromGroupId();
            } else {
                fromGroupId = null;
            }
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            }
            PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
            c1191160h6Q.getClass();
            C1191160h6Q.LJJIJIIJI(fLIZIZ, zLIZ ? 1 : 0, iI5, iLongValue, iLIZJ, iLIZJ2, value, 0, pageFinderVia, interfaceC665370Q7zLJFF, 0, null, "poi_detail", str6, str, str8, str7, str2, str11, str12, fromGroupId, null, null, z);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e0q, viewGroup, false);
    }
}
