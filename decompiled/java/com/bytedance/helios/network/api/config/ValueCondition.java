package com.bytedance.helios.network.api.config;

import X.C01H7;
import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: loaded from: classes.dex */
public final class ValueCondition {
    public static final ConcurrentHashMap<String, Regex> LIZ = new ConcurrentHashMap<>();

    @C09CT("match")
    public final String match;

    @C09CT("sample_rate")
    public final double sampleRate;

    @C09CT("targets")
    public final Set<String> targets;

    public ValueCondition() {
        this(null, null, 0.0d, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueCondition)) {
            return false;
        }
        ValueCondition valueCondition = (ValueCondition) obj;
        return Intrinsics.LJFF(this.match, valueCondition.match) && Intrinsics.LJFF(this.targets, valueCondition.targets) && Double.compare(this.sampleRate, valueCondition.sampleRate) == 0;
    }

    public final int hashCode() {
        return (((this.match.hashCode() * 31) + this.targets.hashCode()) * 31) + C786410Ut5.X2(this.sampleRate);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ValueCondition(match=");
        sbLIZ.append(this.match);
        sbLIZ.append(", targets=");
        sbLIZ.append(this.targets);
        sbLIZ.append(", sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean LIZ(String str) {
        Regex regexPutIfAbsent;
        String str2 = this.match;
        switch (str2.hashCode()) {
            case 69819:
                if (!str2.equals("End")) {
                    return false;
                }
                Set<String> set = this.targets;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return false;
                }
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (u.LJIIZILJ(str, (String) it2.next(), false)) {
                        if (C01H7.LIZ(this.sampleRate)) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            case 67394271:
                if (str2.equals("Exact") && this.targets.contains(str) && C01H7.LIZ(this.sampleRate)) {
                    return true;
                }
                return false;
            case 78839847:
                if (!str2.equals("Regex")) {
                    return false;
                }
                Set<String> set2 = this.targets;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    return false;
                }
                for (String str3 : set2) {
                    ConcurrentHashMap<String, Regex> concurrentHashMap = LIZ;
                    Regex regex = concurrentHashMap.get(str3);
                    if (regex == null && (regexPutIfAbsent = concurrentHashMap.putIfAbsent(str3, (regex = new Regex(str3)))) != null) {
                        regex = regexPutIfAbsent;
                    }
                    if (regex.matches(str)) {
                        if (C01H7.LIZ(this.sampleRate)) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            case 80204866:
                if (!str2.equals("Start")) {
                    return false;
                }
                Set<String> set3 = this.targets;
                if ((set3 instanceof Collection) && set3.isEmpty()) {
                    return false;
                }
                Iterator<T> it3 = set3.iterator();
                while (it3.hasNext()) {
                    if (u.LJJIIJZLJL(str, (String) it3.next(), false)) {
                        if (C01H7.LIZ(this.sampleRate)) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            default:
                return false;
        }
    }

    public ValueCondition(String str, Set<String> set, double d) {
        this.match = str;
        this.targets = set;
        this.sampleRate = d;
    }

    public ValueCondition(String str, Set set, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C08CX.INSTANCE : set, (i & 4) != 0 ? 1.0d : d);
    }
}
