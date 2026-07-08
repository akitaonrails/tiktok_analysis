package kotlin.jvm.internal;

import X.C09AY;
import X.C1022620cia;
import X.C1375980luW;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C1537900q7g;
import X.C1541950qED;
import X.C2188811AlT;
import X.C985403tE;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS52S1300000_12 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS52S1300000_12 awS52S1300000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Activity) awS52S1300000_12.l1).getString(2131857224), new AwS52S1300000_12((Activity) awS52S1300000_12.l1, (Integer) awS52S1300000_12.l2, (Integer) awS52S1300000_12.l3, awS52S1300000_12.s0, 1));
        c1397620mTQ.LIZJ(1, ((Activity) awS52S1300000_12.l1).getString(2131857223), AFwS245S0000000_12.get$arr$(63));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS52S1300000_12 awS52S1300000_12, Object obj) {
        String tiktokPlusSubmit = null;
        FeedbackConf feedbackConf = (FeedbackConf) SettingsManager.LIZLLL().LJIIIIZZ("feedback_conf", FeedbackConf.class, null);
        if (feedbackConf != null) {
            tiktokPlusSubmit = feedbackConf.getTiktokPlusSubmit();
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(tiktokPlusSubmit).buildUpon();
        Integer num = (Integer) awS52S1300000_12.l1;
        Integer num2 = (Integer) awS52S1300000_12.l2;
        String str = awS52S1300000_12.s0;
        if (num != null) {
            builderBuildUpon.appendQueryParameter("tiktok_plus_error_code", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            builderBuildUpon.appendQueryParameter("tiktok_plus_error_type", String.valueOf(num2.intValue()));
        }
        if (str != null) {
            builderBuildUpon.appendQueryParameter("tiktok_plus_error_msg", str);
        }
        Uri uriBuild = builderBuildUpon.build();
        if (feedbackConf != null && feedbackConf.getTiktokPlusSubmit() != null) {
            Activity activity = (Activity) awS52S1300000_12.l3;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click Dialog Contact Us finalUri: ");
            sbLIZ.append(uriBuild);
            C1022620cia.LIZ("SubscriptionUtils", C2188811AlT.LIZIZ(sbLIZ));
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(uriBuild.toString());
            c1537900q7g.getClass();
            new C1541950qED(activity, sparkContext).LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS52S1300000_12 awS52S1300000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131846531, new AwS109S1200000_26((BnplMiddleActivity) awS52S1300000_12.l1, (BnplMiddleActivity) awS52S1300000_12.s0, (String) awS52S1300000_12.l2, (Function1<? super C1397660mTU, Unit>) 6));
        c1397620mTQ.LJII(R.string.f1_, new AwS109S1200000_26((BnplMiddleActivity) awS52S1300000_12.l1, (BnplMiddleActivity) awS52S1300000_12.s0, (String) awS52S1300000_12.l3, (Function1<? super C1397660mTU, Unit>) 7));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS52S1300000_12 awS52S1300000_12, Object obj) {
        int i;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1397580mTM c1397580mTM = new C1397580mTM((Context) awS52S1300000_12.l1);
        if (zBooleanValue) {
            c1397580mTM.LJFF(2131844940);
            i = 2131844933;
        } else {
            i = 2131830530;
        }
        c1397580mTM.LIZ(i);
        C985403tE.LIZ(c1397580mTM, new AwS12S1210000_12((C1375980luW) awS52S1300000_12.l2, (Aweme) awS52S1300000_12.l3, zBooleanValue, awS52S1300000_12.s0, 1));
        new C1397510mTF(c1397580mTM).LIZLLL();
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS52S1300000_12(android.app.Activity r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            if (r7 == 0) goto L12
            r1 = r2
            r1.l1 = r4
            r1.l2 = r5
            r1.s0 = r6
            r1.l3 = r3
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.l3 = r5
            r1.s0 = r6
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS52S1300000_12.<init>(android.app.Activity, java.lang.Integer, java.lang.Integer, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S1300000_12(Context context, Aweme aweme, C1375980luW c1375980luW, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.l2 = c1375980luW;
        this.l3 = aweme;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS52S1300000_12(BnplMiddleActivity bnplMiddleActivity, BnplMiddleActivity bnplMiddleActivity2, String str, Function1<? super C1397660mTU, Unit> function1, Function1<? super C1397660mTU, Unit> function12) {
        super(1);
        this.$t = function12;
        this.l1 = bnplMiddleActivity;
        this.s0 = bnplMiddleActivity2;
        this.l2 = str;
        this.l3 = function1;
    }
}
