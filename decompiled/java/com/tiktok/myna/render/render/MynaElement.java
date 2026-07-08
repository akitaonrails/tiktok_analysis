package com.tiktok.myna.render.render;

import X.C09CS;
import X.C09CT;
import X.C21329618da;
import X.C21330518dj;
import X.C21338518f1;
import X.C21338718f3;
import X.InterfaceC1547330qMt;
import X.InterfaceC21330018de;
import com.tiktok.myna.render.render.elements.MynaTypeAdapterFactory;
import com.tiktok.myna.render.render.widget.animation.MynaAnimationKeyframe;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
@C09CS(MynaTypeAdapterFactory.class)
public final class MynaElement implements InterfaceC21330018de, Cloneable {
    public static final C21338518f1 Companion = new Object() { // from class: X.18f1
    };

    @C09CT("actions")
    public final Map<String, InterfaceC1547330qMt> action;

    @C09CT("active_style")
    public final Map<String, Object> activeStyle;

    @C09CT("animations")
    public final Map<String, List<MynaAnimationKeyframe>> animations;

    @C09CT("attr")
    public final Map<String, Object> attr;
    public transient C21329618da bindInfo;
    public transient boolean canFlatten;
    public transient boolean childrenHasFor;
    public transient boolean childrenHasIfOrDisplay;

    @C09CT("elements")
    public final List<MynaElement> elements;
    public transient C21330518dj forConfigValue;
    public transient boolean hasClick;
    public transient boolean hasZIndex;
    public transient long itemKey;
    public transient long itemOriginKey;

    @C09CT("meta")
    public final MynaTemplateMeta meta;

    @C09CT("props")
    public final Map<String, Object> props;

    @C09CT("storage")
    public final Map<String, Object> storage;

    @C09CT("style")
    public final Map<String, Object> style;
    public transient boolean textHasTail;

    @C09CT("type")
    public final String type;

    public MynaElement() {
        this("", null, null, null, null, null, null, null, null, null, null);
    }

    public Object clone() {
        return super.clone();
    }

    public final MynaElement deepClone() {
        return (MynaElement) clone();
    }

    public String toString() {
        String type = getType();
        return type == null ? "" : type;
    }

    @Override // X.InterfaceC21330018de
    public Map<String, InterfaceC1547330qMt> getAction() {
        return this.action;
    }

    @Override // X.InterfaceC21330018de
    public Map<String, Object> getActiveStyle() {
        return this.activeStyle;
    }

    @Override // X.InterfaceC21330018de
    public Map<String, List<MynaAnimationKeyframe>> getAnimations() {
        return this.animations;
    }

    @Override // X.InterfaceC21330018de
    public Map<String, Object> getAttr() {
        return this.attr;
    }

    @Override // X.InterfaceC21330018de
    public List<MynaElement> getElements() {
        return this.elements;
    }

    @Override // X.InterfaceC21330018de
    public MynaTemplateMeta getMeta() {
        return this.meta;
    }

    @Override // X.InterfaceC21330018de
    public Map<String, Object> getProps() {
        return this.props;
    }

    public final Map<String, Object> getStorage() {
        return this.storage;
    }

    @Override // X.InterfaceC21330018de
    public Map<String, Object> getStyle() {
        return this.style;
    }

    @Override // X.InterfaceC21330018de
    public String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MynaElement(String str, MynaTemplateMeta mynaTemplateMeta, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, List<MynaElement> list, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4, Map<String, ? extends Object> map5, Map<String, ? extends List<MynaAnimationKeyframe>> map6, Map<String, ? extends InterfaceC1547330qMt> map7, C21329618da c21329618da) {
        this.type = str;
        this.meta = mynaTemplateMeta;
        this.props = map;
        this.attr = map2;
        this.elements = list;
        this.style = map3;
        this.activeStyle = map4;
        this.storage = map5;
        this.animations = map6;
        this.action = map7;
        this.bindInfo = c21329618da;
        long jAddAndGet = C21338718f3.LIZ.addAndGet(1L);
        this.itemOriginKey = jAddAndGet;
        this.itemKey = jAddAndGet;
    }
}
