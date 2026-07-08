package kotlin.jvm.internal;

import X.AbstractC484590IzR;
import X.AbstractC484600IzS;
import X.C01KZ;
import X.C09AY;
import X.C0K54;
import X.C0KNK;
import X.C0KNL;
import X.C0KNO;
import X.C0KOO;
import X.C0KVI;
import X.C1397620mTQ;
import X.C20484615Do;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C385201ec;
import X.C484610IzT;
import X.C484640IzW;
import X.C499520JiQ;
import X.C499760Jio;
import X.C499770Jip;
import X.C499780Jiq;
import X.C499970Jj9;
import X.C499990JjB;
import X.C500260Jjc;
import X.InterfaceC499980JjA;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridge;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS105S0400000_7 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS105S0400000_7 awS105S0400000_7, Object obj) {
        C499990JjB c499990JjB = (C499990JjB) obj;
        C499990JjB.LIZJ(c499990JjB, R.id.mzx, new C499760Jio((PreviewSettingsConfigBridge) awS105S0400000_7.l1), new AwS551S0100000_7((PreviewSettingsConfigBridge) awS105S0400000_7.l1, 627), 24);
        C499990JjB.LIZJ(c499990JjB, R.id.mzq, new C499770Jip((PreviewSettingsConfigBridge) awS105S0400000_7.l1), null, 28);
        C499990JjB.LIZJ(c499990JjB, R.id.n0h, new C499780Jiq((PreviewSettingsConfigBridge) awS105S0400000_7.l1), new AwS556S0100000_12((DataChannel) awS105S0400000_7.l2, 757), 24);
        C500260Jjc.LJJJJJ((Fragment) awS105S0400000_7.l0, null, new C385201ec(true, new C01KZ((DataChannel) awS105S0400000_7.l2, (LifecycleOwner) awS105S0400000_7.l3, null), R.id.mzh, new C499520JiQ((PreviewSettingsConfigBridge) awS105S0400000_7.l1), AFwS193S0000000_7.get$arr$(384), AFwS193S0000000_7.get$arr$(385), c499990JjB, c499990JjB.LIZIZ, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS105S0400000_7 awS105S0400000_7, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF = true;
        c1397620mTQ.LIZJ(0, (CharSequence) awS105S0400000_7.l0, new AwS586S0100000_7((Function0) awS105S0400000_7.l2, (Function0<Unit>) 421));
        c1397620mTQ.LIZJ(1, (CharSequence) awS105S0400000_7.l1, new AwS586S0100000_7((Function0) awS105S0400000_7.l3, (Function0<Unit>) 422));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS105S0400000_7 awS105S0400000_7, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        AbstractC484600IzS abstractC484600IzS = (AbstractC484600IzS) awS105S0400000_7.l0;
        C484610IzT c484610IzT = (C484610IzT) awS105S0400000_7.l1;
        DataChannel dataChannel = (DataChannel) awS105S0400000_7.l2;
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) awS105S0400000_7.l3;
        abstractC484600IzS.getClass();
        int i = 1;
        int i2 = 2;
        C484640IzW.LIZ(C2097608Jq.LJIIIIZZ(new Pair("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId)), new Pair("event_type", "1"), new Pair("trigger_type", String.valueOf(c484610IzT.LIZ.triggerType)), new Pair("strategy_scene", String.valueOf(abstractC484600IzS.LIZIZ()))));
        ArrayList<AbstractC484590IzR> arrayList = abstractC484600IzS.LIZIZ;
        ArrayList<AbstractC484590IzR> arrayList2 = new ArrayList();
        for (AbstractC484590IzR abstractC484590IzR : arrayList) {
            if (!abstractC484590IzR.LIZIZ.beforeTrigger) {
                arrayList2.add(abstractC484590IzR);
            }
        }
        for (AbstractC484590IzR abstractC484590IzR2 : arrayList2) {
            if ((abstractC484590IzR2.LIZIZ.filterType == 0 && !abstractC484590IzR2.LIZ(dataChannel, abstractC484600IzS.LJ)) || (abstractC484590IzR2.LIZIZ.filterType == i2 && !abstractC484590IzR2.LJFF(dataChannel))) {
                break;
            }
            if (abstractC484590IzR2.LIZIZ.filterType == i) {
                abstractC484590IzR2.LJ(dataChannel, enterRoomConfig, abstractC484600IzS.LJ, c484610IzT, System.currentTimeMillis() - abstractC484600IzS.LJI, jLongValue, new AwS373S0200000_7(abstractC484600IzS, c484610IzT, 78));
                i = 1;
                i2 = 2;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS105S0400000_7 awS105S0400000_7, Object obj) {
        Map map = (Map) awS105S0400000_7.l0;
        if (map != null) {
            CharSequence charSequence = (CharSequence) awS105S0400000_7.l2;
            Integer num = (Integer) awS105S0400000_7.l3;
            C0KVI c0kvi = C0KVI.LIZ;
            String string = charSequence.toString();
            c0kvi.getClass();
            C0KVI.LIZ(num, "click", "try_again", string, map);
        }
        ((Function0) awS105S0400000_7.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS105S0400000_7 awS105S0400000_7, Object obj) {
        Map map = (Map) awS105S0400000_7.l0;
        if (map != null) {
            CharSequence charSequence = (CharSequence) awS105S0400000_7.l2;
            Integer num = (Integer) awS105S0400000_7.l3;
            C0KVI c0kvi = C0KVI.LIZ;
            String string = charSequence.toString();
            c0kvi.getClass();
            C0KVI.LIZ(num, "click", "cancel", string, map);
        }
        ((Function0) awS105S0400000_7.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS105S0400000_7 awS105S0400000_7, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131839370, new AwS105S0400000_7((C0KNO) awS105S0400000_7.l0, (C0KNO) awS105S0400000_7.l1, (Uri) awS105S0400000_7.l2, (C0KNK) awS105S0400000_7.l3, (Map<String, String>) 6));
        c1397620mTQ.LJII(2131822144, new AwS216S0300000_7((C0KNK) awS105S0400000_7.l2, (C0KNK) awS105S0400000_7.l0, (C0KNO) awS105S0400000_7.l3, (Map<String, String>) 21));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS105S0400000_7 awS105S0400000_7, Object obj) {
        C0K54.LIZ().LIZ(((C0KNO) awS105S0400000_7.l0).LIZ, (Uri) awS105S0400000_7.l1, C2097608Jq.LJ());
        C0KNK c0knk = (C0KNK) awS105S0400000_7.l2;
        C0KNO c0kno = (C0KNO) awS105S0400000_7.l0;
        String str = c0kno.LJ;
        Map<String, String> map = c0kno.LJI;
        int i = c0kno.LIZJ;
        String str2 = c0kno.LJIIIIZZ;
        c0knk.getClass();
        C0KNL.LJI(i, str, "contact_us", str2, map);
        C0KOO c0koo = C0KOO.LIZ;
        Map mapLJIIL = C2097608Jq.LJIIL((Map) awS105S0400000_7.l3, C2097908Jt.LIZJ(new Pair("click_position", "contact_us")));
        c0koo.getClass();
        C0KOO.LIZ(mapLJIIL);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS105S0400000_7 awS105S0400000_7, Object obj) {
        C499990JjB c499990JjB = (C499990JjB) obj;
        C499990JjB.LIZJ(c499990JjB, R.id.n0h, new AwS656S0100000_7((InterfaceC499980JjA) awS105S0400000_7.l0, 8), new AwS551S0100000_7((DataChannel) awS105S0400000_7.l1, 829), 24);
        C499990JjB.LIZJ(c499990JjB, R.id.mzh, new AwS661S0100000_12((DataChannel) awS105S0400000_7.l1, 6), new AwS251S0300000_7((LiveMode) awS105S0400000_7.l3, (Room) awS105S0400000_7.l2, (DataChannel) awS105S0400000_7.l1, 25), 24);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS105S0400000_7 awS105S0400000_7, Object obj) {
        C499990JjB c499990JjB = (C499990JjB) obj;
        C499990JjB.LIZJ(c499990JjB, R.id.mzr, new AwS656S0100000_7((InterfaceC499980JjA) awS105S0400000_7.l0, 7), new AwS551S0100000_7((LiveMode) awS105S0400000_7.l1, 828), 24);
        C499990JjB.LIZJ(c499990JjB, R.id.n0i, new C499970Jj9((InterfaceC499980JjA) awS105S0400000_7.l0, (C20484615Do) awS105S0400000_7.l2, (DataChannel) awS105S0400000_7.l3), AFwS193S0000000_7.get$arr$(396), 24);
        C499990JjB.LIZJ(c499990JjB, R.id.n0l, new AwS656S0100000_7((InterfaceC499980JjA) awS105S0400000_7.l0, 9), AFwS193S0000000_7.get$arr$(397), 24);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0400000_7(AbstractC484600IzS abstractC484600IzS, C484610IzT c484610IzT, DataChannel dataChannel, EnterRoomConfig enterRoomConfig, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC484600IzS;
        this.l1 = c484610IzT;
        this.l2 = dataChannel;
        this.l3 = enterRoomConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS105S0400000_7(C0KNO c0kno, C0KNO c0kno2, Uri uri, C0KNK c0knk, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = c0kno;
        this.l1 = c0kno2;
        this.l2 = uri;
        this.l3 = c0knk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0400000_7(Fragment fragment, PreviewSettingsConfigBridge previewSettingsConfigBridge, DataChannel dataChannel, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = previewSettingsConfigBridge;
        this.l2 = dataChannel;
        this.l3 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS105S0400000_7(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = charSequence;
        this.l1 = charSequence2;
        this.l2 = charSequence3;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS105S0400000_7(Map map, Map<String, ? extends Object> map2, Function0<Unit> function0, CharSequence charSequence, Integer num) {
        super(1);
        this.$t = num;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = function0;
        this.l3 = charSequence;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0400000_7(Fragment fragment, InterfaceC499980JjA interfaceC499980JjA, LiveMode liveMode, C20484615Do c20484615Do, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC499980JjA;
        this.l1 = liveMode;
        this.l2 = c20484615Do;
        this.l3 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0400000_7(Fragment fragment, InterfaceC499980JjA interfaceC499980JjA, DataChannel dataChannel, Room room, LiveMode liveMode, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC499980JjA;
        this.l1 = dataChannel;
        this.l2 = room;
        this.l3 = liveMode;
    }
}
