package kotlin.jvm.internal;

import X.C09AY;
import X.C1421090n5H;
import X.C1431840nMc;
import X.C1440005kM;
import X.C1457740o2O;
import X.C1461800o8w;
import X.C15438062q;
import X.InterfaceC1452390ntl;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.sendtodm.MultiImageSendToDMComponent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS137S1200000_22 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS137S1200000_22 awS137S1200000_22) {
        ((C1461800o8w) awS137S1200000_22.l1).E5((Function1) awS137S1200000_22.l2, awS137S1200000_22.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS137S1200000_22 awS137S1200000_22) {
        InterfaceC1452390ntl interfaceC1452390ntlK4 = ((C1461800o8w) awS137S1200000_22.l1).K4();
        if (interfaceC1452390ntlK4 != null) {
            interfaceC1452390ntlK4.Ck0((Function1) awS137S1200000_22.l2, awS137S1200000_22.s0, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS137S1200000_22 awS137S1200000_22) {
        MultiImageSendToDMComponent multiImageSendToDMComponent = (MultiImageSendToDMComponent) awS137S1200000_22.l1;
        List<VideoPublishEditModel> listI3 = multiImageSendToDMComponent.i3(multiImageSendToDMComponent.T2());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listI3, 10));
        Iterator<VideoPublishEditModel> it2 = listI3.iterator();
        while (it2.hasNext()) {
            arrayList.add(new IMMediaPublishEvent.MultiEditModel(it2.next(), null, null, true));
        }
        IMMediaPublishEvent.DMRecordMultiMediaPublishEvent dMRecordMultiMediaPublishEvent = new IMMediaPublishEvent.DMRecordMultiMediaPublishEvent("", arrayList, true, false, !((MultiImageSendToDMComponent) awS137S1200000_22.l1).T2().creativeModel.stickerModel.textStickerModels.isEmpty(), awS137S1200000_22.s0, (Map) awS137S1200000_22.l2);
        ((MultiImageSendToDMComponent) awS137S1200000_22.l1).uu("update photo publish event");
        C1440005kM.LIZIZ(new C1431840nMc(dMRecordMultiMediaPublishEvent));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS137S1200000_22 awS137S1200000_22) {
        ((C1457740o2O) awS137S1200000_22.l2).D5().hr(C1421090n5H.LIZ(Boolean.FALSE, "others_share", (AVMusic) awS137S1200000_22.l1, awS137S1200000_22.s0, null, true, null, -1L, LivePreviewCTASmartDisplayManager.DEFAULT, false));
        C1457740o2O c1457740o2O = (C1457740o2O) awS137S1200000_22.l2;
        AVMusic aVMusic = (AVMusic) awS137S1200000_22.l1;
        c1457740o2O.LLLIZZ = aVMusic;
        c1457740o2O.lz(aVMusic);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS137S1200000_22 awS137S1200000_22) {
        ((ImageEditRootScene) awS137S1200000_22.l1).LLZLLIL((Effect) awS137S1200000_22.l2, awS137S1200000_22.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS137S1200000_22(C1461800o8w c1461800o8w, C1461800o8w c1461800o8w2, Function1<? super Boolean, Unit> function1, String str) {
        super(0);
        this.$t = str;
        this.l1 = c1461800o8w;
        this.l2 = c1461800o8w2;
        this.s0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S1200000_22(AVMusic aVMusic, String str, C1457740o2O c1457740o2O, int i) {
        super(0);
        this.$t = i;
        this.l1 = aVMusic;
        this.s0 = str;
        this.l2 = c1457740o2O;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S1200000_22(ImageEditRootScene imageEditRootScene, Effect effect, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = imageEditRootScene;
        this.l2 = effect;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS137S1200000_22(MultiImageSendToDMComponent multiImageSendToDMComponent, MultiImageSendToDMComponent multiImageSendToDMComponent2, String str, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l1 = multiImageSendToDMComponent;
        this.s0 = multiImageSendToDMComponent2;
        this.l2 = str;
    }
}
