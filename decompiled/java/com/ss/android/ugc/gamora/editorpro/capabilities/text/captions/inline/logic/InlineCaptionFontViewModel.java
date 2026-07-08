package com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.logic;

import X.C0F8B;
import X.C349560Dn8;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import com.ss.ugc.android.editor.core.vm.BaseViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class InlineCaptionFontViewModel extends BaseViewModel {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public List<String> LL = new ArrayList();

    public final void vQ2(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        ArrayList arrayList = new ArrayList();
        NLETrack nLETrackLIZ = C349560Dn8.LIZ(nLEModel);
        if (nLETrackLIZ != null && (slots = nLETrackLIZ.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getUUID());
            }
        }
        this.LL = arrayList;
    }

    public static void wQ2(NLETrackSlot nLETrackSlot, Function1 function1) {
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentTextStickerDynamicCast == null) {
            return;
        }
        if (!nLESegmentTextStickerDynamicCast.getIsRichtext()) {
            function1.invoke(null);
            return;
        }
        C0F8B c0f8b = NLETextRichContent.Companion;
        String richContent = nLESegmentTextStickerDynamicCast.getRichContent();
        c0f8b.getClass();
        NLETextRichContent nLETextRichContentLIZ = C0F8B.LIZ(richContent);
        function1.invoke(nLETextRichContentLIZ);
        nLESegmentTextStickerDynamicCast.setRichContent(nLETextRichContentLIZ.toJsonStr());
    }
}
