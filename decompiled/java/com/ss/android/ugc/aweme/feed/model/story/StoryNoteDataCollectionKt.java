package com.ss.android.ugc.aweme.feed.model.story;

import X.C0VSJ;
import android.net.Uri;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collections;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class StoryNoteDataCollectionKt {
    public static final boolean isEmpty(StoryNoteDataCollection storyNoteDataCollection) {
        String str;
        boolean z = false;
        if (storyNoteDataCollection != null && (str = storyNoteDataCollection.text) != null && (!a0.LJJJIL(str))) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052 A[PHI: r3 r4 r5 r6 r7 r8 r9 r10
      0x0052: PHI (r3v11 java.lang.String) = (r3v5 java.lang.String), (r3v12 java.lang.String) binds: [B:61:0x0086, B:29:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r4v11 java.lang.String) = (r4v5 java.lang.String), (r4v12 java.lang.String) binds: [B:61:0x0086, B:29:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r5v11 java.lang.String) = (r5v5 java.lang.String), (r5v12 java.lang.String) binds: [B:61:0x0086, B:29:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r6v10 com.ss.android.ugc.aweme.base.model.UrlModel) = (r6v4 com.ss.android.ugc.aweme.base.model.UrlModel), (r6v11 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:61:0x0086, B:29:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r7v9 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>) = 
      (r7v3 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v10 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
     binds: [B:61:0x0086, B:29:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r8v8 java.lang.Integer) = (r8v2 java.lang.Integer), (r8v9 java.lang.Integer) binds: [B:61:0x0086, B:29:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r9v7 java.lang.Integer) = (r9v1 java.lang.Integer), (r9v8 java.lang.Integer) binds: [B:61:0x0086, B:29:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r10v6 java.util.List<java.lang.String>) = (r10v0 java.util.List<java.lang.String>), (r10v7 java.util.List<java.lang.String>) binds: [B:61:0x0086, B:29:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066 A[PHI: r3 r4 r5 r6 r7 r8 r9 r10 r11 r12
      0x0066: PHI (r3v9 java.lang.String) = (r3v7 java.lang.String), (r3v10 java.lang.String) binds: [B:67:0x008e, B:39:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r4v9 java.lang.String) = (r4v7 java.lang.String), (r4v10 java.lang.String) binds: [B:67:0x008e, B:39:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r5v9 java.lang.String) = (r5v7 java.lang.String), (r5v10 java.lang.String) binds: [B:67:0x008e, B:39:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r6v8 com.ss.android.ugc.aweme.base.model.UrlModel) = (r6v6 com.ss.android.ugc.aweme.base.model.UrlModel), (r6v9 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:67:0x008e, B:39:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r7v7 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>) = 
      (r7v5 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v8 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
     binds: [B:67:0x008e, B:39:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r8v6 java.lang.Integer) = (r8v4 java.lang.Integer), (r8v7 java.lang.Integer) binds: [B:67:0x008e, B:39:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r9v5 java.lang.Integer) = (r9v3 java.lang.Integer), (r9v6 java.lang.Integer) binds: [B:67:0x008e, B:39:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r10v4 java.util.List<java.lang.String>) = (r10v2 java.util.List<java.lang.String>), (r10v5 java.util.List<java.lang.String>) binds: [B:67:0x008e, B:39:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r11v3 java.util.List<java.lang.String>) = (r11v1 java.util.List<java.lang.String>), (r11v4 java.util.List<java.lang.String>) binds: [B:67:0x008e, B:39:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r12v2 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:67:0x008e, B:39:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079 A[PHI: r3 r4 r5 r6
      0x0079: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v15 java.lang.String) binds: [B:49:0x0076, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v15 java.lang.String) binds: [B:49:0x0076, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v15 java.lang.String) binds: [B:49:0x0076, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r6v1 com.ss.android.ugc.aweme.base.model.UrlModel) = (r6v0 com.ss.android.ugc.aweme.base.model.UrlModel), (r6v14 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:49:0x0076, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007d A[PHI: r3 r4 r5 r6 r7
      0x007d: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v14 java.lang.String) binds: [B:52:0x007a, B:18:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v14 java.lang.String) binds: [B:52:0x007a, B:18:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v14 java.lang.String) binds: [B:52:0x007a, B:18:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r6v2 com.ss.android.ugc.aweme.base.model.UrlModel) = (r6v1 com.ss.android.ugc.aweme.base.model.UrlModel), (r6v13 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:52:0x007a, B:18:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r7v1 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>) = 
      (r7v0 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v12 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
     binds: [B:52:0x007a, B:18:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0081 A[PHI: r3 r4 r5 r6 r7 r8
      0x0081: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v13 java.lang.String), (r3v13 java.lang.String) binds: [B:55:0x007e, B:21:0x0040, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v13 java.lang.String), (r4v13 java.lang.String) binds: [B:55:0x007e, B:21:0x0040, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v13 java.lang.String), (r5v13 java.lang.String) binds: [B:55:0x007e, B:21:0x0040, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r6v3 com.ss.android.ugc.aweme.base.model.UrlModel) = 
      (r6v2 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r6v12 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r6v12 com.ss.android.ugc.aweme.base.model.UrlModel)
     binds: [B:55:0x007e, B:21:0x0040, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r7v2 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>) = 
      (r7v1 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v11 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v11 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
     binds: [B:55:0x007e, B:21:0x0040, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r8v1 java.lang.Integer) = (r8v0 java.lang.Integer), (r8v10 java.lang.Integer), (r8v10 java.lang.Integer) binds: [B:55:0x007e, B:21:0x0040, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0085 A[PHI: r3 r4 r5 r6 r7 r8 r9
      0x0085: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v12 java.lang.String), (r3v12 java.lang.String) binds: [B:58:0x0082, B:26:0x004a, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v12 java.lang.String), (r4v12 java.lang.String) binds: [B:58:0x0082, B:26:0x004a, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v12 java.lang.String), (r5v12 java.lang.String) binds: [B:58:0x0082, B:26:0x004a, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r6v4 com.ss.android.ugc.aweme.base.model.UrlModel) = 
      (r6v3 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r6v11 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r6v11 com.ss.android.ugc.aweme.base.model.UrlModel)
     binds: [B:58:0x0082, B:26:0x004a, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r7v3 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>) = 
      (r7v2 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v10 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v10 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
     binds: [B:58:0x0082, B:26:0x004a, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r8v2 java.lang.Integer) = (r8v1 java.lang.Integer), (r8v9 java.lang.Integer), (r8v9 java.lang.Integer) binds: [B:58:0x0082, B:26:0x004a, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r9v1 java.lang.Integer) = (r9v0 java.lang.Integer), (r9v8 java.lang.Integer), (r9v8 java.lang.Integer) binds: [B:58:0x0082, B:26:0x004a, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089 A[PHI: r3 r4 r5 r6 r7 r8 r9 r10
      0x0089: PHI (r3v6 java.lang.String) = (r3v5 java.lang.String), (r3v11 java.lang.String), (r3v11 java.lang.String) binds: [B:61:0x0086, B:31:0x0054, B:33:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r4v6 java.lang.String) = (r4v5 java.lang.String), (r4v11 java.lang.String), (r4v11 java.lang.String) binds: [B:61:0x0086, B:31:0x0054, B:33:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v11 java.lang.String), (r5v11 java.lang.String) binds: [B:61:0x0086, B:31:0x0054, B:33:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r6v5 com.ss.android.ugc.aweme.base.model.UrlModel) = 
      (r6v4 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r6v10 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r6v10 com.ss.android.ugc.aweme.base.model.UrlModel)
     binds: [B:61:0x0086, B:31:0x0054, B:33:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r7v4 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>) = 
      (r7v3 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v9 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v9 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
     binds: [B:61:0x0086, B:31:0x0054, B:33:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r8v3 java.lang.Integer) = (r8v2 java.lang.Integer), (r8v8 java.lang.Integer), (r8v8 java.lang.Integer) binds: [B:61:0x0086, B:31:0x0054, B:33:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r9v2 java.lang.Integer) = (r9v1 java.lang.Integer), (r9v7 java.lang.Integer), (r9v7 java.lang.Integer) binds: [B:61:0x0086, B:31:0x0054, B:33:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r10v1 java.util.List<java.lang.String>) = 
      (r10v0 java.util.List<java.lang.String>)
      (r10v6 java.util.List<java.lang.String>)
      (r10v6 java.util.List<java.lang.String>)
     binds: [B:61:0x0086, B:31:0x0054, B:33:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008d A[PHI: r3 r4 r5 r6 r7 r8 r9 r10 r11
      0x008d: PHI (r3v7 java.lang.String) = (r3v6 java.lang.String), (r3v10 java.lang.String), (r3v10 java.lang.String) binds: [B:64:0x008a, B:36:0x005e, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r4v7 java.lang.String) = (r4v6 java.lang.String), (r4v10 java.lang.String), (r4v10 java.lang.String) binds: [B:64:0x008a, B:36:0x005e, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r5v7 java.lang.String) = (r5v6 java.lang.String), (r5v10 java.lang.String), (r5v10 java.lang.String) binds: [B:64:0x008a, B:36:0x005e, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r6v6 com.ss.android.ugc.aweme.base.model.UrlModel) = 
      (r6v5 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r6v9 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r6v9 com.ss.android.ugc.aweme.base.model.UrlModel)
     binds: [B:64:0x008a, B:36:0x005e, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r7v5 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>) = 
      (r7v4 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v8 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
      (r7v8 java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo>)
     binds: [B:64:0x008a, B:36:0x005e, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r8v4 java.lang.Integer) = (r8v3 java.lang.Integer), (r8v7 java.lang.Integer), (r8v7 java.lang.Integer) binds: [B:64:0x008a, B:36:0x005e, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r9v3 java.lang.Integer) = (r9v2 java.lang.Integer), (r9v6 java.lang.Integer), (r9v6 java.lang.Integer) binds: [B:64:0x008a, B:36:0x005e, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r10v2 java.util.List<java.lang.String>) = 
      (r10v1 java.util.List<java.lang.String>)
      (r10v5 java.util.List<java.lang.String>)
      (r10v5 java.util.List<java.lang.String>)
     binds: [B:64:0x008a, B:36:0x005e, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r11v1 java.util.List<java.lang.String>) = 
      (r11v0 java.util.List<java.lang.String>)
      (r11v4 java.util.List<java.lang.String>)
      (r11v4 java.util.List<java.lang.String>)
     binds: [B:64:0x008a, B:36:0x005e, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection toStoryNoteDataCollection(com.ss.android.ugc.aweme.feed.model.Aweme r14) {
        /*
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r2 = new com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection
            r13 = 0
            if (r14 == 0) goto L70
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo r0 = r14.storyNoteInfo
            if (r0 == 0) goto L70
            java.lang.String r3 = r0.text
        Lb:
            java.lang.String r4 = r14.getAid()
            java.lang.String r5 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r14)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r14.getPhotoModeImageInfo()
            if (r0 == 0) goto L75
            java.util.List r1 = r0.getImageList()
            if (r1 == 0) goto L75
            r0 = 0
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r0 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel) r0
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r0.dynamicImage
        L2a:
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo r0 = r14.storyNoteInfo
            if (r0 == 0) goto L79
            java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo> r7 = r0.richText
        L30:
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r14)
            if (r0 == 0) goto L7d
            int r0 = r0.getPrivateStatus()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L3e:
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo r0 = r14.storyNoteInfo
            if (r0 == 0) goto L81
            com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtInfo r0 = r0.avatarInfo
            if (r0 == 0) goto L81
            java.lang.Integer r9 = r0.avatarType
        L48:
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo r0 = r14.storyNoteInfo
            if (r0 == 0) goto L85
            com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtInfo r0 = r0.avatarInfo
            if (r0 == 0) goto L85
            java.util.List<java.lang.String> r10 = r0.avatarPrimaryUrlList
        L52:
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo r0 = r14.storyNoteInfo
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtInfo r0 = r0.avatarInfo
            if (r0 == 0) goto L89
            java.util.List<java.lang.String> r11 = r0.avatarSecondaryUrlList
        L5c:
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo r0 = r14.storyNoteInfo
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.feed.model.story.BackgroundModel r0 = r0.backGroundInfo
            if (r0 == 0) goto L8d
            java.lang.String r12 = r0.backgroundGeckoId
        L66:
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo r0 = r14.storyNoteInfo
            if (r0 == 0) goto L6c
            java.util.List<com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra> r13 = r0.textExtras
        L6c:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r2
        L70:
            r3 = r13
            if (r14 != 0) goto Lb
            r4 = r13
            r5 = r13
        L75:
            r6 = r13
            if (r14 == 0) goto L79
            goto L2a
        L79:
            r7 = r13
            if (r14 == 0) goto L7d
            goto L30
        L7d:
            r8 = r13
            if (r14 == 0) goto L81
            goto L3e
        L81:
            r9 = r13
            if (r14 == 0) goto L85
            goto L48
        L85:
            r10 = r13
            if (r14 == 0) goto L89
            goto L52
        L89:
            r11 = r13
            if (r14 == 0) goto L8d
            goto L5c
        L8d:
            r12 = r13
            if (r14 == 0) goto L6c
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollectionKt.toStoryNoteDataCollection(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection");
    }

    public static final UrlModel toUrlModel(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.isAbsolute() && c0vsj.exists()) {
            String string = Uri.fromFile(c0vsj).toString();
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(string);
            urlModel.setUrlList(Collections.singletonList(string));
            return urlModel;
        }
        UrlModel urlModel2 = new UrlModel();
        urlModel2.setUri(str);
        urlModel2.setUrlList(Collections.singletonList(str));
        return urlModel2;
    }

    public static final StoryNoteDataCollection createLocalStoryThoughtData(String str, String str2, String str3, String str4, List<RichTextInfo> list, Integer num, Integer num2, List<String> list2, List<String> list3, String str5, List<StoryNoteTextExtra> list4) {
        return new StoryNoteDataCollection(str2, str, str3, toUrlModel(str4), list, num, num2, list2, list3, str5, list4);
    }
}
