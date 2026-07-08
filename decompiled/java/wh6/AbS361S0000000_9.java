package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1388190mED;
import X.C19651011uW;
import X.C19EG;
import android.view.View;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;

/* JADX INFO: loaded from: classes10.dex */
public class AbS361S0000000_9 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;

    public static final void LIZ$1(AbS361S0000000_9 abS361S0000000_9, View view) {
    }

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AbS361S0000000_9(int r4) {
        /*
            r3 = this;
            r3.$t = r4
            if (r4 == 0) goto Lb
            r0 = r3
            r1 = 300(0x12c, double:1.48E-321)
        L7:
            r0.<init>(r1)
            return
        Lb:
            r0 = r3
            r1 = 500(0x1f4, double:2.47E-321)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS361S0000000_9.<init>(int):void");
    }

    public static final void LIZ$0(AbS361S0000000_9 abS361S0000000_9, View view) {
        C19EG c19egLIZIZ;
        if (view != null && (c19egLIZIZ = C1388190mED.LIZIZ(view.getContext())) != null) {
            C19651011uW.LIZIZ.LIZLLL(c19egLIZIZ, null, new AddYourRecordParam(null, true, false, "add_yours_topic_list_page", "add_yours", "topic_list_page_new_prompt", null, false, false, null, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, true, false));
        }
    }
}
