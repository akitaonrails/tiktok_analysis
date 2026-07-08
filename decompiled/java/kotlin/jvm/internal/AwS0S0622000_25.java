package kotlin.jvm.internal;

import X.C09AY;
import X.C1378605aS;
import X.C1671460tb6;
import X.C1675710thx;
import X.C1683130ttv;
import X.C341440Da2;
import X.EnumC1360305Ub;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0622000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i8;
    public int i9;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public boolean z6;
    public boolean z7;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0622000_25 awS0S0622000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1671460tb6.LIZJ((SocMediaResource) awS0S0622000_25.l0, (Function1) awS0S0622000_25.l1, (Function1) awS0S0622000_25.l2, (Function1) awS0S0622000_25.l3, awS0S0622000_25.z6, (C1683130ttv) awS0S0622000_25.l4, (MediaEngine) awS0S0622000_25.l5, awS0S0622000_25.z7, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0622000_25.i8 | 1), awS0S0622000_25.i9);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0622000_25 awS0S0622000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1675710thx.LIZ((ThoughtAggregatedModel) awS0S0622000_25.l0, awS0S0622000_25.i8, awS0S0622000_25.z6, awS0S0622000_25.z7, (Function0) awS0S0622000_25.l1, (Function0) awS0S0622000_25.l2, (Function0) awS0S0622000_25.l3, (Function1) awS0S0622000_25.l4, (Function0) awS0S0622000_25.l5, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0622000_25.i9 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0622000_25(SocMediaResource socMediaResource, SocMediaResource socMediaResource2, Function1<? super EnumC1360305Ub, Unit> function1, Function1<? super String, Unit> function12, Function1<? super Float, Unit> function13, boolean z, C1683130ttv c1683130ttv, MediaEngine mediaEngine, boolean z2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = socMediaResource;
        this.l1 = socMediaResource2;
        this.l2 = function1;
        this.l3 = function12;
        this.z6 = function13;
        this.l4 = z;
        this.l5 = c1683130ttv;
        this.z7 = mediaEngine;
        this.i8 = z2 ? 1 : 0;
        this.i9 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0622000_25(ThoughtAggregatedModel thoughtAggregatedModel, ThoughtAggregatedModel thoughtAggregatedModel2, int i, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super C1378605aS, Unit> function1, Function0<Unit> function04, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = thoughtAggregatedModel;
        this.i8 = thoughtAggregatedModel2;
        this.z6 = i;
        this.z7 = z;
        this.l1 = z2;
        this.l2 = function0;
        this.l3 = function02;
        this.l4 = function03;
        this.l5 = function1;
        this.i9 = function04;
    }
}
