package com.ss.android.ugc.profile.business.ur.editprofile.ui;

import X.AnonymousClass0207;
import X.C1231780i9w;
import X.C1245180iVY;
import X.C1388190mED;
import X.C19EG;
import X.C20642515q3;
import X.InterfaceC1232040iAM;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class EmailEditPage implements IRouteAction {
    public C1245180iVY LL;

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) throws Throwable {
        final String string;
        if (context == null) {
            return Boolean.FALSE;
        }
        this.LL = new C1245180iVY();
        if (bundle == null || (string = bundle.getString("content")) == null) {
            string = "";
        }
        ProfileEditContentFragment profileEditContentFragmentLIZ = C1231780i9w.LIZ(C20642515q3.LJI(2131833256), string, C20642515q3.LJFF().getString(2131833861));
        profileEditContentFragmentLIZ.setUserVisibleHint(true);
        profileEditContentFragmentLIZ.LLJJIJI = new InterfaceC1232040iAM() { // from class: X.0iAK
            @Override // X.InterfaceC1232040iAM
            public final void LIZ(String str2) {
                Map<String, String> mapLIZ;
                if (TextUtils.equals(str2, string)) {
                    return;
                }
                this.getClass();
                while (a0.LJJIIZI(str2, "\n\n", false)) {
                    str2 = new Regex("\n\n").replace(str2, "\n");
                }
                if (str2 == null) {
                    str2 = "";
                }
                int length = str2.length() - 1;
                if (length >= 0 && str2.charAt(length) == '\n') {
                    str2 = str2.substring(0, length);
                }
                C1245180iVY c1245180iVY = this.LL;
                if (c1245180iVY != null) {
                    c1245180iVY.LJI = str2;
                }
                C1232410iAx c1232410iAx = new C1232410iAx();
                C1245180iVY c1245180iVY2 = this.LL;
                if (c1245180iVY2 != null) {
                    mapLIZ = c1245180iVY2.LIZ();
                } else {
                    mapLIZ = null;
                }
                c1232410iAx.LIZIZ(mapLIZ);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("email", str2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                new C1061730djf();
                C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(linkedHashMap), "profile_email_edited"));
            }
        };
        profileEditContentFragmentLIZ.LLJILJILJ = AnonymousClass0207.get$arr$(53);
        profileEditContentFragmentLIZ.LLJILJIL = false;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            profileEditContentFragmentLIZ.show(c19egLIZIZ.getSupportFragmentManager(), "EditMailDialog");
        }
        return Boolean.TRUE;
    }
}
