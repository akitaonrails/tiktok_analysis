package kotlin.jvm.internal;

import X.C09AY;
import X.C15ZL;
import X.C15ZM;
import X.C15ZN;
import X.C15ZV;
import X.C20540515Zb;
import X.C20571715ed;
import X.C20649015r6;
import X.C20649315r9;
import X.C20649415rA;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1779290wP1;
import X.EnumC20650315rJ;
import X.InterfaceC20541015Zg;
import Y.ARunnableS42S0101000_31;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachSyncConfigModel;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS184S0101000_31 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S0101000_31(C15ZN c15zn, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c15zn;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS184S0101000_31 awS184S0101000_31, Object obj, Object obj2) {
        C15ZM c15zm;
        String str;
        C20540515Zb c20540515Zb = (C20540515Zb) obj;
        InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
        if (interfaceC20541015ZgLIZIZ != null) {
            JSONObject jSONObject = new JSONObject();
            C15ZL c15zl = ((C15ZN) awS184S0101000_31.l0).LJIIJJI;
            if (c15zl != null) {
                str = c15zl.LIZ;
            } else {
                str = null;
            }
            interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_stb_perform_callback", jSONObject.put("trigger_key", str).put("strategy_key", ((C15ZN) awS184S0101000_31.l0).LJIIIIZZ).put("timerbox_key", ((C15ZN) awS184S0101000_31.l0).LJIIIZ).put("current_used_time", c20540515Zb.LIZJ() - ((C15ZN) awS184S0101000_31.l0).LJI).put("current_threshold", ((C15ZN) awS184S0101000_31.l0).LJIIL.invoke().intValue()), null);
        }
        C15ZN c15zn = (C15ZN) awS184S0101000_31.l0;
        C15ZL c15zl2 = c15zn.LJIIJJI;
        if (c15zl2 != null && (c15zm = c15zl2.LIZJ) != null) {
            c15zm.LIZIZ(new AwS150S0201000_31(c15zn, c20540515Zb, awS184S0101000_31.i1, 4), new AwS575S0100000_31((C15ZN) awS184S0101000_31.l0, 1597), new AwS575S0100000_31((C15ZN) awS184S0101000_31.l0, 1598));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS184S0101000_31 awS184S0101000_31, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("incrementalSync: isSuccess: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", needFullSync: ");
        sbLIZ.append(zBooleanValue2);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        C20649015r6.LIZLLL = false;
        if (zBooleanValue) {
            if (zBooleanValue2) {
                C20649015r6 c20649015r6 = C20649015r6.LIZ;
                EnumC1779290wP1 enumC1779290wP1 = EnumC1779290wP1.FULL_SYNC;
                int i = awS184S0101000_31.i1;
                c20649015r6.getClass();
                C20649015r6.LIZIZ(enumC1779290wP1, i);
            } else {
                C20649315r9.LIZ.getClass();
                ConcurrentSkipListSet<OutreachRecordData> concurrentSkipListSet = C20649315r9.LIZLLL;
                ConcurrentSkipListSet<OutreachRecordData> concurrentSkipListSet2 = C20649315r9.LIZIZ;
                concurrentSkipListSet.addAll(concurrentSkipListSet2);
                concurrentSkipListSet2.clear();
                C20649315r9.LIZJ(EnumC20650315rJ.SYNCING);
                C20649015r6.LIZIZ = System.currentTimeMillis();
            }
        } else if (awS184S0101000_31.i1 > 0) {
            C20649315r9.LIZ.getClass();
            ConcurrentSkipListSet<OutreachRecordData> concurrentSkipListSet3 = C20649315r9.LIZJ;
            ConcurrentSkipListSet<OutreachRecordData> concurrentSkipListSet4 = C20649315r9.LIZIZ;
            concurrentSkipListSet3.addAll(concurrentSkipListSet4);
            concurrentSkipListSet4.clear();
            C20649015r6 c20649015r62 = C20649015r6.LIZ;
            EnumC1779290wP1 enumC1779290wP12 = (EnumC1779290wP1) awS184S0101000_31.l0;
            int i2 = awS184S0101000_31.i1 - 1;
            C20649415rA.LIZ.getClass();
            long j = ((long) ((OutreachSyncConfigModel) C20649415rA.LIZLLL.getValue()).minInterval) * 1000;
            c20649015r62.getClass();
            C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), new ARunnableS42S0101000_31(i2, enumC1779290wP12, 20));
        }
        AwS168S0101000_31 awS168S0101000_31 = C20649015r6.LIZJ;
        if (awS168S0101000_31 != null) {
            awS168S0101000_31.invoke();
            C20649015r6.LIZJ = null;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S0101000_31(int i, long j, String str, String str2, EnumC1779290wP1 enumC1779290wP1, int i2) {
        super(2);
        this.$t = i2;
        this.i1 = i;
        this.l0 = enumC1779290wP1;
    }
}
