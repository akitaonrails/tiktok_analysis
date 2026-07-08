package com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui;

import X.C09CT;
import X.C0R0T;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchList {
    public static final C0R0T LJJIZ = C0R0T.LIZ;

    public static final class ActiveArea implements Serializable {
        public static final int $stable = 8;

        @C09CT("height")
        public float height;

        @C09CT("width")
        public float width;

        @C09CT("x")
        public float x;

        @C09CT("y")
        public float y;

        public ActiveArea() {
            this(0.0f, 0.0f, 0.0f, 0.0f);
        }

        public final void clear() {
            this.x = 0.0f;
            this.y = 0.0f;
            this.width = 0.0f;
            this.height = 0.0f;
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final void setHeight(float f) {
            this.height = f;
        }

        public final void setWidth(float f) {
            this.width = f;
        }

        public final void setX(float f) {
            this.x = f;
        }

        public final void setY(float f) {
            this.y = f;
        }

        public ActiveArea(float f, float f2, float f3, float f4) {
            this.x = f;
            this.y = f2;
            this.width = f3;
            this.height = f4;
        }
    }

    public static final class HorizontalStyle implements Serializable {
        public static final int $stable = 8;

        @C09CT("itemSpace")
        public float itemSpace;

        @C09CT("leftMargin")
        public float leftMargin;

        @C09CT("preferitemwidth")
        public Float preferItemWidth;

        @C09CT("rightMargin")
        public float rightMargin;

        public HorizontalStyle() {
            this(0.0f, 0.0f, 0.0f, null);
        }

        public final void clear() {
            this.leftMargin = 0.0f;
            this.rightMargin = 0.0f;
            this.itemSpace = 0.0f;
            this.preferItemWidth = null;
        }

        public final float getItemSpace() {
            return this.itemSpace;
        }

        public final float getLeftMargin() {
            return this.leftMargin;
        }

        public final Float getPreferItemWidth() {
            return this.preferItemWidth;
        }

        public final float getRightMargin() {
            return this.rightMargin;
        }

        public final void setItemSpace(float f) {
            this.itemSpace = f;
        }

        public final void setLeftMargin(float f) {
            this.leftMargin = f;
        }

        public final void setPreferItemWidth(Float f) {
            this.preferItemWidth = f;
        }

        public final void setRightMargin(float f) {
            this.rightMargin = f;
        }

        public HorizontalStyle(float f, float f2, float f3, Float f4) {
            this.leftMargin = f;
            this.rightMargin = f2;
            this.itemSpace = f3;
            this.preferItemWidth = f4;
        }
    }

    public static final class ScrollAnchorInfo implements Serializable {
        public static final int $stable = 8;

        @C09CT("anchormargin")
        public int anchorMargin;

        @C09CT("anchortype")
        public String anchorType;

        @C09CT("index")
        public Integer index;

        @C09CT("smooth")
        public boolean smooth;

        public ScrollAnchorInfo() {
            this(null, "left", 0, false);
        }

        public final int getAnchorMargin() {
            return this.anchorMargin;
        }

        public final String getAnchorType() {
            return this.anchorType;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final boolean getSmooth() {
            return this.smooth;
        }

        public final void setAnchorMargin(int i) {
            this.anchorMargin = i;
        }

        public final void setAnchorType(String str) {
            this.anchorType = str;
        }

        public final void setIndex(Integer num) {
            this.index = num;
        }

        public final void setSmooth(boolean z) {
            this.smooth = z;
        }

        public ScrollAnchorInfo(Integer num, String str, int i, boolean z) {
            this.index = num;
            this.anchorType = str;
            this.anchorMargin = i;
            this.smooth = z;
        }
    }
}
