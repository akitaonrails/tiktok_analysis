package com.ss.android.ugc.tiktok.security.jsguard;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class PnsThirdBypassPathSettings {
    public static final PnsThirdBypassPathSettings LIZ = new PnsThirdBypassPathSettings();

    public static final PnsThirdBypassPathModel LIZ() {
        PnsThirdBypassPathModel pnsThirdBypassPathModel = (PnsThirdBypassPathModel) SettingsManager.LIZLLL().LJIIIIZZ("pns_third_bypass_path", PnsThirdBypassPathModel.class, null);
        if (pnsThirdBypassPathModel != null) {
            return pnsThirdBypassPathModel;
        }
        return null;
    }

    public static final class PnsThirdBypassPathModel {

        @C09CT("first_jump")
        public final List<String> firstJump;

        @C09CT("single_page")
        public final List<String> singlePage;

        @C09CT("third_initial_page")
        public final List<String> thirdInitialPage;

        public PnsThirdBypassPathModel(List<String> list, List<String> list2, List<String> list3) {
            this.firstJump = list;
            this.singlePage = list2;
            this.thirdInitialPage = list3;
        }
    }
}
