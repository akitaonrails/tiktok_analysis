package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields;

import X.C0TSA;
import X.C1388190mED;
import X.C1727340v3E;
import X.C1727910v49;
import X.C1727920v4A;
import X.C1727930v4B;
import X.C1727950v4D;
import X.C1727960v4E;
import X.C1727980v4G;
import X.C1727990v4H;
import X.C1749190vcT;
import X.C1848410yCV;
import X.C19EG;
import X.C2211941Bhg;
import X.C2213981Bky;
import Y.ACListenerS160S0100000_26;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import mf.a;

/* JADX INFO: loaded from: classes27.dex */
public final class PcsPhoneInputCell extends BasePcsInputCell<C1727340v3E> {
    public C1727920v4A LLILZIL;

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell
    public final void U5() {
        C1727920v4A c1727920v4A = this.LLILZIL;
        if (c1727920v4A != null) {
            c1727920v4A.LLILLJJLI.setValidationStatus(3);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell
    public final void V5() {
        C1727920v4A c1727920v4A = this.LLILZIL;
        if (c1727920v4A != null) {
            c1727920v4A.LLILLJJLI.setValidationStatus(0);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: X5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1727340v3E c1727340v3E) {
        String str;
        FragmentManager supportFragmentManager;
        LifecycleOwner lifecycleOwner;
        FragmentManager fragmentManager;
        super.onBindItemView(c1727340v3E);
        final C1727920v4A c1727920v4A = this.LLILZIL;
        if (c1727920v4A != null) {
            String str2 = c1727340v3E.LLILLJJLI.LIZ;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
            if (c19egLIZIZ != null) {
                supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            } else {
                supportFragmentManager = null;
            }
            c1727920v4A.LLIZLLLIL = str2;
            c1727920v4A.LLILLL = supportFragmentManager;
            c1727920v4A.LLILZ = this;
            C1727930v4B c1727930v4B = c1727920v4A.LL;
            View.OnClickListener aCListenerS160S0100000_26 = new ACListenerS160S0100000_26(c1727920v4A, 50);
            if (C1848410yCV.LIZ) {
                aCListenerS160S0100000_26 = new f(aCListenerS160S0100000_26);
            }
            a aVar = new a(aCListenerS160S0100000_26);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1727930v4B);
            }
            c1727930v4B.setOnClickListener(aVar);
            final String str3 = c1727920v4A.LLIZLLLIL;
            if (str3 != null && (lifecycleOwner = c1727920v4A.LLILZ) != null && (fragmentManager = c1727920v4A.LLILLL) != null) {
                fragmentManager.LLIIIJ(str3, lifecycleOwner, new C0TSA() { // from class: X.0v4C
                    @Override // X.C0TSA
                    public final void LIZ(Bundle bundle, String str4) {
                        if (Intrinsics.LJFF(str4, str3)) {
                            String string = bundle.getString("country_alpha2");
                            String string2 = bundle.getString("country_code");
                            String string3 = bundle.getString("country");
                            C1727920v4A c1727920v4A2 = c1727920v4A;
                            if (string == null) {
                                string = "";
                            }
                            if (string2 == null) {
                                string2 = "";
                            }
                            if (string3 == null) {
                                string3 = "";
                            }
                            c1727920v4A2.setCountryCode(new C1727970v4F(string3, "", string, string2));
                        }
                    }
                });
            }
        }
        C1727920v4A c1727920v4A2 = this.LLILZIL;
        if (c1727920v4A2 != null) {
            c1727920v4A2.setPhoneNumberPlaceholder(c1727340v3E.LLILLJJLI.LJI);
        }
        if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled()) {
            C1727920v4A c1727920v4A3 = this.LLILZIL;
            if (c1727920v4A3 != null) {
                c1727920v4A3.setPhoneNumberImeOptions(R5());
            }
        } else {
            C1727920v4A c1727920v4A4 = this.LLILZIL;
            if (c1727920v4A4 != null) {
                c1727920v4A4.setPhoneNumberImeOptions(5);
            }
        }
        String str4 = (String) ((LinkedHashMap) P5().LLILZ).get(c1727340v3E.LLILLJJLI.LIZ);
        if (str4 == null) {
            C1727990v4H c1727990v4H = this.LLILLL;
            if (c1727990v4H != null && (str = c1727990v4H.LJ) != null) {
                if (a0.LJJIJ(str, '/')) {
                    C1727920v4A c1727920v4A5 = this.LLILZIL;
                    if (c1727920v4A5 != null) {
                        c1727920v4A5.setFullPhoneNumber(str);
                    }
                } else if (u.LJJIIJZLJL(a0.LJLJJL(str).toString(), "+", false)) {
                    C1727920v4A c1727920v4A6 = this.LLILZIL;
                    if (c1727920v4A6 != null) {
                        c1727920v4A6.LIZIZ(str);
                    }
                } else if (str.length() > 0) {
                    C1727920v4A c1727920v4A7 = this.LLILZIL;
                    if (c1727920v4A7 != null) {
                        c1727920v4A7.LIZIZ(str);
                    }
                    C1727920v4A c1727920v4A8 = this.LLILZIL;
                    if (c1727920v4A8 != null) {
                        c1727920v4A8.LIZ();
                    }
                } else {
                    C1727920v4A c1727920v4A9 = this.LLILZIL;
                    if (c1727920v4A9 != null) {
                        c1727920v4A9.LIZ();
                    }
                }
            }
        } else {
            C1727920v4A c1727920v4A10 = this.LLILZIL;
            if (c1727920v4A10 != null) {
                c1727920v4A10.setFullPhoneNumber(str4);
            }
        }
        C1749190vcT c1749190vcT = this.LLILLJJLI;
        if (c1749190vcT != null) {
            C1727980v4G.LIZ(c1749190vcT, this.LLILZIL, c1727340v3E.LLILLJJLI);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C1727920v4A c1727920v4A;
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        C1727920v4A c1727920v4A2 = new C1727920v4A(viewGroup.getContext());
        this.LLILZIL = c1727920v4A2;
        c1727920v4A2.setOnPhoneNumberUpdate(new C1727910v49(this));
        C1727920v4A c1727920v4A3 = this.LLILZIL;
        if (c1727920v4A3 != null) {
            c1727920v4A3.setOnCountryCodeUpdate(new C1727950v4D(this));
        }
        if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled() && (c1727920v4A = this.LLILZIL) != null) {
            c1727920v4A.setOnPhoneNumberImeAction(new C1727960v4E(this));
        }
        return viewOnCreateItemView;
    }
}
