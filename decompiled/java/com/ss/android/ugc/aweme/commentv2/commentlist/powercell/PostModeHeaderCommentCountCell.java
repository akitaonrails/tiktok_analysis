package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.AnonymousClass0509;
import X.C0HD5;
import X.C1158500gFk;
import X.C1340330kz1;
import X.C1341170l0N;
import X.C1341550l0z;
import X.C1341820l1Q;
import X.C1342560l2c;
import X.C1342570l2d;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1697810uHb;
import X.C1EE2;
import X.C2217381BqS;
import X.C426750GoL;
import X.C622680Oba;
import X.C7775031x;
import X.C786410Ut5;
import X.C946803n0;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS26S0500000_21;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.api.IPostModePageScrollStateProtocol;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp;
import com.ss.android.ugc.aweme.experiment.ExploreDetailComponentOptExperiment;
import com.ss.android.ugc.aweme.experiment.PhotoDetailCommentEntryExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class PostModeHeaderCommentCountCell extends PowerCell<AnonymousClass0509> implements IPostModePageScrollStateProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final C1340330kz1 LL = new C1340330kz1();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PostModeHeaderCommentCountCell.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPostModePageScrollStateProtocol
    public final void XN2() {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPostModePageScrollStateProtocol
    public final void e20() {
    }

    public final CommentContextSource I5() {
        C1340330kz1 c1340330kz1 = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return c1340330kz1.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C622680Oba.LIZJ(this);
        C1158500gFk.LIZ(this.itemView.findViewById(R.id.khh));
        C1158500gFk.LIZ(this.itemView.findViewById(R.id.khi));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C1554610qYd.LIZLLL(C1558360qeg.LJ(this.itemView, null), IPostModePageScrollStateProtocol.class, this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        CharSequence charSequenceLIZ;
        CommentCommonModel commonModel;
        Fragment fragmentLIZ;
        CommentCommonModel commonModel2;
        LinearLayout linearLayout;
        AnonymousClass0509 anonymousClass0509 = (AnonymousClass0509) interfaceC1891350zJl;
        super.onBindItemView(anonymousClass0509);
        String str = null;
        C1554610qYd.LIZJ(C1558360qeg.LJ(this.itemView, null), IPostModePageScrollStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        TextView textView = (TextView) this.itemView.findViewById(R.id.ea6);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.khh);
        View viewFindViewById = this.itemView.findViewById(R.id.khi);
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.ea8);
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.nj0);
        if (C1EE2.LIZIZ.LJJIJL()) {
            C426750GoL.LJIIIZ(viewGroup, null, Integer.valueOf(C0HD5.LIZ(viewGroup, 16)), null, null, false, 29);
            C426750GoL.LJIIL(viewFindViewById, 0, 0, 0, 0, 16);
            C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf(C0HD5.LIZ(viewFindViewById, 12)), Integer.valueOf(C0HD5.LIZ(viewFindViewById, Double.valueOf(15.5d))), Integer.valueOf(C0HD5.LIZ(viewFindViewById, 12)), 0, false, 16);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = C0HD5.LIZ(viewFindViewById, 20);
            layoutParams.width = C0HD5.LIZ(viewFindViewById, 20);
            C786410Ut5.W5(viewFindViewById, layoutParams);
            if ((viewGroup2 instanceof LinearLayout) && (linearLayout = (LinearLayout) viewGroup2) != null) {
                linearLayout.setGravity(8388611);
                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                layoutParams2.height = C0HD5.LIZ(linearLayout, Double.valueOf(40.5d));
                C786410Ut5.d6(linearLayout, layoutParams2);
            }
        }
        C1341170l0N c1341170l0N = C1341170l0N.LIZ;
        Aweme aweme = anonymousClass0509.LL;
        c1341170l0N.getClass();
        if (C1341170l0N.LIZ(aweme)) {
            Context context = getContext();
            if (context != null) {
                charSequenceLIZ = context.getString(2131825067);
            } else {
                charSequenceLIZ = null;
            }
        } else {
            C1342570l2d c1342570l2d = C1342570l2d.LIZ;
            Aweme aweme2 = anonymousClass0509.LL;
            boolean z = anonymousClass0509.LLILLL;
            c1342570l2d.getClass();
            charSequenceLIZ = C1342570l2d.LIZ(aweme2, z, -1L, null);
        }
        C1341550l0z c1341550l0z = C1341550l0z.LIZ;
        CommentContextSource commentContextSourceI5 = I5();
        c1341550l0z.getClass();
        if (C1341550l0z.LIZIZ(commentContextSourceI5)) {
            charSequenceLIZ = C1342560l2c.LIZ(I5(), getCurrentActivity(), null, String.valueOf(charSequenceLIZ), 4);
        }
        textView.setText(charSequenceLIZ);
        ACListenerS26S0500000_21 aCListenerS26S0500000_21 = new ACListenerS26S0500000_21(viewGroup2, viewGroup, viewFindViewById, this, tuxIconView, 1);
        if (C1341550l0z.LIZIZ(I5())) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            C786410Ut5.K7(viewGroup2, aCListenerS26S0500000_21);
        } else {
            CommentContextSource commentContextSourceI52 = I5();
            if (commentContextSourceI52 != null) {
                commonModel = commentContextSourceI52.getCommonModel();
            } else {
                commonModel = null;
            }
            if (CommentTimeSortFeatExp.LIZ(commonModel)) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                C786410Ut5.I7(aCListenerS26S0500000_21, viewFindViewById);
            }
        }
        ViewGroup viewGroup3 = (ViewGroup) this.itemView.findViewById(R.id.rkb);
        CommentContextSource commentContextSourceI53 = I5();
        if (commentContextSourceI53 != null && (commonModel2 = commentContextSourceI53.getCommonModel()) != null) {
            str = commonModel2.eventType;
        }
        boolean zAddCommentEntranceEnabled = ExploreDetailComponentOptExperiment.INSTANCE.addCommentEntranceEnabled(str);
        boolean zIsCommentEntryEnabled = PhotoDetailCommentEntryExperiment.isCommentEntryEnabled();
        if (viewGroup3 != null) {
            if (zAddCommentEntranceEnabled || zIsCommentEntryEnabled) {
                C786410Ut5.LJLZ(0, viewGroup3);
                if (str == null || str.length() <= 0) {
                    str = "homepage_explore";
                }
                Aweme aweme3 = anonymousClass0509.LL;
                LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
                if (!(currentLifecycleOwner instanceof Fragment) || (fragmentLIZ = (Fragment) currentLifecycleOwner) == null) {
                    fragmentLIZ = C946803n0.LIZ(this.itemView);
                }
                new C1341820l1Q(viewGroup3, aweme3, fragmentLIZ, str);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a48, viewGroup, false);
    }

    @C14EU
    public final void onSortChange(C7775031x c7775031x) {
        Aweme aweme;
        Aweme aweme2;
        boolean z;
        Object objLIZ;
        C1341550l0z c1341550l0z = C1341550l0z.LIZ;
        CommentContextSource commentContextSourceI5 = I5();
        c1341550l0z.getClass();
        if (!C1341550l0z.LIZIZ(commentContextSourceI5)) {
            return;
        }
        C1341170l0N c1341170l0N = C1341170l0N.LIZ;
        AnonymousClass0509 item = getItem();
        if (item != null) {
            aweme = item.LL;
        } else {
            aweme = null;
        }
        c1341170l0N.getClass();
        if (C1341170l0N.LIZ(aweme)) {
            Context context = getContext();
            if (context != null) {
                objLIZ = context.getString(2131825067);
            } else {
                objLIZ = null;
            }
        } else {
            C1342570l2d c1342570l2d = C1342570l2d.LIZ;
            AnonymousClass0509 item2 = getItem();
            if (item2 != null) {
                aweme2 = item2.LL;
            } else {
                aweme2 = null;
            }
            AnonymousClass0509 item3 = getItem();
            if (item3 != null) {
                z = item3.LLILLL;
            } else {
                z = false;
            }
            c1342570l2d.getClass();
            objLIZ = C1342570l2d.LIZ(aweme2, z, -1L, null);
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.ea6);
        if (textView != null) {
            textView.setText(C1342560l2c.LIZ(I5(), getCurrentActivity(), null, String.valueOf(objLIZ), 4));
        }
    }
}
