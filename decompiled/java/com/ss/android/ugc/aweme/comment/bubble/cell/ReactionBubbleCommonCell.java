package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C0SQ1;
import X.C0SQ6;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C20684815ws;
import X.C2188811AlT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C703302op;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public class ReactionBubbleCommonCell extends ReactionBaseCell<C0SQ6> {
    public SmartImageView LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public C0SQ6 LLILZLL;

    public final String I5() {
        C0SQ6 c0sq6 = this.LLILZLL;
        if (c0sq6 == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0sq6.LL);
        sbLIZ.append('_');
        sbLIZ.append(c0sq6.LLILLJJLI.getUid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C0SQ1 c0sq1;
        Set<String> set;
        super.onViewAttachedToWindow();
        C0SQ6 c0sq6 = this.LLILZLL;
        if (c0sq6 == null || (c0sq1 = c0sq6.LLILZLL) == null || (set = c0sq1.LJI) == null || set.contains(I5())) {
            return;
        }
        set.add(I5());
        C0SQ6 c0sq62 = this.LLILZLL;
        if (c0sq62 != null) {
            Pair[] pairArr = new Pair[4];
            C0SQ1 c0sq12 = c0sq62.LLILZLL;
            pairArr[0] = new Pair(c0sq12 != null ? c0sq12.LIZIZ : null, "enter_from");
            C0SQ1 c0sq13 = c0sq62.LLILZLL;
            pairArr[1] = new Pair(c0sq13 != null ? c0sq13.LJ : null, "story_type");
            pairArr[2] = new Pair(c0sq62.LLILZIL, "notice_type");
            pairArr[3] = new Pair(c0sq62.LLILLJJLI.getUid(), "from_user_id");
            C20684815ws.LJIJI("interaction_bullet_show", pairArr);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0SQ6 c0sq6 = (C0SQ6) interfaceC1891350zJl;
        super.onBindItemView(c0sq6);
        SmartImageView smartImageView = this.LLILLL;
        SmartImageView smartImageView2 = null;
        if (smartImageView == null) {
            smartImageView = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        smartImageView.setBackground(c384050F3z.LIZ(smartImageView.getContext()));
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c0sq6.LLILLJJLI.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LIZLLL("ReactionBubbleCommentCell");
        SmartImageView smartImageView3 = this.LLILLL;
        if (smartImageView3 == null) {
            smartImageView3 = null;
        }
        c1331670kl3LJIIIIZZ.LJJ(smartImageView3);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        this.LLILZLL = c0sq6;
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        List<Integer> list = c0sq6.LLILLL;
        if (list.size() == 1) {
            Integer num = (Integer) ListProtector.get(list, 0);
            int iIntValue = num.intValue();
            if (iIntValue == 1001 || iIntValue == 1002 || iIntValue == 1003) {
                TuxIconView tuxIconView2 = this.LLILZ;
                if (tuxIconView2 == null) {
                    tuxIconView2 = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                TuxTextView tuxTextView2 = this.LLILZIL;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                TuxIconView tuxIconView3 = this.LLILZ;
                if (tuxIconView3 == null) {
                    tuxIconView3 = null;
                }
                int iIntValue2 = num.intValue();
                if (tuxIconView3 != null) {
                    switch (iIntValue2) {
                        case 1001:
                            tuxIconView3.setIconRes(R.raw.icon_color_like_circle);
                            break;
                        case 1002:
                            tuxIconView3.setIconRes(R.raw.icon_color_view_circle);
                            break;
                        case 1003:
                            tuxIconView3.setIconRes(R.raw.icon_color_paperplane_circle);
                            break;
                    }
                }
            }
        } else if (C703302op.LIZ(c0sq6.LLILZ)) {
            String str = c0sq6.LLILZ;
            TuxIconView tuxIconView4 = this.LLILZ;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
            TuxTextView tuxTextView3 = this.LLILZIL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
            TuxTextView tuxTextView4 = this.LLILZIL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setText(str);
        }
        SmartImageView smartImageView4 = this.LLILLL;
        if (smartImageView4 != null) {
            smartImageView2 = smartImageView4;
        }
        C786410Ut5.Q8(smartImageView2, new ACListenerS115S0200000_11(this, c0sq6, 26));
        C786410Ut5.LJLLLLLL(4, this.itemView);
        this.itemView.setTag(0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        boolean zLJI = MethodIDManager.LJI(196708);
        View viewLJLLJ = C786410Ut5.LJLLJ(viewGroup.getContext(), R.layout.a13, null);
        this.LLILLL = (SmartImageView) viewLJLLJ.findViewById(R.id.bh8);
        this.LLILZ = (TuxIconView) viewLJLLJ.findViewById(R.id.jy0);
        this.LLILZIL = (TuxTextView) viewLJLLJ.findViewById(R.id.gzf);
        C786410Ut5.LJLLLLLL(4, viewLJLLJ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return viewLJLLJ;
    }
}
