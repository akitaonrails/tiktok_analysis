package kotlin.jvm.internal;

import X.C06TB;
import X.C09AY;
import X.C0HTL;
import X.C1331670kl3;
import X.C1332060klg;
import X.C1332130kln;
import X.C291001Au;
import X.C461620I8i;
import X.InterfaceC1331800klG;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS3S0020000_6 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;
    public boolean z1;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0020000_6(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = false;
    }

    public static final Object invoke$0(AwS3S0020000_6 awS3S0020000_6, Object obj) {
        InterfaceC1331800klG interfaceC1331800klGLJII;
        C1331670kl3 c1331670kl3 = (C1331670kl3) obj;
        boolean z = awS3S0020000_6.z0;
        boolean z2 = awS3S0020000_6.z1;
        c1331670kl3.LJJJJLI = false;
        C1332130kln.LIZJ(c1331670kl3, C06TB.DEFAULT);
        if (z) {
            c1331670kl3.LJJIFFI = new C1332060klg(20, 3, 0);
        } else if (z2) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null) {
                interfaceC1331800klGLJII = iMCameraBridgeApiLIZ.LJII(16);
            } else {
                interfaceC1331800klGLJII = null;
            }
            c1331670kl3.LJJIJIL(interfaceC1331800klGLJII);
            return c1331670kl3;
        }
        return c1331670kl3;
    }

    public static final Object invoke$1(AwS3S0020000_6 awS3S0020000_6, Object obj) {
        return C0HTL.LIZ((C0HTL) obj, null, null, null, new C291001Au(new Pair(Boolean.valueOf(awS3S0020000_6.z0), Boolean.valueOf(awS3S0020000_6.z1))), null, 23);
    }

    public static final Object invoke$2(AwS3S0020000_6 awS3S0020000_6, Object obj) {
        InterfaceC1331800klG interfaceC1331800klGLJII;
        C1331670kl3 c1331670kl3 = (C1331670kl3) obj;
        boolean z = awS3S0020000_6.z0;
        boolean z2 = awS3S0020000_6.z1;
        c1331670kl3.LJJJJLI = false;
        C1332130kln.LIZJ(c1331670kl3, C06TB.DEFAULT);
        if (z) {
            c1331670kl3.LJJIFFI = new C1332060klg(20, 3, 0);
        } else if (z2) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null) {
                interfaceC1331800klGLJII = iMCameraBridgeApiLIZ.LJII(16);
            } else {
                interfaceC1331800klGLJII = null;
            }
            c1331670kl3.LJJIJIL(interfaceC1331800klGLJII);
            return c1331670kl3;
        }
        return c1331670kl3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0020000_6(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
