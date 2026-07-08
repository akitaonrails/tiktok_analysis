package defpackage;

import X.C01GW;
import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2248361CzK;
import X.C452501pT;
import X.C698190Ra5;
import android.content.Context;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class LsResourceTokenMapSettings {
    public static final ResourceTokenModel LIZ = new ResourceTokenModel(C2097608Jq.LJIIIIZZ(new Pair("Icon/Balance_Refund", "tux://icon?token=IconBalanceRefund"), new Pair("Icon/Calendar", "tux://icon?token=IconCalendar"), new Pair("Icon/Calendar_Tick", "tux://icon?token=IconCalendarTick"), new Pair("Icon/Clipboard_Two_Bars_LTR", "tux://icon?token=IconClipboardTwoBarsLTR"), new Pair("Icon/Clock", "tux://icon?token=IconClock"), new Pair("Icon/Fork_Knife", "tux://icon?token=IconForkKnife"), new Pair("Icon/Two_Person", "tux://icon?token=IconTwoPerson"), new Pair("Icon_Exp/Exp_02/Store", "tux://icon?token=IconStore"), new Pair("Icon_Exp/Exp_02/Bag", "tux://icon?token=IconBag"), new Pair("Icon/Tick_On_Doc", "tux://icon?token=IconTickOnDoc"), new Pair("Icon/X_Mark_On_Doc", "tux://icon?token=IconXMarkOnDoc"), new Pair("Icon/Bed", "tux://icon?token=IconBed"), new Pair("Icon/Lines_Horizontal_Decrease_Rectangle_LTR", "tux://icon?token=IconLinesHorizontalDecreaseRectangleLTR"), new Pair("Icon/Shield_Tick", "tux://icon?token=IconShieldTick")));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(1));

    public static final class ResourceTokenModel {

        @C09CT("icon")
        public final Map<String, String> icon;

        public ResourceTokenModel() {
            this(null);
        }

        public ResourceTokenModel(Map<String, String> map) {
            this.icon = map;
        }
    }

    public static C698190Ra5 LIZ(Context context, String str) {
        String str2;
        Map<String, String> map = ((ResourceTokenModel) LIZIZ.getValue()).icon;
        if (map == null || (str2 = map.get(str)) == null || str2.length() == 0) {
            return null;
        }
        C01GW c01gw = C2248361CzK.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("&from=");
        sbLIZ.append("poi-osp_guideline_sheet");
        return C2248361CzK.LJFF(context, C2188811AlT.LIZIZ(sbLIZ));
    }
}
