package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.AbstractC891400Yy2;
import X.C05P1;
import X.C09AY;
import X.C0XQ7;
import X.C1250680ieQ;
import X.C1251850igJ;
import X.C1720106oR;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.AlertToneViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.Legacy;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS317S0300000_19 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS317S0300000_19(AlertToneViewModel alertToneViewModel, AlertToneViewModel alertToneViewModel2, Function0<Unit> function0, C05P1<? extends AbstractC891400Yy2> c05p1) {
        super(3);
        this.$t = c05p1;
        this.l0 = alertToneViewModel;
        this.l1 = alertToneViewModel2;
        this.l2 = function0;
    }

    public static final Object invoke$0(AwS317S0300000_19 awS317S0300000_19, Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ProfileUser profileUser = (ProfileUser) obj3;
        if (zBooleanValue && profileUser != null) {
            try {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("before adapter getLegacyInfo legacy: ");
                sbLIZ.append(profileUser.legacy);
                C1720106oR.LJI("ProfilePlatformView", C2188811AlT.LIZIZ(sbLIZ));
                C1251850igJ c1251850igJ = C1251850igJ.LIZ;
                Legacy legacy = profileUser.legacy;
                User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                c1251850igJ.getClass();
                C1251850igJ.LJJIJL(legacy, curUser);
                ((ProfilePlatformViewModel) awS317S0300000_19.l0).UQ2("legacy", (ArrayList) awS317S0300000_19.l1);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            ((ProfilePlatformViewModel) awS317S0300000_19.l0).RQ2((AtomicInteger) awS317S0300000_19.l2);
        } else {
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("success: ");
            sbLIZ2.append(zBooleanValue);
            sbLIZ2.append(", data is null = ");
            if (profileUser == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ2.append(z);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c1250680ieQ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("error_msg", strLIZIZ);
            C20684815ws.LJIILLIIL("profile_platform_legacy", c2344009Gk.LIZ);
            ((ProfilePlatformViewModel) awS317S0300000_19.l0).UQ2("legacy_error", (ArrayList) awS317S0300000_19.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0tpg] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS317S0300000_19 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS317S0300000_19.invoke$1(kotlin.jvm.internal.AwS317S0300000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS317S0300000_19(ProfilePlatformViewModel profilePlatformViewModel, ProfilePlatformViewModel profilePlatformViewModel2, ArrayList<String> arrayList, AtomicInteger atomicInteger) {
        super(3);
        this.$t = atomicInteger;
        this.l0 = profilePlatformViewModel;
        this.l1 = profilePlatformViewModel2;
        this.l2 = arrayList;
    }
}
