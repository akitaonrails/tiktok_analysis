package kotlin.jvm.internal;

import X.AbstractC768220UBo;
import X.C09AY;
import X.C0U24;
import X.C0U2Y;
import X.C0U33;
import X.C0U37;
import X.C0U3O;
import X.C0UBZ;
import X.C118300cf;
import X.C189200o6;
import X.C20441214yg;
import X.C2176721AGw;
import X.C2188811AlT;
import X.C23260099m;
import X.C2686012e;
import X.C500260Jjc;
import X.C768170UBj;
import X.C768190UBl;
import X.InterfaceC1364105Vn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.scene.Scene;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.RealtimeViolationRecord;

/* JADX INFO: loaded from: classes13.dex */
public class AwS28S0200100_12 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS28S0200100_12 awS28S0200100_12, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        if (downloadInfo != null) {
            long j = awS28S0200100_12.j2;
            Accompaniment accompaniment = (Accompaniment) awS28S0200100_12.l0;
            AbstractC768220UBo abstractC768220UBo = (AbstractC768220UBo) awS28S0200100_12.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FileDownload-onSucceed, albumId: ");
            sbLIZ.append(j);
            sbLIZ.append(", accompanimentId: ");
            sbLIZ.append(accompaniment.id);
            C20441214yg.LJ("AccompanimentManager", C2188811AlT.LIZIZ(sbLIZ));
            CopyOnWriteArrayList<Accompaniment> copyOnWriteArrayList = C0UBZ.LLJJ.get(Long.valueOf(j));
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(accompaniment);
            }
            C2686012e.LIZIZ(C0UBZ.LLJJI, Long.valueOf(j), new C768190UBl(downloadInfo, accompaniment));
            if (abstractC768220UBo != null) {
                abstractC768220UBo.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS28S0200100_12 awS28S0200100_12, Object obj) {
        C0U3O c0u3o = (C0U3O) obj;
        c0u3o.LIZLLL(new C768170UBj(awS28S0200100_12.j2, (Accompaniment) awS28S0200100_12.l0, (AbstractC768220UBo) awS28S0200100_12.l1));
        c0u3o.LIZJ(new AwS378S0200000_12((AbstractC768220UBo) awS28S0200100_12.l1, (Accompaniment) awS28S0200100_12.l0, 60));
        c0u3o.LJFF(new AwS28S0200100_12(awS28S0200100_12.j2, (Accompaniment) awS28S0200100_12.l0, (AbstractC768220UBo) awS28S0200100_12.l1, 0));
        c0u3o.LIZIZ(new AwS51S0200100_12(awS28S0200100_12.j2, (Accompaniment) awS28S0200100_12.l0, (AbstractC768220UBo) awS28S0200100_12.l1, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS28S0200100_12 awS28S0200100_12, Object obj) {
        String string;
        String string2;
        String str;
        Integer num;
        User owner;
        SparkContext sparkContext = (SparkContext) obj;
        C2176721AGw c2176721AGw = (C2176721AGw) awS28S0200100_12.l0;
        long j = awS28S0200100_12.j2;
        RealtimeViolationRecord realtimeViolationRecord = (RealtimeViolationRecord) awS28S0200100_12.l1;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(c2176721AGw.LLILLJJLI);
        if (roomLJJLIIIIJ == null || (owner = roomLJJLIIIIJ.getOwner()) == null || (string = Long.valueOf(owner.getId()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        sparkContext.LJJJZ("anchor_id", string);
        sparkContext.LJJJZ("enter_from", "host_card");
        sparkContext.LJJJZ(Scene.SCENE_SERVICE, "2");
        sparkContext.LJJJZ("room_id", String.valueOf(C500260Jjc.LJJLIIIJ(c2176721AGw.LLILLJJLI)));
        sparkContext.LJJJZ("punish_id", String.valueOf(j));
        PunishEventInfo punishEventInfo = realtimeViolationRecord.punishInfo;
        String str2 = "";
        if (punishEventInfo == null || (num = punishEventInfo.punishTypeId) == null || (string2 = num.toString()) == null) {
            string2 = "";
        }
        sparkContext.LJJJZ("punish_type_id", string2);
        PunishEventInfo punishEventInfo2 = realtimeViolationRecord.punishInfo;
        if (punishEventInfo2 != null && (str = punishEventInfo2.punishPerceptionCode) != null) {
            str2 = str;
        }
        sparkContext.LJJJZ("perception_code", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS28S0200100_12 awS28S0200100_12, Object obj) {
        Integer numValueOf;
        int downloadProcess;
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Pre: ");
        sbLIZ.append(((C118300cf) awS28S0200100_12.l0).element);
        sbLIZ.append(", Cur: ");
        if (downloadInfo != null) {
            numValueOf = Integer.valueOf(downloadInfo.getDownloadProcess());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("KaraokeDownloader", C2188811AlT.LIZIZ(sbLIZ));
        if (downloadInfo != null) {
            downloadProcess = downloadInfo.getDownloadProcess();
        } else {
            downloadProcess = 0;
        }
        C118300cf c118300cf = (C118300cf) awS28S0200100_12.l0;
        int i = c118300cf.element;
        int i2 = downloadProcess - i;
        if (i2 > 0) {
            c118300cf.element = i + i2;
            C0U37 c0u37 = ((C0U33) awS28S0200100_12.l1).LJ.get(Long.valueOf(awS28S0200100_12.j2));
            if (c0u37 != null) {
                c0u37.LIZJ += i2;
                System.currentTimeMillis();
                c0u37.LIZIZ.invoke(Long.valueOf(c0u37.LIZ), Integer.valueOf(Math.min(100, (c0u37.LIZJ * 100) / c0u37.LIZLLL)));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS28S0200100_12 awS28S0200100_12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            ((C0U2Y) awS28S0200100_12.l0).LJJIJIIJIL(awS28S0200100_12.j2, C0U24.NOT_REQUESTED);
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS28S0200100_12.l1;
        C189200o6.m2constructorimpl(boolValueOf);
        interfaceC1364105Vn.resumeWith(boolValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS28S0200100_12 awS28S0200100_12, Object obj) {
        C0U24 c0u24;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0U2Y c0u2y = (C0U2Y) awS28S0200100_12.l0;
        long j = awS28S0200100_12.j2;
        if (zBooleanValue) {
            c0u24 = C0U24.REQUESTED;
        } else {
            c0u24 = C0U24.NOT_REQUESTED;
        }
        c0u2y.LJJIJIIJIL(j, c0u24);
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS28S0200100_12.l1;
        C189200o6.m2constructorimpl(boolValueOf);
        interfaceC1364105Vn.resumeWith(boolValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS28S0200100_12 awS28S0200100_12, Object obj) {
        ((C0U2Y) awS28S0200100_12.l0).LJJIJIIJIL(awS28S0200100_12.j2, C0U24.NOT_REQUESTED);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS28S0200100_12.l1;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0200100_12(long j, Accompaniment accompaniment, AbstractC768220UBo abstractC768220UBo, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l0 = accompaniment;
        this.l1 = abstractC768220UBo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0200100_12(C118300cf c118300cf, C0U33 c0u33, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = c0u33;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0200100_12(C0U2Y c0u2y, long j, C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0u2y;
        this.j2 = j;
        this.l1 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0200100_12(C2176721AGw c2176721AGw, long j, RealtimeViolationRecord realtimeViolationRecord, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2176721AGw;
        this.j2 = j;
        this.l1 = realtimeViolationRecord;
    }
}
