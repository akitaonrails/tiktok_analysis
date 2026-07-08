package webcast.api.room;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class Modification {

    @C09CT("effect_id")
    public long effectId;

    @C09CT("end_time")
    public long endTime;

    @C09CT("extra")
    public String extra;

    @C09CT("from")
    public long from;

    @C09CT("mode")
    public long mode;

    @C09CT("modification_type")
    public long modificationType;

    @C09CT("name")
    public String name;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT("role")
    public long role;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sub_effect_id")
    public long subEffectId;

    @C09CT("sub_type")
    public long subType;

    @C09CT("tab")
    public String tab;

    @C09CT("url")
    public String url;

    @C09CT("value")
    public double value;

    @C09CT("values")
    public Map<String, Double> values;

    public final Modification LIZ() {
        Modification modification = new Modification();
        modification.effectId = this.effectId;
        modification.name = this.name;
        modification.resourceId = this.resourceId;
        modification.modificationType = this.modificationType;
        modification.startTime = this.startTime;
        modification.endTime = this.endTime;
        modification.role = this.role;
        modification.tab = this.tab;
        modification.mode = this.mode;
        modification.from = this.from;
        modification.value = this.value;
        modification.url = this.url;
        modification.scene = this.scene;
        modification.extra = this.extra;
        modification.subEffectId = this.subEffectId;
        modification.subType = this.subType;
        modification.status = this.status;
        modification.values = this.values;
        return modification;
    }

    public Modification() {
        this.name = "";
        this.resourceId = "";
        this.tab = "";
        this.url = "";
        this.scene = "";
        this.extra = "";
        this.values = new LinkedHashMap();
    }

    public Modification(long j, String str, String str2, long j2, Long l, Long l2, long j3, String str3, Long l3, Long l4, Float f, String str4, String str5, Long l5, String str6, long j4, int i) {
        this.name = "";
        this.resourceId = "";
        this.tab = "";
        this.url = "";
        this.scene = "";
        this.extra = "";
        this.values = new LinkedHashMap();
        this.effectId = j;
        this.name = str;
        if (str2 != null) {
            this.resourceId = str2;
        }
        this.modificationType = j2;
        if (l != null) {
            this.startTime = l.longValue();
        }
        if (l2 != null) {
            this.endTime = l2.longValue();
        }
        this.role = j3;
        if (str3 != null) {
            this.tab = str3;
        }
        if (l3 != null) {
            this.mode = l3.longValue();
        }
        if (l4 != null) {
            this.from = l4.longValue();
        }
        if (f != null) {
            this.value = f.floatValue();
        }
        if (str4 != null) {
            this.url = str4;
        }
        if (str5 != null) {
            this.scene = str5;
        }
        if (l5 != null) {
            this.subEffectId = l5.longValue();
        }
        if (str6 != null) {
            this.extra = str6;
        }
        this.subType = j4;
        this.status = i;
    }
}
