package kotlin.jvm.internal;

import X.C09AY;
import X.C0SZ8;
import X.C631370Opb;
import X.C710330Rtf;
import X.C712440Rx4;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C728750SiH;
import X.C734700Srs;
import Y.ARunnableS111S0100000_11;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryGuideCardVHAbility;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardSingleAvatarComponent;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardShareViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AwS191S1100000_11 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS191S1100000_11(C734700Srs c734700Srs, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c734700Srs;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS191S1100000_11 awS191S1100000_11, Object obj, Object obj2) {
        Integer numValueOf;
        View viewEp;
        Aweme awemeM199clone;
        UserStory userStory;
        SmartRoute smartRoute = (SmartRoute) obj;
        smartRoute.withParam("story_guide_card_key", "story_guide_card_skylight_list_view_model");
        smartRoute.withParam("previous_page", awS191S1100000_11.s0);
        smartRoute.withParam(FollowStatusChangeMethod.PARAM_UID, (String) obj2);
        HashMap map = new HashMap();
        map.put("enter_position", "story_card");
        smartRoute.withParam("feed_param_extra", map);
        C710330Rtf.LIZLLL(smartRoute, C724240Sb0.LIZ((StoryGuideCardSingleAvatarComponent) awS191S1100000_11.l1), "STORY_ENTRANCE_GUIDE_CARD");
        C728750SiH c728750SiH = C728750SiH.LIZ;
        StoryGuideCardVHAbility storyGuideCardVHAbility = (StoryGuideCardVHAbility) ((StoryGuideCardSingleAvatarComponent) awS191S1100000_11.l1).LLJLLL.getValue();
        Object obj3 = null;
        if (storyGuideCardVHAbility != null) {
            numValueOf = Integer.valueOf(storyGuideCardVHAbility.gl());
        } else {
            numValueOf = null;
        }
        String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ((StoryGuideCardSingleAvatarComponent) awS191S1100000_11.l1)).getAweme());
        c728750SiH.getClass();
        Aweme awemeLIZLLL = C728750SiH.LIZLLL(numValueOf, authorUid);
        if (awemeLIZLLL == null) {
            C0SZ8 c0sz8 = (C0SZ8) ((StoryGuideCardSingleAvatarComponent) awS191S1100000_11.l1).LLJZIJLIL.getValue();
            if (c0sz8 != null) {
                awemeLIZLLL = c0sz8.hm();
            } else {
                awemeLIZLLL = null;
            }
        }
        Aweme awemeLIZJ = C712440Rx4.LIZJ(awemeLIZLLL);
        StoryGuideCardShareViewModel storyGuideCardShareViewModel = (StoryGuideCardShareViewModel) ((StoryGuideCardSingleAvatarComponent) awS191S1100000_11.l1).LLJZ.getValue();
        if (storyGuideCardShareViewModel != null) {
            storyGuideCardShareViewModel.LLILZIL = awemeLIZJ;
            if (awemeLIZLLL != null) {
                awemeM199clone = awemeLIZLLL.m199clone();
                if (awemeM199clone != null && (userStory = awemeM199clone.getUserStory()) != null) {
                    userStory.setStoryGuideCard(false);
                }
            } else {
                awemeM199clone = null;
            }
            storyGuideCardShareViewModel.LLILZLL = awemeM199clone;
            storyGuideCardShareViewModel.LLJILJIL = null;
            storyGuideCardShareViewModel.setStateImmediate(AFwS232S0000000_4.get$arr$(260));
        }
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) ((StoryGuideCardSingleAvatarComponent) awS191S1100000_11.l1).LLJZ.getValue();
        if (assemSingleListViewModel != null) {
            assemSingleListViewModel.manualListRefresh();
        }
        StoryGuideCardSingleAvatarComponent storyGuideCardSingleAvatarComponent = (StoryGuideCardSingleAvatarComponent) awS191S1100000_11.l1;
        storyGuideCardSingleAvatarComponent.getClass();
        C724270Sb3 c724270Sb3 = storyGuideCardSingleAvatarComponent.LLJI;
        if (c724270Sb3 != null) {
            obj3 = c724270Sb3.LL;
        }
        String strLIZ = C712440Rx4.LIZ(((VideoItemParams) obj3).getAweme());
        if (strLIZ != null) {
            ((HashMap) C728750SiH.LJ.getValue()).put(strLIZ, Boolean.TRUE);
        }
        TuxTextView tuxTextViewTp = storyGuideCardSingleAvatarComponent.Tp();
        if ((tuxTextViewTp == null || tuxTextViewTp.getVisibility() != 0) && (viewEp = storyGuideCardSingleAvatarComponent.Ep()) != null) {
            HandlerHook.viewPostDelay(viewEp, new ARunnableS111S0100000_11(storyGuideCardSingleAvatarComponent, 138), 500L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS191S1100000_11 awS191S1100000_11, Object obj, Object obj2) {
        ((C734700Srs) awS191S1100000_11.l1).Me1(awS191S1100000_11.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS191S1100000_11 awS191S1100000_11, Object obj, Object obj2) {
        ((C734700Srs) awS191S1100000_11.l1).Me1(awS191S1100000_11.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS191S1100000_11(String str, StoryGuideCardSingleAvatarComponent storyGuideCardSingleAvatarComponent, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = storyGuideCardSingleAvatarComponent;
    }
}
