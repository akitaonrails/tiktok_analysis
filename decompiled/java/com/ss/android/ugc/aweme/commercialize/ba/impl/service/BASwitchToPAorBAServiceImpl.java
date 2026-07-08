package com.ss.android.ugc.aweme.commercialize.ba.impl.service;

import X.AbstractC848400XPy;
import X.C04TD;
import X.C09JN;
import X.C0CQT;
import X.C0XQ7;
import X.C1050610dRj;
import X.C10EU;
import X.C11S5;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1701940uOG;
import X.C197039127h;
import X.C19EG;
import X.C20642515q3;
import X.C786410Ut5;
import X.InterfaceC745700TMy;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS23S0500000_12;
import Y.AObjectS387S0100000_12;
import Y.AfS135S0000000_12;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class BASwitchToPAorBAServiceImpl implements IBASwitchToPAorBAService {
    public final Keva LIZ = KevaImpl.getRepo("ba_to_pa_feelgood_keva_name", 1);
    public Activity LIZIZ;

    public static IBASwitchToPAorBAService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IBASwitchToPAorBAService.class, false);
        if (objLIZ != null) {
            return (IBASwitchToPAorBAService) objLIZ;
        }
        if (C04TD.LLJLLIL == null) {
            synchronized (IBASwitchToPAorBAService.class) {
                if (C04TD.LLJLLIL == null) {
                    C04TD.LLJLLIL = new BASwitchToPAorBAServiceImpl();
                }
            }
        }
        return C04TD.LLJLLIL;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService
    public final void LIZIZ(C19EG c19eg) {
        InterfaceC745700TMy.LIZ.getClass();
        ((InterfaceC745700TMy) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(InterfaceC745700TMy.class)).getSelf().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS135S0000000_12(c19eg, 8), new C09JN() { // from class: X.0TFA
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("BASwitchToPAorBAServiceImpl@8d9d.handlePotentialToBA$2");
                Throwable th = (Throwable) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("success", Integer.valueOf(CastIntegerProtector.parseInt(CardStruct.IStatusCode.DEFAULT)));
                linkedHashMap.put("error_message", String.valueOf(th.getMessage()));
                long jCurrentTimeMillis = System.currentTimeMillis();
                new C1061730djf();
                C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(linkedHashMap), "sync_BA_user_finished"));
                C1AF0.LJ(th);
                C1C7U.LIZIZ("BASwitchToPAorBAServiceImpl@8d9d.handlePotentialToBA$2");
            }
        });
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService
    public final void LIZJ(JSONObject jSONObject) {
        if (jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) == 1) {
            new C1050610dRj().LJII("ttelite_switch_survey_success", new String[0]);
        }
        Activity activity = this.LIZIZ;
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(C20642515q3.LJI(2131849427));
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService
    public final void LIZ(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, AObjectS387S0100000_12 aObjectS387S0100000_12) {
        FragmentManager supportFragmentManager;
        this.LIZIZ = i18nSettingManageMyAccountActivity;
        View viewLJLLJ = C786410Ut5.LJLLJ(i18nSettingManageMyAccountActivity, R.layout.fj0, null);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = viewLJLLJ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LL = new DialogInterface.OnCancelListener() { // from class: X.0TMz
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                new C1050610dRj().LJIIJ(3);
            }
        };
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLLIL = false;
        TextView textView = (TextView) viewLJLLJ.findViewById(R.id.v4_);
        C197039127h c197039127h = (C197039127h) viewLJLLJ.findViewById(R.id.wto);
        C197039127h c197039127h2 = (C197039127h) viewLJLLJ.findViewById(R.id.dat);
        if (C10EU.LIZ() != null && C10EU.LIZ().getCommerceUserLevel() == 2) {
            textView.setText(C20642515q3.LJI(2131850875));
        } else {
            textView.setText(C20642515q3.LJI(2131850963));
        }
        C786410Ut5.U8(c197039127h, new ACListenerS23S0500000_12(c197039127h, aObjectS387S0100000_12, this, tuxSheet2, i18nSettingManageMyAccountActivity, 1));
        C786410Ut5.U8(c197039127h2, new ACListenerS147S0100000_12(tuxSheet2, 477));
        if (System.currentTimeMillis() - this.LIZ.getLong(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid(), System.currentTimeMillis()) > 86400000) {
            this.LIZ.clear();
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(i18nSettingManageMyAccountActivity);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxSheet2.show(supportFragmentManager, "");
        }
    }
}
