package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C2095008Iq;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleComponentAppearModel implements Serializable {

    @C09CT("actions")
    public final List<AnoleComponentAppearAction> actions;

    @C09CT("animations")
    public final List<AnoleComponentAnimationModel> animations;

    @C09CT("hide_business_components")
    public final List<AnoleComponentBusinessAppearModel> hideBusinessComponents;

    @C09CT("params")
    public final Map<String, Object> params;

    @C09CT("show_business_components")
    public final List<AnoleComponentBusinessAppearModel> showBusinessComponents;

    @C09CT("type")
    public final String type;

    @C09CT("wait_timeout")
    public final long waitTimeout;

    public final Integer getBeforeVideoCompleteShowTimeSeconds() {
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("before_video_complete_show_time") : null;
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            return C2095008Iq.LJIIJJI(a0.LJLIIIL((String) obj).toString());
        }
        return null;
    }

    public final Map<String, Object> getBussinessPreconditions() {
        Map map;
        Map<String, Object> map2 = this.params;
        Object obj = map2 != null ? map2.get("bussiness_preconditions") : null;
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((key instanceof String) && value != null) {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    public final Long getCarouselImageStayDuration() {
        Double d;
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("carousel_image_stay_duration") : null;
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Long.valueOf((long) d.doubleValue());
    }

    public final String getCarouselImageStayType() {
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("carousel_image_stay_type") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final String getPhase() {
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("phase") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Long getPlayDelayTimeMillis() {
        Object obj;
        Map<String, Object> map = this.params;
        if (map == null || (obj = map.get("timeMillis")) == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return C2095008Iq.LJIILIIL((String) obj);
        }
        return null;
    }

    public final Double getPlayProgress() {
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("progress") : null;
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    public final Integer getRepeatCount() {
        Double d;
        if (Intrinsics.LJFF(this.type, "extend_endlayer_ugen")) {
            return 10000;
        }
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("repeat_count") : null;
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Integer.valueOf((int) d.doubleValue());
    }

    public final boolean getShowAsImmediate() {
        Double playProgress;
        Map<String, Object> map = this.params;
        return map != null && Intrinsics.LJFF(map.get("progress_zero_as_immediate"), Boolean.TRUE) && (playProgress = getPlayProgress()) != null && ((int) playProgress.doubleValue()) == 0;
    }

    public final Integer getSkipCount() {
        Double d;
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("skip_count") : null;
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Integer.valueOf((int) d.doubleValue());
    }

    public final List<String> getSourceComponents() {
        List list;
        Map<String, Object> map = this.params;
        ArrayList arrayList = null;
        Object obj = map != null ? map.get("source_components") : null;
        if ((obj instanceof List) && (list = (List) obj) != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if ((obj2 instanceof String) && obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    public final List<String> getUserInteractTypes() {
        List list;
        Map<String, Object> map = this.params;
        ArrayList arrayList = null;
        Object obj = map != null ? map.get("userinteract_types") : null;
        if ((obj instanceof List) && (list = (List) obj) != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if ((obj2 instanceof String) && obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean progressZeroNoAnimation() {
        /*
            r5 = this;
            java.lang.Double r0 = r5.getPlayProgress()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L8e
            double r1 = r0.doubleValue()
            int r0 = (int) r1
            if (r0 != 0) goto L8e
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.params
            r3 = 0
            if (r1 == 0) goto L8c
            java.lang.String r0 = "progress_zero_no_animation"
            java.lang.Object r1 = r1.get(r0)
        L1a:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L26
            r3 = r1
        L1f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            return r0
        L26:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L38
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r0 != 0) goto L33
            r4 = 0
        L33:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            goto L1f
        L38:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L1f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r1)
            java.lang.String r1 = r0.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toLowerCase(r0)
            int r1 = r2.hashCode()
            r0 = 48
            if (r1 == r0) goto L80
            r0 = 49
            if (r1 == r0) goto L74
            r0 = 3569038(0x36758e, float:5.001287E-39)
            if (r1 == r0) goto L6b
            r0 = 97196323(0x5cb1923, float:1.9099262E-35)
            if (r1 != r0) goto L1f
            java.lang.String r0 = "false"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L1f
        L6b:
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7d
            goto L1f
        L74:
            java.lang.String r0 = "1"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7d
            goto L1f
        L7d:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L1f
        L80:
            java.lang.String r0 = "0"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L1f
        L89:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L1f
        L8c:
            r1 = r3
            goto L1a
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel.progressZeroNoAnimation():boolean");
    }

    public final Integer effectivePlayProgress(Integer num, Integer num2) {
        int iIntValue;
        Double playProgress = getPlayProgress();
        if (playProgress != null) {
            int iDoubleValue = (int) playProgress.doubleValue();
            if (num != null) {
                int iIntValue2 = num.intValue();
                if (iIntValue2 > 0 && iDoubleValue > iIntValue2) {
                    Integer beforeVideoCompleteShowTimeSeconds = getBeforeVideoCompleteShowTimeSeconds();
                    if (beforeVideoCompleteShowTimeSeconds != null) {
                        iIntValue = beforeVideoCompleteShowTimeSeconds.intValue();
                    } else if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        return Integer.valueOf(iDoubleValue);
                    }
                    return Integer.valueOf(Math.max(iIntValue2 - (iIntValue * LSPassThroughRecordSizeConfig.DEFAULT), 0));
                }
                return Integer.valueOf(iDoubleValue);
            }
            return Integer.valueOf(iDoubleValue);
        }
        return null;
    }

    public AnoleComponentAppearModel(String str, long j, List<AnoleComponentAppearAction> list, Map<String, ? extends Object> map, List<AnoleComponentAnimationModel> list2, List<AnoleComponentBusinessAppearModel> list3, List<AnoleComponentBusinessAppearModel> list4) {
        this.type = str;
        this.waitTimeout = j;
        this.actions = list;
        this.params = map;
        this.animations = list2;
        this.showBusinessComponents = list3;
        this.hideBusinessComponents = list4;
    }
}
