package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C1397620mTQ;
import X.C1397650mTT;
import X.C1397660mTU;
import X.C21350518gx;
import X.C21350918h1;
import X.C23250099c;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS4S0800000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;

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

    public static final Object invoke$0(AwS4S0800000_32 awS4S0800000_32, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        C21350518gx c21350518gx = (C21350518gx) awS4S0800000_32.l0;
        CharSequence charSequence = c21350518gx.LJ;
        CharSequence charSequence2 = "";
        if (charSequence == null) {
            charSequence = "";
        }
        c1397620mTQ.LIZJ(0, charSequence, new AwS4S0800000_32((Function0) awS4S0800000_32.l1, (Function0<Unit>) c1397620mTQ, (C1397620mTQ) awS4S0800000_32.l2, (LifecycleCoroutineScope) awS4S0800000_32.l3, (IMServiceImpl) c21350518gx, (C21350518gx) awS4S0800000_32.l4, (MentionDataItem) awS4S0800000_32.l5, (Context) awS4S0800000_32.l6, (AIGCSocialModel) 1));
        CharSequence charSequence3 = ((C21350518gx) awS4S0800000_32.l0).LJFF;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        c1397620mTQ.LIZJ(1, charSequence2, new AwS581S0100000_2((Function0) awS4S0800000_32.l7, (Function0<Unit>) 69));
        c1397620mTQ.LJFF = false;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0800000_32 awS4S0800000_32, Object obj) {
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        c1397660mTU.LIZJ = false;
        Function0 function0 = (Function0) awS4S0800000_32.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((C1397650mTT) ListProtector.get(((C1397620mTQ) awS4S0800000_32.l1).LJ, 0)).LIZ(AFwS278S0000000_32.get$arr$(21));
        C23250099c.LIZLLL((LifecycleCoroutineScope) awS4S0800000_32.l2, C0PEM.LIZJ, null, new C21350918h1((IMServiceImpl) awS4S0800000_32.l3, (C21350518gx) awS4S0800000_32.l4, (MentionDataItem) awS4S0800000_32.l5, (C1397620mTQ) awS4S0800000_32.l1, (Context) awS4S0800000_32.l6, (AIGCSocialModel) awS4S0800000_32.l7, c1397660mTU, null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0800000_32(C21350518gx c21350518gx, C21350518gx c21350518gx2, Function0<Unit> function0, LifecycleCoroutineScope lifecycleCoroutineScope, IMServiceImpl iMServiceImpl, MentionDataItem mentionDataItem, Context context, AIGCSocialModel aIGCSocialModel, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = c21350518gx;
        this.l1 = c21350518gx2;
        this.l2 = function0;
        this.l3 = lifecycleCoroutineScope;
        this.l4 = iMServiceImpl;
        this.l5 = mentionDataItem;
        this.l6 = context;
        this.l7 = aIGCSocialModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0800000_32(Function0 function0, Function0<Unit> function02, C1397620mTQ c1397620mTQ, LifecycleCoroutineScope lifecycleCoroutineScope, IMServiceImpl iMServiceImpl, C21350518gx c21350518gx, MentionDataItem mentionDataItem, Context context, AIGCSocialModel aIGCSocialModel) {
        super(1);
        this.$t = aIGCSocialModel;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = c1397620mTQ;
        this.l3 = lifecycleCoroutineScope;
        this.l4 = iMServiceImpl;
        this.l5 = c21350518gx;
        this.l6 = mentionDataItem;
        this.l7 = context;
    }
}
