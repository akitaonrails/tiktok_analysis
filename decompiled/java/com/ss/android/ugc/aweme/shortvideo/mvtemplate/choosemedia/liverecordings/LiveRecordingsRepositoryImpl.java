package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings;

import X.C01GW;
import X.C095D;
import X.C0CHQ;
import X.C0PEM;
import X.C13BV;
import X.C19292410dm;
import X.C1DFH;
import X.C201955140j;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C273130An9;
import X.C452501pT;
import X.C516501zn;
import X.C522560KeU;
import X.C533520KwA;
import X.C533540KwC;
import X.C533670KwP;
import X.C533680KwQ;
import X.C533720KwU;
import X.C533770KwZ;
import X.C817503Hh;
import X.InterfaceC346201Wa;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsConfigResponse;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class LiveRecordingsRepositoryImpl implements LiveRecordingsRepository {
    public final String LIZIZ = "LiveRecordingsRepositoryImpl";
    public final Keva LIZJ = (Keva) ((C533720KwU) C533670KwP.LIZ.getValue()).LIZ();
    public final LiveRecordingsDatabaseImpl LIZLLL = (LiveRecordingsDatabaseImpl) C533670KwP.LIZIZ.getValue();
    public final LiveRecordingsService LJ;
    public final C01GW LJFF;
    public LiveRecordingsConfigResponse LJI;
    public Boolean LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository
    public final long LIZ() {
        long j = this.LJIIJ;
        if (j != 0) {
            return j;
        }
        long j2 = this.LIZJ.getLong("live_recordings_new_time_stamp", 0L);
        this.LJIIJ = j2;
        return j2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository
    public final boolean LIZIZ() {
        String uid;
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            uid = "null_user";
        }
        sbLIZ.append(uid);
        sbLIZ.append("live_recordings_floating_banner_shown");
        return !keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository
    public final void LIZJ() {
        String uid;
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            uid = "null_user";
        }
        sbLIZ.append(uid);
        sbLIZ.append("live_recordings_floating_banner_shown");
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC346201Wa LJFF() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService r0 = r4.LJ
            if (r0 == 0) goto L1e
            boolean r1 = r0.isEnable()
            r0 = 1
            if (r1 != r0) goto L1e
        Lb:
            r3 = 0
            if (r0 != 0) goto L20
            X.0KwZ r2 = X.C533770KwZ.LIZIZ
            java.lang.String r1 = r4.LIZIZ
            java.lang.String r0 = "LiveRecordings not enabled"
            X.C201955140j.LJIJJ(r2, r1, r0)
            X.01zn r1 = new X.01zn
            r0 = 1
            r1.<init>(r3, r0)
            return r1
        L1e:
            r0 = 0
            goto Lb
        L20:
            X.0Kux r1 = new X.0Kux
            r1.<init>(r4, r3)
            X.095D r0 = new X.095D
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl.LJFF():X.01Wa");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository
    public final void LJI() {
        long j = this.LJIIIZ;
        if (j == 0 || j == this.LJIIJ) {
            return;
        }
        this.LIZJ.storeLong("live_recordings_new_time_stamp", j);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository
    public final void onDestroy() {
        this.LJIIJ = 0L;
        this.LJIIIZ = 0L;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository
    public final void release() {
        this.LJIIIIZZ = 0L;
        this.LJII = null;
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C533520KwA(this, null), 2);
    }

    public LiveRecordingsRepositoryImpl() {
        LiveRecordingsService.LIZ.getClass();
        this.LJ = C522560KeU.LIZ();
        this.LJFF = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(155));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository
    public final LiveRecordingsConfigResponse LIZLLL() {
        return this.LJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(boolean r11, X.InterfaceC1364105Vn<? super java.util.List<X.C533710KwT>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C532790Kuz
            if (r0 == 0) goto L74
            r6 = r12
            X.0Kuz r6 = (X.C532790Kuz) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            java.lang.String r3 = "live_recordings_clean_all_duration"
            r8 = 2
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 == r4) goto L82
            if (r0 != r8) goto L7a
            X.C155000ia.LIZIZ(r5)
        L27:
            return r5
        L28:
            X.C155000ia.LIZIZ(r5)
            r5 = 0
            if (r11 != 0) goto L54
            com.bytedance.keva.Keva r2 = r10.LIZJ
            r0 = 0
            long r0 = r2.getLong(r3, r0)
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L27
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl r1 = r10.LIZLLL
            if (r1 == 0) goto L85
            r6.LLILLL = r4
            X.0KwE r0 = new X.0KwE
            r0.<init>(r1, r5)
            java.lang.Object r5 = X.C2296908zH.LIZIZ(r0, r6)
            if (r5 != r7) goto L85
            return r7
        L54:
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 2678400000(0x9fa52400, double:1.323305426E-314)
            long r2 = r2 - r0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl r4 = r10.LIZLLL
            if (r4 == 0) goto L27
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            r6.LLILLL = r8
            X.0KwH r0 = new X.0KwH
            r0.<init>(r4, r2, r5)
            java.lang.Object r5 = X.C2296908zH.LIZIZ(r0, r6)
            if (r5 != r7) goto L27
            return r7
        L74:
            X.0Kuz r6 = new X.0Kuz
            r6.<init>(r10, r12)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L82:
            X.C155000ia.LIZIZ(r5)
        L85:
            com.bytedance.keva.Keva r2 = r10.LIZJ
            long r0 = java.lang.System.currentTimeMillis()
            r2.storeLong(r3, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl.LJII(boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository
    public final InterfaceC346201Wa LJ(C533680KwQ c533680KwQ, int i, boolean z) {
        LiveRecordingsService liveRecordingsService = this.LJ;
        if (liveRecordingsService != null && liveRecordingsService.isEnable()) {
            if (((Number) C273130An9.LIZ.getValue()).intValue() > 0) {
                if (z) {
                    this.LJIIIIZZ = 0L;
                    this.LJII = null;
                }
                return new C095D(new C533540KwC(z, this, c533680KwQ, i, null));
            }
            C201955140j.LJIJJ(C533770KwZ.LIZIZ, this.LIZIZ, "Live Recordings not enabled");
            return new C516501zn(new Pair(C13BV.INSTANCE, this.LJII), 1);
        }
        return new C516501zn(new Pair(C13BV.INSTANCE, this.LJII), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsListHighlightItem r21, X.C533710KwT r22, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r23) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl.LJIIIZ(com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsListHighlightItem, X.0KwT, X.05Vn):java.lang.Object");
    }

    public static void LJIIIIZZ(int i, int i2, long j, C533680KwQ c533680KwQ) {
        String uid;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("highlights_cnt", String.valueOf(i));
        linkedHashMap.put("error_code", String.valueOf(i2));
        linkedHashMap.put("duration", String.valueOf(j));
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            uid = "null_user";
        }
        linkedHashMap.put("anchor_id", uid);
        linkedHashMap.put("creation_id", c533680KwQ.LIZ);
        linkedHashMap.put("shoot_way", c533680KwQ.LIZIZ);
        linkedHashMap.put("shoot_tab_name", c533680KwQ.LIZJ);
        linkedHashMap.put("enter_from", c533680KwQ.LIZLLL);
        C20684815ws.LJIILLIIL("live_recordings_tab_request", linkedHashMap);
    }
}
