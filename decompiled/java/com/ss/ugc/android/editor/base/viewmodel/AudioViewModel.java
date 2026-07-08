package com.ss.ugc.android.editor.base.viewmodel;

import X.C0E48;
import X.C0EB9;
import X.C350870DpF;
import X.C351510DqH;
import X.C355640Dww;
import X.EnumC356070Dxd;
import X.InterfaceC351350Dq1;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioViewModel extends ViewModel {
    public static final C355640Dww Companion = new Object() { // from class: X.0Dww
    };

    public final boolean deleteAudio(NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        Pair<NLETrack, NLETrackSlot> pairLJJLIIIJLJLI;
        if (c0e48 == null || (interfaceC351350Dq1LLFII = c0e48.LLFII()) == null || (pairLJJLIIIJLJLI = interfaceC351350Dq1LLFII.LJJLIIIJLJLI(nLETrackSlot, EnumC356070Dxd.COMMIT)) == null) {
            return false;
        }
        C351510DqH c351510DqH = C351510DqH.LIZ;
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        NLETrackType nLETrackType = NLETrackType.AUDIO;
        c351510DqH.getClass();
        C351510DqH.LJIIJJI(nLEModelLJI, nLETrackType, "");
        c0e48.S7().LIZIZ(new C0EB9(pairLJJLIIIJLJLI.getFirst(), pairLJJLIIIJLJLI.getSecond()), "delete_slot_event", false);
        if (pairLJJLIIIJLJLI.getFirst() == null || pairLJJLIIIJLJLI.getSecond() == null) {
            return false;
        }
        return true;
    }
}
