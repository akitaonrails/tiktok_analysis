package kotlin.jvm.internal;

import X.AbstractC1033330czr;
import X.AbstractC1033390czx;
import X.AbstractDialogInterfaceC1397690mTX;
import X.C09AY;
import X.C0WZX;
import X.C1023640ckE;
import X.C1033240czi;
import X.C1033280czm;
import X.C1033340czs;
import X.C1033370czv;
import X.C1035880d3y;
import X.C1043500dGG;
import X.C1047370dMV;
import X.C1071110dyn;
import X.C1071730dzn;
import X.C1072730e1P;
import X.C1371430lnB;
import X.C1397620mTQ;
import X.C145T;
import X.C189200o6;
import X.C1954807lC;
import X.C2204961BRm;
import X.C2252611DEt;
import X.EnumC1070340dxY;
import X.EnumC1072080e0M;
import X.EnumC1073320e2M;
import X.InterfaceC1369790lkX;
import X.InterfaceC20236714Gf;
import android.content.Context;
import android.webkit.GeolocationPermissions;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl;
import com.ss.android.ugc.aweme.relation.auth.widget.ext.InviteFriendsSharePackageV2;
import com.ss.android.ugc.aweme.relation.share.InviteFriendsPageSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public class AwS56S1300000_16 extends C09AY implements Function1 {
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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS56S1300000_16 awS56S1300000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LLFZ, awS56S1300000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LLIZ, String.valueOf((Integer) awS56S1300000_16.l1));
        c1023640ckE.withParam(C1043500dGG.LLIZLLLIL, (Integer) awS56S1300000_16.l2);
        c1023640ckE.withParam(C1043500dGG.LLJ, (Long) awS56S1300000_16.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS56S1300000_16 awS56S1300000_16, Object obj) {
        Object obj2 = ((AbstractDialogInterfaceC1397690mTX) obj).LLIZ;
        if (Intrinsics.LJFF(obj2, 0)) {
            new C1071730dzn(((RelationAuthDialogControl) awS56S1300000_16.l1).LIZ(), awS56S1300000_16.s0, true, (Integer) ((RelationAuthDialogControl) awS56S1300000_16.l1).LLJI.getValue(), null, 16).LIZLLL(null);
            if (((EnumC1070340dxY) awS56S1300000_16.l2) == EnumC1070340dxY.CONTACT) {
                ((RelationAuthDialogControl) awS56S1300000_16.l1).LIZJ(EnumC1072080e0M.ALLOW);
            }
            if (((InterfaceC20236714Gf) awS56S1300000_16.l3).isActive()) {
                InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS56S1300000_16.l3;
                Boolean bool = Boolean.TRUE;
                C189200o6.m2constructorimpl(bool);
                interfaceC20236714Gf.resumeWith(bool);
            }
        } else if (Intrinsics.LJFF(obj2, 1)) {
            new C1071730dzn(((RelationAuthDialogControl) awS56S1300000_16.l1).LIZ(), awS56S1300000_16.s0, false, (Integer) ((RelationAuthDialogControl) awS56S1300000_16.l1).LLJI.getValue(), null, 16).LIZLLL(null);
            if (((EnumC1070340dxY) awS56S1300000_16.l2) == EnumC1070340dxY.CONTACT) {
                ((RelationAuthDialogControl) awS56S1300000_16.l1).LIZJ(EnumC1072080e0M.DENY);
            }
            ((RelationAuthDialogControl) awS56S1300000_16.l1).LJII();
            if (((InterfaceC20236714Gf) awS56S1300000_16.l3).isActive()) {
                InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) awS56S1300000_16.l3;
                Boolean bool2 = Boolean.FALSE;
                C189200o6.m2constructorimpl(bool2);
                interfaceC20236714Gf2.resumeWith(bool2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS56S1300000_16 awS56S1300000_16, Object obj) throws JSONException {
        AbstractC1033390czx abstractC1033390czx = (AbstractC1033390czx) obj;
        if (abstractC1033390czx instanceof C1033370czv) {
            ((C1033240czi) awS56S1300000_16.l1).handlePreRequestSuccess((C1033280czm) awS56S1300000_16.l2, ((C1033370czv) abstractC1033390czx).LIZ, (Function1) awS56S1300000_16.l3, awS56S1300000_16.s0);
        } else if (abstractC1033390czx instanceof AbstractC1033330czr) {
            Function1 function1 = (Function1) awS56S1300000_16.l3;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(C1033340czs.LIZ((AbstractC1033330czr) abstractC1033390czx)));
            }
            ((C1033240czi) awS56S1300000_16.l1).monitorLoadResultFail((C1033280czm) awS56S1300000_16.l2, C1033340czs.LIZ((AbstractC1033330czr) abstractC1033390czx), null, awS56S1300000_16.s0);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS56S1300000_16 awS56S1300000_16, Object obj) throws Throwable {
        C1047370dMV.LJ((C1035880d3y) awS56S1300000_16.l1, "location", 1, Integer.valueOf(C145T.LIZ((Context) awS56S1300000_16.l2)));
        C1047370dMV.LIZJ((C1035880d3y) awS56S1300000_16.l1, "location", 1, 1);
        GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) awS56S1300000_16.l3;
        if (callback != null) {
            C2204961BRm.LLJI(callback, awS56S1300000_16.s0, true, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHe2SDcuVPPA9qvIScSqO3DrTNbubo5w0Ps8Fqb/frn", null));
        }
        C1035880d3y c1035880d3y = (C1035880d3y) awS56S1300000_16.l1;
        if (c1035880d3y != null) {
            c1035880d3y.setLocationGranted(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS56S1300000_16 awS56S1300000_16, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131823125, new AwS56S1300000_16((C1035880d3y) awS56S1300000_16.l1, (Context) awS56S1300000_16.l2, (GeolocationPermissions.Callback) awS56S1300000_16.l3, awS56S1300000_16.s0, 3));
        c1397620mTQ.LJII(2131828358, new AwS100S1200000_16((GeolocationPermissions.Callback) awS56S1300000_16.l3, (C1035880d3y) awS56S1300000_16.l1, awS56S1300000_16.s0, 6));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS56S1300000_16 awS56S1300000_16, Object obj) {
        String str = (String) obj;
        if (Intrinsics.LJFF(((InterfaceC1369790lkX) awS56S1300000_16.l1).key(), "email")) {
            ((InterfaceC1369790lkX) awS56S1300000_16.l1).LJJIIJ(new C1371430lnB(str, ((InviteFriendsPageSharePackage) awS56S1300000_16.l2).title, awS56S1300000_16.s0), (Context) awS56S1300000_16.l3, null);
        } else {
            ((InterfaceC1369790lkX) awS56S1300000_16.l1).LJJIIJ(new C1371430lnB(str, awS56S1300000_16.s0, 4), (Context) awS56S1300000_16.l3, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS56S1300000_16 awS56S1300000_16, Object obj) {
        C1071110dyn c1071110dyn = (C1071110dyn) obj;
        c1071110dyn.LIZJ = LifecycleOwnerKt.getLifecycleScope(((C1072730e1P) awS56S1300000_16.l1).LIZ.requireActivity());
        c1071110dyn.LIZJ(new AwS595S0100000_16((EnumC1070340dxY) awS56S1300000_16.l3, 378));
        new AwS130S1100000_16((C1072730e1P) awS56S1300000_16.l1, awS56S1300000_16.s0, 23).invoke(c1071110dyn.LJ);
        c1071110dyn.LJFF = (EnumC1073320e2M) awS56S1300000_16.l2;
        c1071110dyn.LIZIZ(AFwS252S0000000_16.get$arr$(601));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS56S1300000_16 awS56S1300000_16, Object obj) {
        String str = (String) obj;
        if (Intrinsics.LJFF(((InterfaceC1369790lkX) awS56S1300000_16.l1).key(), "email")) {
            ((InterfaceC1369790lkX) awS56S1300000_16.l1).LJJIIJ(new C1371430lnB(str, ((InviteFriendsSharePackageV2) awS56S1300000_16.l2).title, awS56S1300000_16.s0), (Context) awS56S1300000_16.l3, null);
        } else {
            ((InterfaceC1369790lkX) awS56S1300000_16.l1).LJJIIJ(new C1371430lnB(str, awS56S1300000_16.s0, 4), (Context) awS56S1300000_16.l3, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S1300000_16(C1033240czi c1033240czi, C1033240czi c1033240czi2, C1033280czm c1033280czm, Function1<? super Integer, Unit> function1, String str) {
        super(1);
        this.$t = str;
        this.l1 = c1033240czi;
        this.l2 = c1033240czi2;
        this.l3 = c1033280czm;
        this.s0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S1300000_16(C1035880d3y c1035880d3y, Context context, GeolocationPermissions.Callback callback, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1035880d3y;
        this.l2 = context;
        this.l3 = callback;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S1300000_16(C1072730e1P c1072730e1P, EnumC1073320e2M enumC1073320e2M, EnumC1070340dxY enumC1070340dxY, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1072730e1P;
        this.l2 = enumC1073320e2M;
        this.l3 = enumC1070340dxY;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S1300000_16(InterfaceC1369790lkX interfaceC1369790lkX, InviteFriendsSharePackageV2 inviteFriendsSharePackageV2, String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC1369790lkX;
        this.l2 = inviteFriendsSharePackageV2;
        this.s0 = str;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S1300000_16(InterfaceC1369790lkX interfaceC1369790lkX, InviteFriendsPageSharePackage inviteFriendsPageSharePackage, String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC1369790lkX;
        this.l2 = inviteFriendsPageSharePackage;
        this.s0 = str;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S1300000_16(RelationAuthDialogControl relationAuthDialogControl, String str, EnumC1070340dxY enumC1070340dxY, C2252611DEt c2252611DEt, int i) {
        super(1);
        this.$t = i;
        this.l1 = relationAuthDialogControl;
        this.s0 = str;
        this.l2 = enumC1070340dxY;
        this.l3 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S1300000_16(String str, Integer num, Integer num2, Long l, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
        this.l2 = num2;
        this.l3 = l;
    }
}
