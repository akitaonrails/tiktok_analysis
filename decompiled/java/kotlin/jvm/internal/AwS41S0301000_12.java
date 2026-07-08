package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C09AY;
import X.C1347740lAy;
import X.C1397620mTQ;
import X.C1CC2;
import X.C761560Tu6;
import X.C761570Tu7;
import X.C766270U4b;
import X.C782130UmB;
import X.InterfaceC1631620sYq;
import X.InterfaceC777420Uea;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.MultiGuestLiveSuspended;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AwS41S0301000_12 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS41S0301000_12 awS41S0301000_12, Object obj) {
        String resourceId;
        ((C761560Tu6) awS41S0301000_12.l0).LLLI(awS41S0301000_12.i3, (LiveEffect) awS41S0301000_12.l1);
        Function1<LiveEffect, Unit> function1 = ((C761560Tu6) awS41S0301000_12.l0).LL;
        if (function1 != null) {
            function1.invoke((LiveEffect) awS41S0301000_12.l1);
        }
        ((C761570Tu7) awS41S0301000_12.l2).I5(true);
        C761560Tu6 c761560Tu6 = (C761560Tu6) awS41S0301000_12.l0;
        Iterator it2 = ((ArrayList) c761560Tu6.LLILLJJLI).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LiveEffect liveEffect = (LiveEffect) it2.next();
            LiveEffect liveEffect2 = c761560Tu6.LLILLL;
            if (liveEffect2 != null) {
                resourceId = liveEffect2.getResourceId();
            } else {
                resourceId = null;
            }
            if (Intrinsics.LJFF(resourceId, liveEffect.getResourceId())) {
                if (i >= 0) {
                    ((C761560Tu6) awS41S0301000_12.l0).notifyItemChanged(i);
                }
            } else {
                i++;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S0301000_12 awS41S0301000_12, Object obj) {
        ViolationStatusResponse.ResponseData responseData = (ViolationStatusResponse.ResponseData) obj;
        if (responseData == null || responseData.status == 0 || responseData == null || (responseData.perceptionDialog == null && (responseData == null || responseData.punishEvent == null))) {
            C766270U4b.LIZLLL(2131843627);
        } else {
            Context context = (Context) awS41S0301000_12.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) awS41S0301000_12.l1;
            InterfaceC777420Uea interfaceC777420Uea = (InterfaceC777420Uea) awS41S0301000_12.l2;
            int i = awS41S0301000_12.i3;
            if (responseData != null) {
                PerceptionDialogInfo perceptionDialogInfo = responseData.perceptionDialog;
                if (perceptionDialogInfo != null) {
                    C782130UmB.LIZLLL(perceptionDialogInfo, context, lifecycleOwner, interfaceC777420Uea, null, null, new AwS177S0101000_12(responseData, i, 8), 88);
                }
            } else {
                C1CC2.LIZ("on live suspended, but get no perception info ....", new IllegalStateException("on live suspended, but get no perception info ...."));
            }
            DataChannelGlobal.LLILZ.GQ2(MultiGuestLiveSuspended.class);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS41S0301000_12 awS41S0301000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Context) awS41S0301000_12.l0).getResources().getString(2131829117), new AwS98S0201000_12((Fragment) awS41S0301000_12.l1, (Fragment) awS41S0301000_12.i3, (int) awS41S0301000_12.l2, (Function0<Unit>) 6));
        c1397620mTQ.LIZJ(1, ((Context) awS41S0301000_12.l0).getResources().getString(2131829118), AFwS245S0000000_12.get$arr$(267));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS41S0301000_12 awS41S0301000_12, Object obj) {
        C1347740lAy.LIZJ((AbstractC738140SxQ) awS41S0301000_12.l0, awS41S0301000_12.i3, null, (InterfaceC1631620sYq) awS41S0301000_12.l1, 4);
        Function0 function0 = (Function0) awS41S0301000_12.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0301000_12(Context context, KeyboardDialogFragment keyboardDialogFragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = context;
        this.l1 = keyboardDialogFragment;
        this.i3 = i;
        this.l2 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS41S0301000_12(AbstractC738140SxQ abstractC738140SxQ, AbstractC738140SxQ abstractC738140SxQ2, int i, InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Intent, Unit> interfaceC1631620sYq, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = abstractC738140SxQ;
        this.i3 = abstractC738140SxQ2;
        this.l1 = i;
        this.l2 = interfaceC1631620sYq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0301000_12(C761560Tu6 c761560Tu6, int i, LiveEffect liveEffect, C761570Tu7 c761570Tu7, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c761560Tu6;
        this.i3 = i;
        this.l1 = liveEffect;
        this.l2 = c761570Tu7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0301000_12(Context context, LifecycleOwner lifecycleOwner, InterfaceC777420Uea interfaceC777420Uea, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = context;
        this.l1 = lifecycleOwner;
        this.l2 = interfaceC777420Uea;
        this.i3 = i;
    }
}
