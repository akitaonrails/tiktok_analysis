package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class SubmitSecondaryTransSurveyOptionsEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public SubmitSecondaryTransSurveyOptionsEvent() {
        super("submit_secondary_trans_survey_options");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("author_id", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("enter_from", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("group_id", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("selected_options", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("survey_type", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("target_lang", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)));
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
