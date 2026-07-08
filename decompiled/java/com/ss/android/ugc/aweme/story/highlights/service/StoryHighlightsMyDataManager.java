package com.ss.android.ugc.aweme.story.highlights.service;

import X.AbstractC23140094w;
import X.AnonymousClass0950;
import X.C01GW;
import X.C054G;
import X.C06TF;
import X.C06TT;
import X.C099R;
import X.C09A1;
import X.C09IC;
import X.C09IR;
import X.C0PEM;
import X.C13BV;
import X.C13LP;
import X.C1400705e1;
import X.C1400805e2;
import X.C1401105e5;
import X.C1697810uHb;
import X.C19719612Di;
import X.C1BNE;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C2280641EOo;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C5180020c;
import X.C7885036d;
import X.EnumC1401405e8;
import X.EnumC2252401DDy;
import X.InterfaceC1364105Vn;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsMyDataManager implements IStoryHighlightsMyDataManager {
    public final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final C2252321DDq LIZIZ;
    public List<StoryHighlightAwemePreview> LIZJ;
    public final Map<String, Aweme> LIZLLL;
    public final Set<String> LJ;
    public final ConcurrentHashMap<String, Integer> LJFF;
    public final C01GW LJI;
    public final C2252331DDr LJII;
    public final C2252331DDr LJIIIIZZ;
    public final C2252331DDr LJIIIZ;
    public final C2252331DDr LJIIJ;
    public C06TF LJIIJJI;

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final boolean LIZIZ() {
        return !this.LIZJ.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final boolean LJI() {
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        Keva repo = Keva.getRepo("story_highlights");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("first_time_panel_shown_");
        sbLIZ.append(uid);
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final void LJIIIZ() {
        this.LJIIIZ.LIZJ(C06TT.EXIT_HANDLED);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final AnonymousClass0950 LJIIJ() {
        return C09IC.LIZ(this.LJIIIIZZ);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final boolean LJIILLIIL() {
        return ((List) this.LIZIZ.getValue()).isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final void LJIL() {
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        Keva repo = Keva.getRepo("story_highlights");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("first_time_panel_shown_");
        sbLIZ.append(uid);
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final void LJJI() {
        this.LJIIIZ.LIZJ(C06TT.NEED_EXIT_IMMERSIVE_FEED);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final AnonymousClass0950 LJJIIJZLJL() {
        return C09IC.LIZ(this.LJIIJ);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final void LJJIIZI() {
        User currentUser;
        String uid;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            return;
        }
        Keva repo = Keva.getRepo("story_highlights");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onboarding_banner_exposure_count_");
        sbLIZ.append(uid);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = repo.getInt(strLIZIZ, 0) + 1;
        repo.storeInt(strLIZIZ, i);
        int iIntValue = ((Number) C7885036d.LIZ.getValue()).intValue();
        if (iIntValue <= 0 || i < iIntValue) {
            return;
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1400805e2(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final boolean LJJIJIIJI() {
        return ((List) this.LIZIZ.getValue()).size() >= 20;
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final void LJJIJIL() {
        this.LJII.LIZJ(EnumC1401405e8.ALREADY_REFRESHED);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final AnonymousClass0950 LJJIJL() {
        return C09IC.LIZ(this.LJII);
    }

    public StoryHighlightsMyDataManager() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZIZ = C1BNE.LIZ(c13bv);
        C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ)), null, null, new C1400705e1(this, null), 3);
        this.LIZJ = c13bv;
        this.LIZLLL = new LinkedHashMap();
        this.LJ = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(675));
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.DROP_OLDEST;
        this.LJII = C09IR.LIZ(1, 1, enumC2252401DDy);
        this.LJIIIIZZ = C09IR.LIZ(1, 1, enumC2252401DDy);
        this.LJIIIZ = C09IR.LIZ(1, 1, enumC2252401DDy);
        this.LJIIJ = C09IR.LIZ(1, 1, enumC2252401DDy);
        this.LJIIJJI = C06TF.NOT_LOADED;
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final void LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inbox");
        sbLIZ.append('_');
        C19719612Di.LJJIII(((ConcurrentHashMap) this.LJI.getValue()).keySet(), new C5180020c(C2188811AlT.LIZIZ(sbLIZ), 7), true);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final C06TF LIZJ() {
        return this.LJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final C2252321DDq LJII() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final List<StoryHighlightAwemePreview> LJIILL() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final C2252331DDr LJJIFFI() {
        return this.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final void LIZ(List<StoryHighlightCollection> list) {
        if (list != null) {
            this.LIZIZ.setValue(list);
            this.LJIIJJI = C06TF.LOADED;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final Aweme LIZLLL(String str) {
        return (Aweme) ((LinkedHashMap) this.LIZLLL).get(str);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final void LJIIL(Aweme aweme) {
        this.LJIIIIZZ.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final boolean LJIIZILJ(String str) {
        if (!this.LIZLLL.containsKey(str) && !this.LJ.contains(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final boolean LJIJI(List<String> list) {
        for (String str : list) {
            if (!LJIIZILJ(str)) {
                if (str == null) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final StoryHighlightsAwemeDetailResponse LJIJJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inbox");
        sbLIZ.append('_');
        sbLIZ.append(str);
        return (StoryHighlightsAwemeDetailResponse) ((ConcurrentHashMap) this.LJI.getValue()).get(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C06TQ
            if (r0 == 0) goto L20
            r5 = r14
            X.06TQ r5 = (X.C06TQ) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L71
        L20:
            X.06TQ r5 = new X.06TQ
            r5.<init>(r13, r14)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r7 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.ss.android.ugc.aweme.framework.services.IUserService) r0
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()
            if (r0 == 0) goto L66
            java.lang.String r3 = r0.getUid()
            if (r3 == 0) goto L66
            java.lang.String r0 = "story_highlights"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onboarding_banner_exposure_count_"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.erase(r0)
        L66:
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Throwable -> L7d
            r5.LLILLL = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r0.highlightOnboardingAck(r5)     // Catch: java.lang.Throwable -> L7d
            if (r1 != r6) goto L74
            return r6
        L71:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7d
        L74:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Throwable -> L7d
            r1.checkValid()     // Catch: java.lang.Throwable -> L7d
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L7d
            goto L89
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L89:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L90
            r1 = 0
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJJIIZ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final void LJJIJIIJIL(List<StoryHighlightAwemePreview> list) {
        this.LIZJ = list;
    }

    public final void LJJIZ(String str) {
        this.LIZLLL.remove(str);
        this.LJ.remove(str);
        this.LJFF.remove(str);
    }

    public static void LJJJ(String str, StoryHighlightCollection storyHighlightCollection) {
        C2280641EOo c2280641EOo;
        Aweme awemeLLILZ;
        Collection collection;
        StoryHighlightInfo storyHighlightInfo;
        if (storyHighlightCollection == null || (awemeLLILZ = (c2280641EOo = C2280641EOo.LIZIZ).LLILZ(str)) == null) {
            return;
        }
        StoryHighlightInfo storyHighlightInfo2 = awemeLLILZ.storyHighlightInfo;
        if (storyHighlightInfo2 == null || (collection = storyHighlightInfo2.collectionIds) == null) {
            collection = C13BV.INSTANCE;
        }
        List<String> listLJJJJI = C13LP.LJJJJI(C13LP.LJLILLLLZI(storyHighlightCollection.collectionId, collection));
        StoryHighlightInfo storyHighlightInfo3 = awemeLLILZ.storyHighlightInfo;
        if (storyHighlightInfo3 == null || (storyHighlightInfo = storyHighlightInfo3.copy(storyHighlightCollection, storyHighlightInfo3.containerCollectionInfo, listLJJJJI, storyHighlightInfo3.sharedFromProfile, storyHighlightInfo3.sharedFromHighlightImmersiveFeed)) == null) {
            storyHighlightInfo = new StoryHighlightInfo(storyHighlightCollection, null, listLJJJJI, false, false);
        }
        awemeLLILZ.storyHighlightInfo = storyHighlightInfo;
        c2280641EOo.LLILLL(awemeLLILZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightGetDetailResponse> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C06TN
            if (r0 == 0) goto L6a
            r6 = r9
            X.06TN r6 = (X.C06TN) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L36
            if (r0 != r3) goto L70
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightGetDetailResponse r2 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L27:
            return r2
        L28:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Throwable -> L42
            r6.LLILZ = r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r5 = r0.highlightGetDetail(r8, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 != r4) goto L39
            goto L78
        L36:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L42
        L39:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightGetDetailResponse r5 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightGetDetailResponse) r5     // Catch: java.lang.Throwable -> L42
            r5.checkValid()     // Catch: java.lang.Throwable -> L42
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L42
            goto L4e
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L4e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r5)
            r1 = 0
            if (r0 == 0) goto L56
            r5 = r1
        L56:
            r2 = r5
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightGetDetailResponse r2 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightGetDetailResponse) r2
            if (r2 == 0) goto L79
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r0 = r2.getCollectionDetail()
            r6.LL = r2
            r6.LLILZ = r3
            java.lang.Object r0 = r7.LJJIL(r0, r6)
            if (r0 != r4) goto L27
            return r4
        L6a:
            X.06TN r6 = new X.06TN
            r6.<init>(r7, r9)
            goto L12
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L78:
            return r4
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJIIJJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C06TR
            if (r0 == 0) goto L20
            r4 = r7
            X.06TR r4 = (X.C06TR) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3c
        L20:
            X.06TR r4 = new X.06TR
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Throwable -> L48
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r0.highlightListForAweme(r6, r4)     // Catch: java.lang.Throwable -> L48
            if (r3 != r2) goto L3f
            return r2
        L3c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L48
        L3f:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse r3 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse) r3     // Catch: java.lang.Throwable -> L48
            r3.checkValid()     // Catch: java.lang.Throwable -> L48
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L48
            goto L54
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L54:
            boolean r1 = X.C189200o6.m7isFailureimpl(r3)
            r0 = 0
            if (r1 == 0) goto L5c
            r3 = r0
        L5c:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse r3 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse) r3
            if (r3 == 0) goto L70
            java.util.List r1 = r3.getCollections()
            if (r1 == 0) goto L6f
            X.1DDq r0 = r5.LIZIZ
            r0.setValue(r1)
            X.06TF r0 = X.C06TF.LOADED
            r5.LJIIJJI = r0
        L6f:
            return r3
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJIJJLI(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final String LJJ(Context context, String str) {
        String string;
        String string2 = context.getString(2131848988);
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
            string = "";
        }
        if (string.length() != 0) {
            return string;
        }
        return string2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[LOOP:0: B:34:0x0089->B:36:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.08CX] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashSet] */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJ(java.util.List<java.lang.String> r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJJIJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[LOOP:0: B:17:0x0038->B:19:0x003e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJLIJ(java.lang.String r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C06TM
            if (r0 == 0) goto Lb3
            r7 = r10
            X.06TM r7 = (X.C06TM) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r6 = r7.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r3 = 0
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L51
            if (r0 == r1) goto L4c
            if (r0 != r5) goto Lbb
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse r5 = r7.LLILLJJLI
            java.lang.Object r4 = r7.LL
            X.C155000ia.LIZIZ(r6)
        L2a:
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r0 = r5.getDeletedCollectionDetail()
            if (r0 == 0) goto Lba
            java.util.List<java.lang.String> r0 = r0.awemeIds
            if (r0 == 0) goto Lba
            java.util.Iterator r2 = r0.iterator()
        L38:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r0 = r5.getDeletedCollectionDetail()
            LJJJI(r1, r0, r3)
            goto L38
        L4c:
            java.lang.Object r9 = r7.LL
            java.lang.String r9 = (java.lang.String) r9
            goto L61
        L51:
            X.C155000ia.LIZIZ(r6)
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Throwable -> L6d
            r7.LL = r9     // Catch: java.lang.Throwable -> L6d
            r7.LLILZIL = r1     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r0.highlightDelete(r9, r7)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r4) goto L64
            goto Lc3
        L61:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L6d
        L64:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse r6 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse) r6     // Catch: java.lang.Throwable -> L6d
            r6.checkValid()     // Catch: java.lang.Throwable -> L6d
            X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L6d
            goto L79
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r6 = new X.00Yq
            r6.<init>(r0)
            X.C189200o6.m2constructorimpl(r6)
        L79:
            boolean r0 = X.C189200o6.m7isFailureimpl(r6)
            if (r0 == 0) goto L80
            r6 = r3
        L80:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse r6 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse) r6
            if (r6 == 0) goto Lc4
            r8.LJJIZ(r9)
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r0 = r6.getDeletedCollectionDetail()
            if (r0 == 0) goto Lad
            java.lang.String r2 = r0.collectionId
        L8f:
            r7.LL = r6
            r7.LLILLJJLI = r6
            r7.LLILZIL = r5
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.05e3 r0 = new X.05e3
            r0.<init>(r2, r8, r3)
            java.lang.Object r1 = X.C23250099c.LJI(r7, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto Laa
            kotlin.Unit r1 = kotlin.Unit.LIZ
        Laa:
            if (r1 != r4) goto Laf
            return r4
        Lad:
            r2 = r3
            goto L8f
        Laf:
            r5 = r6
            r4 = r6
            goto L2a
        Lb3:
            X.06TM r7 = new X.06TM
            r7.<init>(r8, r10)
            goto L12
        Lba:
            return r4
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc3:
            return r4
        Lc4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJJIJLIJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Object LJJIL(StoryHighlightCollection storyHighlightCollection, AbstractC23140094w abstractC23140094w) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(abstractC23140094w, C2107308Nj.LIZ, new C1401105e5(storyHighlightCollection, this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.Aweme LJJJI(java.lang.String r7, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r8, com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse.PrimaryCollectionCache r9) {
        /*
            r6 = 0
            if (r8 != 0) goto L4
            return r6
        L4:
            X.1EOo r2 = X.C2280641EOo.LIZIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r2.LLILZ(r7)
            if (r3 != 0) goto Ld
            return r6
        Ld:
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo r0 = r3.storyHighlightInfo
            if (r0 == 0) goto L15
            java.util.List<java.lang.String> r1 = r0.collectionIds
            if (r1 != 0) goto L17
        L15:
            X.13BV r1 = X.C13BV.INSTANCE
        L17:
            java.lang.String r0 = r8.collectionId
            java.util.List r7 = X.C13LP.LJLIIIL(r0, r1)
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo r4 = r3.storyHighlightInfo
            if (r4 == 0) goto L53
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r0 = r4.primaryCollectionInfo
            if (r0 == 0) goto L65
            java.lang.String r1 = r0.collectionId
        L27:
            java.lang.String r0 = r8.collectionId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5c
            if (r9 == 0) goto L63
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r5 = r9.primaryCollectionInfo
        L33:
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo r0 = r3.storyHighlightInfo
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r0 = r0.containerCollectionInfo
            if (r0 == 0) goto L5a
            java.lang.String r1 = r0.collectionId
        L3d:
            java.lang.String r0 = r8.collectionId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L4b
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo r0 = r3.storyHighlightInfo
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r6 = r0.containerCollectionInfo
        L4b:
            boolean r8 = r4.sharedFromProfile
            boolean r9 = r4.sharedFromHighlightImmersiveFeed
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo r6 = r4.copy(r5, r6, r7, r8, r9)
        L53:
            r3.storyHighlightInfo = r6
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LLILLL(r3)
            return r0
        L5a:
            r1 = r6
            goto L3d
        L5c:
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo r0 = r3.storyHighlightInfo
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r5 = r0.primaryCollectionInfo
            goto L33
        L63:
            r5 = r6
            goto L33
        L65:
            r1 = r6
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJJJI(java.lang.String, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection, com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse$PrimaryCollectionCache):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C06TL
            if (r0 == 0) goto L8d
            r5 = r9
            X.06TL r5 = (X.C06TL) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r4 = r5.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L3e
            if (r0 == r1) goto L35
            if (r0 != r2) goto L93
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r0 = r5.LLILLL
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r8 = r5.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r4)
        L2d:
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r0 = r0.getCollectionDetail()
            LJJJ(r8, r0)
        L34:
            return r1
        L35:
            java.lang.Object r8 = r5.LLILLJJLI
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            goto L50
        L3e:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Throwable -> L5c
            r5.LL = r7     // Catch: java.lang.Throwable -> L5c
            r5.LLILLJJLI = r8     // Catch: java.lang.Throwable -> L5c
            r5.LLILZLL = r1     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r4 = r0.highlightAddAweme(r7, r8, r5)     // Catch: java.lang.Throwable -> L5c
            if (r4 != r3) goto L53
            goto L9b
        L50:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L5c
        L53:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r4 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse) r4     // Catch: java.lang.Throwable -> L5c
            r4.checkValid()     // Catch: java.lang.Throwable -> L5c
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L5c
            goto L68
        L5c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L68:
            boolean r0 = X.C189200o6.m7isFailureimpl(r4)
            r1 = 0
            if (r0 == 0) goto L70
            r4 = r1
        L70:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r4 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse) r4
            if (r4 == 0) goto L34
            r6.LJJIZ(r7)
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r0 = r4.getCollectionDetail()
            r5.LL = r8
            r5.LLILLJJLI = r4
            r5.LLILLL = r4
            r5.LLILZLL = r2
            java.lang.Object r0 = r6.LJJIL(r0, r5)
            if (r0 != r3) goto L8a
            return r3
        L8a:
            r0 = r4
            r1 = r4
            goto L2d
        L8d:
            X.06TL r5 = new X.06TL
            r5.<init>(r6, r9)
            goto L12
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r8, java.lang.String r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C06TJ
            if (r0 == 0) goto L9f
            r6 = r10
            X.06TJ r6 = (X.C06TJ) r6
            int r2 = r6.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r6.LLIZ = r2
        L12:
            java.lang.Object r5 = r6.LLILZIL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLIZ
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L4e
            if (r0 == r1) goto L45
            if (r0 != r3) goto La6
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r0 = r6.LLILZ
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r2 = r6.LLILLL
            java.lang.Object r9 = r6.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L2f:
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r1 = r0.getCollectionDetail()
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse$PrimaryCollectionCache r0 = r0.getPrimaryCollectionCache()
            LJJJI(r9, r1, r0)
            X.1DDr r1 = r7.LJIIJ
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r9, r8)
            r1.LIZJ(r0)
        L44:
            return r2
        L45:
            java.lang.Object r9 = r6.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            goto L60
        L4e:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Throwable -> L6c
            r6.LL = r8     // Catch: java.lang.Throwable -> L6c
            r6.LLILLJJLI = r9     // Catch: java.lang.Throwable -> L6c
            r6.LLIZ = r1     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r5 = r0.highlightRemoveAweme(r8, r9, r6)     // Catch: java.lang.Throwable -> L6c
            if (r5 != r4) goto L63
            goto Lae
        L60:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L6c
        L63:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r5 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse) r5     // Catch: java.lang.Throwable -> L6c
            r5.checkValid()     // Catch: java.lang.Throwable -> L6c
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L6c
            goto L78
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L78:
            boolean r0 = X.C189200o6.m7isFailureimpl(r5)
            r2 = 0
            if (r0 == 0) goto L80
            r5 = r2
        L80:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r5 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse) r5
            if (r5 == 0) goto L44
            r7.LJJIZ(r8)
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r0 = r5.getCollectionDetail()
            r6.LL = r8
            r6.LLILLJJLI = r9
            r6.LLILLL = r5
            r6.LLILZ = r5
            r6.LLIZ = r3
            java.lang.Object r0 = r7.LJJIL(r0, r6)
            if (r0 != r4) goto L9c
            return r4
        L9c:
            r0 = r5
            r2 = r5
            goto L2f
        L9f:
            X.06TJ r6 = new X.06TJ
            r6.<init>(r7, r10)
            goto L12
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJFF(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final void LJIILIIL(String str, String str2, StoryHighlightsAwemeDetailResponse storyHighlightsAwemeDetailResponse) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str);
        ((ConcurrentHashMap) this.LJI.getValue()).put(C2188811AlT.LIZIZ(sbLIZ), storyHighlightsAwemeDetailResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.lang.String r8, java.lang.String r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C06TO
            if (r0 == 0) goto L24
            r5 = r10
            X.06TO r5 = (X.C06TO) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r6 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZIL
            r3 = 2
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L3e
            if (r1 == r0) goto L32
            if (r1 != r3) goto L2a
            goto L6e
        L24:
            X.06TO r5 = new X.06TO
            r5.<init>(r7, r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            java.lang.Object r9 = r5.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r6)
            goto L5f
        L3e:
            X.C155000ia.LIZIZ(r6)
            r5.LL = r8
            r5.LLILLJJLI = r9
            r5.LLILZIL = r0
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.05e0 r0 = new X.05e0
            r0.<init>(r7, r9, r8, r2)
            java.lang.Object r1 = X.C23250099c.LJI(r5, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L5c
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L5c:
            if (r1 != r4) goto L5f
            return r4
        L5f:
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Throwable -> L7a
            r5.LL = r2     // Catch: java.lang.Throwable -> L7a
            r5.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L7a
            r5.LLILZIL = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r6 = r0.highlightReorder(r8, r9, r5)     // Catch: java.lang.Throwable -> L7a
            if (r6 != r4) goto L71
            return r4
        L6e:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L7a
        L71:
            com.ss.android.ugc.aweme.base.api.BaseResponse r6 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r6     // Catch: java.lang.Throwable -> L7a
            r6.checkValid()     // Catch: java.lang.Throwable -> L7a
            X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L7a
            goto L86
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r6 = new X.00Yq
            r6.<init>(r0)
            X.C189200o6.m2constructorimpl(r6)
        L86:
            boolean r0 = X.C189200o6.m7isFailureimpl(r6)
            if (r0 != 0) goto L8d
            r2 = r6
        L8d:
            X.1DDr r1 = r7.LJII
            X.05e8 r0 = X.EnumC1401405e8.NEED_REFRESH
            r1.LIZJ(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJIILJJIL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C06TS
            if (r0 == 0) goto L37
            r4 = r8
            X.06TS r4 = (X.C06TS) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3d
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCoverReportResponse r3 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCoverReportResponse) r3
            java.lang.String r0 = r3.getReportTaskId()
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ
            r4.LLILLL = r1
            java.lang.Object r3 = r0.highlightCoverReport(r6, r7, r4)
            if (r3 != r2) goto L22
            return r2
        L37:
            X.06TS r4 = new X.06TS
            r4.<init>(r5, r8)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJJIIJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    public final Object LJJII(Context context, String str, String str2, String str3, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn) {
        return LJJIII(context, str, str2, str3, StoryHighlightCollection.CoverType.STORY_COVER, C1697810uHb.LJIIL(str3), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIII(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection.CoverType r17, java.util.List<java.lang.String> r18, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse> r19) throws java.lang.Throwable {
        /*
            r12 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C06TK
            if (r0 == 0) goto L99
            r11 = r3
            X.06TK r11 = (X.C06TK) r11
            int r2 = r11.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r2 = r2 - r1
            r11.LLILZ = r2
        L14:
            java.lang.Object r5 = r11.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LLILZ
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L55
            if (r0 != r1) goto La0
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r4 = r11.LL
            X.C155000ia.LIZIZ(r5)
        L29:
            return r4
        L2a:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.story.api.StoryApi r5 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = r12.LJJ(r13, r14)     // Catch: java.lang.Throwable -> L61
            int r0 = r17.getValue()     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r9 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Throwable -> L61
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C05N6.LIZ()     // Catch: java.lang.Throwable -> L61
            com.google.gson.Gson r0 = r0.getGson()     // Catch: java.lang.Throwable -> L61
            r4 = r18
            java.lang.String r10 = r0.LJIILL(r4)     // Catch: java.lang.Throwable -> L61
            r11.LLILZ = r2     // Catch: java.lang.Throwable -> L61
            r8 = r16
            r7 = r15
            java.lang.Object r5 = r5.highlightCreate(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L61
            if (r5 != r3) goto L58
            goto La8
        L55:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L61
        L58:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r5 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse) r5     // Catch: java.lang.Throwable -> L61
            r5.checkValid()     // Catch: java.lang.Throwable -> L61
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L61
            goto L6d
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L6d:
            boolean r0 = X.C189200o6.m7isFailureimpl(r5)
            r4 = 0
            if (r0 == 0) goto L75
            r5 = r4
        L75:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r5 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse) r5
            if (r5 == 0) goto L29
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r2 = r5.getCollectionDetail()
            r11.LL = r5
            r11.LLILZ = r1
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.05e4 r0 = new X.05e4
            r0.<init>(r2, r12, r4)
            java.lang.Object r1 = X.C23250099c.LJI(r11, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L96
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L96:
            if (r1 != r3) goto La9
            return r3
        L99:
            X.06TK r11 = new X.06TK
            r11.<init>(r12, r3)
            goto L14
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La8:
            return r3
        La9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJJIII(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection$CoverType, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[LOOP:0: B:20:0x004e->B:22:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed A[LOOP:1: B:47:0x00e7->B:49:0x00ed, LOOP_END] */
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(android.content.Context r19, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection.CoverType r24, java.util.List<java.lang.String> r25, java.lang.String r26, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse> r27) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager.LJIJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection$CoverType, java.util.List, java.lang.String, X.05Vn):java.lang.Object");
    }
}
