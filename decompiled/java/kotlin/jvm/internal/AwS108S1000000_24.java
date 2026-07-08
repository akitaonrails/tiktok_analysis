package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C1556460qbc;
import X.C1563970qnj;
import X.C1564050qnr;
import X.C1573010r2J;
import X.C1575440r6E;
import X.C1575960r74;
import X.C1577260r9A;
import X.C1587220rPE;
import X.C1604250rqh;
import X.C1896810zSZ;
import X.C21202017y6;
import X.C2188811AlT;
import X.C2275711E5p;
import X.C2341109Fh;
import X.C786410Ut5;
import Y.ARunnableS15S1000000_24;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.service.IInteractiveService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS108S1000000_24 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S1000000_24(int i) {
        super(0);
        this.$t = i;
        this.s0 = "acting_area_bottom";
    }

    public static final Object invoke$0(AwS108S1000000_24 awS108S1000000_24) {
        return Boolean.valueOf(!TextUtils.equals("from_mix_video", awS108S1000000_24.s0));
    }

    public static final Object invoke$1(AwS108S1000000_24 awS108S1000000_24) {
        if (Intrinsics.LJFF(awS108S1000000_24.s0, "homepage_series")) {
            return C1577260r9A.LIZ;
        }
        return C1573010r2J.LIZ.get(awS108S1000000_24.s0);
    }

    public static final Object invoke$10(AwS108S1000000_24 awS108S1000000_24) {
        if (awS108S1000000_24.s0 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1587220rPE.LIZ.getClass();
            C01GW c01gw = C1587220rPE.LJ;
            long j = ((Keva) c01gw.getValue()).getLong(awS108S1000000_24.s0, -1L);
            if (j > 0 && jCurrentTimeMillis - j <= ((Number) C2275711E5p.LJIIIIZZ.getValue()).intValue()) {
                int i = C1587220rPE.LIZ().getInt(awS108S1000000_24.s0, 0);
                int i2 = i + 1;
                C1587220rPE.LIZ().storeInt(awS108S1000000_24.s0, i2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("add user avatar show time, is in valid time, oldShowTime = ");
                sbLIZ.append(i);
                sbLIZ.append(", new = ");
                sbLIZ.append(i2);
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                ((Keva) c01gw.getValue()).storeLong(awS108S1000000_24.s0, System.currentTimeMillis());
                C1587220rPE.LIZ().storeInt(awS108S1000000_24.s0, 1);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS108S1000000_24 awS108S1000000_24) {
        if (awS108S1000000_24.s0 != null) {
            C1587220rPE.LIZ.getClass();
            C1587220rPE.LIZ().storeInt(awS108S1000000_24.s0, Math.max(0, C1587220rPE.LIZ().getInt(awS108S1000000_24.s0, 0) - 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS108S1000000_24 awS108S1000000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start to remove session launch: ");
        sbLIZ.append(awS108S1000000_24.s0);
        sbLIZ.append(" ...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AwS108S1000000_24 awS108S1000000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start to remove session: ");
        sbLIZ.append(awS108S1000000_24.s0);
        sbLIZ.append(" ...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS108S1000000_24 awS108S1000000_24) {
        C1604250rqh.LIZJ.offer(awS108S1000000_24.s0);
        C786410Ut5.LJJZZIII(C1604250rqh.LIZIZ, new ARunnableS15S1000000_24(awS108S1000000_24.s0, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS108S1000000_24 awS108S1000000_24) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsPopCardListenerManager unpinSubScene subScene=");
        sbLIZ.append(awS108S1000000_24.s0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C1563970qnj.LJFF.remove(awS108S1000000_24.s0);
        C1563970qnj.LIZIZ(awS108S1000000_24.s0);
        C1563970qnj.LJ.remove(awS108S1000000_24.s0);
        List listLIZ = C1563970qnj.LIZ();
        String str = awS108S1000000_24.s0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZ) {
            if (Intrinsics.LJFF(((C1556460qbc) obj).LIZIZ, str)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C1556460qbc) it2.next()).LIZJ = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS108S1000000_24 awS108S1000000_24) {
        C1563970qnj.LJI.remove(awS108S1000000_24.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS108S1000000_24 awS108S1000000_24) {
        C1564050qnr c1564050qnr;
        if (C1563970qnj.LJFF.contains(awS108S1000000_24.s0) && (c1564050qnr = C1563970qnj.LIZIZ) != null) {
            return c1564050qnr.LIZJ;
        }
        return null;
    }

    public static final Object invoke$6(AwS108S1000000_24 awS108S1000000_24) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsPopCardListenerManager markPinCardShow subScene=");
        sbLIZ.append(awS108S1000000_24.s0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C1563970qnj.LJFF.add(awS108S1000000_24.s0);
        C1563970qnj.LIZIZ(awS108S1000000_24.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS108S1000000_24 awS108S1000000_24) {
        Long l;
        String str = awS108S1000000_24.s0;
        if (str != null) {
            C1563970qnj.LJ.add(str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("jyq_debug ");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(" markPreloadReady, subScene:");
            sbLIZ.append(awS108S1000000_24.s0);
            sbLIZ.append(", latestData_popCardId:");
            C1564050qnr c1564050qnr = C1563970qnj.LIZIZ;
            if (c1564050qnr != null) {
                l = c1564050qnr.LIZJ;
            } else {
                l = null;
            }
            sbLIZ.append(l);
            sbLIZ.append(", latestInitData:");
            sbLIZ.append(C1563970qnj.LIZJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            C1563970qnj.LIZJ(awS108S1000000_24.s0, "preload_ready", "preload_load_success", null, jCurrentTimeMillis);
            List listLIZ = C1563970qnj.LIZ();
            String str2 = awS108S1000000_24.s0;
            ArrayList<C1556460qbc> arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZ) {
                C1556460qbc c1556460qbc = (C1556460qbc) obj;
                if (Intrinsics.LJFF(c1556460qbc.LIZIZ, str2) && !c1556460qbc.LIZJ) {
                    arrayList.add(obj);
                }
            }
            for (C1556460qbc c1556460qbc2 : arrayList) {
                c1556460qbc2.LIZJ = true;
                C21202017y6 c21202017y6 = c1556460qbc2.LIZ.get();
                if (c21202017y6 != null) {
                    List<C1556460qbc> list = C1563970qnj.LIZ;
                    C1563970qnj.LJI(c21202017y6, c1556460qbc2.LIZIZ, "mark_preload_ready_sync_existing_listener");
                }
            }
            if (C1563970qnj.LJFF.contains(awS108S1000000_24.s0)) {
                C1563970qnj.LIZIZ(awS108S1000000_24.s0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS108S1000000_24 awS108S1000000_24) {
        C1575960r74 c1575960r74 = C1575960r74.LL;
        return Boolean.valueOf(C1575960r74.LIZJ(String.valueOf(C1575440r6E.LIZ())).getBoolean(awS108S1000000_24.s0, false));
    }

    public static final Object invoke$9(AwS108S1000000_24 awS108S1000000_24) {
        IInteractiveService iInteractiveService = (IInteractiveService) PluggableExtentionKt.pluggableSpi$default(IInteractiveService.class, false, false, false, 14, null);
        if (iInteractiveService != null) {
            String str = awS108S1000000_24.s0;
            C1896810zSZ c1896810zSZ = new C1896810zSZ();
            c1896810zSZ.LJIIJJI = str;
            iInteractiveService.LIZ(c1896810zSZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S1000000_24(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
