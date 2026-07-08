package com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base;

import X.C1558520qew;
import X.C19M4;
import X.C419910GdJ;
import X.C428150Gqb;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC428940Grs;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class BioUserWebUIComponent<T extends BizBaseData> extends BioBaseUIComponent<T> {
    public C19M4 LLJLILLLLZIIL;

    public int Ap() {
        throw null;
    }

    public String Bp() {
        Describe describe;
        T t = this.LLJJLIIIJLLLLLLLZ;
        if (t == null || (describe = t.getDescribe()) == null) {
            return null;
        }
        return describe.getText();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void tp() {
        C19M4 c19m4;
        TextView textView;
        String strBp;
        Describe describe;
        View view = this.LLJJ;
        if ((view instanceof C19M4) && (textView = (TextView) view) != null) {
            T t = this.LLJJLIIIJLLLLLLLZ;
            if (t == null || (describe = t.getDescribe()) == null || (strBp = describe.getText()) == null) {
                strBp = Bp();
            }
            textView.setText(strBp);
        }
        View view2 = this.LLJJ;
        if (!(view2 instanceof C19M4) || (c19m4 = (C19M4) view2) == null) {
            return;
        }
        c19m4.setStartIcon(zp());
    }

    public final C419910GdJ zp() {
        return (C419910GdJ) C452501pT.LIZIZ(new AwS563S0100000_19((BioUserWebUIComponent) this, 2498)).getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View So(ProfileComponentUIConfig profileComponentUIConfig) {
        String strBp;
        Describe describe;
        Context context = getContext();
        C19M4 c19m4 = null;
        if (context != null) {
            c19m4 = new C19M4(context, null, 6);
        }
        this.LLJLILLLLZIIL = c19m4;
        T t = this.LLJJLIIIJLLLLLLLZ;
        if (t == null || (describe = t.getDescribe()) == null || (strBp = describe.getText()) == null) {
            strBp = Bp();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        C19M4 c19m42 = this.LLJLILLLLZIIL;
        if (c19m42 != null) {
            C786410Ut5.O6(c19m42, layoutParams);
            c19m42.setStartIcon(zp());
            c19m42.setText(strBp);
            c19m42.setMaxLines(1);
            c19m42.setMaxEms(39);
            c19m42.setEllipsize(TextUtils.TruncateAt.END);
            c19m42.setTuxFont(62);
        }
        C428150Gqb.LIZ(this.LLJLILLLLZIIL, EnumC428940Grs.ALPHA, 0.0f);
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public void up(View view) {
        IBioUserMailLinkAbility iBioUserMailLinkAbility;
        if (view != null && (iBioUserMailLinkAbility = (IBioUserMailLinkAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IBioUserMailLinkAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iBioUserMailLinkAbility.LJIIIZ(this.LLJILLL, view, str);
        }
    }
}
