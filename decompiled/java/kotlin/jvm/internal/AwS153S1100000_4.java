package kotlin.jvm.internal;

import X.C09AY;
import X.C0DHD;
import X.C0DOO;
import X.C1245830iWb;
import X.C1245860iWe;
import X.C15433062l;
import X.C1863760ybG;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C331480Cz4;
import X.C332690D2l;
import X.C337900DMm;
import X.EnumC1231460i9Q;
import X.EnumC338580DPc;
import X.EnumC338600DPe;
import X.InterfaceC345200Dg6;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.ReviewListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.ur.school.service.SchoolFlowLauncher;
import com.tts.oecverify.BdTuring;
import defpackage.r2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS153S1100000_4 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS153S1100000_4 awS153S1100000_4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Media Preprocess Task: ");
        sbLIZ.append(((InterfaceC345200Dg6) awS153S1100000_4.l1).getName());
        sbLIZ.append(", is going to interrupt media preprocess session, reason: ");
        sbLIZ.append(awS153S1100000_4.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS153S1100000_4 awS153S1100000_4) {
        if (Intrinsics.LJFF(awS153S1100000_4.s0, CardStruct.IStatusCode.DEFAULT)) {
            ((ReviewListViewModel) awS153S1100000_4.l1).LLILLJJLI.setValue(C331480Cz4.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS153S1100000_4 r2) {
        /*
            java.lang.Object r0 = r2.l1
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.getArguments()
            if (r1 == 0) goto L18
            java.lang.String r0 = r2.s0
            boolean r1 = r1.getBoolean(r0)
            r0 = 1
            if (r1 != r0) goto L18
        L13:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L18:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS153S1100000_4.invoke$2(kotlin.jvm.internal.AwS153S1100000_4):java.lang.Object");
    }

    public static final Object invoke$3(AwS153S1100000_4 awS153S1100000_4) {
        SchoolFlowLauncher schoolFlowLauncher = (SchoolFlowLauncher) PluggableExtentionKt.pluggableSpi$default(SchoolFlowLauncher.class, false, false, false, 14, null);
        if (schoolFlowLauncher != null) {
            schoolFlowLauncher.LIZ((C19EG) awS153S1100000_4.l1, new C1245830iWb(EnumC338580DPc.EDIT_SCHOOL, new C1245860iWe(EnumC1231460i9Q.HOMEPAGE_HOT, null, null), false, EnumC338600DPe.POST, null, null, false, 116));
            C0DOO c0doo = C0DOO.LIZ;
            String str = awS153S1100000_4.s0;
            c0doo.getClass();
            C0DOO.LIZ("school_community_page", str, "add_college", null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS153S1100000_4 awS153S1100000_4) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((FindSchoolFriendsPageContainerAssem) awS153S1100000_4.l1), null, null, new C337900DMm((FindSchoolFriendsPageContainerAssem) awS153S1100000_4.l1, null), 3);
        C0DOO c0doo = C0DOO.LIZ;
        String str = awS153S1100000_4.s0;
        c0doo.getClass();
        C0DOO.LIZ("school_community_page", str, "not_now", null);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS153S1100000_4 awS153S1100000_4) {
        C1863760ybG.LJ(awS153S1100000_4.s0);
        ((Function0) awS153S1100000_4.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS153S1100000_4 awS153S1100000_4) {
        C15433062l.LJ("/api/v1/ucp/product", C2097608Jq.LJIIIIZZ(new Pair(FollowStatusChangeMethod.PARAM_UID, ((C332690D2l) awS153S1100000_4.l1).productId), new Pair("shop_domain", awS153S1100000_4.s0), new Pair("protocol_type", String.valueOf(((C332690D2l) awS153S1100000_4.l1).protocolType))));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS153S1100000_4 awS153S1100000_4) {
        ((EffectDraftDetailAssem) awS153S1100000_4.l1).ip(awS153S1100000_4.s0);
        EffectDraftDetailViewModel effectDraftDetailViewModelHp = ((EffectDraftDetailAssem) awS153S1100000_4.l1).hp();
        effectDraftDetailViewModelHp.withState(new AwS583S0100000_4(effectDraftDetailViewModelHp, 103));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS153S1100000_4 awS153S1100000_4) {
        ((C0DHD) awS153S1100000_4.l1).LJ(awS153S1100000_4.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS153S1100000_4 awS153S1100000_4) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submitTakoQuestionChunk with op ");
        sbLIZ.append(((r2) awS153S1100000_4.l1).LIZIZ);
        sbLIZ.append(",  enterSource ");
        sbLIZ.append(((r2) awS153S1100000_4.l1).LJIILLIIL.LIZJ);
        sbLIZ.append(" entryTime ");
        sbLIZ.append(((r2) awS153S1100000_4.l1).LJIILLIIL.LJI);
        sbLIZ.append(",  uuid ");
        sbLIZ.append(((r2) awS153S1100000_4.l1).LIZJ.uuid);
        sbLIZ.append(",  conversationId ");
        sbLIZ.append(awS153S1100000_4.s0);
        sbLIZ.append(",  subConversationId ");
        sbLIZ.append(((r2) awS153S1100000_4.l1).LJIILLIIL.LJIILIIL);
        sbLIZ.append(",  msgType ");
        sbLIZ.append(((r2) awS153S1100000_4.l1).LIZJ.msgType);
        sbLIZ.append(",  content ");
        TakoMixFeed takoMixFeedLJIIIZ = ((r2) awS153S1100000_4.l1).LIZJ.LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            str = takoMixFeedLJIIIZ.text;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(",  sessionId ");
        sbLIZ.append(((r2) awS153S1100000_4.l1).LJIILLIIL.LJ);
        sbLIZ.append(", ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1100000_4(Fragment fragment, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = "is_self";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1100000_4(C332690D2l c332690D2l, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c332690D2l;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1100000_4(C0DHD c0dhd, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0dhd;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1100000_4(C19EG c19eg, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c19eg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1100000_4(EffectDraftDetailAssem effectDraftDetailAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = effectDraftDetailAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1100000_4(FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = findSchoolFriendsPageContainerAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1100000_4(String str, InterfaceC345200Dg6 interfaceC345200Dg6, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC345200Dg6;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1100000_4(String str, ReviewListViewModel reviewListViewModel, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = reviewListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS153S1100000_4(String str, String str2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1100000_4(r2 r2Var, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = r2Var;
        this.s0 = str;
    }
}
