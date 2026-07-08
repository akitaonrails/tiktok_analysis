package kotlin.jvm.internal;

import X.C09AY;
import X.C1061730djf;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C15V6;
import X.C19EG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2344009Gk;
import X.C397901gf;
import X.C724240Sb0;
import Y.ARunnableS13S0210000_12;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.detail.component.biz.TrashBinBottomComponent;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS95S0210000_12 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS95S0210000_12 awS95S0210000_12) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "recently_deleted_page");
        c2344009Gk.LJIIIIZZ("group_id", ((Aweme) awS95S0210000_12.l0).getAid());
        TrashBinBottomComponent trashBinBottomComponent = (TrashBinBottomComponent) awS95S0210000_12.l1;
        Aweme aweme = (Aweme) awS95S0210000_12.l0;
        trashBinBottomComponent.getClass();
        c2344009Gk.LIZLLL(TrashBinBottomComponent.bo(aweme), "days_of_deleted");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("click_type", "delete");
        c2344009Gk.LJIIIIZZ("restore_result", "success");
        if (awS95S0210000_12.z2) {
            str = "au_u16";
        } else {
            str = "normal";
        }
        c2344009Gk.LJIIIIZZ("popup_version", str);
        C20684815ws.LJIILLIIL("confirm_restore_video_pop_up", c2344009Gk.LIZ);
        new C1061730djf();
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), C1061730djf.LIZLLL(C2097908Jt.LIZJ(new Pair("aweme_ids", Collections.singletonList(((Aweme) awS95S0210000_12.l0).getAid())))), "aweme_restore_succeeded"));
        C19EG c19egLIZ = C724240Sb0.LIZ((TrashBinBottomComponent) awS95S0210000_12.l1);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS95S0210000_12 awS95S0210000_12) {
        ((ExploreFeedCell) awS95S0210000_12.l0).getClass();
        if (!ExploreFeedCell.b7() ? ((ExploreFeedCell) awS95S0210000_12.l0).getLayoutPosition() >= 0 : C15V6.LIZ((Map) awS95S0210000_12.l1) != -1) {
            if (((ExploreFeedCell) awS95S0210000_12.l0).T6().getLayout() == null) {
                HandlerHook.viewPost(((ExploreFeedCell) awS95S0210000_12.l0).T6(), new ARunnableS13S0210000_12((ExploreFeedCell) awS95S0210000_12.l0, awS95S0210000_12.z2, (Map) awS95S0210000_12.l1, 0));
            } else {
                ExploreFeedCell exploreFeedCell = (ExploreFeedCell) awS95S0210000_12.l0;
                exploreFeedCell.l7(exploreFeedCell.T6().getLayout(), (Map) awS95S0210000_12.l1, awS95S0210000_12.z2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS95S0210000_12 awS95S0210000_12) {
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) awS95S0210000_12.l0;
        C19EG c19eg = (C19EG) awS95S0210000_12.l1;
        boolean z = awS95S0210000_12.z2;
        basePreviewSettingMainFragmentSheetInitializer.getClass();
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openLiveReplaySettings(c19eg, 1, z, "livetake_icon");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S0210000_12(BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, C19EG c19eg, int i) {
        super(0);
        this.$t = i;
        this.l0 = basePreviewSettingMainFragmentSheetInitializer;
        this.l1 = c19eg;
        this.z2 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS95S0210000_12(ExploreFeedCell exploreFeedCell, ExploreFeedCell exploreFeedCell2, Map<String, String> map, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = exploreFeedCell;
        this.l1 = exploreFeedCell2;
        this.z2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S0210000_12(Aweme aweme, TrashBinBottomComponent trashBinBottomComponent, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = trashBinBottomComponent;
        this.z2 = z;
    }
}
