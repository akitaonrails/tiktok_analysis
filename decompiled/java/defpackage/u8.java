package defpackage;

import X.AbstractC879060Ye8;
import X.C09AY;
import X.C0Y8T;
import X.C13IQ;
import X.C866530Xz1;
import X.C898670ZNh;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS5S0120000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class u8 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SingleDetailFragment LL;
    public final /* synthetic */ IMUser LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ AbstractC879060Ye8 LLIZLLLIL;
    public final /* synthetic */ C0Y8T LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ C13IQ<? extends UISlotAssem> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(SingleDetailFragment singleDetailFragment, IMUser iMUser, boolean z, boolean z2, String str, Long l, boolean z3, C866530Xz1 c866530Xz1, C0Y8T c0y8t, boolean z4, C13IQ c13iq) {
        super(1);
        this.LL = singleDetailFragment;
        this.LLILLJJLI = iMUser;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = str;
        this.LLILZLL = l;
        this.LLIZ = z3;
        this.LLIZLLLIL = c866530Xz1;
        this.LLJ = c0y8t;
        this.LLJI = z4;
        this.LLJIJIL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.DQ2(this.LL, new AwS5S0120000_2(this.LLILLJJLI, this.LLILLL, this.LLILZ, 2));
        assembler2.QQ2(this.LL, AFwS229S0000000_2.get$arr$(752));
        assembler2.RQ2(this.LL, AFwS229S0000000_2.get$arr$(774));
        assembler2.RQ2(this.LL, AFwS229S0000000_2.get$arr$(795));
        SingleDetailFragment singleDetailFragment = this.LL;
        assembler2.DQ2(singleDetailFragment, new q8(singleDetailFragment, this.LLILLJJLI, this.LLILZIL, this.LLILZLL, this.LLILLL, this.LLILZ, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI));
        assembler2.RQ2(this.LL, new r8(this.LLJIJIL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
        SingleDetailFragment singleDetailFragment2 = this.LL;
        assembler2.QQ2(singleDetailFragment2, new AwS581S0100000_2(singleDetailFragment2, 620));
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null && iMCrossAppFeatureDiffApiLIZIZ.LIZLLL()) {
            assembler2.RQ2(this.LL, AFwS229S0000000_2.get$arr$(838));
        }
        return Unit.LIZ;
    }
}
