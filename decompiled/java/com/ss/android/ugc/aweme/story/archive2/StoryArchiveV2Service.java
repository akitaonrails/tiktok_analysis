package com.ss.android.ugc.aweme.story.archive2;

import X.C2189821An6;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.story.archive2.calendar.StoryArchiveV2CalendarViewModel;
import com.ss.android.ugc.aweme.story.archive2.feed.BaseStoryArchiveV2FeedSharedViewModel;
import com.ss.android.ugc.aweme.story.archive2.list.StoryArchiveV2ListViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchiveV2Service implements IStoryArchiveV2Service {
    @Override // com.ss.android.ugc.aweme.story.archive2.IStoryArchiveV2Service
    public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
        Object obj;
        String str = c2189821An6.getExtra().get("story_archive_v2_page_key");
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1692306758) {
            if (iHashCode != 413618010) {
                if (iHashCode == 1588363901 && str.equals("story_archive_v2_thought")) {
                    obj = StoryArchiveV2ListViewModel.class;
                    return new Pair<>(str, obj);
                }
                return null;
            }
            if (str.equals("story_archive_v2_calendar")) {
                obj = StoryArchiveV2CalendarViewModel.class;
                return new Pair<>(str, obj);
            }
            return null;
        }
        if (str.equals("story_archive_v2_list")) {
            obj = StoryArchiveV2ListViewModel.class;
            return new Pair<>(str, obj);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.archive2.IStoryArchiveV2Service
    public final boolean LIZJ(C2189821An6 c2189821An6) {
        return Intrinsics.LJFF(c2189821An6.getExtra().get("story_archive_v2_page_key"), "story_archive_v2_thought");
    }

    @Override // com.ss.android.ugc.aweme.story.archive2.IStoryArchiveV2Service
    public final BaseStoryArchiveV2FeedSharedViewModel<?, ?> LIZIZ(LifecycleOwner lifecycleOwner, C2189821An6 c2189821An6) {
        String str = c2189821An6.getExtra().get("story_archive_v2_page_key");
        if (str == null) {
            return null;
        }
        return LIZLLL(str, lifecycleOwner);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0001, B:9:0x0014, B:22:0x0066, B:24:0x0089, B:25:0x008b, B:26:0x009a, B:12:0x001d, B:14:0x0025, B:16:0x0048, B:17:0x004a, B:19:0x005c), top: B:35:0x0001 }] */
    @Override // com.ss.android.ugc.aweme.story.archive2.IStoryArchiveV2Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.story.archive2.feed.BaseStoryArchiveV2FeedSharedViewModel LIZLLL(java.lang.String r13, androidx.lifecycle.LifecycleOwner r14) {
        /*
            r12 = this;
            r0 = 0
            int r2 = r13.hashCode()     // Catch: java.lang.Throwable -> La0
            r1 = -1692306758(0xffffffff9b2172ba, float:-1.3354678E-22)
            if (r2 == r1) goto L5c
            r1 = 413618010(0x18a74f5a, float:4.3248613E-24)
            if (r2 == r1) goto L1d
            r1 = 1588363901(0x5eac827d, float:6.2153177E18)
            if (r2 != r1) goto L64
            java.lang.String r1 = "story_archive_v2_thought"
            boolean r1 = r13.equals(r1)     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto L66
            goto L64
        L1d:
            java.lang.String r1 = "story_archive_v2_calendar"
            boolean r1 = r13.equals(r1)     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L64
            java.lang.Class<com.ss.android.ugc.aweme.story.archive2.calendar.StoryArchiveV2CalendarViewModel> r1 = com.ss.android.ugc.aweme.story.archive2.calendar.StoryArchiveV2CalendarViewModel.class
            X.12Dl r3 = X.C13LE.LIZ(r1)     // Catch: java.lang.Throwable -> La0
            kotlin.jvm.internal.AwS102S1000000_18 r4 = new kotlin.jvm.internal.AwS102S1000000_18     // Catch: java.lang.Throwable -> La0
            r1 = 19
            r4.<init>(r13, r1)     // Catch: java.lang.Throwable -> La0
            r1 = 850(0x352, float:1.191E-42)
            kotlin.jvm.internal.AFwS256S0000000_18 r8 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r1)     // Catch: java.lang.Throwable -> La0
            r9 = 0
            X.0SvV r2 = new X.0SvV     // Catch: java.lang.Throwable -> La0
            X.0Ho5 r5 = new X.0Ho5     // Catch: java.lang.Throwable -> La0
            r5.<init>()     // Catch: java.lang.Throwable -> La0
            X.06Wu r6 = X.C724750Sbp.LJII(r14)     // Catch: java.lang.Throwable -> La0
            boolean r1 = r14 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L5a
            androidx.lifecycle.HasDefaultViewModelProviderFactory r14 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r14     // Catch: java.lang.Throwable -> La0
        L4a:
            kotlin.jvm.functions.Function0 r7 = X.C1220000hqw.LIZ(r14)     // Catch: java.lang.Throwable -> La0
            r10 = r9
            r11 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La0
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = r2.getValue()     // Catch: java.lang.Throwable -> La0
            com.ss.android.ugc.aweme.story.archive2.feed.StoryArchiveV2FeedSharedViewModel r2 = (com.ss.android.ugc.aweme.story.archive2.feed.StoryArchiveV2FeedSharedViewModel) r2     // Catch: java.lang.Throwable -> La0
            goto L9a
        L5a:
            r14 = r0
            goto L4a
        L5c:
            java.lang.String r1 = "story_archive_v2_list"
            boolean r1 = r13.equals(r1)     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto L66
        L64:
            r2 = r0
            goto L9a
        L66:
            java.lang.Class<com.ss.android.ugc.aweme.story.archive2.list.StoryArchiveV2ListViewModel> r1 = com.ss.android.ugc.aweme.story.archive2.list.StoryArchiveV2ListViewModel.class
            X.12Dl r3 = X.C13LE.LIZ(r1)     // Catch: java.lang.Throwable -> La0
            kotlin.jvm.internal.AwS102S1000000_18 r4 = new kotlin.jvm.internal.AwS102S1000000_18     // Catch: java.lang.Throwable -> La0
            r1 = 18
            r4.<init>(r13, r1)     // Catch: java.lang.Throwable -> La0
            r1 = 849(0x351, float:1.19E-42)
            kotlin.jvm.internal.AFwS256S0000000_18 r8 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r1)     // Catch: java.lang.Throwable -> La0
            r9 = 0
            X.0SvV r2 = new X.0SvV     // Catch: java.lang.Throwable -> La0
            X.0Ho5 r5 = new X.0Ho5     // Catch: java.lang.Throwable -> La0
            r5.<init>()     // Catch: java.lang.Throwable -> La0
            X.06Wu r6 = X.C724750Sbp.LJII(r14)     // Catch: java.lang.Throwable -> La0
            boolean r1 = r14 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L9e
            androidx.lifecycle.HasDefaultViewModelProviderFactory r14 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r14     // Catch: java.lang.Throwable -> La0
        L8b:
            kotlin.jvm.functions.Function0 r7 = X.C1220000hqw.LIZ(r14)     // Catch: java.lang.Throwable -> La0
            r10 = r9
            r11 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La0
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = r2.getValue()     // Catch: java.lang.Throwable -> La0
            com.ss.android.ugc.aweme.story.archive2.feed.StoryArchiveV2FeedSharedViewModel r2 = (com.ss.android.ugc.aweme.story.archive2.feed.StoryArchiveV2FeedSharedViewModel) r2     // Catch: java.lang.Throwable -> La0
        L9a:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> La0
            goto Lac
        L9e:
            r14 = r0
            goto L8b
        La0:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r1)
            X.C189200o6.m2constructorimpl(r2)
        Lac:
            boolean r1 = X.C189200o6.m7isFailureimpl(r2)
            if (r1 != 0) goto Lb3
            r0 = r2
        Lb3:
            com.ss.android.ugc.aweme.story.archive2.feed.BaseStoryArchiveV2FeedSharedViewModel r0 = (com.ss.android.ugc.aweme.story.archive2.feed.BaseStoryArchiveV2FeedSharedViewModel) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2Service.LIZLLL(java.lang.String, androidx.lifecycle.LifecycleOwner):com.ss.android.ugc.aweme.story.archive2.feed.BaseStoryArchiveV2FeedSharedViewModel");
    }
}
