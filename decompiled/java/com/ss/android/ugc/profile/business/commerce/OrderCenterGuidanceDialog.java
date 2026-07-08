package com.ss.android.ugc.profile.business.commerce;

import X.C1216270hkv;
import X.C1265730j2h;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1378990lzN;
import X.C1390920mIc;
import X.C197039127h;
import X.C786410Ut5;
import X.C960203pA;
import Y.ACListenerS87S1100000_19;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.profile.business.commerce.HeaderAdvancedFeatureOrderCenterProtocol;
import com.ss.android.ugc.profile.business.commerce.OrderCenterGuidanceDialog;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class OrderCenterGuidanceDialog {
    public boolean LIZ;
    public final long LIZIZ = SystemClock.elapsedRealtime();
    public boolean LIZJ;
    public final TuxSheet LIZLLL;

    public OrderCenterGuidanceDialog(final Context context, final String str, final OrderCenterGuideData orderCenterGuideData) {
        String imageUrl;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ehp, null, false);
        ((TextView) viewTd.findViewById(R.id.pqx)).setText(orderCenterGuideData.getDescription());
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.pqw);
        c197039127h.setText(orderCenterGuideData.getButtonText());
        C1378990lzN.LIZIZ(c197039127h, Float.valueOf(C1216270hkv.LIZ(8)), null, null, null, null, 30);
        final String buttonJumpSchema = orderCenterGuideData.getButtonJumpSchema();
        C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0ifE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                OrderCenterGuidanceDialog orderCenterGuidanceDialog = this.LL;
                orderCenterGuidanceDialog.LIZJ = true;
                TuxSheet tuxSheet = orderCenterGuidanceDialog.LIZLLL;
                if (tuxSheet != null) {
                    tuxSheet.dismiss();
                }
                HeaderAdvancedFeatureOrderCenterProtocol.LLL = true;
                SmartRouter.buildRoute(context, buttonJumpSchema).open();
                C1251190ifF c1251190ifF = C1251190ifF.LIZ;
                String str2 = str;
                c1251190ifF.getClass();
                C1251190ifF.LIZIZ("go_to_shop_tab", str2);
                String str3 = str;
                String description = orderCenterGuideData.getDescription();
                if (description == null) {
                    description = "";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                jSONObject.put("page_name", "personal_homepage");
                jSONObject.put("tab_name", "go_to_shop_tab");
                jSONObject.put("mall_entrance", "personal_homepage.order_center_shoptab_diversion_guide.in_app");
                jSONObject.put("enter_method", "click_personal_homepage_order_center_shoptab_diversion_guide");
                jSONObject.put("mall_extra_info", C1251190ifF.LIZIZ);
                jSONObject.put("enter_from", str3);
                jSONObject.put("direct_text", description);
                jSONObject.put("is_login", ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() ? 1 : 0);
                C1251190ifF.LJFF("tiktokec_mall_entrance_click", jSONObject);
            }
        });
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.x_mark_close_button);
        tuxIconView.setBackgroundResource(R.drawable.cyn);
        C786410Ut5.a9(tuxIconView, new ACListenerS87S1100000_19(this, str, 1));
        boolean zLIZIZ = C960203pA.LIZIZ(context);
        SmartImageView smartImageView = (SmartImageView) viewTd.findViewById(R.id.pqy);
        if (!zLIZIZ ? (imageUrl = orderCenterGuideData.getImageUrl()) == null : (imageUrl = orderCenterGuideData.getImageUrlDark()) == null) {
            imageUrl = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(imageUrl);
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        c1331670kl3LJIIIZ.LJIIJ(new C1265730j2h(this, 5));
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0ifG
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) throws JSONException {
                String str2;
                String str3;
                String strValueOf = String.valueOf((int) (SystemClock.elapsedRealtime() - this.LL.LIZIZ));
                C1251190ifF c1251190ifF = C1251190ifF.LIZ;
                String str4 = str;
                OrderCenterGuidanceDialog orderCenterGuidanceDialog = this.LL;
                if (orderCenterGuidanceDialog.LIZ) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                if (orderCenterGuidanceDialog.LIZJ) {
                    str3 = "next";
                } else {
                    str3 = "close";
                }
                c1251190ifF.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                jSONObject.put("page_name", "personal_homepage");
                jSONObject.put("actionsheet_name", "order_center_shoptab_diversion_guide");
                jSONObject.put("mall_extra_info", C1251190ifF.LIZIZ);
                jSONObject.put("previous_page", str4);
                jSONObject.put("stay_time", strValueOf);
                jSONObject.put("is_load_data", str2);
                jSONObject.put("quit_type", str3);
                C1251190ifF.LJFF("tiktokec_stay_actionsheet", jSONObject);
            }
        };
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, context);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        tuxSheet.LLJJIII = viewTd;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        this.LIZLLL = tuxSheet2;
        tuxSheet2.getLifecycle().addObserver(new OrderCenterGuidanceDialog$2$1(str));
    }
}
