package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC420730Ged;
import X.C01GW;
import X.C06WG;
import X.C0BKP;
import X.C0I2X;
import X.C0OAD;
import X.C0WZX;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1308910kAL;
import X.C1341800l1O;
import X.C1344030l4z;
import X.C1346810l9T;
import X.C1346820l9U;
import X.C1346910l9d;
import X.C1346920l9e;
import X.C1351950lHl;
import X.C1353500lKG;
import X.C1360340lVI;
import X.C1389890mGx;
import X.C1402080mac;
import X.C14LC;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19606111nH;
import X.C19EG;
import X.C19MB;
import X.C19ME;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2204961BRm;
import X.C286040BJa;
import X.C296140BjA;
import X.C309690CBz;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427870Gq9;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1341680l1C;
import X.EnumC1346360l8k;
import X.EnumC733380Spk;
import X.EnumC992180bvU;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ACListenerS155S0100000_21;
import Y.ACListenerS28S1300000_16;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS26S1100000_21;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.CommentDetailBottomEmojiExp;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.DetailBottomKeyboardVScope;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.scope.DetailPageBottomBarScope;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.DetailBottomFakeInput;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS67S0100000_21;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class DetailBottomFakeInput extends BaseFakeInput implements IDetailBottomInputAssemAbility, InterfaceC737790Swr {
    public View LLLIIIIL;
    public TuxTextView LLLIIIL;
    public LinearLayout LLLIIL;
    public LinearLayout LLLIILIL;
    public ConstraintLayout LLLIL;
    public volatile boolean LLLILZJ;
    public C19606111nH LLLILZLLLI;
    public final DetailBottomFakeInput LLLIIII = this;
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 138));

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput
    public final void dq() {
        if (((Number) C286040BJa.LIZ.getValue()).intValue() > 0) {
            lq();
        } else {
            super.dq();
        }
    }

    public final void jq() {
        Drawable drawableLIZ;
        View view = this.LLLIIIIL;
        if (view != null) {
            Context context = view.getContext();
            if (context != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
                drawableLIZ = c384050F3z.LIZ(context);
            } else {
                drawableLIZ = null;
            }
            view.setBackground(drawableLIZ);
        }
        View view2 = this.LLLIIIIL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            C786410Ut5.W5(view2, layoutParams);
        }
        kq();
    }

    public final void kq() {
        ConstraintLayout constraintLayout = this.LLLIL;
        if (constraintLayout != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            View view = this.LLJJLIIIJLLLLLLLZ;
            boolean z = false;
            if (view != null && view.getVisibility() == 0) {
                z = true;
            }
            if (z) {
                C1353500lKG c1353500lKG = this.LLJJIJI;
                if (c1353500lKG != null) {
                    int id = c1353500lKG.getId();
                    View view2 = this.LLJJLIIIJLLLLLLLZ;
                    if (view2 != null) {
                        c19mb.LJIIIIZZ(id, 7, view2.getId(), 6);
                        c19mb.LJJIIJZLJL(id, 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    }
                }
            } else {
                C1353500lKG c1353500lKG2 = this.LLJJIJI;
                if (c1353500lKG2 != null) {
                    int id2 = c1353500lKG2.getId();
                    LinearLayout linearLayout = this.LLLIILIL;
                    if (linearLayout != null) {
                        c19mb.LJIIIIZZ(id2, 7, linearLayout.getId(), 6);
                        c19mb.LJJIIJZLJL(id2, 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    }
                }
            }
            c19mb.LIZIZ(constraintLayout);
        }
    }

    public final void pq() {
        Aweme aweme;
        CommentDetailBottomEmojiExp commentDetailBottomEmojiExp = CommentDetailBottomEmojiExp.LIZ;
        CommentContextSource commentContextSourceKp = kp();
        String aid = (commentContextSourceKp == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceKp)) == null) ? null : aweme.getAid();
        commentDetailBottomEmojiExp.getClass();
        if (CommentDetailBottomEmojiExp.LIZJ(aid) && CommentDetailBottomEmojiExp.LIZ() && ((CommentDetailBottomEmojiExp.BottomEmojiABConfig) CommentDetailBottomEmojiExp.LIZJ.getValue()).hasAvatar == 1) {
            C337180DJs.LIZJ(this.LLJJIII);
            yp();
            C427870Gq9 c427870Gq9 = this.LLJJIII;
            if (c427870Gq9 != null) {
                ViewGroup.LayoutParams layoutParams = c427870Gq9.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                C786410Ut5.W5(c427870Gq9, layoutParams);
            }
            C19MB c19mb = new C19MB();
            c19mb.LJII(this.LLLIL);
            View view = this.LLLIIIIL;
            if (view != null) {
                int id = view.getId();
                c19mb.LJJIIJZLJL(id, 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
                C427870Gq9 c427870Gq92 = this.LLJJIII;
                if (c427870Gq92 != null) {
                    c19mb.LJIIIZ(c427870Gq92.getId(), 3, id, 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                }
                C427870Gq9 c427870Gq93 = this.LLJJIII;
                if (c427870Gq93 != null) {
                    c19mb.LJIIIZ(c427870Gq93.getId(), 4, id, 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                }
            }
            c19mb.LIZIZ(this.LLLIL);
            C427870Gq9 c427870Gq94 = this.LLJJIII;
            if (c427870Gq94 != null) {
                C786410Ut5.P8(c427870Gq94, new ACListenerS155S0100000_21(this, 24));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem
    public final boolean zp() {
        boolean zLIZIZ;
        Aweme aweme;
        DetailBottomBarAbility detailBottomBarAbility = (DetailBottomBarAbility) this.LLLILZ.getValue();
        C2189821An6 c2189821An6Xp0 = detailBottomBarAbility != null ? detailBottomBarAbility.xp0() : null;
        boolean z = C1360340lVI.LIZIZ(c2189821An6Xp0) || C1360340lVI.LIZLLL(c2189821An6Xp0);
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceKp)) == null) {
            zLIZIZ = false;
        } else {
            CommentDetailBottomEmojiExp.LIZ.getClass();
            zLIZIZ = CommentDetailBottomEmojiExp.LIZIZ(aweme);
        }
        return (z && zLIZIZ) ? ip() && !Ap() : super.zp();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IDetailBottomInputAssemAbility
    public final void W3() {
        vq();
        CommentContextSource commentContextSourceKp = kp();
        bT(commentContextSourceKp != null ? CommentContextSourceKt.aweme(commentContextSourceKp) : null);
    }

    public final boolean iq() {
        Aweme aweme;
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp)) != null) {
            EnumC733380Spk enumC733380SpkLJJI = ((CommentService) ServiceManager.get().getService(CommentService.class)).LJJI(aweme);
            if (enumC733380SpkLJJI == EnumC733380Spk.FTC) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                    c1389890mGx.LJIIJ(C0OAD.LIZ(2131858174, aweme));
                    c1389890mGx.LJIIJJI();
                }
                return false;
            }
            if (enumC733380SpkLJJI != EnumC733380Spk.UNAVAILABLE && enumC733380SpkLJJI != EnumC733380Spk.DELETED) {
                return true;
            }
            if (AwemeExtKt.isImage(aweme)) {
                C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                if (c19egLIZ2 != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZ2);
                    c1389890mGx2.LJIIIZ(2131835839);
                    c1389890mGx2.LJIIJJI();
                    return false;
                }
            } else {
                C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                if (c19egLIZ3 != null) {
                    C1389890mGx c1389890mGx3 = new C1389890mGx(c19egLIZ3);
                    c1389890mGx3.LJIIIZ(2131858174);
                    c1389890mGx3.LJIIJJI();
                }
            }
        }
        return false;
    }

    public final void lq() {
        LinearLayout linearLayout;
        boolean zZp = zp();
        boolean zAp = Ap();
        if (zZp) {
            qq();
        } else {
            LinearLayout linearLayout2 = this.LLLIILIL;
            if (linearLayout2 != null) {
                C337180DJs.LIZ(linearLayout2);
            }
        }
        if (zAp) {
            tq();
        } else {
            LinearLayout linearLayout3 = this.LLJJIJIIJIL;
            if (linearLayout3 != null) {
                C337180DJs.LIZ(linearLayout3);
            }
        }
        if (zZp || zAp) {
            pq();
            View view = this.LLLIIIIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LLLIIIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        C427870Gq9 c427870Gq9 = this.LLJJIII;
        if (c427870Gq9 != null) {
            C786410Ut5.LLLLJI(c427870Gq9, 8);
        }
        LinearLayout linearLayout4 = this.LLLIILIL;
        if (linearLayout4 != null) {
            C786410Ut5.LJZL(8, linearLayout4);
        }
        if (this.LLLIL != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(this.LLLIL);
            View view3 = this.LLLIIIIL;
            if (view3 != null) {
                c19mb.LJJIIJZLJL(view3.getId(), 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            }
            c19mb.LIZIZ(this.LLLIL);
        }
        if (ip() || (linearLayout = this.LLJJIJIIJIL) == null) {
            return;
        }
        C337180DJs.LIZIZ(linearLayout);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        C1558520qew.LJIIJ(this, DetailBottomKeyboardVScope.class, IDetailBottomInputAssemAbility.class, null);
    }

    public final void qq() {
        Aweme aweme;
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceKp)) == null) {
            return;
        }
        if (C296140BjA.LIZ(AwemeExtKt.getFollowStatus(aweme))) {
            LinearLayout linearLayout = this.LLLIILIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
                return;
            }
            return;
        }
        if (zp()) {
            LinearLayout linearLayout2 = this.LLJJIJIIJIL;
            if (linearLayout2 != null) {
                HandlerHook.viewPost(linearLayout2, new ARunnableS121S0100000_21(this, 34));
            }
            LinearLayout linearLayout3 = this.LLLIILIL;
            final int i = 0;
            if (linearLayout3 != null) {
                C786410Ut5.LJZL(0, linearLayout3);
            }
            jq();
            LinearLayout linearLayout4 = this.LLLIILIL;
            if (linearLayout4 == null || linearLayout4.getChildCount() != 0) {
                return;
            }
            C0I2X.LIZ.getClass();
            final List listLIZJ = C0I2X.LIZJ(aweme);
            for (Object obj : listLIZJ) {
                int i2 = i + 1;
                C06WG c06wg = null;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                CommentPersonalizedEmoji commentPersonalizedEmoji = (CommentPersonalizedEmoji) obj;
                if (i < 3) {
                    final String str = commentPersonalizedEmoji.emoji;
                    if (str == null) {
                        str = "";
                    }
                    Context context = getContext();
                    if (context != null) {
                        c06wg = new C06WG(context);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("bindEmoji ");
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c06wg.LL.setText(str);
                        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0l9S
                            @Override // X.AbstractViewOnClickListenerC420730Ged
                            public final void LIZ(View view) {
                                Aweme aweme2;
                                Aweme aweme3;
                                View view2;
                                EmojiAnimPlayground emojiAnimPlayground;
                                ViewStub viewStub;
                                Fragment parentFragment;
                                long commentCount;
                                if (view != null && this.LLILZ.iq()) {
                                    DetailBottomFakeInput detailBottomFakeInput = this.LLILZ;
                                    String str2 = str;
                                    CommentContextSource commentContextSourceKp2 = detailBottomFakeInput.kp();
                                    if (commentContextSourceKp2 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null) {
                                        AwemeControl awemeControl = aweme2.getAwemeControl();
                                        if ((awemeControl != null && !awemeControl.canComment()) || str2 == null || str2.length() == 0) {
                                            return;
                                        }
                                        String strLJJ = u.LJJ(3, str2);
                                        C1345150l6n c1345150l6n = new C1345150l6n();
                                        c1345150l6n.LIZJ = "click_bottom_comment_emoji";
                                        C294190Bg1.LIZ.getClass();
                                        if (C294190Bg1.LIZ()) {
                                            AwemeStatistics statistics = aweme2.getStatistics();
                                            if (statistics != null) {
                                                commentCount = statistics.getCommentCount();
                                            } else {
                                                commentCount = 0;
                                            }
                                            c1345150l6n.LJIIIZ = Long.valueOf(commentCount);
                                        }
                                        CommentContextSource commentContextSourceKp3 = detailBottomFakeInput.kp();
                                        View viewLJLLLL = null;
                                        if (commentContextSourceKp3 != null) {
                                            aweme3 = CommentContextSourceKt.aweme(commentContextSourceKp3);
                                        } else {
                                            aweme3 = null;
                                        }
                                        detailBottomFakeInput.tp().Yb0(new C1345120l6k(strLJJ, 1, 1, c1345150l6n, aweme3, 190974), null, null);
                                        if (C2176211AEx.LIZJ() || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                                            return;
                                        }
                                        C19606111nH c19606111nH = detailBottomFakeInput.LLLILZLLLI;
                                        if (c19606111nH == null) {
                                            Fragment fragmentLJI = C724240Sb0.LJI(detailBottomFakeInput);
                                            if (fragmentLJI != null && (parentFragment = fragmentLJI.getParentFragment()) != null) {
                                                view2 = parentFragment.getView();
                                            } else {
                                                view2 = null;
                                            }
                                            if ((view2 instanceof ViewGroup) && view2 != null && (viewStub = (ViewStub) view2.findViewById(R.id.b48)) != null) {
                                                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                                            }
                                            if (!(viewLJLLLL instanceof EmojiAnimPlayground) || (emojiAnimPlayground = (EmojiAnimPlayground) viewLJLLLL) == null) {
                                                return;
                                            }
                                            detailBottomFakeInput.LLLILZLLLI = new C19606111nH(emojiAnimPlayground);
                                            HandlerHook.viewPost(emojiAnimPlayground, new ARunnableS26S1100000_21(detailBottomFakeInput, str2, 9));
                                            return;
                                        }
                                        str2.toString();
                                        c19606111nH.LIZIZ(str2);
                                    }
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(700L);
                            }
                        }, c06wg);
                    }
                    LinearLayout linearLayout5 = this.LLLIILIL;
                    if (linearLayout5 != null) {
                        linearLayout5.addView(c06wg);
                    }
                }
                i = i2;
            }
        }
    }

    public final void tq() {
        if (Ap()) {
            LinearLayout linearLayout = this.LLJJIJIIJIL;
            if (linearLayout != null) {
                HandlerHook.viewPost(linearLayout, new ARunnableS121S0100000_21(this, 35));
            }
            LinearLayout linearLayout2 = this.LLLIILIL;
            if (linearLayout2 != null) {
                C337180DJs.LIZ(linearLayout2);
            }
            wq(R.attr.zl);
            jq();
        }
    }

    public final void vq() {
        Aweme aweme;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C1353500lKG c1353500lKG = this.LLJJIJI;
            if (c1353500lKG != null) {
                c1353500lKG.setFocusable(true);
            }
            C1353500lKG c1353500lKG2 = this.LLJJIJI;
            if (c1353500lKG2 != null) {
                c1353500lKG2.setFocusableInTouchMode(true);
            }
        } else {
            C1353500lKG c1353500lKG3 = this.LLJJIJI;
            if (c1353500lKG3 != null) {
                c1353500lKG3.setFocusable(false);
            }
        }
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceKp)) == null || !AwemeExtKt.isProhibited(aweme)) {
            C1353500lKG c1353500lKG4 = this.LLJJIJI;
            if (c1353500lKG4 != null) {
                c1353500lKG4.setEnabled(true);
            }
            View view = this.LLJJJJJIL;
            if (view != null) {
                view.setEnabled(true);
            }
        } else {
            C1353500lKG c1353500lKG5 = this.LLJJIJI;
            if (c1353500lKG5 != null) {
                c1353500lKG5.setEnabled(false);
            }
            View view2 = this.LLJJJJJIL;
            if (view2 != null) {
                view2.setEnabled(false);
            }
            C1353500lKG c1353500lKG6 = this.LLJJIJI;
            if (c1353500lKG6 != null) {
                c1353500lKG6.setHint(2131829184);
            }
        }
        C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
        CommentContextSource commentContextSourceKp2 = kp();
        CommentContextSource commentContextSourceKp3 = kp();
        Aweme aweme2 = commentContextSourceKp3 != null ? CommentContextSourceKt.aweme(commentContextSourceKp3) : null;
        c1341800l1O.getClass();
        fq(C1341800l1O.LIZ(commentContextSourceKp2, aweme2));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IDetailBottomInputAssemAbility
    public final void Do() {
        vq();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem
    public final EnumC1346360l8k getInputServiceType() {
        return EnumC1346360l8k.DETAIL_BOTTOM;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput
    public final void Vp(CommentInputContent commentInputContent) throws Throwable {
        Editable editableLLLZZIL;
        Editable editableLLLZZIL2;
        Editable editable;
        Editable editable2;
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B4g4PvWjgvyNMVyLK48SNvz8ZOAtM=", null));
        } else {
            editableLLLZZIL = null;
        }
        Objects.toString(editableLLLZZIL);
        Objects.toString(commentInputContent);
        C1353500lKG c1353500lKG2 = this.LLJJIJI;
        if (c1353500lKG2 != null) {
            editableLLLZZIL2 = C2204961BRm.LLLZZIL(c1353500lKG2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B4g4PvWjgvyNMVyLK48SNvz8ZOAtM=", null));
        } else {
            editableLLLZZIL2 = null;
        }
        String strValueOf = String.valueOf(editableLLLZZIL2);
        if (commentInputContent != null) {
            editable = commentInputContent.text;
        } else {
            editable = null;
        }
        if (!Intrinsics.LJFF(strValueOf, String.valueOf(editable))) {
            C1353500lKG c1353500lKG3 = this.LLJJIJI;
            if (c1353500lKG3 != null) {
                if (commentInputContent != null) {
                    editable2 = commentInputContent.text;
                } else {
                    editable2 = null;
                }
                c1353500lKG3.setText(editable2);
            }
            sp().LLJILJIL = false;
            sp().LLJILJILJ = false;
        }
        Bp(null, true);
        Ip(false, false, false);
        if (!isLandscapeMode()) {
            aq();
        }
        C1353500lKG c1353500lKG4 = this.LLJJIJI;
        if (c1353500lKG4 != null) {
            c1353500lKG4.setEllipsize(TextUtils.TruncateAt.END);
        }
        C1353500lKG c1353500lKG5 = this.LLJJIJI;
        if (c1353500lKG5 != null) {
            c1353500lKG5.setInputType(0);
        }
        C1353500lKG c1353500lKG6 = this.LLJJIJI;
        if (c1353500lKG6 != null) {
            c1353500lKG6.setKeyListener(null);
        }
        C1353500lKG c1353500lKG7 = this.LLJJIJI;
        if (c1353500lKG7 != null) {
            c1353500lKG7.setMovementMethod(null);
        }
        kq();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput, com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        super.bT(aweme);
        tp().LLILLJJLI = C1558520qew.LJIIL(this);
        lq();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DetailPageBottomBarScope.class}).unbindAbility(this.LLLIIII, IDetailBottomInputAssemAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput, com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        Integer numLIZJ2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view);
        C1558520qew.LJI(this, DetailBottomKeyboardVScope.class, this, IDetailBottomInputAssemAbility.class, null, null);
        this.LLLIIL = (LinearLayout) view.findViewById(R.id.ksa);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.uk, view.getContext());
        if (numLIZJ3 != null) {
            int iIntValue = numLIZJ3.intValue();
            LinearLayout linearLayout = this.LLLIIL;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(iIntValue);
            }
        }
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 6), view2);
        }
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 7), c1353500lKG);
        }
        C1346810l9T c1346810l9TLp = lp();
        if (c1346810l9TLp != null) {
            c1346810l9TLp.LJIJJ = EnumC992180bvU.DETAIL_BOTTOM;
        }
        C1346810l9T c1346810l9TLp2 = lp();
        if (c1346810l9TLp2 != null) {
            C1346820l9U.LIZ(c1346810l9TLp2.LJFF, c1346810l9TLp2.LJIIL, c1346810l9TLp2.LJIILL, c1346810l9TLp2.LJIILLIIL, c1346810l9TLp2.LJIJ, c1346810l9TLp2.LJIIZILJ);
        }
        wq(R.attr.eg);
        this.LLLIIIIL = view.findViewById(R.id.ma7);
        this.LLLIIIL = (TuxTextView) view.findViewById(R.id.ed2);
        C1353500lKG c1353500lKG2 = this.LLJJIJI;
        if (c1353500lKG2 != null) {
            c1353500lKG2.getHintTextColors();
        }
        this.LLLIL = (ConstraintLayout) view.findViewById(R.id.eaj);
        this.LLLIILIL = (LinearLayout) view.findViewById(R.id.gzs);
        C427870Gq9 c427870Gq9 = this.LLJJIII;
        if (c427870Gq9 != null) {
            C786410Ut5.LLLLJI(c427870Gq9, 8);
        }
        ImageView imageView = this.LLJL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        View view3 = this.LLJJJJJIL;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                marginLayoutParams2 = marginLayoutParams;
            }
            View view4 = this.LLJJJJJIL;
            if (view4 != null) {
                C786410Ut5.W5(view4, marginLayoutParams2);
            }
        }
        View view5 = this.LLLIIIIL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(4, view5);
        }
        boolean z = C14LC.LJIIIZ;
        C309690CBz.LIZ.getClass();
        int iLIZ = C418440Gaw.LIZ(Integer.valueOf(C14LC.LJIILIIL));
        if (iLIZ < 0) {
            iLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
        }
        C1351950lHl.LJIJI(iLIZ, LJJIJL());
        Context context = getContext();
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.eg, context)) != null) {
            int iIntValue2 = numLIZJ2.intValue();
            C1353500lKG c1353500lKG3 = this.LLJJIJI;
            if (c1353500lKG3 != null) {
                c1353500lKG3.setHintTextColor(iIntValue2);
            }
            TuxTextView tuxTextView = this.LLJZ;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue2);
            }
        }
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ef, context2)) != null) {
            int iIntValue3 = numLIZJ.intValue();
            C1353500lKG c1353500lKG4 = this.LLJJIJI;
            if (c1353500lKG4 != null) {
                c1353500lKG4.setTextColor(iIntValue3);
            }
        }
        C1353500lKG c1353500lKG5 = this.LLJJIJI;
        if (c1353500lKG5 != null) {
            C426750GoL.LJIIIZ(c1353500lKG5, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13))), false, 16);
        }
        vq();
        boolean zAp = Ap();
        boolean zZp = zp();
        if (zZp) {
            qq();
        } else {
            LinearLayout linearLayout2 = this.LLLIILIL;
            if (linearLayout2 != null) {
                C337180DJs.LIZ(linearLayout2);
            }
        }
        if (zAp) {
            tq();
        } else {
            LinearLayout linearLayout3 = this.LLJJIJIIJIL;
            if (linearLayout3 != null) {
                C337180DJs.LIZ(linearLayout3);
            }
        }
        if (!zZp && !zAp) {
            View view6 = this.LLLIIIIL;
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(4, view6);
            }
        } else {
            pq();
            View view7 = this.LLLIIIIL;
            if (view7 != null) {
                C786410Ut5.LJLLLLLL(0, view7);
            }
        }
        if ((C0BKP.LIZ() == 2 || C0BKP.LIZ() == 3) && !this.LLLILZJ) {
            this.LLLILZJ = true;
            C1344030l4z.LIZJ("DetailBottomFakeInput", "scheduleKeyboardPreWarm: registered idle handler");
            C786410Ut5.f3(new C1402080mac(this, 2), Looper.myQueue());
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DetailPageBottomBarScope.class}).bindAbility(this.LLLIIII, IDetailBottomInputAssemAbility.class);
    }

    public final void wq(int i) {
        TuxIconView tuxIconView = this.LLJJJJ;
        if (tuxIconView != null) {
            tuxIconView.setTintColorRes(i);
        }
        TuxIconView tuxIconView2 = this.LLJJJIL;
        if (tuxIconView2 != null) {
            tuxIconView2.setTintColorRes(i);
        }
        TuxIconView tuxIconView3 = this.LLJJIJIL;
        if (tuxIconView3 != null) {
            tuxIconView3.setTintColorRes(i);
        }
        TuxIconView tuxIconView4 = this.LLJJJ;
        if (tuxIconView4 != null) {
            tuxIconView4.setTintColorRes(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IDetailBottomInputAssemAbility
    public final void y0(boolean z) {
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            c1353500lKG.setEnabled(!z);
        }
        C1353500lKG c1353500lKG2 = this.LLJJIJI;
        if (c1353500lKG2 != null) {
            c1353500lKG2.setFocusable(!z);
        }
        View view = this.LLJJJJJIL;
        if (view != null) {
            view.setEnabled(!z);
        }
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            view2.setFocusable(!z);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput
    public final C1346920l9e Tp(EnumC1341680l1C enumC1341680l1C, CommentStickerStruct commentStickerStruct) {
        String str;
        String str2;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        EnumC1346360l8k enumC1346360l8k = EnumC1346360l8k.DETAIL_BOTTOM;
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp != null && (commonModel2 = commentContextSourceKp.getCommonModel()) != null) {
            str = commonModel2.noticeId;
        } else {
            str = null;
        }
        CommentContextSource commentContextSourceKp2 = kp();
        if (commentContextSourceKp2 == null || (commonModel = commentContextSourceKp2.getCommonModel()) == null || (str2 = commonModel.accountType) == null) {
            str2 = "";
        }
        return new C1346920l9e(false, false, false, false, false, false, enumC1346360l8k, 0, enumC1341680l1C, false, new C1346910l9d(str2, null, commentStickerStruct, 0, EnumC1341680l1C.TEXT, "text", str, CommentContextSourceKt.getFriendsV3TrackScene(kp()), null, ""), false);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IDetailBottomInputAssemAbility
    public final void r2(String str, String str2) {
        Aweme aweme;
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
        } else {
            aweme = null;
        }
        TuxTextView tuxTextView = this.LLLIIIL;
        if (tuxTextView != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView);
        }
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            c1353500lKG.setText(str);
        }
        C1353500lKG c1353500lKG2 = this.LLJJIJI;
        if (c1353500lKG2 != null) {
            c1353500lKG2.setEnabled(false);
        }
        View view = this.LLJJJJJIL;
        if (view != null) {
            view.setEnabled(false);
        }
        if (aweme != null && C1017070cZd.LLFII(aweme)) {
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            TuxTextView tuxTextView2 = this.LLLIIIL;
            if (tuxTextView2 != null) {
                C786410Ut5.h9(tuxTextView2, new ACListenerS28S1300000_16(aweme, str2, this, commerceVideoAuthInfo, 0));
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LLLIIIL;
        if (tuxTextView3 != null) {
            C786410Ut5.h9(tuxTextView3, null);
        }
    }
}
