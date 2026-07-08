package com.ss.android.ugc.aweme.story.archive2;

import X.C05N6;
import X.C098200Yq;
import X.C0PEM;
import X.C1173560ge2;
import X.C1173690geF;
import X.C1173790geP;
import X.C13LP;
import X.C189200o6;
import X.C1954807lC;
import X.C1DFB;
import X.C2188811AlT;
import X.C23250099c;
import X.C331101Qf;
import X.C331601Qk;
import X.C332501Qt;
import X.EnumC1173730geJ;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchiveV2ArchiveViewModel extends AssemViewModel<C1173560ge2> {
    public static final /* synthetic */ int LLIZ = 0;
    public final StoryArchiveV2Cache LL;
    public EnumC1173730geJ LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public final long LLILZIL;
    public boolean LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o defaultState() {
        /*
            r17 = this;
            X.0ge2 r5 = new X.0ge2
            X.01GW r0 = X.C281210B0l.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r8 = 0
            if (r0 == 0) goto L86
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r7 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.ss.android.ugc.aweme.framework.services.IUserService) r0
            if (r0 == 0) goto L86
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()
            if (r0 == 0) goto L86
            java.lang.String r4 = r0.getUid()
            if (r4 == 0) goto L86
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            java.util.Locale r0 = java.util.Locale.getDefault()
            r2.<init>(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = r2.format(r0)
            java.lang.String r0 = "story_archive_v2"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "on_this_day_date_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = ""
            java.lang.String r1 = r2.getString(r1, r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L6b
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 != 0) goto L86
        L6b:
            r9 = 1
        L6c:
            X.0geE r6 = new X.0geE
            r6.<init>(r8)
            X.0geE r7 = new X.0geE
            r7.<init>(r8)
            java.util.Map r8 = X.C2097608Jq.LJ()
            r10 = 0
            X.13BV r16 = X.C13BV.INSTANCE
            r11 = -1
            r13 = 0
            r15 = 1
            r14 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            return r5
        L86:
            r9 = 0
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel.defaultState():X.002o");
    }

    public StoryArchiveV2ArchiveViewModel() {
        StoryArchiveV2Cache storyArchiveV2Cache;
        User currentUser;
        String uid;
        Object c098200Yq;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            storyArchiveV2Cache = new StoryArchiveV2Cache("", false, 0, 0);
        } else {
            Keva repo = Keva.getRepo("story_archive_v2");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cache_");
            sbLIZ.append(uid);
            String string = repo.getString(C2188811AlT.LIZIZ(sbLIZ), "");
            if (string.length() == 0) {
                storyArchiveV2Cache = new StoryArchiveV2Cache("", false, 0, 0);
            } else {
                try {
                    c098200Yq = (StoryArchiveV2Cache) C05N6.LIZ().getGson().LJII(string, StoryArchiveV2Cache.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                storyArchiveV2Cache = (StoryArchiveV2Cache) (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null ? new StoryArchiveV2Cache("", false, 0, 0) : c098200Yq);
            }
        }
        this.LL = storyArchiveV2Cache;
        this.LLILLJJLI = (EnumC1173730geJ) C13LP.LJJJJZI(C1173790geP.LIZ());
        this.LLILLL = "";
        this.LLILZIL = System.currentTimeMillis();
    }

    public final void vQ2(EnumC1173730geJ enumC1173730geJ) {
        int i = C1173690geF.LIZ[enumC1173730geJ.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C332501Qt(true, this, null), 2);
                return;
            }
            throw new C1954807lC();
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFB c1dfb = C0PEM.LIZJ;
        C23250099c.LIZLLL(viewModelScope, c1dfb, null, new C332501Qt(false, this, null), 2);
        if (getState().LLILZ) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), c1dfb, null, new C331601Qk(this, null), 2);
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), c1dfb, null, new C331101Qf(this, null), 2);
    }
}
