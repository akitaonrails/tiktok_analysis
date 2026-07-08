package kotlin.jvm.internal;

import X.C06TB;
import X.C09AY;
import X.C0HVP;
import X.C1331670kl3;
import X.C1332130kln;
import X.C2095008Iq;
import X.C291001Au;
import X.C454440Hru;
import X.EnumC451180Hme;
import X.InterfaceC447740Hh6;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS2S1010000_6 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public boolean z1;

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

    public static final Object invoke$0(AwS2S1010000_6 awS2S1010000_6, Object obj) {
        Bitmap.Config config;
        Integer numLJIIJJI;
        C1331670kl3 c1331670kl3 = (C1331670kl3) obj;
        c1331670kl3.LJJJJLI = C454440Hru.LIZ();
        String str = awS2S1010000_6.s0;
        if (!Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType())) && !Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.VIDEO_STICKER_STATIC.getType()))) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        InterfaceC447740Hh6 imStickerStoreService = IMStickerApi.LIZ.LIZIZ().getImStickerStoreService();
        String str2 = awS2S1010000_6.s0;
        if (str2 != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str2);
        } else {
            numLJIIJJI = null;
        }
        C06TB c06tbLJIJJ = imStickerStoreService.LJIJJ(numLJIIJJI);
        c1331670kl3.LIZLLL = !awS2S1010000_6.z1;
        c1331670kl3.LJIL = config;
        C1332130kln.LIZJ(c1331670kl3, c06tbLJIJJ);
        return c1331670kl3;
    }

    public static final Object invoke$1(AwS2S1010000_6 awS2S1010000_6, Object obj) {
        return C0HVP.LIZ((C0HVP) obj, null, null, null, null, new C291001Au(awS2S1010000_6.s0), Boolean.valueOf(awS2S1010000_6.z1), null, null, null, 975);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1010000_6(String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
