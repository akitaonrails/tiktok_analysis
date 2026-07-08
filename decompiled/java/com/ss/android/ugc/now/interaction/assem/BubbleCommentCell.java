package com.ss.android.ugc.now.interaction.assem;

import X.C03IT;
import X.C07ME;
import X.C1342220l24;
import X.C1349280lDS;
import X.C1350960lGA;
import X.C1352480lIc;
import X.C1352940lJM;
import X.C1354870lMT;
import X.C1360520lVa;
import X.C19EG;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C444960Hcc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1352970lJP;
import X.InterfaceC1891350zJl;
import Y.ACListenerS124S0200000_21;
import android.animation.ObjectAnimator;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class BubbleCommentCell extends PowerCell<CommentItem> {
    public C427660Gpo LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String aid;
        NowPostInfo nowPostInfo;
        String enterFrom;
        super.onViewAttachedToWindow();
        INowsTabService iNowsTabService = (INowsTabService) ServiceManager.get().getService(INowsTabService.class);
        this.itemView.getContext();
        CommentItem item = getItem();
        String str = null;
        int iLIZLLL = iNowsTabService.LIZLLL(item != null ? item.getAweme() : null);
        CommentItem item2 = getItem();
        if (item2 != null) {
            Comment comment = item2.getComment();
            Aweme aweme = item2.getAweme();
            String str2 = "";
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            NowFeedMobHierarchyData interactionHierarchyData = item2.getInteractionHierarchyData();
            if (interactionHierarchyData != null && (enterFrom = interactionHierarchyData.getEnterFrom()) != null) {
                str2 = enterFrom;
            }
            Aweme aweme2 = item2.getAweme();
            if (aweme2 != null && (nowPostInfo = aweme2.nowPostInfo) != null) {
                str = nowPostInfo.nowMediaType;
            }
            Aweme aweme3 = item2.getAweme();
            int iLIZ = aweme3 != null ? C1352480lIc.LIZ(aweme3) : 1;
            if (comment.getCid() != null) {
                Map<String, Set<String>> map = C07ME.LIZ;
                Set set = (Set) ((LinkedHashMap) map).get(aid);
                if (set == null || !set.contains(comment.getCid())) {
                    if (!map.containsKey(aid)) {
                        map.put(aid, new LinkedHashSet());
                    }
                    Set set2 = (Set) ((LinkedHashMap) map).get(aid);
                    C1350960lGA.LJFF(iLIZLLL, iLIZ, str2, "comment", comment.getUser().getUid(), str);
                    if (set2 != null) {
                        set2.add(comment.getCid());
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C786410Ut5.T4(this.itemView, 1.0f);
        C786410Ut5.LJLLLLLL(0, this.itemView);
    }

    public final void I5(boolean z) {
        int maxWidth;
        float fMeasureText;
        TextPaint paint;
        TextPaint paint2;
        CharSequence text;
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            maxWidth = tuxTextView.getMaxWidth();
        } else {
            maxWidth = 0;
        }
        if (z) {
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            CharSequence text2 = null;
            float fMeasureText2 = 0.0f;
            if (tuxTextView2 != null && (paint2 = tuxTextView2.getPaint()) != null) {
                TuxTextView tuxTextView3 = this.LLILLJJLI;
                if (tuxTextView3 != null) {
                    text = tuxTextView3.getText();
                } else {
                    text = null;
                }
                fMeasureText = paint2.measureText(String.valueOf(text));
            } else {
                fMeasureText = 0.0f;
            }
            TuxTextView tuxTextView4 = this.LLILZIL;
            if (tuxTextView4 != null && (paint = tuxTextView4.getPaint()) != null) {
                TuxTextView tuxTextView5 = this.LLILZIL;
                if (tuxTextView5 != null) {
                    text2 = tuxTextView5.getText();
                }
                fMeasureText2 = paint.measureText(String.valueOf(text2));
            }
            float f = maxWidth;
            if (fMeasureText + fMeasureText2 > f) {
                if (fMeasureText2 <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60))) {
                    TuxTextView tuxTextView6 = this.LLILLJJLI;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setMaxWidth((int) ((f - fMeasureText2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
                        return;
                    }
                    return;
                }
                TuxTextView tuxTextView7 = this.LLILLJJLI;
                if (tuxTextView7 != null) {
                    tuxTextView7.setMaxWidth((maxWidth - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                }
                TuxTextView tuxTextView8 = this.LLILZIL;
                if (tuxTextView8 == null) {
                    return;
                }
                tuxTextView8.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
                return;
            }
            return;
        }
        TuxTextView tuxTextView9 = this.LLILLJJLI;
        if (tuxTextView9 == null) {
            return;
        }
        tuxTextView9.setMaxWidth(maxWidth);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iLIZIZ;
        TuxTextView tuxTextView;
        String enterFrom;
        C427660Gpo c427660Gpo;
        CommentItem commentItem = (CommentItem) interfaceC1891350zJl;
        super.onBindItemView(commentItem);
        Comment comment = commentItem.getComment();
        NowFeedMobHierarchyData interactionHierarchyData = commentItem.getInteractionHierarchyData();
        User user = comment.getUser();
        String enterFrom2 = null;
        if (user != null) {
            C03IT c03itLIZ = C1354870lMT.LIZ(user);
            if (c03itLIZ != null && (c427660Gpo = this.LL) != null) {
                C427660Gpo.LJIIJJI(c427660Gpo, c03itLIZ, false, null, null, false, false, null, null, false, null, 1006);
            }
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            if (tuxTextView2 != null) {
                if (interactionHierarchyData != null) {
                    enterFrom = interactionHierarchyData.getEnterFrom();
                } else {
                    enterFrom = null;
                }
                tuxTextView2.setText(C1342220l24.LJ(user, enterFrom, true, true));
            }
        }
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 != null) {
            C786410Ut5.h9(tuxTextView3, new ACListenerS124S0200000_21(commentItem, this, 65));
        }
        TuxTextView tuxTextView4 = this.LLILLJJLI;
        if (tuxTextView4 != null) {
            C786410Ut5.h9(tuxTextView4, new ACListenerS124S0200000_21(commentItem, this, 66));
        }
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS124S0200000_21(commentItem, this, 67));
        }
        TuxTextView tuxTextView5 = this.LLILZIL;
        if (tuxTextView5 != null) {
            C786410Ut5.h9(tuxTextView5, new ACListenerS124S0200000_21(commentItem, this, 68));
        }
        C427660Gpo c427660Gpo2 = this.LL;
        if (c427660Gpo2 != null) {
            C786410Ut5.T8(c427660Gpo2, new ACListenerS124S0200000_21(commentItem, this, 69));
        }
        C786410Ut5.I7(new ACListenerS124S0200000_21(commentItem, this, 70), this.itemView);
        String text = comment.getText();
        if (text != null && (tuxTextView = this.LLILLL) != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZ.append((CharSequence) text);
            tuxTextView.setText(c1360520lVa.LIZ);
        }
        String replyToNickName = comment.getReplyToNickName();
        String replyToUserName = comment.getReplyToUserName();
        if (interactionHierarchyData != null) {
            enterFrom2 = interactionHierarchyData.getEnterFrom();
        }
        String strLJIIJ = C1349280lDS.LJIIJ(replyToNickName, replyToUserName, enterFrom2);
        TuxTextView tuxTextView6 = this.LLILLL;
        if (tuxTextView6 != null) {
            if (C444960Hcc.LIZJ(this.itemView.getContext())) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(212));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220));
            }
            tuxTextView6.setMaxWidth(iLIZIZ);
        }
        if (TextUtils.isEmpty(strLJIIJ)) {
            TuxIconView tuxIconView2 = this.LLILZ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
            TuxTextView tuxTextView7 = this.LLILZIL;
            if (tuxTextView7 != null) {
                C786410Ut5.LLLLZLL(tuxTextView7, 8);
            }
            I5(false);
            return;
        }
        TuxIconView tuxIconView3 = this.LLILZ;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
        }
        TuxTextView tuxTextView8 = this.LLILZIL;
        if (tuxTextView8 != null) {
            C786410Ut5.LLLLZLL(tuxTextView8, 0);
        }
        TuxTextView tuxTextView9 = this.LLILZIL;
        if (tuxTextView9 != null) {
            tuxTextView9.setText(strLJIIJ);
        }
        I5(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZ = C1352940lJM.LIZIZ.LIZ(R.layout.ctj, viewGroup.getContext(), null, viewGroup);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        viewLIZ.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        this.LL = (C427660Gpo) viewLIZ.findViewById(R.id.bh8);
        this.LLILLJJLI = (TuxTextView) viewLIZ.findViewById(R.id.p0a);
        this.LLILLL = (TuxTextView) viewLIZ.findViewById(R.id.fmb);
        this.LLILZ = (TuxIconView) viewLIZ.findViewById(R.id.t6y);
        this.LLILZIL = (TuxTextView) viewLIZ.findViewById(R.id.t6z);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewLIZ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(100L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        return viewLIZ;
    }

    public final void L5(CommentItem commentItem, boolean z) {
        String enterFrom;
        String uid;
        String str;
        int iLIZ;
        NowPostInfo nowPostInfo;
        NowFeedMobHierarchyData interactionHierarchyData = commentItem.getInteractionHierarchyData();
        Comment comment = commentItem.getComment();
        int iLJ = ((INowsTabService) ServiceManager.get().getService(INowsTabService.class)).LJ((C19EG) this.itemView.getContext(), commentItem.getAweme(), interactionHierarchyData, EnumC1352970lJP.COMMENT, comment);
        String str2 = null;
        if (interactionHierarchyData != null) {
            enterFrom = interactionHierarchyData.getEnterFrom();
        } else {
            enterFrom = null;
        }
        User user = comment.getUser();
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        Aweme aweme = commentItem.getAweme();
        if (aweme != null && (nowPostInfo = aweme.nowPostInfo) != null) {
            str2 = nowPostInfo.nowMediaType;
        }
        if (z) {
            str = "click_head";
        } else {
            str = "click_text";
        }
        Aweme aweme2 = commentItem.getAweme();
        if (aweme2 != null) {
            iLIZ = C1352480lIc.LIZ(aweme2);
        } else {
            iLIZ = 1;
        }
        C1350960lGA.LIZ(enterFrom, iLJ, iLIZ, uid, str2, str, "comment");
    }
}
