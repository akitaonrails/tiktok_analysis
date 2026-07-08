package com.ss.android.ugc.aweme.tako.aivideo.rtc.ability;

import X.AnonymousClass0956;
import X.C05YD;
import X.C0PEM;
import X.C1279700jPE;
import X.C1301890jz1;
import X.C1301910jz3;
import X.C1301930jz5;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23250099c;
import X.C356901a3;
import X.C862880Xt8;
import X.EnumC1284940jXg;
import X.EnumC1301920jz4;
import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoExternalVideoSei;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.bytertc.engine.avclient.LyraxAVAudioPlayer;
import com.ss.bytertc.engine.avclient.LyraxAVAudioSource;
import java.nio.ByteBuffer;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class TakoRTCAbilityImpl implements ITakoRTCAbility {
    public final C1279700jPE LL;
    public final C1301910jz3 LLILLJJLI;
    public final C1301890jz1 LLILLL;
    public volatile boolean LLILZ;
    public AnonymousClass0956 LLILZIL;
    public final C05YD<Boolean> LLILZLL;

    @Override // X.InterfaceC1302070jzJ
    public final void destroyClient() {
        this.LLILZ = true;
        this.LLILLL.destroyClient();
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LIZIZ() {
        if (this.LLILZ) {
            return false;
        }
        return this.LLILLL.LIZIZ();
    }

    @Override // X.InterfaceC1687310u0f
    public final int LIZLLL() {
        return this.LLILLJJLI.LIZ.getCode();
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LJFF() {
        return this.LLILLL.LLJJI;
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LJJIFFI() {
        return this.LLILLL.LJJIFFI();
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean startAudioCapture() {
        if (this.LLILZ) {
            return false;
        }
        return this.LLILLL.startAudioCapture();
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean stopAudioCapture() {
        return this.LLILLL.stopAudioCapture();
    }

    @Override // X.InterfaceC1302070jzJ
    public final C05YD<Boolean> LJII() {
        return this.LLILZLL;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.TakoRTCAbilityImpl$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            TakoRTCAbilityImpl.this.LLILZ = true;
            AnonymousClass0956 anonymousClass0956 = TakoRTCAbilityImpl.this.LLILZIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            TakoRTCAbilityImpl takoRTCAbilityImpl = TakoRTCAbilityImpl.this;
            takoRTCAbilityImpl.LLILZIL = null;
            takoRTCAbilityImpl.LLILLL.destroyClient();
        }
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LIZ(boolean z) {
        if (this.LLILZ) {
            return false;
        }
        return this.LLILLL.LIZ(z);
    }

    @Override // X.InterfaceC1302070jzJ
    public final void LJI(Message message) {
        if (this.LLILZ) {
            return;
        }
        this.LLILLL.LJI(message);
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LJIIJJI(EnumC1284940jXg enumC1284940jXg) {
        if (this.LLILZ) {
            return false;
        }
        return this.LLILLL.LJIIJJI(enumC1284940jXg);
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LJIILIIL(String str) {
        boolean z;
        int length;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestVideoSummary gidPresent=");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", gidLen=");
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        sbLIZ.append(length);
        sbLIZ.append(", destroyed=");
        sbLIZ.append(this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILZ) {
            return false;
        }
        return this.LLILLL.LJIILIIL(str);
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LJIIZILJ(String str) {
        if (this.LLILZ) {
            return false;
        }
        return this.LLILLL.LJIIZILJ(str);
    }

    @Override // X.InterfaceC1687310u0f
    public final int LJIJJLI(EnumC1301920jz4 enumC1301920jz4) {
        C1301910jz3 c1301910jz3 = this.LLILLJJLI;
        c1301910jz3.LIZ = enumC1301920jz4;
        EnumC1301920jz4 enumC1301920jz42 = c1301910jz3.LIZIZ;
        if (enumC1301920jz42 == EnumC1301920jz4.VOICE || enumC1301920jz42 == EnumC1301920jz4.KEYBOARD) {
            c1301910jz3.LIZIZ = enumC1301920jz4;
        }
        return c1301910jz3.LIZIZ.getCode();
    }

    @Override // X.InterfaceC1302070jzJ
    public final void LJJ(LyraxAVAudioPlayer lyraxAVAudioPlayer) {
        if (this.LLILZ) {
            return;
        }
        this.LLILLL.LJJ(lyraxAVAudioPlayer);
    }

    @Override // X.InterfaceC1687310u0f
    public final Integer LJJI(int i) {
        if (this.LLILZ) {
            return null;
        }
        EnumC1301920jz4.Companion.getClass();
        EnumC1301920jz4 enumC1301920jz4LIZ = C1301930jz5.LIZ(i);
        if (enumC1301920jz4LIZ == null) {
            return null;
        }
        C1301910jz3 c1301910jz3 = this.LLILLJJLI;
        EnumC1301920jz4 enumC1301920jz4 = c1301910jz3.LIZIZ;
        if (enumC1301920jz4LIZ != enumC1301920jz4) {
            if (!((Set) C2097608Jq.LJFF(enumC1301920jz4, C1301910jz3.LIZJ)).contains(enumC1301920jz4LIZ)) {
                C1301910jz3 c1301910jz32 = this.LLILLJJLI;
                c1301910jz32.getClass();
                if (enumC1301920jz4LIZ == EnumC1301920jz4.INTERRUPTED || enumC1301920jz4LIZ == EnumC1301920jz4.ANSWERED) {
                    enumC1301920jz4LIZ = c1301910jz32.LIZ;
                }
                c1301910jz32.LIZIZ = enumC1301920jz4LIZ;
            } else {
                if (enumC1301920jz4LIZ == EnumC1301920jz4.INTERRUPTED || enumC1301920jz4LIZ == EnumC1301920jz4.ANSWERED) {
                    enumC1301920jz4LIZ = c1301910jz3.LIZ;
                }
                c1301910jz3.LIZIZ = enumC1301920jz4LIZ;
            }
        }
        return Integer.valueOf(this.LLILLJJLI.LIZIZ.getCode());
    }

    @Override // X.InterfaceC1302070jzJ
    public final LyraxAVAudioPlayer createAudioPlayer(LyraxAVAudioSource lyraxAVAudioSource) {
        if (this.LLILZ) {
            return null;
        }
        return this.LLILLL.createAudioPlayer(lyraxAVAudioSource);
    }

    @Override // X.InterfaceC1302070jzJ
    public final void LJIIJ(int i, String str) {
        if (this.LLILZ) {
            return;
        }
        this.LLILLL.LJIIJ(i, str);
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean sendUserMessage(String str, String str2) {
        if (this.LLILZ) {
            return false;
        }
        return this.LLILLL.sendUserMessage(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1302070jzJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZI(X.InterfaceC497601wk r6, X.C1279700jPE r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C862900XtA
            if (r0 == 0) goto L20
            r4 = r8
            X.0XtA r4 = (X.C862900XtA) r4
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
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.0XtA r4 = new X.0XtA
            r4.<init>(r5, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L53
            goto L47
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = r5.LLILZ
            if (r0 == 0) goto L3c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            X.0jz1 r0 = r5.LLILLL     // Catch: java.lang.Throwable -> L53
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.LJJIIZI(r6, r7, r4)     // Catch: java.lang.Throwable -> L53
            if (r0 != r2) goto L47
            return r2
        L47:
            boolean r0 = r5.LLILZ
            if (r0 == 0) goto L50
            X.0jz1 r0 = r5.LLILLL
            r0.destroyClient()
        L50:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L53:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L53
            boolean r0 = r5.LLILZ
            if (r0 == 0) goto L60
            X.0jz1 r0 = r5.LLILLL
            r0.destroyClient()
        L60:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.TakoRTCAbilityImpl.LJJIIZI(X.01wk, X.0jPE, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJIL(X.InterfaceC497601wk r12, X.C1279700jPE r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C862890Xt9
            if (r0 == 0) goto L20
            r3 = r14
            X.0Xt9 r3 = (X.C862890Xt9) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 != r4) goto L2a
            goto L26
        L20:
            X.0Xt9 r3 = new X.0Xt9
            r3.<init>(r11, r14)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L87
            goto L7b
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r11.LLILZ
            if (r0 == 0) goto L3c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            java.lang.Class<com.ss.android.ugc.aweme.tako.ITakoService> r5 = com.ss.android.ugc.aweme.tako.ITakoService.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.tako.ITakoService r0 = (com.ss.android.ugc.aweme.tako.ITakoService) r0
            if (r0 == 0) goto L4f
            r0.LJJIJIL()
        L4f:
            boolean r0 = r11.LLILZ
            if (r0 == 0) goto L56
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L56:
            X.0jz1 r1 = r11.LLILLL     // Catch: java.lang.Throwable -> L87
            r3.LLILLL = r4     // Catch: java.lang.Throwable -> L87
            boolean r0 = r1.LIZIZ()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L63
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L87
            goto L78
        L63:
            boolean r0 = r1.LLJJIJI     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L6a
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L87
            goto L78
        L6a:
            r1.LLJJIJI = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r1 = r1.LIZJ(r12, r13, r3)     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> L87
            if (r1 == r0) goto L78
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L87
        L78:
            if (r1 != r2) goto L7b
            return r2
        L7b:
            boolean r0 = r11.LLILZ
            if (r0 == 0) goto L84
            X.0jz1 r0 = r11.LLILLL
            r0.destroyClient()
        L84:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L87:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L87
            boolean r0 = r11.LLILZ
            if (r0 == 0) goto L94
            X.0jz1 r0 = r11.LLILLL
            r0.destroyClient()
        L94:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.TakoRTCAbilityImpl.LJJIJIIJIL(X.01wk, X.0jPE, X.05Vn):java.lang.Object");
    }

    public TakoRTCAbilityImpl(Context context, boolean z, TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment, C1279700jPE c1279700jPE, C1301910jz3 c1301910jz3, C2189821An6 c2189821An6) {
        this.LL = c1279700jPE;
        this.LLILLJJLI = c1301910jz3;
        C1301890jz1 c1301890jz1 = new C1301890jz1(context, c2189821An6);
        this.LLILLL = c1301890jz1;
        takoAiVideoDetailPageFragment.getLifecycle().addObserver(new AnonymousClass1());
        this.LLILZIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(takoAiVideoDetailPageFragment), C0PEM.LIZJ, null, new C862880Xt8(this, null), 2);
        this.LLILZLL = c1301890jz1.LLJIJIL;
    }

    @Override // X.InterfaceC1302070jzJ
    public final int LJJIIJ(ByteBuffer byteBuffer, int i, int i2, long j, int i3, TakoExternalVideoSei takoExternalVideoSei) {
        if (this.LLILZ) {
            return -1;
        }
        return this.LLILLL.LJJIIJ(byteBuffer, i, i2, j, i3, takoExternalVideoSei);
    }
}
