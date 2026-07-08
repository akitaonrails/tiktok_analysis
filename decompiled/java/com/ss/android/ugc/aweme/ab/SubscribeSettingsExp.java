package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class SubscribeSettingsExp {
    public static final MetaData LIZ = new MetaData(false, 2, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(112));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(113));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(111));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(108));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(109));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(110));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(107));

    public static MetaData LIZ() {
        return (MetaData) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LJII.getValue()).booleanValue();
    }

    public static boolean LIZJ() {
        return ((Boolean) LJI.getValue()).booleanValue();
    }

    public static final class MetaData {

        @C09CT("enabled")
        public final boolean enabled;

        @C09CT("personal_page_popup_counts")
        public final int popupCounts;

        @C09CT("panel_ui_style")
        public final int uiStyle;

        @C09CT("personal_page_video_counts")
        public final int videoCounts;

        public MetaData() {
            this(false, 2, 0, 0);
        }

        public MetaData(boolean z, int i, int i2, int i3) {
            this.enabled = z;
            this.uiStyle = i;
            this.popupCounts = i2;
            this.videoCounts = i3;
        }
    }
}
