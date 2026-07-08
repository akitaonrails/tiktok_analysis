package com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost;

import X.AbstractC1777330wLr;
import X.AbstractC1777760wMY;
import X.C13LP;
import X.C1813220xHk;
import X.C1813440xI6;
import X.C1813610xIN;
import X.C20441214yg;
import X.C2188811AlT;
import X.EnumC1813200xHi;
import X.EnumC1813530xIF;
import com.bytedance.android.livesdk.mvi.core.MviViewModel;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class AutoPostLivingViewModel extends MviViewModel<C1813440xI6, AbstractC1777330wLr, AbstractC1777760wMY> {
    public EnumC1813530xIF LLILZLL;
    public long LLIZ;
    public EnumC1813200xHi LLIZLLLIL;
    public final C1813610xIN LLJ;
    public C1813220xHk LLJI;

    public AutoPostLivingViewModel() {
        super(new C1813440xI6(0));
        this.LLIZLLLIL = EnumC1813200xHi.UNPOSTED;
        this.LLJ = new C1813610xIN();
    }

    public final void AQ2() {
        setState(AFwS269S0000000_27.get$arr$(68));
        List listLLIIII = C13LP.LLIIII(this.LLJ.LIZ);
        if (listLLIIII.isEmpty()) {
            C20441214yg.LIZIZ("AutoPostLivingViewModel", "FetchAutoPostList for POSTED, postList is empty");
            setState(AFwS269S0000000_27.get$arr$(69));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchAutoPostList for POSTED, postList size = ");
        sbLIZ.append(listLLIIII.size());
        C20441214yg.LIZIZ("AutoPostLivingViewModel", C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS606S0100000_27(listLLIIII, (List<TakoActiveBotItem>) 113));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.C1808830xAf r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1813160xHe
            if (r0 == 0) goto L24
            r6 = r10
            X.0xHe r6 = (X.C1813160xHe) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 1
            java.lang.String r2 = "AutoPostLivingViewModel"
            if (r0 == 0) goto L32
            if (r0 != r5) goto L2a
            X.0xAf r9 = r6.LL
            goto L6f
        L24:
            X.0xHe r6 = new X.0xHe
            r6.<init>(r8, r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            r0 = 70
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r8.setState(r0)
            java.lang.String r0 = "DeleteAutoPostItem for POSTED"
            X.C20441214yg.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L76
            java.lang.Long r3 = r9.LIZLLL     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L5e
            java.lang.String r0 = r9.LJIIL     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L5e
            X.0xIN r1 = r8.LLJ     // Catch: java.lang.Throwable -> L76
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r9.LJIIL     // Catch: java.lang.Throwable -> L76
            r6.LL = r9     // Catch: java.lang.Throwable -> L76
            r6.LLILZ = r5     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r1.LIZ(r3, r0, r6)     // Catch: java.lang.Throwable -> L76
            if (r1 != r7) goto L72
            return r7
        L5e:
            java.lang.String r0 = "DeleteAutoPostItem for POSTED, fragmentId or itemId is null"
            X.C20441214yg.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L76
            r0 = 71
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)     // Catch: java.lang.Throwable -> L76
            r8.setState(r0)     // Catch: java.lang.Throwable -> L76
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L76
            goto L72
        L6f:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L76
        L72:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L76
            goto L82
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L82:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r1)
            if (r0 == 0) goto La2
            java.lang.String r0 = "DeleteAutoPostItem for POSTED success"
            X.C20441214yg.LIZIZ(r2, r0)
            X.0xIN r0 = r8.LLJ
            java.util.List<X.0xAf> r0 = r0.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.remove(r9)
            r8.AQ2()
            r0 = 72
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r8.setState(r0)
        La2:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r1 == 0) goto Lbb
            java.lang.String r0 = "DeleteAutoPostItem for POSTED failed"
            X.C20441214yg.LJFF(r2, r0, r1)
            r0 = 73
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r8.setState(r0)
            X.0wMW r0 = X.C1777740wMW.LIZ
            r8.wQ2(r0)
        Lbb:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel.BQ2(X.0xAf, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[RETURN] */
    @Override // com.bytedance.android.livesdk.mvi.core.MviViewModel
    /* JADX INFO: renamed from: CQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.AbstractC1777330wLr r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel.yQ2(X.0wLr, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(boolean r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1813180xHg
            if (r0 == 0) goto L22
            r6 = r9
            X.0xHg r6 = (X.C1813180xHg) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            boolean r8 = r6.LL
            goto L76
        L22:
            X.0xHg r6 = new X.0xHg
            r6.<init>(r7, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            r0 = 67
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r7.setState(r0)
            X.0xIN r1 = r7.LLJ     // Catch: java.lang.Throwable -> L7f
            if (r8 == 0) goto L42
            r3 = 1
            goto L43
        L42:
            r3 = 0
        L43:
            X.0xIF r0 = r7.LLILZLL     // Catch: java.lang.Throwable -> L7f
            if (r0 != 0) goto L49
            X.0xIF r0 = X.EnumC1813530xIF.PUBLIC     // Catch: java.lang.Throwable -> L7f
        L49:
            int r2 = r0.getValue()     // Catch: java.lang.Throwable -> L7f
            r6.LL = r8     // Catch: java.lang.Throwable -> L7f
            r6.LLILZ = r4     // Catch: java.lang.Throwable -> L7f
            r1.getClass()     // Catch: java.lang.Throwable -> L7f
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L7f
            java.lang.Class<com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi> r0 = com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = X.C480460Ism.LIZIZ(r0)     // Catch: java.lang.Throwable -> L7f
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi) r1     // Catch: java.lang.Throwable -> L7f
            if (r3 != 0) goto L66
            r4 = 2
        L66:
            r0 = 5
            java.lang.Object r1 = r1.updateReplaySetting(r0, r4, r2, r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> L7f
            if (r1 == r0) goto L73
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L7f
        L73:
            if (r1 != r5) goto L79
            return r5
        L76:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7f
        L79:
            kotlin.Unit r3 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L7f
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L7f
            goto L8b
        L7f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L8b:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r3)
            java.lang.String r2 = "AutoPostLivingViewModel"
            if (r0 == 0) goto La9
            java.lang.String r0 = "SwitchAutoPostState success"
            X.C20441214yg.LIZIZ(r2, r0)
            if (r8 == 0) goto L9f
            X.0wMZ r0 = X.C1777770wMZ.LIZ
            r7.wQ2(r0)
        L9f:
            kotlin.jvm.internal.AwS39S0010000_27 r1 = new kotlin.jvm.internal.AwS39S0010000_27
            r0 = 9
            r1.<init>(r8, r0)
            r7.setState(r1)
        La9:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r1 == 0) goto Lc3
            java.lang.String r0 = "SwitchAutoPostState failed"
            X.C20441214yg.LJFF(r2, r0, r1)
            kotlin.jvm.internal.AwS39S0010000_27 r1 = new kotlin.jvm.internal.AwS39S0010000_27
            r0 = 10
            r1.<init>(r8, r0)
            r7.setState(r1)
            X.0wMX r0 = X.C1777750wMX.LIZ
            r7.wQ2(r0)
        Lc3:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel.zQ2(boolean, X.05Vn):java.lang.Object");
    }
}
