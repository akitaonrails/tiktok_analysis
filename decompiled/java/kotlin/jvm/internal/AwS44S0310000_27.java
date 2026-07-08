package kotlin.jvm.internal;

import X.C09AY;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1777380wLw;
import X.C1777420wM0;
import X.C1852810yJb;
import X.C1855920yOc;
import X.C1857530yRD;
import X.C1859930yV5;
import X.C1861040yWs;
import X.C1861520yXe;
import X.C1862330yYx;
import X.C1862950yZx;
import X.C1919007fQ;
import X.C19723912Ez;
import X.C2097608Jq;
import X.C291001Au;
import X.C321970Cjj;
import X.C326880Cre;
import X.C326960Crm;
import X.C419910GdJ;
import X.EnumC1857430yR3;
import X.EnumC1861450yXX;
import X.InterfaceC1858000yRy;
import X.InterfaceC1860040yVG;
import X.InterfaceC665370Q7z;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS44S0310000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS44S0310000_27 awS44S0310000_27, Object obj) {
        EnumC1861450yXX enumC1861450yXX;
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        List list = (List) awS44S0310000_27.l0;
        Message message = (Message) awS44S0310000_27.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            String str = null;
            if (i >= 0) {
                InterfaceC1858000yRy c326880Cre = (InterfaceC1858000yRy) obj2;
                Message messageLIZ = C321970Cjj.LIZ(c326880Cre);
                if (messageLIZ != null) {
                    str = messageLIZ.uuid;
                }
                if (Intrinsics.LJFF(str, message.uuid)) {
                    c326880Cre = new C326880Cre(null, Message.LIZLLL(message, null, 0, true, 0, false, null, false, -536870913, 2097151), null, 26);
                }
                arrayList.add(c326880Cre);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C291001Au c291001Au = new C291001Au(arrayList);
        MessageViewModel messageViewModel = (MessageViewModel) awS44S0310000_27.l2;
        boolean z = awS44S0310000_27.z3;
        Message message2 = (Message) awS44S0310000_27.l1;
        if (z) {
            enumC1861450yXX = EnumC1861450yXX.REGENERATE;
        } else {
            enumC1861450yXX = EnumC1861450yXX.HIDE;
        }
        messageViewModel.lR2(arrayList, enumC1861450yXX, new C1861520yXe(null, false, false, false, null, null, null, null, null, message2.uuid, false, 1535));
        return C1861040yWs.LIZ(c1861040yWs, c291001Au, false, false, null, null, false, false, null, null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, 0L, null, null, null, null, null, 1073741818);
    }

    public static final Object invoke$1(AwS44S0310000_27 awS44S0310000_27, Object obj) {
        String str;
        String str2;
        Object next;
        String str3;
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        List<InterfaceC1858000yRy> list = (List) awS44S0310000_27.l0;
        List list2 = (List) awS44S0310000_27.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (InterfaceC1858000yRy c326880Cre : list) {
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String str4 = ((Message) it2.next()).uuid;
                        Message messageLIZ = C321970Cjj.LIZ(c326880Cre);
                        if (messageLIZ != null) {
                            str2 = messageLIZ.uuid;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str4, str2)) {
                            Iterator it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    String str5 = ((Message) next).uuid;
                                    Message messageLIZ2 = C321970Cjj.LIZ(c326880Cre);
                                    if (messageLIZ2 != null) {
                                        str3 = messageLIZ2.uuid;
                                    } else {
                                        str3 = null;
                                    }
                                    if (Intrinsics.LJFF(str5, str3)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            Message message = (Message) next;
                            if (message != null) {
                                c326880Cre = new C326880Cre(null, Message.LIZLLL(message, null, 0, true, 0, false, null, false, -536870913, 2097151), null, 26);
                            }
                        }
                    }
                }
            }
            arrayList.add(c326880Cre);
        }
        C291001Au c291001Au = new C291001Au(arrayList);
        MessageViewModel messageViewModel = (MessageViewModel) awS44S0310000_27.l2;
        List list3 = (List) awS44S0310000_27.l1;
        EnumC1861450yXX enumC1861450yXX = EnumC1861450yXX.HIDE;
        Message message2 = (Message) C13LP.LJJJLL(list3);
        if (message2 == null || (str = message2.uuid) == null) {
            str = "";
        }
        messageViewModel.lR2(arrayList, enumC1861450yXX, new C1861520yXe(null, false, false, false, null, null, null, null, null, str, false, 1535));
        return C1861040yWs.LIZ(c1861040yWs, c291001Au, false, false, null, null, false, false, new C1857530yRD(false, awS44S0310000_27.z3, 127), null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, 0L, null, null, null, null, null, 1073741690);
    }

    public static final Object invoke$2(AwS44S0310000_27 awS44S0310000_27, Object obj) {
        ((Number) obj).longValue();
        ((CreatorRankingSubPageFragment) awS44S0310000_27.l0).NR().onEvent(new C1777380wLw(((RankTypeV2) awS44S0310000_27.l1).type, ((C1777420wM0) awS44S0310000_27.l2).LIZIZ, awS44S0310000_27.z3));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS44S0310000_27 awS44S0310000_27, Object obj) {
        String str;
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        List<InterfaceC1858000yRy> list = c1861040yWs.LL.LIZ;
        boolean z = awS44S0310000_27.z3;
        Set set = (Set) awS44S0310000_27.l0;
        Set set2 = (Set) awS44S0310000_27.l1;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            InterfaceC1858000yRy interfaceC1858000yRy = (InterfaceC1858000yRy) obj2;
            String str2 = null;
            if (interfaceC1858000yRy instanceof C326960Crm) {
                C326960Crm c326960Crm = (C326960Crm) interfaceC1858000yRy;
                Message message = c326960Crm.LLILLL;
                if (message == null || (str = message.uuid) == null || !(!a0.LJJJIL(str))) {
                    str = null;
                }
                String str3 = c326960Crm.LLILLJJLI.answerMsgId;
                if (str3 != null && (!a0.LJJJIL(str3))) {
                    str2 = str3;
                }
                if (!z) {
                    if (str == null || !set.contains(str)) {
                        if (str2 == null || !set2.contains(str2)) {
                        }
                    }
                }
                arrayList.add(obj2);
            } else {
                Message messageLIZ = C321970Cjj.LIZ(interfaceC1858000yRy);
                if (messageLIZ != null) {
                    str2 = messageLIZ.uuid;
                }
                if (!C13LP.LJJJJ(str2, set)) {
                    arrayList.add(obj2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        C291001Au c291001Au = new C291001Au(arrayList2);
        boolean z2 = awS44S0310000_27.z3;
        MessageViewModel messageViewModel = (MessageViewModel) awS44S0310000_27.l2;
        if (!z2) {
            messageViewModel.lR2(arrayList2, EnumC1861450yXX.DELETE, new C1861520yXe(null, false, false, false, null, null, null, null, null, null, false, 2047));
        }
        return C1861040yWs.LIZ(c1861040yWs, c291001Au, false, false, null, null, false, false, null, null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, 0L, null, null, null, null, null, 1073741818);
    }

    public static final Object invoke$4(AwS44S0310000_27 awS44S0310000_27, Object obj) {
        Map<String, String> mapLJ;
        String str;
        Integer numValueOf;
        String strNZ0;
        InterfaceC1860040yVG interfaceC1860040yVG = (InterfaceC1860040yVG) awS44S0310000_27.l0;
        C1859930yV5.LJII(interfaceC1860040yVG, (Message) awS44S0310000_27.l1);
        C1859930yV5.LJI(interfaceC1860040yVG, (Message) awS44S0310000_27.l1, (InterfaceC665370Q7z) awS44S0310000_27.l2, awS44S0310000_27.z3, null, 16);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS44S0310000_27.l2, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Message message = (Message) awS44S0310000_27.l1;
        String str2 = message.uuid;
        String str3 = message.subSessionId;
        Long lValueOf = Long.valueOf(message.actionId);
        Long lValueOf2 = Long.valueOf(((Message) awS44S0310000_27.l1).botId);
        String strLIZIZ = C1855920yOc.LIZIZ((Message) awS44S0310000_27.l1);
        String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS44S0310000_27.l1).ext.activeAiImageSubBar));
        Message message2 = (Message) awS44S0310000_27.l1;
        boolean z = message2.isMultiAnswer;
        if (z) {
            str = "multi_answer";
        } else {
            str = "default";
        }
        if (z) {
            numValueOf = Integer.valueOf(message2.selectedAnswerIndex + 1);
        } else {
            numValueOf = null;
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS44S0310000_27.l2, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        C1862950yZx c1862950yZx = C1862950yZx.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS44S0310000_27.l2;
        c1862950yZx.getClass();
        C1862330yYx.LJJLJ(c1862330yYx, mapLJ, str2, str3, lValueOf, lValueOf2, "select_text", strLIZIZ, null, strLIZLLL, null, null, null, str, numValueOf, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z), 69248);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS44S0310000_27 awS44S0310000_27, Object obj) {
        int i;
        int i2;
        Integer numValueOf;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZ = EnumC1857430yR3.SELECT_TEXT;
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            i = 2131822523;
        } else {
            i = 2131849682;
        }
        c19723912Ez.LIZJ = Integer.valueOf(i);
        if (C1919007fQ.LIZLLL()) {
            i2 = R.attr.a1i;
        } else {
            i2 = R.attr.a1h;
        }
        c19723912Ez.LIZLLL = i2;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_select_text;
        if (C1919007fQ.LIZLLL()) {
            numValueOf = Integer.valueOf(R.attr.a1i);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS44S0310000_27((InterfaceC1860040yVG) awS44S0310000_27.l0, (Message) awS44S0310000_27.l1, (InterfaceC665370Q7z) awS44S0310000_27.l2, awS44S0310000_27.z3, 4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0310000_27(List list, List list2, MessageViewModel messageViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.z3 = true;
        this.l1 = list2;
        this.l2 = messageViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0310000_27(InterfaceC1860040yVG interfaceC1860040yVG, Message message, InterfaceC665370Q7z interfaceC665370Q7z, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1860040yVG;
        this.l1 = message;
        this.l2 = interfaceC665370Q7z;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0310000_27(CreatorRankingSubPageFragment creatorRankingSubPageFragment, RankTypeV2 rankTypeV2, C1777420wM0 c1777420wM0, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = creatorRankingSubPageFragment;
        this.l1 = rankTypeV2;
        this.l2 = c1777420wM0;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS44S0310000_27(List list, List<? extends InterfaceC1858000yRy> list2, Message message, MessageViewModel messageViewModel, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = message;
        this.z3 = messageViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS44S0310000_27(boolean z, boolean z2, Set<String> set, Set<String> set2, MessageViewModel messageViewModel) {
        super(1);
        this.$t = messageViewModel;
        this.z3 = z;
        this.l0 = z2;
        this.l1 = set;
        this.l2 = set2;
    }
}
