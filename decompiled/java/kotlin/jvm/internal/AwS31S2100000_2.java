package kotlin.jvm.internal;

import X.C05MO;
import X.C062P;
import X.C06JG;
import X.C09AY;
import X.C1281504zt;
import X.C13BV;
import X.C13LP;
import X.C1512005vy;
import X.C19EG;
import X.C1CA0;
import X.C20085613iQ;
import X.C737500SwO;
import X.EnumC904370Zdr;
import X.InterfaceC1256804vu;
import X.InterfaceC1573006Dw;
import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.tag.FeedTaggedListFragment;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS31S2100000_2 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS31S2100000_2 awS31S2100000_2, Object obj) {
        List listLJLLLL;
        C1512005vy c1512005vy = (C1512005vy) obj;
        C1281504zt c1281504zt = (C1281504zt) ((InterfaceC1256804vu) awS31S2100000_2.l2);
        String str = c1281504zt.LJ;
        if (str == null) {
            str = awS31S2100000_2.s0;
        }
        String str2 = awS31S2100000_2.s1;
        List<String> list = c1281504zt.LIZLLL;
        if (list != null && !list.isEmpty() && str2.length() != 0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (String str3 : list) {
                if (str3.length() != 0) {
                    int length = 0;
                    while (true) {
                        int iLJJJ = a0.LJJJ(str2, str3, length, false, 4);
                        if (iLJJJ >= 0) {
                            length = str3.length() + iLJJJ;
                            linkedHashSet.add(new C05MO(iLJJJ, length));
                        }
                    }
                }
            }
            listLJLLLL = C13LP.LJLLLL(C20085613iQ.LIZ(AFwS229S0000000_2.get$arr$(831), AFwS229S0000000_2.get$arr$(832)), linkedHashSet);
        } else {
            listLJLLLL = C13BV.INSTANCE;
        }
        return C1512005vy.LIZ(c1512005vy, null, str, false, listLJLLLL, null, 35);
    }

    public static final Object invoke$1(AwS31S2100000_2 awS31S2100000_2, Object obj) {
        ((C062P) obj).LIZ = new C06JG(awS31S2100000_2.s0, awS31S2100000_2.s1, (EnumC904370Zdr) awS31S2100000_2.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS31S2100000_2 awS31S2100000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        FeedTaggedListFragment feedTaggedListFragment = (FeedTaggedListFragment) awS31S2100000_2.l2;
        assembler.DQ2(feedTaggedListFragment, new AwS31S2100000_2(feedTaggedListFragment, awS31S2100000_2.s0, awS31S2100000_2.s1, 3));
        assembler.QQ2((FeedTaggedListFragment) awS31S2100000_2.l2, AFwS229S0000000_2.get$arr$(509));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS31S2100000_2 awS31S2100000_2, Object obj) {
        FeedTaggedListFragment feedTaggedListFragment = (FeedTaggedListFragment) awS31S2100000_2.l2;
        ((C062P) obj).LIZ = new C737500SwO(feedTaggedListFragment.LLJIJIL, feedTaggedListFragment.LLJI, awS31S2100000_2.s0, awS31S2100000_2.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS31S2100000_2 awS31S2100000_2, Object obj) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS31S2100000_2.l2, "//im/smart_reply/instructions");
        smartRouteBuildRoute.withParam("enter_method", awS31S2100000_2.s0);
        smartRouteBuildRoute.withParam("enter_from", awS31S2100000_2.s1);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS31S2100000_2 awS31S2100000_2, Object obj) {
        ((InterfaceC1573006Dw) obj).y2(awS31S2100000_2.s0, awS31S2100000_2.s1, (List) awS31S2100000_2.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S2100000_2(InterfaceC1256804vu interfaceC1256804vu, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = interfaceC1256804vu;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S2100000_2(C19EG c19eg, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c19eg;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S2100000_2(FeedTaggedListFragment feedTaggedListFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = feedTaggedListFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S2100000_2(String str, String str2, EnumC904370Zdr enumC904370Zdr, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = enumC904370Zdr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS31S2100000_2(String str, String str2, List<C1CA0> list, String str3) {
        super(1);
        this.$t = str3;
        this.s0 = str;
        this.l2 = str2;
        this.s1 = list;
    }
}
