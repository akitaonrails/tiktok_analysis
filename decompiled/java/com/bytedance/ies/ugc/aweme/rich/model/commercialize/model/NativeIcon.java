package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import X.C1045320dJC;
import X.C1045330dJD;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public class NativeIcon implements Serializable {

    @C09CT("icon_click")
    public IconClick iconClick;

    @C09CT("static_resource")
    public Set<String> staticResource;

    @C09CT("icon_view_tracking")
    public Set<String> viewTracking;

    public static class IconClick implements Serializable {

        @C09CT("click_through")
        public String clickThrough;

        @C09CT("click_tracking")
        public Set<String> clickTracking;

        public C1045330dJD toVideoClick() {
            C1045330dJD c1045330dJD = new C1045330dJD();
            c1045330dJD.clickThrough = this.clickThrough;
            c1045330dJD.clickTracking = this.clickTracking;
            return c1045330dJD;
        }

        public String getClickThrough() {
            return this.clickThrough;
        }

        public Set<String> getClickTracking() {
            return this.clickTracking;
        }

        public void setClickThrough(String str) {
            this.clickThrough = str;
        }

        public void setClickTracking(Set<String> set) {
            this.clickTracking = set;
        }
    }

    public IconClick getIconClick() {
        return this.iconClick;
    }

    public Set<String> getStaticResource() {
        return this.staticResource;
    }

    public Set<String> getViewTracking() {
        return this.viewTracking;
    }

    public void setIconClick(IconClick iconClick) {
        this.iconClick = iconClick;
    }

    public void setStaticResource(Set<String> set) {
        this.staticResource = set;
    }

    public void setViewTracking(Set<String> set) {
        this.viewTracking = set;
    }

    public C1045320dJC toIcon(String str) {
        C1045320dJC c1045320dJC = new C1045320dJC();
        c1045320dJC.program = str;
        c1045320dJC.staticResource = this.staticResource;
        c1045320dJC.viewTracking = this.viewTracking;
        if (this.iconClick != null) {
            LinkedList linkedList = new LinkedList();
            c1045320dJC.clickList = linkedList;
            linkedList.add(this.iconClick.toVideoClick());
        }
        return c1045320dJC;
    }
}
