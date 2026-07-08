package com.ss.android.ugc.aweme.ttkvideoplayer.adapt.rule.normal;

import X.AbstractC1484150oiz;
import X.AbstractC1484200oj4;
import X.AnonymousClass0518;
import X.C09CT;
import X.C1481110oe5;
import X.C1484140oiy;
import X.C1484170oj1;
import X.C1484210oj5;
import X.C2188811AlT;
import X.C585050Mx5;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes24.dex */
public final class NormalRule extends AbstractC1484150oiz {
    public final C1484170oj1 LIZIZ;

    @C09CT("command")
    public final Command command;

    @C09CT("condition")
    public final List<Map<String, List<String>>> condition;

    public static final class Command {

        @C09CT("name")
        public final String name;

        @C09CT("params")
        public final Map<String, Object> params;
    }

    @Override // X.AbstractC1484150oiz
    public final String LIZJ() {
        return "normal";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oj2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0oj1] */
    public NormalRule() {
        final ?? r0 = new AbstractC1484200oj4() { // from class: X.0oj2
            @Override // X.AbstractC1484200oj4
            public final boolean LIZ(String str, List<String> list) {
                if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
                    return list.contains(str);
                }
                return false;
            }
        };
        this.LIZIZ = new AbstractC1484200oj4(r0) { // from class: X.0oj1
            {
                this.LIZ = r0;
            }

            @Override // X.AbstractC1484200oj4
            public final boolean LIZ(String str, List<String> list) {
                if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
                    return false;
                }
                if (list.size() != 2) {
                    return this.LIZ.LIZ(str, list);
                }
                try {
                    float f = CastFloatProtector.parseFloat(str);
                    float f2 = CastFloatProtector.parseFloat((String) ListProtector.get(list, 0));
                    float f3 = CastFloatProtector.parseFloat((String) ListProtector.get(list, 1));
                    if (f2 < f3) {
                        if (f < f2 || f > f3) {
                            return false;
                        }
                        return true;
                    }
                    return this.LIZ.LIZ(str, list);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return this.LIZ.LIZ(str, list);
                }
            }
        };
    }

    @Override // X.AbstractC1484150oiz
    public final C585050Mx5 LIZ(C1484140oiy c1484140oiy) {
        String str;
        C1484210oj5 c1484210oj5;
        NormalRule normalRule = c1484140oiy.LIZIZ.LIZ;
        Map<String, Object> map = null;
        if (!(normalRule instanceof NormalRule) || normalRule == null) {
            normalRule = (NormalRule) AnonymousClass0518.LIZ(c1484140oiy.LIZIZ.rule, NormalRule.class);
            c1484140oiy.LIZIZ.LIZ = normalRule;
        }
        if (normalRule == null) {
            C1481110oe5.LIZLLL("NormalRule", "match error, parse rule null.");
            return null;
        }
        List<Map<String, List<String>>> list = normalRule.condition;
        if (list != null && !list.isEmpty()) {
            if (normalRule.command == null) {
                C1481110oe5.LIZLLL("NormalRule", "match error, command empty.");
                return null;
            }
            Map<String, String> map2 = c1484140oiy.LIZJ;
            if (map2 != null) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map2;
                if (!concurrentHashMap.isEmpty()) {
                    String str2 = c1484140oiy.LIZ;
                    Command command = normalRule.command;
                    if (command != null) {
                        str = command.name;
                        map = command.params;
                    } else {
                        str = null;
                    }
                    C585050Mx5 c585050Mx5 = new C585050Mx5(str2, str, map);
                    StringBuilder sb = new StringBuilder();
                    for (Map<String, List<String>> map3 : normalRule.condition) {
                        Iterator<Map.Entry<String, List<String>>> it2 = map3.entrySet().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Map.Entry<String, List<String>> next = it2.next();
                                String key = next.getKey();
                                List<String> value = next.getValue();
                                if (!concurrentHashMap.containsKey(key)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("[unsupported condition key:");
                                    sbLIZ.append(key);
                                    sbLIZ.append("], ");
                                    c1484210oj5 = new C1484210oj5(false, C2188811AlT.LIZIZ(sbLIZ));
                                    break;
                                }
                                if (!LIZ((String) concurrentHashMap.get(key), value)) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("[condition not satisfied, key:");
                                    sbLIZ2.append(key);
                                    sbLIZ2.append("], ");
                                    c1484210oj5 = new C1484210oj5(false, C2188811AlT.LIZIZ(sbLIZ2));
                                    break;
                                }
                            } else {
                                c1484210oj5 = new C1484210oj5(true, "");
                                break;
                            }
                        }
                        if (c1484210oj5.LIZ) {
                            c585050Mx5.LIZIZ = true;
                            c585050Mx5.LIZLLL = map3;
                            return c585050Mx5;
                        }
                        sb.append(c1484210oj5.LIZIZ);
                    }
                    c585050Mx5.LIZIZ = false;
                    c585050Mx5.LIZJ = sb.toString();
                    return c585050Mx5;
                }
            }
            C1481110oe5.LIZLLL("NormalRule", "match error, inputParams empty.");
            return null;
        }
        C1481110oe5.LIZLLL("NormalRule", "match error, condition empty.");
        return null;
    }
}
