package com.ss.android.ugc.aweme.detail.panel;

import X.C0R06;
import X.C0R07;
import X.C11VU;
import X.C1324750kZt;
import X.C1324840ka2;
import X.C1458960o4M;
import X.C14LC;
import X.C21459218yU;
import X.C302080Bsk;
import X.C786410Ut5;
import X.C960203pA;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class StickerFeedPanel extends ShootFeedPanel {
    public final List<NewFaceStickerBean> G0;
    public final String H0;
    public View I0;
    public final String J0;
    public final String K0;
    public final String L0;
    public String M0;
    public String N0;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public int L0() {
        return 2131857979;
    }

    public final NewFaceStickerBean O0() {
        List<NewFaceStickerBean> list = this.G0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (NewFaceStickerBean) ListProtector.get(this.G0, 0);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.C14LF
    public final void y() {
        View view;
        super.y();
        if (C14LC.LJIILLIIL != 0 || (view = this.I0) == null) {
            return;
        }
        view.setBackgroundColor(C960203pA.LIZ(R.attr.bt, getContext()));
    }

    public StickerFeedPanel(Bundle bundle) {
        this.G0 = (List) bundle.getSerializable("feed_data_sticker_model");
        this.H0 = bundle.getString("feed_data_sticker_group_id", "");
        this.J0 = bundle.getString("from_user_id", "");
        this.K0 = bundle.getString("shoot_enter_from", "");
        this.L0 = bundle.getString("extra_edit_effect_uid", "");
        this.M0 = bundle.getString("voice_conversion_effect_id", "");
        this.N0 = bundle.getString("voice_conversion_effect_name", "");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public void I0(View view) {
        if (this.activity != null && ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(this.activity)) {
            Activity activity = this.activity;
            C786410Ut5.re(Toast.makeText(activity, activity.getString(2131832497), 0));
        } else {
            P0(this.G0);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public View M0(RelativeLayout relativeLayout) {
        ViewGroup.LayoutParams layoutParams;
        UrlModel urlModel;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bll, relativeLayout, false);
        this.I0 = viewTd.findViewById(R.id.w63);
        NewFaceStickerBean newFaceStickerBeanO0 = O0();
        if (newFaceStickerBeanO0 != null) {
            RemoteImageView remoteImageView = (RemoteImageView) viewTd.findViewById(R.id.w62);
            C0R06.LIZ(remoteImageView, R.dimen.b6);
            C0R06.LIZIZ(remoteImageView, 36);
            if (!C0R07.LIZ() && (urlModel = newFaceStickerBeanO0.iconUrl) != null && urlModel.getUrlList() != null && !newFaceStickerBeanO0.iconUrl.getUrlList().isEmpty()) {
                C1324750kZt.LIZ(remoteImageView, UriProtector.parse((String) ListProtector.get(newFaceStickerBeanO0.iconUrl.getUrlList(), 0)));
            } else {
                C1324840ka2.LJFF(remoteImageView, newFaceStickerBeanO0.iconUrl);
            }
            C21459218yU c21459218yU = (C21459218yU) viewTd.findViewById(R.id.hu1);
            c21459218yU.setTuxFont(42);
            N0(c21459218yU, newFaceStickerBeanO0.name);
            C1458960o4M.LIZJ(newFaceStickerBeanO0.isFavorite);
        }
        if (C302080Bsk.LIZ()) {
            TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.syy);
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_camera_fill);
                tuxIconView.setTintColorRes(R.attr.ee);
                tuxIconView.setIconWidth((int) C11VU.LIZ(20.0f));
                tuxIconView.setIconHeight((int) C11VU.LIZ(20.0f));
            }
            TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.szn);
            if (tuxTextView != null && (layoutParams = tuxTextView.getLayoutParams()) != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((int) C11VU.LIZ(2.0f));
                C786410Ut5.R6(tuxTextView, layoutParams);
            }
        }
        return viewTd;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P0(java.util.List<com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean> r40) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.panel.StickerFeedPanel.P0(java.util.List):void");
    }
}
