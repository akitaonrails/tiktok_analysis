package kotlin.jvm.internal;

import X.C09AY;
import X.C0I6Y;
import X.C0Y3I;
import X.C0Y3R;
import X.C0YNY;
import X.C0YWQ;
import X.C0ZN6;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C1558520qew;
import X.C603540Nlo;
import X.C631370Opb;
import X.C865530XxP;
import X.C869590Y9l;
import X.InterfaceC461380I7k;
import X.InterfaceC863600XuI;
import X.InterfaceC874680YTa;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaSafetyBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.UnavailableCardCardAssem;
import com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService;
import com.ss.android.ugc.aweme.share.invitelink.InviteLinkFragment;
import com.ss.android.ugc.aweme.util.GreetingCardAbility;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS39S2100000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS39S2100000_14 awS39S2100000_14, Object obj) {
        ((C865530XxP) awS39S2100000_14.l2).LIZIZ.invoke(awS39S2100000_14.s0).LJJLIIIJL(awS39S2100000_14.s0, awS39S2100000_14.s1, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS39S2100000_14 awS39S2100000_14, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((InviteLinkFragment) awS39S2100000_14.l2, new AwS15S2000000_14(awS39S2100000_14.s0, awS39S2100000_14.s1, 1));
        assembler.QQ2((InviteLinkFragment) awS39S2100000_14.l2, AFwS229S0000000_2.get$arr$(495));
        assembler.QQ2((InviteLinkFragment) awS39S2100000_14.l2, AFwS248S0000000_14.get$arr$(319));
        assembler.QQ2((InviteLinkFragment) awS39S2100000_14.l2, AFwS248S0000000_14.get$arr$(320));
        assembler.QQ2((InviteLinkFragment) awS39S2100000_14.l2, AFwS248S0000000_14.get$arr$(321));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS39S2100000_14 awS39S2100000_14, Object obj) {
        GreetingCardAbility greetingCardAbility;
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        if (Intrinsics.LJFF(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ((UnavailableCardCardAssem) awS39S2100000_14.l2)).getScene(), "greeting_card") && (greetingCardAbility = (GreetingCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL((UnavailableCardCardAssem) awS39S2100000_14.l2), GreetingCardAbility.class, null)) != null) {
            greetingCardAbility.Dv2(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ((UnavailableCardCardAssem) awS39S2100000_14.l2)));
        }
        IMMediaSafetyBridgeApi.LIZ.getClass();
        IMMediaSafetyBridgeApi iMMediaSafetyBridgeApiLIZ = C0ZN6.LIZ();
        if (iMMediaSafetyBridgeApiLIZ != null) {
            iMMediaSafetyBridgeApiLIZ.LIZ(null, awS39S2100000_14.s0, awS39S2100000_14.s1, "view");
        }
        C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ((UnavailableCardCardAssem) awS39S2100000_14.l2));
        UnavailableCardCardAssem unavailableCardCardAssem = (UnavailableCardCardAssem) awS39S2100000_14.l2;
        HashMap map = new HashMap(c869590Y9lLIZ.getLocalExt());
        IDMRiskyKeywordsService iDMRiskyKeywordsService = (IDMRiskyKeywordsService) PluggableExtentionKt.pluggableSpiForReal(IDMRiskyKeywordsService.class);
        if (iDMRiskyKeywordsService != null) {
            iDMRiskyKeywordsService.LIZLLL(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(unavailableCardCardAssem)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : c869590Y9lLIZ.getLocalExt().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!Intrinsics.LJFF(map.get(key), value)) {
                linkedHashMap.put(key, new C0Y3R(value));
            }
        }
        if (!linkedHashMap.isEmpty()) {
            C603540Nlo.LIZIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9lLIZ, linkedHashMap, new C0Y3I("Click reveal in available card 2.0"), true);
        }
        c1397660mTU.LIZJ = true;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS39S2100000_14 awS39S2100000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((UnavailableCardCardAssem) awS39S2100000_14.l2).tp().getString(2131846701), new AwS39S2100000_14((UnavailableCardCardAssem) awS39S2100000_14.l2, awS39S2100000_14.s0, awS39S2100000_14.s1, 2));
        c1397620mTQ.LIZJ(1, ((UnavailableCardCardAssem) awS39S2100000_14.l2).tp().getString(2131846700), new AwS15S2000000_14(awS39S2100000_14.s0, awS39S2100000_14.s1, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS39S2100000_14 awS39S2100000_14, Object obj) {
        ((C0YWQ) obj).LJFF(awS39S2100000_14.s0, awS39S2100000_14.s1, (Throwable) awS39S2100000_14.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS39S2100000_14 awS39S2100000_14, Object obj) {
        ((C0YWQ) obj).LJ(awS39S2100000_14.s0, awS39S2100000_14.s1, (Throwable) awS39S2100000_14.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S2100000_14(C865530XxP c865530XxP, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c865530XxP;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S2100000_14(UnavailableCardCardAssem unavailableCardCardAssem, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = unavailableCardCardAssem;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S2100000_14(InviteLinkFragment inviteLinkFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = inviteLinkFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S2100000_14(String str, String str2, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = th;
    }
}
