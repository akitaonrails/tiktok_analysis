package com.ss.android.ugc.aweme.story.highlights.service;

import X.C054G;
import X.C06US;
import X.C0PEM;
import X.C1247530iZL;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C1409405fQ;
import X.C1440005kM;
import X.C2296808zG;
import X.C453940Hr6;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS3S3400000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsImmersiveActionServiceImpl implements IStoryHighlightsImmersiveActionService {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ);

    public static void LIZIZ(Fragment fragment) {
        if (fragment != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LJIIIZ(2131829440);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsImmersiveActionService
    public final void LIZ(Aweme aweme, Context context, Fragment fragment, Integer num, String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        String str3;
        FragmentManager childFragmentManager;
        StoryHighlightCollection storyHighlightCollection;
        StoryHighlightInfo storyHighlightInfo;
        StoryHighlightCollection storyHighlightCollection2;
        String str4 = null;
        if (aweme != null && (storyHighlightInfo = aweme.storyHighlightInfo) != null && (storyHighlightCollection2 = storyHighlightInfo.containerCollectionInfo) != null) {
            str3 = storyHighlightCollection2.collectionId;
        } else {
            str3 = null;
            if (aweme != null) {
            }
            C1390850mIV c1390850mIV = new C1390850mIV();
            C1247530iZL c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZJ(R.raw.icon_plus);
            c1247530iZL.LIZIZ(2131848982);
            c1247530iZL.LIZ(new AwS3S3400000_2(this, str, str2, str3, fragment, aweme, context, 0));
            C1247530iZL c1247530iZL2 = new C1247530iZL();
            c1247530iZL2.LIZJ(R.raw.icon_pen);
            c1247530iZL2.LIZIZ(2131848960);
            c1247530iZL2.LIZ(new AwS3S3400000_2(this, str, str2, str3, fragment, aweme, context, 1));
            C1247530iZL c1247530iZL3 = new C1247530iZL();
            c1247530iZL3.LIZJ(R.raw.icon_arrow_to_left);
            c1247530iZL3.LIZIZ(2131848961);
            String str5 = str3;
            c1247530iZL3.LIZ(new C1409405fQ(this, str, str2, str3, num, context, fragment, function0, aweme, function1, str4));
            C1247530iZL c1247530iZL4 = new C1247530iZL();
            c1247530iZL4.LIZJ = 1;
            c1247530iZL4.LIZJ(R.raw.icon_trash_bin);
            c1247530iZL4.LIZIZ(2131848959);
            c1247530iZL4.LIZ(new AwS3S3400000_2(this, (StoryHighlightsImmersiveActionServiceImpl) str, str2, str5, (String) context, (Context) fragment, (Fragment) function0, (Function0<Unit>) 2));
            c1390850mIV.LIZ(c1247530iZL, c1247530iZL2, c1247530iZL3, c1247530iZL4);
            c1390850mIV.LIZ.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0630
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C1440005kM.LIZ(new C453940Hr6(false, false, 6));
                }
            };
            TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
            if (fragment == null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
                tuxActionSheetLIZJ.show(childFragmentManager, "StoryHighlightsImmersiveMenu");
                C06US.LIZ.getClass();
                C06US.LIZIZ(str, str2, str5);
                C1440005kM.LIZ(new C453940Hr6(true, false, 6));
                return;
            }
        }
        StoryHighlightInfo storyHighlightInfo2 = aweme.storyHighlightInfo;
        if (storyHighlightInfo2 != null && (storyHighlightCollection = storyHighlightInfo2.containerCollectionInfo) != null) {
            str4 = storyHighlightCollection.title;
        }
        C1390850mIV c1390850mIV2 = new C1390850mIV();
        C1247530iZL c1247530iZL5 = new C1247530iZL();
        c1247530iZL5.LIZJ(R.raw.icon_plus);
        c1247530iZL5.LIZIZ(2131848982);
        c1247530iZL5.LIZ(new AwS3S3400000_2(this, str, str2, str3, fragment, aweme, context, 0));
        C1247530iZL c1247530iZL22 = new C1247530iZL();
        c1247530iZL22.LIZJ(R.raw.icon_pen);
        c1247530iZL22.LIZIZ(2131848960);
        c1247530iZL22.LIZ(new AwS3S3400000_2(this, str, str2, str3, fragment, aweme, context, 1));
        C1247530iZL c1247530iZL32 = new C1247530iZL();
        c1247530iZL32.LIZJ(R.raw.icon_arrow_to_left);
        c1247530iZL32.LIZIZ(2131848961);
        String str52 = str3;
        c1247530iZL32.LIZ(new C1409405fQ(this, str, str2, str3, num, context, fragment, function0, aweme, function1, str4));
        C1247530iZL c1247530iZL42 = new C1247530iZL();
        c1247530iZL42.LIZJ = 1;
        c1247530iZL42.LIZJ(R.raw.icon_trash_bin);
        c1247530iZL42.LIZIZ(2131848959);
        c1247530iZL42.LIZ(new AwS3S3400000_2(this, (StoryHighlightsImmersiveActionServiceImpl) str, str2, str52, (String) context, (Context) fragment, (Fragment) function0, (Function0<Unit>) 2));
        c1390850mIV2.LIZ(c1247530iZL5, c1247530iZL22, c1247530iZL32, c1247530iZL42);
        c1390850mIV2.LIZ.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0630
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C1440005kM.LIZ(new C453940Hr6(false, false, 6));
            }
        };
        TuxActionSheet tuxActionSheetLIZJ2 = c1390850mIV2.LIZJ();
        if (fragment == null) {
        }
    }
}
