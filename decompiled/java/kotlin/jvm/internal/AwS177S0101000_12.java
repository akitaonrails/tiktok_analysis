package kotlin.jvm.internal;

import X.C09AY;
import X.C1696320uFC;
import X.C341440Da2;
import X.C782130UmB;
import X.InterfaceC1680500tpg;
import android.content.Context;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry.AdEntryShareSheetFragment;
import com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment;
import com.ss.android.ugc.aweme.account.pin.CreateOrResetPINFragment;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AwS177S0101000_12 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S0101000_12(Context context, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = context;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS177S0101000_12 awS177S0101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((AdEntryShareSheetFragment) awS177S0101000_12.l0).MR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS177S0101000_12.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS177S0101000_12 awS177S0101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((AdEntryShareSheetFragment) awS177S0101000_12.l0).MR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS177S0101000_12.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS177S0101000_12 awS177S0101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((AdEntryShareSheetFragment) awS177S0101000_12.l0).MR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS177S0101000_12.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS177S0101000_12 awS177S0101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((AdEntryShareSheetFragment) awS177S0101000_12.l0).OR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS177S0101000_12.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS177S0101000_12 awS177S0101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((AdEntryShareSheetFragment) awS177S0101000_12.l0).RR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS177S0101000_12.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS177S0101000_12 awS177S0101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((AdEntryShareSheetFragment) awS177S0101000_12.l0).SR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS177S0101000_12.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS177S0101000_12 awS177S0101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((OrgAccountsListFragment) awS177S0101000_12.l0).VR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS177S0101000_12.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS177S0101000_12 awS177S0101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((CreateOrResetPINFragment) awS177S0101000_12.l0).ZR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS177S0101000_12.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS177S0101000_12 awS177S0101000_12, Object obj, Object obj2) {
        boolean z;
        String str = (String) obj;
        String str2 = (String) obj2;
        ViolationStatusResponse.ResponseData responseData = (ViolationStatusResponse.ResponseData) awS177S0101000_12.l0;
        PunishEventInfo punishEventInfo = responseData.punishEvent;
        if (punishEventInfo != null) {
            if (awS177S0101000_12.i1 == 2) {
                z = true;
            } else {
                z = false;
            }
            C782130UmB.LIZ(responseData.perceptionDialog, punishEventInfo, str, str2, z, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS177S0101000_12 awS177S0101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1696320uFC.LIZLLL((Context) awS177S0101000_12.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS177S0101000_12.i1 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S0101000_12(AdEntryShareSheetFragment adEntryShareSheetFragment, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = adEntryShareSheetFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S0101000_12(OrgAccountsListFragment orgAccountsListFragment, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = orgAccountsListFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S0101000_12(CreateOrResetPINFragment createOrResetPINFragment, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = createOrResetPINFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S0101000_12(ViolationStatusResponse.ResponseData responseData, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = responseData;
        this.i1 = i;
    }
}
