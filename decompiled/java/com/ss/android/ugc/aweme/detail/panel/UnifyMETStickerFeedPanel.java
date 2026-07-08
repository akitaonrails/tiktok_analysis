package com.ss.android.ugc.aweme.detail.panel;

import X.C1324840ka2;
import X.C1458960o4M;
import X.C21459218yU;
import X.C786410Ut5;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.p;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class UnifyMETStickerFeedPanel extends StickerFeedPanel {
    public List<? extends NewFaceStickerBean> O0;
    public View P0;
    public RemoteImageView Q0;
    public C21459218yU R0;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJJJJLIIL() {
        super.LLJJJJLIIL();
        T0();
    }

    public final void S0() {
        NewFaceStickerBean newFaceStickerBeanO0 = O0();
        if (newFaceStickerBeanO0 == null) {
            return;
        }
        RemoteImageView remoteImageView = this.Q0;
        if (remoteImageView == null) {
            remoteImageView = null;
        }
        C1324840ka2.LJFF(remoteImageView, newFaceStickerBeanO0.iconUrl);
        C21459218yU c21459218yU = this.R0;
        if (c21459218yU == null) {
            c21459218yU = null;
        }
        c21459218yU.setTuxFont(42);
        C21459218yU c21459218yU2 = this.R0;
        if (c21459218yU2 == null) {
            c21459218yU2 = null;
        }
        N0(c21459218yU2, newFaceStickerBeanO0.name);
        C1458960o4M.LIZJ(newFaceStickerBeanO0.isFavorite);
        this.O0 = null;
    }

    public final void T0() {
        Aweme awemeLJIIIIZZ;
        List<AnchorCommonStruct> anchors;
        List<String> urlList;
        k kVarLJJIIZ;
        NewFaceStickerBean newFaceStickerBeanO0 = O0();
        if (newFaceStickerBeanO0 == null) {
            return;
        }
        MobileEffectTemplateInfo mobileEffectTemplateInfo = newFaceStickerBeanO0.mobileEffectTemplate;
        if (mobileEffectTemplateInfo == null || (awemeLJIIIIZZ = LJIIIIZZ()) == null || (anchors = awemeLJIIIIZZ.getAnchors()) == null) {
            S0();
            return;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            if (anchorCommonStruct != null) {
                try {
                    new p();
                    kVarLJJIIZ = p.LIZJ(anchorCommonStruct.getExtra()).LJIILIIL().LJJIIZ("parent_template_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("Unify MET:", e.getMessage());
                }
                String strLJIL = kVarLJJIIZ != null ? kVarLJJIIZ.LJIL() : null;
                if (Intrinsics.LJFF(strLJIL, mobileEffectTemplateInfo.getTemplateId())) {
                    UrlModel thumbnail = anchorCommonStruct.getThumbnail();
                    if (thumbnail != null && (urlList = thumbnail.getUrlList()) != null && !urlList.isEmpty()) {
                        RemoteImageView remoteImageView = this.Q0;
                        if (remoteImageView == null) {
                            remoteImageView = null;
                        }
                        C1324840ka2.LJIIJ(remoteImageView, (String) ListProtector.get(urlList, 0), -1, -1);
                    }
                    C21459218yU c21459218yU = this.R0;
                    if (c21459218yU == null) {
                        c21459218yU = null;
                    }
                    c21459218yU.setTuxFont(42);
                    C21459218yU c21459218yU2 = this.R0;
                    N0(c21459218yU2 != null ? c21459218yU2 : null, anchorCommonStruct.getKeyword());
                    NewFaceStickerBean newFaceStickerBean = new NewFaceStickerBean();
                    newFaceStickerBean.id = anchorCommonStruct.getId();
                    this.O0 = Collections.singletonList(newFaceStickerBean);
                    return;
                }
            }
        }
        S0();
    }

    public UnifyMETStickerFeedPanel(Bundle bundle) {
        super(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.panel.StickerFeedPanel, com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void I0(View view) {
        if (this.activity != null && ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(this.activity)) {
            Activity activity = this.activity;
            C786410Ut5.re(Toast.makeText(activity, activity.getString(2131832497), 0));
        } else {
            List list = this.O0;
            if (list == null) {
                list = this.G0;
            }
            P0(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.StickerFeedPanel, com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View M0(RelativeLayout relativeLayout) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bll, relativeLayout, false);
        this.P0 = viewTd.findViewById(R.id.w63);
        this.Q0 = (RemoteImageView) viewTd.findViewById(R.id.w62);
        this.R0 = (C21459218yU) viewTd.findViewById(R.id.hu1);
        T0();
        return viewTd;
    }
}
