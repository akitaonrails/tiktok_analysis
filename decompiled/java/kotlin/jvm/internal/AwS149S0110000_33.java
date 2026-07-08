package kotlin.jvm.internal;

import X.C09AY;
import X.C21665319qd;
import X.C999380c76;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ShowInfoWidget;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AwS149S0110000_33 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS149S0110000_33 awS149S0110000_33) {
        ShowInfoWidget showInfoWidget;
        LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget = (LivePreviewInteractionLayerWidget) awS149S0110000_33.l0;
        if (livePreviewInteractionLayerWidget.LLJILJIL == null && C999380c76.LIZ(livePreviewInteractionLayerWidget.z1())) {
            LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget2 = (LivePreviewInteractionLayerWidget) awS149S0110000_33.l0;
            RecyclableWidgetManager recyclableWidgetManager = livePreviewInteractionLayerWidget2.subWidgetManager;
            if (recyclableWidgetManager != null) {
                showInfoWidget = (ShowInfoWidget) recyclableWidgetManager.load(R.id.s8i, ShowInfoWidget.class, awS149S0110000_33.z1);
            } else {
                showInfoWidget = null;
            }
            livePreviewInteractionLayerWidget2.LLJILJIL = showInfoWidget;
            ShowInfoWidget showInfoWidget2 = ((LivePreviewInteractionLayerWidget) awS149S0110000_33.l0).LLJILJIL;
            if (showInfoWidget2 != null) {
                showInfoWidget2.show();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS149S0110000_33 awS149S0110000_33) {
        if (awS149S0110000_33.z1) {
            C21665319qd c21665319qd = (C21665319qd) awS149S0110000_33.l0;
            c21665319qd.LLLJIL = true;
            c21665319qd.LLLLZLLIL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0110000_33(LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = livePreviewInteractionLayerWidget;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0110000_33(boolean z, C21665319qd c21665319qd, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c21665319qd;
    }
}
