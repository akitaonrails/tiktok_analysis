package kotlin.jvm.internal;

import X.AbstractC1542200qEc;
import X.C09AY;
import X.C1623606Xi;
import X.C291001Au;
import X.C479490IrD;
import X.C499900Jj2;
import X.C626160OhC;
import X.C627660Ojc;
import X.C759930TrT;
import X.EnumC479370Ir1;
import X.InterfaceC1554220qY0;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.livesdk.usermanage.UserManageService;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public class AwS92S1200000_7 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS92S1200000_7 awS92S1200000_7, Object obj) {
        ((Function0) awS92S1200000_7.l1).invoke();
        C499900Jj2 c499900Jj2 = (C499900Jj2) awS92S1200000_7.l2;
        String str = awS92S1200000_7.s0;
        c499900Jj2.getClass();
        C499900Jj2.LIZJ(str, "click", "cancel");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS92S1200000_7 awS92S1200000_7, Object obj) {
        C479490IrD c479490IrD = (C479490IrD) obj;
        return C479490IrD.LIZ(c479490IrD, C627660Ojc.LIZ(c479490IrD.LL, new C1623606Xi(new C626160OhC(false, false, 3)), null, null, (List) awS92S1200000_7.l1, 6), (EnumC479370Ir1) awS92S1200000_7.l2, awS92S1200000_7.s0, false, new C291001Au(Unit.LIZ), 24);
    }

    public static final Object invoke$2(AwS92S1200000_7 awS92S1200000_7, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        final UserManageService userManageService = (UserManageService) awS92S1200000_7.l1;
        final String str = awS92S1200000_7.s0;
        final C759930TrT c759930TrT = (C759930TrT) awS92S1200000_7.l2;
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0TrS
            /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
            @Override // X.AbstractC1537870q7d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJLIIIL(X.InterfaceC1541990qEH r10) {
                /*
                    Method dump skipped, instruction units count: 247
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C759920TrS.LJLIIIL(X.0qEH):void");
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) throws JSONException {
                UserManageService userManageService2 = userManageService;
                String str4 = str;
                C759930TrT c759930TrT2 = c759930TrT;
                if (str3 == null) {
                    str3 = "onLoadUnknownFailed";
                }
                userManageService2.getClass();
                HashMap map = new HashMap();
                map.put("to_user_id", String.valueOf(c759930TrT2.LJ));
                map.put("request_page", c759930TrT2.LJII);
                map.put("event_page", "live_detail");
                map.put("admin_type", UserManageService.LIZ(c759930TrT2));
                if (Intrinsics.LJFF(c759930TrT2.LJIJJ, "3")) {
                    map.put("report_type", "report_question");
                } else if (!TextUtils.isEmpty(c759930TrT2.LJIJ)) {
                    map.put("report_type", c759930TrT2.LJIJ);
                }
                if (!TextUtils.isEmpty(c759930TrT2.LJJII)) {
                    map.put("video_id", c759930TrT2.LJJII);
                }
                if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
                    map.put("enter_live_method", C466640IRq.LIZJ().LIZLLL());
                }
                w.LIZ.getClass();
                map.put("small_picture_order", w.LJJI());
                map.put("live_window_mode", w.LJIILLIIL());
                if (C497740JfY.LJIL()) {
                    map.put("room_orientation", "portrait");
                } else {
                    map.put("room_orientation", "landscape");
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject.put("enter_from", c759930TrT2.LJIIIIZZ);
                jSONObject.put("enter_method", c759930TrT2.LJIIIZ);
                jSONObject.put("use_spark", true);
                jSONObject.put("report_url", str4);
                jSONObject.put("fail_reason", str3);
                C1CC2.LJIIL(0, "ttlive_live_report_load_fail", jSONObject);
                DataChannelGlobal.LLILZ.JQ2(C930590aK9.class, null);
            }
        });
        sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0KVA
            @Override // X.InterfaceC1554220qY0
            public final void LIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILIIL(SparkPopup sparkPopup, View view) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILJJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILL(SparkPopup sparkPopup, int i) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJI(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJJ(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJJLI(SparkPopup sparkPopup, float f) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIFFI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJ(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZI() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewAttachedToWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewDetachedFromWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIZILJ(SparkPopup sparkPopup) {
                DataChannelGlobal.LLILZ.JQ2(C930590aK9.class, null);
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S1200000_7(List list, EnumC479370Ir1 enumC479370Ir1, int i) {
        super(1);
        this.$t = i;
        this.l1 = list;
        this.l2 = enumC479370Ir1;
        this.s0 = "preload";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S1200000_7(UserManageService userManageService, String str, C759930TrT c759930TrT, int i) {
        super(1);
        this.$t = i;
        this.l1 = userManageService;
        this.s0 = str;
        this.l2 = c759930TrT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS92S1200000_7(Function0 function0, Function0<Unit> function02, C499900Jj2 c499900Jj2, String str) {
        super(1);
        this.$t = str;
        this.l1 = function0;
        this.l2 = function02;
        this.s0 = c499900Jj2;
    }
}
