package defpackage;

import X.InterfaceC1456340o08;
import X.InterfaceC1635410sex;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;

/* JADX INFO: loaded from: classes31.dex */
public final class z8 {
    public static InterfaceC1635410sex LIZIZ;
    public static final z8 LIZ = new z8();
    public static final a LIZJ = new a();

    public static final class a implements InterfaceC1456340o08<IEffectService> {
        public EffectService LL;

        @Override // X.InterfaceC1456340o08
        public final IEffectService get() {
            if (this.LL == null) {
                this.LL = EffectService.Companion.getInstance();
            }
            return this.LL;
        }
    }
}
