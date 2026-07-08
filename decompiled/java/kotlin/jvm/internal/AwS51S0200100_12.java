package kotlin.jvm.internal;

import X.AbstractC768220UBo;
import X.C09AY;
import X.C0IJT;
import X.C0THP;
import X.C0UBZ;
import X.C0UDG;
import X.C13BV;
import X.C1836150xsj;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C766270U4b;
import X.C768190UBl;
import X.InterfaceC2262081DgM;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tikcast.api.anchor.AnchorLiveReplayFrameResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AwS51S0200100_12 extends C09AY implements Function2 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS51S0200100_12 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            X.0UDJ r8 = (X.C0UDJ) r8
            java.lang.String r0 = "EffectAuthorInfoView"
            X.0IjA r4 = X.C0IJT.LIZ(r0)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r6.j2
            long r2 = r2 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "time"
            r4.LJJII(r1, r0)
            r4.LIZ()
            java.lang.Object r0 = r6.l0
            X.0UDG r0 = (X.C0UDG) r0
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r0.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            r4 = 0
            if (r0 == 0) goto L98
            java.lang.Object r1 = r6.l0
            X.0UDG r1 = (X.C0UDG) r1
            boolean r0 = r1.LLIZLLLIL
            if (r0 != 0) goto L98
            if (r8 != 0) goto L5f
            X.0GpI r1 = r1.LLIZ
            r0 = 2131841505(0x7f1151e1, float:1.931632E38)
            r1.setText(r0)
        L3a:
            java.lang.Object r0 = r6.l0
            X.0UDG r0 = (X.C0UDG) r0
            X.0GpI r0 = r0.LLIZ
            r0.LJJJJI()
            java.lang.Object r0 = r6.l0
            X.0UDG r0 = (X.C0UDG) r0
            r0.LIZJ()
            java.lang.Object r1 = r6.l0
            X.0UDG r1 = (X.C0UDG) r1
            Y.ARunnableS112S0100000_12 r0 = r1.LLJ
            com.bytedance.bpea.transmit.hook.HandlerHook.viewRemoveCallbacks(r1, r0)
            r1.LLIZLLLIL = r4
            java.lang.Object r0 = r6.l0
            X.0UDG r0 = (X.C0UDG) r0
            r0.LIZ()
        L5c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5f:
            r5 = 1
            r1.LLILZ = r5
            X.0GpI r3 = r1.LLIZ
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            boolean r0 = X.C497740JfY.LJJ()
            android.text.BidiFormatter r1 = android.text.BidiFormatter.getInstance(r0)
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r1.unicodeWrap(r0)
            r2[r4] = r0
            boolean r0 = X.C497740JfY.LJJ()
            android.text.BidiFormatter r1 = android.text.BidiFormatter.getInstance(r0)
            java.lang.String r0 = r8.LIZ
            java.lang.String r0 = r1.unicodeWrap(r0)
            r2[r5] = r0
            r0 = 2131841504(0x7f1151e0, float:1.9316318E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r2)
            r3.setText(r0)
            goto L3a
        L98:
            java.lang.Object r1 = r6.l0
            X.0UDG r1 = (X.C0UDG) r1
            Y.ARunnableS112S0100000_12 r0 = r1.LLJ
            com.bytedance.bpea.transmit.hook.HandlerHook.viewRemoveCallbacks(r1, r0)
            r1.LLIZLLLIL = r4
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS51S0200100_12.invoke$0(kotlin.jvm.internal.AwS51S0200100_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS51S0200100_12 awS51S0200100_12, Object obj, Object obj2) {
        String errorMessage;
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        BaseException baseException = (BaseException) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FileDownload-onFailed, albumId: ");
        sbLIZ.append(awS51S0200100_12.j2);
        sbLIZ.append(", accompanimentId: ");
        sbLIZ.append(((Accompaniment) awS51S0200100_12.l0).id);
        sbLIZ.append(", exception: ");
        if (baseException != null) {
            errorMessage = baseException.getErrorMessage();
        } else {
            errorMessage = null;
        }
        sbLIZ.append(errorMessage);
        C20441214yg.LJ("AccompanimentManager", C2188811AlT.LIZIZ(sbLIZ));
        if (baseException != null && baseException.getErrorCode() == 1006) {
            C766270U4b.LIZLLL(2131842668);
        }
        if (downloadInfo != null) {
            long j = awS51S0200100_12.j2;
            Accompaniment accompaniment = (Accompaniment) awS51S0200100_12.l0;
            AbstractC768220UBo abstractC768220UBo = (AbstractC768220UBo) awS51S0200100_12.l1;
            CopyOnWriteArrayList<Accompaniment> copyOnWriteArrayList = C0UBZ.LLJJ.get(Long.valueOf(j));
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(accompaniment);
            }
            C0UBZ c0ubz = C0UBZ.LL;
            C0UBZ.LIZ(Long.valueOf(j));
            C0UBZ.LJIILIIL(j);
            if (abstractC768220UBo != null) {
                new C768190UBl(downloadInfo, accompaniment);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS51S0200100_12 awS51S0200100_12, Object obj, Object obj2) {
        List list;
        User user;
        AnchorLiveReplayFrameResponse.ResponseData responseData = (AnchorLiveReplayFrameResponse.ResponseData) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (responseData == null || (list = responseData.frameList) == null) {
            list = C13BV.INSTANCE;
        }
        ((Function1) awS51S0200100_12.l0).invoke(list);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentHashMap<Long, Long> concurrentHashMap = C0THP.LIZ;
        Long l = concurrentHashMap.get(Long.valueOf(awS51S0200100_12.j2));
        if (l != null) {
            long jLongValue = l.longValue();
            long j = awS51S0200100_12.j2;
            String str = ((C1836150xsj) awS51S0200100_12.l1).LIZJ;
            Integer numValueOf = Integer.valueOf(iIntValue);
            long j2 = jCurrentTimeMillis - jLongValue;
            concurrentHashMap.remove(Long.valueOf(j));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_replay_track_image_load");
            c474500IjALIZ.LJJII(str, "room_id");
            InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
            Long lValueOf = null;
            if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
                lValueOf = Long.valueOf(user.getId());
            }
            c474500IjALIZ.LJJII(lValueOf, "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(j2), "duration");
            if (numValueOf != null) {
                numValueOf.intValue();
                c474500IjALIZ.LJJII(numValueOf, "errorCode");
            }
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0200100_12(long j, C0UDG c0udg, LiveEffect liveEffect, int i) {
        super(2);
        this.$t = i;
        this.j2 = j;
        this.l0 = c0udg;
        this.l1 = liveEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0200100_12(long j, Accompaniment accompaniment, AbstractC768220UBo abstractC768220UBo, int i) {
        super(2);
        this.$t = i;
        this.j2 = j;
        this.l0 = accompaniment;
        this.l1 = abstractC768220UBo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0200100_12(AwS591S0100000_12 awS591S0100000_12, long j, C1836150xsj c1836150xsj, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS591S0100000_12;
        this.j2 = j;
        this.l1 = c1836150xsj;
    }
}
