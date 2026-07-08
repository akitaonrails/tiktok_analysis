package com.ss.android.ugc.aweme.poi.detail.nearbyv2.cell;

import X.C041J;
import X.C0H4W;
import X.C1175120ggY;
import X.C1176040gi2;
import X.C1180070goX;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1189360h3W;
import X.C123100dR;
import X.C1308910kAL;
import X.C2211631BhB;
import X.C337180DJs;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C438710HIf;
import X.C444920HcY;
import X.C698190Ra5;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1334360kpO;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.detail.cells.AddressInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiNearbyV2NormalCardCell extends PowerCell<C1176040gi2> {
    public SmartImageView LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.r5c);
        this.LLILLJJLI = (TuxIconView) this.itemView.findViewById(R.id.r5a);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.r5_);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.r5f);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.r5d);
        C786410Ut5.I7(new AkS87S0100000_18(this, 40), this.itemView);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 1027));
    }

    public final boolean I5(PoiGeneralCard poiGeneralCard) {
        if (!Intrinsics.LJFF(poiGeneralCard.getNoRating(), Boolean.TRUE) && C123100dR.LIZ(poiGeneralCard.getReviewScore()) && !Intrinsics.LJFF(poiGeneralCard.getReviewScore(), CardStruct.IStatusCode.DEFAULT) && !Intrinsics.LJFF(poiGeneralCard.getReviewScore(), "0.0")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String coverImg;
        Integer numValueOf;
        Integer numValueOf2;
        int i;
        int i2;
        AddressInfo addressInfo;
        DynamicIcon dynamicIcon;
        C698190Ra5 dynamicToken;
        TuxIconView tuxIconView;
        AddressInfo addressInfo2;
        String str;
        Context context;
        String poiName;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        C1176040gi2 c1176040gi2 = (C1176040gi2) interfaceC1891350zJl;
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_nearby_v2", new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(8))), null));
        PoiGeneralCard card = c1176040gi2.getCard();
        if (card != null) {
            coverImg = card.getCoverImg();
        } else {
            coverImg = null;
        }
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZJ(coverImg));
        c1189360h3WLIZ.LIZ.LJJIJL(this.itemView.getContext());
        Context context2 = this.itemView.getContext();
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null && (layoutParams4 = smartImageView.getLayoutParams()) != null) {
            numValueOf = Integer.valueOf(layoutParams4.width);
        } else {
            numValueOf = null;
        }
        int iLIZJ = C1175120ggY.LIZJ(numValueOf);
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 != null && (layoutParams3 = smartImageView2.getLayoutParams()) != null) {
            numValueOf2 = Integer.valueOf(layoutParams3.height);
        } else {
            numValueOf2 = null;
        }
        C1180070goX.LIZ(c1189360h3WLIZ, context2, iLIZJ, C1175120ggY.LIZJ(numValueOf2), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
        SmartImageView smartImageView3 = this.LL;
        if (smartImageView3 != null && (layoutParams2 = smartImageView3.getLayoutParams()) != null) {
            i = layoutParams2.width;
        } else {
            i = 0;
        }
        SmartImageView smartImageView4 = this.LL;
        if (smartImageView4 != null && (layoutParams = smartImageView4.getLayoutParams()) != null) {
            i2 = layoutParams.height;
        } else {
            i2 = 0;
        }
        c1189360h3WLIZ.LJI(i, i2);
        c1189360h3WLIZ.LIZ.LJJIII = EnumC1334360kpO.HIGH;
        c1189360h3WLIZ.LIZLLL(this.LL);
        c1189360h3WLIZ.LIZIZ();
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            PoiGeneralCard card2 = c1176040gi2.getCard();
            if (card2 != null) {
                poiName = card2.getPoiName();
            } else {
                poiName = null;
            }
            tuxTextView.setText(poiName);
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText("");
        }
        PoiGeneralCard card3 = c1176040gi2.getCard();
        if (card3 != null && (context = this.itemView.getContext()) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_star_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LJ = Integer.valueOf(R.attr.ny);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (I5(card3)) {
                if (C0H4W.LIZ()) {
                    TuxTextView tuxTextView3 = this.LLILZIL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
                    }
                } else {
                    TuxTextView tuxTextView4 = this.LLILZIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
                TuxTextView tuxTextView5 = this.LLILZIL;
                if (tuxTextView5 != null) {
                    tuxTextView5.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                }
                spannableStringBuilder.append((CharSequence) card3.getReviewScore());
                int length = spannableStringBuilder.length();
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(72, false), 0, length, 17);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), 0, length, 17);
                }
            }
            if (C123100dR.LIZ(card3.getCategoryForMarker())) {
                if (I5(card3)) {
                    spannableStringBuilder.append((CharSequence) " · ");
                }
                spannableStringBuilder.append((CharSequence) card3.getCategoryForMarker());
            }
            if (C041J.LIZ(spannableStringBuilder)) {
                TuxTextView tuxTextView6 = this.LLILZIL;
                if (tuxTextView6 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView6, 0);
                }
                TuxTextView tuxTextView7 = this.LLILZIL;
                if (tuxTextView7 != null) {
                    tuxTextView7.setText(spannableStringBuilder);
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context);
                if (numLIZJ2 != null) {
                    int iIntValue = numLIZJ2.intValue();
                    TuxTextView tuxTextView8 = this.LLILZIL;
                    if (tuxTextView8 != null) {
                        tuxTextView8.setTextColor(iIntValue);
                    }
                }
            } else {
                TuxTextView tuxTextView9 = this.LLILZIL;
                if (tuxTextView9 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView9, 8);
                }
            }
        }
        PoiGeneralCard card4 = c1176040gi2.getCard();
        if (card4 != null && (addressInfo2 = card4.getAddressInfo()) != null && (str = addressInfo2.distanceContent) != null) {
            TuxTextView tuxTextView10 = this.LLILLL;
            if (tuxTextView10 != null) {
                tuxTextView10.setText(str);
            }
            TuxTextView tuxTextView11 = this.LLILLL;
            if (tuxTextView11 != null) {
                C337180DJs.LIZJ(tuxTextView11);
            }
        } else {
            TuxTextView tuxTextView12 = this.LLILLL;
            if (tuxTextView12 != null) {
                C786410Ut5.LJLLLLLL(4, tuxTextView12);
            }
        }
        PoiGeneralCard card5 = c1176040gi2.getCard();
        if (card5 != null && (addressInfo = card5.getAddressInfo()) != null && (dynamicIcon = addressInfo.distanceIcon) != null && (dynamicToken = dynamicIcon.parseDynamicToken(this.itemView.getContext())) != null && (tuxIconView = this.LLILLJJLI) != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = dynamicToken.LIZ;
            c419910GdJ2.LIZLLL = dynamicToken.LIZIZ;
            tuxIconView.setTuxIcon(c419910GdJ2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e56, viewGroup, false);
    }
}
