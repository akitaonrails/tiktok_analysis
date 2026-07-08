package com.ss.android.ugc.aweme.commentv2.commentlist.ui;

import X.AbstractC1906720ziY;
import X.AnonymousClass0509;
import X.C01GW;
import X.C1342180l20;
import X.C1343060l3Q;
import X.C1356320lOo;
import X.C1357700lR2;
import X.C21146717pB;
import X.C2188811AlT;
import X.C294200Bg2;
import X.C442460HWq;
import X.C452501pT;
import X.C563400M7u;
import X.C623200OcQ;
import X.C687700QyG;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class PostModeFullPagePowerListAssem extends CommentPowerListAssem {
    public final C01GW LLLLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 499));
    public final C01GW LLLLLLJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(213));

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem
    public final void Jp() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void Q10() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class});
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem
    public final void fq() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem
    public final void Qp() {
        List<Integer> list = C1343060l3Q.LIZ;
        CommentContextSourceKt.aweme(sp());
        List<Integer> list2 = C1343060l3Q.LIZ;
        ArrayList arrayList = (ArrayList) list2;
        boolean z = !arrayList.isEmpty();
        Integer numValueOf = Integer.valueOf(R.layout.a30);
        Integer numValueOf2 = Integer.valueOf(R.layout.a31);
        Integer numValueOf3 = Integer.valueOf(R.layout.a2z);
        if (!z) {
            arrayList.add(numValueOf3);
            arrayList.add(numValueOf2);
            arrayList.add(numValueOf3);
            arrayList.add(numValueOf2);
            arrayList.add(numValueOf3);
            arrayList.add(numValueOf2);
            arrayList.add(numValueOf3);
            arrayList.add(numValueOf2);
            arrayList.add(numValueOf3);
            arrayList.add(numValueOf2);
            arrayList.add(numValueOf3);
            arrayList.add(numValueOf2);
            arrayList.add(numValueOf);
            arrayList.add(numValueOf);
            arrayList.add(numValueOf);
        }
        Context context = getContext();
        Aweme aweme = CommentContextSourceKt.aweme(sp());
        if (context == null || aweme == null || C294200Bg2.LIZ() || C1343060l3Q.LIZIZ.contains(Integer.valueOf(context.hashCode()))) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("serial preload， ");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
        for (Pair pair : C1356320lOo.LIZIZ(context, list2)) {
            C21146717pB.LJFF((Context) pair.getFirst(), "post_mode_comment_refactor_group_1234567", (List) pair.getSecond());
        }
        C1343060l3Q.LIZIZ.add(Integer.valueOf(context.hashCode()));
        if (C294200Bg2.LIZJ()) {
            Iterator it2 = ((ArrayList) C1343060l3Q.LIZ).iterator();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                if (iIntValue == R.layout.a2z) {
                    i++;
                } else if (iIntValue == R.layout.a30) {
                    i2++;
                } else if (iIntValue == R.layout.a31) {
                    i3++;
                }
            }
            ((C563400M7u) C1343060l3Q.LIZJ.getValue()).LJ(i);
            ((C563400M7u) C1343060l3Q.LIZLLL.getValue()).LJ(i2);
            ((C563400M7u) C1343060l3Q.LJ.getValue()).LJ(i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem
    public final void Ip() {
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        Bp().LIZJ((AbstractC1906720ziY) this.LLLLLLJ.getValue());
        C442460HWq c442460HWq = (C442460HWq) this.LLLLLLJ.getValue();
        CommentContextSource commentContextSourceSp = sp();
        Aweme aweme = (commentContextSourceSp == null || (commonModel2 = commentContextSourceSp.getCommonModel()) == null) ? null : commonModel2.aweme;
        CommentContextSource commentContextSourceSp2 = sp();
        boolean zIsNoPermissionVideoFromCommentHistory = (commentContextSourceSp2 == null || (commonModel = commentContextSourceSp2.getCommonModel()) == null) ? false : commonModel.isNoPermissionVideoFromCommentHistory();
        if (aweme == null) {
            c442460HWq.getClass();
        } else {
            c442460HWq.LLJI = aweme;
            c442460HWq.LLJIJIL = zIsNoPermissionVideoFromCommentHistory;
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                c442460HWq.LLILZLL.LJIILL(Collections.singletonList(new AnonymousClass0509(statistics.getCommentCount(), aweme, zIsNoPermissionVideoFromCommentHistory)), null);
            }
        }
        Jo();
        Ho();
        Oo();
        Lo();
        No();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem
    public final Class<? extends PowerLoadingCell> zp() {
        return PostModeLoadingFooterCell.class;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void Zd2(int i) {
        LinearLayoutManager linearLayoutManager;
        int size = 0;
        for (AbstractC1906720ziY abstractC1906720ziY : Bp().getAllChunks()) {
            if (!(abstractC1906720ziY instanceof C1342180l20)) {
                size += abstractC1906720ziY.getItems().size();
            }
        }
        int headerCount = size + Bp().getHeaderCount();
        RecyclerView.LayoutManager layoutManager = Bp().getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (!kp().getItems().isEmpty()) {
            headerCount += i;
        }
        int i2 = headerCount - 1;
        if (i2 >= 0 && i2 < Bp().getListItems().size()) {
            IPhotoNestHeaderAbility iPhotoNestHeaderAbility = (IPhotoNestHeaderAbility) this.LLLLLLIL.getValue();
            if ((iPhotoNestHeaderAbility != null && iPhotoNestHeaderAbility.kF2(i, i2)) || linearLayoutManager == null) {
                return;
            }
            linearLayoutManager.scrollToPositionWithOffset(i2, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void Xt1(Comment comment, boolean z) {
        IPhotoNestHeaderAbility iPhotoNestHeaderAbility = (IPhotoNestHeaderAbility) this.LLLLLLIL.getValue();
        if (iPhotoNestHeaderAbility != null && iPhotoNestHeaderAbility.h91()) {
            return;
        }
        C623200OcQ.LIZIZ(Bp(), z, comment, 144);
    }
}
