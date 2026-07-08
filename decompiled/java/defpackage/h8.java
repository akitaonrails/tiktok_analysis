package defpackage;

import X.AnonymousClass0956;
import X.C0PEM;
import X.C11JF;
import X.C1DFK;
import X.C2214201BlK;
import X.C23118094a;
import X.C23250099c;
import X.InterfaceC497601wk;
import Y.AfS171S0100000_2;
import com.ss.android.ugc.aweme.checkout.model.ShopifyCheckoutTokenResponse;
import com.ss.android.ugc.aweme.checkout.model.TokenPayload;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h8 implements InterfaceC497601wk {
    public static volatile h8 LLJ;
    public final String LL;
    public ShopifyCheckoutTokenResponse LLILLL;
    public AnonymousClass0956 LLILZIL;
    public C1DFK LLILLJJLI = C23118094a.LIZ();
    public final AtomicInteger LLILZ = new AtomicInteger(0);
    public final long LLIZ = 240;
    public final int LLIZLLLIL = 3;
    public C11JF LLILZLL = (C11JF) C2214201BlK.LIZLLL().LJJLJLI(new AfS171S0100000_2(this, 38));

    public static abstract class b {

        public static final class a extends b {
            public static final a LIZ = new a();
        }

        /* JADX INFO: renamed from: h8$b$b, reason: collision with other inner class name */
        public static final class C0038b extends b {
            public static final C0038b LIZ = new C0038b();
        }
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return C0PEM.LIZJ.plus(this.LLILLJJLI);
    }

    public final void LIZJ() {
        this.LLILLJJLI = C23118094a.LIZ();
        this.LLILZ.set(0);
        LIZIZ(new AwS581S0100000_2(this, 438));
    }

    public static final class a {
        public static h8 LIZ(String str) {
            if (h8.LLJ == null) {
                h8 h8Var = h8.LLJ;
                if (h8Var != null) {
                    AnonymousClass0956 anonymousClass0956 = h8Var.LLILZIL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    h8Var.LLILZIL = null;
                    h8Var.LLILLJJLI.LIZIZ(null);
                    h8Var.LLILZ.set(0);
                    C11JF c11jf = h8Var.LLILZLL;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                }
                h8.LLJ = new h8(str);
            }
            h8 h8Var2 = h8.LLJ;
            if (h8Var2 == null) {
                h8 h8Var3 = new h8(str);
                h8.LLJ = h8Var3;
                return h8Var3;
            }
            return h8Var2;
        }
    }

    public h8(String str) {
        this.LL = str;
    }

    public final void LIZIZ(Function1<? super Boolean, Unit> function1) {
        if (this.LLILZ.get() >= this.LLIZLLLIL) {
            function1.invoke(Boolean.FALSE);
            this.LLILZ.set(0);
        } else {
            C23250099c.LIZLLL(this, null, null, new l8(this, new AwS368S0200000_2(this, (h8) function1, (Function1<? super Boolean, Unit>) 88), null), 3);
        }
    }

    public static String LIZ(b bVar, ShopifyCheckoutTokenResponse shopifyCheckoutTokenResponse) {
        TokenPayload tokenPayload;
        TokenPayload tokenPayload2;
        if (Intrinsics.LJFF(bVar, b.C0038b.LIZ)) {
            if (shopifyCheckoutTokenResponse != null && (tokenPayload2 = shopifyCheckoutTokenResponse.onSiteTokenPayload) != null) {
                return tokenPayload2.jwtToken;
            }
            return null;
        }
        if (Intrinsics.LJFF(bVar, b.a.LIZ) && shopifyCheckoutTokenResponse != null && (tokenPayload = shopifyCheckoutTokenResponse.offSiteTokenPayload) != null) {
            return tokenPayload.jwtToken;
        }
        return null;
    }
}
