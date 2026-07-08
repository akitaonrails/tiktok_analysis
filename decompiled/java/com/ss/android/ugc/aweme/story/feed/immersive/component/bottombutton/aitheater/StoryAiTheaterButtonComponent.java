package com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.aitheater;

import X.C01GW;
import X.C0MW8;
import X.C0MXX;
import X.C0MXY;
import X.C13LE;
import X.C13LP;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C549720LhC;
import X.C550740Liq;
import X.C569980MXc;
import X.C706480RnS;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1659430tHh;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.AITheaterInfo;
import com.ss.android.ugc.aweme.feed.model.Avatar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.feed.model.ImageThumb;
import com.ss.android.ugc.aweme.feed.model.UserBaseInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS53S0200000_8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryAiTheaterButtonComponent extends BaseCellSlotComponent<StoryAiTheaterButtonComponent> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 374));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS239S0000000_8.get$arr$(131));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 376));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 375));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fas;
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
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 377);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_ai_theater_bottom_button", true, awS552S0100000_8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IAITheaterCreationLauncher.EnterParams Ep(Aweme aweme) {
        Object obj;
        InterfaceC1659430tHh interfaceC1659430tHhLIZLLL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        AITheaterConsumptionModel aITheaterConsumptionModelLIZLLL = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        CreativeInfo creativeInfo = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        AIGCEntranceInfo aIGCEntranceInfoLIZ = AIGCEntranceInfo.LIZ(C550740Liq.LIZ("remix_feed_story", AIGC.AICreationSceneName.REMIX_FEED_STORY.INSTANCE, new AIGC.RefPageName.Custom(videoItemParams.mEventType), false), null, null, 0, null, null, false, false, false, null, null, videoItemParams.mEventType, null, null, null, false, false, 1046527);
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC1659430tHhLIZLLL = iAITheaterFeatureServiceLIZ.LIZLLL()) != null) {
            aITheaterConsumptionModelLIZLLL = interfaceC1659430tHhLIZLLL.LIZLLL(aweme);
        }
        return new IAITheaterCreationLauncher.EnterParams(creativeInfo, objArr3 == true ? 1 : 0, aITheaterConsumptionModelLIZLLL, objArr2 == true ? 1 : 0, aIGCEntranceInfoLIZ, 11, objArr == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View view2 = (View) this.LLJZIJLIL.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(26));
        Context context = getContext();
        if (context == null) {
            return;
        }
        view2.setBackground(c384050F3z.LIZ(context));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0MXo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, null, AFwS291S0000000_8.get$arr$(12), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        List<CameoInfo> cameoInfo;
        String strLIZLLL;
        boolean z;
        Aweme awemeM199clone;
        C0MW8 c0mw8LJ;
        UserBaseInfo userBaseInfo;
        Avatar avatar;
        ImageThumb imageThumb;
        List<String> urlList;
        Object objLJJJLL;
        VideoItemParams videoItemParams2 = videoItemParams;
        AITheaterInfo aITheaterInfo = videoItemParams2.getAweme().aiTheaterInfo;
        if (aITheaterInfo != null && (cameoInfo = aITheaterInfo.getCameoInfo()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<CameoInfo> it2 = cameoInfo.iterator();
            while (true) {
                strLIZLLL = null;
                if (!it2.hasNext()) {
                    break;
                }
                CameoInfo next = it2.next();
                if (next != null && (userBaseInfo = next.getUserBaseInfo()) != null && (avatar = userBaseInfo.getAvatar()) != null && (imageThumb = avatar.getImageThumb()) != null && (urlList = imageThumb.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                    arrayList.add(objLJJJLL);
                }
            }
            TextView textView = (TextView) this.LLJZ.getValue();
            IAITheaterFeatureService.LIZ.getClass();
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ != null && (c0mw8LJ = iAITheaterFeatureServiceLIZ.LJ()) != null) {
                strLIZLLL = c0mw8LJ.LIZLLL();
            }
            textView.setText(strLIZLLL);
            C0MXX c0mxx = new C0MXX();
            c0mxx.avatars(arrayList);
            c0mxx.extraViewType(new C569980MXc());
            c0mxx.avatarSizeDp(34);
            c0mxx.hollowContentSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            c0mxx.hollowIconSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            c0mxx.hollowOffsetPx(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(3.37d))), -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.09d))));
            c0mxx.showLimit(3);
            c0mxx.outlineWidthPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c0mxx.overlapSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.53d))));
            c0mxx.build();
            ((C0MXY) this.LLJLLIL.getValue()).LIZ(c0mxx);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBind: aitheaterinfo != null: ");
            if (videoItemParams2.getAweme().aiTheaterInfo != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(" aid: ");
            sbLIZ.append(videoItemParams2.getAweme().getAid());
            C2188811AlT.LIZIZ(sbLIZ);
            Aweme aweme = videoItemParams2.getAweme();
            if (aweme != null && (awemeM199clone = aweme.m199clone()) != null) {
                C786410Ut5.I7(new AkS53S0200000_8(this, awemeM199clone, 13), (View) this.LLJZIJLIL.getValue());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
