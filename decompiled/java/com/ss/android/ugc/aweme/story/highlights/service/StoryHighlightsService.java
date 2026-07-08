package com.ss.android.ugc.aweme.story.highlights.service;

import X.C2189821An6;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.highlights.feed.AddToStoryToastHighlightsFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.feed.InboxSkylightHighlightsCellFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.feed.MyProfileStoryHighlightsFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.feed.OtherProfileStoryHighlightsFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.feed.ShareHighlightCollectionFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.feed.ShareHighlightFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.feed.SkylightStoryHighlightsFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsService implements IStoryHighlightsService {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService
    public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
        Object obj;
        String str = c2189821An6.getExtra().get("story_highlights_page_key");
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1849961962:
                if (str.equals("my_profile")) {
                    obj = MyProfileStoryHighlightsFeedSharedVM.class;
                }
                break;
            case -1694530411:
                if (str.equals("skylight")) {
                    obj = SkylightStoryHighlightsFeedSharedVM.class;
                }
                break;
            case 224466694:
                if (str.equals("page_key_add_to_highlight_toast")) {
                    obj = AddToStoryToastHighlightsFeedSharedVM.class;
                }
                break;
            case 293534484:
                if (str.equals("page_key_share_story_in_highlight")) {
                    obj = ShareHighlightFeedSharedVM.class;
                }
                break;
            case 838987001:
                if (str.equals("page_key_share_highlight_collection")) {
                    obj = ShareHighlightCollectionFeedSharedVM.class;
                }
                break;
            case 1170775930:
                if (str.equals("other_profile")) {
                    obj = OtherProfileStoryHighlightsFeedSharedVM.class;
                }
                break;
            case 1404731365:
                if (str.equals("inbox_skylight_feed_anchor")) {
                    obj = InboxSkylightHighlightsCellFeedSharedVM.class;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a1  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.story.highlights.feed.BaseStoryHighlightsFeedSharedVM LIZIZ(com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent r13, X.C2189821An6 r14) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsService.LIZIZ(com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent, X.1An6):com.ss.android.ugc.aweme.story.highlights.feed.BaseStoryHighlightsFeedSharedVM");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCollectionCacheResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C06TX
            if (r0 == 0) goto L7c
            r3 = r7
            X.06TX r3 = (X.C06TX) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L6e
            if (r0 != r1) goto L83
            X.C155000ia.LIZIZ(r4)
        L22:
            r1 = r4
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCollectionCacheResponse r1 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCollectionCacheResponse) r1
            X.01GW r0 = X.C06WU.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L82
            java.util.List r0 = r1.getAwemes()
            java.util.Iterator r3 = r0.iterator()
        L3b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.feed.model.story.UserStory r0 = r0.getUserStory()
            if (r0 == 0) goto L3b
            java.util.List r0 = r0.getStories()
            if (r0 == 0) goto L3b
            java.util.Iterator r2 = r0.iterator()
        L57:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.feed.model.story.Story r1 = r0.getStory()
            if (r1 == 0) goto L57
            r0 = 0
            r1.setViewed(r0)
            goto L57
        L6e:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ
            r3.LLILLL = r1
            java.lang.Object r4 = r0.highlightCollectionCache(r6, r3)
            if (r4 != r2) goto L22
            return r2
        L7c:
            X.06TX r3 = new X.06TX
            r3.<init>(r5, r7)
            goto L12
        L82:
            return r4
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsService.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService
    public final Object highlightAwemeDetail(String str, String str2, Integer num, InterfaceC1364105Vn<? super StoryHighlightsAwemeDetailResponse> interfaceC1364105Vn) {
        return StoryApi.LIZIZ.highlightAwemeDetail(str, str2, num, interfaceC1364105Vn);
    }
}
