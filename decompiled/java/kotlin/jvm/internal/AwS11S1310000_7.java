package kotlin.jvm.internal;

import X.C09AY;
import X.C0ISJ;
import X.C0WZX;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1701330uNH;
import X.C19EG;
import X.C2204961BRm;
import X.C489110JGb;
import X.EnumC489360JHa;
import X.InterfaceC489200JGk;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.pcs.course.PcsVideoPublishActivity;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS11S1310000_7 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S1310000_7 awS11S1310000_7) {
        Activity activityLIZ;
        if (!awS11S1310000_7.z4) {
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) awS11S1310000_7.l1);
            c1389890mGx.LJIIJ(awS11S1310000_7.s0);
            c1389890mGx.LJIIJJI();
        } else {
            CourseVideoListCell courseVideoListCell = (CourseVideoListCell) awS11S1310000_7.l2;
            InterfaceC489200JGk interfaceC489200JGk = (InterfaceC489200JGk) awS11S1310000_7.l3;
            Context context = courseVideoListCell.getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                courseVideoListCell.LL.getValue().setState(new AwS586S0100000_7(interfaceC489200JGk, 502));
                Intent intent = new Intent(activityLIZ, (Class<?>) PcsVideoPublishActivity.class);
                intent.putExtra("video_publish_scene_key", EnumC489360JHa.RE_EDIT_SCENE);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activityLIZ);
                C2204961BRm.LJIILLIIL(activityLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqrcNHN0ye78R3qIkxlfvPpcVJhc4kpQRn4D3SoqdY6a+dq6OOcbMknbCjwyuYM27seUYUhWiC64srd+w==", null));
            }
            C489110JGb.LJIIIZ(((CourseVideoListCell) awS11S1310000_7.l2).L5(), "edit", "click");
        }
        return Boolean.valueOf(awS11S1310000_7.z4);
    }

    public static final Object invoke$1(AwS11S1310000_7 awS11S1310000_7) {
        C0ISJ.LJJL((C0ISJ) awS11S1310000_7.l1, ((C0ISJ) awS11S1310000_7.l1).LLLLLLZZ, awS11S1310000_7.s0, true, (Function0) awS11S1310000_7.l3, awS11S1310000_7.z4, null, ((LinkedHashSet) awS11S1310000_7.l2).size(), 72);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S1310000_7(C0ISJ c0isj, LinkedHashSet linkedHashSet, String str, AwS408S0200000_7 awS408S0200000_7, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0isj;
        this.l2 = linkedHashSet;
        this.s0 = str;
        this.l3 = awS408S0200000_7;
        this.z4 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S1310000_7(boolean z, C19EG c19eg, String str, CourseVideoListCell courseVideoListCell, InterfaceC489200JGk interfaceC489200JGk, int i) {
        super(0);
        this.$t = i;
        this.z4 = z;
        this.l1 = c19eg;
        this.s0 = str;
        this.l2 = courseVideoListCell;
        this.l3 = interfaceC489200JGk;
    }
}
