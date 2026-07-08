package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0TUL;
import X.C0XI4;
import X.C16F5;
import X.C20684815ws;
import X.C2344009Gk;
import X.C259800zU;
import X.C444140HbI;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewProbationSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import wh6.AbS362S0000000_12;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class AwS74S0500000_12 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS74S0500000_12 awS74S0500000_12) {
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer;
        DataChannel dataChannel;
        C500260Jjc.LLFFF((View) awS74S0500000_12.l0);
        ((BasePreviewSettingMainFragmentSheetInitializer) awS74S0500000_12.l1).getClass();
        if (!BasePreviewSettingMainFragmentSheetInitializer.LIZJ()) {
            View view = (View) awS74S0500000_12.l0;
            if (view != null) {
                C786410Ut5.I7(new AbS694S0100000_12((BasePreviewSettingMainFragmentSheetInitializer) awS74S0500000_12.l1, 15), view);
            }
            View view2 = (View) awS74S0500000_12.l0;
            if (view2 != null) {
                C444140HbI.LIZ(view2, AFwS296S0000000_12.get$arr$(6));
            }
            if (LivePreviewProbationSettings.enable() && (dataChannel = (basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) awS74S0500000_12.l1).LLILLJJLI) != null) {
                dataChannel.EQ2(basePreviewSettingMainFragmentSheetInitializer.LL, RoomCreateInfoChannel.class, new AwS591S0100000_12((View) awS74S0500000_12.l0, 401));
            }
            return Unit.LIZ;
        }
        C16F5 c16f5 = (C16F5) awS74S0500000_12.l2;
        if (c16f5 != null) {
            c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.ezt, ((BasePreviewSettingMainFragmentSheetInitializer) awS74S0500000_12.l1).LL.getContext()));
        }
        C16F5 c16f52 = (C16F5) awS74S0500000_12.l3;
        if (c16f52 != null) {
            c16f52.setTextColor(C497740JfY.LIZLLL(R.attr.ezt, ((BasePreviewSettingMainFragmentSheetInitializer) awS74S0500000_12.l1).LL.getContext()));
        }
        LiveIconView liveIconView = (LiveIconView) awS74S0500000_12.l4;
        if (liveIconView != null) {
            liveIconView.setIconTint(C497740JfY.LIZLLL(R.attr.ezt, ((BasePreviewSettingMainFragmentSheetInitializer) awS74S0500000_12.l1).LL.getContext()));
        }
        View view3 = (View) awS74S0500000_12.l0;
        if (view3 != null) {
            C786410Ut5.I7(new AbS362S0000000_12(1), view3);
            return Unit.LIZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS74S0500000_12 awS74S0500000_12) {
        C0XI4 c0xi4 = new C0XI4(((CommentRethinkPopup) ((C259800zU) awS74S0500000_12.l0).element).getLink());
        c0xi4.LJ("lang", LocalServiceImpl.LIZIZ().LIZ((Context) awS74S0500000_12.l1));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS74S0500000_12.l1, "aweme://webview/");
        smartRouteBuildRoute.withParam("url", c0xi4.LJFF());
        smartRouteBuildRoute.open();
        C0TUL c0tul = (C0TUL) awS74S0500000_12.l2;
        if (c0tul != null) {
            c0tul.LIZJ();
        }
        ((C013C) awS74S0500000_12.l3).element = true;
        C20684815ws.LJIILLIIL("comment_rethink_cg_ck", ((C2344009Gk) awS74S0500000_12.l4).LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS74S0500000_12(C259800zU c259800zU, C259800zU<CommentRethinkPopup> c259800zU2, Context context, C0TUL c0tul, C013C c013c, C2344009Gk c2344009Gk) {
        super(0);
        this.$t = c2344009Gk;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = context;
        this.l3 = c0tul;
        this.l4 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS74S0500000_12(View view, BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, C16F5 c16f5, C16F5 c16f52, LiveIconView liveIconView, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = basePreviewSettingMainFragmentSheetInitializer;
        this.l2 = c16f5;
        this.l3 = c16f52;
        this.l4 = liveIconView;
    }
}
