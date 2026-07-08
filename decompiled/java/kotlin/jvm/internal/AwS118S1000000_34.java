package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS118S1000000_34 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
        }
        return this.s0;
    }

    public static final Object invoke$0(AwS118S1000000_34 awS118S1000000_34) {
        MiniGameRenderServiceImpl.LIZIZ.remove(awS118S1000000_34.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S1000000_34(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
