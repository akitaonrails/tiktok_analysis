package com.ss.android.ugc.aweme.story.highlights.feed;

import X.C05N9;
import X.C316620Cb6;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseProfileStoryHighlightsFeedSharedVM extends BaseStoryHighlightsFeedSharedVM {
    public final void FQ2(Context context, String str, List<StoryHighlightCollection> list, String str2, User user, String str3, Function1<? super String, ? extends Aweme> function1) {
        long jIntValue;
        long jIntValue2;
        ArrayList arrayList = new ArrayList();
        for (StoryHighlightCollection storyHighlightCollection : list) {
            Aweme awemeInvoke = function1.invoke(storyHighlightCollection.collectionId);
            if (awemeInvoke != null) {
                awemeInvoke.setAuthor(user);
                UserStory userStory = awemeInvoke.getUserStory();
                if (userStory != null) {
                    userStory.setFakeAwemeShell(true);
                }
            } else {
                awemeInvoke = new Aweme();
                awemeInvoke.setAid(storyHighlightCollection.collectionId);
                awemeInvoke.setAwemeType(40);
                awemeInvoke.setAuthor(user);
                ArrayList arrayList2 = new ArrayList();
                Integer num = storyHighlightCollection.count;
                if (num != null) {
                    jIntValue = num.intValue();
                } else {
                    jIntValue = 0;
                }
                Integer num2 = storyHighlightCollection.count;
                if (num2 != null) {
                    jIntValue2 = num2.intValue();
                } else {
                    jIntValue2 = 0;
                }
                awemeInvoke.setUserStory(new UserStory(arrayList2, jIntValue, 0L, false, 0L, 0L, true, false, 0L, false, null, null, false, null, jIntValue2, new UserStoryCurrentInfo(null, null, 0), false, true, new UserStoryCurrentInfo(-1, null, 0), (int) 0, false, 0L, null, false));
                awemeInvoke.storyHighlightInfo = new StoryHighlightInfo(null, storyHighlightCollection, null, false, false);
            }
            arrayList.add(awemeInvoke);
        }
        if (((Boolean) C05N9.LIZ.getValue()).booleanValue()) {
            C316620Cb6 c316620Cb6 = C316620Cb6.LIZ;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (Intrinsics.LJFF(((Aweme) obj).getAid(), str2)) {
                    arrayList3.add(obj);
                }
            }
            c316620Cb6.getClass();
            C316620Cb6.LIZ(arrayList3);
        }
        BQ2(context, str, arrayList, str2, null, str3, "", null);
    }
}
