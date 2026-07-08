package com.ss.android.ugc.aweme.account.login.twostep.event;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC1233700iD2;
import X.EnumC20493081b;
import X.EnumC20494081c;
import X.EnumC20495081d;
import X.EnumC20496081e;
import X.EnumC20497081f;
import X.EnumC20498081g;
import X.EnumC20499081h;
import X.EnumC20500081i;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class TwosvSetupShowEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public TwosvSetupShowEvent() {
        super("twosv_setup_show");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("enter_from", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1233700iD2.class)), AbstractC207072161e.LJ("{\"allowed\":[\"discovery\",\"mandatory_popup\",\"nudge_popup\",\"mandatory_gpppa_2sv_fullsheet\",\"nonmandatory_gpppa_2sv_fullsheet\",\"nonmandatory_gpppa_2sv_profile_popup\",\"nonmandatory_gpppa_2sv_profile_warning\"]}", "enum"), false)), new Pair("is_email_selected", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20493081b.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_email_turned_on", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20494081c.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_pw_selected", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20495081d.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_pw_turned_on", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20496081e.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_sms_selected", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20497081f.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_sms_turned_on", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20498081g.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_totp_selected", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20499081h.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_totp_turned_on", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20500081i.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("page_type", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("popup_freq", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(Integer.TYPE)), null, false)));
    }

    @Override // X.AbstractC207072161e
    public final Map<String, C2805016t> LIZJ() {
        return this.LJII;
    }

    @Override // X.AbstractC207072161e
    public final AbstractC207072161e LJII(InterfaceC1282004zy interfaceC1282004zy) {
        LIZ().add(interfaceC1282004zy);
        return this;
    }
}
