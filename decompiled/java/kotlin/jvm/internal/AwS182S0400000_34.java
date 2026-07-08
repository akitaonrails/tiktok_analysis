package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C1260120ite;
import X.C1402840mbq;
import X.C1510105vf;
import X.C1B3S;
import X.C1B4F;
import X.C1B4X;
import X.C2198861B4a;
import X.C2198951B4j;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC1850560yFy;
import X.InterfaceC1019840ce6;
import X.InterfaceC1041760dDS;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS131S0100000_31;
import android.os.Bundle;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenAuthPageMethod;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity;
import com.ss.android.ugc.aweme.share.linkshare.model.LinkShareIntentModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes35.dex */
public class AwS182S0400000_34 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS182S0400000_34 awS182S0400000_34, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) obj2).booleanValue()) {
            InterfaceC1019840ce6 interfaceC1019840ce6 = ((OpenAuthPageMethod) awS182S0400000_34.l0).returnHandle;
            if (interfaceC1019840ce6 != null) {
                interfaceC1019840ce6.LIZ(1, "child_mode");
            }
        } else if (!zBooleanValue) {
            InterfaceC1019840ce6 interfaceC1019840ce62 = ((OpenAuthPageMethod) awS182S0400000_34.l0).returnHandle;
            if (interfaceC1019840ce62 != null) {
                interfaceC1019840ce62.LIZ(1, "not_login");
            }
        } else {
            ((OpenAuthPageMethod) awS182S0400000_34.l0).startAuth((IOpenPlatformService) awS182S0400000_34.l1, (C1B3S) awS182S0400000_34.l2, (Bundle) awS182S0400000_34.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS182S0400000_34 awS182S0400000_34, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) obj2).booleanValue()) {
            InterfaceC1041760dDS interfaceC1041760dDS = ((com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod) awS182S0400000_34.l0).mIReturn;
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(1, "child_mode");
            }
        } else if (!zBooleanValue) {
            InterfaceC1041760dDS interfaceC1041760dDS2 = ((com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod) awS182S0400000_34.l0).mIReturn;
            if (interfaceC1041760dDS2 != null) {
                interfaceC1041760dDS2.LIZ(1, "not_login");
            }
        } else {
            ((com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod) awS182S0400000_34.l0).startAuth((IOpenPlatformService) awS182S0400000_34.l1, (C1B3S) awS182S0400000_34.l2, (Bundle) awS182S0400000_34.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS182S0400000_34 awS182S0400000_34, Object obj, Object obj2) {
        List list = (List) obj;
        Throwable th = (Throwable) obj2;
        OpenLinkShareMainActivity openLinkShareMainActivity = (OpenLinkShareMainActivity) awS182S0400000_34.l0;
        openLinkShareMainActivity.getClass();
        C1260120ite.LIZIZ(new ARunnableS107S0100000_7(openLinkShareMainActivity, 282));
        if (th != null) {
            OpenLinkShareMainActivity openLinkShareMainActivity2 = (OpenLinkShareMainActivity) awS182S0400000_34.l0;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            openLinkShareMainActivity2.LLLLZI(new C1B4F(-12, 20006, message));
        } else if (!list.contains(EnumC1850560yFy.DM)) {
            ((OpenLinkShareMainActivity) awS182S0400000_34.l0).LLLLZI(C1B4F.LJII);
        } else {
            C1B4X c1b4x = new C1B4X((OpenLinkShareMainActivity) awS182S0400000_34.l0, (LinkShareIntentModel) awS182S0400000_34.l1, (C1402840mbq) awS182S0400000_34.l2, (C2198861B4a) awS182S0400000_34.l3, null);
            OpenLinkShareMainActivity openLinkShareMainActivity3 = (OpenLinkShareMainActivity) awS182S0400000_34.l0;
            c1b4x.LJI = new AwS578S0100000_34(openLinkShareMainActivity3, 207);
            c1b4x.LJII = new AwS613S0100000_34(openLinkShareMainActivity3, 167);
            c1b4x.LJIIIIZZ = new C2198951B4j(openLinkShareMainActivity3);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1510105vf(c1b4x, null), 3);
            C1260120ite.LIZIZ(new ARunnableS131S0100000_31(c1b4x, 207));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS182S0400000_34(OpenAuthPageMethod openAuthPageMethod, IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, Bundle bundle, int i) {
        super(2);
        this.$t = i;
        this.l0 = openAuthPageMethod;
        this.l1 = iOpenPlatformService;
        this.l2 = c1b3s;
        this.l3 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS182S0400000_34(OpenLinkShareMainActivity openLinkShareMainActivity, LinkShareIntentModel linkShareIntentModel, C1402840mbq c1402840mbq, C2198861B4a c2198861B4a, int i) {
        super(2);
        this.$t = i;
        this.l0 = openLinkShareMainActivity;
        this.l1 = linkShareIntentModel;
        this.l2 = c1402840mbq;
        this.l3 = c2198861B4a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS182S0400000_34(com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod openAuthPageMethod, IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, Bundle bundle, int i) {
        super(2);
        this.$t = i;
        this.l0 = openAuthPageMethod;
        this.l1 = iOpenPlatformService;
        this.l2 = c1b3s;
        this.l3 = bundle;
    }
}
