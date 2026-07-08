package com.ss.android.ugc.aweme.canvas;

import X.C0MY0;
import X.C567420MNg;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CanvasBackground implements Serializable {
    public static final C567420MNg Companion = new C567420MNg();
    public static final CanvasBackground DEFAULT_BACKGROUND = C567420MNg.LIZ(-16777216);
    public int endColor;

    @C0MY0
    public String filePath = "";
    public int primaryColor;
    public int startColor;
    public final int type;

    public static final CanvasBackground getDEFAULT_BACKGROUND() {
        Companion.getClass();
        return DEFAULT_BACKGROUND;
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public final int getType() {
        return this.type;
    }

    public CanvasBackground(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CanvasBackground)) {
            return false;
        }
        CanvasBackground canvasBackground = (CanvasBackground) obj;
        if (canvasBackground.startColor != this.startColor || canvasBackground.endColor != this.endColor || !Intrinsics.LJFF(canvasBackground.filePath, this.filePath) || canvasBackground.type != this.type) {
            return false;
        }
        return true;
    }

    public final void setEndColor(int i) {
        this.endColor = i;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public final void setPrimaryColor(int i) {
        this.primaryColor = i;
    }

    public final void setStartColor(int i) {
        this.startColor = i;
    }
}
