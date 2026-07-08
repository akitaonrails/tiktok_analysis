package kotlin.jvm.internal;

import X.AbstractC207072161e;
import X.C09AY;
import X.C1554610qYd;
import X.C1558520qew;
import X.C590570NEh;
import X.InterfaceC1282004zy;
import X.InterfaceC665370Q7z;
import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursMultiHubAssem;
import com.ss.android.ugc.tiktok.addyours.mob.hub.EnterAddYoursTopicListEvent;
import com.ss.android.ugc.tiktok.addyours.mob.hub.IAddYoursHubProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS52S2100000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS52S2100000_9 awS52S2100000_9) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((AddYoursMultiHubAssem) awS52S2100000_9.l2);
        AbstractC207072161e abstractC207072161e = (AbstractC207072161e) EnterAddYoursTopicListEvent.class.newInstance();
        List listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7zLJIIL, IAddYoursHubProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                InterfaceC1282004zy param = ((EventParamsProtocol) it2.next()).getParam();
                if (param != null) {
                    abstractC207072161e.LJII(param);
                }
            }
        }
        if ((abstractC207072161e instanceof EnterAddYoursTopicListEvent) && abstractC207072161e != null) {
            String str = awS52S2100000_9.s0;
            String str2 = awS52S2100000_9.s1;
            abstractC207072161e.LJI(str, "enter_method");
            abstractC207072161e.LJI(str2, "category_name");
        }
        return abstractC207072161e;
    }

    public static final Object invoke$1(AwS52S2100000_9 awS52S2100000_9) {
        AddYoursMultiHubAssem addYoursMultiHubAssem = (AddYoursMultiHubAssem) awS52S2100000_9.l2;
        return addYoursMultiHubAssem.withState(addYoursMultiHubAssem.hp(), new AwS36S2100000_9((AddYoursMultiHubAssem) awS52S2100000_9.l2, awS52S2100000_9.s0, awS52S2100000_9.s1, 3));
    }

    public static final Object invoke$2(AwS52S2100000_9 awS52S2100000_9) {
        C590570NEh c590570NEh = C590570NEh.LIZ;
        c590570NEh.LJ(awS52S2100000_9.s0, awS52S2100000_9.s1);
        c590570NEh.LIZLLL((Aweme) awS52S2100000_9.l2, false);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS52S2100000_9 awS52S2100000_9) {
        C590570NEh c590570NEh = C590570NEh.LIZ;
        c590570NEh.LJ(awS52S2100000_9.s0, awS52S2100000_9.s1);
        c590570NEh.LIZLLL((Aweme) awS52S2100000_9.l2, false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S2100000_9(AddYoursMultiHubAssem addYoursMultiHubAssem, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = addYoursMultiHubAssem;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S2100000_9(String str, String str2, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = aweme;
    }
}
