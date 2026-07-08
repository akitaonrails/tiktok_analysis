package kotlin.jvm.internal;

import X.C09AY;
import X.C1463690oBz;
import X.C1697810uHb;
import X.C348100Dkm;
import X.C351220Dpo;
import X.C352350Drd;
import X.C363430EMr;
import X.C385050F7v;
import X.InterfaceC1452170ntP;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioVolumeFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS24S0202000_5 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS24S0202000_5 awS24S0202000_5, Object obj) {
        TextStyleModel textStyle;
        NLETextRichContent nLETextRichContent = (NLETextRichContent) obj;
        if (nLETextRichContent != null) {
            nLETextRichContent.richTextData.setFont(new Pair<>(((TextFontStyleData) awS24S0202000_5.l0).LJ.getResourceId(), ((TextFontStyleData) awS24S0202000_5.l0).LIZ));
            nLETextRichContent.updateColor(awS24S0202000_5.i2, awS24S0202000_5.i3);
            String strLJLJL = C351220Dpo.LJLJL((NLETrackSlot) awS24S0202000_5.l1, "text_sticker_data", null);
            if (strLJLJL != null && strLJLJL.length() != 0 && (textStyle = C363430EMr.LIZIZ(strLJLJL).getTextStyle()) != null) {
                C385050F7v.LJJIIJ(textStyle, nLETextRichContent, awS24S0202000_5.i3);
            }
            nLETextRichContent.setRichText(nLETextRichContent.richTextData.toLabelStr());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S0202000_5 awS24S0202000_5, Object obj) {
        int i;
        C348100Dkm c348100Dkm = (C348100Dkm) obj;
        VecNLETrackSPtr tracks = c348100Dkm.LIZ.getModel().getTracks();
        ArrayList<NLETrack> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            NLETrack nLETrack = next;
            if (nLETrack.getTrackType() == NLETrackType.VIDEO || nLETrack.getTrackType() == NLETrackType.AUDIO) {
                arrayList.add(next);
            }
        }
        int i2 = awS24S0202000_5.i2;
        int i3 = awS24S0202000_5.i3;
        C352350Drd c352350Drd = (C352350Drd) awS24S0202000_5.l0;
        InterfaceC1452170ntP interfaceC1452170ntP = (InterfaceC1452170ntP) awS24S0202000_5.l1;
        for (NLETrack nLETrack2 : arrayList) {
            NLEFilter nLEFilter = new NLEFilter();
            nLEFilter.setStartTime(((long) i) * 1000);
            long j = i2;
            nLEFilter.setEndTime(j * 1000);
            NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter = new NLESegmentAudioVolumeFilter();
            nLESegmentAudioVolumeFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            NLEResType nLEResType = NLEResType.FILTER;
            nLEResourceNode.setResourceType(nLEResType);
            nLESegmentAudioVolumeFilter.setEffectSDKFilter(nLEResourceNode);
            nLESegmentAudioVolumeFilter.setVolume(0.0f);
            nLEFilter.setSegment(nLESegmentAudioVolumeFilter);
            NLEFilter nLEFilter2 = new NLEFilter();
            long j2 = i3;
            nLEFilter2.setStartTime(j2 * 1000);
            nLEFilter2.setEndTime(((long) c352350Drd.LIZIZ(interfaceC1452170ntP)) * 1000);
            NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter2 = new NLESegmentAudioVolumeFilter();
            nLESegmentAudioVolumeFilter2.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.setResourceType(nLEResType);
            nLESegmentAudioVolumeFilter2.setEffectSDKFilter(nLEResourceNode2);
            nLESegmentAudioVolumeFilter2.setVolume(0.0f);
            nLEFilter2.setSegment(nLESegmentAudioVolumeFilter2);
            NLEFilter nLEFilterLIZ = C1463690oBz.LIZ(j, j2, 0L, c352350Drd.LIZJ);
            c352350Drd.LJIIIIZZ.put(nLETrack2.getUUID(), C1697810uHb.LJ(nLEFilter, nLEFilter2, nLEFilterLIZ));
            nLETrack2.addFilter(nLEFilter);
            nLETrack2.addFilter(nLEFilter2);
            nLETrack2.addFilter(nLEFilterLIZ);
            i = 0;
        }
        c348100Dkm.LIZ.commit();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0202000_5(int i, int i2, C352350Drd c352350Drd, InterfaceC1452170ntP interfaceC1452170ntP, int i3) {
        super(1);
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = c352350Drd;
        this.l1 = interfaceC1452170ntP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0202000_5(TextFontStyleData textFontStyleData, int i, int i2, NLETrackSlot nLETrackSlot, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = textFontStyleData;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = nLETrackSlot;
    }
}
