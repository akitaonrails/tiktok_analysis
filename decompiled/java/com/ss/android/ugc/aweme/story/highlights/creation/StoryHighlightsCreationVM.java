package com.ss.android.ugc.aweme.story.highlights.creation;

import X.AbstractC23140094w;
import X.C06US;
import X.C09IR;
import X.C0LAB;
import X.C0PEM;
import X.C13LP;
import X.C1674360tfm;
import X.C1674400tfq;
import X.C1674480tfy;
import X.C1674510tg1;
import X.C1674720tgM;
import X.C1BNE;
import X.C20684815ws;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C467601ru;
import Y.AComparatorS44S0000000_25;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class StoryHighlightsCreationVM extends ViewModel {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;
    public final C2252331DDr LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public StoryHighlightCollection LLJ;
    public String LLJI;
    public String LLJIJIL;
    public int LLJILJIL;
    public final C1674480tfy LLJILJILJ;

    public final boolean dl1() {
        return this.LLJ != null && Intrinsics.LJFF(this.LLJI, "edit_button");
    }

    public final boolean zQ2() {
        return this.LLJ != null && Intrinsics.LJFF(this.LLJI, "add_stories");
    }

    public StoryHighlightsCreationVM() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1674360tfm(null, null, 31));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(new C1674510tg1(null, null, null, null, null, null, 1023));
        this.LLILLL = c2252321DDqLIZ2;
        this.LLILZ = c2252321DDqLIZ2;
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(new C1674400tfq(0));
        this.LLILZIL = c2252321DDqLIZ3;
        this.LLILZLL = c2252321DDqLIZ3;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLIZ = c2252331DDrLIZIZ;
        this.LLIZLLLIL = c2252331DDrLIZIZ;
        this.LLJILJILJ = new C1674480tfy(this, c2252321DDqLIZ, c2252321DDqLIZ2, c2252321DDqLIZ3);
    }

    public static String wQ2(UrlModel urlModel) {
        if (urlModel == null) {
            return null;
        }
        String uri = urlModel.getUri();
        if (uri != null && uri.length() > 0) {
            return uri;
        }
        List<String> urlList = urlModel.getUrlList();
        if (urlList == null) {
            return null;
        }
        return (String) C13LP.LJJJLL(urlList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f1  */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM.AQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM.xQ2(X.05Vn):java.lang.Object");
    }

    public final void DQ2(String str, boolean z) {
        C06US c06us = C06US.LIZ;
        if (str == null) {
            StoryHighlightCollection storyHighlightCollection = this.LLJ;
            if (storyHighlightCollection != null) {
                str = storyHighlightCollection.collectionId;
            } else {
                str = null;
            }
        }
        String str2 = this.LLJI;
        if (str2 == null) {
            str2 = "";
        }
        c06us.getClass();
        C06US.LIZJ("personal_homepage", str, str2, z);
    }

    public final void FQ2(StoryHighlightAwemePreview storyHighlightAwemePreview, boolean z) {
        List listLJLIIIL;
        if (z) {
            if (((C1674360tfm) this.LL.getValue()).LIZIZ.size() >= 100) {
                this.LLIZ.LIZJ(C1674720tgM.LIZ);
                return;
            }
            listLJLIIIL = C13LP.LJLILLLLZI(storyHighlightAwemePreview, ((C1674360tfm) this.LL.getValue()).LIZIZ);
        } else {
            listLJLIIIL = C13LP.LJLIIIL(storyHighlightAwemePreview, ((C1674360tfm) this.LL.getValue()).LIZIZ);
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS44S0000000_25(1), C13LP.LLIIJI(listLJLIIIL));
        C2252321DDq c2252321DDq = this.LL;
        c2252321DDq.setValue(C1674360tfm.LIZ((C1674360tfm) c2252321DDq.getValue(), null, listLJLLLL, null, null, null, 29));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0144, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.LJFF(r10, r9)) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object IQ2(android.content.Context r25, X.InterfaceC1364105Vn<? super kotlin.Unit> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM.IQ2(android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(android.content.Context r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM.vQ2(android.content.Context, X.05Vn):java.lang.Object");
    }

    public final void zJ(String str, String str2) {
        boolean z;
        String str3;
        String str4;
        String str5;
        C06US c06us = C06US.LIZ;
        if (!dl1() && !zQ2()) {
            z = false;
        } else {
            z = true;
        }
        StoryHighlightCollection storyHighlightCollection = this.LLJ;
        if (storyHighlightCollection != null) {
            str3 = storyHighlightCollection.collectionId;
        } else {
            str3 = null;
        }
        if (zQ2()) {
            str4 = "add_stories_button";
        } else {
            str4 = this.LLJI;
            if (str4 == null) {
                str4 = "";
            }
        }
        c06us.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "personal_homepage");
        if (z) {
            str5 = "edit_panel";
        } else {
            str5 = "create_panel";
        }
        c0lab.LJ("panel_type", str5);
        c0lab.LJ("story_highlight_id", str3);
        c0lab.LJ("click_type", str);
        c0lab.LJ("enter_method", str4);
        if (str2 != null) {
            c0lab.LJ("cover_type", str2);
        }
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_panel_click", c0lab.LIZ);
    }

    public static Object CQ2(Context context, UrlModel urlModel, AbstractC23140094w abstractC23140094w) {
        return C23250099c.LJI(abstractC23140094w, C0PEM.LIZJ, new C467601ru(context, urlModel, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(android.content.Context r29, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r30, X.InterfaceC1364105Vn<? super kotlin.Unit> r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM.BQ2(android.content.Context, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(android.content.Context r9, android.net.Uri r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1674600tgA
            if (r0 == 0) goto L5a
            r7 = r11
            X.0tgA r7 = (X.C1674600tgA) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r6 = r7.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r7.LLILZIL
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L60
            X.0tfq r2 = r7.LLILLJJLI
            X.1DDq r3 = r7.LL
            X.C155000ia.LIZIZ(r6)
        L27:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            java.util.List<com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview> r1 = r2.LIZ
            X.0tfq r0 = new X.0tfq
            r0.<init>(r1, r4, r6)
            r3.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L36:
            X.C155000ia.LIZIZ(r6)
            if (r10 != 0) goto L3e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            X.1DDq r3 = r8.LLILZIL
            java.lang.Object r2 = r3.getValue()
            X.0tfq r2 = (X.C1674400tfq) r2
            r7.LL = r3
            r7.LLILLJJLI = r2
            r7.LLILZIL = r0
            X.1DFB r1 = X.C0PEM.LIZJ
            X.01rt r0 = new X.01rt
            r0.<init>(r9, r10, r4)
            java.lang.Object r6 = X.C23250099c.LJI(r7, r1, r0)
            if (r6 != r5) goto L27
            return r5
        L5a:
            X.0tgA r7 = new X.0tgA
            r7.<init>(r8, r11)
            goto L12
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM.EQ2(android.content.Context, android.net.Uri, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object GQ2(android.content.Context r8, com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1674590tg9
            if (r0 == 0) goto L53
            r6 = r10
            X.0tg9 r6 = (X.C1674590tg9) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r5 = r6.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L59
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview r9 = r6.LLILLL
            X.0tfq r1 = r6.LLILLJJLI
            X.1DDq r2 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L28:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.util.List<com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview> r1 = r1.LIZ
            X.0tfq r0 = new X.0tfq
            r0.<init>(r1, r9, r5)
            r2.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L37:
            X.C155000ia.LIZIZ(r5)
            X.1DDq r2 = r7.LLILZIL
            java.lang.Object r1 = r2.getValue()
            X.0tfq r1 = (X.C1674400tfq) r1
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r9.coverImgUrl
            r6.LL = r2
            r6.LLILLJJLI = r1
            r6.LLILLL = r9
            r6.LLILZLL = r3
            java.lang.Object r5 = CQ2(r8, r0, r6)
            if (r5 != r4) goto L28
            return r4
        L53:
            X.0tg9 r6 = new X.0tg9
            r6.<init>(r7, r10)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM.GQ2(android.content.Context, com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(android.content.Context r20, com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM.HQ2(android.content.Context, com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationActivity r23, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r24, X.InterfaceC1364105Vn r25) {
        /*
            r22 = this;
            r1 = r23
            r4 = r25
            r8 = r24
            boolean r0 = r4 instanceof X.C1674580tg8
            r9 = r22
            if (r0 == 0) goto L86
            r7 = r4
            X.0tg8 r7 = (X.C1674580tg8) r7
            int r3 = r7.LLIZ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L86
            int r3 = r3 - r2
            r7.LLIZ = r3
        L1a:
            java.lang.Object r6 = r7.LLILZIL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLIZ
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 == r3) goto L4e
            if (r0 != r4) goto L8c
            X.C155000ia.LIZIZ(r6)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            X.C155000ia.LIZIZ(r6)
            X.1DDq r2 = r9.LLILLL
            java.lang.Object r10 = r2.getValue()
            X.0tg1 r10 = (X.C1674510tg1) r10
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.collectionCoverUrl
            r7.LL = r1
            r7.LLILLJJLI = r8
            r7.LLILLL = r2
            r7.LLILZ = r10
            r7.LLIZ = r3
            java.lang.Object r6 = CQ2(r1, r0, r7)
            if (r6 != r5) goto L5b
            return r5
        L4e:
            X.0tg1 r10 = r7.LLILZ
            X.1DDq r2 = r7.LLILLL
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r8 = r7.LLILLJJLI
            java.lang.Object r1 = r7.LL
            android.content.Context r1 = (android.content.Context) r1
            X.C155000ia.LIZIZ(r6)
        L5b:
            r11 = 0
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            r21 = 959(0x3bf, float:1.344E-42)
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r17 = r6
            X.0tg1 r0 = X.C1674510tg1.LIZ(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.setValue(r0)
            r7.LL = r11
            r7.LLILLJJLI = r11
            r7.LLILLL = r11
            r7.LLILZ = r11
            r7.LLIZ = r4
            java.lang.Object r0 = r9.BQ2(r1, r8, r7)
            if (r0 != r5) goto L2d
            return r5
        L86:
            X.0tg8 r7 = new X.0tg8
            r7.<init>(r9, r4)
            goto L1a
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM.yQ2(com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationActivity, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection, X.05Vn):java.lang.Object");
    }
}
