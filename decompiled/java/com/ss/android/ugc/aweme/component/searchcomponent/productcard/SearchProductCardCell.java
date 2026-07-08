package com.ss.android.ugc.aweme.component.searchcomponent.productcard;

import X.AbstractC1003980cEW;
import X.C041W;
import X.C1007610cKN;
import X.C1007620cKO;
import X.C1007630cKP;
import X.C1007640cKQ;
import X.C1009340cNA;
import X.C1011660cQu;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1533610q0l;
import X.C1895407bc;
import X.C19719612Di;
import X.C19ME;
import X.C21146717pB;
import X.C256540A3o;
import X.C418440Gaw;
import X.C475630Ikz;
import X.C641120PCs;
import X.C786410Ut5;
import X.C814420VxA;
import X.C989550brF;
import X.C991240bty;
import X.InterfaceC1003440cDe;
import X.InterfaceC1007930cKt;
import X.InterfaceC1014270cV7;
import X.InterfaceC1891350zJl;
import X.InterfaceC991230btx;
import Y.ACListenerS142S0100000_7;
import Y.ACListenerS151S0100000_16;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.JumpData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdPromotionAnchorInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchProductCardCell extends PowerCell<C1007620cKO> implements InterfaceC991230btx {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public ViewGroup LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public InterfaceC1007930cKt LLJ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.u68);
        this.LL = (SmartImageView) view.findViewById(R.id.rxu);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.rxk);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.rza);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.rz5);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.d8d);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.up1);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.pp9);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1007620cKO item;
        InterfaceC1014270cV7 interfaceC1014270cV7;
        super.onViewAttachedToWindow();
        InterfaceC1007930cKt interfaceC1007930cKt = this.LLJ;
        if (interfaceC1007930cKt == null || (item = getItem()) == null || (interfaceC1014270cV7 = item.LLJI) == null) {
            return;
        }
        interfaceC1014270cV7.LJIJ(new C989550brF(new C1895407bc(getBindingAdapterPosition())), interfaceC1007930cKt);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
    }

    public static C1007640cKQ L5(String str) {
        Regex regex = new Regex("^([^\\d\\s.,]*)([\\d\\s.,]+)$");
        Regex regex2 = new Regex("^\\s*([\\d\\s.,]+)\\s*([^\\d\\s.,]+)\\s*$");
        MatchResult matchResultFind$default = Regex.find$default(regex, str, 0, 2, null);
        if (matchResultFind$default != null) {
            return new C1007640cKQ((String) ListProtector.get(matchResultFind$default.LIZ(), 1), a0.LJLIIIL((String) ListProtector.get(matchResultFind$default.LIZ(), 2)).toString(), Boolean.TRUE);
        }
        MatchResult matchResultFind$default2 = Regex.find$default(regex2, str, 0, 2, null);
        if (matchResultFind$default2 != null) {
            return new C1007640cKQ((String) ListProtector.get(matchResultFind$default2.LIZ(), 2), (String) ListProtector.get(matchResultFind$default2.LIZ(), 1), Boolean.FALSE);
        }
        return new C1007640cKQ(null, null, Boolean.TRUE);
    }

    public final void N5(boolean z) {
        C1007620cKO item;
        C1009340cNA c1009340cNA;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo;
        String optSellingPointText;
        TuxTextView tuxTextView;
        InterfaceC1007930cKt interfaceC1007930cKt;
        C1007620cKO item2;
        InterfaceC1014270cV7 interfaceC1014270cV7;
        C1007620cKO item3 = getItem();
        if (item3 != null && Intrinsics.LJFF(item3.LLILZLL, Boolean.TRUE) && (item = getItem()) != null && (c1009340cNA = item.LLJJ) != null && (awemeRawAd = c1009340cNA.LIZLLL) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (searchAdPromotionAnchorInfo = searchAdInfo.promotionAnchorInfo) != null && (optSellingPointText = searchAdPromotionAnchorInfo.getOptSellingPointText()) != null) {
            TuxTextView tuxTextView2 = this.LLIZLLLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(optSellingPointText);
                tuxTextView2.setTextColor(C475630Ikz.LIZIZ(R.attr.ob, tuxTextView2.getContext()));
                tuxTextView2.setTuxFont(62);
            }
            TuxTextView tuxTextView3 = this.LLIZ;
            if (tuxTextView3 == null || (tuxTextView = this.LLIZLLLIL) == null) {
                return;
            }
            C1011660cQu.LJ(tuxTextView3, tuxTextView);
            if (!z && (interfaceC1007930cKt = this.LLJ) != null && (item2 = getItem()) != null && (interfaceC1014270cV7 = item2.LLJI) != null) {
                interfaceC1014270cV7.LJIJ(new C989550brF(new C1007630cKP("opt_selling_point")), interfaceC1007930cKt);
            }
        }
    }

    @Override // X.InterfaceC991230btx
    public final void Y3(AbstractC1003980cEW abstractC1003980cEW) {
        if (!(abstractC1003980cEW instanceof C991240bty) || ((C991240bty) abstractC1003980cEW).LIZ.isNull("anchor_promotion_info_request_status")) {
            return;
        }
        N5(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1007610cKN c1007610cKN;
        ViewGroup viewGroup;
        String str;
        String str2;
        String str3;
        boolean z;
        Float f;
        String str4;
        String str5;
        boolean z2;
        C1009340cNA c1009340cNA;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo;
        String str6;
        ProductInfo productInfo;
        String str7;
        ProductInfo productInfo2;
        Integer num;
        ProductInfo productInfo3;
        ProductInfo productInfo4;
        String str8;
        C19ME c19me;
        C1007620cKO c1007620cKO = (C1007620cKO) interfaceC1891350zJl;
        super.onBindItemView(c1007620cKO);
        InterfaceC1007930cKt interfaceC1007930cKt = c1007620cKO.LLJIJIL;
        this.LLJ = interfaceC1007930cKt;
        String str9 = null;
        if (interfaceC1007930cKt instanceof C1007610cKN) {
            c1007610cKN = (C1007610cKN) interfaceC1007930cKt;
        } else {
            c1007610cKN = null;
        }
        if (c1007610cKN != null) {
            C19719612Di.LJJIII(c1007610cKN.LLJLLL, new AwS595S0100000_16(this, 474), true);
            C19719612Di.LJJIII(c1007610cKN.LLJLLL, AFwS252S0000000_16.get$arr$(737), true);
            c1007610cKN.LLJLLL.add(new WeakReference<>(this));
        }
        ViewGroup viewGroup2 = this.LLILZLL;
        if (viewGroup2 != null) {
            C1011660cQu.LIZLLL(viewGroup2, C418440Gaw.LIZIZ(8));
        }
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            C1011660cQu.LIZLLL(smartImageView, C418440Gaw.LIZIZ(6));
        }
        C1007620cKO item = getItem();
        if ((item == null || !Intrinsics.LJFF(item.LLILZLL, Boolean.TRUE)) && (viewGroup = this.LLILZLL) != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(262));
                C786410Ut5.W5(viewGroup, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (C256540A3o.LIZIZ) {
            C1007620cKO item2 = getItem();
            if (item2 != null && Intrinsics.LJFF(item2.LLJILLL, Boolean.TRUE)) {
                TuxTextView tuxTextView = this.LLILLL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                TuxTextView tuxTextView2 = this.LLILZ;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                }
                TuxTextView tuxTextView3 = this.LLILLJJLI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setMaxLines(3);
                }
                TuxTextView tuxTextView4 = this.LLILLJJLI;
                if (tuxTextView4 != null) {
                    ViewGroup.LayoutParams layoutParams2 = tuxTextView4.getLayoutParams();
                    if (layoutParams2 != null) {
                        if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                            c19me.bottomToBottom = 0;
                            c19me.topToTop = 0;
                            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        }
                        C786410Ut5.W5(tuxTextView4, layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            } else {
                C1007620cKO item3 = getItem();
                if (item3 != null && (productInfo4 = item3.LLJJI) != null && (str8 = productInfo4.sellingPointText) != null && C1533610q0l.LIZIZ(str8)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    TuxTextView tuxTextView5 = this.LLILLL;
                    if (tuxTextView5 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView5, 8);
                    }
                    TuxTextView tuxTextView6 = this.LLILZ;
                    if (tuxTextView6 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView6, 8);
                    }
                    TuxTextView tuxTextView7 = this.LLIZ;
                    if (tuxTextView7 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView7, 0);
                        C1007620cKO item4 = getItem();
                        if (item4 != null && (productInfo3 = item4.LLJJI) != null) {
                            str7 = productInfo3.sellingPointText;
                        } else {
                            str7 = null;
                        }
                        tuxTextView7.setText(str7);
                        C1007620cKO item5 = getItem();
                        if (item5 != null && (productInfo2 = item5.LLJJI) != null && (num = productInfo2.sellingPointTextColorStyle) != null) {
                            if (num.intValue() == 1) {
                                tuxTextView7.setTextColor(C475630Ikz.LIZIZ(R.attr.a1j, tuxTextView7.getContext()));
                                tuxTextView7.setTuxFont(61);
                            } else if (num.intValue() == 2) {
                                tuxTextView7.setTextColor(C475630Ikz.LIZIZ(R.attr.ob, tuxTextView7.getContext()));
                                tuxTextView7.setTuxFont(62);
                            }
                        }
                    }
                    C1007620cKO item6 = getItem();
                    if (item6 != null && (c1009340cNA = item6.LLJJ) != null && (awemeRawAd = c1009340cNA.LIZLLL) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (searchAdPromotionAnchorInfo = searchAdInfo.promotionAnchorInfo) != null) {
                        C1007620cKO item7 = getItem();
                        if (item7 != null && (productInfo = item7.LLJJI) != null) {
                            str6 = productInfo.sellingPointText;
                        } else {
                            str6 = null;
                        }
                        searchAdPromotionAnchorInfo.setOriginalText(str6);
                    }
                } else {
                    TuxTextView tuxTextView8 = this.LLILLL;
                    if (tuxTextView8 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView8, 0);
                    }
                    TuxTextView tuxTextView9 = this.LLILZ;
                    if (tuxTextView9 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView9, 0);
                    }
                    TuxTextView tuxTextView10 = this.LLIZ;
                    if (tuxTextView10 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView10, 8);
                    }
                    TuxTextView tuxTextView11 = this.LLILLJJLI;
                    if (tuxTextView11 != null) {
                        tuxTextView11.setMaxLines(2);
                    }
                }
            }
        }
        C1007620cKO item8 = getItem();
        TuxTextView tuxTextView12 = this.LLILLJJLI;
        if (tuxTextView12 != null) {
            if (item8 != null) {
                str5 = item8.LLILLJJLI;
            } else {
                str5 = null;
            }
            tuxTextView12.setText(str5);
        }
        if (item8 == null || (str = item8.LLILLL) == null) {
            str = "";
        }
        C1007640cKQ c1007640cKQL5 = L5(str);
        if (item8 == null || (str2 = item8.LLILZ) == null) {
            str2 = "";
        }
        C1007640cKQ c1007640cKQL52 = L5(str2);
        String str10 = c1007640cKQL5.LIZIZ;
        if ((str10 == null || str10.length() == 0) && (str3 = c1007640cKQL52.LIZIZ) != null && str3.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView13 = this.LLILZ;
            if (tuxTextView13 != null) {
                C041W c041w = new C041W();
                String str11 = c1007640cKQL52.LIZIZ;
                if (str11 == null) {
                    str11 = "";
                }
                String str12 = c1007640cKQL52.LIZ;
                if (str12 == null) {
                    str12 = "";
                }
                c041w.LIZJ(!Intrinsics.LJFF(c1007640cKQL52.LIZJ, Boolean.TRUE) ? 1 : 0, str11, str12, "");
                c041w.LIZLLL(4);
                c041w.LJII = R.attr.a1h;
                c041w.LJIIIIZZ = false;
                tuxTextView13.setText(c041w.LIZIZ(this.itemView.getContext()));
            }
            TuxTextView tuxTextView14 = this.LLILLL;
            if (tuxTextView14 != null) {
                C786410Ut5.LLLLZLL(tuxTextView14, 8);
            }
        } else {
            TuxTextView tuxTextView15 = this.LLILLL;
            if (tuxTextView15 != null) {
                C041W c041w2 = new C041W();
                String str13 = c1007640cKQL5.LIZIZ;
                if (str13 == null) {
                    str13 = "";
                }
                String str14 = c1007640cKQL5.LIZ;
                if (str14 == null) {
                    str14 = "";
                }
                c041w2.LIZJ(!Intrinsics.LJFF(c1007640cKQL52.LIZJ, Boolean.TRUE) ? 1 : 0, str13, str14, "");
                c041w2.LIZLLL(4);
                c041w2.LJII = R.attr.a1h;
                c041w2.LJIIIIZZ = false;
                tuxTextView15.setText(c041w2.LIZIZ(this.itemView.getContext()));
            }
            TuxTextView tuxTextView16 = this.LLILZ;
            if (tuxTextView16 != null) {
                C041W c041w3 = new C041W();
                String str15 = c1007640cKQL52.LIZIZ;
                if (str15 == null) {
                    str15 = "";
                }
                String str16 = c1007640cKQL52.LIZ;
                if (str16 == null) {
                    str16 = "";
                }
                c041w3.LIZJ(!Intrinsics.LJFF(c1007640cKQL52.LIZJ, Boolean.TRUE) ? 1 : 0, str15, str16, "");
                c041w3.LIZLLL(4);
                c041w3.LJII = R.attr.a1k;
                c041w3.LJIIIIZZ = true;
                tuxTextView16.setText(c041w3.LIZIZ(this.itemView.getContext()));
            }
        }
        if (item8 != null && (str4 = item8.LL) != null && str4.length() != 0) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str4);
            c1331670kl3LJIIIZ.LJJIJL(getContext());
            c1331670kl3LJIIIZ.LIZLLL("anole_search_product_card_image");
            c1331670kl3LJIIIZ.LJJ(this.LL);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        ViewGroup viewGroup3 = this.LLILZLL;
        if (viewGroup3 != null) {
            C786410Ut5.K7(viewGroup3, new ACListenerS151S0100000_16(this, 172));
        }
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 != null) {
            C786410Ut5.Q8(smartImageView2, new ACListenerS151S0100000_16(this, 173));
        }
        TuxTextView tuxTextView17 = this.LLILZIL;
        if (tuxTextView17 != null) {
            C786410Ut5.h9(tuxTextView17, new ACListenerS142S0100000_7(this, 332));
        }
        C1007620cKO item9 = getItem();
        if (item9 != null && Intrinsics.LJFF(item9.LLILZLL, Boolean.TRUE)) {
            TuxTextView tuxTextView18 = this.LLILZIL;
            if (tuxTextView18 != null) {
                tuxTextView18.setTextColor(C475630Ikz.LIZIZ(R.attr.u_, tuxTextView18.getContext()));
                tuxTextView18.setTuxFont(52);
                tuxTextView18.setBackgroundColor(C475630Ikz.LIZIZ(R.attr.a03, tuxTextView18.getContext()));
                C1011660cQu.LIZLLL(tuxTextView18, C418440Gaw.LIZIZ(200));
                C1007620cKO item10 = getItem();
                if (item10 != null) {
                    str9 = item10.LLJ;
                }
                tuxTextView18.setText(str9);
            }
            C1007620cKO item11 = getItem();
            if (item11 != null && (f = item11.LLIZ) != null && f.floatValue() > 0.0f) {
                float fFloatValue = f.floatValue();
                View view = this.itemView;
                if (view != null) {
                    HandlerHook.viewPostDelay(view, new ARunnableS107S0100000_7(this, 284), (long) (fFloatValue * LSPassThroughRecordSizeConfig.DEFAULT));
                }
            }
        } else {
            TuxTextView tuxTextView19 = this.LLILZIL;
            if (tuxTextView19 != null) {
                C786410Ut5.LLLLZLL(tuxTextView19, 8);
            }
        }
        N5(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.qb, viewGroup, false);
    }

    public final void I5(String str, String str2) {
        C1009340cNA c1009340cNA;
        InterfaceC1003440cDe interfaceC1003440cDe;
        C1007620cKO item;
        InterfaceC1014270cV7 interfaceC1014270cV7;
        InterfaceC1007930cKt interfaceC1007930cKt = this.LLJ;
        if (interfaceC1007930cKt != null && (item = getItem()) != null && (interfaceC1014270cV7 = item.LLJI) != null) {
            interfaceC1014270cV7.LJIJ(new C989550brF(new C641120PCs(Integer.valueOf(getBindingAdapterPosition()), str)), interfaceC1007930cKt);
        }
        C1007620cKO item2 = getItem();
        if (item2 != null && Intrinsics.LJFF(item2.LLJILJILJ, Boolean.TRUE)) {
            C1007620cKO item3 = getItem();
            if (item3 != null && (interfaceC1003440cDe = item3.LLJILJIL) != null) {
                interfaceC1003440cDe.LJFF(str2);
                return;
            }
            return;
        }
        Context context = getContext();
        C1007620cKO item4 = getItem();
        JumpData jumpData = null;
        if (item4 != null) {
            c1009340cNA = item4.LLJJ;
        } else {
            c1009340cNA = null;
        }
        C1007620cKO item5 = getItem();
        if (item5 != null) {
            jumpData = item5.LLILZIL;
        }
        C1011660cQu.LIZIZ(context, c1009340cNA, jumpData, str, str2, null);
    }
}
