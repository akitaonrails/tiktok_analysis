package kotlin.jvm.internal;

import X.C09AY;
import X.C0JT9;
import X.C0UJW;
import X.C1113800f5e;
import X.C1161920gLG;
import X.C1238760iLC;
import X.C13BV;
import X.C19323610io;
import X.C354201Zc;
import X.C468800IZy;
import X.C479490IrD;
import X.C492400JSs;
import X.C493580JXg;
import X.C495520Jby;
import X.C497740JfY;
import X.C521880KdO;
import X.C627660Ojc;
import X.C748880TZe;
import X.C785230UrB;
import X.C785270UrF;
import X.EnumC1120860fH2;
import X.EnumC479370Ir1;
import X.InterfaceC254600ye;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS121S1100000_7 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S1100000_7(EnumC479370Ir1 enumC479370Ir1, int i) {
        super(1);
        this.$t = i;
        this.l1 = enumC479370Ir1;
        this.s0 = "switch_tab";
    }

    public static final Object invoke$0(AwS121S1100000_7 awS121S1100000_7, Object obj) {
        LiveMode liveMode;
        DataChannel dataChannel = ((PreviewSettingWidget) awS121S1100000_7.l1).dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null && C354201Zc.LJFF(liveMode) && C0UJW.LIZIZ) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C785230UrB c785230UrB = new C785230UrB(((PreviewSettingWidget) awS121S1100000_7.l1).contentView);
            c785230UrB.LJIJJ = C497740JfY.LJIJI(2131852622);
            final String str = awS121S1100000_7.s0;
            c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0JjY
                @Override // X.InterfaceC254600ye
                public final void onShow() {
                    C20337914i1<Map<String, Boolean>> c20337914i1 = C0UKZ.LLILLIZIL;
                    Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
                    mapLIZIZ.put(str, Boolean.TRUE);
                    c20337914i1.LJFF(mapLIZIZ);
                }
            };
            c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.REVISION_SUBSCRIPTION_IN_SETTING, ((PreviewSettingWidget) awS121S1100000_7.l1).dataChannel);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS121S1100000_7 awS121S1100000_7, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJZ("event_id", awS121S1100000_7.s0);
        sparkContext.LJJJZ("enter_from", "end_live");
        sparkContext.LJJLIIIJJIZ(new C521880KdO((C468800IZy) awS121S1100000_7.l1, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS121S1100000_7 awS121S1100000_7, Object obj) {
        return C479490IrD.LIZ((C479490IrD) obj, null, (EnumC479370Ir1) awS121S1100000_7.l1, awS121S1100000_7.s0, false, null, 57);
    }

    public static final Object invoke$3(AwS121S1100000_7 awS121S1100000_7, Object obj) {
        C493580JXg c493580JXg;
        Context context;
        String strLJ;
        FragmentManager fragmentManager;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str) && (context = (c493580JXg = (C493580JXg) awS121S1100000_7.l1).LIZ) != null) {
            String str2 = awS121S1100000_7.s0;
            if (Intrinsics.LJFF(str, "native_click_entrance")) {
                strLJ = c493580JXg.LIZJ.LJ(c493580JXg.LIZ, c493580JXg.LJI, "live_take_page", "", AFwS193S0000000_7.get$arr$(218));
            } else if (Intrinsics.LJFF(str, "native_letter_cover")) {
                DataChannel dataChannel = c493580JXg.LIZIZ;
                strLJ = null;
                if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).xf();
                    C492400JSs.LIZ(C0JT9.LIZIZ(1, c493580JXg.LJI, null), fragmentManager, "SubscribeInviteLetterFragment");
                }
            } else {
                C495520Jby c495520Jby = new C495520Jby(str);
                c495520Jby.LIZJ("code", str2);
                c493580JXg.LIZJ.LIZIZ(context, c495520Jby.LIZLLL(), c493580JXg.LJI, "live_take_page", "", "page");
                strLJ = str;
            }
            c493580JXg.LIZ(c493580JXg.LJI, strLJ, !Intrinsics.LJFF("error", str));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS121S1100000_7 awS121S1100000_7, Object obj) {
        C479490IrD c479490IrD = (C479490IrD) obj;
        return C479490IrD.LIZ(c479490IrD, C627660Ojc.LIZ(c479490IrD.LL, null, null, null, C13BV.INSTANCE, 7), (EnumC479370Ir1) awS121S1100000_7.l1, awS121S1100000_7.s0, false, null, 56);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS121S1100000_7 r3, java.lang.Object r4) {
        /*
            X.0JH7 r4 = (X.C0JH7) r4
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell) r0
            int r2 = r0.getBindingAdapterPosition()
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell) r0
            X.0JGk r0 = r0.LLJILLL
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.LIZJ()
            if (r1 != 0) goto L1a
        L18:
            java.lang.String r1 = ""
        L1a:
            r0 = -1
            if (r2 == r0) goto L5d
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell) r0
            int r0 = r0.getItemCount()
            if (r2 >= r0) goto L5d
            java.lang.String r0 = r3.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5d
            X.0nPE r2 = r4.LIZIZ
            if (r2 == 0) goto L60
            java.lang.Object r1 = r3.l1
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell r1 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell) r1
            X.0JGk r0 = r1.LLJILLL
            if (r0 == 0) goto L5d
            r1.N5(r2, r0)
        L3e:
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell) r0
            r0.U5()
            java.lang.Object r4 = r3.l1
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell r4 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell) r4
            X.0JGk r3 = r4.LLJILLL
            if (r3 == 0) goto L5d
            com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM r2 = r4.I5()
            if (r2 == 0) goto L5d
            kotlin.jvm.internal.AwS586S0100000_7 r1 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 424(0x1a8, float:5.94E-43)
            r1.<init>(r4, r0)
            r2.HQ2(r3, r1)
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L60:
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell) r0
            X.0JGk r0 = r0.LLJILLL
            if (r0 == 0) goto L7c
            X.0JH1 r0 = r0.LJIIIIZZ()
        L6c:
            X.0JH1 r1 = X.C0JH1.UPLOAD_IN_PROGRESS
            if (r0 == r1) goto L3e
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell) r0
            X.0JGk r0 = r0.LLJILLL
            if (r0 == 0) goto L5d
            r0.LJIILL(r1)
            goto L3e
        L7c:
            r0 = 0
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS121S1100000_7.invoke$5(kotlin.jvm.internal.AwS121S1100000_7, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS121S1100000_7 awS121S1100000_7, Object obj) {
        return C19323610io.LJJIJL(((C1238760iLC) awS121S1100000_7.l1).LIZIZ(), awS121S1100000_7.s0, null, false, null, null, false, false, null, false, false, null, false, false, 16777214);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S1100000_7(EnumC479370Ir1 enumC479370Ir1, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = enumC479370Ir1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S1100000_7(C493580JXg c493580JXg, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c493580JXg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S1100000_7(C1238760iLC c1238760iLC, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1238760iLC;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S1100000_7(PreviewSettingWidget previewSettingWidget, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = previewSettingWidget;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S1100000_7(CourseVideoListCell courseVideoListCell, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = courseVideoListCell;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S1100000_7(String str, C468800IZy c468800IZy, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c468800IZy;
    }
}
