package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow3;

import X.C01GW;
import X.C0SD5;
import X.C0SD6;
import X.C1308910kAL;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C706480RnS;
import X.C720800SPe;
import X.C786410Ut5;
import Y.ACListenerS78S0300000_11;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigc.IAIInfoPanelService;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryAIGCLabelComponent extends BaseCellSlotComponent<StoryAIGCLabelComponent> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 775));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 774));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fat;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 776);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_aigc_label", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, (Context) this.LLJLLL.getValue());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TextView textView = (TextView) this.LLJLLIL.getValue();
            if (textView != null) {
                textView.setTextColor(iIntValue);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Integer numValueOf;
        String str;
        Integer num;
        Integer num2;
        VideoItemParams videoItemParams2 = videoItemParams;
        TextView textView = (TextView) this.LLJLLIL.getValue();
        if (textView != null) {
            textView.setText(C0SD5.LIZ(getContext(), videoItemParams2.getAweme()));
        }
        Map<String, String> c2PAMobParamFromAweme = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().parseC2PAMobParamFromAweme(videoItemParams2.getAweme());
        C720800SPe c720800SPeLIZIZ = ((IAIInfoPanelService) ServiceManager.get().getService(IAIInfoPanelService.class)).LIZIZ(videoItemParams2.getAweme());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", videoItemParams2.mEventType);
        c2344009Gk.LJII(c2PAMobParamFromAweme);
        AIGCInfo aIGCInfo = videoItemParams2.getAweme().aigcInfo;
        Integer num3 = null;
        if (aIGCInfo != null) {
            numValueOf = Integer.valueOf(aIGCInfo.getAIGCLabelType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aigc_label_type");
        if (C0SD6.LIZ()) {
            if (c720800SPeLIZIZ != null) {
                str = c720800SPeLIZIZ.LJI;
            } else {
                str = null;
            }
        } else {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("aigc_creation_channel", str);
        if (c720800SPeLIZIZ != null) {
            num = c720800SPeLIZIZ.LJII;
        } else {
            num = null;
        }
        c2344009Gk.LJ(num, "moderation_aigc_label_type");
        if (c720800SPeLIZIZ != null) {
            num2 = c720800SPeLIZIZ.LJIIIIZZ;
        } else {
            num2 = null;
        }
        c2344009Gk.LJ(num2, "fingerprint_id");
        if (c720800SPeLIZIZ != null) {
            num3 = c720800SPeLIZIZ.LJIIIZ;
        }
        c2344009Gk.LJ(num3, "invisible_watermark");
        C20684815ws.LJIILLIIL("view_creator_label_aigc", c2344009Gk.LIZ);
        C720800SPe c720800SPeLIZIZ2 = ((IAIInfoPanelService) ServiceManager.get().getService(IAIInfoPanelService.class)).LIZIZ(videoItemParams2.getAweme());
        if (c720800SPeLIZIZ2 != null) {
            c720800SPeLIZIZ2.LIZ = videoItemParams2.mEventType;
        }
        TuxTextView tuxTextView = (TuxTextView) this.LLJLLIL.getValue();
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS78S0300000_11(videoItemParams2, this, c720800SPeLIZIZ2, 9));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
