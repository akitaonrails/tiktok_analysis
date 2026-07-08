package com.ss.android.ugc.aweme.theater.consumption.entrance;

import X.C01GW;
import X.C03H5;
import X.C0MW8;
import X.C13IQ;
import X.C13LE;
import X.C339190DRl;
import X.C452501pT;
import X.C549720LhC;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C729510SjV;
import X.C786410Ut5;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.AITheaterInfo;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoGenreTagProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AITheaterCastInfoTrigger extends BaseCellTriggerComponent<AITheaterCastInfoTrigger> implements ComponentPriorityProtocol, VideoGenreTagProtocol {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 953));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 954));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "genre_tag_recast";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(AITheaterCastUIAssem.class);
    }

    @Override // X.C0RKP
    public final int ka(boolean z) {
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "genre_tag_recast";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // X.C0RKP
    public final float Lf() {
        float fMeasureText;
        TextPaint paint;
        String string;
        CharSequence text;
        TextView textView = (TextView) LJJIJL().findViewById(R.id.dhi);
        if (textView == null || (paint = textView.getPaint()) == null) {
            fMeasureText = 0.0f;
        } else {
            AppCompatTextView appCompatTextView = (AppCompatTextView) LJJIJL().findViewById(R.id.dhi);
            if (appCompatTextView == null || (text = appCompatTextView.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            fMeasureText = paint.measureText(string);
        }
        return fMeasureText + C339190DRl.LIZ(12) + C339190DRl.LIZ(16);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        C0MW8 c0mw8LJ;
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (up(videoItemParams)) {
            PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
            if (priorityAbility != null) {
                priorityAbility.MJ(this, new AwS590S0100000_11(this, 276));
            } else {
                C786410Ut5.LJLLLLLL(0, LJJIJL());
                InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
                if (interactAreaCommonAbility != null) {
                    interactAreaCommonAbility.zB1(this);
                }
            }
            IAITheaterFeatureService.LIZ.getClass();
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ != null && (c0mw8LJ = iAITheaterFeatureServiceLIZ.LJ()) != null) {
                c0mw8LJ.LIZIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        List<CameoInfo> cameoInfo;
        AITheaterInfo aITheaterInfo = videoItemParams.getAweme().aiTheaterInfo;
        if (aITheaterInfo != null) {
            cameoInfo = aITheaterInfo.getCameoInfo();
        } else {
            cameoInfo = null;
        }
        if (cameoInfo == null || cameoInfo.isEmpty() || C729510SjV.LJJIJIL(videoItemParams.getAweme())) {
            return false;
        }
        return true;
    }
}
