package kotlin.jvm.internal;

import X.C06US;
import X.C09AY;
import X.C1618440sDa;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsDeleteDialogService;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS3S3400000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S3400000_2 awS3S3400000_2, Object obj) {
        StoryHighlightCollection storyHighlightCollection;
        StoryHighlightInfo storyHighlightInfo;
        StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl = (StoryHighlightsImmersiveActionServiceImpl) awS3S3400000_2.l3;
        String str = awS3S3400000_2.s0;
        String str2 = awS3S3400000_2.s1;
        String str3 = awS3S3400000_2.s2;
        storyHighlightsImmersiveActionServiceImpl.getClass();
        C06US.LIZ.getClass();
        C06US.LIZ(str, str2, str3, "add_stories");
        Aweme awemeLJJII = C1618440sDa.LIZIZ.LJJIIJ().LJJII((Fragment) awS3S3400000_2.l4, (Aweme) awS3S3400000_2.l5);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS3S3400000_2.l6, "//story/highlights_creation");
        String aid = null;
        if (awemeLJJII != null && (storyHighlightInfo = awemeLJJII.storyHighlightInfo) != null) {
            storyHighlightCollection = storyHighlightInfo.containerCollectionInfo;
        } else {
            storyHighlightCollection = null;
        }
        smartRouteBuildRoute.withParam("collection", storyHighlightCollection);
        smartRouteBuildRoute.withParam("enter_method", "add_stories");
        Aweme aweme = (Aweme) awS3S3400000_2.l5;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        smartRouteBuildRoute.withParam("resume_aweme_id", aid);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S3400000_2 awS3S3400000_2, Object obj) {
        StoryHighlightCollection storyHighlightCollection;
        StoryHighlightInfo storyHighlightInfo;
        StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl = (StoryHighlightsImmersiveActionServiceImpl) awS3S3400000_2.l3;
        String str = awS3S3400000_2.s0;
        String str2 = awS3S3400000_2.s1;
        String str3 = awS3S3400000_2.s2;
        storyHighlightsImmersiveActionServiceImpl.getClass();
        C06US.LIZ.getClass();
        C06US.LIZ(str, str2, str3, "edit");
        Aweme awemeLJJII = C1618440sDa.LIZIZ.LJJIIJ().LJJII((Fragment) awS3S3400000_2.l4, (Aweme) awS3S3400000_2.l5);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS3S3400000_2.l6, "//story/highlights_creation");
        String aid = null;
        if (awemeLJJII != null && (storyHighlightInfo = awemeLJJII.storyHighlightInfo) != null) {
            storyHighlightCollection = storyHighlightInfo.containerCollectionInfo;
        } else {
            storyHighlightCollection = null;
        }
        smartRouteBuildRoute.withParam("collection", storyHighlightCollection);
        smartRouteBuildRoute.withParam("enter_method", "edit_button");
        Aweme aweme = (Aweme) awS3S3400000_2.l5;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        smartRouteBuildRoute.withParam("resume_aweme_id", aid);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS3S3400000_2 awS3S3400000_2, Object obj) {
        StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl = (StoryHighlightsImmersiveActionServiceImpl) awS3S3400000_2.l3;
        String str = awS3S3400000_2.s0;
        String str2 = awS3S3400000_2.s1;
        String str3 = awS3S3400000_2.s2;
        storyHighlightsImmersiveActionServiceImpl.getClass();
        C06US.LIZ.getClass();
        C06US.LIZ(str, str2, str3, "delete");
        IStoryHighlightsDeleteDialogService iStoryHighlightsDeleteDialogService = (IStoryHighlightsDeleteDialogService) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsDeleteDialogService.class, false, false, false, 14, null);
        if (iStoryHighlightsDeleteDialogService != null) {
            iStoryHighlightsDeleteDialogService.LIZJ((Context) awS3S3400000_2.l4, true, new AwS72S1300000_2((StoryHighlightsImmersiveActionServiceImpl) awS3S3400000_2.l3, (StoryHighlightsImmersiveActionServiceImpl) awS3S3400000_2.s2, (String) awS3S3400000_2.l5, (Fragment) awS3S3400000_2.l6, (Function0<Unit>) 5));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S3400000_2(StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl, StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl2, String str, String str2, String str3, Context context, Fragment fragment, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l3 = storyHighlightsImmersiveActionServiceImpl;
        this.s0 = storyHighlightsImmersiveActionServiceImpl2;
        this.s1 = str;
        this.s2 = str2;
        this.l4 = str3;
        this.l5 = context;
        this.l6 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S3400000_2(StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl, String str, String str2, String str3, Fragment fragment, Aweme aweme, Context context, int i) {
        super(1);
        this.$t = i;
        this.l3 = storyHighlightsImmersiveActionServiceImpl;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l4 = fragment;
        this.l5 = aweme;
        this.l6 = context;
    }
}
