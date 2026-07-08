package kotlin.jvm.internal;

import X.C09AY;
import X.C1912300zrY;
import X.C1BV2;
import X.C211000rc;
import X.C2188811AlT;
import X.C2203061BKe;
import X.C2203071BKf;
import X.C500260Jjc;
import X.C688070Qyr;
import X.C786410Ut5;
import X.InterfaceC2214621Bm0;
import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.clientai.AlgoPkgConfig;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.account.api.AccountLookupPopupConfig;
import com.ss.android.ugc.aweme.account.api.FoundAccountForLogin;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushSystemPopupManager;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class AwS70S1300000_34 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AwS70S1300000_34 awS70S1300000_34, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup(");
        sbLIZ.append(awS70S1300000_34.s0);
        sbLIZ.append(") callback shown: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[NUJ-Push]");
        PopupManager.LIZJ(C688070Qyr.class);
        ((PushSystemPopupManager) awS70S1300000_34.l1).LJIILJJIL((Activity) awS70S1300000_34.l2, zBooleanValue);
        if (zBooleanValue) {
            InterfaceC2214621Bm0 interfaceC2214621Bm0 = (InterfaceC2214621Bm0) awS70S1300000_34.l3;
            if (interfaceC2214621Bm0 != null) {
                interfaceC2214621Bm0.LIZIZ();
            }
        } else {
            InterfaceC2214621Bm0 interfaceC2214621Bm02 = (InterfaceC2214621Bm0) awS70S1300000_34.l3;
            if (interfaceC2214621Bm02 != null) {
                interfaceC2214621Bm02.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS70S1300000_34 awS70S1300000_34, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup(");
        sbLIZ.append(awS70S1300000_34.s0);
        sbLIZ.append(") callback shown: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[NUJ-Push]");
        ((PushSystemPopupManager) awS70S1300000_34.l1).LJIILJJIL((Activity) awS70S1300000_34.l2, zBooleanValue);
        if (zBooleanValue) {
            InterfaceC2214621Bm0 interfaceC2214621Bm0 = (InterfaceC2214621Bm0) awS70S1300000_34.l3;
            if (interfaceC2214621Bm0 != null) {
                interfaceC2214621Bm0.LIZIZ();
            }
        } else {
            InterfaceC2214621Bm0 interfaceC2214621Bm02 = (InterfaceC2214621Bm0) awS70S1300000_34.l3;
            if (interfaceC2214621Bm02 != null) {
                interfaceC2214621Bm02.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS70S1300000_34 awS70S1300000_34, Object obj) {
        Boolean boolValueOf;
        if (((Boolean) obj).booleanValue()) {
            AlgoPkgConfig algoPkgConfig = (AlgoPkgConfig) awS70S1300000_34.l1;
            if (algoPkgConfig != null) {
                boolValueOf = Boolean.valueOf(algoPkgConfig.triggerIgnoreFailure);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                AtomicBoolean atomicBoolean = C2203061BKe.LIZ;
                C2203061BKe.LIZ((Map) awS70S1300000_34.l2, awS70S1300000_34.s0, C786410Ut5.J3(new JSONObject()), (JSONArray) awS70S1300000_34.l3);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0307  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS70S1300000_34 r30, java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS70S1300000_34.invoke$3(kotlin.jvm.internal.AwS70S1300000_34, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S1300000_34(PushSystemPopupManager pushSystemPopupManager, Activity activity, C1912300zrY c1912300zrY, int i) {
        super(1);
        this.$t = i;
        this.s0 = "before_interest";
        this.l1 = pushSystemPopupManager;
        this.l2 = activity;
        this.l3 = c1912300zrY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S1300000_34(C1BV2 c1bv2, FoundAccountForLogin foundAccountForLogin, String str, AccountLookupPopupConfig accountLookupPopupConfig, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1bv2;
        this.l2 = foundAccountForLogin;
        this.s0 = str;
        this.l3 = accountLookupPopupConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS70S1300000_34(AlgoPkgConfig algoPkgConfig, AlgoPkgConfig algoPkgConfig2, Map<String, C2203071BKf> map, String str, JSONArray jSONArray) {
        super(1);
        this.$t = jSONArray;
        this.l1 = algoPkgConfig;
        this.l2 = algoPkgConfig2;
        this.s0 = map;
        this.l3 = str;
    }
}
