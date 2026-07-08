package kotlin.jvm.internal;

import X.C09AY;
import X.C0E48;
import X.C0FVI;
import X.C0FVR;
import X.C20684815ws;
import X.C259800zU;
import X.C351220Dpo;
import X.C351560DqM;
import X.C361680EFy;
import X.EnumC356070Dxd;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS18S0300100_5 extends C09AY implements Function0 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS18S0300100_5 r19) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS18S0300100_5.invoke$0(kotlin.jvm.internal.AwS18S0300100_5):java.lang.Object");
    }

    public static final Object invoke$1(AwS18S0300100_5 awS18S0300100_5) {
        C20684815ws.LJIILLIIL("cancel_crop_video", C361680EFy.LJFF(awS18S0300100_5.j3, (VideoPublishEditModel) awS18S0300100_5.l0, (C0E48) awS18S0300100_5.l1, (Pair) awS18S0300100_5.l2).LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS18S0300100_5 awS18S0300100_5) {
        C20684815ws.LJIILLIIL("crop_video_panel_show", C361680EFy.LJFF(awS18S0300100_5.j3, (VideoPublishEditModel) awS18S0300100_5.l0, (C0E48) awS18S0300100_5.l1, (Pair) awS18S0300100_5.l2).LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS18S0300100_5 awS18S0300100_5) {
        T t = ((C259800zU) awS18S0300100_5.l0).element;
        if (t != 0) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) t;
            C351560DqM c351560DqM = (C351560DqM) awS18S0300100_5.l1;
            C259800zU c259800zU = (C259800zU) awS18S0300100_5.l2;
            c351560DqM.LIZ.LLFII().LLD(((NLETimeSpaceNode) c259800zU.element).getLayer(), ((NLETimeSpaceNode) c259800zU.element).getLayer() + 1, nLETrackSlot, nLETrackSlot.getStartTime(), awS18S0300100_5.j3, nLETrackSlot.getDuration(), true, EnumC356070Dxd.COMMIT);
            return ((C351560DqM) awS18S0300100_5.l1).LLZ().getTrackBySlot((NLETrackSlot) ((C259800zU) awS18S0300100_5.l0).element);
        }
        NLETrack nLETrack = new NLETrack();
        C259800zU c259800zU2 = (C259800zU) awS18S0300100_5.l2;
        C351560DqM c351560DqM2 = (C351560DqM) awS18S0300100_5.l1;
        nLETrack.setMainTrack(false);
        nLETrack.setExtra("track_type", "video");
        nLETrack.setLayer(((NLETimeSpaceNode) c259800zU2.element).getLayer() + 1);
        nLETrack.setExtraTrackType(NLETrackType.VIDEO);
        nLETrack.setExtra("track_layer", String.valueOf(nLETrack.getLayer()));
        List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(c351560DqM2.LLZ());
        ArrayList<NLETrack> arrayList = new ArrayList();
        for (NLETrack nLETrack2 : listLJJLIIIJLJLI) {
            if (nLETrack2.getLayer() >= nLETrack.getLayer()) {
                arrayList.add(nLETrack2);
            }
        }
        if (!arrayList.isEmpty()) {
            for (NLETrack nLETrack3 : arrayList) {
                nLETrack3.setLayer(nLETrack3.getLayer() + 1);
                Iterator<NLETrackSlot> it2 = nLETrack3.getSortedSlots().iterator();
                while (it2.hasNext()) {
                    it2.next().setTransformZ(nLETrack3.getLayer() + 1);
                }
            }
        }
        c351560DqM2.LLZ().addTrack(nLETrack);
        return nLETrack;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S0300100_5(long j, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, Pair pair, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = c0e48;
        this.j3 = j;
        this.l2 = pair;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0000: IPUT (r8 I:int), (r2 I:kotlin.jvm.internal.AwS18S0300100_5) (LINE:83951616) kotlin.jvm.internal.AwS18S0300100_5.$t int, block:B:2:0x0000 */
    public AwS18S0300100_5(C259800zU c259800zU, C259800zU<NLETrackSlot> c259800zU2, C351560DqM c351560DqM, C259800zU<NLETrack> c259800zU3, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c351560DqM;
        this.j3 = c259800zU3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S0300100_5(C0FVI c0fvi, long j, TextStickerData textStickerData, C0FVR c0fvr, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0fvi;
        this.j3 = j;
        this.l1 = textStickerData;
        this.l2 = c0fvr;
    }
}
