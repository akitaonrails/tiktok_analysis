package kotlin.jvm.internal;

import X.C09AY;
import X.C0CNO;
import X.C1389910mGz;
import X.C20642515q3;
import X.C786410Ut5;
import X.C877320YbK;
import X.C885760Yow;
import X.EnumC885270Yo9;
import X.InterfaceC879010Ye3;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.bytedance.tux.input.TuxTextView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS4S1310000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS4S1310000_14 awS4S1310000_14, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        final C1389910mGz c1389910mGz = (C1389910mGz) awS4S1310000_14.l1;
        final C885760Yow c885760Yow = (C885760Yow) awS4S1310000_14.l2;
        final boolean z = awS4S1310000_14.z4;
        final List list = (List) awS4S1310000_14.l3;
        final String str = awS4S1310000_14.s0;
        tuxTextView.setTuxFont(43);
        tuxTextView.setText(2131830240);
        C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0Yop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                c1389910mGz.LIZJ();
                c885760Yow.LIZLLL(list, z, false);
                if (z) {
                    str2 = "primary_all";
                } else {
                    str2 = "primary_selected";
                }
                C885310YoD.LIZ.LJ(list.size(), c885760Yow.LIZ.LIZIZ(), "toast_retry", str2, str);
            }
        });
        viewGroup.addView(tuxTextView);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S1310000_14 awS4S1310000_14, Object obj) {
        List list = (List) obj;
        if (awS4S1310000_14.z4 && ((Activity) awS4S1310000_14.l1) != null) {
            String strLJ = C20642515q3.LJ(2131755200, list.size(), Integer.valueOf(list.size()));
            C877320YbK c877320YbK = C877320YbK.LIZ;
            Activity activity = (Activity) awS4S1310000_14.l1;
            AwS2S1410000_14 awS2S1410000_14 = new AwS2S1410000_14(activity, (Activity) awS4S1310000_14.s0, (String) list, (List<SetConversationSettingInfoResponseBody>) awS4S1310000_14.l2, (InterfaceC879010Ye3) awS4S1310000_14.l3, (EnumC885270Yo9) awS4S1310000_14.z4, true);
            c877320YbK.getClass();
            C0CNO.LIZLLL(0L, new AwS121S1200000_4(awS2S1410000_14, activity, strLJ, 2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S1310000_14(C1389910mGz c1389910mGz, C1389910mGz c1389910mGz2, C885760Yow c885760Yow, boolean z, List<String> list, String str) {
        super(1);
        this.$t = str;
        this.l1 = c1389910mGz;
        this.l2 = c1389910mGz2;
        this.z4 = c885760Yow;
        this.l3 = z;
        this.s0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1310000_14(boolean z, Activity activity, String str, InterfaceC879010Ye3 interfaceC879010Ye3, EnumC885270Yo9 enumC885270Yo9, int i) {
        super(1);
        this.$t = i;
        this.z4 = z;
        this.l1 = activity;
        this.s0 = str;
        this.l2 = interfaceC879010Ye3;
        this.l3 = enumC885270Yo9;
    }
}
