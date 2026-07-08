package kotlin.jvm.internal;

import X.C09AY;
import X.C0WGR;
import X.C0XWH;
import X.C0XZJ;
import X.C1740300vO8;
import X.C816020Vzk;
import X.C816040Vzm;
import X.C816050Vzn;
import X.C852170Xbr;
import X.EnumC23111093t;
import X.InterfaceC815880VzW;
import X.InterfaceC824510WWb;
import X.InterfaceC852200Xbu;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes14.dex */
public class AwS95S1300000_13 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS95S1300000_13 awS95S1300000_13, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            ((Fragment) awS95S1300000_13.l1).onPause();
            C1740300vO8.LIZ.getClass();
            C1740300vO8.LIZIZ = true;
            C1740300vO8.LIZJ = awS95S1300000_13.s0;
            InterfaceC824510WWb interfaceC824510WWb = (InterfaceC824510WWb) awS95S1300000_13.l2;
            if (interfaceC824510WWb != null) {
                interfaceC824510WWb.LIZ(false);
            }
        }
        ((Function2) awS95S1300000_13.l3).invoke(Boolean.valueOf(zBooleanValue), obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS95S1300000_13 awS95S1300000_13, Object obj, Object obj2) {
        int iLIZ;
        Throwable th = (Throwable) obj;
        if (th instanceof C0XZJ) {
            iLIZ = ((C0XZJ) th).getErrorCode();
        } else {
            iLIZ = C0XWH.LIZ(th);
        }
        if (obj2 == EnumC23111093t.OIDC) {
            ((Map) awS95S1300000_13.l1).put("is_oidc", 1);
        }
        if (obj2 != EnumC23111093t.NOT_STARTED) {
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            String str = awS95S1300000_13.s0;
            InterfaceC852200Xbu interfaceC852200Xbu = (InterfaceC852200Xbu) awS95S1300000_13.l2;
            Map map = (Map) awS95S1300000_13.l1;
            c852170Xbr.getClass();
            C852170Xbr.LJIIIIZZ(false, iLIZ, str, interfaceC852200Xbu, map);
        }
        ((Function1) awS95S1300000_13.l3).invoke(Integer.valueOf(iLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS95S1300000_13 awS95S1300000_13, Object obj, Object obj2) {
        Throwable th = (Throwable) obj2;
        if (!((Boolean) obj).booleanValue() && !((C816050Vzn) awS95S1300000_13.l1).LIZIZ()) {
            ((C816050Vzn) awS95S1300000_13.l1).LJFF(awS95S1300000_13.s0, CardStruct.IStatusCode.DEFAULT);
            C0WGR c0wgrLJIIIZ = ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LJIIIZ((Context) awS95S1300000_13.l3);
            ILauncherShortcutService iLauncherShortcutService = (ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class);
            Context context = (Context) awS95S1300000_13.l3;
            iLauncherShortcutService.LJII(context, new C816040Vzm(c0wgrLJIIIZ, (Function2) awS95S1300000_13.l2, th, context, (C816050Vzn) awS95S1300000_13.l1, awS95S1300000_13.s0), new AwS192S1100000_13((C816050Vzn) awS95S1300000_13.l1, awS95S1300000_13.s0, 1), new AwS127S1100000_13((C816050Vzn) awS95S1300000_13.l1, awS95S1300000_13.s0, 7));
        } else {
            ((C816050Vzn) awS95S1300000_13.l1).LJFF(awS95S1300000_13.s0, "1");
            C816020Vzk c816020Vzk = C816020Vzk.LIZ;
            String str = awS95S1300000_13.s0;
            InterfaceC815880VzW interfaceC815880VzW = ((C816050Vzn) awS95S1300000_13.l1).LIZ;
            c816020Vzk.getClass();
            C816020Vzk.LIZIZ(str, interfaceC815880VzW);
            Function2 function2 = (Function2) awS95S1300000_13.l2;
            if (function2 != null) {
                function2.invoke(Boolean.TRUE, null);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1300000_13(C816050Vzn c816050Vzn, String str, AwS151S1200000_7 awS151S1200000_7, Context context, int i) {
        super(2);
        this.$t = i;
        this.l1 = c816050Vzn;
        this.s0 = str;
        this.l2 = awS151S1200000_7;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1300000_13(InterfaceC852200Xbu interfaceC852200Xbu, String str, Map map, Function1 function1, int i) {
        super(2);
        this.$t = i;
        this.l1 = map;
        this.s0 = str;
        this.l2 = interfaceC852200Xbu;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS95S1300000_13(Fragment fragment, Fragment fragment2, String str, InterfaceC824510WWb interfaceC824510WWb, Function2<? super Boolean, ? super String, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l1 = fragment;
        this.s0 = fragment2;
        this.l2 = str;
        this.l3 = interfaceC824510WWb;
    }
}
