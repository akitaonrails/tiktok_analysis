package kotlin.jvm.internal;

import X.C09AY;
import X.C1340400kz8;
import X.C1350920lG6;
import X.C1362190lYH;
import X.C1362200lYI;
import X.C1366480lfC;
import X.C1371590lnR;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C2344009Gk;
import X.InterfaceC1361730lXX;
import X.InterfaceC1362720lZ8;
import X.InterfaceC1369790lkX;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS16S0401000_21 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS16S0401000_21 awS16S0401000_21, Object obj) {
        String strEnterFrom;
        CommentContextSource commentContextSource = (CommentContextSource) awS16S0401000_21.l0;
        if (commentContextSource != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
        } else {
            strEnterFrom = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
        c2344009Gk.LJIIIIZZ("target", "delete");
        c2344009Gk.LIZJ(1, "comment_cnt");
        C1350920lG6.LJJJ(c2344009Gk, "delete_video_comment");
        CommentDeleteVM commentDeleteVM = (CommentDeleteVM) awS16S0401000_21.l1;
        C1340400kz8 c1340400kz8 = (C1340400kz8) awS16S0401000_21.l2;
        Fragment fragment = (Fragment) awS16S0401000_21.l3;
        int i = awS16S0401000_21.i4;
        CommentContextSource commentContextSource2 = (CommentContextSource) awS16S0401000_21.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentDeleteVM.LLIZLLLIL;
        commentDeleteVM.vQ2(i, fragment, null, commentContextSource2, c1340400kz8);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS16S0401000_21 awS16S0401000_21, Object obj) {
        C1397620mTQ c1397620mTQ = new C1397620mTQ(((Fragment) awS16S0401000_21.l0).requireContext());
        CommentContextSource commentContextSource = (CommentContextSource) awS16S0401000_21.l1;
        CommentDeleteVM commentDeleteVM = (CommentDeleteVM) awS16S0401000_21.l2;
        C1340400kz8 c1340400kz8 = (C1340400kz8) awS16S0401000_21.l3;
        c1397620mTQ.LJFF(2131829213, new AwS16S0401000_21(awS16S0401000_21.i4, (Fragment) awS16S0401000_21.l0, commentContextSource, c1340400kz8, commentDeleteVM, 0));
        c1397620mTQ.LJII(2131829212, new AwS600S0100000_21((CommentContextSource) awS16S0401000_21.l1, 208));
        C1397580mTM c1397580mTM = new C1397580mTM(((Fragment) awS16S0401000_21.l0).requireContext());
        c1397580mTM.LJFF(2131829215);
        c1397580mTM.LIZ(2131829214);
        c1397580mTM.LJIIL = c1397620mTQ;
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS16S0401000_21 awS16S0401000_21, Object obj) {
        C1366480lfC.LIZ(((Boolean) obj).booleanValue(), (C1371590lnR) awS16S0401000_21.l0, (InterfaceC1369790lkX) awS16S0401000_21.l1, awS16S0401000_21.i4, (Context) awS16S0401000_21.l2, (InterfaceC1362720lZ8) awS16S0401000_21.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS16S0401000_21 awS16S0401000_21, Object obj) {
        return C1362190lYH.LIZ((C1362190lYH) obj, (List) awS16S0401000_21.l0, (List) awS16S0401000_21.l1, (Set) awS16S0401000_21.l2, false, false, null, null, false, new C1362200lYI(1, (List) awS16S0401000_21.l3, awS16S0401000_21.i4), 504);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS16S0401000_21(int r3, androidx.fragment.app.Fragment r4, com.ss.android.ugc.aweme.comment.model.CommentContextSource r5, X.C1340400kz8 r6, com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r7
            r1.l3 = r6
            r1.i4 = r3
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r7
            r1.l2 = r6
            r1.l3 = r4
            r1.i4 = r3
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS16S0401000_21.<init>(int, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.comment.model.CommentContextSource, X.0kz8, com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0401000_21(C1371590lnR c1371590lnR, InterfaceC1369790lkX interfaceC1369790lkX, int i, Context context, InterfaceC1362720lZ8 interfaceC1362720lZ8, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1371590lnR;
        this.l1 = interfaceC1369790lkX;
        this.i4 = i;
        this.l2 = context;
        this.l3 = interfaceC1362720lZ8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS16S0401000_21(List list, List<? extends InterfaceC1361730lXX> list2, List<? extends IMContact> list3, Set<IMContact> set, List<? extends InterfaceC1361730lXX> list4, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
        this.l3 = set;
        this.i4 = list4;
    }
}
