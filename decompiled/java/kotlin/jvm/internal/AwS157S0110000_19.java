package kotlin.jvm.internal;

import X.C09AY;
import X.C0XQ7;
import X.C1235080iFG;
import X.C1235230iFV;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1668060tVc;
import X.C1669660tYC;
import X.C340190DVh;
import X.C786410Ut5;
import X.C854460XfY;
import X.C985403tE;
import X.EnumC1234990iF7;
import X.EnumC1235020iFA;
import X.EnumC1235190iFR;
import X.EnumC1235200iFS;
import X.EnumC1235210iFT;
import X.EnumC1235220iFU;
import X.EnumC1237810iJf;
import X.InterfaceC1680500tpg;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ShowUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.TwoStepVerifyWays;
import com.ss.android.ugc.aweme.account.model.VerificationMethod;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedfeed.ManageFeedsPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS157S0110000_19 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS157S0110000_19(X.C1235080iFG r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 1 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS157S0110000_19.<init>(X.0iFG, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS157S0110000_19 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS157S0110000_19.invoke$0(kotlin.jvm.internal.AwS157S0110000_19, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS157S0110000_19 awS157S0110000_19, Object obj, Object obj2) {
        int i;
        int i2;
        EnumC1235210iFT enumC1235210iFT;
        EnumC1235190iFR enumC1235190iFR;
        SafeEnvData safeEnvData = (SafeEnvData) obj;
        Bundle bundle = (Bundle) obj2;
        C1235080iFG c1235080iFG = (C1235080iFG) awS157S0110000_19.l0;
        boolean z = awS157S0110000_19.z1;
        List<TwoStepVerifyWays> list = safeEnvData.twoStepVerifyWays;
        c1235080iFG.getClass();
        boolean zLJFF = C1235080iFG.LJFF(list, z);
        List<VerificationMethodType> listLIZ = safeEnvData.LIZ();
        bundle.putBoolean("is_changing", true);
        ((C1235080iFG) awS157S0110000_19.l0).getClass();
        C786410Ut5.LJJJI("enter_from", "security_checkup_page", bundle);
        if (zLJFF) {
            C1235080iFG c1235080iFG2 = (C1235080iFG) awS157S0110000_19.l0;
            boolean z2 = awS157S0110000_19.z1;
            boolean z3 = safeEnvData.safe;
            c1235080iFG2.getClass();
            Activity activity = c1235080iFG2.LIZ;
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJIIIZ = new C340190DVh(R.raw.icon_exclamation_mark_circle, 0, activity, Integer.valueOf(R.attr.zs));
            Activity activity2 = c1235080iFG2.LIZ;
            if (z2) {
                i = 2131827403;
            } else {
                i = 2131827397;
            }
            c1397580mTM.LJI(activity2.getString(i));
            Activity activity3 = c1235080iFG2.LIZ;
            if (z2) {
                i2 = 2131827402;
            } else {
                i2 = 2131827396;
            }
            c1397580mTM.LIZIZ(activity3.getString(i2));
            C985403tE.LIZ(c1397580mTM, new AwS3S0320000_19(bundle, c1235080iFG2, listLIZ, z3, z2, 1));
            c1397580mTM.LIZLLL(new C1235230iFV(c1235080iFG2, z2, z3));
            new C1397510mTF(c1397580mTM).LIZLLL();
            ShowUnlinkPhoneEmailConfirmPageEvent showUnlinkPhoneEmailConfirmPageEvent = new ShowUnlinkPhoneEmailConfirmPageEvent();
            if (z3) {
                enumC1235210iFT = EnumC1235210iFT.YES;
            } else {
                enumC1235210iFT = EnumC1235210iFT.NO;
            }
            showUnlinkPhoneEmailConfirmPageEvent.LJI(Integer.valueOf(enumC1235210iFT.getValue()), "is_env_safe");
            if (z2) {
                enumC1235190iFR = EnumC1235190iFR.PHONE;
            } else {
                enumC1235190iFR = EnumC1235190iFR.EMAIL;
            }
            showUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235190iFR.getValue(), "unlink_type");
            showUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC1235200iFS.CHANGE.getValue(), "action_type");
            showUnlinkPhoneEmailConfirmPageEvent.LJI(Integer.valueOf(EnumC1235220iFU.DIGITAL_1.getValue()), "is_2sv_on");
            showUnlinkPhoneEmailConfirmPageEvent.LJIIIIZZ();
        } else if (safeEnvData.safe) {
            if (awS157S0110000_19.z1) {
                ((C1235080iFG) awS157S0110000_19.l0).LIZJ(bundle);
            } else {
                C1235080iFG c1235080iFG3 = (C1235080iFG) awS157S0110000_19.l0;
                c1235080iFG3.getClass();
                bundle.putInt("email_source", EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_ACCOUNT_MANAGEMENT_EMAIL.getValue());
                C0XQ7.LIZ().changeUnverifiedEmail(c1235080iFG3.LIZ, "security_checkup_page", null, bundle, true, null);
            }
        } else {
            ((C1235080iFG) awS157S0110000_19.l0).LJIIL(bundle, listLIZ, awS157S0110000_19.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS157S0110000_19 awS157S0110000_19, Object obj, Object obj2) {
        List<VerificationMethod> list;
        int i;
        SafeEnvData safeEnvData = (SafeEnvData) obj;
        Bundle bundle = (Bundle) obj2;
        C854460XfY c854460XfY = C854460XfY.LIZ;
        boolean z = awS157S0110000_19.z1;
        c854460XfY.getClass();
        boolean zLJIIZILJ = C854460XfY.LJIIZILJ(z);
        C1235080iFG c1235080iFG = (C1235080iFG) awS157S0110000_19.l0;
        boolean z2 = awS157S0110000_19.z1;
        List<TwoStepVerifyWays> list2 = safeEnvData.twoStepVerifyWays;
        c1235080iFG.getClass();
        boolean zLJFF = C1235080iFG.LJFF(list2, z2);
        boolean z3 = safeEnvData.safe;
        bundle.putBoolean("is_2sv_env", zLJFF);
        if (!z3 ? !zLJIIZILJ || (list = safeEnvData.eligibleVerificationMethods) == null || list.isEmpty() : !zLJIIZILJ) {
            ((C1235080iFG) awS157S0110000_19.l0).LJII(awS157S0110000_19.z1, EnumC1235020iFA.UNLINK, EnumC1234990iF7.DIGITAL_3);
            C1235080iFG c1235080iFG2 = (C1235080iFG) awS157S0110000_19.l0;
            Activity activity = c1235080iFG2.LIZ;
            if (awS157S0110000_19.z1) {
                i = 2131827407;
            } else {
                i = 2131827405;
            }
            c1235080iFG2.LJIIJJI(activity.getString(i));
        } else {
            ((C1235080iFG) awS157S0110000_19.l0).LJII(awS157S0110000_19.z1, EnumC1235020iFA.UNLINK, EnumC1234990iF7.DIGITAL_1);
            if (awS157S0110000_19.z1) {
                IBindService iBindServiceLIZ = C0XQ7.LIZ();
                Activity activity2 = ((C1235080iFG) awS157S0110000_19.l0).LIZ;
                ArrayList<String> arrayListLJ = C854460XfY.LJ(true);
                ((C1235080iFG) awS157S0110000_19.l0).getClass();
                iBindServiceLIZ.unbindPhoneV2(activity2, arrayListLJ, "security_checkup_page", z3, bundle);
            } else {
                IBindService iBindServiceLIZ2 = C0XQ7.LIZ();
                C1235080iFG c1235080iFG3 = (C1235080iFG) awS157S0110000_19.l0;
                Activity activity3 = c1235080iFG3.LIZ;
                boolean z4 = c1235080iFG3.LIZLLL;
                ArrayList<String> arrayListLJ2 = C854460XfY.LJ(false);
                ((C1235080iFG) awS157S0110000_19.l0).getClass();
                iBindServiceLIZ2.unbindEmailV2(activity3, z4, arrayListLJ2, "security_checkup_page", z3, bundle);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS157S0110000_19 awS157S0110000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else if (!awS157S0110000_19.z1) {
            C1668060tVc.LIZLLL(C1669660tYC.LJIIZILJ, null, false, null, (Function0) awS157S0110000_19.l0, interfaceC1680500tpg, 0, 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS157S0110000_19 awS157S0110000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else if (awS157S0110000_19.z1) {
            C1668060tVc.LIZLLL(C1669660tYC.Z, null, false, null, (Function0) awS157S0110000_19.l0, interfaceC1680500tpg, 0, 14);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0110000_19(Function0 function0, boolean z, int i) {
        super(2);
        this.$t = i;
        this.z1 = z;
        this.l0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0110000_19(boolean z, ManageFeedsPanelFragment manageFeedsPanelFragment, int i) {
        super(2);
        this.$t = i;
        this.z1 = z;
        this.l0 = manageFeedsPanelFragment;
    }
}
