package com.ss.android.ugc.aweme.story.note.draft;

import X.C01GW;
import X.C099R;
import X.C0VO6;
import X.C123100dR;
import X.C15438062q;
import X.C452501pT;
import X.C817600W5m;
import X.InterfaceC1364105Vn;
import X.InterfaceC20582915gR;
import androidx.lifecycle.LiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryThoughtDraftService implements IStoryThoughtDraftService {
    public static final Keva LIZ = Keva.getRepo("story_thought_notification");
    public static final C01GW<StoryThoughtDraftDatabase> LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(169));

    @Override // com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService
    public final LiveData<List<C817600W5m>> LJFF() {
        String uid;
        User currentUser;
        InterfaceC20582915gR interfaceC20582915gRLIZ = C0VO6.LIZ().LIZ();
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            uid = "";
        }
        return interfaceC20582915gRLIZ.LJ(uid);
    }

    @Override // com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService
    public final LiveData<List<C817600W5m>> LJII() {
        String uid;
        User currentUser;
        InterfaceC20582915gR interfaceC20582915gRLIZ = C0VO6.LIZ().LIZ();
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            uid = "";
        }
        return interfaceC20582915gRLIZ.LIZIZ(uid);
    }

    @Override // com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService
    public final String LJI(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        return LIZ.getString(str, null);
    }

    @Override // com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService
    public final Object LIZ(String str, InterfaceC1364105Vn<? super C817600W5m> interfaceC1364105Vn) {
        return C0VO6.LIZ().LIZ().LIZ(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService
    public final Object LIZJ(List<C817600W5m> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Iterator<C817600W5m> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().deleteCoverFile();
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C817600W5m> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next().taskId);
        }
        Object objLIZLLL = C0VO6.LIZ().LIZ().LIZLLL(arrayList, interfaceC1364105Vn);
        if (objLIZLLL == C099R.LJFF()) {
            return objLIZLLL;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService
    public final void LIZLLL(String str, String str2) {
        if (C123100dR.LIZ(str) && C123100dR.LIZ(str2)) {
            LIZ.storeString(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService
    public final Object LJ(C817600W5m c817600W5m, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJFF = C0VO6.LIZ().LIZ().LJFF(c817600W5m.markAsRead(), interfaceC1364105Vn);
        if (objLJFF == C099R.LJFF()) {
            return objLJFF;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService
    public final Object LJIIIZ(C817600W5m c817600W5m, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        c817600W5m.deleteCoverFile();
        Object objLIZJ = C0VO6.LIZ().LIZ().LIZJ(c817600W5m.taskId, interfaceC1364105Vn);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(android.content.Context r12, X.C817600W5m r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C20582315gL
            if (r0 == 0) goto L59
            r3 = r14
            X.15gL r3 = (X.C20582315gL) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r2 = r3.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L5f
            X.0W5m r13 = r3.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r13.saveCoverBitmap(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r2)
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r5 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.ss.android.ugc.aweme.framework.services.IUserService) r0
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.getCurrentUser()
            if (r2 == 0) goto L67
            r3.LL = r13
            r3.LLILZ = r1
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0nkQ r0 = new X.0nkQ
            r0.<init>(r12, r2, r13, r10)
            java.lang.Object r2 = X.C23250099c.LJI(r3, r1, r0)
            if (r2 != r4) goto L24
            return r4
        L59:
            X.15gL r3 = new X.15gL
            r3.<init>(r11, r14)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L67:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftService.LJIIJ(android.content.Context, X.0W5m, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.Context r8, X.C817600W5m r9, com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResult r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C20582215gK
            if (r0 == 0) goto L69
            r4 = r11
            X.15gK r4 = (X.C20582215gK) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 == r6) goto L50
            if (r0 != r5) goto L6f
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            r9.deleteCoverFile()
            java.lang.Integer r0 = r10.taskStatus
            if (r0 == 0) goto L49
            int r2 = r0.intValue()
        L36:
            java.util.List<java.lang.String> r1 = r10.avatarUrls
            java.lang.String r0 = r10.avatarUri
            X.0W5m r2 = r9.update(r2, r1, r0)
            r4.LL = r2
            r4.LLILZ = r6
            java.lang.Object r0 = r7.LJIIJ(r8, r2, r4)
            if (r0 != r3) goto L55
            return r3
        L49:
            X.0DUm r0 = X.EnumC339980DUm.FAIL
            int r2 = r0.getValue()
            goto L36
        L50:
            X.0W5m r2 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L55:
            com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftDatabase r0 = X.C0VO6.LIZ()
            X.15gR r1 = r0.LIZ()
            r0 = 0
            r4.LL = r0
            r4.LLILZ = r5
            java.lang.Object r0 = r1.LJFF(r2, r4)
            if (r0 != r3) goto L25
            return r3
        L69:
            X.15gK r4 = new X.15gK
            r4.<init>(r7, r11)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftService.LIZIZ(android.content.Context, X.0W5m, com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResult, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    @Override // com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(android.content.Context r28, java.lang.String r29, com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel r30, X.C1404940mfE r31, com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResult r32, X.InterfaceC1364105Vn<? super X.C817600W5m> r33) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftService.LJIIIIZZ(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel, X.0mfE, com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResult, X.05Vn):java.lang.Object");
    }
}
