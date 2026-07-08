package com.ss.android.ugc.aweme.service;

import X.AnonymousClass0957;
import X.C054G;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0PEM;
import X.C1403010mc7;
import X.C2296808zG;
import X.C2296908zH;
import X.C23260099m;
import X.C531370Ksh;
import X.InterfaceC1364105Vn;
import X.InterfaceC1416890myV;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.interfaces.ITemplateMusicService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateMusicServiceImpl implements ITemplateMusicService {
    public final ConcurrentHashMap<String, AVMusic> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C531370Ksh> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, AnonymousClass0957<C531370Ksh>> LIZJ = new ConcurrentHashMap<>();
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMusicService
    public final void LIZ(AVMusic aVMusic, String str) {
        this.LIZ.put(str, aVMusic);
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMusicService
    public final Object LIZIZ(final String str, InterfaceC1364105Vn<? super AVMusic> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C1403010mc7.LIZ.getMusicService().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0Ksp
            @Override // X.InterfaceC1416890myV
            public final void LIZIZ(Exception exc) {
                InterfaceC1364105Vn<AVMusic> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn2.resumeWith(null);
            }

            @Override // X.InterfaceC1416890myV
            public final void LIZLLL(AVMusic aVMusic) {
                if (aVMusic != null) {
                    InterfaceC1364105Vn<AVMusic> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(aVMusic);
                    interfaceC1364105Vn2.resumeWith(aVMusic);
                    this.LIZ.put(str, aVMusic);
                    return;
                }
                InterfaceC1364105Vn<AVMusic> interfaceC1364105Vn3 = c23260099m;
                C189200o6.m2constructorimpl(aVMusic);
                interfaceC1364105Vn3.resumeWith(aVMusic);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMusicService
    public final void LJ(String str, C531370Ksh c531370Ksh) {
        this.LIZIZ.put(str, c531370Ksh);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMusicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r10, java.lang.String r11, X.InterfaceC1364105Vn r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl.LIZJ(android.content.Context, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:11:0x0032). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMusicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r8, java.util.List r9, X.InterfaceC1364105Vn r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C531420Ksm
            if (r0 == 0) goto L62
            r6 = r10
            X.0Ksm r6 = (X.C531420Ksm) r6
            int r2 = r6.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r6.LLIZ = r2
        L12:
            java.lang.Object r1 = r6.LLILZIL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLIZ
            r4 = 1
            if (r0 == 0) goto L55
            if (r0 != r4) goto L69
            java.lang.Object r3 = r6.LLILZ
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r6.LLILLL
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r2 = r6.LLILLJJLI
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r8 = r6.LL
            android.content.Context r8 = (android.content.Context) r8
            X.C155000ia.LIZIZ(r1)
        L32:
            r3.add(r1)
            r3 = r2
        L36:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r6.LL = r8
            r6.LLILLJJLI = r3
            r6.LLILLL = r0
            r6.LLILZ = r3
            r6.LLIZ = r4
            java.lang.Object r1 = r7.LIZJ(r8, r1, r6)
            if (r1 != r5) goto L53
            return r5
        L53:
            r2 = r3
            goto L32
        L55:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r9.iterator()
            goto L36
        L62:
            X.0Ksm r6 = new X.0Ksm
            r6.<init>(r7, r10)
            goto L12
        L68:
            return r3
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl.LIZLLL(android.content.Context, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[PHI: r7
      0x0026: PHI (r7v8 java.lang.Object) = (r7v5 java.lang.Object), (r7v0 java.lang.Object) binds: [B:26:0x0098, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(android.content.Context r13, final java.lang.String r14, X.InterfaceC1364105Vn r15) {
        /*
            r12 = this;
            r6 = r13
            boolean r0 = r15 instanceof X.C531430Ksn
            if (r0 == 0) goto L9b
            r2 = r15
            X.0Ksn r2 = (X.C531430Ksn) r2
            int r3 = r2.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L9b
            int r3 = r3 - r1
            r2.LLILZIL = r3
        L13:
            java.lang.Object r7 = r2.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r2.LLILZIL
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 == r1) goto L41
            if (r0 != r4) goto La2
            X.C155000ia.LIZIZ(r7)
        L26:
            return r7
        L27:
            X.C155000ia.LIZIZ(r7)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.creative.model.music.AVMusic> r0 = r12.LIZ
            java.lang.Object r7 = r0.get(r14)
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r7 = (com.ss.android.ugc.aweme.creative.model.music.AVMusic) r7
            if (r7 != 0) goto L66
            r2.LL = r14
            r2.LLILLJJLI = r6
            r2.LLILZIL = r1
            java.lang.Object r7 = r12.LIZIZ(r14, r2)
            if (r7 != r3) goto L4c
            return r3
        L41:
            java.lang.Object r6 = r2.LLILLJJLI
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r14 = r2.LL
            java.lang.String r14 = (java.lang.String) r14
            X.C155000ia.LIZIZ(r7)
        L4c:
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r7 = (com.ss.android.ugc.aweme.creative.model.music.AVMusic) r7
            if (r7 != 0) goto L66
            X.0Ksh r1 = new X.0Ksh
            r0 = -1
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r0 = "get musicInfo error"
            r3.<init>(r0)
            r4 = 0
            r6 = 16
            r5 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L66:
            r2.LL = r14
            r2.LLILLJJLI = r6
            r2.getClass()
            r2.LLILZIL = r4
            X.099m r1 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r2)
            r1.<init>(r0)
            X.0nlB r0 = X.C1403010mc7.LIZ
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r4 = r0.getMusicService()
            java.lang.String r5 = "template_music"
            X.0Ksj r10 = new X.0Ksj
            r10.<init>()
            r8 = 0
            r9 = r8
            r11 = r8
            r4.LJ(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r7 = r1.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r7 != r0) goto L98
            X.C099Q.LIZJ(r2)
        L98:
            if (r7 != r3) goto L26
            return r3
        L9b:
            X.0Ksn r2 = new X.0Ksn
            r2.<init>(r12, r15)
            goto L13
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl.LJFF(android.content.Context, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(android.content.Context r14, final java.lang.String r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl.LJI(android.content.Context, java.lang.String, X.05Vn):java.lang.Object");
    }
}
