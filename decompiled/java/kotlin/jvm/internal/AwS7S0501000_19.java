package kotlin.jvm.internal;

import X.C09AY;
import X.C0AJC;
import X.C1073960e3O;
import X.C1236570iHf;
import X.C1243220iSO;
import X.C1261090ivD;
import X.C1261200ivO;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C341440Da2;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1680500tpg;
import Y.ACListenerS55S0400000_19;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS7S0501000_19 extends C09AY implements Function2 {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS7S0501000_19 awS7S0501000_19, Object obj, Object obj2) {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue()) {
            C786410Ut5.LLIFFJFJJ((C1236570iHf) awS7S0501000_19.l0, 0);
            C427690Gpr.LJFF((C1236570iHf) awS7S0501000_19.l0, 0.0f);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load success with reason on video cover with index ");
            sbLIZ.append(awS7S0501000_19.i5);
            sbLIZ.append(" for user with nickname ");
            sbLIZ.append(((C1261090ivD) awS7S0501000_19.l1).LIZ.getNickname());
            sbLIZ.append(", background as ");
            sbLIZ.append(((C1236570iHf) awS7S0501000_19.l0).getBackground());
            C2188811AlT.LIZIZ(sbLIZ);
            int i2 = awS7S0501000_19.i5;
            C1261090ivD c1261090ivD = (C1261090ivD) awS7S0501000_19.l1;
            if (i2 >= c1261090ivD.LIZJ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Show Repost Icon video cover with index ");
                sbLIZ2.append(awS7S0501000_19.i5);
                sbLIZ2.append(" for user with nickname ");
                sbLIZ2.append(((C1261090ivD) awS7S0501000_19.l1).LIZ.getNickname());
                C2188811AlT.LIZIZ(sbLIZ2);
                TuxIconView videoCardRepostIconFromXml = ((C1236570iHf) awS7S0501000_19.l0).getVideoCardRepostIconFromXml();
                if (videoCardRepostIconFromXml != null) {
                    C786410Ut5.LLLLLLZZ(videoCardRepostIconFromXml, 0);
                }
                C786410Ut5.F7((C1236570iHf) awS7S0501000_19.l0, new ACListenerS55S0400000_19((Function0) awS7S0501000_19.l3, (C1261200ivO) awS7S0501000_19.l4, (Aweme) awS7S0501000_19.l2, (C1261090ivD) awS7S0501000_19.l1, 0));
            } else {
                C786410Ut5.F7((C1236570iHf) awS7S0501000_19.l0, new ACListenerS55S0400000_19((Function0) awS7S0501000_19.l3, (C1261200ivO) awS7S0501000_19.l4, (Aweme) awS7S0501000_19.l2, c1261090ivD, 1));
                long createTime = ((Aweme) awS7S0501000_19.l2).getCreateTime();
                C1261090ivD c1261090ivD2 = (C1261090ivD) awS7S0501000_19.l1;
                int i3 = awS7S0501000_19.i5;
                C1236570iHf c1236570iHf = (C1236570iHf) awS7S0501000_19.l0;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Create time: ");
                TimeUnit timeUnit = TimeUnit.SECONDS;
                sbLIZ3.append(timeUnit.toMillis(createTime));
                sbLIZ3.append(", Current time: ");
                sbLIZ3.append(System.currentTimeMillis());
                sbLIZ3.append(", Gap: ");
                TimeUnit timeUnit2 = TimeUnit.DAYS;
                sbLIZ3.append(timeUnit2.toMillis(C1073960e3O.LIZJ().newPostsThreshold));
                sbLIZ3.append(", user with nickname ");
                sbLIZ3.append(c1261090ivD2.LIZ.getNickname());
                C2188811AlT.LIZIZ(sbLIZ3);
                if (System.currentTimeMillis() - timeUnit.toMillis(createTime) <= timeUnit2.toMillis(C1073960e3O.LIZJ().newPostsThreshold)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Show New Post Tag video cover with index ");
                    sbLIZ4.append(i3);
                    sbLIZ4.append(" for user with nickname ");
                    sbLIZ4.append(c1261090ivD2.LIZ.getNickname());
                    C2188811AlT.LIZIZ(sbLIZ4);
                    TuxTag videoCardNewPostIconFromXml = c1236570iHf.getVideoCardNewPostIconFromXml();
                    if (videoCardNewPostIconFromXml != null) {
                        C426750GoL.LJIIL(videoCardNewPostIconFromXml, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), 16);
                        if (((Boolean) C0AJC.LIZ.getValue()).booleanValue()) {
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(100));
                            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
                            videoCardNewPostIconFromXml.setBackground(c384050F3z.LIZ(videoCardNewPostIconFromXml.getContext()));
                        }
                        C786410Ut5.LLZLLIL(videoCardNewPostIconFromXml, 0);
                    }
                }
            }
        } else {
            C786410Ut5.F7((C1236570iHf) awS7S0501000_19.l0, new View.OnClickListener() { // from class: X.0ivE
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Load fails with reason on video cover with index ");
            sbLIZ5.append(awS7S0501000_19.i5);
            sbLIZ5.append(" for user with nickname ");
            sbLIZ5.append(((C1261090ivD) awS7S0501000_19.l1).LIZ.getNickname());
            sbLIZ5.append(" as ");
            sbLIZ5.append(str);
            C2188811AlT.LIZIZ(sbLIZ5);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S0501000_19 awS7S0501000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1243220iSO.LIZIZ((Integer) awS7S0501000_19.l0, (Function0) awS7S0501000_19.l1, (Function0) awS7S0501000_19.l2, (Function0) awS7S0501000_19.l3, (Function0) awS7S0501000_19.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS7S0501000_19.i5 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0501000_19(C1236570iHf c1236570iHf, int i, C1261090ivD c1261090ivD, Aweme aweme, AwS563S0100000_19 awS563S0100000_19, C1261200ivO c1261200ivO, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1236570iHf;
        this.i5 = i;
        this.l1 = c1261090ivD;
        this.l2 = aweme;
        this.l3 = awS563S0100000_19;
        this.l4 = c1261200ivO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S0501000_19(Integer num, Integer num2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, int i) {
        super(2);
        this.$t = i;
        this.l0 = num;
        this.l1 = num2;
        this.l2 = function0;
        this.l3 = function02;
        this.l4 = function03;
        this.i5 = function04;
    }
}
