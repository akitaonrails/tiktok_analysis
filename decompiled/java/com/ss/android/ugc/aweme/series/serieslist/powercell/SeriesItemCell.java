package com.ss.android.ugc.aweme.series.serieslist.powercell;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1220000hqw;
import X.C123100dR;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C1572600r1e;
import X.C1572980r2G;
import X.C1573950r3p;
import X.C1573960r3q;
import X.C1841350y17;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C757070Tmr;
import X.C786410Ut5;
import X.C788990UxF;
import X.C800330VaR;
import X.InterfaceC1891350zJl;
import X.InterfaceC658750Psf;
import Y.ACListenerS126S0200000_24;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.favorite.appdiff.SeriesFavoriteAppDiffProtocol;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.ss.android.ugc.aweme.service.ISeriesProfileService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesItemCell extends PowerCell<C1573950r3p> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1099));
    public final C736950SvV LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C1841350y17 LLJ;

    public final SeriesListAssemViewModel I5() {
        return (SeriesListAssemViewModel) this.LLILLJJLI.getValue();
    }

    public SeriesItemCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1100);
        this.LLILLJJLI = new C736950SvV(C13LE.LIZ(SeriesListAssemViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(355), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.e7m);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.e7g);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.e7e);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.e7_);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.e7a);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.e7f);
        this.LLJ = (C1841350y17) this.itemView.findViewById(R.id.e6r);
        SeriesFavoriteAppDiffProtocol.LIZ.getClass();
        C1572600r1e.LIZ().LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L5(C1573950r3p c1573950r3p) {
        boolean z;
        Integer numLIZJ;
        String strJ4;
        int iIntValue;
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        CollectionDetailModel collectionDetailModel = c1573950r3p.LL;
        int iIntValue2 = 0;
        if (collectionDetailModel.hasPurchasedCollection) {
            tuxTextView.setText(tuxTextView.getResources().getString(2131847512));
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.o9, this.itemView.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            tuxTextView.setTextColor(iIntValue2);
            tuxTextView.setBackground(C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.bf9));
            tuxTextView.setTuxFont(62);
            return;
        }
        if (collectionDetailModel.hasUserPartialPurchased && (!collectionDetailModel.enableSingleVideoPurchase || !collectionDetailModel.hasVoucher)) {
            tuxTextView.setText(collectionDetailModel.purchasedVideosText);
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.o9, this.itemView.getContext());
            if (numLIZJ3 != null) {
                iIntValue2 = numLIZJ3.intValue();
            }
            tuxTextView.setTextColor(iIntValue2);
            tuxTextView.setBackground(C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.bf9));
            tuxTextView.setTuxFont(62);
            return;
        }
        PaidCollectionListResponse paidCollectionListResponse = ((C1572980r2G) I5().getState()).LL;
        if (paidCollectionListResponse != null && paidCollectionListResponse.optedAndUsesSingleVideoPurchase) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            tuxTextView.setBackgroundResource(0);
            tuxTextView.setTuxFont(41);
            if (c1573950r3p.LL.enableSingleVideoPurchase) {
                strJ4 = C786410Ut5.j4(u.LJJIFFI(tuxTextView.getResources().getString(2131847549), "%1$d", "%1$s", false), Arrays.copyOf(new Object[]{c1573950r3p.LLILZ}, 1));
            } else {
                String strLJJIFFI = u.LJJIFFI(tuxTextView.getResources().getString(2131847548), "%1$d", "%1$s", false);
                Object[] objArr = new Object[1];
                String str = c1573950r3p.LLILLL;
                if (str.length() == 0) {
                    str = c1573950r3p.LLILLJJLI;
                }
                objArr[0] = str;
                strJ4 = C786410Ut5.j4(strLJJIFFI, Arrays.copyOf(objArr, 1));
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
            if (numLIZJ4 != null) {
                iIntValue = numLIZJ4.intValue();
            } else {
                iIntValue = -16777216;
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iIntValue);
            SpannableString spannableString = new SpannableString(strJ4);
            C786410Ut5.p2(spannableString, foregroundColorSpan, 0, strJ4.length(), 0);
            Integer numValueOf = Integer.valueOf(a0.LJJJ(strJ4, "/", 0, false, 6));
            if (numValueOf.intValue() != -1) {
                int iIntValue3 = numValueOf.intValue();
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(Color.rgb(109, 109, 109)), iIntValue3, iIntValue3 + 1, 0);
            }
            tuxTextView.setText(spannableString);
            return;
        }
        String str2 = c1573950r3p.LLILLL;
        if (str2.length() == 0) {
            str2 = c1573950r3p.LLILLJJLI;
        }
        tuxTextView.setText(str2);
        Context context = this.itemView.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        tuxTextView.setBackgroundResource(0);
        tuxTextView.setTuxFont(41);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        String str;
        int iIntValue;
        int iIntValue2;
        ISeriesProfileService iSeriesProfileService;
        List<String> urlList;
        C1573950r3p c1573950r3p = (C1573950r3p) interfaceC1891350zJl;
        CollectionDetailModel collectionDetailModel = c1573950r3p.LL;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        User user = collectionDetailModel.collectionCreator;
        TextView textView = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        boolean zEquals = curUserId.equals(uid);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.e7c);
        UrlModel urlModel = collectionDetailModel.collectionCover;
        int iIntValue3 = 0;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        c1331670kl3LJIIIZ.LIZLLL = true;
        c1331670kl3LJIIIZ.LJJJIL = new InterfaceC658750Psf() { // from class: X.0r3s
            @Override // X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str2, JSONObject jSONObject) {
            }
        };
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        if (collectionDetailModel.category == SeriesCategory.MINI_DRAMA && (iSeriesProfileService = (ISeriesProfileService) PluggableExtentionKt.pluggableSpi$default(ISeriesProfileService.class, false, false, false, 14, null)) != null) {
            iSeriesProfileService.LIZJ();
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.dif);
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(collectionDetailModel.collectionName);
        if (I5().xQ2().LLILZLL) {
            C1841350y17 c1841350y17 = this.LLJ;
            if (c1841350y17 == null) {
                c1841350y17 = null;
            }
            C786410Ut5.LLLLZ(c1841350y17, 0);
        }
        C1841350y17 c1841350y172 = this.LLJ;
        if (c1841350y172 == null) {
            c1841350y172 = null;
        }
        c1841350y172.setChecked(c1573950r3p.LLIZ);
        if (c1573950r3p.LL.isLimitedFree() || C757070Tmr.LIZ()) {
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        if (zEquals && !I5().xQ2().LLILZLL) {
            TuxTextView tuxTextView3 = this.LLILZ;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
            TuxTextView tuxTextView4 = this.LLILZLL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView4, 8);
            TuxTextView tuxTextView5 = this.LLIZLLLIL;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView5, 8);
        } else {
            L5(c1573950r3p);
            TuxTextView tuxTextView6 = this.LLILZ;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            N5(c1573950r3p, tuxTextView6);
        }
        TuxTextView tuxTextView7 = this.LLILZIL;
        if (tuxTextView7 != null) {
            textView = tuxTextView7;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iIntValue);
        int length = spannableStringBuilder.length();
        Resources resources = this.itemView.getResources();
        int i = collectionDetailModel.collectionVideoNum;
        spannableStringBuilder.append((CharSequence) resources.getQuantityString(2131755700, i, Integer.valueOf(i)));
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ng, this.itemView.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(iIntValue2);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) " | ");
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, this.itemView.getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        }
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(iIntValue3);
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) C788990UxF.LIZ(collectionDetailModel.collectionTotalDuration, this.itemView.getResources()));
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan3, length3, spannableStringBuilder.length(), 17);
        textView.setText(spannableStringBuilder);
        C786410Ut5.I7(new ACListenerS126S0200000_24(this, c1573950r3p, 34), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bhc, viewGroup, false);
    }

    public final void N5(C1573950r3p c1573950r3p, final TuxTextView tuxTextView) {
        final CollectionDetailModel collectionDetailModel = c1573950r3p.LL;
        TuxTextView tuxTextView2 = this.LLILZ;
        TuxTextView tuxTextView3 = null;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
        if (c1573950r3p.LL.isLimitedFree() || C757070Tmr.LIZ()) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        if (!collectionDetailModel.hasPurchasedCollection && !c1573950r3p.LLILZLL) {
            if (collectionDetailModel.hasVoucher && C123100dR.LIZ(collectionDetailModel.voucherTag) && !c1573950r3p.LL.isLimitedFree() && !C757070Tmr.LIZ()) {
                TuxTextView tuxTextView4 = this.LLILZLL;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView4, 4);
                tuxTextView4.setText(collectionDetailModel.voucherTag);
                if (this.itemView.getViewTreeObserver().isAlive()) {
                    C786410Ut5.y3(this.itemView.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0r3r
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            ViewGroup.MarginLayoutParams marginLayoutParams;
                            C786410Ut5.D3(this.LL.itemView.getViewTreeObserver(), this);
                            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            int i = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin : 0;
                            TuxTextView tuxTextView5 = this.LL.LLILZLL;
                            if (tuxTextView5 == null) {
                                tuxTextView5 = null;
                            }
                            ViewGroup.LayoutParams layoutParams2 = tuxTextView5.getLayoutParams();
                            int i2 = (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                            int width = tuxTextView.getWidth() + i;
                            TuxTextView tuxTextView6 = this.LL.LLILZLL;
                            if (tuxTextView6 == null) {
                                tuxTextView6 = null;
                            }
                            if (width + tuxTextView6.getWidth() + i2 <= this.LL.itemView.getWidth()) {
                                TuxTextView tuxTextView7 = this.LL.LLILZLL;
                                if (tuxTextView7 == null) {
                                    tuxTextView7 = null;
                                }
                                C786410Ut5.LLLLZLL(tuxTextView7, 0);
                                TuxTextView tuxTextView8 = this.LL.LLIZ;
                                C786410Ut5.LLLLZLL(tuxTextView8 != null ? tuxTextView8 : null, 8);
                                return true;
                            }
                            TuxTextView tuxTextView9 = this.LL.LLILZLL;
                            if (tuxTextView9 == null) {
                                tuxTextView9 = null;
                            }
                            C786410Ut5.LLLLZLL(tuxTextView9, 8);
                            TuxTextView tuxTextView10 = this.LL.LLIZ;
                            TuxTextView tuxTextView11 = tuxTextView10 != null ? tuxTextView10 : null;
                            tuxTextView11.setText(collectionDetailModel.voucherTag);
                            C786410Ut5.LLLLZLL(tuxTextView11, 0);
                            return true;
                        }
                    });
                }
            } else {
                TuxTextView tuxTextView5 = this.LLILZLL;
                if (tuxTextView5 == null) {
                    tuxTextView5 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView5, 8);
                TuxTextView tuxTextView6 = this.LLIZ;
                if (tuxTextView6 == null) {
                    tuxTextView6 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView6, 8);
            }
            if (c1573950r3p.LLILLL.length() > 0 && !c1573950r3p.LL.isLimitedFree() && !C757070Tmr.LIZ()) {
                TuxTextView tuxTextView7 = this.LLIZLLLIL;
                if (tuxTextView7 != null) {
                    tuxTextView3 = tuxTextView7;
                }
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
                tuxTextView3.setPaintFlags(tuxTextView3.getPaintFlags() | 16);
                tuxTextView3.setText(c1573950r3p.LLILLJJLI);
                return;
            }
            TuxTextView tuxTextView8 = this.LLIZLLLIL;
            if (tuxTextView8 != null) {
                tuxTextView3 = tuxTextView8;
            }
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
            return;
        }
        TuxTextView tuxTextView9 = this.LLILZLL;
        if (tuxTextView9 == null) {
            tuxTextView9 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView9, 8);
        TuxTextView tuxTextView10 = this.LLIZLLLIL;
        if (tuxTextView10 == null) {
            tuxTextView10 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView10, 8);
        TuxTextView tuxTextView11 = this.LLIZ;
        if (tuxTextView11 != null) {
            tuxTextView3 = tuxTextView11;
        }
        C786410Ut5.LLLLZLL(tuxTextView3, 8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        String uid;
        C1573950r3p c1573950r3p = (C1573950r3p) interfaceC1891350zJl;
        if ((!list.isEmpty()) && (ListProtector.get(list, 0) instanceof C1573960r3q)) {
            String curUserId = C0XQ7.LJFF().getCurUserId();
            User user = c1573950r3p.LL.collectionCreator;
            C1841350y17 c1841350y17 = null;
            TuxTextView tuxTextView = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (curUserId.equals(uid) && !I5().xQ2().LLILZLL) {
                TuxTextView tuxTextView2 = this.LLILZ;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                TuxTextView tuxTextView3 = this.LLILZLL;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
                TuxTextView tuxTextView4 = this.LLIZLLLIL;
                if (tuxTextView4 != null) {
                    tuxTextView = tuxTextView4;
                }
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return;
            }
            L5(c1573950r3p);
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            N5(c1573950r3p, tuxTextView5);
            if (!I5().xQ2().LLILZLL) {
                return;
            }
            C1841350y17 c1841350y172 = this.LLJ;
            if (c1841350y172 == null) {
                c1841350y172 = null;
            }
            C786410Ut5.LLLLZ(c1841350y172, 0);
            C1841350y17 c1841350y173 = this.LLJ;
            if (c1841350y173 != null) {
                c1841350y17 = c1841350y173;
            }
            c1841350y17.setChecked(c1573950r3p.LLIZ);
            return;
        }
        super.onBindItemView(c1573950r3p, list);
    }
}
