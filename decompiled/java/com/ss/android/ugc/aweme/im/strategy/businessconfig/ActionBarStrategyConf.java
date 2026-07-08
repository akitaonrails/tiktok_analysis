package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;
import X.C909210Zlf;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarStrategyConf extends IBusinessConfig {
    public static final C909210Zlf Companion = new Object() { // from class: X.0Zlf
    };

    @C09CT("action_bar_button_conf")
    public final List<ActionBarButtonStrategyConf> actionBarButtonConf;

    @C09CT("version")
    public final Integer version;

    public ActionBarStrategyConf() {
        this(null, null);
    }

    public final ActionBarStrategyConf copy(List<ActionBarButtonStrategyConf> list, Integer num) {
        return new ActionBarStrategyConf(list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBarStrategyConf)) {
            return false;
        }
        ActionBarStrategyConf actionBarStrategyConf = (ActionBarStrategyConf) obj;
        return Intrinsics.LJFF(this.actionBarButtonConf, actionBarStrategyConf.actionBarButtonConf) && Intrinsics.LJFF(this.version, actionBarStrategyConf.version);
    }

    public int hashCode() {
        List<ActionBarButtonStrategyConf> list = this.actionBarButtonConf;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.version;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionBarStrategyConf(actionBarButtonConf=");
        sbLIZ.append(this.actionBarButtonConf);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<ActionBarButtonStrategyConf> getActionBarButtonConf() {
        return this.actionBarButtonConf;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public ActionBarStrategyConf(List<ActionBarButtonStrategyConf> list, Integer num) {
        this.actionBarButtonConf = list;
        this.version = num;
    }
}
