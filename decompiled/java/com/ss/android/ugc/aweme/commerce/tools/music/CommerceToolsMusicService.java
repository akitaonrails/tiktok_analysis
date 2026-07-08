package com.ss.android.ugc.aweme.commerce.tools.music;

import X.C1446650nkV;
import X.C15MJ;
import X.C15MY;
import X.InterfaceC20506815Mc;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS275S0300000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceToolsMusicService implements ICommerceToolsMusicService {
    public static final C15MJ LLILLJJLI = new Object() { // from class: X.15MJ
    };
    public AVMusic LL;

    @Override // com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService
    public boolean yi2() {
        return C1446650nkV.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.creative.model.music.AVMusic r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            boolean r0 = r9.isOriginalSound()
            if (r0 != 0) goto L92
            boolean r0 = r9.isCommerceMusic()
            if (r0 != 0) goto L92
            X.15MA r1 = X.C15MA.LL
            r1.getClass()
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = X.C15MA.LLJJI
            if (r0 == 0) goto L93
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != r2) goto L93
        L25:
            boolean r0 = r1.getInCommercialSoundPage()
            java.lang.String r3 = "action_originated_from"
            java.lang.String r4 = "music_from_section"
            java.lang.String r5 = "category_id"
            java.lang.String r6 = "music_id"
            if (r0 == 0) goto L64
            X.09Gk r7 = new X.09Gk
            r7.<init>()
            long r0 = r9.id
            r7.LIZLLL(r0, r6)
            java.lang.String r0 = r9.getCategoryID()
            r7.LJIIIIZZ(r5, r0)
            java.lang.String r0 = "is_ba"
            r7.LIZJ(r2, r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$FromSection r0 = r9.getFromSection()
            java.lang.String r0 = r0.value
            r7.LJIIIIZZ(r4, r0)
            com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin r0 = X.C15MA.LIZ()
            java.lang.String r0 = r0.toString()
            r7.LJIIIIZZ(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.LIZ
            java.lang.String r0 = "ttba_csp_use_non_commercial_music_exception"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L64:
            if (r2 == 0) goto L92
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            long r0 = r9.id
            r2.LIZLLL(r0, r6)
            java.lang.String r0 = r9.getCategoryID()
            r2.LJIIIIZZ(r5, r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$FromSection r0 = r9.getFromSection()
            java.lang.String r0 = r0.value
            r2.LJIIIIZZ(r4, r0)
            com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin r0 = X.C15MA.LIZ()
            java.lang.String r0 = r0.toString()
            r2.LJIIIIZZ(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "ttba_ba_use_non_commercial_music_exception"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L92:
            return
        L93:
            r2 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService.LIZIZ(com.ss.android.ugc.aweme.creative.model.music.AVMusic):void");
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService
    public InterfaceC20506815Mc mA(C15MY c15my) {
        return new CommerceMusicPublishModule(c15my);
    }

    private final void LIZJ(AVMusic aVMusic, Function0<Unit> function0) {
        AVMusic aVMusic2;
        if (aVMusic != null && (aVMusic2 = this.LL) != null && aVMusic.id == aVMusic2.id) {
            return;
        }
        function0.invoke();
        this.LL = aVMusic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.creative.model.music.AVMusic r7, java.lang.Integer r8) {
        /*
            r6 = this;
            X.15MA r2 = X.C15MA.LL
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService> r0 = com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService r0 = (com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService) r0
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto L20
            r2.getClass()
            X.15M9 r1 = X.C15MA.LLJILLL
            X.1Bqa<java.lang.Object>[] r0 = X.C15MA.LLILLJJLI
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.LIZ(r0)
        L20:
            boolean r5 = r2.getInCommercialSoundPage()
            r3 = 1
            if (r5 == 0) goto La5
            if (r7 == 0) goto La5
            r4 = 1
        L2a:
            if (r8 == 0) goto L2f
            X.C15MA.LJFF(r8)
        L2f:
            X.C1446500nkG.LJFF = r4
            r0 = 0
            if (r4 == 0) goto La3
            X.15M9 r2 = X.C15MA.LLILZLL
            X.1Bqa<java.lang.Object>[] r1 = X.C15MA.LLILLJJLI
            V r1 = r2.LIZ
            java.lang.String r1 = (java.lang.String) r1
        L3c:
            X.C1446500nkG.LIZ = r1
            if (r4 == 0) goto La1
            X.15M9 r2 = X.C15MA.LLJ
            X.1Bqa<java.lang.Object>[] r1 = X.C15MA.LLILLJJLI
            V r1 = r2.LIZ
            java.lang.String r1 = (java.lang.String) r1
        L48:
            X.C1446500nkG.LIZLLL = r1
            if (r4 == 0) goto L9f
            X.15M9 r2 = X.C15MA.LLIZLLLIL
            X.1Bqa<java.lang.Object>[] r1 = X.C15MA.LLILLJJLI
            V r1 = r2.LIZ
            java.lang.String r1 = (java.lang.String) r1
        L54:
            X.C1446500nkG.LIZJ = r1
            if (r4 == 0) goto L9d
            X.15M9 r2 = X.C15MA.LLIZ
            X.1Bqa<java.lang.Object>[] r1 = X.C15MA.LLILLJJLI
            V r1 = r2.LIZ
            java.lang.String r1 = (java.lang.String) r1
        L60:
            X.C1446500nkG.LIZIZ = r1
            if (r4 == 0) goto L6c
            X.15M9 r1 = X.C15MA.LLJI
            X.1Bqa<java.lang.Object>[] r0 = X.C15MA.LLILLJJLI
            V r0 = r1.LIZ
            java.lang.Integer r0 = (java.lang.Integer) r0
        L6c:
            X.C1446500nkG.LJ = r0
            if (r5 == 0) goto L9a
            if (r7 == 0) goto L99
            boolean r0 = r7.isCommerceMusic()
            if (r0 != 0) goto L7d
            java.lang.String r0 = "non-commercial music appears in Commercial Sound Page"
            X.C1AF0.LIZJ(r0)
        L7d:
            X.15MF r0 = X.C15MA.LIZIZ()
            if (r0 != 0) goto L99
            com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin r0 = X.C15MA.LIZ()
            int[] r1 = X.C15MB.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto La9
            r0 = 2
            if (r1 != r0) goto L99
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$FromSection r0 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.FromSection.CHALLENGE
            r7.setFromSection(r0)
        L99:
            return
        L9a:
            if (r7 == 0) goto L99
            goto L7d
        L9d:
            r1 = r0
            goto L60
        L9f:
            r1 = r0
            goto L54
        La1:
            r1 = r0
            goto L48
        La3:
            r1 = r0
            goto L3c
        La5:
            r4 = 0
            if (r5 == 0) goto L2f
            goto L2a
        La9:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$FromSection r0 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.FromSection.EFFECT
            r7.setFromSection(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService.LJFF(com.ss.android.ugc.aweme.creative.model.music.AVMusic, java.lang.Integer):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0132  */
    @Override // com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.String> VS0(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9, java.lang.String... r10) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService.VS0(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String[]):java.util.Map");
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService
    public void s90(AVMusic aVMusic, Integer num) {
        LIZJ(aVMusic, new AwS275S0300000_31(this, aVMusic, num, 16));
    }
}
