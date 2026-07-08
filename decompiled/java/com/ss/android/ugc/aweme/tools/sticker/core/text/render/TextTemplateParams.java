package com.ss.android.ugc.aweme.tools.sticker.core.text.render;

import X.C1697810uHb;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class TextTemplateParams {
    public static final int $stable = 8;
    public final List<Double> bounding_box;
    public final double duration;
    public final int order_in_layer;
    public final List<Float> position;
    public final double rotation;
    public final List<Double> scale;
    public final float start_time;
    public final List<TextContent> text_list;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TextTemplateParams() {
        double d = 0.0d;
        this(null, d, 0 == true ? 1 : 0, 0, 0.0f, d, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public final TextTemplateParams copy(List<Float> list, double d, List<Double> list2, int i, float f, double d2, List<Double> list3, List<TextContent> list4) {
        return new TextTemplateParams(list, d, list2, i, f, d2, list3, list4);
    }

    public final Pair<Float, Float> boundingBox() {
        if (this.bounding_box.size() != 4) {
            return null;
        }
        return new Pair<>(Float.valueOf((float) (((Number) ListProtector.get(this.bounding_box, 2)).doubleValue() - ((Number) ListProtector.get(this.bounding_box, 0)).doubleValue())), Float.valueOf((float) (((Number) ListProtector.get(this.bounding_box, 3)).doubleValue() - ((Number) ListProtector.get(this.bounding_box, 1)).doubleValue())));
    }

    public final boolean isEmpty() {
        Iterator<Double> it2 = this.bounding_box.iterator();
        while (it2.hasNext()) {
            if (it2.next().doubleValue() != 0.0d) {
                return false;
            }
        }
        return true;
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

    public TextTemplateParams(List<Float> list, double d, List<Double> list2, int i, float f, double d2, List<Double> list3, List<TextContent> list4) {
        this.position = list;
        this.rotation = d;
        this.scale = list2;
        this.order_in_layer = i;
        this.start_time = f;
        this.duration = d2;
        this.bounding_box = list3;
        this.text_list = list4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextTemplateParams(List list, double d, List list2, int i, float f, double d2, List list3, List list4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        List list5 = list4;
        List list6 = list3;
        int i3 = i;
        List list7 = list2;
        double d3 = d2;
        double d4 = d;
        List list8 = list;
        int i4 = i2 & 1;
        Float fValueOf = Float.valueOf(0.0f);
        this(i4 != 0 ? C1697810uHb.LJIIJJI(fValueOf, fValueOf) : list8, (i2 & 2) != 0 ? 0.0d : d4, (i2 & 4) != 0 ? C1697810uHb.LJIIJJI(Double.valueOf(0.0d), Double.valueOf(0.0d)) : list7, (i2 & 8) != 0 ? 0 : i3, (i2 & 16) == 0 ? f : 0.0f, (i2 & 32) != 0 ? 0.0d : d3, (i2 & 64) != 0 ? C1697810uHb.LJIIJJI(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)) : list6, (i2 & 128) != 0 ? C1697810uHb.LJIIJJI(new TextContent(0, "", 0.0f, 0.0d, C1697810uHb.LJIIJJI(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d))), new TextContent(0, "", 0.0f, 0.0d, C1697810uHb.LJIIJJI(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)))) : list5);
    }
}
