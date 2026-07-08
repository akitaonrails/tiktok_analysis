package kotlin.jvm.internal;

import X.C013C;
import X.C01GW;
import X.C09AY;
import X.C10NF;
import X.C10OL;
import X.C10P4;
import X.C10P7;
import X.C10QE;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C1869040yjm;
import X.C1911410zq7;
import X.C19240010Ow;
import X.C19240310Oz;
import X.C19240810Pe;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C587550N2r;
import X.EnumC19301010fA;
import X.EnumC19301210fC;
import Y.ARunnableS128S0100000_28;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment;
import com.ss.android.ugc.aweme.configuration.scene.UGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.journey.events.NujComponentCompleteEvent;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS30S1400000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS30S1400000_28 awS30S1400000_28, Object obj) {
        ((Number) obj).intValue();
        ((Function1) awS30S1400000_28.l1).invoke(Integer.valueOf(EnumC19301010fA.CONTINUE.getType()));
        ((TTKRegistrationBaseFragment) awS30S1400000_28.l2).yS(awS30S1400000_28.s0, 0, (Integer) awS30S1400000_28.l3, ((PNSDialogModel) awS30S1400000_28.l4).styleType);
        ((TTKRegistrationBaseFragment) awS30S1400000_28.l2).MR(awS30S1400000_28.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS30S1400000_28 awS30S1400000_28, Object obj) {
        boolean z;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        PNSDialogModel pNSDialogModel = (PNSDialogModel) awS30S1400000_28.l1;
        List<PNSAgeConfirmOption> list = pNSDialogModel.options;
        if (list != null) {
            TTKRegistrationBaseFragment tTKRegistrationBaseFragment = (TTKRegistrationBaseFragment) awS30S1400000_28.l2;
            String str = awS30S1400000_28.s0;
            Integer num = (Integer) awS30S1400000_28.l3;
            Function1 function1 = (Function1) awS30S1400000_28.l4;
            for (PNSAgeConfirmOption pNSAgeConfirmOption : list) {
                int i = pNSAgeConfirmOption.optionType;
                tTKRegistrationBaseFragment.getClass();
                if (TTKRegistrationBaseFragment.hT(i)) {
                    c1397620mTQ.LIZJ(0, pNSAgeConfirmOption.optionContent, new AwS7S1500000_28(tTKRegistrationBaseFragment, (TTKRegistrationBaseFragment) str, (String) num, (Integer) pNSAgeConfirmOption, (PNSAgeConfirmOption) pNSDialogModel, (PNSDialogModel) function1, (Function1<? super Integer, Unit>) 1));
                } else {
                    c1397620mTQ.LIZJ(1, pNSAgeConfirmOption.optionContent, new AwS7S1500000_28(tTKRegistrationBaseFragment, (TTKRegistrationBaseFragment) str, (String) num, (Integer) pNSAgeConfirmOption, (PNSAgeConfirmOption) pNSDialogModel, (PNSDialogModel) function1, (Function1<? super Integer, Unit>) 2));
                }
            }
        }
        PNSDialogModel pNSDialogModel2 = (PNSDialogModel) awS30S1400000_28.l1;
        if (!pNSDialogModel2.forceVertical ? pNSDialogModel2.alignmentType == EnumC19301210fC.HORIZONTAL.getType() : pNSDialogModel2.alignmentType == EnumC19301210fC.VERTICAL.getType()) {
            z = true;
        } else {
            z = false;
        }
        c1397620mTQ.LJFF = z;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS30S1400000_28 awS30S1400000_28, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        PNSDialogModel pNSDialogModel = (PNSDialogModel) awS30S1400000_28.l1;
        List<PNSAgeConfirmOption> list = pNSDialogModel.options;
        if (list != null) {
            TTKRegistrationBaseFragment tTKRegistrationBaseFragment = (TTKRegistrationBaseFragment) awS30S1400000_28.l2;
            String str = awS30S1400000_28.s0;
            Integer num = (Integer) awS30S1400000_28.l3;
            Function1 function1 = (Function1) awS30S1400000_28.l4;
            for (PNSAgeConfirmOption pNSAgeConfirmOption : list) {
                int i = pNSAgeConfirmOption.optionType;
                tTKRegistrationBaseFragment.getClass();
                if (TTKRegistrationBaseFragment.hT(i)) {
                    c1397630mTR.LIZJ(0, pNSAgeConfirmOption.optionContent, new AwS7S1500000_28(tTKRegistrationBaseFragment, (TTKRegistrationBaseFragment) str, (String) num, (Integer) pNSAgeConfirmOption, (PNSAgeConfirmOption) pNSDialogModel, (PNSDialogModel) function1, (Function1<? super Integer, Unit>) 3));
                } else {
                    c1397630mTR.LIZJ(1, pNSAgeConfirmOption.optionContent, new AwS7S1500000_28(tTKRegistrationBaseFragment, (TTKRegistrationBaseFragment) str, (String) num, (Integer) pNSAgeConfirmOption, (PNSAgeConfirmOption) pNSDialogModel, (PNSDialogModel) function1, (Function1<? super Integer, Unit>) 4));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS30S1400000_28 awS30S1400000_28, Object obj) {
        long jLongValue;
        C19240810Pe c19240810Pe = (C19240810Pe) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C10P7) awS30S1400000_28.l1).type());
        sbLIZ.append(" complete execute,isHandleComplete:");
        sbLIZ.append(((C013C) awS30S1400000_28.l2).element);
        sbLIZ.append(",event:");
        sbLIZ.append(c19240810Pe);
        C1911410zq7.LIZ("NUJFlowEngineV2", C2188811AlT.LIZIZ(sbLIZ));
        C19240010Ow c19240010Ow = C19240010Ow.LIZ;
        C10OL.LIZ.getClass();
        long j = C10OL.LIZIZ;
        String str = ((C10NF) awS30S1400000_28.l3).LIZJ;
        String str2 = awS30S1400000_28.s0;
        c19240010Ow.getClass();
        C01GW c01gw = C19240010Ow.LIZIZ;
        Long l = (Long) ((Map) c01gw.getValue()).get(str);
        long jCurrentTimeMillis = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((Map) c01gw.getValue()).put(str, 0L);
        if (jLongValue > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "config_id");
        c2344009Gk.LJIIIIZZ("name", str);
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "page_duration");
        c2344009Gk.LJIIIIZZ("hit_filter", str2);
        c2344009Gk.LJIIIIZZ("hit_filter", str2);
        C19240010Ow.LIZJ("page_ability_end", c2344009Gk.LIZ);
        NujComponentCompleteEvent nujComponentCompleteEvent = new NujComponentCompleteEvent();
        nujComponentCompleteEvent.LJI(Integer.valueOf(((C013C) awS30S1400000_28.l2).element ? 1 : 0), "is_handle_complete");
        nujComponentCompleteEvent.LJI(((C10P7) awS30S1400000_28.l1).type().getDesc(), "component_name");
        nujComponentCompleteEvent.LJIIIIZZ();
        if (!((C013C) awS30S1400000_28.l2).element) {
            ((C10P4) awS30S1400000_28.l4).LIZIZ(new AwS394S0200000_28((C10P7) awS30S1400000_28.l1, (C10P7<C1869040yjm>) c19240810Pe, (C19240810Pe) 91));
            ((C013C) awS30S1400000_28.l2).element = true;
            String str3 = C19240310Oz.LIZLLL;
            C19240310Oz.LJ = str3;
            ((ArrayList) C19240310Oz.LJFF).add(str3);
            String str4 = C19240310Oz.LIZ;
            C19240310Oz.LIZIZ = str4;
            ((ArrayList) C19240310Oz.LIZJ).add(str4);
            IUGStrategyTriggerAbility iUGStrategyTriggerAbilityLJI = UGStrategyTriggerAbility.LJI();
            if (iUGStrategyTriggerAbilityLJI != null) {
                iUGStrategyTriggerAbilityLJI.LIZ("after_nuj_node_end");
            }
            C10QE.LIZ.getClass();
            if (!C10QE.LIZIZ) {
                C587550N2r.LIZIZ(new ARunnableS128S0100000_28((C10P4) awS30S1400000_28.l4, 118));
            } else {
                C10QE.LIZLLL = new AwS572S0100000_28((C10P4) awS30S1400000_28.l4, 986);
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS30S1400000_28(com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment r3, com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel r4, java.lang.Integer r5, java.lang.String r6, kotlin.jvm.functions.Function1 r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r6
            r1.l3 = r5
            r1.l4 = r7
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l1 = r7
            r1.l2 = r3
            r1.s0 = r6
            r1.l3 = r5
            r1.l4 = r4
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS30S1400000_28.<init>(com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel, java.lang.Integer, java.lang.String, kotlin.jvm.functions.Function1, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS30S1400000_28(C10P7 c10p7, C10P7<C1869040yjm> c10p72, C013C c013c, C10NF<?> c10nf, String str, C10P4 c10p4) {
        super(1);
        this.$t = c10p4;
        this.l1 = c10p7;
        this.l2 = c10p72;
        this.l3 = c013c;
        this.s0 = c10nf;
        this.l4 = str;
    }
}
