package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C0BJP;
import X.C0HD5;
import X.C0HZQ;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1339470kxd;
import X.C1339950kyP;
import X.C1340040kyY;
import X.C1340110kyf;
import X.C1340200kyo;
import X.C1340410kz9;
import X.C1340430kzB;
import X.C1341570l11;
import X.C1343670l4P;
import X.C1344540l5o;
import X.C1345550l7R;
import X.C1350920lG6;
import X.C13LP;
import X.C1402300may;
import X.C14EU;
import X.C1602160rnK;
import X.C1609500rzA;
import X.C21146717pB;
import X.C2188811AlT;
import X.C294200Bg2;
import X.C337180DJs;
import X.C461720I8s;
import X.C563400M7u;
import X.C687700QyG;
import X.C729800Sjy;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS27S0201000_21;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.texttoimage.ICommentInlineBannerReadyListener;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS136S1200000_21;
import kotlin.jvm.internal.AwS170S1100000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class CommentItemCell<T> extends BaseCommentCell<C1340430kzB> implements InterfaceC1146704e9 {
    public TuxIconView LLLLLZIL;
    public C1340200kyo LLLLLZL;
    public boolean LLLLZ;
    public String LLLLZI;
    public boolean LLLLZIL;

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final boolean I7() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final boolean L7() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, X.InterfaceC1345590l7V
    public final void LLLLLJIL() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final boolean T6() {
        return false;
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final void W5() {
        C1341570l11 c1341570l11 = C1341570l11.LIZ;
        CommentContextSource commentContextSourceI6 = i6();
        Context context = this.itemView.getContext();
        c1341570l11.getClass();
        if (!C1341570l11.LIZJ(context, commentContextSourceI6) && C1341570l11.LIZIZ(q6(), getAweme())) {
            C1340200kyo c1340200kyo = this.LLLLLZL;
            if (c1340200kyo == null || !c1340200kyo.LLJJJIL) {
                C1350920lG6.LJJLIIJ(q6(), getAweme(), getEventType());
                C1340200kyo c1340200kyo2 = this.LLLLLZL;
                if (c1340200kyo2 != null) {
                    c1340200kyo2.setReportedAddAsPostShow(true);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final void t7() {
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null) {
            C337180DJs.LIZJ(frameLayout);
        }
    }

    public final void u8() {
        Object next;
        String str;
        Integer num;
        Comment comment;
        User user;
        Comment comment2;
        CmtUserBadgeInfoStruct cmtUserBadgeInfoStruct;
        String str2;
        Comment comment3;
        SmartImageView smartImageView = this.LLLF;
        if (smartImageView == null) {
            smartImageView = (SmartImageView) this.itemView.findViewById(R.id.lcl);
        }
        List listLIZ = C1340110kyf.LIZ();
        C1340430kzB c1340430kzB = (C1340430kzB) getItem();
        if ((c1340430kzB == null || (comment3 = c1340430kzB.LLILZIL) == null || comment3.getCmtUserBadgeInfoStruct() == null) && listLIZ != null) {
            C1340430kzB c1340430kzB2 = (C1340430kzB) getItem();
            if (Intrinsics.LJFF((c1340430kzB2 == null || (comment = c1340430kzB2.LLILZIL) == null || (user = comment.getUser()) == null) ? null : user.getUid(), C461720I8s.LIZIZ())) {
                Iterator it2 = listLIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    CmtUserBadgeInfoStruct cmtUserBadgeInfoStruct2 = (CmtUserBadgeInfoStruct) next;
                    if (cmtUserBadgeInfoStruct2 != null && (num = cmtUserBadgeInfoStruct2.level) != null && num.intValue() == 1) {
                        break;
                    }
                }
                CmtUserBadgeInfoStruct cmtUserBadgeInfoStruct3 = (CmtUserBadgeInfoStruct) next;
                if (cmtUserBadgeInfoStruct3 != null && (str = cmtUserBadgeInfoStruct3.url) != null && C123100dR.LIZ(str)) {
                    if (smartImageView != null) {
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                        c1331670kl3LJIIIZ.LJJ(smartImageView);
                        c1331670kl3LJIIIZ.LJIIL(new C1402300may(this, 2));
                        return;
                    }
                    return;
                }
            }
        }
        C1340430kzB c1340430kzB3 = (C1340430kzB) getItem();
        if (c1340430kzB3 == null || (comment2 = c1340430kzB3.LLILZIL) == null || (cmtUserBadgeInfoStruct = comment2.getCmtUserBadgeInfoStruct()) == null || !C123100dR.LIZ(cmtUserBadgeInfoStruct.url) || (str2 = cmtUserBadgeInfoStruct.url) == null) {
            if (smartImageView != null) {
                smartImageView.setImageDrawable(null);
            }
        } else if (smartImageView != null) {
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ2.LJJ(smartImageView);
            c1331670kl3LJIIIZ2.LJIIL(new C1402300may(this, 2));
        }
    }

    public final void x8() {
        View view = this.LLILZ;
        if (view == null) {
            return;
        }
        C1340200kyo c1340200kyo = this.LLLLLZL;
        int iLIZ = C0HD5.LIZ(this.itemView, Integer.valueOf((c1340200kyo == null || c1340200kyo.getVisibility() != 0) ? 8 : 4));
        if (view.getPaddingBottom() != iLIZ) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), iLIZ);
        }
    }

    private final void r8() {
        if (C0BJP.LIZ()) {
            if (this.LLLFF) {
                EventBus.LIZLLL().LJJI(this);
                this.LLLFF = false;
            }
        } else if (this.LLLLZIL) {
            EventBus.LIZLLL().LJJI(this);
            this.LLLLZIL = false;
        }
        C1340200kyo c1340200kyo = this.LLLLLZL;
        if (c1340200kyo != null) {
            c1340200kyo.LIZIZ();
        }
        C1340200kyo c1340200kyo2 = this.LLLLLZL;
        if (c1340200kyo2 != null) {
            c1340200kyo2.LJ(false);
        }
        this.LLLLZI = null;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    public final void dispatchDestroy() {
        super.dispatchDestroy();
        r8();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onDestroy() {
        super.onDestroy();
        r8();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLLLLZIL = (TuxIconView) this.itemView.findViewById(R.id.kh6);
        if (C729800Sjy.LIZ() != 1) {
            C1343670l4P c1343670l4P = new C1343670l4P();
            this.LL = c1343670l4P;
            TuxIconView tuxIconView = this.LLLLLZIL;
            if (tuxIconView != null) {
                c1343670l4P.LIZIZ = tuxIconView;
            }
        }
        C1609500rzA c1609500rzA = this.LLJI;
        if (c1609500rzA != null) {
            c1609500rzA.setRingStrokeWidthByAvatarSize(36);
        }
        C1609500rzA c1609500rzA2 = this.LLJI;
        if (c1609500rzA2 != null) {
            ViewGroup.LayoutParams layoutParams = c1609500rzA2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = C0HD5.LIZ(this.itemView, 46);
            layoutParams.height = C0HD5.LIZ(this.itemView, 46);
            C786410Ut5.W5(c1609500rzA2, layoutParams);
        }
        this.LLLF = (SmartImageView) this.itemView.findViewById(R.id.lcl);
        SmartImageView smartImageView = this.LLLF;
        if (smartImageView != null) {
            ViewGroup.LayoutParams layoutParams2 = smartImageView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = C0HD5.LIZ(this.itemView, 46);
            layoutParams2.height = C0HD5.LIZ(this.itemView, 46);
            C786410Ut5.W5(smartImageView, layoutParams2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        if (!this.LLLLLLLLLL.isEmpty()) {
            n7(this.itemView);
            ((LinkedHashMap) this.LLLLLLLLLL).clear();
        }
        r8();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public void h7(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        C1340410kz9 c1340410kz9;
        C1340040kyY c1340040kyY;
        TuxTextView tuxTextView;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (z) {
            U5();
            FrameLayout frameLayout = this.LLIZLLLIL;
            if (frameLayout != null) {
                layoutParams2 = frameLayout.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart(C0HD5.LIZLLL(this.itemView, 12));
                }
            } else {
                marginLayoutParams = null;
            }
            FrameLayout frameLayout2 = this.LLIZLLLIL;
            if (frameLayout2 != null) {
                C786410Ut5.W5(frameLayout2, marginLayoutParams);
            }
            C0HZQ c0hzq = this.LLLILZ;
            if (c0hzq != null) {
                C786410Ut5.LLLLLZ(c0hzq, 0);
            }
            C1345550l7R c1345550l7R = this.LLJJJ;
            if (c1345550l7R != null) {
                int visibility = c1345550l7R.getVisibility();
                c1345550l7R.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1345550l7R);
            }
            TuxTextView tuxTextView2 = this.LLLIIL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            TuxTextView tuxTextView3 = this.LLLII;
            if (tuxTextView3 != null) {
                C786410Ut5.h9(tuxTextView3, null);
            }
            TuxTextView tuxTextView4 = this.LLLII;
            if (tuxTextView4 != null) {
                tuxTextView4.setClickable(false);
            }
        } else {
            FrameLayout frameLayout3 = this.LLIZLLLIL;
            if (frameLayout3 != null) {
                layoutParams = frameLayout3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.setMarginStart(0);
            }
            FrameLayout frameLayout4 = this.LLIZLLLIL;
            if (frameLayout4 != null) {
                C786410Ut5.W5(frameLayout4, marginLayoutParams2);
            }
            C0HZQ c0hzq2 = this.LLLILZ;
            if (c0hzq2 != null) {
                C786410Ut5.LLLLLZ(c0hzq2, 8);
            }
            C1340430kzB c1340430kzB = (C1340430kzB) getItem();
            if (c1340430kzB != null && (c1340410kz9 = c1340430kzB.LLILZLL) != null && (c1340040kyY = c1340410kz9.LJ) != null && c1340040kyY.LIZ == 2) {
                z7();
                if (!J6() && (tuxTextView = this.LLLIIL) != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
            }
            p7();
            TuxTextView tuxTextView5 = this.LLLII;
            if (tuxTextView5 != null) {
                C786410Ut5.h9(tuxTextView5, new ACListenerS155S0100000_21(this, 52));
            }
        }
        X5();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final View m7(ViewGroup viewGroup) {
        C1344540l5o c1344540l5o = C1344540l5o.LIZ;
        Context context = viewGroup.getContext();
        c1344540l5o.getClass();
        if (C294200Bg2.LIZJ()) {
            int iLIZIZ = ((C563400M7u) C1344540l5o.LJIIJJI.getValue()).LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCommentCellCreated  ");
            sbLIZ.append(iLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (iLIZIZ <= 1) {
                C786410Ut5.LJJZZIII((Handler) C1344540l5o.LJIILJJIL.getValue(), new ARunnableS121S0100000_21(context, 128));
            }
        }
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a2z, viewGroup, false);
    }

    @C14EU
    public final void onDiggUpdate(C1339950kyP c1339950kyP) {
        C1340430kzB c1340430kzB;
        Comment comment;
        C1340430kzB c1340430kzB2;
        C1340410kz9 c1340410kz9;
        boolean z;
        boolean z2;
        boolean z3;
        if (!C0BJP.LIZ() && (c1340430kzB = (C1340430kzB) getItem()) != null && (comment = c1340430kzB.LLILZIL) != null && Intrinsics.LJFF(c1339950kyP.LIZ, comment.getCid())) {
            boolean z4 = false;
            if (c1339950kyP.LIZ.length() != 0 && (c1340430kzB2 = (C1340430kzB) getItem()) != null && (c1340410kz9 = c1340430kzB2.LLILZLL) != null) {
                boolean z5 = c1340410kz9.LIZIZ;
                int i = c1339950kyP.LIZIZ;
                if (i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z5 != z) {
                    comment.setUserDigged(i);
                    comment.setDiggCount(c1339950kyP.LIZJ);
                    comment.isAuthorDigged = c1339950kyP.LJ;
                    C1345550l7R c1345550l7R = this.LLJJJ;
                    if (c1345550l7R != null) {
                        if (c1339950kyP.LIZIZ == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c1345550l7R.LJIIJ(Boolean.valueOf(z3), Boolean.valueOf(c1339950kyP.LJ), Integer.valueOf(c1339950kyP.LIZJ), true, true);
                    }
                }
                boolean z6 = c1340410kz9.LIZJ;
                int i2 = c1339950kyP.LIZLLL;
                if (i2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z6 != z2) {
                    comment.setUserBuried(i2);
                    C1345550l7R c1345550l7R2 = this.LLJJJ;
                    if (c1345550l7R2 != null) {
                        if (c1339950kyP.LIZLLL == 1) {
                            z4 = true;
                        }
                        c1345550l7R2.LJIIIZ(Boolean.valueOf(z4));
                    }
                }
                c8();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b  */
    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: s8, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindItemView(X.C1340430kzB r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell.U6(X.0kzB):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [X.0l2n, com.ss.android.ugc.aweme.texttoimage.ICommentInlineBannerReadyListener] */
    public final void z8(boolean z) {
        Aweme aweme;
        boolean z2;
        int iLIZ;
        Comment commentQ6;
        String cid;
        ITextToImageService iTextToImageService;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        String strEnterFrom;
        if (z) {
            this.LLLLZ = true;
        }
        C1340200kyo c1340200kyo = this.LLLLLZL;
        if (c1340200kyo != null) {
            C1341570l11 c1341570l11 = C1341570l11.LIZ;
            CommentContextSource commentContextSourceI6 = i6();
            Context context = this.itemView.getContext();
            c1341570l11.getClass();
            if (C1341570l11.LIZJ(context, commentContextSourceI6)) {
                C786410Ut5.x(c1340200kyo, 8);
                return;
            }
            Comment commentQ62 = q6();
            CommentContextSource commentContextSourceI62 = i6();
            Aweme aweme2 = null;
            final String strEnterFrom2 = null;
            if (commentContextSourceI62 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceI62);
            } else {
                aweme = null;
            }
            if (C1341570l11.LIZIZ(commentQ62, aweme)) {
                Comment commentQ63 = q6();
                if (commentQ63 != null) {
                    Aweme aweme3 = getAweme();
                    c1340200kyo.LLJJIJI = commentQ63;
                    c1340200kyo.LLJJIJIIJIL = aweme3;
                    c1340200kyo.LJI();
                }
                if (c1340200kyo.getVisibility() == 8) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && z) {
                    if (!c1340200kyo.LLJJJIL) {
                        Comment commentQ64 = q6();
                        Aweme aweme4 = getAweme();
                        CommentContextSource commentContextSourceI63 = i6();
                        if (commentContextSourceI63 != null) {
                            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceI63);
                        } else {
                            strEnterFrom = null;
                        }
                        C1350920lG6.LJJLIIJ(commentQ64, aweme4, strEnterFrom);
                    }
                    C1340200kyo c1340200kyo2 = this.LLLLLZL;
                    if (c1340200kyo2 != null) {
                        c1340200kyo2.setReportedAddAsPostShow(true);
                    }
                    C786410Ut5.x(c1340200kyo, 0);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1340200kyo);
                    c1340200kyo.setAlpha(0.0f);
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = c1340200kyo.animate();
                    if (viewPropertyAnimatorAnimate != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(250L)) != null) {
                        duration.start();
                    }
                } else {
                    C786410Ut5.x(c1340200kyo, 0);
                }
                final C1340200kyo c1340200kyo3 = this.LLLLLZL;
                if (c1340200kyo3 != null) {
                    CommentContextSource commentContextSourceI64 = i6();
                    if (commentContextSourceI64 != null) {
                        strEnterFrom2 = CommentContextSourceKt.enterFrom(commentContextSourceI64);
                    }
                    final AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21((CommentItemCell) this, 339);
                    Comment comment = c1340200kyo3.LLJJIJI;
                    if (comment != null && (cid = comment.getCid()) != null && cid.length() > 0 && (iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null)) != 0) {
                        if (comment.getCommentPostStatus() != 0) {
                            c1340200kyo3.LIZIZ();
                            c1340200kyo3.LJ(false);
                        } else if (!Intrinsics.LJFF(c1340200kyo3.LLJJL, cid) || c1340200kyo3.LLJJJJLIIL == null) {
                            c1340200kyo3.LIZIZ();
                            ?? r2 = new ICommentInlineBannerReadyListener() { // from class: X.0l2n
                                @Override // com.ss.android.ugc.aweme.texttoimage.ICommentInlineBannerReadyListener
                                public final void onReady(String str, String str2, Object obj) {
                                    String cid2;
                                    Aweme aweme5;
                                    String cid3;
                                    Context context2;
                                    String str3;
                                    String str4;
                                    boolean zAdd;
                                    String first;
                                    String strLJJ;
                                    String strLJJ2;
                                    Comment comment2 = c1340200kyo3.LLJJIJI;
                                    Pair<String, String> pairLIZLLL = null;
                                    if (comment2 != null) {
                                        cid2 = comment2.getCid();
                                    } else {
                                        cid2 = null;
                                    }
                                    if (Intrinsics.LJFF(str, cid2)) {
                                        c1340200kyo3.LLJJLIIIJLLLLLLLZ = obj;
                                        C1340200kyo c1340200kyo4 = c1340200kyo3;
                                        String str5 = strEnterFrom2;
                                        Function0<Unit> function0 = awS565S0100000_21;
                                        Comment comment3 = c1340200kyo4.LLJJIJI;
                                        if (comment3 != null && (aweme5 = c1340200kyo4.LLJJIJIIJIL) != null && (cid3 = comment3.getCid()) != null && cid3.length() > 0 && (context2 = c1340200kyo4.getContext()) != null) {
                                            C1342740l2u.LIZ.getClass();
                                            boolean z3 = C1340250kyt.LIZ;
                                            if (z3 && cid3.length() != 0 && C1342740l2u.LJFF.contains(cid3)) {
                                                c1340200kyo4.LIZIZ();
                                                return;
                                            }
                                            if (C1342740l2u.LIZIZ(aweme5.getAid()) && !C1342740l2u.LIZJ(cid3)) {
                                                c1340200kyo4.LIZIZ();
                                                return;
                                            }
                                            if (Intrinsics.LJFF(str5, "notification_page")) {
                                                str3 = "comment_to_post_comment_from_inbox";
                                            } else {
                                                str3 = "comment_to_post_comment_from_fyp";
                                            }
                                            C1354600lM2 c1354600lM2 = C1354600lM2.LIZ;
                                            String string = "";
                                            if (str5 == null) {
                                                str4 = "";
                                            } else {
                                                str4 = str5;
                                            }
                                            ForwardMedia forwardMediaLIZ = C1354600lM2.LIZ(c1354600lM2, aweme5, str4);
                                            C572370Mcd c572370Mcd = new C572370Mcd(comment3, aweme5, false, null, str3, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, 1048556, null);
                                            if (z3 && cid3.length() != 0) {
                                                zAdd = C1342740l2u.LJII.add(cid3);
                                            } else {
                                                zAdd = false;
                                            }
                                            String str6 = "ai_rewrite";
                                            if (zAdd) {
                                                ITextToImageService iTextToImageService2 = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
                                                if (iTextToImageService2 == null || (strLJJ2 = iTextToImageService2.LJJ(cid3)) == null) {
                                                    if (C288890BTz.LIZ()) {
                                                        strLJJ2 = "ai_rewrite";
                                                    } else {
                                                        strLJJ2 = "original_comment";
                                                    }
                                                }
                                                C1350920lG6.LJL(aweme5, comment3, str5, str5, "ori_comment", strLJJ2);
                                            }
                                            String aid = aweme5.getAid();
                                            if (z3 && aid != null && aid.length() != 0) {
                                                C1342740l2u.LJIIIIZZ.add(aid);
                                            }
                                            AwS170S1100000_21 awS170S1100000_21 = new AwS170S1100000_21(comment3, cid3, 7);
                                            AwS136S1200000_21 awS136S1200000_21 = new AwS136S1200000_21(c1340200kyo4, cid3, function0, 5);
                                            boolean z4 = !C1342740l2u.LIZJ(cid3);
                                            if (z3 && cid3.length() != 0) {
                                                C1342740l2u.LJI.add(cid3);
                                            }
                                            boolean z5 = false;
                                            ITextToImageService iTextToImageService3 = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
                                            if (iTextToImageService3 == null || (pairLIZLLL = iTextToImageService3.LIZLLL(cid3)) == null || (first = pairLIZLLL.getFirst()) == null) {
                                                first = "";
                                            }
                                            if ((!a0.LJJJIL(first)) && C288890BTz.LIZ()) {
                                                z5 = true;
                                                if (pairLIZLLL == null || (string = pairLIZLLL.getSecond()) == null || string.length() == 0) {
                                                    string = c1340200kyo4.getContext().getString(2131821387);
                                                }
                                            }
                                            ITextToImageService iTextToImageService4 = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
                                            if (iTextToImageService4 != null && (strLJJ = iTextToImageService4.LJJ(cid3)) != null) {
                                                str6 = strLJJ;
                                            } else if (!z5) {
                                                str6 = "original_comment";
                                            }
                                            c1340200kyo4.LJII(str2, string, new C1342700l2q(aweme5, comment3, str5, str6, c1340200kyo4, c572370Mcd, first, z5, context2, forwardMediaLIZ, awS170S1100000_21, awS136S1200000_21), new C1342690l2p(aweme5, comment3, str5, str6, c572370Mcd, c1340200kyo4, forwardMediaLIZ, awS170S1100000_21, context2, cid3, awS136S1200000_21), new C1342680l2o(aweme5, comment3, str5, str6, c1340200kyo4, cid3), z4);
                                        }
                                    }
                                }
                            };
                            c1340200kyo3.LLJJJJLIIL = r2;
                            c1340200kyo3.LLJJL = cid;
                            iTextToImageService.LJJIIZ(cid, r2);
                        }
                    }
                }
                ITextToImageService iTextToImageService2 = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
                if (iTextToImageService2 != null && iTextToImageService2.LJJIL()) {
                    return;
                }
                if (this.LLLLZ && (commentQ6 = q6()) != null && commentQ6.hasFirstCommentTag) {
                    iLIZ = C0HD5.LIZ(this.itemView, 20);
                } else {
                    iLIZ = 0;
                }
                this.LLLLZ = false;
                LifecycleOwnerExtensionsKt.LIZIZ(this, 250L, new ARunnableS27S0201000_21(iLIZ, this, c1340200kyo, 2));
            } else {
                String strShowCommentPostCid = CommentContextSourceKt.showCommentPostCid(i6());
                Comment commentQ65 = q6();
                CommentContextSource commentContextSourceI65 = i6();
                if (commentContextSourceI65 != null) {
                    aweme2 = CommentContextSourceKt.aweme(commentContextSourceI65);
                }
                if (C1341570l11.LIZ(commentQ65, aweme2, strShowCommentPostCid)) {
                    C786410Ut5.x(c1340200kyo, 0);
                    Comment commentQ66 = q6();
                    if (commentQ66 != null) {
                        Aweme aweme5 = getAweme();
                        c1340200kyo.LLJJIJI = commentQ66;
                        c1340200kyo.LLJJIJIIJIL = aweme5;
                        c1340200kyo.LJI();
                    }
                } else {
                    C786410Ut5.x(c1340200kyo, 8);
                }
            }
        }
        x8();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: t8, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(C1340430kzB c1340430kzB, List<? extends Object> list) throws Throwable {
        C1340200kyo c1340200kyo;
        Comment commentQ6;
        super.onBindItemView(c1340430kzB, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C1339470kxd)) {
            return;
        }
        C1339470kxd c1339470kxd = (C1339470kxd) objLJJJLZIJ;
        if (c1339470kxd.LJIIJJI) {
            z8(true);
        } else if (c1339470kxd.LJIIL && (c1340200kyo = this.LLLLLZL) != null && (commentQ6 = q6()) != null) {
            Aweme aweme = getAweme();
            c1340200kyo.LLJJIJI = commentQ6;
            c1340200kyo.LLJJIJIIJIL = aweme;
            c1340200kyo.LJI();
        }
        for (Object obj : list) {
            if (!(obj instanceof C1339470kxd)) {
                return;
            }
            if (((C1339470kxd) obj).LJIILIIL) {
                if (C0BJP.LIZ()) {
                    x7(1);
                } else {
                    u8();
                }
            }
        }
    }
}
