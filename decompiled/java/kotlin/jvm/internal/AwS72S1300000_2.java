package kotlin.jvm.internal;

import X.C05RV;
import X.C06ET;
import X.C09AY;
import X.C13IQ;
import X.C1408205fE;
import X.C1408505fH;
import X.C1530280pvO;
import X.C1558520qew;
import X.C1576606Fg;
import X.C1576706Fh;
import X.C1586906Jf;
import X.C1679506ht;
import X.C1684506ih;
import X.C2188811AlT;
import X.C23250099c;
import X.C889930Yvf;
import X.C909290Zln;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.SingleChatNoticeAssem;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS72S1300000_2 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS72S1300000_2 awS72S1300000_2) {
        IStreakPetService.LIZ.getClass();
        if (!C1586906Jf.LIZ().LJJI(awS72S1300000_2.s0) && (Intrinsics.LJFF(((C1576706Fh) awS72S1300000_2.l1).LIZ, "view_pet_description") || Intrinsics.LJFF(((C1576706Fh) awS72S1300000_2.l1).LIZ, "description"))) {
            return null;
        }
        C06ET c06et = C06ET.LIZLLL;
        String str = awS72S1300000_2.s0;
        return C1576606Fg.LIZ((C1576706Fh) awS72S1300000_2.l1, (StreakData) awS72S1300000_2.l2, c06et, (StreakPetData) awS72S1300000_2.l3, str);
    }

    public static final Object invoke$1(AwS72S1300000_2 awS72S1300000_2) {
        Context context = (Context) awS72S1300000_2.l1;
        C1530280pvO.LIZ(context, new AwS44S1300000_2(context, (FragmentManager) awS72S1300000_2.l2, awS72S1300000_2.s0, (InboxFragmentV2) awS72S1300000_2.l3, 0), true);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS72S1300000_2 awS72S1300000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assemble error instanceId:");
        sbLIZ.append(awS72S1300000_2.s0);
        sbLIZ.append(", assem:");
        sbLIZ.append((C13IQ) awS72S1300000_2.l1);
        sbLIZ.append(", viewId:");
        sbLIZ.append(((FrameLayout) awS72S1300000_2.l2).getId());
        sbLIZ.append(", exception:");
        sbLIZ.append((Throwable) awS72S1300000_2.l3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS72S1300000_2 awS72S1300000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assemble error instanceId:");
        sbLIZ.append(awS72S1300000_2.s0);
        sbLIZ.append(", assem:");
        sbLIZ.append((C13IQ) awS72S1300000_2.l1);
        sbLIZ.append(", viewId:");
        sbLIZ.append(((FrameLayout) awS72S1300000_2.l2).getId());
        sbLIZ.append(", exception:");
        sbLIZ.append((Throwable) awS72S1300000_2.l3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS72S1300000_2 awS72S1300000_2) {
        StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl = (StoryHighlightsImmersiveActionServiceImpl) awS72S1300000_2.l1;
        C23250099c.LIZLLL(storyHighlightsImmersiveActionServiceImpl.LIZ, null, null, new C1408205fE(awS72S1300000_2.s0, storyHighlightsImmersiveActionServiceImpl, (Fragment) awS72S1300000_2.l2, (Function0) awS72S1300000_2.l3, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS72S1300000_2 awS72S1300000_2) {
        StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl = (StoryHighlightsImmersiveActionServiceImpl) awS72S1300000_2.l1;
        C23250099c.LIZLLL(storyHighlightsImmersiveActionServiceImpl.LIZ, null, null, new C1408505fH(awS72S1300000_2.s0, storyHighlightsImmersiveActionServiceImpl, (Fragment) awS72S1300000_2.l2, (Function0) awS72S1300000_2.l3, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS72S1300000_2 awS72S1300000_2) {
        C889930Yvf c889930Yvf = C889930Yvf.LIZ;
        long jLongValue = ((Long) awS72S1300000_2.l1).longValue();
        C05RV c05rv = (C05RV) awS72S1300000_2.l2;
        String str = awS72S1300000_2.s0;
        Function1 function1 = (Function1) awS72S1300000_2.l3;
        c889930Yvf.getClass();
        C889930Yvf.LJIILL(jLongValue, c05rv, str, function1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS72S1300000_2 awS72S1300000_2) {
        String strLIZIZ;
        String singleChatFromUserId = ((C909290Zln) awS72S1300000_2.l1).getSingleChatFromUserId();
        if (singleChatFromUserId != null) {
            String str = awS72S1300000_2.s0;
            Keva kevaLIZLLL = C1679506ht.LIZ.LIZLLL();
            String strLJIIIIZZ = C1679506ht.LJIIIIZZ("key_last_inline_msg_uuid");
            if (strLJIIIIZZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJIIIIZZ);
                sbLIZ.append('_');
                sbLIZ.append(singleChatFromUserId);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = null;
            }
            kevaLIZLLL.storeString(strLIZIZ, str);
        }
        C1679506ht c1679506ht = C1679506ht.LIZ;
        c1679506ht.LIZLLL().storeLong(C1679506ht.LJIIIIZZ("key_last_inline_msg_display_timestamp"), System.currentTimeMillis());
        c1679506ht.LJII();
        ((ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZJ(C1558520qew.LJIIL((SingleChatNoticeAssem) awS72S1300000_2.l2), ChatRoomFakeMsgOperatorAbility.class)).yl2((C1684506ih) awS72S1300000_2.l3, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S1300000_2(C909290Zln c909290Zln, SingleChatNoticeAssem singleChatNoticeAssem, C1684506ih c1684506ih, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c909290Zln;
        this.l2 = singleChatNoticeAssem;
        this.l3 = c1684506ih;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S1300000_2(Context context, FragmentManager fragmentManager, String str, InboxFragmentV2 inboxFragmentV2, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.l2 = fragmentManager;
        this.s0 = str;
        this.l3 = inboxFragmentV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS72S1300000_2(StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl, StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl2, String str, Fragment fragment, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l1 = storyHighlightsImmersiveActionServiceImpl;
        this.s0 = storyHighlightsImmersiveActionServiceImpl2;
        this.l2 = str;
        this.l3 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS72S1300000_2(Long l, Long l2, C05RV c05rv, String str, Function1<? super Boolean, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l1 = l;
        this.l2 = l2;
        this.s0 = c05rv;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S1300000_2(String str, C1576706Fh c1576706Fh, StreakData streakData, StreakPetData streakPetData, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1576706Fh;
        this.l2 = streakData;
        this.l3 = streakPetData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS72S1300000_2(String str, String str2, C13IQ<? extends UIAssem> c13iq, FrameLayout frameLayout, Throwable th) {
        super(0);
        this.$t = th;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c13iq;
        this.l3 = frameLayout;
    }
}
