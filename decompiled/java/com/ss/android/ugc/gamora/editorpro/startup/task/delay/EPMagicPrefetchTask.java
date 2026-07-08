package com.ss.android.ugc.gamora.editorpro.startup.task.delay;

import X.C01GW;
import X.C054G;
import X.C05FH;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0E48;
import X.C0PEM;
import X.C1768306wD;
import X.C201955140j;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C23260099m;
import X.C350870DpF;
import X.C452501pT;
import X.C563650M8t;
import X.InterfaceC1364105Vn;
import X.InterfaceC359970E9j;
import X.InterfaceC360730ECh;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class EPMagicPrefetchTask implements InterfaceC359970E9j {
    public final C0E48 LL;
    public final VideoPublishEditModel LLILLJJLI;
    public final C054G LLILLL = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(362));

    @Override // X.InterfaceC359970E9j
    public final boolean LIZ() {
        return true;
    }

    public final ArrayList<String> LIZJ() {
        VecNLETrackSPtr tracks;
        String extra;
        ArrayList<String> arrayList = new ArrayList<>();
        C0E48 c0e48 = this.LL;
        if (c0e48 != null && (tracks = C350870DpF.LJI(c0e48).getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                    if (nLETrackSlot.hasExtra("ep_magic_resource_id") && (extra = nLETrackSlot.getExtra("ep_magic_resource_id")) != null && extra.length() != 0) {
                        arrayList.add(extra);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC359970E9j
    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.gamora.editorpro.startup.task.delay.EPMagicPrefetchTask$run$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C2296808zG.LIZJ(this.LL.LLILLL, null);
                }
            }
        });
        C23250099c.LIZLLL(this.LLILLL, null, null, new C05FH(this, null), 3);
    }

    public final void LJFF(List<? extends Effect> list) {
        EditorProModel editorProModel;
        if (list.isEmpty()) {
            return;
        }
        try {
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
            if (videoPublishEditModel != null && (editorProModel = videoPublishEditModel.getEditorProModel()) != null) {
                for (Effect effect : list) {
                    editorProModel.getMagicCache().put(effect.getResourceId(), effect);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Successfully updated magic cache with ");
                sbLIZ.append(list.size());
                sbLIZ.append(" effects");
                C201955140j.LIZLLL(C563650M8t.LIZIZ, "EPMagicPrefetchTask", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            C201955140j.LIZLLL(C563650M8t.LIZIZ, "EPMagicPrefetchTask", "EditorProModel is null");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            LJ("Illegal state while updating magic cache", e);
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJ("Null pointer while updating magic cache", e2);
        } catch (ConcurrentModificationException e3) {
            TryCatchGuardChecker.doCheck(e3);
            LJ("Concurrent modification while updating magic cache", e3);
        }
    }

    public EPMagicPrefetchTask(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        this.LL = c0e48;
        this.LLILLJJLI = videoPublishEditModel;
    }

    public static void LJ(String str, Throwable th) {
        C201955140j.LJIIIZ(C563650M8t.LIZIZ, "EPMagicPrefetchTask", str, th);
    }

    public final Object LIZLLL(ArrayList<String> arrayList, InterfaceC1364105Vn<? super List<? extends Effect>> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ((InterfaceC360730ECh) this.LLILZ.getValue()).LJIIJ(arrayList, "editor_pro_magic_with_tab", false, new C1768306wD(c23260099m, 1));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
