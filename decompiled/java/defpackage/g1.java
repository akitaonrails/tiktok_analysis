package defpackage;

import X.C19719612Di;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g1 {
    public static final NLETrackSlot LIZ(NLEModel nLEModel, String str) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        for (NLETrackSlot nLETrackSlot : arrayList) {
            if (Intrinsics.LJFF(nLETrackSlot.getUUID(), str)) {
                return nLETrackSlot;
            }
        }
        return null;
    }
}
