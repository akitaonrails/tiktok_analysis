package com.ss.android.ugc.aweme.nimblecard.model;

import X.C09CT;
import X.C1697810uHb;
import com.ss.android.ugc.aweme.nimblecard.model.search.NimbleConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Template {

    @C09CT("alignment")
    public final String alignment;

    @C09CT("axis")
    public final String axis;

    @C09CT("components")
    public final List<Component> components;

    @C09CT("config")
    public final NimbleConfig config;

    @C09CT("description")
    public final String description;

    @C09CT("height")
    public final Float height;

    @C09CT("height_mode")
    public final String heightMode;

    @C09CT("index")
    public final Integer index;

    @C09CT("margin")
    public final List<Float> margin;

    @C09CT("name")
    public final String name;

    @C09CT("padding")
    public final List<Integer> padding;

    @C09CT("style")
    public final Style style;

    @C09CT("sub_components")
    public final List<Template> subComponents;

    @C09CT("card_types")
    public final List<Integer> types;

    @C09CT("width")
    public final Float width;

    @C09CT("width_mode")
    public final String widthMode;

    public Template() {
        this(null, "", null, null, C1697810uHb.LJIIJJI(0, 0, 0, 0), null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Template)) {
            return false;
        }
        Template template = (Template) obj;
        return Intrinsics.LJFF(this.types, template.types) && Intrinsics.LJFF(this.description, template.description) && Intrinsics.LJFF(this.style, template.style) && Intrinsics.LJFF(this.components, template.components) && Intrinsics.LJFF(this.padding, template.padding) && Intrinsics.LJFF(this.index, template.index) && Intrinsics.LJFF(this.name, template.name) && Intrinsics.LJFF(this.width, template.width) && Intrinsics.LJFF(this.height, template.height) && Intrinsics.LJFF(this.widthMode, template.widthMode) && Intrinsics.LJFF(this.heightMode, template.heightMode) && Intrinsics.LJFF(this.margin, template.margin) && Intrinsics.LJFF(this.axis, template.axis) && Intrinsics.LJFF(this.alignment, template.alignment) && Intrinsics.LJFF(this.subComponents, template.subComponents) && Intrinsics.LJFF(this.config, template.config);
    }

    public final int hashCode() {
        List<Integer> list = this.types;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.description.hashCode()) * 31;
        Style style = this.style;
        int iHashCode2 = (iHashCode + (style == null ? 0 : style.hashCode())) * 31;
        List<Component> list2 = this.components;
        int iHashCode3 = (((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.padding.hashCode()) * 31;
        Integer num = this.index;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.name;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.width;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.height;
        int iHashCode7 = (iHashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str2 = this.widthMode;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.heightMode;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Float> list3 = this.margin;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.axis;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.alignment;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<Template> list4 = this.subComponents;
        int iHashCode13 = (iHashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        NimbleConfig nimbleConfig = this.config;
        return iHashCode13 + (nimbleConfig != null ? nimbleConfig.hashCode() : 0);
    }

    public final String toString() {
        return "Template(types=" + this.types + ", description=" + this.description + ", style=" + this.style + ", components=" + this.components + ", padding=" + this.padding + ", index=" + this.index + ", name=" + this.name + ", width=" + this.width + ", height=" + this.height + ", widthMode=" + this.widthMode + ", heightMode=" + this.heightMode + ", margin=" + this.margin + ", axis=" + this.axis + ", alignment=" + this.alignment + ", subComponents=" + this.subComponents + ", config=" + this.config + ')';
    }

    public Template(List<Integer> list, String str, Style style, List<Component> list2, List<Integer> list3, Integer num, String str2, Float f, Float f2, String str3, String str4, List<Float> list4, String str5, String str6, List<Template> list5, NimbleConfig nimbleConfig) {
        this.types = list;
        this.description = str;
        this.style = style;
        this.components = list2;
        this.padding = list3;
        this.index = num;
        this.name = str2;
        this.width = f;
        this.height = f2;
        this.widthMode = str3;
        this.heightMode = str4;
        this.margin = list4;
        this.axis = str5;
        this.alignment = str6;
        this.subComponents = list5;
        this.config = nimbleConfig;
    }
}
