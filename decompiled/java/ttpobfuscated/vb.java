package ttpobfuscated;

import X.AbstractC842510X3h;
import X.C0X0P;
import X.C0X0W;
import X.C0XLX;
import X.C0XLY;
import X.EnumC847200XLi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import ttp.orbu.sdk.constants.TTPErrorCode;

/* JADX INFO: loaded from: classes14.dex */
public final class vb extends gg {
    public int a;

    public static /* synthetic */ void b() {
    }

    public final int a() {
        return this.a;
    }

    @Override // ttpobfuscated.gg
    public C0XLY a(C0X0W c0x0w) {
        int i = this.a;
        if (i > 0) {
            this.a = i - 100;
            C0XLX c0xlx = new C0XLX();
            c0xlx.LIZJ = TTPErrorCode.RequestThrottledInternally.getValue();
            c0xlx.LIZIZ = EnumC847200XLi.HTTP_2;
            c0xlx.LIZLLL = "RequestThrottledInternally";
            c0xlx.LIZ = c0x0w.request();
            c0xlx.LJI = AbstractC842510X3h.create((C0X0P) null, "");
            return c0xlx.LIZ();
        }
        C0XLY c0xlyLIZ = c0x0w.LIZ(c0x0w.request());
        if (c0xlyLIZ.LIZIZ()) {
            this.a = 0;
            return c0xlyLIZ;
        }
        int i2 = c0xlyLIZ.LLILLL;
        if (i2 == TTPErrorCode.RateLimitExceeded.getValue()) {
            this.a += LSPassThroughRecordSizeConfig.DEFAULT;
            return c0xlyLIZ;
        }
        if (i2 != TTPErrorCode.Forbidden.getValue()) {
            return c0xlyLIZ;
        }
        this.a = Integer.MAX_VALUE;
        return c0xlyLIZ;
    }

    public final void a(int i) {
        this.a = i;
    }
}
