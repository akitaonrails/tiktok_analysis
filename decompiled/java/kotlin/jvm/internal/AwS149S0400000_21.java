package kotlin.jvm.internal;

import X.C09AY;
import X.C0SHX;
import X.C1345760l7m;
import X.C1368320liA;
import X.C1368610lid;
import X.C1368790liv;
import X.C1368870lj3;
import X.C1383870m7F;
import X.C19EG;
import X.C2188811AlT;
import X.C897520ZIw;
import X.InterfaceC1211080hcY;
import X.InterfaceC1618460sDc;
import X.InterfaceC665370Q7z;
import android.content.Context;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS149S0400000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS149S0400000_21 r42) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS149S0400000_21.invoke$0(kotlin.jvm.internal.AwS149S0400000_21):java.lang.Object");
    }

    public static final Object invoke$1(AwS149S0400000_21 awS149S0400000_21) {
        ICommentListVMAbility iCommentListVMAbilityLJ;
        String aid;
        Aweme aweme;
        CommentPublishViewModel commentPublishViewModel = (CommentPublishViewModel) awS149S0400000_21.l0;
        InterfaceC665370Q7z interfaceC665370Q7z = commentPublishViewModel.LLILLJJLI;
        if (interfaceC665370Q7z != null && (iCommentListVMAbilityLJ = C1345760l7m.LJ(commentPublishViewModel.LLILLL, interfaceC665370Q7z)) != null) {
            Comment comment = (Comment) awS149S0400000_21.l1;
            CommentContextSource commentContextSourceYQ2 = ((CommentPublishViewModel) awS149S0400000_21.l0).yQ2();
            if (commentContextSourceYQ2 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceYQ2)) == null || (aid = aweme.getAid()) == null) {
                Aweme aweme2 = (Aweme) awS149S0400000_21.l2;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
            }
            iCommentListVMAbilityLJ.aX1(comment, aid, (Context) awS149S0400000_21.l3, 1, 0.0f, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS149S0400000_21 awS149S0400000_21) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerCollect validList: ");
        sbLIZ.append(((List) awS149S0400000_21.l0).size());
        sbLIZ.append(" userList: ");
        sbLIZ.append(((List) awS149S0400000_21.l1).size());
        sbLIZ.append(" groupList: ");
        sbLIZ.append(((List) awS149S0400000_21.l2).size());
        sbLIZ.append(" quickReverse: ");
        sbLIZ.append((List) awS149S0400000_21.l3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS149S0400000_21 awS149S0400000_21) {
        C0SHX.LIZ((C19EG) awS149S0400000_21.l0, null).LJIIJJI("show_danmaku_rethink", false, null);
        ((C1383870m7F) awS149S0400000_21.l1).LIZLLL((IDanmakuData) awS149S0400000_21.l2);
        ((InterfaceC1211080hcY) awS149S0400000_21.l3).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS149S0400000_21 awS149S0400000_21) {
        SharePackage sharePackage = ((C1368790liv) awS149S0400000_21.l0).LIZJ().LIZ;
        ShareMoreViewModel shareMoreViewModel = ((C1368870lj3) awS149S0400000_21.l1).LIZJ;
        C1368320liA c1368320liALIZJ = ((C1368790liv) awS149S0400000_21.l0).LIZJ();
        boolean zBooleanValue = ((Boolean) ((C1368790liv) awS149S0400000_21.l0).LLJIJIL.getValue()).booleanValue();
        C1368790liv c1368790liv = (C1368790liv) awS149S0400000_21.l0;
        return new C1368610lid(sharePackage, shareMoreViewModel, c1368320liALIZJ, zBooleanValue, c1368790liv, c1368790liv.LIZIZ(), (C897520ZIw) ((C1368790liv) awS149S0400000_21.l0).LLJILJIL.getValue(), (Map) awS149S0400000_21.l2, (Map) awS149S0400000_21.l3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS149S0400000_21(C1368790liv c1368790liv, C1368790liv c1368790liv2, C1368870lj3 c1368870lj3, Map<String, String> map, Map<String, String> map2) {
        super(0);
        this.$t = map2;
        this.l0 = c1368790liv;
        this.l1 = c1368790liv2;
        this.l2 = c1368870lj3;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0400000_21(C19EG c19eg, C1383870m7F c1383870m7F, IDanmakuData iDanmakuData, InterfaceC1211080hcY interfaceC1211080hcY, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = c1383870m7F;
        this.l2 = iDanmakuData;
        this.l3 = interfaceC1211080hcY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0400000_21(Context context, Aweme aweme, Comment comment, InterfaceC1618460sDc interfaceC1618460sDc, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = aweme;
        this.l2 = comment;
        this.l3 = interfaceC1618460sDc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0400000_21(CommentPublishViewModel commentPublishViewModel, Comment comment, Aweme aweme, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = commentPublishViewModel;
        this.l1 = comment;
        this.l2 = aweme;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS149S0400000_21(List list, List<SharePanelItemInfo> list2, List<String> list3, List<String> list4, List<String> list5) {
        super(0);
        this.$t = list5;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
        this.l3 = list4;
    }
}
