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
import X.C339190DRl;
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
import kotlin.Pair;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiNearbyV2TransportCell extends PowerCell<C1176040gi2> {
    public SmartImageView LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.r5m);
        this.itemView.findViewById(R.id.r5l);
        this.LLILLJJLI = (TuxIconView) this.itemView.findViewById(R.id.r5k);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.r5j);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.r5q);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.r5o);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.r5i);
        C786410Ut5.I7(new AkS87S0100000_18(this, 41), this.itemView);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 1028));
    }

    public final boolean I5(PoiGeneralCard poiGeneralCard) {
        if (!Intrinsics.LJFF(poiGeneralCard.getNoRating(), Boolean.TRUE) && C123100dR.LIZ(poiGeneralCard.getReviewScore()) && !Intrinsics.LJFF(poiGeneralCard.getReviewScore(), CardStruct.IStatusCode.DEFAULT) && !Intrinsics.LJFF(poiGeneralCard.getReviewScore(), "0.0")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numValueOf;
        Integer numValueOf2;
        String coverImg;
        Integer numValueOf3;
        Integer numValueOf4;
        int i;
        int i2;
        String nearbyTabKey;
        Context context;
        AddressInfo addressInfo;
        DynamicIcon dynamicIcon;
        C698190Ra5 dynamicToken;
        TuxIconView tuxIconView;
        AddressInfo addressInfo2;
        String str;
        String poiName;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        C1176040gi2 c1176040gi2 = (C1176040gi2) interfaceC1891350zJl;
        super.onBindItemView(c1176040gi2);
        Context context2 = this.itemView.getContext();
        EnumC1177490gkN enumC1177490gkN = EnumC1177490gkN.FALLBACK_13_PX;
        C1180580gpM c1180580gpM = new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(8)));
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null && (layoutParams6 = smartImageView.getLayoutParams()) != null) {
            numValueOf = Integer.valueOf(layoutParams6.width);
        } else {
            numValueOf = null;
        }
        Integer numValueOf5 = Integer.valueOf(C1175120ggY.LIZJ(numValueOf));
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 != null && (layoutParams5 = smartImageView2.getLayoutParams()) != null) {
            numValueOf2 = Integer.valueOf(layoutParams5.height);
        } else {
            numValueOf2 = null;
        }
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_nearby_v2", new C1180560gpK(context2, enumC1177490gkN, c1180580gpM, new Pair(numValueOf5, Integer.valueOf(C1175120ggY.LIZJ(numValueOf2)))));
        PoiGeneralCard card = c1176040gi2.getCard();
        if (card != null) {
            coverImg = card.getCoverImg();
        } else {
            coverImg = null;
        }
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZJ(coverImg));
        c1189360h3WLIZ.LIZ.LJJIJL(this.itemView.getContext());
        Context context3 = this.itemView.getContext();
        SmartImageView smartImageView3 = this.LL;
        if (smartImageView3 != null && (layoutParams4 = smartImageView3.getLayoutParams()) != null) {
            numValueOf3 = Integer.valueOf(layoutParams4.width);
        } else {
            numValueOf3 = null;
        }
        int iLIZJ = C1175120ggY.LIZJ(numValueOf3);
        SmartImageView smartImageView4 = this.LL;
        if (smartImageView4 != null && (layoutParams3 = smartImageView4.getLayoutParams()) != null) {
            numValueOf4 = Integer.valueOf(layoutParams3.height);
        } else {
            numValueOf4 = null;
        }
        C1180070goX.LIZ(c1189360h3WLIZ, context3, iLIZJ, C1175120ggY.LIZJ(numValueOf4), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
        SmartImageView smartImageView5 = this.LL;
        if (smartImageView5 != null && (layoutParams2 = smartImageView5.getLayoutParams()) != null) {
            i = layoutParams2.width;
        } else {
            i = 0;
        }
        SmartImageView smartImageView6 = this.LL;
        if (smartImageView6 != null && (layoutParams = smartImageView6.getLayoutParams()) != null) {
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
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText("");
        }
        TuxTextView tuxTextView3 = this.LLILZIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText("");
        }
        PoiGeneralCard card3 = c1176040gi2.getCard();
        if (card3 != null) {
            nearbyTabKey = card3.getNearbyTabKey();
        } else {
            nearbyTabKey = null;
        }
        if (Intrinsics.LJFF(nearbyTabKey, "Transport")) {
            TuxTextView tuxTextView4 = this.LLILZIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(c1176040gi2.getCard().getCategoryName());
            }
            C337180DJs.LIZJ(this.LLILZIL);
            C339190DRl.LIZIZ(this.LLILZLL);
        } else {
            C339190DRl.LIZIZ(this.LLILZIL);
            C337180DJs.LIZJ(this.LLILZLL);
            PoiGeneralCard card4 = c1176040gi2.getCard();
            if (card4 != null && (context = this.itemView.getContext()) != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_star_fill;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LJ = Integer.valueOf(R.attr.ny);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (I5(card4)) {
                    if (C0H4W.LIZ()) {
                        TuxTextView tuxTextView5 = this.LLILZLL;
                        if (tuxTextView5 != null) {
                            tuxTextView5.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
                        }
                    } else {
                        TuxTextView tuxTextView6 = this.LLILZLL;
                        if (tuxTextView6 != null) {
                            tuxTextView6.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                    }
                    TuxTextView tuxTextView7 = this.LLILZLL;
                    if (tuxTextView7 != null) {
                        tuxTextView7.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                    }
                    spannableStringBuilder.append((CharSequence) card4.getReviewScore());
                    int length = spannableStringBuilder.length();
                    C786410Ut5.q2(spannableStringBuilder, new C444920HcY(72, false), 0, length, 17);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                    if (numLIZJ != null) {
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), 0, length, 17);
                    }
                }
                if (C123100dR.LIZ(card4.getCategoryName())) {
                    if (I5(card4)) {
                        spannableStringBuilder.append((CharSequence) " · ");
                    }
                    spannableStringBuilder.append((CharSequence) card4.getCategoryName());
                }
                if (C041J.LIZ(spannableStringBuilder)) {
                    TuxTextView tuxTextView8 = this.LLILZLL;
                    if (tuxTextView8 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView8, 0);
                    }
                    TuxTextView tuxTextView9 = this.LLILZLL;
                    if (tuxTextView9 != null) {
                        tuxTextView9.setText(spannableStringBuilder);
                    }
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context);
                    if (numLIZJ2 != null) {
                        int iIntValue = numLIZJ2.intValue();
                        TuxTextView tuxTextView10 = this.LLILZLL;
                        if (tuxTextView10 != null) {
                            tuxTextView10.setTextColor(iIntValue);
                        }
                    }
                } else {
                    TuxTextView tuxTextView11 = this.LLILZLL;
                    if (tuxTextView11 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView11, 8);
                    }
                }
            }
        }
        PoiGeneralCard card5 = c1176040gi2.getCard();
        if (card5 != null && (addressInfo2 = card5.getAddressInfo()) != null && (str = addressInfo2.distanceContent) != null) {
            TuxTextView tuxTextView12 = this.LLILLL;
            if (tuxTextView12 != null) {
                tuxTextView12.setText(str);
            }
            TuxTextView tuxTextView13 = this.LLILLL;
            if (tuxTextView13 != null) {
                C337180DJs.LIZJ(tuxTextView13);
            }
        } else {
            TuxTextView tuxTextView14 = this.LLILLL;
            if (tuxTextView14 != null) {
                C786410Ut5.LJLLLLLL(4, tuxTextView14);
            }
        }
        PoiGeneralCard card6 = c1176040gi2.getCard();
        if (card6 != null && (addressInfo = card6.getAddressInfo()) != null && (dynamicIcon = addressInfo.distanceIcon) != null && (dynamicToken = dynamicIcon.parseDynamicToken(this.itemView.getContext())) != null && (tuxIconView = this.LLILLJJLI) != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = dynamicToken.LIZ;
            c419910GdJ2.LIZLLL = dynamicToken.LIZIZ;
            tuxIconView.setTuxIcon(c419910GdJ2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e57, viewGroup, false);
    }
}
