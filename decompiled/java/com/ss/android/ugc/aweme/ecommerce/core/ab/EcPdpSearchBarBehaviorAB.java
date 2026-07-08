package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class EcPdpSearchBarBehaviorAB {
    public static final Behavior LIZ = new Behavior(false, false, 54);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final int LJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(978));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((Behavior) c01gwLIZIZ.getValue()).showOnFirstScreen;
        LIZLLL = ((Behavior) c01gwLIZIZ.getValue()).showAfterScroll;
        LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Behavior) c01gwLIZIZ.getValue()).scrollOffset)));
    }

    public static boolean LIZ() {
        C01GW c01gw = LIZIZ;
        return ((Behavior) c01gw.getValue()).showOnFirstScreen || ((Behavior) c01gw.getValue()).showAfterScroll;
    }

    public static final class Behavior {

        @C09CT("scroll_offset")
        public final int scrollOffset;

        @C09CT("show_after_scroll")
        public final boolean showAfterScroll;

        @C09CT("show_on_first_screen")
        public final boolean showOnFirstScreen;

        public Behavior() {
            this(false, false, 54);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Behavior)) {
                return false;
            }
            Behavior behavior = (Behavior) obj;
            return this.showOnFirstScreen == behavior.showOnFirstScreen && this.showAfterScroll == behavior.showAfterScroll && this.scrollOffset == behavior.scrollOffset;
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.showOnFirstScreen) * 31) + C786410Ut5.Z2(this.showAfterScroll)) * 31) + this.scrollOffset;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Behavior(showOnFirstScreen=");
            sbLIZ.append(this.showOnFirstScreen);
            sbLIZ.append(", showAfterScroll=");
            sbLIZ.append(this.showAfterScroll);
            sbLIZ.append(", scrollOffset=");
            sbLIZ.append(this.scrollOffset);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Behavior(boolean z, boolean z2, int i) {
            this.showOnFirstScreen = z;
            this.showAfterScroll = z2;
            this.scrollOffset = i;
        }
    }
}
