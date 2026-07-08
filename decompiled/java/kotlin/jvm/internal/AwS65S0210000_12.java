package kotlin.jvm.internal;

import X.C09AY;
import X.C0TGH;
import X.C0TGI;
import X.C0U22;
import X.C0U24;
import X.C1397620mTQ;
import X.C20684815ws;
import X.C2344009Gk;
import X.C238400w2;
import X.C758220Toi;
import X.EnumC038300Bp;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeSettingFragment;
import com.ss.android.ugc.aweme.detail.component.biz.TrashBinBottomComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS65S0210000_12 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS65S0210000_12 awS65S0210000_12, Object obj) {
        ((LiveAdminSettingGuideAdapter) awS65S0210000_12.l0).LJII((View) awS65S0210000_12.l1, awS65S0210000_12.z2, ((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS65S0210000_12 awS65S0210000_12, Object obj) {
        LiveVisibleScopeSettingFragment.RR((LiveVisibleScopeSettingFragment) awS65S0210000_12.l0, awS65S0210000_12.z2, (C238400w2) awS65S0210000_12.l1, (C758220Toi) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS65S0210000_12 awS65S0210000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131824514, new AwS65S0210000_12((Context) awS65S0210000_12.l0, (C0TGI) awS65S0210000_12.l1, awS65S0210000_12.z2, 3));
        c1397620mTQ.LJII(2131830643, null);
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS65S0210000_12 awS65S0210000_12, Object obj) {
        C0TGH.LIZIZ((Context) awS65S0210000_12.l0, awS65S0210000_12.z2, (C0TGI) awS65S0210000_12.l1, true);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS65S0210000_12 awS65S0210000_12, Object obj) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "recently_deleted_page");
        c2344009Gk.LJIIIIZZ("group_id", ((Aweme) awS65S0210000_12.l0).getAid());
        TrashBinBottomComponent trashBinBottomComponent = (TrashBinBottomComponent) awS65S0210000_12.l1;
        Aweme aweme = (Aweme) awS65S0210000_12.l0;
        trashBinBottomComponent.getClass();
        c2344009Gk.LIZLLL(TrashBinBottomComponent.bo(aweme), "days_of_deleted");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("click_type", "cancel");
        if (awS65S0210000_12.z2) {
            str = "au_u16";
        } else {
            str = "normal";
        }
        c2344009Gk.LJIIIIZZ("popup_version", str);
        C20684815ws.LJIILLIIL("confirm_restore_video_pop_up", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS65S0210000_12 awS65S0210000_12, Object obj) {
        return ((C0U22) obj).LIZIZ((EnumC038300Bp) awS65S0210000_12.l0, awS65S0210000_12.z2, (C0U24) awS65S0210000_12.l1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0210000_12(EnumC038300Bp enumC038300Bp, C0U24 c0u24, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC038300Bp;
        this.z2 = false;
        this.l1 = c0u24;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0210000_12(Context context, C0TGI c0tgi, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.z2 = z;
        this.l1 = c0tgi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0210000_12(LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter, View view, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveAdminSettingGuideAdapter;
        this.l1 = view;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0210000_12(LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment, C238400w2 c238400w2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveVisibleScopeSettingFragment;
        this.z2 = z;
        this.l1 = c238400w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0210000_12(Aweme aweme, TrashBinBottomComponent trashBinBottomComponent, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = trashBinBottomComponent;
        this.z2 = z;
    }
}
