package kotlin.jvm.internal;

import X.C09AY;
import X.C0E80;
import X.C348100Dkm;
import X.C359380E7c;
import X.C359400E7e;
import X.C359480E7m;
import X.C382890Ezn;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS2S0020000_5 extends C09AY implements Function1 {
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S0020000_5 awS2S0020000_5, Object obj) {
        return C382890Ezn.LIZ((C382890Ezn) obj, awS2S0020000_5.z0, null, null, awS2S0020000_5.z1, 0, null, 0, false, 0L, null, 0, null, false, false, false, 32758);
    }

    public static final Object invoke$1(AwS2S0020000_5 awS2S0020000_5, Object obj) {
        C359400E7e c359400E7e = (C359400E7e) obj;
        return C359400E7e.LIZ(c359400E7e, null, null, null, null, null, C359380E7c.LIZ(c359400E7e.LJFF, new C0E80(awS2S0020000_5.z0, awS2S0020000_5.z1), false, false, false, 14), null, null, null, null, null, null, null, null, 16351);
    }

    public static final Object invoke$2(AwS2S0020000_5 awS2S0020000_5, Object obj) {
        INLEMediaSettings mediaSettingApi = ((C348100Dkm) obj).LIZIZ.getMediaSettingApi();
        if (awS2S0020000_5.z0) {
            mediaSettingApi.setDleEnabledPreview(awS2S0020000_5.z1);
        } else {
            mediaSettingApi.setDleEnabled(awS2S0020000_5.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS2S0020000_5 awS2S0020000_5, Object obj) {
        boolean z = awS2S0020000_5.z0;
        return C359480E7m.LIZ((C359480E7m) obj, false, false, z, z, false, z, false, false, false, false, false, false, false, false, null, false, awS2S0020000_5.z1, false, false, false, false, 4063187);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0020000_5(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
