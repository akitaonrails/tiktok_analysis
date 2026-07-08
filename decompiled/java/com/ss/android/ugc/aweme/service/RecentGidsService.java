package com.ss.android.ugc.aweme.service;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09JN;
import X.C0VNS;
import X.C0XQ7;
import X.C1150504el;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C13BV;
import X.C1587150rP7;
import X.C1589640rT8;
import X.C1697810uHb;
import X.C452501pT;
import X.C797630VQr;
import X.C854780Xg4;
import X.InterfaceC1478005qU;
import X.InterfaceC797620VQq;
import Y.AfS1S0000200_13;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabRedDotOptimizationSettings;
import com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class RecentGidsService implements IRecentGidsService {
    public final C11NJ LIZ = new C11NJ();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C797630VQr());

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final C11NZ<List<C0VNS>> LJFF() {
        return C11NZ.LJIJJLI(new C854780Xg4(this, 1)).LJL(C11S5.LIZ()).LJJIJIIJIL(new C09JN() { // from class: X.0VPB
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecentGidsService@4f41.getStoryViewedGidsAsync$2");
                C1C7U.LIZIZ("RecentGidsService@4f41.getStoryViewedGidsAsync$2");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0VPC
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecentGidsService@4f41.getStoryViewedGidsAsync$3");
                C1C7U.LIZIZ("RecentGidsService@4f41.getStoryViewedGidsAsync$3");
            }
        });
    }

    public final InterfaceC797620VQq LJIIJ() {
        return (InterfaceC797620VQq) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final void LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - C1150504el.LIZ().LJJIII;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long j2 = jCurrentTimeMillis - (FriendsTabRedDotOptimizationSettings.LIZ().expireTimeSeconds * 1000);
        this.LIZ.LIZ(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0VQp
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Integer> c09aj) {
                C1C7U.LIZ("RecentGidsService@4f41.deleteExpiredEntities$1");
                C1583300rIu.LIZ.getClass();
                if (C1583300rIu.LIZIZ()) {
                    long j3 = FriendsTabRedDotOptimizationSettings.LIZ().expireTimeSeconds * 1000;
                    long j4 = FriendsTabRedDotOptimizationSettings.LIZ().expireTimeSeconds * 1000;
                    long jLJIIZILJ = C1587150rP7.LIZIZ.LJIIZILJ(j4);
                    InterfaceC797620VQq interfaceC797620VQqLJIIJ = this.LIZ.LJIIJ();
                    long j5 = jCurrentTimeMillis;
                    c09aj.onNext(Integer.valueOf(interfaceC797620VQqLJIIJ.LJI(j5 - j3, jLJIIZILJ, j5 - j4)));
                } else {
                    c09aj.onNext(Integer.valueOf(this.LIZ.LJIIJ().LIZLLL(j2)));
                }
                c09aj.onComplete();
                C1C7U.LIZIZ("RecentGidsService@4f41.deleteExpiredEntities$1");
            }
        }).LJL(C11S5.LIZ()).LJJLL(new AfS1S0000200_13(j, jElapsedRealtime, 0), new AfS1S0000200_13(j, jElapsedRealtime, 1)));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final List<C0VNS> LIZIZ() {
        try {
            return LJIIJ().LIZIZ(195, C1587150rP7.LIZIZ.LJJII(true), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final List<C0VNS> LJI() {
        try {
            return LJIIJ().LJII((int) FriendsTabRedDotOptimizationSettings.LIZ().playedItemsCountLimit, C0XQ7.LJFF().getCurUserId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final List<C0VNS> LIZJ(Long l) {
        long jU2;
        try {
            if (l != null) {
                jU2 = l.longValue();
            } else {
                jU2 = C1589640rT8.LIZIZ.U2();
            }
            return LJIIJ().LIZIZ(31, jU2, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final C11NZ<List<C0VNS>> LIZLLL(final int i) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0VQo
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<List<C0VNS>> c09aj) {
                C1C7U.LIZ("RecentGidsService@4f41.getAllNonFriendsRecordsAsync$1");
                c09aj.onNext(this.LIZ.LJIIJ().LIZ(i, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()));
                c09aj.onComplete();
                C1C7U.LIZIZ("RecentGidsService@4f41.getAllNonFriendsRecordsAsync$1");
            }
        }).LJL(C11S5.LIZ()).LJJIJIIJIL(new C09JN() { // from class: X.0VP9
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecentGidsService@4f41.getAllNonFriendsRecordsAsync$2");
                C1C7U.LIZIZ("RecentGidsService@4f41.getAllNonFriendsRecordsAsync$2");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0VPA
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecentGidsService@4f41.getAllNonFriendsRecordsAsync$3");
                C1C7U.LIZIZ("RecentGidsService@4f41.getAllNonFriendsRecordsAsync$3");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final void LJ(C0VNS c0vns) {
        LJII(C1697810uHb.LJ(c0vns)).LJJLL(new C09JN() { // from class: X.0VO2
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecentGidsService@4f41.insertSingleEntity$1");
                C1C7U.LIZIZ("RecentGidsService@4f41.insertSingleEntity$1");
            }
        }, new C09JN() { // from class: X.0VO1
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RecentGidsService@4f41.insertSingleEntity$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AwemeReadRecordDao insertEntity failed ");
                sbLIZ.append(obj);
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("RecentGidsService@4f41.insertSingleEntity$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final C11NZ<Unit> LJII(final List<C0VNS> list) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0VQn
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Unit> c09aj) {
                C1C7U.LIZ("RecentGidsService@4f41.insertEntitiesRx$1");
                C797690VQx.LIZJ(list);
                this.LJIIJ().LJIIIZ(list);
                c09aj.onNext(Unit.LIZ);
                c09aj.onComplete();
                C1C7U.LIZIZ("RecentGidsService@4f41.insertEntitiesRx$1");
            }
        }).LJL(C11S5.LIZ()).LJJIJIIJIL(new C09JN() { // from class: X.0VPD
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecentGidsService@4f41.insertEntitiesRx$2");
                C1C7U.LIZIZ("RecentGidsService@4f41.insertEntitiesRx$2");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0VPE
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecentGidsService@4f41.insertEntitiesRx$3");
                C1C7U.LIZIZ("RecentGidsService@4f41.insertEntitiesRx$3");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final List<C0VNS> LJIIIZ(Long l) {
        try {
            if (l == null) {
                return LJIIJ().LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            }
            return LJIIJ().LJIIIIZZ(l.longValue(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final void LJIIIIZZ(final C0VNS c0vns, final int i, final int i2) {
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0VQm
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<String> c09aj) {
                C0VNS next;
                boolean z;
                C1C7U.LIZ("RecentGidsService@4f41.insertInFeedReadEntity$1");
                Iterator<C0VNS> it2 = this.LIZ.LJIIJ().LJ(c0vns.LIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LJFF == 0) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0VNS c0vns2 = next;
                int i3 = i2;
                if (i3 != 1 && i3 != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (c0vns2 == null || c0vns2.LIZIZ == 0 || (((Boolean) C260160AHm.LIZ.getValue()).booleanValue() && i == 31 && z)) {
                    C797690VQx.LIZJ(Collections.singletonList(c0vns));
                    this.LIZ.LJIIJ().LJIIIZ(C1697810uHb.LJ(c0vns));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("insertFriendsFeedReadEntity unread insert ");
                    sbLIZ.append(c0vns.LIZ);
                    c09aj.onNext(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("insertFriendsFeedReadEntity read already ");
                    sbLIZ2.append(c0vns.LIZ);
                    c09aj.onNext(C2188811AlT.LIZIZ(sbLIZ2));
                }
                c09aj.onComplete();
                C1C7U.LIZIZ("RecentGidsService@4f41.insertInFeedReadEntity$1");
            }
        }).LJL(C11S5.LIZ()).LJJIJIIJIL(new C09JN() { // from class: X.0VPF
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecentGidsService@4f41.insertInFeedReadEntity$2");
                C1C7U.LIZIZ("RecentGidsService@4f41.insertInFeedReadEntity$2");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0VPG
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecentGidsService@4f41.insertInFeedReadEntity$3");
                C1C7U.LIZIZ("RecentGidsService@4f41.insertInFeedReadEntity$3");
            }
        }).LJJLJ();
    }
}
