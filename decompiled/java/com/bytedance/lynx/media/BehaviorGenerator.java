package com.bytedance.lynx.media;

import X.C1311670kEn;
import com.bytedance.lynx.media.LynxAudioEngineView;
import com.bytedance.lynx.media.LynxVideoEngineUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class BehaviorGenerator {
    public static List<C1311670kEn> getBehaviors() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1311670kEn() { // from class: X.1AN7
            @Override // X.C1311670kEn
            public final LynxUI LJI(s sVar, Object obj) {
                return new LynxVideoEngineUI(sVar, obj);
            }
        });
        arrayList.add(new C1311670kEn() { // from class: X.1AN8
            @Override // X.C1311670kEn
            public final LynxUI LJI(s sVar, Object obj) {
                return new LynxAudioEngineView(sVar, obj);
            }
        });
        return arrayList;
    }
}
