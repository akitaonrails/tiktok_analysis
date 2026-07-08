package kotlin.jvm.internal;

import X.C09AY;
import X.C0FNV;
import X.C0VSJ;
import X.C103L;
import X.C106V;
import X.C1075780e6K;
import X.C10BK;
import X.C1247120iYg;
import X.C1260960iv0;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1592306Lh;
import X.C1892170zL5;
import X.C1900870zZ7;
import X.C1907120zjC;
import X.C1913480ztS;
import X.C191821102p;
import X.C19331510k5;
import X.C197039127h;
import X.C2095008Iq;
import X.C2097608Jq;
import X.DialogC1389620mGW;
import X.ExecutorC1592406Li;
import X.InterfaceC1907020zj2;
import X.InterfaceC1910160zo6;
import X.RunnableC514801zW;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS90S1300000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS90S1300000_28 awS90S1300000_28) {
        String accountType;
        Integer numLJIIJJI;
        Bundle arguments;
        GeneralTemplateNotice generalTemplateNotice;
        InterfaceC1907020zj2 mBridge = ((C1907120zjC) awS90S1300000_28.l1).getMBridge();
        String str = null;
        if (mBridge != null) {
            accountType = mBridge.getAccountType();
        } else {
            accountType = null;
        }
        C1907120zjC c1907120zjC = (C1907120zjC) awS90S1300000_28.l1;
        Fragment curFragment = ((InterfaceC1907020zj2) awS90S1300000_28.l2).getCurFragment();
        MusNotice mBaseNotice = c1907120zjC.getMBaseNotice();
        if (mBaseNotice != null && (generalTemplateNotice = mBaseNotice.templateNotice) != null) {
            str = generalTemplateNotice.messageExtra;
        }
        Map<String, String> mapLIZ = C1075780e6K.LIZ(str);
        String str2 = C1900870zZ7.LIZIZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        mapLIZ.put("light_interaction_enter_method", str2);
        int iIntValue = 0;
        if (curFragment != null && (arguments = curFragment.getArguments()) != null && arguments.getInt("is_from_push", 0) == 1) {
            mapLIZ.put("is_from_push", "1");
            String string = arguments.getString("push_type");
            if (string == null) {
                string = "";
            }
            mapLIZ.put("push_type", string);
            String string2 = arguments.getString("push_id");
            if (string2 != null) {
                str3 = string2;
            }
            mapLIZ.put("push_id", str3);
        }
        String str4 = (String) ((Map) awS90S1300000_28.l3).get("from");
        if (str4 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str4)) != null) {
            iIntValue = numLJIIJJI.intValue();
        }
        return new C1260960iv0("notification_page", (User) null, "button", (String) (0 == true ? 1 : 0), "message", (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), "other_places", "1002", (String) (0 == true ? 1 : 0), awS90S1300000_28.s0, (String) (0 == true ? 1 : 0), accountType, C1900870zZ7.LIZ, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 0, (int) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), iIntValue, (String) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Map) mapLIZ, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1247120iYg) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), -2110870, -2049, 16383);
    }

    public static final Object invoke$1(AwS90S1300000_28 awS90S1300000_28) {
        File file = (File) awS90S1300000_28.l1;
        if (file != null) {
            ImageView imageView = (ImageView) awS90S1300000_28.l2;
            String str = awS90S1300000_28.s0;
            InterfaceC1910160zo6 interfaceC1910160zo6 = (InterfaceC1910160zo6) awS90S1300000_28.l3;
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(file);
            c1331670kl3LJII.LJJI(imageView);
            c1331670kl3LJII.LIZLLL(str);
            c1331670kl3LJII.LJIIJ(new C19331510k5(interfaceC1910160zo6, 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS90S1300000_28 awS90S1300000_28) {
        Function0 function0 = (Function0) awS90S1300000_28.l1;
        if (function0 != null) {
            function0.invoke();
        }
        TPSCRenderManager tPSCRenderManagerLIZJ = C191821102p.LIZJ();
        String str = awS90S1300000_28.s0;
        tPSCRenderManagerLIZJ.getClass();
        C103L c103lLJ = TPSCRenderManager.LJ(str);
        if (c103lLJ == null) {
            C1913480ztS.LIZ("pns_tpsc_configurable_exception", C2097608Jq.LJIIIIZZ(new Pair("type", "server_no_config"), new Pair("page_tag", awS90S1300000_28.s0)), null, 12);
            ((Function0) awS90S1300000_28.l2).invoke();
        } else {
            ((Function1) awS90S1300000_28.l3).invoke(c103lLJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS90S1300000_28 awS90S1300000_28) {
        C1592306Lh c1592306Lh = C1592306Lh.LIZ;
        C197039127h c197039127h = (C197039127h) awS90S1300000_28.l1;
        c1592306Lh.getClass();
        try {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                C1389890mGx c1389890mGx = new C1389890mGx(c197039127h);
                c1389890mGx.LJIIIZ(2131835023);
                c1389890mGx.LJFF(R.raw.icon_x_mark);
                c1389890mGx.LJII(R.attr.zs);
                c1389890mGx.LIZLLL(3000L);
                c1389890mGx.LJIIJJI();
            } else {
                try {
                    ExecutorC1592406Li.LLILLJJLI.execute(new RunnableC514801zW(c197039127h, 135));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZ(false, awS90S1300000_28.s0, (Long) awS90S1300000_28.l2, ((EcProductAddButtonViewModel) awS90S1300000_28.l3).LLJ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS90S1300000_28 awS90S1300000_28) {
        C0FNV.LIZ((DialogC1389620mGW) awS90S1300000_28.l1);
        C106V.LIZ.getClass();
        TPSCRenderManager tPSCRenderManagerLIZJ = C106V.LIZJ();
        String str = awS90S1300000_28.s0;
        tPSCRenderManagerLIZJ.getClass();
        C103L c103lLJ = TPSCRenderManager.LJ(str);
        if (c103lLJ == null) {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) awS90S1300000_28.l2);
            c1389890mGx.LJIIIZ(2131848597);
            c1389890mGx.LJIIJJI();
        } else {
            ((Function1) awS90S1300000_28.l3).invoke(c103lLJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS90S1300000_28 awS90S1300000_28) {
        C10BK.LIZJ((Context) awS90S1300000_28.l1, (FragmentManager) awS90S1300000_28.l2, awS90S1300000_28.s0, (Function1) awS90S1300000_28.l3, false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S1300000_28(C0VSJ c0vsj, ImageView imageView, String str, InterfaceC1910160zo6 interfaceC1910160zo6, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0vsj;
        this.l2 = imageView;
        this.s0 = str;
        this.l3 = interfaceC1910160zo6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS90S1300000_28(DialogC1389620mGW dialogC1389620mGW, DialogC1389620mGW dialogC1389620mGW2, String str, Activity activity, Function1<? super C103L, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l1 = dialogC1389620mGW;
        this.s0 = dialogC1389620mGW2;
        this.l2 = str;
        this.l3 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS90S1300000_28(C1907120zjC c1907120zjC, C1907120zjC c1907120zjC2, InterfaceC1907020zj2 interfaceC1907020zj2, Map<String, String> map, String str) {
        super(0);
        this.$t = str;
        this.l1 = c1907120zjC;
        this.l2 = c1907120zjC2;
        this.l3 = interfaceC1907020zj2;
        this.s0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S1300000_28(C197039127h c197039127h, EcProductAddButtonViewModel ecProductAddButtonViewModel, Long l, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c197039127h;
        this.s0 = str;
        this.l2 = l;
        this.l3 = ecProductAddButtonViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS90S1300000_28(Context context, Context context2, FragmentManager fragmentManager, String str, Function1<? super Boolean, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l1 = context;
        this.l2 = context2;
        this.s0 = fragmentManager;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S1300000_28(String str, Function0 function0, Function0 function02, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l1 = function0;
        this.s0 = str;
        this.l2 = function02;
        this.l3 = function1;
    }
}
