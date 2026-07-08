package com.ss.android.ugc.aweme.story.archive;

import X.AbstractC316870CbV;
import X.C0KBN;
import X.C1697810uHb;
import X.C209800rQ;
import X.C2188811AlT;
import X.C2189821An6;
import X.C326010CqF;
import X.C627660Ojc;
import X.C727890Sgt;
import X.C729510SjV;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryArchListViewModel extends BaseDetailShareVM<C326010CqF, C209800rQ, Long> {
    public long LLILZIL;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326010CqF(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C209800rQ> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 128));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return BQ2(0L, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((C209800rQ) it2.next()).LL.getAid(), str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        Aweme aweme = ((C209800rQ) interfaceC1891350zJl).LL;
        if (C729510SjV.LJJIJIL(aweme) && aweme.getUserStory() == null) {
            Aweme aweme2 = new Aweme();
            aweme2.setAid(aweme.getAid());
            boolean z = false;
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme));
            Story story = aweme.getStory();
            if (story != null) {
                z = story.viewed;
            }
            UserStory userStory = new UserStory(listLJIILJJIL, 1L, 0L, z, 0L, 0L, false, false, 0L, false, null, null, false, null, 1L, new UserStoryCurrentInfo(null, null, 0), false, true, new UserStoryCurrentInfo(-1, null, 0), (int) 0, false, 0L, null, false);
            C727890Sgt c727890Sgt = C727890Sgt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("origin total count: ");
            sbLIZ.append(userStory.getOriginTotalCount());
            sbLIZ.append(", user story instance: ");
            sbLIZ.append(System.identityHashCode(userStory));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c727890Sgt.getClass();
            C727890Sgt.LIZ("huangxin.2020", strLIZIZ);
            aweme2.setUserStory(userStory);
            aweme2.setAwemeType(40);
            aweme2.setAuthor(aweme.getAuthor());
            aweme2.setRequestId(aweme.getRequestId());
            aweme2.setIsTikTokStory(true);
            return aweme2;
        }
        return aweme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(long r13, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C727290Sfv
            if (r0 == 0) goto L20
            r6 = r15
            X.0Sfv r6 = (X.C727290Sfv) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L42
        L20:
            X.0Sfv r6 = new X.0Sfv
            r6.<init>(r12, r15)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.story.api.StoryApi r2 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Exception -> Lb5
            r0 = 21
            X.11NZ r0 = r2.getStoryArchList(r13, r0)     // Catch: java.lang.Exception -> Lb5
            r6.LLILLL = r3     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r5 = X.C11UD.LIZJ(r0, r6)     // Catch: java.lang.Exception -> Lb5
            if (r5 != r4) goto L45
            return r4
        L42:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> Lb5
        L45:
            com.ss.android.ugc.aweme.story.archive.model.StoryArchiveList r5 = (com.ss.android.ugc.aweme.story.archive.model.StoryArchiveList) r5     // Catch: java.lang.Exception -> Lb5
            java.util.List r6 = r5.getItems()     // Catch: java.lang.Exception -> Lb5
            r9 = 0
            if (r6 == 0) goto L8d
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r5.extra     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L8b
            java.lang.String r7 = r0.logid     // Catch: java.lang.Exception -> Lb5
        L54:
            java.lang.Object r0 = X.C13LP.LJJJLL(r6)     // Catch: java.lang.Exception -> Lb5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.profile.model.User r8 = r0.getAuthor()     // Catch: java.lang.Exception -> Lb5
        L60:
            r10 = r9
            r11 = r9
            X.C727110Sfd.LIZ(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Lb5
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb5
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r6, r0)     // Catch: java.lang.Exception -> Lb5
            r4.<init>(r0)     // Catch: java.lang.Exception -> Lb5
            java.util.Iterator r2 = r6.iterator()     // Catch: java.lang.Exception -> Lb5
        L74:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L8f
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lb5
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> Lb5
            X.00rQ r0 = new X.00rQ     // Catch: java.lang.Exception -> Lb5
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb5
            r4.add(r0)     // Catch: java.lang.Exception -> Lb5
            goto L74
        L89:
            r8 = r9
            goto L60
        L8b:
            r7 = r9
            goto L54
        L8d:
            X.13BV r4 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> Lb5
        L8f:
            boolean r0 = r5.getHasMore()     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto Laa
            long r0 = r5.getMaxCursor()     // Catch: java.lang.Exception -> Lb5
            r12.LLILZIL = r0     // Catch: java.lang.Exception -> Lb5
            X.0CcB r2 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> Lb5
            long r0 = r5.getMaxCursor()     // Catch: java.lang.Exception -> Lb5
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> Lb5
            X.0Cm0 r0 = X.C317290CcB.LJ(r2, r9, r0, r4, r3)     // Catch: java.lang.Exception -> Lb5
            return r0
        Laa:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> Lb5
            r0.getClass()     // Catch: java.lang.Exception -> Lb5
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> Lb5
            r0.<init>(r4)     // Catch: java.lang.Exception -> Lb5
            return r0
        Lb5:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel.BQ2(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return BQ2(((Number) obj).longValue(), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return Long.valueOf(this.LLILZIL);
    }
}
