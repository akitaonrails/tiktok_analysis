package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C0HD5;
import X.C0SBF;
import X.C0SE9;
import X.C0SQ1;
import X.C0SWT;
import X.C1342220l24;
import X.C1349280lDS;
import X.C1351950lHl;
import X.C1440005kM;
import X.C20684815ws;
import X.C2188811AlT;
import X.C294180Bg0;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C720930SPr;
import X.C786410Ut5;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class ReactionBubbleCommentCell extends ReactionBubbleContentCell<C0SWT> {
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String U5() {
        return "comment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final C0SQ1 L5() {
        C0SWT c0swt = (C0SWT) getItem();
        if (c0swt != null) {
            return c0swt.LLILZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String W5() {
        C0SWT c0swt = (C0SWT) getItem();
        if (c0swt == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0swt.LL);
        sbLIZ.append('_');
        sbLIZ.append(c0swt.LLILLJJLI.getCid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final User getUser() {
        Comment comment;
        C0SWT c0swt = (C0SWT) getItem();
        if (c0swt == null || (comment = c0swt.LLILLJJLI) == null) {
            return null;
        }
        return comment.getUser();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C0SQ1 c0sq1;
        Set<String> set;
        super.onViewAttachedToWindow();
        C0SWT c0swt = (C0SWT) getItem();
        if (c0swt == null || (c0sq1 = c0swt.LLILZ) == null || (set = c0sq1.LJI) == null || set.contains(W5())) {
            return;
        }
        set.add(W5());
        C0SWT c0swt2 = (C0SWT) getItem();
        if (c0swt2 != null) {
            Pair[] pairArr = new Pair[4];
            C0SQ1 c0sq12 = c0swt2.LLILZ;
            pairArr[0] = new Pair(c0sq12 != null ? c0sq12.LJ : null, "story_type");
            C0SQ1 c0sq13 = c0swt2.LLILZ;
            pairArr[1] = new Pair(c0sq13 != null ? c0sq13.LIZIZ : null, "enter_from");
            pairArr[2] = new Pair("comment", "notice_type");
            pairArr[3] = new Pair(c0swt2.LLILLJJLI.getUser().getUid(), "from_user_id");
            C20684815ws.LJIJI("interaction_bullet_show", pairArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final CharSequence I5(C720930SPr c720930SPr) {
        String string;
        int start;
        int i;
        C419890GdH c419890GdHLIZIZ;
        C0SWT c0swt = (C0SWT) c720930SPr;
        if (C294180Bg0.LIZ() && c0swt.LLILLJJLI.isUserBuried()) {
            return this.itemView.getContext().getString(2131830704);
        }
        if (c0swt.LLILLJJLI.getAliasAweme() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(this.itemView.getContext().getString(2131833945));
            sbLIZ.append(']');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        if (c0swt.LLILLJJLI.getImageList() != null) {
            string = this.itemView.getContext().getString(2131826734);
        } else if (c0swt.LLILLJJLI.getStickerStruct() != null) {
            string = this.itemView.getContext().getString(2131826735);
        } else if (C1351950lHl.LJI(c0swt.LLILLJJLI)) {
            string = this.itemView.getContext().getString(2131826733);
        } else {
            string = "";
        }
        sbLIZ2.append(string);
        sbLIZ2.append(c0swt.LLILLJJLI.getText());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        Comment comment = c0swt.LLILLJJLI;
        SpannableString spannableString = new SpannableString(strLIZIZ);
        List<TextExtraStruct> textExtra = comment.getTextExtra();
        if (textExtra != null) {
            boolean z = false;
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct.getType() == 8 || textExtraStruct.getType() == 9) {
                    int length = spannableString.length();
                    if (textExtraStruct.getStart() < 0) {
                        start = 0;
                    } else {
                        start = textExtraStruct.getStart();
                    }
                    if (textExtraStruct.getEnd() <= length) {
                        textExtraStruct.getEnd();
                    }
                    if (start > spannableString.length() || (i = start + 1) > spannableString.length()) {
                        break;
                    }
                    int type = textExtraStruct.getType();
                    Context context = this.itemView.getContext();
                    if (type != 8) {
                        if (type != 9) {
                            c419890GdHLIZIZ = null;
                        } else {
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_bubble_left_right;
                            c419910GdJ.LIZJ = C0HD5.LIZ(this.itemView, 16);
                            c419910GdJ.LIZIZ = C0HD5.LIZ(this.itemView, 16);
                            c419910GdJ.LJ = Integer.valueOf(R.attr.alw);
                            c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
                            c419890GdHLIZIZ.LIZIZ(0, C0HD5.LIZ(this.itemView, 3), C426750GoL.LIZLLL(context));
                        }
                    } else {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_bag;
                        c419910GdJ2.LIZJ = C0HD5.LIZ(this.itemView, 15);
                        c419910GdJ2.LIZIZ = C0HD5.LIZ(this.itemView, 15);
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.alw);
                        c419890GdHLIZIZ = c419910GdJ2.LIZIZ(2, context);
                    }
                    C786410Ut5.p2(spannableString, c419890GdHLIZIZ, start, i, 18);
                    z = true;
                }
            }
            if (z && C426750GoL.LIZLLL(this.itemView.getContext())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((char) 8296);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((char) 8297);
                return spannableStringBuilder;
            }
        }
        return spannableString;
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String N5(C720930SPr c720930SPr) {
        String str;
        C0SWT c0swt = (C0SWT) c720930SPr;
        User user = c0swt.LLILLJJLI.getUser();
        C0SQ1 c0sq1 = c0swt.LLILZ;
        if (c0sq1 != null) {
            str = c0sq1.LIZIZ;
        } else {
            str = null;
        }
        return C0SE9.LIZ(c0swt.LLILLJJLI.getUser(), C1342220l24.LJ(user, str, true, false));
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String P5(C720930SPr c720930SPr) {
        String str;
        C0SWT c0swt = (C0SWT) c720930SPr;
        String replyToNickName = c0swt.LLILLJJLI.getReplyToNickName();
        String replyToUserName = c0swt.LLILLJJLI.getReplyToUserName();
        C0SQ1 c0sq1 = c0swt.LLILZ;
        if (c0sq1 != null) {
            str = c0sq1.LIZIZ;
        } else {
            str = null;
        }
        return C1349280lDS.LJIIJ(replyToNickName, replyToUserName, str);
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final boolean S5(C720930SPr c720930SPr) {
        return ((C0SWT) c720930SPr).LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final void V5(View view) {
        Comment comment;
        C0SWT c0swt = (C0SWT) getItem();
        if (c0swt != null && (comment = c0swt.LLILLJJLI) != null) {
            if (comment.getCid() != null) {
                C1440005kM.LIZ(new C0SBF(comment.getCid(), null, null, false, 30));
            } else {
                C1440005kM.LIZ(new C0SBF(comment.getFakeId(), null, null, false, 30));
            }
        }
    }
}
