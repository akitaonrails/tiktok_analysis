package com.bytedance.android.livesdk.common;

import X.C13LP;
import X.C15438062q;
import X.C19719612Di;
import X.C20441214yg;
import X.C2188811AlT;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.StreamFeature;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class StreamFeatureManager implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final StreamFeatureManager LL = new StreamFeatureManager();
    public static final List<LyraxTranscoderFeature> LLILLJJLI = new ArrayList();
    public static LifecycleOwner LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public static List LIZ(List list) {
        int size = ((ArrayList) LLILLJJLI).size();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LyraxTranscoderFeature lyraxTranscoderFeature = (LyraxTranscoderFeature) it2.next();
                List<LyraxTranscoderFeature> list2 = LLILLJJLI;
                C19719612Di.LJJIIJ(list2, new AwS591S0100000_12(lyraxTranscoderFeature, 525), true);
                ((ArrayList) list2).add(lyraxTranscoderFeature);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addAndGet beforeSize=");
        sbLIZ.append(size);
        sbLIZ.append(", afterSize=");
        List<LyraxTranscoderFeature> list3 = LLILLJJLI;
        sbLIZ.append(((ArrayList) list3).size());
        C20441214yg.LIZIZ("StreamFeatureManager", C2188811AlT.LIZIZ(sbLIZ));
        return C13LP.LLIIII(list3);
    }

    public static List LIZIZ(List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                StreamFeature streamFeature = (StreamFeature) it2.next();
                LL.getClass();
                arrayList.add(new LyraxTranscoderFeature(streamFeature.featureName, streamFeature.projectKey, streamFeature.options));
            }
        } else {
            arrayList = null;
        }
        return LIZ(arrayList);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().removeObserver(this);
        LLILLL = null;
        ((ArrayList) LLILLJJLI).clear();
    }
}
