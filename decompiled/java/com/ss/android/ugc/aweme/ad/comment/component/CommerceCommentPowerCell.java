package com.ss.android.ugc.aweme.ad.comment.component;

import X.AbstractC1023360cjm;
import X.AbstractC1049500dPw;
import X.C04TD;
import X.C06VX;
import X.C1027520cqU;
import X.C1049310dPd;
import X.C1049340dPg;
import X.C1049590dQ5;
import X.C1049600dQ6;
import X.C123100dR;
import X.C1243240iSQ;
import X.C1308910kAL;
import X.C1627206Ys;
import X.C21146717pB;
import X.C21279518Ph;
import X.C21279618Pi;
import X.C21279718Pj;
import X.C2188811AlT;
import X.C2201691BEx;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C427660Gpo;
import X.C438710HIf;
import X.C786410Ut5;
import X.C814420VxA;
import X.C988850bq7;
import X.C988900bqC;
import X.EnumC1049490dPv;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.commerce.CommerceCommentBridgeService;
import com.ss.android.ugc.commerce.ICommerceCommentBridgeService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceCommentPowerCell extends BaseCommerceCommentPowerCell<C1049340dPg> implements View.OnClickListener {
    public C427660Gpo LLIZLLLIL;
    public TuxTextView LLJ;
    public C21279718Pj LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public C06VX LLJILJILJ;
    public int LLJILLL;

    @Override // com.ss.android.ugc.aweme.ad.comment.component.BaseCommerceCommentPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C427660Gpo c427660Gpo = (C427660Gpo) this.itemView.findViewById(R.id.eez);
        C786410Ut5.T8(c427660Gpo, this);
        c427660Gpo.setOnLongClickListener(this);
        this.LLIZLLLIL = c427660Gpo;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ef0);
        C786410Ut5.h9(tuxTextView, this);
        tuxTextView.setOnLongClickListener(this);
        EnumC1049490dPv enumC1049490dPv = EnumC1049490dPv.USERNAME;
        C1627206Ys.LIZ(tuxTextView, enumC1049490dPv);
        this.LLJ = tuxTextView;
        C21279718Pj c21279718Pj = (C21279718Pj) this.itemView.findViewById(R.id.e_3);
        C786410Ut5.O8(c21279718Pj, this);
        c21279718Pj.setOnLongClickListener(this);
        C1627206Ys.LIZ(c21279718Pj, enumC1049490dPv);
        this.LLJI = c21279718Pj;
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.e_s);
        C786410Ut5.h9(tuxTextView2, this);
        tuxTextView2.setOnLongClickListener(this);
        Object objLIZ = C04TD.LIZ(ICommerceCommentBridgeService.class, false);
        (objLIZ != null ? (ICommerceCommentBridgeService) objLIZ : new CommerceCommentBridgeService()).LIZ(tuxTextView2);
        this.LLJIJIL = tuxTextView2;
        TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.ean);
        C786410Ut5.h9(tuxTextView3, this);
        tuxTextView3.setOnLongClickListener(this);
        tuxTextView3.setTag(R.id.yh8, Integer.valueOf(this.LLJILLL));
        C1627206Ys.LIZ(tuxTextView3, EnumC1049490dPv.BUTTON);
        this.LLJILJIL = tuxTextView3;
        C2211631BhB.LJ(tuxTextView3, new AwS595S0100000_16(this, 60));
        this.LLJILJILJ = (C06VX) this.itemView.findViewById(R.id.eer);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.component.BaseCommerceCommentPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1049340dPg c1049340dPg) {
        String userDisplayName;
        String buttonText;
        int iIntValue;
        int iIntValue2;
        Integer numLIZJ;
        Integer numLIZJ2;
        String labelName;
        UrlModel avatarThumb;
        super.onBindItemView(c1049340dPg);
        Comment comment = c1049340dPg.LLILZ;
        User user = comment.getUser();
        C06VX c06vx = null;
        if (user != null && (avatarThumb = user.getAvatarThumb()) != null) {
            C427660Gpo c427660Gpo = this.LLIZLLLIL;
            if (c427660Gpo == null) {
                c427660Gpo = null;
            }
            C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 1022);
        }
        User user2 = comment.getUser();
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        String str = "";
        if (user2 != null) {
            userDisplayName = user2.getUserDisplayName();
            if (userDisplayName == null || !C123100dR.LIZ(userDisplayName)) {
                C1243240iSQ.LIZ.getClass();
                userDisplayName = user2.getNickname();
                if (userDisplayName == null) {
                    userDisplayName = "";
                }
            }
        } else {
            userDisplayName = null;
        }
        tuxTextView.setText(userDisplayName);
        AwemeRawAd awemeRawAd = comment.getAwemeRawAd();
        if (awemeRawAd != null) {
            C21279518Ph c21279518PhLIZ = C988900bqC.LIZ();
            AwemeTextLabelModel label = awemeRawAd.getLabel();
            if (label != null && (labelName = label.getLabelName()) != null) {
                str = labelName;
            }
            c21279518PhLIZ.LJIIL(str);
            Context context = getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context)) != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            c21279518PhLIZ.LJIILIIL(iIntValue);
            c21279518PhLIZ.LJIILJJIL(92);
            c21279518PhLIZ.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bv, context2)) != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            c21279518PhLIZ.LIZ(iIntValue2);
            c21279518PhLIZ.LIZIZ(C418440Gaw.LIZIZ(4));
            C21279618Pi c21279618Pi = c21279518PhLIZ.LIZ;
            if (c21279618Pi != null) {
                C21279718Pj c21279718Pj = this.LLJI;
                if (c21279718Pj == null) {
                    c21279718Pj = null;
                }
                c21279718Pj.LIZ(c21279618Pi);
            }
        }
        TuxTextView tuxTextView2 = this.LLJIJIL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.setText(comment.getText());
        AwemeRawAd awemeRawAd2 = comment.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            buttonText = awemeRawAd2.getButtonText();
        } else {
            buttonText = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[label]");
        sbLIZ.append(' ');
        sbLIZ.append(buttonText);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_link;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
        C786410Ut5.p2(spannableString, new C419890GdH(tuxIconDrawableLIZ, 2), 0, 7, 17);
        TuxTextView tuxTextView3 = this.LLJILJIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setText(spannableString);
        C06VX c06vx2 = this.LLJILJILJ;
        if (c06vx2 != null) {
            c06vx = c06vx2;
        }
        c06vx.setLoading(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void dispatchResume(boolean z) {
        super.dispatchResume(z);
        if (z) {
            C988850bq7.LIZJ(hashCode());
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(AbstractC1049500dPw abstractC1049500dPw) {
        AbstractC1049500dPw abstractC1049500dPw2 = abstractC1049500dPw;
        C06VX c06vx = null;
        String text = null;
        if (abstractC1049500dPw2 instanceof C1049600dQ6) {
            C06VX c06vx2 = this.LLJILJILJ;
            if (c06vx2 == null) {
                c06vx2 = null;
            }
            c06vx2.setLoading(false);
            TuxTextView tuxTextView = this.LLJIJIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            Comment comment = abstractC1049500dPw2.LIZ;
            if (comment != null) {
                text = comment.getText();
            }
            tuxTextView.setText(text);
            return;
        }
        if (!(abstractC1049500dPw2 instanceof C1049590dQ5)) {
            return;
        }
        C06VX c06vx3 = this.LLJILJILJ;
        if (c06vx3 != null) {
            c06vx = c06vx3;
        }
        c06vx.setLoading(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1049340dPg c1049340dPg;
        Aweme aweme;
        String str;
        AwemeRawAd awemeRawAd;
        if (view != null && (c1049340dPg = (C1049340dPg) getItem()) != null && (aweme = c1049340dPg.LLILZLL) != null) {
            C427660Gpo c427660Gpo = this.LLIZLLLIL;
            if (c427660Gpo == null) {
                c427660Gpo = null;
            }
            if (Intrinsics.LJFF(view, c427660Gpo)) {
                str = "photo";
            } else {
                TuxTextView tuxTextView = this.LLJ;
                if (tuxTextView == null) {
                    tuxTextView = null;
                }
                if (Intrinsics.LJFF(view, tuxTextView)) {
                    str = "name";
                } else {
                    C21279718Pj c21279718Pj = this.LLJI;
                    if (c21279718Pj == null) {
                        c21279718Pj = null;
                    }
                    if (Intrinsics.LJFF(view, c21279718Pj)) {
                        str = "sponsored";
                    } else {
                        TuxTextView tuxTextView2 = this.LLJIJIL;
                        if (tuxTextView2 == null) {
                            tuxTextView2 = null;
                        }
                        if (Intrinsics.LJFF(view, tuxTextView2)) {
                            str = "title";
                        } else {
                            TuxTextView tuxTextView3 = this.LLJILJIL;
                            if (tuxTextView3 == null) {
                                tuxTextView3 = null;
                            }
                            if (Intrinsics.LJFF(view, tuxTextView3)) {
                                str = "button";
                            } else {
                                str = "";
                            }
                        }
                    }
                }
            }
            C988850bq7.LIZIZ(hashCode(), aweme);
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).vr(aweme);
            ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).w2().LIZ(getContext(), aweme, new C1027520cqU("comment_ad", str, aweme.getAid(), aweme.getRequestId(), 16));
            AbstractC1023360cjm abstractC1023360cjm = (AbstractC1023360cjm) this.LLILLL.getValue();
            Object obj = abstractC1023360cjm.getProvidedContexts().get(AwemeRawAd.class);
            if ((obj instanceof AwemeRawAd) && (awemeRawAd = (AwemeRawAd) obj) != null) {
                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                Long creativeId = awemeRawAd.getCreativeId();
                String logExtra = awemeRawAd.getLogExtra();
                new AwS630S0100000_16(awemeRawAd, 94);
                C2201691BEx.LIZ("click", clickTrackUrlList, creativeId, logExtra);
            }
            C1049310dPd.LIZ.getClass();
            abstractC1023360cjm.logAd(C1049310dPd.LIZJ, new AwS67S1000000_16(str, 29));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LLJILLL = viewGroup.hashCode();
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.alg, viewGroup, false);
    }
}
