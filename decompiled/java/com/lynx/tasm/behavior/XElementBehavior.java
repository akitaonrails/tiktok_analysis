package com.lynx.tasm.behavior;

import X.C1311670kEn;
import X.C2188811AlT;
import X.InterfaceC1962507mR;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class XElementBehavior implements InterfaceC1962507mR {
    public static final HashSet<String> GENERATOR_FILE_NAME_SETS = new HashSet<String>() { // from class: X.07mQ
        {
            add("com.bytedance.ies.xelement.audio");
            add("com.bytedance.ies.xelement.audiott");
            add("com.lynx.tasm.behavior.ui.swiper");
            add("com.bytedance.ies.xelement.alphavideo");
            add("com.bytedance.ies.xelement.banner");
            add("com.bytedance.ies.xelement.blockevent");
            add("com.bytedance.ies.xelement.bytedlottie");
            add("com.bytedance.ies.xelement.input");
            add("com.bytedance.ies.xelement.nested.scrollview");
            add("com.bytedance.ies.xelement.overlay");
            add("com.bytedance.ies.xelement.overlay.ng");
            add("com.bytedance.ies.xelement.viewpager.childitem");
            add("com.lynx.maskimage.ui");
            add("com.bytedance.ies.xelement.nested.scrollview");
            add("com.bytedance.ies.xelement.picker");
            add("com.bytedance.ies.xelement.pickview");
            add("com.bytedance.ies.xelement.pullrefreshlite");
            add("com.bytedance.ies.xelement.refresh");
            add("com.bytedance.ies.xelement.scroll");
            add("com.lynx.component.svg");
            add("com.bytedance.ies.xelement.text.text");
            add("com.bytedance.ies.xelement.video.pro");
            add("com.bytedance.ies.xelement.video");
            add("com.bytedance.ies.xelement.live");
            add("com.bytedance.ies.xelement.blur");
            add("com.bytedance.ies.xelement.markdown");
            add("com.bytedance.lynx.map.ng");
            add("com.bytedance.lynx.map.ng.refactor");
            add("com.bytedance.lynx.media");
            add("com.bytedance.ies.xelement.webview.api");
            add("com.lynx.xelement.input");
            add("com.lynx.tasm.behavior.ui.frame");
        }
    };
    public static volatile List<C1311670kEn> sCacheBehaviors;

    @Override // X.InterfaceC1962507mR
    public List<C1311670kEn> create() {
        synchronized (XElementBehavior.class) {
            try {
                if (sCacheBehaviors != null && !sCacheBehaviors.isEmpty()) {
                    return new ArrayList(sCacheBehaviors);
                }
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = GENERATOR_FILE_NAME_SETS.iterator();
                while (it2.hasNext()) {
                    arrayList.addAll(getModuleBehaviors(it2.next()));
                }
                sCacheBehaviors = arrayList;
                return new ArrayList(arrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private List<C1311670kEn> getModuleBehaviors(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".BehaviorGenerator");
            return (List) Class.forName(C2188811AlT.LIZIZ(sbLIZ)).getMethod("getBehaviors", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return arrayList;
        }
    }
}
