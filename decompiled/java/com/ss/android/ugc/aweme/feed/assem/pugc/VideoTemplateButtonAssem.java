package com.ss.android.ugc.aweme.feed.assem.pugc;

import X.C1017070cZd;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1430380nKG;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS79S1100000_6;
import Y.ARunnableS106S0100000_6;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.template.TemplateButtonConfig;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoTemplateButtonAssem extends BaseCellSlotComponent<VideoTemplateButtonAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public C197039127h LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoTemplateButtonAssem.class, "templateButtonVM", "getTemplateButtonVM()Lcom/ss/android/ugc/aweme/feed/assem/pugc/VideoTemplateButtonViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoTemplateButtonAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTemplateButtonViewModel.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 80), null, AFwS236S0000000_6.get$arr$(61));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_4;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.xgb);
        this.LLJLLIL = c197039127h;
        if (c197039127h != null) {
            c197039127h.setTextSize(1, 14.0f);
        }
        C197039127h c197039127h2 = this.LLJLLIL;
        if (c197039127h2 != null) {
            c197039127h2.setTextColor(-1);
        }
        C197039127h c197039127h3 = this.LLJLLIL;
        if (c197039127h3 != null) {
            c197039127h3.LJJJJL(AFwS228S0000000_1.get$arr$(561));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AnchorCommonStruct next;
        int iIntValue;
        Integer num;
        Boolean bool;
        String str;
        String str2;
        C197039127h c197039127h;
        VideoItemParams videoItemParams2 = videoItemParams;
        Object value = this.LLJLLL.getValue(this, LLJZ[0]);
        Aweme aweme = videoItemParams2.getAweme();
        value.getClass();
        if (VideoTemplateButtonViewModel.vQ2(aweme)) {
            Aweme aweme2 = videoItemParams2.getAweme();
            String id = null;
            if (aweme2 != null) {
                TemplateButtonConfig templateButtonConfig = aweme2.getTemplateButtonConfig();
                if (templateButtonConfig != null && (str2 = templateButtonConfig.schemaUrl) != null && (c197039127h = this.LLJLLIL) != null) {
                    C786410Ut5.U8(c197039127h, new ACListenerS79S1100000_6(this, str2, 7));
                }
                C197039127h c197039127h2 = this.LLJLLIL;
                if (c197039127h2 != null) {
                    TemplateButtonConfig templateButtonConfig2 = aweme2.getTemplateButtonConfig();
                    if (templateButtonConfig2 != null) {
                        str = templateButtonConfig2.buttonText;
                    } else {
                        str = null;
                    }
                    c197039127h2.setText(str);
                }
                TemplateButtonConfig templateButtonConfig3 = aweme2.getTemplateButtonConfig();
                if (templateButtonConfig3 != null && (bool = templateButtonConfig3.showBtnArrow) != null && bool.booleanValue()) {
                    C197039127h c197039127h3 = this.LLJLLIL;
                    if (c197039127h3 != null) {
                        c197039127h3.setButtonEndIcon(Integer.valueOf(R.raw.icon_chevron_right_small_fill_ltr));
                    }
                    C197039127h c197039127h4 = this.LLJLLIL;
                    if (c197039127h4 != null) {
                        c197039127h4.setIconTintColor(-1);
                    }
                }
                TemplateButtonConfig templateButtonConfig4 = aweme2.getTemplateButtonConfig();
                if (templateButtonConfig4 != null && (num = templateButtonConfig4.showButtonColorSeconds) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 2;
                }
                HandlerHook.viewPostDelay(getContentView(), new ARunnableS106S0100000_6(this, 184), iIntValue * LSPassThroughRecordSizeConfig.DEFAULT);
            }
            Aweme aweme3 = videoItemParams2.getAweme();
            String str3 = videoItemParams2.mEventType;
            if (aweme3 != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("enter_from", str3);
                c2344009Gk.LJFF("author_id", C1017070cZd.LJIJ(aweme3));
                c2344009Gk.LJFF("group_id", aweme3.getAid());
                List<AnchorCommonStruct> anchors = aweme3.getAnchors();
                if (anchors != null) {
                    Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            AnchorCommonStruct anchorCommonStruct = next;
                            if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE() || Intrinsics.LJFF(anchorCommonStruct.subType(), "pugc")) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    AnchorCommonStruct anchorCommonStruct2 = next;
                    if (anchorCommonStruct2 != null) {
                        id = anchorCommonStruct2.getId();
                    }
                }
                c2344009Gk.LJFF("template_id", id);
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("year_end_button_show", c2344009Gk.LIZ);
            }
        }
    }
}
