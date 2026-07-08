package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1397630mTR;
import X.C19622411pu;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.capcutpromotion.ButtonAction;
import com.ss.android.ugc.aweme.capcutpromotion.PopupInfo;
import com.ss.android.ugc.aweme.ogc.news.anchor.INewsAnchorProducer;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS31S1400000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final Object invoke$0(AwS31S1400000_29 awS31S1400000_29, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LIZJ(0, ((Context) awS31S1400000_29.l1).getResources().getString(2131826652), new AwS65S1300000_29((C19622411pu) awS31S1400000_29.l2, (INewsAnchorProducer) awS31S1400000_29.l3, (CreateAnchorInfo) awS31S1400000_29.l4, awS31S1400000_29.s0, 2));
        c1397630mTR.LIZJ(1, ((Context) awS31S1400000_29.l1).getResources().getString(2131826651), null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS31S1400000_29 awS31S1400000_29, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        for (ButtonAction buttonAction : ((PopupInfo) awS31S1400000_29.l1).buttonList) {
            int i = buttonAction.buttonStyle;
            if (i != 1) {
                if (i == 2) {
                    c1397630mTR.LIZJ(1, buttonAction.text, new AwS112S1200000_29(awS31S1400000_29.s0, (String) buttonAction, (ButtonAction) awS31S1400000_29.l4, (Function0<Unit>) 6));
                }
            } else {
                c1397630mTR.LIZJ(0, buttonAction.text, new AwS65S1300000_29(awS31S1400000_29.s0, buttonAction, (Activity) awS31S1400000_29.l2, (C013C) awS31S1400000_29.l3, 3));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S1400000_29(Context context, C19622411pu c19622411pu, INewsAnchorProducer iNewsAnchorProducer, CreateAnchorInfo createAnchorInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.l2 = c19622411pu;
        this.l3 = iNewsAnchorProducer;
        this.l4 = createAnchorInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS31S1400000_29(PopupInfo popupInfo, PopupInfo popupInfo2, String str, Activity activity, C013C c013c, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l1 = popupInfo;
        this.s0 = popupInfo2;
        this.l2 = str;
        this.l3 = activity;
        this.l4 = c013c;
    }
}
