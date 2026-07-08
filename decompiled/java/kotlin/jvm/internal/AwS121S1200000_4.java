package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0CAH;
import X.C0DSZ;
import X.C1360890lWB;
import X.C1389910mGz;
import X.C1862330yYx;
import X.C189200o6;
import X.C19EG;
import X.C20235014Fo;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1603190roz;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AwS121S1200000_4 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS121S1200000_4 awS121S1200000_4) {
        if (!TextUtils.isEmpty(awS121S1200000_4.s0) && ((JSONObject) awS121S1200000_4.l1) != null && ((C0CAH) awS121S1200000_4.l2).LIZ.isInitialized()) {
            AppLogNewUtils.onEventV3(awS121S1200000_4.s0, (JSONObject) awS121S1200000_4.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS121S1200000_4 awS121S1200000_4) {
        StateOwner.LL.getClass();
        MutableLiveData<Boolean> mutableLiveData = StateOwner.LLJJIJI;
        C19EG c19eg = (C19EG) awS121S1200000_4.l1;
        final String str = awS121S1200000_4.s0;
        final List list = (List) awS121S1200000_4.l2;
        mutableLiveData.observe(c19eg, new Observer() { // from class: X.01VL
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (((Boolean) obj).booleanValue() && Intrinsics.LJFF(str, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01VM(list, null), 3);
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS121S1200000_4 awS121S1200000_4) {
        int i;
        if (((Activity) awS121S1200000_4.l1) instanceof InterfaceC1603190roz) {
            i = 61;
        } else {
            i = 12;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        C1389910mGz c1389910mGz = new C1389910mGz((Activity) awS121S1200000_4.l1);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LJIIJ(awS121S1200000_4.s0);
        c1389910mGz.LIZIZ(iLIZIZ + ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight((Activity) awS121S1200000_4.l1));
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 1;
        c1360890lWB.LIZLLL = 3;
        c1389910mGz.LIZ.LJ = new AwS213S0300000_4((Activity) awS121S1200000_4.l1, (Activity) c1389910mGz, (C1389910mGz) awS121S1200000_4.l2, (Function0<Unit>) 17);
        c1389910mGz.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS121S1200000_4 awS121S1200000_4) {
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = awS121S1200000_4.s0;
        Map map = (Map) awS121S1200000_4.l1;
        Map map2 = (Map) awS121S1200000_4.l2;
        try {
            C20235014Fo c20235014Fo = C1862330yYx.LIZLLL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("card_content", str);
            c1862330yYx.getClass();
            C1862330yYx.LLII(jSONObject, map);
            C1862330yYx.LLII(jSONObject, map2);
            c20235014Fo.LIZIZ("tikbot_guide_bar_show", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS121S1200000_4 awS121S1200000_4) {
        final Context context = (Context) awS121S1200000_4.l1;
        final String str = awS121S1200000_4.s0;
        final Function0 function0 = (Function0) awS121S1200000_4.l2;
        return new C0DSZ(context, str, function0) { // from class: X.0DSY
            public final /* synthetic */ Context LIZLLL;
            public final /* synthetic */ String LJ;

            @Override // X.C0DSZ
            public final void LIZ(LinearLayout linearLayout) {
                C1361400lX0 c1361400lX0 = new C1361400lX0(this.LIZLLL, R.style.y0);
                TuxTextView tuxTextView = new TuxTextView(this.LIZLLL, null, 6, 0);
                tuxTextView.setText(this.LJ);
                tuxTextView.setGravity(17);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0);
                if (numLIZJ != null) {
                    tuxTextView.setTextColor(numLIZJ.intValue());
                }
                tuxTextView.setTuxFont(33);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                layoutParams.gravity = 17;
                C786410Ut5.R6(tuxTextView, layoutParams);
                linearLayout.setGravity(17);
                linearLayout.addView(tuxTextView);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, function0);
                this.LIZLLL = context;
                this.LJ = str;
            }
        }.LIZJ.getValue();
    }

    public static final Object invoke$5(AwS121S1200000_4 awS121S1200000_4) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIJ((C19EG) awS121S1200000_4.l1, UriProtector.parse(awS121S1200000_4.s0));
        ((Function0) awS121S1200000_4.l2).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S1200000_4(JSONObject jSONObject, C0CAH c0cah, int i) {
        super(0);
        this.$t = i;
        this.s0 = "webview_hooker_sdk_event";
        this.l1 = jSONObject;
        this.l2 = c0cah;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS121S1200000_4(C19EG c19eg, C19EG c19eg2, String str, List<? extends Aweme> list) {
        super(0);
        this.$t = list;
        this.l1 = c19eg;
        this.s0 = c19eg2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS121S1200000_4(C19EG c19eg, C19EG c19eg2, String str, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l1 = c19eg;
        this.s0 = c19eg2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS121S1200000_4(Context context, Context context2, String str, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l1 = context;
        this.s0 = context2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS121S1200000_4(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        super(0);
        this.$t = map2;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S1200000_4(Function0 function0, Activity activity, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = activity;
        this.s0 = str;
        this.l2 = function0;
    }
}
