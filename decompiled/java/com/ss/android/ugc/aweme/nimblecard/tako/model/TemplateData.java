package com.ss.android.ugc.aweme.nimblecard.tako.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class TemplateData {

    @C09CT("children")
    public final List<TemplateData> children;

    @C09CT("conditions")
    public final List<ConditionNode> conditions;

    @C09CT("events")
    public final List<Event> event;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("layout")
    public final Layout layout;

    @C09CT("loopType")
    public final String loopType;

    @C09CT("loopVariables")
    public final LoopVariables loopVariables;

    @C09CT("props")
    public final NimbleViewProps props;

    @C09CT("type")
    public final String type;

    @C09CT("variable")
    public final String variable;

    public TemplateData() {
        this(null, null, new Layout(null, null, null, null, null, null, null, null, null, "auto", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateData)) {
            return false;
        }
        TemplateData templateData = (TemplateData) obj;
        return Intrinsics.LJFF(this.type, templateData.type) && Intrinsics.LJFF(this.id, templateData.id) && Intrinsics.LJFF(this.layout, templateData.layout) && Intrinsics.LJFF(this.props, templateData.props) && Intrinsics.LJFF(this.event, templateData.event) && Intrinsics.LJFF(this.conditions, templateData.conditions) && Intrinsics.LJFF(this.children, templateData.children) && Intrinsics.LJFF(this.loopType, templateData.loopType) && Intrinsics.LJFF(this.variable, templateData.variable) && Intrinsics.LJFF(this.loopVariables, templateData.loopVariables);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.layout.hashCode()) * 31;
        NimbleViewProps nimbleViewProps = this.props;
        int iHashCode3 = (iHashCode2 + (nimbleViewProps == null ? 0 : nimbleViewProps.hashCode())) * 31;
        List<Event> list = this.event;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<ConditionNode> list2 = this.conditions;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TemplateData> list3 = this.children;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.loopType;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.variable;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LoopVariables loopVariables = this.loopVariables;
        return iHashCode8 + (loopVariables != null ? loopVariables.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateData(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", props=");
        sbLIZ.append(this.props);
        sbLIZ.append(", event=");
        sbLIZ.append(this.event);
        sbLIZ.append(", conditions=");
        sbLIZ.append(this.conditions);
        sbLIZ.append(", children=");
        sbLIZ.append(this.children);
        sbLIZ.append(", loopType=");
        sbLIZ.append(this.loopType);
        sbLIZ.append(", variable=");
        sbLIZ.append(this.variable);
        sbLIZ.append(", loopVariables=");
        sbLIZ.append(this.loopVariables);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TemplateData(String str, String str2, Layout layout, NimbleViewProps nimbleViewProps, List<Event> list, List<ConditionNode> list2, List<TemplateData> list3, String str3, String str4, LoopVariables loopVariables) {
        this.type = str;
        this.id = str2;
        this.layout = layout;
        this.props = nimbleViewProps;
        this.event = list;
        this.conditions = list2;
        this.children = list3;
        this.loopType = str3;
        this.variable = str4;
        this.loopVariables = loopVariables;
    }
}
