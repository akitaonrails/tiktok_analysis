package kotlin.jvm.internal;

import X.C09AY;
import X.C1261250ivT;
import X.C1261270ivV;
import X.C1261860iwS;
import X.EnumC1261300ivY;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS36S0600000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS36S0600000_19 awS36S0600000_19, Object obj) {
        Context context = (Context) awS36S0600000_19.l0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS36S0600000_19.l1;
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) awS36S0600000_19.l2;
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) awS36S0600000_19.l3;
        C1261860iwS c1261860iwS = (C1261860iwS) awS36S0600000_19.l5;
        C1261270ivV c1261270ivV = (C1261270ivV) awS36S0600000_19.l4;
        if (context != null && lifecycleOwner != null && iUserCardListAbility != null && recUserCellTrackAbility != null) {
            C1261250ivT.LIZ.getClass();
            C1261250ivT.LJ(context, lifecycleOwner, c1261860iwS, iUserCardListAbility, recUserCellTrackAbility, c1261270ivV);
        }
        C1261270ivV c1261270ivV2 = (C1261270ivV) awS36S0600000_19.l4;
        if (c1261270ivV2 != null) {
            C1261250ivT c1261250ivT = C1261250ivT.LIZ;
            EnumC1261300ivY enumC1261300ivY = EnumC1261300ivY.SHARE_PROFILE;
            c1261250ivT.getClass();
            C1261250ivT.LIZJ(enumC1261300ivY, c1261270ivV2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS36S0600000_19 awS36S0600000_19, Object obj) {
        Context context = (Context) awS36S0600000_19.l0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS36S0600000_19.l1;
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) awS36S0600000_19.l2;
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) awS36S0600000_19.l3;
        C1261860iwS c1261860iwS = (C1261860iwS) awS36S0600000_19.l5;
        C1261270ivV c1261270ivV = (C1261270ivV) awS36S0600000_19.l4;
        if (context != null && lifecycleOwner != null && iUserCardListAbility != null && recUserCellTrackAbility != null) {
            C1261250ivT.LIZ.getClass();
            C1261250ivT.LJ(context, lifecycleOwner, c1261860iwS, iUserCardListAbility, recUserCellTrackAbility, c1261270ivV);
        }
        C1261270ivV c1261270ivV2 = (C1261270ivV) awS36S0600000_19.l4;
        if (c1261270ivV2 != null) {
            C1261250ivT c1261250ivT = C1261250ivT.LIZ;
            EnumC1261300ivY enumC1261300ivY = EnumC1261300ivY.SHARE_PROFILE;
            c1261250ivT.getClass();
            C1261250ivT.LIZJ(enumC1261300ivY, c1261270ivV2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0600000_19(Context context, LifecycleOwner lifecycleOwner, C1261860iwS c1261860iwS, IUserCardListAbility iUserCardListAbility, RecUserCellTrackAbility recUserCellTrackAbility, C1261270ivV c1261270ivV, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = lifecycleOwner;
        this.l2 = iUserCardListAbility;
        this.l3 = recUserCellTrackAbility;
        this.l4 = c1261270ivV;
        this.l5 = c1261860iwS;
    }
}
