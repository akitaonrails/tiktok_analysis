package com.ss.ugc.android.editor.base.viewmodel;

import X.C1697810uHb;
import android.graphics.RectF;
import android.util.SizeF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class TextTemplate {
    public final List<Double> bounding_box;
    public final double duration;
    public final int order_in_layer;
    public final List<Float> position;
    public final double rotation;
    public final List<Double> scale;
    public final float start_time;
    public final List<TextContent> text_list;

    /* JADX WARN: Illegal instructions before constructor call */
    public TextTemplate() {
        Float fValueOf = Float.valueOf(0.0f);
        this(C1697810uHb.LJIIJJI(fValueOf, fValueOf), 0.0d, C1697810uHb.LJIIJJI(Double.valueOf(0.0d), Double.valueOf(0.0d)), 0, 0.0f, 0.0d, C1697810uHb.LJIIJJI(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)), C1697810uHb.LJIIJJI(new TextContent(0, "", 0.0f, 0.0d, C1697810uHb.LJIIJJI(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d))), new TextContent(0, "", 0.0f, 0.0d, C1697810uHb.LJIIJJI(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)))));
    }

    public final SizeF boundingBox() {
        if (this.bounding_box.size() != 4) {
            return null;
        }
        return new SizeF(((((float) ((Number) ListProtector.get(this.bounding_box, 2)).doubleValue()) / 2.0f) + 0.5f) - ((((float) ((Number) ListProtector.get(this.bounding_box, 0)).doubleValue()) / 2.0f) + 0.5f), (0.5f - (((float) ((Number) ListProtector.get(this.bounding_box, 1)).doubleValue()) / 2.0f)) - (0.5f - (((float) ((Number) ListProtector.get(this.bounding_box, 3)).doubleValue()) / 2.0f)));
    }

    public final List<RectF> textsBounds() {
        List<TextContent> list = this.text_list;
        ArrayList arrayList = new ArrayList();
        for (TextContent textContent : list) {
            if (textContent.bounding_box.size() == 4) {
                arrayList.add(new RectF((((float) ((Number) ListProtector.get(textContent.bounding_box, 0)).doubleValue()) / 2.0f) + 0.5f, 0.5f - (((float) ((Number) ListProtector.get(textContent.bounding_box, 3)).doubleValue()) / 2.0f), (((float) ((Number) ListProtector.get(textContent.bounding_box, 2)).doubleValue()) / 2.0f) + 0.5f, 0.5f - (((float) ((Number) ListProtector.get(textContent.bounding_box, 1)).doubleValue()) / 2.0f)));
            }
        }
        return arrayList;
    }

    public final String textContent(int i) {
        if (i >= 0 && i <= this.text_list.size()) {
            for (TextContent textContent : this.text_list) {
                if (textContent.index == i) {
                    return textContent.value;
                }
            }
        }
        return "";
    }

    public TextTemplate(List<Float> list, double d, List<Double> list2, int i, float f, double d2, List<Double> list3, List<TextContent> list4) {
        this.position = list;
        this.rotation = d;
        this.scale = list2;
        this.order_in_layer = i;
        this.start_time = f;
        this.duration = d2;
        this.bounding_box = list3;
        this.text_list = list4;
    }
}
