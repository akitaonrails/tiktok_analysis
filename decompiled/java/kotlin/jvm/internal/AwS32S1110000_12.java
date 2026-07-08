package kotlin.jvm.internal;

import X.C09AY;
import X.C0TMG;
import X.C0X9S;
import X.C1397620mTQ;
import X.InterfaceC594300NSq;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS32S1110000_12 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S1110000_12 awS32S1110000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, awS32S1110000_12.s0, new AwS591S0100000_12((Function0) awS32S1110000_12.l1, (Function0<Unit>) 844));
        if (awS32S1110000_12.z2) {
            c1397620mTQ.LJII(R.string.f1_, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS32S1110000_12 awS32S1110000_12, Object obj) {
        int i;
        C0TMG c0tmg = ((AdSettingsActivity) awS32S1110000_12.l1).LLJJI;
        String str = awS32S1110000_12.s0;
        if (awS32S1110000_12.z2) {
            i = 2;
        } else {
            i = 1;
        }
        C0X9S<String> c0x9sLIZ = c0tmg.LIZ(str, i);
        final AdSettingsActivity adSettingsActivity = (AdSettingsActivity) awS32S1110000_12.l1;
        final boolean z = awS32S1110000_12.z2;
        c0x9sLIZ.enqueue(new InterfaceC594300NSq<String>() { // from class: X.0TJs
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<String> c0x9s, Throwable th) {
                C1389890mGx c1389890mGx = new C1389890mGx(adSettingsActivity);
                c1389890mGx.LJIIJ("Request Failed");
                c1389890mGx.LJIIJJI();
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<String> c0x9s, C0X52<String> c0x52) {
                String str2;
                n nVarLLLZIL;
                k kVarLJJIIZ;
                if (c0x52 != null && c0x52.LIZJ() && (str2 = c0x52.LIZIZ) != null && (nVarLLLZIL = adSettingsActivity.LLLZIL(str2)) != null && (kVarLJJIIZ = nVarLLLZIL.LJJIIZ("status_code")) != null && kVarLJJIIZ.LJIIJJI() == 0) {
                    C11GO c11go = (C11GO) adSettingsActivity.LLLLLZL().getAccessory();
                    c11go.LJIILJJIL(!z);
                    c11go.LJIILIIL();
                    C1440005kM.LIZ(new C744870TJt());
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS32S1110000_12 awS32S1110000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131858114, new AwS32S1110000_12((AdSettingsActivity) awS32S1110000_12.l1, awS32S1110000_12.s0, awS32S1110000_12.z2, 1));
        c1397620mTQ.LJII(2131858113, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S1110000_12(AdSettingsActivity adSettingsActivity, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = adSettingsActivity;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S1110000_12(String str, Function0 function0, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z2 = z;
        this.l1 = function0;
    }
}
