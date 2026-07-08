package com.ss.android.ugc.aweme.comment.photocomment;

import X.C09R3;
import X.C1339550kxl;
import X.C1340010kyV;
import X.C1344050l51;
import X.C1344060l52;
import X.C1344550l5p;
import X.C1347720lAw;
import X.C1350920lG6;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1875607Wg;
import X.C2208281Bbm;
import X.C2217381BqS;
import X.C294410BgN;
import X.EnumC1342450l2R;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoCommentInnerCell extends AssemPowerCell<PhotoCommentInnerCellAssem, C1875607Wg> implements InterfaceC20631915oL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1344060l52 LLIZ = new C1344060l52();
    public final C1344050l51 LLIZLLLIL = new C1344050l51();
    public long LLJ = System.currentTimeMillis();
    public boolean LLJI;
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoCommentInnerCell.class, "outContextSource", "getOutContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoCommentInnerCell.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/photocomment/PhotoDetailContextSource;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PhotoCommentInnerCellAssem();
    }

    public final CommentContextSource R5() {
        C1344060l52 c1344060l52 = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        if (c1344060l52.LIZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", CommentContextSource.class, null);
            c1344060l52.LIZ = interfaceC1555100qZQLIZIZ != null ? (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return c1344060l52.LIZ;
    }

    public final C1344550l5p S5() {
        C1344050l51 c1344050l51 = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        if (c1344050l51.LIZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", C1344550l5p.class, null);
            c1344050l51.LIZ = interfaceC1555100qZQLIZIZ != null ? (C1344550l5p) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return c1344050l51.LIZ;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        if (!this.LLJI && this.LLJIJIL) {
            T5();
            this.LLJI = true;
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T5() {
        C1339550kxl mobInfo;
        Integer enterSecondaryPos;
        C1339550kxl mobInfo2;
        Integer enterParentPos;
        C1875607Wg c1875607Wg = (C1875607Wg) getItem();
        Comment comment = c1875607Wg != null ? c1875607Wg.LL : null;
        if (this.LLJI || comment == null) {
            return;
        }
        CommentContextSource commentContextSourceR5 = R5();
        C1344550l5p c1344550l5pS5 = S5();
        int iIntValue = 0;
        int iIntValue2 = (c1344550l5pS5 == null || (mobInfo2 = c1344550l5pS5.getMobInfo()) == null || (enterParentPos = mobInfo2.getEnterParentPos()) == null) ? 0 : enterParentPos.intValue();
        C1344550l5p c1344550l5pS52 = S5();
        if (c1344550l5pS52 != null && (mobInfo = c1344550l5pS52.getMobInfo()) != null && (enterSecondaryPos = mobInfo.getEnterSecondaryPos()) != null) {
            iIntValue = enterSecondaryPos.intValue();
        }
        C1350920lG6.LJJLIL("comment_duration", commentContextSourceR5, comment, iIntValue2, iIntValue, System.currentTimeMillis() - this.LLJ, 0, 0, false);
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
        T5();
        this.LLJI = true;
        this.LLJIJIL = false;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        Comment comment;
        int iIntValue;
        int iIntValue2;
        String tagType;
        EnumC1342450l2R currSortType;
        Comment enterComment;
        Comment comment2;
        String cid;
        List<Comment> replyComments;
        Comment comment3;
        int iIntValue3;
        String tagType2;
        EnumC1342450l2R currSortType2;
        C1339550kxl mobInfo;
        C1339550kxl mobInfo2;
        Integer enterSecondaryPos;
        C1339550kxl mobInfo3;
        Integer enterParentPos;
        Comment comment4;
        C1339550kxl mobInfo4;
        C1339550kxl mobInfo5;
        Integer enterSecondaryPos2;
        C1339550kxl mobInfo6;
        Integer enterParentPos2;
        this.LLJ = System.currentTimeMillis();
        int iIntValue4 = 0;
        this.LLJI = false;
        boolean z = true;
        this.LLJIJIL = true;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        Aweme aweme = CommentContextSourceKt.aweme(R5());
        C1875607Wg c1875607Wg = (C1875607Wg) getItem();
        Comment comment5 = null;
        if (c1875607Wg != null) {
            comment = c1875607Wg.LL;
        } else {
            comment = null;
        }
        String strEnterFrom = CommentContextSourceKt.enterFrom(R5());
        C1344550l5p c1344550l5pS5 = S5();
        if (c1344550l5pS5 != null && (mobInfo6 = c1344550l5pS5.getMobInfo()) != null && (enterParentPos2 = mobInfo6.getEnterParentPos()) != null) {
            iIntValue = enterParentPos2.intValue();
        } else {
            iIntValue = 0;
        }
        C1344550l5p c1344550l5pS52 = S5();
        if (c1344550l5pS52 != null && (mobInfo5 = c1344550l5pS52.getMobInfo()) != null && (enterSecondaryPos2 = mobInfo5.getEnterSecondaryPos()) != null) {
            iIntValue2 = enterSecondaryPos2.intValue();
        } else {
            iIntValue2 = 0;
        }
        C1344550l5p c1344550l5pS53 = S5();
        if (c1344550l5pS53 != null && (mobInfo4 = c1344550l5pS53.getMobInfo()) != null) {
            tagType = mobInfo4.getTagType();
        } else {
            tagType = null;
        }
        String sessionId = CommentContextSourceKt.getSessionId(R5());
        CommentContextSource commentContextSourceR5 = R5();
        if (commentContextSourceR5 != null) {
            currSortType = commentContextSourceR5.getCurrSortType();
        } else {
            currSortType = null;
        }
        c1350920lG6.getClass();
        C1350920lG6.LLIIIJ(aweme, comment, strEnterFrom, iIntValue, iIntValue2, tagType, sessionId, true, currSortType, null);
        Aweme aweme2 = CommentContextSourceKt.aweme(R5());
        C1344550l5p c1344550l5pS54 = S5();
        if (c1344550l5pS54 != null) {
            enterComment = c1344550l5pS54.getEnterComment();
        } else {
            enterComment = null;
        }
        C1350920lG6.LLIIIZ(enterComment, aweme2, CommentContextSourceKt.enterFrom(R5()));
        if (C294410BgN.LIZIZ()) {
            C1875607Wg c1875607Wg2 = (C1875607Wg) getItem();
            if (c1875607Wg2 != null && (comment4 = c1875607Wg2.LL) != null) {
                replyComments = comment4.getReplyComments();
            } else {
                replyComments = null;
            }
            Comment commentLIZ = C1340010kyV.LIZ(replyComments);
            C1875607Wg c1875607Wg3 = (C1875607Wg) getItem();
            if (c1875607Wg3 != null && (comment3 = c1875607Wg3.LL) != null && comment3.getCommentType() == 1 && commentLIZ != null) {
                Aweme aweme3 = CommentContextSourceKt.aweme(R5());
                String strEnterFrom2 = CommentContextSourceKt.enterFrom(R5());
                C1344550l5p c1344550l5pS55 = S5();
                if (c1344550l5pS55 != null && (mobInfo3 = c1344550l5pS55.getMobInfo()) != null && (enterParentPos = mobInfo3.getEnterParentPos()) != null) {
                    iIntValue3 = enterParentPos.intValue();
                } else {
                    iIntValue3 = 0;
                }
                C1344550l5p c1344550l5pS56 = S5();
                if (c1344550l5pS56 != null && (mobInfo2 = c1344550l5pS56.getMobInfo()) != null && (enterSecondaryPos = mobInfo2.getEnterSecondaryPos()) != null) {
                    iIntValue4 = enterSecondaryPos.intValue();
                }
                C1344550l5p c1344550l5pS57 = S5();
                if (c1344550l5pS57 != null && (mobInfo = c1344550l5pS57.getMobInfo()) != null) {
                    tagType2 = mobInfo.getTagType();
                } else {
                    tagType2 = null;
                }
                String sessionId2 = CommentContextSourceKt.getSessionId(R5());
                CommentContextSource commentContextSourceR52 = R5();
                if (commentContextSourceR52 != null) {
                    currSortType2 = commentContextSourceR52.getCurrSortType();
                } else {
                    currSortType2 = null;
                }
                c1350920lG6.getClass();
                z = true;
                comment5 = null;
                C1350920lG6.LLIIIJ(aweme3, commentLIZ, strEnterFrom2, iIntValue3, iIntValue4, tagType2, sessionId2, true, currSortType2, null);
            }
        }
        C1875607Wg c1875607Wg4 = (C1875607Wg) getItem();
        if (c1875607Wg4 != null && (comment2 = c1875607Wg4.LL) != null && (cid = comment2.getCid()) != null) {
            C2208281Bbm.LIZ.getClass();
            C2208281Bbm.LJIILL(cid, "inner");
        }
        String strEnterFrom3 = CommentContextSourceKt.enterFrom(R5());
        Aweme aweme4 = CommentContextSourceKt.aweme(R5());
        C1875607Wg c1875607Wg5 = (C1875607Wg) getItem();
        if (c1875607Wg5 != null) {
            comment5 = c1875607Wg5.LL;
        }
        C1350920lG6.LLFZ(strEnterFrom3, aweme4, z, C1347720lAw.LJIIJ(comment5));
    }
}
