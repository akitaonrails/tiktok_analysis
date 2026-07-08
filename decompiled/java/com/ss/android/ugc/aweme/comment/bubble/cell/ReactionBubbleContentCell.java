package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.AbstractViewOnClickListenerC372950Ejl;
import X.C0SQ1;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1360520lVa;
import X.C20684815ws;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C720930SPr;
import X.C729510SjV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ReactionBubbleContentCell<ITEM extends C720930SPr> extends ReactionBaseCell<ITEM> {
    public SmartImageView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public TuxTextView LLIZ;

    public abstract CharSequence I5(ITEM item);

    public abstract C0SQ1 L5();

    public abstract String N5(ITEM item);

    public abstract String P5(ITEM item);

    public abstract boolean S5(ITEM item);

    public abstract String U5();

    public abstract void V5(View view);

    public abstract User getUser();

    public final void R5(boolean z) {
        float fMeasureText;
        TextPaint paint;
        TextPaint paint2;
        CharSequence text;
        if (z) {
            TuxTextView tuxTextView = this.LLILZ;
            CharSequence text2 = null;
            float fMeasureText2 = 0.0f;
            if (tuxTextView != null && (paint2 = tuxTextView.getPaint()) != null) {
                TuxTextView tuxTextView2 = this.LLILZ;
                if (tuxTextView2 != null) {
                    text = tuxTextView2.getText();
                } else {
                    text = null;
                }
                fMeasureText = paint2.measureText(String.valueOf(text));
            } else {
                fMeasureText = 0.0f;
            }
            TuxTextView tuxTextView3 = this.LLIZ;
            if (tuxTextView3 != null && (paint = tuxTextView3.getPaint()) != null) {
                TuxTextView tuxTextView4 = this.LLIZ;
                if (tuxTextView4 != null) {
                    text2 = tuxTextView4.getText();
                }
                fMeasureText2 = paint.measureText(String.valueOf(text2));
            }
            if (fMeasureText + fMeasureText2 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220))) {
                if (fMeasureText2 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60))) {
                    TuxTextView tuxTextView5 = this.LLILZ;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setMaxWidth((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)) - fMeasureText2));
                        return;
                    }
                    return;
                }
                TuxTextView tuxTextView6 = this.LLILZ;
                if (tuxTextView6 != null) {
                    tuxTextView6.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160)));
                }
                TuxTextView tuxTextView7 = this.LLIZ;
                if (tuxTextView7 == null) {
                    return;
                }
                tuxTextView7.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
                return;
            }
            return;
        }
        TuxTextView tuxTextView8 = this.LLILZ;
        if (tuxTextView8 == null) {
            return;
        }
        tuxTextView8.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(236)));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TuxTextView tuxTextView;
        C720930SPr c720930SPr = (C720930SPr) interfaceC1891350zJl;
        super.onBindItemView(c720930SPr);
        final User user = getUser();
        if (user != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarThumb()));
            c1331670kl3LJIIIIZZ.LIZLLL("ReactionBubbleCommentCell");
            c1331670kl3LJIIIIZZ.LJJ(this.LLILLL);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIIIZZ.LIZLLL = true;
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            final int i = 0;
            C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl(this, user, i) { // from class: X.0SyL
                public final int $t;
                public Object l0;
                public Object l1;

                @Override // X.AbstractViewOnClickListenerC372950Ejl
                public final void LIZ(View view) {
                    switch (this.$t) {
                        case 0:
                            LIZ$0(this, view);
                            break;
                        case 1:
                            LIZ$1(this, view);
                            break;
                        default:
                            super.LIZ(view);
                            break;
                    }
                }

                public static final void LIZ$0(C738710SyL c738710SyL, View view) {
                    if (view != null) {
                        ((ReactionBubbleContentCell) c738710SyL.l0).V5(view);
                        ReactionBubbleContentCell reactionBubbleContentCell = (ReactionBubbleContentCell) c738710SyL.l0;
                        reactionBubbleContentCell.T5((User) c738710SyL.l1, reactionBubbleContentCell.L5());
                    }
                }

                public static final void LIZ$1(C738710SyL c738710SyL, View view) {
                    if (view != null) {
                        ReactionBubbleContentCell reactionBubbleContentCell = (ReactionBubbleContentCell) c738710SyL.l0;
                        User user2 = (User) c738710SyL.l1;
                        C0SQ1 c0sq1L5 = reactionBubbleContentCell.L5();
                        if (!C10EU.LJIIZILJ(user2.getUid())) {
                            if (c0sq1L5 != null) {
                                C735840Sti c735840Sti = C735840Sti.LIZ;
                                C19651011uW c19651011uW = C19651011uW.LIZIZ;
                                C735410St1 c735410St1 = new C735410St1();
                                c735410St1.LJIJI(c0sq1L5.LIZ);
                                String str = c0sq1L5.LIZIZ;
                                if (str == null) {
                                    str = "";
                                }
                                c735410St1.LIZLLL = str;
                                c735410St1.LJJLIIIJILLIZJL = "click_head";
                                c735410St1.LJJZZIII = "bullet";
                                c735410St1.LJL = "bullet";
                                c735410St1.LJJJLL = user2.getFollowStatus();
                                Object objLJIIIZ = c19651011uW.LJIIIZ(c0sq1L5.LIZ, c735410St1);
                                Aweme aweme = c0sq1L5.LIZ;
                                c735840Sti.getClass();
                                C735840Sti.LIZIZ(aweme, objLJIIIZ);
                                ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
                            }
                            reactionBubbleContentCell.T5(user2, c0sq1L5);
                            Context context = reactionBubbleContentCell.itemView.getContext();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("aweme://user/profile/");
                            sbLIZ.append(user2.getUid());
                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
                            smartRouteBuildRoute.withParam("sec_user_id", user2.getSecUid());
                            smartRouteBuildRoute.open();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(700L);
                    this.$t = i;
                    this.l0 = this;
                    this.l1 = user;
                }
            }, this.itemView);
            SmartImageView smartImageView = this.LLILLL;
            if (smartImageView != null) {
                final int i2 = 1;
                C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl(this, user, i2) { // from class: X.0SyL
                    public final int $t;
                    public Object l0;
                    public Object l1;

                    @Override // X.AbstractViewOnClickListenerC372950Ejl
                    public final void LIZ(View view) {
                        switch (this.$t) {
                            case 0:
                                LIZ$0(this, view);
                                break;
                            case 1:
                                LIZ$1(this, view);
                                break;
                            default:
                                super.LIZ(view);
                                break;
                        }
                    }

                    public static final void LIZ$0(C738710SyL c738710SyL, View view) {
                        if (view != null) {
                            ((ReactionBubbleContentCell) c738710SyL.l0).V5(view);
                            ReactionBubbleContentCell reactionBubbleContentCell = (ReactionBubbleContentCell) c738710SyL.l0;
                            reactionBubbleContentCell.T5((User) c738710SyL.l1, reactionBubbleContentCell.L5());
                        }
                    }

                    public static final void LIZ$1(C738710SyL c738710SyL, View view) {
                        if (view != null) {
                            ReactionBubbleContentCell reactionBubbleContentCell = (ReactionBubbleContentCell) c738710SyL.l0;
                            User user2 = (User) c738710SyL.l1;
                            C0SQ1 c0sq1L5 = reactionBubbleContentCell.L5();
                            if (!C10EU.LJIIZILJ(user2.getUid())) {
                                if (c0sq1L5 != null) {
                                    C735840Sti c735840Sti = C735840Sti.LIZ;
                                    C19651011uW c19651011uW = C19651011uW.LIZIZ;
                                    C735410St1 c735410St1 = new C735410St1();
                                    c735410St1.LJIJI(c0sq1L5.LIZ);
                                    String str = c0sq1L5.LIZIZ;
                                    if (str == null) {
                                        str = "";
                                    }
                                    c735410St1.LIZLLL = str;
                                    c735410St1.LJJLIIIJILLIZJL = "click_head";
                                    c735410St1.LJJZZIII = "bullet";
                                    c735410St1.LJL = "bullet";
                                    c735410St1.LJJJLL = user2.getFollowStatus();
                                    Object objLJIIIZ = c19651011uW.LJIIIZ(c0sq1L5.LIZ, c735410St1);
                                    Aweme aweme = c0sq1L5.LIZ;
                                    c735840Sti.getClass();
                                    C735840Sti.LIZIZ(aweme, objLJIIIZ);
                                    ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
                                }
                                reactionBubbleContentCell.T5(user2, c0sq1L5);
                                Context context = reactionBubbleContentCell.itemView.getContext();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("aweme://user/profile/");
                                sbLIZ.append(user2.getUid());
                                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
                                smartRouteBuildRoute.withParam("sec_user_id", user2.getSecUid());
                                smartRouteBuildRoute.open();
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(700L);
                        this.$t = i2;
                        this.l0 = this;
                        this.l1 = user;
                    }
                }, smartImageView);
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(N5(c720930SPr));
            }
            CharSequence charSequenceI5 = I5(c720930SPr);
            if (charSequenceI5 != null && charSequenceI5.length() != 0 && (tuxTextView = this.LLILZIL) != null) {
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append(charSequenceI5);
                tuxTextView.setText(c1360520lVa.LIZ);
            }
            String strP5 = P5(c720930SPr);
            if (TextUtils.isEmpty(strP5)) {
                TuxIconView tuxIconView = this.LLILZLL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
                TuxTextView tuxTextView3 = this.LLIZ;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 8);
                }
                R5(false);
            } else {
                TuxIconView tuxIconView2 = this.LLILZLL;
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                }
                TuxTextView tuxTextView4 = this.LLIZ;
                if (tuxTextView4 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView4, 0);
                }
                TuxTextView tuxTextView5 = this.LLIZ;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(strP5);
                }
                R5(true);
            }
            if (S5(c720930SPr)) {
                C786410Ut5.LJLLLLLL(0, this.itemView);
                this.itemView.setTag(1);
            } else {
                C786410Ut5.LJLLLLLL(4, this.itemView);
                this.itemView.setTag(0);
            }
            View view = this.itemView;
            C384050F3z c384050F3z = new C384050F3z();
            C0SQ1 c0sq1L5 = L5();
            if (c0sq1L5 != null && Intrinsics.LJFF(c0sq1L5.LJII, Boolean.TRUE)) {
                c384050F3z.LIZ = -231525581;
            } else {
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
            }
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a4f, viewGroup, false);
        C384050F3z c384050F3z = new C384050F3z();
        C0SQ1 c0sq1L5 = L5();
        if (c0sq1L5 != null && Intrinsics.LJFF(c0sq1L5.LJII, Boolean.TRUE)) {
            c384050F3z.LIZ = -231525581;
        } else {
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        }
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        viewTd.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        this.LLILLL = (SmartImageView) viewTd.findViewById(R.id.bh8);
        this.LLILZ = (TuxTextView) viewTd.findViewById(R.id.p0a);
        this.LLILZIL = (TuxTextView) viewTd.findViewById(R.id.fmb);
        this.LLILZLL = (TuxIconView) viewTd.findViewById(R.id.t6y);
        this.LLIZ = (TuxTextView) viewTd.findViewById(R.id.t6z);
        C786410Ut5.LJLLLLLL(4, viewTd);
        return viewTd;
    }

    public final void T5(User user, C0SQ1 c0sq1) {
        String str;
        String str2;
        Pair[] pairArr = new Pair[4];
        Aweme aweme = null;
        if (c0sq1 != null) {
            str = c0sq1.LIZIZ;
        } else {
            str = null;
        }
        pairArr[0] = new Pair(str, "enter_from");
        pairArr[1] = new Pair(U5(), "notice_type");
        if (c0sq1 != null) {
            aweme = c0sq1.LIZ;
        }
        if (C729510SjV.LJJ(aweme)) {
            str2 = "story";
        } else {
            str2 = "post";
        }
        pairArr[2] = new Pair(str2, "story_type");
        pairArr[3] = new Pair(user.getUid(), "from_user_id");
        C20684815ws.LJIJI("interaction_bullet_click", pairArr);
    }
}
