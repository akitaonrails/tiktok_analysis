package com.bytedance.tt.reliability.monitor.viewchecker.model;

import X.C2188811AlT;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class FragmentCheckerConfig {
    public final String fragmentName;
    public final String tag;

    public int hashCode() {
        return Objects.hash(this.tag, this.fragmentName);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FragmentCheckerConfig{tag='");
        sbLIZ.append(this.tag);
        sbLIZ.append('\'');
        sbLIZ.append(", fragmentName='");
        sbLIZ.append(this.fragmentName);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getFragmentName() {
        return this.fragmentName;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FragmentCheckerConfig fragmentCheckerConfig = (FragmentCheckerConfig) obj;
        if (Objects.equals(this.tag, fragmentCheckerConfig.tag) && Objects.equals(this.fragmentName, fragmentCheckerConfig.fragmentName)) {
            return true;
        }
        return false;
    }

    public FragmentCheckerConfig(String str, String str2) {
        this.tag = str;
        this.fragmentName = str2;
    }
}
