package com.ss.android.ugc.aweme.comment.photocomment;

import X.AbstractC329740CwG;
import X.AbstractC712240Rwk;
import X.C09R3;
import X.C09RD;
import X.C09RE;
import X.C0A8X;
import X.C0H9H;
import X.C1173220gdU;
import X.C1340340kz2;
import X.C1343730l4V;
import X.C1344550l5p;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C20607315kN;
import X.C20632315oP;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C726120Se2;
import X.InterfaceC1733780vDc;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS32S0101000_21;
import Y.AfS154S0200000_18;
import Y.AfS156S0200000_21;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPagerAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInnerPagerAssem extends UIContentAssem implements CommentInnerPagerAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLIZLLLIL;
    public final C1340340kz2 LLJ = new C1340340kz2();
    public final C726120Se2 LLJI = new C726120Se2();
    public final C1343730l4V LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentInnerPagerAssem.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/photocomment/PhotoDetailContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommentInnerPagerAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final C1344550l5p Go() {
        C1340340kz2 c1340340kz2 = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return c1340340kz2.LIZ(this);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0l4V] */
    public CommentInnerPagerAssem() {
        final C1173220gdU c1173220gdU = new C1173220gdU();
        c1173220gdU.LIZ = C0A8X.LIZ() > -1 ? C0A8X.LIZ() : 1;
        c1173220gdU.LJI = true;
        c1173220gdU.LIZIZ = C0A8X.LIZ() > -1 ? C0A8X.LIZ() : 3;
        this.LLJIJIL = new AbstractC329740CwG<Integer>(c1173220gdU) { // from class: X.0l4V
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
                List<Comment> list = C1344010l4x.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C1875607Wg((Comment) it2.next()));
                }
                C323380Cm0 c323380Cm0 = new C323380Cm0(null, 0, arrayList);
                C189200o6.m2constructorimpl(c323380Cm0);
                interfaceC1364105Vn.resumeWith(c323380Cm0);
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj) {
                boolean z;
                C11NZ c11nzLIZIZ;
                String rootCommentId;
                Comment enterComment;
                Comment enterComment2;
                ((Number) obj).intValue();
                CommentInnerPagerAssem commentInnerPagerAssem = this.LIZIZ;
                C726120Se2 c726120Se2 = commentInnerPagerAssem.LLJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentInnerPagerAssem.LLJILJIL;
                if (c726120Se2.LIZ(commentInnerPagerAssem) != null) {
                    C1344550l5p c1344550l5pGo = this.LIZIZ.Go();
                    if (c1344550l5pGo != null && (enterComment2 = c1344550l5pGo.getEnterComment()) != null && enterComment2.getCommentType() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !C295360Bhu.LIZ()) {
                        C1344550l5p c1344550l5pGo2 = this.LIZIZ.Go();
                        if (c1344550l5pGo2 != null && (enterComment = c1344550l5pGo2.getEnterComment()) != null) {
                            rootCommentId = enterComment.getRootCommentId();
                        } else {
                            rootCommentId = null;
                        }
                        CommentInnerPagerAssem commentInnerPagerAssem2 = this.LIZIZ;
                        c11nzLIZIZ = C1344010l4x.LIZJ(rootCommentId, commentInnerPagerAssem2.LLJI.LIZ(commentInnerPagerAssem2), null, null);
                    } else {
                        CommentInnerPagerAssem commentInnerPagerAssem3 = this.LIZIZ;
                        c11nzLIZIZ = C1344010l4x.LIZIZ(commentInnerPagerAssem3.LLJI.LIZ(commentInnerPagerAssem3), null, null);
                    }
                    C1344550l5p c1344550l5pGo3 = this.LIZIZ.Go();
                    if (c1344550l5pGo3 != null) {
                        c1344550l5pGo3.setRequesting(Boolean.TRUE);
                    }
                    C11O8 c11o8LJJJLZIJ = c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                    CommentInnerPagerAssem commentInnerPagerAssem4 = this.LIZIZ;
                    c11o8LJJJLZIJ.LJJLL(new AfS156S0200000_21(commentInnerPagerAssem4, interfaceC1364105Vn, 2), new AfS154S0200000_18(commentInnerPagerAssem4, interfaceC1364105Vn, 0));
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, CommentInnerPagerAbility.class, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0lG3] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC1733780vDc viewItemOperator;
        InterfaceC1733780vDc viewItemOperator2;
        InterfaceC1733780vDc viewItemOperator3;
        super.onViewCreated(view);
        C0H9H.LIZJ(0, LJJIJL());
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) LJJIJL().findViewById(R.id.koh);
        this.LLIZLLLIL = viewOnAttachStateChangeListenerC20631115oD;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator3 = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null) {
            viewItemOperator3.LIZJ(PhotoCommentInnerCell.class);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null) {
            viewItemOperator2.LJIIIZ(this.LLJIJIL);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
            viewOnAttachStateChangeListenerC20631115oD3.setOrientation(1);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = this.LLIZLLLIL;
        Object obj = null;
        if (viewOnAttachStateChangeListenerC20631115oD4 != null) {
            Iterator<View> it2 = new C09RD(viewOnAttachStateChangeListenerC20631115oD4).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                Object next = c09re.next();
                if (next instanceof C20632315oP) {
                    obj = next;
                    break;
                }
            }
            View view2 = (View) obj;
            if (view2 != null) {
                view2.setOverScrollMode(2);
            }
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD5 = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20631115oD5 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD5.getViewItemOperator()) != 0) {
            viewItemOperator.LJIIIIZZ(new C20607315kN() { // from class: X.0lG3
                @Override // X.C20607315kN
                public final void LJIIIZ(boolean z) {
                    String cid;
                    Comment enterComment;
                    List<Comment> list = C1344010l4x.LIZ;
                    CommentInnerPagerAssem commentInnerPagerAssem = this.LL;
                    Iterator it3 = ((ArrayList) list).iterator();
                    int i = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            String cid2 = ((Comment) it3.next()).getCid();
                            C1344550l5p c1344550l5pGo = commentInnerPagerAssem.Go();
                            if (c1344550l5pGo != null && (enterComment = c1344550l5pGo.getEnterComment()) != null) {
                                cid = enterComment.getCid();
                            } else {
                                cid = null;
                            }
                            if (Intrinsics.LJFF(cid2, cid)) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    CommentInnerPagerAssem commentInnerPagerAssem2 = this.LL;
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD6 = commentInnerPagerAssem2.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20631115oD6 != null) {
                        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD6, new ARunnableS32S0101000_21(i, commentInnerPagerAssem2, 4));
                    }
                }
            });
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD6 = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20631115oD6 != null) {
            viewOnAttachStateChangeListenerC20631115oD6.registerOnPageChangeCallback(new AbstractC712240Rwk() { // from class: X.0lG4
                @Override // X.AbstractC712240Rwk
                public final void onPageScrollStateChanged(int i) {
                    if (i == 1) {
                        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this.LL), "source_default_key", C1344550l5p.class, null);
                        if (interfaceC1555100qZQLIZIZ != null) {
                            interfaceC1555100qZQLIZIZ.LIZIZ(AFwS259S0000000_21.get$arr$(86));
                            return;
                        }
                        return;
                    }
                    InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this.LL), "source_default_key", C1344550l5p.class, null);
                    if (interfaceC1555100qZQLIZIZ2 == null) {
                        return;
                    }
                    interfaceC1555100qZQLIZIZ2.LIZIZ(AFwS259S0000000_21.get$arr$(87));
                }

                @Override // X.AbstractC712240Rwk
                public final void onPageSelected(int i) {
                    InterfaceC1891350zJl interfaceC1891350zJlLJI;
                    Comment comment;
                    CommentCommonModel commonModel;
                    C1875607Wg c1875607Wg;
                    InterfaceC1733780vDc viewItemOperator4;
                    C20600815jK<InterfaceC1891350zJl> state;
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD7 = this.LL.LLIZLLLIL;
                    String cid = null;
                    if (viewOnAttachStateChangeListenerC20631115oD7 != null && (viewItemOperator4 = viewOnAttachStateChangeListenerC20631115oD7.getViewItemOperator()) != null && (state = viewItemOperator4.getState()) != null) {
                        interfaceC1891350zJlLJI = state.LJI(i);
                    } else {
                        interfaceC1891350zJlLJI = null;
                    }
                    if ((interfaceC1891350zJlLJI instanceof C1875607Wg) && (c1875607Wg = (C1875607Wg) interfaceC1891350zJlLJI) != null) {
                        comment = c1875607Wg.LL;
                    } else {
                        comment = null;
                    }
                    if (C295360Bhu.LIZ()) {
                        CommentInnerPagerAssem commentInnerPagerAssem = this.LL;
                        C726120Se2 c726120Se2 = commentInnerPagerAssem.LLJI;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentInnerPagerAssem.LLJILJIL;
                        CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(commentInnerPagerAssem);
                        if (commentContextSourceLIZ != null && (commonModel = commentContextSourceLIZ.getCommonModel()) != null) {
                            commonModel.setLastViewedPhotoComment(comment);
                        }
                    }
                    InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this.LL), "source_default_key", C1344550l5p.class, null);
                    if (interfaceC1555100qZQLIZIZ != null) {
                        interfaceC1555100qZQLIZIZ.LIZIZ(new AwS600S0100000_21(comment, 72));
                    }
                    if (comment != null) {
                        cid = comment.getCid();
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    if (cid == null) {
                        cid = "";
                    }
                    c2344009Gk.LJIIIIZZ("to_comment_id", cid);
                    c2344009Gk.LIZJ(i, "position");
                    C1350920lG6.LJJJ(c2344009Gk, "photo_comment_internal_feed_scroll");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPagerAbility
    public final boolean zz2(int i) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            return viewOnAttachStateChangeListenerC20631115oD.canScrollVertically(i);
        }
        return false;
    }
}
