package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1346420l8q;
import X.C1347490lAZ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1875507Wf;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentListModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ReviewFilteredCommentsCell extends PowerCell<C1875507Wf> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public TuxTextView LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReviewFilteredCommentsCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ReviewFilteredCommentsCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 426);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(114);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 437), awS565S0100000_21, AFwS209S0000000_21.get$arr$(194), new AwS565S0100000_21((C03K6) this, 412), new AwS565S0100000_21((C03K6) this, 414), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 416), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 418), null, new AwS565S0100000_21((C03K6) this, 419));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 413);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 415);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 417);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 31));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 420);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 421);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 422);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 423);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 424);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 425), awS565S0100000_21, AFwS209S0000000_21.get$arr$(195), new AwS565S0100000_21((C03K6) this, 427), new AwS565S0100000_21((C03K6) this, 428), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 429), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 430), null, new AwS565S0100000_21((C03K6) this, 431));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 432), awS565S0100000_21, AFwS209S0000000_21.get$arr$(196), new AwS565S0100000_21((C03K6) this, 433), new AwS565S0100000_21((C03K6) this, 434), new AwS565S0100000_21((C03K6) this, 435), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 436));
        }
        this.LL = assemVMLazy;
    }

    public final CommentContextSource I5() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            return (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
        }
        return null;
    }

    public final CommentListAssemVM L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (CommentListAssemVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[PHI: r5
      0x0017: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:10:0x0015, B:8:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r7.I5()
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
        La:
            java.lang.String r6 = ""
            if (r0 == 0) goto L14
            java.lang.String r5 = r0.getAid()
            if (r5 != 0) goto L17
        L14:
            r5 = r6
            if (r0 == 0) goto L1e
        L17:
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            if (r0 == 0) goto L1e
            r6 = r0
        L1e:
            int r0 = r5.length()
            if (r0 == 0) goto L50
            int r0 = r6.length()
            if (r0 == 0) goto L50
            X.0lAZ r0 = X.C1347490lAZ.LIZ
            r0.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            com.bytedance.keva.Keva r4 = X.C1347490lAZ.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "interacted_timestamp_"
            r1.append(r0)
            r1.append(r5)
            r0 = 95
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r4.storeLong(r0, r2)
        L50:
            return
        L51:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.powercell.ReviewFilteredCommentsCell.N5():void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.tv_title);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.cov);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 54));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        CharSequence charSequenceLIZ;
        String str;
        String aid;
        Aweme aweme;
        CommentListModel listModel;
        super.onBindItemView(interfaceC1891350zJl);
        CommentContextSource commentContextSourceI5 = I5();
        Activity activityLIZIZ = C737910Sx3.LIZIZ(this.itemView.getContext());
        String str2 = "";
        if (activityLIZIZ == null) {
            charSequenceLIZ = "";
        } else {
            Long lValueOf = null;
            if (commentContextSourceI5 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceI5);
            } else {
                aweme = null;
            }
            int i = L5().DQ2().LJIIIZ;
            int i2 = L5().DQ2().LJIIJ;
            if (commentContextSourceI5 != null && (listModel = commentContextSourceI5.getListModel()) != null) {
                lValueOf = Long.valueOf(listModel.getCommentCount());
            }
            charSequenceLIZ = C1347490lAZ.LIZ(activityLIZIZ, aweme, i, i2, C1346420l8q.LJFF(lValueOf), new AwS565S0100000_21(this, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(charSequenceLIZ);
        }
        int i3 = L5().DQ2().LJIIIZ;
        if (i3 != 1) {
            if (i3 != 3) {
                str = "";
            } else {
                str = "1";
            }
        } else {
            str = "2";
        }
        Pair[] pairArr = new Pair[3];
        Aweme aweme2 = CommentContextSourceKt.aweme(commentContextSourceI5);
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            str2 = aid;
        }
        pairArr[0] = new Pair("group_id", str2);
        pairArr[1] = new Pair("reminder_degree", str);
        pairArr[2] = new Pair("reminder_status", "1");
        C20684815ws.LJIILLIIL("filtered_comment_review_byvideo_sw", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a3b, viewGroup, false);
    }
}
