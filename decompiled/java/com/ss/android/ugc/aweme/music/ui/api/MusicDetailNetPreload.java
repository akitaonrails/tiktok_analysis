package com.ss.android.ugc.aweme.music.ui.api;

import X.C1499810p8F;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailNetPreload implements InterfaceC727570SgN<MusicDetailApi.DetailApi, Future<MusicDetail>> {
    public final boolean isMCAUser() {
        return ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL() && !((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[PHI: r1 r2 r3
      0x0023: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:13:0x0021, B:27:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r2v3 int) = (r2v1 int), (r2v4 int) binds: [B:13:0x0021, B:27:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:13:0x0021, B:27:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f A[PHI: r3
      0x004f: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:10:0x001d, B:8:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC20153313tL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean enable(android.os.Bundle r7) {
        /*
            r6 = this;
            X.01GW r0 = X.C263020ASm.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 0
            if (r0 == 0) goto L10
            return r5
        L10:
            java.lang.String r4 = ""
            if (r7 == 0) goto L1c
            java.lang.String r0 = "id"
            java.lang.String r3 = r7.getString(r0)
            if (r3 != 0) goto L4f
        L1c:
            r3 = r4
            if (r7 != 0) goto L4f
            r2 = 0
        L20:
            r1 = r4
            if (r7 == 0) goto L2c
        L23:
            java.lang.String r0 = "partnerName"
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L2c
            r4 = r0
        L2c:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L43
            X.0OsO r1 = X.C633100OsO.LIZ
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r1.getClass()
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = X.C633100OsO.LIZ(r3, r0)
            if (r0 != 0) goto L42
        L41:
            r5 = 1
        L42:
            return r5
        L43:
            X.0OsO r0 = X.C633100OsO.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = X.C633100OsO.LIZ(r1, r4)
            if (r0 != 0) goto L42
            goto L41
        L4f:
            java.lang.String r0 = "click_reason"
            int r2 = r7.getInt(r0)
            java.lang.String r0 = "partnerMusicId"
            java.lang.String r1 = r7.getString(r0)
            if (r1 != 0) goto L23
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload.enable(android.os.Bundle):boolean");
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 0, false, 29);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[PHI: r3 r7
      0x0021: PHI (r3v1 int) = (r3v6 int), (r3v7 int) binds: [B:12:0x001f, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0021: PHI (r7v0 java.lang.String) = (r7v5 java.lang.String), (r7v6 java.lang.String) binds: [B:12:0x001f, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[PHI: r3 r7
      0x0029: PHI (r3v5 int) = (r3v1 int), (r3v6 int) binds: [B:14:0x0027, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r7v4 java.lang.String) = (r7v0 java.lang.String), (r7v5 java.lang.String) binds: [B:14:0x0027, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[PHI: r3 r6 r7
      0x002c: PHI (r3v4 int) = (r3v1 int), (r3v5 int) binds: [B:14:0x0027, B:16:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:14:0x0027, B:16:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:14:0x0027, B:16:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034 A[PHI: r3 r6 r7
      0x0034: PHI (r3v2 int) = (r3v4 int), (r3v5 int) binds: [B:18:0x0032, B:16:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r6v1 java.lang.String) = (r6v3 java.lang.String), (r6v4 java.lang.String) binds: [B:18:0x0032, B:16:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r7v1 java.lang.String) = (r7v3 java.lang.String), (r7v4 java.lang.String) binds: [B:18:0x0032, B:16:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.concurrent.Future<com.ss.android.ugc.aweme.music.model.MusicDetail> preload2(android.os.Bundle r12, kotlin.jvm.functions.Function1<? super java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi>, ? extends com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi> r13) {
        /*
            r11 = this;
            java.lang.String r10 = ""
            if (r12 == 0) goto Lc
            java.lang.String r0 = "id"
            java.lang.String r4 = r12.getString(r0)
            if (r4 != 0) goto Ld
        Lc:
            r4 = r10
        Ld:
            r2 = 0
            if (r12 == 0) goto L86
            java.lang.String r0 = "click_reason"
            int r3 = r12.getInt(r0)
            java.lang.String r0 = "partnerMusicId"
            java.lang.String r7 = r12.getString(r0)
            if (r7 != 0) goto L21
        L1e:
            r7 = r10
            if (r12 == 0) goto L29
        L21:
            java.lang.String r0 = "partnerName"
            java.lang.String r6 = r12.getString(r0)
            if (r6 != 0) goto L2c
        L29:
            r6 = r10
            if (r12 == 0) goto L34
        L2c:
            java.lang.String r0 = "aweme_id"
            java.lang.String r9 = r12.getString(r0)
            if (r9 != 0) goto L35
        L34:
            r9 = r10
        L35:
            java.lang.String r1 = "video_id"
            if (r12 == 0) goto L84
            java.lang.String r0 = r12.getString(r1)
            if (r0 == 0) goto L40
            r10 = r0
        L40:
            java.lang.String r0 = "extra_enter_from"
            int r0 = r12.getInt(r0, r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L4a:
            boolean r5 = r11.isMCAUser()
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            java.lang.String r0 = "item_id"
            r2.put(r0, r9)
            r2.put(r1, r10)
            if (r8 == 0) goto L6d
            int r1 = r8.intValue()
            r0 = 1
            if (r1 != r0) goto L6d
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = r8.toString()
            r2.put(r1, r0)
        L6d:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L95
            boolean r0 = X.C305420By8.LIZ
            if (r0 == 0) goto L88
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class
            java.lang.Object r0 = r13.invoke(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi r0 = (com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi) r0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.queryMusicWithHighPriority(r4, r3, r5, r2)
            return r0
        L84:
            r8 = 0
            goto L4a
        L86:
            r3 = 0
            goto L1e
        L88:
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class
            java.lang.Object r0 = r13.invoke(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi r0 = (com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi) r0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.queryMusic(r4, r3, r5, r2)
            return r0
        L95:
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class
            java.lang.Object r0 = r13.invoke(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi r0 = (com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi) r0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.queryPartnerMusic(r7, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload.preload2(android.os.Bundle, kotlin.jvm.functions.Function1):com.google.common.util.concurrent.ListenableFuture");
    }
}
