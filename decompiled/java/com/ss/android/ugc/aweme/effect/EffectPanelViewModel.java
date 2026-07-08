package com.ss.android.ugc.aweme.effect;

import X.C0PEM;
import X.C113G;
import X.C1403680mdC;
import X.C1413450msx;
import X.C1413460msy;
import X.C1427090nEx;
import X.C23250099c;
import X.C366400EYc;
import X.C593000NNq;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectPanelViewModel extends ViewModel {
    public final VideoPublishEditModel LL;
    public final HashMap<String, List<C1427090nEx>> LLILLJJLI = new HashMap<>();
    public final Set<Pair<String, String>> LLILLL = new LinkedHashSet();
    public String LLILZ;
    public String LLILZIL;
    public C113G LLILZLL;

    public EffectPanelViewModel(VideoPublishEditModel videoPublishEditModel) {
        this.LL = videoPublishEditModel;
    }

    public final void vQ2(C1427090nEx c1427090nEx) {
        boolean z;
        String str;
        EffectModel effectModel = c1427090nEx.LIZ;
        String strLJFF = effectModel.category;
        if (strLJFF != null && this.LLILLL.add(new Pair<>(strLJFF, effectModel.resourceId))) {
            C366400EYc.LIZ.getClass();
            if (C366400EYc.LIZJ(strLJFF)) {
                C1413450msx.LIZ.getClass();
                strLJFF = C1413450msx.LJFF(strLJFF);
            }
            C1413450msx c1413450msx = C1413450msx.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LL;
            String str2 = effectModel.key;
            int i = c1427090nEx.LIZIZ;
            C113G c113g = this.LLILZLL;
            boolean z2 = false;
            if (c113g != null) {
                z = c113g.LJJIIZI;
                z2 = c113g.LJJIIZI;
            } else {
                z = false;
            }
            Integer numValueOf = Integer.valueOf(effectModel.source);
            String str3 = effectModel.designerId;
            C113G c113g2 = this.LLILZLL;
            if (c113g2 == null || (str = c113g2.LJJIJIIJI) == null) {
                str = "";
            }
            C1413450msx.LJIIZILJ(c1413450msx, videoPublishEditModel, str2, strLJFF, i, z, z2, null, numValueOf, str3, effectModel, str, effectModel.recommendReason, effectModel.recommendRuleTags, new C1413460msy(95, null, null, C1403680mdC.LIZLLL(effectModel)), false, 16448);
        }
    }

    public final void wQ2(int i, EffectModel effectModel) {
        C1427090nEx c1427090nEx = new C1427090nEx(i, effectModel);
        String str = effectModel.category;
        if (str == null) {
            return;
        }
        if (!Intrinsics.LJFF(this.LLILZ, str) && !Intrinsics.LJFF(this.LLILZIL, str)) {
            HashMap<String, List<C1427090nEx>> map = this.LLILLJJLI;
            List<C1427090nEx> arrayList = map.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(str, arrayList);
            }
            arrayList.add(c1427090nEx);
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZ, null, new C593000NNq(this, c1427090nEx, null), 2);
    }
}
