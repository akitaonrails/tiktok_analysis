package com.ss.android.ugc.aweme.comment.viewmodel;

import X.AnonymousClass0593;
import X.C05KA;
import X.C09JN;
import X.C0O8X;
import X.C1156290gCB;
import X.C11NJ;
import X.C11S5;
import X.C1209980ham;
import X.C1339950kyP;
import X.C1344030l4z;
import X.C1344480l5i;
import X.C1345420l7E;
import X.C1345490l7L;
import X.C1345700l7g;
import X.C1345760l7m;
import X.C1347300lAG;
import X.C1350920lG6;
import X.C1440005kM;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1701940uOG;
import X.C1ER1;
import X.C20600815jK;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C295120BhW;
import X.C586110Myn;
import X.C737370SwB;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import Y.ACallableS426S0100000_21;
import Y.AfS86S0101000_21;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentIntentStruct;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentLikeViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.util.CommentIntentionCellUtil;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentLikeViewModel extends ViewModel {
    public boolean LLILLL;
    public Comment LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public FypExposedCommentMobParams LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public C1345490l7L LLJIJIL;
    public InterfaceC665370Q7z LLJILLL;
    public WeakReference<Fragment> LLJJ;
    public CommentContextSource LLJJI;
    public final C11NJ LL = new C11NJ();
    public final SingleLiveEvent<C1156290gCB> LLILLJJLI = new SingleLiveEvent<>();
    public Function0<Boolean> LLJILJIL = AFwS209S0000000_21.get$arr$(163);
    public final C0O8X LLJILJILJ = new C0O8X();

    public final CommentContextSource wQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLJJI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLJILLL;
            CommentContextSource commentContextSource = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", CommentContextSource.class, null)) != null) {
                commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLJJI = commentContextSource;
        }
        return this.LLJJI;
    }

    public final void AQ2(int i, String str, boolean z) {
        boolean z2;
        Comment comment;
        C1345490l7L c1345490l7L = this.LLJIJIL;
        boolean zBooleanValue = false;
        if (c1345490l7L != null && c1345490l7L.LJIIJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || (wQ2() != null && Intrinsics.LJFF(CommentContextSourceKt.fromPage(wQ2()), "graphic_detail"))) {
            String str2 = this.LLIZ;
            FypExposedCommentMobParams fypExposedCommentMobParams = this.LLIZLLLIL;
            String str3 = this.LLJI;
            String str4 = this.LLJ;
            if ((i != 1 && i != 2) || (comment = this.LLILZ) == null) {
                return;
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceWQ2 = wQ2();
            String strValueOf = String.valueOf(i);
            boolean zBooleanValue2 = this.LLJILJIL.invoke().booleanValue();
            c1350920lG6.getClass();
            C1350920lG6.LJLLJ(commentContextSourceWQ2, comment, strValueOf, z, str2, fypExposedCommentMobParams, str, str3, str4, zBooleanValue2);
            return;
        }
        C1345490l7L c1345490l7L2 = this.LLJIJIL;
        if (c1345490l7L2 != null) {
            if (i != 1 && i != 2) {
                return;
            }
            String str5 = c1345490l7L2.LIZ;
            String str6 = c1345490l7L2.LIZIZ;
            Aweme aweme = c1345490l7L2.LIZJ;
            Boolean bool = c1345490l7L2.LIZLLL;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            C1347300lAG.LIZJ(str5, str6, aweme, z, zBooleanValue, String.valueOf(i), c1345490l7L2.LJ, c1345490l7L2.LJFF, c1345490l7L2.LJII, c1345490l7L2.LJI, c1345490l7L2.LJIIIIZZ, c1345490l7L2.LJIIIZ, this.LLIZ, this.LLILZ, this.LLIZLLLIL, this.LLJI, str, this.LLJ, this.LLJILJIL.invoke().booleanValue());
        }
    }

    public final void vQ2(int i, String str, boolean z) {
        Comment comment = this.LLILZ;
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                xQ2(i, comment, z);
            }
        } else {
            yQ2(i, comment, str, z);
        }
        String str2 = this.LLILZIL;
        String str3 = this.LLILZLL;
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            C23250099c.LIZLLL((InterfaceC497601wk) C05KA.LIZIZ.getValue(), null, null, new AnonymousClass0593(i, str2, str3, null), 3);
        }
    }

    public final void xQ2(int i, Comment comment, boolean z) {
        String str;
        Fragment fragment;
        if (comment == null) {
            return;
        }
        if (i == 3) {
            comment.setUserBuried(1);
            if (comment.isUserDigged()) {
                comment.setUserDigged(0);
                comment.setDiggCount(comment.getDiggCount() - 1);
                comment.isAuthorDigged = z;
            }
            str = "hate success";
        } else {
            comment.setUserBuried(0);
            str = "unhate success";
        }
        this.LLILLJJLI.setValue(new C1156290gCB(str, 2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hate success: comment id ");
        sbLIZ.append(comment.getCid());
        C1344030l4z.LIZJ("LikeAndHateView", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLJILLL;
        if (interfaceC665370Q7z != null) {
            WeakReference<Fragment> weakReference = this.LLJJ;
            if (weakReference != null) {
                fragment = weakReference.get();
            } else {
                fragment = null;
            }
            ICommentListVMAbility iCommentListVMAbilityLJ = C1345760l7m.LJ(fragment, interfaceC665370Q7z);
            if (iCommentListVMAbilityLJ != null) {
                iCommentListVMAbilityLJ.Vi1(comment, comment.getCid());
            }
        }
        AQ2(i, null, true);
        C1440005kM.LIZ(new C586110Myn(comment.getCid(), comment.getUserDigged(), "comment_panel"));
        C1440005kM.LIZ(new C1339950kyP(comment.getUserDigged(), comment.getDiggCount(), comment.getUserBuried(), comment.getCid(), comment.isAuthorDigged));
        C1344480l5i.LIZ(this.LLILZIL, null, false);
    }

    public final void zQ2(final int i, final String str, final boolean z) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        Fragment fragment;
        C20600815jK<InterfaceC1891350zJl> c20600815jKAd0;
        String cid;
        CommentIntentStruct intentStruct;
        String strEnterFrom;
        boolean zLJI = MethodIDManager.LJI(202476);
        String str2 = this.LLILZIL;
        int iLJIILL = 0;
        if (str2 != null && str2.length() != 0) {
            final Comment comment = this.LLILZ;
            this.LLILLL = true;
            String str3 = this.LLILZIL;
            String str4 = this.LLILZLL;
            this.LLJILJILJ.LJ();
            C0O8X c0o8x = this.LLJILJILJ;
            c0o8x.LIZLLL = "ttk_comment_digg_api_monitor";
            c0o8x.LIZIZ(Integer.valueOf(i), "digg_type");
            CommentContextSource commentContextSourceWQ2 = wQ2();
            Fragment fragment2 = null;
            if (commentContextSourceWQ2 != null && (strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceWQ2)) != null) {
                this.LLJILJILJ.LIZIZ(strEnterFrom, "enter_from");
            }
            if (str3 != null) {
                this.LLJILJILJ.LIZJ(str3, "gid");
            }
            if (str4 != null) {
                this.LLJILJILJ.LIZJ(str4, "cid");
            }
            CommentPerfMonitorUtil commentPerfMonitorUtil = CommentPerfMonitorUtil.LIZ;
            String strValueOf = String.valueOf(i);
            commentPerfMonitorUtil.getClass();
            C1345420l7E c1345420l7E = CommentPerfMonitorUtil.LJFF;
            c1345420l7E.LJI = strValueOf;
            c1345420l7E.LJFF = CommentPerfMonitorUtil.LJI();
            c1345420l7E.LIZLLL = System.currentTimeMillis();
            if (i == 1 && C295120BhW.LIZ() && (interfaceC665370Q7z = this.LLJILLL) != null) {
                WeakReference<Fragment> weakReference = this.LLJJ;
                if (weakReference != null) {
                    fragment = weakReference.get();
                } else {
                    fragment = null;
                }
                ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(fragment, interfaceC665370Q7z);
                if (iCommentListAssemAbilityLIZLLL != null && (c20600815jKAd0 = iCommentListAssemAbilityLIZLLL.ad0()) != null) {
                    CommentIntentionCellUtil commentIntentionCellUtil = CommentIntentionCellUtil.LL;
                    InterfaceC665370Q7z interfaceC665370Q7z2 = this.LLJILLL;
                    CommentContextSource commentContextSourceWQ22 = wQ2();
                    if (comment != null) {
                        cid = comment.getCid();
                        intentStruct = comment.getIntentStruct();
                        iLJIILL = C1345700l7g.LJIILL(comment, c20600815jKAd0);
                    } else {
                        cid = null;
                        intentStruct = null;
                    }
                    int i2 = iLJIILL + 1;
                    WeakReference<Fragment> weakReference2 = this.LLJJ;
                    if (weakReference2 != null) {
                        fragment2 = weakReference2.get();
                    }
                    commentIntentionCellUtil.getClass();
                    CommentIntentionCellUtil.LJIIIIZZ(interfaceC665370Q7z2, commentContextSourceWQ22, cid, intentStruct, i2, "like_comment", "", fragment2);
                }
            }
            this.LL.LIZ(((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).LJ(this.LLILZLL, this.LLILZIL, String.valueOf(i), C737370SwB.LIZ(CommentContextSourceKt.eventType(wQ2()))).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0l7K
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CommentLikeViewModel@72bd.requestLikeComment$2");
                    CommentLikeViewModel commentLikeViewModel = this.LL;
                    commentLikeViewModel.LLJILJILJ.LIZ();
                    commentLikeViewModel.LLJILJILJ.LIZLLL((BaseResponse) obj);
                    commentLikeViewModel.LLJILJILJ.LJFF();
                    CommentPerfMonitorUtil.LIZ.getClass();
                    C1345420l7E c1345420l7E2 = CommentPerfMonitorUtil.LJFF;
                    c1345420l7E2.LJ = System.currentTimeMillis();
                    int i3 = i;
                    if (i3 != 1 && i3 != 2) {
                        if (i3 == 3 || i3 == 4) {
                            this.LL.xQ2(i3, comment, z);
                        }
                    } else {
                        this.LL.yQ2(i3, comment, str, z);
                    }
                    this.LL.LLILLL = false;
                    c1345420l7E2.LIZJ = System.currentTimeMillis();
                    C15O7.LIZJ(new ACallableS426S0100000_21(c1345420l7E2, 10));
                    C1C7U.LIZIZ("CommentLikeViewModel@72bd.requestLikeComment$2");
                }
            }, new AfS86S0101000_21(i, this, 1)));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1344030l4z.LIZLLL("jxl1107", "requestLikeComment awemeId is empty");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void yQ2(int i, Comment comment, String str, boolean z) {
        String str2;
        ICommentPageContainer iCommentPageContainer;
        if (comment == null) {
            return;
        }
        Fragment fragment = null;
        if (i == 1) {
            comment.setUserDigged(1);
            comment.setDiggCount(comment.getDiggCount() + 1);
            comment.isAuthorDigged = z;
            comment.setUserBuried(0);
            int i2 = C2187451AjH.LIZ;
            C1440005kM.LIZ(new C1209980ham(21, null));
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLJILLL;
            if (interfaceC665370Q7z != null && (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(interfaceC665370Q7z, ICommentPageContainer.class, null)) != null) {
                iCommentPageContainer.pX();
            }
            str2 = "like success";
        } else {
            comment.setUserDigged(0);
            comment.setDiggCount(comment.getDiggCount() - 1);
            comment.isAuthorDigged = z;
            str2 = "unlike success";
        }
        InterfaceC665370Q7z interfaceC665370Q7z2 = this.LLJILLL;
        if (interfaceC665370Q7z2 != null) {
            WeakReference<Fragment> weakReference = this.LLJJ;
            if (weakReference != null) {
                fragment = weakReference.get();
            }
            ICommentListVMAbility iCommentListVMAbilityLJ = C1345760l7m.LJ(fragment, interfaceC665370Q7z2);
            if (iCommentListVMAbilityLJ != null) {
                iCommentListVMAbilityLJ.Vi1(comment, comment.getCid());
            }
        }
        this.LLILLJJLI.setValue(new C1156290gCB(str2, 2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("digg success: comment id ");
        sbLIZ.append(comment.getCid());
        C1344030l4z.LIZJ("LikeAndHateView", C2188811AlT.LIZIZ(sbLIZ));
        AQ2(i, str, true);
        C1ER1.LIZIZ.LLJ(Integer.valueOf(comment.getUserDigged()), comment.getCid());
        C1440005kM.LIZ(new C586110Myn(comment.getCid(), comment.getUserDigged(), "comment_panel"));
        C1440005kM.LIZ(new C1339950kyP(comment.getUserDigged(), comment.getDiggCount(), comment.getUserBuried(), comment.getCid(), comment.isAuthorDigged));
        C1344480l5i.LIZ(this.LLILZIL, null, false);
    }
}
