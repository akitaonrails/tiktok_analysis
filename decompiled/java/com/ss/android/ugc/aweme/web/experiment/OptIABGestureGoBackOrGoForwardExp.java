package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class OptIABGestureGoBackOrGoForwardExp {
    public static final GestureModel LIZ = new GestureModel();
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final int LJ;
    public static final int LJFF;

    public static final class GestureModel {

        @C09CT("enable_gesture")
        public boolean enableGesture;

        @C09CT("hide_back_forward_button")
        public boolean hideBackForwardButton;

        @C09CT("move_x")
        public int moveX = 30;

        @C09CT("down_stat_x")
        public int downStatX = 30;
    }

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        LIZIZ = c01gwLIZIZ;
        GestureModel gestureModel = (GestureModel) c01gwLIZIZ.getValue();
        LIZJ = gestureModel != null && gestureModel.enableGesture;
        GestureModel gestureModel2 = (GestureModel) c01gwLIZIZ.getValue();
        LIZLLL = gestureModel2 != null && gestureModel2.hideBackForwardButton;
        GestureModel gestureModel3 = (GestureModel) c01gwLIZIZ.getValue();
        LJ = gestureModel3 != null ? gestureModel3.moveX : 30;
        GestureModel gestureModel4 = (GestureModel) c01gwLIZIZ.getValue();
        LJFF = gestureModel4 != null ? gestureModel4.downStatX : 30;
    }
}
