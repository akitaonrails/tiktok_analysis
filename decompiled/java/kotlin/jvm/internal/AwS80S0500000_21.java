package kotlin.jvm.internal;

import X.C07CE;
import X.C09AY;
import X.C0SHX;
import X.C1339870kyH;
import X.C1361010lWN;
import X.C1383870m7F;
import X.C19EG;
import X.C786410Ut5;
import X.InterfaceC1211080hcY;
import X.InterfaceC1355220lN2;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.ShareRepostViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS80S0500000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS80S0500000_21 awS80S0500000_21) {
        super/*com.ss.android.ugc.aweme.share.base.model.BaseSharePackage*/.LJIIIZ((Context) awS80S0500000_21.l1, (InterfaceC1369790lkX) awS80S0500000_21.l2, (View) awS80S0500000_21.l3, (Function0) awS80S0500000_21.l4);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS80S0500000_21 r16) {
        /*
            r5 = r16
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.upvote.detail.repostshare.ShareRepostViewModel r0 = (com.ss.android.ugc.aweme.upvote.detail.repostshare.ShareRepostViewModel) r0
            r0.vQ2()
            java.lang.Object r3 = r5.l0
            com.ss.android.ugc.aweme.upvote.detail.repostshare.ShareRepostViewModel r3 = (com.ss.android.ugc.aweme.upvote.detail.repostshare.ShareRepostViewModel) r3
            java.lang.Object r6 = r5.l1
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r2 = r5.l2
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r2 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r2
            java.lang.Object r0 = r5.l3
            com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct r0 = (com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct) r0
            java.lang.Object r9 = r5.l4
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.ss.android.ugc.aweme.feed.model.Aweme) r9
            r3.getClass()
            if (r0 == 0) goto L26
            java.lang.String r10 = r0.replyId
            if (r10 != 0) goto L28
        L26:
            java.lang.String r10 = r2.textId
        L28:
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            if (r0 != 0) goto L30
        L2e:
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.user
        L30:
            android.app.Activity r8 = X.C1388190mED.LIZ(r6)
            if (r8 == 0) goto L6f
            X.0l6i r4 = X.C1345100l6i.LIZ
            r14 = 0
            if (r0 == 0) goto L87
            java.lang.String r11 = r0.getUid()
            java.lang.String r12 = r0.getUniqueId()
            boolean r1 = r0.isBlock
            r0 = 1
            if (r1 != r0) goto L89
            r13 = 1
        L49:
            if (r9 == 0) goto L4f
            java.lang.String r14 = r9.getAid()
        L4f:
            int r0 = X.C497820Jfg.LIZ(r6)
            double r0 = (double) r0
            r6 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r0 = r0 * r6
            int r15 = (int) r0
            java.lang.String r0 = r3.LL
            r4.getClass()
            r16 = r0
            X.C1345100l6i.LIZ(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.0lSP r1 = X.C1358550lSP.LIZ
            java.lang.String r0 = r3.LL
            r1.getClass()
            X.C1358550lSP.LJJI(r0, r9, r2)
        L6f:
            java.lang.Object r4 = r5.l0
            com.ss.android.ugc.aweme.upvote.detail.repostshare.ShareRepostViewModel r4 = (com.ss.android.ugc.aweme.upvote.detail.repostshare.ShareRepostViewModel) r4
            java.lang.Object r3 = r5.l4
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            java.lang.Object r2 = r5.l2
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r2 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r2
            java.lang.Object r1 = r5.l3
            com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct r1 = (com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct) r1
            java.lang.String r0 = "report"
            r4.wQ2(r3, r2, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L87:
            r11 = r14
            r12 = r14
        L89:
            r13 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS80S0500000_21.invoke$1(kotlin.jvm.internal.AwS80S0500000_21):java.lang.Object");
    }

    public static final Object invoke$2(AwS80S0500000_21 awS80S0500000_21) {
        ((ShareRepostViewModel) awS80S0500000_21.l0).vQ2();
        InterfaceC1355220lN2 interfaceC1355220lN2 = (InterfaceC1355220lN2) awS80S0500000_21.l1;
        if (interfaceC1355220lN2 != null) {
            interfaceC1355220lN2.Gw((RepostReplyStruct) awS80S0500000_21.l2, (UpvoteStruct) awS80S0500000_21.l3);
        }
        ((ShareRepostViewModel) awS80S0500000_21.l0).wQ2((Aweme) awS80S0500000_21.l4, (UpvoteStruct) awS80S0500000_21.l3, (RepostReplyStruct) awS80S0500000_21.l2, "delete");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS80S0500000_21 awS80S0500000_21) {
        ((ShareRepostViewModel) awS80S0500000_21.l0).vQ2();
        InterfaceC1355220lN2 interfaceC1355220lN2 = (InterfaceC1355220lN2) awS80S0500000_21.l1;
        if (interfaceC1355220lN2 != null) {
            interfaceC1355220lN2.Gw((RepostReplyStruct) awS80S0500000_21.l2, (UpvoteStruct) awS80S0500000_21.l3);
        }
        ((ShareRepostViewModel) awS80S0500000_21.l0).wQ2((Aweme) awS80S0500000_21.l4, (UpvoteStruct) awS80S0500000_21.l3, (RepostReplyStruct) awS80S0500000_21.l2, "delete");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS80S0500000_21 awS80S0500000_21) {
        C0SHX.LIZ((C19EG) awS80S0500000_21.l0, null).LJIIJJI("show_danmaku_rethink", false, null);
        ((InterfaceC1211080hcY) awS80S0500000_21.l1).LIZLLL();
        C1383870m7F c1383870m7F = (C1383870m7F) awS80S0500000_21.l2;
        c1383870m7F.LJIILL.LIZ(c1383870m7F.LJ(C1361010lWN.LIZ((C1361010lWN) awS80S0500000_21.l3, null, true, null, 23), (IDanmakuData) awS80S0500000_21.l4).LJJLJ());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS80S0500000_21 awS80S0500000_21) {
        if (C07CE.LIZ()) {
            C1339870kyH c1339870kyH = (C1339870kyH) awS80S0500000_21.l0;
            View view = (View) awS80S0500000_21.l1;
            Map map = (Map) awS80S0500000_21.l2;
            c1339870kyH.getClass();
            C1339870kyH.LIZIZ(view, map);
        } else {
            ((Map) awS80S0500000_21.l2).clear();
            C1339870kyH c1339870kyH2 = (C1339870kyH) awS80S0500000_21.l0;
            View view2 = (View) awS80S0500000_21.l1;
            List list = (List) awS80S0500000_21.l3;
            Map map2 = (Map) awS80S0500000_21.l2;
            c1339870kyH2.getClass();
            C1339870kyH.LIZ(view2, list, map2);
        }
        TuxTextView tuxTextView = (TuxTextView) awS80S0500000_21.l4;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS80S0500000_21(C1339870kyH c1339870kyH, C1339870kyH c1339870kyH2, View view, Map<Integer, Integer> map, List<Integer> list, TuxTextView tuxTextView) {
        super(0);
        this.$t = tuxTextView;
        this.l0 = c1339870kyH;
        this.l1 = c1339870kyH2;
        this.l2 = view;
        this.l3 = map;
        this.l4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S0500000_21(C19EG c19eg, InterfaceC1211080hcY interfaceC1211080hcY, C1383870m7F c1383870m7F, C1361010lWN c1361010lWN, IDanmakuData iDanmakuData, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = interfaceC1211080hcY;
        this.l2 = c1383870m7F;
        this.l3 = c1361010lWN;
        this.l4 = iDanmakuData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS80S0500000_21(CommentSharePackage commentSharePackage, CommentSharePackage commentSharePackage2, Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = commentSharePackage;
        this.l1 = commentSharePackage2;
        this.l2 = context;
        this.l3 = interfaceC1369790lkX;
        this.l4 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S0500000_21(ShareRepostViewModel shareRepostViewModel, InterfaceC1355220lN2 interfaceC1355220lN2, RepostReplyStruct repostReplyStruct, UpvoteStruct upvoteStruct, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = shareRepostViewModel;
        this.l1 = interfaceC1355220lN2;
        this.l2 = repostReplyStruct;
        this.l3 = upvoteStruct;
        this.l4 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S0500000_21(ShareRepostViewModel shareRepostViewModel, Context context, UpvoteStruct upvoteStruct, RepostReplyStruct repostReplyStruct, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = shareRepostViewModel;
        this.l1 = context;
        this.l2 = upvoteStruct;
        this.l3 = repostReplyStruct;
        this.l4 = aweme;
    }
}
